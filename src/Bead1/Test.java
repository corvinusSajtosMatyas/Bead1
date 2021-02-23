package Bead1;

import static org.junit.jupiter.api.Assertions.*;
import Bead1.Bead1;
import Util.Shifter;

class Test {

	@org.junit.jupiter.api.Test
	void init() {
		Shifter s1 = new Shifter("123");
	}
	
	@org.junit.jupiter.api.Test
	void origString() {
		Shifter s2 = new Shifter("123abcdABC");
		System.out.println(s2.getOrigString());
	}
	
	@org.junit.jupiter.api.Test
	void shifted() {
		Shifter s2 = new Shifter("123abcdABC");
		System.out.println(s2.shifted());
	}
	
	@org.junit.jupiter.api.Test
	void longText() {
		String text = "\n"
				+ "\n"
				+ "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Quisque vel velit turpis. Aliquam ut urna id mauris venenatis volutpat a in felis. Nam at efficitur risus. Donec quis condimentum magna, vel sodales diam. Quisque vel vestibulum ante. Nam volutpat erat id elit imperdiet pretium. Donec quam ipsum, volutpat vel arcu vel, dignissim volutpat leo. Pellentesque eu nulla a quam consequat pellentesque ut ut urna. Praesent non nisi eleifend, gravida ligula sed, gravida mauris. Fusce ultricies libero nec metus bibendum egestas. Praesent venenatis erat eu pulvinar lacinia. Aenean magna metus, laoreet ut ex vel, dictum lobortis mi. Maecenas blandit lacinia tortor sit amet faucibus. Suspendisse lobortis ex non quam blandit posuere.\n"
				+ "\n"
				+ "Duis ornare est lacus, quis volutpat eros iaculis ut. Mauris at pulvinar est. Nullam semper ante vel lectus blandit semper. In ut lacus convallis, posuere orci quis, gravida leo. Vivamus ac quam egestas, varius leo a, rutrum felis. Donec ut euismod nisi. Mauris vehicula elementum purus elementum dapibus. Phasellus dui diam, porta a arcu et, euismod convallis eros. Nam lobortis leo ultrices porta dignissim. Pellentesque a maximus elit. Etiam interdum facilisis tellus ut posuere. Nam aliquam lacinia ipsum.\n"
				+ "\n"
				+ "Nunc eget lobortis erat, sit amet vulputate turpis. In id orci in enim sodales pharetra. Phasellus massa lorem, vehicula sed placerat nec, vehicula quis felis. Maecenas cursus, felis vel convallis imperdiet, risus dui convallis leo, nec consectetur lectus purus vel magna. Fusce vel condimentum arcu. Ut sagittis tempor erat, eu sodales elit consectetur id. Aliquam maximus auctor neque, in eleifend orci bibendum eu. Maecenas sodales faucibus libero, ac bibendum sapien. Cras tincidunt eros in est tincidunt bibendum.\n"
				+ "\n"
				+ "Nullam vel lectus quis metus vehicula vulputate ac sit amet felis. Nam auctor a urna id convallis. Nullam suscipit mollis mi, ut imperdiet felis fermentum quis. Ut viverra diam at metus laoreet scelerisque. Sed pulvinar metus sit amet est semper, ac luctus nulla blandit. Phasellus mollis lacinia lacinia. Vestibulum feugiat sit amet tellus pellentesque finibus.\n"
				+ "\n"
				+ "In scelerisque iaculis nisl. Nulla auctor arcu sem, ac porta ligula aliquet eget. Sed scelerisque tristique odio, at convallis lectus finibus at. Vivamus a neque purus. Proin quis aliquam nisl. Vivamus nec condimentum ante. In sagittis urna malesuada mi volutpat, in molestie velit commodo. Suspendisse eget orci purus. Integer sit amet fringilla magna, vitae ultrices nibh.\n"
				+ "\n"
				+ "Vivamus mauris ante, bibendum dignissim dolor at, pulvinar viverra lorem. Vivamus tellus odio, ultricies non volutpat sagittis, vehicula eget purus. Nullam consequat odio ac elit imperdiet, ut convallis massa placerat. Nulla auctor, diam volutpat venenatis ultrices, libero orci cursus arcu, nec porttitor orci nibh vitae neque. Duis vitae sem condimentum, accumsan nibh eu, imperdiet tellus. Aenean faucibus nibh eu magna finibus, viverra luctus massa maximus. Phasellus volutpat nulla non eros semper, vitae lacinia leo luctus. Sed at leo et augue rutrum eleifend. Integer auctor blandit porta. Maecenas bibendum tellus consequat sem rutrum egestas. Nulla ac quam quis lorem faucibus placerat. Pellentesque diam risus, consequat a molestie eu, finibus ut est. Etiam porta commodo euismod. Nullam ex odio, placerat non blandit at, pulvinar cursus orci.\n"
				+ "\n"
				+ "Donec a congue mauris. Praesent finibus, enim et tempus lobortis, justo mi sollicitudin magna, eget vehicula sem erat sit amet est. Suspendisse at odio eu nisi imperdiet convallis sed id lacus. Maecenas a orci sit amet ex malesuada laoreet. Nulla purus nunc, luctus at imperdiet malesuada, facilisis et leo. Donec et porttitor dolor, a ultricies enim. Cras non nisi condimentum eros dignissim vestibulum at ac diam. Aliquam in nunc suscipit, cursus nibh vitae, suscipit nisl. Nullam nec est varius odio ultrices malesuada sed elementum erat. Integer pharetra sagittis orci, at viverra magna feugiat sit amet. Nullam a nisl sit amet urna finibus cursus. Nullam pulvinar, turpis pulvinar blandit ultrices, risus lectus blandit felis, sed cursus est lectus eget lectus. Maecenas placerat semper lorem nec blandit. Quisque interdum elit quis orci porttitor viverra. Ut dictum est sed diam sagittis, id lacinia dolor viverra.\n"
				+ "\n"
				+ "Phasellus ipsum nibh, sollicitudin vel accumsan bibendum, porttitor in lectus. Vestibulum eget neque risus. Quisque faucibus aliquam odio, et vehicula nunc. Fusce massa massa, finibus ac ipsum ac, placerat volutpat odio. Aliquam vitae lorem eros. Fusce ornare hendrerit metus, a tristique orci viverra a. Etiam eu pulvinar elit, id euismod ante. Etiam nisl nisi, sodales at lectus consectetur, finibus tempus nisi. Vivamus malesuada nisl sed sapien mattis suscipit. Donec condimentum quam vel massa laoreet, vel faucibus neque finibus. Proin vel justo porta dolor dictum vestibulum elementum at diam. Praesent eu urna aliquet, feugiat orci et, scelerisque neque. Praesent sed enim volutpat, auctor leo tincidunt, varius felis. Etiam dignissim nunc id risus hendrerit, id varius augue vestibulum.\n"
				+ "\n"
				+ "Donec rhoncus blandit sem non tincidunt. Etiam ex purus, pharetra at sapien quis, iaculis vehicula turpis. Ut in eleifend quam. Suspendisse potenti. Fusce vehicula pharetra lobortis. Mauris nec rhoncus odio. Pellentesque feugiat, felis vitae rutrum mattis, arcu tortor dictum lorem, in cursus purus purus sit amet diam. Etiam ultricies lectus nulla, ut feugiat dui feugiat et. Donec a dolor a augue fermentum tempus. Aliquam erat volutpat.\n"
				+ "\n"
				+ "Aliquam gravida nibh dui, sit amet tristique odio tempor quis. Integer eget lacinia ex. Sed orci tellus, faucibus et interdum et, luctus quis arcu. Integer facilisis velit leo. Suspendisse potenti. Suspendisse potenti. Mauris nisl nisl, gravida at diam eget, elementum suscipit elit.\n"
				+ "\n"
				+ "Cras eget porta arcu. In ac lacus eu eros sodales lacinia. Vestibulum at augue in odio gravida ullamcorper ultrices sed lectus. Vestibulum id faucibus nisl. Phasellus finibus turpis id est scelerisque, et laoreet dui ornare. Donec facilisis laoreet elit. Fusce malesuada a nunc sit amet scelerisque. Nulla facilisi. Duis commodo sollicitudin tincidunt. Nulla id bibendum libero, ut euismod sem.\n"
				+ "\n"
				+ "Nam fermentum nisi vitae aliquam pretium. Pellentesque dignissim elit a vehicula commodo. Donec semper laoreet lacus, et semper elit porta ut. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Suspendisse ut ornare nisl. Proin non risus id dolor aliquam suscipit. Maecenas aliquam turpis nisi, sit amet mattis dolor interdum quis. Phasellus urna ex, pretium id justo eget, pellentesque lobortis sapien. Pellentesque tempus odio sed ex gravida volutpat. Sed massa lorem, fermentum in dapibus vitae, porta eget nisi. Etiam convallis fermentum lectus sit amet finibus. Duis eleifend posuere nunc, a ultrices lectus accumsan ut. Phasellus vulputate nunc ut velit interdum hendrerit. Integer arcu ligula, porttitor eget feugiat non, pulvinar nec tortor. Vestibulum dictum ut metus commodo bibendum. Maecenas non tortor ut justo dignissim vulputate.\n"
				+ "\n"
				+ "Cras blandit turpis magna, sit amet mollis velit pulvinar sed. Quisque sollicitudin mauris laoreet justo ullamcorper consectetur. Sed congue mauris congue urna eleifend, et rutrum risus ultricies. Integer gravida pulvinar cursus. Maecenas mollis massa quis nisi pulvinar, vitae posuere sem tincidunt. Donec at dui at tortor iaculis mattis. Donec porta leo nec augue vestibulum dignissim. Fusce sed felis hendrerit, dignissim sapien vel, consequat odio. Integer quis est bibendum, dictum augue eu, facilisis arcu. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aenean faucibus velit in arcu egestas ultricies.\n"
				+ "\n"
				+ "Nullam eu eros dictum, malesuada lectus viverra, tempor ipsum. Vestibulum eros nulla, laoreet eu tellus nec, pharetra hendrerit ex. Ut consequat facilisis nulla, vel dapibus nulla maximus et. Nam et velit vulputate, commodo metus suscipit, laoreet nulla. Ut ac diam odio. Phasellus vitae quam eros. Mauris porttitor erat nec nibh mattis, sit amet sodales felis convallis. Maecenas finibus vehicula pharetra. Curabitur malesuada neque nec tincidunt feugiat. Pellentesque at suscipit turpis, id imperdiet lorem. Mauris sit amet eros neque. Nunc faucibus, mauris ac elementum dapibus, libero elit pharetra quam, eget cursus odio purus at magna. Duis mollis nunc dui. Maecenas lobortis ac augue nec porttitor. Sed pretium, erat nec varius tincidunt, mauris tortor porttitor enim, id rhoncus velit diam non quam. Phasellus convallis sapien bibendum, semper lorem a, vulputate nunc.\n"
				+ "\n"
				+ "Quisque non arcu eget ligula sagittis viverra. Aliquam fermentum dui justo, vitae tincidunt velit vestibulum eu. Curabitur ultricies odio nec elit lobortis sodales. Aliquam erat volutpat. Mauris egestas est ligula, at mollis elit rhoncus a. Aenean ac tincidunt odio, sed semper nibh. Nulla vitae urna sed ipsum semper consectetur. Suspendisse potenti. Sed tempus consequat ipsum. Proin dapibus nisl ac urna faucibus, id fermentum tellus vulputate. Cras pretium nulla at felis bibendum, at aliquam urna porttitor.\n"
				+ "\n"
				+ "Ut in justo in lorem aliquam molestie ac et augue. Cras id tortor quis tortor porttitor auctor eu non ligula. Pellentesque vel turpis tortor. Proin blandit neque semper ipsum aliquet consectetur. Aenean ut dictum tortor, ac sagittis justo. Phasellus facilisis, odio feugiat vulputate porta, ex lectus rutrum arcu, vitae consectetur sem elit dapibus sem. Ut sit amet neque quis magna luctus accumsan facilisis sed sapien. Donec augue tortor, volutpat ut ultrices lobortis, rhoncus et tortor. Nam tristique elit in risus euismod, ac finibus ante egestas.\n"
				+ "\n"
				+ "Donec vehicula eu velit in venenatis. Praesent nec sodales risus. Maecenas vestibulum velit a libero ultrices accumsan. Sed tincidunt dictum tellus lacinia ullamcorper. Proin congue venenatis interdum. Nulla facilisi. In feugiat dui facilisis iaculis molestie. Duis condimentum, purus nec condimentum placerat, magna odio finibus augue, eget porttitor nibh lorem vel purus. Donec pellentesque gravida ante, vitae interdum eros commodo sit amet. Morbi eu pulvinar odio, sed convallis nisl. Etiam luctus nulla ultrices, vulputate elit non, cursus nibh.\n"
				+ "\n"
				+ "In hac habitasse platea dictumst. Fusce sagittis aliquam sem nec auctor. Donec sodales felis non justo aliquet, vestibulum venenatis elit congue. Ut sed laoreet mauris, in ornare lacus. Maecenas vestibulum, velit a tincidunt ultricies, lectus eros tempus felis, sed feugiat sem turpis eget odio. Aliquam sed enim non mauris auctor dignissim. Mauris viverra elementum orci, at semper ex sodales a. Phasellus pharetra metus augue, at sagittis libero elementum id. Nullam at mi ac turpis viverra pharetra sit amet id erat. Fusce dapibus dolor ut sapien condimentum volutpat. Vestibulum placerat augue nulla, sed bibendum libero scelerisque sit amet. Aenean interdum leo ac maximus consequat.\n"
				+ "\n"
				+ "Aenean est nisi, ornare vel est et, euismod consectetur odio. Quisque dui nisl, suscipit in bibendum eu, congue imperdiet dui. Suspendisse feugiat erat at laoreet vulputate. Nullam rhoncus leo vel metus fringilla pharetra. Fusce ac eros eu quam malesuada pellentesque non interdum mauris. Phasellus interdum convallis lobortis. Etiam feugiat iaculis mi, nec rhoncus quam iaculis nec. Phasellus semper, elit vitae cursus gravida, dolor eros eleifend justo, eget posuere massa ipsum ut eros. Aenean a bibendum nunc. Nulla facilisi. Suspendisse sit amet mauris arcu. Integer lobortis turpis in egestas vehicula. Vivamus mauris nibh, consequat vitae enim ut, pellentesque vestibulum nibh.\n"
				+ "\n"
				+ "Aliquam vehicula ligula sit amet magna convallis, sed consectetur ex hendrerit. Proin ullamcorper ipsum eu tempus aliquet. Nullam ligula purus, iaculis ac ornare quis, pellentesque ac ex. Donec ultrices sodales magna non vestibulum. Suspendisse hendrerit nisl neque, ut ultrices libero pellentesque vel. Ut sit amet massa nisl. Duis tincidunt tempor sapien sed blandit. Donec vulputate pretium diam. Sed ultrices lacus eu nisi ultricies semper. Curabitur mattis enim eget ullamcorper placerat. Etiam at aliquet mi. Nulla facilisi. Cras vestibulum ipsum a justo tempor, vestibulum facilisis ex bibendum. "
				+ "";
		Shifter s2 = new Shifter(text);
		System.out.println(s2.shifted());
	}



}
