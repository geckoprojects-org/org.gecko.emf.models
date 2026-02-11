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

import org.docbook.ns.docbook.CaptionType;
import org.docbook.ns.docbook.ColType;
import org.docbook.ns.docbook.ColgroupType;
import org.docbook.ns.docbook.ColsepType2;
import org.docbook.ns.docbook.DirType;
import org.docbook.ns.docbook.DocbookPackage;
import org.docbook.ns.docbook.FrameType;
import org.docbook.ns.docbook.IndextermType;
import org.docbook.ns.docbook.InfoType;
import org.docbook.ns.docbook.MediaobjectType;
import org.docbook.ns.docbook.OrientType;
import org.docbook.ns.docbook.PgwideType4;
import org.docbook.ns.docbook.RevisionflagType;
import org.docbook.ns.docbook.RowheaderType;
import org.docbook.ns.docbook.RowsepType;
import org.docbook.ns.docbook.RulesType;
import org.docbook.ns.docbook.ShortentryType;
import org.docbook.ns.docbook.TableType;
import org.docbook.ns.docbook.TbodyType;
import org.docbook.ns.docbook.TextobjectType;
import org.docbook.ns.docbook.TfootType;
import org.docbook.ns.docbook.TgroupType;
import org.docbook.ns.docbook.TheadType;
import org.docbook.ns.docbook.TitleType;
import org.docbook.ns.docbook.TitleabbrevType;
import org.docbook.ns.docbook.TocentryType1;
import org.docbook.ns.docbook.TrType;

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
 * An implementation of the model object '<em><b>Table Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.docbook.ns.docbook.impl.TableTypeImpl#getInfo <em>Info</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.TableTypeImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.TableTypeImpl#getTitleabbrev <em>Titleabbrev</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.TableTypeImpl#getIndexterm <em>Indexterm</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.TableTypeImpl#getTextobject <em>Textobject</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.TableTypeImpl#getMediaobject <em>Mediaobject</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.TableTypeImpl#getTgroup <em>Tgroup</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.TableTypeImpl#getCaption <em>Caption</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.TableTypeImpl#getCol <em>Col</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.TableTypeImpl#getColgroup <em>Colgroup</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.TableTypeImpl#getThead <em>Thead</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.TableTypeImpl#getTfoot <em>Tfoot</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.TableTypeImpl#getTbody <em>Tbody</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.TableTypeImpl#getTr <em>Tr</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.TableTypeImpl#getActuate <em>Actuate</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.TableTypeImpl#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.TableTypeImpl#getArch <em>Arch</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.TableTypeImpl#getArcrole <em>Arcrole</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.TableTypeImpl#getAudience <em>Audience</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.TableTypeImpl#getBase <em>Base</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.TableTypeImpl#getBorder <em>Border</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.TableTypeImpl#getCellpadding <em>Cellpadding</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.TableTypeImpl#getCellspacing <em>Cellspacing</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.TableTypeImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.TableTypeImpl#getColsep <em>Colsep</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.TableTypeImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.TableTypeImpl#getConformance <em>Conformance</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.TableTypeImpl#getDir <em>Dir</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.TableTypeImpl#getFloatstyle <em>Floatstyle</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.TableTypeImpl#getFrame <em>Frame</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.TableTypeImpl#getHref <em>Href</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.TableTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.TableTypeImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.TableTypeImpl#getLang <em>Lang</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.TableTypeImpl#getLang1 <em>Lang1</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.TableTypeImpl#getLinkend <em>Linkend</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.TableTypeImpl#getOnclick <em>Onclick</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.TableTypeImpl#getOndblclick <em>Ondblclick</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.TableTypeImpl#getOnkeydown <em>Onkeydown</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.TableTypeImpl#getOnkeypress <em>Onkeypress</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.TableTypeImpl#getOnkeyup <em>Onkeyup</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.TableTypeImpl#getOnmousedown <em>Onmousedown</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.TableTypeImpl#getOnmousemove <em>Onmousemove</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.TableTypeImpl#getOnmouseout <em>Onmouseout</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.TableTypeImpl#getOnmouseover <em>Onmouseover</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.TableTypeImpl#getOnmouseup <em>Onmouseup</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.TableTypeImpl#getOrient <em>Orient</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.TableTypeImpl#getOs <em>Os</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.TableTypeImpl#getPgwide <em>Pgwide</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.TableTypeImpl#getRemap <em>Remap</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.TableTypeImpl#getRevision <em>Revision</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.TableTypeImpl#getRevisionflag <em>Revisionflag</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.TableTypeImpl#getRole <em>Role</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.TableTypeImpl#getRole1 <em>Role1</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.TableTypeImpl#getRowheader <em>Rowheader</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.TableTypeImpl#getRowsep <em>Rowsep</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.TableTypeImpl#getRules <em>Rules</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.TableTypeImpl#getSecurity <em>Security</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.TableTypeImpl#getShortentry <em>Shortentry</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.TableTypeImpl#getShow <em>Show</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.TableTypeImpl#getStyle <em>Style</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.TableTypeImpl#getSummary <em>Summary</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.TableTypeImpl#getTabstyle <em>Tabstyle</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.TableTypeImpl#getTitle1 <em>Title1</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.TableTypeImpl#getTitle2 <em>Title2</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.TableTypeImpl#getTocentry <em>Tocentry</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.TableTypeImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.TableTypeImpl#getUserlevel <em>Userlevel</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.TableTypeImpl#getVendor <em>Vendor</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.TableTypeImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.TableTypeImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.TableTypeImpl#getWordsize <em>Wordsize</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.TableTypeImpl#getXreflabel <em>Xreflabel</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TableTypeImpl extends MinimalEObjectImpl.Container implements TableType {
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
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected TitleType title;

	/**
	 * The cached value of the '{@link #getTitleabbrev() <em>Titleabbrev</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitleabbrev()
	 * @generated
	 * @ordered
	 */
	protected TitleabbrevType titleabbrev;

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
	 * The cached value of the '{@link #getTextobject() <em>Textobject</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextobject()
	 * @generated
	 * @ordered
	 */
	protected EList<TextobjectType> textobject;

	/**
	 * The cached value of the '{@link #getMediaobject() <em>Mediaobject</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMediaobject()
	 * @generated
	 * @ordered
	 */
	protected EList<MediaobjectType> mediaobject;

	/**
	 * The cached value of the '{@link #getTgroup() <em>Tgroup</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTgroup()
	 * @generated
	 * @ordered
	 */
	protected EList<TgroupType> tgroup;

	/**
	 * The cached value of the '{@link #getCaption() <em>Caption</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaption()
	 * @generated
	 * @ordered
	 */
	protected CaptionType caption;

	/**
	 * The cached value of the '{@link #getCol() <em>Col</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCol()
	 * @generated
	 * @ordered
	 */
	protected EList<ColType> col;

	/**
	 * The cached value of the '{@link #getColgroup() <em>Colgroup</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColgroup()
	 * @generated
	 * @ordered
	 */
	protected EList<ColgroupType> colgroup;

	/**
	 * The cached value of the '{@link #getThead() <em>Thead</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThead()
	 * @generated
	 * @ordered
	 */
	protected TheadType thead;

	/**
	 * The cached value of the '{@link #getTfoot() <em>Tfoot</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTfoot()
	 * @generated
	 * @ordered
	 */
	protected TfootType tfoot;

	/**
	 * The cached value of the '{@link #getTbody() <em>Tbody</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTbody()
	 * @generated
	 * @ordered
	 */
	protected EList<TbodyType> tbody;

	/**
	 * The cached value of the '{@link #getTr() <em>Tr</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTr()
	 * @generated
	 * @ordered
	 */
	protected EList<TrType> tr;

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
	 * The default value of the '{@link #getBorder() <em>Border</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBorder()
	 * @generated
	 * @ordered
	 */
	protected static final String BORDER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBorder() <em>Border</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBorder()
	 * @generated
	 * @ordered
	 */
	protected String border = BORDER_EDEFAULT;

	/**
	 * The default value of the '{@link #getCellpadding() <em>Cellpadding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCellpadding()
	 * @generated
	 * @ordered
	 */
	protected static final Object CELLPADDING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCellpadding() <em>Cellpadding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCellpadding()
	 * @generated
	 * @ordered
	 */
	protected Object cellpadding = CELLPADDING_EDEFAULT;

	/**
	 * The default value of the '{@link #getCellspacing() <em>Cellspacing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCellspacing()
	 * @generated
	 * @ordered
	 */
	protected static final Object CELLSPACING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCellspacing() <em>Cellspacing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCellspacing()
	 * @generated
	 * @ordered
	 */
	protected Object cellspacing = CELLSPACING_EDEFAULT;

	/**
	 * The default value of the '{@link #getClass_() <em>Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClass_()
	 * @generated
	 * @ordered
	 */
	protected static final Object CLASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClass_() <em>Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClass_()
	 * @generated
	 * @ordered
	 */
	protected Object class_ = CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getColsep() <em>Colsep</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColsep()
	 * @generated
	 * @ordered
	 */
	protected static final ColsepType2 COLSEP_EDEFAULT = ColsepType2._0;

	/**
	 * The cached value of the '{@link #getColsep() <em>Colsep</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColsep()
	 * @generated
	 * @ordered
	 */
	protected ColsepType2 colsep = COLSEP_EDEFAULT;

	/**
	 * This is true if the Colsep attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean colsepESet;

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
	 * The default value of the '{@link #getFloatstyle() <em>Floatstyle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFloatstyle()
	 * @generated
	 * @ordered
	 */
	protected static final Object FLOATSTYLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFloatstyle() <em>Floatstyle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFloatstyle()
	 * @generated
	 * @ordered
	 */
	protected Object floatstyle = FLOATSTYLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFrame() <em>Frame</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrame()
	 * @generated
	 * @ordered
	 */
	protected static final FrameType FRAME_EDEFAULT = FrameType.ALL;

	/**
	 * The cached value of the '{@link #getFrame() <em>Frame</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrame()
	 * @generated
	 * @ordered
	 */
	protected FrameType frame = FRAME_EDEFAULT;

	/**
	 * This is true if the Frame attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean frameESet;

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
	 * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected static final Object LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected Object label = LABEL_EDEFAULT;

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
	 * The default value of the '{@link #getLang1() <em>Lang1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLang1()
	 * @generated
	 * @ordered
	 */
	protected static final Object LANG1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLang1() <em>Lang1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLang1()
	 * @generated
	 * @ordered
	 */
	protected Object lang1 = LANG1_EDEFAULT;

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
	 * The default value of the '{@link #getOnclick() <em>Onclick</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnclick()
	 * @generated
	 * @ordered
	 */
	protected static final Object ONCLICK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOnclick() <em>Onclick</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnclick()
	 * @generated
	 * @ordered
	 */
	protected Object onclick = ONCLICK_EDEFAULT;

	/**
	 * The default value of the '{@link #getOndblclick() <em>Ondblclick</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOndblclick()
	 * @generated
	 * @ordered
	 */
	protected static final Object ONDBLCLICK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOndblclick() <em>Ondblclick</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOndblclick()
	 * @generated
	 * @ordered
	 */
	protected Object ondblclick = ONDBLCLICK_EDEFAULT;

	/**
	 * The default value of the '{@link #getOnkeydown() <em>Onkeydown</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnkeydown()
	 * @generated
	 * @ordered
	 */
	protected static final Object ONKEYDOWN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOnkeydown() <em>Onkeydown</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnkeydown()
	 * @generated
	 * @ordered
	 */
	protected Object onkeydown = ONKEYDOWN_EDEFAULT;

	/**
	 * The default value of the '{@link #getOnkeypress() <em>Onkeypress</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnkeypress()
	 * @generated
	 * @ordered
	 */
	protected static final Object ONKEYPRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOnkeypress() <em>Onkeypress</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnkeypress()
	 * @generated
	 * @ordered
	 */
	protected Object onkeypress = ONKEYPRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getOnkeyup() <em>Onkeyup</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnkeyup()
	 * @generated
	 * @ordered
	 */
	protected static final Object ONKEYUP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOnkeyup() <em>Onkeyup</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnkeyup()
	 * @generated
	 * @ordered
	 */
	protected Object onkeyup = ONKEYUP_EDEFAULT;

	/**
	 * The default value of the '{@link #getOnmousedown() <em>Onmousedown</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnmousedown()
	 * @generated
	 * @ordered
	 */
	protected static final Object ONMOUSEDOWN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOnmousedown() <em>Onmousedown</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnmousedown()
	 * @generated
	 * @ordered
	 */
	protected Object onmousedown = ONMOUSEDOWN_EDEFAULT;

	/**
	 * The default value of the '{@link #getOnmousemove() <em>Onmousemove</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnmousemove()
	 * @generated
	 * @ordered
	 */
	protected static final Object ONMOUSEMOVE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOnmousemove() <em>Onmousemove</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnmousemove()
	 * @generated
	 * @ordered
	 */
	protected Object onmousemove = ONMOUSEMOVE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOnmouseout() <em>Onmouseout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnmouseout()
	 * @generated
	 * @ordered
	 */
	protected static final Object ONMOUSEOUT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOnmouseout() <em>Onmouseout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnmouseout()
	 * @generated
	 * @ordered
	 */
	protected Object onmouseout = ONMOUSEOUT_EDEFAULT;

	/**
	 * The default value of the '{@link #getOnmouseover() <em>Onmouseover</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnmouseover()
	 * @generated
	 * @ordered
	 */
	protected static final Object ONMOUSEOVER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOnmouseover() <em>Onmouseover</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnmouseover()
	 * @generated
	 * @ordered
	 */
	protected Object onmouseover = ONMOUSEOVER_EDEFAULT;

	/**
	 * The default value of the '{@link #getOnmouseup() <em>Onmouseup</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnmouseup()
	 * @generated
	 * @ordered
	 */
	protected static final Object ONMOUSEUP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOnmouseup() <em>Onmouseup</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnmouseup()
	 * @generated
	 * @ordered
	 */
	protected Object onmouseup = ONMOUSEUP_EDEFAULT;

	/**
	 * The default value of the '{@link #getOrient() <em>Orient</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrient()
	 * @generated
	 * @ordered
	 */
	protected static final OrientType ORIENT_EDEFAULT = OrientType.LAND;

	/**
	 * The cached value of the '{@link #getOrient() <em>Orient</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrient()
	 * @generated
	 * @ordered
	 */
	protected OrientType orient = ORIENT_EDEFAULT;

	/**
	 * This is true if the Orient attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean orientESet;

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
	 * The default value of the '{@link #getPgwide() <em>Pgwide</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPgwide()
	 * @generated
	 * @ordered
	 */
	protected static final PgwideType4 PGWIDE_EDEFAULT = PgwideType4._0;

	/**
	 * The cached value of the '{@link #getPgwide() <em>Pgwide</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPgwide()
	 * @generated
	 * @ordered
	 */
	protected PgwideType4 pgwide = PGWIDE_EDEFAULT;

	/**
	 * This is true if the Pgwide attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean pgwideESet;

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
	 * The default value of the '{@link #getRowheader() <em>Rowheader</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRowheader()
	 * @generated
	 * @ordered
	 */
	protected static final RowheaderType ROWHEADER_EDEFAULT = RowheaderType.FIRSTCOL;

	/**
	 * The cached value of the '{@link #getRowheader() <em>Rowheader</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRowheader()
	 * @generated
	 * @ordered
	 */
	protected RowheaderType rowheader = ROWHEADER_EDEFAULT;

	/**
	 * This is true if the Rowheader attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean rowheaderESet;

	/**
	 * The default value of the '{@link #getRowsep() <em>Rowsep</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRowsep()
	 * @generated
	 * @ordered
	 */
	protected static final RowsepType ROWSEP_EDEFAULT = RowsepType._0;

	/**
	 * The cached value of the '{@link #getRowsep() <em>Rowsep</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRowsep()
	 * @generated
	 * @ordered
	 */
	protected RowsepType rowsep = ROWSEP_EDEFAULT;

	/**
	 * This is true if the Rowsep attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean rowsepESet;

	/**
	 * The default value of the '{@link #getRules() <em>Rules</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRules()
	 * @generated
	 * @ordered
	 */
	protected static final RulesType RULES_EDEFAULT = RulesType.NONE;

	/**
	 * The cached value of the '{@link #getRules() <em>Rules</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRules()
	 * @generated
	 * @ordered
	 */
	protected RulesType rules = RULES_EDEFAULT;

	/**
	 * This is true if the Rules attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean rulesESet;

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
	 * The default value of the '{@link #getShortentry() <em>Shortentry</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShortentry()
	 * @generated
	 * @ordered
	 */
	protected static final ShortentryType SHORTENTRY_EDEFAULT = ShortentryType._0;

	/**
	 * The cached value of the '{@link #getShortentry() <em>Shortentry</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShortentry()
	 * @generated
	 * @ordered
	 */
	protected ShortentryType shortentry = SHORTENTRY_EDEFAULT;

	/**
	 * This is true if the Shortentry attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean shortentryESet;

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
	 * The default value of the '{@link #getStyle() <em>Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyle()
	 * @generated
	 * @ordered
	 */
	protected static final Object STYLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStyle() <em>Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyle()
	 * @generated
	 * @ordered
	 */
	protected Object style = STYLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSummary() <em>Summary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSummary()
	 * @generated
	 * @ordered
	 */
	protected static final Object SUMMARY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSummary() <em>Summary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSummary()
	 * @generated
	 * @ordered
	 */
	protected Object summary = SUMMARY_EDEFAULT;

	/**
	 * The default value of the '{@link #getTabstyle() <em>Tabstyle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTabstyle()
	 * @generated
	 * @ordered
	 */
	protected static final Object TABSTYLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTabstyle() <em>Tabstyle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTabstyle()
	 * @generated
	 * @ordered
	 */
	protected Object tabstyle = TABSTYLE_EDEFAULT;

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
	 * The default value of the '{@link #getTitle2() <em>Title2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle2()
	 * @generated
	 * @ordered
	 */
	protected static final Object TITLE2_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitle2() <em>Title2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle2()
	 * @generated
	 * @ordered
	 */
	protected Object title2 = TITLE2_EDEFAULT;

	/**
	 * The default value of the '{@link #getTocentry() <em>Tocentry</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTocentry()
	 * @generated
	 * @ordered
	 */
	protected static final TocentryType1 TOCENTRY_EDEFAULT = TocentryType1._0;

	/**
	 * The cached value of the '{@link #getTocentry() <em>Tocentry</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTocentry()
	 * @generated
	 * @ordered
	 */
	protected TocentryType1 tocentry = TOCENTRY_EDEFAULT;

	/**
	 * This is true if the Tocentry attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean tocentryESet;

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
	 * The default value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected static final Object WIDTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected Object width = WIDTH_EDEFAULT;

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
	protected TableTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DocbookPackage.eINSTANCE.getTableType();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DocbookPackage.TABLE_TYPE__INFO, oldInfo, newInfo);
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
				msgs = ((InternalEObject)info).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DocbookPackage.TABLE_TYPE__INFO, null, msgs);
			if (newInfo != null)
				msgs = ((InternalEObject)newInfo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DocbookPackage.TABLE_TYPE__INFO, null, msgs);
			msgs = basicSetInfo(newInfo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.TABLE_TYPE__INFO, newInfo, newInfo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TitleType getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTitle(TitleType newTitle, NotificationChain msgs) {
		TitleType oldTitle = title;
		title = newTitle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DocbookPackage.TABLE_TYPE__TITLE, oldTitle, newTitle);
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
	public void setTitle(TitleType newTitle) {
		if (newTitle != title) {
			NotificationChain msgs = null;
			if (title != null)
				msgs = ((InternalEObject)title).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DocbookPackage.TABLE_TYPE__TITLE, null, msgs);
			if (newTitle != null)
				msgs = ((InternalEObject)newTitle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DocbookPackage.TABLE_TYPE__TITLE, null, msgs);
			msgs = basicSetTitle(newTitle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.TABLE_TYPE__TITLE, newTitle, newTitle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TitleabbrevType getTitleabbrev() {
		return titleabbrev;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTitleabbrev(TitleabbrevType newTitleabbrev, NotificationChain msgs) {
		TitleabbrevType oldTitleabbrev = titleabbrev;
		titleabbrev = newTitleabbrev;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DocbookPackage.TABLE_TYPE__TITLEABBREV, oldTitleabbrev, newTitleabbrev);
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
	public void setTitleabbrev(TitleabbrevType newTitleabbrev) {
		if (newTitleabbrev != titleabbrev) {
			NotificationChain msgs = null;
			if (titleabbrev != null)
				msgs = ((InternalEObject)titleabbrev).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DocbookPackage.TABLE_TYPE__TITLEABBREV, null, msgs);
			if (newTitleabbrev != null)
				msgs = ((InternalEObject)newTitleabbrev).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DocbookPackage.TABLE_TYPE__TITLEABBREV, null, msgs);
			msgs = basicSetTitleabbrev(newTitleabbrev, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.TABLE_TYPE__TITLEABBREV, newTitleabbrev, newTitleabbrev));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<IndextermType> getIndexterm() {
		if (indexterm == null) {
			indexterm = new EObjectContainmentEList<IndextermType>(IndextermType.class, this, DocbookPackage.TABLE_TYPE__INDEXTERM);
		}
		return indexterm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TextobjectType> getTextobject() {
		if (textobject == null) {
			textobject = new EObjectContainmentEList<TextobjectType>(TextobjectType.class, this, DocbookPackage.TABLE_TYPE__TEXTOBJECT);
		}
		return textobject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MediaobjectType> getMediaobject() {
		if (mediaobject == null) {
			mediaobject = new EObjectContainmentEList<MediaobjectType>(MediaobjectType.class, this, DocbookPackage.TABLE_TYPE__MEDIAOBJECT);
		}
		return mediaobject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TgroupType> getTgroup() {
		if (tgroup == null) {
			tgroup = new EObjectContainmentEList<TgroupType>(TgroupType.class, this, DocbookPackage.TABLE_TYPE__TGROUP);
		}
		return tgroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CaptionType getCaption() {
		return caption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCaption(CaptionType newCaption, NotificationChain msgs) {
		CaptionType oldCaption = caption;
		caption = newCaption;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DocbookPackage.TABLE_TYPE__CAPTION, oldCaption, newCaption);
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
	public void setCaption(CaptionType newCaption) {
		if (newCaption != caption) {
			NotificationChain msgs = null;
			if (caption != null)
				msgs = ((InternalEObject)caption).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DocbookPackage.TABLE_TYPE__CAPTION, null, msgs);
			if (newCaption != null)
				msgs = ((InternalEObject)newCaption).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DocbookPackage.TABLE_TYPE__CAPTION, null, msgs);
			msgs = basicSetCaption(newCaption, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.TABLE_TYPE__CAPTION, newCaption, newCaption));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ColType> getCol() {
		if (col == null) {
			col = new EObjectContainmentEList<ColType>(ColType.class, this, DocbookPackage.TABLE_TYPE__COL);
		}
		return col;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ColgroupType> getColgroup() {
		if (colgroup == null) {
			colgroup = new EObjectContainmentEList<ColgroupType>(ColgroupType.class, this, DocbookPackage.TABLE_TYPE__COLGROUP);
		}
		return colgroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TheadType getThead() {
		return thead;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetThead(TheadType newThead, NotificationChain msgs) {
		TheadType oldThead = thead;
		thead = newThead;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DocbookPackage.TABLE_TYPE__THEAD, oldThead, newThead);
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
	public void setThead(TheadType newThead) {
		if (newThead != thead) {
			NotificationChain msgs = null;
			if (thead != null)
				msgs = ((InternalEObject)thead).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DocbookPackage.TABLE_TYPE__THEAD, null, msgs);
			if (newThead != null)
				msgs = ((InternalEObject)newThead).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DocbookPackage.TABLE_TYPE__THEAD, null, msgs);
			msgs = basicSetThead(newThead, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.TABLE_TYPE__THEAD, newThead, newThead));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TfootType getTfoot() {
		return tfoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTfoot(TfootType newTfoot, NotificationChain msgs) {
		TfootType oldTfoot = tfoot;
		tfoot = newTfoot;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DocbookPackage.TABLE_TYPE__TFOOT, oldTfoot, newTfoot);
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
	public void setTfoot(TfootType newTfoot) {
		if (newTfoot != tfoot) {
			NotificationChain msgs = null;
			if (tfoot != null)
				msgs = ((InternalEObject)tfoot).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DocbookPackage.TABLE_TYPE__TFOOT, null, msgs);
			if (newTfoot != null)
				msgs = ((InternalEObject)newTfoot).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DocbookPackage.TABLE_TYPE__TFOOT, null, msgs);
			msgs = basicSetTfoot(newTfoot, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.TABLE_TYPE__TFOOT, newTfoot, newTfoot));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TbodyType> getTbody() {
		if (tbody == null) {
			tbody = new EObjectContainmentEList<TbodyType>(TbodyType.class, this, DocbookPackage.TABLE_TYPE__TBODY);
		}
		return tbody;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TrType> getTr() {
		if (tr == null) {
			tr = new EObjectContainmentEList<TrType>(TrType.class, this, DocbookPackage.TABLE_TYPE__TR);
		}
		return tr;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.TABLE_TYPE__ACTUATE, oldActuate, actuate, !oldActuateESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, DocbookPackage.TABLE_TYPE__ACTUATE, oldActuate, ACTUATE_EDEFAULT, oldActuateESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.TABLE_TYPE__ANNOTATIONS, oldAnnotations, annotations));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.TABLE_TYPE__ARCH, oldArch, arch));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.TABLE_TYPE__ARCROLE, oldArcrole, arcrole));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.TABLE_TYPE__AUDIENCE, oldAudience, audience));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.TABLE_TYPE__BASE, oldBase, base));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBorder() {
		return border;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBorder(String newBorder) {
		String oldBorder = border;
		border = newBorder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.TABLE_TYPE__BORDER, oldBorder, border));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getCellpadding() {
		return cellpadding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCellpadding(Object newCellpadding) {
		Object oldCellpadding = cellpadding;
		cellpadding = newCellpadding;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.TABLE_TYPE__CELLPADDING, oldCellpadding, cellpadding));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getCellspacing() {
		return cellspacing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCellspacing(Object newCellspacing) {
		Object oldCellspacing = cellspacing;
		cellspacing = newCellspacing;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.TABLE_TYPE__CELLSPACING, oldCellspacing, cellspacing));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getClass_() {
		return class_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setClass(Object newClass) {
		Object oldClass = class_;
		class_ = newClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.TABLE_TYPE__CLASS, oldClass, class_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ColsepType2 getColsep() {
		return colsep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setColsep(ColsepType2 newColsep) {
		ColsepType2 oldColsep = colsep;
		colsep = newColsep == null ? COLSEP_EDEFAULT : newColsep;
		boolean oldColsepESet = colsepESet;
		colsepESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.TABLE_TYPE__COLSEP, oldColsep, colsep, !oldColsepESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetColsep() {
		ColsepType2 oldColsep = colsep;
		boolean oldColsepESet = colsepESet;
		colsep = COLSEP_EDEFAULT;
		colsepESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DocbookPackage.TABLE_TYPE__COLSEP, oldColsep, COLSEP_EDEFAULT, oldColsepESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetColsep() {
		return colsepESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.TABLE_TYPE__CONDITION, oldCondition, condition));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.TABLE_TYPE__CONFORMANCE, oldConformance, conformance));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.TABLE_TYPE__DIR, oldDir, dir, !oldDirESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, DocbookPackage.TABLE_TYPE__DIR, oldDir, DIR_EDEFAULT, oldDirESet));
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
	public Object getFloatstyle() {
		return floatstyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFloatstyle(Object newFloatstyle) {
		Object oldFloatstyle = floatstyle;
		floatstyle = newFloatstyle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.TABLE_TYPE__FLOATSTYLE, oldFloatstyle, floatstyle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FrameType getFrame() {
		return frame;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFrame(FrameType newFrame) {
		FrameType oldFrame = frame;
		frame = newFrame == null ? FRAME_EDEFAULT : newFrame;
		boolean oldFrameESet = frameESet;
		frameESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.TABLE_TYPE__FRAME, oldFrame, frame, !oldFrameESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetFrame() {
		FrameType oldFrame = frame;
		boolean oldFrameESet = frameESet;
		frame = FRAME_EDEFAULT;
		frameESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DocbookPackage.TABLE_TYPE__FRAME, oldFrame, FRAME_EDEFAULT, oldFrameESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetFrame() {
		return frameESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.TABLE_TYPE__HREF, oldHref, href));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.TABLE_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getLabel() {
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLabel(Object newLabel) {
		Object oldLabel = label;
		label = newLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.TABLE_TYPE__LABEL, oldLabel, label));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.TABLE_TYPE__LANG, oldLang, lang));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getLang1() {
		return lang1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLang1(Object newLang1) {
		Object oldLang1 = lang1;
		lang1 = newLang1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.TABLE_TYPE__LANG1, oldLang1, lang1));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.TABLE_TYPE__LINKEND, oldLinkend, linkend));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getOnclick() {
		return onclick;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOnclick(Object newOnclick) {
		Object oldOnclick = onclick;
		onclick = newOnclick;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.TABLE_TYPE__ONCLICK, oldOnclick, onclick));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getOndblclick() {
		return ondblclick;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOndblclick(Object newOndblclick) {
		Object oldOndblclick = ondblclick;
		ondblclick = newOndblclick;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.TABLE_TYPE__ONDBLCLICK, oldOndblclick, ondblclick));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getOnkeydown() {
		return onkeydown;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOnkeydown(Object newOnkeydown) {
		Object oldOnkeydown = onkeydown;
		onkeydown = newOnkeydown;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.TABLE_TYPE__ONKEYDOWN, oldOnkeydown, onkeydown));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getOnkeypress() {
		return onkeypress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOnkeypress(Object newOnkeypress) {
		Object oldOnkeypress = onkeypress;
		onkeypress = newOnkeypress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.TABLE_TYPE__ONKEYPRESS, oldOnkeypress, onkeypress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getOnkeyup() {
		return onkeyup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOnkeyup(Object newOnkeyup) {
		Object oldOnkeyup = onkeyup;
		onkeyup = newOnkeyup;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.TABLE_TYPE__ONKEYUP, oldOnkeyup, onkeyup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getOnmousedown() {
		return onmousedown;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOnmousedown(Object newOnmousedown) {
		Object oldOnmousedown = onmousedown;
		onmousedown = newOnmousedown;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.TABLE_TYPE__ONMOUSEDOWN, oldOnmousedown, onmousedown));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getOnmousemove() {
		return onmousemove;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOnmousemove(Object newOnmousemove) {
		Object oldOnmousemove = onmousemove;
		onmousemove = newOnmousemove;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.TABLE_TYPE__ONMOUSEMOVE, oldOnmousemove, onmousemove));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getOnmouseout() {
		return onmouseout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOnmouseout(Object newOnmouseout) {
		Object oldOnmouseout = onmouseout;
		onmouseout = newOnmouseout;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.TABLE_TYPE__ONMOUSEOUT, oldOnmouseout, onmouseout));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getOnmouseover() {
		return onmouseover;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOnmouseover(Object newOnmouseover) {
		Object oldOnmouseover = onmouseover;
		onmouseover = newOnmouseover;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.TABLE_TYPE__ONMOUSEOVER, oldOnmouseover, onmouseover));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getOnmouseup() {
		return onmouseup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOnmouseup(Object newOnmouseup) {
		Object oldOnmouseup = onmouseup;
		onmouseup = newOnmouseup;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.TABLE_TYPE__ONMOUSEUP, oldOnmouseup, onmouseup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OrientType getOrient() {
		return orient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrient(OrientType newOrient) {
		OrientType oldOrient = orient;
		orient = newOrient == null ? ORIENT_EDEFAULT : newOrient;
		boolean oldOrientESet = orientESet;
		orientESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.TABLE_TYPE__ORIENT, oldOrient, orient, !oldOrientESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetOrient() {
		OrientType oldOrient = orient;
		boolean oldOrientESet = orientESet;
		orient = ORIENT_EDEFAULT;
		orientESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DocbookPackage.TABLE_TYPE__ORIENT, oldOrient, ORIENT_EDEFAULT, oldOrientESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetOrient() {
		return orientESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.TABLE_TYPE__OS, oldOs, os));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PgwideType4 getPgwide() {
		return pgwide;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPgwide(PgwideType4 newPgwide) {
		PgwideType4 oldPgwide = pgwide;
		pgwide = newPgwide == null ? PGWIDE_EDEFAULT : newPgwide;
		boolean oldPgwideESet = pgwideESet;
		pgwideESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.TABLE_TYPE__PGWIDE, oldPgwide, pgwide, !oldPgwideESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetPgwide() {
		PgwideType4 oldPgwide = pgwide;
		boolean oldPgwideESet = pgwideESet;
		pgwide = PGWIDE_EDEFAULT;
		pgwideESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DocbookPackage.TABLE_TYPE__PGWIDE, oldPgwide, PGWIDE_EDEFAULT, oldPgwideESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetPgwide() {
		return pgwideESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.TABLE_TYPE__REMAP, oldRemap, remap));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.TABLE_TYPE__REVISION, oldRevision, revision));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.TABLE_TYPE__REVISIONFLAG, oldRevisionflag, revisionflag, !oldRevisionflagESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, DocbookPackage.TABLE_TYPE__REVISIONFLAG, oldRevisionflag, REVISIONFLAG_EDEFAULT, oldRevisionflagESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.TABLE_TYPE__ROLE, oldRole, role));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.TABLE_TYPE__ROLE1, oldRole1, role1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RowheaderType getRowheader() {
		return rowheader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRowheader(RowheaderType newRowheader) {
		RowheaderType oldRowheader = rowheader;
		rowheader = newRowheader == null ? ROWHEADER_EDEFAULT : newRowheader;
		boolean oldRowheaderESet = rowheaderESet;
		rowheaderESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.TABLE_TYPE__ROWHEADER, oldRowheader, rowheader, !oldRowheaderESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetRowheader() {
		RowheaderType oldRowheader = rowheader;
		boolean oldRowheaderESet = rowheaderESet;
		rowheader = ROWHEADER_EDEFAULT;
		rowheaderESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DocbookPackage.TABLE_TYPE__ROWHEADER, oldRowheader, ROWHEADER_EDEFAULT, oldRowheaderESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetRowheader() {
		return rowheaderESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RowsepType getRowsep() {
		return rowsep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRowsep(RowsepType newRowsep) {
		RowsepType oldRowsep = rowsep;
		rowsep = newRowsep == null ? ROWSEP_EDEFAULT : newRowsep;
		boolean oldRowsepESet = rowsepESet;
		rowsepESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.TABLE_TYPE__ROWSEP, oldRowsep, rowsep, !oldRowsepESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetRowsep() {
		RowsepType oldRowsep = rowsep;
		boolean oldRowsepESet = rowsepESet;
		rowsep = ROWSEP_EDEFAULT;
		rowsepESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DocbookPackage.TABLE_TYPE__ROWSEP, oldRowsep, ROWSEP_EDEFAULT, oldRowsepESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetRowsep() {
		return rowsepESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RulesType getRules() {
		return rules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRules(RulesType newRules) {
		RulesType oldRules = rules;
		rules = newRules == null ? RULES_EDEFAULT : newRules;
		boolean oldRulesESet = rulesESet;
		rulesESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.TABLE_TYPE__RULES, oldRules, rules, !oldRulesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetRules() {
		RulesType oldRules = rules;
		boolean oldRulesESet = rulesESet;
		rules = RULES_EDEFAULT;
		rulesESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DocbookPackage.TABLE_TYPE__RULES, oldRules, RULES_EDEFAULT, oldRulesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetRules() {
		return rulesESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.TABLE_TYPE__SECURITY, oldSecurity, security));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ShortentryType getShortentry() {
		return shortentry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShortentry(ShortentryType newShortentry) {
		ShortentryType oldShortentry = shortentry;
		shortentry = newShortentry == null ? SHORTENTRY_EDEFAULT : newShortentry;
		boolean oldShortentryESet = shortentryESet;
		shortentryESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.TABLE_TYPE__SHORTENTRY, oldShortentry, shortentry, !oldShortentryESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetShortentry() {
		ShortentryType oldShortentry = shortentry;
		boolean oldShortentryESet = shortentryESet;
		shortentry = SHORTENTRY_EDEFAULT;
		shortentryESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DocbookPackage.TABLE_TYPE__SHORTENTRY, oldShortentry, SHORTENTRY_EDEFAULT, oldShortentryESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetShortentry() {
		return shortentryESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.TABLE_TYPE__SHOW, oldShow, show, !oldShowESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, DocbookPackage.TABLE_TYPE__SHOW, oldShow, SHOW_EDEFAULT, oldShowESet));
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
	public Object getStyle() {
		return style;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStyle(Object newStyle) {
		Object oldStyle = style;
		style = newStyle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.TABLE_TYPE__STYLE, oldStyle, style));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getSummary() {
		return summary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSummary(Object newSummary) {
		Object oldSummary = summary;
		summary = newSummary;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.TABLE_TYPE__SUMMARY, oldSummary, summary));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getTabstyle() {
		return tabstyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTabstyle(Object newTabstyle) {
		Object oldTabstyle = tabstyle;
		tabstyle = newTabstyle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.TABLE_TYPE__TABSTYLE, oldTabstyle, tabstyle));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.TABLE_TYPE__TITLE1, oldTitle1, title1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getTitle2() {
		return title2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTitle2(Object newTitle2) {
		Object oldTitle2 = title2;
		title2 = newTitle2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.TABLE_TYPE__TITLE2, oldTitle2, title2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TocentryType1 getTocentry() {
		return tocentry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTocentry(TocentryType1 newTocentry) {
		TocentryType1 oldTocentry = tocentry;
		tocentry = newTocentry == null ? TOCENTRY_EDEFAULT : newTocentry;
		boolean oldTocentryESet = tocentryESet;
		tocentryESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.TABLE_TYPE__TOCENTRY, oldTocentry, tocentry, !oldTocentryESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetTocentry() {
		TocentryType1 oldTocentry = tocentry;
		boolean oldTocentryESet = tocentryESet;
		tocentry = TOCENTRY_EDEFAULT;
		tocentryESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DocbookPackage.TABLE_TYPE__TOCENTRY, oldTocentry, TOCENTRY_EDEFAULT, oldTocentryESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetTocentry() {
		return tocentryESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.TABLE_TYPE__TYPE, oldType, type));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.TABLE_TYPE__USERLEVEL, oldUserlevel, userlevel));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.TABLE_TYPE__VENDOR, oldVendor, vendor));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.TABLE_TYPE__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getWidth() {
		return width;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWidth(Object newWidth) {
		Object oldWidth = width;
		width = newWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.TABLE_TYPE__WIDTH, oldWidth, width));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.TABLE_TYPE__WORDSIZE, oldWordsize, wordsize));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.TABLE_TYPE__XREFLABEL, oldXreflabel, xreflabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DocbookPackage.TABLE_TYPE__INFO:
				return basicSetInfo(null, msgs);
			case DocbookPackage.TABLE_TYPE__TITLE:
				return basicSetTitle(null, msgs);
			case DocbookPackage.TABLE_TYPE__TITLEABBREV:
				return basicSetTitleabbrev(null, msgs);
			case DocbookPackage.TABLE_TYPE__INDEXTERM:
				return ((InternalEList<?>)getIndexterm()).basicRemove(otherEnd, msgs);
			case DocbookPackage.TABLE_TYPE__TEXTOBJECT:
				return ((InternalEList<?>)getTextobject()).basicRemove(otherEnd, msgs);
			case DocbookPackage.TABLE_TYPE__MEDIAOBJECT:
				return ((InternalEList<?>)getMediaobject()).basicRemove(otherEnd, msgs);
			case DocbookPackage.TABLE_TYPE__TGROUP:
				return ((InternalEList<?>)getTgroup()).basicRemove(otherEnd, msgs);
			case DocbookPackage.TABLE_TYPE__CAPTION:
				return basicSetCaption(null, msgs);
			case DocbookPackage.TABLE_TYPE__COL:
				return ((InternalEList<?>)getCol()).basicRemove(otherEnd, msgs);
			case DocbookPackage.TABLE_TYPE__COLGROUP:
				return ((InternalEList<?>)getColgroup()).basicRemove(otherEnd, msgs);
			case DocbookPackage.TABLE_TYPE__THEAD:
				return basicSetThead(null, msgs);
			case DocbookPackage.TABLE_TYPE__TFOOT:
				return basicSetTfoot(null, msgs);
			case DocbookPackage.TABLE_TYPE__TBODY:
				return ((InternalEList<?>)getTbody()).basicRemove(otherEnd, msgs);
			case DocbookPackage.TABLE_TYPE__TR:
				return ((InternalEList<?>)getTr()).basicRemove(otherEnd, msgs);
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
			case DocbookPackage.TABLE_TYPE__INFO:
				return getInfo();
			case DocbookPackage.TABLE_TYPE__TITLE:
				return getTitle();
			case DocbookPackage.TABLE_TYPE__TITLEABBREV:
				return getTitleabbrev();
			case DocbookPackage.TABLE_TYPE__INDEXTERM:
				return getIndexterm();
			case DocbookPackage.TABLE_TYPE__TEXTOBJECT:
				return getTextobject();
			case DocbookPackage.TABLE_TYPE__MEDIAOBJECT:
				return getMediaobject();
			case DocbookPackage.TABLE_TYPE__TGROUP:
				return getTgroup();
			case DocbookPackage.TABLE_TYPE__CAPTION:
				return getCaption();
			case DocbookPackage.TABLE_TYPE__COL:
				return getCol();
			case DocbookPackage.TABLE_TYPE__COLGROUP:
				return getColgroup();
			case DocbookPackage.TABLE_TYPE__THEAD:
				return getThead();
			case DocbookPackage.TABLE_TYPE__TFOOT:
				return getTfoot();
			case DocbookPackage.TABLE_TYPE__TBODY:
				return getTbody();
			case DocbookPackage.TABLE_TYPE__TR:
				return getTr();
			case DocbookPackage.TABLE_TYPE__ACTUATE:
				return getActuate();
			case DocbookPackage.TABLE_TYPE__ANNOTATIONS:
				return getAnnotations();
			case DocbookPackage.TABLE_TYPE__ARCH:
				return getArch();
			case DocbookPackage.TABLE_TYPE__ARCROLE:
				return getArcrole();
			case DocbookPackage.TABLE_TYPE__AUDIENCE:
				return getAudience();
			case DocbookPackage.TABLE_TYPE__BASE:
				return getBase();
			case DocbookPackage.TABLE_TYPE__BORDER:
				return getBorder();
			case DocbookPackage.TABLE_TYPE__CELLPADDING:
				return getCellpadding();
			case DocbookPackage.TABLE_TYPE__CELLSPACING:
				return getCellspacing();
			case DocbookPackage.TABLE_TYPE__CLASS:
				return getClass_();
			case DocbookPackage.TABLE_TYPE__COLSEP:
				return getColsep();
			case DocbookPackage.TABLE_TYPE__CONDITION:
				return getCondition();
			case DocbookPackage.TABLE_TYPE__CONFORMANCE:
				return getConformance();
			case DocbookPackage.TABLE_TYPE__DIR:
				return getDir();
			case DocbookPackage.TABLE_TYPE__FLOATSTYLE:
				return getFloatstyle();
			case DocbookPackage.TABLE_TYPE__FRAME:
				return getFrame();
			case DocbookPackage.TABLE_TYPE__HREF:
				return getHref();
			case DocbookPackage.TABLE_TYPE__ID:
				return getId();
			case DocbookPackage.TABLE_TYPE__LABEL:
				return getLabel();
			case DocbookPackage.TABLE_TYPE__LANG:
				return getLang();
			case DocbookPackage.TABLE_TYPE__LANG1:
				return getLang1();
			case DocbookPackage.TABLE_TYPE__LINKEND:
				return getLinkend();
			case DocbookPackage.TABLE_TYPE__ONCLICK:
				return getOnclick();
			case DocbookPackage.TABLE_TYPE__ONDBLCLICK:
				return getOndblclick();
			case DocbookPackage.TABLE_TYPE__ONKEYDOWN:
				return getOnkeydown();
			case DocbookPackage.TABLE_TYPE__ONKEYPRESS:
				return getOnkeypress();
			case DocbookPackage.TABLE_TYPE__ONKEYUP:
				return getOnkeyup();
			case DocbookPackage.TABLE_TYPE__ONMOUSEDOWN:
				return getOnmousedown();
			case DocbookPackage.TABLE_TYPE__ONMOUSEMOVE:
				return getOnmousemove();
			case DocbookPackage.TABLE_TYPE__ONMOUSEOUT:
				return getOnmouseout();
			case DocbookPackage.TABLE_TYPE__ONMOUSEOVER:
				return getOnmouseover();
			case DocbookPackage.TABLE_TYPE__ONMOUSEUP:
				return getOnmouseup();
			case DocbookPackage.TABLE_TYPE__ORIENT:
				return getOrient();
			case DocbookPackage.TABLE_TYPE__OS:
				return getOs();
			case DocbookPackage.TABLE_TYPE__PGWIDE:
				return getPgwide();
			case DocbookPackage.TABLE_TYPE__REMAP:
				return getRemap();
			case DocbookPackage.TABLE_TYPE__REVISION:
				return getRevision();
			case DocbookPackage.TABLE_TYPE__REVISIONFLAG:
				return getRevisionflag();
			case DocbookPackage.TABLE_TYPE__ROLE:
				return getRole();
			case DocbookPackage.TABLE_TYPE__ROLE1:
				return getRole1();
			case DocbookPackage.TABLE_TYPE__ROWHEADER:
				return getRowheader();
			case DocbookPackage.TABLE_TYPE__ROWSEP:
				return getRowsep();
			case DocbookPackage.TABLE_TYPE__RULES:
				return getRules();
			case DocbookPackage.TABLE_TYPE__SECURITY:
				return getSecurity();
			case DocbookPackage.TABLE_TYPE__SHORTENTRY:
				return getShortentry();
			case DocbookPackage.TABLE_TYPE__SHOW:
				return getShow();
			case DocbookPackage.TABLE_TYPE__STYLE:
				return getStyle();
			case DocbookPackage.TABLE_TYPE__SUMMARY:
				return getSummary();
			case DocbookPackage.TABLE_TYPE__TABSTYLE:
				return getTabstyle();
			case DocbookPackage.TABLE_TYPE__TITLE1:
				return getTitle1();
			case DocbookPackage.TABLE_TYPE__TITLE2:
				return getTitle2();
			case DocbookPackage.TABLE_TYPE__TOCENTRY:
				return getTocentry();
			case DocbookPackage.TABLE_TYPE__TYPE:
				return getType();
			case DocbookPackage.TABLE_TYPE__USERLEVEL:
				return getUserlevel();
			case DocbookPackage.TABLE_TYPE__VENDOR:
				return getVendor();
			case DocbookPackage.TABLE_TYPE__VERSION:
				return getVersion();
			case DocbookPackage.TABLE_TYPE__WIDTH:
				return getWidth();
			case DocbookPackage.TABLE_TYPE__WORDSIZE:
				return getWordsize();
			case DocbookPackage.TABLE_TYPE__XREFLABEL:
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
			case DocbookPackage.TABLE_TYPE__INFO:
				setInfo((InfoType)newValue);
				return;
			case DocbookPackage.TABLE_TYPE__TITLE:
				setTitle((TitleType)newValue);
				return;
			case DocbookPackage.TABLE_TYPE__TITLEABBREV:
				setTitleabbrev((TitleabbrevType)newValue);
				return;
			case DocbookPackage.TABLE_TYPE__INDEXTERM:
				getIndexterm().clear();
				getIndexterm().addAll((Collection<? extends IndextermType>)newValue);
				return;
			case DocbookPackage.TABLE_TYPE__TEXTOBJECT:
				getTextobject().clear();
				getTextobject().addAll((Collection<? extends TextobjectType>)newValue);
				return;
			case DocbookPackage.TABLE_TYPE__MEDIAOBJECT:
				getMediaobject().clear();
				getMediaobject().addAll((Collection<? extends MediaobjectType>)newValue);
				return;
			case DocbookPackage.TABLE_TYPE__TGROUP:
				getTgroup().clear();
				getTgroup().addAll((Collection<? extends TgroupType>)newValue);
				return;
			case DocbookPackage.TABLE_TYPE__CAPTION:
				setCaption((CaptionType)newValue);
				return;
			case DocbookPackage.TABLE_TYPE__COL:
				getCol().clear();
				getCol().addAll((Collection<? extends ColType>)newValue);
				return;
			case DocbookPackage.TABLE_TYPE__COLGROUP:
				getColgroup().clear();
				getColgroup().addAll((Collection<? extends ColgroupType>)newValue);
				return;
			case DocbookPackage.TABLE_TYPE__THEAD:
				setThead((TheadType)newValue);
				return;
			case DocbookPackage.TABLE_TYPE__TFOOT:
				setTfoot((TfootType)newValue);
				return;
			case DocbookPackage.TABLE_TYPE__TBODY:
				getTbody().clear();
				getTbody().addAll((Collection<? extends TbodyType>)newValue);
				return;
			case DocbookPackage.TABLE_TYPE__TR:
				getTr().clear();
				getTr().addAll((Collection<? extends TrType>)newValue);
				return;
			case DocbookPackage.TABLE_TYPE__ACTUATE:
				setActuate((ActuateType)newValue);
				return;
			case DocbookPackage.TABLE_TYPE__ANNOTATIONS:
				setAnnotations(newValue);
				return;
			case DocbookPackage.TABLE_TYPE__ARCH:
				setArch(newValue);
				return;
			case DocbookPackage.TABLE_TYPE__ARCROLE:
				setArcrole(newValue);
				return;
			case DocbookPackage.TABLE_TYPE__AUDIENCE:
				setAudience(newValue);
				return;
			case DocbookPackage.TABLE_TYPE__BASE:
				setBase(newValue);
				return;
			case DocbookPackage.TABLE_TYPE__BORDER:
				setBorder((String)newValue);
				return;
			case DocbookPackage.TABLE_TYPE__CELLPADDING:
				setCellpadding(newValue);
				return;
			case DocbookPackage.TABLE_TYPE__CELLSPACING:
				setCellspacing(newValue);
				return;
			case DocbookPackage.TABLE_TYPE__CLASS:
				setClass(newValue);
				return;
			case DocbookPackage.TABLE_TYPE__COLSEP:
				setColsep((ColsepType2)newValue);
				return;
			case DocbookPackage.TABLE_TYPE__CONDITION:
				setCondition(newValue);
				return;
			case DocbookPackage.TABLE_TYPE__CONFORMANCE:
				setConformance(newValue);
				return;
			case DocbookPackage.TABLE_TYPE__DIR:
				setDir((DirType)newValue);
				return;
			case DocbookPackage.TABLE_TYPE__FLOATSTYLE:
				setFloatstyle(newValue);
				return;
			case DocbookPackage.TABLE_TYPE__FRAME:
				setFrame((FrameType)newValue);
				return;
			case DocbookPackage.TABLE_TYPE__HREF:
				setHref(newValue);
				return;
			case DocbookPackage.TABLE_TYPE__ID:
				setId((String)newValue);
				return;
			case DocbookPackage.TABLE_TYPE__LABEL:
				setLabel(newValue);
				return;
			case DocbookPackage.TABLE_TYPE__LANG:
				setLang(newValue);
				return;
			case DocbookPackage.TABLE_TYPE__LANG1:
				setLang1(newValue);
				return;
			case DocbookPackage.TABLE_TYPE__LINKEND:
				setLinkend((String)newValue);
				return;
			case DocbookPackage.TABLE_TYPE__ONCLICK:
				setOnclick(newValue);
				return;
			case DocbookPackage.TABLE_TYPE__ONDBLCLICK:
				setOndblclick(newValue);
				return;
			case DocbookPackage.TABLE_TYPE__ONKEYDOWN:
				setOnkeydown(newValue);
				return;
			case DocbookPackage.TABLE_TYPE__ONKEYPRESS:
				setOnkeypress(newValue);
				return;
			case DocbookPackage.TABLE_TYPE__ONKEYUP:
				setOnkeyup(newValue);
				return;
			case DocbookPackage.TABLE_TYPE__ONMOUSEDOWN:
				setOnmousedown(newValue);
				return;
			case DocbookPackage.TABLE_TYPE__ONMOUSEMOVE:
				setOnmousemove(newValue);
				return;
			case DocbookPackage.TABLE_TYPE__ONMOUSEOUT:
				setOnmouseout(newValue);
				return;
			case DocbookPackage.TABLE_TYPE__ONMOUSEOVER:
				setOnmouseover(newValue);
				return;
			case DocbookPackage.TABLE_TYPE__ONMOUSEUP:
				setOnmouseup(newValue);
				return;
			case DocbookPackage.TABLE_TYPE__ORIENT:
				setOrient((OrientType)newValue);
				return;
			case DocbookPackage.TABLE_TYPE__OS:
				setOs(newValue);
				return;
			case DocbookPackage.TABLE_TYPE__PGWIDE:
				setPgwide((PgwideType4)newValue);
				return;
			case DocbookPackage.TABLE_TYPE__REMAP:
				setRemap(newValue);
				return;
			case DocbookPackage.TABLE_TYPE__REVISION:
				setRevision(newValue);
				return;
			case DocbookPackage.TABLE_TYPE__REVISIONFLAG:
				setRevisionflag((RevisionflagType)newValue);
				return;
			case DocbookPackage.TABLE_TYPE__ROLE:
				setRole(newValue);
				return;
			case DocbookPackage.TABLE_TYPE__ROLE1:
				setRole1(newValue);
				return;
			case DocbookPackage.TABLE_TYPE__ROWHEADER:
				setRowheader((RowheaderType)newValue);
				return;
			case DocbookPackage.TABLE_TYPE__ROWSEP:
				setRowsep((RowsepType)newValue);
				return;
			case DocbookPackage.TABLE_TYPE__RULES:
				setRules((RulesType)newValue);
				return;
			case DocbookPackage.TABLE_TYPE__SECURITY:
				setSecurity(newValue);
				return;
			case DocbookPackage.TABLE_TYPE__SHORTENTRY:
				setShortentry((ShortentryType)newValue);
				return;
			case DocbookPackage.TABLE_TYPE__SHOW:
				setShow((ShowType)newValue);
				return;
			case DocbookPackage.TABLE_TYPE__STYLE:
				setStyle(newValue);
				return;
			case DocbookPackage.TABLE_TYPE__SUMMARY:
				setSummary(newValue);
				return;
			case DocbookPackage.TABLE_TYPE__TABSTYLE:
				setTabstyle(newValue);
				return;
			case DocbookPackage.TABLE_TYPE__TITLE1:
				setTitle1(newValue);
				return;
			case DocbookPackage.TABLE_TYPE__TITLE2:
				setTitle2(newValue);
				return;
			case DocbookPackage.TABLE_TYPE__TOCENTRY:
				setTocentry((TocentryType1)newValue);
				return;
			case DocbookPackage.TABLE_TYPE__TYPE:
				setType(newValue);
				return;
			case DocbookPackage.TABLE_TYPE__USERLEVEL:
				setUserlevel(newValue);
				return;
			case DocbookPackage.TABLE_TYPE__VENDOR:
				setVendor(newValue);
				return;
			case DocbookPackage.TABLE_TYPE__VERSION:
				setVersion(newValue);
				return;
			case DocbookPackage.TABLE_TYPE__WIDTH:
				setWidth(newValue);
				return;
			case DocbookPackage.TABLE_TYPE__WORDSIZE:
				setWordsize(newValue);
				return;
			case DocbookPackage.TABLE_TYPE__XREFLABEL:
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
			case DocbookPackage.TABLE_TYPE__INFO:
				setInfo((InfoType)null);
				return;
			case DocbookPackage.TABLE_TYPE__TITLE:
				setTitle((TitleType)null);
				return;
			case DocbookPackage.TABLE_TYPE__TITLEABBREV:
				setTitleabbrev((TitleabbrevType)null);
				return;
			case DocbookPackage.TABLE_TYPE__INDEXTERM:
				getIndexterm().clear();
				return;
			case DocbookPackage.TABLE_TYPE__TEXTOBJECT:
				getTextobject().clear();
				return;
			case DocbookPackage.TABLE_TYPE__MEDIAOBJECT:
				getMediaobject().clear();
				return;
			case DocbookPackage.TABLE_TYPE__TGROUP:
				getTgroup().clear();
				return;
			case DocbookPackage.TABLE_TYPE__CAPTION:
				setCaption((CaptionType)null);
				return;
			case DocbookPackage.TABLE_TYPE__COL:
				getCol().clear();
				return;
			case DocbookPackage.TABLE_TYPE__COLGROUP:
				getColgroup().clear();
				return;
			case DocbookPackage.TABLE_TYPE__THEAD:
				setThead((TheadType)null);
				return;
			case DocbookPackage.TABLE_TYPE__TFOOT:
				setTfoot((TfootType)null);
				return;
			case DocbookPackage.TABLE_TYPE__TBODY:
				getTbody().clear();
				return;
			case DocbookPackage.TABLE_TYPE__TR:
				getTr().clear();
				return;
			case DocbookPackage.TABLE_TYPE__ACTUATE:
				unsetActuate();
				return;
			case DocbookPackage.TABLE_TYPE__ANNOTATIONS:
				setAnnotations(ANNOTATIONS_EDEFAULT);
				return;
			case DocbookPackage.TABLE_TYPE__ARCH:
				setArch(ARCH_EDEFAULT);
				return;
			case DocbookPackage.TABLE_TYPE__ARCROLE:
				setArcrole(ARCROLE_EDEFAULT);
				return;
			case DocbookPackage.TABLE_TYPE__AUDIENCE:
				setAudience(AUDIENCE_EDEFAULT);
				return;
			case DocbookPackage.TABLE_TYPE__BASE:
				setBase(BASE_EDEFAULT);
				return;
			case DocbookPackage.TABLE_TYPE__BORDER:
				setBorder(BORDER_EDEFAULT);
				return;
			case DocbookPackage.TABLE_TYPE__CELLPADDING:
				setCellpadding(CELLPADDING_EDEFAULT);
				return;
			case DocbookPackage.TABLE_TYPE__CELLSPACING:
				setCellspacing(CELLSPACING_EDEFAULT);
				return;
			case DocbookPackage.TABLE_TYPE__CLASS:
				setClass(CLASS_EDEFAULT);
				return;
			case DocbookPackage.TABLE_TYPE__COLSEP:
				unsetColsep();
				return;
			case DocbookPackage.TABLE_TYPE__CONDITION:
				setCondition(CONDITION_EDEFAULT);
				return;
			case DocbookPackage.TABLE_TYPE__CONFORMANCE:
				setConformance(CONFORMANCE_EDEFAULT);
				return;
			case DocbookPackage.TABLE_TYPE__DIR:
				unsetDir();
				return;
			case DocbookPackage.TABLE_TYPE__FLOATSTYLE:
				setFloatstyle(FLOATSTYLE_EDEFAULT);
				return;
			case DocbookPackage.TABLE_TYPE__FRAME:
				unsetFrame();
				return;
			case DocbookPackage.TABLE_TYPE__HREF:
				setHref(HREF_EDEFAULT);
				return;
			case DocbookPackage.TABLE_TYPE__ID:
				setId(ID_EDEFAULT);
				return;
			case DocbookPackage.TABLE_TYPE__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case DocbookPackage.TABLE_TYPE__LANG:
				setLang(LANG_EDEFAULT);
				return;
			case DocbookPackage.TABLE_TYPE__LANG1:
				setLang1(LANG1_EDEFAULT);
				return;
			case DocbookPackage.TABLE_TYPE__LINKEND:
				setLinkend(LINKEND_EDEFAULT);
				return;
			case DocbookPackage.TABLE_TYPE__ONCLICK:
				setOnclick(ONCLICK_EDEFAULT);
				return;
			case DocbookPackage.TABLE_TYPE__ONDBLCLICK:
				setOndblclick(ONDBLCLICK_EDEFAULT);
				return;
			case DocbookPackage.TABLE_TYPE__ONKEYDOWN:
				setOnkeydown(ONKEYDOWN_EDEFAULT);
				return;
			case DocbookPackage.TABLE_TYPE__ONKEYPRESS:
				setOnkeypress(ONKEYPRESS_EDEFAULT);
				return;
			case DocbookPackage.TABLE_TYPE__ONKEYUP:
				setOnkeyup(ONKEYUP_EDEFAULT);
				return;
			case DocbookPackage.TABLE_TYPE__ONMOUSEDOWN:
				setOnmousedown(ONMOUSEDOWN_EDEFAULT);
				return;
			case DocbookPackage.TABLE_TYPE__ONMOUSEMOVE:
				setOnmousemove(ONMOUSEMOVE_EDEFAULT);
				return;
			case DocbookPackage.TABLE_TYPE__ONMOUSEOUT:
				setOnmouseout(ONMOUSEOUT_EDEFAULT);
				return;
			case DocbookPackage.TABLE_TYPE__ONMOUSEOVER:
				setOnmouseover(ONMOUSEOVER_EDEFAULT);
				return;
			case DocbookPackage.TABLE_TYPE__ONMOUSEUP:
				setOnmouseup(ONMOUSEUP_EDEFAULT);
				return;
			case DocbookPackage.TABLE_TYPE__ORIENT:
				unsetOrient();
				return;
			case DocbookPackage.TABLE_TYPE__OS:
				setOs(OS_EDEFAULT);
				return;
			case DocbookPackage.TABLE_TYPE__PGWIDE:
				unsetPgwide();
				return;
			case DocbookPackage.TABLE_TYPE__REMAP:
				setRemap(REMAP_EDEFAULT);
				return;
			case DocbookPackage.TABLE_TYPE__REVISION:
				setRevision(REVISION_EDEFAULT);
				return;
			case DocbookPackage.TABLE_TYPE__REVISIONFLAG:
				unsetRevisionflag();
				return;
			case DocbookPackage.TABLE_TYPE__ROLE:
				setRole(ROLE_EDEFAULT);
				return;
			case DocbookPackage.TABLE_TYPE__ROLE1:
				setRole1(ROLE1_EDEFAULT);
				return;
			case DocbookPackage.TABLE_TYPE__ROWHEADER:
				unsetRowheader();
				return;
			case DocbookPackage.TABLE_TYPE__ROWSEP:
				unsetRowsep();
				return;
			case DocbookPackage.TABLE_TYPE__RULES:
				unsetRules();
				return;
			case DocbookPackage.TABLE_TYPE__SECURITY:
				setSecurity(SECURITY_EDEFAULT);
				return;
			case DocbookPackage.TABLE_TYPE__SHORTENTRY:
				unsetShortentry();
				return;
			case DocbookPackage.TABLE_TYPE__SHOW:
				unsetShow();
				return;
			case DocbookPackage.TABLE_TYPE__STYLE:
				setStyle(STYLE_EDEFAULT);
				return;
			case DocbookPackage.TABLE_TYPE__SUMMARY:
				setSummary(SUMMARY_EDEFAULT);
				return;
			case DocbookPackage.TABLE_TYPE__TABSTYLE:
				setTabstyle(TABSTYLE_EDEFAULT);
				return;
			case DocbookPackage.TABLE_TYPE__TITLE1:
				setTitle1(TITLE1_EDEFAULT);
				return;
			case DocbookPackage.TABLE_TYPE__TITLE2:
				setTitle2(TITLE2_EDEFAULT);
				return;
			case DocbookPackage.TABLE_TYPE__TOCENTRY:
				unsetTocentry();
				return;
			case DocbookPackage.TABLE_TYPE__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case DocbookPackage.TABLE_TYPE__USERLEVEL:
				setUserlevel(USERLEVEL_EDEFAULT);
				return;
			case DocbookPackage.TABLE_TYPE__VENDOR:
				setVendor(VENDOR_EDEFAULT);
				return;
			case DocbookPackage.TABLE_TYPE__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case DocbookPackage.TABLE_TYPE__WIDTH:
				setWidth(WIDTH_EDEFAULT);
				return;
			case DocbookPackage.TABLE_TYPE__WORDSIZE:
				setWordsize(WORDSIZE_EDEFAULT);
				return;
			case DocbookPackage.TABLE_TYPE__XREFLABEL:
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
			case DocbookPackage.TABLE_TYPE__INFO:
				return info != null;
			case DocbookPackage.TABLE_TYPE__TITLE:
				return title != null;
			case DocbookPackage.TABLE_TYPE__TITLEABBREV:
				return titleabbrev != null;
			case DocbookPackage.TABLE_TYPE__INDEXTERM:
				return indexterm != null && !indexterm.isEmpty();
			case DocbookPackage.TABLE_TYPE__TEXTOBJECT:
				return textobject != null && !textobject.isEmpty();
			case DocbookPackage.TABLE_TYPE__MEDIAOBJECT:
				return mediaobject != null && !mediaobject.isEmpty();
			case DocbookPackage.TABLE_TYPE__TGROUP:
				return tgroup != null && !tgroup.isEmpty();
			case DocbookPackage.TABLE_TYPE__CAPTION:
				return caption != null;
			case DocbookPackage.TABLE_TYPE__COL:
				return col != null && !col.isEmpty();
			case DocbookPackage.TABLE_TYPE__COLGROUP:
				return colgroup != null && !colgroup.isEmpty();
			case DocbookPackage.TABLE_TYPE__THEAD:
				return thead != null;
			case DocbookPackage.TABLE_TYPE__TFOOT:
				return tfoot != null;
			case DocbookPackage.TABLE_TYPE__TBODY:
				return tbody != null && !tbody.isEmpty();
			case DocbookPackage.TABLE_TYPE__TR:
				return tr != null && !tr.isEmpty();
			case DocbookPackage.TABLE_TYPE__ACTUATE:
				return isSetActuate();
			case DocbookPackage.TABLE_TYPE__ANNOTATIONS:
				return ANNOTATIONS_EDEFAULT == null ? annotations != null : !ANNOTATIONS_EDEFAULT.equals(annotations);
			case DocbookPackage.TABLE_TYPE__ARCH:
				return ARCH_EDEFAULT == null ? arch != null : !ARCH_EDEFAULT.equals(arch);
			case DocbookPackage.TABLE_TYPE__ARCROLE:
				return ARCROLE_EDEFAULT == null ? arcrole != null : !ARCROLE_EDEFAULT.equals(arcrole);
			case DocbookPackage.TABLE_TYPE__AUDIENCE:
				return AUDIENCE_EDEFAULT == null ? audience != null : !AUDIENCE_EDEFAULT.equals(audience);
			case DocbookPackage.TABLE_TYPE__BASE:
				return BASE_EDEFAULT == null ? base != null : !BASE_EDEFAULT.equals(base);
			case DocbookPackage.TABLE_TYPE__BORDER:
				return BORDER_EDEFAULT == null ? border != null : !BORDER_EDEFAULT.equals(border);
			case DocbookPackage.TABLE_TYPE__CELLPADDING:
				return CELLPADDING_EDEFAULT == null ? cellpadding != null : !CELLPADDING_EDEFAULT.equals(cellpadding);
			case DocbookPackage.TABLE_TYPE__CELLSPACING:
				return CELLSPACING_EDEFAULT == null ? cellspacing != null : !CELLSPACING_EDEFAULT.equals(cellspacing);
			case DocbookPackage.TABLE_TYPE__CLASS:
				return CLASS_EDEFAULT == null ? class_ != null : !CLASS_EDEFAULT.equals(class_);
			case DocbookPackage.TABLE_TYPE__COLSEP:
				return isSetColsep();
			case DocbookPackage.TABLE_TYPE__CONDITION:
				return CONDITION_EDEFAULT == null ? condition != null : !CONDITION_EDEFAULT.equals(condition);
			case DocbookPackage.TABLE_TYPE__CONFORMANCE:
				return CONFORMANCE_EDEFAULT == null ? conformance != null : !CONFORMANCE_EDEFAULT.equals(conformance);
			case DocbookPackage.TABLE_TYPE__DIR:
				return isSetDir();
			case DocbookPackage.TABLE_TYPE__FLOATSTYLE:
				return FLOATSTYLE_EDEFAULT == null ? floatstyle != null : !FLOATSTYLE_EDEFAULT.equals(floatstyle);
			case DocbookPackage.TABLE_TYPE__FRAME:
				return isSetFrame();
			case DocbookPackage.TABLE_TYPE__HREF:
				return HREF_EDEFAULT == null ? href != null : !HREF_EDEFAULT.equals(href);
			case DocbookPackage.TABLE_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case DocbookPackage.TABLE_TYPE__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case DocbookPackage.TABLE_TYPE__LANG:
				return LANG_EDEFAULT == null ? lang != null : !LANG_EDEFAULT.equals(lang);
			case DocbookPackage.TABLE_TYPE__LANG1:
				return LANG1_EDEFAULT == null ? lang1 != null : !LANG1_EDEFAULT.equals(lang1);
			case DocbookPackage.TABLE_TYPE__LINKEND:
				return LINKEND_EDEFAULT == null ? linkend != null : !LINKEND_EDEFAULT.equals(linkend);
			case DocbookPackage.TABLE_TYPE__ONCLICK:
				return ONCLICK_EDEFAULT == null ? onclick != null : !ONCLICK_EDEFAULT.equals(onclick);
			case DocbookPackage.TABLE_TYPE__ONDBLCLICK:
				return ONDBLCLICK_EDEFAULT == null ? ondblclick != null : !ONDBLCLICK_EDEFAULT.equals(ondblclick);
			case DocbookPackage.TABLE_TYPE__ONKEYDOWN:
				return ONKEYDOWN_EDEFAULT == null ? onkeydown != null : !ONKEYDOWN_EDEFAULT.equals(onkeydown);
			case DocbookPackage.TABLE_TYPE__ONKEYPRESS:
				return ONKEYPRESS_EDEFAULT == null ? onkeypress != null : !ONKEYPRESS_EDEFAULT.equals(onkeypress);
			case DocbookPackage.TABLE_TYPE__ONKEYUP:
				return ONKEYUP_EDEFAULT == null ? onkeyup != null : !ONKEYUP_EDEFAULT.equals(onkeyup);
			case DocbookPackage.TABLE_TYPE__ONMOUSEDOWN:
				return ONMOUSEDOWN_EDEFAULT == null ? onmousedown != null : !ONMOUSEDOWN_EDEFAULT.equals(onmousedown);
			case DocbookPackage.TABLE_TYPE__ONMOUSEMOVE:
				return ONMOUSEMOVE_EDEFAULT == null ? onmousemove != null : !ONMOUSEMOVE_EDEFAULT.equals(onmousemove);
			case DocbookPackage.TABLE_TYPE__ONMOUSEOUT:
				return ONMOUSEOUT_EDEFAULT == null ? onmouseout != null : !ONMOUSEOUT_EDEFAULT.equals(onmouseout);
			case DocbookPackage.TABLE_TYPE__ONMOUSEOVER:
				return ONMOUSEOVER_EDEFAULT == null ? onmouseover != null : !ONMOUSEOVER_EDEFAULT.equals(onmouseover);
			case DocbookPackage.TABLE_TYPE__ONMOUSEUP:
				return ONMOUSEUP_EDEFAULT == null ? onmouseup != null : !ONMOUSEUP_EDEFAULT.equals(onmouseup);
			case DocbookPackage.TABLE_TYPE__ORIENT:
				return isSetOrient();
			case DocbookPackage.TABLE_TYPE__OS:
				return OS_EDEFAULT == null ? os != null : !OS_EDEFAULT.equals(os);
			case DocbookPackage.TABLE_TYPE__PGWIDE:
				return isSetPgwide();
			case DocbookPackage.TABLE_TYPE__REMAP:
				return REMAP_EDEFAULT == null ? remap != null : !REMAP_EDEFAULT.equals(remap);
			case DocbookPackage.TABLE_TYPE__REVISION:
				return REVISION_EDEFAULT == null ? revision != null : !REVISION_EDEFAULT.equals(revision);
			case DocbookPackage.TABLE_TYPE__REVISIONFLAG:
				return isSetRevisionflag();
			case DocbookPackage.TABLE_TYPE__ROLE:
				return ROLE_EDEFAULT == null ? role != null : !ROLE_EDEFAULT.equals(role);
			case DocbookPackage.TABLE_TYPE__ROLE1:
				return ROLE1_EDEFAULT == null ? role1 != null : !ROLE1_EDEFAULT.equals(role1);
			case DocbookPackage.TABLE_TYPE__ROWHEADER:
				return isSetRowheader();
			case DocbookPackage.TABLE_TYPE__ROWSEP:
				return isSetRowsep();
			case DocbookPackage.TABLE_TYPE__RULES:
				return isSetRules();
			case DocbookPackage.TABLE_TYPE__SECURITY:
				return SECURITY_EDEFAULT == null ? security != null : !SECURITY_EDEFAULT.equals(security);
			case DocbookPackage.TABLE_TYPE__SHORTENTRY:
				return isSetShortentry();
			case DocbookPackage.TABLE_TYPE__SHOW:
				return isSetShow();
			case DocbookPackage.TABLE_TYPE__STYLE:
				return STYLE_EDEFAULT == null ? style != null : !STYLE_EDEFAULT.equals(style);
			case DocbookPackage.TABLE_TYPE__SUMMARY:
				return SUMMARY_EDEFAULT == null ? summary != null : !SUMMARY_EDEFAULT.equals(summary);
			case DocbookPackage.TABLE_TYPE__TABSTYLE:
				return TABSTYLE_EDEFAULT == null ? tabstyle != null : !TABSTYLE_EDEFAULT.equals(tabstyle);
			case DocbookPackage.TABLE_TYPE__TITLE1:
				return TITLE1_EDEFAULT == null ? title1 != null : !TITLE1_EDEFAULT.equals(title1);
			case DocbookPackage.TABLE_TYPE__TITLE2:
				return TITLE2_EDEFAULT == null ? title2 != null : !TITLE2_EDEFAULT.equals(title2);
			case DocbookPackage.TABLE_TYPE__TOCENTRY:
				return isSetTocentry();
			case DocbookPackage.TABLE_TYPE__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case DocbookPackage.TABLE_TYPE__USERLEVEL:
				return USERLEVEL_EDEFAULT == null ? userlevel != null : !USERLEVEL_EDEFAULT.equals(userlevel);
			case DocbookPackage.TABLE_TYPE__VENDOR:
				return VENDOR_EDEFAULT == null ? vendor != null : !VENDOR_EDEFAULT.equals(vendor);
			case DocbookPackage.TABLE_TYPE__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
			case DocbookPackage.TABLE_TYPE__WIDTH:
				return WIDTH_EDEFAULT == null ? width != null : !WIDTH_EDEFAULT.equals(width);
			case DocbookPackage.TABLE_TYPE__WORDSIZE:
				return WORDSIZE_EDEFAULT == null ? wordsize != null : !WORDSIZE_EDEFAULT.equals(wordsize);
			case DocbookPackage.TABLE_TYPE__XREFLABEL:
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
		result.append(", border: ");
		result.append(border);
		result.append(", cellpadding: ");
		result.append(cellpadding);
		result.append(", cellspacing: ");
		result.append(cellspacing);
		result.append(", class: ");
		result.append(class_);
		result.append(", colsep: ");
		if (colsepESet) result.append(colsep); else result.append("<unset>");
		result.append(", condition: ");
		result.append(condition);
		result.append(", conformance: ");
		result.append(conformance);
		result.append(", dir: ");
		if (dirESet) result.append(dir); else result.append("<unset>");
		result.append(", floatstyle: ");
		result.append(floatstyle);
		result.append(", frame: ");
		if (frameESet) result.append(frame); else result.append("<unset>");
		result.append(", href: ");
		result.append(href);
		result.append(", id: ");
		result.append(id);
		result.append(", label: ");
		result.append(label);
		result.append(", lang: ");
		result.append(lang);
		result.append(", lang1: ");
		result.append(lang1);
		result.append(", linkend: ");
		result.append(linkend);
		result.append(", onclick: ");
		result.append(onclick);
		result.append(", ondblclick: ");
		result.append(ondblclick);
		result.append(", onkeydown: ");
		result.append(onkeydown);
		result.append(", onkeypress: ");
		result.append(onkeypress);
		result.append(", onkeyup: ");
		result.append(onkeyup);
		result.append(", onmousedown: ");
		result.append(onmousedown);
		result.append(", onmousemove: ");
		result.append(onmousemove);
		result.append(", onmouseout: ");
		result.append(onmouseout);
		result.append(", onmouseover: ");
		result.append(onmouseover);
		result.append(", onmouseup: ");
		result.append(onmouseup);
		result.append(", orient: ");
		if (orientESet) result.append(orient); else result.append("<unset>");
		result.append(", os: ");
		result.append(os);
		result.append(", pgwide: ");
		if (pgwideESet) result.append(pgwide); else result.append("<unset>");
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
		result.append(", rowheader: ");
		if (rowheaderESet) result.append(rowheader); else result.append("<unset>");
		result.append(", rowsep: ");
		if (rowsepESet) result.append(rowsep); else result.append("<unset>");
		result.append(", rules: ");
		if (rulesESet) result.append(rules); else result.append("<unset>");
		result.append(", security: ");
		result.append(security);
		result.append(", shortentry: ");
		if (shortentryESet) result.append(shortentry); else result.append("<unset>");
		result.append(", show: ");
		if (showESet) result.append(show); else result.append("<unset>");
		result.append(", style: ");
		result.append(style);
		result.append(", summary: ");
		result.append(summary);
		result.append(", tabstyle: ");
		result.append(tabstyle);
		result.append(", title1: ");
		result.append(title1);
		result.append(", title2: ");
		result.append(title2);
		result.append(", tocentry: ");
		if (tocentryESet) result.append(tocentry); else result.append("<unset>");
		result.append(", type: ");
		result.append(type);
		result.append(", userlevel: ");
		result.append(userlevel);
		result.append(", vendor: ");
		result.append(vendor);
		result.append(", version: ");
		result.append(version);
		result.append(", width: ");
		result.append(width);
		result.append(", wordsize: ");
		result.append(wordsize);
		result.append(", xreflabel: ");
		result.append(xreflabel);
		result.append(')');
		return result.toString();
	}

} //TableTypeImpl
