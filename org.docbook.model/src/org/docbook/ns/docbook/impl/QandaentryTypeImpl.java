/*
 * Copyright (c) 2012 - 2026 Data In Motion and others.
 * All rights reserved.
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *     Data In Motion - initial API and implementation
 */
package org.docbook.ns.docbook.impl;

import java.util.Collection;

import org.docbook.ns.docbook.AnswerType;
import org.docbook.ns.docbook.DirType;
import org.docbook.ns.docbook.DocbookPackage;
import org.docbook.ns.docbook.InfoType;
import org.docbook.ns.docbook.QandaentryType;
import org.docbook.ns.docbook.QuestionType;
import org.docbook.ns.docbook.RevisionflagType;
import org.docbook.ns.docbook.TitleType;
import org.docbook.ns.docbook.TitleabbrevType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.w3._1999.xlink.ActuateType;
import org.w3._1999.xlink.ShowType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Qandaentry Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.docbook.ns.docbook.impl.QandaentryTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.QandaentryTypeImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.QandaentryTypeImpl#getTitleabbrev <em>Titleabbrev</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.QandaentryTypeImpl#getInfo <em>Info</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.QandaentryTypeImpl#getQuestion <em>Question</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.QandaentryTypeImpl#getAnswer <em>Answer</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.QandaentryTypeImpl#getActuate <em>Actuate</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.QandaentryTypeImpl#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.QandaentryTypeImpl#getArch <em>Arch</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.QandaentryTypeImpl#getArcrole <em>Arcrole</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.QandaentryTypeImpl#getAudience <em>Audience</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.QandaentryTypeImpl#getBase <em>Base</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.QandaentryTypeImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.QandaentryTypeImpl#getConformance <em>Conformance</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.QandaentryTypeImpl#getDir <em>Dir</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.QandaentryTypeImpl#getHref <em>Href</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.QandaentryTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.QandaentryTypeImpl#getLang <em>Lang</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.QandaentryTypeImpl#getLinkend <em>Linkend</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.QandaentryTypeImpl#getOs <em>Os</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.QandaentryTypeImpl#getRemap <em>Remap</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.QandaentryTypeImpl#getRevision <em>Revision</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.QandaentryTypeImpl#getRevisionflag <em>Revisionflag</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.QandaentryTypeImpl#getRole <em>Role</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.QandaentryTypeImpl#getRole1 <em>Role1</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.QandaentryTypeImpl#getSecurity <em>Security</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.QandaentryTypeImpl#getShow <em>Show</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.QandaentryTypeImpl#getTitle1 <em>Title1</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.QandaentryTypeImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.QandaentryTypeImpl#getUserlevel <em>Userlevel</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.QandaentryTypeImpl#getVendor <em>Vendor</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.QandaentryTypeImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.QandaentryTypeImpl#getWordsize <em>Wordsize</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.QandaentryTypeImpl#getXreflabel <em>Xreflabel</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QandaentryTypeImpl extends MinimalEObjectImpl.Container implements QandaentryType {
	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap group;

	/**
	 * The cached value of the '{@link #getInfo() <em>Info</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInfo()
	 * @generated
	 * @ordered
	 */
	protected InfoType info;

	/**
	 * The cached value of the '{@link #getQuestion() <em>Question</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuestion()
	 * @generated
	 * @ordered
	 */
	protected QuestionType question;

	/**
	 * The cached value of the '{@link #getAnswer() <em>Answer</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnswer()
	 * @generated
	 * @ordered
	 */
	protected EList<AnswerType> answer;

	/**
	 * The default value of the '{@link #getActuate() <em>Actuate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActuate()
	 * @generated
	 * @ordered
	 */
	protected static final ActuateType ACTUATE_EDEFAULT = ActuateType.ON_LOAD;

	/**
	 * The cached value of the '{@link #getActuate() <em>Actuate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActuate()
	 * @generated
	 * @ordered
	 */
	protected ActuateType actuate = ACTUATE_EDEFAULT;

	/**
	 * This is true if the Actuate attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean actuateESet;

	/**
	 * The default value of the '{@link #getAnnotations() <em>Annotations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotations()
	 * @generated
	 * @ordered
	 */
	protected static final Object ANNOTATIONS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAnnotations() <em>Annotations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotations()
	 * @generated
	 * @ordered
	 */
	protected Object annotations = ANNOTATIONS_EDEFAULT;

	/**
	 * The default value of the '{@link #getArch() <em>Arch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArch()
	 * @generated
	 * @ordered
	 */
	protected static final Object ARCH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getArch() <em>Arch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArch()
	 * @generated
	 * @ordered
	 */
	protected Object arch = ARCH_EDEFAULT;

	/**
	 * The default value of the '{@link #getArcrole() <em>Arcrole</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArcrole()
	 * @generated
	 * @ordered
	 */
	protected static final Object ARCROLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getArcrole() <em>Arcrole</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArcrole()
	 * @generated
	 * @ordered
	 */
	protected Object arcrole = ARCROLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAudience() <em>Audience</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAudience()
	 * @generated
	 * @ordered
	 */
	protected static final Object AUDIENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAudience() <em>Audience</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAudience()
	 * @generated
	 * @ordered
	 */
	protected Object audience = AUDIENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getBase() <em>Base</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase()
	 * @generated
	 * @ordered
	 */
	protected static final Object BASE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBase() <em>Base</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase()
	 * @generated
	 * @ordered
	 */
	protected Object base = BASE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCondition() <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected static final Object CONDITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCondition() <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected Object condition = CONDITION_EDEFAULT;

	/**
	 * The default value of the '{@link #getConformance() <em>Conformance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConformance()
	 * @generated
	 * @ordered
	 */
	protected static final Object CONFORMANCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConformance() <em>Conformance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConformance()
	 * @generated
	 * @ordered
	 */
	protected Object conformance = CONFORMANCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDir() <em>Dir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDir()
	 * @generated
	 * @ordered
	 */
	protected static final DirType DIR_EDEFAULT = DirType.LTR;

	/**
	 * The cached value of the '{@link #getDir() <em>Dir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDir()
	 * @generated
	 * @ordered
	 */
	protected DirType dir = DIR_EDEFAULT;

	/**
	 * This is true if the Dir attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean dirESet;

	/**
	 * The default value of the '{@link #getHref() <em>Href</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHref()
	 * @generated
	 * @ordered
	 */
	protected static final Object HREF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHref() <em>Href</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHref()
	 * @generated
	 * @ordered
	 */
	protected Object href = HREF_EDEFAULT;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getLang() <em>Lang</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLang()
	 * @generated
	 * @ordered
	 */
	protected static final Object LANG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLang() <em>Lang</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLang()
	 * @generated
	 * @ordered
	 */
	protected Object lang = LANG_EDEFAULT;

	/**
	 * The default value of the '{@link #getLinkend() <em>Linkend</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkend()
	 * @generated
	 * @ordered
	 */
	protected static final String LINKEND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLinkend() <em>Linkend</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkend()
	 * @generated
	 * @ordered
	 */
	protected String linkend = LINKEND_EDEFAULT;

	/**
	 * The default value of the '{@link #getOs() <em>Os</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOs()
	 * @generated
	 * @ordered
	 */
	protected static final Object OS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOs() <em>Os</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOs()
	 * @generated
	 * @ordered
	 */
	protected Object os = OS_EDEFAULT;

	/**
	 * The default value of the '{@link #getRemap() <em>Remap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemap()
	 * @generated
	 * @ordered
	 */
	protected static final Object REMAP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRemap() <em>Remap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemap()
	 * @generated
	 * @ordered
	 */
	protected Object remap = REMAP_EDEFAULT;

	/**
	 * The default value of the '{@link #getRevision() <em>Revision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRevision()
	 * @generated
	 * @ordered
	 */
	protected static final Object REVISION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRevision() <em>Revision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRevision()
	 * @generated
	 * @ordered
	 */
	protected Object revision = REVISION_EDEFAULT;

	/**
	 * The default value of the '{@link #getRevisionflag() <em>Revisionflag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRevisionflag()
	 * @generated
	 * @ordered
	 */
	protected static final RevisionflagType REVISIONFLAG_EDEFAULT = RevisionflagType.CHANGED;

	/**
	 * The cached value of the '{@link #getRevisionflag() <em>Revisionflag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRevisionflag()
	 * @generated
	 * @ordered
	 */
	protected RevisionflagType revisionflag = REVISIONFLAG_EDEFAULT;

	/**
	 * This is true if the Revisionflag attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean revisionflagESet;

	/**
	 * The default value of the '{@link #getRole() <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected static final Object ROLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRole() <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected Object role = ROLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRole1() <em>Role1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole1()
	 * @generated
	 * @ordered
	 */
	protected static final Object ROLE1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRole1() <em>Role1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole1()
	 * @generated
	 * @ordered
	 */
	protected Object role1 = ROLE1_EDEFAULT;

	/**
	 * The default value of the '{@link #getSecurity() <em>Security</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurity()
	 * @generated
	 * @ordered
	 */
	protected static final Object SECURITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSecurity() <em>Security</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurity()
	 * @generated
	 * @ordered
	 */
	protected Object security = SECURITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getShow() <em>Show</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShow()
	 * @generated
	 * @ordered
	 */
	protected static final ShowType SHOW_EDEFAULT = ShowType.NEW;

	/**
	 * The cached value of the '{@link #getShow() <em>Show</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShow()
	 * @generated
	 * @ordered
	 */
	protected ShowType show = SHOW_EDEFAULT;

	/**
	 * This is true if the Show attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean showESet;

	/**
	 * The default value of the '{@link #getTitle1() <em>Title1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle1()
	 * @generated
	 * @ordered
	 */
	protected static final Object TITLE1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitle1() <em>Title1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle1()
	 * @generated
	 * @ordered
	 */
	protected Object title1 = TITLE1_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final Object TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected Object type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getUserlevel() <em>Userlevel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserlevel()
	 * @generated
	 * @ordered
	 */
	protected static final Object USERLEVEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUserlevel() <em>Userlevel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserlevel()
	 * @generated
	 * @ordered
	 */
	protected Object userlevel = USERLEVEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getVendor() <em>Vendor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVendor()
	 * @generated
	 * @ordered
	 */
	protected static final Object VENDOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVendor() <em>Vendor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVendor()
	 * @generated
	 * @ordered
	 */
	protected Object vendor = VENDOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final Object VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected Object version = VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getWordsize() <em>Wordsize</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWordsize()
	 * @generated
	 * @ordered
	 */
	protected static final Object WORDSIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWordsize() <em>Wordsize</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWordsize()
	 * @generated
	 * @ordered
	 */
	protected Object wordsize = WORDSIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getXreflabel() <em>Xreflabel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXreflabel()
	 * @generated
	 * @ordered
	 */
	protected static final Object XREFLABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getXreflabel() <em>Xreflabel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXreflabel()
	 * @generated
	 * @ordered
	 */
	protected Object xreflabel = XREFLABEL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QandaentryTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DocbookPackage.eINSTANCE.getQandaentryType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, DocbookPackage.QANDAENTRY_TYPE__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TitleType> getTitle() {
		return getGroup().list(DocbookPackage.eINSTANCE.getQandaentryType_Title());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TitleabbrevType> getTitleabbrev() {
		return getGroup().list(DocbookPackage.eINSTANCE.getQandaentryType_Titleabbrev());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InfoType getInfo() {
		return info;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInfo(InfoType newInfo, NotificationChain msgs) {
		InfoType oldInfo = info;
		info = newInfo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DocbookPackage.QANDAENTRY_TYPE__INFO, oldInfo, newInfo);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInfo(InfoType newInfo) {
		if (newInfo != info) {
			NotificationChain msgs = null;
			if (info != null)
				msgs = ((InternalEObject)info).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DocbookPackage.QANDAENTRY_TYPE__INFO, null, msgs);
			if (newInfo != null)
				msgs = ((InternalEObject)newInfo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DocbookPackage.QANDAENTRY_TYPE__INFO, null, msgs);
			msgs = basicSetInfo(newInfo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.QANDAENTRY_TYPE__INFO, newInfo, newInfo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QuestionType getQuestion() {
		return question;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQuestion(QuestionType newQuestion, NotificationChain msgs) {
		QuestionType oldQuestion = question;
		question = newQuestion;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DocbookPackage.QANDAENTRY_TYPE__QUESTION, oldQuestion, newQuestion);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQuestion(QuestionType newQuestion) {
		if (newQuestion != question) {
			NotificationChain msgs = null;
			if (question != null)
				msgs = ((InternalEObject)question).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DocbookPackage.QANDAENTRY_TYPE__QUESTION, null, msgs);
			if (newQuestion != null)
				msgs = ((InternalEObject)newQuestion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DocbookPackage.QANDAENTRY_TYPE__QUESTION, null, msgs);
			msgs = basicSetQuestion(newQuestion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.QANDAENTRY_TYPE__QUESTION, newQuestion, newQuestion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AnswerType> getAnswer() {
		if (answer == null) {
			answer = new EObjectContainmentEList<AnswerType>(AnswerType.class, this, DocbookPackage.QANDAENTRY_TYPE__ANSWER);
		}
		return answer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ActuateType getActuate() {
		return actuate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setActuate(ActuateType newActuate) {
		ActuateType oldActuate = actuate;
		actuate = newActuate == null ? ACTUATE_EDEFAULT : newActuate;
		boolean oldActuateESet = actuateESet;
		actuateESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.QANDAENTRY_TYPE__ACTUATE, oldActuate, actuate, !oldActuateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetActuate() {
		ActuateType oldActuate = actuate;
		boolean oldActuateESet = actuateESet;
		actuate = ACTUATE_EDEFAULT;
		actuateESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DocbookPackage.QANDAENTRY_TYPE__ACTUATE, oldActuate, ACTUATE_EDEFAULT, oldActuateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetActuate() {
		return actuateESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getAnnotations() {
		return annotations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAnnotations(Object newAnnotations) {
		Object oldAnnotations = annotations;
		annotations = newAnnotations;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.QANDAENTRY_TYPE__ANNOTATIONS, oldAnnotations, annotations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getArch() {
		return arch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setArch(Object newArch) {
		Object oldArch = arch;
		arch = newArch;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.QANDAENTRY_TYPE__ARCH, oldArch, arch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getArcrole() {
		return arcrole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setArcrole(Object newArcrole) {
		Object oldArcrole = arcrole;
		arcrole = newArcrole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.QANDAENTRY_TYPE__ARCROLE, oldArcrole, arcrole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getAudience() {
		return audience;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAudience(Object newAudience) {
		Object oldAudience = audience;
		audience = newAudience;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.QANDAENTRY_TYPE__AUDIENCE, oldAudience, audience));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getBase() {
		return base;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBase(Object newBase) {
		Object oldBase = base;
		base = newBase;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.QANDAENTRY_TYPE__BASE, oldBase, base));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getCondition() {
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCondition(Object newCondition) {
		Object oldCondition = condition;
		condition = newCondition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.QANDAENTRY_TYPE__CONDITION, oldCondition, condition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getConformance() {
		return conformance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConformance(Object newConformance) {
		Object oldConformance = conformance;
		conformance = newConformance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.QANDAENTRY_TYPE__CONFORMANCE, oldConformance, conformance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DirType getDir() {
		return dir;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDir(DirType newDir) {
		DirType oldDir = dir;
		dir = newDir == null ? DIR_EDEFAULT : newDir;
		boolean oldDirESet = dirESet;
		dirESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.QANDAENTRY_TYPE__DIR, oldDir, dir, !oldDirESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetDir() {
		DirType oldDir = dir;
		boolean oldDirESet = dirESet;
		dir = DIR_EDEFAULT;
		dirESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DocbookPackage.QANDAENTRY_TYPE__DIR, oldDir, DIR_EDEFAULT, oldDirESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetDir() {
		return dirESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getHref() {
		return href;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHref(Object newHref) {
		Object oldHref = href;
		href = newHref;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.QANDAENTRY_TYPE__HREF, oldHref, href));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.QANDAENTRY_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getLang() {
		return lang;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLang(Object newLang) {
		Object oldLang = lang;
		lang = newLang;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.QANDAENTRY_TYPE__LANG, oldLang, lang));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLinkend() {
		return linkend;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLinkend(String newLinkend) {
		String oldLinkend = linkend;
		linkend = newLinkend;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.QANDAENTRY_TYPE__LINKEND, oldLinkend, linkend));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getOs() {
		return os;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOs(Object newOs) {
		Object oldOs = os;
		os = newOs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.QANDAENTRY_TYPE__OS, oldOs, os));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getRemap() {
		return remap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRemap(Object newRemap) {
		Object oldRemap = remap;
		remap = newRemap;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.QANDAENTRY_TYPE__REMAP, oldRemap, remap));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getRevision() {
		return revision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRevision(Object newRevision) {
		Object oldRevision = revision;
		revision = newRevision;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.QANDAENTRY_TYPE__REVISION, oldRevision, revision));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RevisionflagType getRevisionflag() {
		return revisionflag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRevisionflag(RevisionflagType newRevisionflag) {
		RevisionflagType oldRevisionflag = revisionflag;
		revisionflag = newRevisionflag == null ? REVISIONFLAG_EDEFAULT : newRevisionflag;
		boolean oldRevisionflagESet = revisionflagESet;
		revisionflagESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.QANDAENTRY_TYPE__REVISIONFLAG, oldRevisionflag, revisionflag, !oldRevisionflagESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetRevisionflag() {
		RevisionflagType oldRevisionflag = revisionflag;
		boolean oldRevisionflagESet = revisionflagESet;
		revisionflag = REVISIONFLAG_EDEFAULT;
		revisionflagESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DocbookPackage.QANDAENTRY_TYPE__REVISIONFLAG, oldRevisionflag, REVISIONFLAG_EDEFAULT, oldRevisionflagESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetRevisionflag() {
		return revisionflagESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getRole() {
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRole(Object newRole) {
		Object oldRole = role;
		role = newRole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.QANDAENTRY_TYPE__ROLE, oldRole, role));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getRole1() {
		return role1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRole1(Object newRole1) {
		Object oldRole1 = role1;
		role1 = newRole1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.QANDAENTRY_TYPE__ROLE1, oldRole1, role1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getSecurity() {
		return security;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSecurity(Object newSecurity) {
		Object oldSecurity = security;
		security = newSecurity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.QANDAENTRY_TYPE__SECURITY, oldSecurity, security));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ShowType getShow() {
		return show;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShow(ShowType newShow) {
		ShowType oldShow = show;
		show = newShow == null ? SHOW_EDEFAULT : newShow;
		boolean oldShowESet = showESet;
		showESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.QANDAENTRY_TYPE__SHOW, oldShow, show, !oldShowESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetShow() {
		ShowType oldShow = show;
		boolean oldShowESet = showESet;
		show = SHOW_EDEFAULT;
		showESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DocbookPackage.QANDAENTRY_TYPE__SHOW, oldShow, SHOW_EDEFAULT, oldShowESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetShow() {
		return showESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getTitle1() {
		return title1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTitle1(Object newTitle1) {
		Object oldTitle1 = title1;
		title1 = newTitle1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.QANDAENTRY_TYPE__TITLE1, oldTitle1, title1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(Object newType) {
		Object oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.QANDAENTRY_TYPE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getUserlevel() {
		return userlevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUserlevel(Object newUserlevel) {
		Object oldUserlevel = userlevel;
		userlevel = newUserlevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.QANDAENTRY_TYPE__USERLEVEL, oldUserlevel, userlevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getVendor() {
		return vendor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVendor(Object newVendor) {
		Object oldVendor = vendor;
		vendor = newVendor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.QANDAENTRY_TYPE__VENDOR, oldVendor, vendor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVersion(Object newVersion) {
		Object oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.QANDAENTRY_TYPE__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getWordsize() {
		return wordsize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWordsize(Object newWordsize) {
		Object oldWordsize = wordsize;
		wordsize = newWordsize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.QANDAENTRY_TYPE__WORDSIZE, oldWordsize, wordsize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getXreflabel() {
		return xreflabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setXreflabel(Object newXreflabel) {
		Object oldXreflabel = xreflabel;
		xreflabel = newXreflabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.QANDAENTRY_TYPE__XREFLABEL, oldXreflabel, xreflabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DocbookPackage.QANDAENTRY_TYPE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case DocbookPackage.QANDAENTRY_TYPE__TITLE:
				return ((InternalEList<?>)getTitle()).basicRemove(otherEnd, msgs);
			case DocbookPackage.QANDAENTRY_TYPE__TITLEABBREV:
				return ((InternalEList<?>)getTitleabbrev()).basicRemove(otherEnd, msgs);
			case DocbookPackage.QANDAENTRY_TYPE__INFO:
				return basicSetInfo(null, msgs);
			case DocbookPackage.QANDAENTRY_TYPE__QUESTION:
				return basicSetQuestion(null, msgs);
			case DocbookPackage.QANDAENTRY_TYPE__ANSWER:
				return ((InternalEList<?>)getAnswer()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DocbookPackage.QANDAENTRY_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case DocbookPackage.QANDAENTRY_TYPE__TITLE:
				return getTitle();
			case DocbookPackage.QANDAENTRY_TYPE__TITLEABBREV:
				return getTitleabbrev();
			case DocbookPackage.QANDAENTRY_TYPE__INFO:
				return getInfo();
			case DocbookPackage.QANDAENTRY_TYPE__QUESTION:
				return getQuestion();
			case DocbookPackage.QANDAENTRY_TYPE__ANSWER:
				return getAnswer();
			case DocbookPackage.QANDAENTRY_TYPE__ACTUATE:
				return getActuate();
			case DocbookPackage.QANDAENTRY_TYPE__ANNOTATIONS:
				return getAnnotations();
			case DocbookPackage.QANDAENTRY_TYPE__ARCH:
				return getArch();
			case DocbookPackage.QANDAENTRY_TYPE__ARCROLE:
				return getArcrole();
			case DocbookPackage.QANDAENTRY_TYPE__AUDIENCE:
				return getAudience();
			case DocbookPackage.QANDAENTRY_TYPE__BASE:
				return getBase();
			case DocbookPackage.QANDAENTRY_TYPE__CONDITION:
				return getCondition();
			case DocbookPackage.QANDAENTRY_TYPE__CONFORMANCE:
				return getConformance();
			case DocbookPackage.QANDAENTRY_TYPE__DIR:
				return getDir();
			case DocbookPackage.QANDAENTRY_TYPE__HREF:
				return getHref();
			case DocbookPackage.QANDAENTRY_TYPE__ID:
				return getId();
			case DocbookPackage.QANDAENTRY_TYPE__LANG:
				return getLang();
			case DocbookPackage.QANDAENTRY_TYPE__LINKEND:
				return getLinkend();
			case DocbookPackage.QANDAENTRY_TYPE__OS:
				return getOs();
			case DocbookPackage.QANDAENTRY_TYPE__REMAP:
				return getRemap();
			case DocbookPackage.QANDAENTRY_TYPE__REVISION:
				return getRevision();
			case DocbookPackage.QANDAENTRY_TYPE__REVISIONFLAG:
				return getRevisionflag();
			case DocbookPackage.QANDAENTRY_TYPE__ROLE:
				return getRole();
			case DocbookPackage.QANDAENTRY_TYPE__ROLE1:
				return getRole1();
			case DocbookPackage.QANDAENTRY_TYPE__SECURITY:
				return getSecurity();
			case DocbookPackage.QANDAENTRY_TYPE__SHOW:
				return getShow();
			case DocbookPackage.QANDAENTRY_TYPE__TITLE1:
				return getTitle1();
			case DocbookPackage.QANDAENTRY_TYPE__TYPE:
				return getType();
			case DocbookPackage.QANDAENTRY_TYPE__USERLEVEL:
				return getUserlevel();
			case DocbookPackage.QANDAENTRY_TYPE__VENDOR:
				return getVendor();
			case DocbookPackage.QANDAENTRY_TYPE__VERSION:
				return getVersion();
			case DocbookPackage.QANDAENTRY_TYPE__WORDSIZE:
				return getWordsize();
			case DocbookPackage.QANDAENTRY_TYPE__XREFLABEL:
				return getXreflabel();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DocbookPackage.QANDAENTRY_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case DocbookPackage.QANDAENTRY_TYPE__TITLE:
				getTitle().clear();
				getTitle().addAll((Collection<? extends TitleType>)newValue);
				return;
			case DocbookPackage.QANDAENTRY_TYPE__TITLEABBREV:
				getTitleabbrev().clear();
				getTitleabbrev().addAll((Collection<? extends TitleabbrevType>)newValue);
				return;
			case DocbookPackage.QANDAENTRY_TYPE__INFO:
				setInfo((InfoType)newValue);
				return;
			case DocbookPackage.QANDAENTRY_TYPE__QUESTION:
				setQuestion((QuestionType)newValue);
				return;
			case DocbookPackage.QANDAENTRY_TYPE__ANSWER:
				getAnswer().clear();
				getAnswer().addAll((Collection<? extends AnswerType>)newValue);
				return;
			case DocbookPackage.QANDAENTRY_TYPE__ACTUATE:
				setActuate((ActuateType)newValue);
				return;
			case DocbookPackage.QANDAENTRY_TYPE__ANNOTATIONS:
				setAnnotations(newValue);
				return;
			case DocbookPackage.QANDAENTRY_TYPE__ARCH:
				setArch(newValue);
				return;
			case DocbookPackage.QANDAENTRY_TYPE__ARCROLE:
				setArcrole(newValue);
				return;
			case DocbookPackage.QANDAENTRY_TYPE__AUDIENCE:
				setAudience(newValue);
				return;
			case DocbookPackage.QANDAENTRY_TYPE__BASE:
				setBase(newValue);
				return;
			case DocbookPackage.QANDAENTRY_TYPE__CONDITION:
				setCondition(newValue);
				return;
			case DocbookPackage.QANDAENTRY_TYPE__CONFORMANCE:
				setConformance(newValue);
				return;
			case DocbookPackage.QANDAENTRY_TYPE__DIR:
				setDir((DirType)newValue);
				return;
			case DocbookPackage.QANDAENTRY_TYPE__HREF:
				setHref(newValue);
				return;
			case DocbookPackage.QANDAENTRY_TYPE__ID:
				setId((String)newValue);
				return;
			case DocbookPackage.QANDAENTRY_TYPE__LANG:
				setLang(newValue);
				return;
			case DocbookPackage.QANDAENTRY_TYPE__LINKEND:
				setLinkend((String)newValue);
				return;
			case DocbookPackage.QANDAENTRY_TYPE__OS:
				setOs(newValue);
				return;
			case DocbookPackage.QANDAENTRY_TYPE__REMAP:
				setRemap(newValue);
				return;
			case DocbookPackage.QANDAENTRY_TYPE__REVISION:
				setRevision(newValue);
				return;
			case DocbookPackage.QANDAENTRY_TYPE__REVISIONFLAG:
				setRevisionflag((RevisionflagType)newValue);
				return;
			case DocbookPackage.QANDAENTRY_TYPE__ROLE:
				setRole(newValue);
				return;
			case DocbookPackage.QANDAENTRY_TYPE__ROLE1:
				setRole1(newValue);
				return;
			case DocbookPackage.QANDAENTRY_TYPE__SECURITY:
				setSecurity(newValue);
				return;
			case DocbookPackage.QANDAENTRY_TYPE__SHOW:
				setShow((ShowType)newValue);
				return;
			case DocbookPackage.QANDAENTRY_TYPE__TITLE1:
				setTitle1(newValue);
				return;
			case DocbookPackage.QANDAENTRY_TYPE__TYPE:
				setType(newValue);
				return;
			case DocbookPackage.QANDAENTRY_TYPE__USERLEVEL:
				setUserlevel(newValue);
				return;
			case DocbookPackage.QANDAENTRY_TYPE__VENDOR:
				setVendor(newValue);
				return;
			case DocbookPackage.QANDAENTRY_TYPE__VERSION:
				setVersion(newValue);
				return;
			case DocbookPackage.QANDAENTRY_TYPE__WORDSIZE:
				setWordsize(newValue);
				return;
			case DocbookPackage.QANDAENTRY_TYPE__XREFLABEL:
				setXreflabel(newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case DocbookPackage.QANDAENTRY_TYPE__GROUP:
				getGroup().clear();
				return;
			case DocbookPackage.QANDAENTRY_TYPE__TITLE:
				getTitle().clear();
				return;
			case DocbookPackage.QANDAENTRY_TYPE__TITLEABBREV:
				getTitleabbrev().clear();
				return;
			case DocbookPackage.QANDAENTRY_TYPE__INFO:
				setInfo((InfoType)null);
				return;
			case DocbookPackage.QANDAENTRY_TYPE__QUESTION:
				setQuestion((QuestionType)null);
				return;
			case DocbookPackage.QANDAENTRY_TYPE__ANSWER:
				getAnswer().clear();
				return;
			case DocbookPackage.QANDAENTRY_TYPE__ACTUATE:
				unsetActuate();
				return;
			case DocbookPackage.QANDAENTRY_TYPE__ANNOTATIONS:
				setAnnotations(ANNOTATIONS_EDEFAULT);
				return;
			case DocbookPackage.QANDAENTRY_TYPE__ARCH:
				setArch(ARCH_EDEFAULT);
				return;
			case DocbookPackage.QANDAENTRY_TYPE__ARCROLE:
				setArcrole(ARCROLE_EDEFAULT);
				return;
			case DocbookPackage.QANDAENTRY_TYPE__AUDIENCE:
				setAudience(AUDIENCE_EDEFAULT);
				return;
			case DocbookPackage.QANDAENTRY_TYPE__BASE:
				setBase(BASE_EDEFAULT);
				return;
			case DocbookPackage.QANDAENTRY_TYPE__CONDITION:
				setCondition(CONDITION_EDEFAULT);
				return;
			case DocbookPackage.QANDAENTRY_TYPE__CONFORMANCE:
				setConformance(CONFORMANCE_EDEFAULT);
				return;
			case DocbookPackage.QANDAENTRY_TYPE__DIR:
				unsetDir();
				return;
			case DocbookPackage.QANDAENTRY_TYPE__HREF:
				setHref(HREF_EDEFAULT);
				return;
			case DocbookPackage.QANDAENTRY_TYPE__ID:
				setId(ID_EDEFAULT);
				return;
			case DocbookPackage.QANDAENTRY_TYPE__LANG:
				setLang(LANG_EDEFAULT);
				return;
			case DocbookPackage.QANDAENTRY_TYPE__LINKEND:
				setLinkend(LINKEND_EDEFAULT);
				return;
			case DocbookPackage.QANDAENTRY_TYPE__OS:
				setOs(OS_EDEFAULT);
				return;
			case DocbookPackage.QANDAENTRY_TYPE__REMAP:
				setRemap(REMAP_EDEFAULT);
				return;
			case DocbookPackage.QANDAENTRY_TYPE__REVISION:
				setRevision(REVISION_EDEFAULT);
				return;
			case DocbookPackage.QANDAENTRY_TYPE__REVISIONFLAG:
				unsetRevisionflag();
				return;
			case DocbookPackage.QANDAENTRY_TYPE__ROLE:
				setRole(ROLE_EDEFAULT);
				return;
			case DocbookPackage.QANDAENTRY_TYPE__ROLE1:
				setRole1(ROLE1_EDEFAULT);
				return;
			case DocbookPackage.QANDAENTRY_TYPE__SECURITY:
				setSecurity(SECURITY_EDEFAULT);
				return;
			case DocbookPackage.QANDAENTRY_TYPE__SHOW:
				unsetShow();
				return;
			case DocbookPackage.QANDAENTRY_TYPE__TITLE1:
				setTitle1(TITLE1_EDEFAULT);
				return;
			case DocbookPackage.QANDAENTRY_TYPE__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case DocbookPackage.QANDAENTRY_TYPE__USERLEVEL:
				setUserlevel(USERLEVEL_EDEFAULT);
				return;
			case DocbookPackage.QANDAENTRY_TYPE__VENDOR:
				setVendor(VENDOR_EDEFAULT);
				return;
			case DocbookPackage.QANDAENTRY_TYPE__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case DocbookPackage.QANDAENTRY_TYPE__WORDSIZE:
				setWordsize(WORDSIZE_EDEFAULT);
				return;
			case DocbookPackage.QANDAENTRY_TYPE__XREFLABEL:
				setXreflabel(XREFLABEL_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case DocbookPackage.QANDAENTRY_TYPE__GROUP:
				return group != null && !group.isEmpty();
			case DocbookPackage.QANDAENTRY_TYPE__TITLE:
				return !getTitle().isEmpty();
			case DocbookPackage.QANDAENTRY_TYPE__TITLEABBREV:
				return !getTitleabbrev().isEmpty();
			case DocbookPackage.QANDAENTRY_TYPE__INFO:
				return info != null;
			case DocbookPackage.QANDAENTRY_TYPE__QUESTION:
				return question != null;
			case DocbookPackage.QANDAENTRY_TYPE__ANSWER:
				return answer != null && !answer.isEmpty();
			case DocbookPackage.QANDAENTRY_TYPE__ACTUATE:
				return isSetActuate();
			case DocbookPackage.QANDAENTRY_TYPE__ANNOTATIONS:
				return ANNOTATIONS_EDEFAULT == null ? annotations != null : !ANNOTATIONS_EDEFAULT.equals(annotations);
			case DocbookPackage.QANDAENTRY_TYPE__ARCH:
				return ARCH_EDEFAULT == null ? arch != null : !ARCH_EDEFAULT.equals(arch);
			case DocbookPackage.QANDAENTRY_TYPE__ARCROLE:
				return ARCROLE_EDEFAULT == null ? arcrole != null : !ARCROLE_EDEFAULT.equals(arcrole);
			case DocbookPackage.QANDAENTRY_TYPE__AUDIENCE:
				return AUDIENCE_EDEFAULT == null ? audience != null : !AUDIENCE_EDEFAULT.equals(audience);
			case DocbookPackage.QANDAENTRY_TYPE__BASE:
				return BASE_EDEFAULT == null ? base != null : !BASE_EDEFAULT.equals(base);
			case DocbookPackage.QANDAENTRY_TYPE__CONDITION:
				return CONDITION_EDEFAULT == null ? condition != null : !CONDITION_EDEFAULT.equals(condition);
			case DocbookPackage.QANDAENTRY_TYPE__CONFORMANCE:
				return CONFORMANCE_EDEFAULT == null ? conformance != null : !CONFORMANCE_EDEFAULT.equals(conformance);
			case DocbookPackage.QANDAENTRY_TYPE__DIR:
				return isSetDir();
			case DocbookPackage.QANDAENTRY_TYPE__HREF:
				return HREF_EDEFAULT == null ? href != null : !HREF_EDEFAULT.equals(href);
			case DocbookPackage.QANDAENTRY_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case DocbookPackage.QANDAENTRY_TYPE__LANG:
				return LANG_EDEFAULT == null ? lang != null : !LANG_EDEFAULT.equals(lang);
			case DocbookPackage.QANDAENTRY_TYPE__LINKEND:
				return LINKEND_EDEFAULT == null ? linkend != null : !LINKEND_EDEFAULT.equals(linkend);
			case DocbookPackage.QANDAENTRY_TYPE__OS:
				return OS_EDEFAULT == null ? os != null : !OS_EDEFAULT.equals(os);
			case DocbookPackage.QANDAENTRY_TYPE__REMAP:
				return REMAP_EDEFAULT == null ? remap != null : !REMAP_EDEFAULT.equals(remap);
			case DocbookPackage.QANDAENTRY_TYPE__REVISION:
				return REVISION_EDEFAULT == null ? revision != null : !REVISION_EDEFAULT.equals(revision);
			case DocbookPackage.QANDAENTRY_TYPE__REVISIONFLAG:
				return isSetRevisionflag();
			case DocbookPackage.QANDAENTRY_TYPE__ROLE:
				return ROLE_EDEFAULT == null ? role != null : !ROLE_EDEFAULT.equals(role);
			case DocbookPackage.QANDAENTRY_TYPE__ROLE1:
				return ROLE1_EDEFAULT == null ? role1 != null : !ROLE1_EDEFAULT.equals(role1);
			case DocbookPackage.QANDAENTRY_TYPE__SECURITY:
				return SECURITY_EDEFAULT == null ? security != null : !SECURITY_EDEFAULT.equals(security);
			case DocbookPackage.QANDAENTRY_TYPE__SHOW:
				return isSetShow();
			case DocbookPackage.QANDAENTRY_TYPE__TITLE1:
				return TITLE1_EDEFAULT == null ? title1 != null : !TITLE1_EDEFAULT.equals(title1);
			case DocbookPackage.QANDAENTRY_TYPE__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case DocbookPackage.QANDAENTRY_TYPE__USERLEVEL:
				return USERLEVEL_EDEFAULT == null ? userlevel != null : !USERLEVEL_EDEFAULT.equals(userlevel);
			case DocbookPackage.QANDAENTRY_TYPE__VENDOR:
				return VENDOR_EDEFAULT == null ? vendor != null : !VENDOR_EDEFAULT.equals(vendor);
			case DocbookPackage.QANDAENTRY_TYPE__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
			case DocbookPackage.QANDAENTRY_TYPE__WORDSIZE:
				return WORDSIZE_EDEFAULT == null ? wordsize != null : !WORDSIZE_EDEFAULT.equals(wordsize);
			case DocbookPackage.QANDAENTRY_TYPE__XREFLABEL:
				return XREFLABEL_EDEFAULT == null ? xreflabel != null : !XREFLABEL_EDEFAULT.equals(xreflabel);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (group: ");
		result.append(group);
		result.append(", actuate: ");
		if (actuateESet) result.append(actuate); else result.append("<unset>");
		result.append(", annotations: ");
		result.append(annotations);
		result.append(", arch: ");
		result.append(arch);
		result.append(", arcrole: ");
		result.append(arcrole);
		result.append(", audience: ");
		result.append(audience);
		result.append(", base: ");
		result.append(base);
		result.append(", condition: ");
		result.append(condition);
		result.append(", conformance: ");
		result.append(conformance);
		result.append(", dir: ");
		if (dirESet) result.append(dir); else result.append("<unset>");
		result.append(", href: ");
		result.append(href);
		result.append(", id: ");
		result.append(id);
		result.append(", lang: ");
		result.append(lang);
		result.append(", linkend: ");
		result.append(linkend);
		result.append(", os: ");
		result.append(os);
		result.append(", remap: ");
		result.append(remap);
		result.append(", revision: ");
		result.append(revision);
		result.append(", revisionflag: ");
		if (revisionflagESet) result.append(revisionflag); else result.append("<unset>");
		result.append(", role: ");
		result.append(role);
		result.append(", role1: ");
		result.append(role1);
		result.append(", security: ");
		result.append(security);
		result.append(", show: ");
		if (showESet) result.append(show); else result.append("<unset>");
		result.append(", title1: ");
		result.append(title1);
		result.append(", type: ");
		result.append(type);
		result.append(", userlevel: ");
		result.append(userlevel);
		result.append(", vendor: ");
		result.append(vendor);
		result.append(", version: ");
		result.append(version);
		result.append(", wordsize: ");
		result.append(wordsize);
		result.append(", xreflabel: ");
		result.append(xreflabel);
		result.append(')');
		return result.toString();
	}

} //QandaentryTypeImpl
