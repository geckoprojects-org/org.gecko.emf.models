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
package org.docbook.ns.docbook;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

import org.osgi.annotation.versioning.ProviderType;

import org.w3._1999.xlink.ActuateType;
import org.w3._1999.xlink.ShowType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Appendix Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.docbook.ns.docbook.AppendixType#getGroup <em>Group</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.AppendixType#getTitle <em>Title</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.AppendixType#getTitleabbrev <em>Titleabbrev</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.AppendixType#getSubtitle <em>Subtitle</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.AppendixType#getInfo <em>Info</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.AppendixType#getGroup1 <em>Group1</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.AppendixType#getGlossary <em>Glossary</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.AppendixType#getBibliography <em>Bibliography</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.AppendixType#getIndex <em>Index</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.AppendixType#getToc <em>Toc</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.AppendixType#getGroup2 <em>Group2</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.AppendixType#getItemizedlist <em>Itemizedlist</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.AppendixType#getOrderedlist <em>Orderedlist</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.AppendixType#getProcedure <em>Procedure</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.AppendixType#getSimplelist <em>Simplelist</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.AppendixType#getVariablelist <em>Variablelist</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.AppendixType#getSegmentedlist <em>Segmentedlist</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.AppendixType#getGlosslist <em>Glosslist</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.AppendixType#getBibliolist <em>Bibliolist</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.AppendixType#getCalloutlist <em>Calloutlist</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.AppendixType#getQandaset <em>Qandaset</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.AppendixType#getExample <em>Example</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.AppendixType#getFigure <em>Figure</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.AppendixType#getTable <em>Table</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.AppendixType#getEquation <em>Equation</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.AppendixType#getInformalexample <em>Informalexample</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.AppendixType#getInformalfigure <em>Informalfigure</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.AppendixType#getInformaltable <em>Informaltable</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.AppendixType#getInformalequation <em>Informalequation</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.AppendixType#getSidebar <em>Sidebar</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.AppendixType#getBlockquote <em>Blockquote</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.AppendixType#getAddress <em>Address</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.AppendixType#getEpigraph <em>Epigraph</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.AppendixType#getMediaobject <em>Mediaobject</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.AppendixType#getScreenshot <em>Screenshot</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.AppendixType#getTask <em>Task</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.AppendixType#getProductionset <em>Productionset</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.AppendixType#getConstraintdef <em>Constraintdef</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.AppendixType#getMsgset <em>Msgset</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.AppendixType#getScreen <em>Screen</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.AppendixType#getLiterallayout <em>Literallayout</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.AppendixType#getProgramlistingco <em>Programlistingco</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.AppendixType#getScreenco <em>Screenco</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.AppendixType#getProgramlisting <em>Programlisting</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.AppendixType#getSynopsis <em>Synopsis</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.AppendixType#getBridgehead <em>Bridgehead</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.AppendixType#getRemark <em>Remark</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.AppendixType#getRevhistory <em>Revhistory</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.AppendixType#getIndexterm <em>Indexterm</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.AppendixType#getFuncsynopsis <em>Funcsynopsis</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.AppendixType#getClasssynopsis <em>Classsynopsis</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.AppendixType#getMethodsynopsis <em>Methodsynopsis</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.AppendixType#getConstructorsynopsis <em>Constructorsynopsis</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.AppendixType#getDestructorsynopsis <em>Destructorsynopsis</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.AppendixType#getFieldsynopsis <em>Fieldsynopsis</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.AppendixType#getCmdsynopsis <em>Cmdsynopsis</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.AppendixType#getCaution <em>Caution</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.AppendixType#getImportant <em>Important</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.AppendixType#getNote <em>Note</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.AppendixType#getTip <em>Tip</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.AppendixType#getWarning <em>Warning</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.AppendixType#getAnchor <em>Anchor</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.AppendixType#getPara <em>Para</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.AppendixType#getFormalpara <em>Formalpara</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.AppendixType#getSimpara <em>Simpara</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.AppendixType#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.AppendixType#getSection <em>Section</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.AppendixType#getSimplesect <em>Simplesect</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.AppendixType#getSimplesect1 <em>Simplesect1</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.AppendixType#getSect1 <em>Sect1</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.AppendixType#getSimplesect2 <em>Simplesect2</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.AppendixType#getRefentry <em>Refentry</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.AppendixType#getSection1 <em>Section1</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.AppendixType#getSimplesect3 <em>Simplesect3</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.AppendixType#getSimplesect4 <em>Simplesect4</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.AppendixType#getSect11 <em>Sect11</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.AppendixType#getSimplesect5 <em>Simplesect5</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.AppendixType#getRefentry1 <em>Refentry1</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.AppendixType#getGroup3 <em>Group3</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.AppendixType#getGlossary1 <em>Glossary1</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.AppendixType#getBibliography1 <em>Bibliography1</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.AppendixType#getIndex1 <em>Index1</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.AppendixType#getToc1 <em>Toc1</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.AppendixType#getActuate <em>Actuate</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.AppendixType#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.AppendixType#getArch <em>Arch</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.AppendixType#getArcrole <em>Arcrole</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.AppendixType#getAudience <em>Audience</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.AppendixType#getBase <em>Base</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.AppendixType#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.AppendixType#getConformance <em>Conformance</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.AppendixType#getDir <em>Dir</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.AppendixType#getHref <em>Href</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.AppendixType#getId <em>Id</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.AppendixType#getLabel <em>Label</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.AppendixType#getLang <em>Lang</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.AppendixType#getLinkend <em>Linkend</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.AppendixType#getOs <em>Os</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.AppendixType#getRemap <em>Remap</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.AppendixType#getRevision <em>Revision</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.AppendixType#getRevisionflag <em>Revisionflag</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.AppendixType#getRole <em>Role</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.AppendixType#getRole1 <em>Role1</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.AppendixType#getSecurity <em>Security</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.AppendixType#getShow <em>Show</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.AppendixType#getStatus <em>Status</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.AppendixType#getTitle1 <em>Title1</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.AppendixType#getType <em>Type</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.AppendixType#getUserlevel <em>Userlevel</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.AppendixType#getVendor <em>Vendor</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.AppendixType#getVersion <em>Version</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.AppendixType#getWordsize <em>Wordsize</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.AppendixType#getXreflabel <em>Xreflabel</em>}</li>
 * </ul>
 *
 * @see org.docbook.ns.docbook.DocbookPackage#getAppendixType()
 * @model extendedMetaData="name='appendix_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface AppendixType extends EObject {
	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getAppendixType_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Title</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.TitleType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getAppendixType_Title()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='title' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<TitleType> getTitle();

	/**
	 * Returns the value of the '<em><b>Titleabbrev</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.TitleabbrevType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Titleabbrev</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getAppendixType_Titleabbrev()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='titleabbrev' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<TitleabbrevType> getTitleabbrev();

	/**
	 * Returns the value of the '<em><b>Subtitle</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.SubtitleType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subtitle</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getAppendixType_Subtitle()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='subtitle' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<SubtitleType> getSubtitle();

	/**
	 * Returns the value of the '<em><b>Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Info</em>' containment reference.
	 * @see #setInfo(InfoType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getAppendixType_Info()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='info' namespace='##targetNamespace'"
	 * @generated
	 */
	InfoType getInfo();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.AppendixType#getInfo <em>Info</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Info</em>' containment reference.
	 * @see #getInfo()
	 * @generated
	 */
	void setInfo(InfoType value);

	/**
	 * Returns the value of the '<em><b>Group1</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group1</em>' attribute list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getAppendixType_Group1()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:5'"
	 * @generated
	 */
	FeatureMap getGroup1();

	/**
	 * Returns the value of the '<em><b>Glossary</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.GlossaryType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Glossary</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getAppendixType_Glossary()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='glossary' namespace='##targetNamespace' group='#group:5'"
	 * @generated
	 */
	EList<GlossaryType> getGlossary();

	/**
	 * Returns the value of the '<em><b>Bibliography</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.BibliographyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bibliography</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getAppendixType_Bibliography()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='bibliography' namespace='##targetNamespace' group='#group:5'"
	 * @generated
	 */
	EList<BibliographyType> getBibliography();

	/**
	 * Returns the value of the '<em><b>Index</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.IndexType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Index</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getAppendixType_Index()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='index' namespace='##targetNamespace' group='#group:5'"
	 * @generated
	 */
	EList<IndexType> getIndex();

	/**
	 * Returns the value of the '<em><b>Toc</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.TocType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Toc</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getAppendixType_Toc()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='toc' namespace='##targetNamespace' group='#group:5'"
	 * @generated
	 */
	EList<TocType> getToc();

	/**
	 * Returns the value of the '<em><b>Group2</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group2</em>' attribute list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getAppendixType_Group2()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:10'"
	 * @generated
	 */
	FeatureMap getGroup2();

	/**
	 * Returns the value of the '<em><b>Itemizedlist</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.ItemizedlistType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Itemizedlist</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getAppendixType_Itemizedlist()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='itemizedlist' namespace='##targetNamespace' group='#group:10'"
	 * @generated
	 */
	EList<ItemizedlistType> getItemizedlist();

	/**
	 * Returns the value of the '<em><b>Orderedlist</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.OrderedlistType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Orderedlist</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getAppendixType_Orderedlist()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='orderedlist' namespace='##targetNamespace' group='#group:10'"
	 * @generated
	 */
	EList<OrderedlistType> getOrderedlist();

	/**
	 * Returns the value of the '<em><b>Procedure</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.ProcedureType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Procedure</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getAppendixType_Procedure()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='procedure' namespace='##targetNamespace' group='#group:10'"
	 * @generated
	 */
	EList<ProcedureType> getProcedure();

	/**
	 * Returns the value of the '<em><b>Simplelist</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.SimplelistType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Simplelist</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getAppendixType_Simplelist()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='simplelist' namespace='##targetNamespace' group='#group:10'"
	 * @generated
	 */
	EList<SimplelistType> getSimplelist();

	/**
	 * Returns the value of the '<em><b>Variablelist</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.VariablelistType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variablelist</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getAppendixType_Variablelist()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='variablelist' namespace='##targetNamespace' group='#group:10'"
	 * @generated
	 */
	EList<VariablelistType> getVariablelist();

	/**
	 * Returns the value of the '<em><b>Segmentedlist</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.SegmentedlistType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Segmentedlist</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getAppendixType_Segmentedlist()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='segmentedlist' namespace='##targetNamespace' group='#group:10'"
	 * @generated
	 */
	EList<SegmentedlistType> getSegmentedlist();

	/**
	 * Returns the value of the '<em><b>Glosslist</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.GlosslistType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Glosslist</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getAppendixType_Glosslist()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='glosslist' namespace='##targetNamespace' group='#group:10'"
	 * @generated
	 */
	EList<GlosslistType> getGlosslist();

	/**
	 * Returns the value of the '<em><b>Bibliolist</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.BibliolistType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bibliolist</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getAppendixType_Bibliolist()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='bibliolist' namespace='##targetNamespace' group='#group:10'"
	 * @generated
	 */
	EList<BibliolistType> getBibliolist();

	/**
	 * Returns the value of the '<em><b>Calloutlist</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.CalloutlistType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Calloutlist</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getAppendixType_Calloutlist()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='calloutlist' namespace='##targetNamespace' group='#group:10'"
	 * @generated
	 */
	EList<CalloutlistType> getCalloutlist();

	/**
	 * Returns the value of the '<em><b>Qandaset</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.QandasetType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qandaset</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getAppendixType_Qandaset()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='qandaset' namespace='##targetNamespace' group='#group:10'"
	 * @generated
	 */
	EList<QandasetType> getQandaset();

	/**
	 * Returns the value of the '<em><b>Example</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.ExampleType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Example</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getAppendixType_Example()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='example' namespace='##targetNamespace' group='#group:10'"
	 * @generated
	 */
	EList<ExampleType> getExample();

	/**
	 * Returns the value of the '<em><b>Figure</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.FigureType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Figure</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getAppendixType_Figure()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='figure' namespace='##targetNamespace' group='#group:10'"
	 * @generated
	 */
	EList<FigureType> getFigure();

	/**
	 * Returns the value of the '<em><b>Table</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.TableType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getAppendixType_Table()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='table' namespace='##targetNamespace' group='#group:10'"
	 * @generated
	 */
	EList<TableType> getTable();

	/**
	 * Returns the value of the '<em><b>Equation</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.EquationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Equation</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getAppendixType_Equation()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='equation' namespace='##targetNamespace' group='#group:10'"
	 * @generated
	 */
	EList<EquationType> getEquation();

	/**
	 * Returns the value of the '<em><b>Informalexample</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.InformalexampleType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Informalexample</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getAppendixType_Informalexample()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='informalexample' namespace='##targetNamespace' group='#group:10'"
	 * @generated
	 */
	EList<InformalexampleType> getInformalexample();

	/**
	 * Returns the value of the '<em><b>Informalfigure</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.InformalfigureType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Informalfigure</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getAppendixType_Informalfigure()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='informalfigure' namespace='##targetNamespace' group='#group:10'"
	 * @generated
	 */
	EList<InformalfigureType> getInformalfigure();

	/**
	 * Returns the value of the '<em><b>Informaltable</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.InformaltableType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Informaltable</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getAppendixType_Informaltable()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='informaltable' namespace='##targetNamespace' group='#group:10'"
	 * @generated
	 */
	EList<InformaltableType> getInformaltable();

	/**
	 * Returns the value of the '<em><b>Informalequation</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.InformalequationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Informalequation</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getAppendixType_Informalequation()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='informalequation' namespace='##targetNamespace' group='#group:10'"
	 * @generated
	 */
	EList<InformalequationType> getInformalequation();

	/**
	 * Returns the value of the '<em><b>Sidebar</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.SidebarType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sidebar</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getAppendixType_Sidebar()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='sidebar' namespace='##targetNamespace' group='#group:10'"
	 * @generated
	 */
	EList<SidebarType> getSidebar();

	/**
	 * Returns the value of the '<em><b>Blockquote</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.BlockquoteType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Blockquote</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getAppendixType_Blockquote()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='blockquote' namespace='##targetNamespace' group='#group:10'"
	 * @generated
	 */
	EList<BlockquoteType> getBlockquote();

	/**
	 * Returns the value of the '<em><b>Address</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.AddressType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Address</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getAppendixType_Address()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='address' namespace='##targetNamespace' group='#group:10'"
	 * @generated
	 */
	EList<AddressType> getAddress();

	/**
	 * Returns the value of the '<em><b>Epigraph</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.EpigraphType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Epigraph</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getAppendixType_Epigraph()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='epigraph' namespace='##targetNamespace' group='#group:10'"
	 * @generated
	 */
	EList<EpigraphType> getEpigraph();

	/**
	 * Returns the value of the '<em><b>Mediaobject</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.MediaobjectType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mediaobject</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getAppendixType_Mediaobject()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='mediaobject' namespace='##targetNamespace' group='#group:10'"
	 * @generated
	 */
	EList<MediaobjectType> getMediaobject();

	/**
	 * Returns the value of the '<em><b>Screenshot</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.ScreenshotType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Screenshot</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getAppendixType_Screenshot()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='screenshot' namespace='##targetNamespace' group='#group:10'"
	 * @generated
	 */
	EList<ScreenshotType> getScreenshot();

	/**
	 * Returns the value of the '<em><b>Task</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.TaskType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Task</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getAppendixType_Task()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='task' namespace='##targetNamespace' group='#group:10'"
	 * @generated
	 */
	EList<TaskType> getTask();

	/**
	 * Returns the value of the '<em><b>Productionset</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.ProductionsetType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Productionset</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getAppendixType_Productionset()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='productionset' namespace='##targetNamespace' group='#group:10'"
	 * @generated
	 */
	EList<ProductionsetType> getProductionset();

	/**
	 * Returns the value of the '<em><b>Constraintdef</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.ConstraintdefType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraintdef</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getAppendixType_Constraintdef()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='constraintdef' namespace='##targetNamespace' group='#group:10'"
	 * @generated
	 */
	EList<ConstraintdefType> getConstraintdef();

	/**
	 * Returns the value of the '<em><b>Msgset</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.MsgsetType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Msgset</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getAppendixType_Msgset()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='msgset' namespace='##targetNamespace' group='#group:10'"
	 * @generated
	 */
	EList<MsgsetType> getMsgset();

	/**
	 * Returns the value of the '<em><b>Screen</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.ScreenType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Screen</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getAppendixType_Screen()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='screen' namespace='##targetNamespace' group='#group:10'"
	 * @generated
	 */
	EList<ScreenType> getScreen();

	/**
	 * Returns the value of the '<em><b>Literallayout</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.LiterallayoutType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Literallayout</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getAppendixType_Literallayout()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='literallayout' namespace='##targetNamespace' group='#group:10'"
	 * @generated
	 */
	EList<LiterallayoutType> getLiterallayout();

	/**
	 * Returns the value of the '<em><b>Programlistingco</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.ProgramlistingcoType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Programlistingco</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getAppendixType_Programlistingco()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='programlistingco' namespace='##targetNamespace' group='#group:10'"
	 * @generated
	 */
	EList<ProgramlistingcoType> getProgramlistingco();

	/**
	 * Returns the value of the '<em><b>Screenco</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.ScreencoType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Screenco</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getAppendixType_Screenco()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='screenco' namespace='##targetNamespace' group='#group:10'"
	 * @generated
	 */
	EList<ScreencoType> getScreenco();

	/**
	 * Returns the value of the '<em><b>Programlisting</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.ProgramlistingType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Programlisting</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getAppendixType_Programlisting()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='programlisting' namespace='##targetNamespace' group='#group:10'"
	 * @generated
	 */
	EList<ProgramlistingType> getProgramlisting();

	/**
	 * Returns the value of the '<em><b>Synopsis</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.SynopsisType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Synopsis</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getAppendixType_Synopsis()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='synopsis' namespace='##targetNamespace' group='#group:10'"
	 * @generated
	 */
	EList<SynopsisType> getSynopsis();

	/**
	 * Returns the value of the '<em><b>Bridgehead</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.BridgeheadType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bridgehead</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getAppendixType_Bridgehead()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='bridgehead' namespace='##targetNamespace' group='#group:10'"
	 * @generated
	 */
	EList<BridgeheadType> getBridgehead();

	/**
	 * Returns the value of the '<em><b>Remark</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.RemarkType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Remark</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getAppendixType_Remark()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='remark' namespace='##targetNamespace' group='#group:10'"
	 * @generated
	 */
	EList<RemarkType> getRemark();

	/**
	 * Returns the value of the '<em><b>Revhistory</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.RevhistoryType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Revhistory</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getAppendixType_Revhistory()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='revhistory' namespace='##targetNamespace' group='#group:10'"
	 * @generated
	 */
	EList<RevhistoryType> getRevhistory();

	/**
	 * Returns the value of the '<em><b>Indexterm</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.IndextermType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Indexterm</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getAppendixType_Indexterm()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='indexterm' namespace='##targetNamespace' group='#group:10'"
	 * @generated
	 */
	EList<IndextermType> getIndexterm();

	/**
	 * Returns the value of the '<em><b>Funcsynopsis</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.FuncsynopsisType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Funcsynopsis</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getAppendixType_Funcsynopsis()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='funcsynopsis' namespace='##targetNamespace' group='#group:10'"
	 * @generated
	 */
	EList<FuncsynopsisType> getFuncsynopsis();

	/**
	 * Returns the value of the '<em><b>Classsynopsis</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.ClasssynopsisType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classsynopsis</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getAppendixType_Classsynopsis()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='classsynopsis' namespace='##targetNamespace' group='#group:10'"
	 * @generated
	 */
	EList<ClasssynopsisType> getClasssynopsis();

	/**
	 * Returns the value of the '<em><b>Methodsynopsis</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.MethodsynopsisType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Methodsynopsis</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getAppendixType_Methodsynopsis()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='methodsynopsis' namespace='##targetNamespace' group='#group:10'"
	 * @generated
	 */
	EList<MethodsynopsisType> getMethodsynopsis();

	/**
	 * Returns the value of the '<em><b>Constructorsynopsis</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.ConstructorsynopsisType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constructorsynopsis</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getAppendixType_Constructorsynopsis()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='constructorsynopsis' namespace='##targetNamespace' group='#group:10'"
	 * @generated
	 */
	EList<ConstructorsynopsisType> getConstructorsynopsis();

	/**
	 * Returns the value of the '<em><b>Destructorsynopsis</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.DestructorsynopsisType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destructorsynopsis</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getAppendixType_Destructorsynopsis()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='destructorsynopsis' namespace='##targetNamespace' group='#group:10'"
	 * @generated
	 */
	EList<DestructorsynopsisType> getDestructorsynopsis();

	/**
	 * Returns the value of the '<em><b>Fieldsynopsis</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.FieldsynopsisType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fieldsynopsis</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getAppendixType_Fieldsynopsis()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='fieldsynopsis' namespace='##targetNamespace' group='#group:10'"
	 * @generated
	 */
	EList<FieldsynopsisType> getFieldsynopsis();

	/**
	 * Returns the value of the '<em><b>Cmdsynopsis</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.CmdsynopsisType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cmdsynopsis</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getAppendixType_Cmdsynopsis()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='cmdsynopsis' namespace='##targetNamespace' group='#group:10'"
	 * @generated
	 */
	EList<CmdsynopsisType> getCmdsynopsis();

	/**
	 * Returns the value of the '<em><b>Caution</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.CautionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Caution</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getAppendixType_Caution()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='caution' namespace='##targetNamespace' group='#group:10'"
	 * @generated
	 */
	EList<CautionType> getCaution();

	/**
	 * Returns the value of the '<em><b>Important</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.ImportantType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Important</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getAppendixType_Important()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='important' namespace='##targetNamespace' group='#group:10'"
	 * @generated
	 */
	EList<ImportantType> getImportant();

	/**
	 * Returns the value of the '<em><b>Note</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.NoteType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Note</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getAppendixType_Note()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='note' namespace='##targetNamespace' group='#group:10'"
	 * @generated
	 */
	EList<NoteType> getNote();

	/**
	 * Returns the value of the '<em><b>Tip</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.TipType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tip</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getAppendixType_Tip()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='tip' namespace='##targetNamespace' group='#group:10'"
	 * @generated
	 */
	EList<TipType> getTip();

	/**
	 * Returns the value of the '<em><b>Warning</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.WarningType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Warning</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getAppendixType_Warning()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='warning' namespace='##targetNamespace' group='#group:10'"
	 * @generated
	 */
	EList<WarningType> getWarning();

	/**
	 * Returns the value of the '<em><b>Anchor</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.AnchorType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Anchor</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getAppendixType_Anchor()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='anchor' namespace='##targetNamespace' group='#group:10'"
	 * @generated
	 */
	EList<AnchorType> getAnchor();

	/**
	 * Returns the value of the '<em><b>Para</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.ParaType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Para</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getAppendixType_Para()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='para' namespace='##targetNamespace' group='#group:10'"
	 * @generated
	 */
	EList<ParaType> getPara();

	/**
	 * Returns the value of the '<em><b>Formalpara</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.FormalparaType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Formalpara</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getAppendixType_Formalpara()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='formalpara' namespace='##targetNamespace' group='#group:10'"
	 * @generated
	 */
	EList<FormalparaType> getFormalpara();

	/**
	 * Returns the value of the '<em><b>Simpara</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.SimparaType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Simpara</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getAppendixType_Simpara()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='simpara' namespace='##targetNamespace' group='#group:10'"
	 * @generated
	 */
	EList<SimparaType> getSimpara();

	/**
	 * Returns the value of the '<em><b>Annotation</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.AnnotationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotation</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getAppendixType_Annotation()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='annotation' namespace='##targetNamespace' group='#group:10'"
	 * @generated
	 */
	EList<AnnotationType> getAnnotation();

	/**
	 * Returns the value of the '<em><b>Section</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.SectionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Section</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getAppendixType_Section()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='section' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SectionType> getSection();

	/**
	 * Returns the value of the '<em><b>Simplesect</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.SimplesectType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Simplesect</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getAppendixType_Simplesect()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='simplesect' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SimplesectType> getSimplesect();

	/**
	 * Returns the value of the '<em><b>Simplesect1</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.SimplesectType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Simplesect1</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getAppendixType_Simplesect1()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='simplesect' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SimplesectType> getSimplesect1();

	/**
	 * Returns the value of the '<em><b>Sect1</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.Sect1Type}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sect1</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getAppendixType_Sect1()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='sect1' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Sect1Type> getSect1();

	/**
	 * Returns the value of the '<em><b>Simplesect2</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.SimplesectType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Simplesect2</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getAppendixType_Simplesect2()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='simplesect' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SimplesectType> getSimplesect2();

	/**
	 * Returns the value of the '<em><b>Refentry</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.RefentryType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refentry</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getAppendixType_Refentry()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='refentry' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<RefentryType> getRefentry();

	/**
	 * Returns the value of the '<em><b>Section1</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.SectionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Section1</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getAppendixType_Section1()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='section' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SectionType> getSection1();

	/**
	 * Returns the value of the '<em><b>Simplesect3</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.SimplesectType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Simplesect3</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getAppendixType_Simplesect3()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='simplesect' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SimplesectType> getSimplesect3();

	/**
	 * Returns the value of the '<em><b>Simplesect4</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.SimplesectType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Simplesect4</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getAppendixType_Simplesect4()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='simplesect' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SimplesectType> getSimplesect4();

	/**
	 * Returns the value of the '<em><b>Sect11</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.Sect1Type}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sect11</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getAppendixType_Sect11()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='sect1' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Sect1Type> getSect11();

	/**
	 * Returns the value of the '<em><b>Simplesect5</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.SimplesectType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Simplesect5</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getAppendixType_Simplesect5()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='simplesect' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SimplesectType> getSimplesect5();

	/**
	 * Returns the value of the '<em><b>Refentry1</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.RefentryType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refentry1</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getAppendixType_Refentry1()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='refentry' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<RefentryType> getRefentry1();

	/**
	 * Returns the value of the '<em><b>Group3</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group3</em>' attribute list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getAppendixType_Group3()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:78'"
	 * @generated
	 */
	FeatureMap getGroup3();

	/**
	 * Returns the value of the '<em><b>Glossary1</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.GlossaryType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Glossary1</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getAppendixType_Glossary1()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='glossary' namespace='##targetNamespace' group='#group:78'"
	 * @generated
	 */
	EList<GlossaryType> getGlossary1();

	/**
	 * Returns the value of the '<em><b>Bibliography1</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.BibliographyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bibliography1</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getAppendixType_Bibliography1()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='bibliography' namespace='##targetNamespace' group='#group:78'"
	 * @generated
	 */
	EList<BibliographyType> getBibliography1();

	/**
	 * Returns the value of the '<em><b>Index1</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.IndexType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Index1</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getAppendixType_Index1()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='index' namespace='##targetNamespace' group='#group:78'"
	 * @generated
	 */
	EList<IndexType> getIndex1();

	/**
	 * Returns the value of the '<em><b>Toc1</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.TocType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Toc1</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getAppendixType_Toc1()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='toc' namespace='##targetNamespace' group='#group:78'"
	 * @generated
	 */
	EList<TocType> getToc1();

	/**
	 * Returns the value of the '<em><b>Actuate</b></em>' attribute.
	 * The literals are from the enumeration {@link org.w3._1999.xlink.ActuateType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actuate</em>' attribute.
	 * @see org.w3._1999.xlink.ActuateType
	 * @see #isSetActuate()
	 * @see #unsetActuate()
	 * @see #setActuate(ActuateType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getAppendixType_Actuate()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='actuate' namespace='http://www.w3.org/1999/xlink'"
	 * @generated
	 */
	ActuateType getActuate();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.AppendixType#getActuate <em>Actuate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actuate</em>' attribute.
	 * @see org.w3._1999.xlink.ActuateType
	 * @see #isSetActuate()
	 * @see #unsetActuate()
	 * @see #getActuate()
	 * @generated
	 */
	void setActuate(ActuateType value);

	/**
	 * Unsets the value of the '{@link org.docbook.ns.docbook.AppendixType#getActuate <em>Actuate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetActuate()
	 * @see #getActuate()
	 * @see #setActuate(ActuateType)
	 * @generated
	 */
	void unsetActuate();

	/**
	 * Returns whether the value of the '{@link org.docbook.ns.docbook.AppendixType#getActuate <em>Actuate</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Actuate</em>' attribute is set.
	 * @see #unsetActuate()
	 * @see #getActuate()
	 * @see #setActuate(ActuateType)
	 * @generated
	 */
	boolean isSetActuate();

	/**
	 * Returns the value of the '<em><b>Annotations</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotations</em>' attribute.
	 * @see #setAnnotations(Object)
	 * @see org.docbook.ns.docbook.DocbookPackage#getAppendixType_Annotations()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='annotations'"
	 * @generated
	 */
	Object getAnnotations();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.AppendixType#getAnnotations <em>Annotations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annotations</em>' attribute.
	 * @see #getAnnotations()
	 * @generated
	 */
	void setAnnotations(Object value);

	/**
	 * Returns the value of the '<em><b>Arch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arch</em>' attribute.
	 * @see #setArch(Object)
	 * @see org.docbook.ns.docbook.DocbookPackage#getAppendixType_Arch()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='arch'"
	 * @generated
	 */
	Object getArch();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.AppendixType#getArch <em>Arch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Arch</em>' attribute.
	 * @see #getArch()
	 * @generated
	 */
	void setArch(Object value);

	/**
	 * Returns the value of the '<em><b>Arcrole</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arcrole</em>' attribute.
	 * @see #setArcrole(Object)
	 * @see org.docbook.ns.docbook.DocbookPackage#getAppendixType_Arcrole()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='arcrole' namespace='http://www.w3.org/1999/xlink'"
	 * @generated
	 */
	Object getArcrole();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.AppendixType#getArcrole <em>Arcrole</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Arcrole</em>' attribute.
	 * @see #getArcrole()
	 * @generated
	 */
	void setArcrole(Object value);

	/**
	 * Returns the value of the '<em><b>Audience</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Audience</em>' attribute.
	 * @see #setAudience(Object)
	 * @see org.docbook.ns.docbook.DocbookPackage#getAppendixType_Audience()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='audience'"
	 * @generated
	 */
	Object getAudience();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.AppendixType#getAudience <em>Audience</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Audience</em>' attribute.
	 * @see #getAudience()
	 * @generated
	 */
	void setAudience(Object value);

	/**
	 * Returns the value of the '<em><b>Base</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base</em>' attribute.
	 * @see #setBase(Object)
	 * @see org.docbook.ns.docbook.DocbookPackage#getAppendixType_Base()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='base' namespace='http://www.w3.org/XML/1998/namespace'"
	 * @generated
	 */
	Object getBase();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.AppendixType#getBase <em>Base</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base</em>' attribute.
	 * @see #getBase()
	 * @generated
	 */
	void setBase(Object value);

	/**
	 * Returns the value of the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' attribute.
	 * @see #setCondition(Object)
	 * @see org.docbook.ns.docbook.DocbookPackage#getAppendixType_Condition()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='condition'"
	 * @generated
	 */
	Object getCondition();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.AppendixType#getCondition <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' attribute.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(Object value);

	/**
	 * Returns the value of the '<em><b>Conformance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conformance</em>' attribute.
	 * @see #setConformance(Object)
	 * @see org.docbook.ns.docbook.DocbookPackage#getAppendixType_Conformance()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='conformance'"
	 * @generated
	 */
	Object getConformance();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.AppendixType#getConformance <em>Conformance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conformance</em>' attribute.
	 * @see #getConformance()
	 * @generated
	 */
	void setConformance(Object value);

	/**
	 * Returns the value of the '<em><b>Dir</b></em>' attribute.
	 * The literals are from the enumeration {@link org.docbook.ns.docbook.DirType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dir</em>' attribute.
	 * @see org.docbook.ns.docbook.DirType
	 * @see #isSetDir()
	 * @see #unsetDir()
	 * @see #setDir(DirType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getAppendixType_Dir()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='dir'"
	 * @generated
	 */
	DirType getDir();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.AppendixType#getDir <em>Dir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dir</em>' attribute.
	 * @see org.docbook.ns.docbook.DirType
	 * @see #isSetDir()
	 * @see #unsetDir()
	 * @see #getDir()
	 * @generated
	 */
	void setDir(DirType value);

	/**
	 * Unsets the value of the '{@link org.docbook.ns.docbook.AppendixType#getDir <em>Dir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDir()
	 * @see #getDir()
	 * @see #setDir(DirType)
	 * @generated
	 */
	void unsetDir();

	/**
	 * Returns whether the value of the '{@link org.docbook.ns.docbook.AppendixType#getDir <em>Dir</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Dir</em>' attribute is set.
	 * @see #unsetDir()
	 * @see #getDir()
	 * @see #setDir(DirType)
	 * @generated
	 */
	boolean isSetDir();

	/**
	 * Returns the value of the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Href</em>' attribute.
	 * @see #setHref(Object)
	 * @see org.docbook.ns.docbook.DocbookPackage#getAppendixType_Href()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='href' namespace='http://www.w3.org/1999/xlink'"
	 * @generated
	 */
	Object getHref();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.AppendixType#getHref <em>Href</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Href</em>' attribute.
	 * @see #getHref()
	 * @generated
	 */
	void setHref(Object value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.docbook.ns.docbook.DocbookPackage#getAppendixType_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='id' namespace='http://www.w3.org/XML/1998/namespace'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.AppendixType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(Object)
	 * @see org.docbook.ns.docbook.DocbookPackage#getAppendixType_Label()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='label'"
	 * @generated
	 */
	Object getLabel();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.AppendixType#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(Object value);

	/**
	 * Returns the value of the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lang</em>' attribute.
	 * @see #setLang(Object)
	 * @see org.docbook.ns.docbook.DocbookPackage#getAppendixType_Lang()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='lang' namespace='http://www.w3.org/XML/1998/namespace'"
	 * @generated
	 */
	Object getLang();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.AppendixType#getLang <em>Lang</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lang</em>' attribute.
	 * @see #getLang()
	 * @generated
	 */
	void setLang(Object value);

	/**
	 * Returns the value of the '<em><b>Linkend</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Linkend</em>' attribute.
	 * @see #setLinkend(String)
	 * @see org.docbook.ns.docbook.DocbookPackage#getAppendixType_Linkend()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.IDREF"
	 *        extendedMetaData="kind='attribute' name='linkend'"
	 * @generated
	 */
	String getLinkend();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.AppendixType#getLinkend <em>Linkend</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Linkend</em>' attribute.
	 * @see #getLinkend()
	 * @generated
	 */
	void setLinkend(String value);

	/**
	 * Returns the value of the '<em><b>Os</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Os</em>' attribute.
	 * @see #setOs(Object)
	 * @see org.docbook.ns.docbook.DocbookPackage#getAppendixType_Os()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='os'"
	 * @generated
	 */
	Object getOs();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.AppendixType#getOs <em>Os</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Os</em>' attribute.
	 * @see #getOs()
	 * @generated
	 */
	void setOs(Object value);

	/**
	 * Returns the value of the '<em><b>Remap</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Remap</em>' attribute.
	 * @see #setRemap(Object)
	 * @see org.docbook.ns.docbook.DocbookPackage#getAppendixType_Remap()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='remap'"
	 * @generated
	 */
	Object getRemap();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.AppendixType#getRemap <em>Remap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remap</em>' attribute.
	 * @see #getRemap()
	 * @generated
	 */
	void setRemap(Object value);

	/**
	 * Returns the value of the '<em><b>Revision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Revision</em>' attribute.
	 * @see #setRevision(Object)
	 * @see org.docbook.ns.docbook.DocbookPackage#getAppendixType_Revision()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='revision'"
	 * @generated
	 */
	Object getRevision();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.AppendixType#getRevision <em>Revision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Revision</em>' attribute.
	 * @see #getRevision()
	 * @generated
	 */
	void setRevision(Object value);

	/**
	 * Returns the value of the '<em><b>Revisionflag</b></em>' attribute.
	 * The literals are from the enumeration {@link org.docbook.ns.docbook.RevisionflagType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Revisionflag</em>' attribute.
	 * @see org.docbook.ns.docbook.RevisionflagType
	 * @see #isSetRevisionflag()
	 * @see #unsetRevisionflag()
	 * @see #setRevisionflag(RevisionflagType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getAppendixType_Revisionflag()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='revisionflag'"
	 * @generated
	 */
	RevisionflagType getRevisionflag();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.AppendixType#getRevisionflag <em>Revisionflag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Revisionflag</em>' attribute.
	 * @see org.docbook.ns.docbook.RevisionflagType
	 * @see #isSetRevisionflag()
	 * @see #unsetRevisionflag()
	 * @see #getRevisionflag()
	 * @generated
	 */
	void setRevisionflag(RevisionflagType value);

	/**
	 * Unsets the value of the '{@link org.docbook.ns.docbook.AppendixType#getRevisionflag <em>Revisionflag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRevisionflag()
	 * @see #getRevisionflag()
	 * @see #setRevisionflag(RevisionflagType)
	 * @generated
	 */
	void unsetRevisionflag();

	/**
	 * Returns whether the value of the '{@link org.docbook.ns.docbook.AppendixType#getRevisionflag <em>Revisionflag</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Revisionflag</em>' attribute is set.
	 * @see #unsetRevisionflag()
	 * @see #getRevisionflag()
	 * @see #setRevisionflag(RevisionflagType)
	 * @generated
	 */
	boolean isSetRevisionflag();

	/**
	 * Returns the value of the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' attribute.
	 * @see #setRole(Object)
	 * @see org.docbook.ns.docbook.DocbookPackage#getAppendixType_Role()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='role'"
	 * @generated
	 */
	Object getRole();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.AppendixType#getRole <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' attribute.
	 * @see #getRole()
	 * @generated
	 */
	void setRole(Object value);

	/**
	 * Returns the value of the '<em><b>Role1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role1</em>' attribute.
	 * @see #setRole1(Object)
	 * @see org.docbook.ns.docbook.DocbookPackage#getAppendixType_Role1()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='role' namespace='http://www.w3.org/1999/xlink'"
	 * @generated
	 */
	Object getRole1();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.AppendixType#getRole1 <em>Role1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role1</em>' attribute.
	 * @see #getRole1()
	 * @generated
	 */
	void setRole1(Object value);

	/**
	 * Returns the value of the '<em><b>Security</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security</em>' attribute.
	 * @see #setSecurity(Object)
	 * @see org.docbook.ns.docbook.DocbookPackage#getAppendixType_Security()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='security'"
	 * @generated
	 */
	Object getSecurity();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.AppendixType#getSecurity <em>Security</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Security</em>' attribute.
	 * @see #getSecurity()
	 * @generated
	 */
	void setSecurity(Object value);

	/**
	 * Returns the value of the '<em><b>Show</b></em>' attribute.
	 * The literals are from the enumeration {@link org.w3._1999.xlink.ShowType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Show</em>' attribute.
	 * @see org.w3._1999.xlink.ShowType
	 * @see #isSetShow()
	 * @see #unsetShow()
	 * @see #setShow(ShowType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getAppendixType_Show()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='show' namespace='http://www.w3.org/1999/xlink'"
	 * @generated
	 */
	ShowType getShow();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.AppendixType#getShow <em>Show</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Show</em>' attribute.
	 * @see org.w3._1999.xlink.ShowType
	 * @see #isSetShow()
	 * @see #unsetShow()
	 * @see #getShow()
	 * @generated
	 */
	void setShow(ShowType value);

	/**
	 * Unsets the value of the '{@link org.docbook.ns.docbook.AppendixType#getShow <em>Show</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetShow()
	 * @see #getShow()
	 * @see #setShow(ShowType)
	 * @generated
	 */
	void unsetShow();

	/**
	 * Returns whether the value of the '{@link org.docbook.ns.docbook.AppendixType#getShow <em>Show</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Show</em>' attribute is set.
	 * @see #unsetShow()
	 * @see #getShow()
	 * @see #setShow(ShowType)
	 * @generated
	 */
	boolean isSetShow();

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see #setStatus(Object)
	 * @see org.docbook.ns.docbook.DocbookPackage#getAppendixType_Status()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='status'"
	 * @generated
	 */
	Object getStatus();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.AppendixType#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(Object value);

	/**
	 * Returns the value of the '<em><b>Title1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title1</em>' attribute.
	 * @see #setTitle1(Object)
	 * @see org.docbook.ns.docbook.DocbookPackage#getAppendixType_Title1()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='title' namespace='http://www.w3.org/1999/xlink'"
	 * @generated
	 */
	Object getTitle1();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.AppendixType#getTitle1 <em>Title1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title1</em>' attribute.
	 * @see #getTitle1()
	 * @generated
	 */
	void setTitle1(Object value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(Object)
	 * @see org.docbook.ns.docbook.DocbookPackage#getAppendixType_Type()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='type' namespace='http://www.w3.org/1999/xlink'"
	 * @generated
	 */
	Object getType();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.AppendixType#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(Object value);

	/**
	 * Returns the value of the '<em><b>Userlevel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Userlevel</em>' attribute.
	 * @see #setUserlevel(Object)
	 * @see org.docbook.ns.docbook.DocbookPackage#getAppendixType_Userlevel()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='userlevel'"
	 * @generated
	 */
	Object getUserlevel();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.AppendixType#getUserlevel <em>Userlevel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Userlevel</em>' attribute.
	 * @see #getUserlevel()
	 * @generated
	 */
	void setUserlevel(Object value);

	/**
	 * Returns the value of the '<em><b>Vendor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vendor</em>' attribute.
	 * @see #setVendor(Object)
	 * @see org.docbook.ns.docbook.DocbookPackage#getAppendixType_Vendor()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='vendor'"
	 * @generated
	 */
	Object getVendor();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.AppendixType#getVendor <em>Vendor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vendor</em>' attribute.
	 * @see #getVendor()
	 * @generated
	 */
	void setVendor(Object value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(Object)
	 * @see org.docbook.ns.docbook.DocbookPackage#getAppendixType_Version()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='version'"
	 * @generated
	 */
	Object getVersion();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.AppendixType#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(Object value);

	/**
	 * Returns the value of the '<em><b>Wordsize</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wordsize</em>' attribute.
	 * @see #setWordsize(Object)
	 * @see org.docbook.ns.docbook.DocbookPackage#getAppendixType_Wordsize()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='wordsize'"
	 * @generated
	 */
	Object getWordsize();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.AppendixType#getWordsize <em>Wordsize</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wordsize</em>' attribute.
	 * @see #getWordsize()
	 * @generated
	 */
	void setWordsize(Object value);

	/**
	 * Returns the value of the '<em><b>Xreflabel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Xreflabel</em>' attribute.
	 * @see #setXreflabel(Object)
	 * @see org.docbook.ns.docbook.DocbookPackage#getAppendixType_Xreflabel()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='xreflabel'"
	 * @generated
	 */
	Object getXreflabel();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.AppendixType#getXreflabel <em>Xreflabel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xreflabel</em>' attribute.
	 * @see #getXreflabel()
	 * @generated
	 */
	void setXreflabel(Object value);

} // AppendixType
