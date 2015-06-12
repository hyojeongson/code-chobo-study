package io.codechobostudy.study.domain

import javax.persistence._

import io.codechobostudy.user.domain.UserDomain

import scala.beans.BeanProperty


@Entity
class StudyGroupDomain extends StudyBaseEntity{

  @BeanProperty
  @Column(name="study_name", nullable = false, length = 20)
  var studyName: String = _

  @BeanProperty
  @Column(name = "study_desc", nullable = false, length = 1000)
  var studyDesc: String = _

  @BeanProperty
//  @Column(name = "leader_id", nullable = false, length = 20)
  var leader: String =_

  /*
  @BeanProperty
  @OneToMany
  @JoinColumn("member_id")
  var members : java.util.List[String] = _
 */
  override def toString: String = "studyName : "+studyName+", studyDesc : "+studyDesc
}
