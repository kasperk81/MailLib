package com.upokecenter.test; import com.upokecenter.util.*;

import java.util.*;
import org.junit.Assert;
import org.junit.Test;
import com.upokecenter.mail.*;

  public class DataUrlTest {
    @Test
    public void TestIPv6() {
  if
  (URIUtility.splitIRI("http://[ba39143c297015b6c:0fc5cb:c03:f8991bda305.1.9.29]/"
) != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[::11f91269:4373b76eb40:c90:b:f00a34.54.72.66]/"
) != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[c7:1116d:::bb58:1::eacba639b513.32.85.892]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[0:0ef:41:8:f:f95:217.130.51.80]/") == null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[076.03.05.04]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[6891410:7d:d8ce20e:410878::0946.4.965.88]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[f9:21:66a::f37::d737.77.269.076]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[e81:71b::84cb::1097.0.46.620]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[2d::a7551276551e46677:1:b5abe4:941.0.65.11]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[5b:f5:6a:fb:c3:fe1:31c76f863.208.928.5]/")!=
  null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[45d:0ef:18:25ad0:58cb4b4c59566741.05.5.94]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[b19aec4483:0ed9c0f9252.407.8.399]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[395.275.6.343]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[:456.67.99.709]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[eb210aa:::125d808::e92581d06739:a2:4:761.42.81.1]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[:4131:b92:505.02.1.34]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[e02:390a:c:94350.74.253.874]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[:6f:3:909::5.8.43.0]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[b:cf50c6::ffa22.6.2.1]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[9c629.96.125.7]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[dccb580b9939a:2521039a313e5:fab54d9:0a:a0.98.89.7]/"
) != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[d18b7:9a:6f72bc:2143018007d0ff:d70.0.3.68]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[8a1:b6:49::2.111.81.8]/") == null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[08:6d129e0c67847:87c552:1:003:e1e6724.625.622.1]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[a781a8b96f939f895e33be9814.17.7.4]/") !=
  null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[cc1be1:c:9a61238f16d8:9b13d9f90.580.8.1]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[2046f17e8e8a6b788a:02:149f3::1.4.049.33]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[:00356e998:066a2590::23.7.8.412]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[0f:::5:aaa:::f1:e36:ef3488.58.91.4]/") !=
  null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[397b3:3b89:0949d:1222:39295.875.3.9]/") !=
  null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[:1b9:ee:d4:f125:1:57d9fb:cff641ca80cee6.93.09.30]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[6aa48c:80fa5d::45893c9c128.22.8.278]/") !=
  null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[dee0e:d86c572.228.311.20]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[f:4a:f:b0::1219c:ee3:c88:2:9f7be:559.395.23.34]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[:8.232.993.657]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[::9.73.107.68]/") == null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[::78e8d7d:435:1959:63395d:f:0b0d8c4.376.70.956]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[2b975d:::e03648.323.6.221]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[9f:646.3.57.46]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[:c5:6c03a95b73bdbf512bf80a125e:de562a93.05.60.8]/"
) != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[2:a2b78cdc:eef82::9:6f::::d5be62c0a699.292.150.20]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[f:4345cd:0:5c4612.3.376.4]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[c8:a11b18351.2.3.1]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[f30:17c20de:b7:3313396f7dd229:339.96.99.98]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[3fc5a:::2::0fa:9:1::a8:b030.2.19.55]/") !=
  null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[76fcb:1:3d763.64.252.86]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[::1::b74c4a4ac09771::4da32b12e:3e509176.68.35.602]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[6478::5.58.49.1]/") == null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[b1:d:2:3293::33f:0.15.235.83]/") == null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[28f1.92.018.648]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[b1a9c83.472.729.15]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[8aedcc6dbfe:248195.7.79.265]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[c23:92:8:7c:440fd7b9:92d:cc398b8159.079.2.97]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[10f:440aa4f::f26f:fd40df6c1.889.877.895]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[44b:e7636::f4.513.5.177]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[10b660.631.58.0]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[e::7.78.67.3]/") == null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[b5:ce60f7::75:e046:f854.027.611.59]/") !=
  null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[2cc3::7:dc:a77e74296:5b64.1.508.7]/") !=
  null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[34e6:fa4856b:2d8a:4f096:2:2a1413.320.99.585]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[e029e:a38d5bb:960989c338.4.6.34]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[:f:b::c6e56a6311db0a3e:c3a6cff:a:ae151d635.12.289.54]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[62:9a5bc450.81.139.2]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[4:2442e4f56::ee:a:9:2311.823.38.788]/") !=
  null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[c1c:9d83.849.8.937]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[6:565.20.90.63]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[03:19.45.2.3]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[d1::d1b:4:661:378.195.28.767]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[bc:3db0b7727:cd:68.66.8.18]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[a30:74a2:36:1d::5c9e97bb1:943:43.809.468.094]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[928fb5:779e62ea37.21.8.2]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[7efac699385:25:9f6::2b:00d736bc1ea5f745368.019.639.5]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[40d:ff1666:66:ea:03f3:8925168.4.804.600]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[b:::8348:9.2.494.7]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[6f63d:1:b2a37.490.635.6]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[4e1ce0:0a8e7544.0.7.36]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[d6:c:fe5fc1d:12d58:7:bc:5529.85.54.89]/")!=
  null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[79:3e6:bf5ebc6075703:509:06.4.51.5]/") !=
  null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[::4fa9:0.0.73.1]/") == null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[:e72b:dfa063c589:d:1:bdd100da465:::55ecd17.470.0.09]/"
) != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[::0:54a3:fc1e74d3fbdd77b:90daac:d6.505.696.174]/"
) != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[94:4876a:638f03:d10e5::f::b:6:0f862.82.797.999]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[ea222d:8da80:2:f094:20ca613.503.0.759]/")!=
  null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[49:893.066.6.906]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[:dc:5e6634:8188:07d:53f9c69fd235a:c8.35.26.79]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[ed654507e:7368.88.08.87]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[b:00f4287.768.3.98]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[c5e95a:27:::667932610cc21:d7c:613ac:0.321.427.523]/"
) != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[1de97c:642:4f5::e85264:35442c65.96.931.061]/"
) != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[929aafdb2752d:d:f080:dd:0fe72:b0902.410.45.382]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[b9574a1eda973c654::6414.4.089.7]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[:2189a:4:623547.5.5.7]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[9145:331f5ba:02.0.14.62]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[:249c85.75.17.691]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[a7:d5d200e14::14:5a:4:ab75.953.48.079]/")!=
  null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[92::869:d:4f15b973fb::31.69.7.4]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[3:293433c3997.49.054.74]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[8:183:76d4:356f1752e:fe::e8:7.99.769.2]/")!=
  null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[3e27be0bb1.326.649.973]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[01.02.82.225]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[47df:cc36:df8361a::9532863.46.9.56]/") !=
  null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[:c5aca:b8e4ba6b:52803ec5:30.8.90.719]/")!=
  null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[:fbcf:58::bf566fd2:1b42::e827.582.7.166]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[76c606f5c:9:2.437.652.91]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[f446f:6eb7141.398.8.59]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[9:e:798:0a7f52b59fb62e7ab:8c6:7:03125.573.459.10]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[037::a5679:7a0f:6.619.143.87]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[76:589fc2efcf3::::::51:a43933393.31.2.053]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[8b:14:450507.813.76.63]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[3c42:c::9e:31.72.30.9]/") == null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[:99e:8a:a1de:f:0:3712:9841e5:6201.04.014.27]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[9::6ddb2:637.01.379.7]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[5d27:7b8d6:eaf617:ee59dc41:aef15c272.672.3.51]/"
) != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[8::86e7:39e6b:bc4a27:5:4:d72337e9:1a61.7.856.82]/"
) != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[c50b:ac703433d9:c79506::3cb69147:725.437.5.6]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[::eedec:85c:4df2102839.899.261.6]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[4101:2d83d5d793d58a7:513753::b474.135.456.564]/"
) != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[6:8d94:e12b4f:c517368:74db967c8:abe5086.09.43.968]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[d72::a:7.68.73.83]/") == null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[ca:::6:7c219.2.26.584]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[:9ad4750d5:303e352b9::8:4de451.7.5.2]/")!=
  null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[3:f07.22.1.77]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[aeb9686d009d0e:7aa525:57:7:2e47fc50.92.65.56]/"
) != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[30:2372811aec3:ec:49e94da4840:357:06676.72.1.191]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[::::::e75:4182e85d8cc:ca:81.779.35.2]/")!=
  null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[d:3ae:0.850.1.129]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[38d2b88f4253.2.646.3]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[45:1:9:d20::60f4dc1b5b:3f08b1d3d6e18e:09.796.8.1]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[ec9e8d8::ded491.216.0.02]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[2b6480:d4.012.23.9]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[f942ecb16257::00810:dcd2178.598.468.92]/")!=
  null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[2b::44.79.4.9]/") == null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[fd04e0e522:a9d634b8a:799682.2.92.538]/")!=
  null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[94:6::2.772.6.269]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[2b4e6:a0.2.15.999]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[:1:4330.44.32.95]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[f3:088c:e6::058:debe67116.8.293.93]/") !=
  null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[5f8:2:3:150:53e:1658e:0e7ff0e:53e:5.0.8.10]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[201.34.53.8]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[02:44:::43:38d:7.7.86.71]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[6a5e9d1.475.38.7]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[b:5d73e:4d2330b:3:a:6:f:8:82::a40.389.363.2]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[e:e342170342.541.5.989]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[6:f320383:058.672.87.7]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[c::7e902228bc:23465.348.35.806]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[04ca8634:887.70.0.87]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[c:4b7b:65b8ee02:d:c:b:0f876a17.13.754.7]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[3d59f538:d63:9:57a157922.752.90.419]/") !=
  null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[31dfb4d2:92f4f61.6.007.67]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[:6404:7.5.619.333]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[b:0:b4e890.836.03.8]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[0:87f:f:::23.68.6.985]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[ae6ac24bc:3f5:9426.9.9.37]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[7d0ece:32e6a1bb5606.162.379.50]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[d9.709.7.603]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[:2:cd0:8:cca::ba:8e:ad:d32164828::9.2.5.082]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[81203a165b55.9.609.75]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[926a::a3fd506a8:e3:dd9e56:e9.21.61.8]/")!=
  null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[b65c44790a2a:12ba:1.0.638.69]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[1a80:4a629.6.31.277]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[ce3b29d0.09.034.01]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[:d:0b8edc7b7d3ed9dbca6:4ff6:a660.865.976.4]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[1d:0e::f:65.0.6.18]/") == null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[94e603:f49172c4397602.94.192.317]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[e76095f945.916.3.117]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[95:20acd02d40:1:17::9b14b8fc501:0fd8e6f5.3.210.3]/"
) != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[:1:68f42c4b52:b2e5f:dba5c49:8:70:1.2.34.87]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[:dced:54e9.0.0.247]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[655f2614324.128.545.020]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[::50f4:22.244.8.2]/") == null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[:6e071e0:fdd7f9e0e5981d4787.10.2.1]/") !=
  null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[a6ad0::f5a43d2261:8f2:::fe5adf331.32.28.79]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[3bbf50:c9:d4986:66.8.2.57]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[d689e4.7.95.6]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[d:35::0f4:788:189.232.4.9]/") == null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[6f23::a20f:2:a:6.16.59.0]/") == null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[5:e3:::a:530.67.763.862]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[d:::26.7.85.702]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[8:f:0::524:a17:::d::7:7af:b028.46.020.4]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[cdd6:c51:b:3:6da::9.68.5.21]/") == null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[51.9.079.69]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[46e:::deb0d8a:f6ab8:aad5:b:7:0:d8.532.092.01]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[d5a8.40.56.32]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[520:8:9:7c0ec86f:::b2a74697.383.7.66]/")!=
  null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[155db:9:582a6:c:d14e2:912ee92b53886e45.79.23.0]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[:::8:4f7:9a78:783.0.646.56]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[:2de076e:13:5b13248:a72.3.23.200]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[:11.0.442.493]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[3fd1849cf2c0b8d2bd83.609.05.356]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[b46f:::edf6903c:c02:6eb:67:cf:5fb4:7f60.1.192.993]/"
) != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[99:3cfc17:1cd6876:098dc23296fc:d::17d03.0.78.5]/"
) != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[a15:47:66c5:6:eb:c:b::9e23:8::::bf179.3.13.296]/"
) != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[c6:ca:3f16d4e:4::74f::1:e::e:c662.52.9.071]/"
) != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[c:::c50c:750::c2e8d:c15::eeb507d182:5.12.6.1]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[c4:9c:ce:015.420.5.37]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[be:39f1::f9ef:1714e89d:dca96b36e5c9.705.9.179]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[b::d3:d:8.9.1.1]/") == null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[f6f:4743bb380b951fbb4c2:689:2:4bb59.1.635.04]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[cf5:5bd1ab7a52c6:4.5.841.28]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[:5504b:a7:6:15f188.639.31.31]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[2a:7:e7:0046e6dd210e79c110:7f33f01687.71.0.471]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[:557:9743:f:769.41.8.891]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[2e00:b63:6c5:0a6f:d3c:f:77.8.54.5]/") ==
  null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[d64216858096:0b3d331112ea:7338371:693.6.10.803]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[a:0:7e3643.77.69.24]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[4::a587.789.4.68]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[0b6::9bee:34:5e19699.555.18.50]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[5:33e78e4d::8567.6.8.7]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[0fc4a:a:::5a9a23:5:2c:27f:56.905.66.50]/")!=
  null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[:d046:4:04:3:8e656f8:f3f40:7b3b5af3a:4ac835.8.5.069]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[::9.9.104.9]/") == null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[7bc353:5efe64673a3c969abf8::282.05.0.9]/")!=
  null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[5c:4:58.04.213.7]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[:fa:10:f:3:7::5ff51d::290.9.47.52]/") !=
  null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[4d0c:0a147979:da57fd7:6:ef5ef7006010.5.1.0]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[::18931a6.542.91.696]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[7:9ac:b:561:1896.0.98.02]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[7::edff9.8.658.7]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[512d7abc6f1cb:4:4ca832e:c6b2f3c89f7cc5.080.7.6]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[cf::b1:107.99.69.33]/") == null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[:c8:065.295.62.9]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[e595c5e2593aee9:f9ea79:928e40.831.4.3]/")!=
  null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[e7:b337.39.0.3]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[99bf8:2286:d:96e:28d827e9bbaa5:119:::31355.360.72.2]/"
) != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[:a29b3e06d:67e0f46d45:152b13::47.146.5.95]/"
) != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[f:c:73:539d:4f1:98:e:fa58:cf0282::59.121.8.52]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[286d05b704.970.718.7]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[42e135:708a:d:0254:ca:98:5dc::7:db5d79.05.635.3]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[:::3f9:e:f:01.6.7.66]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[81.8.7.369]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[:9:7:156671::::a3:bf7238c1b2eb85488e:22.4.234.490]/"
) != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[9d:4f:3c:426e:46c8bd4948378778:7:::3fb:4.684.1.45]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[9::cbc5e2::e75.7.759.885]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[407.22.571.527]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[d4:1007516c::bd219564:b:2e598a:8c5b:360.64.531.28]/"
) != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[a:::d3d0:ebd439:74495c325842b310:8ebb673.4.0.592]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[:f1c13.29.11.43]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[:ff23.533.264.96]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[b0667.37.1.40]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[18a9b:a:5f88::9:3de41f714:19::31f2.8.73.9]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[41de5177e09a2:3905ffb7:67.887.3.1]/") !=
  null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[07:515a0d2420833041:01795.259.322.460]/")!=
  null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[:d14:0965de0:0af060f25b3ec601.7.696.223]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[73.109.5.852]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[:af7475:a:d7d9d79ad:a6.2.291.988]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[b048::cc5b8:3224e5:5098.35.14.999]/") !=
  null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[f7649:d:4:0c:::7:b95.3.5.925]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[2a3c:8:c0abff9482ba:11d0:1e:f5ef38.430.335.8]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[f684::1.19.9.0]/") == null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[721::4b:3:1.238.41.75]/") == null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[db3:327:4efb1865:1a9:30619300::e:3aa464306.17.5.232]/"
) != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[a71524:7ebc:c9::7a82864dd2e:19b:e6:821.7.207.6]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[9338678:b8ea9:19f94:0e0bb1.42.3.08]/") !=
  null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[::c:76:f27.74.67.943]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[b5:::9:b:392.74.13.54]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[c:6fb522.5.42.5]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[7e8135090f:9a2::7.9.250.161]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[212fdaa:5f:79:b:320875:2bc:1009:8.37.70.904]/"
) != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[5:8ef:c4380:::3920c:9:fbfd9b:4cc0061.93.5.752]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[419997628:7d357fa3f:990f4629.5.871.563]/")!=
  null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[63:f::5d6c476.8.701.869]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[a8a8:8:c4ff:82:6f::20.78.1.7]/") == null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[1115::ef7cd::73b958.896.898.4]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[:851d7db6d:078086:4:d:195d2:736.9.93.241]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[b44e::50.9.128.2]/") == null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[3:0f25492d15fa4:ef829d3f1:961161:d27549.24.0.400]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[3f8.7.0.5]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[641:a2c0f50b294555b44037:0:9:f0fc46.3.998.83]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[4deed4:fe8657c4f:d425a6f8:e0:6004.70.8.9]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[21:162::858:6.84.4.96]/") == null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[0d09:5ced56.009.351.339]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[193:5d771:c0:f6f::3:57:eb3e4ccda:8.61.5.38]/"
) != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[8:ca3d568d5f:::6:a:ead5:b0:b::80a:85ad274.19.52.24]/"
) != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[7438:a10c::a5412f1b301a1e::2fae0:8d::883.243.725.5]/"
) != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[7:c6:e5:00:718::6d8f::cd8af:e6:7125.2.866.86]/"
) != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[:1:6c0418:35c43b7:9:fa:2d791843.77.912.06]/"
) != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[eb7:5c6:6:848:cf39:8f161f:40e45.52.26.967]/"
) != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[51aad08f0b::6:9b07:4:13d6a304304a161.023.9.083]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[c1.958.48.4]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[578a3deb0d95e258::d50:4114156.9.188.14]/")!=
  null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[85::b24e3:a2::71e::3748:::bb:496.4.9.4]/")!=
  null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[f::25.25.8.1]/") == null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[c:5b51::9.9.8.28]/") == null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[0a:d39:51d69a98b:c60e4:a06964e9cf4:c886.9.562.9]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[53d:f:93.0.302.905]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[6:2d80da::588.6.4.242]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[7e82.49.805.26]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[d::44ca75:32384.92.4.4]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[612c8b09.49.85.53]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[a92.796.537.5]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[f3:3:a::6a88:b2b273:ad3:0::64cd9:e584.294.26.6]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[62dc:8:395f68591c2869.851.6.2]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[:17:9:1ba8:5201c7aaa1.8.6.181]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[238d:91:2990:0fb0aad7a:4e1:29::35:5049.887.435.7]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[aa7c::29b905d937979f81c3188.779.61.44]/")!=
  null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[b53ac76:0aa590be2:f:590:64:62.60.87.31]/")!=
  null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[a:8:1:285.6.15.438]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[882fa5b04661f:c88::28b88.1.188.22]/") !=
  null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[:5:a41228b8:caba1ef:a:3fe66:c41:6:::87.231.2.45]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[:5793adff8:5d:e:d35.288.1.718]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[2:c4:e7::22ca1:5980bb65:::24.06.55.135]/")!=
  null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[c7552.32.0.042]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[77:13e3c:388e4:99f0114.71.4.71]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[04::cecc9fa6b3ab7e:90.88.3.366]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[e8::a:3.64.11.6]/") == null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[5c048d6:f:c040.78.86.55]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[e:a8::49cd27617:baa::c6:e:023441ed:ec96.596.45.79]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[a:::2f73.531.399.3]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[88216d:8b8ee5:86.293.744.4]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[54:579074:1b73:2::bf::f::1c3:840c::6a1:5.7.637.91]/"
) != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[e52:07de2a25:70da:e:21f539a64cc1da669.799.0.006]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[8af8e1e2be942.4.273.8]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[45.36.264.3]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[40::0:4:677c1:51:eafc6eb:2c6f205.3.1.66]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[0cc0:388:::18b27e4c:5467.49.068.835]/") !=
  null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[:748:7:0:425de796.5.4.26]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[:d:0ba:f6:::c44e27ca39.3.69.27]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[2::f05e:1514:a64.660.150.75]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[80d9b648.548.12.191]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[d22f13a76:c:c3a3:f0:27.620.773.9]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[5be207f0679.4.780.94]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[8b0::5.0.0.93]/") == null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[:a0c:5c::56:57:864.4.28.4]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[b:25d3748.786.945.496]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[e:52.5.706.763]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[29b12c9b2d:3a3c6d1e:1:5997.628.40.470]/")!=
  null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[a4b3d:20:0503:4:b:5dd126fbb7:fc:31.3.469.486]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[314f:75d6f58e46909::a:909.470.101.15]/")!=
  null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[4c:5bbd788.3.032.426]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[c::::0d87:6:5c:2c033::8afcfaa17d70.377.75.13]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[2:13804:c:31.605.0.35]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[6b186738e704e28055039.7.80.1]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[:fe12c7:7b:7.35.756.8]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[0:e90c:e4::fbf:48d:7f8d50e58.62.5.4]/") !=
  null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[b8c5:ce:fca143:be50:f:9ec:f8:75::28171.59.8.8]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[2:509b:b:f9af657be685494e15.223.305.609]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[bf463.0.4.8]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[d:27d99b7b8d0223fe:::6916:42536eb923:d3.705.459.334]/"
) != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[24:e777a9b::e0172c77e83ddd::4892.228.4.441]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[f528990::5a0a22:6:fc:7273.6.2.97]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[a81.613.9.872]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[64:d::b8ae5:dde:0d971829c:49.980.668.34]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[69ecef48195b73:7e812d888::921.4.629.265]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[:c8:55.5.043.02]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[985fceaf:f3:673846e5:e9e:1ab819:bf68d755.455.80.85]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[0865324dcd5398::26d:c9e3118.015.361.70]/")!=
  null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[c90e1:ec::98d:477584.76.3.09]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[:ef2::9efea27b792.62.79.9]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[923:e:8a:f44:b5a2155e94d:::41:246cf466.541.8.6]/"
) != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[56c117::c:24:0:91:ec:c01f5f:d68:2:5.690.147.949]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[a7af35e:2470:a:8:0891cb6:de69.4.429.92]/")!=
  null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[c06c24::a5:de62::b6.30.6.1]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[:5587.06.0.53]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[3c3:c9d49de:d8b5:6:c586.8.5.6]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[2af396fa:6a1.9.489.897]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[b::7.4.37.142]/") == null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[9:5bd27.378.6.9]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[3:82:bdcb2d2594:4773.457.245.146]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[88c3::0:1:f09:5.50.48.6]/") == null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[60c27a23feae6:81550e67a:62:881::59ae70.18.852.0]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[:c5:b:0:fd7f2:416eb8:c90.1.560.7]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[c84bd8b:d50f6b::6719:ea2c1ddae7e6:479.501.353.887]/"
) != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[4:c:f:6:5:4f::926c6353:e2:21d8b::d6.0.253.2]/"
) != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[ba::7e3ae:adb:9:::b3c4cb037e:0:e939:fe0.170.61.19]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[8a::4a:b:c:9:98a::44::d8.57.892.17]/") !=
  null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[6e:37::2.204.4.1]/") == null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[8:fe0847:a:09.5.92.03]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[22c4::18.6.15.16]/") == null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[:6::2:c:30abfa7b9c7faab2d9.2.230.442]/")!=
  null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[:71:e870.936.0.0]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[e::7c75:4fee2ab23::dcf815bb78.6.7.725]/")!=
  null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[:ae17a4:b843a10dab5:31400190.11.84.9]/")!=
  null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[89913.64.656.1]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[a6a7b9e0:c698f3d7f2:3dd3d462.385.739.3]/")!=
  null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[3055e:c1:2437.90.6.54]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[b823e:9:05.8.652.63]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[b7f675.4.17.753]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[65cc1792b280f:0f::3c6e9:3daf:d8c2a20.6.6.8]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[64eaa3:d99298d74.07.35.35]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[::e:9a134:a:a:db:841:985358b1.43.826.2]/")!=
  null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[::96b444926:d7.99.288.205]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[d1::13:9.16.0.7]/") == null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[0::54ef4b6:e:c50c2:4::5847e9797::06ccaa196.7.0.935]/"
) != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[0363a5ed9:b:3::d2:32a:944a38:bf:2f27cc41.8.387.9]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[4::fdf:8a88.256.75.6]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[56:c004.84.767.41]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[799c12b528.2.093.43]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[21e::56:37.9.1.55]/") == null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[ad:b:050d:4c19:3d035:6:c8b03:b753.49.74.54]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[99b:24dad450.7.391.4]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[::bebd0:b1935a20440f49b6.4.503.3]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[d499a29:f65b:f888e9fa7ca53bac63::f13d:06.6.5.725]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[870::66.5.6.14]/") == null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[1d980e042011e2c926635:59d76b63933fe879:4.1.1.794]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[7fae44:c7.474.9.28]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[9150:ca53.5.533.0]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[::15.78.3.53]/") == null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[:b7d1:3:b1ef1eeea::c8.25.9.32]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[ba1367:6850b:1e2:::1f:14::057fc2:76::1.1.6.970]/"
) != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[c2239a:4df223727e00e7c::514a:886fe1e9070.332.609.537]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[:152d:14.572.96.01]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[3af6e3c60.08.75.8]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[c2e91b:ed7:::f155c6b:8.225.6.02]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[c964a7:909a8e8a62:02:268bede18.857.31.350]/"
) != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[a7:78cb3:ae:af75:29f8b8:e80240616:::6:b595.571.4.731]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[5:4:1b5::7.4.35.73]/") == null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[:3:e960809c258.346.9.30]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[90abb0e:ab:e059:60::::7:7.15.9.648]/") !=
  null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[b:c41d5:896:f5c1:6:c:bc4:58fe6c104:9:f8344.7.2.18]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[17673:feb61dfca::8fa74f:84:7db1.1.2.644]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[718:257:8a46.02.51.84]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[b18d:eba25691481:40f9ebd931:de5ad88.250.32.50]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[36c1b:82::5:0efd1804.0.274.8]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[cf::c:8f4b1b::e2:40f:697.790.1.0]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[9bef1557209.59.274.495]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[13:d:e4b811e218ae5700f15c1:717.378.21.571]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[6:9723c104:92810.19.2.505]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[e54078fb46425:250::84:a057.22.075.8]/") !=
  null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[c0cd::66.131.38.59]/") == null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[f1e305e9d:c712:4:21ad4fa:475:7085f786457.039.26.55]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[cebe:49.8.7.787]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[19998668a:c4957.244.98.380]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[:9e:850773::d854e6ae:f9659915.1.8.384]/")!=
  null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[c::c0f:13.6.33.41]/") == null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[d:af0353:27b439::d00:067.6.119.962]/") !=
  null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[e533d000:c981b8b6:feabc2d999:39c23:3306017.89.535.935]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[664d:598f::097:66.5.1.0]/") == null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[6b99bb4918ecb:89784116dcd:42.3.801.11]/")!=
  null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[60ce3b4a1d8b:2:19:873:4:8418.132.4.393]/")!=
  null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[039:ab::77.91.78.3]/") == null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[6adf2:a:3e87.298.6.756]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[3f17:6a::0:149.1.4.47]/") == null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[2c66:7f1:5::82.42.19.2]/") == null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[d:f4:::84ec:5::0.6.8.2]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[44:92:10:f5ccbdb28691.435.934.339]/") !=
  null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[a::2:0:6:7493:6.6.8.84]/") == null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[:cc:a5409:6:b16:29:8:98:263:76da809b:0.79.260.192]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[3ea8e9e1:0744.6.88.2]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[d:2077.10.9.49]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[b84992::2f69c3f8:6a80::4b::a6f0:3564.31.60.465]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[c2d1bda7e89:1a823:0c2a798.5.8.779]/") !=
  null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[e901.8.503.9]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[4:6b4:d:52:c95b:f:98.2.51.9]/") == null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[1229708926b58e114.2.488.3]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[0837a48b3f:7:778610e33ac05::a:804064.760.2.9]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[:0d3251b3:7a26:b29fc3.606.788.4]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[972:498336c5::950::fb:6612:27:e5.410.036.992]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[33:7392::fca301:7::26:7a:224.9.28.202]/")!=
  null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[:7c:2.5.69.3]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[::9f:1df:3.7.6.9]/") == null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[::97.1.81.0]/") == null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[d0:1a9:f93aad:61436b6bb5:df149064:5696.85.9.842]/"
) != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[a3:e2:28cec:806fe6::53f1:515::dc4ae:fb8.18.064.799]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[::1338569::9::9:dd5546.06.805.7]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[57:824b6::0edd938ad292.392.6.067]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[:9dd9.065.88.933]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[7a43:1e:46faeb74:a1e8e:b:0ad:00.40.284.140]/"
) != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[512221559d537cc6e:b653::06::b4bf5ee4.0.13.863]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[68182:7:8973272.4.31.696]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[5::8:bb:75:db657.18.9.4]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[390a5::4ec5a9:52e::ca0759:965697.607.611.19]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[7c1::e4949f6c7e2a826:c8a:8729.5.06.14]/")!=
  null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[ee:9cb22:41ef:6bc58.1.4.2]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[ce::a2c0:7e508:71cf:bdd:2:bfb55:f0bc9fcf952.624.1.34]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[:b636:::7bd928.781.074.42]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[:b9::ffc6867.2.1.5]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[a:b5:0e8:1f38:8c:1e:113.58.39.3]/") == null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[cc89f4:44428050:62970:c85421e6:571.809.04.851]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[8835.422.97.92]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[009:15:b::7.140.83.53]/") == null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[::::8:9b4bc86d:da:ec528c11fd4b8861702.20.252.6]/"
) != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[0a886139:a16c00af:b:c:59::a59d:7449600e:8.0.302.6]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[:77fae:00916a98:5:14:db:45034025.3.652.4]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[a20508e:726:7e845:7:aa9::03062.7.636.2]/")!=
  null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[882f2d:5683:9a13d6fcd:ca1b93.64.40.28]/")!=
  null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[75da68:0:b:7e78::2d52:99:85:5:3999.955.29.076]/"
) != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[3:65b5:7:965c:d3c4c728e:9571591b:8ba14ed21.74.97.472]/"
) != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[9:922a:4::f6:20:853ab8b::0d:b:5a06.27.4.75]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[:b0:384ccb:8:c188:5::257.41.53.58]/") !=
  null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[06167:a::::7.38.4.18]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[:8df:d670ed5b:2:d:17f:99b419.280.48.37]/")!=
  null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[e6:2:8c1a:950:849:b0:794.545.17.33]/") !=
  null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[:ce9.570.84.1]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[::9:574:a:26.92.114.125]/") == null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[ac::3b539::91c7:da1a4::ee:::6d653.1.22.082]/"
) != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[e90d:a8:ae3:0a59af86f6e:e99d97615.025.4.343]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[5::61:e6e:60.7.25.32]/") == null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[1:8c:d6b792798:1:a4fced::a960.331.467.9]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[0:00::7:c29f4:1a0e250.75.635.7]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[57adf7:eb79db9c9:b:80:5201.88.31.97]/") !=
  null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[c1::6827.5.0.680]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[6643c6805.4.75.30]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[0f2::c:b38db:75cc::b43:c02d:dee:c:6:::e30.33.8.5]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[aa:bf::0e49:09:76.16.2.79]/") == null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[:51:03c16194.565.59.48]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[c:b8925c9:b7::4a07.54.8.6]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[a:a905df:f94.1.89.38]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[2b50e:a92:98a52e:d4a5cfa:24f:38904.10.7.7]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[3:7ea74b5a6:6f095b:8e8:3e91422.44.5.44]/")!=
  null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[3::4:46:0e:46.74.147.92]/") == null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[c19:cd704dbf92:3dba:6::57.18.2.4]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[ec:c71.31.17.768]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[4ed7::b:87.5.0.83]/") == null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[54:8:::2f6cb209f64.50.4.0]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[23.18.45.4]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[b1::15a67727.297.3.135]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[50::4875:014a:d:8:70.6.2.387]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[4bd913a8.9.4.716]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[9c05:a:ce037f72d1:fe9c86e79f:9:a496.632.575.3]/"
) != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[e11a254::c:::ce4::8:9a:bb:1e325b::c:bb2.418.847.501]/"
) != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[6841:e9791d9b::5a::5109e:1:33eaa3cfb:270.105.69.747]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[:9:7:96c1:b:07553b:06fa37.1.9.0]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[e71:ec5:2f343c5:3:::19eea:948c9694bba6:59.923.75.551]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[352:36b7a:45a9d432:7fe:b585.02.589.5]/")!=
  null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[775a5:783.1.5.02]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[f:4:a89b583b4ec04d:::11:::f::9.804.5.129]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[1:374:04f1::61.1.0.103]/") == null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[99:f1:2:7b82c8d:36:185e7:089.7.1.69]/") !=
  null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[22:8:ff4c:b9176.1.0.453]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[::3b:0.130.3.96]/") == null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[c::af1c45bcf552da9449e:513974.4.1.1]/") !=
  null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[2:af08606e:8::58.199.215.97]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[7c:0d7f486a55679.90.2.174]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[47.6.26.9]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[da:bc0.694.020.65]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[:045:7ad0704:9d379:f565174.7.03.712]/") !=
  null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[:df01:cbabe87::5e1.2.18.296]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[::4b6e141219302807e:70:2a2.8.6.820]/") !=
  null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[4:e3388:4:81c48daca289.583.1.3]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[3:e::5.6.0.23]/") == null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[6f58bc41e:f::fbf764:d733.2.167.2]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[9102:37:ecb1:5cebe::835444.7.004.7]/") !=
  null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[6::8:8:9.9.95.4]/") == null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[99f1dd14b43b:582:d22:c:22e:e74:ef:9.41.9.982]/"
) != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[:5e:6::7a44512f6::b2755f46f001:a9.4.89.005]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[10a:28b:a::3::5786bad6b34e6cbb6.5.585.74]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[1d:4d:88.414.7.49]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[38:20d4b52:2:c4c7:1f3:365.95.0.334]/") !=
  null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[:4210:24:2ae6::527b524.1.6.693]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[cae::a36578b12:14e05f312542.30.96.7]/") !=
  null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[73f6b:04f:ef3:6::9e7a1:836:69687848.1.2.992]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[6673.47.98.149]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[ef03f619a2.8.023.0]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[8:::e::8a451774.991.5.3]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[d5499.274.416.28]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[4918c:cb918.91.333.2]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[a1207.30.331.4]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[:ec8c026:abe67::665:4e922343ea:7f:6654:a48.52.18.270]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[41b7c:52268934.9.7.22]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[7:825d350e22:6b4:::55aee3978.533.619.14]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[05921:ea0:f8e77345903.765.1.0]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[2ef298:a2:bc9421:3::b391.2.12.3]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[0:cd:49::ea4419:46f91.329.38.908]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[7fdd1:a:8ba:ee3ecbe3f801:1cf1e56814:d576.552.5.95]/"
) != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[8:09d62::a6552b2c2c2:9:f:e:339.364.517.11]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[::4a12::98c5ec53b8:1a1:c4e1975b99.2.5.93]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[6::16.5.1.5]/") == null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[0:0:ff578fd2d9:407.13.2.06]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[:6dbeba2809bb8:8db39a6ec22a4::842.870.699.959]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[82fd20:76c812.92.375.5]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[::::bc:94ac1:78dfbb7b:bca1255c4797512.4.48.985]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[fa:0ff1eb7a4:79.4.783.2]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[3:c3ef4::49102df2b8:31.11.4.5]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[6252::d::97a:4a:5:263e:bd3f91997c99697.08.2.672]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[6:231e9:c:959.288.5.3]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[ea1:0d34514:b408c:37:00:efb:e19:4456:41.5.90.6]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[fd611e14382e2b:eb54f7f3d9.77.01.053]/") !=
  null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[673ed:9:c1:f15:085.8.59.8]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[6:b5:c:1::16.1.8.12]/") == null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[e:02321:c7:8:a:2:c0c3:05830a9:ef95.1.47.14]/"
) != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[d653f5b27:3:b:a8176c:0758a382:d3:a:378.932.474.767]/"
) != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[:07dc7b:::c:507c3d505b::db::f4:657:99.6.3.87]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[726a:54::c:36607a:16d93:7859.57.73.61]/")!=
  null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[505a:4a6::75.9.99.2]/") == null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[154:113ef2f90.753.2.583]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[10144f::::d181324:aa367:d0.029.41.964]/")!=
  null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[9:fd:0:7:3a:af0:2b4.797.8.160]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[9451.447.8.767]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[9:210d498:bf2bac7caeed410400.08.6.9]/") !=
  null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[8:596f:cf9:26:5::9.71.9.3]/") == null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[3b9:b::97:e:72:3860:500::798.1.8.5]/") !=
  null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[899bf1386f:6d:8d34e46:8db0afcddd:d22a267.46.664.686]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[1b:6f:::c62.99.938.5]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[8bc560:9f:3afb:::5:0daa7a:0:2::8.3.01.12]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[:25d69ea:9264.9.6.519]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[cd76:8f7:568:470.28.104.635]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[8ec10766:6::a3:8b1fb6:22.08.72.39]/") !=
  null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[::821fda5:9:d5da5e:c2321:55ce3:6b423.5.996.4]/"
) != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[1fd717895f:7b3689:::9:ef2:8dec89160.8.9.3]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[6:7.7.526.05]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[d9a3542::4c5:5:e52a01d77da34:3788:99.670.00.51]/"
) != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[f0:3f06:ed973113:82a6:22e:a849.756.88.708]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[08bed00f52d75:c297.7.65.57]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[1:08:33.0.43.052]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[5:f:d:1:211d:4:973583.7.678.10]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[efc8:d:40b423.2.3.39]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[3:8756762:54:::4e1c8.2.91.765]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[f::7d7:f9b791:f844:6:78c19208b:249792.392.6.68]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[7:421.31.0.60]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[:6fb3e0:d97:f0:3e3a693b1d::db:8f:7c:9717.72.74.038]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[2d73:f59:c820d:9b1:da09.88.9.7]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[b:e683::2.5.4.6]/") == null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[abb67490:ee02:a8ac8d:960:5:ee:4b8::c:a325.8.2.0]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[95::b7d3b69:70:ed5b:7217d6f380.426.7.6]/")!=
  null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[0:60c::13.98.0.12]/") == null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[78b56b::6b44.27.8.958]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[:eb439a41ed8ea84.44.492.2]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[83:5da:c:44:::b044d03.97.15.66]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[f:99:41:16.2.6.2]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[d4f:f719.40.9.91]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[16e4e0861.290.44.09]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[1408:281d09.35.124.90]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[a70:8b60e2fbc16.05.2.944]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[1:b:5:fea18de:a:a37f8:dea87e3370.8.47.50]/"
) != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[0:8:712340374b1d117fb799:559:49979960.8.0.775]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[5::08a:90.0.35.5]/") == null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[0c5:f5:ddfe:130:7e7:c56:5.9.86.3]/") == null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[d:af687:669:d7:4ef:9a7a1.1.74.1]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[819:::9d0c6a7cca:4b8f5b9:c0:334.8.365.524]/"
) != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[d7:bd08f:4:5:d9eafd9892e2743a5:b8:13f939.39.4.0]/"
) != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[c61:07:18e5:ed51:6:fe:d3a2471:6da88.994.405.394]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[4:4d:3c:00:191.792.2.56]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[6:35da41909e291bac216f8b6:79:089:0:37873.48.453.1]/"
) != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[e:0a025465b54347b7:efc::9:04c:c9a:ec8477.7.65.131]/"
) != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[ed7:e0550ac0d:e7a9093:a7117:9006.732.031.98]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[:87:158f:f54.84.60.06]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[16:099.2.709.2]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[033.844.375.874]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[42:e5:9:::::33696a42cb35e4208f99.32.7.915]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[6fb:::3::833e8f9::d0:129.2.5.6]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[:1a47b6bc0c7989.84.238.6]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[aaf:ebf::e:e0c18.09.6.623]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[1e2:dc4:0988:8e7c::5.1.2.4]/") == null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[3ce:107d:9d3:13c:ba4:7:1::5e3:3a40.07.7.74]/"
) != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[1ad:275926987e5:bafad0901b7d32:185ac40.48.8.90]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[:140:8e44699.353.576.503]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[f563.64.2.623]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[8fa41bc:3:55.1.63.5]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[b08388c55b29a7b:8364c66.75.8.75]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[8ac52ed1d228.07.6.8]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[64c628:e390269:512.8.50.94]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[9323b27.84.1.370]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[0c79a2e:77443::4f0860857:0783.9.3.135]/")!=
  null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[fbf400db:e020ad57fec:2346.0.0.6]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[74b996f045fb6:7:c:1b:537.5.2.4]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[9:f7f835de72da30:0c40b8::3997.52.88.42]/")!=
  null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[::1f6a::34:af92:33:980::0f:b3:4ebd0.512.152.196]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[:1:2a:66a::de0db1b:389.764.618.8]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[c7:4d7:::9.60.77.57]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[9376247:fbb47129:6b6c74:70d1::::e98.8.22.993]/"
) != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[e44:4413d:4526b9522cd5:2a0c:ef:fbd70.64.2.8]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[e64:13.26.92.496]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[4c:379:1409.50.49.8]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[0af380a:ee::9bef3011.86.709.7]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[e7:9f4:1e1::b8.21.97.47]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[60ee51621c9fafe1.0.569.747]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[:512407:3dda:b0::99:2ac926.41.41.78]/") !=
  null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[65d2:4:172.5.00.40]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[d6d1fa762095905498.50.4.52]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[f:9f297b39b:3::5ba:d2ec3938f8:733e93:453.2.0.5]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[:1.32.35.20]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[:6e5ee6939b566.5.1.1]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[5:5c:7f9e:af8b3a21.645.271.56]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[165.361.8.2]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[70114:63c:d4:590cf1bd652.113.9.8]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[2:7:bb::9:3b:a0517.89.4.5]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[6:4662871524::0249dec:56554.816.2.07]/")!=
  null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[f9:2:269:36:a6e3a17.08.09.84]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[ef96:3c7863.502.885.67]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[b7f6f8:7557.237.51.7]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[6b7c:c2:85c:1:9215e3:2:9e3:51.70.0.424]/")!=
  null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[2e:d6217a:8:026.10.0.459]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[d5ee1::835a:8d9.439.3.3]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[43:cbb:ba9268.330.31.3]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[:95:ce69ae2:::df7.0.06.0]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[6dc5:9a194:::49::4ee51::11ef96f2c7f6e050.95.34.12]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[43f080f:b7d5f47a:b8::c07.313.101.664]/")!=
  null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[9f819de::ced3f3d::5.903.8.5]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[07be:da1:a82:f702d90e9c:7c53.47.7.905]/")!=
  null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[5b::0:8:17.5.57.1]/") == null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[f::a02::19b:9b3f622.4.8.9]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[b68059ae6:::a113784ee5bd9b:c0b38.2.4.864]/"
) != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[5:841b0:4887:6d0f0e34:0:f::::1cc:b2e:f253.58.518.748]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[071382.717.05.83]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[d:8832:5a2:8:453d::61735.75.50.71]/") !=
  null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[47:255:b0457b3f:078cf483023a867.71.6.993]/"
) != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[57:b5795997b:4:00:4339784a1b:262aa7f52.244.7.13]/"
) != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[0089b:22101:65527:e3cd0065741e94c:c773.893.963.200]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[:bcb9:c:07.7.0.57]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[:c185cc2614d::2cd33ea67fc7c413.417.405.182]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[199::9aa8a:d:16.568.335.6]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[8b:9:1f998f928bb:4f7::710325::ff3.19.885.631]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[697ff2d26.87.71.2]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[db18:af::91.75.7.48]/") == null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[0a933868:5:b1::::837.2.2.01]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[3:209215::3e4e7d9295:7519:25167.78.6.03]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[5a5d7c7.06.971.468]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[e1e4::55.10.6.38]/") == null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[8018:c27.4.48.15]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[aa430::f21da::67:9d:437:f5e01.930.9.54]/")!=
  null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[cfd7a:cb92ecc69b8c:62c0b4:171.25.8.553]/")!=
  null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[d9d7004f587c4bf:f97597ec8f143b9c001::19.75.926.97]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[55692:a6c6e5a1213:130.7.01.27]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[0::c4:77.1.2.0]/") == null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[55:3b695d9:19288a:4f3:1c4d:::2847.928.58.78]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[941c6::1c:a2abaf08:6:d23.85.3.9]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[874:73.83.3.88]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[9348::4bc:d:a:e:92.43.9.58]/") == null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[607:5:7:34f2f::891ec:a:2.4.42.645]/") !=
  null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[56eb93e33d::5db:a354.46.0.810]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[6e094.6.98.0]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[:4c6:0::c::8867e:401:47:857.3.10.64]/") !=
  null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[a80d:c82:867856:7e3f4efc70677.645.167.889]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[e7::::513:6acb398a1:ba4:6720.54.4.6]/") !=
  null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[7::73.83.200.0]/") == null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[:9:2c84.8.903.602]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[7:c:3a::6:11.78.4.87]/") == null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[9945c6a1:8654:f6:1389::705.59.976.478]/")!=
  null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[82a::b:9d79:81:86.52.8.96]/") == null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[6b2:1c3b:6:ab1:4f55e:f24f6a72c::45:f:f211.913.373.557]/"
) != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[::0bfaea6d6fc:34635:220d6f1de:c:fdcea::d93.23.55.072]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[::c:08:f121.15.00.327]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[a3dd247:a9c17184f732.3.607.2]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[bc::65120acfe8e:fd3df2.35.14.39]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[a2aa21.28.994.487]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[77899:4:155.2.295.6]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[b:b3::7dfa4:0:dacc4:b0:c84c:e:3.1.910.505]/"
) != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[4f3cd536:7754::e6fb83b7aee:a75b6b7.6.649.43]/"
) != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[c8e5001f17:f78e2dc5:2c8cb::e5d41cf5a9e:57.876.23.560]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[7:f:48:5:d0aa9::f7370:3:729.1.69.1]/") !=
  null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[2fbac21f:5b4eef2d6938e4:6cff0e3f11e:c9a1.441.24.456]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[ef11b8ab647036.8.4.1]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[78d:c:7a9f:934:59e:6:816:d2b7fe4:796.49.5.4]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[:65:f:aa6268672b68f34ef7:cf67.41.990.48]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[90da0832:::eebf47:b833682.9.7.844]/") !=
  null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[0f9d39d:162.76.410.112]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[b2e::111.5.2.8]/") == null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[bd:fbc:632148fc49:ed413.081.963.193]/") !=
  null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[9::e1b:a15bb852:a:cb4ca6:8::132b89cd10408.0.10.124]/"
) != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[:f860dc427201c5af68f58a3:3e1c9a:a9a2:c90964.1.2.940]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[4efe1:cfc2e7249:a30::a:6683:405.45.90.80]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[150218.3.6.56]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[27a:21:3347e9f096c16239:c:45:08:5:66:c5.55.30.8]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[50:27a:::0e:f9feb629::77:e5412.4.1.85]/")!=
  null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[:8:651270b0a9:6f1e0617a4f0ac3003359:097e091.409.16.051]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[::10.2.56.7]/") == null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[4f:f:741e0ccdaa5ec:9:5d3b:487:5:bf96b605.986.547.204]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[e9:8a:01:c1d7::1e4:55.7.2.8]/") == null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[a92:4::8a:65:92.3.890.94]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[::0c:52.93.0.1]/") == null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[::3a8:5:13e23cec20.2.81.0]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[b93:8c36:6:818741:c:313:4:e34aff26.7.774.092]/"
) != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[ba6f91::301:fc:1:04aa:0b1:353c699.717.2.16]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[9:303e:ee63d1.832.67.748]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[7a9b4bb6:3a3:7c31.65.96.131]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[5d3c684119:0c:1afcfbccbe770:5b0:b5a66.3.89.3]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[:ed53d:9d::d6:cd:db2027840.8.58.026]/") !=
  null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[9496c7da3d84:82:665c631:84::f84.10.33.38]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[:8b7b97f766:d06b182.85.295.623]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[2a::3bb:c754a:815db45437f504b:1:2ef:7f79.6.26.6]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[e70e:f583::cb:0.8.8.118]/") == null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[68194f3b87:57fdf9f0.48.01.13]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[aa4fa:147a::31172:::1.7.14.4]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[3ec:71::190.9.83.90]/") == null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[b::15.2.120.17]/") == null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[0:cb837792.45.9.93]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[fa8cdb4::54732:f862b:9:315b0a:d3e:d3b26.56.45.50]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[a3::6:1:27.1.2.2]/") == null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[5cb7.35.517.695]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[1::85.15.54.2]/") == null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[0098.7.90.67]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[07877091.636.8.44]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[8b16cb9bec30b31c675a:bd5ca:4:88895.6.633.2]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[336bb:7::4:1e4e481c:8cd96:263.6.82.068]/")!=
  null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[65::53ba5.877.93.55]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[47edf6:6::212.76.97.3]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[d36:80074751.21.779.3]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[8:2:45148:0:ff64cfc2c:413810:5.5.68.612]/"
) != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[04:2c::f430:e:2f5773e::9bb6b:1:fcd69:20.7.967.94]/"
) != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[98::b:c1ecf2e540780:f90:f891fb15.545.03.1]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[:1857f0a40:5b237.37.58.11]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[d014bcc:b976:55d8.8.78.347]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[:e5346:88:42.3.8.05]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[f:30d:4::5000:c2f7f2f59753f094324:3df258.378.7.17]/"
) != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[0e:f155e:0a:022030d71c62d::712:d:08e8e592.350.678.2]/"
) != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[::895a62:2:52a216d6de::42ea:4e:69d7cc691.2.8.964]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[c5:200.7.73.5]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[b:1:dcf:fc:76.21.72.069]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[892:e6a82121b119d1ee279:ce22.2.25.438]/")!=
  null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[3ff:f20::088:65.5.71.51]/") == null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[9:acd2:::338262d:892fdae:8b7:e:799.301.15.50]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[c:9a:eb5b198:ad0:83:55.4.26.1]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[f:9b0bcf61370c:65d4a437e39cc::4c011e2e0.180.6.1]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[:992ea:c9273:9:042.3.174.20]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[398701:b:a46:6d::b:5be755ab8f5712:0c4c1e5.015.603.98]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[7:d:c1d::e4.7.8.3]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[69e:8b44.1.621.6]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[1db:c027:c7814a:c0cb:f92c:8f:8:a0ad92b406.9.64.45]/"
) != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[:0b:c:a263752d6d:52:08bd186:ad628.14.271.61]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[e57:bf31:8a::1.5.0.72]/") == null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[5:3b1f6b39aa7bb102:5.1.985.6]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[0::7.5.25.66]/") == null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[eb:663.0.373.105]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[c::5407f2:6736:8e:56b89:5907d:0.23.204.267]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[7d784:8:88.88.0.080]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[0d:61:55:9777.0.015.2]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[1037:8d16::e666.600.7.381]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[5:f::368.6.03.925]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[:b6742efa:::::72::83eae3bd::130f3b:10492.32.500.6]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[9800300c7dec:45dd0db:1942.91.8.850]/") !=
  null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[b9d01.9.3.87]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[:::f6af:e8:717:1:0::63:3:8586a5.73.9.319]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[d0:43::9.138.141.02]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[:d17ddfd6::23510.32.25.0]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[1b:d4e22d5981:717:210b557f:b123.716.99.978]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[7981b5b086:a704:c:5a299.086.4.1]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[fd2e:721979.93.517.0]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[9d9753a:3c8a71.900.54.962]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[27618.0.68.6]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[9a6a939bc8cc6f962.27.9.84]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[4cf5:8d7f255a7:302166.33.000.942]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[3f7c:63f7:c10:d:4db7ff73.888.6.9]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[424::645:62352fcf:2:93::4659.5.28.97]/")!=
  null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[9611f4:239e4.954.201.0]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[710f0b2cb:2f39835.19.87.78]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[4b0:b:4::30.15.39.6]/") == null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[:a94f9a71d:c1:f:ac:b2720:91a:9a8244939.5.763.957]/"
) != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[080d:::026:::b3408:621:6f2:3:7f292:0:5.799.951.04]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[ec::8d:54a2:20.6.3.677]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[49::9c2f8189cfd01f8e:4709546:13d732.5.6.5]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[83::2ca:5:84.2.213.5]/") == null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[369e::894364722a4.52.9.5]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[:3026:b146.643.9.33]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[6e2c1e34:a9567e6b44d4e:8f9.2.195.83]/") !=
  null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[d:39:5b8327df2:420:::b94d:f702.499.49.7]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[6:c0c776cf2f6dd:099.16.67.0]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[f:fee516:a0b13b0743be:baaa5::3b828.18.00.182]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[:7f02fa:6:7d21d43e39c9425.4.381.02]/") !=
  null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[19ee:4d9622:7.967.393.332]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[:4:2:d6fad33::ad434.00.02.3]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[bee:20100:78f2::2b4ba73c4cd6:833043.0.474.38]/"
) != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[5c517:d:a0a2:ee0:3be6::::28d:121c2b6514c39.05.807.2]/"
) != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[:337a957:acbfeee7:20e:2a::53e:a112.9.81.1]/"
) != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[561:860c491:44:4::fb736559420cbc21ce17::392.480.697.95]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[0ecb:5383844897:9:18659.6.8.3]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[62df0c5639:789149.679.245.8]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[:0f:fe:5b77a3d:f25.549.975.555]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[8::15.59.5.241]/") == null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[3125ddd72fe87:b9:8d5.8.3.183]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[d554fee379652.468.434.54]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[2:cc557.42.4.4]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[e:1::3.22.40.239]/") == null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[c::32.7.7.72]/") == null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[8:d60a5399:812ac02:7:4:8:4.6.646.914]/")!=
  null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[::1:72338ec6:e57.460.07.8]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[1b:9490d5eab26df2221.6.82.908]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[2c:aea7a0:3f7be281.79.701.229]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[6ebe32:2::9624b:6350.28.40.5]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[a2981c4c4:86.043.4.265]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[:d063dfa7023::464:0aa7::827.873.747.38]/")!=
  null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[d28c::83.4.6.8]/") == null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[d:816.67.84.2]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[:e74::8::4f35c:0:323:02ad0397.159.23.7]/")!=
  null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[f240.6.92.0]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[990238:f866.83.6.19]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[:a:a06a0744:0a0da60b7674.23.87.5]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[86a94:ff794e6c1:7.3.7.01]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[::4:fb:2.70.37.77]/") == null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[c868416a8:6:24.48.13.73]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[f:1::5e4f:6fb753066.6.1.2]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[b3f635.1.11.43]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[ea1a::98c:971:7.0.0.51]/") == null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[60d6:4bfacfac722.7.4.52]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[e5dfc900549:3:b28ea037e890.173.3.14]/") !=
  null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[f::a2b72f99:4c9d1615.46.252.093]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[::86c6:59.7.19.4]/") == null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[f7:9cc:bf3:5d5:f::d76b7a3:a1a2:04:b92.675.7.858]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[:b2762.61.6.70]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[9793517.3.0.7]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[f8:d:3b5f45.410.965.509]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[244c:799d1d43d:a:4:4f3480909800:fc::df9:6.221.513.597]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[03a::625e4d7.535.4.83]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[:69a:::50a:af:968::3.12.51.803]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[7:05ed:f145b2e1ec:ec:540.645.29.04]/") !=
  null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[329:9:cf546ecd59:3::5bb:b1fef96053.9.8.81]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[d7:1:d2e:e9c8af:2ba9c54d2665.857.0.9]/")!=
  null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[e::::4adedd:a058.85.9.82]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[16b:bb6.4.217.4]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[:0:91.11.3.039]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[73fbf:761.160.8.66]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[50783.061.50.812]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[14f0bec7:b:a76d:5c:00c:05.868.3.970]/") !=
  null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[:1:0486476476d0:62d3:fee66261:d:86:79.557.525.335]/"
) != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[20736fab8:::3af0:bccb7:7b:5e:3c57:4:2856.1.41.64]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[4bc:0846fc30ff:f697:2:0.8.2.89]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[f27:cf:5a8ff::3:e6.267.323.7]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[5e49ec60.562.293.57]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[:d::c::d9:92:46e3a710cc08:1:98878.44.39.753]/"
) != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[8:4229b6:a:9676499a::e0d9963fad0c:d2abd183.2.88.02]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[:74:13c1d101.3.0.8]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[5625ec:::a4:4370:b3:2824:1b21e9:dfc014.88.418.376]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[d::1:b:98.6.94.123]/") == null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[80d:22.174.097.953]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[766::adc:0.3.82.4]/") == null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[7:195bb:3998.43.19.099]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[c30552.7.000.83]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[d15f31.953.258.2]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[d93:71.35.73.326]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[50:6a47d282.65.170.07]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[57:0:7a:7f93799.7.9.351]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[9dbe:77ff:e:c::9.53.60.4]/") == null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[f40d:8:497eb8b:6:f9:bd:d20c78.876.634.0]/"
) != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[::d::f:7ef7:a:91:147:bf3c0786900172.7.96.12]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[6:fc::d09c8f771.97.8.72]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[a:6f::5.73.91.61]/") == null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[1:d6a2c0142.65.471.4]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[:70:f::00c4e2.79.545.32]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[872588:9f99f49aaa54::c749b:737598.9.988.6]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[8e614f859184:630d::a::4a::e:2.39.899.547]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[d:20135f6b5232.488.1.17]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[13:68:1::5.187.14.95]/") == null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[1:c1:5::9e:118d7::fe5cb:085909.44.801.863]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[::13:9:1b9::fa23:d81::2.894.48.7]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[f3c5d693e2:580d::2:d4675:c083:c273.3.02.1]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[423e435.19.51.00]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[74e8::0:b4.63.12.43]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[2ddf::f5:7.44.55.8]/") == null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[eb:96b:84836:597.692.7.625]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[a4a9:539e303.66.8.1]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[86:9dcaf16:284.7.87.55]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[0e98ae17:2f521.9.721.509]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[1723fc76:325e9:62d00:3199::beca:c3::7.0.3.146]/"
) != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[2::b3e14d080:fbd6f7fd3e4c4:0:51:ae:32.76.68.27]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[a01:e5c5b6da1191ba060.2.47.382]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[3:c5b0f:4:021.14.17.891]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[01d3ab8e79cd4::80.27.88.566]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[c51ff::4da928:ebd:ffb202.618.859.4]/") !=
  null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[1c9e4:f71::6:3:2:21021:9e13:a478278.875.86.86]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[86a13c26a2e3:68363.34.913.995]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[c4662.16.652.240]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[c::4d683508261::6d0:9804.6.3.60]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[8922::174f:d7b76:3010601:7.2.153.593]/")!=
  null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[8e6e510406fd:b:8157d0415d2c27.027.9.98]/")!=
  null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[c:d87d4.9.4.009]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[::7823:6044:1.18.60.17]/") == null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[696aaaaf0f:2f1009c66d:db1e083.963.7.8]/")!=
  null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[b4e622754:7c483.778.250.1]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[:e::a82:176:0:9.174.906.4]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[e3249f07:64f7:3.2.21.56]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[9:d4e144163.319.391.6]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[82ad:15b9::6845dc94:898bd49.911.467.1]/")!=
  null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[:c06a5:63e571f:622c2:3.8.355.136]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[b8:3f::95:1.80.6.203]/") == null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[f::9:a:59:5.2.67.0]/") == null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[d2f0934:51b86c8e:6bb:d::e:237e5c5e0e9094.91.146.07]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[:b2c3e40fae:99.92.6.5]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[::36.93.1.24]/") == null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[e::2.244.2.0]/") == null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[a91c:2f:3fe42ab18.775.74.7]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[680d05116e82::::03.769.24.8]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[ce7:44:0:733.07.7.8]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[4c321d9:0c2:0:da1cf:ff767.431.299.787]/")!=
  null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[c499::83.7.96.9]/") == null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[:dd0e1::6835073:7d873:13640:5:49a296e::53.70.178.581]/"
) != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[a2e4:96a1d85::099e:faab:a8::9894::382.633.45.3]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[36::a:211.3.8.3]/") == null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[:2e::c9dd830::dbdd1d88d21da31:158.4.796.3]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[c:eedcf::860d:3927a:0058:0601.06.212.1]/")!=
  null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[889ed8:2d:af16665b3.965.36.886]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[a10:fa1:825655.3.24.6]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[9:fcc279.840.24.4]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[:8a0b1:f6c:345:6e8:9c2df:b10020.722.1.170]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[::0.40.3.5]/") == null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[e9:86186:091a:fda:83:ce1c921d404322.55.1.1]/"
) != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[43::a8:2e:bea0:fd5a4:6::::45637:800.779.21.55]/"
) != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[29::471:2:60:46da491:825a8:a1115.30.42.45]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[69ea41d3a0.00.9.3]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[74fc7ba82a::57d643::7c563e6953::87e31431.32.87.7]/"
) != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[4a4:212:7:8bb5:92:8c617c:a3bdf4aa146.01.26.604]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[:2b36dd:ff931.88.669.54]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[14f::af5:964:4.567.40.4]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[295::d9a91:56:ad8fd036:9:f8.147.451.17]/")!=
  null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[6e:e6d61ef::4d5e2::11dd7ee1:0:8.60.765.079]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[63c5:d3:0:91e2caff0:070f15:c31.7.40.538]/"
) != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[09::7718b7::d9c:2fe:5116be12c:::3f8c9f67.323.560.2]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[d6bca:dc4bc8:823242.2.953.687]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[:c8c4:47e:19d::efafc23::cd6088da67.6.1.29]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[8e8901.15.8.9]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[:8aa4:e018.445.2.3]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[4cb5:779:57924ec98a7908d291.940.375.85]/")!=
  null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[:61cf1e94688:fd:734739:730.2.5.2]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[::789:134.3.91.3]/") == null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[93d:50dd2:1861c:27f4313ad7171.0.6.5]/") !=
  null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[3d2cda45:bac5b:845a26b8:2a471.273.76.97]/"
) != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[:0::1cbbcaac1da863071:42edd29a:a:360bd:79.21.4.97]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[a7d8:8b48cad4839:30:cdbb:873.229.99.2]/")!=
  null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[:76:::0.7.3.741]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[e:1281f141f:55:e:8247a:265:f943.96.48.0]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[c9:2270a4e7:9:69c54.27.20.632]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[473:73d163:c::d2:8ce:5f:55:9:a3e1e6:::a60.41.247.1]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[4734.52.6.963]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[bbb::c:9.3.25.1]/") == null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[3f339:::1694520:695:cc:050c45aa:::b::1012.8.96.872]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[ca668aa:a88dfa28e97::6:7c::554.659.55.35]/"
) != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[a17a51:391:b62d:::c71:::b07:6ce:66.10.144.0]/"
) != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[2:f7eb:e61e83cacdd:79bf279c::8168c:c:7.20.89.3]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[b04929476:67:6f6296c3b4:fe67061.1.50.745]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[66faf:8d35:5.28.6.7]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[aa0.24.15.776]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[8106:753a8:e:5:637:e0b2c1cad5463.1.24.135]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[d31::9:541756::84ba66:6:7.978.57.4]/") !=
  null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[87::63:e::78.41.72.68]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[:35710672eae3c::a941:e:5:9918.2.3.206]/")!=
  null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[3::e:2426:2.44.195.9]/") == null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[9a8e:40.380.385.69]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[a::97.48.41.67]/") == null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[a10764920ddfa944.35.6.9]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[1bde:4d159:3:7a880:2fdd:cd77020.340.43.9]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[5cf:7fa:24:8::1.0.45.77]/") == null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[5d2e:f7a702881f726.1.704.3]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[68:40.251.14.05]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[63286e:207ec45838.4.156.78]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[:7c9c0:94eb:13:51::e67:ab7:2902.825.54.122]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[861:431a:280.1.102.340]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[c:16:3::1dc33513232abc85:c0989::648.371.76.7]/"
) != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[fb8::fb9dd549:a129:e9ffa:9:f09:d6641519.0.22.59]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[dd5::7d0551:b:2:f3c::43b:66.888.215.674]/"
) != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[b1c9b:b:825d814:682b::59ee28dfb2c34f7de4852.693.9.74]/"
) != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[9328e:61:1::fb2:a5cd6b52:70:92109.47.89.09]/"
) != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[2f35d8bf:e47:a0a45cd4:7d47::f:bea:f4.810.723.20]/"
) != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[:ab3b:e:98:a165522cbb:8c:e77:::3a::8843.75.4.720]/"
) != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[:773f11d0c:1:7::476e:1:a2:b0352.79.803.18]/"
) != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[c84f84cccc::b8:cc:6de4f:4b7:a::c27012.851.7.24]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[12:4ac6f:4a:e:1::59cf6d0:9::::8.9.9.06]/")!=
  null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[3e8f59e028665:48.7.68.761]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[c:5.37.33.0]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[d7:061546::56:3962:b286.51.594.141]/") !=
  null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[e3f3a::22:9f045:::aa:04669::::ff7.3.0.43]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[8b201d78915b81e:82.2.26.45]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[7f:f2ab5:1:3804a7e:594d4c02071f1832bc9:222.43.459.899]/"
) != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[7c46b1c8f:1::f98:a:03a53ab8:275.961.73.569]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[65:ee:0f60a972e353586.603.94.76]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[a457.5.49.68]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[cb8ad:3c:1.108.74.6]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[f6:4:47::bf1:e463:254.25.1.24]/") == null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[562.131.2.542]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[a9e23315f:133a1114:e9bbe:b5:e3b7.187.8.1]/"
) != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[f336e3c215:b4c74d237bf17:b:52f03e32:177.7.5.20]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[a4:3b::e:80d:86.9.4.96]/") == null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[9dbe6d65.1.655.8]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[c29145067801a8f6dd:a17949a2:ec:17.973.17.7]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[7::7e37:b:22.69.8.54]/") == null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[229:2c::7c:4.21.76.38]/") == null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[da:7df8594:c4e:3a:1b304fa4677.54.08.067]/"
) != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[b::b:e11b9b:94bd5a:a1b24ad9cc26::e217.42.14.53]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[b6:f:003::76.31.72.79]/") == null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[c42e4ee:36473.5.882.40]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[4a44913:3:f:2dad8281c89:7f1::d:ed9:9539.99.152.75]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[374::78:17.46.9.2]/") == null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[9:f:d42:91fcd5.5.9.08]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[b35dc2:2377a:9:d8a43.5.2.2]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[d:632473:3::8de435e16.7.091.067]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[4f::3:96.4.155.164]/") == null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[0428e9e6:3:22:b::0d6::e97:2420db0aa47b4.3.2.5]/"
) != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[861:1faee5:565:34e2078b:158d67:ded15719.339.59.470]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[859a:59:e8d792.329.39.72]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[9e1b496:9:07.16.67.52]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[9ce315f1d09:fd:5e:::0:8:a524c89.37.089.6]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[fe92f468e85:1e:e4:4a:fd:0:574.964.2.2]/")!=
  null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[442.0.11.3]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[64:::11951e3819a0f346f3e3:7b87:8a2a86a088.91.603.13]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[8ea5681.5.878.047]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[:328e990247976:5:c:4b074.0.5.42]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[ff::2da4:83.992.61.4]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[741:b8:09:e3a::be4:620.70.694.74]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[084eb6:54019:9a32518:23023:f14d:1643785.179.35.1]/"
) != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[fd96ff:1:42f16::5:81b:7f231192270f4144.756.680.854]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[77c:2d:74b0c4.73.591.90]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[6:::0:0e:b72e9:10:28c::942782f3454.35.4.8]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[eb:ec628.84.39.67]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[5206.7.5.68]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[297c03b:db3dc:66:4f98:51763c86203.5.79.919]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[4:a2ba2:b3ff:94c9:10:ea450b103.38.88.4]/")!=
  null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[2::255541d996.6.4.744]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[507:5e:496:ca8c58d4.47.3.634]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[19:e7fa:e51:cc:134:0:8.83.182.12]/") == null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[22:68ef099.67.024.73]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[c582b8fb916.6.89.84]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[:e:88:3e::53:1d2ac6:9:35399b:2d0:b1e5403.96.084.543]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[0d1dac5d:049de:2.9.873.24]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[0441.348.350.2]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[:2161:113.7.6.04]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[157:::bcea:d56716.26.33.255]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[c:9:11:660fdf8c45:381:410c3e:e:84c:f93.83.8.424]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[7b9:a::6c75b:083.8.3.495]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[0584b3c:012e8039::9c:d3a:c:98afe07.5.68.49]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[4b153::5.368.71.58]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[006:13e:13d4:317f686c2565342.32.93.37]/")!=
  null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[c9819:1003.416.88.8]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[18:3fb68::bc:1b:6f1:0e06.673.782.94]/") !=
  null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[8cbf11edbb:768.04.74.838]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[fc:9:21::137.13.59.87]/") == null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[2:0c8b2:e22b2::ae59:8497f::e176.084.03.70]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[f23:8:c0db::90.11.0.97]/") == null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[:85340:5464e3aec:3:c:e1856475:bd85.02.605.471]/"
) != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[db2:8381f5:fd35ffbd:f3b::4fec1:f6:0.572.26.2]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[4d:b4.1.4.2]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[67dad9:1d412.08.24.4]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[4::a:4:bc082::f0::8ea19:f4b:49:339.5.2.848]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[fdc1:94::79249c9100457.7.088.76]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[61:502507.8.0.1]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[::8c:a:a6d20f6ce214.9.456.48]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[45ca1d64:ceacad:17cb5:603.749.0.723]/") !=
  null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[3::93.77.78.6]/") == null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[2e3::a3.0.701.74]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[baf61:6a6fd48.9.06.4]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[c2440c0:008d5067880.1.070.970]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[3:423.7.99.5]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[3bb3b:3fc62f01c338d8ce:d2:6835.04.9.5]/")!=
  null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[be73:e0:b7ec:8:4401:59:d99ad1b67c:aaa49.79.879.814]/"
) != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[bf75b:a:aabb::44c0af2:6e073f:5da:e20.8.0.306]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[5:b6b4f:f56e95f:b268:497.26.67.26]/") !=
  null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[5094:5a:2::c1e:1c5:d9c7c15:1cb:7.24.1.752]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[156::::e3dce8:3b3:349.09.34.124]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[70af:65a2:ac45:6255d:55a:da34e8f:1e2.1.8.5]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[:eb42622.496.131.0]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[:2d:1e::d281e:7487.37.4.678]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[c7f::29:5b:3.4.3.37]/") == null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[:bb18:a5025a:86b:09.25.287.96]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[a72006:ac:::::e3e9042e7f:a082f2687.80.656.05]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[8693491cfc7a0a802:d:a7:7.8.371.70]/") !=
  null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[9c::9243c:e9:683232941975728:9:44df0:ca79.2.04.261]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[:87::69f::1294fbe52904.1.45.1]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[a4c1:78::a4bf:e074:5f2:7105024.77.7.3]/")!=
  null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[1102f7c6:baac:d8c:::3:1:::a758:4a7:6f73.738.24.913]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[012::63c8d2287::ca1:d440::2.212.598.6]/")!=
  null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[e24::11.4.80.19]/") == null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[9:c772:0199.0.23.07]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[a66661e535dd9c7:89e::3::65ec:a382.5.62.8]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[baa0::c77e:07233:9d85812982.6.75.41]/") !=
  null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[e9a::33.8.8.3]/") == null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[7856710:::7b4f21df1:7c8:14c4ed64.331.50.1]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[a6cd1f::f1b6f:3c855b:a:9611:7a11.08.1.06]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[:01cb:8:6251.2.404.6]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[37c7805e3a05964.4.745.28]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[19:89caafeed4467.880.48.1]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[583bca::899:31:fe3e0cc07:a379:a:9.802.55.18]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[0c17de602.313.70.72]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[8e511c3d:9348::cc07:d19f6785cba4534.2.603.06]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[::4:6d:dae6:99.98.97.0]/") == null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[c:::d0:55d::5:1:4900f:0:beefee::c220.2.56.084]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[cdc:f9903f:b294.110.37.73]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[89d::64:4:47:24f4b32:9b71808.075.81.7]/")!=
  null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[e8be:7ea1e3044ae:57b564.6.805.414]/") !=
  null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[:84567752461b78c8a:98d:7183.434.8.1]/") !=
  null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[:fdc605:7779.0.92.278]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[f7:9:2471babfa81a7::3909a6639192ffb:95.072.540.6]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[7e257b14.3.688.31]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[::5.9.18.7]/") == null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[::36.37.47.99]/") == null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[8::bb82:3779bc0:::d669.25.1.83]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[1:ef::7.29.31.237]/") == null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[930:9c5b8b1::ba8e:::aae28b3a73db287.657.091.4]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[3e826:f7a:a5.090.8.8]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[::113f:04a:9:af:2:72.5.42.8]/") == null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[c1dc102.488.363.9]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[8a2257bec4188d2:0c0:86:1c:c016.32.039.299]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[9::6.59.3.104]/") == null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[657:8:3f::13a3a218:cc71.2.847.95]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[::0.1.97.84]/") == null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[a6::2:d:1:a586b5e09:6b0c:4015.045.805.25]/"
) != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[15:93::d32acbd34:6::6:a4::1:8c:2064.4.57.67]/"
) != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[:8c:6::1:d8d::6:3f4::08b42d:f99a1c0:504.446.376.9]/"
) != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[7f286bbbf09946a991:642ea20:3dac5:fd4d:208.24.9.252]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[1f:ba6b40:db281e::21:0471.406.09.7]/") !=
  null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[fae36b1:2d578::48:57a1ae3:46.907.9.00]/")!=
  null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[4e::55:0.33.94.6]/") == null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[:c259.231.0.4]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[5d::30.49.48.2]/") == null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[b0.63.78.10]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[c:82:6e:5::d8b5.86.2.37]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[49609f13a68248f04:0d5bc073::8.945.39.5]/")!=
  null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[254:96474a823c:153c::dc:ada91:9:48.2.378.4]/"
) != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[29fb3b051e79:1403::00a:d:54299d6f015.764.41.82]/"
) != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[:b31592b293ebe0939:afc33b4b:b462.714.1.400]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[7:23:0d:8e0169.3.2.85]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[:927:0998ba1940ab7:13e6.6.00.96]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[d2e80670fc6:10:7392:a:7327.67.033.987]/")!=
  null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[4:3a42::c24918ad:af1a3c3:b0.1.0.25]/") !=
  null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[9e11c12:0:77b6:7173a1a9:87:e1848:1:85.305.89.66]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[d2ae5d:e972::d:7:e8d:862.37.95.65]/") !=
  null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[2:::85:b::30f98a31b:b::57:905627.42.255.5]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[9::d51fabb3d7b58321ee46.974.2.984]/") !=
  null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[803216c::6fcaefe453f::31c0067232.244.77.281]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[5a7.789.0.96]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[f::70.3.5.92]/") == null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[::7c:62.637.26.80]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[ce:04:97ea433.1.46.745]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[ca3:b298:d9412d2553.5.067.1]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[b35:43aab0b65:6fd::15:687ac6:1e3b74:72.48.68.63]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[d10e:6f::c5e599d2a:9f1b:6d9d6938.1.5.24]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[af6:829859::de:7f174.36.66.21]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[f7abb5:da4e:235679.760.8.539]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[24f:ce:1::658fd00.768.649.01]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[05:15d1f:d5:571b2:f05d09f55fa6619.63.892.3]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[8abc:c:112a63.927.871.503]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[5b1c3d77b:1ecfb6530f7437:dd:5.08.572.33]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[e:5211aa:9:e:50:e:ed:4::5.64.0.3]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[:53:d57e5:e425237b:58556f85:5:7:f46:2b7718.0.972.15]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[06::196:0d858.11.9.27]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[9:6::d4:0b484d9846.6.229.9]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[ac3ad5:2a54c36:ea21:d9:5:e1:0823b8:9a92.19.87.190]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[:19d0:f1:8:d7:bae::0d098.86.2.80]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[d5:b039981b60c4da::b158d915.6.684.828]/")!=
  null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[:8:bdc:3e179:a:12.537.6.1]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[698d39:da:579a075f2ab:0.63.4.58]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[f1f891c:23:29:e:903:46af5af:431:f9:302.599.5.688]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[687683::e:7f::2e3611531.70.53.519]/") !=
  null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[:ba28:c:0.36.87.35]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[:3:cb8af6::3e5b7f:2eb0cb:::b25c0:2.91.3.754]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[9f27:8a7c:85d75c0712.6.7.2]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[1f44::ec42ee4:05253.423.6.49]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[e93::61c10.475.357.59]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[898a4a:d0:59:a698::2bf:e7d93:28.3.741.400]/"
) != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[b606:4d1:a07:7336681:4:ff4222581.82.057.37]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[:80::25e:00.1.3.6]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[a92.13.495.8]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[9::d5::9:59::5:::c9423c01c480::dfda001.2.94.007]/"
) != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[40c14:abc45b53d8:73de0aa:be7::8847.4.3.374]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[:308.95.727.942]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[cb41a:c72c0a644:b1.5.07.4]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[b:2:658c33f003.0.68.14]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[:85c4:247a:c:edc48dd295.95.320.2]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[26ccf75d4fd:9ad8:4610177bd9a22abed0.943.9.85]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[c::d:225.39.3.45]/") == null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[8f9cf:3dc806578:9:3.243.193.8]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[8321de:8b:3:805c2f11706.846.0.596]/") !=
  null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[:a62a76:2006490:409ff7543a35::3b4::d135.0.4.59]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[:a3:30:7901.863.680.1]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[:6:73c::41982b16a:da33cb5d:744468c4:9658.8.7.98]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[:ebec57:3493:2453:9e31:57:e00.288.64.77]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[5da8:d3::22.5.947.8]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[3:965.4.9.4]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[:92:0b:2:9::d:86c4739:90d871.97.29.79]/")!=
  null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[143.215.906.95]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[c2d:956a3f368d43ae0::5:6c4:f7a:29.5.7.259]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[::2f17bf2f:09::a8.489.1.99]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[fd5ca821edfb400289d2:02a01.10.7.90]/") !=
  null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[2183::8:88.233.16.0]/") == null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[6a6:5407bee819.48.4.8]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[5b1::3.5.41.48]/") == null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[a04c50fd2d2:56:a2182b7bbb956c94194.53.763.80]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[3671213.112.98.092]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[7:ad5d::0:2c54c9c:1d:35dfc:8:7:b:3182:d00.9.04.28]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[7b671.13.1.40]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[::5:77:364c8991258879.8.290.84]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[::42e:7::d:c9d5816::50a53:92378.697.138.01]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[2::d7:7.9.31.1]/") == null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[:2ae7ff::c0dbc:de1fdc0::f:fb0f2d:5.86.410.79]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[d01:2:564:90904bdc:4e5:3d9:c989.4.6.893]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[1:c1006ab5:b04a:912852b::2.73.85.64]/") !=
  null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[ed68e573:a:dfd::94:34d63a7:096.5.5.4]/")!=
  null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[6ec3400c6b7f9b4b38921b:44ebb:bc8fcb4329.473.293.754]/"
) != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[1f::d4:f7161c71fc:9e468c746:fd9390.9.60.04]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[ad9e9060.809.47.389]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[:dc::e3796d:0::444814ca8f:bb::434.319.34.9]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[bb7ee:c8a703f61:01:4970.30.47.3]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[d2480.9.183.78]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[2:4f43d7a56.590.853.80]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[d60::450.852.2.08]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[:807d0f:40:69.12.5.62]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[1f:d59815.650.72.30]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[:::8:04b80:8cebacef1d:395b5f0272.97.63.96]/"
) != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[98c:66fb0250ce8dd07::3b8:e79ad747:ba0144.507.213.2]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[8ed:c95af1::4731:cb577.22.03.627]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[84ac9cb1:e8:c:7d13962.18.1.57]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[871e::13a:6.23.85.96]/") == null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[5fe2:db1cfc21e815ac5d7f0:6e39:74f:c::e1518.8.40.962]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[:9b036:37:5a3:d5e:59::23.0.3.1]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[dda:::1:5.733.41.216]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[8:38d:663bf:e40:7.2.22.6]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[5:437cb49:242ca52463.71.4.2]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[:f:1:b:b:99a6e5.17.8.033]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[75:9896:b1:564::02e38b59.5.130.488]/") !=
  null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[5::1fa:825:62.9.0.39]/") == null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[c4da:3d914a3fcfc24b:608:80d399.3.3.888]/")!=
  null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[bb66b:2:8334.7.376.4]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[e::09038:90fc222c79.813.917.4]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[d1ae:8:::6aad270.09.57.32]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[::47:58:4a::2::33620f2cb3395d181a2187.3.48.449]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[d9264a:d3:d22:4:ad3677.5.901.80]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[:2bb7bb::dde:2871.534.46.61]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[d2be:2:ed::a::5:5f38f0::2811930582.129.240.364]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[:67d:249.492.121.26]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[e19cee8:b:5e0418f83b9eb64.72.4.55]/") !=
  null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[e1cd::177:b7ea21981.713.2.802]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[310529f76:5b7:c72:9::e30bcbc:0492.9.146.7]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[6:dd8:7d1cb4c3:4b0a:e4a41:58:794.2.814.2]/"
) != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[82:0d::b3abcc1500c09e8f:e85d93822.00.219.68]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[c206209.85.655.85]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[:ffc0:d7911c11504aa:ab8b195:5:a5240292.247.843.39]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[::85.12.30.78]/") == null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[f0ad5a2b04c2:e2::2:3a94bd71c530:fffd636.7.054.4]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[a738.07.87.461]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[:b78f93:941c13b2349.7.741.5]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[87:e90:4:97:5896e1ec01:f:d062.3.657.4]/")!=
  null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[e:76a606205b8:b5:fc2b26708.804.732.44]/")!=
  null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[3e19:046:05::139.7.0.76]/") == null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[e49:b6:eb2f9b0bfd49.97.144.5]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[5f3.6.22.2]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[032::639afef0a1378:29b:b7cb8a:973.824.985.05]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[6:90.206.09.427]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[:b:0:3aba:0657315f6:16f:a:66f488.6.784.622]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[:f:dc58e::b9.9.302.50]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[0f:2ff:12:81::41.8.6.17]/") == null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[27:::9f9edb:::8f448415.883.5.9]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[d25:2:a::80e7:27.13.92.8]/") == null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[:a0fe3f7:8319d::78508b::c054.63.56.7]/")!=
  null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[6386b722.1.6.6]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[156042dd:887000:2c03737eff2dd:7385.5.80.103]/"
) != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[d0:0c:f594:5:::5f817:500::fa56320961.3.688.82]/"
) != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[3f:682f144:d9:b497b::7b512a:e:f08bd6161.394.01.5]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[:d:0c6fb:5f04.489.74.2]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[6851a95c494:be:b:d5b74::487:5a8:08380.4.041.69]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[71d47f8c2e6d8039.0.4.3]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[38.30.2.5]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[6:0a::e::98b0.2.4.831]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[0:7a1:f2::0.2.2.76]/") == null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[15c4a::f6726028::7:a9802.767.94.915]/") !=
  null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[:c2d0724d:ae06661ba0:e7894.51.4.19]/") !=
  null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[377848574:fb0:514:47:95dc:4c7:::4.7.14.3]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[34b:c:648b72.8.6.8]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[e8a::73.17.43.172]/") == null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[:8ba078cf:b:e52:1640fb9:c88bad8250f801.0.576.881]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[f24.789.629.921]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[b:98a78132:6:4684:a5:49af4:e28ad43e305.659.06.3]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[edaf66:3dc:6:4e0::3:b:d:d75.5.22.87]/") !=
  null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[b5::243.9.10.7]/") == null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[:9:f2:1465:8cff8320:47:2956:a::7b:70.06.13.79]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[1:43b64c:1:e:5ebddaf1abe9f029.528.61.5]/")!=
  null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[82:19:907c1c:f877.39.855.536]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[f6c::15.37.52.33]/") == null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[87:c939::81e:75.1.8.78]/") == null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[fd2:0c1.39.5.8]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[2:7::204.9.1.3]/") == null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[:e:590a449fe90::3:3068f397.757.8.996]/")!=
  null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[51e7c:::2fa:cafd1:3:4aa510::4::231a:69d16.06.40.310]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[f736fc:5::c:d85c76808.275.284.921]/") !=
  null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[11b912f94e5fe:d37728f59:a9e812a0:93.675.721.859]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[4858.4.042.1]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[af01747:1::81.4.1.1]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[0::77.127.253.54]/") == null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[:29ab7:31021f6aa337d9821d834.08.59.8]/")!=
  null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[::4.5.11.62]/") == null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[:38.1.84.88]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[2d84b::638.99.909.811]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[7cca93:::6:6e07b77dbd:b988a9196404.8.87.142]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[:92c031c27f7d75daf::05.23.136.3]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[3ed::49faf::df308c9:4e::0:c::fa:3802:97.7.99.17]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[::3:e35:22:6eae:62.105.8.8]/") == null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[e2:ef:05a:be::d1:f98::acf:2ce31:3:39a0791.5.54.5]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[:e73:09f:871efd3e8ac:4d78.02.603.8]/") !=
  null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[e11:8::4::86.128.799.136]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[35c73be11c00:cbead3:07d6e::9da778d:9ee8264.673.9.19]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[a:::62f:35.98.815.22]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[d9c:236.5.985.11]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[dd7:f0e32:75:8648de4984.82.848.0]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[17b:a04:7:0d0367:1bc:bf5339:636f8::352.89.0.838]/"
) != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[62da275a0c:8d1:8:d2c:7f8:73fe9afdaf69.4.43.7]/"
) != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[:9f4207fc67a23674d6c4256435836:132a:0.48.997.51]/"
) != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[5a4cb370577d7:2::b38db::399bd:10aa07:733.5.43.46]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[2816.866.101.46]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[d9::b13:0f6::148b5:8000:93a3b::a:bb47.68.5.2]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[:bc8f9689a:a80a0:798e1:698056.619.0.11]/")!=
  null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[:4dc683.05.47.09]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[ed2:3::::8fc1871181:792:a:76a86:e9:f57:707.87.473.0]/"
) != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[:27c955::5b7:67:bb0a:e9bd6c788.16.129.074]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[4df7abc:3711.8.5.3]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[b57273.13.888.110]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[:a11:a7b:a5127c16::0b:0c1b72a929e1:fe2.543.682.9]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[28:::e7:3e92:51.3.6.3]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[16:2:7c5::5.96.65.77]/") == null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[7b:9a85:1c7c::b4d581:::39183.49.7.169]/")!=
  null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[1e65e41386ba:ae4c9ec:e:94b:e::884.45.5.8]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[71eb:6200::2:5b1:139.2.52.58]/") == null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[364::145.9.160.6]/") == null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[7:::0:f6968b2748e0:4e59.08.27.716]/") !=
  null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[703::67.2.32.6]/") == null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[0d312273::0d2c:6e5::260.489.0.821]/") !=
  null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[::7::e33ef14f::0f797.612.49.88]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[6ed8d0f53078771.124.78.1]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[9:e9:2f2:a06fb1:a7b:184ac209.894.90.45]/")!=
  null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[99912::6851:9:7550:c2:6:984ef35fe410.008.7.68]/"
) != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[:3ff1d:a8ff0276:4f:5886::17047:3a67:108.906.5.26]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[4::e981:dee5:8.2.57.0]/") == null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[4:8:df286:8813.154.11.63]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[88f505e8:5bb:1346d07:ad2b:abf:21.23.34.4]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[d7d:2:549dd5:e1a347f:d5dce:d:7e:9.9.77.8]/"
) != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[ec10:8581:e7899::9bc0:90:251ed7cbdce08.89.182.28]/"
) != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[754e1f989df95d86e8:9:4a40f06cfe2.52.88.32]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[93d3d8b31:a286.9.5.19]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[d:104fd7::02:08:8832f7444f5e8dab:03.01.306.667]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[155826747f9258e20.401.757.08]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[c::674.90.5.4]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[500fba7::26:23::45:ce::0f5aa3f64729f693.10.17.7]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[97b5::40.5.16.8]/") == null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[3dbbb87dd:c82b:::a7680bab906:4:f12.12.66.2]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[19a96:6f35:852aa80eee32.68.489.6]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[::1:92:9262ec26:55.352.04.41]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[:f:3b:4.946.88.1]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[d5f8e8f149cef11:b21c088:2ea1d:b148.205.649.3]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[968f::32.24.138.4]/") == null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[55:18b989.6.610.13]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[07195bb:020:d:a9:dfc99f3:8:ea3381.1.3.131]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[6:0c:923c:1::7e3403.70.8.94]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[:4:e14617::6d2.700.4.100]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[1:682:4234.0.08.0]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[7:e8f7:d72319:::466.5.63.1]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[d4807:91a581:f350f::69722752:23a2:0a:8e45.12.2.9]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[53::::9d:3:a::9993.318.49.1]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[435430.8.624.55]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[fdb8cd:a9:6940f:7363421:b29:40611.67.81.4]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[efe2eafa6d46d:367.068.474.044]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[:c12a3b99.240.297.6]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[:ad7:30a:c6d8:3cf927.40.39.496]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[aa33:3:796987:7413a298:0:85.211.34.50]/")!=
  null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[1:66:4e:8cd4f9337d082.57.85.554]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[1ffe059d33.67.904.85]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[5:::66a6cb922:c3.76.71.75]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[24b2de92:71:2e::1cc7200:dcaa6888:200127.406.800.62]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[d6aeef28b822732.584.724.513]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[96c05894efa1:c755475.231.73.09]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[:ace9:c81c77cc:b27:11:6cb4d6d350bb937:d:046.51.8.88]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[6:e0aa::7a:c52.945.296.28]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[8:fd18:fcf:9:2ba::c:ae:03d::681c50.3.3.07]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[95850.36.791.91]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[749fa0ac5cfa:46e579.94.1.81]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[9138.557.88.0]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[::c1c23.5.12.625]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[de43:e:288.059.8.194]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[5233c::2a:c35c:ccfff35::f3eb85:575775.64.58.530]/"
) != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[15::23f1efa2fc01cb60a7bf:40511c4d28:e:2434.02.0.1]/"
) != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[56eff82::073:b:9:165:87:3d1:aa39c98.23.2.146]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[1:5:9:a::46.9.3.8]/") == null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[071512c:e3:53c:d928d:7.4.857.84]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[02:2:9a148.7.975.16]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[0a7:7:28a8709d:7a864:36514f48:1844:8:6.032.771.6]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[539a:4772:96d62.4.163.2]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[41:7:b:e858:f:43:91.12.5.6]/") == null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[498:d:4::23.0.8.63]/") == null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[f03:28d52:c:b508:86:ce654:03.0.281.31]/")!=
  null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[:6:fb685.832.8.388]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[6bf0:238544.062.97.578]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[:6eac91:e4::65ce:01:0:8.58.672.54]/") !=
  null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[81d52650:52baadb:4:18c:0.3.9.4]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[:::c9e8:2:3f3.13.35.023]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[:05:f:0:83bc959fae3406515e559c446.6.3.0]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[d03:fef:c:8:15081b163:01ee8265.91.62.774]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[7:1f::27.6.8.6]/") == null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[713b14:d4e:4::b57.4.9.092]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[96762c2ea:47:2a77f0a9:a05:97e28.881.314.49]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[cc72d44.604.87.8]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[:215791b60.734.5.315]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[a3::bcf2f1b25:45:565f::259:92:0d105586.6.825.1]/"
) != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[589ac577b:1a07bc73e7:7a:::a0aecd330af:c3.76.48.06]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[:367.132.79.97]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[24d:2925cc5:cdd731:fc6ad961224246.915.399.5]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[9:6c9:9d8c666.351.725.6]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[6200861bd6:f173:4751.8.219.6]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[:b:c87:71d71:7570:d:289:8:26877876.2.11.9]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[22044.861.393.0]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[ea:6d::e8f2:b31:76400db4b0:8c97:6ab447.215.506.79]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[35f3b85e::b5fd0:1c9ce210:0e:4.730.7.765]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[c2b:2ca7d8aa17c:1:3.57.31.6]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[6e1e3:589e796635e0d4c6::d73:97b1:e:7.03.599.5]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[ca::e:::9415363:c20d4f32:2.50.6.123]/") !=
  null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[d9e8::68.6.8.76]/") == null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[e0e3:2a34408.41.802.8]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[:e925298b32:8:0d6d9f646acea::b82:c:32826.989.1.916]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[0a9:5:5bbdeb203.12.91.12]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[ab685::5c33f359f:136800.978.6.178]/") !=
  null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[47a5::4.71.0.7]/") == null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[77:3f::423b2cb17052.1.8.1]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[005c20:8bc09:7a4264::b2::987c:6:f01b:800.03.983.3]/"
) != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[012c:9e8082f7:08102efec74e4822c42e390.576.39.1]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[d49cce51dc90f6327:23::5ff:a252.65.83.4]/")!=
  null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[:a16:8c5316:029:3:5c:a:c:ce20a89d8f75589615.6.719.865]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[2254.8.8.523]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[55.3.6.633]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[eb2666:02a:e:b:110c3b:6f0cc059.6.426.0]/")!=
  null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[aa399c1be:6971c27e:94615.091.49.6]/") !=
  null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[ddc2f29622.8.553.9]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[74b:8f900ba8:9f6512:633667496.783.5.96]/")!=
  null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[5:cf:7004:0e:fb4e:8:55.47.83.1]/") == null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[::52.6.95.214]/") == null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[::9b8:43.26.0.4]/") == null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[:2ec2615:35:3c705c118:::51918f:41bb6d11a973.222.21.546]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[4d81b:e97e50.6.7.95]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[950:8a3e4:6a5032a::1c::0aed1ef9:2f08cd49.656.526.432]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[d0f:02772:e0ccc:a:99ac4:78.929.933.781]/")!=
  null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[:647eaa:::6056.977.5.1]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[79bc786d6:33:bf:9d:8:a:3ef1d7:f458.3.278.4]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[1c::9b025080e8acf8:d4.363.449.4]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[8e:::::fd06567.06.955.20]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[0f:8436682:b61f31:::32e6.8.375.4]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[553acdd543974399fe:6a1bc4a89c482.926.765.20]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[9f:a7e::440b0388271.225.2.64]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[9:d3:c:eb0f:b66e:f4b9:35.6.4.5]/") == null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[5650e776ea937c:ab381833be8:4f6189.70.271.455]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[:3182a2357762f:de90b:::dc5638e39.71.4.62]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[09c68f7:97:9.6.391.59]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[61::7fb:0013:06:a:8.33.8.2]/") == null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[794:d2:1b9e0:87.15.253.85]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[:8:4816.212.739.145]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[63f6.14.660.16]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[::6d6:2.7.99.28]/") == null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[:65940dc40c37.9.82.49]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[5a2c:a066e:d:529.496.26.2]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[0477c5970c2.611.1.36]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[4:7b:de:158497e246efcaf838158.74.5.859]/")!=
  null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[b8d886:60b9.37.42.92]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[a12::9b36:c:3267d::b:a:2f49883.1.80.4]/")!=
  null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[0f:aee:617c95eeb028b1:c:7621:03.343.3.10]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[:bad4:ecdad2ffe9:af3d06.981.57.9]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[d48827032b08ee5.2.199.5]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[e88c2a6fa4764a716::2:eb5649d0346.956.4.041]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[4:43a30:295b11cf4b3.23.09.26]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[e:1:866b::::d5cfe94d3:ef6:6bc23fdf08262.882.231.7]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[0:c5dea76d7c33:ff53:184.17.5.6]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[e:b751c:9:500:d::4::0d:12:f::3113.499.09.00]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[6::437b5.386.507.321]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[b73dc::::8486d:7:1::8ecf73f899.75.60.279]/"
) != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[2a72::e5:4493:9:f7bb4::40d:4dc010.0.2.015]/"
) != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[64348:e6a9fd6201cd1:2ab::7b:bbb25:884d:d934.700.997.3]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[4:ef52c18f:6:0536d3403f:a4858.1.99.7]/")!=
  null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[:fbe79e041eec9f0471:856:4e8199.7.41.82]/")!=
  null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[0:4656d95:768f::535b412.70.0.886]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[:75efbfb928c:a90e2::5a:1::558.687.07.58]/"
) != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[:1:abb5b5e::e244:f35a78:b3aa22::6e7e1c0823.3.855.873]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[b7cecb4fe2:6e024c08ee77:22.86.7.128]/") !=
  null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[12:c1::014::9:44:1e050.0.6.353]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[1:e884ba::a20aff:d2d19.2.130.854]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[498c5:3:ea2:5848:a:7cd5::e:af::03.825.688.9]/"
) != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[0:176d60fdb9::b5d5::2::48d1016:7a:178.0.318.13]/"
) != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[52059:fc95b6::900e:374:417:ccf34e162f36.713.0.56]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[0:1::5.4.4.30]/") == null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[0:978.36.2.2]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[4:b3:34af9580bd:5966.7.71.522]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[bcdd933d66:aeed33d:99d:316.1.4.73]/") !=
  null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[::e2:b52:153:94.79.13.75]/") == null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[ed:f2085f29475.8.21.194]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[a:0a9:f5:17:5f:4:9aa32ec:1e1:da8f:054:e:74.153.569.764]/"
) != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[e4e35:ff3c4:a:f:7be41:0ed15bdaf5cc55.12.639.537]/"
) != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[:4ff90efe679:8ed7d95d3b094fd2:a756:5::::05.454.4.635]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[13.23.89.3]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[:9b011ac:299829.773.6.6]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[178:14::2:b7802818:5:0b:5a480d0b185.32.4.8]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[:1275:c94.171.226.223]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[b:58cc7d4252e8:a4:2f1cf5:de153d8d::a:1.006.101.70]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[a:bb07:8b8:6d:84.1.339.1]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[f::b37:4.5.8.65]/") == null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[9c25a553a76117e:e:31.9.527.4]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[a::649f79::70e36794.300.40.9]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[:6477b:13bb91cfec894.9.87.9]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[:1d55:18.44.383.7]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[10:ada5b3eee02.6.73.55]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[b9517.460.0.9]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[261db20:e::e03:a:968561::36.378.78.2]/")!=
  null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[09f:45::31:6.86.4.8]/") == null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[:3::7c7:9.88.75.3]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[9::e66d:81.3.3.76]/") == null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[:e9327.87.9.7]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[71b6f317e:b5.235.88.28]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[8:d::8.0.6.27]/") == null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[02002b9:4:047:edb38e:8:be:0.4.9.110]/") !=
  null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[a314ee1991.765.897.081]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[e8::0945d087.14.500.573]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[c:255:01:232b:710.54.701.16]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[dce7a0f16f4e:b925f80b:8:746.66.036.51]/")!=
  null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[58b86:bba01b6d9799.46.5.1]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[5f6c:4c49e::4:81a6f06e:260.911.26.471]/")!=
  null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[7cf0e9::de::e:1d64865d320.7.69.5]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[97d00a92:8e8d0bb5f2fe6cdc7300f191b4b:50.02.152.108]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[53bc:612::08.3.0.135]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[4:f0::7.3.1.82]/") == null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[7d20cf:1c:b6f4133::31b:::13:a0f:26b2:238.775.6.3]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[e4:d824674:d2:aa3:1105.4.2.8]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[4ce514:::374:9:fdb:2:9bc5.78.13.16]/") !=
  null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[04db::9:f:f2:9c:c026.088.646.652]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[46:4a8:dab3:8f:f43:3:46.7.5.4]/") == null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[c:1:cb5:a9c:2ca189a5:::cff:f:e6b:3ba34b574.6.8.1]/"
) != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[f::547a2:7b27940:9c32:e37d99a15:d12.048.5.1]/"
) != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[0b6::6f12804090ac7:3b9126:74:e37a79:1c:6.4.0.25]/"
) != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[:144:f3:9108f409cc474600aa05069ce875.6.23.370]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[:47463fe24c5:::1e4:06b:0.3.8.547]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[1610b53bce:3a92:06.504.7.949]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[c04.0.502.2]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[:1704e79d:8d5d58214.5.99.1]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[2:405.483.0.9]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[0e29f72:955.13.1.32]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[ac:e:3:3f8:71d6fec2:::e54:a90.89.28.1]/")!=
  null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[b8da::56.7.93.86]/") == null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[b:de:a9f:9867:19:751c:d::5134322.36.813.8]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[:6a:f23:147dbb:7:c01:912.1.52.005]/") !=
  null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[5b71::168db71f83:bd7a:313a:8:fbc6.84.041.8]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[::b22.80.1.13]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[31:1e0e::2.1.49.26]/") == null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[2196939.8.09.6]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[4c680fa330b7373.82.62.04]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[f:ff04ea:d084.831.481.53]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[f8:1:8::423:a1de767b7e7:194a727.360.898.32]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[8c::7.71.8.56]/") == null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[:2bc:0::97:daa3:e1f74ea:d87b20:5:c98.79.9.9]/"
) != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[daa0d:9::7:3cd887f70c4743::ebb:611.66.90.064]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[0:20d6:30f492:d7134.7.55.41]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[2::8.5.50.6]/") == null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[::c:37.6.3.0]/") == null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[aed739.94.29.585]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[1995610aa6f:09:96.53.7.114]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[f8f3640d:e1e91b9:88:910018.39.96.1]/") !=
  null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[56c0:f::9:6866:5c:1.214.9.42]/") == null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[0c::151.79.0.9]/") == null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[1:f6::a5ccff:9:5:6ae:e36.0.559.7]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[403:f::5.7.5.97]/") == null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[2e:9cfa6bbeb7a3d::d::d:d5c:c4f:d506.645.9.234]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[0:8a3356.95.365.22]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[:6:c229900f:9daab06623a4336ec5b:fb:5.110.109.78]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[2309ece6e2:ff:5e7:822:c0::633:e3.39.7.5]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[b:89:d01a450553.704.95.552]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[c7ee2826757:5c9bce1a1c5e:774.26.3.01]/")!=
  null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[5:18be:f4f:6:4b301.890.375.41]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[d65fa3276:1:fc:5517.9.2.196]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[5:39:32:2dab6:510d4a936.653.26.62]/") !=
  null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[2541:b:9:b5:::8c:e999.031.728.82]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[5f980:fc:89:e0:f1500b::4:4.91.205.6]/") !=
  null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[70823d60cf:17c9e59854.1.9.94]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[ec:82:ff4c:d56::7.24.1.7]/") == null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[:c9ae5942.63.055.033]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[db214d68d8e0dda86:e0b1:2eadab5f1bf0.572.5.8]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[6c5fee5:a8ea3a:38.21.050.689]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[::1d0fb:0396.79.7.0]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[:80d:dd445.03.264.21]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[f4d35:84:463.45.683.262]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[b08.791.9.513]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[78:521.0.3.7]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[78442b:6d7b:bc:64.672.0.9]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[0c495cd93c2ff310:7cc8.0.8.428]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[8b:7:a6331.0.82.988]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[90a:0:238cac51c4de11.849.427.90]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[4a:031f0:6273:2cc948:66cd0d76031928.3.071.26]/"
) != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[:7a45:ff3:5:13::28dfddea41:f0:84182.189.88.630]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[7::5.960.959.8]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[b:a::c5b6f055528ce18a1:32025:49a:fd68.081.307.51]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[90a66.818.3.92]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[9650ce4:07:ee41b7:77d8b:8:16a:e:e:d683.7.06.759]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[af0a::05f:3::9792.851.3.413]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[3a7cf08960.743.505.94]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[0d:7e:95:56.958.332.6]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[951569.50.276.0]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[5:650a:a:6:d::7.3.5.9]/") == null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[557.518.87.3]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[c:7e2.61.093.855]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[6b0:9ac:2a29a2:7:4aab1b217::38e48.334.1.40]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[ee786d7d02fd5348.500.321.74]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[3a:fd:eda2b147451d:7420e8.7.7.01]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[fda:5:a9d7f927:ce6::e4:6:91a:20e4.560.03.263]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[c3:b3::1658149c5a9c60.11.217.8]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[03:3a2:e143c30f3:92bafe68f8:3:113fb709.41.191.71]/"
) != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[2e:bcaf0be44:0a0::::aca197bd76c:d57.112.347.8]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[::4.91.95.24]/") == null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[c6617:1803.25.929.6]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[2d1a8a254d:a083e98087:b037837cd9c894.6.99.22]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[a57c865c9:3b::3c8.3.587.1]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[::040ba7d:f:7d6::b8d516.4.746.2]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[bd4f:82b::5:20.15.1.2]/") == null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[:df:e04:d0066:de:2248.662.4.5]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[d::fb:da:bb:2b:206.2.4.215]/") == null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[d118:e92c2558f234.4.73.7]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[eb8b::1.40.7.1]/") == null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[:3::5c27d14e:78.04.4.724]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[569ba7:1c::7562dec::79.2.50.79]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[053.9.5.182]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[:ec:74::e43516083:214:a79c9cdb95b69:38.066.372.3]/"
) != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[160001f:4f33:e:0c27e:db3::0570bd:5d:6101.85.29.7]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[4::e65:e3::2ccfa40775.5.4.961]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[ee7eb:b63.365.7.3]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[21::b:60.19.5.49]/") == null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[:0959:bc5d4b885:a39::7:9475b14:426:a534.9.074.35]/"
) != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[:a865:32:1e8f:4d0a::782ad:8b:cb078104.582.6.7]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[6:a33d:9ff:2f04f84419ceb816.9.195.94]/")!=
  null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[07:1e71253:1707.2.7.519]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[:7:5111a5f1:60:b:49fadb2:779f3edcfef693.60.762.56]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[f87:afd6c04:1b47:7c8514:8408e340.49.8.92]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[::6.8.193.4]/") == null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[::c:4:b54:2714:2.0.45.9]/") == null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[8b:c093c2:34:fe13c13472:6:2bc408dc5:1fc205.539.2.8]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[3456e:14:b:1e:53:59:c251:6.851.8.04]/") !=
  null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[b3a:06:34d79f2068.28.277.7]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[9b:d187f:4.226.256.21]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[2678abd2:c0252aecc0d7910552.4.649.3]/") !=
  null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[2::2:cd60:3:aa30:c02d8e08:79.4.2.5]/") !=
  null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[bb3bd8dcda4cab8e:f186:4:7::daf132.4.60.23]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[:6a::4a322fe00d862.4.364.9]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[dd013c426ec19.66.435.5]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[95acf9::e80::efca:2e4::f1114.483.31.53]/")!=
  null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[a:::2::087:7:778:10:00a63d05.22.95.7]/")!=
  null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[bf4:b9:5f3c3aeece::b31c721b87.05.5.419]/")!=
  null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[3:5b236ee2449:::a07:21e4bc21.51.342.00]/")!=
  null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[4f5:ab:18:8:06d2b:69.22.86.99]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[020a2187:926:d510.2.01.32]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[386::37fa3.125.2.07]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[9c94:76.16.2.73]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[80e4ee:3b0:1:444:5e:5029.516.37.3]/") !=
  null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[c:ac7a000af3cf6e:c8e421a:6c7d252f:d301.120.987.539]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[1b8dff9800.964.6.71]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[1a3e9:48c7f84594::1d:16.9.1.0]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[db5704.07.725.128]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[48d6::9c0:7956dd22429:652.681.00.52]/") !=
  null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[89:94:::82:d:::b:bf548.163.82.221]/") !=
  null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[57:b63:604c089.22.9.50]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[bedb:a::f3:6:da42:47.3.93.1]/") == null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[:::b348.088.888.00]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[2963a::c:0f128c:ec700.6.7.09]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[5::2.19.70.75]/") == null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[8:e::55cfb7e:945.025.0.04]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[7e8:2:4d42a:ec:72:30dc2e:810f928.166.47.138]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[:9ee378955a64adf:3884.18.43.985]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[3::5.96.5.81]/") == null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[2:671f:4e:2:f5a::9975.07.158.477]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[fb2a656:595:9e322.80.21.929]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[:::768205.3.43.3]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[:f:0eff::a0:ab5ac:4e032.213.4.52]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[528b35f:bab:a894fda1a60.6.223.6]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[262:679e07fa4ef360:a5ea559.13.2.2]/") !=
  null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[3::3:5cd2:20.66.9.1]/") == null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[dbe412ccbf::0:11d034d8d097:9519.2.378.1]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[fc::5:e:d033b8:07.378.5.27]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[af:ec:85ee90:cc1:9::::17b4ce63.940.0.83]/"
) != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[e7e12841:afa:60df3402:cc:ad:d700ff:761.49.211.72]/"
) != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[::591530b:e:0d:dcaddfbb75d34c9f0d:a168e635.063.3.21]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[f77a:9:196.164.378.2]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[a9:a68:6:95c3:495:018:71b:12::18a6f:96.815.5.686]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[:f:37.371.56.6]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[738e187::086.6.2.55]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[:96::979.5.12.1]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[89829e:f0bcd888a:ee7:83:60:e1.05.530.45]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[10a53.769.7.80]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[7f8:daa9cffb262::9.0.407.13]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[9:7::66:8.2.26.37]/") == null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[:c1.9.264.7]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[:f:b841:6cac34:5::bb08ce2.729.1.81]/") !=
  null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[2f50f:1bcf3ac:911.2.81.90]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[494.668.590.25]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[9:0e:::3dd0::6e:1c567.695.93.925]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[08b4574:07a14d:4c:18:3bfc1344.30.704.309]/"
) != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[4:0de:d14:e::2400:04:6:c38b80:7926874.28.993.1]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[0:e52d:88d6:c3.131.44.842]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[f:0e52af4c6df1.6.44.9]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[58f2::7.4.5.8]/") == null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[8:0bf7c66:010:6:2:552347.0.91.5]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[1af2f65334.5.62.3]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[da3c4a56::756659d1298:988.422.6.333]/") !=
  null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[:e:b467.02.558.7]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[318b6::51c409.0.7.71]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[bb2d:0ce340.7.442.6]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[:19.0.640.67]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[b1b5::68.99.48.61]/") == null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[7:d:d4:fc::09ac:5d2af1c3:ae:9edf6:5c3.714.9.8]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[:8f:b6:bf3:b2961e:::1b3794.16.1.548]/") !=
  null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[4a:2276681df8b08:5cee4c12d:ae::110f4370.2.26.876]/"
) != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[:8:5:93d9d::42:d9989:11:5d97:cfa229f:07a57.41.476.54]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[72d:0.32.342.1]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[bed75:::f:6::2f:cc2.0.11.59]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[:4cb:f51e::3a51c8:4:::f96b22.978.5.76]/")!=
  null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[a8868:d95e:2d4653:d1f4500.0.24.04]/") !=
  null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[:b246::4:1:db2e40007f0:e8927.482.953.798]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[2eb48006.27.228.75]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[91:5:6e0:d5::e:3.5.81.94]/") == null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[:::6:63e:076e31770982:538332f118a:2166fd4.9.7.2]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[50830.9.591.44]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[d7::5.90.48.38]/") == null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[157a::23.95.6.18]/") == null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[1ee9f0a:05b02:::a::b479c151.54.8.2]/") !=
  null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[412:4:777679.146.0.542]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[f0:a:4:fe4.6.598.8]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[f:0ee::1:d:d4b:5.10.7.4]/") == null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[0c4::05:bb::::18:7f:::56:b12.97.659.38]/")!=
  null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[7f:a9a:fa:b3552::f:c2:2d000.738.230.4]/")!=
  null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[2::9.2.2.3]/") == null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[:7:3:750.01.8.9]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[a:47137b16ef0989:6e7b2c5:324:9:2a0cf::0568.99.1.085]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[6e0d021c28991659.07.28.09]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[da0b:b::c:56d9:::11:a44802:6.6.2.897]/")!=
  null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[877e:b:9d285fe:b:5b38:e73:8:8abdf5e8d:21.763.1.6]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[85418.179.8.0]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[:1e65d:c8c83:f:435c41:050d37:8ceda4cc2:6571.42.5.25]/"
) != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[:0641e::28:efc5:09ded::cb:02:397453.7.63.09]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[e34797d0dbaa:d:0aa29:bc566b50.985.1.932]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[8b::b6d2:dd12:cdf7835c3.97.6.4]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[5:::415:1486:ca:0c366::6314.507.2.53]/")!=
  null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[dd2:a164b9777::d360.196.85.33]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[6ca8e16:3:6ead::efe:::63a74844674829767.55.1.213]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[7::2:f6dc:6f8bb898:0f:72a4e83.137.9.1]/")!=
  null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[:c:02fe7:0:e8506:111::e:e:77b:c0:::091.55.916.07]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[:13d0940.25.697.51]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[:6.00.7.52]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[:4:9:244f:c78ef1e8f87468::b:5:::f4:8:85.36.540.51]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[e3e31.321.75.508]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[546:bc0b6:be6:3884:bfbe45e:2854c514431.51.406.9]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[ef4:37f8:e::1681:9.0.5.80]/") == null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[420846.64.65.051]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[3:5f8::9a2677.34.935.21]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[3:b3d:a20.0.965.8]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[f:3ebccaedc757652.3.61.534]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[4b::c:ef3bad9aa523.3.546.859]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[e4e:242a8:856ea0:7d43654.4.5.419]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[8c:f3::f:f:07886ef:::c3ba:e:720032.0.792.64]/"
) != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[:0e46b51de6d:1::0708::1f64b9a4:bc33584.17.4.93]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[163:090e971042.413.551.219]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[98d5b23739d:905.417.84.6]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[17edf96c1e2::ba3f9.136.7.1]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[29:fadef4f363e171abe82e:913:0011c:42b8.718.50.36]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[0:004a2a4b:25dac::5cb062.8.7.75]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[:2402.31.569.279]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[a07d803045c8aa3657a:4b:e836.0.95.87]/") !=
  null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[::::c:44416.527.62.719]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[07:7c57:daa:f6f2:8f:1:72.3.19.232]/") ==
  null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[5:1be:4472.90.112.6]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[2:e251c:a747c:90cf:1:3a:3f789:0a5:1:3:9950.23.77.491]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[56:77f4:ae66:9:8:1::b255.61.89.73]/") !=
  null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[:f72b03:274a0f11c7:f0181461bad:cf5.183.409.869]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[c49:c357fc733.46.8.2]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[f:f:8b::847:91.136.30.2]/") == null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[0:d6:39ab:a:534.163.951.754]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[0d::5d8736.84.95.358]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[:2::065.342.269.857]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[04::0:2.3.30.12]/") == null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[::2fa3:55.40.34.74]/") == null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[e669464cc:2e5d59c95e:0.487.918.833]/") !=
  null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[76:89:c9::1:120.2.69.0]/") == null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[adf:cf97:368d:cc47cd30:120:d:95652.859.503.97]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[c3da65:c0:9a:8810508.52.9.419]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[:::f:01:c2b00dc:96.5.9.199]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[7f:::c2e39079d3c33:6b46dcbdf1:4e94:8.565.5.271]/"
) != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[:3a:7246::::0e:::0688a5229:67ffc7.42.19.358]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[fcd:af642:16e:e9f62:8c46:dc0.1.16.82]/")!=
  null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[d83df015.25.5.061]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[50::5012:68.5.194.23]/") == null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[a9285dc3f50dad:27b06c:a19cc79.652.15.37]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[2:5a99bc::883b115::738.196.39.7]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[:a7d:f102:342.01.162.559]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[3bba4.7.915.84]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[:85cbfc:::957f0bc46:3cf837.93.999.73]/")!=
  null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[95568fc41fbc3::a0073af7c68:9::8a:89455.96.90.855]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[535708e798365:0e29ab:532028438.28.3.1]/")!=
  null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[8ac706.085.12.70]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[a7f68f241e:1:62c1::2e35b:1a9.314.03.0]/")!=
  null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[68::38a:5:23a:1706bf26.63.441.49]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[319b28750d:b616:86feb8f0:c7d:60:b59.153.078.43]/"
) != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[f::ea8d:bd:b:f:2ba:e14e087:f1:a79.2.98.416]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[21fe4fed7.77.20.478]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[07536:efc:0a6e34d:ff8::470:c::848324:7e:7.5.86.80]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[4:6448.77.24.1]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[09703edb2cf0d70c2:b:6bb8:aaced4df:987.359.95.315]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[2f93b7b:0fcbd7c74ef27f8d60b88:4.726.1.62]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[90:8c1:2c10949:6459::35f:050.90.219.70]/")!=
  null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[e::e:0fb5bf14:fa6ac6d9:d7fabc:706486.78.6.464]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[f741:46:6:71a:5d984.507.7.76]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[41cdd:702749c:6:6ae37271:a7:ae2:b605.167.924.2]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[54d:5eb95:ece3413::0:bc6714.692.5.70]/")!=
  null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[1681795c34:8:5f3006.24.4.7]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[29f873f:ca6:643.68.48.21]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[3c:2::99dd:15.22.40.52]/") == null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[79:55:05:32db:188::21.98.4.2]/") == null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[8d931011.173.16.695]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[a9f8d25d582.125.693.777]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[e3:92a:::90d:d084:fd3:a8:b0f9:4:1252.188.87.069]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[9dc3.4.591.2]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[16ca:044f806:b814cf2:3450661f8cedd19:160.829.9.781]/"
) != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[:64d6b981aefd93ee5f210810cd254453.682.0.964]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[21:d58b54a1c3d9:9ae::5.358.58.9]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[cba7c4:a25e:ea6a9f9:4e5::87.2.4.01]/") !=
  null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[453b40f:973:fa:5ee1:e8bbbbb:d::ba8::0325.018.30.2]/"
) != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[:::4e67e9ba:fc:114c:e0b:fd9d6c:dc987.903.20.639]/"
) != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[:3c62:6:8e:9b331bf1:ed2:8e0d:c83.9.55.289]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[fa96a6:d870f820.090.40.126]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[768d:3cada5dbda:87:9a11a0d7.509.88.1]/")!=
  null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[::8e16.026.671.1]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[3b40:1a3:bd228:367ef983f307.318.777.84]/")!=
  null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[0a789.76.1.994]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[4::0.73.30.7]/") == null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[:2a::927.68.41.91]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[42468.4.2.6]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[ea5:::04c:680a0d0d690c:173:b73.68.849.9]/"
) != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[69661e53fcce:f:f9f81d343:::a567::a557e20.3.946.547]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[d9c:f8ebdbc4:2f7d7daba209.35.1.31]/") !=
  null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[69d93b9:e12:4a6:f2bf:83.3.50.8]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[:8ba:47feef875ecb12d9:ebec1057580d24ee03.2.5.981]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[db4:1904::caf9:50:a:9.71.2.66]/") == null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[6166a:acb361b142:95d4:55:::68da037:372.71.44.312]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[09:a7f2fb:4b:8482f842:6:3f1:b05.167.5.9]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[2e00.25.543.045]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[:ba43f0:a:4:2:59:0:04bfac:da:::bb4879.48.49.79]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[f:5d:20b37.5.665.7]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[d:2b:5f1668.5.4.38]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[40cc:59:309:8::f:76e593::6fc0a585:2942f8.9.69.003]/"
) != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[8b:9eb187be1:02cd588c3b87308dd8:::c76.661.08.467]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[:65:e::57d804df50f6f0:400cb84.88.1.6]/")!=
  null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[252ac:4:1:b2:ce::790:db:24535:72a:::2.55.0.4]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[c912:497dce5a2:ec57.691.96.28]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[:db34ed9:7f6e2940::52a129:42.3.045.4]/")!=
  null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[8b1e:5572.499.603.1]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[cc65c5:8f5956:8d0:1f:91::4e8:d:2.158.2.357]/"
) != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[916809183fbec8449:fd9a3:8:9:::49.8.49.940]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[5::227.141.5.47]/") == null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[5a7:c:::4957d57d::8d3878097d:7991:4a:830.9.9.669]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[61e51b6:e28:7f::d::01.113.2.14]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[d2974.8.40.955]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[0df350c9eb0064.92.7.808]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[7ae7::1:d:cbb8f7:bb:c4:8f6073d5fdc:a:2.116.760.5]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[:8:0715cc1:e:5:ac607::799a2af89.18.52.53]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[3077f9180.276.3.655]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[7:2bcf3:d:e4140f::e:3d12a28:d:::90:ed:87.86.82.23]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[:e:5:d564:1835.8.2.826]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[3:7:a:1ce::b9e05caca0d8324fe:aec064.652.367.893]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[38:58f:c179:b::14b2ab6:0259.5.292.705]/")!=
  null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[:e:b:cca:378:c19fe2:2c579.8.50.61]/") !=
  null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[3944ed89.162.574.3]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[e406:628::38b:9.5.4.2]/") == null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[65b:208e:c:4::8.4.4.3]/") == null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[60a80395506f6:67:e2:::4:f3844.7.2.1]/") !=
  null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[a54d:205e766.3.301.79]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[5::5.7.0.217]/") == null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[48f10::d::d1c00ba03:281746ee::3ffbe0.254.6.3]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[:f2484f:27928.797.92.6]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[47:815:867::ce:77.235.8.42]/") == null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[:081::40fb5fd88:f::2d385316:a:2e79d26:280.040.20.662]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[5:4:81768.91.072.8]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[ac2d52a4d4502fb40a26b1:12::be1.710.74.876]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[04:695b5591.12.9.287]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[90b5:55::b46a5:d4b8e828a80:5c42.11.028.3]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[57e:b33c:8a96f1d6b2111981.5.4.338]/") !=
  null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[65:3:f::6.50.7.3]/") == null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[ed0b6a3d74109c7:8599.38.3.711]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[de49f64c96f:9fdb76::98f00.0.4.41]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[6:3:b96:a67:8fc29:44c:495.751.5.6]/") !=
  null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[c0e8:fc90f9cf72f:1.9.266.72]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[a7db1:4::b512.917.083.75]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[68b8:f4:a15e00:eea10.671.07.95]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[38bb:7f6::a81.80.38.280]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[07:2c:b7f:e4:23993:36b9986:6::30:a2.479.9.25]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[ca:45:5:0044666111.675.4.8]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[3:2f:::2224801:2:22.4.93.133]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[e09:e5:7:7e2ca9:602668781:9::8852.6.66.40]/"
) != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[:22c685faed0:0b4b9::d78a936a739d::e:3a507.67.6.29]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[:59:f7a:87:469.40.5.0]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[1d::dc90::b::4250:116d6a502b9:f6.89.5.94]/"
) != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[8f027227:f::37:9e72:745e34e::f::70fb3:7d702.174.3.457]/"
) != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[8ab8e92a205a85eac6:5151bf76ff79b8:d::92.96.905.027]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[38d2:d651c00b78deefd9587c453134.16.56.92]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[50:93:f::21f6c5701.3.74.9]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[2e:::5267.3.077.0]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[c4::a30b1a6:888fb:9:07effc54e90895.08.32.6]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[5af5d69.744.487.8]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[27ec:b:044:bc:712:f:66.6.29.2]/") == null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[f6afd6:751.804.76.7]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[e5c:c8.34.7.21]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[4192d50d27698::17d4f:1c5c282e:910.5.636.994]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[89:0:040aee5:1533c:6219::8788220.6.9.0]/")!=
  null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[c6.70.51.72]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[38525a7:2ec07::9dfffec73e66f12:::0:e8.93.51.45]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[97a5:e::34.97.1.133]/") == null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[3763:4d::631.189.872.498]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[2a6::15::a585::0e87150.848.371.24]/") !=
  null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[95c5d9587.3.889.024]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[:66e183166d1:9:38b6e49808cf6f28.642.77.043]/"
) != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[3c::460c1df::cfe99cf:525:a3:0a:8891.159.9.0]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[14d7325:48:bc1d61.63.7.588]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[:2a2:::27d88:d:3606d2c:8::b0d691e2:c9241.64.436.153]/"
) != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[a17::8:3b87b:f::dad99b:7d7:3e2370:dd:5c3.2.822.790]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[d:8::d9:::a36.01.42.5]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[6b3c868a59b:21:a:f54918f:c77d7d2466:e3.87.2.14]/"
) != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[538:04d4bab18a9::394::b3:3::93a4924.0.696.2]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[911aa:337f1a4c798411e81622c:871.604.18.4]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[dd5:3:f5f0862960d88203.38.949.92]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[5749:e6a4889.6.90.947]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[::15.2.7.207]/") == null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[23c5dfb:c::::::ded0b9df45e38::1851.4.995.6]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[609ff2aae8d:80511.739.984.46]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[cf:44.297.52.2]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[2:7::d8:f39fd7ec55ef392.56.543.74]/") !=
  null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[e1:70e:6:1d2f43585.206.0.699]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[:39d:755f1bbdf:0d24b1:99080f:e::a51c::998.2.026.1]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[36bb::11c::0e5c::5:7fb87dd92.68.7.196]/")!=
  null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[c47:09e8c5f:f2394e48a::23e443da16b61.792.45.394]/"
) != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[:ef612f6:55d267:d::ac895c783bb5f408c:7d4.5.5.5]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[6:3:8::63.80.82.70]/") == null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[2e:fb50::52.2.7.2]/") == null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[53ba1:a12bc4:::6d6fd9ae4f::0a9.422.124.65]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[e5b:43::cd57:5.0.90.63]/") == null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[1:5cfded:::b::f71a43::e7ba199207.468.65.376]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[6c:1465:c:e0d682a675.80.2.53]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[:9::7768b4ee:2470ea9.8.368.686]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[c3::8.35.97.7]/") == null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[6549::00:6f71::cb6d7:a0e232.8.4.342]/") !=
  null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[2a1e92355647bd98b99::b54e47:8ce330.1.32.631]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[2472449a:a4.889.07.2]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[2a0:3:1774:1:36:5633:0.25.6.63]/") == null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[c5b9:17.7.8.939]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[15f7e50a282c:d:61d80da:575f7892403.53.7.4]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[86da46e:0:15e3b11a5:a6b2.01.1.7]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[0b26.8.522.9]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[94:676ea:39f03f3:a4:fe:10.79.04.552]/") !=
  null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[c500bc8483:978a1:2:6:7.661.3.5]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[ecf::196.836.2.410]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[c38:5::40.4.95.2]/") == null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[::80314.1.571.4]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[9d:854c5e5036.4.5.13]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[5bab0a5fcb:81d:0:e3f:c010.173.94.6]/") !=
  null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[fdfaa31:4:4:45537::ea3495a:52.98.4.2]/")!=
  null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[b:::8::0c0f:e09b0a4:6:1238:70f:::05630.8.13.24]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[92d8::2a7:89e:50.6.122.56]/") == null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[:a1a4fd7:083.857.376.3]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[09:3c908d09:2:d60:5da8:adf8.6.105.002]/")!=
  null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[cc65716f79b9::c5:dbe:de:6:0:3b7.54.6.130]/"
) != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[f:::323::c::e240d:59:1bff816a015::f0328.659.095.38]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[aa5:26e7:6d:3:0383.8.30.284]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[c594a64f06f:a:4d74526.52.06.3]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[2:6:265.84.67.2]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[10::::c180072b2566:5d3741.343.958.17]/")!=
  null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[bc5:fc62be0:718c03c197::7d1a04.24.2.55]/")!=
  null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[ee4e:88::c8f9edc1:b:88:212.905.5.12]/") !=
  null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[3a088:b8bbd0:e7::d:6eb32.3.343.125]/") !=
  null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[451a6c79::232772:6d27a1c:69b61:9:282.76.495.038]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[521.45.126.59]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[885:4df:45:c7:8:dc9:49.141.0.5]/") == null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[4ab:56fc91e9da4:4:2::eca93994d0e:806.36.7.01]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[b84c24:7:44bd0798186803.15.636.03]/") !=
  null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[bc0aafd8b:e0:8a:2dc98951.2.51.921]/") !=
  null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[e12:b::4:06ec85:33d:1cbb::d4fde02.2.786.87]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[c:a2cdb7a:::0ae0::5.282.3.963]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[:153dea24e88:16:6:383894db9b9698bd495:971.927.1.09]/"
) != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[d8d2::1:cc4bdc9:777c2:f:52a4a2b:::::b57d86.643.156.206]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[75292cbd15aaaafc1:61f7c4636:51.9.41.628]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[67:c0:538:17.734.2.00]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[8b55.8.8.28]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[2018:b41:6209dad5d0726::2:fd:aa30022288.007.13.256]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[afe5::22:8703.9.17.973]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[20e7b3d8507a1::b3cc44:06.9.0.211]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[0fb:c::a1a624::9:bebdc83:75:450:6861e68d15.4.6.8]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[b7e:7eaf9c:64.25.87.87]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[86f:f065:610f5355d:f:c1:cd4:10.62.62.11]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[60141ff:55252.92.02.88]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[11a0c512a55a36230.32.81.36]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[20fb:29033.5.13.0]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[5:8::a:a:132.71.1.64]/") == null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[1eb6:81d8:2f930.3.41.2]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[::4b:194.3.15.0]/") == null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[f:::88:f23.97.690.9]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[9e:68:d:955.58.363.6]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[a1292::87f:8:c:c73:c49bffddf2.88.38.20]/")!=
  null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[9129::d2:4d2e6:06.860.9.5]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[:064.503.06.943]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[799a6:18ed93:cff1c25:b7:0300::9.647.1.478]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[e:0ab9::a04f6af0:4993.261.73.742]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[1::95.82.234.2]/") == null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[04645f30:9::57b65424.72.37.493]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[f876cd:d7423:c6c::e4:90e:00cdc05e5:f:7bf13.44.5.710]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[da6f0:6afd:896.9.437.7]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[fadd7930:894:bc:58228.3.5.57]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[db00:2fbd:da:bcb6:201e:e00258:291026891.33.693.8]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[7688:5a::9:79:4d7ca1:821.54.319.92]/") !=
  null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[7c4620e:8e552198:23b5364.357.84.9]/") !=
  null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[d:6b6c016b07:af1213:35:dee81d83.33.9.2]/")!=
  null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[f54181.7.07.74]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[e145::59a26d0:16:73bbb:acf0:671:32.4.0.1]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[e3:5a1:c9f:b4e38:46:c00:67:3:90.00.24.7]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[1ae:84:f8412648a49e:::d1681.342.25.5]/")!=
  null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[d89:ef2:dbd87.162.5.344]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[6eecc:c9:98fd78d:8b0c7c14:370.1.02.3]/")!=
  null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[e6:c64.45.98.30]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[1ba8c828e2c2:f1.6.08.29]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[00be:fd0:0.4.9.360]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[fac::097::096e5860b:22d3a71::47999.64.4.32]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[9c3c0:5e62d81f:c807:0:f5c4e61.97.71.684]/"
) != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[:90f2bc25f1eea::ba3b061:8ea44225b7a1:42.019.0.385]/"
) != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[:2::5f99ec2f09fa:cd::d5e322a52a3e39:::e83.72.13.73]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[cbb38:19.841.48.0]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[:978c2940:4:def0af316.73.438.84]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[983da:0:7c:492:3613:3f3fc:b:acc0:3e2.4.1.12]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[13:a3a::2:85.2.96.78]/") == null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[0034d:a6:55b1:::b1f97ce5a:4a::f968:774.232.10.592]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[:6:d3b51:2::729:b:63c9b10.7.55.73]/") !=
  null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[:384a34a730bd:26102.68.6.34]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[94d0.702.176.060]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[8:8:e00627f3255692f080f8::9f0f5ec7234374.425.4.1]/"
) != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[f2ae87:66c47b:::39:c59cab:850c07042345.85.12.50]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[80cb:1af:a::a664.510.065.514]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[:::32b1a:e6401662c:7.32.225.40]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[876e762ca:8:649::15f1b:5:b0::d161.71.2.2]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[486:b:ccbfb2139.5.88.23]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[3b:ba1aeeb2a890c5:b:505.3.21.233]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[9f:f:5:cb4:c3c195ff82d7::adbd980.7.64.6]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[b90b9a::c2::3.2.3.803]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[d3758:532.97.2.342]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[ff3::395:6.26.47.37]/") == null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[a1:3a6e50::a:7aeea26.9.7.695]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[305bdd7d3d:0d3:8:903.05.9.48]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[8161d4f62323dcb7:611d1c:7c::a:ea982.3.93.987]/"
) != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[8309f36:f1::0be709013343::82:dda5:3:84.3.987.599]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[9ff6491c3.5.03.4]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[40529f8a2:6:16cb:ea7:c:1b7:0e99a:8:::215.242.321.37]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[90::6.5.14.9]/") == null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[a:e:2:4a0:1:0b:7.9.1.5]/") == null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[31:4f545.915.016.019]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[:c196.3.27.93]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[fc:df7baa39cbf:98a5:b53a5e72d620:c4::088.6.002.3]/"
) != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[:7:da794:b:5:9:2:a0:f:14bd5006109ec9:45.6.824.79]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[7eb::4:65.1.66.2]/") == null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[40::b905d1:d0fc0f7f6f27a960:15690.4.6.22]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[564912.5.5.36]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[e079d:f4de10.12.29.833]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[28043:da07:9:9de3:4ff:88a:d4:d:9:::077183.369.940.42]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[9:e:26f5:00d:5::60.3.80.9]/") == null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[a3a2:453:901766.447.168.4]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[:a::af0:c0:e7b:1989:8:9cd6.52.56.4]/") !=
  null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[e:99ad01db7.76.158.90]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[13bfb95:94da2ff:2:8.29.66.9]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[00e64:95e:0188:7:0514:847a713c459:49.746.482.82]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[:a3c6260c53c57:e88:4a:5aa29.077.163.958]/"
) != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[122:c:d9:f2ceb5:eaa3f5:a7:dd:6::0443.66.73.46]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[:4586.71.1.7]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[24f::cae3::44a::1365:8:3a98:792.666.31.864]/"
) != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[4::::73f93d0184536285aa24:::70.59.668.837]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[2::2d:::dc89:6894.32.7.29]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[fda:40ee::2.15.5.177]/") == null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[6a00a9ec5857.532.9.3]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[b:59:bc:71cdea7:b:5::a474:52bd665.648.25.47]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[847da8aa:815735.9.9.97]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[:0c9166336.19.97.49]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[c:9bae:c68d:924:e::c4:8415:e::a3.35.06.675]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[d4f490b:9f:f7::052.1.0.197]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[ed9:239:ab:35f90:e:7866:2e:b0183:4::5.4.5.73]/"
) != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[1c::c61bdb06c877223:e0908:4d2671:d5f6.007.246.39]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[8:a19::93:1c4:be2:10.3.7.9]/") == null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[7390:b37a3:8d8db:4::4a::16.53.852.309]/")!=
  null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[2d1b:36481:fa71653d2:ddd35772.558.77.57]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[::15.8.4.58]/") == null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[3deb:0::d818::0eb1733:191.6.203.99]/") !=
  null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[428:0d7fd:d12:6:0e396.3.8.0]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[e3:8:71c01cb8:a4d0a4:1fe1b2.94.38.3]/") !=
  null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[:01cb63bf:e880::bf99bf2644.660.81.10]/")!=
  null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[f0b6c3011d::86e:33106f0.569.067.970]/") !=
  null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[6fb:6a517:818fb8e0:024.2.553.449]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[ed0::d:c765fe:1:0:a38c:a7::58.2.445.1]/")!=
  null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[ca:2ebb1b33:ad0:91c:6::d:1:a:ad822c08.32.35.9]/"
) != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[dfcc90306.888.66.18]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[f60.4.88.858]/") != null) {
 Assert.fail();
 }
if (URIUtility.splitIRI("http://[06fff04:3:1:6414.218.292.296]/") != null) {
 Assert.fail();
 }

  if
  (URIUtility.splitIRI("http://[963:7c:7166e4:82f182fffbc:790697c234.22.90.750]/"
) != null) {
 Assert.fail();
 }
}

    private void TestMatchBasicNone(String[] langranges, String str) {
      List<String> r = LanguageTags.LanguageTagFilter(
        langranges,
        new String[] { str },
        false,
 false);
      Assert.assertEquals(0, r.size());
    }

    private void TestMatchBasicContained(String[] langranges, String str) {
      List<String> r = LanguageTags.LanguageTagFilter(
        langranges,
        new String[] { str },
        false,
 false);
      if (!(r.size() > 0)) {
 Assert.fail();
 }
    }
    @Test
    public void TestMatchLangTagsBasic() {
      String[] langranges = { "fr-ca", "es" };
      this.TestMatchBasicContained(langranges, "fr-ca");
      this.TestMatchBasicContained(langranges, "es");
      this.TestMatchBasicNone(langranges, "fr-cam");
      this.TestMatchBasicContained(langranges, "fr-ca-9999");
      this.TestMatchBasicNone(langranges, "fr-zxxx-ca");
      this.TestMatchBasicContained(langranges, "es-cam");
      this.TestMatchBasicContained(langranges, "es-ca-9999");
      this.TestMatchBasicContained(langranges, "es-zxxx-ca");
      langranges = new String[] { "fr-ca", "*", "es"};
      this.TestMatchBasicContained(langranges, "es");
      this.TestMatchBasicContained(langranges, "nl");
      langranges = new String[] { null, "*" };
    }

    private Message TestMailToOne(String s) {
      System.out.println(s);
      Message msg = DataUrl.MailToUrlMessage(s);
      System.out.println(msg);
      if (msg == null) {
 Assert.fail();
 }
      return msg;
    }

    static void TestDataUrlRoundTrip(String data) {
      MediaType mt = DataUrl.DataUrlMediaType(data);
      byte[] bytes = DataUrl.DataUrlBytes(data);
      if ((mt) == null) {
 Assert.fail(data);
 }
      if ((bytes) == null) {
 Assert.fail(data);
 }
      String data2 = DataUrl.MakeDataUrl(bytes, mt);
      MediaType mt2 = DataUrl.DataUrlMediaType(data2);
      byte[] bytes2 = DataUrl.DataUrlBytes(data2);
      Test.TestCommon.AssertByteArraysEqual(bytes, bytes2);
      Assert.assertEquals(data, mt, mt2);
    }

    private static void TestEmptyPathOne(String uri) {
      int[] iri = Test.URIUtility.splitIRI(uri);
      if (iri == null) {
 Assert.fail();
 }
      Assert.GreaterOrEqual(iri[4], 0);
      Assert.assertEquals(iri[4], iri[5]);
    }

    @Test
    public void TestEmptyPathURIs() {
      TestEmptyPathOne("s://h");
      TestEmptyPathOne("s://h?x");
      TestEmptyPathOne("s://h#x");
      TestEmptyPathOne("//h");
      TestEmptyPathOne("//h?x");
      TestEmptyPathOne("//h#x");
      TestEmptyPathOne("s://");
      TestEmptyPathOne("s://?x");
      TestEmptyPathOne("s://#x");
      TestEmptyPathOne("s:");
      TestEmptyPathOne("s:?x");
      TestEmptyPathOne("s:#x");
    }
    @Test
    public void TestMailTo() {
      Message msg;
      this.TestMailToOne("mailto:me@example.com");
      this.TestMailToOne("mailto:you@example.com?subject=current-issue");
 msg =
  this.TestMailToOne("mailto:you@example.com?body=x%20abcdefg-hijk");
      Assert.assertEquals("x abcdefg-hijk", msg.getBodyString());
      msg =
  this.TestMailToOne("mailto:you@example.com?body=x%20abcdefg-h%0d%0aijk");
      Assert.assertEquals("x abcdefg-h\r\nijk", msg.getBodyString());
      // ----
      msg = this.TestMailToOne("mailto:e%25f@m.example");
      {
String stringTemp = msg.GetHeader("to");
Assert.assertEquals(
  "e%f@m.example",
  stringTemp);
}
      msg = this.TestMailToOne("mailto:e%26f@m.example");
      {
String stringTemp = msg.GetHeader("to");
Assert.assertEquals(
  "e&f@m.example",
  stringTemp);
}
      msg = this.TestMailToOne("mailto:e%3ff@m.example");
      {
String stringTemp = msg.GetHeader("to");
Assert.assertEquals(
  "e?f@m.example",
  stringTemp);
}
      msg = this.TestMailToOne("mailto:%22e%3ff%22@m.example");
      Assert.assertEquals("\"e?f\"@m.example", msg.GetHeader("to"));
      msg = this.TestMailToOne("mailto:%22e%40f%22@m.example");
      Assert.assertEquals("\"e@f\"@m.example", msg.GetHeader("to"));
      msg = this.TestMailToOne("mailto:%22e%5c%5c%40%5c%22f%22@m.example");
      Assert.assertEquals("\"e\\\\@\\\"f\"@m.example", msg.GetHeader("to"));
      msg = this.TestMailToOne("mailto:%22e'f%22@m.example");
      Assert.assertEquals("\"e'f\"@m.example", msg.GetHeader("to"));
      List<NamedAddress> toaddrs = msg.GetAddresses("to");
      System.out.println(toaddrs.get(0));
      msg = this.TestMailToOne("mailto:me@b%c3%a8.example");
      {
String stringTemp = msg.GetHeader("to");
Assert.assertEquals(
  "me@b\u00e8.example",
  stringTemp);
}
      List<NamedAddress> toaddr = msg.GetAddresses("to");
      System.out.println(toaddr.get(0));
      msg = this.TestMailToOne("mailto:me@example.com?subject=b%c3%a7");
      {
String stringTemp = msg.GetHeader("subject");
Assert.assertEquals(
  "b\u00e7",
  stringTemp);
}
      msg = this.TestMailToOne("mailto:me@example.com?body=b%c3%a7");
      Assert.assertEquals("b\u00e7", msg.getBodyString());
      msg =

  this.TestMailToOne("mailto:me@example.com?subject=%3D%3futf-8%3fQ%3fb%3dC3%3dA7%3f%3d");
      System.out.print(msg.GetHeader("subject"));
    }
  }