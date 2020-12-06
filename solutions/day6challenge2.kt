/**
 * Rial Johnson
 * AOC Day 6 - Challenge 2
 */

fun main() {
    
    val input = "w\r\ns\r\nq\r\ns\r\n\r\nklfrwivqhc\r\nw\r\nwgyze\r\nanw\r\n\r\nkhfraeogtbdscw\r\nrdofujgnm\r\nydfrgo\r\ndgjoqmrf\r\nyrfdgzpon\r\n\r\nxmivszjcnqhda\r\nefwvanjd\r\ndvjuywna\r\negjwvndkboa\r\n\r\nmraiyzpxngdl\r\nynzdmgkxwpaiolr\r\n\r\nur\r\nrq\r\nr\r\n\r\nxbkdvzgwuterocn\r\nzukrvtbneogdx\r\numykaztlrodgbxwve\r\nodujhzrpsxekgbiv\r\n\r\nvhkmesczrwpj\r\ncvkmrzhsewpj\r\n\r\nrpt\r\nqwu\r\nj\r\nk\r\np\r\n\r\ncrjqtmzkba\r\nkjuhynv\r\n\r\nxjnpivhszgofwum\r\ncipqmtugyobxvwfhn\r\n\r\nqgcmjr\r\nrbmgjoq\r\nzuekypfwdng\r\namsxg\r\n\r\nykwj\r\nyjunwk\r\njkwyd\r\niwkzjy\r\n\r\nqsdczjkoixlrnyvbmgtf\r\nwoickyhaguesfrnpq\r\n\r\npma\r\nma\r\n\r\ng\r\nn\r\nrh\r\nn\r\n\r\ntjhcxba\r\nbxthacj\r\nabhtxjc\r\nhjbaxtc\r\njbctxha\r\n\r\nobuairedl\r\nwauixvbogejdpln\r\nldciokbaue\r\nmyblsdeuiazo\r\ntdembualfizo\r\n\r\nbpumtwsxe\r\ntsaumxw\r\nhxuftswm\r\n\r\nvqglbnuhej\r\nxbglpwzyam\r\nuelbgovc\r\n\r\nqcdwjtghispmorvlu\r\nmziopsvhdwtlgjuqrc\r\nrdlspoujmtwgihvcyq\r\nnojtaidspuhvmkblwercqg\r\ndpqohtufrcvlmjgswi\r\n\r\njgmbovu\r\nakiuxtg\r\n\r\nrsuypgkdiofnbwt\r\nnpcdvyokbirwgt\r\nmnybkgeortadpw\r\n\r\nidt\r\nidta\r\nidt\r\nidt\r\nnidtry\r\n\r\namoxgqywpznistrlf\r\nzqfidnsbyjgaxwo\r\nnsyqijwxvohazfg\r\nsioxnqfwazgy\r\n\r\nryhgae\r\nahygre\r\n\r\nwaopckqgeyrsuh\r\nqrkwaegysocuph\r\ncsohuawqegrpky\r\nykqahecrsoupwg\r\n\r\neswjgdxfmkvq\r\njmtkwbvxqfedrs\r\n\r\neqkmozylat\r\nyjmaezkrl\r\nzbmkalye\r\nzmaekigyl\r\nylakemzjc\r\n\r\ntqlrzgwdokxnu\r\nlkdanfmci\r\nnhmejkdflap\r\n\r\nmxviraylsouf\r\nvbspyxfaewiruqktdczl\r\nyhlravxgfisu\r\nnxyvlusafir\r\nrsvafxliyu\r\n\r\nqlrgcjdpnyzofkxmeiv\r\nkmazvnxscotrjeygdilpf\r\nzxdnogtmlqjevfkiypc\r\npglconixjvbzkfymue\r\n\r\nzyxucs\r\nsxcy\r\ncsxy\r\nxscy\r\nxscy\r\n\r\nuavrcwslpdqghmenbioxjyz\r\nkjcqgrpdnymelxuzothawvib\r\nlhbcumsfqrvzwnxjydpoagie\r\nqgozpicjumxwaybnrlvdhe\r\n\r\nvwdegcnoqafb\r\navbwqectgnof\r\nacqefnwvgbo\r\noeqabfwrcjlgnv\r\nancqwovegfb\r\n\r\nqva\r\nva\r\nxba\r\na\r\n\r\nnhxeygm\r\noaypjdznr\r\n\r\nngzm\r\nuhql\r\n\r\nnyujw\r\nuynw\r\n\r\nercqboln\r\n\r\ns\r\nyh\r\n\r\nd\r\nqs\r\nn\r\nefwcn\r\nw\r\n\r\nyzowkdciuqljeg\r\ngoiyjwzckludeq\r\nyuekgwjodlzicq\r\n\r\nqxkhclsg\r\nxlqckg\r\nqxkcgl\r\n\r\nnwrxtshalk\r\nfqoc\r\nypqug\r\npmfvzc\r\nvzigd\r\n\r\ndiqentabxumf\r\nutnmieadqb\r\nudtemqinba\r\nmbqidntaeu\r\n\r\nimjpuxdlsr\r\npmrlxsjdi\r\nxjpisrdml\r\nialpxshdmyjr\r\nsmjxzplrdi\r\n\r\neivhrugycstznxjkawqo\r\nrhxwkizjeqayougtvncs\r\nzbsygjuwacioxpnktqvhre\r\ncyirhogexjzkwsntuavq\r\ncsrovwjqxnhzayktegui\r\n\r\nh\r\nfd\r\nh\r\n\r\nuphjsebqgklcomtwify\r\ncqkltbwofhspugimeyj\r\nwvrekmaxicufgyjbhqopsltz\r\nqtobyikeschjmgflwup\r\nsceghujwtfkpblyqmio\r\n\r\na\r\na\r\na\r\na\r\na\r\n\r\ngskndyzmophwclqv\r\nmylhsqdcnozpkgwv\r\nsnyodvwplgmkzchq\r\n\r\nnyfjkgwielzq\r\nshoumqbpxg\r\nzlvkwrgaq\r\n\r\nomndevzcwyajltfksq\r\nztfvpyjwdrlbmqoce\r\n\r\nviqrlshezknaow\r\nvheawroznstkblq\r\nhxfswlvegjnoyrkqc\r\niblhwqneouvkrms\r\nhdpsnwqrvekol\r\n\r\nr\r\ntr\r\nsrk\r\nryz\r\n\r\naqzkthji\r\nqkwzjta\r\njzktqa\r\ntgzkasrojq\r\nnzikhjaqut\r\n\r\nwr\r\nwrg\r\nwr\r\n\r\nlmvpujx\r\nbczhsgfaqt\r\n\r\nfhadqpy\r\nqbk\r\nixstvjlcrmwognuez\r\n\r\ncpuznxavj\r\npxvuzcja\r\ncjpuzaxv\r\nupzjvaxc\r\n\r\nhftodjcxvbrisuy\r\nbhuodryvsfjxi\r\n\r\nwtdf\r\nnwuikz\r\nlxmbjawysh\r\nkdrtw\r\nqfkw\r\n\r\nymxzrfh\r\nzrwjdhf\r\n\r\nlniw\r\nwnli\r\nwnzrli\r\n\r\nubwjo\r\nsjzo\r\nrjo\r\n\r\nzikumqlvjobw\r\nktoaufevgrb\r\nrnkbtovduh\r\n\r\njmvbntqilzhrgp\r\nqhgzvkmtripw\r\npsrqwgihzvtm\r\nvmgqrtpihzd\r\nvqrwipgmthsz\r\n\r\nhnyzvkwgeo\r\nezhvoynk\r\nevnhkoqwzy\r\nhvznelgkoy\r\noyekhaxviznu\r\n\r\npwqivtzgebnolk\r\ninqwtvgzopb\r\nqwinobvgzpt\r\nvbiowqtpnzg\r\n\r\nulsvitcxngwzhryaebkfp\r\nsxypjlzgoihkrnubva\r\n\r\nbzgt\r\ngotxzb\r\nztgb\r\ntbglz\r\n\r\nlsrqikouybjdvawz\r\nqnchepfoi\r\n\r\nufwavmp\r\nvfpamwu\r\nwfvmpau\r\nvwumfpa\r\npmtfuawv\r\n\r\ng\r\ngh\r\ne\r\nn\r\n\r\nswfjhadxgnuzrybokl\r\nsleobifpuqhkzc\r\n\r\npcwfrnhsvdgejimlzoaubk\r\nvducpzwnsjmhoilgkbaerf\r\nrpbjnwvguahecofmkisdzl\r\nufbxshgloznvrwipjcqeadmk\r\nhnmscakpleigdfjozvburw\r\n\r\nouraitbgl\r\ntrdmgi\r\nfcxpstnyjg\r\ngouat\r\n\r\nnmrvxhdc\r\nchnrmvxd\r\nxvrhcnmd\r\nmrcdvxhn\r\nmxvndhcr\r\n\r\ncufsjilngrbydkhqex\r\nkljdhfaxyguqisbrw\r\ndkgubshipmxrlqftoyj\r\n\r\njsi\r\nsij\r\nsji\r\nisj\r\njis\r\n\r\nprnxkmutl\r\npdvuaeyxochzltnkmr\r\ngmxlutkpnrb\r\nlxpmkrtnu\r\n\r\namcxhzlrpg\r\nkpmowcr\r\n\r\nn\r\nryn\r\nan\r\nn\r\n\r\nqfgeuyn\r\nunqcfe\r\n\r\nhaj\r\nocja\r\n\r\ntbfmzce\r\ntfmzbe\r\nsmzefbt\r\nmbztfe\r\nmfztbe\r\n\r\ncgrtbynxejvqmhalf\r\nhyafxecjqvrnmbltg\r\nqtghbfrmcxaevjlny\r\nfyqjgcemhlabnrtxv\r\n\r\nh\r\nh\r\nh\r\nwh\r\nhg\r\n\r\nmpidnesyhcowqtgulfk\r\noehmlsxqundfgbkytwa\r\n\r\nhsqywtmpgazudj\r\ntpuewnhoagzsydjlm\r\ngdupwstzjahym\r\nqwrpgikdyuatzhjms\r\nmtaduhswzjpgy\r\n\r\nyfcirgulotspbxehdzmwnkqv\r\naqvgyhtrniemlxpbcudwsf\r\n\r\nbguysvaqwcmdjk\r\nxmgfuybtkprqacd\r\n\r\nrjmoslapxkvuht\r\nuavxpsflhjoktr\r\nhpcjtarlsqwkoxuv\r\njvakpxloushtr\r\n\r\niwcnso\r\nbgwc\r\ngpwcu\r\n\r\njwdiuyabzklmqsxv\r\nuxyjkvqwdszflabmi\r\naiqwuszlxbkjydvm\r\nvysjdmqlzwxaibku\r\nmksabwzxqivujdly\r\n\r\na\r\nalo\r\na\r\na\r\na\r\n\r\ndzushfvegcopkbw\r\noueshcbkvdpwg\r\nesbcowkgvpduh\r\npghduksijcevywobl\r\npuezsvdohbwckg\r\n\r\nymow\r\nmoy\r\nohmyle\r\nymo\r\nmoy\r\n\r\nmzctqbypdkrialjgoxsf\r\nkqpoyabcigszdrtmfljx\r\nxkfgltdipzjqysacmbro\r\nlirmkbxsafcgdozytjpq\r\n\r\nyhtvcsfaigk\r\nwrevhoqdm\r\nzphujdrlnv\r\n\r\nzyahfewvcs\r\nsfzcweayh\r\nwoeshuacyf\r\n\r\np\r\nljbr\r\nwxp\r\n\r\ncfdltixjupqon\r\nnmuptcqodlfij\r\nrpltfunoqjicd\r\nnlqctporjifud\r\nufipcdtlnojq\r\n\r\nxu\r\nuowa\r\nux\r\n\r\nycloxsvrwajqbzfkhpgmun\r\nwjlrmuoaxvkqfbpzsyhcng\r\naqrcybjgonhkpuvmzlfxsw\r\nwarfnczvokmyjgsqxhblpu\r\ntvzngwyqbfulxcphoskjrma\r\n\r\nyfhzaw\r\nhmuazqwbj\r\nayhzwi\r\nawxetzh\r\ngawzih\r\n\r\ngsbqoynfmevkcadjzu\r\ndmyofukqezgasctvn\r\nzqkmoadfnubsiveygc\r\ngezqymskdfnouvaci\r\nkzgncourmyfqeavsd\r\n\r\npzkyu\r\npyedw\r\nypr\r\ntyifxjnsp\r\nrbkqywup\r\n\r\nmlwtuqxsog\r\nxzmusgwtlq\r\nqmitxvulsgwcak\r\nuxwgjmrtslq\r\n\r\nbcnkpwtmqgorsfxy\r\nhmogknxfpqwsctbr\r\ngqsracvfiobzkxnpmw\r\n\r\nkpxv\r\npfkzxv\r\nxpk\r\npkx\r\nxubokps\r\n\r\nbwlytxgviueczfqakrpsmhojd\r\nfowlhcmvasbqdgptjikyxruze\r\n\r\nnowi\r\nivonqx\r\nif\r\nlysuabtiprdkzh\r\n\r\nu\r\nu\r\nu\r\n\r\ndkrhoamveqlgcjwfsz\r\ndgokizyvfjhaqwcme\r\nthwguqxoadznekvcjpmbf\r\n\r\nhyrsn\r\nrhdyjsf\r\nycbzrs\r\nsmrykotpu\r\n\r\ntsnfogyic\r\ningctoysf\r\n\r\ncvnoazqpkthxwj\r\nqhsmjdlznvkwfbt\r\nqnvkhjwlstz\r\nltjzkugbqhwvnis\r\n\r\nq\r\nytx\r\n\r\nvxjyeorpcgbsta\r\noajbxtysv\r\ntymsxjoabv\r\n\r\njwko\r\nwojk\r\nwjko\r\n\r\nnfjvu\r\nnfkv\r\ndvnfse\r\n\r\ntoe\r\ntoe\r\note\r\n\r\nzqrmchysuf\r\noyzufmqslke\r\n\r\nsgbwp\r\npgwbs\r\n\r\nbl\r\nklp\r\nled\r\nl\r\nlq\r\n\r\nea\r\nea\r\nrfeah\r\nae\r\naex\r\n\r\nkbpnxtliue\r\nkxbtieunp\r\nexbtipuknr\r\nnburkipxtel\r\nigtpwhnejqbuckx\r\n\r\nhfarpblqs\r\nbaophlqrexfsd\r\nhbqfsnlpar\r\n\r\nfspkvb\r\nhfpkvsb\r\nvpsfkb\r\n\r\nfbnx\r\nfknl\r\nnftl\r\ncuzownfq\r\nfyn\r\n\r\nqd\r\nqfdzy\r\ndq\r\n\r\njhwgyisz\r\nvfkcdjqhme\r\nhxwjo\r\njyhbr\r\nhsuj\r\n\r\nbip\r\njolwnbcgp\r\nreptb\r\npbz\r\nbpe\r\n\r\nhrdiepna\r\nvitecpzyndar\r\nesbkaudrijpnlog\r\npxivdaenrh\r\n\r\nhpfwjy\r\nfjya\r\najyf\r\nyfj\r\n\r\nr\r\nrz\r\nr\r\nr\r\nr\r\n\r\nr\r\nr\r\nr\r\n\r\nsqlcpxhtouyzwv\r\ntyxhrsbuczklidogvq\r\n\r\naisdgc\r\nmcdsiga\r\nasigdc\r\ndcisag\r\n\r\niswu\r\nsiw\r\nsqwi\r\n\r\naixlbtqznjcgshu\r\noayljitqguzbchxns\r\nsuxgbcntaliqjzh\r\n\r\nfubhpe\r\nufibkay\r\n\r\nlena\r\nizaj\r\naxbvk\r\nchav\r\n\r\nfkoshgqju\r\njiq\r\nqjwbi\r\njiq\r\njyqbi\r\n\r\nebaqscfvhgtuoirnjwxlzykp\r\nhfjxqtuvrwgeknboipazyscl\r\n\r\nqrdo\r\nqlfejdru\r\npqxyra\r\n\r\ngmnafo\r\nfsgmepna\r\nmfonag\r\n\r\npnxtgjqsbizkyc\r\nithkycsjbpzxru\r\n\r\nsnfwtloepqdrkiy\r\nqkobliwsdnh\r\nwsxjqnihzkodl\r\nahdwsilnkqbo\r\nduowiqcmksnl\r\n\r\ncjft\r\nhaorelpitd\r\ngbxhedt\r\nknzthvyaqu\r\n\r\nvgyoklbrhedtwcjxans\r\neaxgovbrudfnhzktjsyclw\r\nytcgjxvodwhaenlsbrk\r\n\r\nfnmhxj\r\nlfnxr\r\nxmnefc\r\nwduktfvqgn\r\n\r\nomf\r\njwfou\r\ncpdgxqevabkrzny\r\nlwhts\r\n\r\nvhn\r\nhirkuj\r\nhzngm\r\n\r\nminhkslfp\r\nrfahobpksn\r\nplfknsch\r\npsifmcnhk\r\n\r\nxkoiztsqvpceywhfbndu\r\nebkpvsunzcxhmofdiqyt\r\n\r\nnfp\r\nfne\r\nfn\r\n\r\nhinmuatrvygoqxfsjc\r\nvrfxtuagojyiqnhscm\r\ntifguysjoxrnqmadhcv\r\n\r\nyetihjzfkndum\r\nnejhiatzumkyd\r\nzitvhkdenmjyu\r\nhinjeumtzykd\r\nekztmhndjiuy\r\n\r\nglbtefawdsycomj\r\ndjbsgnalyokcwmte\r\nmojdwysnategclb\r\nbvgcjosaytwldemp\r\n\r\nevwuatlypjixqzrsmhc\r\nerwiucsaxmtvhyjzl\r\nlhcxeavjmyzurtsonwip\r\nmxveyutrhslgbaczdjifw\r\nsnmyhxctuazerkwlvji\r\n\r\nrvpwjbh\r\nyfecq\r\n\r\nvxbchwiygoe\r\ngwivcydbxeho\r\nylogwcevibhtxa\r\nbgwphicvexyo\r\nemivwogychrbx\r\n\r\npwghmnxtfzbyl\r\nvqsakujrdo\r\n\r\nareduqjvczsm\r\njadhzebrcum\r\ndcrumqayjzei\r\nrczsujymdea\r\n\r\nomtyndvrha\r\nvwdhaort\r\n\r\ncrb\r\nr\r\n\r\nuirepncmbyhzkaofwxvd\r\nrecwkxyhfnbmzaduovs\r\nkwceyznjbfoidhamrxvu\r\n\r\nlejmaipctkvuwgzqfsnor\r\nokmuaizfsrtnwlevjcgqp\r\nlqkwnraeuovstmizpjcgf\r\natsunvqljzepckrmogwif\r\n\r\nrjobteshildmxacpz\r\nlrpdbajtmhcsoexiz\r\n\r\nl\r\npvnsiom\r\nkhgx\r\nf\r\nf\r\n\r\nkhjgfwy\r\nfpgykjw\r\n\r\nwajntv\r\nwdzuvtj\r\niowjvtke\r\n\r\nfwvopmi\r\nsingjtf\r\n\r\nnocq\r\nnugbvmqeo\r\nqaoscn\r\n\r\nrlkzoi\r\nopfsta\r\nqvuo\r\nsoxp\r\nxhmoj\r\n\r\nguvqownkfrilte\r\naegnhfyxcszqbwvl\r\n\r\nqzo\r\nqlr\r\nvquo\r\nfgq\r\nnkwhbdactmxijq\r\n\r\nijqgmnkeoxwuvbta\r\ntiubnkgwamoqvj\r\najdkuqtimbpvonhgw\r\nmjgnyqitvwraobuk\r\n\r\ns\r\ng\r\ng\r\ng\r\n\r\nvspbciqmaj\r\npijumqscva\r\n\r\nevpqzoxgtmbns\r\ntevgqbpfsnxl\r\nepnbtgsxvq\r\nqxpsnetgmvb\r\ndepavkqngtrbjxs\r\n\r\naplrhkuiyf\r\nmxhpvwfzolsn\r\n\r\nfxtbhediuslacmy\r\nhbkufmistx\r\nihupfsmtbxz\r\nmfhipusxtb\r\nxihmtjbsuf\r\n\r\nmuzqcfp\r\nmcpfzu\r\nmrzfpucw\r\nzfcvmup\r\npzcufm\r\n\r\nq\r\nq\r\nq\r\nq\r\n\r\njbk\r\npeiw\r\n\r\nvuejaotbcp\r\nulbakiotxdcry\r\ncobunat\r\nbmcfvhauto\r\n\r\nqpo\r\nqopw\r\npqo\r\n\r\nckpequzlfdtrb\r\nyphsdgwbzn\r\nbgmpzd\r\n\r\nnbuqtywiloaesz\r\nrkghxdvf\r\n\r\nowetrs\r\netbwciulf\r\n\r\nheaudnstmjwrpg\r\npxkyniszuebmolhfjdgr\r\njenrsqcupdwhmg\r\npujhrdmcengs\r\n\r\ncutnl\r\nltunc\r\ncntlu\r\n\r\nhd\r\nbih\r\n\r\nrdf\r\ndrf\r\n\r\nkftwxpoqmgbuil\r\nwfstpikuhqbcmxog\r\nzktqfjpxayobvumin\r\nqgtfbopkruidmx\r\n\r\nsovyuxi\r\nvux\r\nuvqx\r\n\r\nj\r\nj\r\nj\r\nj\r\nmav\r\n\r\nqark\r\ntdeaquk\r\nzaxnwcpylkgvoqmhi\r\nkaq\r\n\r\nrfysxdtumlwavingkhqo\r\ngbudftnxypmzrlevakjoq\r\n\r\nqafyltcembujhd\r\njmaqtdublyfche\r\ndmhbqljfeaytuc\r\nemdtqyjahucbfl\r\ntcbfjlyemaqudh\r\n\r\ncpxhbjlqwarm\r\nbhlzcawpjmqyg\r\ncjlwbamhqpe\r\nfhlbjcmpqawv\r\njalmbqiphwc\r\n\r\nzoyw\r\nyzo\r\n\r\nqvudhfxtjesibgwynaorl\r\nnuctmlvpkgoefqsihbrwyzxa\r\n\r\nmgkqthideusny\r\nohtgleqksudiynm\r\nnhgikyustdqme\r\npuqgrdyntmhkise\r\n\r\nhlmfcir\r\nlcmfrih\r\nrlkcyfmhin\r\nimhcrlf\r\n\r\nifqds\r\nspodiqf\r\nifdsq\r\n\r\najp\r\napj\r\n\r\ndramqyjeiskugn\r\nqidmekaysrgpjfun\r\negysqnkrijluadm\r\nngdirjyksameqlu\r\n\r\ntmpogzdsxrye\r\nsryedpmqxzg\r\nzcxpmlsukydreg\r\ndpeolsyxkwgtzijrm\r\nmefyrxdpbsvghz\r\n\r\nqafgj\r\nagfjd\r\n\r\nhrczjfebg\r\nfjergzc\r\ncfmrztsygvl\r\n\r\nistujvdk\r\nkeyoahi\r\n\r\nktwuhfqas\r\nqksmthdwaru\r\najkthusqpw\r\n\r\neprjtfahignbcklvuqwyx\r\napxqrceguwtjnkbhyfilv\r\n\r\ndrosxgbv\r\norvbgx\r\nxgrobv\r\n\r\nylmpr\r\nyrmlp\r\n\r\nauwizmytjcsdbnvo\r\nywsmkoatibzndcju\r\nnytqecdbxhlzmiwuoarsgj\r\nvtdowcfjymsauknbiz\r\n\r\nz\r\nz\r\nz\r\nz\r\n\r\nhxjiqdaveoku\r\njxqkdvheioau\r\nhxoqdueajvki\r\n\r\ntuxfs\r\nusxtf\r\nuxtfs\r\n\r\ndnaiovgxlryzhqwepbmuj\r\nzbgxvpaudnmwrqohejyil\r\n\r\nqaybxdnelzokvjhmwrgusiftp\r\npyoukjfretqzsdxmhwvna\r\nszwcvfkohpuyeqntrdamxj\r\njzkrfqvyptahxsmnowdue\r\nyepoudnfxzkwjmqvtrsha\r\n\r\npd\r\ne\r\nm\r\nlq\r\n\r\nxcyvzopaubf\r\nzhuyovbpcx\r\nbcxuyvgzhop\r\ndyczxoubvpmsw\r\nzovykxucpb\r\n\r\nw\r\nw\r\nw\r\nh\r\n\r\naohk\r\nkao\r\nvkyhoa\r\noqvak\r\nakjow\r\n\r\nr\r\nr\r\ng\r\nr\r\n\r\nclnhiwztgq\r\nydfxzrcvjg\r\n\r\notmchepjl\r\ngkvunyfwlm\r\n\r\nruzxit\r\nixtzdr\r\nxrzit\r\nxqzitckr\r\ntrizux\r\n\r\ngrufeslzwvxqndhimakcyjp\r\nsoaxtzmwgjdlnkpcqevrfuiy\r\nbdaxjepnmzkruslyvqifwcg\r\nqjiysmvhxfurkaegzdwlpcn\r\n\r\ncerjstxhanlzkqgodfuy\r\ncrjsonqyuvdaelhftxzgk\r\nrksaucfxdgmoqnhytejzl\r\ngsnuojthickrealfzdyqx\r\n\r\nwmstjfqhvaplord\r\nfgnejqhkouizpvt\r\n\r\nojzucmk\r\nupvmaozj\r\nuhimrxjoqgzbw\r\nutzjoemk\r\nvztojmeu\r\n\r\nelqmorhugsxypbtza\r\nogtlyehzpfaqxurbms\r\neqbgrxhauymptlzso\r\n\r\nxldewg\r\nlgdxznew\r\nzexwgld\r\nldwxge\r\nbghlxviwed\r\n\r\npgqovbkfxciz\r\nfqobpzxkct\r\nczqfxpbko\r\n\r\nh\r\nh\r\nw\r\nh\r\nh\r\n\r\ngw\r\nwg\r\nwg\r\ngw\r\ngew\r\n\r\nbyvadoriwmkhfqtcznglusxpje\r\nxmwvnjpglyeocqhfarusbkzdti\r\nzlrgmsbhinxvqueojtfawdcpky\r\npwghxcjybruidskelqmvaonftz\r\n\r\nzwqlxogbvtuafeh\r\nxrhaelugfwkoztb\r\nzytuelfhoawxgb\r\ndeglztxbouawhf\r\nxuageoztfhlbw\r\n\r\nrqydeszwhu\r\nuwzydhqcers\r\nyqsdhruewz\r\nreyhqdzsuwn\r\n\r\nbomazjw\r\nwzabmjno\r\njamzowb\r\nojawbzm\r\nwbhzfamjo\r\n\r\npxzofjkney\r\naedkui\r\n\r\niezhxcldqrasu\r\ngivchplftdorun\r\n\r\nxy\r\ngydxv\r\n\r\nigduyfakwjeot\r\nutewfoajykid\r\n\r\ncvudfonrqshzbgyemtkxlap\r\nfxlapvmdcqzybugnhrketso\r\nfkbersnvythqodmuaglzxpc\r\nluqerdogftkmxnyzvsbahcp\r\nfsolzkxvdtughqmabcyrpne\r\n\r\nzwayveu\r\ndvpwyiztgae\r\nyzeuawv\r\nevarwyz\r\n\r\ntpkeivrucdhsawmn\r\nimspcednuvw\r\nepmnvlicsdwu\r\nicmupenvdws\r\nfmswudvpeionc\r\n\r\nnbekcurq\r\nrnckqbeu\r\nqrlkcnbuv\r\nbuerqkcn\r\n\r\njylehvp\r\nejvlyph\r\nypjvhegl\r\nehpylvj\r\nhlvyjfep\r\n\r\ncnwjxzisphtdgveqky\r\nnjqvwdyhitocxzkpesg\r\nteywxgihcsvdkjpzqn\r\nhdiqyntzgxwejpsvkc\r\n\r\na\r\na\r\nma\r\n\r\ncd\r\ncj\r\n\r\nnzekclihqfyrovdwgtusm\r\neosqnkxdpcuftzhwjmrily\r\nynimldrewskufczohqt\r\nforeinluhctqkyszmdw\r\n\r\ngxwfcasjqbnoyrv\r\ncnqjyfvwgas\r\nvfqangjcwuys\r\n\r\nen\r\njn\r\nn\r\ngnzdf\r\n\r\nknarqm\r\nlknhmars\r\n\r\nwpenjuhd\r\nkrucdjzb\r\nnutjhd\r\n\r\nxiejmt\r\ncijktnpxme\r\npmixcj\r\nxoijm\r\nbzjqrmighx\r\n\r\nftucvebloxijamnzwy\r\nvqxtyiucdlnfbzaj\r\ncntxajbfslviukzy\r\ncbtxlzjfsudvinay\r\ndvftjyizuxnbacl\r\n\r\nty\r\nry\r\ny\r\n\r\nkanrgxtibzsjydf\r\npscfavzqyb\r\nblasyzfcvum\r\nwfhzasbey\r\nampozwyfbuqs\r\n\r\nihmpuwjfvygbnze\r\nvzgcwefnihymxpubs\r\nhvmbuwznygpife\r\nvzdiknatrgmhyebwfoulp\r\n\r\nhretmjgxwcidl\r\nhjkiedvmcglx\r\njdmilhxewgc\r\nclhgbjndxie\r\n\r\ngnabr\r\nrnbga\r\nbywnuar\r\n\r\nlhd\r\nd\r\nmqdbo\r\nahd\r\nd\r\n\r\nkisuyql\r\nqsymkglu\r\nskvuiyplq\r\n\r\nxhyabuesjpd\r\nlxagr\r\nxzlaqt\r\n\r\nkepiznwbyas\r\ngyfirmnbodztsv\r\n\r\nb\r\nb\r\nb\r\nb\r\n\r\nzskcmdxeaogqbu\r\nzmbscodakqupxge\r\n\r\ne\r\nj\r\nb\r\nq\r\n\r\nblvwcsymj\r\nvwjsymbcl\r\nwbmlcyjsv\r\nmwjvcybsl\r\nsymvcblwj\r\n\r\nyivbad\r\ndayibv\r\nbviayd\r\nidvyba\r\nivadby\r\n\r\natzulnbxedjgq\r\negbvijuzyxtqadl\r\nladebjzrtgu\r\nblzdjetaug\r\nehpzmcdgtuasbkolj\r\n\r\nvejskrgaqnbltxiy\r\nbviglyatsrno\r\niwcbrlysgvntad\r\ngsliobcrynavtp\r\n\r\nybowxj\r\nsufavcpghd\r\n\r\nfjcikx\r\ncjxki\r\ncjxmik\r\nxjkic\r\ncjxki\r\n\r\no\r\ntz\r\np\r\no\r\np\r\n\r\nf\r\nh\r\nf\r\nf\r\nf\r\n\r\nn\r\nn\r\ndin\r\n\r\nudlnyspztvcf\r\nuzpdhtcayv\r\nydhzcvutp\r\n\r\nteylnzmf\r\nlntmefzy\r\nlnztyemf\r\n\r\nugwcfqzrpsdxhnyv\r\nldfosniyuwxhcvbg\r\nlxvdumygwfsnch\r\nvcowxgynhusfd\r\n\r\nqwxuykodtpehbzmgsrc\r\nnyxqougapktdbh\r\nykdpbxtfquohg\r\ntubxpdygoqhk\r\n\r\nzgyomlb\r\nmoglkbzy\r\nyogbclmz\r\n\r\nqrejtivfwzubyknaplhmgcodxs\r\nwitcplundkhaqxeryvbzsgfojm\r\n\r\nfvoindcxqhzabketlug\r\nxgdqizetlhvkubaofcn\r\nxciztehdlufnkvboagq\r\n\r\nhbolxizvkmctw\r\nudoarnhsjwk\r\nowdrhsk\r\nghfwkyoea\r\n\r\ncfzkvieqtoagsln\r\negtolisqrcf\r\nstlqcifgoe\r\n\r\nerjlptikwqoczdgubanxvf\r\nevaqfnxljitbkdwucozrpg\r\n\r\nojqbicpwexfglrvyastzk\r\npzvisdhlortfqjxkwgacyeb\r\n\r\nxiezsdhj\r\nhwvgtplfs\r\nhioskr\r\n\r\natyqbkzlw\r\nbzakwqylt\r\novwpzaybqktjl\r\nylakwtbqz\r\n\r\nflxozwatvkcmibjn\r\nwcxhokusjzvmbtn\r\n\r\njm\r\nn\r\n\r\nvmtwznjklocridexufapb\r\nnztijrefwxuvkmacdplb\r\nwjtipvfzenlmcrxuadbk\r\nvpyefticjsxrzdauwnkbml\r\n\r\nsjryquvzi\r\nqvzsiuryj\r\nvyjruqsiz\r\nquykrjszvi\r\n\r\niqgpeslwatumyvxrkndhcjb\r\ngcdqpktlmuzwjrvbsinha\r\nusbcltqjmvpagndkrwhi\r\nhkatgblrqpidnwjumvsc\r\n\r\nijrwnhlfsaxuy\r\ncyzdt\r\ncyvpm\r\nqpkybtoe\r\n\r\nagtpnyvweqrmohfil\r\nlmtwhfgyzneaipq\r\nyianftmwsgqlpeh\r\nezfsihltawgpnbmqy\r\n\r\nfvdj\r\ndjv\r\n\r\njybuhgeapvnk\r\nqdmscixzlto\r\nwpvgfar\r\n\r\ndtlbwgjyxphmqus\r\nhkjxdtvqngyzar\r\n\r\ni\r\ni\r\nv\r\n\r\njpbamlvyowxsgkzinc\r\ndwijheuxmkbstqpnvoza\r\n\r\npnfbzdmysukvlj\r\nfzlksnydpjumvb\r\ndjfmbqnvyzskplu\r\n\r\nylxfuzsdr\r\nyxvfrzlkus\r\nyxlsfwrzu\r\nyulsfxzr\r\nyrzuxlfds\r\n\r\ncq\r\nqcp\r\ng\r\n\r\nhyadprtkis\r\ntykpiharsd\r\nsdyahrtpki\r\npakifrhdyst\r\nritysadhkp\r\n\r\ntdnuxmkhcveqgwasyr\r\nvmhctngxuawsrqykbed\r\n\r\nx\r\ndhkts\r\npfg\r\nfg\r\n\r\noz\r\nqnudf\r\nowzeg\r\n\r\naxkvulniypoezgdmcht\r\nkgeponhxactvylzdmi\r\nfdkotcgiwhnljbqmepazyrvx\r\nudhtkyexzncopglmvia\r\nolhadkzxiepngvytcm\r\n\r\ncxilwnkmdatosv\r\nsaovmlncxiktwd\r\nswdmlnaivkotcx\r\nkdclnvtsiaoxwm\r\nvmndksiawtxolc\r\n\r\npla\r\nifgjtx\r\n\r\nzvfsaiykgrh\r\nvgzafikhsyr\r\nfaghrvizsyk\r\n\r\nbvsldjymgzcqokie\r\nzstldyexgrwokvimjqb\r\noqjgalksbymizcedv\r\n\r\nthkil\r\npuas\r\nvqhlt\r\n\r\ngvbhrqewyxj\r\nbgejxvh\r\njsvibeagx\r\ngeftjxbvhw\r\nexvgjbwh\r\n\r\nywjaichxrfvq\r\nlnugcesm\r\ntcmoe\r\netkbc\r\n\r\nvlitomya\r\nvmiplyoa\r\namvliyo\r\nayvlmio\r\novfdmajyli\r\n\r\npxeqymbdt\r\nfetymxnzs\r\n\r\nogerunlazpijskqfbmtdywv\r\norgudspwmfzvyljniakqeb\r\njkruynsdbcxifelogmpqvwza\r\nauprhvlodbwmqikgsjyezfn\r\n\r\nkjmehoatdxslfgrwyni\r\ndzrnowjumiveqaltpfkc\r\njwmktnafrdieol\r\n\r\nz\r\nhu\r\npd\r\nap\r\npjx\r\n\r\nhzjqrw\r\nqrzjah\r\nbvjizfyq\r\n\r\nwxpgcbzie\r\nctegxwvh\r\negxcqtwf\r\n\r\nzmwjpnviqde\r\nnpgijdvhzmwq\r\nzwinjpqvmhd\r\ntmwzjdpiqnv\r\n\r\nthoezprianclgudvksyfbw\r\ngizdnfqwvebathopyurkl\r\nqeipwgrbvfndjtazhlokyu\r\nvodgpzryhxwtlenkfuiab\r\ntufkbyhegznadjilwvopr\r\n\r\ndbvigopmznrclaexjfwkyhtq\r\nkbvgmrioznjfycapxwleqdh\r\nzrqgpeasymbhokunvjxdilwcf\r\n\r\nahmsunwpjzrtdlxqey\r\nmjuqrshdatxnpzelyw\r\nnrjqamdstpxlehwzuy\r\nqyxbahsrlmvzwuedjntp\r\nhudayszfmxptwljrqne\r\n\r\nzdanj\r\nmanqwjed\r\nanzd\r\njqdnwa\r\nfcaxdbn\r\n\r\nrabxt\r\nbrta\r\narbt\r\ntarb\r\n\r\najoshwczdmxkrivp\r\nfxpskmtchuzra\r\npmyhacuzrxgkts\r\nbskzphxmcrael\r\n\r\nx\r\nx\r\n\r\nmoay\r\nomay\r\n\r\nizocxhdkenqyavb\r\nihlpsrnkfo\r\ntwnpikho\r\n\r\nftpahurnomkcvdzily\r\nckapvofuzdlybtnrm\r\nneglmcpyrdzjavfutowk\r\n\r\ncdlnuqbvfejao\r\nvdsocqlfebxnau\r\nenjduqfcavblogm\r\n\r\nyfnhbem\r\nd\r\nj\r\n\r\nizhy\r\nihyz\r\nzhyi\r\nijzhy\r\nyhzi\r\n\r\njxzchrsb\r\nxhi\r\nvegaxdn\r\nsfjopyx\r\n\r\nxu\r\nyxe\r\nx\r\nx\r\nx\r\n\r\nnyhlqrtzipagkmowuefvbcd\r\newhoialgqyfpmcnrdkzj\r\nroqhlinpdfwycmkgzase\r\n\r\nytwerh\r\nutgwoirne\r\nwxsm\r\n\r\nxnjpohdmgykbtsraiqfu\r\nsjphqtbuoankirgxdymf\r\namqpdilhfsytgoxbujknr\r\nfsxordjuayhgkpiqbmnt\r\nipsvgmzyaqfdrtkuhonjbx\r\n\r\nxwekvftlbnujarm\r\njweukmvanrbxltf\r\nluebtmwjranfkv\r\njfuvklrbnmtwae\r\nrlhbvemkjfanwut\r\n\r\npidycjeznrvh\r\nvcjbepznry\r\nwgnjvyofcaiplzer\r\nermiyzpvjcnh\r\npxrjqetknzvsyc\r\n\r\nqnxmivda\r\nxvdqim\r\nqvxdmi\r\nvxmqid\r\nvxdmqi\r\n\r\nwfapsg\r\nscwgdufr\r\nosfwg\r\n\r\nzfayobrc\r\nfyzobarc\r\nzobcryaf\r\nrfboycza\r\n\r\nmusbrjnygkftpoxad\r\nsfnjgmoutkxrbyac\r\nnljabtukighmrqyxosf\r\n\r\nhwqxn\r\nwnhxq\r\nxbqhw\r\n\r\nvg\r\nqv\r\nv\r\nv\r\nqv\r\n\r\nlwo\r\nvwa\r\nwus\r\n\r\niwecv\r\ndzvau\r\n\r\nynewjdhtlcm\r\nnpydwjmehlc\r\n\r\nl\r\nl\r\nl\r\nl\r\nl\r\n\r\nf\r\nm\r\nz\r\n\r\ngqbawtycdnzhfjvix\r\nwgnidzfxtajqychvb\r\ndfqzjwvanycxtighb\r\nndgfatjwixvqhyczb\r\n\r\nlvsftm\r\nmtvlsf\r\nltvsfm\r\nfvltsm\r\ntlsmvf\r\n\r\nwdvhntmbcausfgyk\r\nmcanyusbkvgftdw\r\nmauygksiwvftbcdn\r\ncftwojgesayvkmudbn\r\nkvdbcwafyzmnugsqt\r\n\r\na\r\nbhngw\r\na\r\nvu\r\n\r\nprxqlit\r\npitqzr\r\nfeatyrpmsi\r\niropt\r\n\r\nwkux\r\ntxg\r\n\r\ndto\r\no\r\nbj\r\n\r\nuagbxqkwit\r\nwvthxnqgaki\r\nhjqikngxaw\r\nodarkwgqpi\r\nwqagki\r\n\r\natobwlprngejvmixdqcu\r\nofwbtepxrqgimuyhdajkl\r\n\r\nhqeotif\r\nmpnvuyas\r\n\r\nqzdlxrp\r\nbdxzqrpl\r\nrhqzpldx\r\nqxpzrlbd\r\n\r\nwp\r\npg\r\ndyvph\r\nwp\r\npn\r\n\r\nnetpfbl\r\njario\r\nw\r\n\r\npcefadnkhzv\r\nkgdhaupicxnezf\r\n\r\neadohrcjnkgiypsmtlfvzuq\r\nhzaimfoqcuxtpdveykrgj\r\naytcjiumfpkdvgrehozq\r\nbtquhdlgfrmejkoiyvpzac\r\nqcvkdrywezfmtiujaoghp\r\n\r\nmsueprdbjnzflgvytcwo\r\nglftyscmvbojzudwrpen\r\njlgyfsntvwmrzdcuopbe\r\nosivwyfumczldjbgretqphn\r\n\r\ntuikjg\r\nnmibokj\r\nhbjikl\r\n\r\nbzgymjnd\r\nndbygmzj\r\nyjnhbdmz\r\njnyzbdm\r\ngibndyztmj\r\n\r\niorhgcxbfjamwyenpvdksqu\r\nevytoqjxznkbadhrmisgfcw\r\nwbengjckvhmasfiyqrodx\r\nesdcnwxjohmqkrgiybfav\r\nohkxbjgyvdeiqnsrcmawf\r\n\r\nmkqgwxicp\r\nqvailgsnxymo\r\nxqrmidg\r\ngqxihm\r\nxqmigrp\r\n\r\nzecksafgl\r\njlazcgfek\r\nugclqeakzxrf\r\ncgkoflzae\r\neawcgkfzl\r\n\r\nlehtfqcx\r\nwojlmpdu\r\n\r\nbnsjyrcmah\r\nmynajrshbc\r\nnbrhscamyj\r\njymhabnrsc\r\ncybjsrnamh\r\n\r\nuzybinv\r\nzvblpy\r\nxvlmybz\r\n\r\naeuyibogwkxpvjt\r\nfismchnrzdqwp\r\n\r\nhgsnrqoupzitwafvxek\r\nhurvxiqezgknofaptws\r\nwagytrequfixhpvzonsk\r\nopknhiteqjwzxlfauvgrs\r\n\r\nrghduv\r\naijsybl\r\n\r\nfboy\r\nbody\r\n\r\nazhcqrk\r\nkmqfcuaz\r\nmickatzqhg\r\nqaosvkdzpcb\r\ncazkgwhtq\r\n\r\nsnpgwemqclyd\r\ngfjhe\r\nrvgeubx\r\njerkbigo\r\noeigax\r\n\r\nlhsifzcg\r\nizhcfgls\r\nishgzlcf\r\n\r\nmsfqhtecuibyg\r\ngdwkvyiq\r\nyroxlivgqp\r\n\r\nwftdvlgcubj\r\ntsafjbwuiyxlqmr\r\n\r\nnsvibpqze\r\ny\r\nmurd\r\n\r\ncbtukihfeqjrnv\r\nuchikvqtebr\r\n\r\njgszxqvyfrakpl\r\naslgzyfxpjvkrq\r\nsgyjaxzqvlfkpr\r\nyprgqvkxjsflza\r\n\r\nblxpv\r\nxvlqsp\r\nlvbxp\r\n\r\nbwu\r\nuwb\r\n\r\nkuctazm\r\natcuzk\r\ntuqkczad\r\ncupkzta\r\niupzckat\r\n\r\nvirjwanfcxdsqkyzthmub\r\nshtdubncmkayzfqwjxri\r\n\r\nsdrvpcqybwomzah\r\nmvhskw\r\nswhemlv\r\nwmvsh\r\nhsmwlv\r\n\r\nwrivxopdhgfauslbe\r\nvnfeoxdwrmiqlyapcbsgu\r\ndolivuprewxazsbgf\r\nzudaxgosplbvfiwer\r\noxiglrthpasvfwudeb\r\n\r\ngcjihxvtazydernl\r\nexdhjtgacvryu\r\nxqjhgystbrdaepcv\r\ndcfryegvmjaxthz\r\n\r\nn\r\nn\r\nyxna\r\nun\r\n\r\nuvsezitjwl\r\nmidztxjcesgrw\r\nyulwizjset\r\n\r\ncpjn\r\ncjn\r\nugnj\r\nnjic\r\njwn\r\n\r\nkmzjoe\r\nqhsvdg\r\nta\r\n\r\ndtzar\r\nrtdz\r\nbtzrd\r\nduzrt\r\nnkmszydrtxv\r\n\r\nrpjv\r\noqvkyjp\r\nvemjp\r\npjvm\r\njtvp\r\n\r\njqbywgpexdrc\r\neihgzxtrknsl\r\n\r\nzukegspqxhridyf\r\nusfwpaihyjkxzerdq\r\nzyfriudebqxpshk\r\n\r\nnzsiehmplbjgfqw\r\negwziblfhsqmjpn\r\nzslbnghpjfqiewm\r\nwgniseplhzfqbjm\r\ngaznqpwsembihlfj\r\n\r\nd\r\nknijh\r\nd\r\nxed\r\nlev\r\n\r\ncfzpjatlw\r\ntaclzpjwf\r\ncltjfzpaw\r\nfptzjclaw\r\ntfcpwlzsaj\r\n\r\nni\r\nind\r\n\r\njnpydc\r\ndynjpc\r\njpcynd\r\nncdjyp\r\n\r\nwuilxjabeftcro\r\nshpkudnygvmrq\r\n\r\nyqzhalsjf\r\nazutsmkq\r\nqaszr\r\nqmrzsxa\r\n\r\nwjv\r\nwxjv\r\nwjv\r\nwjv\r\n\r\nesgpbow\r\nepogwbs\r\noewpsbg\r\nwpgqmscobe\r\newsobpg\r\n\r\nb\r\nb\r\nbw\r\n\r\nrgz\r\njvrgpa\r\ntzrgk\r\nrtegf\r\nrxgk\r\n\r\nbcotpdrwmu\r\ndwkmpbtcur\r\n\r\nrdzyjbvsmuoacwkg\r\nfhciwsnzamkugpdybrvox\r\n\r\nmwpgv\r\nzvw\r\n\r\nwbyktilsjuemvqpdornczhx\r\nkyfzbqitgahrvsuocjpledmn\r\nqhytnurliebszcdvmpojk\r\n\r\nohxsjvdzqabegp\r\noqvgxrjbtelpuw\r\ngqevkbpjnxoi\r\n\r\nfcjsuviaq\r\nasvcfjuiq\r\naqcfsujiv\r\nsicfaqjvu\r\nvaiqusfcj\r\n\r\nicjtklarqhsmdy\r\nqcamftiujys\r\nzibcntjyasgoxeqm\r\nwvyitlamrqsujpc\r\n\r\nhnmxwtudcsbp\r\nryzdijaguqvfko\r\n\r\ntwqousdgyknvrmx\r\nfpijbzeh\r\n\r\nixg\r\nmxiv\r\nxi\r\n\r\nw\r\nwu\r\nw\r\ngw\r\n\r\ne\r\ne\r\n\r\nnktazsgmqvp\r\nkxtcvsaznmpg\r\n\r\nxm\r\nk\r\nm\r\nmx\r\n\r\nntfkyoarlejixbd\r\ncolnibtxeryjadfk\r\nyagxfwbisvhurjmpkqt\r\n\r\njfqhmekxduwari\r\nxhwfrdmqjuiake\r\nlajdxeuikmhrqfw\r\nihdkmeafjqwurx\r\n\r\notjeuvbqshdncxa\r\npmlcvukgsexriyabhq\r\nbnvxquaeodtwcshf\r\n\r\nfgeu\r\noec\r\n\r\nmjflpw\r\njlwfpim\r\nfwmlqpj\r\njpfmwlk\r\n\r\nvpjcbfaihnusglr\r\nrbvpcsfyihnjazguxl\r\n\r\nkq\r\nk\r\nk\r\n\r\npign\r\npkgh\r\najp\r\npq\r\npzomcb\r\n\r\nqbo\r\nhstryu\r\nfljioe\r\n\r\nnypszgxrdhbe\r\nrxeyhpnsdzgb\r\nepghbynszrxd\r\n\r\nazlbegicyv\r\niavnezslg\r\n\r\nymtkef\r\noasrun\r\nwvzl\r\nuerpw\r\nqcidxbhgj\r\n\r\nhxqgt\r\ngthqx\r\n\r\npocvsz\r\notkwzpvs\r\nzvosp\r\nvopcnzsl\r\nvzmpnfos\r\n\r\nrz\r\nzgr\r\nhrvze\r\nrsz\r\n\r\nuebwmzk\r\npurbtkdm\r\neyumskvjib\r\n\r\nd\r\nd\r\nd\r\nnd\r\n\r\nkdarcnph\r\nkouwr\r\ntuexkor\r\n\r\nhnslcrtwyudpbxgv\r\nhtsrvqelyagudwbpo\r\nmtubsahrkvpeyqwdlgf\r\n\r\nr\r\nr\r\nr\r\nr\r\nr\r\n\r\nxptijvhfa\r\nxpricabvtfhj\r\nvjpaxfhti\r\nahtxfvjpi\r\nvhftijpxa\r\n\r\nbxshqfzgyr\r\nbzgfxsrqyh\r\nszrqhgfxby\r\ntxbczyhfqsrg\r\nybfhsqzxrg\r\n\r\ntaevdznpkf\r\nezadwvfnkplt\r\nkdpnzafvte\r\ntvfdknpeaz\r\n\r\nea\r\na\r\na\r\na\r\na\r\n\r\ndzwyofjxnugvbipar\r\nuwrfvygonibzadxjp\r\n\r\nafcm\r\ncmaf\r\nfacm\r\n\r\nlcisgd\r\njbkcid\r\n\r\ny\r\ny\r\ndjgyen\r\nyl\r\n\r\ntfbvzwocks\r\nbzfstkvjcoy\r\nkzuvsobxficthn\r\nkftzogvcbs\r\nvszjkobtfygc\r\n\r\nheszp\r\nuhzepx\r\nzehp\r\nshepz\r\n\r\nb\r\nymel\r\nz\r\nzhq\r\ns\r\n\r\nwvhlzgcet\r\nbkuwzeopm\r\nnbjwfaeqmkz\r\n\r\nmqaufjvwl\r\nqlfuvirnjw\r\nyvuwfglxejzt\r\n\r\ngkylzr\r\nlwdiykg\r\n\r\nzuloiwargvxk\r\nevxcy\r\n\r\ngjrvnwbxu\r\nbvpugixnwj\r\nuwrmjvngbx\r\ngcnvwbxuj\r\njwnuxbvg\r\n\r\nq\r\nq\r\nq\r\nq\r\newq\r\n\r\nzwynrv\r\nuvxym"
    val listOfCustomForms = input.split("\n\r\n").toList()
    
    println(countCustomForms(listOfCustomForms)) // answer
}

fun countCustomForms(customForms: List<String>): Int {
    var count = 0
    
    customForms.forEach {
        count += countAllYesInGroup(it)
    }
    
    return count
}

fun countAllYesInGroup(customForm: String): Int {
   val hashSet = HashSet<Char>()
   var count = 0
   
   val strippedString = stripString(customForm)
   strippedString.forEach {
       if (!hashSet.contains(it)) hashSet.add(it)
   }
   
   val listOfIndividuals = customForm.split("\r\n").toList()
   
   hashSet.forEach {
       val thisLetter = it
       if (listOfIndividuals.all { it.contains(thisLetter)} ) {
           count++
       }
   }
   
   return count
}

fun stripString(stringToStrip: String): String {
    val aToZRegex = ("[^a-z]").toRegex()
    val strippedString = aToZRegex.replace(stringToStrip, "")
    
    return strippedString
}