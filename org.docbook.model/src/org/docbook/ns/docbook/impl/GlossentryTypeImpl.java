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

import org.docbook.ns.docbook.AbbrevType;
import org.docbook.ns.docbook.AcronymType;
import org.docbook.ns.docbook.DirType;
import org.docbook.ns.docbook.DocbookPackage;
import org.docbook.ns.docbook.GlossdefType;
import org.docbook.ns.docbook.GlossentryType;
import org.docbook.ns.docbook.GlossseeType;
import org.docbook.ns.docbook.GlosstermType;
import org.docbook.ns.docbook.IndextermType;
import org.docbook.ns.docbook.RevisionflagType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.w3._1999.xlink.ActuateType;
import org.w3._1999.xlink.ShowType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Glossentry Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.docbook.ns.docbook.impl.GlossentryTypeImpl#getGlossterm <em>Glossterm</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.GlossentryTypeImpl#getAcronym <em>Acronym</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.GlossentryTypeImpl#getAbbrev <em>Abbrev</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.GlossentryTypeImpl#getIndexterm <em>Indexterm</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.GlossentryTypeImpl#getGlosssee <em>Glosssee</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.GlossentryTypeImpl#getGlossdef <em>Glossdef</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.GlossentryTypeImpl#getActuate <em>Actuate</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.GlossentryTypeImpl#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.GlossentryTypeImpl#getArch <em>Arch</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.GlossentryTypeImpl#getArcrole <em>Arcrole</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.GlossentryTypeImpl#getAudience <em>Audience</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.GlossentryTypeImpl#getBase <em>Base</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.GlossentryTypeImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.GlossentryTypeImpl#getConformance <em>Conformance</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.GlossentryTypeImpl#getDir <em>Dir</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.GlossentryTypeImpl#getHref <em>Href</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.GlossentryTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.GlossentryTypeImpl#getLang <em>Lang</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.GlossentryTypeImpl#getLinkend <em>Linkend</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.GlossentryTypeImpl#getOs <em>Os</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.GlossentryTypeImpl#getRemap <em>Remap</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.GlossentryTypeImpl#getRevision <em>Revision</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.GlossentryTypeImpl#getRevisionflag <em>Revisionflag</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.GlossentryTypeImpl#getRole <em>Role</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.GlossentryTypeImpl#getRole1 <em>Role1</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.GlossentryTypeImpl#getSecurity <em>Security</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.GlossentryTypeImpl#getShow <em>Show</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.GlossentryTypeImpl#getSortas <em>Sortas</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.GlossentryTypeImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.GlossentryTypeImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.GlossentryTypeImpl#getUserlevel <em>Userlevel</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.GlossentryTypeImpl#getVendor <em>Vendor</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.GlossentryTypeImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.GlossentryTypeImpl#getWordsize <em>Wordsize</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.GlossentryTypeImpl#getXreflabel <em>Xreflabel</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GlossentryTypeImpl extends MinimalEObjectImpl.Container implements GlossentryType {
	/**
	 * The cached value of the '{@link #getGlossterm() <em>Glossterm</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlossterm()
	 * @generated
	 * @ordered
	 */
	protected GlosstermType glossterm;

	/**
	 * The cached value of the '{@link #getAcronym() <em>Acronym</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAcronym()
	 * @generated
	 * @ordered
	 */
	protected AcronymType acronym;

	/**
	 * The cached value of the '{@link #getAbbrev() <em>Abbrev</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbbrev()
	 * @generated
	 * @ordered
	 */
	protected AbbrevType abbrev;

	/**
	 * The cached value of the '{@link #getIndexterm() <em>Indexterm</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndexterm()
	 * @generated
	 * @ordered
	 */
	protected EList<IndextermType> indexterm;

	/**
	 * The cached value of the '{@link #getGlosssee() <em>Glosssee</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlosssee()
	 * @generated
	 * @ordered
	 */
	protected GlossseeType glosssee;

	/**
	 * The cached value of the '{@link #getGlossdef() <em>Glossdef</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlossdef()
	 * @generated
	 * @ordered
	 */
	protected EList<GlossdefType> glossdef;

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
	 * The default value of the '{@link #getSortas() <em>Sortas</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSortas()
	 * @generated
	 * @ordered
	 */
	protected static final Object SORTAS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSortas() <em>Sortas</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSortas()
	 * @generated
	 * @ordered
	 */
	protected Object sortas = SORTAS_EDEFAULT;

	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final Object TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected Object title = TITLE_EDEFAULT;

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
	protected GlossentryTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DocbookPackage.eINSTANCE.getGlossentryType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GlosstermType getGlossterm() {
		return glossterm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGlossterm(GlosstermType newGlossterm, NotificationChain msgs) {
		GlosstermType oldGlossterm = glossterm;
		glossterm = newGlossterm;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DocbookPackage.GLOSSENTRY_TYPE__GLOSSTERM, oldGlossterm, newGlossterm);
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
	public void setGlossterm(GlosstermType newGlossterm) {
		if (newGlossterm != glossterm) {
			NotificationChain msgs = null;
			if (glossterm != null)
				msgs = ((InternalEObject)glossterm).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DocbookPackage.GLOSSENTRY_TYPE__GLOSSTERM, null, msgs);
			if (newGlossterm != null)
				msgs = ((InternalEObject)newGlossterm).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DocbookPackage.GLOSSENTRY_TYPE__GLOSSTERM, null, msgs);
			msgs = basicSetGlossterm(newGlossterm, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.GLOSSENTRY_TYPE__GLOSSTERM, newGlossterm, newGlossterm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AcronymType getAcronym() {
		return acronym;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAcronym(AcronymType newAcronym, NotificationChain msgs) {
		AcronymType oldAcronym = acronym;
		acronym = newAcronym;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DocbookPackage.GLOSSENTRY_TYPE__ACRONYM, oldAcronym, newAcronym);
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
	public void setAcronym(AcronymType newAcronym) {
		if (newAcronym != acronym) {
			NotificationChain msgs = null;
			if (acronym != null)
				msgs = ((InternalEObject)acronym).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DocbookPackage.GLOSSENTRY_TYPE__ACRONYM, null, msgs);
			if (newAcronym != null)
				msgs = ((InternalEObject)newAcronym).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DocbookPackage.GLOSSENTRY_TYPE__ACRONYM, null, msgs);
			msgs = basicSetAcronym(newAcronym, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.GLOSSENTRY_TYPE__ACRONYM, newAcronym, newAcronym));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbbrevType getAbbrev() {
		return abbrev;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbbrev(AbbrevType newAbbrev, NotificationChain msgs) {
		AbbrevType oldAbbrev = abbrev;
		abbrev = newAbbrev;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DocbookPackage.GLOSSENTRY_TYPE__ABBREV, oldAbbrev, newAbbrev);
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
	public void setAbbrev(AbbrevType newAbbrev) {
		if (newAbbrev != abbrev) {
			NotificationChain msgs = null;
			if (abbrev != null)
				msgs = ((InternalEObject)abbrev).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DocbookPackage.GLOSSENTRY_TYPE__ABBREV, null, msgs);
			if (newAbbrev != null)
				msgs = ((InternalEObject)newAbbrev).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DocbookPackage.GLOSSENTRY_TYPE__ABBREV, null, msgs);
			msgs = basicSetAbbrev(newAbbrev, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.GLOSSENTRY_TYPE__ABBREV, newAbbrev, newAbbrev));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<IndextermType> getIndexterm() {
		if (indexterm == null) {
			indexterm = new EObjectContainmentEList<IndextermType>(IndextermType.class, this, DocbookPackage.GLOSSENTRY_TYPE__INDEXTERM);
		}
		return indexterm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GlossseeType getGlosssee() {
		return glosssee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGlosssee(GlossseeType newGlosssee, NotificationChain msgs) {
		GlossseeType oldGlosssee = glosssee;
		glosssee = newGlosssee;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DocbookPackage.GLOSSENTRY_TYPE__GLOSSSEE, oldGlosssee, newGlosssee);
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
	public void setGlosssee(GlossseeType newGlosssee) {
		if (newGlosssee != glosssee) {
			NotificationChain msgs = null;
			if (glosssee != null)
				msgs = ((InternalEObject)glosssee).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DocbookPackage.GLOSSENTRY_TYPE__GLOSSSEE, null, msgs);
			if (newGlosssee != null)
				msgs = ((InternalEObject)newGlosssee).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DocbookPackage.GLOSSENTRY_TYPE__GLOSSSEE, null, msgs);
			msgs = basicSetGlosssee(newGlosssee, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.GLOSSENTRY_TYPE__GLOSSSEE, newGlosssee, newGlosssee));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<GlossdefType> getGlossdef() {
		if (glossdef == null) {
			glossdef = new EObjectContainmentEList<GlossdefType>(GlossdefType.class, this, DocbookPackage.GLOSSENTRY_TYPE__GLOSSDEF);
		}
		return glossdef;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.GLOSSENTRY_TYPE__ACTUATE, oldActuate, actuate, !oldActuateESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, DocbookPackage.GLOSSENTRY_TYPE__ACTUATE, oldActuate, ACTUATE_EDEFAULT, oldActuateESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.GLOSSENTRY_TYPE__ANNOTATIONS, oldAnnotations, annotations));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.GLOSSENTRY_TYPE__ARCH, oldArch, arch));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.GLOSSENTRY_TYPE__ARCROLE, oldArcrole, arcrole));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.GLOSSENTRY_TYPE__AUDIENCE, oldAudience, audience));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.GLOSSENTRY_TYPE__BASE, oldBase, base));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.GLOSSENTRY_TYPE__CONDITION, oldCondition, condition));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.GLOSSENTRY_TYPE__CONFORMANCE, oldConformance, conformance));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.GLOSSENTRY_TYPE__DIR, oldDir, dir, !oldDirESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, DocbookPackage.GLOSSENTRY_TYPE__DIR, oldDir, DIR_EDEFAULT, oldDirESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.GLOSSENTRY_TYPE__HREF, oldHref, href));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.GLOSSENTRY_TYPE__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.GLOSSENTRY_TYPE__LANG, oldLang, lang));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.GLOSSENTRY_TYPE__LINKEND, oldLinkend, linkend));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.GLOSSENTRY_TYPE__OS, oldOs, os));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.GLOSSENTRY_TYPE__REMAP, oldRemap, remap));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.GLOSSENTRY_TYPE__REVISION, oldRevision, revision));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.GLOSSENTRY_TYPE__REVISIONFLAG, oldRevisionflag, revisionflag, !oldRevisionflagESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, DocbookPackage.GLOSSENTRY_TYPE__REVISIONFLAG, oldRevisionflag, REVISIONFLAG_EDEFAULT, oldRevisionflagESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.GLOSSENTRY_TYPE__ROLE, oldRole, role));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.GLOSSENTRY_TYPE__ROLE1, oldRole1, role1));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.GLOSSENTRY_TYPE__SECURITY, oldSecurity, security));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.GLOSSENTRY_TYPE__SHOW, oldShow, show, !oldShowESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, DocbookPackage.GLOSSENTRY_TYPE__SHOW, oldShow, SHOW_EDEFAULT, oldShowESet));
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
	public Object getSortas() {
		return sortas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSortas(Object newSortas) {
		Object oldSortas = sortas;
		sortas = newSortas;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.GLOSSENTRY_TYPE__SORTAS, oldSortas, sortas));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTitle(Object newTitle) {
		Object oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.GLOSSENTRY_TYPE__TITLE, oldTitle, title));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.GLOSSENTRY_TYPE__TYPE, oldType, type));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.GLOSSENTRY_TYPE__USERLEVEL, oldUserlevel, userlevel));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.GLOSSENTRY_TYPE__VENDOR, oldVendor, vendor));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.GLOSSENTRY_TYPE__VERSION, oldVersion, version));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.GLOSSENTRY_TYPE__WORDSIZE, oldWordsize, wordsize));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.GLOSSENTRY_TYPE__XREFLABEL, oldXreflabel, xreflabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DocbookPackage.GLOSSENTRY_TYPE__GLOSSTERM:
				return basicSetGlossterm(null, msgs);
			case DocbookPackage.GLOSSENTRY_TYPE__ACRONYM:
				return basicSetAcronym(null, msgs);
			case DocbookPackage.GLOSSENTRY_TYPE__ABBREV:
				return basicSetAbbrev(null, msgs);
			case DocbookPackage.GLOSSENTRY_TYPE__INDEXTERM:
				return ((InternalEList<?>)getIndexterm()).basicRemove(otherEnd, msgs);
			case DocbookPackage.GLOSSENTRY_TYPE__GLOSSSEE:
				return basicSetGlosssee(null, msgs);
			case DocbookPackage.GLOSSENTRY_TYPE__GLOSSDEF:
				return ((InternalEList<?>)getGlossdef()).basicRemove(otherEnd, msgs);
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
			case DocbookPackage.GLOSSENTRY_TYPE__GLOSSTERM:
				return getGlossterm();
			case DocbookPackage.GLOSSENTRY_TYPE__ACRONYM:
				return getAcronym();
			case DocbookPackage.GLOSSENTRY_TYPE__ABBREV:
				return getAbbrev();
			case DocbookPackage.GLOSSENTRY_TYPE__INDEXTERM:
				return getIndexterm();
			case DocbookPackage.GLOSSENTRY_TYPE__GLOSSSEE:
				return getGlosssee();
			case DocbookPackage.GLOSSENTRY_TYPE__GLOSSDEF:
				return getGlossdef();
			case DocbookPackage.GLOSSENTRY_TYPE__ACTUATE:
				return getActuate();
			case DocbookPackage.GLOSSENTRY_TYPE__ANNOTATIONS:
				return getAnnotations();
			case DocbookPackage.GLOSSENTRY_TYPE__ARCH:
				return getArch();
			case DocbookPackage.GLOSSENTRY_TYPE__ARCROLE:
				return getArcrole();
			case DocbookPackage.GLOSSENTRY_TYPE__AUDIENCE:
				return getAudience();
			case DocbookPackage.GLOSSENTRY_TYPE__BASE:
				return getBase();
			case DocbookPackage.GLOSSENTRY_TYPE__CONDITION:
				return getCondition();
			case DocbookPackage.GLOSSENTRY_TYPE__CONFORMANCE:
				return getConformance();
			case DocbookPackage.GLOSSENTRY_TYPE__DIR:
				return getDir();
			case DocbookPackage.GLOSSENTRY_TYPE__HREF:
				return getHref();
			case DocbookPackage.GLOSSENTRY_TYPE__ID:
				return getId();
			case DocbookPackage.GLOSSENTRY_TYPE__LANG:
				return getLang();
			case DocbookPackage.GLOSSENTRY_TYPE__LINKEND:
				return getLinkend();
			case DocbookPackage.GLOSSENTRY_TYPE__OS:
				return getOs();
			case DocbookPackage.GLOSSENTRY_TYPE__REMAP:
				return getRemap();
			case DocbookPackage.GLOSSENTRY_TYPE__REVISION:
				return getRevision();
			case DocbookPackage.GLOSSENTRY_TYPE__REVISIONFLAG:
				return getRevisionflag();
			case DocbookPackage.GLOSSENTRY_TYPE__ROLE:
				return getRole();
			case DocbookPackage.GLOSSENTRY_TYPE__ROLE1:
				return getRole1();
			case DocbookPackage.GLOSSENTRY_TYPE__SECURITY:
				return getSecurity();
			case DocbookPackage.GLOSSENTRY_TYPE__SHOW:
				return getShow();
			case DocbookPackage.GLOSSENTRY_TYPE__SORTAS:
				return getSortas();
			case DocbookPackage.GLOSSENTRY_TYPE__TITLE:
				return getTitle();
			case DocbookPackage.GLOSSENTRY_TYPE__TYPE:
				return getType();
			case DocbookPackage.GLOSSENTRY_TYPE__USERLEVEL:
				return getUserlevel();
			case DocbookPackage.GLOSSENTRY_TYPE__VENDOR:
				return getVendor();
			case DocbookPackage.GLOSSENTRY_TYPE__VERSION:
				return getVersion();
			case DocbookPackage.GLOSSENTRY_TYPE__WORDSIZE:
				return getWordsize();
			case DocbookPackage.GLOSSENTRY_TYPE__XREFLABEL:
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
			case DocbookPackage.GLOSSENTRY_TYPE__GLOSSTERM:
				setGlossterm((GlosstermType)newValue);
				return;
			case DocbookPackage.GLOSSENTRY_TYPE__ACRONYM:
				setAcronym((AcronymType)newValue);
				return;
			case DocbookPackage.GLOSSENTRY_TYPE__ABBREV:
				setAbbrev((AbbrevType)newValue);
				return;
			case DocbookPackage.GLOSSENTRY_TYPE__INDEXTERM:
				getIndexterm().clear();
				getIndexterm().addAll((Collection<? extends IndextermType>)newValue);
				return;
			case DocbookPackage.GLOSSENTRY_TYPE__GLOSSSEE:
				setGlosssee((GlossseeType)newValue);
				return;
			case DocbookPackage.GLOSSENTRY_TYPE__GLOSSDEF:
				getGlossdef().clear();
				getGlossdef().addAll((Collection<? extends GlossdefType>)newValue);
				return;
			case DocbookPackage.GLOSSENTRY_TYPE__ACTUATE:
				setActuate((ActuateType)newValue);
				return;
			case DocbookPackage.GLOSSENTRY_TYPE__ANNOTATIONS:
				setAnnotations(newValue);
				return;
			case DocbookPackage.GLOSSENTRY_TYPE__ARCH:
				setArch(newValue);
				return;
			case DocbookPackage.GLOSSENTRY_TYPE__ARCROLE:
				setArcrole(newValue);
				return;
			case DocbookPackage.GLOSSENTRY_TYPE__AUDIENCE:
				setAudience(newValue);
				return;
			case DocbookPackage.GLOSSENTRY_TYPE__BASE:
				setBase(newValue);
				return;
			case DocbookPackage.GLOSSENTRY_TYPE__CONDITION:
				setCondition(newValue);
				return;
			case DocbookPackage.GLOSSENTRY_TYPE__CONFORMANCE:
				setConformance(newValue);
				return;
			case DocbookPackage.GLOSSENTRY_TYPE__DIR:
				setDir((DirType)newValue);
				return;
			case DocbookPackage.GLOSSENTRY_TYPE__HREF:
				setHref(newValue);
				return;
			case DocbookPackage.GLOSSENTRY_TYPE__ID:
				setId((String)newValue);
				return;
			case DocbookPackage.GLOSSENTRY_TYPE__LANG:
				setLang(newValue);
				return;
			case DocbookPackage.GLOSSENTRY_TYPE__LINKEND:
				setLinkend((String)newValue);
				return;
			case DocbookPackage.GLOSSENTRY_TYPE__OS:
				setOs(newValue);
				return;
			case DocbookPackage.GLOSSENTRY_TYPE__REMAP:
				setRemap(newValue);
				return;
			case DocbookPackage.GLOSSENTRY_TYPE__REVISION:
				setRevision(newValue);
				return;
			case DocbookPackage.GLOSSENTRY_TYPE__REVISIONFLAG:
				setRevisionflag((RevisionflagType)newValue);
				return;
			case DocbookPackage.GLOSSENTRY_TYPE__ROLE:
				setRole(newValue);
				return;
			case DocbookPackage.GLOSSENTRY_TYPE__ROLE1:
				setRole1(newValue);
				return;
			case DocbookPackage.GLOSSENTRY_TYPE__SECURITY:
				setSecurity(newValue);
				return;
			case DocbookPackage.GLOSSENTRY_TYPE__SHOW:
				setShow((ShowType)newValue);
				return;
			case DocbookPackage.GLOSSENTRY_TYPE__SORTAS:
				setSortas(newValue);
				return;
			case DocbookPackage.GLOSSENTRY_TYPE__TITLE:
				setTitle(newValue);
				return;
			case DocbookPackage.GLOSSENTRY_TYPE__TYPE:
				setType(newValue);
				return;
			case DocbookPackage.GLOSSENTRY_TYPE__USERLEVEL:
				setUserlevel(newValue);
				return;
			case DocbookPackage.GLOSSENTRY_TYPE__VENDOR:
				setVendor(newValue);
				return;
			case DocbookPackage.GLOSSENTRY_TYPE__VERSION:
				setVersion(newValue);
				return;
			case DocbookPackage.GLOSSENTRY_TYPE__WORDSIZE:
				setWordsize(newValue);
				return;
			case DocbookPackage.GLOSSENTRY_TYPE__XREFLABEL:
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
			case DocbookPackage.GLOSSENTRY_TYPE__GLOSSTERM:
				setGlossterm((GlosstermType)null);
				return;
			case DocbookPackage.GLOSSENTRY_TYPE__ACRONYM:
				setAcronym((AcronymType)null);
				return;
			case DocbookPackage.GLOSSENTRY_TYPE__ABBREV:
				setAbbrev((AbbrevType)null);
				return;
			case DocbookPackage.GLOSSENTRY_TYPE__INDEXTERM:
				getIndexterm().clear();
				return;
			case DocbookPackage.GLOSSENTRY_TYPE__GLOSSSEE:
				setGlosssee((GlossseeType)null);
				return;
			case DocbookPackage.GLOSSENTRY_TYPE__GLOSSDEF:
				getGlossdef().clear();
				return;
			case DocbookPackage.GLOSSENTRY_TYPE__ACTUATE:
				unsetActuate();
				return;
			case DocbookPackage.GLOSSENTRY_TYPE__ANNOTATIONS:
				setAnnotations(ANNOTATIONS_EDEFAULT);
				return;
			case DocbookPackage.GLOSSENTRY_TYPE__ARCH:
				setArch(ARCH_EDEFAULT);
				return;
			case DocbookPackage.GLOSSENTRY_TYPE__ARCROLE:
				setArcrole(ARCROLE_EDEFAULT);
				return;
			case DocbookPackage.GLOSSENTRY_TYPE__AUDIENCE:
				setAudience(AUDIENCE_EDEFAULT);
				return;
			case DocbookPackage.GLOSSENTRY_TYPE__BASE:
				setBase(BASE_EDEFAULT);
				return;
			case DocbookPackage.GLOSSENTRY_TYPE__CONDITION:
				setCondition(CONDITION_EDEFAULT);
				return;
			case DocbookPackage.GLOSSENTRY_TYPE__CONFORMANCE:
				setConformance(CONFORMANCE_EDEFAULT);
				return;
			case DocbookPackage.GLOSSENTRY_TYPE__DIR:
				unsetDir();
				return;
			case DocbookPackage.GLOSSENTRY_TYPE__HREF:
				setHref(HREF_EDEFAULT);
				return;
			case DocbookPackage.GLOSSENTRY_TYPE__ID:
				setId(ID_EDEFAULT);
				return;
			case DocbookPackage.GLOSSENTRY_TYPE__LANG:
				setLang(LANG_EDEFAULT);
				return;
			case DocbookPackage.GLOSSENTRY_TYPE__LINKEND:
				setLinkend(LINKEND_EDEFAULT);
				return;
			case DocbookPackage.GLOSSENTRY_TYPE__OS:
				setOs(OS_EDEFAULT);
				return;
			case DocbookPackage.GLOSSENTRY_TYPE__REMAP:
				setRemap(REMAP_EDEFAULT);
				return;
			case DocbookPackage.GLOSSENTRY_TYPE__REVISION:
				setRevision(REVISION_EDEFAULT);
				return;
			case DocbookPackage.GLOSSENTRY_TYPE__REVISIONFLAG:
				unsetRevisionflag();
				return;
			case DocbookPackage.GLOSSENTRY_TYPE__ROLE:
				setRole(ROLE_EDEFAULT);
				return;
			case DocbookPackage.GLOSSENTRY_TYPE__ROLE1:
				setRole1(ROLE1_EDEFAULT);
				return;
			case DocbookPackage.GLOSSENTRY_TYPE__SECURITY:
				setSecurity(SECURITY_EDEFAULT);
				return;
			case DocbookPackage.GLOSSENTRY_TYPE__SHOW:
				unsetShow();
				return;
			case DocbookPackage.GLOSSENTRY_TYPE__SORTAS:
				setSortas(SORTAS_EDEFAULT);
				return;
			case DocbookPackage.GLOSSENTRY_TYPE__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case DocbookPackage.GLOSSENTRY_TYPE__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case DocbookPackage.GLOSSENTRY_TYPE__USERLEVEL:
				setUserlevel(USERLEVEL_EDEFAULT);
				return;
			case DocbookPackage.GLOSSENTRY_TYPE__VENDOR:
				setVendor(VENDOR_EDEFAULT);
				return;
			case DocbookPackage.GLOSSENTRY_TYPE__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case DocbookPackage.GLOSSENTRY_TYPE__WORDSIZE:
				setWordsize(WORDSIZE_EDEFAULT);
				return;
			case DocbookPackage.GLOSSENTRY_TYPE__XREFLABEL:
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
			case DocbookPackage.GLOSSENTRY_TYPE__GLOSSTERM:
				return glossterm != null;
			case DocbookPackage.GLOSSENTRY_TYPE__ACRONYM:
				return acronym != null;
			case DocbookPackage.GLOSSENTRY_TYPE__ABBREV:
				return abbrev != null;
			case DocbookPackage.GLOSSENTRY_TYPE__INDEXTERM:
				return indexterm != null && !indexterm.isEmpty();
			case DocbookPackage.GLOSSENTRY_TYPE__GLOSSSEE:
				return glosssee != null;
			case DocbookPackage.GLOSSENTRY_TYPE__GLOSSDEF:
				return glossdef != null && !glossdef.isEmpty();
			case DocbookPackage.GLOSSENTRY_TYPE__ACTUATE:
				return isSetActuate();
			case DocbookPackage.GLOSSENTRY_TYPE__ANNOTATIONS:
				return ANNOTATIONS_EDEFAULT == null ? annotations != null : !ANNOTATIONS_EDEFAULT.equals(annotations);
			case DocbookPackage.GLOSSENTRY_TYPE__ARCH:
				return ARCH_EDEFAULT == null ? arch != null : !ARCH_EDEFAULT.equals(arch);
			case DocbookPackage.GLOSSENTRY_TYPE__ARCROLE:
				return ARCROLE_EDEFAULT == null ? arcrole != null : !ARCROLE_EDEFAULT.equals(arcrole);
			case DocbookPackage.GLOSSENTRY_TYPE__AUDIENCE:
				return AUDIENCE_EDEFAULT == null ? audience != null : !AUDIENCE_EDEFAULT.equals(audience);
			case DocbookPackage.GLOSSENTRY_TYPE__BASE:
				return BASE_EDEFAULT == null ? base != null : !BASE_EDEFAULT.equals(base);
			case DocbookPackage.GLOSSENTRY_TYPE__CONDITION:
				return CONDITION_EDEFAULT == null ? condition != null : !CONDITION_EDEFAULT.equals(condition);
			case DocbookPackage.GLOSSENTRY_TYPE__CONFORMANCE:
				return CONFORMANCE_EDEFAULT == null ? conformance != null : !CONFORMANCE_EDEFAULT.equals(conformance);
			case DocbookPackage.GLOSSENTRY_TYPE__DIR:
				return isSetDir();
			case DocbookPackage.GLOSSENTRY_TYPE__HREF:
				return HREF_EDEFAULT == null ? href != null : !HREF_EDEFAULT.equals(href);
			case DocbookPackage.GLOSSENTRY_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case DocbookPackage.GLOSSENTRY_TYPE__LANG:
				return LANG_EDEFAULT == null ? lang != null : !LANG_EDEFAULT.equals(lang);
			case DocbookPackage.GLOSSENTRY_TYPE__LINKEND:
				return LINKEND_EDEFAULT == null ? linkend != null : !LINKEND_EDEFAULT.equals(linkend);
			case DocbookPackage.GLOSSENTRY_TYPE__OS:
				return OS_EDEFAULT == null ? os != null : !OS_EDEFAULT.equals(os);
			case DocbookPackage.GLOSSENTRY_TYPE__REMAP:
				return REMAP_EDEFAULT == null ? remap != null : !REMAP_EDEFAULT.equals(remap);
			case DocbookPackage.GLOSSENTRY_TYPE__REVISION:
				return REVISION_EDEFAULT == null ? revision != null : !REVISION_EDEFAULT.equals(revision);
			case DocbookPackage.GLOSSENTRY_TYPE__REVISIONFLAG:
				return isSetRevisionflag();
			case DocbookPackage.GLOSSENTRY_TYPE__ROLE:
				return ROLE_EDEFAULT == null ? role != null : !ROLE_EDEFAULT.equals(role);
			case DocbookPackage.GLOSSENTRY_TYPE__ROLE1:
				return ROLE1_EDEFAULT == null ? role1 != null : !ROLE1_EDEFAULT.equals(role1);
			case DocbookPackage.GLOSSENTRY_TYPE__SECURITY:
				return SECURITY_EDEFAULT == null ? security != null : !SECURITY_EDEFAULT.equals(security);
			case DocbookPackage.GLOSSENTRY_TYPE__SHOW:
				return isSetShow();
			case DocbookPackage.GLOSSENTRY_TYPE__SORTAS:
				return SORTAS_EDEFAULT == null ? sortas != null : !SORTAS_EDEFAULT.equals(sortas);
			case DocbookPackage.GLOSSENTRY_TYPE__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case DocbookPackage.GLOSSENTRY_TYPE__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case DocbookPackage.GLOSSENTRY_TYPE__USERLEVEL:
				return USERLEVEL_EDEFAULT == null ? userlevel != null : !USERLEVEL_EDEFAULT.equals(userlevel);
			case DocbookPackage.GLOSSENTRY_TYPE__VENDOR:
				return VENDOR_EDEFAULT == null ? vendor != null : !VENDOR_EDEFAULT.equals(vendor);
			case DocbookPackage.GLOSSENTRY_TYPE__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
			case DocbookPackage.GLOSSENTRY_TYPE__WORDSIZE:
				return WORDSIZE_EDEFAULT == null ? wordsize != null : !WORDSIZE_EDEFAULT.equals(wordsize);
			case DocbookPackage.GLOSSENTRY_TYPE__XREFLABEL:
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
		result.append(" (actuate: ");
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
		result.append(", sortas: ");
		result.append(sortas);
		result.append(", title: ");
		result.append(title);
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

} //GlossentryTypeImpl
