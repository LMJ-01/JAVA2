#ifndef stackS_h
#define stackS_h
#pragma once
#define STACK_SIZE 100

int stack[STACK_SIZE];

int isStackEmpty();
int isStackFull();
void push(int item);
int pop();
void printStack();

#endif
