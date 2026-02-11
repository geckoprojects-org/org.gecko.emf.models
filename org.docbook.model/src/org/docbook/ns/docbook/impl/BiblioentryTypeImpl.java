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
import org.docbook.ns.docbook.AbstractType;
import org.docbook.ns.docbook.AcronymType;
import org.docbook.ns.docbook.AddressType;
import org.docbook.ns.docbook.AnnotationType;
import org.docbook.ns.docbook.ArtpagenumsType;
import org.docbook.ns.docbook.AuthorType;
import org.docbook.ns.docbook.AuthorgroupType;
import org.docbook.ns.docbook.AuthorinitialsType;
import org.docbook.ns.docbook.BibliocoverageType;
import org.docbook.ns.docbook.BiblioentryType;
import org.docbook.ns.docbook.BiblioidType;
import org.docbook.ns.docbook.BibliomiscType;
import org.docbook.ns.docbook.BibliomsetType;
import org.docbook.ns.docbook.BibliorelationType;
import org.docbook.ns.docbook.BibliosetType;
import org.docbook.ns.docbook.BibliosourceType;
import org.docbook.ns.docbook.CitebiblioidType;
import org.docbook.ns.docbook.CiterefentryType;
import org.docbook.ns.docbook.CitetitleType;
import org.docbook.ns.docbook.CollabType;
import org.docbook.ns.docbook.ConfgroupType;
import org.docbook.ns.docbook.ContractnumType;
import org.docbook.ns.docbook.ContractsponsorType;
import org.docbook.ns.docbook.CopyrightType;
import org.docbook.ns.docbook.CorefType;
import org.docbook.ns.docbook.CoverType;
import org.docbook.ns.docbook.DateType;
import org.docbook.ns.docbook.DirType;
import org.docbook.ns.docbook.DocbookPackage;
import org.docbook.ns.docbook.EditionType;
import org.docbook.ns.docbook.EditorType;
import org.docbook.ns.docbook.EmphasisType;
import org.docbook.ns.docbook.ExtendedlinkType;
import org.docbook.ns.docbook.FirsttermType;
import org.docbook.ns.docbook.FootnoteType;
import org.docbook.ns.docbook.FootnoterefType;
import org.docbook.ns.docbook.ForeignphraseType;
import org.docbook.ns.docbook.GlosstermType;
import org.docbook.ns.docbook.IssuenumType;
import org.docbook.ns.docbook.ItermsetType;
import org.docbook.ns.docbook.KeywordsetType;
import org.docbook.ns.docbook.LegalnoticeType;
import org.docbook.ns.docbook.MediaobjectType;
import org.docbook.ns.docbook.OrgType;
import org.docbook.ns.docbook.OrgnameType;
import org.docbook.ns.docbook.OthercreditType;
import org.docbook.ns.docbook.PagenumsType;
import org.docbook.ns.docbook.PersonType;
import org.docbook.ns.docbook.PersonblurbType;
import org.docbook.ns.docbook.PersonnameType;
import org.docbook.ns.docbook.PhraseType;
import org.docbook.ns.docbook.PrinthistoryType;
import org.docbook.ns.docbook.ProductnameType;
import org.docbook.ns.docbook.ProductnumberType;
import org.docbook.ns.docbook.PubdateType;
import org.docbook.ns.docbook.PublisherType;
import org.docbook.ns.docbook.PublishernameType;
import org.docbook.ns.docbook.QuoteType;
import org.docbook.ns.docbook.ReleaseinfoType;
import org.docbook.ns.docbook.RevhistoryType;
import org.docbook.ns.docbook.RevisionflagType;
import org.docbook.ns.docbook.SeriesvolnumsType;
import org.docbook.ns.docbook.SubjectsetType;
import org.docbook.ns.docbook.SubscriptType;
import org.docbook.ns.docbook.SubtitleType;
import org.docbook.ns.docbook.SuperscriptType;
import org.docbook.ns.docbook.TitleType;
import org.docbook.ns.docbook.TitleabbrevType;
import org.docbook.ns.docbook.VolumenumType;
import org.docbook.ns.docbook.WordaswordType;

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
 * An implementation of the model object '<em><b>Biblioentry Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.docbook.ns.docbook.impl.BiblioentryTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.BiblioentryTypeImpl#getAbstract <em>Abstract</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.BiblioentryTypeImpl#getAddress <em>Address</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.BiblioentryTypeImpl#getArtpagenums <em>Artpagenums</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.BiblioentryTypeImpl#getAuthor <em>Author</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.BiblioentryTypeImpl#getAuthorgroup <em>Authorgroup</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.BiblioentryTypeImpl#getAuthorinitials <em>Authorinitials</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.BiblioentryTypeImpl#getBibliocoverage <em>Bibliocoverage</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.BiblioentryTypeImpl#getBiblioid <em>Biblioid</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.BiblioentryTypeImpl#getBibliosource <em>Bibliosource</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.BiblioentryTypeImpl#getCollab <em>Collab</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.BiblioentryTypeImpl#getConfgroup <em>Confgroup</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.BiblioentryTypeImpl#getContractsponsor <em>Contractsponsor</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.BiblioentryTypeImpl#getContractnum <em>Contractnum</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.BiblioentryTypeImpl#getCopyright <em>Copyright</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.BiblioentryTypeImpl#getCover <em>Cover</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.BiblioentryTypeImpl#getDate <em>Date</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.BiblioentryTypeImpl#getEdition <em>Edition</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.BiblioentryTypeImpl#getEditor <em>Editor</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.BiblioentryTypeImpl#getIssuenum <em>Issuenum</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.BiblioentryTypeImpl#getKeywordset <em>Keywordset</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.BiblioentryTypeImpl#getLegalnotice <em>Legalnotice</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.BiblioentryTypeImpl#getMediaobject <em>Mediaobject</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.BiblioentryTypeImpl#getOrg <em>Org</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.BiblioentryTypeImpl#getOrgname <em>Orgname</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.BiblioentryTypeImpl#getOthercredit <em>Othercredit</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.BiblioentryTypeImpl#getPagenums <em>Pagenums</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.BiblioentryTypeImpl#getPrinthistory <em>Printhistory</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.BiblioentryTypeImpl#getPubdate <em>Pubdate</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.BiblioentryTypeImpl#getPublisher <em>Publisher</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.BiblioentryTypeImpl#getPublishername <em>Publishername</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.BiblioentryTypeImpl#getReleaseinfo <em>Releaseinfo</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.BiblioentryTypeImpl#getRevhistory <em>Revhistory</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.BiblioentryTypeImpl#getSeriesvolnums <em>Seriesvolnums</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.BiblioentryTypeImpl#getSubjectset <em>Subjectset</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.BiblioentryTypeImpl#getVolumenum <em>Volumenum</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.BiblioentryTypeImpl#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.BiblioentryTypeImpl#getExtendedlink <em>Extendedlink</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.BiblioentryTypeImpl#getBibliomisc <em>Bibliomisc</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.BiblioentryTypeImpl#getBibliomset <em>Bibliomset</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.BiblioentryTypeImpl#getBibliorelation <em>Bibliorelation</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.BiblioentryTypeImpl#getBiblioset <em>Biblioset</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.BiblioentryTypeImpl#getItermset <em>Itermset</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.BiblioentryTypeImpl#getProductname <em>Productname</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.BiblioentryTypeImpl#getProductnumber <em>Productnumber</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.BiblioentryTypeImpl#getAbbrev <em>Abbrev</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.BiblioentryTypeImpl#getAcronym <em>Acronym</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.BiblioentryTypeImpl#getEmphasis <em>Emphasis</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.BiblioentryTypeImpl#getFootnote <em>Footnote</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.BiblioentryTypeImpl#getFootnoteref <em>Footnoteref</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.BiblioentryTypeImpl#getForeignphrase <em>Foreignphrase</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.BiblioentryTypeImpl#getPhrase <em>Phrase</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.BiblioentryTypeImpl#getQuote <em>Quote</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.BiblioentryTypeImpl#getSubscript <em>Subscript</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.BiblioentryTypeImpl#getSuperscript <em>Superscript</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.BiblioentryTypeImpl#getWordasword <em>Wordasword</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.BiblioentryTypeImpl#getFirstterm <em>Firstterm</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.BiblioentryTypeImpl#getGlossterm <em>Glossterm</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.BiblioentryTypeImpl#getCoref <em>Coref</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.BiblioentryTypeImpl#getCiterefentry <em>Citerefentry</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.BiblioentryTypeImpl#getCitetitle <em>Citetitle</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.BiblioentryTypeImpl#getCitebiblioid <em>Citebiblioid</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.BiblioentryTypeImpl#getPerson <em>Person</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.BiblioentryTypeImpl#getPersonblurb <em>Personblurb</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.BiblioentryTypeImpl#getPersonname <em>Personname</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.BiblioentryTypeImpl#getSubtitle <em>Subtitle</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.BiblioentryTypeImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.BiblioentryTypeImpl#getTitleabbrev <em>Titleabbrev</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.BiblioentryTypeImpl#getActuate <em>Actuate</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.BiblioentryTypeImpl#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.BiblioentryTypeImpl#getArch <em>Arch</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.BiblioentryTypeImpl#getArcrole <em>Arcrole</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.BiblioentryTypeImpl#getAudience <em>Audience</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.BiblioentryTypeImpl#getBase <em>Base</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.BiblioentryTypeImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.BiblioentryTypeImpl#getConformance <em>Conformance</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.BiblioentryTypeImpl#getDir <em>Dir</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.BiblioentryTypeImpl#getHref <em>Href</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.BiblioentryTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.BiblioentryTypeImpl#getLang <em>Lang</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.BiblioentryTypeImpl#getLinkend <em>Linkend</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.BiblioentryTypeImpl#getOs <em>Os</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.BiblioentryTypeImpl#getRemap <em>Remap</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.BiblioentryTypeImpl#getRevision <em>Revision</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.BiblioentryTypeImpl#getRevisionflag <em>Revisionflag</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.BiblioentryTypeImpl#getRole <em>Role</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.BiblioentryTypeImpl#getRole1 <em>Role1</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.BiblioentryTypeImpl#getSecurity <em>Security</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.BiblioentryTypeImpl#getShow <em>Show</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.BiblioentryTypeImpl#getTitle1 <em>Title1</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.BiblioentryTypeImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.BiblioentryTypeImpl#getUserlevel <em>Userlevel</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.BiblioentryTypeImpl#getVendor <em>Vendor</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.BiblioentryTypeImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.BiblioentryTypeImpl#getWordsize <em>Wordsize</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.BiblioentryTypeImpl#getXreflabel <em>Xreflabel</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BiblioentryTypeImpl extends MinimalEObjectImpl.Container implements BiblioentryType {
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
	protected BiblioentryTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DocbookPackage.eINSTANCE.getBiblioentryType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, DocbookPackage.BIBLIOENTRY_TYPE__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbstractType> getAbstract() {
		return getGroup().list(DocbookPackage.eINSTANCE.getBiblioentryType_Abstract());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AddressType> getAddress() {
		return getGroup().list(DocbookPackage.eINSTANCE.getBiblioentryType_Address());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ArtpagenumsType> getArtpagenums() {
		return getGroup().list(DocbookPackage.eINSTANCE.getBiblioentryType_Artpagenums());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AuthorType> getAuthor() {
		return getGroup().list(DocbookPackage.eINSTANCE.getBiblioentryType_Author());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AuthorgroupType> getAuthorgroup() {
		return getGroup().list(DocbookPackage.eINSTANCE.getBiblioentryType_Authorgroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AuthorinitialsType> getAuthorinitials() {
		return getGroup().list(DocbookPackage.eINSTANCE.getBiblioentryType_Authorinitials());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BibliocoverageType> getBibliocoverage() {
		return getGroup().list(DocbookPackage.eINSTANCE.getBiblioentryType_Bibliocoverage());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BiblioidType> getBiblioid() {
		return getGroup().list(DocbookPackage.eINSTANCE.getBiblioentryType_Biblioid());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BibliosourceType> getBibliosource() {
		return getGroup().list(DocbookPackage.eINSTANCE.getBiblioentryType_Bibliosource());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CollabType> getCollab() {
		return getGroup().list(DocbookPackage.eINSTANCE.getBiblioentryType_Collab());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ConfgroupType> getConfgroup() {
		return getGroup().list(DocbookPackage.eINSTANCE.getBiblioentryType_Confgroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ContractsponsorType> getContractsponsor() {
		return getGroup().list(DocbookPackage.eINSTANCE.getBiblioentryType_Contractsponsor());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ContractnumType> getContractnum() {
		return getGroup().list(DocbookPackage.eINSTANCE.getBiblioentryType_Contractnum());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CopyrightType> getCopyright() {
		return getGroup().list(DocbookPackage.eINSTANCE.getBiblioentryType_Copyright());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CoverType> getCover() {
		return getGroup().list(DocbookPackage.eINSTANCE.getBiblioentryType_Cover());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DateType> getDate() {
		return getGroup().list(DocbookPackage.eINSTANCE.getBiblioentryType_Date());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EditionType> getEdition() {
		return getGroup().list(DocbookPackage.eINSTANCE.getBiblioentryType_Edition());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EditorType> getEditor() {
		return getGroup().list(DocbookPackage.eINSTANCE.getBiblioentryType_Editor());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<IssuenumType> getIssuenum() {
		return getGroup().list(DocbookPackage.eINSTANCE.getBiblioentryType_Issuenum());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<KeywordsetType> getKeywordset() {
		return getGroup().list(DocbookPackage.eINSTANCE.getBiblioentryType_Keywordset());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<LegalnoticeType> getLegalnotice() {
		return getGroup().list(DocbookPackage.eINSTANCE.getBiblioentryType_Legalnotice());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MediaobjectType> getMediaobject() {
		return getGroup().list(DocbookPackage.eINSTANCE.getBiblioentryType_Mediaobject());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<OrgType> getOrg() {
		return getGroup().list(DocbookPackage.eINSTANCE.getBiblioentryType_Org());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<OrgnameType> getOrgname() {
		return getGroup().list(DocbookPackage.eINSTANCE.getBiblioentryType_Orgname());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<OthercreditType> getOthercredit() {
		return getGroup().list(DocbookPackage.eINSTANCE.getBiblioentryType_Othercredit());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PagenumsType> getPagenums() {
		return getGroup().list(DocbookPackage.eINSTANCE.getBiblioentryType_Pagenums());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PrinthistoryType> getPrinthistory() {
		return getGroup().list(DocbookPackage.eINSTANCE.getBiblioentryType_Printhistory());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PubdateType> getPubdate() {
		return getGroup().list(DocbookPackage.eINSTANCE.getBiblioentryType_Pubdate());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PublisherType> getPublisher() {
		return getGroup().list(DocbookPackage.eINSTANCE.getBiblioentryType_Publisher());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PublishernameType> getPublishername() {
		return getGroup().list(DocbookPackage.eINSTANCE.getBiblioentryType_Publishername());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ReleaseinfoType> getReleaseinfo() {
		return getGroup().list(DocbookPackage.eINSTANCE.getBiblioentryType_Releaseinfo());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RevhistoryType> getRevhistory() {
		return getGroup().list(DocbookPackage.eINSTANCE.getBiblioentryType_Revhistory());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SeriesvolnumsType> getSeriesvolnums() {
		return getGroup().list(DocbookPackage.eINSTANCE.getBiblioentryType_Seriesvolnums());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SubjectsetType> getSubjectset() {
		return getGroup().list(DocbookPackage.eINSTANCE.getBiblioentryType_Subjectset());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<VolumenumType> getVolumenum() {
		return getGroup().list(DocbookPackage.eINSTANCE.getBiblioentryType_Volumenum());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AnnotationType> getAnnotation() {
		return getGroup().list(DocbookPackage.eINSTANCE.getBiblioentryType_Annotation());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ExtendedlinkType> getExtendedlink() {
		return getGroup().list(DocbookPackage.eINSTANCE.getBiblioentryType_Extendedlink());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BibliomiscType> getBibliomisc() {
		return getGroup().list(DocbookPackage.eINSTANCE.getBiblioentryType_Bibliomisc());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BibliomsetType> getBibliomset() {
		return getGroup().list(DocbookPackage.eINSTANCE.getBiblioentryType_Bibliomset());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BibliorelationType> getBibliorelation() {
		return getGroup().list(DocbookPackage.eINSTANCE.getBiblioentryType_Bibliorelation());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BibliosetType> getBiblioset() {
		return getGroup().list(DocbookPackage.eINSTANCE.getBiblioentryType_Biblioset());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ItermsetType> getItermset() {
		return getGroup().list(DocbookPackage.eINSTANCE.getBiblioentryType_Itermset());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ProductnameType> getProductname() {
		return getGroup().list(DocbookPackage.eINSTANCE.getBiblioentryType_Productname());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ProductnumberType> getProductnumber() {
		return getGroup().list(DocbookPackage.eINSTANCE.getBiblioentryType_Productnumber());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbbrevType> getAbbrev() {
		return getGroup().list(DocbookPackage.eINSTANCE.getBiblioentryType_Abbrev());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AcronymType> getAcronym() {
		return getGroup().list(DocbookPackage.eINSTANCE.getBiblioentryType_Acronym());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EmphasisType> getEmphasis() {
		return getGroup().list(DocbookPackage.eINSTANCE.getBiblioentryType_Emphasis());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FootnoteType> getFootnote() {
		return getGroup().list(DocbookPackage.eINSTANCE.getBiblioentryType_Footnote());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FootnoterefType> getFootnoteref() {
		return getGroup().list(DocbookPackage.eINSTANCE.getBiblioentryType_Footnoteref());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ForeignphraseType> getForeignphrase() {
		return getGroup().list(DocbookPackage.eINSTANCE.getBiblioentryType_Foreignphrase());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PhraseType> getPhrase() {
		return getGroup().list(DocbookPackage.eINSTANCE.getBiblioentryType_Phrase());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<QuoteType> getQuote() {
		return getGroup().list(DocbookPackage.eINSTANCE.getBiblioentryType_Quote());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SubscriptType> getSubscript() {
		return getGroup().list(DocbookPackage.eINSTANCE.getBiblioentryType_Subscript());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SuperscriptType> getSuperscript() {
		return getGroup().list(DocbookPackage.eINSTANCE.getBiblioentryType_Superscript());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<WordaswordType> getWordasword() {
		return getGroup().list(DocbookPackage.eINSTANCE.getBiblioentryType_Wordasword());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FirsttermType> getFirstterm() {
		return getGroup().list(DocbookPackage.eINSTANCE.getBiblioentryType_Firstterm());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<GlosstermType> getGlossterm() {
		return getGroup().list(DocbookPackage.eINSTANCE.getBiblioentryType_Glossterm());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CorefType> getCoref() {
		return getGroup().list(DocbookPackage.eINSTANCE.getBiblioentryType_Coref());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CiterefentryType> getCiterefentry() {
		return getGroup().list(DocbookPackage.eINSTANCE.getBiblioentryType_Citerefentry());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CitetitleType> getCitetitle() {
		return getGroup().list(DocbookPackage.eINSTANCE.getBiblioentryType_Citetitle());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CitebiblioidType> getCitebiblioid() {
		return getGroup().list(DocbookPackage.eINSTANCE.getBiblioentryType_Citebiblioid());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PersonType> getPerson() {
		return getGroup().list(DocbookPackage.eINSTANCE.getBiblioentryType_Person());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PersonblurbType> getPersonblurb() {
		return getGroup().list(DocbookPackage.eINSTANCE.getBiblioentryType_Personblurb());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PersonnameType> getPersonname() {
		return getGroup().list(DocbookPackage.eINSTANCE.getBiblioentryType_Personname());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SubtitleType> getSubtitle() {
		return getGroup().list(DocbookPackage.eINSTANCE.getBiblioentryType_Subtitle());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TitleType> getTitle() {
		return getGroup().list(DocbookPackage.eINSTANCE.getBiblioentryType_Title());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TitleabbrevType> getTitleabbrev() {
		return getGroup().list(DocbookPackage.eINSTANCE.getBiblioentryType_Titleabbrev());
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.BIBLIOENTRY_TYPE__ACTUATE, oldActuate, actuate, !oldActuateESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, DocbookPackage.BIBLIOENTRY_TYPE__ACTUATE, oldActuate, ACTUATE_EDEFAULT, oldActuateESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.BIBLIOENTRY_TYPE__ANNOTATIONS, oldAnnotations, annotations));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.BIBLIOENTRY_TYPE__ARCH, oldArch, arch));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.BIBLIOENTRY_TYPE__ARCROLE, oldArcrole, arcrole));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.BIBLIOENTRY_TYPE__AUDIENCE, oldAudience, audience));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.BIBLIOENTRY_TYPE__BASE, oldBase, base));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.BIBLIOENTRY_TYPE__CONDITION, oldCondition, condition));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.BIBLIOENTRY_TYPE__CONFORMANCE, oldConformance, conformance));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.BIBLIOENTRY_TYPE__DIR, oldDir, dir, !oldDirESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, DocbookPackage.BIBLIOENTRY_TYPE__DIR, oldDir, DIR_EDEFAULT, oldDirESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.BIBLIOENTRY_TYPE__HREF, oldHref, href));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.BIBLIOENTRY_TYPE__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.BIBLIOENTRY_TYPE__LANG, oldLang, lang));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.BIBLIOENTRY_TYPE__LINKEND, oldLinkend, linkend));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.BIBLIOENTRY_TYPE__OS, oldOs, os));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.BIBLIOENTRY_TYPE__REMAP, oldRemap, remap));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.BIBLIOENTRY_TYPE__REVISION, oldRevision, revision));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.BIBLIOENTRY_TYPE__REVISIONFLAG, oldRevisionflag, revisionflag, !oldRevisionflagESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, DocbookPackage.BIBLIOENTRY_TYPE__REVISIONFLAG, oldRevisionflag, REVISIONFLAG_EDEFAULT, oldRevisionflagESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.BIBLIOENTRY_TYPE__ROLE, oldRole, role));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.BIBLIOENTRY_TYPE__ROLE1, oldRole1, role1));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.BIBLIOENTRY_TYPE__SECURITY, oldSecurity, security));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.BIBLIOENTRY_TYPE__SHOW, oldShow, show, !oldShowESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, DocbookPackage.BIBLIOENTRY_TYPE__SHOW, oldShow, SHOW_EDEFAULT, oldShowESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.BIBLIOENTRY_TYPE__TITLE1, oldTitle1, title1));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.BIBLIOENTRY_TYPE__TYPE, oldType, type));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.BIBLIOENTRY_TYPE__USERLEVEL, oldUserlevel, userlevel));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.BIBLIOENTRY_TYPE__VENDOR, oldVendor, vendor));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.BIBLIOENTRY_TYPE__VERSION, oldVersion, version));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.BIBLIOENTRY_TYPE__WORDSIZE, oldWordsize, wordsize));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.BIBLIOENTRY_TYPE__XREFLABEL, oldXreflabel, xreflabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DocbookPackage.BIBLIOENTRY_TYPE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case DocbookPackage.BIBLIOENTRY_TYPE__ABSTRACT:
				return ((InternalEList<?>)getAbstract()).basicRemove(otherEnd, msgs);
			case DocbookPackage.BIBLIOENTRY_TYPE__ADDRESS:
				return ((InternalEList<?>)getAddress()).basicRemove(otherEnd, msgs);
			case DocbookPackage.BIBLIOENTRY_TYPE__ARTPAGENUMS:
				return ((InternalEList<?>)getArtpagenums()).basicRemove(otherEnd, msgs);
			case DocbookPackage.BIBLIOENTRY_TYPE__AUTHOR:
				return ((InternalEList<?>)getAuthor()).basicRemove(otherEnd, msgs);
			case DocbookPackage.BIBLIOENTRY_TYPE__AUTHORGROUP:
				return ((InternalEList<?>)getAuthorgroup()).basicRemove(otherEnd, msgs);
			case DocbookPackage.BIBLIOENTRY_TYPE__AUTHORINITIALS:
				return ((InternalEList<?>)getAuthorinitials()).basicRemove(otherEnd, msgs);
			case DocbookPackage.BIBLIOENTRY_TYPE__BIBLIOCOVERAGE:
				return ((InternalEList<?>)getBibliocoverage()).basicRemove(otherEnd, msgs);
			case DocbookPackage.BIBLIOENTRY_TYPE__BIBLIOID:
				return ((InternalEList<?>)getBiblioid()).basicRemove(otherEnd, msgs);
			case DocbookPackage.BIBLIOENTRY_TYPE__BIBLIOSOURCE:
				return ((InternalEList<?>)getBibliosource()).basicRemove(otherEnd, msgs);
			case DocbookPackage.BIBLIOENTRY_TYPE__COLLAB:
				return ((InternalEList<?>)getCollab()).basicRemove(otherEnd, msgs);
			case DocbookPackage.BIBLIOENTRY_TYPE__CONFGROUP:
				return ((InternalEList<?>)getConfgroup()).basicRemove(otherEnd, msgs);
			case DocbookPackage.BIBLIOENTRY_TYPE__CONTRACTSPONSOR:
				return ((InternalEList<?>)getContractsponsor()).basicRemove(otherEnd, msgs);
			case DocbookPackage.BIBLIOENTRY_TYPE__CONTRACTNUM:
				return ((InternalEList<?>)getContractnum()).basicRemove(otherEnd, msgs);
			case DocbookPackage.BIBLIOENTRY_TYPE__COPYRIGHT:
				return ((InternalEList<?>)getCopyright()).basicRemove(otherEnd, msgs);
			case DocbookPackage.BIBLIOENTRY_TYPE__COVER:
				return ((InternalEList<?>)getCover()).basicRemove(otherEnd, msgs);
			case DocbookPackage.BIBLIOENTRY_TYPE__DATE:
				return ((InternalEList<?>)getDate()).basicRemove(otherEnd, msgs);
			case DocbookPackage.BIBLIOENTRY_TYPE__EDITION:
				return ((InternalEList<?>)getEdition()).basicRemove(otherEnd, msgs);
			case DocbookPackage.BIBLIOENTRY_TYPE__EDITOR:
				return ((InternalEList<?>)getEditor()).basicRemove(otherEnd, msgs);
			case DocbookPackage.BIBLIOENTRY_TYPE__ISSUENUM:
				return ((InternalEList<?>)getIssuenum()).basicRemove(otherEnd, msgs);
			case DocbookPackage.BIBLIOENTRY_TYPE__KEYWORDSET:
				return ((InternalEList<?>)getKeywordset()).basicRemove(otherEnd, msgs);
			case DocbookPackage.BIBLIOENTRY_TYPE__LEGALNOTICE:
				return ((InternalEList<?>)getLegalnotice()).basicRemove(otherEnd, msgs);
			case DocbookPackage.BIBLIOENTRY_TYPE__MEDIAOBJECT:
				return ((InternalEList<?>)getMediaobject()).basicRemove(otherEnd, msgs);
			case DocbookPackage.BIBLIOENTRY_TYPE__ORG:
				return ((InternalEList<?>)getOrg()).basicRemove(otherEnd, msgs);
			case DocbookPackage.BIBLIOENTRY_TYPE__ORGNAME:
				return ((InternalEList<?>)getOrgname()).basicRemove(otherEnd, msgs);
			case DocbookPackage.BIBLIOENTRY_TYPE__OTHERCREDIT:
				return ((InternalEList<?>)getOthercredit()).basicRemove(otherEnd, msgs);
			case DocbookPackage.BIBLIOENTRY_TYPE__PAGENUMS:
				return ((InternalEList<?>)getPagenums()).basicRemove(otherEnd, msgs);
			case DocbookPackage.BIBLIOENTRY_TYPE__PRINTHISTORY:
				return ((InternalEList<?>)getPrinthistory()).basicRemove(otherEnd, msgs);
			case DocbookPackage.BIBLIOENTRY_TYPE__PUBDATE:
				return ((InternalEList<?>)getPubdate()).basicRemove(otherEnd, msgs);
			case DocbookPackage.BIBLIOENTRY_TYPE__PUBLISHER:
				return ((InternalEList<?>)getPublisher()).basicRemove(otherEnd, msgs);
			case DocbookPackage.BIBLIOENTRY_TYPE__PUBLISHERNAME:
				return ((InternalEList<?>)getPublishername()).basicRemove(otherEnd, msgs);
			case DocbookPackage.BIBLIOENTRY_TYPE__RELEASEINFO:
				return ((InternalEList<?>)getReleaseinfo()).basicRemove(otherEnd, msgs);
			case DocbookPackage.BIBLIOENTRY_TYPE__REVHISTORY:
				return ((InternalEList<?>)getRevhistory()).basicRemove(otherEnd, msgs);
			case DocbookPackage.BIBLIOENTRY_TYPE__SERIESVOLNUMS:
				return ((InternalEList<?>)getSeriesvolnums()).basicRemove(otherEnd, msgs);
			case DocbookPackage.BIBLIOENTRY_TYPE__SUBJECTSET:
				return ((InternalEList<?>)getSubjectset()).basicRemove(otherEnd, msgs);
			case DocbookPackage.BIBLIOENTRY_TYPE__VOLUMENUM:
				return ((InternalEList<?>)getVolumenum()).basicRemove(otherEnd, msgs);
			case DocbookPackage.BIBLIOENTRY_TYPE__ANNOTATION:
				return ((InternalEList<?>)getAnnotation()).basicRemove(otherEnd, msgs);
			case DocbookPackage.BIBLIOENTRY_TYPE__EXTENDEDLINK:
				return ((InternalEList<?>)getExtendedlink()).basicRemove(otherEnd, msgs);
			case DocbookPackage.BIBLIOENTRY_TYPE__BIBLIOMISC:
				return ((InternalEList<?>)getBibliomisc()).basicRemove(otherEnd, msgs);
			case DocbookPackage.BIBLIOENTRY_TYPE__BIBLIOMSET:
				return ((InternalEList<?>)getBibliomset()).basicRemove(otherEnd, msgs);
			case DocbookPackage.BIBLIOENTRY_TYPE__BIBLIORELATION:
				return ((InternalEList<?>)getBibliorelation()).basicRemove(otherEnd, msgs);
			case DocbookPackage.BIBLIOENTRY_TYPE__BIBLIOSET:
				return ((InternalEList<?>)getBiblioset()).basicRemove(otherEnd, msgs);
			case DocbookPackage.BIBLIOENTRY_TYPE__ITERMSET:
				return ((InternalEList<?>)getItermset()).basicRemove(otherEnd, msgs);
			case DocbookPackage.BIBLIOENTRY_TYPE__PRODUCTNAME:
				return ((InternalEList<?>)getProductname()).basicRemove(otherEnd, msgs);
			case DocbookPackage.BIBLIOENTRY_TYPE__PRODUCTNUMBER:
				return ((InternalEList<?>)getProductnumber()).basicRemove(otherEnd, msgs);
			case DocbookPackage.BIBLIOENTRY_TYPE__ABBREV:
				return ((InternalEList<?>)getAbbrev()).basicRemove(otherEnd, msgs);
			case DocbookPackage.BIBLIOENTRY_TYPE__ACRONYM:
				return ((InternalEList<?>)getAcronym()).basicRemove(otherEnd, msgs);
			case DocbookPackage.BIBLIOENTRY_TYPE__EMPHASIS:
				return ((InternalEList<?>)getEmphasis()).basicRemove(otherEnd, msgs);
			case DocbookPackage.BIBLIOENTRY_TYPE__FOOTNOTE:
				return ((InternalEList<?>)getFootnote()).basicRemove(otherEnd, msgs);
			case DocbookPackage.BIBLIOENTRY_TYPE__FOOTNOTEREF:
				return ((InternalEList<?>)getFootnoteref()).basicRemove(otherEnd, msgs);
			case DocbookPackage.BIBLIOENTRY_TYPE__FOREIGNPHRASE:
				return ((InternalEList<?>)getForeignphrase()).basicRemove(otherEnd, msgs);
			case DocbookPackage.BIBLIOENTRY_TYPE__PHRASE:
				return ((InternalEList<?>)getPhrase()).basicRemove(otherEnd, msgs);
			case DocbookPackage.BIBLIOENTRY_TYPE__QUOTE:
				return ((InternalEList<?>)getQuote()).basicRemove(otherEnd, msgs);
			case DocbookPackage.BIBLIOENTRY_TYPE__SUBSCRIPT:
				return ((InternalEList<?>)getSubscript()).basicRemove(otherEnd, msgs);
			case DocbookPackage.BIBLIOENTRY_TYPE__SUPERSCRIPT:
				return ((InternalEList<?>)getSuperscript()).basicRemove(otherEnd, msgs);
			case DocbookPackage.BIBLIOENTRY_TYPE__WORDASWORD:
				return ((InternalEList<?>)getWordasword()).basicRemove(otherEnd, msgs);
			case DocbookPackage.BIBLIOENTRY_TYPE__FIRSTTERM:
				return ((InternalEList<?>)getFirstterm()).basicRemove(otherEnd, msgs);
			case DocbookPackage.BIBLIOENTRY_TYPE__GLOSSTERM:
				return ((InternalEList<?>)getGlossterm()).basicRemove(otherEnd, msgs);
			case DocbookPackage.BIBLIOENTRY_TYPE__COREF:
				return ((InternalEList<?>)getCoref()).basicRemove(otherEnd, msgs);
			case DocbookPackage.BIBLIOENTRY_TYPE__CITEREFENTRY:
				return ((InternalEList<?>)getCiterefentry()).basicRemove(otherEnd, msgs);
			case DocbookPackage.BIBLIOENTRY_TYPE__CITETITLE:
				return ((InternalEList<?>)getCitetitle()).basicRemove(otherEnd, msgs);
			case DocbookPackage.BIBLIOENTRY_TYPE__CITEBIBLIOID:
				return ((InternalEList<?>)getCitebiblioid()).basicRemove(otherEnd, msgs);
			case DocbookPackage.BIBLIOENTRY_TYPE__PERSON:
				return ((InternalEList<?>)getPerson()).basicRemove(otherEnd, msgs);
			case DocbookPackage.BIBLIOENTRY_TYPE__PERSONBLURB:
				return ((InternalEList<?>)getPersonblurb()).basicRemove(otherEnd, msgs);
			case DocbookPackage.BIBLIOENTRY_TYPE__PERSONNAME:
				return ((InternalEList<?>)getPersonname()).basicRemove(otherEnd, msgs);
			case DocbookPackage.BIBLIOENTRY_TYPE__SUBTITLE:
				return ((InternalEList<?>)getSubtitle()).basicRemove(otherEnd, msgs);
			case DocbookPackage.BIBLIOENTRY_TYPE__TITLE:
				return ((InternalEList<?>)getTitle()).basicRemove(otherEnd, msgs);
			case DocbookPackage.BIBLIOENTRY_TYPE__TITLEABBREV:
				return ((InternalEList<?>)getTitleabbrev()).basicRemove(otherEnd, msgs);
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
			case DocbookPackage.BIBLIOENTRY_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case DocbookPackage.BIBLIOENTRY_TYPE__ABSTRACT:
				return getAbstract();
			case DocbookPackage.BIBLIOENTRY_TYPE__ADDRESS:
				return getAddress();
			case DocbookPackage.BIBLIOENTRY_TYPE__ARTPAGENUMS:
				return getArtpagenums();
			case DocbookPackage.BIBLIOENTRY_TYPE__AUTHOR:
				return getAuthor();
			case DocbookPackage.BIBLIOENTRY_TYPE__AUTHORGROUP:
				return getAuthorgroup();
			case DocbookPackage.BIBLIOENTRY_TYPE__AUTHORINITIALS:
				return getAuthorinitials();
			case DocbookPackage.BIBLIOENTRY_TYPE__BIBLIOCOVERAGE:
				return getBibliocoverage();
			case DocbookPackage.BIBLIOENTRY_TYPE__BIBLIOID:
				return getBiblioid();
			case DocbookPackage.BIBLIOENTRY_TYPE__BIBLIOSOURCE:
				return getBibliosource();
			case DocbookPackage.BIBLIOENTRY_TYPE__COLLAB:
				return getCollab();
			case DocbookPackage.BIBLIOENTRY_TYPE__CONFGROUP:
				return getConfgroup();
			case DocbookPackage.BIBLIOENTRY_TYPE__CONTRACTSPONSOR:
				return getContractsponsor();
			case DocbookPackage.BIBLIOENTRY_TYPE__CONTRACTNUM:
				return getContractnum();
			case DocbookPackage.BIBLIOENTRY_TYPE__COPYRIGHT:
				return getCopyright();
			case DocbookPackage.BIBLIOENTRY_TYPE__COVER:
				return getCover();
			case DocbookPackage.BIBLIOENTRY_TYPE__DATE:
				return getDate();
			case DocbookPackage.BIBLIOENTRY_TYPE__EDITION:
				return getEdition();
			case DocbookPackage.BIBLIOENTRY_TYPE__EDITOR:
				return getEditor();
			case DocbookPackage.BIBLIOENTRY_TYPE__ISSUENUM:
				return getIssuenum();
			case DocbookPackage.BIBLIOENTRY_TYPE__KEYWORDSET:
				return getKeywordset();
			case DocbookPackage.BIBLIOENTRY_TYPE__LEGALNOTICE:
				return getLegalnotice();
			case DocbookPackage.BIBLIOENTRY_TYPE__MEDIAOBJECT:
				return getMediaobject();
			case DocbookPackage.BIBLIOENTRY_TYPE__ORG:
				return getOrg();
			case DocbookPackage.BIBLIOENTRY_TYPE__ORGNAME:
				return getOrgname();
			case DocbookPackage.BIBLIOENTRY_TYPE__OTHERCREDIT:
				return getOthercredit();
			case DocbookPackage.BIBLIOENTRY_TYPE__PAGENUMS:
				return getPagenums();
			case DocbookPackage.BIBLIOENTRY_TYPE__PRINTHISTORY:
				return getPrinthistory();
			case DocbookPackage.BIBLIOENTRY_TYPE__PUBDATE:
				return getPubdate();
			case DocbookPackage.BIBLIOENTRY_TYPE__PUBLISHER:
				return getPublisher();
			case DocbookPackage.BIBLIOENTRY_TYPE__PUBLISHERNAME:
				return getPublishername();
			case DocbookPackage.BIBLIOENTRY_TYPE__RELEASEINFO:
				return getReleaseinfo();
			case DocbookPackage.BIBLIOENTRY_TYPE__REVHISTORY:
				return getRevhistory();
			case DocbookPackage.BIBLIOENTRY_TYPE__SERIESVOLNUMS:
				return getSeriesvolnums();
			case DocbookPackage.BIBLIOENTRY_TYPE__SUBJECTSET:
				return getSubjectset();
			case DocbookPackage.BIBLIOENTRY_TYPE__VOLUMENUM:
				return getVolumenum();
			case DocbookPackage.BIBLIOENTRY_TYPE__ANNOTATION:
				return getAnnotation();
			case DocbookPackage.BIBLIOENTRY_TYPE__EXTENDEDLINK:
				return getExtendedlink();
			case DocbookPackage.BIBLIOENTRY_TYPE__BIBLIOMISC:
				return getBibliomisc();
			case DocbookPackage.BIBLIOENTRY_TYPE__BIBLIOMSET:
				return getBibliomset();
			case DocbookPackage.BIBLIOENTRY_TYPE__BIBLIORELATION:
				return getBibliorelation();
			case DocbookPackage.BIBLIOENTRY_TYPE__BIBLIOSET:
				return getBiblioset();
			case DocbookPackage.BIBLIOENTRY_TYPE__ITERMSET:
				return getItermset();
			case DocbookPackage.BIBLIOENTRY_TYPE__PRODUCTNAME:
				return getProductname();
			case DocbookPackage.BIBLIOENTRY_TYPE__PRODUCTNUMBER:
				return getProductnumber();
			case DocbookPackage.BIBLIOENTRY_TYPE__ABBREV:
				return getAbbrev();
			case DocbookPackage.BIBLIOENTRY_TYPE__ACRONYM:
				return getAcronym();
			case DocbookPackage.BIBLIOENTRY_TYPE__EMPHASIS:
				return getEmphasis();
			case DocbookPackage.BIBLIOENTRY_TYPE__FOOTNOTE:
				return getFootnote();
			case DocbookPackage.BIBLIOENTRY_TYPE__FOOTNOTEREF:
				return getFootnoteref();
			case DocbookPackage.BIBLIOENTRY_TYPE__FOREIGNPHRASE:
				return getForeignphrase();
			case DocbookPackage.BIBLIOENTRY_TYPE__PHRASE:
				return getPhrase();
			case DocbookPackage.BIBLIOENTRY_TYPE__QUOTE:
				return getQuote();
			case DocbookPackage.BIBLIOENTRY_TYPE__SUBSCRIPT:
				return getSubscript();
			case DocbookPackage.BIBLIOENTRY_TYPE__SUPERSCRIPT:
				return getSuperscript();
			case DocbookPackage.BIBLIOENTRY_TYPE__WORDASWORD:
				return getWordasword();
			case DocbookPackage.BIBLIOENTRY_TYPE__FIRSTTERM:
				return getFirstterm();
			case DocbookPackage.BIBLIOENTRY_TYPE__GLOSSTERM:
				return getGlossterm();
			case DocbookPackage.BIBLIOENTRY_TYPE__COREF:
				return getCoref();
			case DocbookPackage.BIBLIOENTRY_TYPE__CITEREFENTRY:
				return getCiterefentry();
			case DocbookPackage.BIBLIOENTRY_TYPE__CITETITLE:
				return getCitetitle();
			case DocbookPackage.BIBLIOENTRY_TYPE__CITEBIBLIOID:
				return getCitebiblioid();
			case DocbookPackage.BIBLIOENTRY_TYPE__PERSON:
				return getPerson();
			case DocbookPackage.BIBLIOENTRY_TYPE__PERSONBLURB:
				return getPersonblurb();
			case DocbookPackage.BIBLIOENTRY_TYPE__PERSONNAME:
				return getPersonname();
			case DocbookPackage.BIBLIOENTRY_TYPE__SUBTITLE:
				return getSubtitle();
			case DocbookPackage.BIBLIOENTRY_TYPE__TITLE:
				return getTitle();
			case DocbookPackage.BIBLIOENTRY_TYPE__TITLEABBREV:
				return getTitleabbrev();
			case DocbookPackage.BIBLIOENTRY_TYPE__ACTUATE:
				return getActuate();
			case DocbookPackage.BIBLIOENTRY_TYPE__ANNOTATIONS:
				return getAnnotations();
			case DocbookPackage.BIBLIOENTRY_TYPE__ARCH:
				return getArch();
			case DocbookPackage.BIBLIOENTRY_TYPE__ARCROLE:
				return getArcrole();
			case DocbookPackage.BIBLIOENTRY_TYPE__AUDIENCE:
				return getAudience();
			case DocbookPackage.BIBLIOENTRY_TYPE__BASE:
				return getBase();
			case DocbookPackage.BIBLIOENTRY_TYPE__CONDITION:
				return getCondition();
			case DocbookPackage.BIBLIOENTRY_TYPE__CONFORMANCE:
				return getConformance();
			case DocbookPackage.BIBLIOENTRY_TYPE__DIR:
				return getDir();
			case DocbookPackage.BIBLIOENTRY_TYPE__HREF:
				return getHref();
			case DocbookPackage.BIBLIOENTRY_TYPE__ID:
				return getId();
			case DocbookPackage.BIBLIOENTRY_TYPE__LANG:
				return getLang();
			case DocbookPackage.BIBLIOENTRY_TYPE__LINKEND:
				return getLinkend();
			case DocbookPackage.BIBLIOENTRY_TYPE__OS:
				return getOs();
			case DocbookPackage.BIBLIOENTRY_TYPE__REMAP:
				return getRemap();
			case DocbookPackage.BIBLIOENTRY_TYPE__REVISION:
				return getRevision();
			case DocbookPackage.BIBLIOENTRY_TYPE__REVISIONFLAG:
				return getRevisionflag();
			case DocbookPackage.BIBLIOENTRY_TYPE__ROLE:
				return getRole();
			case DocbookPackage.BIBLIOENTRY_TYPE__ROLE1:
				return getRole1();
			case DocbookPackage.BIBLIOENTRY_TYPE__SECURITY:
				return getSecurity();
			case DocbookPackage.BIBLIOENTRY_TYPE__SHOW:
				return getShow();
			case DocbookPackage.BIBLIOENTRY_TYPE__TITLE1:
				return getTitle1();
			case DocbookPackage.BIBLIOENTRY_TYPE__TYPE:
				return getType();
			case DocbookPackage.BIBLIOENTRY_TYPE__USERLEVEL:
				return getUserlevel();
			case DocbookPackage.BIBLIOENTRY_TYPE__VENDOR:
				return getVendor();
			case DocbookPackage.BIBLIOENTRY_TYPE__VERSION:
				return getVersion();
			case DocbookPackage.BIBLIOENTRY_TYPE__WORDSIZE:
				return getWordsize();
			case DocbookPackage.BIBLIOENTRY_TYPE__XREFLABEL:
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
			case DocbookPackage.BIBLIOENTRY_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case DocbookPackage.BIBLIOENTRY_TYPE__ABSTRACT:
				getAbstract().clear();
				getAbstract().addAll((Collection<? extends AbstractType>)newValue);
				return;
			case DocbookPackage.BIBLIOENTRY_TYPE__ADDRESS:
				getAddress().clear();
				getAddress().addAll((Collection<? extends AddressType>)newValue);
				return;
			case DocbookPackage.BIBLIOENTRY_TYPE__ARTPAGENUMS:
				getArtpagenums().clear();
				getArtpagenums().addAll((Collection<? extends ArtpagenumsType>)newValue);
				return;
			case DocbookPackage.BIBLIOENTRY_TYPE__AUTHOR:
				getAuthor().clear();
				getAuthor().addAll((Collection<? extends AuthorType>)newValue);
				return;
			case DocbookPackage.BIBLIOENTRY_TYPE__AUTHORGROUP:
				getAuthorgroup().clear();
				getAuthorgroup().addAll((Collection<? extends AuthorgroupType>)newValue);
				return;
			case DocbookPackage.BIBLIOENTRY_TYPE__AUTHORINITIALS:
				getAuthorinitials().clear();
				getAuthorinitials().addAll((Collection<? extends AuthorinitialsType>)newValue);
				return;
			case DocbookPackage.BIBLIOENTRY_TYPE__BIBLIOCOVERAGE:
				getBibliocoverage().clear();
				getBibliocoverage().addAll((Collection<? extends BibliocoverageType>)newValue);
				return;
			case DocbookPackage.BIBLIOENTRY_TYPE__BIBLIOID:
				getBiblioid().clear();
				getBiblioid().addAll((Collection<? extends BiblioidType>)newValue);
				return;
			case DocbookPackage.BIBLIOENTRY_TYPE__BIBLIOSOURCE:
				getBibliosource().clear();
				getBibliosource().addAll((Collection<? extends BibliosourceType>)newValue);
				return;
			case DocbookPackage.BIBLIOENTRY_TYPE__COLLAB:
				getCollab().clear();
				getCollab().addAll((Collection<? extends CollabType>)newValue);
				return;
			case DocbookPackage.BIBLIOENTRY_TYPE__CONFGROUP:
				getConfgroup().clear();
				getConfgroup().addAll((Collection<? extends ConfgroupType>)newValue);
				return;
			case DocbookPackage.BIBLIOENTRY_TYPE__CONTRACTSPONSOR:
				getContractsponsor().clear();
				getContractsponsor().addAll((Collection<? extends ContractsponsorType>)newValue);
				return;
			case DocbookPackage.BIBLIOENTRY_TYPE__CONTRACTNUM:
				getContractnum().clear();
				getContractnum().addAll((Collection<? extends ContractnumType>)newValue);
				return;
			case DocbookPackage.BIBLIOENTRY_TYPE__COPYRIGHT:
				getCopyright().clear();
				getCopyright().addAll((Collection<? extends CopyrightType>)newValue);
				return;
			case DocbookPackage.BIBLIOENTRY_TYPE__COVER:
				getCover().clear();
				getCover().addAll((Collection<? extends CoverType>)newValue);
				return;
			case DocbookPackage.BIBLIOENTRY_TYPE__DATE:
				getDate().clear();
				getDate().addAll((Collection<? extends DateType>)newValue);
				return;
			case DocbookPackage.BIBLIOENTRY_TYPE__EDITION:
				getEdition().clear();
				getEdition().addAll((Collection<? extends EditionType>)newValue);
				return;
			case DocbookPackage.BIBLIOENTRY_TYPE__EDITOR:
				getEditor().clear();
				getEditor().addAll((Collection<? extends EditorType>)newValue);
				return;
			case DocbookPackage.BIBLIOENTRY_TYPE__ISSUENUM:
				getIssuenum().clear();
				getIssuenum().addAll((Collection<? extends IssuenumType>)newValue);
				return;
			case DocbookPackage.BIBLIOENTRY_TYPE__KEYWORDSET:
				getKeywordset().clear();
				getKeywordset().addAll((Collection<? extends KeywordsetType>)newValue);
				return;
			case DocbookPackage.BIBLIOENTRY_TYPE__LEGALNOTICE:
				getLegalnotice().clear();
				getLegalnotice().addAll((Collection<? extends LegalnoticeType>)newValue);
				return;
			case DocbookPackage.BIBLIOENTRY_TYPE__MEDIAOBJECT:
				getMediaobject().clear();
				getMediaobject().addAll((Collection<? extends MediaobjectType>)newValue);
				return;
			case DocbookPackage.BIBLIOENTRY_TYPE__ORG:
				getOrg().clear();
				getOrg().addAll((Collection<? extends OrgType>)newValue);
				return;
			case DocbookPackage.BIBLIOENTRY_TYPE__ORGNAME:
				getOrgname().clear();
				getOrgname().addAll((Collection<? extends OrgnameType>)newValue);
				return;
			case DocbookPackage.BIBLIOENTRY_TYPE__OTHERCREDIT:
				getOthercredit().clear();
				getOthercredit().addAll((Collection<? extends OthercreditType>)newValue);
				return;
			case DocbookPackage.BIBLIOENTRY_TYPE__PAGENUMS:
				getPagenums().clear();
				getPagenums().addAll((Collection<? extends PagenumsType>)newValue);
				return;
			case DocbookPackage.BIBLIOENTRY_TYPE__PRINTHISTORY:
				getPrinthistory().clear();
				getPrinthistory().addAll((Collection<? extends PrinthistoryType>)newValue);
				return;
			case DocbookPackage.BIBLIOENTRY_TYPE__PUBDATE:
				getPubdate().clear();
				getPubdate().addAll((Collection<? extends PubdateType>)newValue);
				return;
			case DocbookPackage.BIBLIOENTRY_TYPE__PUBLISHER:
				getPublisher().clear();
				getPublisher().addAll((Collection<? extends PublisherType>)newValue);
				return;
			case DocbookPackage.BIBLIOENTRY_TYPE__PUBLISHERNAME:
				getPublishername().clear();
				getPublishername().addAll((Collection<? extends PublishernameType>)newValue);
				return;
			case DocbookPackage.BIBLIOENTRY_TYPE__RELEASEINFO:
				getReleaseinfo().clear();
				getReleaseinfo().addAll((Collection<? extends ReleaseinfoType>)newValue);
				return;
			case DocbookPackage.BIBLIOENTRY_TYPE__REVHISTORY:
				getRevhistory().clear();
				getRevhistory().addAll((Collection<? extends RevhistoryType>)newValue);
				return;
			case DocbookPackage.BIBLIOENTRY_TYPE__SERIESVOLNUMS:
				getSeriesvolnums().clear();
				getSeriesvolnums().addAll((Collection<? extends SeriesvolnumsType>)newValue);
				return;
			case DocbookPackage.BIBLIOENTRY_TYPE__SUBJECTSET:
				getSubjectset().clear();
				getSubjectset().addAll((Collection<? extends SubjectsetType>)newValue);
				return;
			case DocbookPackage.BIBLIOENTRY_TYPE__VOLUMENUM:
				getVolumenum().clear();
				getVolumenum().addAll((Collection<? extends VolumenumType>)newValue);
				return;
			case DocbookPackage.BIBLIOENTRY_TYPE__ANNOTATION:
				getAnnotation().clear();
				getAnnotation().addAll((Collection<? extends AnnotationType>)newValue);
				return;
			case DocbookPackage.BIBLIOENTRY_TYPE__EXTENDEDLINK:
				getExtendedlink().clear();
				getExtendedlink().addAll((Collection<? extends ExtendedlinkType>)newValue);
				return;
			case DocbookPackage.BIBLIOENTRY_TYPE__BIBLIOMISC:
				getBibliomisc().clear();
				getBibliomisc().addAll((Collection<? extends BibliomiscType>)newValue);
				return;
			case DocbookPackage.BIBLIOENTRY_TYPE__BIBLIOMSET:
				getBibliomset().clear();
				getBibliomset().addAll((Collection<? extends BibliomsetType>)newValue);
				return;
			case DocbookPackage.BIBLIOENTRY_TYPE__BIBLIORELATION:
				getBibliorelation().clear();
				getBibliorelation().addAll((Collection<? extends BibliorelationType>)newValue);
				return;
			case DocbookPackage.BIBLIOENTRY_TYPE__BIBLIOSET:
				getBiblioset().clear();
				getBiblioset().addAll((Collection<? extends BibliosetType>)newValue);
				return;
			case DocbookPackage.BIBLIOENTRY_TYPE__ITERMSET:
				getItermset().clear();
				getItermset().addAll((Collection<? extends ItermsetType>)newValue);
				return;
			case DocbookPackage.BIBLIOENTRY_TYPE__PRODUCTNAME:
				getProductname().clear();
				getProductname().addAll((Collection<? extends ProductnameType>)newValue);
				return;
			case DocbookPackage.BIBLIOENTRY_TYPE__PRODUCTNUMBER:
				getProductnumber().clear();
				getProductnumber().addAll((Collection<? extends ProductnumberType>)newValue);
				return;
			case DocbookPackage.BIBLIOENTRY_TYPE__ABBREV:
				getAbbrev().clear();
				getAbbrev().addAll((Collection<? extends AbbrevType>)newValue);
				return;
			case DocbookPackage.BIBLIOENTRY_TYPE__ACRONYM:
				getAcronym().clear();
				getAcronym().addAll((Collection<? extends AcronymType>)newValue);
				return;
			case DocbookPackage.BIBLIOENTRY_TYPE__EMPHASIS:
				getEmphasis().clear();
				getEmphasis().addAll((Collection<? extends EmphasisType>)newValue);
				return;
			case DocbookPackage.BIBLIOENTRY_TYPE__FOOTNOTE:
				getFootnote().clear();
				getFootnote().addAll((Collection<? extends FootnoteType>)newValue);
				return;
			case DocbookPackage.BIBLIOENTRY_TYPE__FOOTNOTEREF:
				getFootnoteref().clear();
				getFootnoteref().addAll((Collection<? extends FootnoterefType>)newValue);
				return;
			case DocbookPackage.BIBLIOENTRY_TYPE__FOREIGNPHRASE:
				getForeignphrase().clear();
				getForeignphrase().addAll((Collection<? extends ForeignphraseType>)newValue);
				return;
			case DocbookPackage.BIBLIOENTRY_TYPE__PHRASE:
				getPhrase().clear();
				getPhrase().addAll((Collection<? extends PhraseType>)newValue);
				return;
			case DocbookPackage.BIBLIOENTRY_TYPE__QUOTE:
				getQuote().clear();
				getQuote().addAll((Collection<? extends QuoteType>)newValue);
				return;
			case DocbookPackage.BIBLIOENTRY_TYPE__SUBSCRIPT:
				getSubscript().clear();
				getSubscript().addAll((Collection<? extends SubscriptType>)newValue);
				return;
			case DocbookPackage.BIBLIOENTRY_TYPE__SUPERSCRIPT:
				getSuperscript().clear();
				getSuperscript().addAll((Collection<? extends SuperscriptType>)newValue);
				return;
			case DocbookPackage.BIBLIOENTRY_TYPE__WORDASWORD:
				getWordasword().clear();
				getWordasword().addAll((Collection<? extends WordaswordType>)newValue);
				return;
			case DocbookPackage.BIBLIOENTRY_TYPE__FIRSTTERM:
				getFirstterm().clear();
				getFirstterm().addAll((Collection<? extends FirsttermType>)newValue);
				return;
			case DocbookPackage.BIBLIOENTRY_TYPE__GLOSSTERM:
				getGlossterm().clear();
				getGlossterm().addAll((Collection<? extends GlosstermType>)newValue);
				return;
			case DocbookPackage.BIBLIOENTRY_TYPE__COREF:
				getCoref().clear();
				getCoref().addAll((Collection<? extends CorefType>)newValue);
				return;
			case DocbookPackage.BIBLIOENTRY_TYPE__CITEREFENTRY:
				getCiterefentry().clear();
				getCiterefentry().addAll((Collection<? extends CiterefentryType>)newValue);
				return;
			case DocbookPackage.BIBLIOENTRY_TYPE__CITETITLE:
				getCitetitle().clear();
				getCitetitle().addAll((Collection<? extends CitetitleType>)newValue);
				return;
			case DocbookPackage.BIBLIOENTRY_TYPE__CITEBIBLIOID:
				getCitebiblioid().clear();
				getCitebiblioid().addAll((Collection<? extends CitebiblioidType>)newValue);
				return;
			case DocbookPackage.BIBLIOENTRY_TYPE__PERSON:
				getPerson().clear();
				getPerson().addAll((Collection<? extends PersonType>)newValue);
				return;
			case DocbookPackage.BIBLIOENTRY_TYPE__PERSONBLURB:
				getPersonblurb().clear();
				getPersonblurb().addAll((Collection<? extends PersonblurbType>)newValue);
				return;
			case DocbookPackage.BIBLIOENTRY_TYPE__PERSONNAME:
				getPersonname().clear();
				getPersonname().addAll((Collection<? extends PersonnameType>)newValue);
				return;
			case DocbookPackage.BIBLIOENTRY_TYPE__SUBTITLE:
				getSubtitle().clear();
				getSubtitle().addAll((Collection<? extends SubtitleType>)newValue);
				return;
			case DocbookPackage.BIBLIOENTRY_TYPE__TITLE:
				getTitle().clear();
				getTitle().addAll((Collection<? extends TitleType>)newValue);
				return;
			case DocbookPackage.BIBLIOENTRY_TYPE__TITLEABBREV:
				getTitleabbrev().clear();
				getTitleabbrev().addAll((Collection<? extends TitleabbrevType>)newValue);
				return;
			case DocbookPackage.BIBLIOENTRY_TYPE__ACTUATE:
				setActuate((ActuateType)newValue);
				return;
			case DocbookPackage.BIBLIOENTRY_TYPE__ANNOTATIONS:
				setAnnotations(newValue);
				return;
			case DocbookPackage.BIBLIOENTRY_TYPE__ARCH:
				setArch(newValue);
				return;
			case DocbookPackage.BIBLIOENTRY_TYPE__ARCROLE:
				setArcrole(newValue);
				return;
			case DocbookPackage.BIBLIOENTRY_TYPE__AUDIENCE:
				setAudience(newValue);
				return;
			case DocbookPackage.BIBLIOENTRY_TYPE__BASE:
				setBase(newValue);
				return;
			case DocbookPackage.BIBLIOENTRY_TYPE__CONDITION:
				setCondition(newValue);
				return;
			case DocbookPackage.BIBLIOENTRY_TYPE__CONFORMANCE:
				setConformance(newValue);
				return;
			case DocbookPackage.BIBLIOENTRY_TYPE__DIR:
				setDir((DirType)newValue);
				return;
			case DocbookPackage.BIBLIOENTRY_TYPE__HREF:
				setHref(newValue);
				return;
			case DocbookPackage.BIBLIOENTRY_TYPE__ID:
				setId((String)newValue);
				return;
			case DocbookPackage.BIBLIOENTRY_TYPE__LANG:
				setLang(newValue);
				return;
			case DocbookPackage.BIBLIOENTRY_TYPE__LINKEND:
				setLinkend((String)newValue);
				return;
			case DocbookPackage.BIBLIOENTRY_TYPE__OS:
				setOs(newValue);
				return;
			case DocbookPackage.BIBLIOENTRY_TYPE__REMAP:
				setRemap(newValue);
				return;
			case DocbookPackage.BIBLIOENTRY_TYPE__REVISION:
				setRevision(newValue);
				return;
			case DocbookPackage.BIBLIOENTRY_TYPE__REVISIONFLAG:
				setRevisionflag((RevisionflagType)newValue);
				return;
			case DocbookPackage.BIBLIOENTRY_TYPE__ROLE:
				setRole(newValue);
				return;
			case DocbookPackage.BIBLIOENTRY_TYPE__ROLE1:
				setRole1(newValue);
				return;
			case DocbookPackage.BIBLIOENTRY_TYPE__SECURITY:
				setSecurity(newValue);
				return;
			case DocbookPackage.BIBLIOENTRY_TYPE__SHOW:
				setShow((ShowType)newValue);
				return;
			case DocbookPackage.BIBLIOENTRY_TYPE__TITLE1:
				setTitle1(newValue);
				return;
			case DocbookPackage.BIBLIOENTRY_TYPE__TYPE:
				setType(newValue);
				return;
			case DocbookPackage.BIBLIOENTRY_TYPE__USERLEVEL:
				setUserlevel(newValue);
				return;
			case DocbookPackage.BIBLIOENTRY_TYPE__VENDOR:
				setVendor(newValue);
				return;
			case DocbookPackage.BIBLIOENTRY_TYPE__VERSION:
				setVersion(newValue);
				return;
			case DocbookPackage.BIBLIOENTRY_TYPE__WORDSIZE:
				setWordsize(newValue);
				return;
			case DocbookPackage.BIBLIOENTRY_TYPE__XREFLABEL:
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
			case DocbookPackage.BIBLIOENTRY_TYPE__GROUP:
				getGroup().clear();
				return;
			case DocbookPackage.BIBLIOENTRY_TYPE__ABSTRACT:
				getAbstract().clear();
				return;
			case DocbookPackage.BIBLIOENTRY_TYPE__ADDRESS:
				getAddress().clear();
				return;
			case DocbookPackage.BIBLIOENTRY_TYPE__ARTPAGENUMS:
				getArtpagenums().clear();
				return;
			case DocbookPackage.BIBLIOENTRY_TYPE__AUTHOR:
				getAuthor().clear();
				return;
			case DocbookPackage.BIBLIOENTRY_TYPE__AUTHORGROUP:
				getAuthorgroup().clear();
				return;
			case DocbookPackage.BIBLIOENTRY_TYPE__AUTHORINITIALS:
				getAuthorinitials().clear();
				return;
			case DocbookPackage.BIBLIOENTRY_TYPE__BIBLIOCOVERAGE:
				getBibliocoverage().clear();
				return;
			case DocbookPackage.BIBLIOENTRY_TYPE__BIBLIOID:
				getBiblioid().clear();
				return;
			case DocbookPackage.BIBLIOENTRY_TYPE__BIBLIOSOURCE:
				getBibliosource().clear();
				return;
			case DocbookPackage.BIBLIOENTRY_TYPE__COLLAB:
				getCollab().clear();
				return;
			case DocbookPackage.BIBLIOENTRY_TYPE__CONFGROUP:
				getConfgroup().clear();
				return;
			case DocbookPackage.BIBLIOENTRY_TYPE__CONTRACTSPONSOR:
				getContractsponsor().clear();
				return;
			case DocbookPackage.BIBLIOENTRY_TYPE__CONTRACTNUM:
				getContractnum().clear();
				return;
			case DocbookPackage.BIBLIOENTRY_TYPE__COPYRIGHT:
				getCopyright().clear();
				return;
			case DocbookPackage.BIBLIOENTRY_TYPE__COVER:
				getCover().clear();
				return;
			case DocbookPackage.BIBLIOENTRY_TYPE__DATE:
				getDate().clear();
				return;
			case DocbookPackage.BIBLIOENTRY_TYPE__EDITION:
				getEdition().clear();
				return;
			case DocbookPackage.BIBLIOENTRY_TYPE__EDITOR:
				getEditor().clear();
				return;
			case DocbookPackage.BIBLIOENTRY_TYPE__ISSUENUM:
				getIssuenum().clear();
				return;
			case DocbookPackage.BIBLIOENTRY_TYPE__KEYWORDSET:
				getKeywordset().clear();
				return;
			case DocbookPackage.BIBLIOENTRY_TYPE__LEGALNOTICE:
				getLegalnotice().clear();
				return;
			case DocbookPackage.BIBLIOENTRY_TYPE__MEDIAOBJECT:
				getMediaobject().clear();
				return;
			case DocbookPackage.BIBLIOENTRY_TYPE__ORG:
				getOrg().clear();
				return;
			case DocbookPackage.BIBLIOENTRY_TYPE__ORGNAME:
				getOrgname().clear();
				return;
			case DocbookPackage.BIBLIOENTRY_TYPE__OTHERCREDIT:
				getOthercredit().clear();
				return;
			case DocbookPackage.BIBLIOENTRY_TYPE__PAGENUMS:
				getPagenums().clear();
				return;
			case DocbookPackage.BIBLIOENTRY_TYPE__PRINTHISTORY:
				getPrinthistory().clear();
				return;
			case DocbookPackage.BIBLIOENTRY_TYPE__PUBDATE:
				getPubdate().clear();
				return;
			case DocbookPackage.BIBLIOENTRY_TYPE__PUBLISHER:
				getPublisher().clear();
				return;
			case DocbookPackage.BIBLIOENTRY_TYPE__PUBLISHERNAME:
				getPublishername().clear();
				return;
			case DocbookPackage.BIBLIOENTRY_TYPE__RELEASEINFO:
				getReleaseinfo().clear();
				return;
			case DocbookPackage.BIBLIOENTRY_TYPE__REVHISTORY:
				getRevhistory().clear();
				return;
			case DocbookPackage.BIBLIOENTRY_TYPE__SERIESVOLNUMS:
				getSeriesvolnums().clear();
				return;
			case DocbookPackage.BIBLIOENTRY_TYPE__SUBJECTSET:
				getSubjectset().clear();
				return;
			case DocbookPackage.BIBLIOENTRY_TYPE__VOLUMENUM:
				getVolumenum().clear();
				return;
			case DocbookPackage.BIBLIOENTRY_TYPE__ANNOTATION:
				getAnnotation().clear();
				return;
			case DocbookPackage.BIBLIOENTRY_TYPE__EXTENDEDLINK:
				getExtendedlink().clear();
				return;
			case DocbookPackage.BIBLIOENTRY_TYPE__BIBLIOMISC:
				getBibliomisc().clear();
				return;
			case DocbookPackage.BIBLIOENTRY_TYPE__BIBLIOMSET:
				getBibliomset().clear();
				return;
			case DocbookPackage.BIBLIOENTRY_TYPE__BIBLIORELATION:
				getBibliorelation().clear();
				return;
			case DocbookPackage.BIBLIOENTRY_TYPE__BIBLIOSET:
				getBiblioset().clear();
				return;
			case DocbookPackage.BIBLIOENTRY_TYPE__ITERMSET:
				getItermset().clear();
				return;
			case DocbookPackage.BIBLIOENTRY_TYPE__PRODUCTNAME:
				getProductname().clear();
				return;
			case DocbookPackage.BIBLIOENTRY_TYPE__PRODUCTNUMBER:
				getProductnumber().clear();
				return;
			case DocbookPackage.BIBLIOENTRY_TYPE__ABBREV:
				getAbbrev().clear();
				return;
			case DocbookPackage.BIBLIOENTRY_TYPE__ACRONYM:
				getAcronym().clear();
				return;
			case DocbookPackage.BIBLIOENTRY_TYPE__EMPHASIS:
				getEmphasis().clear();
				return;
			case DocbookPackage.BIBLIOENTRY_TYPE__FOOTNOTE:
				getFootnote().clear();
				return;
			case DocbookPackage.BIBLIOENTRY_TYPE__FOOTNOTEREF:
				getFootnoteref().clear();
				return;
			case DocbookPackage.BIBLIOENTRY_TYPE__FOREIGNPHRASE:
				getForeignphrase().clear();
				return;
			case DocbookPackage.BIBLIOENTRY_TYPE__PHRASE:
				getPhrase().clear();
				return;
			case DocbookPackage.BIBLIOENTRY_TYPE__QUOTE:
				getQuote().clear();
				return;
			case DocbookPackage.BIBLIOENTRY_TYPE__SUBSCRIPT:
				getSubscript().clear();
				return;
			case DocbookPackage.BIBLIOENTRY_TYPE__SUPERSCRIPT:
				getSuperscript().clear();
				return;
			case DocbookPackage.BIBLIOENTRY_TYPE__WORDASWORD:
				getWordasword().clear();
				return;
			case DocbookPackage.BIBLIOENTRY_TYPE__FIRSTTERM:
				getFirstterm().clear();
				return;
			case DocbookPackage.BIBLIOENTRY_TYPE__GLOSSTERM:
				getGlossterm().clear();
				return;
			case DocbookPackage.BIBLIOENTRY_TYPE__COREF:
				getCoref().clear();
				return;
			case DocbookPackage.BIBLIOENTRY_TYPE__CITEREFENTRY:
				getCiterefentry().clear();
				return;
			case DocbookPackage.BIBLIOENTRY_TYPE__CITETITLE:
				getCitetitle().clear();
				return;
			case DocbookPackage.BIBLIOENTRY_TYPE__CITEBIBLIOID:
				getCitebiblioid().clear();
				return;
			case DocbookPackage.BIBLIOENTRY_TYPE__PERSON:
				getPerson().clear();
				return;
			case DocbookPackage.BIBLIOENTRY_TYPE__PERSONBLURB:
				getPersonblurb().clear();
				return;
			case DocbookPackage.BIBLIOENTRY_TYPE__PERSONNAME:
				getPersonname().clear();
				return;
			case DocbookPackage.BIBLIOENTRY_TYPE__SUBTITLE:
				getSubtitle().clear();
				return;
			case DocbookPackage.BIBLIOENTRY_TYPE__TITLE:
				getTitle().clear();
				return;
			case DocbookPackage.BIBLIOENTRY_TYPE__TITLEABBREV:
				getTitleabbrev().clear();
				return;
			case DocbookPackage.BIBLIOENTRY_TYPE__ACTUATE:
				unsetActuate();
				return;
			case DocbookPackage.BIBLIOENTRY_TYPE__ANNOTATIONS:
				setAnnotations(ANNOTATIONS_EDEFAULT);
				return;
			case DocbookPackage.BIBLIOENTRY_TYPE__ARCH:
				setArch(ARCH_EDEFAULT);
				return;
			case DocbookPackage.BIBLIOENTRY_TYPE__ARCROLE:
				setArcrole(ARCROLE_EDEFAULT);
				return;
			case DocbookPackage.BIBLIOENTRY_TYPE__AUDIENCE:
				setAudience(AUDIENCE_EDEFAULT);
				return;
			case DocbookPackage.BIBLIOENTRY_TYPE__BASE:
				setBase(BASE_EDEFAULT);
				return;
			case DocbookPackage.BIBLIOENTRY_TYPE__CONDITION:
				setCondition(CONDITION_EDEFAULT);
				return;
			case DocbookPackage.BIBLIOENTRY_TYPE__CONFORMANCE:
				setConformance(CONFORMANCE_EDEFAULT);
				return;
			case DocbookPackage.BIBLIOENTRY_TYPE__DIR:
				unsetDir();
				return;
			case DocbookPackage.BIBLIOENTRY_TYPE__HREF:
				setHref(HREF_EDEFAULT);
				return;
			case DocbookPackage.BIBLIOENTRY_TYPE__ID:
				setId(ID_EDEFAULT);
				return;
			case DocbookPackage.BIBLIOENTRY_TYPE__LANG:
				setLang(LANG_EDEFAULT);
				return;
			case DocbookPackage.BIBLIOENTRY_TYPE__LINKEND:
				setLinkend(LINKEND_EDEFAULT);
				return;
			case DocbookPackage.BIBLIOENTRY_TYPE__OS:
				setOs(OS_EDEFAULT);
				return;
			case DocbookPackage.BIBLIOENTRY_TYPE__REMAP:
				setRemap(REMAP_EDEFAULT);
				return;
			case DocbookPackage.BIBLIOENTRY_TYPE__REVISION:
				setRevision(REVISION_EDEFAULT);
				return;
			case DocbookPackage.BIBLIOENTRY_TYPE__REVISIONFLAG:
				unsetRevisionflag();
				return;
			case DocbookPackage.BIBLIOENTRY_TYPE__ROLE:
				setRole(ROLE_EDEFAULT);
				return;
			case DocbookPackage.BIBLIOENTRY_TYPE__ROLE1:
				setRole1(ROLE1_EDEFAULT);
				return;
			case DocbookPackage.BIBLIOENTRY_TYPE__SECURITY:
				setSecurity(SECURITY_EDEFAULT);
				return;
			case DocbookPackage.BIBLIOENTRY_TYPE__SHOW:
				unsetShow();
				return;
			case DocbookPackage.BIBLIOENTRY_TYPE__TITLE1:
				setTitle1(TITLE1_EDEFAULT);
				return;
			case DocbookPackage.BIBLIOENTRY_TYPE__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case DocbookPackage.BIBLIOENTRY_TYPE__USERLEVEL:
				setUserlevel(USERLEVEL_EDEFAULT);
				return;
			case DocbookPackage.BIBLIOENTRY_TYPE__VENDOR:
				setVendor(VENDOR_EDEFAULT);
				return;
			case DocbookPackage.BIBLIOENTRY_TYPE__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case DocbookPackage.BIBLIOENTRY_TYPE__WORDSIZE:
				setWordsize(WORDSIZE_EDEFAULT);
				return;
			case DocbookPackage.BIBLIOENTRY_TYPE__XREFLABEL:
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
			case DocbookPackage.BIBLIOENTRY_TYPE__GROUP:
				return group != null && !group.isEmpty();
			case DocbookPackage.BIBLIOENTRY_TYPE__ABSTRACT:
				return !getAbstract().isEmpty();
			case DocbookPackage.BIBLIOENTRY_TYPE__ADDRESS:
				return !getAddress().isEmpty();
			case DocbookPackage.BIBLIOENTRY_TYPE__ARTPAGENUMS:
				return !getArtpagenums().isEmpty();
			case DocbookPackage.BIBLIOENTRY_TYPE__AUTHOR:
				return !getAuthor().isEmpty();
			case DocbookPackage.BIBLIOENTRY_TYPE__AUTHORGROUP:
				return !getAuthorgroup().isEmpty();
			case DocbookPackage.BIBLIOENTRY_TYPE__AUTHORINITIALS:
				return !getAuthorinitials().isEmpty();
			case DocbookPackage.BIBLIOENTRY_TYPE__BIBLIOCOVERAGE:
				return !getBibliocoverage().isEmpty();
			case DocbookPackage.BIBLIOENTRY_TYPE__BIBLIOID:
				return !getBiblioid().isEmpty();
			case DocbookPackage.BIBLIOENTRY_TYPE__BIBLIOSOURCE:
				return !getBibliosource().isEmpty();
			case DocbookPackage.BIBLIOENTRY_TYPE__COLLAB:
				return !getCollab().isEmpty();
			case DocbookPackage.BIBLIOENTRY_TYPE__CONFGROUP:
				return !getConfgroup().isEmpty();
			case DocbookPackage.BIBLIOENTRY_TYPE__CONTRACTSPONSOR:
				return !getContractsponsor().isEmpty();
			case DocbookPackage.BIBLIOENTRY_TYPE__CONTRACTNUM:
				return !getContractnum().isEmpty();
			case DocbookPackage.BIBLIOENTRY_TYPE__COPYRIGHT:
				return !getCopyright().isEmpty();
			case DocbookPackage.BIBLIOENTRY_TYPE__COVER:
				return !getCover().isEmpty();
			case DocbookPackage.BIBLIOENTRY_TYPE__DATE:
				return !getDate().isEmpty();
			case DocbookPackage.BIBLIOENTRY_TYPE__EDITION:
				return !getEdition().isEmpty();
			case DocbookPackage.BIBLIOENTRY_TYPE__EDITOR:
				return !getEditor().isEmpty();
			case DocbookPackage.BIBLIOENTRY_TYPE__ISSUENUM:
				return !getIssuenum().isEmpty();
			case DocbookPackage.BIBLIOENTRY_TYPE__KEYWORDSET:
				return !getKeywordset().isEmpty();
			case DocbookPackage.BIBLIOENTRY_TYPE__LEGALNOTICE:
				return !getLegalnotice().isEmpty();
			case DocbookPackage.BIBLIOENTRY_TYPE__MEDIAOBJECT:
				return !getMediaobject().isEmpty();
			case DocbookPackage.BIBLIOENTRY_TYPE__ORG:
				return !getOrg().isEmpty();
			case DocbookPackage.BIBLIOENTRY_TYPE__ORGNAME:
				return !getOrgname().isEmpty();
			case DocbookPackage.BIBLIOENTRY_TYPE__OTHERCREDIT:
				return !getOthercredit().isEmpty();
			case DocbookPackage.BIBLIOENTRY_TYPE__PAGENUMS:
				return !getPagenums().isEmpty();
			case DocbookPackage.BIBLIOENTRY_TYPE__PRINTHISTORY:
				return !getPrinthistory().isEmpty();
			case DocbookPackage.BIBLIOENTRY_TYPE__PUBDATE:
				return !getPubdate().isEmpty();
			case DocbookPackage.BIBLIOENTRY_TYPE__PUBLISHER:
				return !getPublisher().isEmpty();
			case DocbookPackage.BIBLIOENTRY_TYPE__PUBLISHERNAME:
				return !getPublishername().isEmpty();
			case DocbookPackage.BIBLIOENTRY_TYPE__RELEASEINFO:
				return !getReleaseinfo().isEmpty();
			case DocbookPackage.BIBLIOENTRY_TYPE__REVHISTORY:
				return !getRevhistory().isEmpty();
			case DocbookPackage.BIBLIOENTRY_TYPE__SERIESVOLNUMS:
				return !getSeriesvolnums().isEmpty();
			case DocbookPackage.BIBLIOENTRY_TYPE__SUBJECTSET:
				return !getSubjectset().isEmpty();
			case DocbookPackage.BIBLIOENTRY_TYPE__VOLUMENUM:
				return !getVolumenum().isEmpty();
			case DocbookPackage.BIBLIOENTRY_TYPE__ANNOTATION:
				return !getAnnotation().isEmpty();
			case DocbookPackage.BIBLIOENTRY_TYPE__EXTENDEDLINK:
				return !getExtendedlink().isEmpty();
			case DocbookPackage.BIBLIOENTRY_TYPE__BIBLIOMISC:
				return !getBibliomisc().isEmpty();
			case DocbookPackage.BIBLIOENTRY_TYPE__BIBLIOMSET:
				return !getBibliomset().isEmpty();
			case DocbookPackage.BIBLIOENTRY_TYPE__BIBLIORELATION:
				return !getBibliorelation().isEmpty();
			case DocbookPackage.BIBLIOENTRY_TYPE__BIBLIOSET:
				return !getBiblioset().isEmpty();
			case DocbookPackage.BIBLIOENTRY_TYPE__ITERMSET:
				return !getItermset().isEmpty();
			case DocbookPackage.BIBLIOENTRY_TYPE__PRODUCTNAME:
				return !getProductname().isEmpty();
			case DocbookPackage.BIBLIOENTRY_TYPE__PRODUCTNUMBER:
				return !getProductnumber().isEmpty();
			case DocbookPackage.BIBLIOENTRY_TYPE__ABBREV:
				return !getAbbrev().isEmpty();
			case DocbookPackage.BIBLIOENTRY_TYPE__ACRONYM:
				return !getAcronym().isEmpty();
			case DocbookPackage.BIBLIOENTRY_TYPE__EMPHASIS:
				return !getEmphasis().isEmpty();
			case DocbookPackage.BIBLIOENTRY_TYPE__FOOTNOTE:
				return !getFootnote().isEmpty();
			case DocbookPackage.BIBLIOENTRY_TYPE__FOOTNOTEREF:
				return !getFootnoteref().isEmpty();
			case DocbookPackage.BIBLIOENTRY_TYPE__FOREIGNPHRASE:
				return !getForeignphrase().isEmpty();
			case DocbookPackage.BIBLIOENTRY_TYPE__PHRASE:
				return !getPhrase().isEmpty();
			case DocbookPackage.BIBLIOENTRY_TYPE__QUOTE:
				return !getQuote().isEmpty();
			case DocbookPackage.BIBLIOENTRY_TYPE__SUBSCRIPT:
				return !getSubscript().isEmpty();
			case DocbookPackage.BIBLIOENTRY_TYPE__SUPERSCRIPT:
				return !getSuperscript().isEmpty();
			case DocbookPackage.BIBLIOENTRY_TYPE__WORDASWORD:
				return !getWordasword().isEmpty();
			case DocbookPackage.BIBLIOENTRY_TYPE__FIRSTTERM:
				return !getFirstterm().isEmpty();
			case DocbookPackage.BIBLIOENTRY_TYPE__GLOSSTERM:
				return !getGlossterm().isEmpty();
			case DocbookPackage.BIBLIOENTRY_TYPE__COREF:
				return !getCoref().isEmpty();
			case DocbookPackage.BIBLIOENTRY_TYPE__CITEREFENTRY:
				return !getCiterefentry().isEmpty();
			case DocbookPackage.BIBLIOENTRY_TYPE__CITETITLE:
				return !getCitetitle().isEmpty();
			case DocbookPackage.BIBLIOENTRY_TYPE__CITEBIBLIOID:
				return !getCitebiblioid().isEmpty();
			case DocbookPackage.BIBLIOENTRY_TYPE__PERSON:
				return !getPerson().isEmpty();
			case DocbookPackage.BIBLIOENTRY_TYPE__PERSONBLURB:
				return !getPersonblurb().isEmpty();
			case DocbookPackage.BIBLIOENTRY_TYPE__PERSONNAME:
				return !getPersonname().isEmpty();
			case DocbookPackage.BIBLIOENTRY_TYPE__SUBTITLE:
				return !getSubtitle().isEmpty();
			case DocbookPackage.BIBLIOENTRY_TYPE__TITLE:
				return !getTitle().isEmpty();
			case DocbookPackage.BIBLIOENTRY_TYPE__TITLEABBREV:
				return !getTitleabbrev().isEmpty();
			case DocbookPackage.BIBLIOENTRY_TYPE__ACTUATE:
				return isSetActuate();
			case DocbookPackage.BIBLIOENTRY_TYPE__ANNOTATIONS:
				return ANNOTATIONS_EDEFAULT == null ? annotations != null : !ANNOTATIONS_EDEFAULT.equals(annotations);
			case DocbookPackage.BIBLIOENTRY_TYPE__ARCH:
				return ARCH_EDEFAULT == null ? arch != null : !ARCH_EDEFAULT.equals(arch);
			case DocbookPackage.BIBLIOENTRY_TYPE__ARCROLE:
				return ARCROLE_EDEFAULT == null ? arcrole != null : !ARCROLE_EDEFAULT.equals(arcrole);
			case DocbookPackage.BIBLIOENTRY_TYPE__AUDIENCE:
				return AUDIENCE_EDEFAULT == null ? audience != null : !AUDIENCE_EDEFAULT.equals(audience);
			case DocbookPackage.BIBLIOENTRY_TYPE__BASE:
				return BASE_EDEFAULT == null ? base != null : !BASE_EDEFAULT.equals(base);
			case DocbookPackage.BIBLIOENTRY_TYPE__CONDITION:
				return CONDITION_EDEFAULT == null ? condition != null : !CONDITION_EDEFAULT.equals(condition);
			case DocbookPackage.BIBLIOENTRY_TYPE__CONFORMANCE:
				return CONFORMANCE_EDEFAULT == null ? conformance != null : !CONFORMANCE_EDEFAULT.equals(conformance);
			case DocbookPackage.BIBLIOENTRY_TYPE__DIR:
				return isSetDir();
			case DocbookPackage.BIBLIOENTRY_TYPE__HREF:
				return HREF_EDEFAULT == null ? href != null : !HREF_EDEFAULT.equals(href);
			case DocbookPackage.BIBLIOENTRY_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case DocbookPackage.BIBLIOENTRY_TYPE__LANG:
				return LANG_EDEFAULT == null ? lang != null : !LANG_EDEFAULT.equals(lang);
			case DocbookPackage.BIBLIOENTRY_TYPE__LINKEND:
				return LINKEND_EDEFAULT == null ? linkend != null : !LINKEND_EDEFAULT.equals(linkend);
			case DocbookPackage.BIBLIOENTRY_TYPE__OS:
				return OS_EDEFAULT == null ? os != null : !OS_EDEFAULT.equals(os);
			case DocbookPackage.BIBLIOENTRY_TYPE__REMAP:
				return REMAP_EDEFAULT == null ? remap != null : !REMAP_EDEFAULT.equals(remap);
			case DocbookPackage.BIBLIOENTRY_TYPE__REVISION:
				return REVISION_EDEFAULT == null ? revision != null : !REVISION_EDEFAULT.equals(revision);
			case DocbookPackage.BIBLIOENTRY_TYPE__REVISIONFLAG:
				return isSetRevisionflag();
			case DocbookPackage.BIBLIOENTRY_TYPE__ROLE:
				return ROLE_EDEFAULT == null ? role != null : !ROLE_EDEFAULT.equals(role);
			case DocbookPackage.BIBLIOENTRY_TYPE__ROLE1:
				return ROLE1_EDEFAULT == null ? role1 != null : !ROLE1_EDEFAULT.equals(role1);
			case DocbookPackage.BIBLIOENTRY_TYPE__SECURITY:
				return SECURITY_EDEFAULT == null ? security != null : !SECURITY_EDEFAULT.equals(security);
			case DocbookPackage.BIBLIOENTRY_TYPE__SHOW:
				return isSetShow();
			case DocbookPackage.BIBLIOENTRY_TYPE__TITLE1:
				return TITLE1_EDEFAULT == null ? title1 != null : !TITLE1_EDEFAULT.equals(title1);
			case DocbookPackage.BIBLIOENTRY_TYPE__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case DocbookPackage.BIBLIOENTRY_TYPE__USERLEVEL:
				return USERLEVEL_EDEFAULT == null ? userlevel != null : !USERLEVEL_EDEFAULT.equals(userlevel);
			case DocbookPackage.BIBLIOENTRY_TYPE__VENDOR:
				return VENDOR_EDEFAULT == null ? vendor != null : !VENDOR_EDEFAULT.equals(vendor);
			case DocbookPackage.BIBLIOENTRY_TYPE__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
			case DocbookPackage.BIBLIOENTRY_TYPE__WORDSIZE:
				return WORDSIZE_EDEFAULT == null ? wordsize != null : !WORDSIZE_EDEFAULT.equals(wordsize);
			case DocbookPackage.BIBLIOENTRY_TYPE__XREFLABEL:
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

} //BiblioentryTypeImpl
