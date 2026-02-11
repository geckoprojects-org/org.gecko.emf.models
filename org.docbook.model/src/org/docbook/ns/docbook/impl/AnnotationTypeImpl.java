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

import org.docbook.ns.docbook.AddressType;
import org.docbook.ns.docbook.AnchorType;
import org.docbook.ns.docbook.AnnotationType;
import org.docbook.ns.docbook.BibliolistType;
import org.docbook.ns.docbook.BlockquoteType;
import org.docbook.ns.docbook.BridgeheadType;
import org.docbook.ns.docbook.CalloutlistType;
import org.docbook.ns.docbook.CautionType;
import org.docbook.ns.docbook.ClasssynopsisType;
import org.docbook.ns.docbook.CmdsynopsisType;
import org.docbook.ns.docbook.ConstraintdefType;
import org.docbook.ns.docbook.ConstructorsynopsisType;
import org.docbook.ns.docbook.DestructorsynopsisType;
import org.docbook.ns.docbook.DirType;
import org.docbook.ns.docbook.DocbookPackage;
import org.docbook.ns.docbook.EpigraphType;
import org.docbook.ns.docbook.EquationType;
import org.docbook.ns.docbook.ExampleType;
import org.docbook.ns.docbook.FieldsynopsisType;
import org.docbook.ns.docbook.FigureType;
import org.docbook.ns.docbook.FormalparaType;
import org.docbook.ns.docbook.FuncsynopsisType;
import org.docbook.ns.docbook.GlosslistType;
import org.docbook.ns.docbook.ImportantType;
import org.docbook.ns.docbook.IndextermType;
import org.docbook.ns.docbook.InfoType;
import org.docbook.ns.docbook.InformalequationType;
import org.docbook.ns.docbook.InformalexampleType;
import org.docbook.ns.docbook.InformalfigureType;
import org.docbook.ns.docbook.InformaltableType;
import org.docbook.ns.docbook.ItemizedlistType;
import org.docbook.ns.docbook.LiterallayoutType;
import org.docbook.ns.docbook.MediaobjectType;
import org.docbook.ns.docbook.MethodsynopsisType;
import org.docbook.ns.docbook.MsgsetType;
import org.docbook.ns.docbook.NoteType;
import org.docbook.ns.docbook.OrderedlistType;
import org.docbook.ns.docbook.ParaType;
import org.docbook.ns.docbook.ProcedureType;
import org.docbook.ns.docbook.ProductionsetType;
import org.docbook.ns.docbook.ProgramlistingType;
import org.docbook.ns.docbook.ProgramlistingcoType;
import org.docbook.ns.docbook.QandasetType;
import org.docbook.ns.docbook.RemarkType;
import org.docbook.ns.docbook.RevhistoryType;
import org.docbook.ns.docbook.RevisionflagType;
import org.docbook.ns.docbook.ScreenType;
import org.docbook.ns.docbook.ScreencoType;
import org.docbook.ns.docbook.ScreenshotType;
import org.docbook.ns.docbook.SegmentedlistType;
import org.docbook.ns.docbook.SidebarType;
import org.docbook.ns.docbook.SimparaType;
import org.docbook.ns.docbook.SimplelistType;
import org.docbook.ns.docbook.SynopsisType;
import org.docbook.ns.docbook.TableType;
import org.docbook.ns.docbook.TaskType;
import org.docbook.ns.docbook.TipType;
import org.docbook.ns.docbook.TitleType;
import org.docbook.ns.docbook.TitleabbrevType;
import org.docbook.ns.docbook.VariablelistType;
import org.docbook.ns.docbook.WarningType;

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

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Annotation Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.docbook.ns.docbook.impl.AnnotationTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.AnnotationTypeImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.AnnotationTypeImpl#getTitleabbrev <em>Titleabbrev</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.AnnotationTypeImpl#getInfo <em>Info</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.AnnotationTypeImpl#getGroup1 <em>Group1</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.AnnotationTypeImpl#getItemizedlist <em>Itemizedlist</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.AnnotationTypeImpl#getOrderedlist <em>Orderedlist</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.AnnotationTypeImpl#getProcedure <em>Procedure</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.AnnotationTypeImpl#getSimplelist <em>Simplelist</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.AnnotationTypeImpl#getVariablelist <em>Variablelist</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.AnnotationTypeImpl#getSegmentedlist <em>Segmentedlist</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.AnnotationTypeImpl#getGlosslist <em>Glosslist</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.AnnotationTypeImpl#getBibliolist <em>Bibliolist</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.AnnotationTypeImpl#getCalloutlist <em>Calloutlist</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.AnnotationTypeImpl#getQandaset <em>Qandaset</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.AnnotationTypeImpl#getExample <em>Example</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.AnnotationTypeImpl#getFigure <em>Figure</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.AnnotationTypeImpl#getTable <em>Table</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.AnnotationTypeImpl#getEquation <em>Equation</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.AnnotationTypeImpl#getInformalexample <em>Informalexample</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.AnnotationTypeImpl#getInformalfigure <em>Informalfigure</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.AnnotationTypeImpl#getInformaltable <em>Informaltable</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.AnnotationTypeImpl#getInformalequation <em>Informalequation</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.AnnotationTypeImpl#getSidebar <em>Sidebar</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.AnnotationTypeImpl#getBlockquote <em>Blockquote</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.AnnotationTypeImpl#getAddress <em>Address</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.AnnotationTypeImpl#getEpigraph <em>Epigraph</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.AnnotationTypeImpl#getMediaobject <em>Mediaobject</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.AnnotationTypeImpl#getScreenshot <em>Screenshot</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.AnnotationTypeImpl#getTask <em>Task</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.AnnotationTypeImpl#getProductionset <em>Productionset</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.AnnotationTypeImpl#getConstraintdef <em>Constraintdef</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.AnnotationTypeImpl#getMsgset <em>Msgset</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.AnnotationTypeImpl#getScreen <em>Screen</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.AnnotationTypeImpl#getLiterallayout <em>Literallayout</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.AnnotationTypeImpl#getProgramlistingco <em>Programlistingco</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.AnnotationTypeImpl#getScreenco <em>Screenco</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.AnnotationTypeImpl#getProgramlisting <em>Programlisting</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.AnnotationTypeImpl#getSynopsis <em>Synopsis</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.AnnotationTypeImpl#getBridgehead <em>Bridgehead</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.AnnotationTypeImpl#getRemark <em>Remark</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.AnnotationTypeImpl#getRevhistory <em>Revhistory</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.AnnotationTypeImpl#getIndexterm <em>Indexterm</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.AnnotationTypeImpl#getFuncsynopsis <em>Funcsynopsis</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.AnnotationTypeImpl#getClasssynopsis <em>Classsynopsis</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.AnnotationTypeImpl#getMethodsynopsis <em>Methodsynopsis</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.AnnotationTypeImpl#getConstructorsynopsis <em>Constructorsynopsis</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.AnnotationTypeImpl#getDestructorsynopsis <em>Destructorsynopsis</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.AnnotationTypeImpl#getFieldsynopsis <em>Fieldsynopsis</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.AnnotationTypeImpl#getCmdsynopsis <em>Cmdsynopsis</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.AnnotationTypeImpl#getCaution <em>Caution</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.AnnotationTypeImpl#getImportant <em>Important</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.AnnotationTypeImpl#getNote <em>Note</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.AnnotationTypeImpl#getTip <em>Tip</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.AnnotationTypeImpl#getWarning <em>Warning</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.AnnotationTypeImpl#getAnchor <em>Anchor</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.AnnotationTypeImpl#getPara <em>Para</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.AnnotationTypeImpl#getFormalpara <em>Formalpara</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.AnnotationTypeImpl#getSimpara <em>Simpara</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.AnnotationTypeImpl#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.AnnotationTypeImpl#getAnnotates <em>Annotates</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.AnnotationTypeImpl#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.AnnotationTypeImpl#getArch <em>Arch</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.AnnotationTypeImpl#getAudience <em>Audience</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.AnnotationTypeImpl#getBase <em>Base</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.AnnotationTypeImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.AnnotationTypeImpl#getConformance <em>Conformance</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.AnnotationTypeImpl#getDir <em>Dir</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.AnnotationTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.AnnotationTypeImpl#getLang <em>Lang</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.AnnotationTypeImpl#getOs <em>Os</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.AnnotationTypeImpl#getRemap <em>Remap</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.AnnotationTypeImpl#getRevision <em>Revision</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.AnnotationTypeImpl#getRevisionflag <em>Revisionflag</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.AnnotationTypeImpl#getRole <em>Role</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.AnnotationTypeImpl#getSecurity <em>Security</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.AnnotationTypeImpl#getUserlevel <em>Userlevel</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.AnnotationTypeImpl#getVendor <em>Vendor</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.AnnotationTypeImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.AnnotationTypeImpl#getWordsize <em>Wordsize</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.AnnotationTypeImpl#getXreflabel <em>Xreflabel</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AnnotationTypeImpl extends MinimalEObjectImpl.Container implements AnnotationType {
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
	 * The cached value of the '{@link #getGroup1() <em>Group1</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup1()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap group1;

	/**
	 * The default value of the '{@link #getAnnotates() <em>Annotates</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotates()
	 * @generated
	 * @ordered
	 */
	protected static final Object ANNOTATES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAnnotates() <em>Annotates</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotates()
	 * @generated
	 * @ordered
	 */
	protected Object annotates = ANNOTATES_EDEFAULT;

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
	protected AnnotationTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DocbookPackage.eINSTANCE.getAnnotationType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, DocbookPackage.ANNOTATION_TYPE__GROUP);
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
		return getGroup().list(DocbookPackage.eINSTANCE.getAnnotationType_Title());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TitleabbrevType> getTitleabbrev() {
		return getGroup().list(DocbookPackage.eINSTANCE.getAnnotationType_Titleabbrev());
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DocbookPackage.ANNOTATION_TYPE__INFO, oldInfo, newInfo);
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
				msgs = ((InternalEObject)info).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DocbookPackage.ANNOTATION_TYPE__INFO, null, msgs);
			if (newInfo != null)
				msgs = ((InternalEObject)newInfo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DocbookPackage.ANNOTATION_TYPE__INFO, null, msgs);
			msgs = basicSetInfo(newInfo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.ANNOTATION_TYPE__INFO, newInfo, newInfo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getGroup1() {
		if (group1 == null) {
			group1 = new BasicFeatureMap(this, DocbookPackage.ANNOTATION_TYPE__GROUP1);
		}
		return group1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ItemizedlistType> getItemizedlist() {
		return getGroup1().list(DocbookPackage.eINSTANCE.getAnnotationType_Itemizedlist());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<OrderedlistType> getOrderedlist() {
		return getGroup1().list(DocbookPackage.eINSTANCE.getAnnotationType_Orderedlist());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ProcedureType> getProcedure() {
		return getGroup1().list(DocbookPackage.eINSTANCE.getAnnotationType_Procedure());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SimplelistType> getSimplelist() {
		return getGroup1().list(DocbookPackage.eINSTANCE.getAnnotationType_Simplelist());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<VariablelistType> getVariablelist() {
		return getGroup1().list(DocbookPackage.eINSTANCE.getAnnotationType_Variablelist());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SegmentedlistType> getSegmentedlist() {
		return getGroup1().list(DocbookPackage.eINSTANCE.getAnnotationType_Segmentedlist());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<GlosslistType> getGlosslist() {
		return getGroup1().list(DocbookPackage.eINSTANCE.getAnnotationType_Glosslist());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BibliolistType> getBibliolist() {
		return getGroup1().list(DocbookPackage.eINSTANCE.getAnnotationType_Bibliolist());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CalloutlistType> getCalloutlist() {
		return getGroup1().list(DocbookPackage.eINSTANCE.getAnnotationType_Calloutlist());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<QandasetType> getQandaset() {
		return getGroup1().list(DocbookPackage.eINSTANCE.getAnnotationType_Qandaset());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ExampleType> getExample() {
		return getGroup1().list(DocbookPackage.eINSTANCE.getAnnotationType_Example());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FigureType> getFigure() {
		return getGroup1().list(DocbookPackage.eINSTANCE.getAnnotationType_Figure());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TableType> getTable() {
		return getGroup1().list(DocbookPackage.eINSTANCE.getAnnotationType_Table());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EquationType> getEquation() {
		return getGroup1().list(DocbookPackage.eINSTANCE.getAnnotationType_Equation());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InformalexampleType> getInformalexample() {
		return getGroup1().list(DocbookPackage.eINSTANCE.getAnnotationType_Informalexample());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InformalfigureType> getInformalfigure() {
		return getGroup1().list(DocbookPackage.eINSTANCE.getAnnotationType_Informalfigure());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InformaltableType> getInformaltable() {
		return getGroup1().list(DocbookPackage.eINSTANCE.getAnnotationType_Informaltable());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InformalequationType> getInformalequation() {
		return getGroup1().list(DocbookPackage.eINSTANCE.getAnnotationType_Informalequation());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SidebarType> getSidebar() {
		return getGroup1().list(DocbookPackage.eINSTANCE.getAnnotationType_Sidebar());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BlockquoteType> getBlockquote() {
		return getGroup1().list(DocbookPackage.eINSTANCE.getAnnotationType_Blockquote());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AddressType> getAddress() {
		return getGroup1().list(DocbookPackage.eINSTANCE.getAnnotationType_Address());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EpigraphType> getEpigraph() {
		return getGroup1().list(DocbookPackage.eINSTANCE.getAnnotationType_Epigraph());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MediaobjectType> getMediaobject() {
		return getGroup1().list(DocbookPackage.eINSTANCE.getAnnotationType_Mediaobject());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ScreenshotType> getScreenshot() {
		return getGroup1().list(DocbookPackage.eINSTANCE.getAnnotationType_Screenshot());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TaskType> getTask() {
		return getGroup1().list(DocbookPackage.eINSTANCE.getAnnotationType_Task());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ProductionsetType> getProductionset() {
		return getGroup1().list(DocbookPackage.eINSTANCE.getAnnotationType_Productionset());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ConstraintdefType> getConstraintdef() {
		return getGroup1().list(DocbookPackage.eINSTANCE.getAnnotationType_Constraintdef());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MsgsetType> getMsgset() {
		return getGroup1().list(DocbookPackage.eINSTANCE.getAnnotationType_Msgset());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ScreenType> getScreen() {
		return getGroup1().list(DocbookPackage.eINSTANCE.getAnnotationType_Screen());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<LiterallayoutType> getLiterallayout() {
		return getGroup1().list(DocbookPackage.eINSTANCE.getAnnotationType_Literallayout());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ProgramlistingcoType> getProgramlistingco() {
		return getGroup1().list(DocbookPackage.eINSTANCE.getAnnotationType_Programlistingco());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ScreencoType> getScreenco() {
		return getGroup1().list(DocbookPackage.eINSTANCE.getAnnotationType_Screenco());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ProgramlistingType> getProgramlisting() {
		return getGroup1().list(DocbookPackage.eINSTANCE.getAnnotationType_Programlisting());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SynopsisType> getSynopsis() {
		return getGroup1().list(DocbookPackage.eINSTANCE.getAnnotationType_Synopsis());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BridgeheadType> getBridgehead() {
		return getGroup1().list(DocbookPackage.eINSTANCE.getAnnotationType_Bridgehead());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RemarkType> getRemark() {
		return getGroup1().list(DocbookPackage.eINSTANCE.getAnnotationType_Remark());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RevhistoryType> getRevhistory() {
		return getGroup1().list(DocbookPackage.eINSTANCE.getAnnotationType_Revhistory());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<IndextermType> getIndexterm() {
		return getGroup1().list(DocbookPackage.eINSTANCE.getAnnotationType_Indexterm());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FuncsynopsisType> getFuncsynopsis() {
		return getGroup1().list(DocbookPackage.eINSTANCE.getAnnotationType_Funcsynopsis());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ClasssynopsisType> getClasssynopsis() {
		return getGroup1().list(DocbookPackage.eINSTANCE.getAnnotationType_Classsynopsis());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MethodsynopsisType> getMethodsynopsis() {
		return getGroup1().list(DocbookPackage.eINSTANCE.getAnnotationType_Methodsynopsis());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ConstructorsynopsisType> getConstructorsynopsis() {
		return getGroup1().list(DocbookPackage.eINSTANCE.getAnnotationType_Constructorsynopsis());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DestructorsynopsisType> getDestructorsynopsis() {
		return getGroup1().list(DocbookPackage.eINSTANCE.getAnnotationType_Destructorsynopsis());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FieldsynopsisType> getFieldsynopsis() {
		return getGroup1().list(DocbookPackage.eINSTANCE.getAnnotationType_Fieldsynopsis());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CmdsynopsisType> getCmdsynopsis() {
		return getGroup1().list(DocbookPackage.eINSTANCE.getAnnotationType_Cmdsynopsis());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CautionType> getCaution() {
		return getGroup1().list(DocbookPackage.eINSTANCE.getAnnotationType_Caution());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ImportantType> getImportant() {
		return getGroup1().list(DocbookPackage.eINSTANCE.getAnnotationType_Important());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NoteType> getNote() {
		return getGroup1().list(DocbookPackage.eINSTANCE.getAnnotationType_Note());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TipType> getTip() {
		return getGroup1().list(DocbookPackage.eINSTANCE.getAnnotationType_Tip());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<WarningType> getWarning() {
		return getGroup1().list(DocbookPackage.eINSTANCE.getAnnotationType_Warning());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AnchorType> getAnchor() {
		return getGroup1().list(DocbookPackage.eINSTANCE.getAnnotationType_Anchor());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ParaType> getPara() {
		return getGroup1().list(DocbookPackage.eINSTANCE.getAnnotationType_Para());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FormalparaType> getFormalpara() {
		return getGroup1().list(DocbookPackage.eINSTANCE.getAnnotationType_Formalpara());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SimparaType> getSimpara() {
		return getGroup1().list(DocbookPackage.eINSTANCE.getAnnotationType_Simpara());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AnnotationType> getAnnotation() {
		return getGroup1().list(DocbookPackage.eINSTANCE.getAnnotationType_Annotation());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getAnnotates() {
		return annotates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAnnotates(Object newAnnotates) {
		Object oldAnnotates = annotates;
		annotates = newAnnotates;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.ANNOTATION_TYPE__ANNOTATES, oldAnnotates, annotates));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.ANNOTATION_TYPE__ANNOTATIONS, oldAnnotations, annotations));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.ANNOTATION_TYPE__ARCH, oldArch, arch));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.ANNOTATION_TYPE__AUDIENCE, oldAudience, audience));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.ANNOTATION_TYPE__BASE, oldBase, base));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.ANNOTATION_TYPE__CONDITION, oldCondition, condition));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.ANNOTATION_TYPE__CONFORMANCE, oldConformance, conformance));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.ANNOTATION_TYPE__DIR, oldDir, dir, !oldDirESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, DocbookPackage.ANNOTATION_TYPE__DIR, oldDir, DIR_EDEFAULT, oldDirESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.ANNOTATION_TYPE__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.ANNOTATION_TYPE__LANG, oldLang, lang));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.ANNOTATION_TYPE__OS, oldOs, os));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.ANNOTATION_TYPE__REMAP, oldRemap, remap));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.ANNOTATION_TYPE__REVISION, oldRevision, revision));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.ANNOTATION_TYPE__REVISIONFLAG, oldRevisionflag, revisionflag, !oldRevisionflagESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, DocbookPackage.ANNOTATION_TYPE__REVISIONFLAG, oldRevisionflag, REVISIONFLAG_EDEFAULT, oldRevisionflagESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.ANNOTATION_TYPE__ROLE, oldRole, role));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.ANNOTATION_TYPE__SECURITY, oldSecurity, security));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.ANNOTATION_TYPE__USERLEVEL, oldUserlevel, userlevel));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.ANNOTATION_TYPE__VENDOR, oldVendor, vendor));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.ANNOTATION_TYPE__VERSION, oldVersion, version));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.ANNOTATION_TYPE__WORDSIZE, oldWordsize, wordsize));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.ANNOTATION_TYPE__XREFLABEL, oldXreflabel, xreflabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DocbookPackage.ANNOTATION_TYPE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case DocbookPackage.ANNOTATION_TYPE__TITLE:
				return ((InternalEList<?>)getTitle()).basicRemove(otherEnd, msgs);
			case DocbookPackage.ANNOTATION_TYPE__TITLEABBREV:
				return ((InternalEList<?>)getTitleabbrev()).basicRemove(otherEnd, msgs);
			case DocbookPackage.ANNOTATION_TYPE__INFO:
				return basicSetInfo(null, msgs);
			case DocbookPackage.ANNOTATION_TYPE__GROUP1:
				return ((InternalEList<?>)getGroup1()).basicRemove(otherEnd, msgs);
			case DocbookPackage.ANNOTATION_TYPE__ITEMIZEDLIST:
				return ((InternalEList<?>)getItemizedlist()).basicRemove(otherEnd, msgs);
			case DocbookPackage.ANNOTATION_TYPE__ORDEREDLIST:
				return ((InternalEList<?>)getOrderedlist()).basicRemove(otherEnd, msgs);
			case DocbookPackage.ANNOTATION_TYPE__PROCEDURE:
				return ((InternalEList<?>)getProcedure()).basicRemove(otherEnd, msgs);
			case DocbookPackage.ANNOTATION_TYPE__SIMPLELIST:
				return ((InternalEList<?>)getSimplelist()).basicRemove(otherEnd, msgs);
			case DocbookPackage.ANNOTATION_TYPE__VARIABLELIST:
				return ((InternalEList<?>)getVariablelist()).basicRemove(otherEnd, msgs);
			case DocbookPackage.ANNOTATION_TYPE__SEGMENTEDLIST:
				return ((InternalEList<?>)getSegmentedlist()).basicRemove(otherEnd, msgs);
			case DocbookPackage.ANNOTATION_TYPE__GLOSSLIST:
				return ((InternalEList<?>)getGlosslist()).basicRemove(otherEnd, msgs);
			case DocbookPackage.ANNOTATION_TYPE__BIBLIOLIST:
				return ((InternalEList<?>)getBibliolist()).basicRemove(otherEnd, msgs);
			case DocbookPackage.ANNOTATION_TYPE__CALLOUTLIST:
				return ((InternalEList<?>)getCalloutlist()).basicRemove(otherEnd, msgs);
			case DocbookPackage.ANNOTATION_TYPE__QANDASET:
				return ((InternalEList<?>)getQandaset()).basicRemove(otherEnd, msgs);
			case DocbookPackage.ANNOTATION_TYPE__EXAMPLE:
				return ((InternalEList<?>)getExample()).basicRemove(otherEnd, msgs);
			case DocbookPackage.ANNOTATION_TYPE__FIGURE:
				return ((InternalEList<?>)getFigure()).basicRemove(otherEnd, msgs);
			case DocbookPackage.ANNOTATION_TYPE__TABLE:
				return ((InternalEList<?>)getTable()).basicRemove(otherEnd, msgs);
			case DocbookPackage.ANNOTATION_TYPE__EQUATION:
				return ((InternalEList<?>)getEquation()).basicRemove(otherEnd, msgs);
			case DocbookPackage.ANNOTATION_TYPE__INFORMALEXAMPLE:
				return ((InternalEList<?>)getInformalexample()).basicRemove(otherEnd, msgs);
			case DocbookPackage.ANNOTATION_TYPE__INFORMALFIGURE:
				return ((InternalEList<?>)getInformalfigure()).basicRemove(otherEnd, msgs);
			case DocbookPackage.ANNOTATION_TYPE__INFORMALTABLE:
				return ((InternalEList<?>)getInformaltable()).basicRemove(otherEnd, msgs);
			case DocbookPackage.ANNOTATION_TYPE__INFORMALEQUATION:
				return ((InternalEList<?>)getInformalequation()).basicRemove(otherEnd, msgs);
			case DocbookPackage.ANNOTATION_TYPE__SIDEBAR:
				return ((InternalEList<?>)getSidebar()).basicRemove(otherEnd, msgs);
			case DocbookPackage.ANNOTATION_TYPE__BLOCKQUOTE:
				return ((InternalEList<?>)getBlockquote()).basicRemove(otherEnd, msgs);
			case DocbookPackage.ANNOTATION_TYPE__ADDRESS:
				return ((InternalEList<?>)getAddress()).basicRemove(otherEnd, msgs);
			case DocbookPackage.ANNOTATION_TYPE__EPIGRAPH:
				return ((InternalEList<?>)getEpigraph()).basicRemove(otherEnd, msgs);
			case DocbookPackage.ANNOTATION_TYPE__MEDIAOBJECT:
				return ((InternalEList<?>)getMediaobject()).basicRemove(otherEnd, msgs);
			case DocbookPackage.ANNOTATION_TYPE__SCREENSHOT:
				return ((InternalEList<?>)getScreenshot()).basicRemove(otherEnd, msgs);
			case DocbookPackage.ANNOTATION_TYPE__TASK:
				return ((InternalEList<?>)getTask()).basicRemove(otherEnd, msgs);
			case DocbookPackage.ANNOTATION_TYPE__PRODUCTIONSET:
				return ((InternalEList<?>)getProductionset()).basicRemove(otherEnd, msgs);
			case DocbookPackage.ANNOTATION_TYPE__CONSTRAINTDEF:
				return ((InternalEList<?>)getConstraintdef()).basicRemove(otherEnd, msgs);
			case DocbookPackage.ANNOTATION_TYPE__MSGSET:
				return ((InternalEList<?>)getMsgset()).basicRemove(otherEnd, msgs);
			case DocbookPackage.ANNOTATION_TYPE__SCREEN:
				return ((InternalEList<?>)getScreen()).basicRemove(otherEnd, msgs);
			case DocbookPackage.ANNOTATION_TYPE__LITERALLAYOUT:
				return ((InternalEList<?>)getLiterallayout()).basicRemove(otherEnd, msgs);
			case DocbookPackage.ANNOTATION_TYPE__PROGRAMLISTINGCO:
				return ((InternalEList<?>)getProgramlistingco()).basicRemove(otherEnd, msgs);
			case DocbookPackage.ANNOTATION_TYPE__SCREENCO:
				return ((InternalEList<?>)getScreenco()).basicRemove(otherEnd, msgs);
			case DocbookPackage.ANNOTATION_TYPE__PROGRAMLISTING:
				return ((InternalEList<?>)getProgramlisting()).basicRemove(otherEnd, msgs);
			case DocbookPackage.ANNOTATION_TYPE__SYNOPSIS:
				return ((InternalEList<?>)getSynopsis()).basicRemove(otherEnd, msgs);
			case DocbookPackage.ANNOTATION_TYPE__BRIDGEHEAD:
				return ((InternalEList<?>)getBridgehead()).basicRemove(otherEnd, msgs);
			case DocbookPackage.ANNOTATION_TYPE__REMARK:
				return ((InternalEList<?>)getRemark()).basicRemove(otherEnd, msgs);
			case DocbookPackage.ANNOTATION_TYPE__REVHISTORY:
				return ((InternalEList<?>)getRevhistory()).basicRemove(otherEnd, msgs);
			case DocbookPackage.ANNOTATION_TYPE__INDEXTERM:
				return ((InternalEList<?>)getIndexterm()).basicRemove(otherEnd, msgs);
			case DocbookPackage.ANNOTATION_TYPE__FUNCSYNOPSIS:
				return ((InternalEList<?>)getFuncsynopsis()).basicRemove(otherEnd, msgs);
			case DocbookPackage.ANNOTATION_TYPE__CLASSSYNOPSIS:
				return ((InternalEList<?>)getClasssynopsis()).basicRemove(otherEnd, msgs);
			case DocbookPackage.ANNOTATION_TYPE__METHODSYNOPSIS:
				return ((InternalEList<?>)getMethodsynopsis()).basicRemove(otherEnd, msgs);
			case DocbookPackage.ANNOTATION_TYPE__CONSTRUCTORSYNOPSIS:
				return ((InternalEList<?>)getConstructorsynopsis()).basicRemove(otherEnd, msgs);
			case DocbookPackage.ANNOTATION_TYPE__DESTRUCTORSYNOPSIS:
				return ((InternalEList<?>)getDestructorsynopsis()).basicRemove(otherEnd, msgs);
			case DocbookPackage.ANNOTATION_TYPE__FIELDSYNOPSIS:
				return ((InternalEList<?>)getFieldsynopsis()).basicRemove(otherEnd, msgs);
			case DocbookPackage.ANNOTATION_TYPE__CMDSYNOPSIS:
				return ((InternalEList<?>)getCmdsynopsis()).basicRemove(otherEnd, msgs);
			case DocbookPackage.ANNOTATION_TYPE__CAUTION:
				return ((InternalEList<?>)getCaution()).basicRemove(otherEnd, msgs);
			case DocbookPackage.ANNOTATION_TYPE__IMPORTANT:
				return ((InternalEList<?>)getImportant()).basicRemove(otherEnd, msgs);
			case DocbookPackage.ANNOTATION_TYPE__NOTE:
				return ((InternalEList<?>)getNote()).basicRemove(otherEnd, msgs);
			case DocbookPackage.ANNOTATION_TYPE__TIP:
				return ((InternalEList<?>)getTip()).basicRemove(otherEnd, msgs);
			case DocbookPackage.ANNOTATION_TYPE__WARNING:
				return ((InternalEList<?>)getWarning()).basicRemove(otherEnd, msgs);
			case DocbookPackage.ANNOTATION_TYPE__ANCHOR:
				return ((InternalEList<?>)getAnchor()).basicRemove(otherEnd, msgs);
			case DocbookPackage.ANNOTATION_TYPE__PARA:
				return ((InternalEList<?>)getPara()).basicRemove(otherEnd, msgs);
			case DocbookPackage.ANNOTATION_TYPE__FORMALPARA:
				return ((InternalEList<?>)getFormalpara()).basicRemove(otherEnd, msgs);
			case DocbookPackage.ANNOTATION_TYPE__SIMPARA:
				return ((InternalEList<?>)getSimpara()).basicRemove(otherEnd, msgs);
			case DocbookPackage.ANNOTATION_TYPE__ANNOTATION:
				return ((InternalEList<?>)getAnnotation()).basicRemove(otherEnd, msgs);
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
			case DocbookPackage.ANNOTATION_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case DocbookPackage.ANNOTATION_TYPE__TITLE:
				return getTitle();
			case DocbookPackage.ANNOTATION_TYPE__TITLEABBREV:
				return getTitleabbrev();
			case DocbookPackage.ANNOTATION_TYPE__INFO:
				return getInfo();
			case DocbookPackage.ANNOTATION_TYPE__GROUP1:
				if (coreType) return getGroup1();
				return ((FeatureMap.Internal)getGroup1()).getWrapper();
			case DocbookPackage.ANNOTATION_TYPE__ITEMIZEDLIST:
				return getItemizedlist();
			case DocbookPackage.ANNOTATION_TYPE__ORDEREDLIST:
				return getOrderedlist();
			case DocbookPackage.ANNOTATION_TYPE__PROCEDURE:
				return getProcedure();
			case DocbookPackage.ANNOTATION_TYPE__SIMPLELIST:
				return getSimplelist();
			case DocbookPackage.ANNOTATION_TYPE__VARIABLELIST:
				return getVariablelist();
			case DocbookPackage.ANNOTATION_TYPE__SEGMENTEDLIST:
				return getSegmentedlist();
			case DocbookPackage.ANNOTATION_TYPE__GLOSSLIST:
				return getGlosslist();
			case DocbookPackage.ANNOTATION_TYPE__BIBLIOLIST:
				return getBibliolist();
			case DocbookPackage.ANNOTATION_TYPE__CALLOUTLIST:
				return getCalloutlist();
			case DocbookPackage.ANNOTATION_TYPE__QANDASET:
				return getQandaset();
			case DocbookPackage.ANNOTATION_TYPE__EXAMPLE:
				return getExample();
			case DocbookPackage.ANNOTATION_TYPE__FIGURE:
				return getFigure();
			case DocbookPackage.ANNOTATION_TYPE__TABLE:
				return getTable();
			case DocbookPackage.ANNOTATION_TYPE__EQUATION:
				return getEquation();
			case DocbookPackage.ANNOTATION_TYPE__INFORMALEXAMPLE:
				return getInformalexample();
			case DocbookPackage.ANNOTATION_TYPE__INFORMALFIGURE:
				return getInformalfigure();
			case DocbookPackage.ANNOTATION_TYPE__INFORMALTABLE:
				return getInformaltable();
			case DocbookPackage.ANNOTATION_TYPE__INFORMALEQUATION:
				return getInformalequation();
			case DocbookPackage.ANNOTATION_TYPE__SIDEBAR:
				return getSidebar();
			case DocbookPackage.ANNOTATION_TYPE__BLOCKQUOTE:
				return getBlockquote();
			case DocbookPackage.ANNOTATION_TYPE__ADDRESS:
				return getAddress();
			case DocbookPackage.ANNOTATION_TYPE__EPIGRAPH:
				return getEpigraph();
			case DocbookPackage.ANNOTATION_TYPE__MEDIAOBJECT:
				return getMediaobject();
			case DocbookPackage.ANNOTATION_TYPE__SCREENSHOT:
				return getScreenshot();
			case DocbookPackage.ANNOTATION_TYPE__TASK:
				return getTask();
			case DocbookPackage.ANNOTATION_TYPE__PRODUCTIONSET:
				return getProductionset();
			case DocbookPackage.ANNOTATION_TYPE__CONSTRAINTDEF:
				return getConstraintdef();
			case DocbookPackage.ANNOTATION_TYPE__MSGSET:
				return getMsgset();
			case DocbookPackage.ANNOTATION_TYPE__SCREEN:
				return getScreen();
			case DocbookPackage.ANNOTATION_TYPE__LITERALLAYOUT:
				return getLiterallayout();
			case DocbookPackage.ANNOTATION_TYPE__PROGRAMLISTINGCO:
				return getProgramlistingco();
			case DocbookPackage.ANNOTATION_TYPE__SCREENCO:
				return getScreenco();
			case DocbookPackage.ANNOTATION_TYPE__PROGRAMLISTING:
				return getProgramlisting();
			case DocbookPackage.ANNOTATION_TYPE__SYNOPSIS:
				return getSynopsis();
			case DocbookPackage.ANNOTATION_TYPE__BRIDGEHEAD:
				return getBridgehead();
			case DocbookPackage.ANNOTATION_TYPE__REMARK:
				return getRemark();
			case DocbookPackage.ANNOTATION_TYPE__REVHISTORY:
				return getRevhistory();
			case DocbookPackage.ANNOTATION_TYPE__INDEXTERM:
				return getIndexterm();
			case DocbookPackage.ANNOTATION_TYPE__FUNCSYNOPSIS:
				return getFuncsynopsis();
			case DocbookPackage.ANNOTATION_TYPE__CLASSSYNOPSIS:
				return getClasssynopsis();
			case DocbookPackage.ANNOTATION_TYPE__METHODSYNOPSIS:
				return getMethodsynopsis();
			case DocbookPackage.ANNOTATION_TYPE__CONSTRUCTORSYNOPSIS:
				return getConstructorsynopsis();
			case DocbookPackage.ANNOTATION_TYPE__DESTRUCTORSYNOPSIS:
				return getDestructorsynopsis();
			case DocbookPackage.ANNOTATION_TYPE__FIELDSYNOPSIS:
				return getFieldsynopsis();
			case DocbookPackage.ANNOTATION_TYPE__CMDSYNOPSIS:
				return getCmdsynopsis();
			case DocbookPackage.ANNOTATION_TYPE__CAUTION:
				return getCaution();
			case DocbookPackage.ANNOTATION_TYPE__IMPORTANT:
				return getImportant();
			case DocbookPackage.ANNOTATION_TYPE__NOTE:
				return getNote();
			case DocbookPackage.ANNOTATION_TYPE__TIP:
				return getTip();
			case DocbookPackage.ANNOTATION_TYPE__WARNING:
				return getWarning();
			case DocbookPackage.ANNOTATION_TYPE__ANCHOR:
				return getAnchor();
			case DocbookPackage.ANNOTATION_TYPE__PARA:
				return getPara();
			case DocbookPackage.ANNOTATION_TYPE__FORMALPARA:
				return getFormalpara();
			case DocbookPackage.ANNOTATION_TYPE__SIMPARA:
				return getSimpara();
			case DocbookPackage.ANNOTATION_TYPE__ANNOTATION:
				return getAnnotation();
			case DocbookPackage.ANNOTATION_TYPE__ANNOTATES:
				return getAnnotates();
			case DocbookPackage.ANNOTATION_TYPE__ANNOTATIONS:
				return getAnnotations();
			case DocbookPackage.ANNOTATION_TYPE__ARCH:
				return getArch();
			case DocbookPackage.ANNOTATION_TYPE__AUDIENCE:
				return getAudience();
			case DocbookPackage.ANNOTATION_TYPE__BASE:
				return getBase();
			case DocbookPackage.ANNOTATION_TYPE__CONDITION:
				return getCondition();
			case DocbookPackage.ANNOTATION_TYPE__CONFORMANCE:
				return getConformance();
			case DocbookPackage.ANNOTATION_TYPE__DIR:
				return getDir();
			case DocbookPackage.ANNOTATION_TYPE__ID:
				return getId();
			case DocbookPackage.ANNOTATION_TYPE__LANG:
				return getLang();
			case DocbookPackage.ANNOTATION_TYPE__OS:
				return getOs();
			case DocbookPackage.ANNOTATION_TYPE__REMAP:
				return getRemap();
			case DocbookPackage.ANNOTATION_TYPE__REVISION:
				return getRevision();
			case DocbookPackage.ANNOTATION_TYPE__REVISIONFLAG:
				return getRevisionflag();
			case DocbookPackage.ANNOTATION_TYPE__ROLE:
				return getRole();
			case DocbookPackage.ANNOTATION_TYPE__SECURITY:
				return getSecurity();
			case DocbookPackage.ANNOTATION_TYPE__USERLEVEL:
				return getUserlevel();
			case DocbookPackage.ANNOTATION_TYPE__VENDOR:
				return getVendor();
			case DocbookPackage.ANNOTATION_TYPE__VERSION:
				return getVersion();
			case DocbookPackage.ANNOTATION_TYPE__WORDSIZE:
				return getWordsize();
			case DocbookPackage.ANNOTATION_TYPE__XREFLABEL:
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
			case DocbookPackage.ANNOTATION_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case DocbookPackage.ANNOTATION_TYPE__TITLE:
				getTitle().clear();
				getTitle().addAll((Collection<? extends TitleType>)newValue);
				return;
			case DocbookPackage.ANNOTATION_TYPE__TITLEABBREV:
				getTitleabbrev().clear();
				getTitleabbrev().addAll((Collection<? extends TitleabbrevType>)newValue);
				return;
			case DocbookPackage.ANNOTATION_TYPE__INFO:
				setInfo((InfoType)newValue);
				return;
			case DocbookPackage.ANNOTATION_TYPE__GROUP1:
				((FeatureMap.Internal)getGroup1()).set(newValue);
				return;
			case DocbookPackage.ANNOTATION_TYPE__ITEMIZEDLIST:
				getItemizedlist().clear();
				getItemizedlist().addAll((Collection<? extends ItemizedlistType>)newValue);
				return;
			case DocbookPackage.ANNOTATION_TYPE__ORDEREDLIST:
				getOrderedlist().clear();
				getOrderedlist().addAll((Collection<? extends OrderedlistType>)newValue);
				return;
			case DocbookPackage.ANNOTATION_TYPE__PROCEDURE:
				getProcedure().clear();
				getProcedure().addAll((Collection<? extends ProcedureType>)newValue);
				return;
			case DocbookPackage.ANNOTATION_TYPE__SIMPLELIST:
				getSimplelist().clear();
				getSimplelist().addAll((Collection<? extends SimplelistType>)newValue);
				return;
			case DocbookPackage.ANNOTATION_TYPE__VARIABLELIST:
				getVariablelist().clear();
				getVariablelist().addAll((Collection<? extends VariablelistType>)newValue);
				return;
			case DocbookPackage.ANNOTATION_TYPE__SEGMENTEDLIST:
				getSegmentedlist().clear();
				getSegmentedlist().addAll((Collection<? extends SegmentedlistType>)newValue);
				return;
			case DocbookPackage.ANNOTATION_TYPE__GLOSSLIST:
				getGlosslist().clear();
				getGlosslist().addAll((Collection<? extends GlosslistType>)newValue);
				return;
			case DocbookPackage.ANNOTATION_TYPE__BIBLIOLIST:
				getBibliolist().clear();
				getBibliolist().addAll((Collection<? extends BibliolistType>)newValue);
				return;
			case DocbookPackage.ANNOTATION_TYPE__CALLOUTLIST:
				getCalloutlist().clear();
				getCalloutlist().addAll((Collection<? extends CalloutlistType>)newValue);
				return;
			case DocbookPackage.ANNOTATION_TYPE__QANDASET:
				getQandaset().clear();
				getQandaset().addAll((Collection<? extends QandasetType>)newValue);
				return;
			case DocbookPackage.ANNOTATION_TYPE__EXAMPLE:
				getExample().clear();
				getExample().addAll((Collection<? extends ExampleType>)newValue);
				return;
			case DocbookPackage.ANNOTATION_TYPE__FIGURE:
				getFigure().clear();
				getFigure().addAll((Collection<? extends FigureType>)newValue);
				return;
			case DocbookPackage.ANNOTATION_TYPE__TABLE:
				getTable().clear();
				getTable().addAll((Collection<? extends TableType>)newValue);
				return;
			case DocbookPackage.ANNOTATION_TYPE__EQUATION:
				getEquation().clear();
				getEquation().addAll((Collection<? extends EquationType>)newValue);
				return;
			case DocbookPackage.ANNOTATION_TYPE__INFORMALEXAMPLE:
				getInformalexample().clear();
				getInformalexample().addAll((Collection<? extends InformalexampleType>)newValue);
				return;
			case DocbookPackage.ANNOTATION_TYPE__INFORMALFIGURE:
				getInformalfigure().clear();
				getInformalfigure().addAll((Collection<? extends InformalfigureType>)newValue);
				return;
			case DocbookPackage.ANNOTATION_TYPE__INFORMALTABLE:
				getInformaltable().clear();
				getInformaltable().addAll((Collection<? extends InformaltableType>)newValue);
				return;
			case DocbookPackage.ANNOTATION_TYPE__INFORMALEQUATION:
				getInformalequation().clear();
				getInformalequation().addAll((Collection<? extends InformalequationType>)newValue);
				return;
			case DocbookPackage.ANNOTATION_TYPE__SIDEBAR:
				getSidebar().clear();
				getSidebar().addAll((Collection<? extends SidebarType>)newValue);
				return;
			case DocbookPackage.ANNOTATION_TYPE__BLOCKQUOTE:
				getBlockquote().clear();
				getBlockquote().addAll((Collection<? extends BlockquoteType>)newValue);
				return;
			case DocbookPackage.ANNOTATION_TYPE__ADDRESS:
				getAddress().clear();
				getAddress().addAll((Collection<? extends AddressType>)newValue);
				return;
			case DocbookPackage.ANNOTATION_TYPE__EPIGRAPH:
				getEpigraph().clear();
				getEpigraph().addAll((Collection<? extends EpigraphType>)newValue);
				return;
			case DocbookPackage.ANNOTATION_TYPE__MEDIAOBJECT:
				getMediaobject().clear();
				getMediaobject().addAll((Collection<? extends MediaobjectType>)newValue);
				return;
			case DocbookPackage.ANNOTATION_TYPE__SCREENSHOT:
				getScreenshot().clear();
				getScreenshot().addAll((Collection<? extends ScreenshotType>)newValue);
				return;
			case DocbookPackage.ANNOTATION_TYPE__TASK:
				getTask().clear();
				getTask().addAll((Collection<? extends TaskType>)newValue);
				return;
			case DocbookPackage.ANNOTATION_TYPE__PRODUCTIONSET:
				getProductionset().clear();
				getProductionset().addAll((Collection<? extends ProductionsetType>)newValue);
				return;
			case DocbookPackage.ANNOTATION_TYPE__CONSTRAINTDEF:
				getConstraintdef().clear();
				getConstraintdef().addAll((Collection<? extends ConstraintdefType>)newValue);
				return;
			case DocbookPackage.ANNOTATION_TYPE__MSGSET:
				getMsgset().clear();
				getMsgset().addAll((Collection<? extends MsgsetType>)newValue);
				return;
			case DocbookPackage.ANNOTATION_TYPE__SCREEN:
				getScreen().clear();
				getScreen().addAll((Collection<? extends ScreenType>)newValue);
				return;
			case DocbookPackage.ANNOTATION_TYPE__LITERALLAYOUT:
				getLiterallayout().clear();
				getLiterallayout().addAll((Collection<? extends LiterallayoutType>)newValue);
				return;
			case DocbookPackage.ANNOTATION_TYPE__PROGRAMLISTINGCO:
				getProgramlistingco().clear();
				getProgramlistingco().addAll((Collection<? extends ProgramlistingcoType>)newValue);
				return;
			case DocbookPackage.ANNOTATION_TYPE__SCREENCO:
				getScreenco().clear();
				getScreenco().addAll((Collection<? extends ScreencoType>)newValue);
				return;
			case DocbookPackage.ANNOTATION_TYPE__PROGRAMLISTING:
				getProgramlisting().clear();
				getProgramlisting().addAll((Collection<? extends ProgramlistingType>)newValue);
				return;
			case DocbookPackage.ANNOTATION_TYPE__SYNOPSIS:
				getSynopsis().clear();
				getSynopsis().addAll((Collection<? extends SynopsisType>)newValue);
				return;
			case DocbookPackage.ANNOTATION_TYPE__BRIDGEHEAD:
				getBridgehead().clear();
				getBridgehead().addAll((Collection<? extends BridgeheadType>)newValue);
				return;
			case DocbookPackage.ANNOTATION_TYPE__REMARK:
				getRemark().clear();
				getRemark().addAll((Collection<? extends RemarkType>)newValue);
				return;
			case DocbookPackage.ANNOTATION_TYPE__REVHISTORY:
				getRevhistory().clear();
				getRevhistory().addAll((Collection<? extends RevhistoryType>)newValue);
				return;
			case DocbookPackage.ANNOTATION_TYPE__INDEXTERM:
				getIndexterm().clear();
				getIndexterm().addAll((Collection<? extends IndextermType>)newValue);
				return;
			case DocbookPackage.ANNOTATION_TYPE__FUNCSYNOPSIS:
				getFuncsynopsis().clear();
				getFuncsynopsis().addAll((Collection<? extends FuncsynopsisType>)newValue);
				return;
			case DocbookPackage.ANNOTATION_TYPE__CLASSSYNOPSIS:
				getClasssynopsis().clear();
				getClasssynopsis().addAll((Collection<? extends ClasssynopsisType>)newValue);
				return;
			case DocbookPackage.ANNOTATION_TYPE__METHODSYNOPSIS:
				getMethodsynopsis().clear();
				getMethodsynopsis().addAll((Collection<? extends MethodsynopsisType>)newValue);
				return;
			case DocbookPackage.ANNOTATION_TYPE__CONSTRUCTORSYNOPSIS:
				getConstructorsynopsis().clear();
				getConstructorsynopsis().addAll((Collection<? extends ConstructorsynopsisType>)newValue);
				return;
			case DocbookPackage.ANNOTATION_TYPE__DESTRUCTORSYNOPSIS:
				getDestructorsynopsis().clear();
				getDestructorsynopsis().addAll((Collection<? extends DestructorsynopsisType>)newValue);
				return;
			case DocbookPackage.ANNOTATION_TYPE__FIELDSYNOPSIS:
				getFieldsynopsis().clear();
				getFieldsynopsis().addAll((Collection<? extends FieldsynopsisType>)newValue);
				return;
			case DocbookPackage.ANNOTATION_TYPE__CMDSYNOPSIS:
				getCmdsynopsis().clear();
				getCmdsynopsis().addAll((Collection<? extends CmdsynopsisType>)newValue);
				return;
			case DocbookPackage.ANNOTATION_TYPE__CAUTION:
				getCaution().clear();
				getCaution().addAll((Collection<? extends CautionType>)newValue);
				return;
			case DocbookPackage.ANNOTATION_TYPE__IMPORTANT:
				getImportant().clear();
				getImportant().addAll((Collection<? extends ImportantType>)newValue);
				return;
			case DocbookPackage.ANNOTATION_TYPE__NOTE:
				getNote().clear();
				getNote().addAll((Collection<? extends NoteType>)newValue);
				return;
			case DocbookPackage.ANNOTATION_TYPE__TIP:
				getTip().clear();
				getTip().addAll((Collection<? extends TipType>)newValue);
				return;
			case DocbookPackage.ANNOTATION_TYPE__WARNING:
				getWarning().clear();
				getWarning().addAll((Collection<? extends WarningType>)newValue);
				return;
			case DocbookPackage.ANNOTATION_TYPE__ANCHOR:
				getAnchor().clear();
				getAnchor().addAll((Collection<? extends AnchorType>)newValue);
				return;
			case DocbookPackage.ANNOTATION_TYPE__PARA:
				getPara().clear();
				getPara().addAll((Collection<? extends ParaType>)newValue);
				return;
			case DocbookPackage.ANNOTATION_TYPE__FORMALPARA:
				getFormalpara().clear();
				getFormalpara().addAll((Collection<? extends FormalparaType>)newValue);
				return;
			case DocbookPackage.ANNOTATION_TYPE__SIMPARA:
				getSimpara().clear();
				getSimpara().addAll((Collection<? extends SimparaType>)newValue);
				return;
			case DocbookPackage.ANNOTATION_TYPE__ANNOTATION:
				getAnnotation().clear();
				getAnnotation().addAll((Collection<? extends AnnotationType>)newValue);
				return;
			case DocbookPackage.ANNOTATION_TYPE__ANNOTATES:
				setAnnotates(newValue);
				return;
			case DocbookPackage.ANNOTATION_TYPE__ANNOTATIONS:
				setAnnotations(newValue);
				return;
			case DocbookPackage.ANNOTATION_TYPE__ARCH:
				setArch(newValue);
				return;
			case DocbookPackage.ANNOTATION_TYPE__AUDIENCE:
				setAudience(newValue);
				return;
			case DocbookPackage.ANNOTATION_TYPE__BASE:
				setBase(newValue);
				return;
			case DocbookPackage.ANNOTATION_TYPE__CONDITION:
				setCondition(newValue);
				return;
			case DocbookPackage.ANNOTATION_TYPE__CONFORMANCE:
				setConformance(newValue);
				return;
			case DocbookPackage.ANNOTATION_TYPE__DIR:
				setDir((DirType)newValue);
				return;
			case DocbookPackage.ANNOTATION_TYPE__ID:
				setId((String)newValue);
				return;
			case DocbookPackage.ANNOTATION_TYPE__LANG:
				setLang(newValue);
				return;
			case DocbookPackage.ANNOTATION_TYPE__OS:
				setOs(newValue);
				return;
			case DocbookPackage.ANNOTATION_TYPE__REMAP:
				setRemap(newValue);
				return;
			case DocbookPackage.ANNOTATION_TYPE__REVISION:
				setRevision(newValue);
				return;
			case DocbookPackage.ANNOTATION_TYPE__REVISIONFLAG:
				setRevisionflag((RevisionflagType)newValue);
				return;
			case DocbookPackage.ANNOTATION_TYPE__ROLE:
				setRole(newValue);
				return;
			case DocbookPackage.ANNOTATION_TYPE__SECURITY:
				setSecurity(newValue);
				return;
			case DocbookPackage.ANNOTATION_TYPE__USERLEVEL:
				setUserlevel(newValue);
				return;
			case DocbookPackage.ANNOTATION_TYPE__VENDOR:
				setVendor(newValue);
				return;
			case DocbookPackage.ANNOTATION_TYPE__VERSION:
				setVersion(newValue);
				return;
			case DocbookPackage.ANNOTATION_TYPE__WORDSIZE:
				setWordsize(newValue);
				return;
			case DocbookPackage.ANNOTATION_TYPE__XREFLABEL:
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
			case DocbookPackage.ANNOTATION_TYPE__GROUP:
				getGroup().clear();
				return;
			case DocbookPackage.ANNOTATION_TYPE__TITLE:
				getTitle().clear();
				return;
			case DocbookPackage.ANNOTATION_TYPE__TITLEABBREV:
				getTitleabbrev().clear();
				return;
			case DocbookPackage.ANNOTATION_TYPE__INFO:
				setInfo((InfoType)null);
				return;
			case DocbookPackage.ANNOTATION_TYPE__GROUP1:
				getGroup1().clear();
				return;
			case DocbookPackage.ANNOTATION_TYPE__ITEMIZEDLIST:
				getItemizedlist().clear();
				return;
			case DocbookPackage.ANNOTATION_TYPE__ORDEREDLIST:
				getOrderedlist().clear();
				return;
			case DocbookPackage.ANNOTATION_TYPE__PROCEDURE:
				getProcedure().clear();
				return;
			case DocbookPackage.ANNOTATION_TYPE__SIMPLELIST:
				getSimplelist().clear();
				return;
			case DocbookPackage.ANNOTATION_TYPE__VARIABLELIST:
				getVariablelist().clear();
				return;
			case DocbookPackage.ANNOTATION_TYPE__SEGMENTEDLIST:
				getSegmentedlist().clear();
				return;
			case DocbookPackage.ANNOTATION_TYPE__GLOSSLIST:
				getGlosslist().clear();
				return;
			case DocbookPackage.ANNOTATION_TYPE__BIBLIOLIST:
				getBibliolist().clear();
				return;
			case DocbookPackage.ANNOTATION_TYPE__CALLOUTLIST:
				getCalloutlist().clear();
				return;
			case DocbookPackage.ANNOTATION_TYPE__QANDASET:
				getQandaset().clear();
				return;
			case DocbookPackage.ANNOTATION_TYPE__EXAMPLE:
				getExample().clear();
				return;
			case DocbookPackage.ANNOTATION_TYPE__FIGURE:
				getFigure().clear();
				return;
			case DocbookPackage.ANNOTATION_TYPE__TABLE:
				getTable().clear();
				return;
			case DocbookPackage.ANNOTATION_TYPE__EQUATION:
				getEquation().clear();
				return;
			case DocbookPackage.ANNOTATION_TYPE__INFORMALEXAMPLE:
				getInformalexample().clear();
				return;
			case DocbookPackage.ANNOTATION_TYPE__INFORMALFIGURE:
				getInformalfigure().clear();
				return;
			case DocbookPackage.ANNOTATION_TYPE__INFORMALTABLE:
				getInformaltable().clear();
				return;
			case DocbookPackage.ANNOTATION_TYPE__INFORMALEQUATION:
				getInformalequation().clear();
				return;
			case DocbookPackage.ANNOTATION_TYPE__SIDEBAR:
				getSidebar().clear();
				return;
			case DocbookPackage.ANNOTATION_TYPE__BLOCKQUOTE:
				getBlockquote().clear();
				return;
			case DocbookPackage.ANNOTATION_TYPE__ADDRESS:
				getAddress().clear();
				return;
			case DocbookPackage.ANNOTATION_TYPE__EPIGRAPH:
				getEpigraph().clear();
				return;
			case DocbookPackage.ANNOTATION_TYPE__MEDIAOBJECT:
				getMediaobject().clear();
				return;
			case DocbookPackage.ANNOTATION_TYPE__SCREENSHOT:
				getScreenshot().clear();
				return;
			case DocbookPackage.ANNOTATION_TYPE__TASK:
				getTask().clear();
				return;
			case DocbookPackage.ANNOTATION_TYPE__PRODUCTIONSET:
				getProductionset().clear();
				return;
			case DocbookPackage.ANNOTATION_TYPE__CONSTRAINTDEF:
				getConstraintdef().clear();
				return;
			case DocbookPackage.ANNOTATION_TYPE__MSGSET:
				getMsgset().clear();
				return;
			case DocbookPackage.ANNOTATION_TYPE__SCREEN:
				getScreen().clear();
				return;
			case DocbookPackage.ANNOTATION_TYPE__LITERALLAYOUT:
				getLiterallayout().clear();
				return;
			case DocbookPackage.ANNOTATION_TYPE__PROGRAMLISTINGCO:
				getProgramlistingco().clear();
				return;
			case DocbookPackage.ANNOTATION_TYPE__SCREENCO:
				getScreenco().clear();
				return;
			case DocbookPackage.ANNOTATION_TYPE__PROGRAMLISTING:
				getProgramlisting().clear();
				return;
			case DocbookPackage.ANNOTATION_TYPE__SYNOPSIS:
				getSynopsis().clear();
				return;
			case DocbookPackage.ANNOTATION_TYPE__BRIDGEHEAD:
				getBridgehead().clear();
				return;
			case DocbookPackage.ANNOTATION_TYPE__REMARK:
				getRemark().clear();
				return;
			case DocbookPackage.ANNOTATION_TYPE__REVHISTORY:
				getRevhistory().clear();
				return;
			case DocbookPackage.ANNOTATION_TYPE__INDEXTERM:
				getIndexterm().clear();
				return;
			case DocbookPackage.ANNOTATION_TYPE__FUNCSYNOPSIS:
				getFuncsynopsis().clear();
				return;
			case DocbookPackage.ANNOTATION_TYPE__CLASSSYNOPSIS:
				getClasssynopsis().clear();
				return;
			case DocbookPackage.ANNOTATION_TYPE__METHODSYNOPSIS:
				getMethodsynopsis().clear();
				return;
			case DocbookPackage.ANNOTATION_TYPE__CONSTRUCTORSYNOPSIS:
				getConstructorsynopsis().clear();
				return;
			case DocbookPackage.ANNOTATION_TYPE__DESTRUCTORSYNOPSIS:
				getDestructorsynopsis().clear();
				return;
			case DocbookPackage.ANNOTATION_TYPE__FIELDSYNOPSIS:
				getFieldsynopsis().clear();
				return;
			case DocbookPackage.ANNOTATION_TYPE__CMDSYNOPSIS:
				getCmdsynopsis().clear();
				return;
			case DocbookPackage.ANNOTATION_TYPE__CAUTION:
				getCaution().clear();
				return;
			case DocbookPackage.ANNOTATION_TYPE__IMPORTANT:
				getImportant().clear();
				return;
			case DocbookPackage.ANNOTATION_TYPE__NOTE:
				getNote().clear();
				return;
			case DocbookPackage.ANNOTATION_TYPE__TIP:
				getTip().clear();
				return;
			case DocbookPackage.ANNOTATION_TYPE__WARNING:
				getWarning().clear();
				return;
			case DocbookPackage.ANNOTATION_TYPE__ANCHOR:
				getAnchor().clear();
				return;
			case DocbookPackage.ANNOTATION_TYPE__PARA:
				getPara().clear();
				return;
			case DocbookPackage.ANNOTATION_TYPE__FORMALPARA:
				getFormalpara().clear();
				return;
			case DocbookPackage.ANNOTATION_TYPE__SIMPARA:
				getSimpara().clear();
				return;
			case DocbookPackage.ANNOTATION_TYPE__ANNOTATION:
				getAnnotation().clear();
				return;
			case DocbookPackage.ANNOTATION_TYPE__ANNOTATES:
				setAnnotates(ANNOTATES_EDEFAULT);
				return;
			case DocbookPackage.ANNOTATION_TYPE__ANNOTATIONS:
				setAnnotations(ANNOTATIONS_EDEFAULT);
				return;
			case DocbookPackage.ANNOTATION_TYPE__ARCH:
				setArch(ARCH_EDEFAULT);
				return;
			case DocbookPackage.ANNOTATION_TYPE__AUDIENCE:
				setAudience(AUDIENCE_EDEFAULT);
				return;
			case DocbookPackage.ANNOTATION_TYPE__BASE:
				setBase(BASE_EDEFAULT);
				return;
			case DocbookPackage.ANNOTATION_TYPE__CONDITION:
				setCondition(CONDITION_EDEFAULT);
				return;
			case DocbookPackage.ANNOTATION_TYPE__CONFORMANCE:
				setConformance(CONFORMANCE_EDEFAULT);
				return;
			case DocbookPackage.ANNOTATION_TYPE__DIR:
				unsetDir();
				return;
			case DocbookPackage.ANNOTATION_TYPE__ID:
				setId(ID_EDEFAULT);
				return;
			case DocbookPackage.ANNOTATION_TYPE__LANG:
				setLang(LANG_EDEFAULT);
				return;
			case DocbookPackage.ANNOTATION_TYPE__OS:
				setOs(OS_EDEFAULT);
				return;
			case DocbookPackage.ANNOTATION_TYPE__REMAP:
				setRemap(REMAP_EDEFAULT);
				return;
			case DocbookPackage.ANNOTATION_TYPE__REVISION:
				setRevision(REVISION_EDEFAULT);
				return;
			case DocbookPackage.ANNOTATION_TYPE__REVISIONFLAG:
				unsetRevisionflag();
				return;
			case DocbookPackage.ANNOTATION_TYPE__ROLE:
				setRole(ROLE_EDEFAULT);
				return;
			case DocbookPackage.ANNOTATION_TYPE__SECURITY:
				setSecurity(SECURITY_EDEFAULT);
				return;
			case DocbookPackage.ANNOTATION_TYPE__USERLEVEL:
				setUserlevel(USERLEVEL_EDEFAULT);
				return;
			case DocbookPackage.ANNOTATION_TYPE__VENDOR:
				setVendor(VENDOR_EDEFAULT);
				return;
			case DocbookPackage.ANNOTATION_TYPE__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case DocbookPackage.ANNOTATION_TYPE__WORDSIZE:
				setWordsize(WORDSIZE_EDEFAULT);
				return;
			case DocbookPackage.ANNOTATION_TYPE__XREFLABEL:
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
			case DocbookPackage.ANNOTATION_TYPE__GROUP:
				return group != null && !group.isEmpty();
			case DocbookPackage.ANNOTATION_TYPE__TITLE:
				return !getTitle().isEmpty();
			case DocbookPackage.ANNOTATION_TYPE__TITLEABBREV:
				return !getTitleabbrev().isEmpty();
			case DocbookPackage.ANNOTATION_TYPE__INFO:
				return info != null;
			case DocbookPackage.ANNOTATION_TYPE__GROUP1:
				return group1 != null && !group1.isEmpty();
			case DocbookPackage.ANNOTATION_TYPE__ITEMIZEDLIST:
				return !getItemizedlist().isEmpty();
			case DocbookPackage.ANNOTATION_TYPE__ORDEREDLIST:
				return !getOrderedlist().isEmpty();
			case DocbookPackage.ANNOTATION_TYPE__PROCEDURE:
				return !getProcedure().isEmpty();
			case DocbookPackage.ANNOTATION_TYPE__SIMPLELIST:
				return !getSimplelist().isEmpty();
			case DocbookPackage.ANNOTATION_TYPE__VARIABLELIST:
				return !getVariablelist().isEmpty();
			case DocbookPackage.ANNOTATION_TYPE__SEGMENTEDLIST:
				return !getSegmentedlist().isEmpty();
			case DocbookPackage.ANNOTATION_TYPE__GLOSSLIST:
				return !getGlosslist().isEmpty();
			case DocbookPackage.ANNOTATION_TYPE__BIBLIOLIST:
				return !getBibliolist().isEmpty();
			case DocbookPackage.ANNOTATION_TYPE__CALLOUTLIST:
				return !getCalloutlist().isEmpty();
			case DocbookPackage.ANNOTATION_TYPE__QANDASET:
				return !getQandaset().isEmpty();
			case DocbookPackage.ANNOTATION_TYPE__EXAMPLE:
				return !getExample().isEmpty();
			case DocbookPackage.ANNOTATION_TYPE__FIGURE:
				return !getFigure().isEmpty();
			case DocbookPackage.ANNOTATION_TYPE__TABLE:
				return !getTable().isEmpty();
			case DocbookPackage.ANNOTATION_TYPE__EQUATION:
				return !getEquation().isEmpty();
			case DocbookPackage.ANNOTATION_TYPE__INFORMALEXAMPLE:
				return !getInformalexample().isEmpty();
			case DocbookPackage.ANNOTATION_TYPE__INFORMALFIGURE:
				return !getInformalfigure().isEmpty();
			case DocbookPackage.ANNOTATION_TYPE__INFORMALTABLE:
				return !getInformaltable().isEmpty();
			case DocbookPackage.ANNOTATION_TYPE__INFORMALEQUATION:
				return !getInformalequation().isEmpty();
			case DocbookPackage.ANNOTATION_TYPE__SIDEBAR:
				return !getSidebar().isEmpty();
			case DocbookPackage.ANNOTATION_TYPE__BLOCKQUOTE:
				return !getBlockquote().isEmpty();
			case DocbookPackage.ANNOTATION_TYPE__ADDRESS:
				return !getAddress().isEmpty();
			case DocbookPackage.ANNOTATION_TYPE__EPIGRAPH:
				return !getEpigraph().isEmpty();
			case DocbookPackage.ANNOTATION_TYPE__MEDIAOBJECT:
				return !getMediaobject().isEmpty();
			case DocbookPackage.ANNOTATION_TYPE__SCREENSHOT:
				return !getScreenshot().isEmpty();
			case DocbookPackage.ANNOTATION_TYPE__TASK:
				return !getTask().isEmpty();
			case DocbookPackage.ANNOTATION_TYPE__PRODUCTIONSET:
				return !getProductionset().isEmpty();
			case DocbookPackage.ANNOTATION_TYPE__CONSTRAINTDEF:
				return !getConstraintdef().isEmpty();
			case DocbookPackage.ANNOTATION_TYPE__MSGSET:
				return !getMsgset().isEmpty();
			case DocbookPackage.ANNOTATION_TYPE__SCREEN:
				return !getScreen().isEmpty();
			case DocbookPackage.ANNOTATION_TYPE__LITERALLAYOUT:
				return !getLiterallayout().isEmpty();
			case DocbookPackage.ANNOTATION_TYPE__PROGRAMLISTINGCO:
				return !getProgramlistingco().isEmpty();
			case DocbookPackage.ANNOTATION_TYPE__SCREENCO:
				return !getScreenco().isEmpty();
			case DocbookPackage.ANNOTATION_TYPE__PROGRAMLISTING:
				return !getProgramlisting().isEmpty();
			case DocbookPackage.ANNOTATION_TYPE__SYNOPSIS:
				return !getSynopsis().isEmpty();
			case DocbookPackage.ANNOTATION_TYPE__BRIDGEHEAD:
				return !getBridgehead().isEmpty();
			case DocbookPackage.ANNOTATION_TYPE__REMARK:
				return !getRemark().isEmpty();
			case DocbookPackage.ANNOTATION_TYPE__REVHISTORY:
				return !getRevhistory().isEmpty();
			case DocbookPackage.ANNOTATION_TYPE__INDEXTERM:
				return !getIndexterm().isEmpty();
			case DocbookPackage.ANNOTATION_TYPE__FUNCSYNOPSIS:
				return !getFuncsynopsis().isEmpty();
			case DocbookPackage.ANNOTATION_TYPE__CLASSSYNOPSIS:
				return !getClasssynopsis().isEmpty();
			case DocbookPackage.ANNOTATION_TYPE__METHODSYNOPSIS:
				return !getMethodsynopsis().isEmpty();
			case DocbookPackage.ANNOTATION_TYPE__CONSTRUCTORSYNOPSIS:
				return !getConstructorsynopsis().isEmpty();
			case DocbookPackage.ANNOTATION_TYPE__DESTRUCTORSYNOPSIS:
				return !getDestructorsynopsis().isEmpty();
			case DocbookPackage.ANNOTATION_TYPE__FIELDSYNOPSIS:
				return !getFieldsynopsis().isEmpty();
			case DocbookPackage.ANNOTATION_TYPE__CMDSYNOPSIS:
				return !getCmdsynopsis().isEmpty();
			case DocbookPackage.ANNOTATION_TYPE__CAUTION:
				return !getCaution().isEmpty();
			case DocbookPackage.ANNOTATION_TYPE__IMPORTANT:
				return !getImportant().isEmpty();
			case DocbookPackage.ANNOTATION_TYPE__NOTE:
				return !getNote().isEmpty();
			case DocbookPackage.ANNOTATION_TYPE__TIP:
				return !getTip().isEmpty();
			case DocbookPackage.ANNOTATION_TYPE__WARNING:
				return !getWarning().isEmpty();
			case DocbookPackage.ANNOTATION_TYPE__ANCHOR:
				return !getAnchor().isEmpty();
			case DocbookPackage.ANNOTATION_TYPE__PARA:
				return !getPara().isEmpty();
			case DocbookPackage.ANNOTATION_TYPE__FORMALPARA:
				return !getFormalpara().isEmpty();
			case DocbookPackage.ANNOTATION_TYPE__SIMPARA:
				return !getSimpara().isEmpty();
			case DocbookPackage.ANNOTATION_TYPE__ANNOTATION:
				return !getAnnotation().isEmpty();
			case DocbookPackage.ANNOTATION_TYPE__ANNOTATES:
				return ANNOTATES_EDEFAULT == null ? annotates != null : !ANNOTATES_EDEFAULT.equals(annotates);
			case DocbookPackage.ANNOTATION_TYPE__ANNOTATIONS:
				return ANNOTATIONS_EDEFAULT == null ? annotations != null : !ANNOTATIONS_EDEFAULT.equals(annotations);
			case DocbookPackage.ANNOTATION_TYPE__ARCH:
				return ARCH_EDEFAULT == null ? arch != null : !ARCH_EDEFAULT.equals(arch);
			case DocbookPackage.ANNOTATION_TYPE__AUDIENCE:
				return AUDIENCE_EDEFAULT == null ? audience != null : !AUDIENCE_EDEFAULT.equals(audience);
			case DocbookPackage.ANNOTATION_TYPE__BASE:
				return BASE_EDEFAULT == null ? base != null : !BASE_EDEFAULT.equals(base);
			case DocbookPackage.ANNOTATION_TYPE__CONDITION:
				return CONDITION_EDEFAULT == null ? condition != null : !CONDITION_EDEFAULT.equals(condition);
			case DocbookPackage.ANNOTATION_TYPE__CONFORMANCE:
				return CONFORMANCE_EDEFAULT == null ? conformance != null : !CONFORMANCE_EDEFAULT.equals(conformance);
			case DocbookPackage.ANNOTATION_TYPE__DIR:
				return isSetDir();
			case DocbookPackage.ANNOTATION_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case DocbookPackage.ANNOTATION_TYPE__LANG:
				return LANG_EDEFAULT == null ? lang != null : !LANG_EDEFAULT.equals(lang);
			case DocbookPackage.ANNOTATION_TYPE__OS:
				return OS_EDEFAULT == null ? os != null : !OS_EDEFAULT.equals(os);
			case DocbookPackage.ANNOTATION_TYPE__REMAP:
				return REMAP_EDEFAULT == null ? remap != null : !REMAP_EDEFAULT.equals(remap);
			case DocbookPackage.ANNOTATION_TYPE__REVISION:
				return REVISION_EDEFAULT == null ? revision != null : !REVISION_EDEFAULT.equals(revision);
			case DocbookPackage.ANNOTATION_TYPE__REVISIONFLAG:
				return isSetRevisionflag();
			case DocbookPackage.ANNOTATION_TYPE__ROLE:
				return ROLE_EDEFAULT == null ? role != null : !ROLE_EDEFAULT.equals(role);
			case DocbookPackage.ANNOTATION_TYPE__SECURITY:
				return SECURITY_EDEFAULT == null ? security != null : !SECURITY_EDEFAULT.equals(security);
			case DocbookPackage.ANNOTATION_TYPE__USERLEVEL:
				return USERLEVEL_EDEFAULT == null ? userlevel != null : !USERLEVEL_EDEFAULT.equals(userlevel);
			case DocbookPackage.ANNOTATION_TYPE__VENDOR:
				return VENDOR_EDEFAULT == null ? vendor != null : !VENDOR_EDEFAULT.equals(vendor);
			case DocbookPackage.ANNOTATION_TYPE__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
			case DocbookPackage.ANNOTATION_TYPE__WORDSIZE:
				return WORDSIZE_EDEFAULT == null ? wordsize != null : !WORDSIZE_EDEFAULT.equals(wordsize);
			case DocbookPackage.ANNOTATION_TYPE__XREFLABEL:
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
		result.append(", group1: ");
		result.append(group1);
		result.append(", annotates: ");
		result.append(annotates);
		result.append(", annotations: ");
		result.append(annotations);
		result.append(", arch: ");
		result.append(arch);
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
		result.append(", id: ");
		result.append(id);
		result.append(", lang: ");
		result.append(lang);
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
		result.append(", security: ");
		result.append(security);
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

} //AnnotationTypeImpl
