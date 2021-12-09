def is_leap(year):
    #leap=False
    a=year
    if(a%4==0):
        if(a%100==0):
            if(a%400==0):
                a="True"    
            else:
                a="False"
        else:
                a="True"
    else:
        a="False"
    return a
