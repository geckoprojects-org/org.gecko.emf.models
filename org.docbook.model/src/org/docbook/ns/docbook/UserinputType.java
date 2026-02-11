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
 * A representation of the model object '<em><b>Userinput Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.docbook.ns.docbook.UserinputType#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.UserinputType#getGroup <em>Group</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.UserinputType#getInlinemediaobject <em>Inlinemediaobject</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.UserinputType#getRemark <em>Remark</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.UserinputType#getSuperscript <em>Superscript</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.UserinputType#getSubscript <em>Subscript</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.UserinputType#getXref <em>Xref</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.UserinputType#getLink <em>Link</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.UserinputType#getOlink <em>Olink</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.UserinputType#getAnchor <em>Anchor</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.UserinputType#getBiblioref <em>Biblioref</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.UserinputType#getAlt <em>Alt</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.UserinputType#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.UserinputType#getIndexterm <em>Indexterm</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.UserinputType#getPrompt <em>Prompt</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.UserinputType#getEnvar <em>Envar</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.UserinputType#getFilename <em>Filename</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.UserinputType#getCommand <em>Command</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.UserinputType#getComputeroutput <em>Computeroutput</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.UserinputType#getUserinput <em>Userinput</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.UserinputType#getReplaceable <em>Replaceable</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.UserinputType#getPackage <em>Package</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.UserinputType#getParameter <em>Parameter</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.UserinputType#getTermdef <em>Termdef</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.UserinputType#getNonterminal <em>Nonterminal</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.UserinputType#getSystemitem <em>Systemitem</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.UserinputType#getOption <em>Option</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.UserinputType#getOptional <em>Optional</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.UserinputType#getProperty <em>Property</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.UserinputType#getCo <em>Co</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.UserinputType#getTag <em>Tag</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.UserinputType#getMarkup <em>Markup</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.UserinputType#getToken <em>Token</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.UserinputType#getSymbol <em>Symbol</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.UserinputType#getLiteral <em>Literal</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.UserinputType#getCode <em>Code</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.UserinputType#getConstant <em>Constant</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.UserinputType#getEmail <em>Email</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.UserinputType#getUri <em>Uri</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.UserinputType#getGuiicon <em>Guiicon</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.UserinputType#getGuibutton <em>Guibutton</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.UserinputType#getGuimenuitem <em>Guimenuitem</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.UserinputType#getGuimenu <em>Guimenu</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.UserinputType#getGuisubmenu <em>Guisubmenu</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.UserinputType#getGuilabel <em>Guilabel</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.UserinputType#getMenuchoice <em>Menuchoice</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.UserinputType#getMousebutton <em>Mousebutton</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.UserinputType#getKeycombo <em>Keycombo</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.UserinputType#getKeycap <em>Keycap</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.UserinputType#getKeycode <em>Keycode</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.UserinputType#getKeysym <em>Keysym</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.UserinputType#getShortcut <em>Shortcut</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.UserinputType#getAccel <em>Accel</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.UserinputType#getActuate <em>Actuate</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.UserinputType#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.UserinputType#getArch <em>Arch</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.UserinputType#getArcrole <em>Arcrole</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.UserinputType#getAudience <em>Audience</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.UserinputType#getBase <em>Base</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.UserinputType#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.UserinputType#getConformance <em>Conformance</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.UserinputType#getDir <em>Dir</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.UserinputType#getHref <em>Href</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.UserinputType#getId <em>Id</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.UserinputType#getLang <em>Lang</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.UserinputType#getLinkend <em>Linkend</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.UserinputType#getOs <em>Os</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.UserinputType#getRemap <em>Remap</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.UserinputType#getRevision <em>Revision</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.UserinputType#getRevisionflag <em>Revisionflag</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.UserinputType#getRole <em>Role</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.UserinputType#getRole1 <em>Role1</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.UserinputType#getSecurity <em>Security</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.UserinputType#getShow <em>Show</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.UserinputType#getTitle <em>Title</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.UserinputType#getType <em>Type</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.UserinputType#getUserlevel <em>Userlevel</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.UserinputType#getVendor <em>Vendor</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.UserinputType#getVersion <em>Version</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.UserinputType#getWordsize <em>Wordsize</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.UserinputType#getXreflabel <em>Xreflabel</em>}</li>
 * </ul>
 *
 * @see org.docbook.ns.docbook.DocbookPackage#getUserinputType()
 * @model extendedMetaData="name='userinput_._type' kind='mixed'"
 * @generated
 */
@ProviderType
public interface UserinputType extends EObject {
	/**
	 * Returns the value of the '<em><b>Mixed</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mixed</em>' attribute list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getUserinputType_Mixed()
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
	 * @see org.docbook.ns.docbook.DocbookPackage#getUserinputType_Group()
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
	 * @see org.docbook.ns.docbook.DocbookPackage#getUserinputType_Inlinemediaobject()
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
	 * @see org.docbook.ns.docbook.DocbookPackage#getUserinputType_Remark()
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
	 * @see org.docbook.ns.docbook.DocbookPackage#getUserinputType_Superscript()
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
	 * @see org.docbook.ns.docbook.DocbookPackage#getUserinputType_Subscript()
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
	 * @see org.docbook.ns.docbook.DocbookPackage#getUserinputType_Xref()
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
	 * @see org.docbook.ns.docbook.DocbookPackage#getUserinputType_Link()
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
	 * @see org.docbook.ns.docbook.DocbookPackage#getUserinputType_Olink()
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
	 * @see org.docbook.ns.docbook.DocbookPackage#getUserinputType_Anchor()
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
	 * @see org.docbook.ns.docbook.DocbookPackage#getUserinputType_Biblioref()
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
	 * @see org.docbook.ns.docbook.DocbookPackage#getUserinputType_Alt()
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
	 * @see org.docbook.ns.docbook.DocbookPackage#getUserinputType_Annotation()
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
	 * @see org.docbook.ns.docbook.DocbookPackage#getUserinputType_Indexterm()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='indexterm' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<IndextermType> getIndexterm();

	/**
	 * Returns the value of the '<em><b>Prompt</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.PromptType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prompt</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getUserinputType_Prompt()
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
	 * @see org.docbook.ns.docbook.DocbookPackage#getUserinputType_Envar()
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
	 * @see org.docbook.ns.docbook.DocbookPackage#getUserinputType_Filename()
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
	 * @see org.docbook.ns.docbook.DocbookPackage#getUserinputType_Command()
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
	 * @see org.docbook.ns.docbook.DocbookPackage#getUserinputType_Computeroutput()
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
	 * @see org.docbook.ns.docbook.DocbookPackage#getUserinputType_Userinput()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='userinput' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<UserinputType> getUserinput();

	/**
	 * Returns the value of the '<em><b>Replaceable</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.ReplaceableType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Replaceable</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getUserinputType_Replaceable()
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
	 * @see org.docbook.ns.docbook.DocbookPackage#getUserinputType_Package()
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
	 * @see org.docbook.ns.docbook.DocbookPackage#getUserinputType_Parameter()
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
	 * @see org.docbook.ns.docbook.DocbookPackage#getUserinputType_Termdef()
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
	 * @see org.docbook.ns.docbook.DocbookPackage#getUserinputType_Nonterminal()
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
	 * @see org.docbook.ns.docbook.DocbookPackage#getUserinputType_Systemitem()
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
	 * @see org.docbook.ns.docbook.DocbookPackage#getUserinputType_Option()
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
	 * @see org.docbook.ns.docbook.DocbookPackage#getUserinputType_Optional()
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
	 * @see org.docbook.ns.docbook.DocbookPackage#getUserinputType_Property()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='property' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<PropertyType> getProperty();

	/**
	 * Returns the value of the '<em><b>Co</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.CoType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Co</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getUserinputType_Co()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='co' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<CoType> getCo();

	/**
	 * Returns the value of the '<em><b>Tag</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.TagType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tag</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getUserinputType_Tag()
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
	 * @see org.docbook.ns.docbook.DocbookPackage#getUserinputType_Markup()
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
	 * @see org.docbook.ns.docbook.DocbookPackage#getUserinputType_Token()
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
	 * @see org.docbook.ns.docbook.DocbookPackage#getUserinputType_Symbol()
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
	 * @see org.docbook.ns.docbook.DocbookPackage#getUserinputType_Literal()
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
	 * @see org.docbook.ns.docbook.DocbookPackage#getUserinputType_Code()
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
	 * @see org.docbook.ns.docbook.DocbookPackage#getUserinputType_Constant()
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
	 * @see org.docbook.ns.docbook.DocbookPackage#getUserinputType_Email()
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
	 * @see org.docbook.ns.docbook.DocbookPackage#getUserinputType_Uri()
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
	 * @see org.docbook.ns.docbook.DocbookPackage#getUserinputType_Guiicon()
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
	 * @see org.docbook.ns.docbook.DocbookPackage#getUserinputType_Guibutton()
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
	 * @see org.docbook.ns.docbook.DocbookPackage#getUserinputType_Guimenuitem()
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
	 * @see org.docbook.ns.docbook.DocbookPackage#getUserinputType_Guimenu()
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
	 * @see org.docbook.ns.docbook.DocbookPackage#getUserinputType_Guisubmenu()
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
	 * @see org.docbook.ns.docbook.DocbookPackage#getUserinputType_Guilabel()
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
	 * @see org.docbook.ns.docbook.DocbookPackage#getUserinputType_Menuchoice()
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
	 * @see org.docbook.ns.docbook.DocbookPackage#getUserinputType_Mousebutton()
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
	 * @see org.docbook.ns.docbook.DocbookPackage#getUserinputType_Keycombo()
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
	 * @see org.docbook.ns.docbook.DocbookPackage#getUserinputType_Keycap()
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
	 * @see org.docbook.ns.docbook.DocbookPackage#getUserinputType_Keycode()
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
	 * @see org.docbook.ns.docbook.DocbookPackage#getUserinputType_Keysym()
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
	 * @see org.docbook.ns.docbook.DocbookPackage#getUserinputType_Shortcut()
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
	 * @see org.docbook.ns.docbook.DocbookPackage#getUserinputType_Accel()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='accel' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<AccelType> getAccel();

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
	 * @see org.docbook.ns.docbook.DocbookPackage#getUserinputType_Actuate()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='actuate' namespace='http://www.w3.org/1999/xlink'"
	 * @generated
	 */
	ActuateType getActuate();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.UserinputType#getActuate <em>Actuate</em>}' attribute.
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
	 * Unsets the value of the '{@link org.docbook.ns.docbook.UserinputType#getActuate <em>Actuate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetActuate()
	 * @see #getActuate()
	 * @see #setActuate(ActuateType)
	 * @generated
	 */
	void unsetActuate();

	/**
	 * Returns whether the value of the '{@link org.docbook.ns.docbook.UserinputType#getActuate <em>Actuate</em>}' attribute is set.
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
	 * @see org.docbook.ns.docbook.DocbookPackage#getUserinputType_Annotations()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='annotations'"
	 * @generated
	 */
	Object getAnnotations();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.UserinputType#getAnnotations <em>Annotations</em>}' attribute.
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
	 * @see org.docbook.ns.docbook.DocbookPackage#getUserinputType_Arch()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='arch'"
	 * @generated
	 */
	Object getArch();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.UserinputType#getArch <em>Arch</em>}' attribute.
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
	 * @see org.docbook.ns.docbook.DocbookPackage#getUserinputType_Arcrole()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='arcrole' namespace='http://www.w3.org/1999/xlink'"
	 * @generated
	 */
	Object getArcrole();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.UserinputType#getArcrole <em>Arcrole</em>}' attribute.
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
	 * @see org.docbook.ns.docbook.DocbookPackage#getUserinputType_Audience()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='audience'"
	 * @generated
	 */
	Object getAudience();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.UserinputType#getAudience <em>Audience</em>}' attribute.
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
	 * @see org.docbook.ns.docbook.DocbookPackage#getUserinputType_Base()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='base' namespace='http://www.w3.org/XML/1998/namespace'"
	 * @generated
	 */
	Object getBase();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.UserinputType#getBase <em>Base</em>}' attribute.
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
	 * @see org.docbook.ns.docbook.DocbookPackage#getUserinputType_Condition()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='condition'"
	 * @generated
	 */
	Object getCondition();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.UserinputType#getCondition <em>Condition</em>}' attribute.
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
	 * @see org.docbook.ns.docbook.DocbookPackage#getUserinputType_Conformance()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='conformance'"
	 * @generated
	 */
	Object getConformance();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.UserinputType#getConformance <em>Conformance</em>}' attribute.
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
	 * @see org.docbook.ns.docbook.DocbookPackage#getUserinputType_Dir()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='dir'"
	 * @generated
	 */
	DirType getDir();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.UserinputType#getDir <em>Dir</em>}' attribute.
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
	 * Unsets the value of the '{@link org.docbook.ns.docbook.UserinputType#getDir <em>Dir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDir()
	 * @see #getDir()
	 * @see #setDir(DirType)
	 * @generated
	 */
	void unsetDir();

	/**
	 * Returns whether the value of the '{@link org.docbook.ns.docbook.UserinputType#getDir <em>Dir</em>}' attribute is set.
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
	 * @see org.docbook.ns.docbook.DocbookPackage#getUserinputType_Href()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='href' namespace='http://www.w3.org/1999/xlink'"
	 * @generated
	 */
	Object getHref();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.UserinputType#getHref <em>Href</em>}' attribute.
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
	 * @see org.docbook.ns.docbook.DocbookPackage#getUserinputType_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='id' namespace='http://www.w3.org/XML/1998/namespace'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.UserinputType#getId <em>Id</em>}' attribute.
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
	 * @see org.docbook.ns.docbook.DocbookPackage#getUserinputType_Lang()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='lang' namespace='http://www.w3.org/XML/1998/namespace'"
	 * @generated
	 */
	Object getLang();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.UserinputType#getLang <em>Lang</em>}' attribute.
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
	 * @see org.docbook.ns.docbook.DocbookPackage#getUserinputType_Linkend()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.IDREF"
	 *        extendedMetaData="kind='attribute' name='linkend'"
	 * @generated
	 */
	String getLinkend();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.UserinputType#getLinkend <em>Linkend</em>}' attribute.
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
	 * @see org.docbook.ns.docbook.DocbookPackage#getUserinputType_Os()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='os'"
	 * @generated
	 */
	Object getOs();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.UserinputType#getOs <em>Os</em>}' attribute.
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
	 * @see org.docbook.ns.docbook.DocbookPackage#getUserinputType_Remap()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='remap'"
	 * @generated
	 */
	Object getRemap();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.UserinputType#getRemap <em>Remap</em>}' attribute.
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
	 * @see org.docbook.ns.docbook.DocbookPackage#getUserinputType_Revision()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='revision'"
	 * @generated
	 */
	Object getRevision();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.UserinputType#getRevision <em>Revision</em>}' attribute.
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
	 * @see org.docbook.ns.docbook.DocbookPackage#getUserinputType_Revisionflag()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='revisionflag'"
	 * @generated
	 */
	RevisionflagType getRevisionflag();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.UserinputType#getRevisionflag <em>Revisionflag</em>}' attribute.
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
	 * Unsets the value of the '{@link org.docbook.ns.docbook.UserinputType#getRevisionflag <em>Revisionflag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRevisionflag()
	 * @see #getRevisionflag()
	 * @see #setRevisionflag(RevisionflagType)
	 * @generated
	 */
	void unsetRevisionflag();

	/**
	 * Returns whether the value of the '{@link org.docbook.ns.docbook.UserinputType#getRevisionflag <em>Revisionflag</em>}' attribute is set.
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
	 * @see org.docbook.ns.docbook.DocbookPackage#getUserinputType_Role()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='role'"
	 * @generated
	 */
	Object getRole();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.UserinputType#getRole <em>Role</em>}' attribute.
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
	 * @see org.docbook.ns.docbook.DocbookPackage#getUserinputType_Role1()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='role' namespace='http://www.w3.org/1999/xlink'"
	 * @generated
	 */
	Object getRole1();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.UserinputType#getRole1 <em>Role1</em>}' attribute.
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
	 * @see org.docbook.ns.docbook.DocbookPackage#getUserinputType_Security()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='security'"
	 * @generated
	 */
	Object getSecurity();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.UserinputType#getSecurity <em>Security</em>}' attribute.
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
	 * @see org.docbook.ns.docbook.DocbookPackage#getUserinputType_Show()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='show' namespace='http://www.w3.org/1999/xlink'"
	 * @generated
	 */
	ShowType getShow();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.UserinputType#getShow <em>Show</em>}' attribute.
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
	 * Unsets the value of the '{@link org.docbook.ns.docbook.UserinputType#getShow <em>Show</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetShow()
	 * @see #getShow()
	 * @see #setShow(ShowType)
	 * @generated
	 */
	void unsetShow();

	/**
	 * Returns whether the value of the '{@link org.docbook.ns.docbook.UserinputType#getShow <em>Show</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(Object)
	 * @see org.docbook.ns.docbook.DocbookPackage#getUserinputType_Title()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='title' namespace='http://www.w3.org/1999/xlink'"
	 * @generated
	 */
	Object getTitle();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.UserinputType#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(Object value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(Object)
	 * @see org.docbook.ns.docbook.DocbookPackage#getUserinputType_Type()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='type' namespace='http://www.w3.org/1999/xlink'"
	 * @generated
	 */
	Object getType();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.UserinputType#getType <em>Type</em>}' attribute.
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
	 * @see org.docbook.ns.docbook.DocbookPackage#getUserinputType_Userlevel()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='userlevel'"
	 * @generated
	 */
	Object getUserlevel();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.UserinputType#getUserlevel <em>Userlevel</em>}' attribute.
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
	 * @see org.docbook.ns.docbook.DocbookPackage#getUserinputType_Vendor()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='vendor'"
	 * @generated
	 */
	Object getVendor();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.UserinputType#getVendor <em>Vendor</em>}' attribute.
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
	 * @see org.docbook.ns.docbook.DocbookPackage#getUserinputType_Version()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='version'"
	 * @generated
	 */
	Object getVersion();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.UserinputType#getVersion <em>Version</em>}' attribute.
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
	 * @see org.docbook.ns.docbook.DocbookPackage#getUserinputType_Wordsize()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='wordsize'"
	 * @generated
	 */
	Object getWordsize();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.UserinputType#getWordsize <em>Wordsize</em>}' attribute.
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
	 * @see org.docbook.ns.docbook.DocbookPackage#getUserinputType_Xreflabel()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='xreflabel'"
	 * @generated
	 */
	Object getXreflabel();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.UserinputType#getXreflabel <em>Xreflabel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xreflabel</em>' attribute.
	 * @see #getXreflabel()
	 * @generated
	 */
	void setXreflabel(Object value);

} // UserinputType
