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
 * A representation of the model object '<em><b>Entry Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.docbook.ns.docbook.EntryType#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.EntryType#getGroup <em>Group</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.EntryType#getInlinemediaobject <em>Inlinemediaobject</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.EntryType#getRemark <em>Remark</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.EntryType#getSuperscript <em>Superscript</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.EntryType#getSubscript <em>Subscript</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.EntryType#getXref <em>Xref</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.EntryType#getLink <em>Link</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.EntryType#getOlink <em>Olink</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.EntryType#getAnchor <em>Anchor</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.EntryType#getBiblioref <em>Biblioref</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.EntryType#getAlt <em>Alt</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.EntryType#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.EntryType#getIndexterm <em>Indexterm</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.EntryType#getAbbrev <em>Abbrev</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.EntryType#getAcronym <em>Acronym</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.EntryType#getDate <em>Date</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.EntryType#getEmphasis <em>Emphasis</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.EntryType#getFootnote <em>Footnote</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.EntryType#getFootnoteref <em>Footnoteref</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.EntryType#getForeignphrase <em>Foreignphrase</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.EntryType#getPhrase <em>Phrase</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.EntryType#getQuote <em>Quote</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.EntryType#getWordasword <em>Wordasword</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.EntryType#getFirstterm <em>Firstterm</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.EntryType#getGlossterm <em>Glossterm</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.EntryType#getCoref <em>Coref</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.EntryType#getTrademark <em>Trademark</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.EntryType#getProductnumber <em>Productnumber</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.EntryType#getProductname <em>Productname</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.EntryType#getDatabase <em>Database</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.EntryType#getApplication <em>Application</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.EntryType#getHardware <em>Hardware</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.EntryType#getCitation <em>Citation</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.EntryType#getCiterefentry <em>Citerefentry</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.EntryType#getCitetitle <em>Citetitle</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.EntryType#getCitebiblioid <em>Citebiblioid</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.EntryType#getAuthor <em>Author</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.EntryType#getPerson <em>Person</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.EntryType#getPersonname <em>Personname</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.EntryType#getOrg <em>Org</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.EntryType#getOrgname <em>Orgname</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.EntryType#getEditor <em>Editor</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.EntryType#getJobtitle <em>Jobtitle</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.EntryType#getReplaceable <em>Replaceable</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.EntryType#getPackage <em>Package</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.EntryType#getParameter <em>Parameter</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.EntryType#getTermdef <em>Termdef</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.EntryType#getNonterminal <em>Nonterminal</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.EntryType#getSystemitem <em>Systemitem</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.EntryType#getOption <em>Option</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.EntryType#getOptional <em>Optional</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.EntryType#getProperty <em>Property</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.EntryType#getInlineequation <em>Inlineequation</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.EntryType#getTag <em>Tag</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.EntryType#getMarkup <em>Markup</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.EntryType#getToken <em>Token</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.EntryType#getSymbol <em>Symbol</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.EntryType#getLiteral <em>Literal</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.EntryType#getCode <em>Code</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.EntryType#getConstant <em>Constant</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.EntryType#getEmail <em>Email</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.EntryType#getUri <em>Uri</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.EntryType#getGuiicon <em>Guiicon</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.EntryType#getGuibutton <em>Guibutton</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.EntryType#getGuimenuitem <em>Guimenuitem</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.EntryType#getGuimenu <em>Guimenu</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.EntryType#getGuisubmenu <em>Guisubmenu</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.EntryType#getGuilabel <em>Guilabel</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.EntryType#getMenuchoice <em>Menuchoice</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.EntryType#getMousebutton <em>Mousebutton</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.EntryType#getKeycombo <em>Keycombo</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.EntryType#getKeycap <em>Keycap</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.EntryType#getKeycode <em>Keycode</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.EntryType#getKeysym <em>Keysym</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.EntryType#getShortcut <em>Shortcut</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.EntryType#getAccel <em>Accel</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.EntryType#getPrompt <em>Prompt</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.EntryType#getEnvar <em>Envar</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.EntryType#getFilename <em>Filename</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.EntryType#getCommand <em>Command</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.EntryType#getComputeroutput <em>Computeroutput</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.EntryType#getUserinput <em>Userinput</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.EntryType#getFunction <em>Function</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.EntryType#getVarname <em>Varname</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.EntryType#getReturnvalue <em>Returnvalue</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.EntryType#getType <em>Type</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.EntryType#getClassname <em>Classname</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.EntryType#getExceptionname <em>Exceptionname</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.EntryType#getInterfacename <em>Interfacename</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.EntryType#getMethodname <em>Methodname</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.EntryType#getModifier <em>Modifier</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.EntryType#getInitializer <em>Initializer</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.EntryType#getOoclass <em>Ooclass</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.EntryType#getOoexception <em>Ooexception</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.EntryType#getOointerface <em>Oointerface</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.EntryType#getErrorcode <em>Errorcode</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.EntryType#getErrortext <em>Errortext</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.EntryType#getErrorname <em>Errorname</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.EntryType#getErrortype <em>Errortype</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.EntryType#getItemizedlist <em>Itemizedlist</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.EntryType#getOrderedlist <em>Orderedlist</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.EntryType#getProcedure <em>Procedure</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.EntryType#getSimplelist <em>Simplelist</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.EntryType#getVariablelist <em>Variablelist</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.EntryType#getSegmentedlist <em>Segmentedlist</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.EntryType#getGlosslist <em>Glosslist</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.EntryType#getBibliolist <em>Bibliolist</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.EntryType#getCalloutlist <em>Calloutlist</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.EntryType#getQandaset <em>Qandaset</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.EntryType#getExample <em>Example</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.EntryType#getFigure <em>Figure</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.EntryType#getTable <em>Table</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.EntryType#getEquation <em>Equation</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.EntryType#getInformalexample <em>Informalexample</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.EntryType#getInformalfigure <em>Informalfigure</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.EntryType#getInformaltable <em>Informaltable</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.EntryType#getInformalequation <em>Informalequation</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.EntryType#getSidebar <em>Sidebar</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.EntryType#getBlockquote <em>Blockquote</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.EntryType#getAddress <em>Address</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.EntryType#getEpigraph <em>Epigraph</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.EntryType#getMediaobject <em>Mediaobject</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.EntryType#getScreenshot <em>Screenshot</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.EntryType#getTask <em>Task</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.EntryType#getProductionset <em>Productionset</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.EntryType#getConstraintdef <em>Constraintdef</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.EntryType#getMsgset <em>Msgset</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.EntryType#getScreen <em>Screen</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.EntryType#getLiterallayout <em>Literallayout</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.EntryType#getProgramlistingco <em>Programlistingco</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.EntryType#getScreenco <em>Screenco</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.EntryType#getProgramlisting <em>Programlisting</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.EntryType#getSynopsis <em>Synopsis</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.EntryType#getBridgehead <em>Bridgehead</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.EntryType#getRevhistory <em>Revhistory</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.EntryType#getFuncsynopsis <em>Funcsynopsis</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.EntryType#getClasssynopsis <em>Classsynopsis</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.EntryType#getMethodsynopsis <em>Methodsynopsis</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.EntryType#getConstructorsynopsis <em>Constructorsynopsis</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.EntryType#getDestructorsynopsis <em>Destructorsynopsis</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.EntryType#getFieldsynopsis <em>Fieldsynopsis</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.EntryType#getCmdsynopsis <em>Cmdsynopsis</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.EntryType#getCaution <em>Caution</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.EntryType#getImportant <em>Important</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.EntryType#getNote <em>Note</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.EntryType#getTip <em>Tip</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.EntryType#getWarning <em>Warning</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.EntryType#getPara <em>Para</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.EntryType#getFormalpara <em>Formalpara</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.EntryType#getSimpara <em>Simpara</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.EntryType#getActuate <em>Actuate</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.EntryType#getAlign <em>Align</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.EntryType#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.EntryType#getArch <em>Arch</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.EntryType#getArcrole <em>Arcrole</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.EntryType#getAudience <em>Audience</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.EntryType#getBase <em>Base</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.EntryType#getChar <em>Char</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.EntryType#getCharoff <em>Charoff</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.EntryType#getColname <em>Colname</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.EntryType#getColsep <em>Colsep</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.EntryType#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.EntryType#getConformance <em>Conformance</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.EntryType#getDir <em>Dir</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.EntryType#getHref <em>Href</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.EntryType#getId <em>Id</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.EntryType#getLang <em>Lang</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.EntryType#getLinkend <em>Linkend</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.EntryType#getMorerows <em>Morerows</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.EntryType#getNameend <em>Nameend</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.EntryType#getNamest <em>Namest</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.EntryType#getOs <em>Os</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.EntryType#getRemap <em>Remap</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.EntryType#getRevision <em>Revision</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.EntryType#getRevisionflag <em>Revisionflag</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.EntryType#getRole <em>Role</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.EntryType#getRole1 <em>Role1</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.EntryType#getRotate <em>Rotate</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.EntryType#getRowsep <em>Rowsep</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.EntryType#getSecurity <em>Security</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.EntryType#getShow <em>Show</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.EntryType#getSpanname <em>Spanname</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.EntryType#getTitle <em>Title</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.EntryType#getType1 <em>Type1</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.EntryType#getUserlevel <em>Userlevel</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.EntryType#getValign <em>Valign</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.EntryType#getVendor <em>Vendor</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.EntryType#getVersion <em>Version</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.EntryType#getWordsize <em>Wordsize</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.EntryType#getXreflabel <em>Xreflabel</em>}</li>
 * </ul>
 *
 * @see org.docbook.ns.docbook.DocbookPackage#getEntryType()
 * @model extendedMetaData="name='entry_._type' kind='mixed'"
 * @generated
 */
@ProviderType
public interface EntryType extends EObject {
	/**
	 * Returns the value of the '<em><b>Mixed</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mixed</em>' attribute list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getEntryType_Mixed()
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
	 * @see org.docbook.ns.docbook.DocbookPackage#getEntryType_Group()
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
	 * @see org.docbook.ns.docbook.DocbookPackage#getEntryType_Inlinemediaobject()
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
	 * @see org.docbook.ns.docbook.DocbookPackage#getEntryType_Remark()
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
	 * @see org.docbook.ns.docbook.DocbookPackage#getEntryType_Superscript()
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
	 * @see org.docbook.ns.docbook.DocbookPackage#getEntryType_Subscript()
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
	 * @see org.docbook.ns.docbook.DocbookPackage#getEntryType_Xref()
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
	 * @see org.docbook.ns.docbook.DocbookPackage#getEntryType_Link()
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
	 * @see org.docbook.ns.docbook.DocbookPackage#getEntryType_Olink()
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
	 * @see org.docbook.ns.docbook.DocbookPackage#getEntryType_Anchor()
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
	 * @see org.docbook.ns.docbook.DocbookPackage#getEntryType_Biblioref()
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
	 * @see org.docbook.ns.docbook.DocbookPackage#getEntryType_Alt()
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
	 * @see org.docbook.ns.docbook.DocbookPackage#getEntryType_Annotation()
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
	 * @see org.docbook.ns.docbook.DocbookPackage#getEntryType_Indexterm()
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
	 * @see org.docbook.ns.docbook.DocbookPackage#getEntryType_Abbrev()
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
	 * @see org.docbook.ns.docbook.DocbookPackage#getEntryType_Acronym()
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
	 * @see org.docbook.ns.docbook.DocbookPackage#getEntryType_Date()
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
	 * @see org.docbook.ns.docbook.DocbookPackage#getEntryType_Emphasis()
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
	 * @see org.docbook.ns.docbook.DocbookPackage#getEntryType_Footnote()
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
	 * @see org.docbook.ns.docbook.DocbookPackage#getEntryType_Footnoteref()
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
	 * @see org.docbook.ns.docbook.DocbookPackage#getEntryType_Foreignphrase()
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
	 * @see org.docbook.ns.docbook.DocbookPackage#getEntryType_Phrase()
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
	 * @see org.docbook.ns.docbook.DocbookPackage#getEntryType_Quote()
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
	 * @see org.docbook.ns.docbook.DocbookPackage#getEntryType_Wordasword()
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
	 * @see org.docbook.ns.docbook.DocbookPackage#getEntryType_Firstterm()
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
	 * @see org.docbook.ns.docbook.DocbookPackage#getEntryType_Glossterm()
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
	 * @see org.docbook.ns.docbook.DocbookPackage#getEntryType_Coref()
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
	 * @see org.docbook.ns.docbook.DocbookPackage#getEntryType_Trademark()
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
	 * @see org.docbook.ns.docbook.DocbookPackage#getEntryType_Productnumber()
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
	 * @see org.docbook.ns.docbook.DocbookPackage#getEntryType_Productname()
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
	 * @see org.docbook.ns.docbook.DocbookPackage#getEntryType_Database()
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
	 * @see org.docbook.ns.docbook.DocbookPackage#getEntryType_Application()
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
	 * @see org.docbook.ns.docbook.DocbookPackage#getEntryType_Hardware()
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
	 * @see org.docbook.ns.docbook.DocbookPackage#getEntryType_Citation()
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
	 * @see org.docbook.ns.docbook.DocbookPackage#getEntryType_Citerefentry()
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
	 * @see org.docbook.ns.docbook.DocbookPackage#getEntryType_Citetitle()
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
	 * @see org.docbook.ns.docbook.DocbookPackage#getEntryType_Citebiblioid()
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
	 * @see org.docbook.ns.docbook.DocbookPackage#getEntryType_Author()
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
	 * @see org.docbook.ns.docbook.DocbookPackage#getEntryType_Person()
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
	 * @see org.docbook.ns.docbook.DocbookPackage#getEntryType_Personname()
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
	 * @see org.docbook.ns.docbook.DocbookPackage#getEntryType_Org()
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
	 * @see org.docbook.ns.docbook.DocbookPackage#getEntryType_Orgname()
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
	 * @see org.docbook.ns.docbook.DocbookPackage#getEntryType_Editor()
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
	 * @see org.docbook.ns.docbook.DocbookPackage#getEntryType_Jobtitle()
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
	 * @see org.docbook.ns.docbook.DocbookPackage#getEntryType_Replaceable()
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
	 * @see org.docbook.ns.docbook.DocbookPackage#getEntryType_Package()
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
	 * @see org.docbook.ns.docbook.DocbookPackage#getEntryType_Parameter()
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
	 * @see org.docbook.ns.docbook.DocbookPackage#getEntryType_Termdef()
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
	 * @see org.docbook.ns.docbook.DocbookPackage#getEntryType_Nonterminal()
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
	 * @see org.docbook.ns.docbook.DocbookPackage#getEntryType_Systemitem()
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
	 * @see org.docbook.ns.docbook.DocbookPackage#getEntryType_Option()
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
	 * @see org.docbook.ns.docbook.DocbookPackage#getEntryType_Optional()
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
	 * @see org.docbook.ns.docbook.DocbookPackage#getEntryType_Property()
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
	 * @see org.docbook.ns.docbook.DocbookPackage#getEntryType_Inlineequation()
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
	 * @see org.docbook.ns.docbook.DocbookPackage#getEntryType_Tag()
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
	 * @see org.docbook.ns.docbook.DocbookPackage#getEntryType_Markup()
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
	 * @see org.docbook.ns.docbook.DocbookPackage#getEntryType_Token()
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
	 * @see org.docbook.ns.docbook.DocbookPackage#getEntryType_Symbol()
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
	 * @see org.docbook.ns.docbook.DocbookPackage#getEntryType_Literal()
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
	 * @see org.docbook.ns.docbook.DocbookPackage#getEntryType_Code()
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
	 * @see org.docbook.ns.docbook.DocbookPackage#getEntryType_Constant()
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
	 * @see org.docbook.ns.docbook.DocbookPackage#getEntryType_Email()
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
	 * @see org.docbook.ns.docbook.DocbookPackage#getEntryType_Uri()
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
	 * @see org.docbook.ns.docbook.DocbookPackage#getEntryType_Guiicon()
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
	 * @see org.docbook.ns.docbook.DocbookPackage#getEntryType_Guibutton()
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
	 * @see org.docbook.ns.docbook.DocbookPackage#getEntryType_Guimenuitem()
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
	 * @see org.docbook.ns.docbook.DocbookPackage#getEntryType_Guimenu()
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
	 * @see org.docbook.ns.docbook.DocbookPackage#getEntryType_Guisubmenu()
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
	 * @see org.docbook.ns.docbook.DocbookPackage#getEntryType_Guilabel()
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
	 * @see org.docbook.ns.docbook.DocbookPackage#getEntryType_Menuchoice()
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
	 * @see org.docbook.ns.docbook.DocbookPackage#getEntryType_Mousebutton()
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
	 * @see org.docbook.ns.docbook.DocbookPackage#getEntryType_Keycombo()
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
	 * @see org.docbook.ns.docbook.DocbookPackage#getEntryType_Keycap()
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
	 * @see org.docbook.ns.docbook.DocbookPackage#getEntryType_Keycode()
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
	 * @see org.docbook.ns.docbook.DocbookPackage#getEntryType_Keysym()
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
	 * @see org.docbook.ns.docbook.DocbookPackage#getEntryType_Shortcut()
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
	 * @see org.docbook.ns.docbook.DocbookPackage#getEntryType_Accel()
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
	 * @see org.docbook.ns.docbook.DocbookPackage#getEntryType_Prompt()
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
	 * @see org.docbook.ns.docbook.DocbookPackage#getEntryType_Envar()
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
	 * @see org.docbook.ns.docbook.DocbookPackage#getEntryType_Filename()
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
	 * @see org.docbook.ns.docbook.DocbookPackage#getEntryType_Command()
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
	 * @see org.docbook.ns.docbook.DocbookPackage#getEntryType_Computeroutput()
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
	 * @see org.docbook.ns.docbook.DocbookPackage#getEntryType_Userinput()
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
	 * @see org.docbook.ns.docbook.DocbookPackage#getEntryType_Function()
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
	 * @see org.docbook.ns.docbook.DocbookPackage#getEntryType_Varname()
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
	 * @see org.docbook.ns.docbook.DocbookPackage#getEntryType_Returnvalue()
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
	 * @see org.docbook.ns.docbook.DocbookPackage#getEntryType_Type()
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
	 * @see org.docbook.ns.docbook.DocbookPackage#getEntryType_Classname()
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
	 * @see org.docbook.ns.docbook.DocbookPackage#getEntryType_Exceptionname()
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
	 * @see org.docbook.ns.docbook.DocbookPackage#getEntryType_Interfacename()
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
	 * @see org.docbook.ns.docbook.DocbookPackage#getEntryType_Methodname()
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
	 * @see org.docbook.ns.docbook.DocbookPackage#getEntryType_Modifier()
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
	 * @see org.docbook.ns.docbook.DocbookPackage#getEntryType_Initializer()
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
	 * @see org.docbook.ns.docbook.DocbookPackage#getEntryType_Ooclass()
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
	 * @see org.docbook.ns.docbook.DocbookPackage#getEntryType_Ooexception()
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
	 * @see org.docbook.ns.docbook.DocbookPackage#getEntryType_Oointerface()
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
	 * @see org.docbook.ns.docbook.DocbookPackage#getEntryType_Errorcode()
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
	 * @see org.docbook.ns.docbook.DocbookPackage#getEntryType_Errortext()
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
	 * @see org.docbook.ns.docbook.DocbookPackage#getEntryType_Errorname()
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
	 * @see org.docbook.ns.docbook.DocbookPackage#getEntryType_Errortype()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='errortype' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<ErrortypeType> getErrortype();

	/**
	 * Returns the value of the '<em><b>Itemizedlist</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.ItemizedlistType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Itemizedlist</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getEntryType_Itemizedlist()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='itemizedlist' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<ItemizedlistType> getItemizedlist();

	/**
	 * Returns the value of the '<em><b>Orderedlist</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.OrderedlistType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Orderedlist</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getEntryType_Orderedlist()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='orderedlist' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<OrderedlistType> getOrderedlist();

	/**
	 * Returns the value of the '<em><b>Procedure</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.ProcedureType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Procedure</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getEntryType_Procedure()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='procedure' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<ProcedureType> getProcedure();

	/**
	 * Returns the value of the '<em><b>Simplelist</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.SimplelistType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Simplelist</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getEntryType_Simplelist()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='simplelist' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<SimplelistType> getSimplelist();

	/**
	 * Returns the value of the '<em><b>Variablelist</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.VariablelistType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variablelist</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getEntryType_Variablelist()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='variablelist' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<VariablelistType> getVariablelist();

	/**
	 * Returns the value of the '<em><b>Segmentedlist</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.SegmentedlistType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Segmentedlist</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getEntryType_Segmentedlist()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='segmentedlist' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<SegmentedlistType> getSegmentedlist();

	/**
	 * Returns the value of the '<em><b>Glosslist</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.GlosslistType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Glosslist</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getEntryType_Glosslist()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='glosslist' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<GlosslistType> getGlosslist();

	/**
	 * Returns the value of the '<em><b>Bibliolist</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.BibliolistType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bibliolist</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getEntryType_Bibliolist()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='bibliolist' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<BibliolistType> getBibliolist();

	/**
	 * Returns the value of the '<em><b>Calloutlist</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.CalloutlistType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Calloutlist</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getEntryType_Calloutlist()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='calloutlist' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<CalloutlistType> getCalloutlist();

	/**
	 * Returns the value of the '<em><b>Qandaset</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.QandasetType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qandaset</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getEntryType_Qandaset()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='qandaset' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<QandasetType> getQandaset();

	/**
	 * Returns the value of the '<em><b>Example</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.ExampleType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Example</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getEntryType_Example()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='example' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<ExampleType> getExample();

	/**
	 * Returns the value of the '<em><b>Figure</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.FigureType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Figure</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getEntryType_Figure()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='figure' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<FigureType> getFigure();

	/**
	 * Returns the value of the '<em><b>Table</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.TableType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getEntryType_Table()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='table' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<TableType> getTable();

	/**
	 * Returns the value of the '<em><b>Equation</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.EquationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Equation</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getEntryType_Equation()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='equation' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<EquationType> getEquation();

	/**
	 * Returns the value of the '<em><b>Informalexample</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.InformalexampleType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Informalexample</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getEntryType_Informalexample()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='informalexample' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<InformalexampleType> getInformalexample();

	/**
	 * Returns the value of the '<em><b>Informalfigure</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.InformalfigureType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Informalfigure</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getEntryType_Informalfigure()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='informalfigure' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<InformalfigureType> getInformalfigure();

	/**
	 * Returns the value of the '<em><b>Informaltable</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.InformaltableType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Informaltable</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getEntryType_Informaltable()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='informaltable' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<InformaltableType> getInformaltable();

	/**
	 * Returns the value of the '<em><b>Informalequation</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.InformalequationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Informalequation</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getEntryType_Informalequation()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='informalequation' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<InformalequationType> getInformalequation();

	/**
	 * Returns the value of the '<em><b>Sidebar</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.SidebarType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sidebar</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getEntryType_Sidebar()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='sidebar' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<SidebarType> getSidebar();

	/**
	 * Returns the value of the '<em><b>Blockquote</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.BlockquoteType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Blockquote</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getEntryType_Blockquote()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='blockquote' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<BlockquoteType> getBlockquote();

	/**
	 * Returns the value of the '<em><b>Address</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.AddressType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Address</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getEntryType_Address()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='address' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<AddressType> getAddress();

	/**
	 * Returns the value of the '<em><b>Epigraph</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.EpigraphType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Epigraph</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getEntryType_Epigraph()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='epigraph' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<EpigraphType> getEpigraph();

	/**
	 * Returns the value of the '<em><b>Mediaobject</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.MediaobjectType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mediaobject</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getEntryType_Mediaobject()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='mediaobject' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<MediaobjectType> getMediaobject();

	/**
	 * Returns the value of the '<em><b>Screenshot</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.ScreenshotType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Screenshot</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getEntryType_Screenshot()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='screenshot' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<ScreenshotType> getScreenshot();

	/**
	 * Returns the value of the '<em><b>Task</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.TaskType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Task</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getEntryType_Task()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='task' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<TaskType> getTask();

	/**
	 * Returns the value of the '<em><b>Productionset</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.ProductionsetType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Productionset</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getEntryType_Productionset()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='productionset' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<ProductionsetType> getProductionset();

	/**
	 * Returns the value of the '<em><b>Constraintdef</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.ConstraintdefType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraintdef</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getEntryType_Constraintdef()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='constraintdef' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<ConstraintdefType> getConstraintdef();

	/**
	 * Returns the value of the '<em><b>Msgset</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.MsgsetType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Msgset</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getEntryType_Msgset()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='msgset' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<MsgsetType> getMsgset();

	/**
	 * Returns the value of the '<em><b>Screen</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.ScreenType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Screen</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getEntryType_Screen()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='screen' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<ScreenType> getScreen();

	/**
	 * Returns the value of the '<em><b>Literallayout</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.LiterallayoutType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Literallayout</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getEntryType_Literallayout()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='literallayout' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<LiterallayoutType> getLiterallayout();

	/**
	 * Returns the value of the '<em><b>Programlistingco</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.ProgramlistingcoType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Programlistingco</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getEntryType_Programlistingco()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='programlistingco' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<ProgramlistingcoType> getProgramlistingco();

	/**
	 * Returns the value of the '<em><b>Screenco</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.ScreencoType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Screenco</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getEntryType_Screenco()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='screenco' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<ScreencoType> getScreenco();

	/**
	 * Returns the value of the '<em><b>Programlisting</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.ProgramlistingType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Programlisting</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getEntryType_Programlisting()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='programlisting' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<ProgramlistingType> getProgramlisting();

	/**
	 * Returns the value of the '<em><b>Synopsis</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.SynopsisType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Synopsis</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getEntryType_Synopsis()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='synopsis' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<SynopsisType> getSynopsis();

	/**
	 * Returns the value of the '<em><b>Bridgehead</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.BridgeheadType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bridgehead</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getEntryType_Bridgehead()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='bridgehead' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<BridgeheadType> getBridgehead();

	/**
	 * Returns the value of the '<em><b>Revhistory</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.RevhistoryType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Revhistory</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getEntryType_Revhistory()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='revhistory' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<RevhistoryType> getRevhistory();

	/**
	 * Returns the value of the '<em><b>Funcsynopsis</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.FuncsynopsisType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Funcsynopsis</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getEntryType_Funcsynopsis()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='funcsynopsis' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<FuncsynopsisType> getFuncsynopsis();

	/**
	 * Returns the value of the '<em><b>Classsynopsis</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.ClasssynopsisType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classsynopsis</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getEntryType_Classsynopsis()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='classsynopsis' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<ClasssynopsisType> getClasssynopsis();

	/**
	 * Returns the value of the '<em><b>Methodsynopsis</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.MethodsynopsisType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Methodsynopsis</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getEntryType_Methodsynopsis()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='methodsynopsis' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<MethodsynopsisType> getMethodsynopsis();

	/**
	 * Returns the value of the '<em><b>Constructorsynopsis</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.ConstructorsynopsisType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constructorsynopsis</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getEntryType_Constructorsynopsis()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='constructorsynopsis' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<ConstructorsynopsisType> getConstructorsynopsis();

	/**
	 * Returns the value of the '<em><b>Destructorsynopsis</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.DestructorsynopsisType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destructorsynopsis</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getEntryType_Destructorsynopsis()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='destructorsynopsis' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<DestructorsynopsisType> getDestructorsynopsis();

	/**
	 * Returns the value of the '<em><b>Fieldsynopsis</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.FieldsynopsisType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fieldsynopsis</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getEntryType_Fieldsynopsis()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='fieldsynopsis' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<FieldsynopsisType> getFieldsynopsis();

	/**
	 * Returns the value of the '<em><b>Cmdsynopsis</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.CmdsynopsisType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cmdsynopsis</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getEntryType_Cmdsynopsis()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='cmdsynopsis' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<CmdsynopsisType> getCmdsynopsis();

	/**
	 * Returns the value of the '<em><b>Caution</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.CautionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Caution</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getEntryType_Caution()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='caution' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<CautionType> getCaution();

	/**
	 * Returns the value of the '<em><b>Important</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.ImportantType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Important</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getEntryType_Important()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='important' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<ImportantType> getImportant();

	/**
	 * Returns the value of the '<em><b>Note</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.NoteType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Note</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getEntryType_Note()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='note' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<NoteType> getNote();

	/**
	 * Returns the value of the '<em><b>Tip</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.TipType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tip</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getEntryType_Tip()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='tip' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<TipType> getTip();

	/**
	 * Returns the value of the '<em><b>Warning</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.WarningType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Warning</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getEntryType_Warning()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='warning' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<WarningType> getWarning();

	/**
	 * Returns the value of the '<em><b>Para</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.ParaType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Para</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getEntryType_Para()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='para' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<ParaType> getPara();

	/**
	 * Returns the value of the '<em><b>Formalpara</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.FormalparaType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Formalpara</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getEntryType_Formalpara()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='formalpara' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<FormalparaType> getFormalpara();

	/**
	 * Returns the value of the '<em><b>Simpara</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.SimparaType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Simpara</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getEntryType_Simpara()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='simpara' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<SimparaType> getSimpara();

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
	 * @see org.docbook.ns.docbook.DocbookPackage#getEntryType_Actuate()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='actuate' namespace='http://www.w3.org/1999/xlink'"
	 * @generated
	 */
	ActuateType getActuate();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.EntryType#getActuate <em>Actuate</em>}' attribute.
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
	 * Unsets the value of the '{@link org.docbook.ns.docbook.EntryType#getActuate <em>Actuate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetActuate()
	 * @see #getActuate()
	 * @see #setActuate(ActuateType)
	 * @generated
	 */
	void unsetActuate();

	/**
	 * Returns whether the value of the '{@link org.docbook.ns.docbook.EntryType#getActuate <em>Actuate</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Align</b></em>' attribute.
	 * The literals are from the enumeration {@link org.docbook.ns.docbook.AlignType11}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Align</em>' attribute.
	 * @see org.docbook.ns.docbook.AlignType11
	 * @see #isSetAlign()
	 * @see #unsetAlign()
	 * @see #setAlign(AlignType11)
	 * @see org.docbook.ns.docbook.DocbookPackage#getEntryType_Align()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='align'"
	 * @generated
	 */
	AlignType11 getAlign();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.EntryType#getAlign <em>Align</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Align</em>' attribute.
	 * @see org.docbook.ns.docbook.AlignType11
	 * @see #isSetAlign()
	 * @see #unsetAlign()
	 * @see #getAlign()
	 * @generated
	 */
	void setAlign(AlignType11 value);

	/**
	 * Unsets the value of the '{@link org.docbook.ns.docbook.EntryType#getAlign <em>Align</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAlign()
	 * @see #getAlign()
	 * @see #setAlign(AlignType11)
	 * @generated
	 */
	void unsetAlign();

	/**
	 * Returns whether the value of the '{@link org.docbook.ns.docbook.EntryType#getAlign <em>Align</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Align</em>' attribute is set.
	 * @see #unsetAlign()
	 * @see #getAlign()
	 * @see #setAlign(AlignType11)
	 * @generated
	 */
	boolean isSetAlign();

	/**
	 * Returns the value of the '<em><b>Annotations</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotations</em>' attribute.
	 * @see #setAnnotations(Object)
	 * @see org.docbook.ns.docbook.DocbookPackage#getEntryType_Annotations()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='annotations'"
	 * @generated
	 */
	Object getAnnotations();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.EntryType#getAnnotations <em>Annotations</em>}' attribute.
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
	 * @see org.docbook.ns.docbook.DocbookPackage#getEntryType_Arch()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='arch'"
	 * @generated
	 */
	Object getArch();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.EntryType#getArch <em>Arch</em>}' attribute.
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
	 * @see org.docbook.ns.docbook.DocbookPackage#getEntryType_Arcrole()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='arcrole' namespace='http://www.w3.org/1999/xlink'"
	 * @generated
	 */
	Object getArcrole();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.EntryType#getArcrole <em>Arcrole</em>}' attribute.
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
	 * @see org.docbook.ns.docbook.DocbookPackage#getEntryType_Audience()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='audience'"
	 * @generated
	 */
	Object getAudience();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.EntryType#getAudience <em>Audience</em>}' attribute.
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
	 * @see org.docbook.ns.docbook.DocbookPackage#getEntryType_Base()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='base' namespace='http://www.w3.org/XML/1998/namespace'"
	 * @generated
	 */
	Object getBase();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.EntryType#getBase <em>Base</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base</em>' attribute.
	 * @see #getBase()
	 * @generated
	 */
	void setBase(Object value);

	/**
	 * Returns the value of the '<em><b>Char</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Char</em>' attribute.
	 * @see #setChar(Object)
	 * @see org.docbook.ns.docbook.DocbookPackage#getEntryType_Char()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='char'"
	 * @generated
	 */
	Object getChar();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.EntryType#getChar <em>Char</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Char</em>' attribute.
	 * @see #getChar()
	 * @generated
	 */
	void setChar(Object value);

	/**
	 * Returns the value of the '<em><b>Charoff</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Charoff</em>' attribute.
	 * @see #setCharoff(Object)
	 * @see org.docbook.ns.docbook.DocbookPackage#getEntryType_Charoff()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='charoff'"
	 * @generated
	 */
	Object getCharoff();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.EntryType#getCharoff <em>Charoff</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Charoff</em>' attribute.
	 * @see #getCharoff()
	 * @generated
	 */
	void setCharoff(Object value);

	/**
	 * Returns the value of the '<em><b>Colname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Colname</em>' attribute.
	 * @see #setColname(Object)
	 * @see org.docbook.ns.docbook.DocbookPackage#getEntryType_Colname()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='colname'"
	 * @generated
	 */
	Object getColname();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.EntryType#getColname <em>Colname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Colname</em>' attribute.
	 * @see #getColname()
	 * @generated
	 */
	void setColname(Object value);

	/**
	 * Returns the value of the '<em><b>Colsep</b></em>' attribute.
	 * The literals are from the enumeration {@link org.docbook.ns.docbook.ColsepType5}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Colsep</em>' attribute.
	 * @see org.docbook.ns.docbook.ColsepType5
	 * @see #isSetColsep()
	 * @see #unsetColsep()
	 * @see #setColsep(ColsepType5)
	 * @see org.docbook.ns.docbook.DocbookPackage#getEntryType_Colsep()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='colsep'"
	 * @generated
	 */
	ColsepType5 getColsep();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.EntryType#getColsep <em>Colsep</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Colsep</em>' attribute.
	 * @see org.docbook.ns.docbook.ColsepType5
	 * @see #isSetColsep()
	 * @see #unsetColsep()
	 * @see #getColsep()
	 * @generated
	 */
	void setColsep(ColsepType5 value);

	/**
	 * Unsets the value of the '{@link org.docbook.ns.docbook.EntryType#getColsep <em>Colsep</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetColsep()
	 * @see #getColsep()
	 * @see #setColsep(ColsepType5)
	 * @generated
	 */
	void unsetColsep();

	/**
	 * Returns whether the value of the '{@link org.docbook.ns.docbook.EntryType#getColsep <em>Colsep</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Colsep</em>' attribute is set.
	 * @see #unsetColsep()
	 * @see #getColsep()
	 * @see #setColsep(ColsepType5)
	 * @generated
	 */
	boolean isSetColsep();

	/**
	 * Returns the value of the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' attribute.
	 * @see #setCondition(Object)
	 * @see org.docbook.ns.docbook.DocbookPackage#getEntryType_Condition()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='condition'"
	 * @generated
	 */
	Object getCondition();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.EntryType#getCondition <em>Condition</em>}' attribute.
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
	 * @see org.docbook.ns.docbook.DocbookPackage#getEntryType_Conformance()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='conformance'"
	 * @generated
	 */
	Object getConformance();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.EntryType#getConformance <em>Conformance</em>}' attribute.
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
	 * @see org.docbook.ns.docbook.DocbookPackage#getEntryType_Dir()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='dir'"
	 * @generated
	 */
	DirType getDir();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.EntryType#getDir <em>Dir</em>}' attribute.
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
	 * Unsets the value of the '{@link org.docbook.ns.docbook.EntryType#getDir <em>Dir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDir()
	 * @see #getDir()
	 * @see #setDir(DirType)
	 * @generated
	 */
	void unsetDir();

	/**
	 * Returns whether the value of the '{@link org.docbook.ns.docbook.EntryType#getDir <em>Dir</em>}' attribute is set.
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
	 * @see org.docbook.ns.docbook.DocbookPackage#getEntryType_Href()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='href' namespace='http://www.w3.org/1999/xlink'"
	 * @generated
	 */
	Object getHref();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.EntryType#getHref <em>Href</em>}' attribute.
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
	 * @see org.docbook.ns.docbook.DocbookPackage#getEntryType_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='id' namespace='http://www.w3.org/XML/1998/namespace'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.EntryType#getId <em>Id</em>}' attribute.
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
	 * @see org.docbook.ns.docbook.DocbookPackage#getEntryType_Lang()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='lang' namespace='http://www.w3.org/XML/1998/namespace'"
	 * @generated
	 */
	Object getLang();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.EntryType#getLang <em>Lang</em>}' attribute.
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
	 * @see org.docbook.ns.docbook.DocbookPackage#getEntryType_Linkend()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.IDREF"
	 *        extendedMetaData="kind='attribute' name='linkend'"
	 * @generated
	 */
	String getLinkend();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.EntryType#getLinkend <em>Linkend</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Linkend</em>' attribute.
	 * @see #getLinkend()
	 * @generated
	 */
	void setLinkend(String value);

	/**
	 * Returns the value of the '<em><b>Morerows</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Morerows</em>' attribute.
	 * @see #setMorerows(String)
	 * @see org.docbook.ns.docbook.DocbookPackage#getEntryType_Morerows()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NMTOKEN"
	 *        extendedMetaData="kind='attribute' name='morerows'"
	 * @generated
	 */
	String getMorerows();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.EntryType#getMorerows <em>Morerows</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Morerows</em>' attribute.
	 * @see #getMorerows()
	 * @generated
	 */
	void setMorerows(String value);

	/**
	 * Returns the value of the '<em><b>Nameend</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nameend</em>' attribute.
	 * @see #setNameend(Object)
	 * @see org.docbook.ns.docbook.DocbookPackage#getEntryType_Nameend()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='nameend'"
	 * @generated
	 */
	Object getNameend();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.EntryType#getNameend <em>Nameend</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nameend</em>' attribute.
	 * @see #getNameend()
	 * @generated
	 */
	void setNameend(Object value);

	/**
	 * Returns the value of the '<em><b>Namest</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Namest</em>' attribute.
	 * @see #setNamest(Object)
	 * @see org.docbook.ns.docbook.DocbookPackage#getEntryType_Namest()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='namest'"
	 * @generated
	 */
	Object getNamest();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.EntryType#getNamest <em>Namest</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Namest</em>' attribute.
	 * @see #getNamest()
	 * @generated
	 */
	void setNamest(Object value);

	/**
	 * Returns the value of the '<em><b>Os</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Os</em>' attribute.
	 * @see #setOs(Object)
	 * @see org.docbook.ns.docbook.DocbookPackage#getEntryType_Os()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='os'"
	 * @generated
	 */
	Object getOs();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.EntryType#getOs <em>Os</em>}' attribute.
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
	 * @see org.docbook.ns.docbook.DocbookPackage#getEntryType_Remap()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='remap'"
	 * @generated
	 */
	Object getRemap();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.EntryType#getRemap <em>Remap</em>}' attribute.
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
	 * @see org.docbook.ns.docbook.DocbookPackage#getEntryType_Revision()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='revision'"
	 * @generated
	 */
	Object getRevision();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.EntryType#getRevision <em>Revision</em>}' attribute.
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
	 * @see org.docbook.ns.docbook.DocbookPackage#getEntryType_Revisionflag()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='revisionflag'"
	 * @generated
	 */
	RevisionflagType getRevisionflag();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.EntryType#getRevisionflag <em>Revisionflag</em>}' attribute.
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
	 * Unsets the value of the '{@link org.docbook.ns.docbook.EntryType#getRevisionflag <em>Revisionflag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRevisionflag()
	 * @see #getRevisionflag()
	 * @see #setRevisionflag(RevisionflagType)
	 * @generated
	 */
	void unsetRevisionflag();

	/**
	 * Returns whether the value of the '{@link org.docbook.ns.docbook.EntryType#getRevisionflag <em>Revisionflag</em>}' attribute is set.
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
	 * @see org.docbook.ns.docbook.DocbookPackage#getEntryType_Role()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='role'"
	 * @generated
	 */
	Object getRole();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.EntryType#getRole <em>Role</em>}' attribute.
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
	 * @see org.docbook.ns.docbook.DocbookPackage#getEntryType_Role1()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='role' namespace='http://www.w3.org/1999/xlink'"
	 * @generated
	 */
	Object getRole1();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.EntryType#getRole1 <em>Role1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role1</em>' attribute.
	 * @see #getRole1()
	 * @generated
	 */
	void setRole1(Object value);

	/**
	 * Returns the value of the '<em><b>Rotate</b></em>' attribute.
	 * The literals are from the enumeration {@link org.docbook.ns.docbook.RotateType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rotate</em>' attribute.
	 * @see org.docbook.ns.docbook.RotateType
	 * @see #isSetRotate()
	 * @see #unsetRotate()
	 * @see #setRotate(RotateType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getEntryType_Rotate()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='rotate'"
	 * @generated
	 */
	RotateType getRotate();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.EntryType#getRotate <em>Rotate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rotate</em>' attribute.
	 * @see org.docbook.ns.docbook.RotateType
	 * @see #isSetRotate()
	 * @see #unsetRotate()
	 * @see #getRotate()
	 * @generated
	 */
	void setRotate(RotateType value);

	/**
	 * Unsets the value of the '{@link org.docbook.ns.docbook.EntryType#getRotate <em>Rotate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRotate()
	 * @see #getRotate()
	 * @see #setRotate(RotateType)
	 * @generated
	 */
	void unsetRotate();

	/**
	 * Returns whether the value of the '{@link org.docbook.ns.docbook.EntryType#getRotate <em>Rotate</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Rotate</em>' attribute is set.
	 * @see #unsetRotate()
	 * @see #getRotate()
	 * @see #setRotate(RotateType)
	 * @generated
	 */
	boolean isSetRotate();

	/**
	 * Returns the value of the '<em><b>Rowsep</b></em>' attribute.
	 * The literals are from the enumeration {@link org.docbook.ns.docbook.RowsepType6}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rowsep</em>' attribute.
	 * @see org.docbook.ns.docbook.RowsepType6
	 * @see #isSetRowsep()
	 * @see #unsetRowsep()
	 * @see #setRowsep(RowsepType6)
	 * @see org.docbook.ns.docbook.DocbookPackage#getEntryType_Rowsep()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='rowsep'"
	 * @generated
	 */
	RowsepType6 getRowsep();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.EntryType#getRowsep <em>Rowsep</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rowsep</em>' attribute.
	 * @see org.docbook.ns.docbook.RowsepType6
	 * @see #isSetRowsep()
	 * @see #unsetRowsep()
	 * @see #getRowsep()
	 * @generated
	 */
	void setRowsep(RowsepType6 value);

	/**
	 * Unsets the value of the '{@link org.docbook.ns.docbook.EntryType#getRowsep <em>Rowsep</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRowsep()
	 * @see #getRowsep()
	 * @see #setRowsep(RowsepType6)
	 * @generated
	 */
	void unsetRowsep();

	/**
	 * Returns whether the value of the '{@link org.docbook.ns.docbook.EntryType#getRowsep <em>Rowsep</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Rowsep</em>' attribute is set.
	 * @see #unsetRowsep()
	 * @see #getRowsep()
	 * @see #setRowsep(RowsepType6)
	 * @generated
	 */
	boolean isSetRowsep();

	/**
	 * Returns the value of the '<em><b>Security</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security</em>' attribute.
	 * @see #setSecurity(Object)
	 * @see org.docbook.ns.docbook.DocbookPackage#getEntryType_Security()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='security'"
	 * @generated
	 */
	Object getSecurity();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.EntryType#getSecurity <em>Security</em>}' attribute.
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
	 * @see org.docbook.ns.docbook.DocbookPackage#getEntryType_Show()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='show' namespace='http://www.w3.org/1999/xlink'"
	 * @generated
	 */
	ShowType getShow();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.EntryType#getShow <em>Show</em>}' attribute.
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
	 * Unsets the value of the '{@link org.docbook.ns.docbook.EntryType#getShow <em>Show</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetShow()
	 * @see #getShow()
	 * @see #setShow(ShowType)
	 * @generated
	 */
	void unsetShow();

	/**
	 * Returns whether the value of the '{@link org.docbook.ns.docbook.EntryType#getShow <em>Show</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Spanname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spanname</em>' attribute.
	 * @see #setSpanname(Object)
	 * @see org.docbook.ns.docbook.DocbookPackage#getEntryType_Spanname()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='spanname'"
	 * @generated
	 */
	Object getSpanname();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.EntryType#getSpanname <em>Spanname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Spanname</em>' attribute.
	 * @see #getSpanname()
	 * @generated
	 */
	void setSpanname(Object value);

	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(Object)
	 * @see org.docbook.ns.docbook.DocbookPackage#getEntryType_Title()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='title' namespace='http://www.w3.org/1999/xlink'"
	 * @generated
	 */
	Object getTitle();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.EntryType#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(Object value);

	/**
	 * Returns the value of the '<em><b>Type1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type1</em>' attribute.
	 * @see #setType1(Object)
	 * @see org.docbook.ns.docbook.DocbookPackage#getEntryType_Type1()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='type' namespace='http://www.w3.org/1999/xlink'"
	 * @generated
	 */
	Object getType1();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.EntryType#getType1 <em>Type1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type1</em>' attribute.
	 * @see #getType1()
	 * @generated
	 */
	void setType1(Object value);

	/**
	 * Returns the value of the '<em><b>Userlevel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Userlevel</em>' attribute.
	 * @see #setUserlevel(Object)
	 * @see org.docbook.ns.docbook.DocbookPackage#getEntryType_Userlevel()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='userlevel'"
	 * @generated
	 */
	Object getUserlevel();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.EntryType#getUserlevel <em>Userlevel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Userlevel</em>' attribute.
	 * @see #getUserlevel()
	 * @generated
	 */
	void setUserlevel(Object value);

	/**
	 * Returns the value of the '<em><b>Valign</b></em>' attribute.
	 * The literals are from the enumeration {@link org.docbook.ns.docbook.ValignType10}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valign</em>' attribute.
	 * @see org.docbook.ns.docbook.ValignType10
	 * @see #isSetValign()
	 * @see #unsetValign()
	 * @see #setValign(ValignType10)
	 * @see org.docbook.ns.docbook.DocbookPackage#getEntryType_Valign()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='valign'"
	 * @generated
	 */
	ValignType10 getValign();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.EntryType#getValign <em>Valign</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valign</em>' attribute.
	 * @see org.docbook.ns.docbook.ValignType10
	 * @see #isSetValign()
	 * @see #unsetValign()
	 * @see #getValign()
	 * @generated
	 */
	void setValign(ValignType10 value);

	/**
	 * Unsets the value of the '{@link org.docbook.ns.docbook.EntryType#getValign <em>Valign</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetValign()
	 * @see #getValign()
	 * @see #setValign(ValignType10)
	 * @generated
	 */
	void unsetValign();

	/**
	 * Returns whether the value of the '{@link org.docbook.ns.docbook.EntryType#getValign <em>Valign</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Valign</em>' attribute is set.
	 * @see #unsetValign()
	 * @see #getValign()
	 * @see #setValign(ValignType10)
	 * @generated
	 */
	boolean isSetValign();

	/**
	 * Returns the value of the '<em><b>Vendor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vendor</em>' attribute.
	 * @see #setVendor(Object)
	 * @see org.docbook.ns.docbook.DocbookPackage#getEntryType_Vendor()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='vendor'"
	 * @generated
	 */
	Object getVendor();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.EntryType#getVendor <em>Vendor</em>}' attribute.
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
	 * @see org.docbook.ns.docbook.DocbookPackage#getEntryType_Version()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='version'"
	 * @generated
	 */
	Object getVersion();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.EntryType#getVersion <em>Version</em>}' attribute.
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
	 * @see org.docbook.ns.docbook.DocbookPackage#getEntryType_Wordsize()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='wordsize'"
	 * @generated
	 */
	Object getWordsize();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.EntryType#getWordsize <em>Wordsize</em>}' attribute.
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
	 * @see org.docbook.ns.docbook.DocbookPackage#getEntryType_Xreflabel()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='xreflabel'"
	 * @generated
	 */
	Object getXreflabel();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.EntryType#getXreflabel <em>Xreflabel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xreflabel</em>' attribute.
	 * @see #getXreflabel()
	 * @generated
	 */
	void setXreflabel(Object value);

} // EntryType
