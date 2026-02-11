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
import java.util.List;

import org.docbook.ns.docbook.AbbrevType;
import org.docbook.ns.docbook.AccelType;
import org.docbook.ns.docbook.AcronymType;
import org.docbook.ns.docbook.AltType;
import org.docbook.ns.docbook.AnchorType;
import org.docbook.ns.docbook.AnnotationType;
import org.docbook.ns.docbook.ApplicationType;
import org.docbook.ns.docbook.AuthorType;
import org.docbook.ns.docbook.BibliorefType;
import org.docbook.ns.docbook.CitationType;
import org.docbook.ns.docbook.CitebiblioidType;
import org.docbook.ns.docbook.CiterefentryType;
import org.docbook.ns.docbook.CitetitleType;
import org.docbook.ns.docbook.ClassnameType;
import org.docbook.ns.docbook.CodeType;
import org.docbook.ns.docbook.CommandType;
import org.docbook.ns.docbook.ComputeroutputType;
import org.docbook.ns.docbook.ConstantType;
import org.docbook.ns.docbook.CorefType;
import org.docbook.ns.docbook.DatabaseType;
import org.docbook.ns.docbook.DateType;
import org.docbook.ns.docbook.DirType;
import org.docbook.ns.docbook.DocbookPackage;
import org.docbook.ns.docbook.EditorType;
import org.docbook.ns.docbook.EmailType;
import org.docbook.ns.docbook.EmphasisType;
import org.docbook.ns.docbook.EnvarType;
import org.docbook.ns.docbook.ErrorcodeType;
import org.docbook.ns.docbook.ErrornameType;
import org.docbook.ns.docbook.ErrortextType;
import org.docbook.ns.docbook.ErrortypeType;
import org.docbook.ns.docbook.ExceptionnameType;
import org.docbook.ns.docbook.FilenameType;
import org.docbook.ns.docbook.FirsttermType;
import org.docbook.ns.docbook.FootnoteType;
import org.docbook.ns.docbook.FootnoterefType;
import org.docbook.ns.docbook.ForeignphraseType;
import org.docbook.ns.docbook.FunctionType1;
import org.docbook.ns.docbook.GlosstermType;
import org.docbook.ns.docbook.GuibuttonType;
import org.docbook.ns.docbook.GuiiconType;
import org.docbook.ns.docbook.GuilabelType;
import org.docbook.ns.docbook.GuimenuType;
import org.docbook.ns.docbook.GuimenuitemType;
import org.docbook.ns.docbook.GuisubmenuType;
import org.docbook.ns.docbook.HardwareType;
import org.docbook.ns.docbook.IndextermType;
import org.docbook.ns.docbook.InitializerType;
import org.docbook.ns.docbook.InlineequationType;
import org.docbook.ns.docbook.InlinemediaobjectType;
import org.docbook.ns.docbook.InterfacenameType;
import org.docbook.ns.docbook.JobtitleType;
import org.docbook.ns.docbook.KeycapType;
import org.docbook.ns.docbook.KeycodeType;
import org.docbook.ns.docbook.KeycomboType;
import org.docbook.ns.docbook.KeysymType;
import org.docbook.ns.docbook.LinkType;
import org.docbook.ns.docbook.LiteralType;
import org.docbook.ns.docbook.MarkupType;
import org.docbook.ns.docbook.MenuchoiceType;
import org.docbook.ns.docbook.MethodnameType;
import org.docbook.ns.docbook.ModifierType;
import org.docbook.ns.docbook.MousebuttonType;
import org.docbook.ns.docbook.NonterminalType;
import org.docbook.ns.docbook.OlinkType;
import org.docbook.ns.docbook.OoclassType;
import org.docbook.ns.docbook.OoexceptionType;
import org.docbook.ns.docbook.OointerfaceType;
import org.docbook.ns.docbook.OptionType;
import org.docbook.ns.docbook.OptionalType;
import org.docbook.ns.docbook.OrgType;
import org.docbook.ns.docbook.OrgnameType;
import org.docbook.ns.docbook.PackageType;
import org.docbook.ns.docbook.ParameterType;
import org.docbook.ns.docbook.PersonType;
import org.docbook.ns.docbook.PersonnameType;
import org.docbook.ns.docbook.PhraseType;
import org.docbook.ns.docbook.ProductnameType;
import org.docbook.ns.docbook.ProductnumberType;
import org.docbook.ns.docbook.PromptType;
import org.docbook.ns.docbook.PropertyType;
import org.docbook.ns.docbook.QuoteType;
import org.docbook.ns.docbook.RemarkType;
import org.docbook.ns.docbook.ReplaceableType;
import org.docbook.ns.docbook.ReturnvalueType;
import org.docbook.ns.docbook.RevisionflagType;
import org.docbook.ns.docbook.SecondaryieType;
import org.docbook.ns.docbook.ShortcutType;
import org.docbook.ns.docbook.SubscriptType;
import org.docbook.ns.docbook.SuperscriptType;
import org.docbook.ns.docbook.SymbolType;
import org.docbook.ns.docbook.SystemitemType;
import org.docbook.ns.docbook.TagType;
import org.docbook.ns.docbook.TermdefType;
import org.docbook.ns.docbook.TokenType;
import org.docbook.ns.docbook.TrademarkType;
import org.docbook.ns.docbook.TypeType2;
import org.docbook.ns.docbook.UriType;
import org.docbook.ns.docbook.UserinputType;
import org.docbook.ns.docbook.VarnameType;
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

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Secondaryie Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.docbook.ns.docbook.impl.SecondaryieTypeImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.SecondaryieTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.SecondaryieTypeImpl#getInlinemediaobject <em>Inlinemediaobject</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.SecondaryieTypeImpl#getRemark <em>Remark</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.SecondaryieTypeImpl#getSuperscript <em>Superscript</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.SecondaryieTypeImpl#getSubscript <em>Subscript</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.SecondaryieTypeImpl#getXref <em>Xref</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.SecondaryieTypeImpl#getLink <em>Link</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.SecondaryieTypeImpl#getOlink <em>Olink</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.SecondaryieTypeImpl#getAnchor <em>Anchor</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.SecondaryieTypeImpl#getBiblioref <em>Biblioref</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.SecondaryieTypeImpl#getAlt <em>Alt</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.SecondaryieTypeImpl#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.SecondaryieTypeImpl#getIndexterm <em>Indexterm</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.SecondaryieTypeImpl#getAbbrev <em>Abbrev</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.SecondaryieTypeImpl#getAcronym <em>Acronym</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.SecondaryieTypeImpl#getDate <em>Date</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.SecondaryieTypeImpl#getEmphasis <em>Emphasis</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.SecondaryieTypeImpl#getFootnote <em>Footnote</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.SecondaryieTypeImpl#getFootnoteref <em>Footnoteref</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.SecondaryieTypeImpl#getForeignphrase <em>Foreignphrase</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.SecondaryieTypeImpl#getPhrase <em>Phrase</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.SecondaryieTypeImpl#getQuote <em>Quote</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.SecondaryieTypeImpl#getWordasword <em>Wordasword</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.SecondaryieTypeImpl#getFirstterm <em>Firstterm</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.SecondaryieTypeImpl#getGlossterm <em>Glossterm</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.SecondaryieTypeImpl#getCoref <em>Coref</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.SecondaryieTypeImpl#getTrademark <em>Trademark</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.SecondaryieTypeImpl#getProductnumber <em>Productnumber</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.SecondaryieTypeImpl#getProductname <em>Productname</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.SecondaryieTypeImpl#getDatabase <em>Database</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.SecondaryieTypeImpl#getApplication <em>Application</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.SecondaryieTypeImpl#getHardware <em>Hardware</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.SecondaryieTypeImpl#getCitation <em>Citation</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.SecondaryieTypeImpl#getCiterefentry <em>Citerefentry</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.SecondaryieTypeImpl#getCitetitle <em>Citetitle</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.SecondaryieTypeImpl#getCitebiblioid <em>Citebiblioid</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.SecondaryieTypeImpl#getAuthor <em>Author</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.SecondaryieTypeImpl#getPerson <em>Person</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.SecondaryieTypeImpl#getPersonname <em>Personname</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.SecondaryieTypeImpl#getOrg <em>Org</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.SecondaryieTypeImpl#getOrgname <em>Orgname</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.SecondaryieTypeImpl#getEditor <em>Editor</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.SecondaryieTypeImpl#getJobtitle <em>Jobtitle</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.SecondaryieTypeImpl#getReplaceable <em>Replaceable</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.SecondaryieTypeImpl#getPackage <em>Package</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.SecondaryieTypeImpl#getParameter <em>Parameter</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.SecondaryieTypeImpl#getTermdef <em>Termdef</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.SecondaryieTypeImpl#getNonterminal <em>Nonterminal</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.SecondaryieTypeImpl#getSystemitem <em>Systemitem</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.SecondaryieTypeImpl#getOption <em>Option</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.SecondaryieTypeImpl#getOptional <em>Optional</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.SecondaryieTypeImpl#getProperty <em>Property</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.SecondaryieTypeImpl#getInlineequation <em>Inlineequation</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.SecondaryieTypeImpl#getTag <em>Tag</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.SecondaryieTypeImpl#getMarkup <em>Markup</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.SecondaryieTypeImpl#getToken <em>Token</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.SecondaryieTypeImpl#getSymbol <em>Symbol</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.SecondaryieTypeImpl#getLiteral <em>Literal</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.SecondaryieTypeImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.SecondaryieTypeImpl#getConstant <em>Constant</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.SecondaryieTypeImpl#getEmail <em>Email</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.SecondaryieTypeImpl#getUri <em>Uri</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.SecondaryieTypeImpl#getGuiicon <em>Guiicon</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.SecondaryieTypeImpl#getGuibutton <em>Guibutton</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.SecondaryieTypeImpl#getGuimenuitem <em>Guimenuitem</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.SecondaryieTypeImpl#getGuimenu <em>Guimenu</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.SecondaryieTypeImpl#getGuisubmenu <em>Guisubmenu</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.SecondaryieTypeImpl#getGuilabel <em>Guilabel</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.SecondaryieTypeImpl#getMenuchoice <em>Menuchoice</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.SecondaryieTypeImpl#getMousebutton <em>Mousebutton</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.SecondaryieTypeImpl#getKeycombo <em>Keycombo</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.SecondaryieTypeImpl#getKeycap <em>Keycap</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.SecondaryieTypeImpl#getKeycode <em>Keycode</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.SecondaryieTypeImpl#getKeysym <em>Keysym</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.SecondaryieTypeImpl#getShortcut <em>Shortcut</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.SecondaryieTypeImpl#getAccel <em>Accel</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.SecondaryieTypeImpl#getPrompt <em>Prompt</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.SecondaryieTypeImpl#getEnvar <em>Envar</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.SecondaryieTypeImpl#getFilename <em>Filename</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.SecondaryieTypeImpl#getCommand <em>Command</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.SecondaryieTypeImpl#getComputeroutput <em>Computeroutput</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.SecondaryieTypeImpl#getUserinput <em>Userinput</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.SecondaryieTypeImpl#getFunction <em>Function</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.SecondaryieTypeImpl#getVarname <em>Varname</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.SecondaryieTypeImpl#getReturnvalue <em>Returnvalue</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.SecondaryieTypeImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.SecondaryieTypeImpl#getClassname <em>Classname</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.SecondaryieTypeImpl#getExceptionname <em>Exceptionname</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.SecondaryieTypeImpl#getInterfacename <em>Interfacename</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.SecondaryieTypeImpl#getMethodname <em>Methodname</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.SecondaryieTypeImpl#getModifier <em>Modifier</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.SecondaryieTypeImpl#getInitializer <em>Initializer</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.SecondaryieTypeImpl#getOoclass <em>Ooclass</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.SecondaryieTypeImpl#getOoexception <em>Ooexception</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.SecondaryieTypeImpl#getOointerface <em>Oointerface</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.SecondaryieTypeImpl#getErrorcode <em>Errorcode</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.SecondaryieTypeImpl#getErrortext <em>Errortext</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.SecondaryieTypeImpl#getErrorname <em>Errorname</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.SecondaryieTypeImpl#getErrortype <em>Errortype</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.SecondaryieTypeImpl#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.SecondaryieTypeImpl#getArch <em>Arch</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.SecondaryieTypeImpl#getAudience <em>Audience</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.SecondaryieTypeImpl#getBase <em>Base</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.SecondaryieTypeImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.SecondaryieTypeImpl#getConformance <em>Conformance</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.SecondaryieTypeImpl#getDir <em>Dir</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.SecondaryieTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.SecondaryieTypeImpl#getLang <em>Lang</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.SecondaryieTypeImpl#getLinkends <em>Linkends</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.SecondaryieTypeImpl#getOs <em>Os</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.SecondaryieTypeImpl#getRemap <em>Remap</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.SecondaryieTypeImpl#getRevision <em>Revision</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.SecondaryieTypeImpl#getRevisionflag <em>Revisionflag</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.SecondaryieTypeImpl#getRole <em>Role</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.SecondaryieTypeImpl#getSecurity <em>Security</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.SecondaryieTypeImpl#getUserlevel <em>Userlevel</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.SecondaryieTypeImpl#getVendor <em>Vendor</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.SecondaryieTypeImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.SecondaryieTypeImpl#getWordsize <em>Wordsize</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.SecondaryieTypeImpl#getXreflabel <em>Xreflabel</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SecondaryieTypeImpl extends MinimalEObjectImpl.Container implements SecondaryieType {
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
	 * The default value of the '{@link #getLinkends() <em>Linkends</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkends()
	 * @generated
	 * @ordered
	 */
	protected static final List<String> LINKENDS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLinkends() <em>Linkends</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkends()
	 * @generated
	 * @ordered
	 */
	protected List<String> linkends = LINKENDS_EDEFAULT;

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
	protected SecondaryieTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DocbookPackage.eINSTANCE.getSecondaryieType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, DocbookPackage.SECONDARYIE_TYPE__MIXED);
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
		return (FeatureMap)getMixed().<FeatureMap.Entry>list(DocbookPackage.eINSTANCE.getSecondaryieType_Group());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InlinemediaobjectType> getInlinemediaobject() {
		return getGroup().list(DocbookPackage.eINSTANCE.getSecondaryieType_Inlinemediaobject());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RemarkType> getRemark() {
		return getGroup().list(DocbookPackage.eINSTANCE.getSecondaryieType_Remark());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SuperscriptType> getSuperscript() {
		return getGroup().list(DocbookPackage.eINSTANCE.getSecondaryieType_Superscript());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SubscriptType> getSubscript() {
		return getGroup().list(DocbookPackage.eINSTANCE.getSecondaryieType_Subscript());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<XrefType> getXref() {
		return getGroup().list(DocbookPackage.eINSTANCE.getSecondaryieType_Xref());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<LinkType> getLink() {
		return getGroup().list(DocbookPackage.eINSTANCE.getSecondaryieType_Link());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<OlinkType> getOlink() {
		return getGroup().list(DocbookPackage.eINSTANCE.getSecondaryieType_Olink());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AnchorType> getAnchor() {
		return getGroup().list(DocbookPackage.eINSTANCE.getSecondaryieType_Anchor());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BibliorefType> getBiblioref() {
		return getGroup().list(DocbookPackage.eINSTANCE.getSecondaryieType_Biblioref());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AltType> getAlt() {
		return getGroup().list(DocbookPackage.eINSTANCE.getSecondaryieType_Alt());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AnnotationType> getAnnotation() {
		return getGroup().list(DocbookPackage.eINSTANCE.getSecondaryieType_Annotation());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<IndextermType> getIndexterm() {
		return getGroup().list(DocbookPackage.eINSTANCE.getSecondaryieType_Indexterm());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbbrevType> getAbbrev() {
		return getGroup().list(DocbookPackage.eINSTANCE.getSecondaryieType_Abbrev());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AcronymType> getAcronym() {
		return getGroup().list(DocbookPackage.eINSTANCE.getSecondaryieType_Acronym());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DateType> getDate() {
		return getGroup().list(DocbookPackage.eINSTANCE.getSecondaryieType_Date());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EmphasisType> getEmphasis() {
		return getGroup().list(DocbookPackage.eINSTANCE.getSecondaryieType_Emphasis());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FootnoteType> getFootnote() {
		return getGroup().list(DocbookPackage.eINSTANCE.getSecondaryieType_Footnote());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FootnoterefType> getFootnoteref() {
		return getGroup().list(DocbookPackage.eINSTANCE.getSecondaryieType_Footnoteref());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ForeignphraseType> getForeignphrase() {
		return getGroup().list(DocbookPackage.eINSTANCE.getSecondaryieType_Foreignphrase());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PhraseType> getPhrase() {
		return getGroup().list(DocbookPackage.eINSTANCE.getSecondaryieType_Phrase());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<QuoteType> getQuote() {
		return getGroup().list(DocbookPackage.eINSTANCE.getSecondaryieType_Quote());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<WordaswordType> getWordasword() {
		return getGroup().list(DocbookPackage.eINSTANCE.getSecondaryieType_Wordasword());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FirsttermType> getFirstterm() {
		return getGroup().list(DocbookPackage.eINSTANCE.getSecondaryieType_Firstterm());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<GlosstermType> getGlossterm() {
		return getGroup().list(DocbookPackage.eINSTANCE.getSecondaryieType_Glossterm());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CorefType> getCoref() {
		return getGroup().list(DocbookPackage.eINSTANCE.getSecondaryieType_Coref());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TrademarkType> getTrademark() {
		return getGroup().list(DocbookPackage.eINSTANCE.getSecondaryieType_Trademark());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ProductnumberType> getProductnumber() {
		return getGroup().list(DocbookPackage.eINSTANCE.getSecondaryieType_Productnumber());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ProductnameType> getProductname() {
		return getGroup().list(DocbookPackage.eINSTANCE.getSecondaryieType_Productname());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DatabaseType> getDatabase() {
		return getGroup().list(DocbookPackage.eINSTANCE.getSecondaryieType_Database());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ApplicationType> getApplication() {
		return getGroup().list(DocbookPackage.eINSTANCE.getSecondaryieType_Application());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<HardwareType> getHardware() {
		return getGroup().list(DocbookPackage.eINSTANCE.getSecondaryieType_Hardware());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CitationType> getCitation() {
		return getGroup().list(DocbookPackage.eINSTANCE.getSecondaryieType_Citation());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CiterefentryType> getCiterefentry() {
		return getGroup().list(DocbookPackage.eINSTANCE.getSecondaryieType_Citerefentry());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CitetitleType> getCitetitle() {
		return getGroup().list(DocbookPackage.eINSTANCE.getSecondaryieType_Citetitle());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CitebiblioidType> getCitebiblioid() {
		return getGroup().list(DocbookPackage.eINSTANCE.getSecondaryieType_Citebiblioid());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AuthorType> getAuthor() {
		return getGroup().list(DocbookPackage.eINSTANCE.getSecondaryieType_Author());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PersonType> getPerson() {
		return getGroup().list(DocbookPackage.eINSTANCE.getSecondaryieType_Person());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PersonnameType> getPersonname() {
		return getGroup().list(DocbookPackage.eINSTANCE.getSecondaryieType_Personname());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<OrgType> getOrg() {
		return getGroup().list(DocbookPackage.eINSTANCE.getSecondaryieType_Org());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<OrgnameType> getOrgname() {
		return getGroup().list(DocbookPackage.eINSTANCE.getSecondaryieType_Orgname());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EditorType> getEditor() {
		return getGroup().list(DocbookPackage.eINSTANCE.getSecondaryieType_Editor());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<JobtitleType> getJobtitle() {
		return getGroup().list(DocbookPackage.eINSTANCE.getSecondaryieType_Jobtitle());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ReplaceableType> getReplaceable() {
		return getGroup().list(DocbookPackage.eINSTANCE.getSecondaryieType_Replaceable());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PackageType> getPackage() {
		return getGroup().list(DocbookPackage.eINSTANCE.getSecondaryieType_Package());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ParameterType> getParameter() {
		return getGroup().list(DocbookPackage.eINSTANCE.getSecondaryieType_Parameter());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TermdefType> getTermdef() {
		return getGroup().list(DocbookPackage.eINSTANCE.getSecondaryieType_Termdef());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NonterminalType> getNonterminal() {
		return getGroup().list(DocbookPackage.eINSTANCE.getSecondaryieType_Nonterminal());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SystemitemType> getSystemitem() {
		return getGroup().list(DocbookPackage.eINSTANCE.getSecondaryieType_Systemitem());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<OptionType> getOption() {
		return getGroup().list(DocbookPackage.eINSTANCE.getSecondaryieType_Option());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<OptionalType> getOptional() {
		return getGroup().list(DocbookPackage.eINSTANCE.getSecondaryieType_Optional());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PropertyType> getProperty() {
		return getGroup().list(DocbookPackage.eINSTANCE.getSecondaryieType_Property());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InlineequationType> getInlineequation() {
		return getGroup().list(DocbookPackage.eINSTANCE.getSecondaryieType_Inlineequation());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TagType> getTag() {
		return getGroup().list(DocbookPackage.eINSTANCE.getSecondaryieType_Tag());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MarkupType> getMarkup() {
		return getGroup().list(DocbookPackage.eINSTANCE.getSecondaryieType_Markup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TokenType> getToken() {
		return getGroup().list(DocbookPackage.eINSTANCE.getSecondaryieType_Token());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SymbolType> getSymbol() {
		return getGroup().list(DocbookPackage.eINSTANCE.getSecondaryieType_Symbol());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<LiteralType> getLiteral() {
		return getGroup().list(DocbookPackage.eINSTANCE.getSecondaryieType_Literal());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeType> getCode() {
		return getGroup().list(DocbookPackage.eINSTANCE.getSecondaryieType_Code());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ConstantType> getConstant() {
		return getGroup().list(DocbookPackage.eINSTANCE.getSecondaryieType_Constant());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EmailType> getEmail() {
		return getGroup().list(DocbookPackage.eINSTANCE.getSecondaryieType_Email());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<UriType> getUri() {
		return getGroup().list(DocbookPackage.eINSTANCE.getSecondaryieType_Uri());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<GuiiconType> getGuiicon() {
		return getGroup().list(DocbookPackage.eINSTANCE.getSecondaryieType_Guiicon());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<GuibuttonType> getGuibutton() {
		return getGroup().list(DocbookPackage.eINSTANCE.getSecondaryieType_Guibutton());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<GuimenuitemType> getGuimenuitem() {
		return getGroup().list(DocbookPackage.eINSTANCE.getSecondaryieType_Guimenuitem());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<GuimenuType> getGuimenu() {
		return getGroup().list(DocbookPackage.eINSTANCE.getSecondaryieType_Guimenu());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<GuisubmenuType> getGuisubmenu() {
		return getGroup().list(DocbookPackage.eINSTANCE.getSecondaryieType_Guisubmenu());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<GuilabelType> getGuilabel() {
		return getGroup().list(DocbookPackage.eINSTANCE.getSecondaryieType_Guilabel());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MenuchoiceType> getMenuchoice() {
		return getGroup().list(DocbookPackage.eINSTANCE.getSecondaryieType_Menuchoice());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MousebuttonType> getMousebutton() {
		return getGroup().list(DocbookPackage.eINSTANCE.getSecondaryieType_Mousebutton());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<KeycomboType> getKeycombo() {
		return getGroup().list(DocbookPackage.eINSTANCE.getSecondaryieType_Keycombo());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<KeycapType> getKeycap() {
		return getGroup().list(DocbookPackage.eINSTANCE.getSecondaryieType_Keycap());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<KeycodeType> getKeycode() {
		return getGroup().list(DocbookPackage.eINSTANCE.getSecondaryieType_Keycode());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<KeysymType> getKeysym() {
		return getGroup().list(DocbookPackage.eINSTANCE.getSecondaryieType_Keysym());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ShortcutType> getShortcut() {
		return getGroup().list(DocbookPackage.eINSTANCE.getSecondaryieType_Shortcut());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AccelType> getAccel() {
		return getGroup().list(DocbookPackage.eINSTANCE.getSecondaryieType_Accel());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PromptType> getPrompt() {
		return getGroup().list(DocbookPackage.eINSTANCE.getSecondaryieType_Prompt());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EnvarType> getEnvar() {
		return getGroup().list(DocbookPackage.eINSTANCE.getSecondaryieType_Envar());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FilenameType> getFilename() {
		return getGroup().list(DocbookPackage.eINSTANCE.getSecondaryieType_Filename());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CommandType> getCommand() {
		return getGroup().list(DocbookPackage.eINSTANCE.getSecondaryieType_Command());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ComputeroutputType> getComputeroutput() {
		return getGroup().list(DocbookPackage.eINSTANCE.getSecondaryieType_Computeroutput());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<UserinputType> getUserinput() {
		return getGroup().list(DocbookPackage.eINSTANCE.getSecondaryieType_Userinput());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FunctionType1> getFunction() {
		return getGroup().list(DocbookPackage.eINSTANCE.getSecondaryieType_Function());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<VarnameType> getVarname() {
		return getGroup().list(DocbookPackage.eINSTANCE.getSecondaryieType_Varname());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ReturnvalueType> getReturnvalue() {
		return getGroup().list(DocbookPackage.eINSTANCE.getSecondaryieType_Returnvalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TypeType2> getType() {
		return getGroup().list(DocbookPackage.eINSTANCE.getSecondaryieType_Type());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ClassnameType> getClassname() {
		return getGroup().list(DocbookPackage.eINSTANCE.getSecondaryieType_Classname());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ExceptionnameType> getExceptionname() {
		return getGroup().list(DocbookPackage.eINSTANCE.getSecondaryieType_Exceptionname());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InterfacenameType> getInterfacename() {
		return getGroup().list(DocbookPackage.eINSTANCE.getSecondaryieType_Interfacename());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MethodnameType> getMethodname() {
		return getGroup().list(DocbookPackage.eINSTANCE.getSecondaryieType_Methodname());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ModifierType> getModifier() {
		return getGroup().list(DocbookPackage.eINSTANCE.getSecondaryieType_Modifier());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InitializerType> getInitializer() {
		return getGroup().list(DocbookPackage.eINSTANCE.getSecondaryieType_Initializer());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<OoclassType> getOoclass() {
		return getGroup().list(DocbookPackage.eINSTANCE.getSecondaryieType_Ooclass());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<OoexceptionType> getOoexception() {
		return getGroup().list(DocbookPackage.eINSTANCE.getSecondaryieType_Ooexception());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<OointerfaceType> getOointerface() {
		return getGroup().list(DocbookPackage.eINSTANCE.getSecondaryieType_Oointerface());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ErrorcodeType> getErrorcode() {
		return getGroup().list(DocbookPackage.eINSTANCE.getSecondaryieType_Errorcode());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ErrortextType> getErrortext() {
		return getGroup().list(DocbookPackage.eINSTANCE.getSecondaryieType_Errortext());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ErrornameType> getErrorname() {
		return getGroup().list(DocbookPackage.eINSTANCE.getSecondaryieType_Errorname());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ErrortypeType> getErrortype() {
		return getGroup().list(DocbookPackage.eINSTANCE.getSecondaryieType_Errortype());
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.SECONDARYIE_TYPE__ANNOTATIONS, oldAnnotations, annotations));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.SECONDARYIE_TYPE__ARCH, oldArch, arch));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.SECONDARYIE_TYPE__AUDIENCE, oldAudience, audience));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.SECONDARYIE_TYPE__BASE, oldBase, base));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.SECONDARYIE_TYPE__CONDITION, oldCondition, condition));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.SECONDARYIE_TYPE__CONFORMANCE, oldConformance, conformance));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.SECONDARYIE_TYPE__DIR, oldDir, dir, !oldDirESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, DocbookPackage.SECONDARYIE_TYPE__DIR, oldDir, DIR_EDEFAULT, oldDirESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.SECONDARYIE_TYPE__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.SECONDARYIE_TYPE__LANG, oldLang, lang));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> getLinkends() {
		return linkends;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLinkends(List<String> newLinkends) {
		List<String> oldLinkends = linkends;
		linkends = newLinkends;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.SECONDARYIE_TYPE__LINKENDS, oldLinkends, linkends));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.SECONDARYIE_TYPE__OS, oldOs, os));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.SECONDARYIE_TYPE__REMAP, oldRemap, remap));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.SECONDARYIE_TYPE__REVISION, oldRevision, revision));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.SECONDARYIE_TYPE__REVISIONFLAG, oldRevisionflag, revisionflag, !oldRevisionflagESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, DocbookPackage.SECONDARYIE_TYPE__REVISIONFLAG, oldRevisionflag, REVISIONFLAG_EDEFAULT, oldRevisionflagESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.SECONDARYIE_TYPE__ROLE, oldRole, role));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.SECONDARYIE_TYPE__SECURITY, oldSecurity, security));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.SECONDARYIE_TYPE__USERLEVEL, oldUserlevel, userlevel));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.SECONDARYIE_TYPE__VENDOR, oldVendor, vendor));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.SECONDARYIE_TYPE__VERSION, oldVersion, version));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.SECONDARYIE_TYPE__WORDSIZE, oldWordsize, wordsize));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.SECONDARYIE_TYPE__XREFLABEL, oldXreflabel, xreflabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DocbookPackage.SECONDARYIE_TYPE__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case DocbookPackage.SECONDARYIE_TYPE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case DocbookPackage.SECONDARYIE_TYPE__INLINEMEDIAOBJECT:
				return ((InternalEList<?>)getInlinemediaobject()).basicRemove(otherEnd, msgs);
			case DocbookPackage.SECONDARYIE_TYPE__REMARK:
				return ((InternalEList<?>)getRemark()).basicRemove(otherEnd, msgs);
			case DocbookPackage.SECONDARYIE_TYPE__SUPERSCRIPT:
				return ((InternalEList<?>)getSuperscript()).basicRemove(otherEnd, msgs);
			case DocbookPackage.SECONDARYIE_TYPE__SUBSCRIPT:
				return ((InternalEList<?>)getSubscript()).basicRemove(otherEnd, msgs);
			case DocbookPackage.SECONDARYIE_TYPE__XREF:
				return ((InternalEList<?>)getXref()).basicRemove(otherEnd, msgs);
			case DocbookPackage.SECONDARYIE_TYPE__LINK:
				return ((InternalEList<?>)getLink()).basicRemove(otherEnd, msgs);
			case DocbookPackage.SECONDARYIE_TYPE__OLINK:
				return ((InternalEList<?>)getOlink()).basicRemove(otherEnd, msgs);
			case DocbookPackage.SECONDARYIE_TYPE__ANCHOR:
				return ((InternalEList<?>)getAnchor()).basicRemove(otherEnd, msgs);
			case DocbookPackage.SECONDARYIE_TYPE__BIBLIOREF:
				return ((InternalEList<?>)getBiblioref()).basicRemove(otherEnd, msgs);
			case DocbookPackage.SECONDARYIE_TYPE__ALT:
				return ((InternalEList<?>)getAlt()).basicRemove(otherEnd, msgs);
			case DocbookPackage.SECONDARYIE_TYPE__ANNOTATION:
				return ((InternalEList<?>)getAnnotation()).basicRemove(otherEnd, msgs);
			case DocbookPackage.SECONDARYIE_TYPE__INDEXTERM:
				return ((InternalEList<?>)getIndexterm()).basicRemove(otherEnd, msgs);
			case DocbookPackage.SECONDARYIE_TYPE__ABBREV:
				return ((InternalEList<?>)getAbbrev()).basicRemove(otherEnd, msgs);
			case DocbookPackage.SECONDARYIE_TYPE__ACRONYM:
				return ((InternalEList<?>)getAcronym()).basicRemove(otherEnd, msgs);
			case DocbookPackage.SECONDARYIE_TYPE__DATE:
				return ((InternalEList<?>)getDate()).basicRemove(otherEnd, msgs);
			case DocbookPackage.SECONDARYIE_TYPE__EMPHASIS:
				return ((InternalEList<?>)getEmphasis()).basicRemove(otherEnd, msgs);
			case DocbookPackage.SECONDARYIE_TYPE__FOOTNOTE:
				return ((InternalEList<?>)getFootnote()).basicRemove(otherEnd, msgs);
			case DocbookPackage.SECONDARYIE_TYPE__FOOTNOTEREF:
				return ((InternalEList<?>)getFootnoteref()).basicRemove(otherEnd, msgs);
			case DocbookPackage.SECONDARYIE_TYPE__FOREIGNPHRASE:
				return ((InternalEList<?>)getForeignphrase()).basicRemove(otherEnd, msgs);
			case DocbookPackage.SECONDARYIE_TYPE__PHRASE:
				return ((InternalEList<?>)getPhrase()).basicRemove(otherEnd, msgs);
			case DocbookPackage.SECONDARYIE_TYPE__QUOTE:
				return ((InternalEList<?>)getQuote()).basicRemove(otherEnd, msgs);
			case DocbookPackage.SECONDARYIE_TYPE__WORDASWORD:
				return ((InternalEList<?>)getWordasword()).basicRemove(otherEnd, msgs);
			case DocbookPackage.SECONDARYIE_TYPE__FIRSTTERM:
				return ((InternalEList<?>)getFirstterm()).basicRemove(otherEnd, msgs);
			case DocbookPackage.SECONDARYIE_TYPE__GLOSSTERM:
				return ((InternalEList<?>)getGlossterm()).basicRemove(otherEnd, msgs);
			case DocbookPackage.SECONDARYIE_TYPE__COREF:
				return ((InternalEList<?>)getCoref()).basicRemove(otherEnd, msgs);
			case DocbookPackage.SECONDARYIE_TYPE__TRADEMARK:
				return ((InternalEList<?>)getTrademark()).basicRemove(otherEnd, msgs);
			case DocbookPackage.SECONDARYIE_TYPE__PRODUCTNUMBER:
				return ((InternalEList<?>)getProductnumber()).basicRemove(otherEnd, msgs);
			case DocbookPackage.SECONDARYIE_TYPE__PRODUCTNAME:
				return ((InternalEList<?>)getProductname()).basicRemove(otherEnd, msgs);
			case DocbookPackage.SECONDARYIE_TYPE__DATABASE:
				return ((InternalEList<?>)getDatabase()).basicRemove(otherEnd, msgs);
			case DocbookPackage.SECONDARYIE_TYPE__APPLICATION:
				return ((InternalEList<?>)getApplication()).basicRemove(otherEnd, msgs);
			case DocbookPackage.SECONDARYIE_TYPE__HARDWARE:
				return ((InternalEList<?>)getHardware()).basicRemove(otherEnd, msgs);
			case DocbookPackage.SECONDARYIE_TYPE__CITATION:
				return ((InternalEList<?>)getCitation()).basicRemove(otherEnd, msgs);
			case DocbookPackage.SECONDARYIE_TYPE__CITEREFENTRY:
				return ((InternalEList<?>)getCiterefentry()).basicRemove(otherEnd, msgs);
			case DocbookPackage.SECONDARYIE_TYPE__CITETITLE:
				return ((InternalEList<?>)getCitetitle()).basicRemove(otherEnd, msgs);
			case DocbookPackage.SECONDARYIE_TYPE__CITEBIBLIOID:
				return ((InternalEList<?>)getCitebiblioid()).basicRemove(otherEnd, msgs);
			case DocbookPackage.SECONDARYIE_TYPE__AUTHOR:
				return ((InternalEList<?>)getAuthor()).basicRemove(otherEnd, msgs);
			case DocbookPackage.SECONDARYIE_TYPE__PERSON:
				return ((InternalEList<?>)getPerson()).basicRemove(otherEnd, msgs);
			case DocbookPackage.SECONDARYIE_TYPE__PERSONNAME:
				return ((InternalEList<?>)getPersonname()).basicRemove(otherEnd, msgs);
			case DocbookPackage.SECONDARYIE_TYPE__ORG:
				return ((InternalEList<?>)getOrg()).basicRemove(otherEnd, msgs);
			case DocbookPackage.SECONDARYIE_TYPE__ORGNAME:
				return ((InternalEList<?>)getOrgname()).basicRemove(otherEnd, msgs);
			case DocbookPackage.SECONDARYIE_TYPE__EDITOR:
				return ((InternalEList<?>)getEditor()).basicRemove(otherEnd, msgs);
			case DocbookPackage.SECONDARYIE_TYPE__JOBTITLE:
				return ((InternalEList<?>)getJobtitle()).basicRemove(otherEnd, msgs);
			case DocbookPackage.SECONDARYIE_TYPE__REPLACEABLE:
				return ((InternalEList<?>)getReplaceable()).basicRemove(otherEnd, msgs);
			case DocbookPackage.SECONDARYIE_TYPE__PACKAGE:
				return ((InternalEList<?>)getPackage()).basicRemove(otherEnd, msgs);
			case DocbookPackage.SECONDARYIE_TYPE__PARAMETER:
				return ((InternalEList<?>)getParameter()).basicRemove(otherEnd, msgs);
			case DocbookPackage.SECONDARYIE_TYPE__TERMDEF:
				return ((InternalEList<?>)getTermdef()).basicRemove(otherEnd, msgs);
			case DocbookPackage.SECONDARYIE_TYPE__NONTERMINAL:
				return ((InternalEList<?>)getNonterminal()).basicRemove(otherEnd, msgs);
			case DocbookPackage.SECONDARYIE_TYPE__SYSTEMITEM:
				return ((InternalEList<?>)getSystemitem()).basicRemove(otherEnd, msgs);
			case DocbookPackage.SECONDARYIE_TYPE__OPTION:
				return ((InternalEList<?>)getOption()).basicRemove(otherEnd, msgs);
			case DocbookPackage.SECONDARYIE_TYPE__OPTIONAL:
				return ((InternalEList<?>)getOptional()).basicRemove(otherEnd, msgs);
			case DocbookPackage.SECONDARYIE_TYPE__PROPERTY:
				return ((InternalEList<?>)getProperty()).basicRemove(otherEnd, msgs);
			case DocbookPackage.SECONDARYIE_TYPE__INLINEEQUATION:
				return ((InternalEList<?>)getInlineequation()).basicRemove(otherEnd, msgs);
			case DocbookPackage.SECONDARYIE_TYPE__TAG:
				return ((InternalEList<?>)getTag()).basicRemove(otherEnd, msgs);
			case DocbookPackage.SECONDARYIE_TYPE__MARKUP:
				return ((InternalEList<?>)getMarkup()).basicRemove(otherEnd, msgs);
			case DocbookPackage.SECONDARYIE_TYPE__TOKEN:
				return ((InternalEList<?>)getToken()).basicRemove(otherEnd, msgs);
			case DocbookPackage.SECONDARYIE_TYPE__SYMBOL:
				return ((InternalEList<?>)getSymbol()).basicRemove(otherEnd, msgs);
			case DocbookPackage.SECONDARYIE_TYPE__LITERAL:
				return ((InternalEList<?>)getLiteral()).basicRemove(otherEnd, msgs);
			case DocbookPackage.SECONDARYIE_TYPE__CODE:
				return ((InternalEList<?>)getCode()).basicRemove(otherEnd, msgs);
			case DocbookPackage.SECONDARYIE_TYPE__CONSTANT:
				return ((InternalEList<?>)getConstant()).basicRemove(otherEnd, msgs);
			case DocbookPackage.SECONDARYIE_TYPE__EMAIL:
				return ((InternalEList<?>)getEmail()).basicRemove(otherEnd, msgs);
			case DocbookPackage.SECONDARYIE_TYPE__URI:
				return ((InternalEList<?>)getUri()).basicRemove(otherEnd, msgs);
			case DocbookPackage.SECONDARYIE_TYPE__GUIICON:
				return ((InternalEList<?>)getGuiicon()).basicRemove(otherEnd, msgs);
			case DocbookPackage.SECONDARYIE_TYPE__GUIBUTTON:
				return ((InternalEList<?>)getGuibutton()).basicRemove(otherEnd, msgs);
			case DocbookPackage.SECONDARYIE_TYPE__GUIMENUITEM:
				return ((InternalEList<?>)getGuimenuitem()).basicRemove(otherEnd, msgs);
			case DocbookPackage.SECONDARYIE_TYPE__GUIMENU:
				return ((InternalEList<?>)getGuimenu()).basicRemove(otherEnd, msgs);
			case DocbookPackage.SECONDARYIE_TYPE__GUISUBMENU:
				return ((InternalEList<?>)getGuisubmenu()).basicRemove(otherEnd, msgs);
			case DocbookPackage.SECONDARYIE_TYPE__GUILABEL:
				return ((InternalEList<?>)getGuilabel()).basicRemove(otherEnd, msgs);
			case DocbookPackage.SECONDARYIE_TYPE__MENUCHOICE:
				return ((InternalEList<?>)getMenuchoice()).basicRemove(otherEnd, msgs);
			case DocbookPackage.SECONDARYIE_TYPE__MOUSEBUTTON:
				return ((InternalEList<?>)getMousebutton()).basicRemove(otherEnd, msgs);
			case DocbookPackage.SECONDARYIE_TYPE__KEYCOMBO:
				return ((InternalEList<?>)getKeycombo()).basicRemove(otherEnd, msgs);
			case DocbookPackage.SECONDARYIE_TYPE__KEYCAP:
				return ((InternalEList<?>)getKeycap()).basicRemove(otherEnd, msgs);
			case DocbookPackage.SECONDARYIE_TYPE__KEYCODE:
				return ((InternalEList<?>)getKeycode()).basicRemove(otherEnd, msgs);
			case DocbookPackage.SECONDARYIE_TYPE__KEYSYM:
				return ((InternalEList<?>)getKeysym()).basicRemove(otherEnd, msgs);
			case DocbookPackage.SECONDARYIE_TYPE__SHORTCUT:
				return ((InternalEList<?>)getShortcut()).basicRemove(otherEnd, msgs);
			case DocbookPackage.SECONDARYIE_TYPE__ACCEL:
				return ((InternalEList<?>)getAccel()).basicRemove(otherEnd, msgs);
			case DocbookPackage.SECONDARYIE_TYPE__PROMPT:
				return ((InternalEList<?>)getPrompt()).basicRemove(otherEnd, msgs);
			case DocbookPackage.SECONDARYIE_TYPE__ENVAR:
				return ((InternalEList<?>)getEnvar()).basicRemove(otherEnd, msgs);
			case DocbookPackage.SECONDARYIE_TYPE__FILENAME:
				return ((InternalEList<?>)getFilename()).basicRemove(otherEnd, msgs);
			case DocbookPackage.SECONDARYIE_TYPE__COMMAND:
				return ((InternalEList<?>)getCommand()).basicRemove(otherEnd, msgs);
			case DocbookPackage.SECONDARYIE_TYPE__COMPUTEROUTPUT:
				return ((InternalEList<?>)getComputeroutput()).basicRemove(otherEnd, msgs);
			case DocbookPackage.SECONDARYIE_TYPE__USERINPUT:
				return ((InternalEList<?>)getUserinput()).basicRemove(otherEnd, msgs);
			case DocbookPackage.SECONDARYIE_TYPE__FUNCTION:
				return ((InternalEList<?>)getFunction()).basicRemove(otherEnd, msgs);
			case DocbookPackage.SECONDARYIE_TYPE__VARNAME:
				return ((InternalEList<?>)getVarname()).basicRemove(otherEnd, msgs);
			case DocbookPackage.SECONDARYIE_TYPE__RETURNVALUE:
				return ((InternalEList<?>)getReturnvalue()).basicRemove(otherEnd, msgs);
			case DocbookPackage.SECONDARYIE_TYPE__TYPE:
				return ((InternalEList<?>)getType()).basicRemove(otherEnd, msgs);
			case DocbookPackage.SECONDARYIE_TYPE__CLASSNAME:
				return ((InternalEList<?>)getClassname()).basicRemove(otherEnd, msgs);
			case DocbookPackage.SECONDARYIE_TYPE__EXCEPTIONNAME:
				return ((InternalEList<?>)getExceptionname()).basicRemove(otherEnd, msgs);
			case DocbookPackage.SECONDARYIE_TYPE__INTERFACENAME:
				return ((InternalEList<?>)getInterfacename()).basicRemove(otherEnd, msgs);
			case DocbookPackage.SECONDARYIE_TYPE__METHODNAME:
				return ((InternalEList<?>)getMethodname()).basicRemove(otherEnd, msgs);
			case DocbookPackage.SECONDARYIE_TYPE__MODIFIER:
				return ((InternalEList<?>)getModifier()).basicRemove(otherEnd, msgs);
			case DocbookPackage.SECONDARYIE_TYPE__INITIALIZER:
				return ((InternalEList<?>)getInitializer()).basicRemove(otherEnd, msgs);
			case DocbookPackage.SECONDARYIE_TYPE__OOCLASS:
				return ((InternalEList<?>)getOoclass()).basicRemove(otherEnd, msgs);
			case DocbookPackage.SECONDARYIE_TYPE__OOEXCEPTION:
				return ((InternalEList<?>)getOoexception()).basicRemove(otherEnd, msgs);
			case DocbookPackage.SECONDARYIE_TYPE__OOINTERFACE:
				return ((InternalEList<?>)getOointerface()).basicRemove(otherEnd, msgs);
			case DocbookPackage.SECONDARYIE_TYPE__ERRORCODE:
				return ((InternalEList<?>)getErrorcode()).basicRemove(otherEnd, msgs);
			case DocbookPackage.SECONDARYIE_TYPE__ERRORTEXT:
				return ((InternalEList<?>)getErrortext()).basicRemove(otherEnd, msgs);
			case DocbookPackage.SECONDARYIE_TYPE__ERRORNAME:
				return ((InternalEList<?>)getErrorname()).basicRemove(otherEnd, msgs);
			case DocbookPackage.SECONDARYIE_TYPE__ERRORTYPE:
				return ((InternalEList<?>)getErrortype()).basicRemove(otherEnd, msgs);
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
			case DocbookPackage.SECONDARYIE_TYPE__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case DocbookPackage.SECONDARYIE_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case DocbookPackage.SECONDARYIE_TYPE__INLINEMEDIAOBJECT:
				return getInlinemediaobject();
			case DocbookPackage.SECONDARYIE_TYPE__REMARK:
				return getRemark();
			case DocbookPackage.SECONDARYIE_TYPE__SUPERSCRIPT:
				return getSuperscript();
			case DocbookPackage.SECONDARYIE_TYPE__SUBSCRIPT:
				return getSubscript();
			case DocbookPackage.SECONDARYIE_TYPE__XREF:
				return getXref();
			case DocbookPackage.SECONDARYIE_TYPE__LINK:
				return getLink();
			case DocbookPackage.SECONDARYIE_TYPE__OLINK:
				return getOlink();
			case DocbookPackage.SECONDARYIE_TYPE__ANCHOR:
				return getAnchor();
			case DocbookPackage.SECONDARYIE_TYPE__BIBLIOREF:
				return getBiblioref();
			case DocbookPackage.SECONDARYIE_TYPE__ALT:
				return getAlt();
			case DocbookPackage.SECONDARYIE_TYPE__ANNOTATION:
				return getAnnotation();
			case DocbookPackage.SECONDARYIE_TYPE__INDEXTERM:
				return getIndexterm();
			case DocbookPackage.SECONDARYIE_TYPE__ABBREV:
				return getAbbrev();
			case DocbookPackage.SECONDARYIE_TYPE__ACRONYM:
				return getAcronym();
			case DocbookPackage.SECONDARYIE_TYPE__DATE:
				return getDate();
			case DocbookPackage.SECONDARYIE_TYPE__EMPHASIS:
				return getEmphasis();
			case DocbookPackage.SECONDARYIE_TYPE__FOOTNOTE:
				return getFootnote();
			case DocbookPackage.SECONDARYIE_TYPE__FOOTNOTEREF:
				return getFootnoteref();
			case DocbookPackage.SECONDARYIE_TYPE__FOREIGNPHRASE:
				return getForeignphrase();
			case DocbookPackage.SECONDARYIE_TYPE__PHRASE:
				return getPhrase();
			case DocbookPackage.SECONDARYIE_TYPE__QUOTE:
				return getQuote();
			case DocbookPackage.SECONDARYIE_TYPE__WORDASWORD:
				return getWordasword();
			case DocbookPackage.SECONDARYIE_TYPE__FIRSTTERM:
				return getFirstterm();
			case DocbookPackage.SECONDARYIE_TYPE__GLOSSTERM:
				return getGlossterm();
			case DocbookPackage.SECONDARYIE_TYPE__COREF:
				return getCoref();
			case DocbookPackage.SECONDARYIE_TYPE__TRADEMARK:
				return getTrademark();
			case DocbookPackage.SECONDARYIE_TYPE__PRODUCTNUMBER:
				return getProductnumber();
			case DocbookPackage.SECONDARYIE_TYPE__PRODUCTNAME:
				return getProductname();
			case DocbookPackage.SECONDARYIE_TYPE__DATABASE:
				return getDatabase();
			case DocbookPackage.SECONDARYIE_TYPE__APPLICATION:
				return getApplication();
			case DocbookPackage.SECONDARYIE_TYPE__HARDWARE:
				return getHardware();
			case DocbookPackage.SECONDARYIE_TYPE__CITATION:
				return getCitation();
			case DocbookPackage.SECONDARYIE_TYPE__CITEREFENTRY:
				return getCiterefentry();
			case DocbookPackage.SECONDARYIE_TYPE__CITETITLE:
				return getCitetitle();
			case DocbookPackage.SECONDARYIE_TYPE__CITEBIBLIOID:
				return getCitebiblioid();
			case DocbookPackage.SECONDARYIE_TYPE__AUTHOR:
				return getAuthor();
			case DocbookPackage.SECONDARYIE_TYPE__PERSON:
				return getPerson();
			case DocbookPackage.SECONDARYIE_TYPE__PERSONNAME:
				return getPersonname();
			case DocbookPackage.SECONDARYIE_TYPE__ORG:
				return getOrg();
			case DocbookPackage.SECONDARYIE_TYPE__ORGNAME:
				return getOrgname();
			case DocbookPackage.SECONDARYIE_TYPE__EDITOR:
				return getEditor();
			case DocbookPackage.SECONDARYIE_TYPE__JOBTITLE:
				return getJobtitle();
			case DocbookPackage.SECONDARYIE_TYPE__REPLACEABLE:
				return getReplaceable();
			case DocbookPackage.SECONDARYIE_TYPE__PACKAGE:
				return getPackage();
			case DocbookPackage.SECONDARYIE_TYPE__PARAMETER:
				return getParameter();
			case DocbookPackage.SECONDARYIE_TYPE__TERMDEF:
				return getTermdef();
			case DocbookPackage.SECONDARYIE_TYPE__NONTERMINAL:
				return getNonterminal();
			case DocbookPackage.SECONDARYIE_TYPE__SYSTEMITEM:
				return getSystemitem();
			case DocbookPackage.SECONDARYIE_TYPE__OPTION:
				return getOption();
			case DocbookPackage.SECONDARYIE_TYPE__OPTIONAL:
				return getOptional();
			case DocbookPackage.SECONDARYIE_TYPE__PROPERTY:
				return getProperty();
			case DocbookPackage.SECONDARYIE_TYPE__INLINEEQUATION:
				return getInlineequation();
			case DocbookPackage.SECONDARYIE_TYPE__TAG:
				return getTag();
			case DocbookPackage.SECONDARYIE_TYPE__MARKUP:
				return getMarkup();
			case DocbookPackage.SECONDARYIE_TYPE__TOKEN:
				return getToken();
			case DocbookPackage.SECONDARYIE_TYPE__SYMBOL:
				return getSymbol();
			case DocbookPackage.SECONDARYIE_TYPE__LITERAL:
				return getLiteral();
			case DocbookPackage.SECONDARYIE_TYPE__CODE:
				return getCode();
			case DocbookPackage.SECONDARYIE_TYPE__CONSTANT:
				return getConstant();
			case DocbookPackage.SECONDARYIE_TYPE__EMAIL:
				return getEmail();
			case DocbookPackage.SECONDARYIE_TYPE__URI:
				return getUri();
			case DocbookPackage.SECONDARYIE_TYPE__GUIICON:
				return getGuiicon();
			case DocbookPackage.SECONDARYIE_TYPE__GUIBUTTON:
				return getGuibutton();
			case DocbookPackage.SECONDARYIE_TYPE__GUIMENUITEM:
				return getGuimenuitem();
			case DocbookPackage.SECONDARYIE_TYPE__GUIMENU:
				return getGuimenu();
			case DocbookPackage.SECONDARYIE_TYPE__GUISUBMENU:
				return getGuisubmenu();
			case DocbookPackage.SECONDARYIE_TYPE__GUILABEL:
				return getGuilabel();
			case DocbookPackage.SECONDARYIE_TYPE__MENUCHOICE:
				return getMenuchoice();
			case DocbookPackage.SECONDARYIE_TYPE__MOUSEBUTTON:
				return getMousebutton();
			case DocbookPackage.SECONDARYIE_TYPE__KEYCOMBO:
				return getKeycombo();
			case DocbookPackage.SECONDARYIE_TYPE__KEYCAP:
				return getKeycap();
			case DocbookPackage.SECONDARYIE_TYPE__KEYCODE:
				return getKeycode();
			case DocbookPackage.SECONDARYIE_TYPE__KEYSYM:
				return getKeysym();
			case DocbookPackage.SECONDARYIE_TYPE__SHORTCUT:
				return getShortcut();
			case DocbookPackage.SECONDARYIE_TYPE__ACCEL:
				return getAccel();
			case DocbookPackage.SECONDARYIE_TYPE__PROMPT:
				return getPrompt();
			case DocbookPackage.SECONDARYIE_TYPE__ENVAR:
				return getEnvar();
			case DocbookPackage.SECONDARYIE_TYPE__FILENAME:
				return getFilename();
			case DocbookPackage.SECONDARYIE_TYPE__COMMAND:
				return getCommand();
			case DocbookPackage.SECONDARYIE_TYPE__COMPUTEROUTPUT:
				return getComputeroutput();
			case DocbookPackage.SECONDARYIE_TYPE__USERINPUT:
				return getUserinput();
			case DocbookPackage.SECONDARYIE_TYPE__FUNCTION:
				return getFunction();
			case DocbookPackage.SECONDARYIE_TYPE__VARNAME:
				return getVarname();
			case DocbookPackage.SECONDARYIE_TYPE__RETURNVALUE:
				return getReturnvalue();
			case DocbookPackage.SECONDARYIE_TYPE__TYPE:
				return getType();
			case DocbookPackage.SECONDARYIE_TYPE__CLASSNAME:
				return getClassname();
			case DocbookPackage.SECONDARYIE_TYPE__EXCEPTIONNAME:
				return getExceptionname();
			case DocbookPackage.SECONDARYIE_TYPE__INTERFACENAME:
				return getInterfacename();
			case DocbookPackage.SECONDARYIE_TYPE__METHODNAME:
				return getMethodname();
			case DocbookPackage.SECONDARYIE_TYPE__MODIFIER:
				return getModifier();
			case DocbookPackage.SECONDARYIE_TYPE__INITIALIZER:
				return getInitializer();
			case DocbookPackage.SECONDARYIE_TYPE__OOCLASS:
				return getOoclass();
			case DocbookPackage.SECONDARYIE_TYPE__OOEXCEPTION:
				return getOoexception();
			case DocbookPackage.SECONDARYIE_TYPE__OOINTERFACE:
				return getOointerface();
			case DocbookPackage.SECONDARYIE_TYPE__ERRORCODE:
				return getErrorcode();
			case DocbookPackage.SECONDARYIE_TYPE__ERRORTEXT:
				return getErrortext();
			case DocbookPackage.SECONDARYIE_TYPE__ERRORNAME:
				return getErrorname();
			case DocbookPackage.SECONDARYIE_TYPE__ERRORTYPE:
				return getErrortype();
			case DocbookPackage.SECONDARYIE_TYPE__ANNOTATIONS:
				return getAnnotations();
			case DocbookPackage.SECONDARYIE_TYPE__ARCH:
				return getArch();
			case DocbookPackage.SECONDARYIE_TYPE__AUDIENCE:
				return getAudience();
			case DocbookPackage.SECONDARYIE_TYPE__BASE:
				return getBase();
			case DocbookPackage.SECONDARYIE_TYPE__CONDITION:
				return getCondition();
			case DocbookPackage.SECONDARYIE_TYPE__CONFORMANCE:
				return getConformance();
			case DocbookPackage.SECONDARYIE_TYPE__DIR:
				return getDir();
			case DocbookPackage.SECONDARYIE_TYPE__ID:
				return getId();
			case DocbookPackage.SECONDARYIE_TYPE__LANG:
				return getLang();
			case DocbookPackage.SECONDARYIE_TYPE__LINKENDS:
				return getLinkends();
			case DocbookPackage.SECONDARYIE_TYPE__OS:
				return getOs();
			case DocbookPackage.SECONDARYIE_TYPE__REMAP:
				return getRemap();
			case DocbookPackage.SECONDARYIE_TYPE__REVISION:
				return getRevision();
			case DocbookPackage.SECONDARYIE_TYPE__REVISIONFLAG:
				return getRevisionflag();
			case DocbookPackage.SECONDARYIE_TYPE__ROLE:
				return getRole();
			case DocbookPackage.SECONDARYIE_TYPE__SECURITY:
				return getSecurity();
			case DocbookPackage.SECONDARYIE_TYPE__USERLEVEL:
				return getUserlevel();
			case DocbookPackage.SECONDARYIE_TYPE__VENDOR:
				return getVendor();
			case DocbookPackage.SECONDARYIE_TYPE__VERSION:
				return getVersion();
			case DocbookPackage.SECONDARYIE_TYPE__WORDSIZE:
				return getWordsize();
			case DocbookPackage.SECONDARYIE_TYPE__XREFLABEL:
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
			case DocbookPackage.SECONDARYIE_TYPE__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case DocbookPackage.SECONDARYIE_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case DocbookPackage.SECONDARYIE_TYPE__INLINEMEDIAOBJECT:
				getInlinemediaobject().clear();
				getInlinemediaobject().addAll((Collection<? extends InlinemediaobjectType>)newValue);
				return;
			case DocbookPackage.SECONDARYIE_TYPE__REMARK:
				getRemark().clear();
				getRemark().addAll((Collection<? extends RemarkType>)newValue);
				return;
			case DocbookPackage.SECONDARYIE_TYPE__SUPERSCRIPT:
				getSuperscript().clear();
				getSuperscript().addAll((Collection<? extends SuperscriptType>)newValue);
				return;
			case DocbookPackage.SECONDARYIE_TYPE__SUBSCRIPT:
				getSubscript().clear();
				getSubscript().addAll((Collection<? extends SubscriptType>)newValue);
				return;
			case DocbookPackage.SECONDARYIE_TYPE__XREF:
				getXref().clear();
				getXref().addAll((Collection<? extends XrefType>)newValue);
				return;
			case DocbookPackage.SECONDARYIE_TYPE__LINK:
				getLink().clear();
				getLink().addAll((Collection<? extends LinkType>)newValue);
				return;
			case DocbookPackage.SECONDARYIE_TYPE__OLINK:
				getOlink().clear();
				getOlink().addAll((Collection<? extends OlinkType>)newValue);
				return;
			case DocbookPackage.SECONDARYIE_TYPE__ANCHOR:
				getAnchor().clear();
				getAnchor().addAll((Collection<? extends AnchorType>)newValue);
				return;
			case DocbookPackage.SECONDARYIE_TYPE__BIBLIOREF:
				getBiblioref().clear();
				getBiblioref().addAll((Collection<? extends BibliorefType>)newValue);
				return;
			case DocbookPackage.SECONDARYIE_TYPE__ALT:
				getAlt().clear();
				getAlt().addAll((Collection<? extends AltType>)newValue);
				return;
			case DocbookPackage.SECONDARYIE_TYPE__ANNOTATION:
				getAnnotation().clear();
				getAnnotation().addAll((Collection<? extends AnnotationType>)newValue);
				return;
			case DocbookPackage.SECONDARYIE_TYPE__INDEXTERM:
				getIndexterm().clear();
				getIndexterm().addAll((Collection<? extends IndextermType>)newValue);
				return;
			case DocbookPackage.SECONDARYIE_TYPE__ABBREV:
				getAbbrev().clear();
				getAbbrev().addAll((Collection<? extends AbbrevType>)newValue);
				return;
			case DocbookPackage.SECONDARYIE_TYPE__ACRONYM:
				getAcronym().clear();
				getAcronym().addAll((Collection<? extends AcronymType>)newValue);
				return;
			case DocbookPackage.SECONDARYIE_TYPE__DATE:
				getDate().clear();
				getDate().addAll((Collection<? extends DateType>)newValue);
				return;
			case DocbookPackage.SECONDARYIE_TYPE__EMPHASIS:
				getEmphasis().clear();
				getEmphasis().addAll((Collection<? extends EmphasisType>)newValue);
				return;
			case DocbookPackage.SECONDARYIE_TYPE__FOOTNOTE:
				getFootnote().clear();
				getFootnote().addAll((Collection<? extends FootnoteType>)newValue);
				return;
			case DocbookPackage.SECONDARYIE_TYPE__FOOTNOTEREF:
				getFootnoteref().clear();
				getFootnoteref().addAll((Collection<? extends FootnoterefType>)newValue);
				return;
			case DocbookPackage.SECONDARYIE_TYPE__FOREIGNPHRASE:
				getForeignphrase().clear();
				getForeignphrase().addAll((Collection<? extends ForeignphraseType>)newValue);
				return;
			case DocbookPackage.SECONDARYIE_TYPE__PHRASE:
				getPhrase().clear();
				getPhrase().addAll((Collection<? extends PhraseType>)newValue);
				return;
			case DocbookPackage.SECONDARYIE_TYPE__QUOTE:
				getQuote().clear();
				getQuote().addAll((Collection<? extends QuoteType>)newValue);
				return;
			case DocbookPackage.SECONDARYIE_TYPE__WORDASWORD:
				getWordasword().clear();
				getWordasword().addAll((Collection<? extends WordaswordType>)newValue);
				return;
			case DocbookPackage.SECONDARYIE_TYPE__FIRSTTERM:
				getFirstterm().clear();
				getFirstterm().addAll((Collection<? extends FirsttermType>)newValue);
				return;
			case DocbookPackage.SECONDARYIE_TYPE__GLOSSTERM:
				getGlossterm().clear();
				getGlossterm().addAll((Collection<? extends GlosstermType>)newValue);
				return;
			case DocbookPackage.SECONDARYIE_TYPE__COREF:
				getCoref().clear();
				getCoref().addAll((Collection<? extends CorefType>)newValue);
				return;
			case DocbookPackage.SECONDARYIE_TYPE__TRADEMARK:
				getTrademark().clear();
				getTrademark().addAll((Collection<? extends TrademarkType>)newValue);
				return;
			case DocbookPackage.SECONDARYIE_TYPE__PRODUCTNUMBER:
				getProductnumber().clear();
				getProductnumber().addAll((Collection<? extends ProductnumberType>)newValue);
				return;
			case DocbookPackage.SECONDARYIE_TYPE__PRODUCTNAME:
				getProductname().clear();
				getProductname().addAll((Collection<? extends ProductnameType>)newValue);
				return;
			case DocbookPackage.SECONDARYIE_TYPE__DATABASE:
				getDatabase().clear();
				getDatabase().addAll((Collection<? extends DatabaseType>)newValue);
				return;
			case DocbookPackage.SECONDARYIE_TYPE__APPLICATION:
				getApplication().clear();
				getApplication().addAll((Collection<? extends ApplicationType>)newValue);
				return;
			case DocbookPackage.SECONDARYIE_TYPE__HARDWARE:
				getHardware().clear();
				getHardware().addAll((Collection<? extends HardwareType>)newValue);
				return;
			case DocbookPackage.SECONDARYIE_TYPE__CITATION:
				getCitation().clear();
				getCitation().addAll((Collection<? extends CitationType>)newValue);
				return;
			case DocbookPackage.SECONDARYIE_TYPE__CITEREFENTRY:
				getCiterefentry().clear();
				getCiterefentry().addAll((Collection<? extends CiterefentryType>)newValue);
				return;
			case DocbookPackage.SECONDARYIE_TYPE__CITETITLE:
				getCitetitle().clear();
				getCitetitle().addAll((Collection<? extends CitetitleType>)newValue);
				return;
			case DocbookPackage.SECONDARYIE_TYPE__CITEBIBLIOID:
				getCitebiblioid().clear();
				getCitebiblioid().addAll((Collection<? extends CitebiblioidType>)newValue);
				return;
			case DocbookPackage.SECONDARYIE_TYPE__AUTHOR:
				getAuthor().clear();
				getAuthor().addAll((Collection<? extends AuthorType>)newValue);
				return;
			case DocbookPackage.SECONDARYIE_TYPE__PERSON:
				getPerson().clear();
				getPerson().addAll((Collection<? extends PersonType>)newValue);
				return;
			case DocbookPackage.SECONDARYIE_TYPE__PERSONNAME:
				getPersonname().clear();
				getPersonname().addAll((Collection<? extends PersonnameType>)newValue);
				return;
			case DocbookPackage.SECONDARYIE_TYPE__ORG:
				getOrg().clear();
				getOrg().addAll((Collection<? extends OrgType>)newValue);
				return;
			case DocbookPackage.SECONDARYIE_TYPE__ORGNAME:
				getOrgname().clear();
				getOrgname().addAll((Collection<? extends OrgnameType>)newValue);
				return;
			case DocbookPackage.SECONDARYIE_TYPE__EDITOR:
				getEditor().clear();
				getEditor().addAll((Collection<? extends EditorType>)newValue);
				return;
			case DocbookPackage.SECONDARYIE_TYPE__JOBTITLE:
				getJobtitle().clear();
				getJobtitle().addAll((Collection<? extends JobtitleType>)newValue);
				return;
			case DocbookPackage.SECONDARYIE_TYPE__REPLACEABLE:
				getReplaceable().clear();
				getReplaceable().addAll((Collection<? extends ReplaceableType>)newValue);
				return;
			case DocbookPackage.SECONDARYIE_TYPE__PACKAGE:
				getPackage().clear();
				getPackage().addAll((Collection<? extends PackageType>)newValue);
				return;
			case DocbookPackage.SECONDARYIE_TYPE__PARAMETER:
				getParameter().clear();
				getParameter().addAll((Collection<? extends ParameterType>)newValue);
				return;
			case DocbookPackage.SECONDARYIE_TYPE__TERMDEF:
				getTermdef().clear();
				getTermdef().addAll((Collection<? extends TermdefType>)newValue);
				return;
			case DocbookPackage.SECONDARYIE_TYPE__NONTERMINAL:
				getNonterminal().clear();
				getNonterminal().addAll((Collection<? extends NonterminalType>)newValue);
				return;
			case DocbookPackage.SECONDARYIE_TYPE__SYSTEMITEM:
				getSystemitem().clear();
				getSystemitem().addAll((Collection<? extends SystemitemType>)newValue);
				return;
			case DocbookPackage.SECONDARYIE_TYPE__OPTION:
				getOption().clear();
				getOption().addAll((Collection<? extends OptionType>)newValue);
				return;
			case DocbookPackage.SECONDARYIE_TYPE__OPTIONAL:
				getOptional().clear();
				getOptional().addAll((Collection<? extends OptionalType>)newValue);
				return;
			case DocbookPackage.SECONDARYIE_TYPE__PROPERTY:
				getProperty().clear();
				getProperty().addAll((Collection<? extends PropertyType>)newValue);
				return;
			case DocbookPackage.SECONDARYIE_TYPE__INLINEEQUATION:
				getInlineequation().clear();
				getInlineequation().addAll((Collection<? extends InlineequationType>)newValue);
				return;
			case DocbookPackage.SECONDARYIE_TYPE__TAG:
				getTag().clear();
				getTag().addAll((Collection<? extends TagType>)newValue);
				return;
			case DocbookPackage.SECONDARYIE_TYPE__MARKUP:
				getMarkup().clear();
				getMarkup().addAll((Collection<? extends MarkupType>)newValue);
				return;
			case DocbookPackage.SECONDARYIE_TYPE__TOKEN:
				getToken().clear();
				getToken().addAll((Collection<? extends TokenType>)newValue);
				return;
			case DocbookPackage.SECONDARYIE_TYPE__SYMBOL:
				getSymbol().clear();
				getSymbol().addAll((Collection<? extends SymbolType>)newValue);
				return;
			case DocbookPackage.SECONDARYIE_TYPE__LITERAL:
				getLiteral().clear();
				getLiteral().addAll((Collection<? extends LiteralType>)newValue);
				return;
			case DocbookPackage.SECONDARYIE_TYPE__CODE:
				getCode().clear();
				getCode().addAll((Collection<? extends CodeType>)newValue);
				return;
			case DocbookPackage.SECONDARYIE_TYPE__CONSTANT:
				getConstant().clear();
				getConstant().addAll((Collection<? extends ConstantType>)newValue);
				return;
			case DocbookPackage.SECONDARYIE_TYPE__EMAIL:
				getEmail().clear();
				getEmail().addAll((Collection<? extends EmailType>)newValue);
				return;
			case DocbookPackage.SECONDARYIE_TYPE__URI:
				getUri().clear();
				getUri().addAll((Collection<? extends UriType>)newValue);
				return;
			case DocbookPackage.SECONDARYIE_TYPE__GUIICON:
				getGuiicon().clear();
				getGuiicon().addAll((Collection<? extends GuiiconType>)newValue);
				return;
			case DocbookPackage.SECONDARYIE_TYPE__GUIBUTTON:
				getGuibutton().clear();
				getGuibutton().addAll((Collection<? extends GuibuttonType>)newValue);
				return;
			case DocbookPackage.SECONDARYIE_TYPE__GUIMENUITEM:
				getGuimenuitem().clear();
				getGuimenuitem().addAll((Collection<? extends GuimenuitemType>)newValue);
				return;
			case DocbookPackage.SECONDARYIE_TYPE__GUIMENU:
				getGuimenu().clear();
				getGuimenu().addAll((Collection<? extends GuimenuType>)newValue);
				return;
			case DocbookPackage.SECONDARYIE_TYPE__GUISUBMENU:
				getGuisubmenu().clear();
				getGuisubmenu().addAll((Collection<? extends GuisubmenuType>)newValue);
				return;
			case DocbookPackage.SECONDARYIE_TYPE__GUILABEL:
				getGuilabel().clear();
				getGuilabel().addAll((Collection<? extends GuilabelType>)newValue);
				return;
			case DocbookPackage.SECONDARYIE_TYPE__MENUCHOICE:
				getMenuchoice().clear();
				getMenuchoice().addAll((Collection<? extends MenuchoiceType>)newValue);
				return;
			case DocbookPackage.SECONDARYIE_TYPE__MOUSEBUTTON:
				getMousebutton().clear();
				getMousebutton().addAll((Collection<? extends MousebuttonType>)newValue);
				return;
			case DocbookPackage.SECONDARYIE_TYPE__KEYCOMBO:
				getKeycombo().clear();
				getKeycombo().addAll((Collection<? extends KeycomboType>)newValue);
				return;
			case DocbookPackage.SECONDARYIE_TYPE__KEYCAP:
				getKeycap().clear();
				getKeycap().addAll((Collection<? extends KeycapType>)newValue);
				return;
			case DocbookPackage.SECONDARYIE_TYPE__KEYCODE:
				getKeycode().clear();
				getKeycode().addAll((Collection<? extends KeycodeType>)newValue);
				return;
			case DocbookPackage.SECONDARYIE_TYPE__KEYSYM:
				getKeysym().clear();
				getKeysym().addAll((Collection<? extends KeysymType>)newValue);
				return;
			case DocbookPackage.SECONDARYIE_TYPE__SHORTCUT:
				getShortcut().clear();
				getShortcut().addAll((Collection<? extends ShortcutType>)newValue);
				return;
			case DocbookPackage.SECONDARYIE_TYPE__ACCEL:
				getAccel().clear();
				getAccel().addAll((Collection<? extends AccelType>)newValue);
				return;
			case DocbookPackage.SECONDARYIE_TYPE__PROMPT:
				getPrompt().clear();
				getPrompt().addAll((Collection<? extends PromptType>)newValue);
				return;
			case DocbookPackage.SECONDARYIE_TYPE__ENVAR:
				getEnvar().clear();
				getEnvar().addAll((Collection<? extends EnvarType>)newValue);
				return;
			case DocbookPackage.SECONDARYIE_TYPE__FILENAME:
				getFilename().clear();
				getFilename().addAll((Collection<? extends FilenameType>)newValue);
				return;
			case DocbookPackage.SECONDARYIE_TYPE__COMMAND:
				getCommand().clear();
				getCommand().addAll((Collection<? extends CommandType>)newValue);
				return;
			case DocbookPackage.SECONDARYIE_TYPE__COMPUTEROUTPUT:
				getComputeroutput().clear();
				getComputeroutput().addAll((Collection<? extends ComputeroutputType>)newValue);
				return;
			case DocbookPackage.SECONDARYIE_TYPE__USERINPUT:
				getUserinput().clear();
				getUserinput().addAll((Collection<? extends UserinputType>)newValue);
				return;
			case DocbookPackage.SECONDARYIE_TYPE__FUNCTION:
				getFunction().clear();
				getFunction().addAll((Collection<? extends FunctionType1>)newValue);
				return;
			case DocbookPackage.SECONDARYIE_TYPE__VARNAME:
				getVarname().clear();
				getVarname().addAll((Collection<? extends VarnameType>)newValue);
				return;
			case DocbookPackage.SECONDARYIE_TYPE__RETURNVALUE:
				getReturnvalue().clear();
				getReturnvalue().addAll((Collection<? extends ReturnvalueType>)newValue);
				return;
			case DocbookPackage.SECONDARYIE_TYPE__TYPE:
				getType().clear();
				getType().addAll((Collection<? extends TypeType2>)newValue);
				return;
			case DocbookPackage.SECONDARYIE_TYPE__CLASSNAME:
				getClassname().clear();
				getClassname().addAll((Collection<? extends ClassnameType>)newValue);
				return;
			case DocbookPackage.SECONDARYIE_TYPE__EXCEPTIONNAME:
				getExceptionname().clear();
				getExceptionname().addAll((Collection<? extends ExceptionnameType>)newValue);
				return;
			case DocbookPackage.SECONDARYIE_TYPE__INTERFACENAME:
				getInterfacename().clear();
				getInterfacename().addAll((Collection<? extends InterfacenameType>)newValue);
				return;
			case DocbookPackage.SECONDARYIE_TYPE__METHODNAME:
				getMethodname().clear();
				getMethodname().addAll((Collection<? extends MethodnameType>)newValue);
				return;
			case DocbookPackage.SECONDARYIE_TYPE__MODIFIER:
				getModifier().clear();
				getModifier().addAll((Collection<? extends ModifierType>)newValue);
				return;
			case DocbookPackage.SECONDARYIE_TYPE__INITIALIZER:
				getInitializer().clear();
				getInitializer().addAll((Collection<? extends InitializerType>)newValue);
				return;
			case DocbookPackage.SECONDARYIE_TYPE__OOCLASS:
				getOoclass().clear();
				getOoclass().addAll((Collection<? extends OoclassType>)newValue);
				return;
			case DocbookPackage.SECONDARYIE_TYPE__OOEXCEPTION:
				getOoexception().clear();
				getOoexception().addAll((Collection<? extends OoexceptionType>)newValue);
				return;
			case DocbookPackage.SECONDARYIE_TYPE__OOINTERFACE:
				getOointerface().clear();
				getOointerface().addAll((Collection<? extends OointerfaceType>)newValue);
				return;
			case DocbookPackage.SECONDARYIE_TYPE__ERRORCODE:
				getErrorcode().clear();
				getErrorcode().addAll((Collection<? extends ErrorcodeType>)newValue);
				return;
			case DocbookPackage.SECONDARYIE_TYPE__ERRORTEXT:
				getErrortext().clear();
				getErrortext().addAll((Collection<? extends ErrortextType>)newValue);
				return;
			case DocbookPackage.SECONDARYIE_TYPE__ERRORNAME:
				getErrorname().clear();
				getErrorname().addAll((Collection<? extends ErrornameType>)newValue);
				return;
			case DocbookPackage.SECONDARYIE_TYPE__ERRORTYPE:
				getErrortype().clear();
				getErrortype().addAll((Collection<? extends ErrortypeType>)newValue);
				return;
			case DocbookPackage.SECONDARYIE_TYPE__ANNOTATIONS:
				setAnnotations(newValue);
				return;
			case DocbookPackage.SECONDARYIE_TYPE__ARCH:
				setArch(newValue);
				return;
			case DocbookPackage.SECONDARYIE_TYPE__AUDIENCE:
				setAudience(newValue);
				return;
			case DocbookPackage.SECONDARYIE_TYPE__BASE:
				setBase(newValue);
				return;
			case DocbookPackage.SECONDARYIE_TYPE__CONDITION:
				setCondition(newValue);
				return;
			case DocbookPackage.SECONDARYIE_TYPE__CONFORMANCE:
				setConformance(newValue);
				return;
			case DocbookPackage.SECONDARYIE_TYPE__DIR:
				setDir((DirType)newValue);
				return;
			case DocbookPackage.SECONDARYIE_TYPE__ID:
				setId((String)newValue);
				return;
			case DocbookPackage.SECONDARYIE_TYPE__LANG:
				setLang(newValue);
				return;
			case DocbookPackage.SECONDARYIE_TYPE__LINKENDS:
				setLinkends((List<String>)newValue);
				return;
			case DocbookPackage.SECONDARYIE_TYPE__OS:
				setOs(newValue);
				return;
			case DocbookPackage.SECONDARYIE_TYPE__REMAP:
				setRemap(newValue);
				return;
			case DocbookPackage.SECONDARYIE_TYPE__REVISION:
				setRevision(newValue);
				return;
			case DocbookPackage.SECONDARYIE_TYPE__REVISIONFLAG:
				setRevisionflag((RevisionflagType)newValue);
				return;
			case DocbookPackage.SECONDARYIE_TYPE__ROLE:
				setRole(newValue);
				return;
			case DocbookPackage.SECONDARYIE_TYPE__SECURITY:
				setSecurity(newValue);
				return;
			case DocbookPackage.SECONDARYIE_TYPE__USERLEVEL:
				setUserlevel(newValue);
				return;
			case DocbookPackage.SECONDARYIE_TYPE__VENDOR:
				setVendor(newValue);
				return;
			case DocbookPackage.SECONDARYIE_TYPE__VERSION:
				setVersion(newValue);
				return;
			case DocbookPackage.SECONDARYIE_TYPE__WORDSIZE:
				setWordsize(newValue);
				return;
			case DocbookPackage.SECONDARYIE_TYPE__XREFLABEL:
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
			case DocbookPackage.SECONDARYIE_TYPE__MIXED:
				getMixed().clear();
				return;
			case DocbookPackage.SECONDARYIE_TYPE__GROUP:
				getGroup().clear();
				return;
			case DocbookPackage.SECONDARYIE_TYPE__INLINEMEDIAOBJECT:
				getInlinemediaobject().clear();
				return;
			case DocbookPackage.SECONDARYIE_TYPE__REMARK:
				getRemark().clear();
				return;
			case DocbookPackage.SECONDARYIE_TYPE__SUPERSCRIPT:
				getSuperscript().clear();
				return;
			case DocbookPackage.SECONDARYIE_TYPE__SUBSCRIPT:
				getSubscript().clear();
				return;
			case DocbookPackage.SECONDARYIE_TYPE__XREF:
				getXref().clear();
				return;
			case DocbookPackage.SECONDARYIE_TYPE__LINK:
				getLink().clear();
				return;
			case DocbookPackage.SECONDARYIE_TYPE__OLINK:
				getOlink().clear();
				return;
			case DocbookPackage.SECONDARYIE_TYPE__ANCHOR:
				getAnchor().clear();
				return;
			case DocbookPackage.SECONDARYIE_TYPE__BIBLIOREF:
				getBiblioref().clear();
				return;
			case DocbookPackage.SECONDARYIE_TYPE__ALT:
				getAlt().clear();
				return;
			case DocbookPackage.SECONDARYIE_TYPE__ANNOTATION:
				getAnnotation().clear();
				return;
			case DocbookPackage.SECONDARYIE_TYPE__INDEXTERM:
				getIndexterm().clear();
				return;
			case DocbookPackage.SECONDARYIE_TYPE__ABBREV:
				getAbbrev().clear();
				return;
			case DocbookPackage.SECONDARYIE_TYPE__ACRONYM:
				getAcronym().clear();
				return;
			case DocbookPackage.SECONDARYIE_TYPE__DATE:
				getDate().clear();
				return;
			case DocbookPackage.SECONDARYIE_TYPE__EMPHASIS:
				getEmphasis().clear();
				return;
			case DocbookPackage.SECONDARYIE_TYPE__FOOTNOTE:
				getFootnote().clear();
				return;
			case DocbookPackage.SECONDARYIE_TYPE__FOOTNOTEREF:
				getFootnoteref().clear();
				return;
			case DocbookPackage.SECONDARYIE_TYPE__FOREIGNPHRASE:
				getForeignphrase().clear();
				return;
			case DocbookPackage.SECONDARYIE_TYPE__PHRASE:
				getPhrase().clear();
				return;
			case DocbookPackage.SECONDARYIE_TYPE__QUOTE:
				getQuote().clear();
				return;
			case DocbookPackage.SECONDARYIE_TYPE__WORDASWORD:
				getWordasword().clear();
				return;
			case DocbookPackage.SECONDARYIE_TYPE__FIRSTTERM:
				getFirstterm().clear();
				return;
			case DocbookPackage.SECONDARYIE_TYPE__GLOSSTERM:
				getGlossterm().clear();
				return;
			case DocbookPackage.SECONDARYIE_TYPE__COREF:
				getCoref().clear();
				return;
			case DocbookPackage.SECONDARYIE_TYPE__TRADEMARK:
				getTrademark().clear();
				return;
			case DocbookPackage.SECONDARYIE_TYPE__PRODUCTNUMBER:
				getProductnumber().clear();
				return;
			case DocbookPackage.SECONDARYIE_TYPE__PRODUCTNAME:
				getProductname().clear();
				return;
			case DocbookPackage.SECONDARYIE_TYPE__DATABASE:
				getDatabase().clear();
				return;
			case DocbookPackage.SECONDARYIE_TYPE__APPLICATION:
				getApplication().clear();
				return;
			case DocbookPackage.SECONDARYIE_TYPE__HARDWARE:
				getHardware().clear();
				return;
			case DocbookPackage.SECONDARYIE_TYPE__CITATION:
				getCitation().clear();
				return;
			case DocbookPackage.SECONDARYIE_TYPE__CITEREFENTRY:
				getCiterefentry().clear();
				return;
			case DocbookPackage.SECONDARYIE_TYPE__CITETITLE:
				getCitetitle().clear();
				return;
			case DocbookPackage.SECONDARYIE_TYPE__CITEBIBLIOID:
				getCitebiblioid().clear();
				return;
			case DocbookPackage.SECONDARYIE_TYPE__AUTHOR:
				getAuthor().clear();
				return;
			case DocbookPackage.SECONDARYIE_TYPE__PERSON:
				getPerson().clear();
				return;
			case DocbookPackage.SECONDARYIE_TYPE__PERSONNAME:
				getPersonname().clear();
				return;
			case DocbookPackage.SECONDARYIE_TYPE__ORG:
				getOrg().clear();
				return;
			case DocbookPackage.SECONDARYIE_TYPE__ORGNAME:
				getOrgname().clear();
				return;
			case DocbookPackage.SECONDARYIE_TYPE__EDITOR:
				getEditor().clear();
				return;
			case DocbookPackage.SECONDARYIE_TYPE__JOBTITLE:
				getJobtitle().clear();
				return;
			case DocbookPackage.SECONDARYIE_TYPE__REPLACEABLE:
				getReplaceable().clear();
				return;
			case DocbookPackage.SECONDARYIE_TYPE__PACKAGE:
				getPackage().clear();
				return;
			case DocbookPackage.SECONDARYIE_TYPE__PARAMETER:
				getParameter().clear();
				return;
			case DocbookPackage.SECONDARYIE_TYPE__TERMDEF:
				getTermdef().clear();
				return;
			case DocbookPackage.SECONDARYIE_TYPE__NONTERMINAL:
				getNonterminal().clear();
				return;
			case DocbookPackage.SECONDARYIE_TYPE__SYSTEMITEM:
				getSystemitem().clear();
				return;
			case DocbookPackage.SECONDARYIE_TYPE__OPTION:
				getOption().clear();
				return;
			case DocbookPackage.SECONDARYIE_TYPE__OPTIONAL:
				getOptional().clear();
				return;
			case DocbookPackage.SECONDARYIE_TYPE__PROPERTY:
				getProperty().clear();
				return;
			case DocbookPackage.SECONDARYIE_TYPE__INLINEEQUATION:
				getInlineequation().clear();
				return;
			case DocbookPackage.SECONDARYIE_TYPE__TAG:
				getTag().clear();
				return;
			case DocbookPackage.SECONDARYIE_TYPE__MARKUP:
				getMarkup().clear();
				return;
			case DocbookPackage.SECONDARYIE_TYPE__TOKEN:
				getToken().clear();
				return;
			case DocbookPackage.SECONDARYIE_TYPE__SYMBOL:
				getSymbol().clear();
				return;
			case DocbookPackage.SECONDARYIE_TYPE__LITERAL:
				getLiteral().clear();
				return;
			case DocbookPackage.SECONDARYIE_TYPE__CODE:
				getCode().clear();
				return;
			case DocbookPackage.SECONDARYIE_TYPE__CONSTANT:
				getConstant().clear();
				return;
			case DocbookPackage.SECONDARYIE_TYPE__EMAIL:
				getEmail().clear();
				return;
			case DocbookPackage.SECONDARYIE_TYPE__URI:
				getUri().clear();
				return;
			case DocbookPackage.SECONDARYIE_TYPE__GUIICON:
				getGuiicon().clear();
				return;
			case DocbookPackage.SECONDARYIE_TYPE__GUIBUTTON:
				getGuibutton().clear();
				return;
			case DocbookPackage.SECONDARYIE_TYPE__GUIMENUITEM:
				getGuimenuitem().clear();
				return;
			case DocbookPackage.SECONDARYIE_TYPE__GUIMENU:
				getGuimenu().clear();
				return;
			case DocbookPackage.SECONDARYIE_TYPE__GUISUBMENU:
				getGuisubmenu().clear();
				return;
			case DocbookPackage.SECONDARYIE_TYPE__GUILABEL:
				getGuilabel().clear();
				return;
			case DocbookPackage.SECONDARYIE_TYPE__MENUCHOICE:
				getMenuchoice().clear();
				return;
			case DocbookPackage.SECONDARYIE_TYPE__MOUSEBUTTON:
				getMousebutton().clear();
				return;
			case DocbookPackage.SECONDARYIE_TYPE__KEYCOMBO:
				getKeycombo().clear();
				return;
			case DocbookPackage.SECONDARYIE_TYPE__KEYCAP:
				getKeycap().clear();
				return;
			case DocbookPackage.SECONDARYIE_TYPE__KEYCODE:
				getKeycode().clear();
				return;
			case DocbookPackage.SECONDARYIE_TYPE__KEYSYM:
				getKeysym().clear();
				return;
			case DocbookPackage.SECONDARYIE_TYPE__SHORTCUT:
				getShortcut().clear();
				return;
			case DocbookPackage.SECONDARYIE_TYPE__ACCEL:
				getAccel().clear();
				return;
			case DocbookPackage.SECONDARYIE_TYPE__PROMPT:
				getPrompt().clear();
				return;
			case DocbookPackage.SECONDARYIE_TYPE__ENVAR:
				getEnvar().clear();
				return;
			case DocbookPackage.SECONDARYIE_TYPE__FILENAME:
				getFilename().clear();
				return;
			case DocbookPackage.SECONDARYIE_TYPE__COMMAND:
				getCommand().clear();
				return;
			case DocbookPackage.SECONDARYIE_TYPE__COMPUTEROUTPUT:
				getComputeroutput().clear();
				return;
			case DocbookPackage.SECONDARYIE_TYPE__USERINPUT:
				getUserinput().clear();
				return;
			case DocbookPackage.SECONDARYIE_TYPE__FUNCTION:
				getFunction().clear();
				return;
			case DocbookPackage.SECONDARYIE_TYPE__VARNAME:
				getVarname().clear();
				return;
			case DocbookPackage.SECONDARYIE_TYPE__RETURNVALUE:
				getReturnvalue().clear();
				return;
			case DocbookPackage.SECONDARYIE_TYPE__TYPE:
				getType().clear();
				return;
			case DocbookPackage.SECONDARYIE_TYPE__CLASSNAME:
				getClassname().clear();
				return;
			case DocbookPackage.SECONDARYIE_TYPE__EXCEPTIONNAME:
				getExceptionname().clear();
				return;
			case DocbookPackage.SECONDARYIE_TYPE__INTERFACENAME:
				getInterfacename().clear();
				return;
			case DocbookPackage.SECONDARYIE_TYPE__METHODNAME:
				getMethodname().clear();
				return;
			case DocbookPackage.SECONDARYIE_TYPE__MODIFIER:
				getModifier().clear();
				return;
			case DocbookPackage.SECONDARYIE_TYPE__INITIALIZER:
				getInitializer().clear();
				return;
			case DocbookPackage.SECONDARYIE_TYPE__OOCLASS:
				getOoclass().clear();
				return;
			case DocbookPackage.SECONDARYIE_TYPE__OOEXCEPTION:
				getOoexception().clear();
				return;
			case DocbookPackage.SECONDARYIE_TYPE__OOINTERFACE:
				getOointerface().clear();
				return;
			case DocbookPackage.SECONDARYIE_TYPE__ERRORCODE:
				getErrorcode().clear();
				return;
			case DocbookPackage.SECONDARYIE_TYPE__ERRORTEXT:
				getErrortext().clear();
				return;
			case DocbookPackage.SECONDARYIE_TYPE__ERRORNAME:
				getErrorname().clear();
				return;
			case DocbookPackage.SECONDARYIE_TYPE__ERRORTYPE:
				getErrortype().clear();
				return;
			case DocbookPackage.SECONDARYIE_TYPE__ANNOTATIONS:
				setAnnotations(ANNOTATIONS_EDEFAULT);
				return;
			case DocbookPackage.SECONDARYIE_TYPE__ARCH:
				setArch(ARCH_EDEFAULT);
				return;
			case DocbookPackage.SECONDARYIE_TYPE__AUDIENCE:
				setAudience(AUDIENCE_EDEFAULT);
				return;
			case DocbookPackage.SECONDARYIE_TYPE__BASE:
				setBase(BASE_EDEFAULT);
				return;
			case DocbookPackage.SECONDARYIE_TYPE__CONDITION:
				setCondition(CONDITION_EDEFAULT);
				return;
			case DocbookPackage.SECONDARYIE_TYPE__CONFORMANCE:
				setConformance(CONFORMANCE_EDEFAULT);
				return;
			case DocbookPackage.SECONDARYIE_TYPE__DIR:
				unsetDir();
				return;
			case DocbookPackage.SECONDARYIE_TYPE__ID:
				setId(ID_EDEFAULT);
				return;
			case DocbookPackage.SECONDARYIE_TYPE__LANG:
				setLang(LANG_EDEFAULT);
				return;
			case DocbookPackage.SECONDARYIE_TYPE__LINKENDS:
				setLinkends(LINKENDS_EDEFAULT);
				return;
			case DocbookPackage.SECONDARYIE_TYPE__OS:
				setOs(OS_EDEFAULT);
				return;
			case DocbookPackage.SECONDARYIE_TYPE__REMAP:
				setRemap(REMAP_EDEFAULT);
				return;
			case DocbookPackage.SECONDARYIE_TYPE__REVISION:
				setRevision(REVISION_EDEFAULT);
				return;
			case DocbookPackage.SECONDARYIE_TYPE__REVISIONFLAG:
				unsetRevisionflag();
				return;
			case DocbookPackage.SECONDARYIE_TYPE__ROLE:
				setRole(ROLE_EDEFAULT);
				return;
			case DocbookPackage.SECONDARYIE_TYPE__SECURITY:
				setSecurity(SECURITY_EDEFAULT);
				return;
			case DocbookPackage.SECONDARYIE_TYPE__USERLEVEL:
				setUserlevel(USERLEVEL_EDEFAULT);
				return;
			case DocbookPackage.SECONDARYIE_TYPE__VENDOR:
				setVendor(VENDOR_EDEFAULT);
				return;
			case DocbookPackage.SECONDARYIE_TYPE__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case DocbookPackage.SECONDARYIE_TYPE__WORDSIZE:
				setWordsize(WORDSIZE_EDEFAULT);
				return;
			case DocbookPackage.SECONDARYIE_TYPE__XREFLABEL:
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
			case DocbookPackage.SECONDARYIE_TYPE__MIXED:
				return mixed != null && !mixed.isEmpty();
			case DocbookPackage.SECONDARYIE_TYPE__GROUP:
				return !getGroup().isEmpty();
			case DocbookPackage.SECONDARYIE_TYPE__INLINEMEDIAOBJECT:
				return !getInlinemediaobject().isEmpty();
			case DocbookPackage.SECONDARYIE_TYPE__REMARK:
				return !getRemark().isEmpty();
			case DocbookPackage.SECONDARYIE_TYPE__SUPERSCRIPT:
				return !getSuperscript().isEmpty();
			case DocbookPackage.SECONDARYIE_TYPE__SUBSCRIPT:
				return !getSubscript().isEmpty();
			case DocbookPackage.SECONDARYIE_TYPE__XREF:
				return !getXref().isEmpty();
			case DocbookPackage.SECONDARYIE_TYPE__LINK:
				return !getLink().isEmpty();
			case DocbookPackage.SECONDARYIE_TYPE__OLINK:
				return !getOlink().isEmpty();
			case DocbookPackage.SECONDARYIE_TYPE__ANCHOR:
				return !getAnchor().isEmpty();
			case DocbookPackage.SECONDARYIE_TYPE__BIBLIOREF:
				return !getBiblioref().isEmpty();
			case DocbookPackage.SECONDARYIE_TYPE__ALT:
				return !getAlt().isEmpty();
			case DocbookPackage.SECONDARYIE_TYPE__ANNOTATION:
				return !getAnnotation().isEmpty();
			case DocbookPackage.SECONDARYIE_TYPE__INDEXTERM:
				return !getIndexterm().isEmpty();
			case DocbookPackage.SECONDARYIE_TYPE__ABBREV:
				return !getAbbrev().isEmpty();
			case DocbookPackage.SECONDARYIE_TYPE__ACRONYM:
				return !getAcronym().isEmpty();
			case DocbookPackage.SECONDARYIE_TYPE__DATE:
				return !getDate().isEmpty();
			case DocbookPackage.SECONDARYIE_TYPE__EMPHASIS:
				return !getEmphasis().isEmpty();
			case DocbookPackage.SECONDARYIE_TYPE__FOOTNOTE:
				return !getFootnote().isEmpty();
			case DocbookPackage.SECONDARYIE_TYPE__FOOTNOTEREF:
				return !getFootnoteref().isEmpty();
			case DocbookPackage.SECONDARYIE_TYPE__FOREIGNPHRASE:
				return !getForeignphrase().isEmpty();
			case DocbookPackage.SECONDARYIE_TYPE__PHRASE:
				return !getPhrase().isEmpty();
			case DocbookPackage.SECONDARYIE_TYPE__QUOTE:
				return !getQuote().isEmpty();
			case DocbookPackage.SECONDARYIE_TYPE__WORDASWORD:
				return !getWordasword().isEmpty();
			case DocbookPackage.SECONDARYIE_TYPE__FIRSTTERM:
				return !getFirstterm().isEmpty();
			case DocbookPackage.SECONDARYIE_TYPE__GLOSSTERM:
				return !getGlossterm().isEmpty();
			case DocbookPackage.SECONDARYIE_TYPE__COREF:
				return !getCoref().isEmpty();
			case DocbookPackage.SECONDARYIE_TYPE__TRADEMARK:
				return !getTrademark().isEmpty();
			case DocbookPackage.SECONDARYIE_TYPE__PRODUCTNUMBER:
				return !getProductnumber().isEmpty();
			case DocbookPackage.SECONDARYIE_TYPE__PRODUCTNAME:
				return !getProductname().isEmpty();
			case DocbookPackage.SECONDARYIE_TYPE__DATABASE:
				return !getDatabase().isEmpty();
			case DocbookPackage.SECONDARYIE_TYPE__APPLICATION:
				return !getApplication().isEmpty();
			case DocbookPackage.SECONDARYIE_TYPE__HARDWARE:
				return !getHardware().isEmpty();
			case DocbookPackage.SECONDARYIE_TYPE__CITATION:
				return !getCitation().isEmpty();
			case DocbookPackage.SECONDARYIE_TYPE__CITEREFENTRY:
				return !getCiterefentry().isEmpty();
			case DocbookPackage.SECONDARYIE_TYPE__CITETITLE:
				return !getCitetitle().isEmpty();
			case DocbookPackage.SECONDARYIE_TYPE__CITEBIBLIOID:
				return !getCitebiblioid().isEmpty();
			case DocbookPackage.SECONDARYIE_TYPE__AUTHOR:
				return !getAuthor().isEmpty();
			case DocbookPackage.SECONDARYIE_TYPE__PERSON:
				return !getPerson().isEmpty();
			case DocbookPackage.SECONDARYIE_TYPE__PERSONNAME:
				return !getPersonname().isEmpty();
			case DocbookPackage.SECONDARYIE_TYPE__ORG:
				return !getOrg().isEmpty();
			case DocbookPackage.SECONDARYIE_TYPE__ORGNAME:
				return !getOrgname().isEmpty();
			case DocbookPackage.SECONDARYIE_TYPE__EDITOR:
				return !getEditor().isEmpty();
			case DocbookPackage.SECONDARYIE_TYPE__JOBTITLE:
				return !getJobtitle().isEmpty();
			case DocbookPackage.SECONDARYIE_TYPE__REPLACEABLE:
				return !getReplaceable().isEmpty();
			case DocbookPackage.SECONDARYIE_TYPE__PACKAGE:
				return !getPackage().isEmpty();
			case DocbookPackage.SECONDARYIE_TYPE__PARAMETER:
				return !getParameter().isEmpty();
			case DocbookPackage.SECONDARYIE_TYPE__TERMDEF:
				return !getTermdef().isEmpty();
			case DocbookPackage.SECONDARYIE_TYPE__NONTERMINAL:
				return !getNonterminal().isEmpty();
			case DocbookPackage.SECONDARYIE_TYPE__SYSTEMITEM:
				return !getSystemitem().isEmpty();
			case DocbookPackage.SECONDARYIE_TYPE__OPTION:
				return !getOption().isEmpty();
			case DocbookPackage.SECONDARYIE_TYPE__OPTIONAL:
				return !getOptional().isEmpty();
			case DocbookPackage.SECONDARYIE_TYPE__PROPERTY:
				return !getProperty().isEmpty();
			case DocbookPackage.SECONDARYIE_TYPE__INLINEEQUATION:
				return !getInlineequation().isEmpty();
			case DocbookPackage.SECONDARYIE_TYPE__TAG:
				return !getTag().isEmpty();
			case DocbookPackage.SECONDARYIE_TYPE__MARKUP:
				return !getMarkup().isEmpty();
			case DocbookPackage.SECONDARYIE_TYPE__TOKEN:
				return !getToken().isEmpty();
			case DocbookPackage.SECONDARYIE_TYPE__SYMBOL:
				return !getSymbol().isEmpty();
			case DocbookPackage.SECONDARYIE_TYPE__LITERAL:
				return !getLiteral().isEmpty();
			case DocbookPackage.SECONDARYIE_TYPE__CODE:
				return !getCode().isEmpty();
			case DocbookPackage.SECONDARYIE_TYPE__CONSTANT:
				return !getConstant().isEmpty();
			case DocbookPackage.SECONDARYIE_TYPE__EMAIL:
				return !getEmail().isEmpty();
			case DocbookPackage.SECONDARYIE_TYPE__URI:
				return !getUri().isEmpty();
			case DocbookPackage.SECONDARYIE_TYPE__GUIICON:
				return !getGuiicon().isEmpty();
			case DocbookPackage.SECONDARYIE_TYPE__GUIBUTTON:
				return !getGuibutton().isEmpty();
			case DocbookPackage.SECONDARYIE_TYPE__GUIMENUITEM:
				return !getGuimenuitem().isEmpty();
			case DocbookPackage.SECONDARYIE_TYPE__GUIMENU:
				return !getGuimenu().isEmpty();
			case DocbookPackage.SECONDARYIE_TYPE__GUISUBMENU:
				return !getGuisubmenu().isEmpty();
			case DocbookPackage.SECONDARYIE_TYPE__GUILABEL:
				return !getGuilabel().isEmpty();
			case DocbookPackage.SECONDARYIE_TYPE__MENUCHOICE:
				return !getMenuchoice().isEmpty();
			case DocbookPackage.SECONDARYIE_TYPE__MOUSEBUTTON:
				return !getMousebutton().isEmpty();
			case DocbookPackage.SECONDARYIE_TYPE__KEYCOMBO:
				return !getKeycombo().isEmpty();
			case DocbookPackage.SECONDARYIE_TYPE__KEYCAP:
				return !getKeycap().isEmpty();
			case DocbookPackage.SECONDARYIE_TYPE__KEYCODE:
				return !getKeycode().isEmpty();
			case DocbookPackage.SECONDARYIE_TYPE__KEYSYM:
				return !getKeysym().isEmpty();
			case DocbookPackage.SECONDARYIE_TYPE__SHORTCUT:
				return !getShortcut().isEmpty();
			case DocbookPackage.SECONDARYIE_TYPE__ACCEL:
				return !getAccel().isEmpty();
			case DocbookPackage.SECONDARYIE_TYPE__PROMPT:
				return !getPrompt().isEmpty();
			case DocbookPackage.SECONDARYIE_TYPE__ENVAR:
				return !getEnvar().isEmpty();
			case DocbookPackage.SECONDARYIE_TYPE__FILENAME:
				return !getFilename().isEmpty();
			case DocbookPackage.SECONDARYIE_TYPE__COMMAND:
				return !getCommand().isEmpty();
			case DocbookPackage.SECONDARYIE_TYPE__COMPUTEROUTPUT:
				return !getComputeroutput().isEmpty();
			case DocbookPackage.SECONDARYIE_TYPE__USERINPUT:
				return !getUserinput().isEmpty();
			case DocbookPackage.SECONDARYIE_TYPE__FUNCTION:
				return !getFunction().isEmpty();
			case DocbookPackage.SECONDARYIE_TYPE__VARNAME:
				return !getVarname().isEmpty();
			case DocbookPackage.SECONDARYIE_TYPE__RETURNVALUE:
				return !getReturnvalue().isEmpty();
			case DocbookPackage.SECONDARYIE_TYPE__TYPE:
				return !getType().isEmpty();
			case DocbookPackage.SECONDARYIE_TYPE__CLASSNAME:
				return !getClassname().isEmpty();
			case DocbookPackage.SECONDARYIE_TYPE__EXCEPTIONNAME:
				return !getExceptionname().isEmpty();
			case DocbookPackage.SECONDARYIE_TYPE__INTERFACENAME:
				return !getInterfacename().isEmpty();
			case DocbookPackage.SECONDARYIE_TYPE__METHODNAME:
				return !getMethodname().isEmpty();
			case DocbookPackage.SECONDARYIE_TYPE__MODIFIER:
				return !getModifier().isEmpty();
			case DocbookPackage.SECONDARYIE_TYPE__INITIALIZER:
				return !getInitializer().isEmpty();
			case DocbookPackage.SECONDARYIE_TYPE__OOCLASS:
				return !getOoclass().isEmpty();
			case DocbookPackage.SECONDARYIE_TYPE__OOEXCEPTION:
				return !getOoexception().isEmpty();
			case DocbookPackage.SECONDARYIE_TYPE__OOINTERFACE:
				return !getOointerface().isEmpty();
			case DocbookPackage.SECONDARYIE_TYPE__ERRORCODE:
				return !getErrorcode().isEmpty();
			case DocbookPackage.SECONDARYIE_TYPE__ERRORTEXT:
				return !getErrortext().isEmpty();
			case DocbookPackage.SECONDARYIE_TYPE__ERRORNAME:
				return !getErrorname().isEmpty();
			case DocbookPackage.SECONDARYIE_TYPE__ERRORTYPE:
				return !getErrortype().isEmpty();
			case DocbookPackage.SECONDARYIE_TYPE__ANNOTATIONS:
				return ANNOTATIONS_EDEFAULT == null ? annotations != null : !ANNOTATIONS_EDEFAULT.equals(annotations);
			case DocbookPackage.SECONDARYIE_TYPE__ARCH:
				return ARCH_EDEFAULT == null ? arch != null : !ARCH_EDEFAULT.equals(arch);
			case DocbookPackage.SECONDARYIE_TYPE__AUDIENCE:
				return AUDIENCE_EDEFAULT == null ? audience != null : !AUDIENCE_EDEFAULT.equals(audience);
			case DocbookPackage.SECONDARYIE_TYPE__BASE:
				return BASE_EDEFAULT == null ? base != null : !BASE_EDEFAULT.equals(base);
			case DocbookPackage.SECONDARYIE_TYPE__CONDITION:
				return CONDITION_EDEFAULT == null ? condition != null : !CONDITION_EDEFAULT.equals(condition);
			case DocbookPackage.SECONDARYIE_TYPE__CONFORMANCE:
				return CONFORMANCE_EDEFAULT == null ? conformance != null : !CONFORMANCE_EDEFAULT.equals(conformance);
			case DocbookPackage.SECONDARYIE_TYPE__DIR:
				return isSetDir();
			case DocbookPackage.SECONDARYIE_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case DocbookPackage.SECONDARYIE_TYPE__LANG:
				return LANG_EDEFAULT == null ? lang != null : !LANG_EDEFAULT.equals(lang);
			case DocbookPackage.SECONDARYIE_TYPE__LINKENDS:
				return LINKENDS_EDEFAULT == null ? linkends != null : !LINKENDS_EDEFAULT.equals(linkends);
			case DocbookPackage.SECONDARYIE_TYPE__OS:
				return OS_EDEFAULT == null ? os != null : !OS_EDEFAULT.equals(os);
			case DocbookPackage.SECONDARYIE_TYPE__REMAP:
				return REMAP_EDEFAULT == null ? remap != null : !REMAP_EDEFAULT.equals(remap);
			case DocbookPackage.SECONDARYIE_TYPE__REVISION:
				return REVISION_EDEFAULT == null ? revision != null : !REVISION_EDEFAULT.equals(revision);
			case DocbookPackage.SECONDARYIE_TYPE__REVISIONFLAG:
				return isSetRevisionflag();
			case DocbookPackage.SECONDARYIE_TYPE__ROLE:
				return ROLE_EDEFAULT == null ? role != null : !ROLE_EDEFAULT.equals(role);
			case DocbookPackage.SECONDARYIE_TYPE__SECURITY:
				return SECURITY_EDEFAULT == null ? security != null : !SECURITY_EDEFAULT.equals(security);
			case DocbookPackage.SECONDARYIE_TYPE__USERLEVEL:
				return USERLEVEL_EDEFAULT == null ? userlevel != null : !USERLEVEL_EDEFAULT.equals(userlevel);
			case DocbookPackage.SECONDARYIE_TYPE__VENDOR:
				return VENDOR_EDEFAULT == null ? vendor != null : !VENDOR_EDEFAULT.equals(vendor);
			case DocbookPackage.SECONDARYIE_TYPE__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
			case DocbookPackage.SECONDARYIE_TYPE__WORDSIZE:
				return WORDSIZE_EDEFAULT == null ? wordsize != null : !WORDSIZE_EDEFAULT.equals(wordsize);
			case DocbookPackage.SECONDARYIE_TYPE__XREFLABEL:
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
		result.append(", linkends: ");
		result.append(linkends);
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

} //SecondaryieTypeImpl
