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
import org.docbook.ns.docbook.AltType;
import org.docbook.ns.docbook.AnchorType;
import org.docbook.ns.docbook.AnnotationType;
import org.docbook.ns.docbook.ArtpagenumsType;
import org.docbook.ns.docbook.AuthorType;
import org.docbook.ns.docbook.AuthorgroupType;
import org.docbook.ns.docbook.AuthorinitialsType;
import org.docbook.ns.docbook.BibliocoverageType;
import org.docbook.ns.docbook.BiblioidType;
import org.docbook.ns.docbook.BibliomiscType;
import org.docbook.ns.docbook.BibliomsetType;
import org.docbook.ns.docbook.BibliorefType;
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
import org.docbook.ns.docbook.IndextermType;
import org.docbook.ns.docbook.InlinemediaobjectType;
import org.docbook.ns.docbook.IssuenumType;
import org.docbook.ns.docbook.ItermsetType;
import org.docbook.ns.docbook.KeywordsetType;
import org.docbook.ns.docbook.LegalnoticeType;
import org.docbook.ns.docbook.LinkType;
import org.docbook.ns.docbook.MediaobjectType;
import org.docbook.ns.docbook.OlinkType;
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
import org.docbook.ns.docbook.RemarkType;
import org.docbook.ns.docbook.ReplaceableType;
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
 * An implementation of the model object '<em><b>Bibliomset Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.docbook.ns.docbook.impl.BibliomsetTypeImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.BibliomsetTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.BibliomsetTypeImpl#getInlinemediaobject <em>Inlinemediaobject</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.BibliomsetTypeImpl#getRemark <em>Remark</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.BibliomsetTypeImpl#getSuperscript <em>Superscript</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.BibliomsetTypeImpl#getSubscript <em>Subscript</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.BibliomsetTypeImpl#getXref <em>Xref</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.BibliomsetTypeImpl#getLink <em>Link</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.BibliomsetTypeImpl#getOlink <em>Olink</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.BibliomsetTypeImpl#getAnchor <em>Anchor</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.BibliomsetTypeImpl#getBiblioref <em>Biblioref</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.BibliomsetTypeImpl#getAlt <em>Alt</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.BibliomsetTypeImpl#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.BibliomsetTypeImpl#getIndexterm <em>Indexterm</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.BibliomsetTypeImpl#getPhrase <em>Phrase</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.BibliomsetTypeImpl#getReplaceable <em>Replaceable</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.BibliomsetTypeImpl#getAbstract <em>Abstract</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.BibliomsetTypeImpl#getAddress <em>Address</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.BibliomsetTypeImpl#getArtpagenums <em>Artpagenums</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.BibliomsetTypeImpl#getAuthor <em>Author</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.BibliomsetTypeImpl#getAuthorgroup <em>Authorgroup</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.BibliomsetTypeImpl#getAuthorinitials <em>Authorinitials</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.BibliomsetTypeImpl#getBibliocoverage <em>Bibliocoverage</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.BibliomsetTypeImpl#getBiblioid <em>Biblioid</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.BibliomsetTypeImpl#getBibliosource <em>Bibliosource</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.BibliomsetTypeImpl#getCollab <em>Collab</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.BibliomsetTypeImpl#getConfgroup <em>Confgroup</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.BibliomsetTypeImpl#getContractsponsor <em>Contractsponsor</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.BibliomsetTypeImpl#getContractnum <em>Contractnum</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.BibliomsetTypeImpl#getCopyright <em>Copyright</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.BibliomsetTypeImpl#getCover <em>Cover</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.BibliomsetTypeImpl#getDate <em>Date</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.BibliomsetTypeImpl#getEdition <em>Edition</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.BibliomsetTypeImpl#getEditor <em>Editor</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.BibliomsetTypeImpl#getIssuenum <em>Issuenum</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.BibliomsetTypeImpl#getKeywordset <em>Keywordset</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.BibliomsetTypeImpl#getLegalnotice <em>Legalnotice</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.BibliomsetTypeImpl#getMediaobject <em>Mediaobject</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.BibliomsetTypeImpl#getOrg <em>Org</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.BibliomsetTypeImpl#getOrgname <em>Orgname</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.BibliomsetTypeImpl#getOthercredit <em>Othercredit</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.BibliomsetTypeImpl#getPagenums <em>Pagenums</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.BibliomsetTypeImpl#getPrinthistory <em>Printhistory</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.BibliomsetTypeImpl#getPubdate <em>Pubdate</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.BibliomsetTypeImpl#getPublisher <em>Publisher</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.BibliomsetTypeImpl#getPublishername <em>Publishername</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.BibliomsetTypeImpl#getReleaseinfo <em>Releaseinfo</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.BibliomsetTypeImpl#getRevhistory <em>Revhistory</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.BibliomsetTypeImpl#getSeriesvolnums <em>Seriesvolnums</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.BibliomsetTypeImpl#getSubjectset <em>Subjectset</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.BibliomsetTypeImpl#getVolumenum <em>Volumenum</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.BibliomsetTypeImpl#getExtendedlink <em>Extendedlink</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.BibliomsetTypeImpl#getBibliomisc <em>Bibliomisc</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.BibliomsetTypeImpl#getBibliomset <em>Bibliomset</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.BibliomsetTypeImpl#getBibliorelation <em>Bibliorelation</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.BibliomsetTypeImpl#getBiblioset <em>Biblioset</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.BibliomsetTypeImpl#getItermset <em>Itermset</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.BibliomsetTypeImpl#getProductname <em>Productname</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.BibliomsetTypeImpl#getProductnumber <em>Productnumber</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.BibliomsetTypeImpl#getAbbrev <em>Abbrev</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.BibliomsetTypeImpl#getAcronym <em>Acronym</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.BibliomsetTypeImpl#getEmphasis <em>Emphasis</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.BibliomsetTypeImpl#getFootnote <em>Footnote</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.BibliomsetTypeImpl#getFootnoteref <em>Footnoteref</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.BibliomsetTypeImpl#getForeignphrase <em>Foreignphrase</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.BibliomsetTypeImpl#getQuote <em>Quote</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.BibliomsetTypeImpl#getWordasword <em>Wordasword</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.BibliomsetTypeImpl#getFirstterm <em>Firstterm</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.BibliomsetTypeImpl#getGlossterm <em>Glossterm</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.BibliomsetTypeImpl#getCoref <em>Coref</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.BibliomsetTypeImpl#getCiterefentry <em>Citerefentry</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.BibliomsetTypeImpl#getCitetitle <em>Citetitle</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.BibliomsetTypeImpl#getCitebiblioid <em>Citebiblioid</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.BibliomsetTypeImpl#getPerson <em>Person</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.BibliomsetTypeImpl#getPersonblurb <em>Personblurb</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.BibliomsetTypeImpl#getPersonname <em>Personname</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.BibliomsetTypeImpl#getSubtitle <em>Subtitle</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.BibliomsetTypeImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.BibliomsetTypeImpl#getTitleabbrev <em>Titleabbrev</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.BibliomsetTypeImpl#getActuate <em>Actuate</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.BibliomsetTypeImpl#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.BibliomsetTypeImpl#getArch <em>Arch</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.BibliomsetTypeImpl#getArcrole <em>Arcrole</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.BibliomsetTypeImpl#getAudience <em>Audience</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.BibliomsetTypeImpl#getBase <em>Base</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.BibliomsetTypeImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.BibliomsetTypeImpl#getConformance <em>Conformance</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.BibliomsetTypeImpl#getDir <em>Dir</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.BibliomsetTypeImpl#getHref <em>Href</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.BibliomsetTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.BibliomsetTypeImpl#getLang <em>Lang</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.BibliomsetTypeImpl#getLinkend <em>Linkend</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.BibliomsetTypeImpl#getOs <em>Os</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.BibliomsetTypeImpl#getRelation <em>Relation</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.BibliomsetTypeImpl#getRemap <em>Remap</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.BibliomsetTypeImpl#getRevision <em>Revision</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.BibliomsetTypeImpl#getRevisionflag <em>Revisionflag</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.BibliomsetTypeImpl#getRole <em>Role</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.BibliomsetTypeImpl#getRole1 <em>Role1</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.BibliomsetTypeImpl#getSecurity <em>Security</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.BibliomsetTypeImpl#getShow <em>Show</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.BibliomsetTypeImpl#getTitle1 <em>Title1</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.BibliomsetTypeImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.BibliomsetTypeImpl#getUserlevel <em>Userlevel</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.BibliomsetTypeImpl#getVendor <em>Vendor</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.BibliomsetTypeImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.BibliomsetTypeImpl#getWordsize <em>Wordsize</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.BibliomsetTypeImpl#getXreflabel <em>Xreflabel</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BibliomsetTypeImpl extends MinimalEObjectImpl.Container implements BibliomsetType {
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
	 * The default value of the '{@link #getRelation() <em>Relation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelation()
	 * @generated
	 * @ordered
	 */
	protected static final Object RELATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRelation() <em>Relation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelation()
	 * @generated
	 * @ordered
	 */
	protected Object relation = RELATION_EDEFAULT;

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
	protected BibliomsetTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DocbookPackage.eINSTANCE.getBibliomsetType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, DocbookPackage.BIBLIOMSET_TYPE__MIXED);
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
		return (FeatureMap)getMixed().<FeatureMap.Entry>list(DocbookPackage.eINSTANCE.getBibliomsetType_Group());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InlinemediaobjectType> getInlinemediaobject() {
		return getGroup().list(DocbookPackage.eINSTANCE.getBibliomsetType_Inlinemediaobject());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RemarkType> getRemark() {
		return getGroup().list(DocbookPackage.eINSTANCE.getBibliomsetType_Remark());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SuperscriptType> getSuperscript() {
		return getGroup().list(DocbookPackage.eINSTANCE.getBibliomsetType_Superscript());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SubscriptType> getSubscript() {
		return getGroup().list(DocbookPackage.eINSTANCE.getBibliomsetType_Subscript());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<XrefType> getXref() {
		return getGroup().list(DocbookPackage.eINSTANCE.getBibliomsetType_Xref());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<LinkType> getLink() {
		return getGroup().list(DocbookPackage.eINSTANCE.getBibliomsetType_Link());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<OlinkType> getOlink() {
		return getGroup().list(DocbookPackage.eINSTANCE.getBibliomsetType_Olink());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AnchorType> getAnchor() {
		return getGroup().list(DocbookPackage.eINSTANCE.getBibliomsetType_Anchor());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BibliorefType> getBiblioref() {
		return getGroup().list(DocbookPackage.eINSTANCE.getBibliomsetType_Biblioref());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AltType> getAlt() {
		return getGroup().list(DocbookPackage.eINSTANCE.getBibliomsetType_Alt());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AnnotationType> getAnnotation() {
		return getGroup().list(DocbookPackage.eINSTANCE.getBibliomsetType_Annotation());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<IndextermType> getIndexterm() {
		return getGroup().list(DocbookPackage.eINSTANCE.getBibliomsetType_Indexterm());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PhraseType> getPhrase() {
		return getGroup().list(DocbookPackage.eINSTANCE.getBibliomsetType_Phrase());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ReplaceableType> getReplaceable() {
		return getGroup().list(DocbookPackage.eINSTANCE.getBibliomsetType_Replaceable());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbstractType> getAbstract() {
		return getGroup().list(DocbookPackage.eINSTANCE.getBibliomsetType_Abstract());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AddressType> getAddress() {
		return getGroup().list(DocbookPackage.eINSTANCE.getBibliomsetType_Address());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ArtpagenumsType> getArtpagenums() {
		return getGroup().list(DocbookPackage.eINSTANCE.getBibliomsetType_Artpagenums());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AuthorType> getAuthor() {
		return getGroup().list(DocbookPackage.eINSTANCE.getBibliomsetType_Author());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AuthorgroupType> getAuthorgroup() {
		return getGroup().list(DocbookPackage.eINSTANCE.getBibliomsetType_Authorgroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AuthorinitialsType> getAuthorinitials() {
		return getGroup().list(DocbookPackage.eINSTANCE.getBibliomsetType_Authorinitials());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BibliocoverageType> getBibliocoverage() {
		return getGroup().list(DocbookPackage.eINSTANCE.getBibliomsetType_Bibliocoverage());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BiblioidType> getBiblioid() {
		return getGroup().list(DocbookPackage.eINSTANCE.getBibliomsetType_Biblioid());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BibliosourceType> getBibliosource() {
		return getGroup().list(DocbookPackage.eINSTANCE.getBibliomsetType_Bibliosource());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CollabType> getCollab() {
		return getGroup().list(DocbookPackage.eINSTANCE.getBibliomsetType_Collab());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ConfgroupType> getConfgroup() {
		return getGroup().list(DocbookPackage.eINSTANCE.getBibliomsetType_Confgroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ContractsponsorType> getContractsponsor() {
		return getGroup().list(DocbookPackage.eINSTANCE.getBibliomsetType_Contractsponsor());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ContractnumType> getContractnum() {
		return getGroup().list(DocbookPackage.eINSTANCE.getBibliomsetType_Contractnum());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CopyrightType> getCopyright() {
		return getGroup().list(DocbookPackage.eINSTANCE.getBibliomsetType_Copyright());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CoverType> getCover() {
		return getGroup().list(DocbookPackage.eINSTANCE.getBibliomsetType_Cover());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DateType> getDate() {
		return getGroup().list(DocbookPackage.eINSTANCE.getBibliomsetType_Date());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EditionType> getEdition() {
		return getGroup().list(DocbookPackage.eINSTANCE.getBibliomsetType_Edition());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EditorType> getEditor() {
		return getGroup().list(DocbookPackage.eINSTANCE.getBibliomsetType_Editor());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<IssuenumType> getIssuenum() {
		return getGroup().list(DocbookPackage.eINSTANCE.getBibliomsetType_Issuenum());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<KeywordsetType> getKeywordset() {
		return getGroup().list(DocbookPackage.eINSTANCE.getBibliomsetType_Keywordset());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<LegalnoticeType> getLegalnotice() {
		return getGroup().list(DocbookPackage.eINSTANCE.getBibliomsetType_Legalnotice());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MediaobjectType> getMediaobject() {
		return getGroup().list(DocbookPackage.eINSTANCE.getBibliomsetType_Mediaobject());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<OrgType> getOrg() {
		return getGroup().list(DocbookPackage.eINSTANCE.getBibliomsetType_Org());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<OrgnameType> getOrgname() {
		return getGroup().list(DocbookPackage.eINSTANCE.getBibliomsetType_Orgname());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<OthercreditType> getOthercredit() {
		return getGroup().list(DocbookPackage.eINSTANCE.getBibliomsetType_Othercredit());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PagenumsType> getPagenums() {
		return getGroup().list(DocbookPackage.eINSTANCE.getBibliomsetType_Pagenums());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PrinthistoryType> getPrinthistory() {
		return getGroup().list(DocbookPackage.eINSTANCE.getBibliomsetType_Printhistory());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PubdateType> getPubdate() {
		return getGroup().list(DocbookPackage.eINSTANCE.getBibliomsetType_Pubdate());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PublisherType> getPublisher() {
		return getGroup().list(DocbookPackage.eINSTANCE.getBibliomsetType_Publisher());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PublishernameType> getPublishername() {
		return getGroup().list(DocbookPackage.eINSTANCE.getBibliomsetType_Publishername());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ReleaseinfoType> getReleaseinfo() {
		return getGroup().list(DocbookPackage.eINSTANCE.getBibliomsetType_Releaseinfo());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RevhistoryType> getRevhistory() {
		return getGroup().list(DocbookPackage.eINSTANCE.getBibliomsetType_Revhistory());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SeriesvolnumsType> getSeriesvolnums() {
		return getGroup().list(DocbookPackage.eINSTANCE.getBibliomsetType_Seriesvolnums());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SubjectsetType> getSubjectset() {
		return getGroup().list(DocbookPackage.eINSTANCE.getBibliomsetType_Subjectset());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<VolumenumType> getVolumenum() {
		return getGroup().list(DocbookPackage.eINSTANCE.getBibliomsetType_Volumenum());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ExtendedlinkType> getExtendedlink() {
		return getGroup().list(DocbookPackage.eINSTANCE.getBibliomsetType_Extendedlink());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BibliomiscType> getBibliomisc() {
		return getGroup().list(DocbookPackage.eINSTANCE.getBibliomsetType_Bibliomisc());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BibliomsetType> getBibliomset() {
		return getGroup().list(DocbookPackage.eINSTANCE.getBibliomsetType_Bibliomset());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BibliorelationType> getBibliorelation() {
		return getGroup().list(DocbookPackage.eINSTANCE.getBibliomsetType_Bibliorelation());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BibliosetType> getBiblioset() {
		return getGroup().list(DocbookPackage.eINSTANCE.getBibliomsetType_Biblioset());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ItermsetType> getItermset() {
		return getGroup().list(DocbookPackage.eINSTANCE.getBibliomsetType_Itermset());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ProductnameType> getProductname() {
		return getGroup().list(DocbookPackage.eINSTANCE.getBibliomsetType_Productname());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ProductnumberType> getProductnumber() {
		return getGroup().list(DocbookPackage.eINSTANCE.getBibliomsetType_Productnumber());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbbrevType> getAbbrev() {
		return getGroup().list(DocbookPackage.eINSTANCE.getBibliomsetType_Abbrev());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AcronymType> getAcronym() {
		return getGroup().list(DocbookPackage.eINSTANCE.getBibliomsetType_Acronym());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EmphasisType> getEmphasis() {
		return getGroup().list(DocbookPackage.eINSTANCE.getBibliomsetType_Emphasis());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FootnoteType> getFootnote() {
		return getGroup().list(DocbookPackage.eINSTANCE.getBibliomsetType_Footnote());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FootnoterefType> getFootnoteref() {
		return getGroup().list(DocbookPackage.eINSTANCE.getBibliomsetType_Footnoteref());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ForeignphraseType> getForeignphrase() {
		return getGroup().list(DocbookPackage.eINSTANCE.getBibliomsetType_Foreignphrase());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<QuoteType> getQuote() {
		return getGroup().list(DocbookPackage.eINSTANCE.getBibliomsetType_Quote());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<WordaswordType> getWordasword() {
		return getGroup().list(DocbookPackage.eINSTANCE.getBibliomsetType_Wordasword());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FirsttermType> getFirstterm() {
		return getGroup().list(DocbookPackage.eINSTANCE.getBibliomsetType_Firstterm());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<GlosstermType> getGlossterm() {
		return getGroup().list(DocbookPackage.eINSTANCE.getBibliomsetType_Glossterm());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CorefType> getCoref() {
		return getGroup().list(DocbookPackage.eINSTANCE.getBibliomsetType_Coref());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CiterefentryType> getCiterefentry() {
		return getGroup().list(DocbookPackage.eINSTANCE.getBibliomsetType_Citerefentry());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CitetitleType> getCitetitle() {
		return getGroup().list(DocbookPackage.eINSTANCE.getBibliomsetType_Citetitle());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CitebiblioidType> getCitebiblioid() {
		return getGroup().list(DocbookPackage.eINSTANCE.getBibliomsetType_Citebiblioid());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PersonType> getPerson() {
		return getGroup().list(DocbookPackage.eINSTANCE.getBibliomsetType_Person());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PersonblurbType> getPersonblurb() {
		return getGroup().list(DocbookPackage.eINSTANCE.getBibliomsetType_Personblurb());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PersonnameType> getPersonname() {
		return getGroup().list(DocbookPackage.eINSTANCE.getBibliomsetType_Personname());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SubtitleType> getSubtitle() {
		return getGroup().list(DocbookPackage.eINSTANCE.getBibliomsetType_Subtitle());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TitleType> getTitle() {
		return getGroup().list(DocbookPackage.eINSTANCE.getBibliomsetType_Title());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TitleabbrevType> getTitleabbrev() {
		return getGroup().list(DocbookPackage.eINSTANCE.getBibliomsetType_Titleabbrev());
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.BIBLIOMSET_TYPE__ACTUATE, oldActuate, actuate, !oldActuateESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, DocbookPackage.BIBLIOMSET_TYPE__ACTUATE, oldActuate, ACTUATE_EDEFAULT, oldActuateESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.BIBLIOMSET_TYPE__ANNOTATIONS, oldAnnotations, annotations));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.BIBLIOMSET_TYPE__ARCH, oldArch, arch));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.BIBLIOMSET_TYPE__ARCROLE, oldArcrole, arcrole));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.BIBLIOMSET_TYPE__AUDIENCE, oldAudience, audience));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.BIBLIOMSET_TYPE__BASE, oldBase, base));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.BIBLIOMSET_TYPE__CONDITION, oldCondition, condition));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.BIBLIOMSET_TYPE__CONFORMANCE, oldConformance, conformance));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.BIBLIOMSET_TYPE__DIR, oldDir, dir, !oldDirESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, DocbookPackage.BIBLIOMSET_TYPE__DIR, oldDir, DIR_EDEFAULT, oldDirESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.BIBLIOMSET_TYPE__HREF, oldHref, href));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.BIBLIOMSET_TYPE__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.BIBLIOMSET_TYPE__LANG, oldLang, lang));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.BIBLIOMSET_TYPE__LINKEND, oldLinkend, linkend));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.BIBLIOMSET_TYPE__OS, oldOs, os));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getRelation() {
		return relation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRelation(Object newRelation) {
		Object oldRelation = relation;
		relation = newRelation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.BIBLIOMSET_TYPE__RELATION, oldRelation, relation));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.BIBLIOMSET_TYPE__REMAP, oldRemap, remap));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.BIBLIOMSET_TYPE__REVISION, oldRevision, revision));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.BIBLIOMSET_TYPE__REVISIONFLAG, oldRevisionflag, revisionflag, !oldRevisionflagESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, DocbookPackage.BIBLIOMSET_TYPE__REVISIONFLAG, oldRevisionflag, REVISIONFLAG_EDEFAULT, oldRevisionflagESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.BIBLIOMSET_TYPE__ROLE, oldRole, role));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.BIBLIOMSET_TYPE__ROLE1, oldRole1, role1));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.BIBLIOMSET_TYPE__SECURITY, oldSecurity, security));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.BIBLIOMSET_TYPE__SHOW, oldShow, show, !oldShowESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, DocbookPackage.BIBLIOMSET_TYPE__SHOW, oldShow, SHOW_EDEFAULT, oldShowESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.BIBLIOMSET_TYPE__TITLE1, oldTitle1, title1));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.BIBLIOMSET_TYPE__TYPE, oldType, type));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.BIBLIOMSET_TYPE__USERLEVEL, oldUserlevel, userlevel));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.BIBLIOMSET_TYPE__VENDOR, oldVendor, vendor));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.BIBLIOMSET_TYPE__VERSION, oldVersion, version));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.BIBLIOMSET_TYPE__WORDSIZE, oldWordsize, wordsize));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.BIBLIOMSET_TYPE__XREFLABEL, oldXreflabel, xreflabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DocbookPackage.BIBLIOMSET_TYPE__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case DocbookPackage.BIBLIOMSET_TYPE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case DocbookPackage.BIBLIOMSET_TYPE__INLINEMEDIAOBJECT:
				return ((InternalEList<?>)getInlinemediaobject()).basicRemove(otherEnd, msgs);
			case DocbookPackage.BIBLIOMSET_TYPE__REMARK:
				return ((InternalEList<?>)getRemark()).basicRemove(otherEnd, msgs);
			case DocbookPackage.BIBLIOMSET_TYPE__SUPERSCRIPT:
				return ((InternalEList<?>)getSuperscript()).basicRemove(otherEnd, msgs);
			case DocbookPackage.BIBLIOMSET_TYPE__SUBSCRIPT:
				return ((InternalEList<?>)getSubscript()).basicRemove(otherEnd, msgs);
			case DocbookPackage.BIBLIOMSET_TYPE__XREF:
				return ((InternalEList<?>)getXref()).basicRemove(otherEnd, msgs);
			case DocbookPackage.BIBLIOMSET_TYPE__LINK:
				return ((InternalEList<?>)getLink()).basicRemove(otherEnd, msgs);
			case DocbookPackage.BIBLIOMSET_TYPE__OLINK:
				return ((InternalEList<?>)getOlink()).basicRemove(otherEnd, msgs);
			case DocbookPackage.BIBLIOMSET_TYPE__ANCHOR:
				return ((InternalEList<?>)getAnchor()).basicRemove(otherEnd, msgs);
			case DocbookPackage.BIBLIOMSET_TYPE__BIBLIOREF:
				return ((InternalEList<?>)getBiblioref()).basicRemove(otherEnd, msgs);
			case DocbookPackage.BIBLIOMSET_TYPE__ALT:
				return ((InternalEList<?>)getAlt()).basicRemove(otherEnd, msgs);
			case DocbookPackage.BIBLIOMSET_TYPE__ANNOTATION:
				return ((InternalEList<?>)getAnnotation()).basicRemove(otherEnd, msgs);
			case DocbookPackage.BIBLIOMSET_TYPE__INDEXTERM:
				return ((InternalEList<?>)getIndexterm()).basicRemove(otherEnd, msgs);
			case DocbookPackage.BIBLIOMSET_TYPE__PHRASE:
				return ((InternalEList<?>)getPhrase()).basicRemove(otherEnd, msgs);
			case DocbookPackage.BIBLIOMSET_TYPE__REPLACEABLE:
				return ((InternalEList<?>)getReplaceable()).basicRemove(otherEnd, msgs);
			case DocbookPackage.BIBLIOMSET_TYPE__ABSTRACT:
				return ((InternalEList<?>)getAbstract()).basicRemove(otherEnd, msgs);
			case DocbookPackage.BIBLIOMSET_TYPE__ADDRESS:
				return ((InternalEList<?>)getAddress()).basicRemove(otherEnd, msgs);
			case DocbookPackage.BIBLIOMSET_TYPE__ARTPAGENUMS:
				return ((InternalEList<?>)getArtpagenums()).basicRemove(otherEnd, msgs);
			case DocbookPackage.BIBLIOMSET_TYPE__AUTHOR:
				return ((InternalEList<?>)getAuthor()).basicRemove(otherEnd, msgs);
			case DocbookPackage.BIBLIOMSET_TYPE__AUTHORGROUP:
				return ((InternalEList<?>)getAuthorgroup()).basicRemove(otherEnd, msgs);
			case DocbookPackage.BIBLIOMSET_TYPE__AUTHORINITIALS:
				return ((InternalEList<?>)getAuthorinitials()).basicRemove(otherEnd, msgs);
			case DocbookPackage.BIBLIOMSET_TYPE__BIBLIOCOVERAGE:
				return ((InternalEList<?>)getBibliocoverage()).basicRemove(otherEnd, msgs);
			case DocbookPackage.BIBLIOMSET_TYPE__BIBLIOID:
				return ((InternalEList<?>)getBiblioid()).basicRemove(otherEnd, msgs);
			case DocbookPackage.BIBLIOMSET_TYPE__BIBLIOSOURCE:
				return ((InternalEList<?>)getBibliosource()).basicRemove(otherEnd, msgs);
			case DocbookPackage.BIBLIOMSET_TYPE__COLLAB:
				return ((InternalEList<?>)getCollab()).basicRemove(otherEnd, msgs);
			case DocbookPackage.BIBLIOMSET_TYPE__CONFGROUP:
				return ((InternalEList<?>)getConfgroup()).basicRemove(otherEnd, msgs);
			case DocbookPackage.BIBLIOMSET_TYPE__CONTRACTSPONSOR:
				return ((InternalEList<?>)getContractsponsor()).basicRemove(otherEnd, msgs);
			case DocbookPackage.BIBLIOMSET_TYPE__CONTRACTNUM:
				return ((InternalEList<?>)getContractnum()).basicRemove(otherEnd, msgs);
			case DocbookPackage.BIBLIOMSET_TYPE__COPYRIGHT:
				return ((InternalEList<?>)getCopyright()).basicRemove(otherEnd, msgs);
			case DocbookPackage.BIBLIOMSET_TYPE__COVER:
				return ((InternalEList<?>)getCover()).basicRemove(otherEnd, msgs);
			case DocbookPackage.BIBLIOMSET_TYPE__DATE:
				return ((InternalEList<?>)getDate()).basicRemove(otherEnd, msgs);
			case DocbookPackage.BIBLIOMSET_TYPE__EDITION:
				return ((InternalEList<?>)getEdition()).basicRemove(otherEnd, msgs);
			case DocbookPackage.BIBLIOMSET_TYPE__EDITOR:
				return ((InternalEList<?>)getEditor()).basicRemove(otherEnd, msgs);
			case DocbookPackage.BIBLIOMSET_TYPE__ISSUENUM:
				return ((InternalEList<?>)getIssuenum()).basicRemove(otherEnd, msgs);
			case DocbookPackage.BIBLIOMSET_TYPE__KEYWORDSET:
				return ((InternalEList<?>)getKeywordset()).basicRemove(otherEnd, msgs);
			case DocbookPackage.BIBLIOMSET_TYPE__LEGALNOTICE:
				return ((InternalEList<?>)getLegalnotice()).basicRemove(otherEnd, msgs);
			case DocbookPackage.BIBLIOMSET_TYPE__MEDIAOBJECT:
				return ((InternalEList<?>)getMediaobject()).basicRemove(otherEnd, msgs);
			case DocbookPackage.BIBLIOMSET_TYPE__ORG:
				return ((InternalEList<?>)getOrg()).basicRemove(otherEnd, msgs);
			case DocbookPackage.BIBLIOMSET_TYPE__ORGNAME:
				return ((InternalEList<?>)getOrgname()).basicRemove(otherEnd, msgs);
			case DocbookPackage.BIBLIOMSET_TYPE__OTHERCREDIT:
				return ((InternalEList<?>)getOthercredit()).basicRemove(otherEnd, msgs);
			case DocbookPackage.BIBLIOMSET_TYPE__PAGENUMS:
				return ((InternalEList<?>)getPagenums()).basicRemove(otherEnd, msgs);
			case DocbookPackage.BIBLIOMSET_TYPE__PRINTHISTORY:
				return ((InternalEList<?>)getPrinthistory()).basicRemove(otherEnd, msgs);
			case DocbookPackage.BIBLIOMSET_TYPE__PUBDATE:
				return ((InternalEList<?>)getPubdate()).basicRemove(otherEnd, msgs);
			case DocbookPackage.BIBLIOMSET_TYPE__PUBLISHER:
				return ((InternalEList<?>)getPublisher()).basicRemove(otherEnd, msgs);
			case DocbookPackage.BIBLIOMSET_TYPE__PUBLISHERNAME:
				return ((InternalEList<?>)getPublishername()).basicRemove(otherEnd, msgs);
			case DocbookPackage.BIBLIOMSET_TYPE__RELEASEINFO:
				return ((InternalEList<?>)getReleaseinfo()).basicRemove(otherEnd, msgs);
			case DocbookPackage.BIBLIOMSET_TYPE__REVHISTORY:
				return ((InternalEList<?>)getRevhistory()).basicRemove(otherEnd, msgs);
			case DocbookPackage.BIBLIOMSET_TYPE__SERIESVOLNUMS:
				return ((InternalEList<?>)getSeriesvolnums()).basicRemove(otherEnd, msgs);
			case DocbookPackage.BIBLIOMSET_TYPE__SUBJECTSET:
				return ((InternalEList<?>)getSubjectset()).basicRemove(otherEnd, msgs);
			case DocbookPackage.BIBLIOMSET_TYPE__VOLUMENUM:
				return ((InternalEList<?>)getVolumenum()).basicRemove(otherEnd, msgs);
			case DocbookPackage.BIBLIOMSET_TYPE__EXTENDEDLINK:
				return ((InternalEList<?>)getExtendedlink()).basicRemove(otherEnd, msgs);
			case DocbookPackage.BIBLIOMSET_TYPE__BIBLIOMISC:
				return ((InternalEList<?>)getBibliomisc()).basicRemove(otherEnd, msgs);
			case DocbookPackage.BIBLIOMSET_TYPE__BIBLIOMSET:
				return ((InternalEList<?>)getBibliomset()).basicRemove(otherEnd, msgs);
			case DocbookPackage.BIBLIOMSET_TYPE__BIBLIORELATION:
				return ((InternalEList<?>)getBibliorelation()).basicRemove(otherEnd, msgs);
			case DocbookPackage.BIBLIOMSET_TYPE__BIBLIOSET:
				return ((InternalEList<?>)getBiblioset()).basicRemove(otherEnd, msgs);
			case DocbookPackage.BIBLIOMSET_TYPE__ITERMSET:
				return ((InternalEList<?>)getItermset()).basicRemove(otherEnd, msgs);
			case DocbookPackage.BIBLIOMSET_TYPE__PRODUCTNAME:
				return ((InternalEList<?>)getProductname()).basicRemove(otherEnd, msgs);
			case DocbookPackage.BIBLIOMSET_TYPE__PRODUCTNUMBER:
				return ((InternalEList<?>)getProductnumber()).basicRemove(otherEnd, msgs);
			case DocbookPackage.BIBLIOMSET_TYPE__ABBREV:
				return ((InternalEList<?>)getAbbrev()).basicRemove(otherEnd, msgs);
			case DocbookPackage.BIBLIOMSET_TYPE__ACRONYM:
				return ((InternalEList<?>)getAcronym()).basicRemove(otherEnd, msgs);
			case DocbookPackage.BIBLIOMSET_TYPE__EMPHASIS:
				return ((InternalEList<?>)getEmphasis()).basicRemove(otherEnd, msgs);
			case DocbookPackage.BIBLIOMSET_TYPE__FOOTNOTE:
				return ((InternalEList<?>)getFootnote()).basicRemove(otherEnd, msgs);
			case DocbookPackage.BIBLIOMSET_TYPE__FOOTNOTEREF:
				return ((InternalEList<?>)getFootnoteref()).basicRemove(otherEnd, msgs);
			case DocbookPackage.BIBLIOMSET_TYPE__FOREIGNPHRASE:
				return ((InternalEList<?>)getForeignphrase()).basicRemove(otherEnd, msgs);
			case DocbookPackage.BIBLIOMSET_TYPE__QUOTE:
				return ((InternalEList<?>)getQuote()).basicRemove(otherEnd, msgs);
			case DocbookPackage.BIBLIOMSET_TYPE__WORDASWORD:
				return ((InternalEList<?>)getWordasword()).basicRemove(otherEnd, msgs);
			case DocbookPackage.BIBLIOMSET_TYPE__FIRSTTERM:
				return ((InternalEList<?>)getFirstterm()).basicRemove(otherEnd, msgs);
			case DocbookPackage.BIBLIOMSET_TYPE__GLOSSTERM:
				return ((InternalEList<?>)getGlossterm()).basicRemove(otherEnd, msgs);
			case DocbookPackage.BIBLIOMSET_TYPE__COREF:
				return ((InternalEList<?>)getCoref()).basicRemove(otherEnd, msgs);
			case DocbookPackage.BIBLIOMSET_TYPE__CITEREFENTRY:
				return ((InternalEList<?>)getCiterefentry()).basicRemove(otherEnd, msgs);
			case DocbookPackage.BIBLIOMSET_TYPE__CITETITLE:
				return ((InternalEList<?>)getCitetitle()).basicRemove(otherEnd, msgs);
			case DocbookPackage.BIBLIOMSET_TYPE__CITEBIBLIOID:
				return ((InternalEList<?>)getCitebiblioid()).basicRemove(otherEnd, msgs);
			case DocbookPackage.BIBLIOMSET_TYPE__PERSON:
				return ((InternalEList<?>)getPerson()).basicRemove(otherEnd, msgs);
			case DocbookPackage.BIBLIOMSET_TYPE__PERSONBLURB:
				return ((InternalEList<?>)getPersonblurb()).basicRemove(otherEnd, msgs);
			case DocbookPackage.BIBLIOMSET_TYPE__PERSONNAME:
				return ((InternalEList<?>)getPersonname()).basicRemove(otherEnd, msgs);
			case DocbookPackage.BIBLIOMSET_TYPE__SUBTITLE:
				return ((InternalEList<?>)getSubtitle()).basicRemove(otherEnd, msgs);
			case DocbookPackage.BIBLIOMSET_TYPE__TITLE:
				return ((InternalEList<?>)getTitle()).basicRemove(otherEnd, msgs);
			case DocbookPackage.BIBLIOMSET_TYPE__TITLEABBREV:
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
			case DocbookPackage.BIBLIOMSET_TYPE__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case DocbookPackage.BIBLIOMSET_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case DocbookPackage.BIBLIOMSET_TYPE__INLINEMEDIAOBJECT:
				return getInlinemediaobject();
			case DocbookPackage.BIBLIOMSET_TYPE__REMARK:
				return getRemark();
			case DocbookPackage.BIBLIOMSET_TYPE__SUPERSCRIPT:
				return getSuperscript();
			case DocbookPackage.BIBLIOMSET_TYPE__SUBSCRIPT:
				return getSubscript();
			case DocbookPackage.BIBLIOMSET_TYPE__XREF:
				return getXref();
			case DocbookPackage.BIBLIOMSET_TYPE__LINK:
				return getLink();
			case DocbookPackage.BIBLIOMSET_TYPE__OLINK:
				return getOlink();
			case DocbookPackage.BIBLIOMSET_TYPE__ANCHOR:
				return getAnchor();
			case DocbookPackage.BIBLIOMSET_TYPE__BIBLIOREF:
				return getBiblioref();
			case DocbookPackage.BIBLIOMSET_TYPE__ALT:
				return getAlt();
			case DocbookPackage.BIBLIOMSET_TYPE__ANNOTATION:
				return getAnnotation();
			case DocbookPackage.BIBLIOMSET_TYPE__INDEXTERM:
				return getIndexterm();
			case DocbookPackage.BIBLIOMSET_TYPE__PHRASE:
				return getPhrase();
			case DocbookPackage.BIBLIOMSET_TYPE__REPLACEABLE:
				return getReplaceable();
			case DocbookPackage.BIBLIOMSET_TYPE__ABSTRACT:
				return getAbstract();
			case DocbookPackage.BIBLIOMSET_TYPE__ADDRESS:
				return getAddress();
			case DocbookPackage.BIBLIOMSET_TYPE__ARTPAGENUMS:
				return getArtpagenums();
			case DocbookPackage.BIBLIOMSET_TYPE__AUTHOR:
				return getAuthor();
			case DocbookPackage.BIBLIOMSET_TYPE__AUTHORGROUP:
				return getAuthorgroup();
			case DocbookPackage.BIBLIOMSET_TYPE__AUTHORINITIALS:
				return getAuthorinitials();
			case DocbookPackage.BIBLIOMSET_TYPE__BIBLIOCOVERAGE:
				return getBibliocoverage();
			case DocbookPackage.BIBLIOMSET_TYPE__BIBLIOID:
				return getBiblioid();
			case DocbookPackage.BIBLIOMSET_TYPE__BIBLIOSOURCE:
				return getBibliosource();
			case DocbookPackage.BIBLIOMSET_TYPE__COLLAB:
				return getCollab();
			case DocbookPackage.BIBLIOMSET_TYPE__CONFGROUP:
				return getConfgroup();
			case DocbookPackage.BIBLIOMSET_TYPE__CONTRACTSPONSOR:
				return getContractsponsor();
			case DocbookPackage.BIBLIOMSET_TYPE__CONTRACTNUM:
				return getContractnum();
			case DocbookPackage.BIBLIOMSET_TYPE__COPYRIGHT:
				return getCopyright();
			case DocbookPackage.BIBLIOMSET_TYPE__COVER:
				return getCover();
			case DocbookPackage.BIBLIOMSET_TYPE__DATE:
				return getDate();
			case DocbookPackage.BIBLIOMSET_TYPE__EDITION:
				return getEdition();
			case DocbookPackage.BIBLIOMSET_TYPE__EDITOR:
				return getEditor();
			case DocbookPackage.BIBLIOMSET_TYPE__ISSUENUM:
				return getIssuenum();
			case DocbookPackage.BIBLIOMSET_TYPE__KEYWORDSET:
				return getKeywordset();
			case DocbookPackage.BIBLIOMSET_TYPE__LEGALNOTICE:
				return getLegalnotice();
			case DocbookPackage.BIBLIOMSET_TYPE__MEDIAOBJECT:
				return getMediaobject();
			case DocbookPackage.BIBLIOMSET_TYPE__ORG:
				return getOrg();
			case DocbookPackage.BIBLIOMSET_TYPE__ORGNAME:
				return getOrgname();
			case DocbookPackage.BIBLIOMSET_TYPE__OTHERCREDIT:
				return getOthercredit();
			case DocbookPackage.BIBLIOMSET_TYPE__PAGENUMS:
				return getPagenums();
			case DocbookPackage.BIBLIOMSET_TYPE__PRINTHISTORY:
				return getPrinthistory();
			case DocbookPackage.BIBLIOMSET_TYPE__PUBDATE:
				return getPubdate();
			case DocbookPackage.BIBLIOMSET_TYPE__PUBLISHER:
				return getPublisher();
			case DocbookPackage.BIBLIOMSET_TYPE__PUBLISHERNAME:
				return getPublishername();
			case DocbookPackage.BIBLIOMSET_TYPE__RELEASEINFO:
				return getReleaseinfo();
			case DocbookPackage.BIBLIOMSET_TYPE__REVHISTORY:
				return getRevhistory();
			case DocbookPackage.BIBLIOMSET_TYPE__SERIESVOLNUMS:
				return getSeriesvolnums();
			case DocbookPackage.BIBLIOMSET_TYPE__SUBJECTSET:
				return getSubjectset();
			case DocbookPackage.BIBLIOMSET_TYPE__VOLUMENUM:
				return getVolumenum();
			case DocbookPackage.BIBLIOMSET_TYPE__EXTENDEDLINK:
				return getExtendedlink();
			case DocbookPackage.BIBLIOMSET_TYPE__BIBLIOMISC:
				return getBibliomisc();
			case DocbookPackage.BIBLIOMSET_TYPE__BIBLIOMSET:
				return getBibliomset();
			case DocbookPackage.BIBLIOMSET_TYPE__BIBLIORELATION:
				return getBibliorelation();
			case DocbookPackage.BIBLIOMSET_TYPE__BIBLIOSET:
				return getBiblioset();
			case DocbookPackage.BIBLIOMSET_TYPE__ITERMSET:
				return getItermset();
			case DocbookPackage.BIBLIOMSET_TYPE__PRODUCTNAME:
				return getProductname();
			case DocbookPackage.BIBLIOMSET_TYPE__PRODUCTNUMBER:
				return getProductnumber();
			case DocbookPackage.BIBLIOMSET_TYPE__ABBREV:
				return getAbbrev();
			case DocbookPackage.BIBLIOMSET_TYPE__ACRONYM:
				return getAcronym();
			case DocbookPackage.BIBLIOMSET_TYPE__EMPHASIS:
				return getEmphasis();
			case DocbookPackage.BIBLIOMSET_TYPE__FOOTNOTE:
				return getFootnote();
			case DocbookPackage.BIBLIOMSET_TYPE__FOOTNOTEREF:
				return getFootnoteref();
			case DocbookPackage.BIBLIOMSET_TYPE__FOREIGNPHRASE:
				return getForeignphrase();
			case DocbookPackage.BIBLIOMSET_TYPE__QUOTE:
				return getQuote();
			case DocbookPackage.BIBLIOMSET_TYPE__WORDASWORD:
				return getWordasword();
			case DocbookPackage.BIBLIOMSET_TYPE__FIRSTTERM:
				return getFirstterm();
			case DocbookPackage.BIBLIOMSET_TYPE__GLOSSTERM:
				return getGlossterm();
			case DocbookPackage.BIBLIOMSET_TYPE__COREF:
				return getCoref();
			case DocbookPackage.BIBLIOMSET_TYPE__CITEREFENTRY:
				return getCiterefentry();
			case DocbookPackage.BIBLIOMSET_TYPE__CITETITLE:
				return getCitetitle();
			case DocbookPackage.BIBLIOMSET_TYPE__CITEBIBLIOID:
				return getCitebiblioid();
			case DocbookPackage.BIBLIOMSET_TYPE__PERSON:
				return getPerson();
			case DocbookPackage.BIBLIOMSET_TYPE__PERSONBLURB:
				return getPersonblurb();
			case DocbookPackage.BIBLIOMSET_TYPE__PERSONNAME:
				return getPersonname();
			case DocbookPackage.BIBLIOMSET_TYPE__SUBTITLE:
				return getSubtitle();
			case DocbookPackage.BIBLIOMSET_TYPE__TITLE:
				return getTitle();
			case DocbookPackage.BIBLIOMSET_TYPE__TITLEABBREV:
				return getTitleabbrev();
			case DocbookPackage.BIBLIOMSET_TYPE__ACTUATE:
				return getActuate();
			case DocbookPackage.BIBLIOMSET_TYPE__ANNOTATIONS:
				return getAnnotations();
			case DocbookPackage.BIBLIOMSET_TYPE__ARCH:
				return getArch();
			case DocbookPackage.BIBLIOMSET_TYPE__ARCROLE:
				return getArcrole();
			case DocbookPackage.BIBLIOMSET_TYPE__AUDIENCE:
				return getAudience();
			case DocbookPackage.BIBLIOMSET_TYPE__BASE:
				return getBase();
			case DocbookPackage.BIBLIOMSET_TYPE__CONDITION:
				return getCondition();
			case DocbookPackage.BIBLIOMSET_TYPE__CONFORMANCE:
				return getConformance();
			case DocbookPackage.BIBLIOMSET_TYPE__DIR:
				return getDir();
			case DocbookPackage.BIBLIOMSET_TYPE__HREF:
				return getHref();
			case DocbookPackage.BIBLIOMSET_TYPE__ID:
				return getId();
			case DocbookPackage.BIBLIOMSET_TYPE__LANG:
				return getLang();
			case DocbookPackage.BIBLIOMSET_TYPE__LINKEND:
				return getLinkend();
			case DocbookPackage.BIBLIOMSET_TYPE__OS:
				return getOs();
			case DocbookPackage.BIBLIOMSET_TYPE__RELATION:
				return getRelation();
			case DocbookPackage.BIBLIOMSET_TYPE__REMAP:
				return getRemap();
			case DocbookPackage.BIBLIOMSET_TYPE__REVISION:
				return getRevision();
			case DocbookPackage.BIBLIOMSET_TYPE__REVISIONFLAG:
				return getRevisionflag();
			case DocbookPackage.BIBLIOMSET_TYPE__ROLE:
				return getRole();
			case DocbookPackage.BIBLIOMSET_TYPE__ROLE1:
				return getRole1();
			case DocbookPackage.BIBLIOMSET_TYPE__SECURITY:
				return getSecurity();
			case DocbookPackage.BIBLIOMSET_TYPE__SHOW:
				return getShow();
			case DocbookPackage.BIBLIOMSET_TYPE__TITLE1:
				return getTitle1();
			case DocbookPackage.BIBLIOMSET_TYPE__TYPE:
				return getType();
			case DocbookPackage.BIBLIOMSET_TYPE__USERLEVEL:
				return getUserlevel();
			case DocbookPackage.BIBLIOMSET_TYPE__VENDOR:
				return getVendor();
			case DocbookPackage.BIBLIOMSET_TYPE__VERSION:
				return getVersion();
			case DocbookPackage.BIBLIOMSET_TYPE__WORDSIZE:
				return getWordsize();
			case DocbookPackage.BIBLIOMSET_TYPE__XREFLABEL:
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
			case DocbookPackage.BIBLIOMSET_TYPE__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case DocbookPackage.BIBLIOMSET_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case DocbookPackage.BIBLIOMSET_TYPE__INLINEMEDIAOBJECT:
				getInlinemediaobject().clear();
				getInlinemediaobject().addAll((Collection<? extends InlinemediaobjectType>)newValue);
				return;
			case DocbookPackage.BIBLIOMSET_TYPE__REMARK:
				getRemark().clear();
				getRemark().addAll((Collection<? extends RemarkType>)newValue);
				return;
			case DocbookPackage.BIBLIOMSET_TYPE__SUPERSCRIPT:
				getSuperscript().clear();
				getSuperscript().addAll((Collection<? extends SuperscriptType>)newValue);
				return;
			case DocbookPackage.BIBLIOMSET_TYPE__SUBSCRIPT:
				getSubscript().clear();
				getSubscript().addAll((Collection<? extends SubscriptType>)newValue);
				return;
			case DocbookPackage.BIBLIOMSET_TYPE__XREF:
				getXref().clear();
				getXref().addAll((Collection<? extends XrefType>)newValue);
				return;
			case DocbookPackage.BIBLIOMSET_TYPE__LINK:
				getLink().clear();
				getLink().addAll((Collection<? extends LinkType>)newValue);
				return;
			case DocbookPackage.BIBLIOMSET_TYPE__OLINK:
				getOlink().clear();
				getOlink().addAll((Collection<? extends OlinkType>)newValue);
				return;
			case DocbookPackage.BIBLIOMSET_TYPE__ANCHOR:
				getAnchor().clear();
				getAnchor().addAll((Collection<? extends AnchorType>)newValue);
				return;
			case DocbookPackage.BIBLIOMSET_TYPE__BIBLIOREF:
				getBiblioref().clear();
				getBiblioref().addAll((Collection<? extends BibliorefType>)newValue);
				return;
			case DocbookPackage.BIBLIOMSET_TYPE__ALT:
				getAlt().clear();
				getAlt().addAll((Collection<? extends AltType>)newValue);
				return;
			case DocbookPackage.BIBLIOMSET_TYPE__ANNOTATION:
				getAnnotation().clear();
				getAnnotation().addAll((Collection<? extends AnnotationType>)newValue);
				return;
			case DocbookPackage.BIBLIOMSET_TYPE__INDEXTERM:
				getIndexterm().clear();
				getIndexterm().addAll((Collection<? extends IndextermType>)newValue);
				return;
			case DocbookPackage.BIBLIOMSET_TYPE__PHRASE:
				getPhrase().clear();
				getPhrase().addAll((Collection<? extends PhraseType>)newValue);
				return;
			case DocbookPackage.BIBLIOMSET_TYPE__REPLACEABLE:
				getReplaceable().clear();
				getReplaceable().addAll((Collection<? extends ReplaceableType>)newValue);
				return;
			case DocbookPackage.BIBLIOMSET_TYPE__ABSTRACT:
				getAbstract().clear();
				getAbstract().addAll((Collection<? extends AbstractType>)newValue);
				return;
			case DocbookPackage.BIBLIOMSET_TYPE__ADDRESS:
				getAddress().clear();
				getAddress().addAll((Collection<? extends AddressType>)newValue);
				return;
			case DocbookPackage.BIBLIOMSET_TYPE__ARTPAGENUMS:
				getArtpagenums().clear();
				getArtpagenums().addAll((Collection<? extends ArtpagenumsType>)newValue);
				return;
			case DocbookPackage.BIBLIOMSET_TYPE__AUTHOR:
				getAuthor().clear();
				getAuthor().addAll((Collection<? extends AuthorType>)newValue);
				return;
			case DocbookPackage.BIBLIOMSET_TYPE__AUTHORGROUP:
				getAuthorgroup().clear();
				getAuthorgroup().addAll((Collection<? extends AuthorgroupType>)newValue);
				return;
			case DocbookPackage.BIBLIOMSET_TYPE__AUTHORINITIALS:
				getAuthorinitials().clear();
				getAuthorinitials().addAll((Collection<? extends AuthorinitialsType>)newValue);
				return;
			case DocbookPackage.BIBLIOMSET_TYPE__BIBLIOCOVERAGE:
				getBibliocoverage().clear();
				getBibliocoverage().addAll((Collection<? extends BibliocoverageType>)newValue);
				return;
			case DocbookPackage.BIBLIOMSET_TYPE__BIBLIOID:
				getBiblioid().clear();
				getBiblioid().addAll((Collection<? extends BiblioidType>)newValue);
				return;
			case DocbookPackage.BIBLIOMSET_TYPE__BIBLIOSOURCE:
				getBibliosource().clear();
				getBibliosource().addAll((Collection<? extends BibliosourceType>)newValue);
				return;
			case DocbookPackage.BIBLIOMSET_TYPE__COLLAB:
				getCollab().clear();
				getCollab().addAll((Collection<? extends CollabType>)newValue);
				return;
			case DocbookPackage.BIBLIOMSET_TYPE__CONFGROUP:
				getConfgroup().clear();
				getConfgroup().addAll((Collection<? extends ConfgroupType>)newValue);
				return;
			case DocbookPackage.BIBLIOMSET_TYPE__CONTRACTSPONSOR:
				getContractsponsor().clear();
				getContractsponsor().addAll((Collection<? extends ContractsponsorType>)newValue);
				return;
			case DocbookPackage.BIBLIOMSET_TYPE__CONTRACTNUM:
				getContractnum().clear();
				getContractnum().addAll((Collection<? extends ContractnumType>)newValue);
				return;
			case DocbookPackage.BIBLIOMSET_TYPE__COPYRIGHT:
				getCopyright().clear();
				getCopyright().addAll((Collection<? extends CopyrightType>)newValue);
				return;
			case DocbookPackage.BIBLIOMSET_TYPE__COVER:
				getCover().clear();
				getCover().addAll((Collection<? extends CoverType>)newValue);
				return;
			case DocbookPackage.BIBLIOMSET_TYPE__DATE:
				getDate().clear();
				getDate().addAll((Collection<? extends DateType>)newValue);
				return;
			case DocbookPackage.BIBLIOMSET_TYPE__EDITION:
				getEdition().clear();
				getEdition().addAll((Collection<? extends EditionType>)newValue);
				return;
			case DocbookPackage.BIBLIOMSET_TYPE__EDITOR:
				getEditor().clear();
				getEditor().addAll((Collection<? extends EditorType>)newValue);
				return;
			case DocbookPackage.BIBLIOMSET_TYPE__ISSUENUM:
				getIssuenum().clear();
				getIssuenum().addAll((Collection<? extends IssuenumType>)newValue);
				return;
			case DocbookPackage.BIBLIOMSET_TYPE__KEYWORDSET:
				getKeywordset().clear();
				getKeywordset().addAll((Collection<? extends KeywordsetType>)newValue);
				return;
			case DocbookPackage.BIBLIOMSET_TYPE__LEGALNOTICE:
				getLegalnotice().clear();
				getLegalnotice().addAll((Collection<? extends LegalnoticeType>)newValue);
				return;
			case DocbookPackage.BIBLIOMSET_TYPE__MEDIAOBJECT:
				getMediaobject().clear();
				getMediaobject().addAll((Collection<? extends MediaobjectType>)newValue);
				return;
			case DocbookPackage.BIBLIOMSET_TYPE__ORG:
				getOrg().clear();
				getOrg().addAll((Collection<? extends OrgType>)newValue);
				return;
			case DocbookPackage.BIBLIOMSET_TYPE__ORGNAME:
				getOrgname().clear();
				getOrgname().addAll((Collection<? extends OrgnameType>)newValue);
				return;
			case DocbookPackage.BIBLIOMSET_TYPE__OTHERCREDIT:
				getOthercredit().clear();
				getOthercredit().addAll((Collection<? extends OthercreditType>)newValue);
				return;
			case DocbookPackage.BIBLIOMSET_TYPE__PAGENUMS:
				getPagenums().clear();
				getPagenums().addAll((Collection<? extends PagenumsType>)newValue);
				return;
			case DocbookPackage.BIBLIOMSET_TYPE__PRINTHISTORY:
				getPrinthistory().clear();
				getPrinthistory().addAll((Collection<? extends PrinthistoryType>)newValue);
				return;
			case DocbookPackage.BIBLIOMSET_TYPE__PUBDATE:
				getPubdate().clear();
				getPubdate().addAll((Collection<? extends PubdateType>)newValue);
				return;
			case DocbookPackage.BIBLIOMSET_TYPE__PUBLISHER:
				getPublisher().clear();
				getPublisher().addAll((Collection<? extends PublisherType>)newValue);
				return;
			case DocbookPackage.BIBLIOMSET_TYPE__PUBLISHERNAME:
				getPublishername().clear();
				getPublishername().addAll((Collection<? extends PublishernameType>)newValue);
				return;
			case DocbookPackage.BIBLIOMSET_TYPE__RELEASEINFO:
				getReleaseinfo().clear();
				getReleaseinfo().addAll((Collection<? extends ReleaseinfoType>)newValue);
				return;
			case DocbookPackage.BIBLIOMSET_TYPE__REVHISTORY:
				getRevhistory().clear();
				getRevhistory().addAll((Collection<? extends RevhistoryType>)newValue);
				return;
			case DocbookPackage.BIBLIOMSET_TYPE__SERIESVOLNUMS:
				getSeriesvolnums().clear();
				getSeriesvolnums().addAll((Collection<? extends SeriesvolnumsType>)newValue);
				return;
			case DocbookPackage.BIBLIOMSET_TYPE__SUBJECTSET:
				getSubjectset().clear();
				getSubjectset().addAll((Collection<? extends SubjectsetType>)newValue);
				return;
			case DocbookPackage.BIBLIOMSET_TYPE__VOLUMENUM:
				getVolumenum().clear();
				getVolumenum().addAll((Collection<? extends VolumenumType>)newValue);
				return;
			case DocbookPackage.BIBLIOMSET_TYPE__EXTENDEDLINK:
				getExtendedlink().clear();
				getExtendedlink().addAll((Collection<? extends ExtendedlinkType>)newValue);
				return;
			case DocbookPackage.BIBLIOMSET_TYPE__BIBLIOMISC:
				getBibliomisc().clear();
				getBibliomisc().addAll((Collection<? extends BibliomiscType>)newValue);
				return;
			case DocbookPackage.BIBLIOMSET_TYPE__BIBLIOMSET:
				getBibliomset().clear();
				getBibliomset().addAll((Collection<? extends BibliomsetType>)newValue);
				return;
			case DocbookPackage.BIBLIOMSET_TYPE__BIBLIORELATION:
				getBibliorelation().clear();
				getBibliorelation().addAll((Collection<? extends BibliorelationType>)newValue);
				return;
			case DocbookPackage.BIBLIOMSET_TYPE__BIBLIOSET:
				getBiblioset().clear();
				getBiblioset().addAll((Collection<? extends BibliosetType>)newValue);
				return;
			case DocbookPackage.BIBLIOMSET_TYPE__ITERMSET:
				getItermset().clear();
				getItermset().addAll((Collection<? extends ItermsetType>)newValue);
				return;
			case DocbookPackage.BIBLIOMSET_TYPE__PRODUCTNAME:
				getProductname().clear();
				getProductname().addAll((Collection<? extends ProductnameType>)newValue);
				return;
			case DocbookPackage.BIBLIOMSET_TYPE__PRODUCTNUMBER:
				getProductnumber().clear();
				getProductnumber().addAll((Collection<? extends ProductnumberType>)newValue);
				return;
			case DocbookPackage.BIBLIOMSET_TYPE__ABBREV:
				getAbbrev().clear();
				getAbbrev().addAll((Collection<? extends AbbrevType>)newValue);
				return;
			case DocbookPackage.BIBLIOMSET_TYPE__ACRONYM:
				getAcronym().clear();
				getAcronym().addAll((Collection<? extends AcronymType>)newValue);
				return;
			case DocbookPackage.BIBLIOMSET_TYPE__EMPHASIS:
				getEmphasis().clear();
				getEmphasis().addAll((Collection<? extends EmphasisType>)newValue);
				return;
			case DocbookPackage.BIBLIOMSET_TYPE__FOOTNOTE:
				getFootnote().clear();
				getFootnote().addAll((Collection<? extends FootnoteType>)newValue);
				return;
			case DocbookPackage.BIBLIOMSET_TYPE__FOOTNOTEREF:
				getFootnoteref().clear();
				getFootnoteref().addAll((Collection<? extends FootnoterefType>)newValue);
				return;
			case DocbookPackage.BIBLIOMSET_TYPE__FOREIGNPHRASE:
				getForeignphrase().clear();
				getForeignphrase().addAll((Collection<? extends ForeignphraseType>)newValue);
				return;
			case DocbookPackage.BIBLIOMSET_TYPE__QUOTE:
				getQuote().clear();
				getQuote().addAll((Collection<? extends QuoteType>)newValue);
				return;
			case DocbookPackage.BIBLIOMSET_TYPE__WORDASWORD:
				getWordasword().clear();
				getWordasword().addAll((Collection<? extends WordaswordType>)newValue);
				return;
			case DocbookPackage.BIBLIOMSET_TYPE__FIRSTTERM:
				getFirstterm().clear();
				getFirstterm().addAll((Collection<? extends FirsttermType>)newValue);
				return;
			case DocbookPackage.BIBLIOMSET_TYPE__GLOSSTERM:
				getGlossterm().clear();
				getGlossterm().addAll((Collection<? extends GlosstermType>)newValue);
				return;
			case DocbookPackage.BIBLIOMSET_TYPE__COREF:
				getCoref().clear();
				getCoref().addAll((Collection<? extends CorefType>)newValue);
				return;
			case DocbookPackage.BIBLIOMSET_TYPE__CITEREFENTRY:
				getCiterefentry().clear();
				getCiterefentry().addAll((Collection<? extends CiterefentryType>)newValue);
				return;
			case DocbookPackage.BIBLIOMSET_TYPE__CITETITLE:
				getCitetitle().clear();
				getCitetitle().addAll((Collection<? extends CitetitleType>)newValue);
				return;
			case DocbookPackage.BIBLIOMSET_TYPE__CITEBIBLIOID:
				getCitebiblioid().clear();
				getCitebiblioid().addAll((Collection<? extends CitebiblioidType>)newValue);
				return;
			case DocbookPackage.BIBLIOMSET_TYPE__PERSON:
				getPerson().clear();
				getPerson().addAll((Collection<? extends PersonType>)newValue);
				return;
			case DocbookPackage.BIBLIOMSET_TYPE__PERSONBLURB:
				getPersonblurb().clear();
				getPersonblurb().addAll((Collection<? extends PersonblurbType>)newValue);
				return;
			case DocbookPackage.BIBLIOMSET_TYPE__PERSONNAME:
				getPersonname().clear();
				getPersonname().addAll((Collection<? extends PersonnameType>)newValue);
				return;
			case DocbookPackage.BIBLIOMSET_TYPE__SUBTITLE:
				getSubtitle().clear();
				getSubtitle().addAll((Collection<? extends SubtitleType>)newValue);
				return;
			case DocbookPackage.BIBLIOMSET_TYPE__TITLE:
				getTitle().clear();
				getTitle().addAll((Collection<? extends TitleType>)newValue);
				return;
			case DocbookPackage.BIBLIOMSET_TYPE__TITLEABBREV:
				getTitleabbrev().clear();
				getTitleabbrev().addAll((Collection<? extends TitleabbrevType>)newValue);
				return;
			case DocbookPackage.BIBLIOMSET_TYPE__ACTUATE:
				setActuate((ActuateType)newValue);
				return;
			case DocbookPackage.BIBLIOMSET_TYPE__ANNOTATIONS:
				setAnnotations(newValue);
				return;
			case DocbookPackage.BIBLIOMSET_TYPE__ARCH:
				setArch(newValue);
				return;
			case DocbookPackage.BIBLIOMSET_TYPE__ARCROLE:
				setArcrole(newValue);
				return;
			case DocbookPackage.BIBLIOMSET_TYPE__AUDIENCE:
				setAudience(newValue);
				return;
			case DocbookPackage.BIBLIOMSET_TYPE__BASE:
				setBase(newValue);
				return;
			case DocbookPackage.BIBLIOMSET_TYPE__CONDITION:
				setCondition(newValue);
				return;
			case DocbookPackage.BIBLIOMSET_TYPE__CONFORMANCE:
				setConformance(newValue);
				return;
			case DocbookPackage.BIBLIOMSET_TYPE__DIR:
				setDir((DirType)newValue);
				return;
			case DocbookPackage.BIBLIOMSET_TYPE__HREF:
				setHref(newValue);
				return;
			case DocbookPackage.BIBLIOMSET_TYPE__ID:
				setId((String)newValue);
				return;
			case DocbookPackage.BIBLIOMSET_TYPE__LANG:
				setLang(newValue);
				return;
			case DocbookPackage.BIBLIOMSET_TYPE__LINKEND:
				setLinkend((String)newValue);
				return;
			case DocbookPackage.BIBLIOMSET_TYPE__OS:
				setOs(newValue);
				return;
			case DocbookPackage.BIBLIOMSET_TYPE__RELATION:
				setRelation(newValue);
				return;
			case DocbookPackage.BIBLIOMSET_TYPE__REMAP:
				setRemap(newValue);
				return;
			case DocbookPackage.BIBLIOMSET_TYPE__REVISION:
				setRevision(newValue);
				return;
			case DocbookPackage.BIBLIOMSET_TYPE__REVISIONFLAG:
				setRevisionflag((RevisionflagType)newValue);
				return;
			case DocbookPackage.BIBLIOMSET_TYPE__ROLE:
				setRole(newValue);
				return;
			case DocbookPackage.BIBLIOMSET_TYPE__ROLE1:
				setRole1(newValue);
				return;
			case DocbookPackage.BIBLIOMSET_TYPE__SECURITY:
				setSecurity(newValue);
				return;
			case DocbookPackage.BIBLIOMSET_TYPE__SHOW:
				setShow((ShowType)newValue);
				return;
			case DocbookPackage.BIBLIOMSET_TYPE__TITLE1:
				setTitle1(newValue);
				return;
			case DocbookPackage.BIBLIOMSET_TYPE__TYPE:
				setType(newValue);
				return;
			case DocbookPackage.BIBLIOMSET_TYPE__USERLEVEL:
				setUserlevel(newValue);
				return;
			case DocbookPackage.BIBLIOMSET_TYPE__VENDOR:
				setVendor(newValue);
				return;
			case DocbookPackage.BIBLIOMSET_TYPE__VERSION:
				setVersion(newValue);
				return;
			case DocbookPackage.BIBLIOMSET_TYPE__WORDSIZE:
				setWordsize(newValue);
				return;
			case DocbookPackage.BIBLIOMSET_TYPE__XREFLABEL:
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
			case DocbookPackage.BIBLIOMSET_TYPE__MIXED:
				getMixed().clear();
				return;
			case DocbookPackage.BIBLIOMSET_TYPE__GROUP:
				getGroup().clear();
				return;
			case DocbookPackage.BIBLIOMSET_TYPE__INLINEMEDIAOBJECT:
				getInlinemediaobject().clear();
				return;
			case DocbookPackage.BIBLIOMSET_TYPE__REMARK:
				getRemark().clear();
				return;
			case DocbookPackage.BIBLIOMSET_TYPE__SUPERSCRIPT:
				getSuperscript().clear();
				return;
			case DocbookPackage.BIBLIOMSET_TYPE__SUBSCRIPT:
				getSubscript().clear();
				return;
			case DocbookPackage.BIBLIOMSET_TYPE__XREF:
				getXref().clear();
				return;
			case DocbookPackage.BIBLIOMSET_TYPE__LINK:
				getLink().clear();
				return;
			case DocbookPackage.BIBLIOMSET_TYPE__OLINK:
				getOlink().clear();
				return;
			case DocbookPackage.BIBLIOMSET_TYPE__ANCHOR:
				getAnchor().clear();
				return;
			case DocbookPackage.BIBLIOMSET_TYPE__BIBLIOREF:
				getBiblioref().clear();
				return;
			case DocbookPackage.BIBLIOMSET_TYPE__ALT:
				getAlt().clear();
				return;
			case DocbookPackage.BIBLIOMSET_TYPE__ANNOTATION:
				getAnnotation().clear();
				return;
			case DocbookPackage.BIBLIOMSET_TYPE__INDEXTERM:
				getIndexterm().clear();
				return;
			case DocbookPackage.BIBLIOMSET_TYPE__PHRASE:
				getPhrase().clear();
				return;
			case DocbookPackage.BIBLIOMSET_TYPE__REPLACEABLE:
				getReplaceable().clear();
				return;
			case DocbookPackage.BIBLIOMSET_TYPE__ABSTRACT:
				getAbstract().clear();
				return;
			case DocbookPackage.BIBLIOMSET_TYPE__ADDRESS:
				getAddress().clear();
				return;
			case DocbookPackage.BIBLIOMSET_TYPE__ARTPAGENUMS:
				getArtpagenums().clear();
				return;
			case DocbookPackage.BIBLIOMSET_TYPE__AUTHOR:
				getAuthor().clear();
				return;
			case DocbookPackage.BIBLIOMSET_TYPE__AUTHORGROUP:
				getAuthorgroup().clear();
				return;
			case DocbookPackage.BIBLIOMSET_TYPE__AUTHORINITIALS:
				getAuthorinitials().clear();
				return;
			case DocbookPackage.BIBLIOMSET_TYPE__BIBLIOCOVERAGE:
				getBibliocoverage().clear();
				return;
			case DocbookPackage.BIBLIOMSET_TYPE__BIBLIOID:
				getBiblioid().clear();
				return;
			case DocbookPackage.BIBLIOMSET_TYPE__BIBLIOSOURCE:
				getBibliosource().clear();
				return;
			case DocbookPackage.BIBLIOMSET_TYPE__COLLAB:
				getCollab().clear();
				return;
			case DocbookPackage.BIBLIOMSET_TYPE__CONFGROUP:
				getConfgroup().clear();
				return;
			case DocbookPackage.BIBLIOMSET_TYPE__CONTRACTSPONSOR:
				getContractsponsor().clear();
				return;
			case DocbookPackage.BIBLIOMSET_TYPE__CONTRACTNUM:
				getContractnum().clear();
				return;
			case DocbookPackage.BIBLIOMSET_TYPE__COPYRIGHT:
				getCopyright().clear();
				return;
			case DocbookPackage.BIBLIOMSET_TYPE__COVER:
				getCover().clear();
				return;
			case DocbookPackage.BIBLIOMSET_TYPE__DATE:
				getDate().clear();
				return;
			case DocbookPackage.BIBLIOMSET_TYPE__EDITION:
				getEdition().clear();
				return;
			case DocbookPackage.BIBLIOMSET_TYPE__EDITOR:
				getEditor().clear();
				return;
			case DocbookPackage.BIBLIOMSET_TYPE__ISSUENUM:
				getIssuenum().clear();
				return;
			case DocbookPackage.BIBLIOMSET_TYPE__KEYWORDSET:
				getKeywordset().clear();
				return;
			case DocbookPackage.BIBLIOMSET_TYPE__LEGALNOTICE:
				getLegalnotice().clear();
				return;
			case DocbookPackage.BIBLIOMSET_TYPE__MEDIAOBJECT:
				getMediaobject().clear();
				return;
			case DocbookPackage.BIBLIOMSET_TYPE__ORG:
				getOrg().clear();
				return;
			case DocbookPackage.BIBLIOMSET_TYPE__ORGNAME:
				getOrgname().clear();
				return;
			case DocbookPackage.BIBLIOMSET_TYPE__OTHERCREDIT:
				getOthercredit().clear();
				return;
			case DocbookPackage.BIBLIOMSET_TYPE__PAGENUMS:
				getPagenums().clear();
				return;
			case DocbookPackage.BIBLIOMSET_TYPE__PRINTHISTORY:
				getPrinthistory().clear();
				return;
			case DocbookPackage.BIBLIOMSET_TYPE__PUBDATE:
				getPubdate().clear();
				return;
			case DocbookPackage.BIBLIOMSET_TYPE__PUBLISHER:
				getPublisher().clear();
				return;
			case DocbookPackage.BIBLIOMSET_TYPE__PUBLISHERNAME:
				getPublishername().clear();
				return;
			case DocbookPackage.BIBLIOMSET_TYPE__RELEASEINFO:
				getReleaseinfo().clear();
				return;
			case DocbookPackage.BIBLIOMSET_TYPE__REVHISTORY:
				getRevhistory().clear();
				return;
			case DocbookPackage.BIBLIOMSET_TYPE__SERIESVOLNUMS:
				getSeriesvolnums().clear();
				return;
			case DocbookPackage.BIBLIOMSET_TYPE__SUBJECTSET:
				getSubjectset().clear();
				return;
			case DocbookPackage.BIBLIOMSET_TYPE__VOLUMENUM:
				getVolumenum().clear();
				return;
			case DocbookPackage.BIBLIOMSET_TYPE__EXTENDEDLINK:
				getExtendedlink().clear();
				return;
			case DocbookPackage.BIBLIOMSET_TYPE__BIBLIOMISC:
				getBibliomisc().clear();
				return;
			case DocbookPackage.BIBLIOMSET_TYPE__BIBLIOMSET:
				getBibliomset().clear();
				return;
			case DocbookPackage.BIBLIOMSET_TYPE__BIBLIORELATION:
				getBibliorelation().clear();
				return;
			case DocbookPackage.BIBLIOMSET_TYPE__BIBLIOSET:
				getBiblioset().clear();
				return;
			case DocbookPackage.BIBLIOMSET_TYPE__ITERMSET:
				getItermset().clear();
				return;
			case DocbookPackage.BIBLIOMSET_TYPE__PRODUCTNAME:
				getProductname().clear();
				return;
			case DocbookPackage.BIBLIOMSET_TYPE__PRODUCTNUMBER:
				getProductnumber().clear();
				return;
			case DocbookPackage.BIBLIOMSET_TYPE__ABBREV:
				getAbbrev().clear();
				return;
			case DocbookPackage.BIBLIOMSET_TYPE__ACRONYM:
				getAcronym().clear();
				return;
			case DocbookPackage.BIBLIOMSET_TYPE__EMPHASIS:
				getEmphasis().clear();
				return;
			case DocbookPackage.BIBLIOMSET_TYPE__FOOTNOTE:
				getFootnote().clear();
				return;
			case DocbookPackage.BIBLIOMSET_TYPE__FOOTNOTEREF:
				getFootnoteref().clear();
				return;
			case DocbookPackage.BIBLIOMSET_TYPE__FOREIGNPHRASE:
				getForeignphrase().clear();
				return;
			case DocbookPackage.BIBLIOMSET_TYPE__QUOTE:
				getQuote().clear();
				return;
			case DocbookPackage.BIBLIOMSET_TYPE__WORDASWORD:
				getWordasword().clear();
				return;
			case DocbookPackage.BIBLIOMSET_TYPE__FIRSTTERM:
				getFirstterm().clear();
				return;
			case DocbookPackage.BIBLIOMSET_TYPE__GLOSSTERM:
				getGlossterm().clear();
				return;
			case DocbookPackage.BIBLIOMSET_TYPE__COREF:
				getCoref().clear();
				return;
			case DocbookPackage.BIBLIOMSET_TYPE__CITEREFENTRY:
				getCiterefentry().clear();
				return;
			case DocbookPackage.BIBLIOMSET_TYPE__CITETITLE:
				getCitetitle().clear();
				return;
			case DocbookPackage.BIBLIOMSET_TYPE__CITEBIBLIOID:
				getCitebiblioid().clear();
				return;
			case DocbookPackage.BIBLIOMSET_TYPE__PERSON:
				getPerson().clear();
				return;
			case DocbookPackage.BIBLIOMSET_TYPE__PERSONBLURB:
				getPersonblurb().clear();
				return;
			case DocbookPackage.BIBLIOMSET_TYPE__PERSONNAME:
				getPersonname().clear();
				return;
			case DocbookPackage.BIBLIOMSET_TYPE__SUBTITLE:
				getSubtitle().clear();
				return;
			case DocbookPackage.BIBLIOMSET_TYPE__TITLE:
				getTitle().clear();
				return;
			case DocbookPackage.BIBLIOMSET_TYPE__TITLEABBREV:
				getTitleabbrev().clear();
				return;
			case DocbookPackage.BIBLIOMSET_TYPE__ACTUATE:
				unsetActuate();
				return;
			case DocbookPackage.BIBLIOMSET_TYPE__ANNOTATIONS:
				setAnnotations(ANNOTATIONS_EDEFAULT);
				return;
			case DocbookPackage.BIBLIOMSET_TYPE__ARCH:
				setArch(ARCH_EDEFAULT);
				return;
			case DocbookPackage.BIBLIOMSET_TYPE__ARCROLE:
				setArcrole(ARCROLE_EDEFAULT);
				return;
			case DocbookPackage.BIBLIOMSET_TYPE__AUDIENCE:
				setAudience(AUDIENCE_EDEFAULT);
				return;
			case DocbookPackage.BIBLIOMSET_TYPE__BASE:
				setBase(BASE_EDEFAULT);
				return;
			case DocbookPackage.BIBLIOMSET_TYPE__CONDITION:
				setCondition(CONDITION_EDEFAULT);
				return;
			case DocbookPackage.BIBLIOMSET_TYPE__CONFORMANCE:
				setConformance(CONFORMANCE_EDEFAULT);
				return;
			case DocbookPackage.BIBLIOMSET_TYPE__DIR:
				unsetDir();
				return;
			case DocbookPackage.BIBLIOMSET_TYPE__HREF:
				setHref(HREF_EDEFAULT);
				return;
			case DocbookPackage.BIBLIOMSET_TYPE__ID:
				setId(ID_EDEFAULT);
				return;
			case DocbookPackage.BIBLIOMSET_TYPE__LANG:
				setLang(LANG_EDEFAULT);
				return;
			case DocbookPackage.BIBLIOMSET_TYPE__LINKEND:
				setLinkend(LINKEND_EDEFAULT);
				return;
			case DocbookPackage.BIBLIOMSET_TYPE__OS:
				setOs(OS_EDEFAULT);
				return;
			case DocbookPackage.BIBLIOMSET_TYPE__RELATION:
				setRelation(RELATION_EDEFAULT);
				return;
			case DocbookPackage.BIBLIOMSET_TYPE__REMAP:
				setRemap(REMAP_EDEFAULT);
				return;
			case DocbookPackage.BIBLIOMSET_TYPE__REVISION:
				setRevision(REVISION_EDEFAULT);
				return;
			case DocbookPackage.BIBLIOMSET_TYPE__REVISIONFLAG:
				unsetRevisionflag();
				return;
			case DocbookPackage.BIBLIOMSET_TYPE__ROLE:
				setRole(ROLE_EDEFAULT);
				return;
			case DocbookPackage.BIBLIOMSET_TYPE__ROLE1:
				setRole1(ROLE1_EDEFAULT);
				return;
			case DocbookPackage.BIBLIOMSET_TYPE__SECURITY:
				setSecurity(SECURITY_EDEFAULT);
				return;
			case DocbookPackage.BIBLIOMSET_TYPE__SHOW:
				unsetShow();
				return;
			case DocbookPackage.BIBLIOMSET_TYPE__TITLE1:
				setTitle1(TITLE1_EDEFAULT);
				return;
			case DocbookPackage.BIBLIOMSET_TYPE__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case DocbookPackage.BIBLIOMSET_TYPE__USERLEVEL:
				setUserlevel(USERLEVEL_EDEFAULT);
				return;
			case DocbookPackage.BIBLIOMSET_TYPE__VENDOR:
				setVendor(VENDOR_EDEFAULT);
				return;
			case DocbookPackage.BIBLIOMSET_TYPE__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case DocbookPackage.BIBLIOMSET_TYPE__WORDSIZE:
				setWordsize(WORDSIZE_EDEFAULT);
				return;
			case DocbookPackage.BIBLIOMSET_TYPE__XREFLABEL:
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
			case DocbookPackage.BIBLIOMSET_TYPE__MIXED:
				return mixed != null && !mixed.isEmpty();
			case DocbookPackage.BIBLIOMSET_TYPE__GROUP:
				return !getGroup().isEmpty();
			case DocbookPackage.BIBLIOMSET_TYPE__INLINEMEDIAOBJECT:
				return !getInlinemediaobject().isEmpty();
			case DocbookPackage.BIBLIOMSET_TYPE__REMARK:
				return !getRemark().isEmpty();
			case DocbookPackage.BIBLIOMSET_TYPE__SUPERSCRIPT:
				return !getSuperscript().isEmpty();
			case DocbookPackage.BIBLIOMSET_TYPE__SUBSCRIPT:
				return !getSubscript().isEmpty();
			case DocbookPackage.BIBLIOMSET_TYPE__XREF:
				return !getXref().isEmpty();
			case DocbookPackage.BIBLIOMSET_TYPE__LINK:
				return !getLink().isEmpty();
			case DocbookPackage.BIBLIOMSET_TYPE__OLINK:
				return !getOlink().isEmpty();
			case DocbookPackage.BIBLIOMSET_TYPE__ANCHOR:
				return !getAnchor().isEmpty();
			case DocbookPackage.BIBLIOMSET_TYPE__BIBLIOREF:
				return !getBiblioref().isEmpty();
			case DocbookPackage.BIBLIOMSET_TYPE__ALT:
				return !getAlt().isEmpty();
			case DocbookPackage.BIBLIOMSET_TYPE__ANNOTATION:
				return !getAnnotation().isEmpty();
			case DocbookPackage.BIBLIOMSET_TYPE__INDEXTERM:
				return !getIndexterm().isEmpty();
			case DocbookPackage.BIBLIOMSET_TYPE__PHRASE:
				return !getPhrase().isEmpty();
			case DocbookPackage.BIBLIOMSET_TYPE__REPLACEABLE:
				return !getReplaceable().isEmpty();
			case DocbookPackage.BIBLIOMSET_TYPE__ABSTRACT:
				return !getAbstract().isEmpty();
			case DocbookPackage.BIBLIOMSET_TYPE__ADDRESS:
				return !getAddress().isEmpty();
			case DocbookPackage.BIBLIOMSET_TYPE__ARTPAGENUMS:
				return !getArtpagenums().isEmpty();
			case DocbookPackage.BIBLIOMSET_TYPE__AUTHOR:
				return !getAuthor().isEmpty();
			case DocbookPackage.BIBLIOMSET_TYPE__AUTHORGROUP:
				return !getAuthorgroup().isEmpty();
			case DocbookPackage.BIBLIOMSET_TYPE__AUTHORINITIALS:
				return !getAuthorinitials().isEmpty();
			case DocbookPackage.BIBLIOMSET_TYPE__BIBLIOCOVERAGE:
				return !getBibliocoverage().isEmpty();
			case DocbookPackage.BIBLIOMSET_TYPE__BIBLIOID:
				return !getBiblioid().isEmpty();
			case DocbookPackage.BIBLIOMSET_TYPE__BIBLIOSOURCE:
				return !getBibliosource().isEmpty();
			case DocbookPackage.BIBLIOMSET_TYPE__COLLAB:
				return !getCollab().isEmpty();
			case DocbookPackage.BIBLIOMSET_TYPE__CONFGROUP:
				return !getConfgroup().isEmpty();
			case DocbookPackage.BIBLIOMSET_TYPE__CONTRACTSPONSOR:
				return !getContractsponsor().isEmpty();
			case DocbookPackage.BIBLIOMSET_TYPE__CONTRACTNUM:
				return !getContractnum().isEmpty();
			case DocbookPackage.BIBLIOMSET_TYPE__COPYRIGHT:
				return !getCopyright().isEmpty();
			case DocbookPackage.BIBLIOMSET_TYPE__COVER:
				return !getCover().isEmpty();
			case DocbookPackage.BIBLIOMSET_TYPE__DATE:
				return !getDate().isEmpty();
			case DocbookPackage.BIBLIOMSET_TYPE__EDITION:
				return !getEdition().isEmpty();
			case DocbookPackage.BIBLIOMSET_TYPE__EDITOR:
				return !getEditor().isEmpty();
			case DocbookPackage.BIBLIOMSET_TYPE__ISSUENUM:
				return !getIssuenum().isEmpty();
			case DocbookPackage.BIBLIOMSET_TYPE__KEYWORDSET:
				return !getKeywordset().isEmpty();
			case DocbookPackage.BIBLIOMSET_TYPE__LEGALNOTICE:
				return !getLegalnotice().isEmpty();
			case DocbookPackage.BIBLIOMSET_TYPE__MEDIAOBJECT:
				return !getMediaobject().isEmpty();
			case DocbookPackage.BIBLIOMSET_TYPE__ORG:
				return !getOrg().isEmpty();
			case DocbookPackage.BIBLIOMSET_TYPE__ORGNAME:
				return !getOrgname().isEmpty();
			case DocbookPackage.BIBLIOMSET_TYPE__OTHERCREDIT:
				return !getOthercredit().isEmpty();
			case DocbookPackage.BIBLIOMSET_TYPE__PAGENUMS:
				return !getPagenums().isEmpty();
			case DocbookPackage.BIBLIOMSET_TYPE__PRINTHISTORY:
				return !getPrinthistory().isEmpty();
			case DocbookPackage.BIBLIOMSET_TYPE__PUBDATE:
				return !getPubdate().isEmpty();
			case DocbookPackage.BIBLIOMSET_TYPE__PUBLISHER:
				return !getPublisher().isEmpty();
			case DocbookPackage.BIBLIOMSET_TYPE__PUBLISHERNAME:
				return !getPublishername().isEmpty();
			case DocbookPackage.BIBLIOMSET_TYPE__RELEASEINFO:
				return !getReleaseinfo().isEmpty();
			case DocbookPackage.BIBLIOMSET_TYPE__REVHISTORY:
				return !getRevhistory().isEmpty();
			case DocbookPackage.BIBLIOMSET_TYPE__SERIESVOLNUMS:
				return !getSeriesvolnums().isEmpty();
			case DocbookPackage.BIBLIOMSET_TYPE__SUBJECTSET:
				return !getSubjectset().isEmpty();
			case DocbookPackage.BIBLIOMSET_TYPE__VOLUMENUM:
				return !getVolumenum().isEmpty();
			case DocbookPackage.BIBLIOMSET_TYPE__EXTENDEDLINK:
				return !getExtendedlink().isEmpty();
			case DocbookPackage.BIBLIOMSET_TYPE__BIBLIOMISC:
				return !getBibliomisc().isEmpty();
			case DocbookPackage.BIBLIOMSET_TYPE__BIBLIOMSET:
				return !getBibliomset().isEmpty();
			case DocbookPackage.BIBLIOMSET_TYPE__BIBLIORELATION:
				return !getBibliorelation().isEmpty();
			case DocbookPackage.BIBLIOMSET_TYPE__BIBLIOSET:
				return !getBiblioset().isEmpty();
			case DocbookPackage.BIBLIOMSET_TYPE__ITERMSET:
				return !getItermset().isEmpty();
			case DocbookPackage.BIBLIOMSET_TYPE__PRODUCTNAME:
				return !getProductname().isEmpty();
			case DocbookPackage.BIBLIOMSET_TYPE__PRODUCTNUMBER:
				return !getProductnumber().isEmpty();
			case DocbookPackage.BIBLIOMSET_TYPE__ABBREV:
				return !getAbbrev().isEmpty();
			case DocbookPackage.BIBLIOMSET_TYPE__ACRONYM:
				return !getAcronym().isEmpty();
			case DocbookPackage.BIBLIOMSET_TYPE__EMPHASIS:
				return !getEmphasis().isEmpty();
			case DocbookPackage.BIBLIOMSET_TYPE__FOOTNOTE:
				return !getFootnote().isEmpty();
			case DocbookPackage.BIBLIOMSET_TYPE__FOOTNOTEREF:
				return !getFootnoteref().isEmpty();
			case DocbookPackage.BIBLIOMSET_TYPE__FOREIGNPHRASE:
				return !getForeignphrase().isEmpty();
			case DocbookPackage.BIBLIOMSET_TYPE__QUOTE:
				return !getQuote().isEmpty();
			case DocbookPackage.BIBLIOMSET_TYPE__WORDASWORD:
				return !getWordasword().isEmpty();
			case DocbookPackage.BIBLIOMSET_TYPE__FIRSTTERM:
				return !getFirstterm().isEmpty();
			case DocbookPackage.BIBLIOMSET_TYPE__GLOSSTERM:
				return !getGlossterm().isEmpty();
			case DocbookPackage.BIBLIOMSET_TYPE__COREF:
				return !getCoref().isEmpty();
			case DocbookPackage.BIBLIOMSET_TYPE__CITEREFENTRY:
				return !getCiterefentry().isEmpty();
			case DocbookPackage.BIBLIOMSET_TYPE__CITETITLE:
				return !getCitetitle().isEmpty();
			case DocbookPackage.BIBLIOMSET_TYPE__CITEBIBLIOID:
				return !getCitebiblioid().isEmpty();
			case DocbookPackage.BIBLIOMSET_TYPE__PERSON:
				return !getPerson().isEmpty();
			case DocbookPackage.BIBLIOMSET_TYPE__PERSONBLURB:
				return !getPersonblurb().isEmpty();
			case DocbookPackage.BIBLIOMSET_TYPE__PERSONNAME:
				return !getPersonname().isEmpty();
			case DocbookPackage.BIBLIOMSET_TYPE__SUBTITLE:
				return !getSubtitle().isEmpty();
			case DocbookPackage.BIBLIOMSET_TYPE__TITLE:
				return !getTitle().isEmpty();
			case DocbookPackage.BIBLIOMSET_TYPE__TITLEABBREV:
				return !getTitleabbrev().isEmpty();
			case DocbookPackage.BIBLIOMSET_TYPE__ACTUATE:
				return isSetActuate();
			case DocbookPackage.BIBLIOMSET_TYPE__ANNOTATIONS:
				return ANNOTATIONS_EDEFAULT == null ? annotations != null : !ANNOTATIONS_EDEFAULT.equals(annotations);
			case DocbookPackage.BIBLIOMSET_TYPE__ARCH:
				return ARCH_EDEFAULT == null ? arch != null : !ARCH_EDEFAULT.equals(arch);
			case DocbookPackage.BIBLIOMSET_TYPE__ARCROLE:
				return ARCROLE_EDEFAULT == null ? arcrole != null : !ARCROLE_EDEFAULT.equals(arcrole);
			case DocbookPackage.BIBLIOMSET_TYPE__AUDIENCE:
				return AUDIENCE_EDEFAULT == null ? audience != null : !AUDIENCE_EDEFAULT.equals(audience);
			case DocbookPackage.BIBLIOMSET_TYPE__BASE:
				return BASE_EDEFAULT == null ? base != null : !BASE_EDEFAULT.equals(base);
			case DocbookPackage.BIBLIOMSET_TYPE__CONDITION:
				return CONDITION_EDEFAULT == null ? condition != null : !CONDITION_EDEFAULT.equals(condition);
			case DocbookPackage.BIBLIOMSET_TYPE__CONFORMANCE:
				return CONFORMANCE_EDEFAULT == null ? conformance != null : !CONFORMANCE_EDEFAULT.equals(conformance);
			case DocbookPackage.BIBLIOMSET_TYPE__DIR:
				return isSetDir();
			case DocbookPackage.BIBLIOMSET_TYPE__HREF:
				return HREF_EDEFAULT == null ? href != null : !HREF_EDEFAULT.equals(href);
			case DocbookPackage.BIBLIOMSET_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case DocbookPackage.BIBLIOMSET_TYPE__LANG:
				return LANG_EDEFAULT == null ? lang != null : !LANG_EDEFAULT.equals(lang);
			case DocbookPackage.BIBLIOMSET_TYPE__LINKEND:
				return LINKEND_EDEFAULT == null ? linkend != null : !LINKEND_EDEFAULT.equals(linkend);
			case DocbookPackage.BIBLIOMSET_TYPE__OS:
				return OS_EDEFAULT == null ? os != null : !OS_EDEFAULT.equals(os);
			case DocbookPackage.BIBLIOMSET_TYPE__RELATION:
				return RELATION_EDEFAULT == null ? relation != null : !RELATION_EDEFAULT.equals(relation);
			case DocbookPackage.BIBLIOMSET_TYPE__REMAP:
				return REMAP_EDEFAULT == null ? remap != null : !REMAP_EDEFAULT.equals(remap);
			case DocbookPackage.BIBLIOMSET_TYPE__REVISION:
				return REVISION_EDEFAULT == null ? revision != null : !REVISION_EDEFAULT.equals(revision);
			case DocbookPackage.BIBLIOMSET_TYPE__REVISIONFLAG:
				return isSetRevisionflag();
			case DocbookPackage.BIBLIOMSET_TYPE__ROLE:
				return ROLE_EDEFAULT == null ? role != null : !ROLE_EDEFAULT.equals(role);
			case DocbookPackage.BIBLIOMSET_TYPE__ROLE1:
				return ROLE1_EDEFAULT == null ? role1 != null : !ROLE1_EDEFAULT.equals(role1);
			case DocbookPackage.BIBLIOMSET_TYPE__SECURITY:
				return SECURITY_EDEFAULT == null ? security != null : !SECURITY_EDEFAULT.equals(security);
			case DocbookPackage.BIBLIOMSET_TYPE__SHOW:
				return isSetShow();
			case DocbookPackage.BIBLIOMSET_TYPE__TITLE1:
				return TITLE1_EDEFAULT == null ? title1 != null : !TITLE1_EDEFAULT.equals(title1);
			case DocbookPackage.BIBLIOMSET_TYPE__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case DocbookPackage.BIBLIOMSET_TYPE__USERLEVEL:
				return USERLEVEL_EDEFAULT == null ? userlevel != null : !USERLEVEL_EDEFAULT.equals(userlevel);
			case DocbookPackage.BIBLIOMSET_TYPE__VENDOR:
				return VENDOR_EDEFAULT == null ? vendor != null : !VENDOR_EDEFAULT.equals(vendor);
			case DocbookPackage.BIBLIOMSET_TYPE__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
			case DocbookPackage.BIBLIOMSET_TYPE__WORDSIZE:
				return WORDSIZE_EDEFAULT == null ? wordsize != null : !WORDSIZE_EDEFAULT.equals(wordsize);
			case DocbookPackage.BIBLIOMSET_TYPE__XREFLABEL:
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
		result.append(", relation: ");
		result.append(relation);
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

} //BibliomsetTypeImpl
