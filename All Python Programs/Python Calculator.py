from tkinter import Tk, Label, Button, Entry


class Root(Tk):
    def __init__(self):
        super().__init__()
        self.title_label = Label(self, text="A Simple Button Calculator Using Tkinter :)")
        self.title_label.pack()
        self.entry = Entry(self)
        self.entry.pack()
        self.entry.insert(0, "0")
        self.label = Label(self, text="")
        self.label.pack()
        self.button = Button(self, text="Compute", command=self.onclick)
        self.button.pack()

    def onclick(self):
        self.label.configure(text=str(eval(self.entry.get())))


root = Root()
root.mainloop()
