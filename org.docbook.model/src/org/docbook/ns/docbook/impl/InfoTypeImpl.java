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

import org.docbook.ns.docbook.AbstractType;
import org.docbook.ns.docbook.AddressType;
import org.docbook.ns.docbook.AnnotationType;
import org.docbook.ns.docbook.ArtpagenumsType;
import org.docbook.ns.docbook.AuthorType;
import org.docbook.ns.docbook.AuthorgroupType;
import org.docbook.ns.docbook.AuthorinitialsType;
import org.docbook.ns.docbook.BibliocoverageType;
import org.docbook.ns.docbook.BiblioidType;
import org.docbook.ns.docbook.BibliomiscType;
import org.docbook.ns.docbook.BibliomsetType;
import org.docbook.ns.docbook.BibliorelationType;
import org.docbook.ns.docbook.BibliosetType;
import org.docbook.ns.docbook.BibliosourceType;
import org.docbook.ns.docbook.CollabType;
import org.docbook.ns.docbook.ConfgroupType;
import org.docbook.ns.docbook.ContractnumType;
import org.docbook.ns.docbook.ContractsponsorType;
import org.docbook.ns.docbook.CopyrightType;
import org.docbook.ns.docbook.CoverType;
import org.docbook.ns.docbook.DateType;
import org.docbook.ns.docbook.DirType;
import org.docbook.ns.docbook.DocbookPackage;
import org.docbook.ns.docbook.EditionType;
import org.docbook.ns.docbook.EditorType;
import org.docbook.ns.docbook.ExtendedlinkType;
import org.docbook.ns.docbook.InfoType;
import org.docbook.ns.docbook.IssuenumType;
import org.docbook.ns.docbook.ItermsetType;
import org.docbook.ns.docbook.KeywordsetType;
import org.docbook.ns.docbook.LegalnoticeType;
import org.docbook.ns.docbook.MediaobjectType;
import org.docbook.ns.docbook.OrgType;
import org.docbook.ns.docbook.OrgnameType;
import org.docbook.ns.docbook.OthercreditType;
import org.docbook.ns.docbook.PagenumsType;
import org.docbook.ns.docbook.PrinthistoryType;
import org.docbook.ns.docbook.ProductnameType;
import org.docbook.ns.docbook.ProductnumberType;
import org.docbook.ns.docbook.PubdateType;
import org.docbook.ns.docbook.PublisherType;
import org.docbook.ns.docbook.PublishernameType;
import org.docbook.ns.docbook.ReleaseinfoType;
import org.docbook.ns.docbook.RevhistoryType;
import org.docbook.ns.docbook.RevisionflagType;
import org.docbook.ns.docbook.SeriesvolnumsType;
import org.docbook.ns.docbook.SubjectsetType;
import org.docbook.ns.docbook.SubtitleType;
import org.docbook.ns.docbook.TitleType;
import org.docbook.ns.docbook.TitleabbrevType;
import org.docbook.ns.docbook.VolumenumType;

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
 * An implementation of the model object '<em><b>Info Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.docbook.ns.docbook.impl.InfoTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.InfoTypeImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.InfoTypeImpl#getTitleabbrev <em>Titleabbrev</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.InfoTypeImpl#getSubtitle <em>Subtitle</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.InfoTypeImpl#getAbstract <em>Abstract</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.InfoTypeImpl#getAddress <em>Address</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.InfoTypeImpl#getArtpagenums <em>Artpagenums</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.InfoTypeImpl#getAuthor <em>Author</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.InfoTypeImpl#getAuthorgroup <em>Authorgroup</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.InfoTypeImpl#getAuthorinitials <em>Authorinitials</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.InfoTypeImpl#getBibliocoverage <em>Bibliocoverage</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.InfoTypeImpl#getBiblioid <em>Biblioid</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.InfoTypeImpl#getBibliosource <em>Bibliosource</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.InfoTypeImpl#getCollab <em>Collab</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.InfoTypeImpl#getConfgroup <em>Confgroup</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.InfoTypeImpl#getContractsponsor <em>Contractsponsor</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.InfoTypeImpl#getContractnum <em>Contractnum</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.InfoTypeImpl#getCopyright <em>Copyright</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.InfoTypeImpl#getCover <em>Cover</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.InfoTypeImpl#getDate <em>Date</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.InfoTypeImpl#getEdition <em>Edition</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.InfoTypeImpl#getEditor <em>Editor</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.InfoTypeImpl#getIssuenum <em>Issuenum</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.InfoTypeImpl#getKeywordset <em>Keywordset</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.InfoTypeImpl#getLegalnotice <em>Legalnotice</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.InfoTypeImpl#getMediaobject <em>Mediaobject</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.InfoTypeImpl#getOrg <em>Org</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.InfoTypeImpl#getOrgname <em>Orgname</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.InfoTypeImpl#getOthercredit <em>Othercredit</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.InfoTypeImpl#getPagenums <em>Pagenums</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.InfoTypeImpl#getPrinthistory <em>Printhistory</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.InfoTypeImpl#getPubdate <em>Pubdate</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.InfoTypeImpl#getPublisher <em>Publisher</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.InfoTypeImpl#getPublishername <em>Publishername</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.InfoTypeImpl#getReleaseinfo <em>Releaseinfo</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.InfoTypeImpl#getRevhistory <em>Revhistory</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.InfoTypeImpl#getSeriesvolnums <em>Seriesvolnums</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.InfoTypeImpl#getSubjectset <em>Subjectset</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.InfoTypeImpl#getVolumenum <em>Volumenum</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.InfoTypeImpl#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.InfoTypeImpl#getExtendedlink <em>Extendedlink</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.InfoTypeImpl#getBibliomisc <em>Bibliomisc</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.InfoTypeImpl#getBibliomset <em>Bibliomset</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.InfoTypeImpl#getBibliorelation <em>Bibliorelation</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.InfoTypeImpl#getBiblioset <em>Biblioset</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.InfoTypeImpl#getItermset <em>Itermset</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.InfoTypeImpl#getProductname <em>Productname</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.InfoTypeImpl#getProductnumber <em>Productnumber</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.InfoTypeImpl#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.InfoTypeImpl#getArch <em>Arch</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.InfoTypeImpl#getAudience <em>Audience</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.InfoTypeImpl#getBase <em>Base</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.InfoTypeImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.InfoTypeImpl#getConformance <em>Conformance</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.InfoTypeImpl#getDir <em>Dir</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.InfoTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.InfoTypeImpl#getLang <em>Lang</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.InfoTypeImpl#getOs <em>Os</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.InfoTypeImpl#getRemap <em>Remap</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.InfoTypeImpl#getRevision <em>Revision</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.InfoTypeImpl#getRevisionflag <em>Revisionflag</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.InfoTypeImpl#getRole <em>Role</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.InfoTypeImpl#getSecurity <em>Security</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.InfoTypeImpl#getUserlevel <em>Userlevel</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.InfoTypeImpl#getVendor <em>Vendor</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.InfoTypeImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.InfoTypeImpl#getWordsize <em>Wordsize</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.InfoTypeImpl#getXreflabel <em>Xreflabel</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InfoTypeImpl extends MinimalEObjectImpl.Container implements InfoType {
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
	protected InfoTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DocbookPackage.eINSTANCE.getInfoType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, DocbookPackage.INFO_TYPE__GROUP);
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
		return getGroup().list(DocbookPackage.eINSTANCE.getInfoType_Title());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TitleabbrevType> getTitleabbrev() {
		return getGroup().list(DocbookPackage.eINSTANCE.getInfoType_Titleabbrev());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SubtitleType> getSubtitle() {
		return getGroup().list(DocbookPackage.eINSTANCE.getInfoType_Subtitle());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbstractType> getAbstract() {
		return getGroup().list(DocbookPackage.eINSTANCE.getInfoType_Abstract());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AddressType> getAddress() {
		return getGroup().list(DocbookPackage.eINSTANCE.getInfoType_Address());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ArtpagenumsType> getArtpagenums() {
		return getGroup().list(DocbookPackage.eINSTANCE.getInfoType_Artpagenums());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AuthorType> getAuthor() {
		return getGroup().list(DocbookPackage.eINSTANCE.getInfoType_Author());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AuthorgroupType> getAuthorgroup() {
		return getGroup().list(DocbookPackage.eINSTANCE.getInfoType_Authorgroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AuthorinitialsType> getAuthorinitials() {
		return getGroup().list(DocbookPackage.eINSTANCE.getInfoType_Authorinitials());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BibliocoverageType> getBibliocoverage() {
		return getGroup().list(DocbookPackage.eINSTANCE.getInfoType_Bibliocoverage());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BiblioidType> getBiblioid() {
		return getGroup().list(DocbookPackage.eINSTANCE.getInfoType_Biblioid());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BibliosourceType> getBibliosource() {
		return getGroup().list(DocbookPackage.eINSTANCE.getInfoType_Bibliosource());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CollabType> getCollab() {
		return getGroup().list(DocbookPackage.eINSTANCE.getInfoType_Collab());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ConfgroupType> getConfgroup() {
		return getGroup().list(DocbookPackage.eINSTANCE.getInfoType_Confgroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ContractsponsorType> getContractsponsor() {
		return getGroup().list(DocbookPackage.eINSTANCE.getInfoType_Contractsponsor());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ContractnumType> getContractnum() {
		return getGroup().list(DocbookPackage.eINSTANCE.getInfoType_Contractnum());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CopyrightType> getCopyright() {
		return getGroup().list(DocbookPackage.eINSTANCE.getInfoType_Copyright());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CoverType> getCover() {
		return getGroup().list(DocbookPackage.eINSTANCE.getInfoType_Cover());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DateType> getDate() {
		return getGroup().list(DocbookPackage.eINSTANCE.getInfoType_Date());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EditionType> getEdition() {
		return getGroup().list(DocbookPackage.eINSTANCE.getInfoType_Edition());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EditorType> getEditor() {
		return getGroup().list(DocbookPackage.eINSTANCE.getInfoType_Editor());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<IssuenumType> getIssuenum() {
		return getGroup().list(DocbookPackage.eINSTANCE.getInfoType_Issuenum());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<KeywordsetType> getKeywordset() {
		return getGroup().list(DocbookPackage.eINSTANCE.getInfoType_Keywordset());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<LegalnoticeType> getLegalnotice() {
		return getGroup().list(DocbookPackage.eINSTANCE.getInfoType_Legalnotice());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MediaobjectType> getMediaobject() {
		return getGroup().list(DocbookPackage.eINSTANCE.getInfoType_Mediaobject());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<OrgType> getOrg() {
		return getGroup().list(DocbookPackage.eINSTANCE.getInfoType_Org());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<OrgnameType> getOrgname() {
		return getGroup().list(DocbookPackage.eINSTANCE.getInfoType_Orgname());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<OthercreditType> getOthercredit() {
		return getGroup().list(DocbookPackage.eINSTANCE.getInfoType_Othercredit());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PagenumsType> getPagenums() {
		return getGroup().list(DocbookPackage.eINSTANCE.getInfoType_Pagenums());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PrinthistoryType> getPrinthistory() {
		return getGroup().list(DocbookPackage.eINSTANCE.getInfoType_Printhistory());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PubdateType> getPubdate() {
		return getGroup().list(DocbookPackage.eINSTANCE.getInfoType_Pubdate());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PublisherType> getPublisher() {
		return getGroup().list(DocbookPackage.eINSTANCE.getInfoType_Publisher());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PublishernameType> getPublishername() {
		return getGroup().list(DocbookPackage.eINSTANCE.getInfoType_Publishername());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ReleaseinfoType> getReleaseinfo() {
		return getGroup().list(DocbookPackage.eINSTANCE.getInfoType_Releaseinfo());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RevhistoryType> getRevhistory() {
		return getGroup().list(DocbookPackage.eINSTANCE.getInfoType_Revhistory());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SeriesvolnumsType> getSeriesvolnums() {
		return getGroup().list(DocbookPackage.eINSTANCE.getInfoType_Seriesvolnums());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SubjectsetType> getSubjectset() {
		return getGroup().list(DocbookPackage.eINSTANCE.getInfoType_Subjectset());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<VolumenumType> getVolumenum() {
		return getGroup().list(DocbookPackage.eINSTANCE.getInfoType_Volumenum());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AnnotationType> getAnnotation() {
		return getGroup().list(DocbookPackage.eINSTANCE.getInfoType_Annotation());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ExtendedlinkType> getExtendedlink() {
		return getGroup().list(DocbookPackage.eINSTANCE.getInfoType_Extendedlink());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BibliomiscType> getBibliomisc() {
		return getGroup().list(DocbookPackage.eINSTANCE.getInfoType_Bibliomisc());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BibliomsetType> getBibliomset() {
		return getGroup().list(DocbookPackage.eINSTANCE.getInfoType_Bibliomset());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BibliorelationType> getBibliorelation() {
		return getGroup().list(DocbookPackage.eINSTANCE.getInfoType_Bibliorelation());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BibliosetType> getBiblioset() {
		return getGroup().list(DocbookPackage.eINSTANCE.getInfoType_Biblioset());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ItermsetType> getItermset() {
		return getGroup().list(DocbookPackage.eINSTANCE.getInfoType_Itermset());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ProductnameType> getProductname() {
		return getGroup().list(DocbookPackage.eINSTANCE.getInfoType_Productname());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ProductnumberType> getProductnumber() {
		return getGroup().list(DocbookPackage.eINSTANCE.getInfoType_Productnumber());
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.INFO_TYPE__ANNOTATIONS, oldAnnotations, annotations));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.INFO_TYPE__ARCH, oldArch, arch));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.INFO_TYPE__AUDIENCE, oldAudience, audience));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.INFO_TYPE__BASE, oldBase, base));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.INFO_TYPE__CONDITION, oldCondition, condition));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.INFO_TYPE__CONFORMANCE, oldConformance, conformance));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.INFO_TYPE__DIR, oldDir, dir, !oldDirESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, DocbookPackage.INFO_TYPE__DIR, oldDir, DIR_EDEFAULT, oldDirESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.INFO_TYPE__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.INFO_TYPE__LANG, oldLang, lang));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.INFO_TYPE__OS, oldOs, os));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.INFO_TYPE__REMAP, oldRemap, remap));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.INFO_TYPE__REVISION, oldRevision, revision));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.INFO_TYPE__REVISIONFLAG, oldRevisionflag, revisionflag, !oldRevisionflagESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, DocbookPackage.INFO_TYPE__REVISIONFLAG, oldRevisionflag, REVISIONFLAG_EDEFAULT, oldRevisionflagESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.INFO_TYPE__ROLE, oldRole, role));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.INFO_TYPE__SECURITY, oldSecurity, security));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.INFO_TYPE__USERLEVEL, oldUserlevel, userlevel));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.INFO_TYPE__VENDOR, oldVendor, vendor));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.INFO_TYPE__VERSION, oldVersion, version));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.INFO_TYPE__WORDSIZE, oldWordsize, wordsize));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.INFO_TYPE__XREFLABEL, oldXreflabel, xreflabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DocbookPackage.INFO_TYPE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case DocbookPackage.INFO_TYPE__TITLE:
				return ((InternalEList<?>)getTitle()).basicRemove(otherEnd, msgs);
			case DocbookPackage.INFO_TYPE__TITLEABBREV:
				return ((InternalEList<?>)getTitleabbrev()).basicRemove(otherEnd, msgs);
			case DocbookPackage.INFO_TYPE__SUBTITLE:
				return ((InternalEList<?>)getSubtitle()).basicRemove(otherEnd, msgs);
			case DocbookPackage.INFO_TYPE__ABSTRACT:
				return ((InternalEList<?>)getAbstract()).basicRemove(otherEnd, msgs);
			case DocbookPackage.INFO_TYPE__ADDRESS:
				return ((InternalEList<?>)getAddress()).basicRemove(otherEnd, msgs);
			case DocbookPackage.INFO_TYPE__ARTPAGENUMS:
				return ((InternalEList<?>)getArtpagenums()).basicRemove(otherEnd, msgs);
			case DocbookPackage.INFO_TYPE__AUTHOR:
				return ((InternalEList<?>)getAuthor()).basicRemove(otherEnd, msgs);
			case DocbookPackage.INFO_TYPE__AUTHORGROUP:
				return ((InternalEList<?>)getAuthorgroup()).basicRemove(otherEnd, msgs);
			case DocbookPackage.INFO_TYPE__AUTHORINITIALS:
				return ((InternalEList<?>)getAuthorinitials()).basicRemove(otherEnd, msgs);
			case DocbookPackage.INFO_TYPE__BIBLIOCOVERAGE:
				return ((InternalEList<?>)getBibliocoverage()).basicRemove(otherEnd, msgs);
			case DocbookPackage.INFO_TYPE__BIBLIOID:
				return ((InternalEList<?>)getBiblioid()).basicRemove(otherEnd, msgs);
			case DocbookPackage.INFO_TYPE__BIBLIOSOURCE:
				return ((InternalEList<?>)getBibliosource()).basicRemove(otherEnd, msgs);
			case DocbookPackage.INFO_TYPE__COLLAB:
				return ((InternalEList<?>)getCollab()).basicRemove(otherEnd, msgs);
			case DocbookPackage.INFO_TYPE__CONFGROUP:
				return ((InternalEList<?>)getConfgroup()).basicRemove(otherEnd, msgs);
			case DocbookPackage.INFO_TYPE__CONTRACTSPONSOR:
				return ((InternalEList<?>)getContractsponsor()).basicRemove(otherEnd, msgs);
			case DocbookPackage.INFO_TYPE__CONTRACTNUM:
				return ((InternalEList<?>)getContractnum()).basicRemove(otherEnd, msgs);
			case DocbookPackage.INFO_TYPE__COPYRIGHT:
				return ((InternalEList<?>)getCopyright()).basicRemove(otherEnd, msgs);
			case DocbookPackage.INFO_TYPE__COVER:
				return ((InternalEList<?>)getCover()).basicRemove(otherEnd, msgs);
			case DocbookPackage.INFO_TYPE__DATE:
				return ((InternalEList<?>)getDate()).basicRemove(otherEnd, msgs);
			case DocbookPackage.INFO_TYPE__EDITION:
				return ((InternalEList<?>)getEdition()).basicRemove(otherEnd, msgs);
			case DocbookPackage.INFO_TYPE__EDITOR:
				return ((InternalEList<?>)getEditor()).basicRemove(otherEnd, msgs);
			case DocbookPackage.INFO_TYPE__ISSUENUM:
				return ((InternalEList<?>)getIssuenum()).basicRemove(otherEnd, msgs);
			case DocbookPackage.INFO_TYPE__KEYWORDSET:
				return ((InternalEList<?>)getKeywordset()).basicRemove(otherEnd, msgs);
			case DocbookPackage.INFO_TYPE__LEGALNOTICE:
				return ((InternalEList<?>)getLegalnotice()).basicRemove(otherEnd, msgs);
			case DocbookPackage.INFO_TYPE__MEDIAOBJECT:
				return ((InternalEList<?>)getMediaobject()).basicRemove(otherEnd, msgs);
			case DocbookPackage.INFO_TYPE__ORG:
				return ((InternalEList<?>)getOrg()).basicRemove(otherEnd, msgs);
			case DocbookPackage.INFO_TYPE__ORGNAME:
				return ((InternalEList<?>)getOrgname()).basicRemove(otherEnd, msgs);
			case DocbookPackage.INFO_TYPE__OTHERCREDIT:
				return ((InternalEList<?>)getOthercredit()).basicRemove(otherEnd, msgs);
			case DocbookPackage.INFO_TYPE__PAGENUMS:
				return ((InternalEList<?>)getPagenums()).basicRemove(otherEnd, msgs);
			case DocbookPackage.INFO_TYPE__PRINTHISTORY:
				return ((InternalEList<?>)getPrinthistory()).basicRemove(otherEnd, msgs);
			case DocbookPackage.INFO_TYPE__PUBDATE:
				return ((InternalEList<?>)getPubdate()).basicRemove(otherEnd, msgs);
			case DocbookPackage.INFO_TYPE__PUBLISHER:
				return ((InternalEList<?>)getPublisher()).basicRemove(otherEnd, msgs);
			case DocbookPackage.INFO_TYPE__PUBLISHERNAME:
				return ((InternalEList<?>)getPublishername()).basicRemove(otherEnd, msgs);
			case DocbookPackage.INFO_TYPE__RELEASEINFO:
				return ((InternalEList<?>)getReleaseinfo()).basicRemove(otherEnd, msgs);
			case DocbookPackage.INFO_TYPE__REVHISTORY:
				return ((InternalEList<?>)getRevhistory()).basicRemove(otherEnd, msgs);
			case DocbookPackage.INFO_TYPE__SERIESVOLNUMS:
				return ((InternalEList<?>)getSeriesvolnums()).basicRemove(otherEnd, msgs);
			case DocbookPackage.INFO_TYPE__SUBJECTSET:
				return ((InternalEList<?>)getSubjectset()).basicRemove(otherEnd, msgs);
			case DocbookPackage.INFO_TYPE__VOLUMENUM:
				return ((InternalEList<?>)getVolumenum()).basicRemove(otherEnd, msgs);
			case DocbookPackage.INFO_TYPE__ANNOTATION:
				return ((InternalEList<?>)getAnnotation()).basicRemove(otherEnd, msgs);
			case DocbookPackage.INFO_TYPE__EXTENDEDLINK:
				return ((InternalEList<?>)getExtendedlink()).basicRemove(otherEnd, msgs);
			case DocbookPackage.INFO_TYPE__BIBLIOMISC:
				return ((InternalEList<?>)getBibliomisc()).basicRemove(otherEnd, msgs);
			case DocbookPackage.INFO_TYPE__BIBLIOMSET:
				return ((InternalEList<?>)getBibliomset()).basicRemove(otherEnd, msgs);
			case DocbookPackage.INFO_TYPE__BIBLIORELATION:
				return ((InternalEList<?>)getBibliorelation()).basicRemove(otherEnd, msgs);
			case DocbookPackage.INFO_TYPE__BIBLIOSET:
				return ((InternalEList<?>)getBiblioset()).basicRemove(otherEnd, msgs);
			case DocbookPackage.INFO_TYPE__ITERMSET:
				return ((InternalEList<?>)getItermset()).basicRemove(otherEnd, msgs);
			case DocbookPackage.INFO_TYPE__PRODUCTNAME:
				return ((InternalEList<?>)getProductname()).basicRemove(otherEnd, msgs);
			case DocbookPackage.INFO_TYPE__PRODUCTNUMBER:
				return ((InternalEList<?>)getProductnumber()).basicRemove(otherEnd, msgs);
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
			case DocbookPackage.INFO_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case DocbookPackage.INFO_TYPE__TITLE:
				return getTitle();
			case DocbookPackage.INFO_TYPE__TITLEABBREV:
				return getTitleabbrev();
			case DocbookPackage.INFO_TYPE__SUBTITLE:
				return getSubtitle();
			case DocbookPackage.INFO_TYPE__ABSTRACT:
				return getAbstract();
			case DocbookPackage.INFO_TYPE__ADDRESS:
				return getAddress();
			case DocbookPackage.INFO_TYPE__ARTPAGENUMS:
				return getArtpagenums();
			case DocbookPackage.INFO_TYPE__AUTHOR:
				return getAuthor();
			case DocbookPackage.INFO_TYPE__AUTHORGROUP:
				return getAuthorgroup();
			case DocbookPackage.INFO_TYPE__AUTHORINITIALS:
				return getAuthorinitials();
			case DocbookPackage.INFO_TYPE__BIBLIOCOVERAGE:
				return getBibliocoverage();
			case DocbookPackage.INFO_TYPE__BIBLIOID:
				return getBiblioid();
			case DocbookPackage.INFO_TYPE__BIBLIOSOURCE:
				return getBibliosource();
			case DocbookPackage.INFO_TYPE__COLLAB:
				return getCollab();
			case DocbookPackage.INFO_TYPE__CONFGROUP:
				return getConfgroup();
			case DocbookPackage.INFO_TYPE__CONTRACTSPONSOR:
				return getContractsponsor();
			case DocbookPackage.INFO_TYPE__CONTRACTNUM:
				return getContractnum();
			case DocbookPackage.INFO_TYPE__COPYRIGHT:
				return getCopyright();
			case DocbookPackage.INFO_TYPE__COVER:
				return getCover();
			case DocbookPackage.INFO_TYPE__DATE:
				return getDate();
			case DocbookPackage.INFO_TYPE__EDITION:
				return getEdition();
			case DocbookPackage.INFO_TYPE__EDITOR:
				return getEditor();
			case DocbookPackage.INFO_TYPE__ISSUENUM:
				return getIssuenum();
			case DocbookPackage.INFO_TYPE__KEYWORDSET:
				return getKeywordset();
			case DocbookPackage.INFO_TYPE__LEGALNOTICE:
				return getLegalnotice();
			case DocbookPackage.INFO_TYPE__MEDIAOBJECT:
				return getMediaobject();
			case DocbookPackage.INFO_TYPE__ORG:
				return getOrg();
			case DocbookPackage.INFO_TYPE__ORGNAME:
				return getOrgname();
			case DocbookPackage.INFO_TYPE__OTHERCREDIT:
				return getOthercredit();
			case DocbookPackage.INFO_TYPE__PAGENUMS:
				return getPagenums();
			case DocbookPackage.INFO_TYPE__PRINTHISTORY:
				return getPrinthistory();
			case DocbookPackage.INFO_TYPE__PUBDATE:
				return getPubdate();
			case DocbookPackage.INFO_TYPE__PUBLISHER:
				return getPublisher();
			case DocbookPackage.INFO_TYPE__PUBLISHERNAME:
				return getPublishername();
			case DocbookPackage.INFO_TYPE__RELEASEINFO:
				return getReleaseinfo();
			case DocbookPackage.INFO_TYPE__REVHISTORY:
				return getRevhistory();
			case DocbookPackage.INFO_TYPE__SERIESVOLNUMS:
				return getSeriesvolnums();
			case DocbookPackage.INFO_TYPE__SUBJECTSET:
				return getSubjectset();
			case DocbookPackage.INFO_TYPE__VOLUMENUM:
				return getVolumenum();
			case DocbookPackage.INFO_TYPE__ANNOTATION:
				return getAnnotation();
			case DocbookPackage.INFO_TYPE__EXTENDEDLINK:
				return getExtendedlink();
			case DocbookPackage.INFO_TYPE__BIBLIOMISC:
				return getBibliomisc();
			case DocbookPackage.INFO_TYPE__BIBLIOMSET:
				return getBibliomset();
			case DocbookPackage.INFO_TYPE__BIBLIORELATION:
				return getBibliorelation();
			case DocbookPackage.INFO_TYPE__BIBLIOSET:
				return getBiblioset();
			case DocbookPackage.INFO_TYPE__ITERMSET:
				return getItermset();
			case DocbookPackage.INFO_TYPE__PRODUCTNAME:
				return getProductname();
			case DocbookPackage.INFO_TYPE__PRODUCTNUMBER:
				return getProductnumber();
			case DocbookPackage.INFO_TYPE__ANNOTATIONS:
				return getAnnotations();
			case DocbookPackage.INFO_TYPE__ARCH:
				return getArch();
			case DocbookPackage.INFO_TYPE__AUDIENCE:
				return getAudience();
			case DocbookPackage.INFO_TYPE__BASE:
				return getBase();
			case DocbookPackage.INFO_TYPE__CONDITION:
				return getCondition();
			case DocbookPackage.INFO_TYPE__CONFORMANCE:
				return getConformance();
			case DocbookPackage.INFO_TYPE__DIR:
				return getDir();
			case DocbookPackage.INFO_TYPE__ID:
				return getId();
			case DocbookPackage.INFO_TYPE__LANG:
				return getLang();
			case DocbookPackage.INFO_TYPE__OS:
				return getOs();
			case DocbookPackage.INFO_TYPE__REMAP:
				return getRemap();
			case DocbookPackage.INFO_TYPE__REVISION:
				return getRevision();
			case DocbookPackage.INFO_TYPE__REVISIONFLAG:
				return getRevisionflag();
			case DocbookPackage.INFO_TYPE__ROLE:
				return getRole();
			case DocbookPackage.INFO_TYPE__SECURITY:
				return getSecurity();
			case DocbookPackage.INFO_TYPE__USERLEVEL:
				return getUserlevel();
			case DocbookPackage.INFO_TYPE__VENDOR:
				return getVendor();
			case DocbookPackage.INFO_TYPE__VERSION:
				return getVersion();
			case DocbookPackage.INFO_TYPE__WORDSIZE:
				return getWordsize();
			case DocbookPackage.INFO_TYPE__XREFLABEL:
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
			case DocbookPackage.INFO_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case DocbookPackage.INFO_TYPE__TITLE:
				getTitle().clear();
				getTitle().addAll((Collection<? extends TitleType>)newValue);
				return;
			case DocbookPackage.INFO_TYPE__TITLEABBREV:
				getTitleabbrev().clear();
				getTitleabbrev().addAll((Collection<? extends TitleabbrevType>)newValue);
				return;
			case DocbookPackage.INFO_TYPE__SUBTITLE:
				getSubtitle().clear();
				getSubtitle().addAll((Collection<? extends SubtitleType>)newValue);
				return;
			case DocbookPackage.INFO_TYPE__ABSTRACT:
				getAbstract().clear();
				getAbstract().addAll((Collection<? extends AbstractType>)newValue);
				return;
			case DocbookPackage.INFO_TYPE__ADDRESS:
				getAddress().clear();
				getAddress().addAll((Collection<? extends AddressType>)newValue);
				return;
			case DocbookPackage.INFO_TYPE__ARTPAGENUMS:
				getArtpagenums().clear();
				getArtpagenums().addAll((Collection<? extends ArtpagenumsType>)newValue);
				return;
			case DocbookPackage.INFO_TYPE__AUTHOR:
				getAuthor().clear();
				getAuthor().addAll((Collection<? extends AuthorType>)newValue);
				return;
			case DocbookPackage.INFO_TYPE__AUTHORGROUP:
				getAuthorgroup().clear();
				getAuthorgroup().addAll((Collection<? extends AuthorgroupType>)newValue);
				return;
			case DocbookPackage.INFO_TYPE__AUTHORINITIALS:
				getAuthorinitials().clear();
				getAuthorinitials().addAll((Collection<? extends AuthorinitialsType>)newValue);
				return;
			case DocbookPackage.INFO_TYPE__BIBLIOCOVERAGE:
				getBibliocoverage().clear();
				getBibliocoverage().addAll((Collection<? extends BibliocoverageType>)newValue);
				return;
			case DocbookPackage.INFO_TYPE__BIBLIOID:
				getBiblioid().clear();
				getBiblioid().addAll((Collection<? extends BiblioidType>)newValue);
				return;
			case DocbookPackage.INFO_TYPE__BIBLIOSOURCE:
				getBibliosource().clear();
				getBibliosource().addAll((Collection<? extends BibliosourceType>)newValue);
				return;
			case DocbookPackage.INFO_TYPE__COLLAB:
				getCollab().clear();
				getCollab().addAll((Collection<? extends CollabType>)newValue);
				return;
			case DocbookPackage.INFO_TYPE__CONFGROUP:
				getConfgroup().clear();
				getConfgroup().addAll((Collection<? extends ConfgroupType>)newValue);
				return;
			case DocbookPackage.INFO_TYPE__CONTRACTSPONSOR:
				getContractsponsor().clear();
				getContractsponsor().addAll((Collection<? extends ContractsponsorType>)newValue);
				return;
			case DocbookPackage.INFO_TYPE__CONTRACTNUM:
				getContractnum().clear();
				getContractnum().addAll((Collection<? extends ContractnumType>)newValue);
				return;
			case DocbookPackage.INFO_TYPE__COPYRIGHT:
				getCopyright().clear();
				getCopyright().addAll((Collection<? extends CopyrightType>)newValue);
				return;
			case DocbookPackage.INFO_TYPE__COVER:
				getCover().clear();
				getCover().addAll((Collection<? extends CoverType>)newValue);
				return;
			case DocbookPackage.INFO_TYPE__DATE:
				getDate().clear();
				getDate().addAll((Collection<? extends DateType>)newValue);
				return;
			case DocbookPackage.INFO_TYPE__EDITION:
				getEdition().clear();
				getEdition().addAll((Collection<? extends EditionType>)newValue);
				return;
			case DocbookPackage.INFO_TYPE__EDITOR:
				getEditor().clear();
				getEditor().addAll((Collection<? extends EditorType>)newValue);
				return;
			case DocbookPackage.INFO_TYPE__ISSUENUM:
				getIssuenum().clear();
				getIssuenum().addAll((Collection<? extends IssuenumType>)newValue);
				return;
			case DocbookPackage.INFO_TYPE__KEYWORDSET:
				getKeywordset().clear();
				getKeywordset().addAll((Collection<? extends KeywordsetType>)newValue);
				return;
			case DocbookPackage.INFO_TYPE__LEGALNOTICE:
				getLegalnotice().clear();
				getLegalnotice().addAll((Collection<? extends LegalnoticeType>)newValue);
				return;
			case DocbookPackage.INFO_TYPE__MEDIAOBJECT:
				getMediaobject().clear();
				getMediaobject().addAll((Collection<? extends MediaobjectType>)newValue);
				return;
			case DocbookPackage.INFO_TYPE__ORG:
				getOrg().clear();
				getOrg().addAll((Collection<? extends OrgType>)newValue);
				return;
			case DocbookPackage.INFO_TYPE__ORGNAME:
				getOrgname().clear();
				getOrgname().addAll((Collection<? extends OrgnameType>)newValue);
				return;
			case DocbookPackage.INFO_TYPE__OTHERCREDIT:
				getOthercredit().clear();
				getOthercredit().addAll((Collection<? extends OthercreditType>)newValue);
				return;
			case DocbookPackage.INFO_TYPE__PAGENUMS:
				getPagenums().clear();
				getPagenums().addAll((Collection<? extends PagenumsType>)newValue);
				return;
			case DocbookPackage.INFO_TYPE__PRINTHISTORY:
				getPrinthistory().clear();
				getPrinthistory().addAll((Collection<? extends PrinthistoryType>)newValue);
				return;
			case DocbookPackage.INFO_TYPE__PUBDATE:
				getPubdate().clear();
				getPubdate().addAll((Collection<? extends PubdateType>)newValue);
				return;
			case DocbookPackage.INFO_TYPE__PUBLISHER:
				getPublisher().clear();
				getPublisher().addAll((Collection<? extends PublisherType>)newValue);
				return;
			case DocbookPackage.INFO_TYPE__PUBLISHERNAME:
				getPublishername().clear();
				getPublishername().addAll((Collection<? extends PublishernameType>)newValue);
				return;
			case DocbookPackage.INFO_TYPE__RELEASEINFO:
				getReleaseinfo().clear();
				getReleaseinfo().addAll((Collection<? extends ReleaseinfoType>)newValue);
				return;
			case DocbookPackage.INFO_TYPE__REVHISTORY:
				getRevhistory().clear();
				getRevhistory().addAll((Collection<? extends RevhistoryType>)newValue);
				return;
			case DocbookPackage.INFO_TYPE__SERIESVOLNUMS:
				getSeriesvolnums().clear();
				getSeriesvolnums().addAll((Collection<? extends SeriesvolnumsType>)newValue);
				return;
			case DocbookPackage.INFO_TYPE__SUBJECTSET:
				getSubjectset().clear();
				getSubjectset().addAll((Collection<? extends SubjectsetType>)newValue);
				return;
			case DocbookPackage.INFO_TYPE__VOLUMENUM:
				getVolumenum().clear();
				getVolumenum().addAll((Collection<? extends VolumenumType>)newValue);
				return;
			case DocbookPackage.INFO_TYPE__ANNOTATION:
				getAnnotation().clear();
				getAnnotation().addAll((Collection<? extends AnnotationType>)newValue);
				return;
			case DocbookPackage.INFO_TYPE__EXTENDEDLINK:
				getExtendedlink().clear();
				getExtendedlink().addAll((Collection<? extends ExtendedlinkType>)newValue);
				return;
			case DocbookPackage.INFO_TYPE__BIBLIOMISC:
				getBibliomisc().clear();
				getBibliomisc().addAll((Collection<? extends BibliomiscType>)newValue);
				return;
			case DocbookPackage.INFO_TYPE__BIBLIOMSET:
				getBibliomset().clear();
				getBibliomset().addAll((Collection<? extends BibliomsetType>)newValue);
				return;
			case DocbookPackage.INFO_TYPE__BIBLIORELATION:
				getBibliorelation().clear();
				getBibliorelation().addAll((Collection<? extends BibliorelationType>)newValue);
				return;
			case DocbookPackage.INFO_TYPE__BIBLIOSET:
				getBiblioset().clear();
				getBiblioset().addAll((Collection<? extends BibliosetType>)newValue);
				return;
			case DocbookPackage.INFO_TYPE__ITERMSET:
				getItermset().clear();
				getItermset().addAll((Collection<? extends ItermsetType>)newValue);
				return;
			case DocbookPackage.INFO_TYPE__PRODUCTNAME:
				getProductname().clear();
				getProductname().addAll((Collection<? extends ProductnameType>)newValue);
				return;
			case DocbookPackage.INFO_TYPE__PRODUCTNUMBER:
				getProductnumber().clear();
				getProductnumber().addAll((Collection<? extends ProductnumberType>)newValue);
				return;
			case DocbookPackage.INFO_TYPE__ANNOTATIONS:
				setAnnotations(newValue);
				return;
			case DocbookPackage.INFO_TYPE__ARCH:
				setArch(newValue);
				return;
			case DocbookPackage.INFO_TYPE__AUDIENCE:
				setAudience(newValue);
				return;
			case DocbookPackage.INFO_TYPE__BASE:
				setBase(newValue);
				return;
			case DocbookPackage.INFO_TYPE__CONDITION:
				setCondition(newValue);
				return;
			case DocbookPackage.INFO_TYPE__CONFORMANCE:
				setConformance(newValue);
				return;
			case DocbookPackage.INFO_TYPE__DIR:
				setDir((DirType)newValue);
				return;
			case DocbookPackage.INFO_TYPE__ID:
				setId((String)newValue);
				return;
			case DocbookPackage.INFO_TYPE__LANG:
				setLang(newValue);
				return;
			case DocbookPackage.INFO_TYPE__OS:
				setOs(newValue);
				return;
			case DocbookPackage.INFO_TYPE__REMAP:
				setRemap(newValue);
				return;
			case DocbookPackage.INFO_TYPE__REVISION:
				setRevision(newValue);
				return;
			case DocbookPackage.INFO_TYPE__REVISIONFLAG:
				setRevisionflag((RevisionflagType)newValue);
				return;
			case DocbookPackage.INFO_TYPE__ROLE:
				setRole(newValue);
				return;
			case DocbookPackage.INFO_TYPE__SECURITY:
				setSecurity(newValue);
				return;
			case DocbookPackage.INFO_TYPE__USERLEVEL:
				setUserlevel(newValue);
				return;
			case DocbookPackage.INFO_TYPE__VENDOR:
				setVendor(newValue);
				return;
			case DocbookPackage.INFO_TYPE__VERSION:
				setVersion(newValue);
				return;
			case DocbookPackage.INFO_TYPE__WORDSIZE:
				setWordsize(newValue);
				return;
			case DocbookPackage.INFO_TYPE__XREFLABEL:
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
			case DocbookPackage.INFO_TYPE__GROUP:
				getGroup().clear();
				return;
			case DocbookPackage.INFO_TYPE__TITLE:
				getTitle().clear();
				return;
			case DocbookPackage.INFO_TYPE__TITLEABBREV:
				getTitleabbrev().clear();
				return;
			case DocbookPackage.INFO_TYPE__SUBTITLE:
				getSubtitle().clear();
				return;
			case DocbookPackage.INFO_TYPE__ABSTRACT:
				getAbstract().clear();
				return;
			case DocbookPackage.INFO_TYPE__ADDRESS:
				getAddress().clear();
				return;
			case DocbookPackage.INFO_TYPE__ARTPAGENUMS:
				getArtpagenums().clear();
				return;
			case DocbookPackage.INFO_TYPE__AUTHOR:
				getAuthor().clear();
				return;
			case DocbookPackage.INFO_TYPE__AUTHORGROUP:
				getAuthorgroup().clear();
				return;
			case DocbookPackage.INFO_TYPE__AUTHORINITIALS:
				getAuthorinitials().clear();
				return;
			case DocbookPackage.INFO_TYPE__BIBLIOCOVERAGE:
				getBibliocoverage().clear();
				return;
			case DocbookPackage.INFO_TYPE__BIBLIOID:
				getBiblioid().clear();
				return;
			case DocbookPackage.INFO_TYPE__BIBLIOSOURCE:
				getBibliosource().clear();
				return;
			case DocbookPackage.INFO_TYPE__COLLAB:
				getCollab().clear();
				return;
			case DocbookPackage.INFO_TYPE__CONFGROUP:
				getConfgroup().clear();
				return;
			case DocbookPackage.INFO_TYPE__CONTRACTSPONSOR:
				getContractsponsor().clear();
				return;
			case DocbookPackage.INFO_TYPE__CONTRACTNUM:
				getContractnum().clear();
				return;
			case DocbookPackage.INFO_TYPE__COPYRIGHT:
				getCopyright().clear();
				return;
			case DocbookPackage.INFO_TYPE__COVER:
				getCover().clear();
				return;
			case DocbookPackage.INFO_TYPE__DATE:
				getDate().clear();
				return;
			case DocbookPackage.INFO_TYPE__EDITION:
				getEdition().clear();
				return;
			case DocbookPackage.INFO_TYPE__EDITOR:
				getEditor().clear();
				return;
			case DocbookPackage.INFO_TYPE__ISSUENUM:
				getIssuenum().clear();
				return;
			case DocbookPackage.INFO_TYPE__KEYWORDSET:
				getKeywordset().clear();
				return;
			case DocbookPackage.INFO_TYPE__LEGALNOTICE:
				getLegalnotice().clear();
				return;
			case DocbookPackage.INFO_TYPE__MEDIAOBJECT:
				getMediaobject().clear();
				return;
			case DocbookPackage.INFO_TYPE__ORG:
				getOrg().clear();
				return;
			case DocbookPackage.INFO_TYPE__ORGNAME:
				getOrgname().clear();
				return;
			case DocbookPackage.INFO_TYPE__OTHERCREDIT:
				getOthercredit().clear();
				return;
			case DocbookPackage.INFO_TYPE__PAGENUMS:
				getPagenums().clear();
				return;
			case DocbookPackage.INFO_TYPE__PRINTHISTORY:
				getPrinthistory().clear();
				return;
			case DocbookPackage.INFO_TYPE__PUBDATE:
				getPubdate().clear();
				return;
			case DocbookPackage.INFO_TYPE__PUBLISHER:
				getPublisher().clear();
				return;
			case DocbookPackage.INFO_TYPE__PUBLISHERNAME:
				getPublishername().clear();
				return;
			case DocbookPackage.INFO_TYPE__RELEASEINFO:
				getReleaseinfo().clear();
				return;
			case DocbookPackage.INFO_TYPE__REVHISTORY:
				getRevhistory().clear();
				return;
			case DocbookPackage.INFO_TYPE__SERIESVOLNUMS:
				getSeriesvolnums().clear();
				return;
			case DocbookPackage.INFO_TYPE__SUBJECTSET:
				getSubjectset().clear();
				return;
			case DocbookPackage.INFO_TYPE__VOLUMENUM:
				getVolumenum().clear();
				return;
			case DocbookPackage.INFO_TYPE__ANNOTATION:
				getAnnotation().clear();
				return;
			case DocbookPackage.INFO_TYPE__EXTENDEDLINK:
				getExtendedlink().clear();
				return;
			case DocbookPackage.INFO_TYPE__BIBLIOMISC:
				getBibliomisc().clear();
				return;
			case DocbookPackage.INFO_TYPE__BIBLIOMSET:
				getBibliomset().clear();
				return;
			case DocbookPackage.INFO_TYPE__BIBLIORELATION:
				getBibliorelation().clear();
				return;
			case DocbookPackage.INFO_TYPE__BIBLIOSET:
				getBiblioset().clear();
				return;
			case DocbookPackage.INFO_TYPE__ITERMSET:
				getItermset().clear();
				return;
			case DocbookPackage.INFO_TYPE__PRODUCTNAME:
				getProductname().clear();
				return;
			case DocbookPackage.INFO_TYPE__PRODUCTNUMBER:
				getProductnumber().clear();
				return;
			case DocbookPackage.INFO_TYPE__ANNOTATIONS:
				setAnnotations(ANNOTATIONS_EDEFAULT);
				return;
			case DocbookPackage.INFO_TYPE__ARCH:
				setArch(ARCH_EDEFAULT);
				return;
			case DocbookPackage.INFO_TYPE__AUDIENCE:
				setAudience(AUDIENCE_EDEFAULT);
				return;
			case DocbookPackage.INFO_TYPE__BASE:
				setBase(BASE_EDEFAULT);
				return;
			case DocbookPackage.INFO_TYPE__CONDITION:
				setCondition(CONDITION_EDEFAULT);
				return;
			case DocbookPackage.INFO_TYPE__CONFORMANCE:
				setConformance(CONFORMANCE_EDEFAULT);
				return;
			case DocbookPackage.INFO_TYPE__DIR:
				unsetDir();
				return;
			case DocbookPackage.INFO_TYPE__ID:
				setId(ID_EDEFAULT);
				return;
			case DocbookPackage.INFO_TYPE__LANG:
				setLang(LANG_EDEFAULT);
				return;
			case DocbookPackage.INFO_TYPE__OS:
				setOs(OS_EDEFAULT);
				return;
			case DocbookPackage.INFO_TYPE__REMAP:
				setRemap(REMAP_EDEFAULT);
				return;
			case DocbookPackage.INFO_TYPE__REVISION:
				setRevision(REVISION_EDEFAULT);
				return;
			case DocbookPackage.INFO_TYPE__REVISIONFLAG:
				unsetRevisionflag();
				return;
			case DocbookPackage.INFO_TYPE__ROLE:
				setRole(ROLE_EDEFAULT);
				return;
			case DocbookPackage.INFO_TYPE__SECURITY:
				setSecurity(SECURITY_EDEFAULT);
				return;
			case DocbookPackage.INFO_TYPE__USERLEVEL:
				setUserlevel(USERLEVEL_EDEFAULT);
				return;
			case DocbookPackage.INFO_TYPE__VENDOR:
				setVendor(VENDOR_EDEFAULT);
				return;
			case DocbookPackage.INFO_TYPE__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case DocbookPackage.INFO_TYPE__WORDSIZE:
				setWordsize(WORDSIZE_EDEFAULT);
				return;
			case DocbookPackage.INFO_TYPE__XREFLABEL:
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
			case DocbookPackage.INFO_TYPE__GROUP:
				return group != null && !group.isEmpty();
			case DocbookPackage.INFO_TYPE__TITLE:
				return !getTitle().isEmpty();
			case DocbookPackage.INFO_TYPE__TITLEABBREV:
				return !getTitleabbrev().isEmpty();
			case DocbookPackage.INFO_TYPE__SUBTITLE:
				return !getSubtitle().isEmpty();
			case DocbookPackage.INFO_TYPE__ABSTRACT:
				return !getAbstract().isEmpty();
			case DocbookPackage.INFO_TYPE__ADDRESS:
				return !getAddress().isEmpty();
			case DocbookPackage.INFO_TYPE__ARTPAGENUMS:
				return !getArtpagenums().isEmpty();
			case DocbookPackage.INFO_TYPE__AUTHOR:
				return !getAuthor().isEmpty();
			case DocbookPackage.INFO_TYPE__AUTHORGROUP:
				return !getAuthorgroup().isEmpty();
			case DocbookPackage.INFO_TYPE__AUTHORINITIALS:
				return !getAuthorinitials().isEmpty();
			case DocbookPackage.INFO_TYPE__BIBLIOCOVERAGE:
				return !getBibliocoverage().isEmpty();
			case DocbookPackage.INFO_TYPE__BIBLIOID:
				return !getBiblioid().isEmpty();
			case DocbookPackage.INFO_TYPE__BIBLIOSOURCE:
				return !getBibliosource().isEmpty();
			case DocbookPackage.INFO_TYPE__COLLAB:
				return !getCollab().isEmpty();
			case DocbookPackage.INFO_TYPE__CONFGROUP:
				return !getConfgroup().isEmpty();
			case DocbookPackage.INFO_TYPE__CONTRACTSPONSOR:
				return !getContractsponsor().isEmpty();
			case DocbookPackage.INFO_TYPE__CONTRACTNUM:
				return !getContractnum().isEmpty();
			case DocbookPackage.INFO_TYPE__COPYRIGHT:
				return !getCopyright().isEmpty();
			case DocbookPackage.INFO_TYPE__COVER:
				return !getCover().isEmpty();
			case DocbookPackage.INFO_TYPE__DATE:
				return !getDate().isEmpty();
			case DocbookPackage.INFO_TYPE__EDITION:
				return !getEdition().isEmpty();
			case DocbookPackage.INFO_TYPE__EDITOR:
				return !getEditor().isEmpty();
			case DocbookPackage.INFO_TYPE__ISSUENUM:
				return !getIssuenum().isEmpty();
			case DocbookPackage.INFO_TYPE__KEYWORDSET:
				return !getKeywordset().isEmpty();
			case DocbookPackage.INFO_TYPE__LEGALNOTICE:
				return !getLegalnotice().isEmpty();
			case DocbookPackage.INFO_TYPE__MEDIAOBJECT:
				return !getMediaobject().isEmpty();
			case DocbookPackage.INFO_TYPE__ORG:
				return !getOrg().isEmpty();
			case DocbookPackage.INFO_TYPE__ORGNAME:
				return !getOrgname().isEmpty();
			case DocbookPackage.INFO_TYPE__OTHERCREDIT:
				return !getOthercredit().isEmpty();
			case DocbookPackage.INFO_TYPE__PAGENUMS:
				return !getPagenums().isEmpty();
			case DocbookPackage.INFO_TYPE__PRINTHISTORY:
				return !getPrinthistory().isEmpty();
			case DocbookPackage.INFO_TYPE__PUBDATE:
				return !getPubdate().isEmpty();
			case DocbookPackage.INFO_TYPE__PUBLISHER:
				return !getPublisher().isEmpty();
			case DocbookPackage.INFO_TYPE__PUBLISHERNAME:
				return !getPublishername().isEmpty();
			case DocbookPackage.INFO_TYPE__RELEASEINFO:
				return !getReleaseinfo().isEmpty();
			case DocbookPackage.INFO_TYPE__REVHISTORY:
				return !getRevhistory().isEmpty();
			case DocbookPackage.INFO_TYPE__SERIESVOLNUMS:
				return !getSeriesvolnums().isEmpty();
			case DocbookPackage.INFO_TYPE__SUBJECTSET:
				return !getSubjectset().isEmpty();
			case DocbookPackage.INFO_TYPE__VOLUMENUM:
				return !getVolumenum().isEmpty();
			case DocbookPackage.INFO_TYPE__ANNOTATION:
				return !getAnnotation().isEmpty();
			case DocbookPackage.INFO_TYPE__EXTENDEDLINK:
				return !getExtendedlink().isEmpty();
			case DocbookPackage.INFO_TYPE__BIBLIOMISC:
				return !getBibliomisc().isEmpty();
			case DocbookPackage.INFO_TYPE__BIBLIOMSET:
				return !getBibliomset().isEmpty();
			case DocbookPackage.INFO_TYPE__BIBLIORELATION:
				return !getBibliorelation().isEmpty();
			case DocbookPackage.INFO_TYPE__BIBLIOSET:
				return !getBiblioset().isEmpty();
			case DocbookPackage.INFO_TYPE__ITERMSET:
				return !getItermset().isEmpty();
			case DocbookPackage.INFO_TYPE__PRODUCTNAME:
				return !getProductname().isEmpty();
			case DocbookPackage.INFO_TYPE__PRODUCTNUMBER:
				return !getProductnumber().isEmpty();
			case DocbookPackage.INFO_TYPE__ANNOTATIONS:
				return ANNOTATIONS_EDEFAULT == null ? annotations != null : !ANNOTATIONS_EDEFAULT.equals(annotations);
			case DocbookPackage.INFO_TYPE__ARCH:
				return ARCH_EDEFAULT == null ? arch != null : !ARCH_EDEFAULT.equals(arch);
			case DocbookPackage.INFO_TYPE__AUDIENCE:
				return AUDIENCE_EDEFAULT == null ? audience != null : !AUDIENCE_EDEFAULT.equals(audience);
			case DocbookPackage.INFO_TYPE__BASE:
				return BASE_EDEFAULT == null ? base != null : !BASE_EDEFAULT.equals(base);
			case DocbookPackage.INFO_TYPE__CONDITION:
				return CONDITION_EDEFAULT == null ? condition != null : !CONDITION_EDEFAULT.equals(condition);
			case DocbookPackage.INFO_TYPE__CONFORMANCE:
				return CONFORMANCE_EDEFAULT == null ? conformance != null : !CONFORMANCE_EDEFAULT.equals(conformance);
			case DocbookPackage.INFO_TYPE__DIR:
				return isSetDir();
			case DocbookPackage.INFO_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case DocbookPackage.INFO_TYPE__LANG:
				return LANG_EDEFAULT == null ? lang != null : !LANG_EDEFAULT.equals(lang);
			case DocbookPackage.INFO_TYPE__OS:
				return OS_EDEFAULT == null ? os != null : !OS_EDEFAULT.equals(os);
			case DocbookPackage.INFO_TYPE__REMAP:
				return REMAP_EDEFAULT == null ? remap != null : !REMAP_EDEFAULT.equals(remap);
			case DocbookPackage.INFO_TYPE__REVISION:
				return REVISION_EDEFAULT == null ? revision != null : !REVISION_EDEFAULT.equals(revision);
			case DocbookPackage.INFO_TYPE__REVISIONFLAG:
				return isSetRevisionflag();
			case DocbookPackage.INFO_TYPE__ROLE:
				return ROLE_EDEFAULT == null ? role != null : !ROLE_EDEFAULT.equals(role);
			case DocbookPackage.INFO_TYPE__SECURITY:
				return SECURITY_EDEFAULT == null ? security != null : !SECURITY_EDEFAULT.equals(security);
			case DocbookPackage.INFO_TYPE__USERLEVEL:
				return USERLEVEL_EDEFAULT == null ? userlevel != null : !USERLEVEL_EDEFAULT.equals(userlevel);
			case DocbookPackage.INFO_TYPE__VENDOR:
				return VENDOR_EDEFAULT == null ? vendor != null : !VENDOR_EDEFAULT.equals(vendor);
			case DocbookPackage.INFO_TYPE__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
			case DocbookPackage.INFO_TYPE__WORDSIZE:
				return WORDSIZE_EDEFAULT == null ? wordsize != null : !WORDSIZE_EDEFAULT.equals(wordsize);
			case DocbookPackage.INFO_TYPE__XREFLABEL:
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

} //InfoTypeImpl
