import re

def count_problems():
    # Read the README.md file
    readme_path = "LeetCode-And-Geeks-For-Geeks/README.md"
    with open(readme_path, "r") as file:
        readme_content = file.readlines()

    # Count the number of problem links
    num_problems = 0
    pattern = r'\[\d{4}-.*?\]\(https://github.com/madhavagarwal3012/LeetCode-And-Geeks-For-Geeks/tree/master/\d{4}-.*?\)'
    for line in readme_content:
        num_problems += len(re.findall(pattern, line))

    # Update README.md
    for i, line in enumerate(readme_content):
        if "## Problems Solved" in line:
            readme_content.insert(i + 1, f"Total Problems Solved: {num_problems}\n")
            break
    with open(readme_path, "w") as file:
        file.writelines(readme_content)

if __name__ == "__main__":
    count_problems()
