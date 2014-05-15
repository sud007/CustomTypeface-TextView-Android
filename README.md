CustomTypeface-TextView-Android
===============================

A simple custom Android Textview to enable user to change the TYPEFACE directly from xml. With al the Textview attributes still available

**Importing:**
__________
1.) Copy font_text_view.xml and place it in layouts.
2.) Copy FontTextView.java and place it inside "your.app.package". Fix the package name as per the name of the package you paste it in.
3.) copy attrs.xml and merge/paste in res/values

You are done with Importing.

**Usage:**
______

<com.example.beerparty.FontTextView
                android:id="@+id/textView10"
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:text="@string/name_string"
                android:textColor="#727272"
                android:textSize="28sp"
                tashan:setFontFromAssets="Buffet Script.ttf" /> 


Set the font (placed inside assets folder in your project) just by giving it's name. Here font name is   "Buffet Script.ttf".


**Developed By**
____________
+ sud007

**Licence**
_______

The MIT License (MIT)

Copyright (c) [year] [fullname]

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
