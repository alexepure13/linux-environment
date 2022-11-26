var pwd = document.getElementById("pwd");
var pwd_content = document.getElementById("pwd-content");
var cd = document.getElementById("cd");
var cd_content = document.getElementById("cd-content");
var ls = document.getElementById("ls");
var ls_content = document.getElementById("ls-content");
var cat = document.getElementById("cat");
var cat_content = document.getElementById("cat-content");
var cp = document.getElementById("cp");
var cp_content = document.getElementById("cp-content");
var mv = document.getElementById("mv");
var mv_content = document.getElementById("mv-content");
var mkdir = document.getElementById("mkdir");
var mkdir_content = document.getElementById("mkdir-content");
var rm = document.getElementById("rm");
var rm_content = document.getElementById("rm-content");
var rmdir = document.getElementById("rmdir");
var rmdir_content = document.getElementById("rmdir-content");
var touch = document.getElementById("touch");
var touch_content = document.getElementById("touch-content");
var dir = document.getElementById("dir");
var dir_content = document.getElementById("dir-content");
var echo = document.getElementById("echo");
var echo_content = document.getElementById("echo-content");
var chmod = document.getElementById("chmod");
var chmod_content = document.getElementById("chmod-content");
var chown = document.getElementById("chown");
var chown_content = document.getElementById("chown-content");
var df = document.getElementById("df");
var df_content = document.getElementById("df-content");
var grep = document.getElementById("grep");
var grep_content = document.getElementById("grep-content");
var gunzip = document.getElementById("gunzip");
var gunzip_content = document.getElementById("gunzip-content");
var hostname = document.getElementById("hostname");
var hostname_content = document.getElementById("hostname-content");
var kill = document.getElementById("kill");
var kill_content = document.getElementById("kill-content");
var mount = document.getElementById("mount");
var mount_content = document.getElementById("mount-content");
var ps = document.getElementById("ps");
var ps_content = document.getElementById("ps-content");
var uname = document.getElementById("uname");
var uname_content = document.getElementById("uname-content");
var whatis = document.getElementById("whatis");
var whatis_content = document.getElementById("whatis-content");
var info = document.getElementById("info");
var info_content = document.getElementById("info-content");
var man = document.getElementById("man");
var man_content = document.getElementById("man-content");
var gzip = document.getElementById("gzip");
var gzip_content = document.getElementById("gzip-content");

document.getElementById("mkdir-content").style.display = "none";
document.getElementById("mv-content").style.display = "none";
document.getElementById("cp-content").style.display = "none";
document.getElementById("cat-content").style.display = "none";
document.getElementById("ls-content").style.display = "none";
document.getElementById("cd-content").style.display = "none";
document.getElementById("pwd-content").style.display = "none";
document.getElementById("rm-content").style.display = "none";
document.getElementById("rmdir-content").style.display = "none";
document.getElementById("touch-content").style.display = "none";
document.getElementById("dir-content").style.display = "none";
document.getElementById("echo-content").style.display = "none";
document.getElementById("chmod-content").style.display = "none";
document.getElementById("chown-content").style.display = "none";
document.getElementById("df-content").style.display = "none";
document.getElementById("grep-content").style.display = "none";
document.getElementById("gzip-content").style.display = "none";
document.getElementById("gunzip-content").style.display = "none";
document.getElementById("hostname-content").style.display = "none";
document.getElementById("kill-content").style.display = "none";
document.getElementById("mount-content").style.display = "none";
document.getElementById("ps-content").style.display = "none";
document.getElementById("uname-content").style.display = "none";
document.getElementById("whatis-content").style.display = "none";
document.getElementById("info-content").style.display = "none";
document.getElementById("man-content").style.display = "none";

function pwdClick() {
  if (pwd_content.style.display == "none") {pwd_content.style.display = "block";
 pwd.style.transform ="scale(1);"
}
  else if (pwd_content.style.display == "block")
    pwd_content.style.display = "none";
}

function cdClick() {
  if (cd_content.style.display == "none") cd_content.style.display = "block";
  else if (cd_content.style.display == "block")
    cd_content.style.display = "none";
}

function lsClick() {
  if (ls_content.style.display == "none") ls_content.style.display = "block";
  else if (ls_content.style.display == "block")
    ls_content.style.display = "none";
}

function catClick() {
  if (cat_content.style.display == "none") cat_content.style.display = "block";
  else if (cat_content.style.display == "block")
    cat_content.style.display = "none";
}

function cpClick() {
  if (cp_content.style.display == "none") cp_content.style.display = "block";
  else if (cp_content.style.display == "block")
    cp_content.style.display = "none";
}

function mvClick() {
  if (mv_content.style.display == "none") mv_content.style.display = "block";
  else if (mv_content.style.display == "block")
    mv_content.style.display = "none";
}

function mkdirClick() {
  if (mkdir_content.style.display == "none")
    mkdir_content.style.display = "block";
  else if (mkdir_content.style.display == "block")
    mkdir_content.style.display = "none";
}

function rmClick() {
  if (rm_content.style.display == "none") rm_content.style.display = "block";
  else if (rm_content.style.display == "block")
    rm_content.style.display = "none";
}

function rmdirClick() {
  if (rmdir_content.style.display == "none")
    rmdir_content.style.display = "block";
  else if (rmdir_content.style.display == "block")
    rmdir_content.style.display = "none";
}

function touchClick() {
  if (touch_content.style.display == "none")
    touch_content.style.display = "block";
  else if (touch_content.style.display == "block")
    touch_content.style.display = "none";
}

function dirClick() {
  if (dir_content.style.display == "none") dir_content.style.display = "block";
  else if (dir_content.style.display == "block")
    dir_content.style.display = "none";
}

function echoClick() {
  if (echo_content.style.display == "none")
    echo_content.style.display = "block";
  else if (echo_content.style.display == "block")
    echo_content.style.display = "none";
}

function chmodClick() {
  if (chmod_content.style.display == "none")
    chmod_content.style.display = "block";
  else if (chmod_content.style.display == "block")
    chmod_content.style.display = "none";
}

function chownClick() {
  if (chown_content.style.display == "none")
    chown_content.style.display = "block";
  else if (chown_content.style.display == "block")
    chown_content.style.display = "none";
}

function dfClick() {
  if (df_content.style.display == "none") df_content.style.display = "block";
  else if (df_content.style.display == "block")
    df_content.style.display = "none";
}

function grepClick() {
  if (grep_content.style.display == "none")
    grep_content.style.display = "block";
  else if (grep_content.style.display == "block")
    grep_content.style.display = "none";
}

function gzipClick() {
  if (gzip_content.style.display == "none")
    gzip_content.style.display = "block";
  else if (gzip_content.style.display == "block")
    gzip_content.style.display = "none";
}

function gunzipClick() {
  if (gunzip_content.style.display == "none")
    gunzip_content.style.display = "block";
  else if (gunzip_content.style.display == "block")
    gunzip_content.style.display = "none";
}

function hostnameClick() {
  if (hostname_content.style.display == "none")
    hostname_content.style.display = "block";
  else if (hostname_content.style.display == "block")
    hostname_content.style.display = "none";
}

function killClick() {
  if (kill_content.style.display == "none")
    kill_content.style.display = "block";
  else if (kill_content.style.display == "block")
    kill_content.style.display = "none";
}

function mountClick() {
  if (mount_content.style.display == "none")
    mount_content.style.display = "block";
  else if (mount_content.style.display == "block")
    mount_content.style.display = "none";
}

function psClick() {
  if (ps_content.style.display == "none") ps_content.style.display = "block";
  else if (ps_content.style.display == "block")
    ps_content.style.display = "none";
}

function unameClick() {
  if (uname_content.style.display == "none")
    uname_content.style.display = "block";
  else if (uname_content.style.display == "block")
    uname_content.style.display = "none";
}

function whatisClick() {
  if (whatis_content.style.display == "none")
    whatis_content.style.display = "block";
  else if (whatis_content.style.display == "block")
    whatis_content.style.display = "none";
}

function infoClick() {
  if (info_content.style.display == "none")
    info_content.style.display = "block";
  else if (info_content.style.display == "block")
    info_content.style.display = "none";
}

function manClick() {
  if (man_content.style.display == "none") man_content.style.display = "block";
  else if (man_content.style.display == "block")
    man_content.style.display = "none";
}
