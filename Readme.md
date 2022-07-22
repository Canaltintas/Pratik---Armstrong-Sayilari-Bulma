# Patika.dev
Patika.dev Profil : https://app.patika.dev/cans06

# Pratik - Armstrong Sayıları Bulan Program
Java döngüler ile sayının armstrong sayı olup olmadığını bulan programı yazıyoruz.

Armstrong Sayı Nedir ?
N haneli bir sayının basamaklarının n’inci üstlerinin toplamı, sayının kendisine eşitse, böyle sayılara Armstrong sayı denir.

Örneğin 407 sayısını ele alalım. (4^3)+ (0^3)+(7^3) = 64+0+343 = 407 sonucunu verir. Bu da 407 sayısının armstrong bir sayı olduğunu gösterir.

## Programın Çalışması:
- Kullanıcıdan bir sayı girmesi istenir.
- Kullanıcının girdiği sayı geçici bir değişkene atanır.
- Armstrong Sayısı olup-olmadığını anlamamız için ilk önce girilen sayının kaç basamaklı olduğunu bulmamız gerekir.
    Temel Mantık olarak integer türünden değişkenler bir tam sayı belirtir ve virgulden sonra ki basamağa ekrana yazdırmaz.
    bundan ötürü sayının solundan bir sayı eksiltilerek kaç basamaklı olduğu bulunur.
  
    Örnek : 459 Sayısını ele alalım.Sayıyı 10'a bölersek 45.9 sonucuna ulaşılır ancak integer türünden bastırıldığında,basılan sayı 45 olacaktır.
    aynı işlem tekrar yapıldığında basılan sayı 4 ve yine aynı işlem yapıldığında basılan sayı 0 olacaktır.
        459/10 =45
        45/10 = 4    
        4/10 =0
- Bu durumda bir while döngüsü oluşturulup şart olarak geçici değişkenin 0 olmadığı durumu şart olarak sunup,geçici değişkeni 10'a bölersek sayının kaç basamaklı olduğunu bulacağız.
    Örnek : girilen sayı x,geçici değişken y olsun . y=x; while(y != 0){ y /= 10; sayac++}
    Y ifadesi 0 olana kadar döngü çalışacak ve sayac ifadesi bize sayının kaç basamaklı olduğunu verecektir.
- Sayının kaç basamaklı olduğunu bulduktan sonra sayının rakamlarını buluruz.bu işlem içinde basamak sayısında ki yöntem kullanılır ancak ekstra olarak bir'de mod işlemi uygulanacaktır.
    Örnek : 459 / 10 =45.9 >>> 459 %10 = 9 
- bir while içerisinde sayının önce modunu sonra 10'a bölme işlemini gerçekleştirip yine aynı döngü içerisinde bir for döngüsü ile sayının üs kuvvetini hesaplayıp ilgili değerler toplanır.
- toplanan değerler girilen sayı ile karşılaştırılır ve eşit olduğu durumda sayı bir Armstrong Sayısıdır.
