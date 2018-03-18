PImage creeper; //at the top
PImage minecraft;
int x=300;
int y=93;
boolean finish = false;
void setup(){
size(500,500);

minecraft = loadImage("minecraft.jpg");     //in setup method
minecraft.resize(width, height);     //in setup method
background(minecraft);     //in setup method
creeper=loadImage("creeper.png");     //in setup method
creeper.resize(1, 1);     //in setup method

}
void draw(){
background(minecraft);
image(creeper, x, y);     //in draw method
if(mousePressed){
fill(255,0,0);
ellipse(mouseX, mouseY, 10, 10);
}
if(isNear(300,mouseX)){
  if(isNear(93,mouseY)){
    if(mousePressed){
fill(0,255,0);
ellipse(mouseX, mouseY, 10, 10);
}
if (finish = true){
text("You Win!", 250,250);
}
}
if (mousePressed&&x==mouseX&&y==mouseY){
finish = true;

}}
}
boolean isNear(int a, int b) {
if (abs(a - b) < 10)
     return true;
else
     return false;
}