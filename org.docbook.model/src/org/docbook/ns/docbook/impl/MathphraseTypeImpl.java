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

import org.docbook.ns.docbook.AltType;
import org.docbook.ns.docbook.AnchorType;
import org.docbook.ns.docbook.AnnotationType;
import org.docbook.ns.docbook.BibliorefType;
import org.docbook.ns.docbook.DirType;
import org.docbook.ns.docbook.DocbookPackage;
import org.docbook.ns.docbook.EmphasisType;
import org.docbook.ns.docbook.IndextermType;
import org.docbook.ns.docbook.InlinemediaobjectType;
import org.docbook.ns.docbook.LinkType;
import org.docbook.ns.docbook.MathphraseType;
import org.docbook.ns.docbook.OlinkType;
import org.docbook.ns.docbook.PhraseType;
import org.docbook.ns.docbook.RemarkType;
import org.docbook.ns.docbook.ReplaceableType;
import org.docbook.ns.docbook.RevisionflagType;
import org.docbook.ns.docbook.SubscriptType;
import org.docbook.ns.docbook.SuperscriptType;
import org.docbook.ns.docbook.XrefType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.w3._1999.xlink.ActuateType;
import org.w3._1999.xlink.ShowType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mathphrase Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.docbook.ns.docbook.impl.MathphraseTypeImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.MathphraseTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.MathphraseTypeImpl#getInlinemediaobject <em>Inlinemediaobject</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.MathphraseTypeImpl#getRemark <em>Remark</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.MathphraseTypeImpl#getSuperscript <em>Superscript</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.MathphraseTypeImpl#getSubscript <em>Subscript</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.MathphraseTypeImpl#getXref <em>Xref</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.MathphraseTypeImpl#getLink <em>Link</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.MathphraseTypeImpl#getOlink <em>Olink</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.MathphraseTypeImpl#getAnchor <em>Anchor</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.MathphraseTypeImpl#getBiblioref <em>Biblioref</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.MathphraseTypeImpl#getAlt <em>Alt</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.MathphraseTypeImpl#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.MathphraseTypeImpl#getIndexterm <em>Indexterm</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.MathphraseTypeImpl#getPhrase <em>Phrase</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.MathphraseTypeImpl#getReplaceable <em>Replaceable</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.MathphraseTypeImpl#getEmphasis <em>Emphasis</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.MathphraseTypeImpl#getActuate <em>Actuate</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.MathphraseTypeImpl#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.MathphraseTypeImpl#getArch <em>Arch</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.MathphraseTypeImpl#getArcrole <em>Arcrole</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.MathphraseTypeImpl#getAudience <em>Audience</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.MathphraseTypeImpl#getBase <em>Base</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.MathphraseTypeImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.MathphraseTypeImpl#getConformance <em>Conformance</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.MathphraseTypeImpl#getDir <em>Dir</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.MathphraseTypeImpl#getHref <em>Href</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.MathphraseTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.MathphraseTypeImpl#getLang <em>Lang</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.MathphraseTypeImpl#getLinkend <em>Linkend</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.MathphraseTypeImpl#getOs <em>Os</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.MathphraseTypeImpl#getRemap <em>Remap</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.MathphraseTypeImpl#getRevision <em>Revision</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.MathphraseTypeImpl#getRevisionflag <em>Revisionflag</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.MathphraseTypeImpl#getRole <em>Role</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.MathphraseTypeImpl#getRole1 <em>Role1</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.MathphraseTypeImpl#getSecurity <em>Security</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.MathphraseTypeImpl#getShow <em>Show</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.MathphraseTypeImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.MathphraseTypeImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.MathphraseTypeImpl#getUserlevel <em>Userlevel</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.MathphraseTypeImpl#getVendor <em>Vendor</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.MathphraseTypeImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.MathphraseTypeImpl#getWordsize <em>Wordsize</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.MathphraseTypeImpl#getXreflabel <em>Xreflabel</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MathphraseTypeImpl extends MinimalEObjectImpl.Container implements MathphraseType {
	/**
	 * The cached value of the '{@link #getMixed() <em>Mixed</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMixed()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap mixed;

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
	protected MathphraseTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DocbookPackage.eINSTANCE.getMathphraseType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, DocbookPackage.MATHPHRASE_TYPE__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getGroup() {
		return (FeatureMap)getMixed().<FeatureMap.Entry>list(DocbookPackage.eINSTANCE.getMathphraseType_Group());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InlinemediaobjectType> getInlinemediaobject() {
		return getGroup().list(DocbookPackage.eINSTANCE.getMathphraseType_Inlinemediaobject());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RemarkType> getRemark() {
		return getGroup().list(DocbookPackage.eINSTANCE.getMathphraseType_Remark());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SuperscriptType> getSuperscript() {
		return getGroup().list(DocbookPackage.eINSTANCE.getMathphraseType_Superscript());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SubscriptType> getSubscript() {
		return getGroup().list(DocbookPackage.eINSTANCE.getMathphraseType_Subscript());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<XrefType> getXref() {
		return getGroup().list(DocbookPackage.eINSTANCE.getMathphraseType_Xref());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<LinkType> getLink() {
		return getGroup().list(DocbookPackage.eINSTANCE.getMathphraseType_Link());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<OlinkType> getOlink() {
		return getGroup().list(DocbookPackage.eINSTANCE.getMathphraseType_Olink());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AnchorType> getAnchor() {
		return getGroup().list(DocbookPackage.eINSTANCE.getMathphraseType_Anchor());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BibliorefType> getBiblioref() {
		return getGroup().list(DocbookPackage.eINSTANCE.getMathphraseType_Biblioref());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AltType> getAlt() {
		return getGroup().list(DocbookPackage.eINSTANCE.getMathphraseType_Alt());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AnnotationType> getAnnotation() {
		return getGroup().list(DocbookPackage.eINSTANCE.getMathphraseType_Annotation());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<IndextermType> getIndexterm() {
		return getGroup().list(DocbookPackage.eINSTANCE.getMathphraseType_Indexterm());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PhraseType> getPhrase() {
		return getGroup().list(DocbookPackage.eINSTANCE.getMathphraseType_Phrase());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ReplaceableType> getReplaceable() {
		return getGroup().list(DocbookPackage.eINSTANCE.getMathphraseType_Replaceable());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EmphasisType> getEmphasis() {
		return getGroup().list(DocbookPackage.eINSTANCE.getMathphraseType_Emphasis());
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.MATHPHRASE_TYPE__ACTUATE, oldActuate, actuate, !oldActuateESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, DocbookPackage.MATHPHRASE_TYPE__ACTUATE, oldActuate, ACTUATE_EDEFAULT, oldActuateESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.MATHPHRASE_TYPE__ANNOTATIONS, oldAnnotations, annotations));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.MATHPHRASE_TYPE__ARCH, oldArch, arch));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.MATHPHRASE_TYPE__ARCROLE, oldArcrole, arcrole));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.MATHPHRASE_TYPE__AUDIENCE, oldAudience, audience));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.MATHPHRASE_TYPE__BASE, oldBase, base));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.MATHPHRASE_TYPE__CONDITION, oldCondition, condition));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.MATHPHRASE_TYPE__CONFORMANCE, oldConformance, conformance));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.MATHPHRASE_TYPE__DIR, oldDir, dir, !oldDirESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, DocbookPackage.MATHPHRASE_TYPE__DIR, oldDir, DIR_EDEFAULT, oldDirESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.MATHPHRASE_TYPE__HREF, oldHref, href));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.MATHPHRASE_TYPE__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.MATHPHRASE_TYPE__LANG, oldLang, lang));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.MATHPHRASE_TYPE__LINKEND, oldLinkend, linkend));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.MATHPHRASE_TYPE__OS, oldOs, os));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.MATHPHRASE_TYPE__REMAP, oldRemap, remap));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.MATHPHRASE_TYPE__REVISION, oldRevision, revision));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.MATHPHRASE_TYPE__REVISIONFLAG, oldRevisionflag, revisionflag, !oldRevisionflagESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, DocbookPackage.MATHPHRASE_TYPE__REVISIONFLAG, oldRevisionflag, REVISIONFLAG_EDEFAULT, oldRevisionflagESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.MATHPHRASE_TYPE__ROLE, oldRole, role));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.MATHPHRASE_TYPE__ROLE1, oldRole1, role1));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.MATHPHRASE_TYPE__SECURITY, oldSecurity, security));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.MATHPHRASE_TYPE__SHOW, oldShow, show, !oldShowESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, DocbookPackage.MATHPHRASE_TYPE__SHOW, oldShow, SHOW_EDEFAULT, oldShowESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.MATHPHRASE_TYPE__TITLE, oldTitle, title));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.MATHPHRASE_TYPE__TYPE, oldType, type));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.MATHPHRASE_TYPE__USERLEVEL, oldUserlevel, userlevel));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.MATHPHRASE_TYPE__VENDOR, oldVendor, vendor));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.MATHPHRASE_TYPE__VERSION, oldVersion, version));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.MATHPHRASE_TYPE__WORDSIZE, oldWordsize, wordsize));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.MATHPHRASE_TYPE__XREFLABEL, oldXreflabel, xreflabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DocbookPackage.MATHPHRASE_TYPE__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case DocbookPackage.MATHPHRASE_TYPE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case DocbookPackage.MATHPHRASE_TYPE__INLINEMEDIAOBJECT:
				return ((InternalEList<?>)getInlinemediaobject()).basicRemove(otherEnd, msgs);
			case DocbookPackage.MATHPHRASE_TYPE__REMARK:
				return ((InternalEList<?>)getRemark()).basicRemove(otherEnd, msgs);
			case DocbookPackage.MATHPHRASE_TYPE__SUPERSCRIPT:
				return ((InternalEList<?>)getSuperscript()).basicRemove(otherEnd, msgs);
			case DocbookPackage.MATHPHRASE_TYPE__SUBSCRIPT:
				return ((InternalEList<?>)getSubscript()).basicRemove(otherEnd, msgs);
			case DocbookPackage.MATHPHRASE_TYPE__XREF:
				return ((InternalEList<?>)getXref()).basicRemove(otherEnd, msgs);
			case DocbookPackage.MATHPHRASE_TYPE__LINK:
				return ((InternalEList<?>)getLink()).basicRemove(otherEnd, msgs);
			case DocbookPackage.MATHPHRASE_TYPE__OLINK:
				return ((InternalEList<?>)getOlink()).basicRemove(otherEnd, msgs);
			case DocbookPackage.MATHPHRASE_TYPE__ANCHOR:
				return ((InternalEList<?>)getAnchor()).basicRemove(otherEnd, msgs);
			case DocbookPackage.MATHPHRASE_TYPE__BIBLIOREF:
				return ((InternalEList<?>)getBiblioref()).basicRemove(otherEnd, msgs);
			case DocbookPackage.MATHPHRASE_TYPE__ALT:
				return ((InternalEList<?>)getAlt()).basicRemove(otherEnd, msgs);
			case DocbookPackage.MATHPHRASE_TYPE__ANNOTATION:
				return ((InternalEList<?>)getAnnotation()).basicRemove(otherEnd, msgs);
			case DocbookPackage.MATHPHRASE_TYPE__INDEXTERM:
				return ((InternalEList<?>)getIndexterm()).basicRemove(otherEnd, msgs);
			case DocbookPackage.MATHPHRASE_TYPE__PHRASE:
				return ((InternalEList<?>)getPhrase()).basicRemove(otherEnd, msgs);
			case DocbookPackage.MATHPHRASE_TYPE__REPLACEABLE:
				return ((InternalEList<?>)getReplaceable()).basicRemove(otherEnd, msgs);
			case DocbookPackage.MATHPHRASE_TYPE__EMPHASIS:
				return ((InternalEList<?>)getEmphasis()).basicRemove(otherEnd, msgs);
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
			case DocbookPackage.MATHPHRASE_TYPE__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case DocbookPackage.MATHPHRASE_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case DocbookPackage.MATHPHRASE_TYPE__INLINEMEDIAOBJECT:
				return getInlinemediaobject();
			case DocbookPackage.MATHPHRASE_TYPE__REMARK:
				return getRemark();
			case DocbookPackage.MATHPHRASE_TYPE__SUPERSCRIPT:
				return getSuperscript();
			case DocbookPackage.MATHPHRASE_TYPE__SUBSCRIPT:
				return getSubscript();
			case DocbookPackage.MATHPHRASE_TYPE__XREF:
				return getXref();
			case DocbookPackage.MATHPHRASE_TYPE__LINK:
				return getLink();
			case DocbookPackage.MATHPHRASE_TYPE__OLINK:
				return getOlink();
			case DocbookPackage.MATHPHRASE_TYPE__ANCHOR:
				return getAnchor();
			case DocbookPackage.MATHPHRASE_TYPE__BIBLIOREF:
				return getBiblioref();
			case DocbookPackage.MATHPHRASE_TYPE__ALT:
				return getAlt();
			case DocbookPackage.MATHPHRASE_TYPE__ANNOTATION:
				return getAnnotation();
			case DocbookPackage.MATHPHRASE_TYPE__INDEXTERM:
				return getIndexterm();
			case DocbookPackage.MATHPHRASE_TYPE__PHRASE:
				return getPhrase();
			case DocbookPackage.MATHPHRASE_TYPE__REPLACEABLE:
				return getReplaceable();
			case DocbookPackage.MATHPHRASE_TYPE__EMPHASIS:
				return getEmphasis();
			case DocbookPackage.MATHPHRASE_TYPE__ACTUATE:
				return getActuate();
			case DocbookPackage.MATHPHRASE_TYPE__ANNOTATIONS:
				return getAnnotations();
			case DocbookPackage.MATHPHRASE_TYPE__ARCH:
				return getArch();
			case DocbookPackage.MATHPHRASE_TYPE__ARCROLE:
				return getArcrole();
			case DocbookPackage.MATHPHRASE_TYPE__AUDIENCE:
				return getAudience();
			case DocbookPackage.MATHPHRASE_TYPE__BASE:
				return getBase();
			case DocbookPackage.MATHPHRASE_TYPE__CONDITION:
				return getCondition();
			case DocbookPackage.MATHPHRASE_TYPE__CONFORMANCE:
				return getConformance();
			case DocbookPackage.MATHPHRASE_TYPE__DIR:
				return getDir();
			case DocbookPackage.MATHPHRASE_TYPE__HREF:
				return getHref();
			case DocbookPackage.MATHPHRASE_TYPE__ID:
				return getId();
			case DocbookPackage.MATHPHRASE_TYPE__LANG:
				return getLang();
			case DocbookPackage.MATHPHRASE_TYPE__LINKEND:
				return getLinkend();
			case DocbookPackage.MATHPHRASE_TYPE__OS:
				return getOs();
			case DocbookPackage.MATHPHRASE_TYPE__REMAP:
				return getRemap();
			case DocbookPackage.MATHPHRASE_TYPE__REVISION:
				return getRevision();
			case DocbookPackage.MATHPHRASE_TYPE__REVISIONFLAG:
				return getRevisionflag();
			case DocbookPackage.MATHPHRASE_TYPE__ROLE:
				return getRole();
			case DocbookPackage.MATHPHRASE_TYPE__ROLE1:
				return getRole1();
			case DocbookPackage.MATHPHRASE_TYPE__SECURITY:
				return getSecurity();
			case DocbookPackage.MATHPHRASE_TYPE__SHOW:
				return getShow();
			case DocbookPackage.MATHPHRASE_TYPE__TITLE:
				return getTitle();
			case DocbookPackage.MATHPHRASE_TYPE__TYPE:
				return getType();
			case DocbookPackage.MATHPHRASE_TYPE__USERLEVEL:
				return getUserlevel();
			case DocbookPackage.MATHPHRASE_TYPE__VENDOR:
				return getVendor();
			case DocbookPackage.MATHPHRASE_TYPE__VERSION:
				return getVersion();
			case DocbookPackage.MATHPHRASE_TYPE__WORDSIZE:
				return getWordsize();
			case DocbookPackage.MATHPHRASE_TYPE__XREFLABEL:
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
			case DocbookPackage.MATHPHRASE_TYPE__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case DocbookPackage.MATHPHRASE_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case DocbookPackage.MATHPHRASE_TYPE__INLINEMEDIAOBJECT:
				getInlinemediaobject().clear();
				getInlinemediaobject().addAll((Collection<? extends InlinemediaobjectType>)newValue);
				return;
			case DocbookPackage.MATHPHRASE_TYPE__REMARK:
				getRemark().clear();
				getRemark().addAll((Collection<? extends RemarkType>)newValue);
				return;
			case DocbookPackage.MATHPHRASE_TYPE__SUPERSCRIPT:
				getSuperscript().clear();
				getSuperscript().addAll((Collection<? extends SuperscriptType>)newValue);
				return;
			case DocbookPackage.MATHPHRASE_TYPE__SUBSCRIPT:
				getSubscript().clear();
				getSubscript().addAll((Collection<? extends SubscriptType>)newValue);
				return;
			case DocbookPackage.MATHPHRASE_TYPE__XREF:
				getXref().clear();
				getXref().addAll((Collection<? extends XrefType>)newValue);
				return;
			case DocbookPackage.MATHPHRASE_TYPE__LINK:
				getLink().clear();
				getLink().addAll((Collection<? extends LinkType>)newValue);
				return;
			case DocbookPackage.MATHPHRASE_TYPE__OLINK:
				getOlink().clear();
				getOlink().addAll((Collection<? extends OlinkType>)newValue);
				return;
			case DocbookPackage.MATHPHRASE_TYPE__ANCHOR:
				getAnchor().clear();
				getAnchor().addAll((Collection<? extends AnchorType>)newValue);
				return;
			case DocbookPackage.MATHPHRASE_TYPE__BIBLIOREF:
				getBiblioref().clear();
				getBiblioref().addAll((Collection<? extends BibliorefType>)newValue);
				return;
			case DocbookPackage.MATHPHRASE_TYPE__ALT:
				getAlt().clear();
				getAlt().addAll((Collection<? extends AltType>)newValue);
				return;
			case DocbookPackage.MATHPHRASE_TYPE__ANNOTATION:
				getAnnotation().clear();
				getAnnotation().addAll((Collection<? extends AnnotationType>)newValue);
				return;
			case DocbookPackage.MATHPHRASE_TYPE__INDEXTERM:
				getIndexterm().clear();
				getIndexterm().addAll((Collection<? extends IndextermType>)newValue);
				return;
			case DocbookPackage.MATHPHRASE_TYPE__PHRASE:
				getPhrase().clear();
				getPhrase().addAll((Collection<? extends PhraseType>)newValue);
				return;
			case DocbookPackage.MATHPHRASE_TYPE__REPLACEABLE:
				getReplaceable().clear();
				getReplaceable().addAll((Collection<? extends ReplaceableType>)newValue);
				return;
			case DocbookPackage.MATHPHRASE_TYPE__EMPHASIS:
				getEmphasis().clear();
				getEmphasis().addAll((Collection<? extends EmphasisType>)newValue);
				return;
			case DocbookPackage.MATHPHRASE_TYPE__ACTUATE:
				setActuate((ActuateType)newValue);
				return;
			case DocbookPackage.MATHPHRASE_TYPE__ANNOTATIONS:
				setAnnotations(newValue);
				return;
			case DocbookPackage.MATHPHRASE_TYPE__ARCH:
				setArch(newValue);
				return;
			case DocbookPackage.MATHPHRASE_TYPE__ARCROLE:
				setArcrole(newValue);
				return;
			case DocbookPackage.MATHPHRASE_TYPE__AUDIENCE:
				setAudience(newValue);
				return;
			case DocbookPackage.MATHPHRASE_TYPE__BASE:
				setBase(newValue);
				return;
			case DocbookPackage.MATHPHRASE_TYPE__CONDITION:
				setCondition(newValue);
				return;
			case DocbookPackage.MATHPHRASE_TYPE__CONFORMANCE:
				setConformance(newValue);
				return;
			case DocbookPackage.MATHPHRASE_TYPE__DIR:
				setDir((DirType)newValue);
				return;
			case DocbookPackage.MATHPHRASE_TYPE__HREF:
				setHref(newValue);
				return;
			case DocbookPackage.MATHPHRASE_TYPE__ID:
				setId((String)newValue);
				return;
			case DocbookPackage.MATHPHRASE_TYPE__LANG:
				setLang(newValue);
				return;
			case DocbookPackage.MATHPHRASE_TYPE__LINKEND:
				setLinkend((String)newValue);
				return;
			case DocbookPackage.MATHPHRASE_TYPE__OS:
				setOs(newValue);
				return;
			case DocbookPackage.MATHPHRASE_TYPE__REMAP:
				setRemap(newValue);
				return;
			case DocbookPackage.MATHPHRASE_TYPE__REVISION:
				setRevision(newValue);
				return;
			case DocbookPackage.MATHPHRASE_TYPE__REVISIONFLAG:
				setRevisionflag((RevisionflagType)newValue);
				return;
			case DocbookPackage.MATHPHRASE_TYPE__ROLE:
				setRole(newValue);
				return;
			case DocbookPackage.MATHPHRASE_TYPE__ROLE1:
				setRole1(newValue);
				return;
			case DocbookPackage.MATHPHRASE_TYPE__SECURITY:
				setSecurity(newValue);
				return;
			case DocbookPackage.MATHPHRASE_TYPE__SHOW:
				setShow((ShowType)newValue);
				return;
			case DocbookPackage.MATHPHRASE_TYPE__TITLE:
				setTitle(newValue);
				return;
			case DocbookPackage.MATHPHRASE_TYPE__TYPE:
				setType(newValue);
				return;
			case DocbookPackage.MATHPHRASE_TYPE__USERLEVEL:
				setUserlevel(newValue);
				return;
			case DocbookPackage.MATHPHRASE_TYPE__VENDOR:
				setVendor(newValue);
				return;
			case DocbookPackage.MATHPHRASE_TYPE__VERSION:
				setVersion(newValue);
				return;
			case DocbookPackage.MATHPHRASE_TYPE__WORDSIZE:
				setWordsize(newValue);
				return;
			case DocbookPackage.MATHPHRASE_TYPE__XREFLABEL:
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
			case DocbookPackage.MATHPHRASE_TYPE__MIXED:
				getMixed().clear();
				return;
			case DocbookPackage.MATHPHRASE_TYPE__GROUP:
				getGroup().clear();
				return;
			case DocbookPackage.MATHPHRASE_TYPE__INLINEMEDIAOBJECT:
				getInlinemediaobject().clear();
				return;
			case DocbookPackage.MATHPHRASE_TYPE__REMARK:
				getRemark().clear();
				return;
			case DocbookPackage.MATHPHRASE_TYPE__SUPERSCRIPT:
				getSuperscript().clear();
				return;
			case DocbookPackage.MATHPHRASE_TYPE__SUBSCRIPT:
				getSubscript().clear();
				return;
			case DocbookPackage.MATHPHRASE_TYPE__XREF:
				getXref().clear();
				return;
			case DocbookPackage.MATHPHRASE_TYPE__LINK:
				getLink().clear();
				return;
			case DocbookPackage.MATHPHRASE_TYPE__OLINK:
				getOlink().clear();
				return;
			case DocbookPackage.MATHPHRASE_TYPE__ANCHOR:
				getAnchor().clear();
				return;
			case DocbookPackage.MATHPHRASE_TYPE__BIBLIOREF:
				getBiblioref().clear();
				return;
			case DocbookPackage.MATHPHRASE_TYPE__ALT:
				getAlt().clear();
				return;
			case DocbookPackage.MATHPHRASE_TYPE__ANNOTATION:
				getAnnotation().clear();
				return;
			case DocbookPackage.MATHPHRASE_TYPE__INDEXTERM:
				getIndexterm().clear();
				return;
			case DocbookPackage.MATHPHRASE_TYPE__PHRASE:
				getPhrase().clear();
				return;
			case DocbookPackage.MATHPHRASE_TYPE__REPLACEABLE:
				getReplaceable().clear();
				return;
			case DocbookPackage.MATHPHRASE_TYPE__EMPHASIS:
				getEmphasis().clear();
				return;
			case DocbookPackage.MATHPHRASE_TYPE__ACTUATE:
				unsetActuate();
				return;
			case DocbookPackage.MATHPHRASE_TYPE__ANNOTATIONS:
				setAnnotations(ANNOTATIONS_EDEFAULT);
				return;
			case DocbookPackage.MATHPHRASE_TYPE__ARCH:
				setArch(ARCH_EDEFAULT);
				return;
			case DocbookPackage.MATHPHRASE_TYPE__ARCROLE:
				setArcrole(ARCROLE_EDEFAULT);
				return;
			case DocbookPackage.MATHPHRASE_TYPE__AUDIENCE:
				setAudience(AUDIENCE_EDEFAULT);
				return;
			case DocbookPackage.MATHPHRASE_TYPE__BASE:
				setBase(BASE_EDEFAULT);
				return;
			case DocbookPackage.MATHPHRASE_TYPE__CONDITION:
				setCondition(CONDITION_EDEFAULT);
				return;
			case DocbookPackage.MATHPHRASE_TYPE__CONFORMANCE:
				setConformance(CONFORMANCE_EDEFAULT);
				return;
			case DocbookPackage.MATHPHRASE_TYPE__DIR:
				unsetDir();
				return;
			case DocbookPackage.MATHPHRASE_TYPE__HREF:
				setHref(HREF_EDEFAULT);
				return;
			case DocbookPackage.MATHPHRASE_TYPE__ID:
				setId(ID_EDEFAULT);
				return;
			case DocbookPackage.MATHPHRASE_TYPE__LANG:
				setLang(LANG_EDEFAULT);
				return;
			case DocbookPackage.MATHPHRASE_TYPE__LINKEND:
				setLinkend(LINKEND_EDEFAULT);
				return;
			case DocbookPackage.MATHPHRASE_TYPE__OS:
				setOs(OS_EDEFAULT);
				return;
			case DocbookPackage.MATHPHRASE_TYPE__REMAP:
				setRemap(REMAP_EDEFAULT);
				return;
			case DocbookPackage.MATHPHRASE_TYPE__REVISION:
				setRevision(REVISION_EDEFAULT);
				return;
			case DocbookPackage.MATHPHRASE_TYPE__REVISIONFLAG:
				unsetRevisionflag();
				return;
			case DocbookPackage.MATHPHRASE_TYPE__ROLE:
				setRole(ROLE_EDEFAULT);
				return;
			case DocbookPackage.MATHPHRASE_TYPE__ROLE1:
				setRole1(ROLE1_EDEFAULT);
				return;
			case DocbookPackage.MATHPHRASE_TYPE__SECURITY:
				setSecurity(SECURITY_EDEFAULT);
				return;
			case DocbookPackage.MATHPHRASE_TYPE__SHOW:
				unsetShow();
				return;
			case DocbookPackage.MATHPHRASE_TYPE__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case DocbookPackage.MATHPHRASE_TYPE__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case DocbookPackage.MATHPHRASE_TYPE__USERLEVEL:
				setUserlevel(USERLEVEL_EDEFAULT);
				return;
			case DocbookPackage.MATHPHRASE_TYPE__VENDOR:
				setVendor(VENDOR_EDEFAULT);
				return;
			case DocbookPackage.MATHPHRASE_TYPE__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case DocbookPackage.MATHPHRASE_TYPE__WORDSIZE:
				setWordsize(WORDSIZE_EDEFAULT);
				return;
			case DocbookPackage.MATHPHRASE_TYPE__XREFLABEL:
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
			case DocbookPackage.MATHPHRASE_TYPE__MIXED:
				return mixed != null && !mixed.isEmpty();
			case DocbookPackage.MATHPHRASE_TYPE__GROUP:
				return !getGroup().isEmpty();
			case DocbookPackage.MATHPHRASE_TYPE__INLINEMEDIAOBJECT:
				return !getInlinemediaobject().isEmpty();
			case DocbookPackage.MATHPHRASE_TYPE__REMARK:
				return !getRemark().isEmpty();
			case DocbookPackage.MATHPHRASE_TYPE__SUPERSCRIPT:
				return !getSuperscript().isEmpty();
			case DocbookPackage.MATHPHRASE_TYPE__SUBSCRIPT:
				return !getSubscript().isEmpty();
			case DocbookPackage.MATHPHRASE_TYPE__XREF:
				return !getXref().isEmpty();
			case DocbookPackage.MATHPHRASE_TYPE__LINK:
				return !getLink().isEmpty();
			case DocbookPackage.MATHPHRASE_TYPE__OLINK:
				return !getOlink().isEmpty();
			case DocbookPackage.MATHPHRASE_TYPE__ANCHOR:
				return !getAnchor().isEmpty();
			case DocbookPackage.MATHPHRASE_TYPE__BIBLIOREF:
				return !getBiblioref().isEmpty();
			case DocbookPackage.MATHPHRASE_TYPE__ALT:
				return !getAlt().isEmpty();
			case DocbookPackage.MATHPHRASE_TYPE__ANNOTATION:
				return !getAnnotation().isEmpty();
			case DocbookPackage.MATHPHRASE_TYPE__INDEXTERM:
				return !getIndexterm().isEmpty();
			case DocbookPackage.MATHPHRASE_TYPE__PHRASE:
				return !getPhrase().isEmpty();
			case DocbookPackage.MATHPHRASE_TYPE__REPLACEABLE:
				return !getReplaceable().isEmpty();
			case DocbookPackage.MATHPHRASE_TYPE__EMPHASIS:
				return !getEmphasis().isEmpty();
			case DocbookPackage.MATHPHRASE_TYPE__ACTUATE:
				return isSetActuate();
			case DocbookPackage.MATHPHRASE_TYPE__ANNOTATIONS:
				return ANNOTATIONS_EDEFAULT == null ? annotations != null : !ANNOTATIONS_EDEFAULT.equals(annotations);
			case DocbookPackage.MATHPHRASE_TYPE__ARCH:
				return ARCH_EDEFAULT == null ? arch != null : !ARCH_EDEFAULT.equals(arch);
			case DocbookPackage.MATHPHRASE_TYPE__ARCROLE:
				return ARCROLE_EDEFAULT == null ? arcrole != null : !ARCROLE_EDEFAULT.equals(arcrole);
			case DocbookPackage.MATHPHRASE_TYPE__AUDIENCE:
				return AUDIENCE_EDEFAULT == null ? audience != null : !AUDIENCE_EDEFAULT.equals(audience);
			case DocbookPackage.MATHPHRASE_TYPE__BASE:
				return BASE_EDEFAULT == null ? base != null : !BASE_EDEFAULT.equals(base);
			case DocbookPackage.MATHPHRASE_TYPE__CONDITION:
				return CONDITION_EDEFAULT == null ? condition != null : !CONDITION_EDEFAULT.equals(condition);
			case DocbookPackage.MATHPHRASE_TYPE__CONFORMANCE:
				return CONFORMANCE_EDEFAULT == null ? conformance != null : !CONFORMANCE_EDEFAULT.equals(conformance);
			case DocbookPackage.MATHPHRASE_TYPE__DIR:
				return isSetDir();
			case DocbookPackage.MATHPHRASE_TYPE__HREF:
				return HREF_EDEFAULT == null ? href != null : !HREF_EDEFAULT.equals(href);
			case DocbookPackage.MATHPHRASE_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case DocbookPackage.MATHPHRASE_TYPE__LANG:
				return LANG_EDEFAULT == null ? lang != null : !LANG_EDEFAULT.equals(lang);
			case DocbookPackage.MATHPHRASE_TYPE__LINKEND:
				return LINKEND_EDEFAULT == null ? linkend != null : !LINKEND_EDEFAULT.equals(linkend);
			case DocbookPackage.MATHPHRASE_TYPE__OS:
				return OS_EDEFAULT == null ? os != null : !OS_EDEFAULT.equals(os);
			case DocbookPackage.MATHPHRASE_TYPE__REMAP:
				return REMAP_EDEFAULT == null ? remap != null : !REMAP_EDEFAULT.equals(remap);
			case DocbookPackage.MATHPHRASE_TYPE__REVISION:
				return REVISION_EDEFAULT == null ? revision != null : !REVISION_EDEFAULT.equals(revision);
			case DocbookPackage.MATHPHRASE_TYPE__REVISIONFLAG:
				return isSetRevisionflag();
			case DocbookPackage.MATHPHRASE_TYPE__ROLE:
				return ROLE_EDEFAULT == null ? role != null : !ROLE_EDEFAULT.equals(role);
			case DocbookPackage.MATHPHRASE_TYPE__ROLE1:
				return ROLE1_EDEFAULT == null ? role1 != null : !ROLE1_EDEFAULT.equals(role1);
			case DocbookPackage.MATHPHRASE_TYPE__SECURITY:
				return SECURITY_EDEFAULT == null ? security != null : !SECURITY_EDEFAULT.equals(security);
			case DocbookPackage.MATHPHRASE_TYPE__SHOW:
				return isSetShow();
			case DocbookPackage.MATHPHRASE_TYPE__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case DocbookPackage.MATHPHRASE_TYPE__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case DocbookPackage.MATHPHRASE_TYPE__USERLEVEL:
				return USERLEVEL_EDEFAULT == null ? userlevel != null : !USERLEVEL_EDEFAULT.equals(userlevel);
			case DocbookPackage.MATHPHRASE_TYPE__VENDOR:
				return VENDOR_EDEFAULT == null ? vendor != null : !VENDOR_EDEFAULT.equals(vendor);
			case DocbookPackage.MATHPHRASE_TYPE__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
			case DocbookPackage.MATHPHRASE_TYPE__WORDSIZE:
				return WORDSIZE_EDEFAULT == null ? wordsize != null : !WORDSIZE_EDEFAULT.equals(wordsize);
			case DocbookPackage.MATHPHRASE_TYPE__XREFLABEL:
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
		result.append(" (mixed: ");
		result.append(mixed);
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

} //MathphraseTypeImpl
