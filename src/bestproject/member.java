/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bestproject;
import static bestproject.employee.members;
import java.util.*;
import javax.swing.JOptionPane;
/**
 *
 * @author HP
 */
public class member extends person {
private int member_id;
private float weight;
private float height;
private String type;
Diet_routine Diet;
Exercise_routine exercise;

    public member(int member_id, float weight, float height, String type, String name, String gender, float age, String user_name, String password) {
        super(name, gender, age, user_name, password);
        this.member_id = member_id;
        this.weight = weight;
        this.height = height;
        this.type = type;
       
    }
     public member() {
    }
     public Diet_routine  Diet_Routine(int day,String type){
    Diet_routine d1=new  Diet_routine();
    if("pregnancy"==type){
        
          ArrayList < Diet_routine > preg_diet = new ArrayList<>();
          preg_diet.add(new Diet_routine(" * 1/2 cup egg whites scrambled with 1 teaspoon olive oil\n, 1 teaspoon chopped basil\n, 1 teaspoon grated Parmesan \n, and 1/2 cup cherry tomatoes\n * 1 slice whole-grain toast\n * 1/2 cup blueberries\n * 1 cup skim milk\n","* Salad made with:\n 3/4 cup cooked bulgur\n, 4 ounces chopped grilled \nchicken breast\n, 1 tablespoon shredded \nlow-fat cheddar\n, diced grilled\n veggies (2 tablespoons onion\n, 1/4 cup diced zucchini\n ,1  and 1 tablespoon\n low-fat vinaigrette ","4 ounces grilled salmon\n" +
"1 cup wild rice with 1 \ntablespoon slivered toasted almonds\n" +
"1 cup wilted baby spinach\nwith 1 teaspoon each olive oil\n, balsamic vinegar\n, and grated Parmesan\n" +
"1/2 cup diced cantaloupe \n topped with\n" +
"1/2 cup all-fruit raspberry \n sorbet and 1 teaspoon \n chopped walnuts") );
         preg_diet.add(new Diet_routine("3/4 cup steel-cut or old-fashioned \n oatmeal prepared with water \n stir in 1/2 cup skim milk\n" +
"2 links country-style \n turkey sausage\n" +
"1 cup blueberries","1/2 cup fat-free ricotta cheese \nwith 1/2 cup raspberries and \n1 tablespoon chopped pecans\n" +
"1/2 cup fat-free cottage \ncheese with 1/2 cup salsa","1 turkey burger\n" +
"3/4 cup roasted cauliflower\n and broccoli florets\n" +
"3/4 cup brown rice\n" +
"1 cup spinach salad with\n 1 tablespoon light \nbalsamic vinaigrette"));
         preg_diet.add(new Diet_routine("Omelet made with 4 egg\n whites and 1 whole egg\n, 1/4 cup chopped broccoli\n, 2 tablespoons each \n fat-free refried beans\n, diced onion\n, diced mushrooms\n, and salsa\n" +
"Quesadilla made with 1/2 \n of one small corn tortilla and \n 1 tablespoon low-fat \njack cheese\n" +
"1/2 cup diced watermelon","Salad made with 2 cups \n chopped Romaine \n, 4 ounces grilled chicken \n, 1/2 cup chopped celery\n, 1/2 cup diced mushrooms\n, 2 tablespoons shredded low-fat cheddar\n, and 1 tablespoon low-fat Caesar dressing\n" +
"1 medium nectarine\n" +
"1 cup skim milk","4 ounces shrimp\n, grilled or sauteed \nwith 1 teaspoon olive oil \nand 1 teaspoon \nchopped garlic\n" +
"1 medium artichoke\n, steamed\n" +
"1/2 cup whole wheat couscous \n with 2 tablespoons diced bell pepper\n, 1/4 cup garbanzo beans\n, 1 teaspoon chopped fresh cilantro\n, and 1 tablespoon fat-free honey mustard dressing"));
           preg_diet.add(new Diet_routine("1 light whole-grain English\n muffin with 1 tablespoon nut butter \nand 1 tablespoon sugar-free\n fruit spread\n" +
"1 wedge honeydew\n" +
"1 cup skim milk\n" +
"2 slices Canadian bacon","Wrap made with\n 4 ounces thinly sliced \nlean roast beef\n, 1 6-inch whole\n wheat tortilla\n, 1/4 cup shredded lettuce\n, 3 medium tomato slices\n, 1 teaspoon horseradish\n, and 1 teaspoon Dijon mustard\n" +
"1/2 cup pinto beans or lentils\n with 1 teaspoon \nchopped basil","4 ounces grilled halibut\n" +
"1/2 cup sliced mushrooms sauteed,\n and 1 cup green beans\n" +
"Salad made with 1 cup arugula\n,"+
"1 tablespoon chopped\n pecans and dash cinnamon"));
            preg_diet.add(new Diet_routine("Burrito made with: 1 medium whole \nwheat tortilla, 2 tablespoons\n salsa "+
"1 cup mixed melon","Turkey burger (or one of \nthese veggie burgers)\n" +
"Salad made with: 1 cup baby spinach, 2 teaspoons grated Parmesan\n, and 1 tablespoon light \nRussian dressing\n" +
"1 cup skim milk","5 ounces grilled wild salmon\n" +
"1/2 cup brown or wild rice\n" +
"2 cups mixed baby greens with\n 1 tablespoon low-fat Caesar dressing\n" 
));
             preg_diet.add(new Diet_routine("Frittata made\n with 3 large egg whites\n, 2 teaspoons \nchopped spinach\n, and 2 teaspoons pesto\n 1/2 cup fresh raspberries\n" +
"1 small bran muffin\n" +
"1 cup skim milk","4 ounces sliced turkey breast\n" +
" 1 teaspoon fresh chopped thyme\n, and 1 tablespoon fat-free\n Italian dressing\n" +
"1 medium orange","4 ounces red snapper baked with \n and 1/2 teaspoon no-sodium seasoning\n" +
"1 cup spaghetti squash\n with 1 teaspoon olive oil \n" +
"1 cup steamed green beans"));
              preg_diet.add(new Diet_routine("2 slices Canadian bacon\n" +
"1 whole-grain toaster waffle \nwith sugar-free fruit spread\n" +
"3/4 cup berries\n" +
"1 cup skim milk","Salad made with:\n 2 cups baby spinach,  3 slices avocado, 1 tablespoon\n slivered walnuts, and 2 \ntablespoons low-fat vinaigrette\n" +
"1 apple\n" +
"1 cup skim milk","4 ounces lean pork tenderloin stir-fried with onions,\n" +
"1/2 cup brown rice\n" +
"5 medium tomato slices with \n1 teaspoon each chopped ginger,\n chopped cilantro, light soy sauce\n, and rice wine vinegar"));
             d1= preg_diet.get(day);
    }
    else if ("diabetes patient"==type){
         ArrayList < Diet_routine > dia_diet = new ArrayList<>();
         dia_diet.add(new Diet_routine("Cream Cheese-Stuffed \nFrench Toast","Salmon Salad with\n White Beans","Cuban-Marinated\n Sirloin Kabobs with\n Grilled Asparagus") );
         dia_diet.add(new Diet_routine("Apple Pie Oatmeal \nwith Greek Yogurt","Turkey-Cranberry Wraps","Cilantro-Lime\n Tilapia with\n Spinach and Tomatoes"));
         dia_diet.add(new Diet_routine("Superfood Smoothie","Spinach and \nTomato Pasta","Grilled Turkey\n Burgers"));
         dia_diet.add(new Diet_routine("Veggie and \nGoat Cheese Scramble","Curried Chicken Salad Stuffed \nPitas","Jamaican Pork Tenderloin\n with Lemony Green Beans"));
         dia_diet.add(new Diet_routine("Granola with Nuts\n, Seeds\n, and Dried Fruit","Quinoa Tabbouleh Salad","Beef and\n Rice Stuffed Peppers"));
         dia_diet.add(new Diet_routine("Banana-Carrot \nand Pecan Muffins","Lemony Hummus","Chicken \nTortilla Soup"));
         dia_diet.add(new Diet_routine(" Tomato and Basil \nFrittata","Butternut Squash and\n Carrot Soup","Grilled Shrimp\n Skewers"));
         d1=dia_diet.get(day);
    
    }
     else if("football player"==type){ 
        ArrayList < Diet_routine > football_diet = new ArrayList<>();
        football_diet.add(new Diet_routine("2 eggs,1/2 cup hash \n,3 oz ham \n,1 slice toast ","Grilled panini \nSandwich,1/2 cup cucumber \nslices,1/2 cup cottage cheese\n, Pear slices ","3 tacos (topped with shredded lettuce\n, salsa, sour cream\n, guacamole, tomatoes\n, bell peppers),1 cup milk " ));
        football_diet.add(new Diet_routine("Protein smoothie :(1/2 cup Greek yogurt\n, handful spinach, banana\n, 1 T chia seeds, 1/4 cup zucchini\n,  1/4 cup frozen berries\n, 2 T oats, 2 cup milk),\n1 slice toast ","Chicken sandwich\n,1 bag baked chips, Apple\n, 1/2 cup baby carrots\n, 1 cup 100% juice ","2 cups meat and\n bean chili,\n Cornbread muffin " ));    
        football_diet.add(new Diet_routine("1 cup Greek yogurt\n,1/2 cup granola\n,1 cup fruit/veggie smoothie\n,1 slice toast ","Burrito bowl\n, Apple,1 cup 100% juice\n,1/2 cup pretzels ","Hamburger with toppings\n,1 cup oven-baked fries\n,3 T ketchup\n,2 cups green salad\n,2 T dressing "));
        football_diet.add(new Diet_routine("2 cups whole-grain cereal\n,1 cup milk, Banana","Hoagie sandwich\n,1 cup snap peas\n,2 T ranch dressing\n, Orange slices ","1 cup pasta\n( with tomato sauce\n,  parmesan cheesev, and 8 meatballs)\n,1/2 cup green beans\n,2 breadsticks\n, Peach slices "));
        football_diet.add(new Diet_routine("Bagel with 2 \nT cream cheese,1 cup 100 \n% orange juice,\n2 scrambled eggs ","Burrito, Pear slices,\n1 cup tortilla, Chips\n, Salsa,1 cup milk ","Pulled pork sandwich\n,2 cups green salad\n,2 T dressing,1 cup \noven-baked fries,\n3 T ketchup "));
        football_diet.add(new Diet_routine("PB oatmeal :\n (3/4 cup oats, \n1 banana, 2 T peanut butter,\n 1 scoop protein powder,\n 1 T chia seeds),\n1 cup milk ","Tuna salad sandwich,\n1/2 cup carrots\n,1/2 cup celery,\n12 whole-grain crackers\n,1/4 cup hummus,\n1 cup of chocolate milk ","Lean chicken and rice\n bowl,1 cup grilled \nveggies "));
        football_diet.add(new Diet_routine("1 cup powdered \nchocolate milk\n, Toasted bread with \nolive oil and tomato, \nand fruit salad.","salad from the garden\n, rice with squid \nin its ink, and a custard.","Noodle soup,\n sea bass baked with \nroast potatoes and two kiwis."));
        d1=football_diet.get(day);
                       }
     else if("swimming player"==type){
        ArrayList < Diet_routine > swim_diet = new ArrayList<>();  
        swim_diet.add(new Diet_routine("Strawberry Parfait\n(1 cup fat-free low-sugar\n strawberry yogurt ,\n 1/3 cup low-fat granola  ,\n and 1 1/4 cup chopped\n strawberries \n  layered in a tall glass)\n","Bagel Melt(Halve a 4-ounce\n whole wheat bagel\n.Top one side with 3 \nslices tomato,\n 1 slice red onion\n,and 2 ounces reduced-fat\n cheese. Top with remaining bagel half)\n low-fat salad dressing)","Broiled Halibut with Corn \nSalsa. Place halibut on\n broiler pan 4\" from\n heat . Top with 1/2 \ncup corn salsa)\n 2/3 cup cooked \ninstant brown rice mixed with \n1/3 cup cooked green peas\n 2 teaspoons olive oil\n with 1 clove garlic\n, minced."));
        swim_diet.add(new Diet_routine("1 cup shredded-wheat \ncereal with 2/3 cup 1%\n milk topped with 2 tablespoons \nslivered almonds and \n2 tablespoons sweetened dried \ncranberries or raisins\n 1/2 cup cubed honeydew melon","Shrimp Wrap: Fill a \n10 1/2\" flour tortilla with\n 3 ounces cooked shrimp\n, 1/4 cup chopped lettuce\n,and 2 tablespoons salsa.","Rainbow Rigatoni(Combine\n 1 1/2 cups cooked rigatoni with \n1/2 cup cooked broccoli florets\n,1 tablespoon extra virgin olive oil\n. Top with 1 tablespoon\n reduced-fat grated Parmesan cheese)\n"));
        swim_diet.add(new Diet_routine("Vegetable Frittata(Preheat\n oven to 350°F. Coat 4-5\" \nglass or ceramic pie pan\n with cooking spray. Blend\n 1/2 cup liquid egg substitute\n,  3/4 cup leftover vegetables\n (such as broccoli, asparagus),\n and 2 ounces reduced-fat cheese.\n 1 slice 100% whole wheat\n toast with 2 teaspoons jam","Tuna Sandwich(Mix 3 \nounces drained water-packed\ntuna with 1 tablespoon \nreduced-fat mayonnaise \n. Spread on 2 slices\n 100% whole wheat bread\nwith lettuce and 2 slices tomato)\n 10 baby carrots","Lamb and Couscous\n(1 broiled 4-ounce \nlamb chop or 3-ounce pork \nchop, trimmed, atop 1 cup\ncooked couscous \n 1 cup spinach sauté ed \n in 1 teaspoon olive oil \nwith 1 clove garlic\n, minced \n Tomato and Cucumber Salad\n"));
        swim_diet.add(new Diet_routine("Oatmeal(Cook 1/2 cup\n rolled oats Add 1 tablespoon \nbrown sugar and a dash \nof both ground cinnamon and\n almond extract.\n Top with 2 tablespoons \nfat-free half-and-half )\n,6 ounces calcium-","All Veggie \"Spaghetti\"\n(Top 2 cups cooked spaghetti\n squash with 2/3 cup pasta\nsauce and 2 tablespoons \n reduced-fat grated Parmesan\n cheese.),Tossed \nSalad(2 cups dark green\n, leafy lettuce\n, 5 cherry tomatoes,\n 3 tablespoons chopped red \n onion, and 2 tablespoons \n low-calorie Italian\n dressing)","4-ounce boneless,\n skinless chicken breast,\n roasted  Brussels Sprouts\n and Potatoes(Rub 4\n ounces small red potatoes. \n Bake at 350°F 25 minutes.) \n "));
        swim_diet.add(new Diet_routine("1 slice 100% whole \nwheat toast topped with\n 1 tablespoon peanut butter,\nand 1/2 cup pineapple chunks","Deli Sandwich: 2 ounces\n lean roast beef, turkey\n breast, or ham on 2 slices\n 100% whole wheat with 1 \nteaspoon mustard and 2\n leaves lettuce \n 1 cup sliced cucumbers\n marinated in vinegar and\n spices","1 slice cheese pizza\n topped with 1/3 cup red bell\n pepper slices, 1/3 cup\n sliced mushrooms,\n Combine with 3 cups baby greens\n (or any leaf lettuce),\n2 tablespoons sweetened\n dried cranberries,\n and 3 tablespoons \nlow-calorie sesame-ginger\n dressing."));
        swim_diet.add(new Diet_routine("1 large egg, scrambled\n and 1 medium tomato,\n sliced, with wheat English\n muffin, toasted,\n topped with 1 teaspoon jam \n 6 ounces grapefruit\n juice","Grilled Cheese and \nRoasted Red Pepper Sandwich:\nLayer 1 1/2 ounces Cheddar\n cheese, 1/3 cup \ndrained roasted red peppers,\n and 1 teaspoon mustard on \n2 slices  wheat bread.\n 1 and half cups reduced-sodium\n vegetable soup with 1/4 \ncup added vegetables \n","4 ounces roasted\n and trimmed pork tenderloin \n[Substitute 4 ounces roasted\n boneless, skinless chicken \nbreast, 4 1/2 ounces baked \nhalibut, 3 ounces filet mignon\n, or 5 ounces scallops saute\n in 1 teaspoon butter.] \n  Drain and mash with \n3 tablespoons 1% milk \nand 2 teaspoons butter.\n 1 cup steamed broccoli\n florets 1 cup 1% milk"));
        swim_diet.add(new Diet_routine ("Lemon-Blueberry Pancake\n : Prepare low-fat pancake\n mix per package \n,adding 1/4 cup blueberries\nand 1/2 teaspoon lemon\n extract to batter.\n For a berry topping,\n heat 1 cup frozen \nblueberries in saucepan \nover medium heat until\n they begin to thaw.\n Combine 1 tablespoon\n cornstarch and 2 \ntablespoons water.\nWhen berries have thickened,\n remove from heat \nand top hot pancakes.","Chili-Topped Sweet\n Potato: Microwave a \n5-ounce sweet potato \nand top with 1/2 cup\n low-fat vegetarian\n chili","Chicken Fahita: Sauté\n4 ounces skinless \nchicken breast strips,\n 1 red bell pepper,\n cut into strips,\n and 1 medium onion,\n sliced, until chicken\n is cooked and vegetables\n soften. Mix\n in 2 tablespoons \nfahita sauce and cook\n until heated through.\n  diameter flour tortilla,\n top with 2 tablespoons\n fat-free sour cream,\n and roll up.\n 2/3 cup cooked \ninstant brown rice"));
        d1=swim_diet.get(day);
    }      
         
    
    return d1;
}
    
 public void suitable_mem(String type,float weight, float height)
    {
        float suit_weight=height-100f;
        
    if("football player".equals(type.toLowerCase()))
    {
        if((weight>=70&&weight<=80)&&(height>=175&&height<=185))
        {
            JOptionPane.showMessageDialog(null, "you are good player... and you are suitable ");
        }
        else if((weight<70)&&(height<175))
        {  
            JOptionPane.showMessageDialog(null, "you are not suitable...you under weight and under height, and your suitable weight should be "+suit_weight+" kilo");
        }
        else if((weight>80)&&(height>185))
        {
            JOptionPane.showMessageDialog(null, "you are not suitable...you over weight and over height, and your suitable weight should be "+suit_weight+" kilo");
        }
        else
        {
             JOptionPane.showMessageDialog(null, "you are not suitable...");
        }
    
    }
    else if("swimming player".equals(type.toLowerCase()))
    {
        if((weight>=70&&weight<=80)&&(height>=175&&height<=185))
        {
            suit_weight=height-100f;
            JOptionPane.showMessageDialog(null, "you are good swimmerer... and you are suitable");
        }
        else if((weight<70)&&(height<175))
        {
            JOptionPane.showMessageDialog(null, "you are not suitable...you under weight and under height, and your suitable weight should be "+suit_weight+" kilo");
        }
        else if((weight>80)&&(height>185))
        {
            JOptionPane.showMessageDialog(null, "you are not suitable...you overweight and overheight, and your suitable weight should be "+suit_weight+" kilo");
        }
        else
        {
             JOptionPane.showMessageDialog(null, "you are not suitable...");
        }
    }
    else if("pregnancy".equals(type.toLowerCase()))
    {
        if((weight>=70&&weight<=80)&&(height>=175&&height<=185))
        {
            suit_weight=height-100f;
            JOptionPane.showMessageDialog(null, "you are good... and you are suitable");
        }
        else if((weight<70)&&(height<175))
        {
            
            JOptionPane.showMessageDialog(null, "you are not suitable...you under weight and under height, and your suitable weight should be "+suit_weight+" kilo");
        }
        else if((weight>80)&&(height>185))
        {
            JOptionPane.showMessageDialog(null, "you are not suitable...you overweight and overheight, and your suitable weight should be "+suit_weight+" kilo");
        }
        else
        {
             JOptionPane.showMessageDialog(null, "you are not suitable...");
        }
    }
    else if("diabetes patient".equals(type.toLowerCase()))
    {
        if((weight>=70&&weight<=80)&&(height>=175&&height<=185))
        {
            suit_weight=height-100f;
            JOptionPane.showMessageDialog(null, "you are good... and you are suitable");
        }
        else if((weight<70)&&(height<175))
        {  
            JOptionPane.showMessageDialog(null, "you are not suitable...you under weight and under height, and your suitable weight should be "+suit_weight+" kilo");
        }
        else if((weight>80)&&(height<185))
        {
            JOptionPane.showMessageDialog(null, "you are not suitable...you overweight and overheight, and your suitable weight should be "+suit_weight+" kilo");
        }
        else
        {
             JOptionPane.showMessageDialog(null, "you are not suitable...");
        }
    }
    else
        JOptionPane.showMessageDialog(null, "Erorr in type...");
    }
 
     public void suitable_exercise(String type)
     {
     if("football player".equals(type.toLowerCase()))
    {
            mem_op op=new mem_op();
            football_exe uu=new football_exe();
            uu.setVisible(true);
            uu.pack();
            uu.setLocationRelativeTo(null);
            op.dispose();
    }
    else if("swimming player".equals(type.toLowerCase()))
    {
           mem_op op=new mem_op();
            Swmming_exe uu = new Swmming_exe();
            uu.setVisible(true);
            uu.pack();
            uu.setLocationRelativeTo(null);
            op.dispose();
    }
    else if("pregnancy".equals(type.toLowerCase()))
    {
           mem_op op=new mem_op();
            preg_exercise uu = new preg_exercise();
            uu.setVisible(true);
            uu.pack();
            uu.setLocationRelativeTo(null);
           op.dispose();
   
    }
    else if("diabetes patient".equals(type.toLowerCase()))
    {
          mem_op op=new mem_op();
            preg_exercise uu = new preg_exercise();
            uu.setVisible(true);
            uu.pack();
            uu.setLocationRelativeTo(null);
           op.dispose();
    }
      else
        JOptionPane.showMessageDialog(null, "Erorr in type...");
     }
     
    

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    
           
    public float getWeight() {
        return weight;
        
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getHeight() {
        return height;
    }
    
    public int getMember_id() {
        return member_id;
    }

    public void setMember_id(int member_id) {
        this.member_id = member_id;
    }



   
}
