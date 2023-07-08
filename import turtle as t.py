import turtle as t
import random as r
t.speed(10)
def star():
    t.left(90)
    t.forward(90)
    t.pencolor("#d4ad4c")
    t.begin_fill()
    for _ in range(5):
        t.color("#d4ad4c")
        t.forward(51)
        t.left(144)
    t.end_fill()

t.pen(pensize=5,pencolor="#d4ad4c")
t.bgcolor("#000000")
t.up()
t.goto(-50,15)
t.down()
t.begin_fill()
t.color('#d4ad4c')
t.circle(120)
t.end_fill()

t.up()
t.goto(-20,25)
t.down()
t.begin_fill()
t.color('#000000')
t.circle(120)
t.end_fill()

star()

for _ in range(20):
    l=r.randint(5,12)
    x=r.randint(-610,650)
    y=r.randint(-350,350)
    t.up()
    t.goto(x,y)
    t.down()
    t.begin_fill()
    for _ in range(5):
        t.color('#d4ad4c')
        t.forward(1)
        t.left(144)
    t.end_fill()

def write(message,pos,color):
    x,y=pos
    t.color(color)
    t.penup()
    t.goto(x,y)
    t.pendown()
    style=('Courier',40,"italic")
    t.write(message,font=style)

write("EID",(80,25),"#d4ad4c")
write("MUBARAK",(25,-25),"#d4ad4c")

t.done()