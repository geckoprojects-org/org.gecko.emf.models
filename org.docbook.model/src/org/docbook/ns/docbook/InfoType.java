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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Info Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.docbook.ns.docbook.InfoType#getGroup <em>Group</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.InfoType#getTitle <em>Title</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.InfoType#getTitleabbrev <em>Titleabbrev</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.InfoType#getSubtitle <em>Subtitle</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.InfoType#getAbstract <em>Abstract</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.InfoType#getAddress <em>Address</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.InfoType#getArtpagenums <em>Artpagenums</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.InfoType#getAuthor <em>Author</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.InfoType#getAuthorgroup <em>Authorgroup</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.InfoType#getAuthorinitials <em>Authorinitials</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.InfoType#getBibliocoverage <em>Bibliocoverage</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.InfoType#getBiblioid <em>Biblioid</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.InfoType#getBibliosource <em>Bibliosource</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.InfoType#getCollab <em>Collab</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.InfoType#getConfgroup <em>Confgroup</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.InfoType#getContractsponsor <em>Contractsponsor</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.InfoType#getContractnum <em>Contractnum</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.InfoType#getCopyright <em>Copyright</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.InfoType#getCover <em>Cover</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.InfoType#getDate <em>Date</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.InfoType#getEdition <em>Edition</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.InfoType#getEditor <em>Editor</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.InfoType#getIssuenum <em>Issuenum</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.InfoType#getKeywordset <em>Keywordset</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.InfoType#getLegalnotice <em>Legalnotice</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.InfoType#getMediaobject <em>Mediaobject</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.InfoType#getOrg <em>Org</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.InfoType#getOrgname <em>Orgname</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.InfoType#getOthercredit <em>Othercredit</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.InfoType#getPagenums <em>Pagenums</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.InfoType#getPrinthistory <em>Printhistory</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.InfoType#getPubdate <em>Pubdate</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.InfoType#getPublisher <em>Publisher</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.InfoType#getPublishername <em>Publishername</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.InfoType#getReleaseinfo <em>Releaseinfo</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.InfoType#getRevhistory <em>Revhistory</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.InfoType#getSeriesvolnums <em>Seriesvolnums</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.InfoType#getSubjectset <em>Subjectset</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.InfoType#getVolumenum <em>Volumenum</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.InfoType#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.InfoType#getExtendedlink <em>Extendedlink</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.InfoType#getBibliomisc <em>Bibliomisc</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.InfoType#getBibliomset <em>Bibliomset</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.InfoType#getBibliorelation <em>Bibliorelation</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.InfoType#getBiblioset <em>Biblioset</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.InfoType#getItermset <em>Itermset</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.InfoType#getProductname <em>Productname</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.InfoType#getProductnumber <em>Productnumber</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.InfoType#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.InfoType#getArch <em>Arch</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.InfoType#getAudience <em>Audience</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.InfoType#getBase <em>Base</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.InfoType#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.InfoType#getConformance <em>Conformance</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.InfoType#getDir <em>Dir</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.InfoType#getId <em>Id</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.InfoType#getLang <em>Lang</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.InfoType#getOs <em>Os</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.InfoType#getRemap <em>Remap</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.InfoType#getRevision <em>Revision</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.InfoType#getRevisionflag <em>Revisionflag</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.InfoType#getRole <em>Role</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.InfoType#getSecurity <em>Security</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.InfoType#getUserlevel <em>Userlevel</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.InfoType#getVendor <em>Vendor</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.InfoType#getVersion <em>Version</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.InfoType#getWordsize <em>Wordsize</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.InfoType#getXreflabel <em>Xreflabel</em>}</li>
 * </ul>
 *
 * @see org.docbook.ns.docbook.DocbookPackage#getInfoType()
 * @model extendedMetaData="name='info_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface InfoType extends EObject {
	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getInfoType_Group()
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
	 * @see org.docbook.ns.docbook.DocbookPackage#getInfoType_Title()
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
	 * @see org.docbook.ns.docbook.DocbookPackage#getInfoType_Titleabbrev()
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
	 * @see org.docbook.ns.docbook.DocbookPackage#getInfoType_Subtitle()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='subtitle' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<SubtitleType> getSubtitle();

	/**
	 * Returns the value of the '<em><b>Abstract</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.AbstractType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getInfoType_Abstract()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='abstract' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<AbstractType> getAbstract();

	/**
	 * Returns the value of the '<em><b>Address</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.AddressType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Address</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getInfoType_Address()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='address' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<AddressType> getAddress();

	/**
	 * Returns the value of the '<em><b>Artpagenums</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.ArtpagenumsType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Artpagenums</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getInfoType_Artpagenums()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='artpagenums' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<ArtpagenumsType> getArtpagenums();

	/**
	 * Returns the value of the '<em><b>Author</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.AuthorType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Author</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getInfoType_Author()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='author' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<AuthorType> getAuthor();

	/**
	 * Returns the value of the '<em><b>Authorgroup</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.AuthorgroupType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Authorgroup</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getInfoType_Authorgroup()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='authorgroup' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<AuthorgroupType> getAuthorgroup();

	/**
	 * Returns the value of the '<em><b>Authorinitials</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.AuthorinitialsType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Authorinitials</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getInfoType_Authorinitials()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='authorinitials' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<AuthorinitialsType> getAuthorinitials();

	/**
	 * Returns the value of the '<em><b>Bibliocoverage</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.BibliocoverageType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bibliocoverage</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getInfoType_Bibliocoverage()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='bibliocoverage' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<BibliocoverageType> getBibliocoverage();

	/**
	 * Returns the value of the '<em><b>Biblioid</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.BiblioidType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Biblioid</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getInfoType_Biblioid()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='biblioid' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<BiblioidType> getBiblioid();

	/**
	 * Returns the value of the '<em><b>Bibliosource</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.BibliosourceType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bibliosource</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getInfoType_Bibliosource()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='bibliosource' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<BibliosourceType> getBibliosource();

	/**
	 * Returns the value of the '<em><b>Collab</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.CollabType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Collab</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getInfoType_Collab()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='collab' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<CollabType> getCollab();

	/**
	 * Returns the value of the '<em><b>Confgroup</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.ConfgroupType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Confgroup</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getInfoType_Confgroup()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='confgroup' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<ConfgroupType> getConfgroup();

	/**
	 * Returns the value of the '<em><b>Contractsponsor</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.ContractsponsorType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contractsponsor</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getInfoType_Contractsponsor()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='contractsponsor' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<ContractsponsorType> getContractsponsor();

	/**
	 * Returns the value of the '<em><b>Contractnum</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.ContractnumType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contractnum</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getInfoType_Contractnum()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='contractnum' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<ContractnumType> getContractnum();

	/**
	 * Returns the value of the '<em><b>Copyright</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.CopyrightType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Copyright</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getInfoType_Copyright()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='copyright' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<CopyrightType> getCopyright();

	/**
	 * Returns the value of the '<em><b>Cover</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.CoverType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cover</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getInfoType_Cover()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='cover' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<CoverType> getCover();

	/**
	 * Returns the value of the '<em><b>Date</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.DateType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getInfoType_Date()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='date' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<DateType> getDate();

	/**
	 * Returns the value of the '<em><b>Edition</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.EditionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Edition</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getInfoType_Edition()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='edition' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<EditionType> getEdition();

	/**
	 * Returns the value of the '<em><b>Editor</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.EditorType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Editor</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getInfoType_Editor()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='editor' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<EditorType> getEditor();

	/**
	 * Returns the value of the '<em><b>Issuenum</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.IssuenumType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Issuenum</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getInfoType_Issuenum()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='issuenum' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<IssuenumType> getIssuenum();

	/**
	 * Returns the value of the '<em><b>Keywordset</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.KeywordsetType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Keywordset</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getInfoType_Keywordset()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='keywordset' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<KeywordsetType> getKeywordset();

	/**
	 * Returns the value of the '<em><b>Legalnotice</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.LegalnoticeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Legalnotice</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getInfoType_Legalnotice()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='legalnotice' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<LegalnoticeType> getLegalnotice();

	/**
	 * Returns the value of the '<em><b>Mediaobject</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.MediaobjectType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mediaobject</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getInfoType_Mediaobject()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='mediaobject' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<MediaobjectType> getMediaobject();

	/**
	 * Returns the value of the '<em><b>Org</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.OrgType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Org</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getInfoType_Org()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='org' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<OrgType> getOrg();

	/**
	 * Returns the value of the '<em><b>Orgname</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.OrgnameType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Orgname</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getInfoType_Orgname()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='orgname' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<OrgnameType> getOrgname();

	/**
	 * Returns the value of the '<em><b>Othercredit</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.OthercreditType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Othercredit</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getInfoType_Othercredit()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='othercredit' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<OthercreditType> getOthercredit();

	/**
	 * Returns the value of the '<em><b>Pagenums</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.PagenumsType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pagenums</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getInfoType_Pagenums()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='pagenums' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<PagenumsType> getPagenums();

	/**
	 * Returns the value of the '<em><b>Printhistory</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.PrinthistoryType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Printhistory</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getInfoType_Printhistory()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='printhistory' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<PrinthistoryType> getPrinthistory();

	/**
	 * Returns the value of the '<em><b>Pubdate</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.PubdateType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pubdate</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getInfoType_Pubdate()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='pubdate' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<PubdateType> getPubdate();

	/**
	 * Returns the value of the '<em><b>Publisher</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.PublisherType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Publisher</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getInfoType_Publisher()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='publisher' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<PublisherType> getPublisher();

	/**
	 * Returns the value of the '<em><b>Publishername</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.PublishernameType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Publishername</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getInfoType_Publishername()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='publishername' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<PublishernameType> getPublishername();

	/**
	 * Returns the value of the '<em><b>Releaseinfo</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.ReleaseinfoType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Releaseinfo</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getInfoType_Releaseinfo()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='releaseinfo' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<ReleaseinfoType> getReleaseinfo();

	/**
	 * Returns the value of the '<em><b>Revhistory</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.RevhistoryType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Revhistory</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getInfoType_Revhistory()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='revhistory' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<RevhistoryType> getRevhistory();

	/**
	 * Returns the value of the '<em><b>Seriesvolnums</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.SeriesvolnumsType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Seriesvolnums</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getInfoType_Seriesvolnums()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='seriesvolnums' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<SeriesvolnumsType> getSeriesvolnums();

	/**
	 * Returns the value of the '<em><b>Subjectset</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.SubjectsetType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subjectset</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getInfoType_Subjectset()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='subjectset' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<SubjectsetType> getSubjectset();

	/**
	 * Returns the value of the '<em><b>Volumenum</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.VolumenumType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Volumenum</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getInfoType_Volumenum()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='volumenum' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<VolumenumType> getVolumenum();

	/**
	 * Returns the value of the '<em><b>Annotation</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.AnnotationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotation</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getInfoType_Annotation()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='annotation' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<AnnotationType> getAnnotation();

	/**
	 * Returns the value of the '<em><b>Extendedlink</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.ExtendedlinkType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extendedlink</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getInfoType_Extendedlink()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='extendedlink' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<ExtendedlinkType> getExtendedlink();

	/**
	 * Returns the value of the '<em><b>Bibliomisc</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.BibliomiscType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bibliomisc</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getInfoType_Bibliomisc()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='bibliomisc' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<BibliomiscType> getBibliomisc();

	/**
	 * Returns the value of the '<em><b>Bibliomset</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.BibliomsetType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bibliomset</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getInfoType_Bibliomset()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='bibliomset' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<BibliomsetType> getBibliomset();

	/**
	 * Returns the value of the '<em><b>Bibliorelation</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.BibliorelationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bibliorelation</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getInfoType_Bibliorelation()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='bibliorelation' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<BibliorelationType> getBibliorelation();

	/**
	 * Returns the value of the '<em><b>Biblioset</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.BibliosetType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Biblioset</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getInfoType_Biblioset()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='biblioset' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<BibliosetType> getBiblioset();

	/**
	 * Returns the value of the '<em><b>Itermset</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.ItermsetType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Itermset</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getInfoType_Itermset()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='itermset' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<ItermsetType> getItermset();

	/**
	 * Returns the value of the '<em><b>Productname</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.ProductnameType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Productname</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getInfoType_Productname()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='productname' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<ProductnameType> getProductname();

	/**
	 * Returns the value of the '<em><b>Productnumber</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.ProductnumberType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Productnumber</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getInfoType_Productnumber()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='productnumber' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<ProductnumberType> getProductnumber();

	/**
	 * Returns the value of the '<em><b>Annotations</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotations</em>' attribute.
	 * @see #setAnnotations(Object)
	 * @see org.docbook.ns.docbook.DocbookPackage#getInfoType_Annotations()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='annotations'"
	 * @generated
	 */
	Object getAnnotations();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.InfoType#getAnnotations <em>Annotations</em>}' attribute.
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
	 * @see org.docbook.ns.docbook.DocbookPackage#getInfoType_Arch()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='arch'"
	 * @generated
	 */
	Object getArch();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.InfoType#getArch <em>Arch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Arch</em>' attribute.
	 * @see #getArch()
	 * @generated
	 */
	void setArch(Object value);

	/**
	 * Returns the value of the '<em><b>Audience</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Audience</em>' attribute.
	 * @see #setAudience(Object)
	 * @see org.docbook.ns.docbook.DocbookPackage#getInfoType_Audience()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='audience'"
	 * @generated
	 */
	Object getAudience();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.InfoType#getAudience <em>Audience</em>}' attribute.
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
	 * @see org.docbook.ns.docbook.DocbookPackage#getInfoType_Base()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='base' namespace='http://www.w3.org/XML/1998/namespace'"
	 * @generated
	 */
	Object getBase();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.InfoType#getBase <em>Base</em>}' attribute.
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
	 * @see org.docbook.ns.docbook.DocbookPackage#getInfoType_Condition()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='condition'"
	 * @generated
	 */
	Object getCondition();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.InfoType#getCondition <em>Condition</em>}' attribute.
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
	 * @see org.docbook.ns.docbook.DocbookPackage#getInfoType_Conformance()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='conformance'"
	 * @generated
	 */
	Object getConformance();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.InfoType#getConformance <em>Conformance</em>}' attribute.
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
	 * @see org.docbook.ns.docbook.DocbookPackage#getInfoType_Dir()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='dir'"
	 * @generated
	 */
	DirType getDir();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.InfoType#getDir <em>Dir</em>}' attribute.
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
	 * Unsets the value of the '{@link org.docbook.ns.docbook.InfoType#getDir <em>Dir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDir()
	 * @see #getDir()
	 * @see #setDir(DirType)
	 * @generated
	 */
	void unsetDir();

	/**
	 * Returns whether the value of the '{@link org.docbook.ns.docbook.InfoType#getDir <em>Dir</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.docbook.ns.docbook.DocbookPackage#getInfoType_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='id' namespace='http://www.w3.org/XML/1998/namespace'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.InfoType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lang</em>' attribute.
	 * @see #setLang(Object)
	 * @see org.docbook.ns.docbook.DocbookPackage#getInfoType_Lang()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='lang' namespace='http://www.w3.org/XML/1998/namespace'"
	 * @generated
	 */
	Object getLang();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.InfoType#getLang <em>Lang</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lang</em>' attribute.
	 * @see #getLang()
	 * @generated
	 */
	void setLang(Object value);

	/**
	 * Returns the value of the '<em><b>Os</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Os</em>' attribute.
	 * @see #setOs(Object)
	 * @see org.docbook.ns.docbook.DocbookPackage#getInfoType_Os()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='os'"
	 * @generated
	 */
	Object getOs();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.InfoType#getOs <em>Os</em>}' attribute.
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
	 * @see org.docbook.ns.docbook.DocbookPackage#getInfoType_Remap()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='remap'"
	 * @generated
	 */
	Object getRemap();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.InfoType#getRemap <em>Remap</em>}' attribute.
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
	 * @see org.docbook.ns.docbook.DocbookPackage#getInfoType_Revision()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='revision'"
	 * @generated
	 */
	Object getRevision();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.InfoType#getRevision <em>Revision</em>}' attribute.
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
	 * @see org.docbook.ns.docbook.DocbookPackage#getInfoType_Revisionflag()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='revisionflag'"
	 * @generated
	 */
	RevisionflagType getRevisionflag();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.InfoType#getRevisionflag <em>Revisionflag</em>}' attribute.
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
	 * Unsets the value of the '{@link org.docbook.ns.docbook.InfoType#getRevisionflag <em>Revisionflag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRevisionflag()
	 * @see #getRevisionflag()
	 * @see #setRevisionflag(RevisionflagType)
	 * @generated
	 */
	void unsetRevisionflag();

	/**
	 * Returns whether the value of the '{@link org.docbook.ns.docbook.InfoType#getRevisionflag <em>Revisionflag</em>}' attribute is set.
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
	 * @see org.docbook.ns.docbook.DocbookPackage#getInfoType_Role()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='role'"
	 * @generated
	 */
	Object getRole();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.InfoType#getRole <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' attribute.
	 * @see #getRole()
	 * @generated
	 */
	void setRole(Object value);

	/**
	 * Returns the value of the '<em><b>Security</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security</em>' attribute.
	 * @see #setSecurity(Object)
	 * @see org.docbook.ns.docbook.DocbookPackage#getInfoType_Security()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='security'"
	 * @generated
	 */
	Object getSecurity();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.InfoType#getSecurity <em>Security</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Security</em>' attribute.
	 * @see #getSecurity()
	 * @generated
	 */
	void setSecurity(Object value);

	/**
	 * Returns the value of the '<em><b>Userlevel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Userlevel</em>' attribute.
	 * @see #setUserlevel(Object)
	 * @see org.docbook.ns.docbook.DocbookPackage#getInfoType_Userlevel()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='userlevel'"
	 * @generated
	 */
	Object getUserlevel();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.InfoType#getUserlevel <em>Userlevel</em>}' attribute.
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
	 * @see org.docbook.ns.docbook.DocbookPackage#getInfoType_Vendor()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='vendor'"
	 * @generated
	 */
	Object getVendor();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.InfoType#getVendor <em>Vendor</em>}' attribute.
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
	 * @see org.docbook.ns.docbook.DocbookPackage#getInfoType_Version()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='version'"
	 * @generated
	 */
	Object getVersion();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.InfoType#getVersion <em>Version</em>}' attribute.
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
	 * @see org.docbook.ns.docbook.DocbookPackage#getInfoType_Wordsize()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='wordsize'"
	 * @generated
	 */
	Object getWordsize();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.InfoType#getWordsize <em>Wordsize</em>}' attribute.
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
	 * @see org.docbook.ns.docbook.DocbookPackage#getInfoType_Xreflabel()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='xreflabel'"
	 * @generated
	 */
	Object getXreflabel();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.InfoType#getXreflabel <em>Xreflabel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xreflabel</em>' attribute.
	 * @see #getXreflabel()
	 * @generated
	 */
	void setXreflabel(Object value);

} // InfoType
