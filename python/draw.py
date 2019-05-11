from parser import *
from tkinter import *
import argparse


master = Tk()
master.title("DrawTest")
w = Canvas(master, width=400, height=400)
w.pack()
parser = argparse.ArgumentParser(description="Draw from source file")
parser.add_argument(dest='filename', metavar='filename')
def readfile(file_name):
    ret = ""
    with open(file_name, "r") as f:
        for line in f:
            cidx1 = line.find("//") # remove comments
            cidx2 = line.find("--")
            if cidx1 > 0 or cidx2 > 0:
                i = line[:max(cidx1, cidx2)]  # remove comment
            else:
                i = line
            ret += i.strip()
    return ret


if __name__ == '__main__':
    args = parser.parse_args()
    to_parse = readfile(args.filename)
    stream = get_token(to_parse)
    Parser(stream, w).parse()
    mainloop()
