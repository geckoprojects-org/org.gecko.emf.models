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

import java.util.List;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tertiaryie Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.docbook.ns.docbook.TertiaryieType#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.TertiaryieType#getGroup <em>Group</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.TertiaryieType#getInlinemediaobject <em>Inlinemediaobject</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.TertiaryieType#getRemark <em>Remark</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.TertiaryieType#getSuperscript <em>Superscript</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.TertiaryieType#getSubscript <em>Subscript</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.TertiaryieType#getXref <em>Xref</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.TertiaryieType#getLink <em>Link</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.TertiaryieType#getOlink <em>Olink</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.TertiaryieType#getAnchor <em>Anchor</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.TertiaryieType#getBiblioref <em>Biblioref</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.TertiaryieType#getAlt <em>Alt</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.TertiaryieType#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.TertiaryieType#getIndexterm <em>Indexterm</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.TertiaryieType#getAbbrev <em>Abbrev</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.TertiaryieType#getAcronym <em>Acronym</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.TertiaryieType#getDate <em>Date</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.TertiaryieType#getEmphasis <em>Emphasis</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.TertiaryieType#getFootnote <em>Footnote</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.TertiaryieType#getFootnoteref <em>Footnoteref</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.TertiaryieType#getForeignphrase <em>Foreignphrase</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.TertiaryieType#getPhrase <em>Phrase</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.TertiaryieType#getQuote <em>Quote</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.TertiaryieType#getWordasword <em>Wordasword</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.TertiaryieType#getFirstterm <em>Firstterm</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.TertiaryieType#getGlossterm <em>Glossterm</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.TertiaryieType#getCoref <em>Coref</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.TertiaryieType#getTrademark <em>Trademark</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.TertiaryieType#getProductnumber <em>Productnumber</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.TertiaryieType#getProductname <em>Productname</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.TertiaryieType#getDatabase <em>Database</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.TertiaryieType#getApplication <em>Application</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.TertiaryieType#getHardware <em>Hardware</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.TertiaryieType#getCitation <em>Citation</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.TertiaryieType#getCiterefentry <em>Citerefentry</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.TertiaryieType#getCitetitle <em>Citetitle</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.TertiaryieType#getCitebiblioid <em>Citebiblioid</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.TertiaryieType#getAuthor <em>Author</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.TertiaryieType#getPerson <em>Person</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.TertiaryieType#getPersonname <em>Personname</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.TertiaryieType#getOrg <em>Org</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.TertiaryieType#getOrgname <em>Orgname</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.TertiaryieType#getEditor <em>Editor</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.TertiaryieType#getJobtitle <em>Jobtitle</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.TertiaryieType#getReplaceable <em>Replaceable</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.TertiaryieType#getPackage <em>Package</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.TertiaryieType#getParameter <em>Parameter</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.TertiaryieType#getTermdef <em>Termdef</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.TertiaryieType#getNonterminal <em>Nonterminal</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.TertiaryieType#getSystemitem <em>Systemitem</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.TertiaryieType#getOption <em>Option</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.TertiaryieType#getOptional <em>Optional</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.TertiaryieType#getProperty <em>Property</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.TertiaryieType#getInlineequation <em>Inlineequation</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.TertiaryieType#getTag <em>Tag</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.TertiaryieType#getMarkup <em>Markup</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.TertiaryieType#getToken <em>Token</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.TertiaryieType#getSymbol <em>Symbol</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.TertiaryieType#getLiteral <em>Literal</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.TertiaryieType#getCode <em>Code</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.TertiaryieType#getConstant <em>Constant</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.TertiaryieType#getEmail <em>Email</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.TertiaryieType#getUri <em>Uri</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.TertiaryieType#getGuiicon <em>Guiicon</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.TertiaryieType#getGuibutton <em>Guibutton</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.TertiaryieType#getGuimenuitem <em>Guimenuitem</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.TertiaryieType#getGuimenu <em>Guimenu</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.TertiaryieType#getGuisubmenu <em>Guisubmenu</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.TertiaryieType#getGuilabel <em>Guilabel</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.TertiaryieType#getMenuchoice <em>Menuchoice</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.TertiaryieType#getMousebutton <em>Mousebutton</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.TertiaryieType#getKeycombo <em>Keycombo</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.TertiaryieType#getKeycap <em>Keycap</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.TertiaryieType#getKeycode <em>Keycode</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.TertiaryieType#getKeysym <em>Keysym</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.TertiaryieType#getShortcut <em>Shortcut</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.TertiaryieType#getAccel <em>Accel</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.TertiaryieType#getPrompt <em>Prompt</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.TertiaryieType#getEnvar <em>Envar</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.TertiaryieType#getFilename <em>Filename</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.TertiaryieType#getCommand <em>Command</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.TertiaryieType#getComputeroutput <em>Computeroutput</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.TertiaryieType#getUserinput <em>Userinput</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.TertiaryieType#getFunction <em>Function</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.TertiaryieType#getVarname <em>Varname</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.TertiaryieType#getReturnvalue <em>Returnvalue</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.TertiaryieType#getType <em>Type</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.TertiaryieType#getClassname <em>Classname</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.TertiaryieType#getExceptionname <em>Exceptionname</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.TertiaryieType#getInterfacename <em>Interfacename</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.TertiaryieType#getMethodname <em>Methodname</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.TertiaryieType#getModifier <em>Modifier</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.TertiaryieType#getInitializer <em>Initializer</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.TertiaryieType#getOoclass <em>Ooclass</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.TertiaryieType#getOoexception <em>Ooexception</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.TertiaryieType#getOointerface <em>Oointerface</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.TertiaryieType#getErrorcode <em>Errorcode</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.TertiaryieType#getErrortext <em>Errortext</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.TertiaryieType#getErrorname <em>Errorname</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.TertiaryieType#getErrortype <em>Errortype</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.TertiaryieType#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.TertiaryieType#getArch <em>Arch</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.TertiaryieType#getAudience <em>Audience</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.TertiaryieType#getBase <em>Base</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.TertiaryieType#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.TertiaryieType#getConformance <em>Conformance</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.TertiaryieType#getDir <em>Dir</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.TertiaryieType#getId <em>Id</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.TertiaryieType#getLang <em>Lang</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.TertiaryieType#getLinkends <em>Linkends</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.TertiaryieType#getOs <em>Os</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.TertiaryieType#getRemap <em>Remap</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.TertiaryieType#getRevision <em>Revision</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.TertiaryieType#getRevisionflag <em>Revisionflag</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.TertiaryieType#getRole <em>Role</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.TertiaryieType#getSecurity <em>Security</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.TertiaryieType#getUserlevel <em>Userlevel</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.TertiaryieType#getVendor <em>Vendor</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.TertiaryieType#getVersion <em>Version</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.TertiaryieType#getWordsize <em>Wordsize</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.TertiaryieType#getXreflabel <em>Xreflabel</em>}</li>
 * </ul>
 *
 * @see org.docbook.ns.docbook.DocbookPackage#getTertiaryieType()
 * @model extendedMetaData="name='tertiaryie_._type' kind='mixed'"
 * @generated
 */
@ProviderType
public interface TertiaryieType extends EObject {
	/**
	 * Returns the value of the '<em><b>Mixed</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mixed</em>' attribute list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getTertiaryieType_Mixed()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' name=':mixed'"
	 * @generated
	 */
	FeatureMap getMixed();

	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getTertiaryieType_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='group' name='group:1'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Inlinemediaobject</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.InlinemediaobjectType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inlinemediaobject</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getTertiaryieType_Inlinemediaobject()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='inlinemediaobject' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<InlinemediaobjectType> getInlinemediaobject();

	/**
	 * Returns the value of the '<em><b>Remark</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.RemarkType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Remark</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getTertiaryieType_Remark()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='remark' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<RemarkType> getRemark();

	/**
	 * Returns the value of the '<em><b>Superscript</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.SuperscriptType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Superscript</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getTertiaryieType_Superscript()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='superscript' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<SuperscriptType> getSuperscript();

	/**
	 * Returns the value of the '<em><b>Subscript</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.SubscriptType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subscript</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getTertiaryieType_Subscript()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='subscript' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<SubscriptType> getSubscript();

	/**
	 * Returns the value of the '<em><b>Xref</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.XrefType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Xref</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getTertiaryieType_Xref()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='xref' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<XrefType> getXref();

	/**
	 * Returns the value of the '<em><b>Link</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.LinkType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getTertiaryieType_Link()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='link' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<LinkType> getLink();

	/**
	 * Returns the value of the '<em><b>Olink</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.OlinkType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Olink</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getTertiaryieType_Olink()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='olink' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<OlinkType> getOlink();

	/**
	 * Returns the value of the '<em><b>Anchor</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.AnchorType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Anchor</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getTertiaryieType_Anchor()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='anchor' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<AnchorType> getAnchor();

	/**
	 * Returns the value of the '<em><b>Biblioref</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.BibliorefType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Biblioref</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getTertiaryieType_Biblioref()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='biblioref' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<BibliorefType> getBiblioref();

	/**
	 * Returns the value of the '<em><b>Alt</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.AltType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alt</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getTertiaryieType_Alt()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='alt' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<AltType> getAlt();

	/**
	 * Returns the value of the '<em><b>Annotation</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.AnnotationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotation</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getTertiaryieType_Annotation()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='annotation' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<AnnotationType> getAnnotation();

	/**
	 * Returns the value of the '<em><b>Indexterm</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.IndextermType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Indexterm</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getTertiaryieType_Indexterm()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='indexterm' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<IndextermType> getIndexterm();

	/**
	 * Returns the value of the '<em><b>Abbrev</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.AbbrevType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abbrev</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getTertiaryieType_Abbrev()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='abbrev' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<AbbrevType> getAbbrev();

	/**
	 * Returns the value of the '<em><b>Acronym</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.AcronymType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Acronym</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getTertiaryieType_Acronym()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='acronym' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<AcronymType> getAcronym();

	/**
	 * Returns the value of the '<em><b>Date</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.DateType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getTertiaryieType_Date()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='date' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<DateType> getDate();

	/**
	 * Returns the value of the '<em><b>Emphasis</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.EmphasisType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Emphasis</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getTertiaryieType_Emphasis()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='emphasis' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<EmphasisType> getEmphasis();

	/**
	 * Returns the value of the '<em><b>Footnote</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.FootnoteType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Footnote</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getTertiaryieType_Footnote()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='footnote' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<FootnoteType> getFootnote();

	/**
	 * Returns the value of the '<em><b>Footnoteref</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.FootnoterefType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Footnoteref</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getTertiaryieType_Footnoteref()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='footnoteref' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<FootnoterefType> getFootnoteref();

	/**
	 * Returns the value of the '<em><b>Foreignphrase</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.ForeignphraseType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Foreignphrase</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getTertiaryieType_Foreignphrase()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='foreignphrase' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<ForeignphraseType> getForeignphrase();

	/**
	 * Returns the value of the '<em><b>Phrase</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.PhraseType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phrase</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getTertiaryieType_Phrase()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='phrase' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<PhraseType> getPhrase();

	/**
	 * Returns the value of the '<em><b>Quote</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.QuoteType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quote</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getTertiaryieType_Quote()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='quote' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<QuoteType> getQuote();

	/**
	 * Returns the value of the '<em><b>Wordasword</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.WordaswordType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wordasword</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getTertiaryieType_Wordasword()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='wordasword' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<WordaswordType> getWordasword();

	/**
	 * Returns the value of the '<em><b>Firstterm</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.FirsttermType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Firstterm</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getTertiaryieType_Firstterm()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='firstterm' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<FirsttermType> getFirstterm();

	/**
	 * Returns the value of the '<em><b>Glossterm</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.GlosstermType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Glossterm</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getTertiaryieType_Glossterm()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='glossterm' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<GlosstermType> getGlossterm();

	/**
	 * Returns the value of the '<em><b>Coref</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.CorefType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coref</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getTertiaryieType_Coref()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='coref' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<CorefType> getCoref();

	/**
	 * Returns the value of the '<em><b>Trademark</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.TrademarkType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trademark</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getTertiaryieType_Trademark()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='trademark' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<TrademarkType> getTrademark();

	/**
	 * Returns the value of the '<em><b>Productnumber</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.ProductnumberType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Productnumber</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getTertiaryieType_Productnumber()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='productnumber' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<ProductnumberType> getProductnumber();

	/**
	 * Returns the value of the '<em><b>Productname</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.ProductnameType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Productname</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getTertiaryieType_Productname()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='productname' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<ProductnameType> getProductname();

	/**
	 * Returns the value of the '<em><b>Database</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.DatabaseType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Database</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getTertiaryieType_Database()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='database' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<DatabaseType> getDatabase();

	/**
	 * Returns the value of the '<em><b>Application</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.ApplicationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Application</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getTertiaryieType_Application()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='application' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<ApplicationType> getApplication();

	/**
	 * Returns the value of the '<em><b>Hardware</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.HardwareType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hardware</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getTertiaryieType_Hardware()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='hardware' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<HardwareType> getHardware();

	/**
	 * Returns the value of the '<em><b>Citation</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.CitationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Citation</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getTertiaryieType_Citation()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='citation' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<CitationType> getCitation();

	/**
	 * Returns the value of the '<em><b>Citerefentry</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.CiterefentryType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Citerefentry</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getTertiaryieType_Citerefentry()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='citerefentry' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<CiterefentryType> getCiterefentry();

	/**
	 * Returns the value of the '<em><b>Citetitle</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.CitetitleType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Citetitle</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getTertiaryieType_Citetitle()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='citetitle' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<CitetitleType> getCitetitle();

	/**
	 * Returns the value of the '<em><b>Citebiblioid</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.CitebiblioidType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Citebiblioid</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getTertiaryieType_Citebiblioid()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='citebiblioid' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<CitebiblioidType> getCitebiblioid();

	/**
	 * Returns the value of the '<em><b>Author</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.AuthorType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Author</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getTertiaryieType_Author()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='author' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<AuthorType> getAuthor();

	/**
	 * Returns the value of the '<em><b>Person</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.PersonType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Person</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getTertiaryieType_Person()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='person' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<PersonType> getPerson();

	/**
	 * Returns the value of the '<em><b>Personname</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.PersonnameType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Personname</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getTertiaryieType_Personname()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='personname' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<PersonnameType> getPersonname();

	/**
	 * Returns the value of the '<em><b>Org</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.OrgType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Org</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getTertiaryieType_Org()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='org' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<OrgType> getOrg();

	/**
	 * Returns the value of the '<em><b>Orgname</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.OrgnameType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Orgname</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getTertiaryieType_Orgname()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='orgname' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<OrgnameType> getOrgname();

	/**
	 * Returns the value of the '<em><b>Editor</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.EditorType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Editor</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getTertiaryieType_Editor()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='editor' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<EditorType> getEditor();

	/**
	 * Returns the value of the '<em><b>Jobtitle</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.JobtitleType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jobtitle</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getTertiaryieType_Jobtitle()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='jobtitle' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<JobtitleType> getJobtitle();

	/**
	 * Returns the value of the '<em><b>Replaceable</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.ReplaceableType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Replaceable</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getTertiaryieType_Replaceable()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='replaceable' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<ReplaceableType> getReplaceable();

	/**
	 * Returns the value of the '<em><b>Package</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.PackageType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getTertiaryieType_Package()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='package' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<PackageType> getPackage();

	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.ParameterType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getTertiaryieType_Parameter()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='parameter' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<ParameterType> getParameter();

	/**
	 * Returns the value of the '<em><b>Termdef</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.TermdefType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Termdef</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getTertiaryieType_Termdef()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='termdef' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<TermdefType> getTermdef();

	/**
	 * Returns the value of the '<em><b>Nonterminal</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.NonterminalType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nonterminal</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getTertiaryieType_Nonterminal()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='nonterminal' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<NonterminalType> getNonterminal();

	/**
	 * Returns the value of the '<em><b>Systemitem</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.SystemitemType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Systemitem</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getTertiaryieType_Systemitem()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='systemitem' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<SystemitemType> getSystemitem();

	/**
	 * Returns the value of the '<em><b>Option</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.OptionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Option</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getTertiaryieType_Option()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='option' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<OptionType> getOption();

	/**
	 * Returns the value of the '<em><b>Optional</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.OptionalType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Optional</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getTertiaryieType_Optional()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='optional' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<OptionalType> getOptional();

	/**
	 * Returns the value of the '<em><b>Property</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.PropertyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getTertiaryieType_Property()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='property' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<PropertyType> getProperty();

	/**
	 * Returns the value of the '<em><b>Inlineequation</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.InlineequationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inlineequation</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getTertiaryieType_Inlineequation()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='inlineequation' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<InlineequationType> getInlineequation();

	/**
	 * Returns the value of the '<em><b>Tag</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.TagType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tag</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getTertiaryieType_Tag()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='tag' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<TagType> getTag();

	/**
	 * Returns the value of the '<em><b>Markup</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.MarkupType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Markup</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getTertiaryieType_Markup()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='markup' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<MarkupType> getMarkup();

	/**
	 * Returns the value of the '<em><b>Token</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.TokenType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Token</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getTertiaryieType_Token()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='token' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<TokenType> getToken();

	/**
	 * Returns the value of the '<em><b>Symbol</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.SymbolType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Symbol</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getTertiaryieType_Symbol()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='symbol' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<SymbolType> getSymbol();

	/**
	 * Returns the value of the '<em><b>Literal</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.LiteralType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Literal</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getTertiaryieType_Literal()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='literal' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<LiteralType> getLiteral();

	/**
	 * Returns the value of the '<em><b>Code</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.CodeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getTertiaryieType_Code()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='code' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<CodeType> getCode();

	/**
	 * Returns the value of the '<em><b>Constant</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.ConstantType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constant</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getTertiaryieType_Constant()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='constant' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<ConstantType> getConstant();

	/**
	 * Returns the value of the '<em><b>Email</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.EmailType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Email</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getTertiaryieType_Email()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='email' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<EmailType> getEmail();

	/**
	 * Returns the value of the '<em><b>Uri</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.UriType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uri</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getTertiaryieType_Uri()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='uri' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<UriType> getUri();

	/**
	 * Returns the value of the '<em><b>Guiicon</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.GuiiconType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guiicon</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getTertiaryieType_Guiicon()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='guiicon' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<GuiiconType> getGuiicon();

	/**
	 * Returns the value of the '<em><b>Guibutton</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.GuibuttonType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guibutton</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getTertiaryieType_Guibutton()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='guibutton' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<GuibuttonType> getGuibutton();

	/**
	 * Returns the value of the '<em><b>Guimenuitem</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.GuimenuitemType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guimenuitem</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getTertiaryieType_Guimenuitem()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='guimenuitem' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<GuimenuitemType> getGuimenuitem();

	/**
	 * Returns the value of the '<em><b>Guimenu</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.GuimenuType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guimenu</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getTertiaryieType_Guimenu()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='guimenu' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<GuimenuType> getGuimenu();

	/**
	 * Returns the value of the '<em><b>Guisubmenu</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.GuisubmenuType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guisubmenu</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getTertiaryieType_Guisubmenu()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='guisubmenu' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<GuisubmenuType> getGuisubmenu();

	/**
	 * Returns the value of the '<em><b>Guilabel</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.GuilabelType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guilabel</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getTertiaryieType_Guilabel()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='guilabel' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<GuilabelType> getGuilabel();

	/**
	 * Returns the value of the '<em><b>Menuchoice</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.MenuchoiceType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Menuchoice</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getTertiaryieType_Menuchoice()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='menuchoice' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<MenuchoiceType> getMenuchoice();

	/**
	 * Returns the value of the '<em><b>Mousebutton</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.MousebuttonType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mousebutton</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getTertiaryieType_Mousebutton()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='mousebutton' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<MousebuttonType> getMousebutton();

	/**
	 * Returns the value of the '<em><b>Keycombo</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.KeycomboType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Keycombo</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getTertiaryieType_Keycombo()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='keycombo' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<KeycomboType> getKeycombo();

	/**
	 * Returns the value of the '<em><b>Keycap</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.KeycapType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Keycap</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getTertiaryieType_Keycap()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='keycap' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<KeycapType> getKeycap();

	/**
	 * Returns the value of the '<em><b>Keycode</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.KeycodeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Keycode</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getTertiaryieType_Keycode()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='keycode' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<KeycodeType> getKeycode();

	/**
	 * Returns the value of the '<em><b>Keysym</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.KeysymType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Keysym</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getTertiaryieType_Keysym()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='keysym' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<KeysymType> getKeysym();

	/**
	 * Returns the value of the '<em><b>Shortcut</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.ShortcutType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shortcut</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getTertiaryieType_Shortcut()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='shortcut' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<ShortcutType> getShortcut();

	/**
	 * Returns the value of the '<em><b>Accel</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.AccelType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accel</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getTertiaryieType_Accel()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='accel' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<AccelType> getAccel();

	/**
	 * Returns the value of the '<em><b>Prompt</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.PromptType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prompt</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getTertiaryieType_Prompt()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='prompt' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<PromptType> getPrompt();

	/**
	 * Returns the value of the '<em><b>Envar</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.EnvarType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Envar</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getTertiaryieType_Envar()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='envar' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<EnvarType> getEnvar();

	/**
	 * Returns the value of the '<em><b>Filename</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.FilenameType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filename</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getTertiaryieType_Filename()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='filename' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<FilenameType> getFilename();

	/**
	 * Returns the value of the '<em><b>Command</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.CommandType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Command</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getTertiaryieType_Command()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='command' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<CommandType> getCommand();

	/**
	 * Returns the value of the '<em><b>Computeroutput</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.ComputeroutputType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Computeroutput</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getTertiaryieType_Computeroutput()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='computeroutput' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<ComputeroutputType> getComputeroutput();

	/**
	 * Returns the value of the '<em><b>Userinput</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.UserinputType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Userinput</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getTertiaryieType_Userinput()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='userinput' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<UserinputType> getUserinput();

	/**
	 * Returns the value of the '<em><b>Function</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.FunctionType1}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getTertiaryieType_Function()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='function' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<FunctionType1> getFunction();

	/**
	 * Returns the value of the '<em><b>Varname</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.VarnameType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Varname</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getTertiaryieType_Varname()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='varname' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<VarnameType> getVarname();

	/**
	 * Returns the value of the '<em><b>Returnvalue</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.ReturnvalueType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Returnvalue</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getTertiaryieType_Returnvalue()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='returnvalue' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<ReturnvalueType> getReturnvalue();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.TypeType2}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getTertiaryieType_Type()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<TypeType2> getType();

	/**
	 * Returns the value of the '<em><b>Classname</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.ClassnameType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classname</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getTertiaryieType_Classname()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='classname' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<ClassnameType> getClassname();

	/**
	 * Returns the value of the '<em><b>Exceptionname</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.ExceptionnameType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exceptionname</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getTertiaryieType_Exceptionname()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='exceptionname' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<ExceptionnameType> getExceptionname();

	/**
	 * Returns the value of the '<em><b>Interfacename</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.InterfacenameType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interfacename</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getTertiaryieType_Interfacename()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='interfacename' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<InterfacenameType> getInterfacename();

	/**
	 * Returns the value of the '<em><b>Methodname</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.MethodnameType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Methodname</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getTertiaryieType_Methodname()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='methodname' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<MethodnameType> getMethodname();

	/**
	 * Returns the value of the '<em><b>Modifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.ModifierType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modifier</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getTertiaryieType_Modifier()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='modifier' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<ModifierType> getModifier();

	/**
	 * Returns the value of the '<em><b>Initializer</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.InitializerType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initializer</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getTertiaryieType_Initializer()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='initializer' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<InitializerType> getInitializer();

	/**
	 * Returns the value of the '<em><b>Ooclass</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.OoclassType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ooclass</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getTertiaryieType_Ooclass()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ooclass' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<OoclassType> getOoclass();

	/**
	 * Returns the value of the '<em><b>Ooexception</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.OoexceptionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ooexception</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getTertiaryieType_Ooexception()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ooexception' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<OoexceptionType> getOoexception();

	/**
	 * Returns the value of the '<em><b>Oointerface</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.OointerfaceType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Oointerface</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getTertiaryieType_Oointerface()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='oointerface' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<OointerfaceType> getOointerface();

	/**
	 * Returns the value of the '<em><b>Errorcode</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.ErrorcodeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Errorcode</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getTertiaryieType_Errorcode()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='errorcode' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<ErrorcodeType> getErrorcode();

	/**
	 * Returns the value of the '<em><b>Errortext</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.ErrortextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Errortext</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getTertiaryieType_Errortext()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='errortext' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<ErrortextType> getErrortext();

	/**
	 * Returns the value of the '<em><b>Errorname</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.ErrornameType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Errorname</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getTertiaryieType_Errorname()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='errorname' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<ErrornameType> getErrorname();

	/**
	 * Returns the value of the '<em><b>Errortype</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.ErrortypeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Errortype</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getTertiaryieType_Errortype()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='errortype' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<ErrortypeType> getErrortype();

	/**
	 * Returns the value of the '<em><b>Annotations</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotations</em>' attribute.
	 * @see #setAnnotations(Object)
	 * @see org.docbook.ns.docbook.DocbookPackage#getTertiaryieType_Annotations()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='annotations'"
	 * @generated
	 */
	Object getAnnotations();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.TertiaryieType#getAnnotations <em>Annotations</em>}' attribute.
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
	 * @see org.docbook.ns.docbook.DocbookPackage#getTertiaryieType_Arch()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='arch'"
	 * @generated
	 */
	Object getArch();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.TertiaryieType#getArch <em>Arch</em>}' attribute.
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
	 * @see org.docbook.ns.docbook.DocbookPackage#getTertiaryieType_Audience()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='audience'"
	 * @generated
	 */
	Object getAudience();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.TertiaryieType#getAudience <em>Audience</em>}' attribute.
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
	 * @see org.docbook.ns.docbook.DocbookPackage#getTertiaryieType_Base()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='base' namespace='http://www.w3.org/XML/1998/namespace'"
	 * @generated
	 */
	Object getBase();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.TertiaryieType#getBase <em>Base</em>}' attribute.
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
	 * @see org.docbook.ns.docbook.DocbookPackage#getTertiaryieType_Condition()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='condition'"
	 * @generated
	 */
	Object getCondition();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.TertiaryieType#getCondition <em>Condition</em>}' attribute.
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
	 * @see org.docbook.ns.docbook.DocbookPackage#getTertiaryieType_Conformance()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='conformance'"
	 * @generated
	 */
	Object getConformance();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.TertiaryieType#getConformance <em>Conformance</em>}' attribute.
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
	 * @see org.docbook.ns.docbook.DocbookPackage#getTertiaryieType_Dir()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='dir'"
	 * @generated
	 */
	DirType getDir();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.TertiaryieType#getDir <em>Dir</em>}' attribute.
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
	 * Unsets the value of the '{@link org.docbook.ns.docbook.TertiaryieType#getDir <em>Dir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDir()
	 * @see #getDir()
	 * @see #setDir(DirType)
	 * @generated
	 */
	void unsetDir();

	/**
	 * Returns whether the value of the '{@link org.docbook.ns.docbook.TertiaryieType#getDir <em>Dir</em>}' attribute is set.
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
	 * @see org.docbook.ns.docbook.DocbookPackage#getTertiaryieType_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='id' namespace='http://www.w3.org/XML/1998/namespace'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.TertiaryieType#getId <em>Id</em>}' attribute.
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
	 * @see org.docbook.ns.docbook.DocbookPackage#getTertiaryieType_Lang()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='lang' namespace='http://www.w3.org/XML/1998/namespace'"
	 * @generated
	 */
	Object getLang();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.TertiaryieType#getLang <em>Lang</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lang</em>' attribute.
	 * @see #getLang()
	 * @generated
	 */
	void setLang(Object value);

	/**
	 * Returns the value of the '<em><b>Linkends</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Linkends</em>' attribute.
	 * @see #setLinkends(List)
	 * @see org.docbook.ns.docbook.DocbookPackage#getTertiaryieType_Linkends()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.IDREFS" many="false"
	 *        extendedMetaData="kind='attribute' name='linkends'"
	 * @generated
	 */
	List<String> getLinkends();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.TertiaryieType#getLinkends <em>Linkends</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Linkends</em>' attribute.
	 * @see #getLinkends()
	 * @generated
	 */
	void setLinkends(List<String> value);

	/**
	 * Returns the value of the '<em><b>Os</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Os</em>' attribute.
	 * @see #setOs(Object)
	 * @see org.docbook.ns.docbook.DocbookPackage#getTertiaryieType_Os()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='os'"
	 * @generated
	 */
	Object getOs();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.TertiaryieType#getOs <em>Os</em>}' attribute.
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
	 * @see org.docbook.ns.docbook.DocbookPackage#getTertiaryieType_Remap()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='remap'"
	 * @generated
	 */
	Object getRemap();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.TertiaryieType#getRemap <em>Remap</em>}' attribute.
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
	 * @see org.docbook.ns.docbook.DocbookPackage#getTertiaryieType_Revision()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='revision'"
	 * @generated
	 */
	Object getRevision();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.TertiaryieType#getRevision <em>Revision</em>}' attribute.
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
	 * @see org.docbook.ns.docbook.DocbookPackage#getTertiaryieType_Revisionflag()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='revisionflag'"
	 * @generated
	 */
	RevisionflagType getRevisionflag();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.TertiaryieType#getRevisionflag <em>Revisionflag</em>}' attribute.
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
	 * Unsets the value of the '{@link org.docbook.ns.docbook.TertiaryieType#getRevisionflag <em>Revisionflag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRevisionflag()
	 * @see #getRevisionflag()
	 * @see #setRevisionflag(RevisionflagType)
	 * @generated
	 */
	void unsetRevisionflag();

	/**
	 * Returns whether the value of the '{@link org.docbook.ns.docbook.TertiaryieType#getRevisionflag <em>Revisionflag</em>}' attribute is set.
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
	 * @see org.docbook.ns.docbook.DocbookPackage#getTertiaryieType_Role()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='role'"
	 * @generated
	 */
	Object getRole();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.TertiaryieType#getRole <em>Role</em>}' attribute.
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
	 * @see org.docbook.ns.docbook.DocbookPackage#getTertiaryieType_Security()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='security'"
	 * @generated
	 */
	Object getSecurity();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.TertiaryieType#getSecurity <em>Security</em>}' attribute.
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
	 * @see org.docbook.ns.docbook.DocbookPackage#getTertiaryieType_Userlevel()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='userlevel'"
	 * @generated
	 */
	Object getUserlevel();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.TertiaryieType#getUserlevel <em>Userlevel</em>}' attribute.
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
	 * @see org.docbook.ns.docbook.DocbookPackage#getTertiaryieType_Vendor()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='vendor'"
	 * @generated
	 */
	Object getVendor();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.TertiaryieType#getVendor <em>Vendor</em>}' attribute.
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
	 * @see org.docbook.ns.docbook.DocbookPackage#getTertiaryieType_Version()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='version'"
	 * @generated
	 */
	Object getVersion();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.TertiaryieType#getVersion <em>Version</em>}' attribute.
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
	 * @see org.docbook.ns.docbook.DocbookPackage#getTertiaryieType_Wordsize()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='wordsize'"
	 * @generated
	 */
	Object getWordsize();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.TertiaryieType#getWordsize <em>Wordsize</em>}' attribute.
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
	 * @see org.docbook.ns.docbook.DocbookPackage#getTertiaryieType_Xreflabel()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='xreflabel'"
	 * @generated
	 */
	Object getXreflabel();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.TertiaryieType#getXreflabel <em>Xreflabel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xreflabel</em>' attribute.
	 * @see #getXreflabel()
	 * @generated
	 */
	void setXreflabel(Object value);

} // TertiaryieType
