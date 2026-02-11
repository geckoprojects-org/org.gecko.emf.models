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

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getAbbrev <em>Abbrev</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getAbstract <em>Abstract</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getAccel <em>Accel</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getAcknowledgements <em>Acknowledgements</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getAcronym <em>Acronym</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getAddress <em>Address</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getAffiliation <em>Affiliation</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getAlt <em>Alt</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getAnchor <em>Anchor</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getAnswer <em>Answer</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getAppendix <em>Appendix</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getApplication <em>Application</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getArc <em>Arc</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getArea <em>Area</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getAreaset <em>Areaset</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getAreaspec <em>Areaspec</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getArg <em>Arg</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getArticle <em>Article</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getArtpagenums <em>Artpagenums</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getAttribution <em>Attribution</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getAudiodata <em>Audiodata</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getAudioobject <em>Audioobject</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getAuthor <em>Author</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getAuthorgroup <em>Authorgroup</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getAuthorinitials <em>Authorinitials</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getBibliocoverage <em>Bibliocoverage</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getBibliodiv <em>Bibliodiv</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getBiblioentry <em>Biblioentry</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getBibliography <em>Bibliography</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getBiblioid <em>Biblioid</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getBibliolist <em>Bibliolist</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getBibliomisc <em>Bibliomisc</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getBibliomixed <em>Bibliomixed</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getBibliomset <em>Bibliomset</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getBiblioref <em>Biblioref</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getBibliorelation <em>Bibliorelation</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getBiblioset <em>Biblioset</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getBibliosource <em>Bibliosource</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getBlockquote <em>Blockquote</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getBook <em>Book</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getBridgehead <em>Bridgehead</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getCallout <em>Callout</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getCalloutlist <em>Calloutlist</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getCaption <em>Caption</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getCaution <em>Caution</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getChapter <em>Chapter</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getCitation <em>Citation</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getCitebiblioid <em>Citebiblioid</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getCiterefentry <em>Citerefentry</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getCitetitle <em>Citetitle</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getCity <em>City</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getClassname <em>Classname</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getClasssynopsis <em>Classsynopsis</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getClasssynopsisinfo <em>Classsynopsisinfo</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getCmdsynopsis <em>Cmdsynopsis</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getCo <em>Co</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getCode <em>Code</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getCol <em>Col</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getColgroup <em>Colgroup</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getCollab <em>Collab</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getColophon <em>Colophon</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getColspec <em>Colspec</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getCommand <em>Command</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getComputeroutput <em>Computeroutput</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getConfdates <em>Confdates</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getConfgroup <em>Confgroup</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getConfnum <em>Confnum</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getConfsponsor <em>Confsponsor</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getConftitle <em>Conftitle</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getConstant <em>Constant</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getConstraint <em>Constraint</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getConstraintdef <em>Constraintdef</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getConstructorsynopsis <em>Constructorsynopsis</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getContractnum <em>Contractnum</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getContractsponsor <em>Contractsponsor</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getContrib <em>Contrib</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getCopyright <em>Copyright</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getCoref <em>Coref</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getCountry <em>Country</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getCover <em>Cover</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getDatabase <em>Database</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getDate <em>Date</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getDedication <em>Dedication</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getDestructorsynopsis <em>Destructorsynopsis</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getEdition <em>Edition</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getEditor <em>Editor</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getEmail <em>Email</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getEmphasis <em>Emphasis</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getEntry <em>Entry</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getEntrytbl <em>Entrytbl</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getEnvar <em>Envar</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getEpigraph <em>Epigraph</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getEquation <em>Equation</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getErrorcode <em>Errorcode</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getErrorname <em>Errorname</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getErrortext <em>Errortext</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getErrortype <em>Errortype</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getExample <em>Example</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getExceptionname <em>Exceptionname</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getExtendedlink <em>Extendedlink</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getFax <em>Fax</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getFieldsynopsis <em>Fieldsynopsis</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getFigure <em>Figure</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getFilename <em>Filename</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getFirstname <em>Firstname</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getFirstterm <em>Firstterm</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getFootnote <em>Footnote</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getFootnoteref <em>Footnoteref</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getForeignphrase <em>Foreignphrase</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getFormalpara <em>Formalpara</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getFuncdef <em>Funcdef</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getFuncparams <em>Funcparams</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getFuncprototype <em>Funcprototype</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getFuncsynopsis <em>Funcsynopsis</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getFuncsynopsisinfo <em>Funcsynopsisinfo</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getFunction <em>Function</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getGlossary <em>Glossary</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getGlossdef <em>Glossdef</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getGlossdiv <em>Glossdiv</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getGlossentry <em>Glossentry</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getGlosslist <em>Glosslist</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getGlosssee <em>Glosssee</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getGlossseealso <em>Glossseealso</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getGlossterm <em>Glossterm</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getGroup <em>Group</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getGuibutton <em>Guibutton</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getGuiicon <em>Guiicon</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getGuilabel <em>Guilabel</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getGuimenu <em>Guimenu</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getGuimenuitem <em>Guimenuitem</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getGuisubmenu <em>Guisubmenu</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getHardware <em>Hardware</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getHolder <em>Holder</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getHonorific <em>Honorific</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getImagedata <em>Imagedata</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getImageobject <em>Imageobject</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getImageobjectco <em>Imageobjectco</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getImportant <em>Important</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getIndex <em>Index</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getIndexdiv <em>Indexdiv</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getIndexentry <em>Indexentry</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getIndexterm <em>Indexterm</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getInfo <em>Info</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getInformalequation <em>Informalequation</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getInformalexample <em>Informalexample</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getInformalfigure <em>Informalfigure</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getInformaltable <em>Informaltable</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getInitializer <em>Initializer</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getInlineequation <em>Inlineequation</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getInlinemediaobject <em>Inlinemediaobject</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getInterfacename <em>Interfacename</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getIssuenum <em>Issuenum</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getItemizedlist <em>Itemizedlist</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getItermset <em>Itermset</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getJobtitle <em>Jobtitle</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getKeycap <em>Keycap</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getKeycode <em>Keycode</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getKeycombo <em>Keycombo</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getKeysym <em>Keysym</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getKeyword <em>Keyword</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getKeywordset <em>Keywordset</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getLabel <em>Label</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getLegalnotice <em>Legalnotice</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getLhs <em>Lhs</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getLineage <em>Lineage</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getLineannotation <em>Lineannotation</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getLink <em>Link</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getListitem <em>Listitem</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getLiteral <em>Literal</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getLiterallayout <em>Literallayout</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getLocator <em>Locator</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getManvolnum <em>Manvolnum</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getMarkup <em>Markup</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getMathphrase <em>Mathphrase</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getMediaobject <em>Mediaobject</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getMember <em>Member</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getMenuchoice <em>Menuchoice</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getMethodname <em>Methodname</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getMethodparam <em>Methodparam</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getMethodsynopsis <em>Methodsynopsis</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getModifier <em>Modifier</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getMousebutton <em>Mousebutton</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getMsg <em>Msg</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getMsgaud <em>Msgaud</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getMsgentry <em>Msgentry</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getMsgexplan <em>Msgexplan</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getMsginfo <em>Msginfo</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getMsglevel <em>Msglevel</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getMsgmain <em>Msgmain</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getMsgorig <em>Msgorig</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getMsgrel <em>Msgrel</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getMsgset <em>Msgset</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getMsgsub <em>Msgsub</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getMsgtext <em>Msgtext</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getNonterminal <em>Nonterminal</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getNote <em>Note</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getOlink <em>Olink</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getOoclass <em>Ooclass</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getOoexception <em>Ooexception</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getOointerface <em>Oointerface</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getOption <em>Option</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getOptional <em>Optional</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getOrderedlist <em>Orderedlist</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getOrg <em>Org</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getOrgdiv <em>Orgdiv</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getOrgname <em>Orgname</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getOtheraddr <em>Otheraddr</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getOthercredit <em>Othercredit</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getOthername <em>Othername</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getPackage <em>Package</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getPagenums <em>Pagenums</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getPara <em>Para</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getParamdef <em>Paramdef</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getParameter <em>Parameter</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getPart <em>Part</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getPartintro <em>Partintro</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getPerson <em>Person</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getPersonblurb <em>Personblurb</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getPersonname <em>Personname</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getPhone <em>Phone</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getPhrase <em>Phrase</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getPob <em>Pob</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getPostcode <em>Postcode</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getPreface <em>Preface</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getPrimary <em>Primary</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getPrimaryie <em>Primaryie</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getPrinthistory <em>Printhistory</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getProcedure <em>Procedure</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getProduction <em>Production</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getProductionrecap <em>Productionrecap</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getProductionset <em>Productionset</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getProductname <em>Productname</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getProductnumber <em>Productnumber</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getProgramlisting <em>Programlisting</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getProgramlistingco <em>Programlistingco</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getPrompt <em>Prompt</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getProperty <em>Property</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getPubdate <em>Pubdate</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getPublisher <em>Publisher</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getPublishername <em>Publishername</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getQandadiv <em>Qandadiv</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getQandaentry <em>Qandaentry</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getQandaset <em>Qandaset</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getQuestion <em>Question</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getQuote <em>Quote</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getRefclass <em>Refclass</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getRefdescriptor <em>Refdescriptor</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getRefentry <em>Refentry</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getRefentrytitle <em>Refentrytitle</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getReference <em>Reference</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getRefmeta <em>Refmeta</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getRefmiscinfo <em>Refmiscinfo</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getRefname <em>Refname</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getRefnamediv <em>Refnamediv</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getRefpurpose <em>Refpurpose</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getRefsect1 <em>Refsect1</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getRefsect2 <em>Refsect2</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getRefsect3 <em>Refsect3</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getRefsection <em>Refsection</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getRefsynopsisdiv <em>Refsynopsisdiv</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getReleaseinfo <em>Releaseinfo</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getRemark <em>Remark</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getReplaceable <em>Replaceable</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getReturnvalue <em>Returnvalue</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getRevdescription <em>Revdescription</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getRevhistory <em>Revhistory</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getRevision <em>Revision</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getRevnumber <em>Revnumber</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getRevremark <em>Revremark</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getRhs <em>Rhs</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getRow <em>Row</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getSbr <em>Sbr</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getScreen <em>Screen</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getScreenco <em>Screenco</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getScreenshot <em>Screenshot</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getSecondary <em>Secondary</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getSecondaryie <em>Secondaryie</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getSect1 <em>Sect1</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getSect2 <em>Sect2</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getSect3 <em>Sect3</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getSect4 <em>Sect4</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getSect5 <em>Sect5</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getSection <em>Section</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getSee <em>See</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getSeealso <em>Seealso</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getSeealsoie <em>Seealsoie</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getSeeie <em>Seeie</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getSeg <em>Seg</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getSeglistitem <em>Seglistitem</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getSegmentedlist <em>Segmentedlist</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getSegtitle <em>Segtitle</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getSeriesvolnums <em>Seriesvolnums</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getSet <em>Set</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getSetindex <em>Setindex</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getShortaffil <em>Shortaffil</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getShortcut <em>Shortcut</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getSidebar <em>Sidebar</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getSimpara <em>Simpara</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getSimplelist <em>Simplelist</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getSimplemsgentry <em>Simplemsgentry</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getSimplesect <em>Simplesect</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getSpanspec <em>Spanspec</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getState <em>State</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getStep <em>Step</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getStepalternatives <em>Stepalternatives</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getStreet <em>Street</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getSubjectset <em>Subjectset</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getSubjectterm <em>Subjectterm</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getSubscript <em>Subscript</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getSubsteps <em>Substeps</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getSubtitle <em>Subtitle</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getSuperscript <em>Superscript</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getSurname <em>Surname</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getSymbol <em>Symbol</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getSynopfragment <em>Synopfragment</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getSynopfragmentref <em>Synopfragmentref</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getSynopsis <em>Synopsis</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getSystemitem <em>Systemitem</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getTable <em>Table</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getTag <em>Tag</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getTask <em>Task</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getTaskprerequisites <em>Taskprerequisites</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getTaskrelated <em>Taskrelated</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getTasksummary <em>Tasksummary</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getTbody <em>Tbody</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getTd <em>Td</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getTerm <em>Term</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getTermdef <em>Termdef</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getTertiary <em>Tertiary</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getTertiaryie <em>Tertiaryie</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getTextdata <em>Textdata</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getTextobject <em>Textobject</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getTfoot <em>Tfoot</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getTgroup <em>Tgroup</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getTh <em>Th</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getThead <em>Thead</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getTip <em>Tip</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getTitle <em>Title</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getTitleabbrev <em>Titleabbrev</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getToc <em>Toc</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getTocdiv <em>Tocdiv</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getTocentry <em>Tocentry</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getToken <em>Token</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getTr <em>Tr</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getTrademark <em>Trademark</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getType <em>Type</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getUri <em>Uri</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getUserinput <em>Userinput</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getVarargs <em>Varargs</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getVariablelist <em>Variablelist</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getVarlistentry <em>Varlistentry</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getVarname <em>Varname</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getVideodata <em>Videodata</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getVideoobject <em>Videoobject</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getVoid <em>Void</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getVolumenum <em>Volumenum</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getWarning <em>Warning</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getWordasword <em>Wordasword</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getXref <em>Xref</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.DocumentRoot#getYear <em>Year</em>}</li>
 * </ul>
 *
 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot()
 * @model extendedMetaData="name='' kind='mixed'"
 * @generated
 */
@ProviderType
public interface DocumentRoot extends EObject {
	/**
	 * Returns the value of the '<em><b>Mixed</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mixed</em>' attribute list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Mixed()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' name=':mixed'"
	 * @generated
	 */
	FeatureMap getMixed();

	/**
	 * Returns the value of the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XMLNS Prefix Map</em>' map.
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_XMLNSPrefixMap()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry&lt;org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString&gt;" transient="true"
	 *        extendedMetaData="kind='attribute' name='xmlns:prefix'"
	 * @generated
	 */
	EMap<String, String> getXMLNSPrefixMap();

	/**
	 * Returns the value of the '<em><b>XSI Schema Location</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XSI Schema Location</em>' map.
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_XSISchemaLocation()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry&lt;org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString&gt;" transient="true"
	 *        extendedMetaData="kind='attribute' name='xsi:schemaLocation'"
	 * @generated
	 */
	EMap<String, String> getXSISchemaLocation();

	/**
	 * Returns the value of the '<em><b>Abbrev</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abbrev</em>' containment reference.
	 * @see #setAbbrev(AbbrevType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Abbrev()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='abbrev' namespace='##targetNamespace'"
	 * @generated
	 */
	AbbrevType getAbbrev();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getAbbrev <em>Abbrev</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abbrev</em>' containment reference.
	 * @see #getAbbrev()
	 * @generated
	 */
	void setAbbrev(AbbrevType value);

	/**
	 * Returns the value of the '<em><b>Abstract</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract</em>' containment reference.
	 * @see #setAbstract(AbstractType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Abstract()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='abstract' namespace='##targetNamespace'"
	 * @generated
	 */
	AbstractType getAbstract();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getAbstract <em>Abstract</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abstract</em>' containment reference.
	 * @see #getAbstract()
	 * @generated
	 */
	void setAbstract(AbstractType value);

	/**
	 * Returns the value of the '<em><b>Accel</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accel</em>' containment reference.
	 * @see #setAccel(AccelType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Accel()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='accel' namespace='##targetNamespace'"
	 * @generated
	 */
	AccelType getAccel();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getAccel <em>Accel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Accel</em>' containment reference.
	 * @see #getAccel()
	 * @generated
	 */
	void setAccel(AccelType value);

	/**
	 * Returns the value of the '<em><b>Acknowledgements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Acknowledgements</em>' containment reference.
	 * @see #setAcknowledgements(AcknowledgementsType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Acknowledgements()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='acknowledgements' namespace='##targetNamespace'"
	 * @generated
	 */
	AcknowledgementsType getAcknowledgements();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getAcknowledgements <em>Acknowledgements</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Acknowledgements</em>' containment reference.
	 * @see #getAcknowledgements()
	 * @generated
	 */
	void setAcknowledgements(AcknowledgementsType value);

	/**
	 * Returns the value of the '<em><b>Acronym</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Acronym</em>' containment reference.
	 * @see #setAcronym(AcronymType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Acronym()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='acronym' namespace='##targetNamespace'"
	 * @generated
	 */
	AcronymType getAcronym();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getAcronym <em>Acronym</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Acronym</em>' containment reference.
	 * @see #getAcronym()
	 * @generated
	 */
	void setAcronym(AcronymType value);

	/**
	 * Returns the value of the '<em><b>Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Address</em>' containment reference.
	 * @see #setAddress(AddressType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Address()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='address' namespace='##targetNamespace'"
	 * @generated
	 */
	AddressType getAddress();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getAddress <em>Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address</em>' containment reference.
	 * @see #getAddress()
	 * @generated
	 */
	void setAddress(AddressType value);

	/**
	 * Returns the value of the '<em><b>Affiliation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Affiliation</em>' containment reference.
	 * @see #setAffiliation(AffiliationType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Affiliation()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='affiliation' namespace='##targetNamespace'"
	 * @generated
	 */
	AffiliationType getAffiliation();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getAffiliation <em>Affiliation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Affiliation</em>' containment reference.
	 * @see #getAffiliation()
	 * @generated
	 */
	void setAffiliation(AffiliationType value);

	/**
	 * Returns the value of the '<em><b>Alt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alt</em>' containment reference.
	 * @see #setAlt(AltType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Alt()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='alt' namespace='##targetNamespace'"
	 * @generated
	 */
	AltType getAlt();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getAlt <em>Alt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alt</em>' containment reference.
	 * @see #getAlt()
	 * @generated
	 */
	void setAlt(AltType value);

	/**
	 * Returns the value of the '<em><b>Anchor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Anchor</em>' containment reference.
	 * @see #setAnchor(AnchorType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Anchor()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='anchor' namespace='##targetNamespace'"
	 * @generated
	 */
	AnchorType getAnchor();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getAnchor <em>Anchor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Anchor</em>' containment reference.
	 * @see #getAnchor()
	 * @generated
	 */
	void setAnchor(AnchorType value);

	/**
	 * Returns the value of the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotation</em>' containment reference.
	 * @see #setAnnotation(AnnotationType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Annotation()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='annotation' namespace='##targetNamespace'"
	 * @generated
	 */
	AnnotationType getAnnotation();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getAnnotation <em>Annotation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annotation</em>' containment reference.
	 * @see #getAnnotation()
	 * @generated
	 */
	void setAnnotation(AnnotationType value);

	/**
	 * Returns the value of the '<em><b>Answer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Answer</em>' containment reference.
	 * @see #setAnswer(AnswerType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Answer()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='answer' namespace='##targetNamespace'"
	 * @generated
	 */
	AnswerType getAnswer();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getAnswer <em>Answer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Answer</em>' containment reference.
	 * @see #getAnswer()
	 * @generated
	 */
	void setAnswer(AnswerType value);

	/**
	 * Returns the value of the '<em><b>Appendix</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Appendix</em>' containment reference.
	 * @see #setAppendix(AppendixType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Appendix()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='appendix' namespace='##targetNamespace'"
	 * @generated
	 */
	AppendixType getAppendix();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getAppendix <em>Appendix</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Appendix</em>' containment reference.
	 * @see #getAppendix()
	 * @generated
	 */
	void setAppendix(AppendixType value);

	/**
	 * Returns the value of the '<em><b>Application</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Application</em>' containment reference.
	 * @see #setApplication(ApplicationType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Application()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='application' namespace='##targetNamespace'"
	 * @generated
	 */
	ApplicationType getApplication();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getApplication <em>Application</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Application</em>' containment reference.
	 * @see #getApplication()
	 * @generated
	 */
	void setApplication(ApplicationType value);

	/**
	 * Returns the value of the '<em><b>Arc</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arc</em>' containment reference.
	 * @see #setArc(ArcType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Arc()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='arc' namespace='##targetNamespace'"
	 * @generated
	 */
	ArcType getArc();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getArc <em>Arc</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Arc</em>' containment reference.
	 * @see #getArc()
	 * @generated
	 */
	void setArc(ArcType value);

	/**
	 * Returns the value of the '<em><b>Area</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Area</em>' containment reference.
	 * @see #setArea(AreaType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Area()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='area' namespace='##targetNamespace'"
	 * @generated
	 */
	AreaType getArea();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getArea <em>Area</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Area</em>' containment reference.
	 * @see #getArea()
	 * @generated
	 */
	void setArea(AreaType value);

	/**
	 * Returns the value of the '<em><b>Areaset</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Areaset</em>' containment reference.
	 * @see #setAreaset(AreasetType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Areaset()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='areaset' namespace='##targetNamespace'"
	 * @generated
	 */
	AreasetType getAreaset();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getAreaset <em>Areaset</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Areaset</em>' containment reference.
	 * @see #getAreaset()
	 * @generated
	 */
	void setAreaset(AreasetType value);

	/**
	 * Returns the value of the '<em><b>Areaspec</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Areaspec</em>' containment reference.
	 * @see #setAreaspec(AreaspecType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Areaspec()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='areaspec' namespace='##targetNamespace'"
	 * @generated
	 */
	AreaspecType getAreaspec();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getAreaspec <em>Areaspec</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Areaspec</em>' containment reference.
	 * @see #getAreaspec()
	 * @generated
	 */
	void setAreaspec(AreaspecType value);

	/**
	 * Returns the value of the '<em><b>Arg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arg</em>' containment reference.
	 * @see #setArg(ArgType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Arg()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='arg' namespace='##targetNamespace'"
	 * @generated
	 */
	ArgType getArg();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getArg <em>Arg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Arg</em>' containment reference.
	 * @see #getArg()
	 * @generated
	 */
	void setArg(ArgType value);

	/**
	 * Returns the value of the '<em><b>Article</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Article</em>' containment reference.
	 * @see #setArticle(ArticleType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Article()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='article' namespace='##targetNamespace'"
	 * @generated
	 */
	ArticleType getArticle();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getArticle <em>Article</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Article</em>' containment reference.
	 * @see #getArticle()
	 * @generated
	 */
	void setArticle(ArticleType value);

	/**
	 * Returns the value of the '<em><b>Artpagenums</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Artpagenums</em>' containment reference.
	 * @see #setArtpagenums(ArtpagenumsType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Artpagenums()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='artpagenums' namespace='##targetNamespace'"
	 * @generated
	 */
	ArtpagenumsType getArtpagenums();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getArtpagenums <em>Artpagenums</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Artpagenums</em>' containment reference.
	 * @see #getArtpagenums()
	 * @generated
	 */
	void setArtpagenums(ArtpagenumsType value);

	/**
	 * Returns the value of the '<em><b>Attribution</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribution</em>' containment reference.
	 * @see #setAttribution(AttributionType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Attribution()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='attribution' namespace='##targetNamespace'"
	 * @generated
	 */
	AttributionType getAttribution();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getAttribution <em>Attribution</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribution</em>' containment reference.
	 * @see #getAttribution()
	 * @generated
	 */
	void setAttribution(AttributionType value);

	/**
	 * Returns the value of the '<em><b>Audiodata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Audiodata</em>' containment reference.
	 * @see #setAudiodata(AudiodataType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Audiodata()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='audiodata' namespace='##targetNamespace'"
	 * @generated
	 */
	AudiodataType getAudiodata();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getAudiodata <em>Audiodata</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Audiodata</em>' containment reference.
	 * @see #getAudiodata()
	 * @generated
	 */
	void setAudiodata(AudiodataType value);

	/**
	 * Returns the value of the '<em><b>Audioobject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Audioobject</em>' containment reference.
	 * @see #setAudioobject(AudioobjectType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Audioobject()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='audioobject' namespace='##targetNamespace'"
	 * @generated
	 */
	AudioobjectType getAudioobject();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getAudioobject <em>Audioobject</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Audioobject</em>' containment reference.
	 * @see #getAudioobject()
	 * @generated
	 */
	void setAudioobject(AudioobjectType value);

	/**
	 * Returns the value of the '<em><b>Author</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Author</em>' containment reference.
	 * @see #setAuthor(AuthorType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Author()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='author' namespace='##targetNamespace'"
	 * @generated
	 */
	AuthorType getAuthor();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getAuthor <em>Author</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Author</em>' containment reference.
	 * @see #getAuthor()
	 * @generated
	 */
	void setAuthor(AuthorType value);

	/**
	 * Returns the value of the '<em><b>Authorgroup</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Authorgroup</em>' containment reference.
	 * @see #setAuthorgroup(AuthorgroupType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Authorgroup()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='authorgroup' namespace='##targetNamespace'"
	 * @generated
	 */
	AuthorgroupType getAuthorgroup();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getAuthorgroup <em>Authorgroup</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Authorgroup</em>' containment reference.
	 * @see #getAuthorgroup()
	 * @generated
	 */
	void setAuthorgroup(AuthorgroupType value);

	/**
	 * Returns the value of the '<em><b>Authorinitials</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Authorinitials</em>' containment reference.
	 * @see #setAuthorinitials(AuthorinitialsType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Authorinitials()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='authorinitials' namespace='##targetNamespace'"
	 * @generated
	 */
	AuthorinitialsType getAuthorinitials();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getAuthorinitials <em>Authorinitials</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Authorinitials</em>' containment reference.
	 * @see #getAuthorinitials()
	 * @generated
	 */
	void setAuthorinitials(AuthorinitialsType value);

	/**
	 * Returns the value of the '<em><b>Bibliocoverage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bibliocoverage</em>' containment reference.
	 * @see #setBibliocoverage(BibliocoverageType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Bibliocoverage()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='bibliocoverage' namespace='##targetNamespace'"
	 * @generated
	 */
	BibliocoverageType getBibliocoverage();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getBibliocoverage <em>Bibliocoverage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bibliocoverage</em>' containment reference.
	 * @see #getBibliocoverage()
	 * @generated
	 */
	void setBibliocoverage(BibliocoverageType value);

	/**
	 * Returns the value of the '<em><b>Bibliodiv</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bibliodiv</em>' containment reference.
	 * @see #setBibliodiv(BibliodivType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Bibliodiv()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='bibliodiv' namespace='##targetNamespace'"
	 * @generated
	 */
	BibliodivType getBibliodiv();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getBibliodiv <em>Bibliodiv</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bibliodiv</em>' containment reference.
	 * @see #getBibliodiv()
	 * @generated
	 */
	void setBibliodiv(BibliodivType value);

	/**
	 * Returns the value of the '<em><b>Biblioentry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Biblioentry</em>' containment reference.
	 * @see #setBiblioentry(BiblioentryType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Biblioentry()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='biblioentry' namespace='##targetNamespace'"
	 * @generated
	 */
	BiblioentryType getBiblioentry();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getBiblioentry <em>Biblioentry</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Biblioentry</em>' containment reference.
	 * @see #getBiblioentry()
	 * @generated
	 */
	void setBiblioentry(BiblioentryType value);

	/**
	 * Returns the value of the '<em><b>Bibliography</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bibliography</em>' containment reference.
	 * @see #setBibliography(BibliographyType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Bibliography()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='bibliography' namespace='##targetNamespace'"
	 * @generated
	 */
	BibliographyType getBibliography();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getBibliography <em>Bibliography</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bibliography</em>' containment reference.
	 * @see #getBibliography()
	 * @generated
	 */
	void setBibliography(BibliographyType value);

	/**
	 * Returns the value of the '<em><b>Biblioid</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Biblioid</em>' containment reference.
	 * @see #setBiblioid(BiblioidType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Biblioid()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='biblioid' namespace='##targetNamespace'"
	 * @generated
	 */
	BiblioidType getBiblioid();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getBiblioid <em>Biblioid</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Biblioid</em>' containment reference.
	 * @see #getBiblioid()
	 * @generated
	 */
	void setBiblioid(BiblioidType value);

	/**
	 * Returns the value of the '<em><b>Bibliolist</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bibliolist</em>' containment reference.
	 * @see #setBibliolist(BibliolistType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Bibliolist()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='bibliolist' namespace='##targetNamespace'"
	 * @generated
	 */
	BibliolistType getBibliolist();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getBibliolist <em>Bibliolist</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bibliolist</em>' containment reference.
	 * @see #getBibliolist()
	 * @generated
	 */
	void setBibliolist(BibliolistType value);

	/**
	 * Returns the value of the '<em><b>Bibliomisc</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bibliomisc</em>' containment reference.
	 * @see #setBibliomisc(BibliomiscType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Bibliomisc()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='bibliomisc' namespace='##targetNamespace'"
	 * @generated
	 */
	BibliomiscType getBibliomisc();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getBibliomisc <em>Bibliomisc</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bibliomisc</em>' containment reference.
	 * @see #getBibliomisc()
	 * @generated
	 */
	void setBibliomisc(BibliomiscType value);

	/**
	 * Returns the value of the '<em><b>Bibliomixed</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bibliomixed</em>' containment reference.
	 * @see #setBibliomixed(BibliomixedType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Bibliomixed()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='bibliomixed' namespace='##targetNamespace'"
	 * @generated
	 */
	BibliomixedType getBibliomixed();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getBibliomixed <em>Bibliomixed</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bibliomixed</em>' containment reference.
	 * @see #getBibliomixed()
	 * @generated
	 */
	void setBibliomixed(BibliomixedType value);

	/**
	 * Returns the value of the '<em><b>Bibliomset</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bibliomset</em>' containment reference.
	 * @see #setBibliomset(BibliomsetType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Bibliomset()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='bibliomset' namespace='##targetNamespace'"
	 * @generated
	 */
	BibliomsetType getBibliomset();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getBibliomset <em>Bibliomset</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bibliomset</em>' containment reference.
	 * @see #getBibliomset()
	 * @generated
	 */
	void setBibliomset(BibliomsetType value);

	/**
	 * Returns the value of the '<em><b>Biblioref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Biblioref</em>' containment reference.
	 * @see #setBiblioref(BibliorefType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Biblioref()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='biblioref' namespace='##targetNamespace'"
	 * @generated
	 */
	BibliorefType getBiblioref();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getBiblioref <em>Biblioref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Biblioref</em>' containment reference.
	 * @see #getBiblioref()
	 * @generated
	 */
	void setBiblioref(BibliorefType value);

	/**
	 * Returns the value of the '<em><b>Bibliorelation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bibliorelation</em>' containment reference.
	 * @see #setBibliorelation(BibliorelationType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Bibliorelation()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='bibliorelation' namespace='##targetNamespace'"
	 * @generated
	 */
	BibliorelationType getBibliorelation();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getBibliorelation <em>Bibliorelation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bibliorelation</em>' containment reference.
	 * @see #getBibliorelation()
	 * @generated
	 */
	void setBibliorelation(BibliorelationType value);

	/**
	 * Returns the value of the '<em><b>Biblioset</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Biblioset</em>' containment reference.
	 * @see #setBiblioset(BibliosetType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Biblioset()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='biblioset' namespace='##targetNamespace'"
	 * @generated
	 */
	BibliosetType getBiblioset();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getBiblioset <em>Biblioset</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Biblioset</em>' containment reference.
	 * @see #getBiblioset()
	 * @generated
	 */
	void setBiblioset(BibliosetType value);

	/**
	 * Returns the value of the '<em><b>Bibliosource</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bibliosource</em>' containment reference.
	 * @see #setBibliosource(BibliosourceType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Bibliosource()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='bibliosource' namespace='##targetNamespace'"
	 * @generated
	 */
	BibliosourceType getBibliosource();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getBibliosource <em>Bibliosource</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bibliosource</em>' containment reference.
	 * @see #getBibliosource()
	 * @generated
	 */
	void setBibliosource(BibliosourceType value);

	/**
	 * Returns the value of the '<em><b>Blockquote</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Blockquote</em>' containment reference.
	 * @see #setBlockquote(BlockquoteType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Blockquote()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='blockquote' namespace='##targetNamespace'"
	 * @generated
	 */
	BlockquoteType getBlockquote();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getBlockquote <em>Blockquote</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Blockquote</em>' containment reference.
	 * @see #getBlockquote()
	 * @generated
	 */
	void setBlockquote(BlockquoteType value);

	/**
	 * Returns the value of the '<em><b>Book</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Book</em>' containment reference.
	 * @see #setBook(BookType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Book()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='book' namespace='##targetNamespace'"
	 * @generated
	 */
	BookType getBook();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getBook <em>Book</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Book</em>' containment reference.
	 * @see #getBook()
	 * @generated
	 */
	void setBook(BookType value);

	/**
	 * Returns the value of the '<em><b>Bridgehead</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bridgehead</em>' containment reference.
	 * @see #setBridgehead(BridgeheadType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Bridgehead()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='bridgehead' namespace='##targetNamespace'"
	 * @generated
	 */
	BridgeheadType getBridgehead();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getBridgehead <em>Bridgehead</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bridgehead</em>' containment reference.
	 * @see #getBridgehead()
	 * @generated
	 */
	void setBridgehead(BridgeheadType value);

	/**
	 * Returns the value of the '<em><b>Callout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Callout</em>' containment reference.
	 * @see #setCallout(CalloutType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Callout()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='callout' namespace='##targetNamespace'"
	 * @generated
	 */
	CalloutType getCallout();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getCallout <em>Callout</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Callout</em>' containment reference.
	 * @see #getCallout()
	 * @generated
	 */
	void setCallout(CalloutType value);

	/**
	 * Returns the value of the '<em><b>Calloutlist</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Calloutlist</em>' containment reference.
	 * @see #setCalloutlist(CalloutlistType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Calloutlist()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='calloutlist' namespace='##targetNamespace'"
	 * @generated
	 */
	CalloutlistType getCalloutlist();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getCalloutlist <em>Calloutlist</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Calloutlist</em>' containment reference.
	 * @see #getCalloutlist()
	 * @generated
	 */
	void setCalloutlist(CalloutlistType value);

	/**
	 * Returns the value of the '<em><b>Caption</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Caption</em>' containment reference.
	 * @see #setCaption(CaptionType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Caption()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='caption' namespace='##targetNamespace'"
	 * @generated
	 */
	CaptionType getCaption();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getCaption <em>Caption</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Caption</em>' containment reference.
	 * @see #getCaption()
	 * @generated
	 */
	void setCaption(CaptionType value);

	/**
	 * Returns the value of the '<em><b>Caution</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Caution</em>' containment reference.
	 * @see #setCaution(CautionType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Caution()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='caution' namespace='##targetNamespace'"
	 * @generated
	 */
	CautionType getCaution();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getCaution <em>Caution</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Caution</em>' containment reference.
	 * @see #getCaution()
	 * @generated
	 */
	void setCaution(CautionType value);

	/**
	 * Returns the value of the '<em><b>Chapter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Chapter</em>' containment reference.
	 * @see #setChapter(ChapterType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Chapter()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='chapter' namespace='##targetNamespace'"
	 * @generated
	 */
	ChapterType getChapter();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getChapter <em>Chapter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Chapter</em>' containment reference.
	 * @see #getChapter()
	 * @generated
	 */
	void setChapter(ChapterType value);

	/**
	 * Returns the value of the '<em><b>Citation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Citation</em>' containment reference.
	 * @see #setCitation(CitationType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Citation()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='citation' namespace='##targetNamespace'"
	 * @generated
	 */
	CitationType getCitation();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getCitation <em>Citation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Citation</em>' containment reference.
	 * @see #getCitation()
	 * @generated
	 */
	void setCitation(CitationType value);

	/**
	 * Returns the value of the '<em><b>Citebiblioid</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Citebiblioid</em>' containment reference.
	 * @see #setCitebiblioid(CitebiblioidType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Citebiblioid()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='citebiblioid' namespace='##targetNamespace'"
	 * @generated
	 */
	CitebiblioidType getCitebiblioid();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getCitebiblioid <em>Citebiblioid</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Citebiblioid</em>' containment reference.
	 * @see #getCitebiblioid()
	 * @generated
	 */
	void setCitebiblioid(CitebiblioidType value);

	/**
	 * Returns the value of the '<em><b>Citerefentry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Citerefentry</em>' containment reference.
	 * @see #setCiterefentry(CiterefentryType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Citerefentry()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='citerefentry' namespace='##targetNamespace'"
	 * @generated
	 */
	CiterefentryType getCiterefentry();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getCiterefentry <em>Citerefentry</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Citerefentry</em>' containment reference.
	 * @see #getCiterefentry()
	 * @generated
	 */
	void setCiterefentry(CiterefentryType value);

	/**
	 * Returns the value of the '<em><b>Citetitle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Citetitle</em>' containment reference.
	 * @see #setCitetitle(CitetitleType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Citetitle()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='citetitle' namespace='##targetNamespace'"
	 * @generated
	 */
	CitetitleType getCitetitle();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getCitetitle <em>Citetitle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Citetitle</em>' containment reference.
	 * @see #getCitetitle()
	 * @generated
	 */
	void setCitetitle(CitetitleType value);

	/**
	 * Returns the value of the '<em><b>City</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>City</em>' containment reference.
	 * @see #setCity(CityType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_City()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='city' namespace='##targetNamespace'"
	 * @generated
	 */
	CityType getCity();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getCity <em>City</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>City</em>' containment reference.
	 * @see #getCity()
	 * @generated
	 */
	void setCity(CityType value);

	/**
	 * Returns the value of the '<em><b>Classname</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classname</em>' containment reference.
	 * @see #setClassname(ClassnameType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Classname()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='classname' namespace='##targetNamespace'"
	 * @generated
	 */
	ClassnameType getClassname();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getClassname <em>Classname</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Classname</em>' containment reference.
	 * @see #getClassname()
	 * @generated
	 */
	void setClassname(ClassnameType value);

	/**
	 * Returns the value of the '<em><b>Classsynopsis</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classsynopsis</em>' containment reference.
	 * @see #setClasssynopsis(ClasssynopsisType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Classsynopsis()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='classsynopsis' namespace='##targetNamespace'"
	 * @generated
	 */
	ClasssynopsisType getClasssynopsis();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getClasssynopsis <em>Classsynopsis</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Classsynopsis</em>' containment reference.
	 * @see #getClasssynopsis()
	 * @generated
	 */
	void setClasssynopsis(ClasssynopsisType value);

	/**
	 * Returns the value of the '<em><b>Classsynopsisinfo</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classsynopsisinfo</em>' containment reference.
	 * @see #setClasssynopsisinfo(ClasssynopsisinfoType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Classsynopsisinfo()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='classsynopsisinfo' namespace='##targetNamespace'"
	 * @generated
	 */
	ClasssynopsisinfoType getClasssynopsisinfo();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getClasssynopsisinfo <em>Classsynopsisinfo</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Classsynopsisinfo</em>' containment reference.
	 * @see #getClasssynopsisinfo()
	 * @generated
	 */
	void setClasssynopsisinfo(ClasssynopsisinfoType value);

	/**
	 * Returns the value of the '<em><b>Cmdsynopsis</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cmdsynopsis</em>' containment reference.
	 * @see #setCmdsynopsis(CmdsynopsisType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Cmdsynopsis()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='cmdsynopsis' namespace='##targetNamespace'"
	 * @generated
	 */
	CmdsynopsisType getCmdsynopsis();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getCmdsynopsis <em>Cmdsynopsis</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cmdsynopsis</em>' containment reference.
	 * @see #getCmdsynopsis()
	 * @generated
	 */
	void setCmdsynopsis(CmdsynopsisType value);

	/**
	 * Returns the value of the '<em><b>Co</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Co</em>' containment reference.
	 * @see #setCo(CoType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Co()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='co' namespace='##targetNamespace'"
	 * @generated
	 */
	CoType getCo();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getCo <em>Co</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Co</em>' containment reference.
	 * @see #getCo()
	 * @generated
	 */
	void setCo(CoType value);

	/**
	 * Returns the value of the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' containment reference.
	 * @see #setCode(CodeType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Code()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='code' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeType getCode();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getCode <em>Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' containment reference.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(CodeType value);

	/**
	 * Returns the value of the '<em><b>Col</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Col</em>' containment reference.
	 * @see #setCol(ColType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Col()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='col' namespace='##targetNamespace'"
	 * @generated
	 */
	ColType getCol();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getCol <em>Col</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Col</em>' containment reference.
	 * @see #getCol()
	 * @generated
	 */
	void setCol(ColType value);

	/**
	 * Returns the value of the '<em><b>Colgroup</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Colgroup</em>' containment reference.
	 * @see #setColgroup(ColgroupType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Colgroup()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='colgroup' namespace='##targetNamespace'"
	 * @generated
	 */
	ColgroupType getColgroup();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getColgroup <em>Colgroup</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Colgroup</em>' containment reference.
	 * @see #getColgroup()
	 * @generated
	 */
	void setColgroup(ColgroupType value);

	/**
	 * Returns the value of the '<em><b>Collab</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Collab</em>' containment reference.
	 * @see #setCollab(CollabType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Collab()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='collab' namespace='##targetNamespace'"
	 * @generated
	 */
	CollabType getCollab();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getCollab <em>Collab</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Collab</em>' containment reference.
	 * @see #getCollab()
	 * @generated
	 */
	void setCollab(CollabType value);

	/**
	 * Returns the value of the '<em><b>Colophon</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Colophon</em>' containment reference.
	 * @see #setColophon(ColophonType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Colophon()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='colophon' namespace='##targetNamespace'"
	 * @generated
	 */
	ColophonType getColophon();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getColophon <em>Colophon</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Colophon</em>' containment reference.
	 * @see #getColophon()
	 * @generated
	 */
	void setColophon(ColophonType value);

	/**
	 * Returns the value of the '<em><b>Colspec</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Colspec</em>' containment reference.
	 * @see #setColspec(ColspecType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Colspec()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='colspec' namespace='##targetNamespace'"
	 * @generated
	 */
	ColspecType getColspec();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getColspec <em>Colspec</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Colspec</em>' containment reference.
	 * @see #getColspec()
	 * @generated
	 */
	void setColspec(ColspecType value);

	/**
	 * Returns the value of the '<em><b>Command</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Command</em>' containment reference.
	 * @see #setCommand(CommandType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Command()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='command' namespace='##targetNamespace'"
	 * @generated
	 */
	CommandType getCommand();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getCommand <em>Command</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Command</em>' containment reference.
	 * @see #getCommand()
	 * @generated
	 */
	void setCommand(CommandType value);

	/**
	 * Returns the value of the '<em><b>Computeroutput</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Computeroutput</em>' containment reference.
	 * @see #setComputeroutput(ComputeroutputType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Computeroutput()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='computeroutput' namespace='##targetNamespace'"
	 * @generated
	 */
	ComputeroutputType getComputeroutput();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getComputeroutput <em>Computeroutput</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Computeroutput</em>' containment reference.
	 * @see #getComputeroutput()
	 * @generated
	 */
	void setComputeroutput(ComputeroutputType value);

	/**
	 * Returns the value of the '<em><b>Confdates</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Confdates</em>' containment reference.
	 * @see #setConfdates(ConfdatesType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Confdates()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='confdates' namespace='##targetNamespace'"
	 * @generated
	 */
	ConfdatesType getConfdates();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getConfdates <em>Confdates</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Confdates</em>' containment reference.
	 * @see #getConfdates()
	 * @generated
	 */
	void setConfdates(ConfdatesType value);

	/**
	 * Returns the value of the '<em><b>Confgroup</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Confgroup</em>' containment reference.
	 * @see #setConfgroup(ConfgroupType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Confgroup()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='confgroup' namespace='##targetNamespace'"
	 * @generated
	 */
	ConfgroupType getConfgroup();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getConfgroup <em>Confgroup</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Confgroup</em>' containment reference.
	 * @see #getConfgroup()
	 * @generated
	 */
	void setConfgroup(ConfgroupType value);

	/**
	 * Returns the value of the '<em><b>Confnum</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Confnum</em>' containment reference.
	 * @see #setConfnum(ConfnumType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Confnum()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='confnum' namespace='##targetNamespace'"
	 * @generated
	 */
	ConfnumType getConfnum();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getConfnum <em>Confnum</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Confnum</em>' containment reference.
	 * @see #getConfnum()
	 * @generated
	 */
	void setConfnum(ConfnumType value);

	/**
	 * Returns the value of the '<em><b>Confsponsor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Confsponsor</em>' containment reference.
	 * @see #setConfsponsor(ConfsponsorType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Confsponsor()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='confsponsor' namespace='##targetNamespace'"
	 * @generated
	 */
	ConfsponsorType getConfsponsor();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getConfsponsor <em>Confsponsor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Confsponsor</em>' containment reference.
	 * @see #getConfsponsor()
	 * @generated
	 */
	void setConfsponsor(ConfsponsorType value);

	/**
	 * Returns the value of the '<em><b>Conftitle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conftitle</em>' containment reference.
	 * @see #setConftitle(ConftitleType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Conftitle()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='conftitle' namespace='##targetNamespace'"
	 * @generated
	 */
	ConftitleType getConftitle();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getConftitle <em>Conftitle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conftitle</em>' containment reference.
	 * @see #getConftitle()
	 * @generated
	 */
	void setConftitle(ConftitleType value);

	/**
	 * Returns the value of the '<em><b>Constant</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constant</em>' containment reference.
	 * @see #setConstant(ConstantType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Constant()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='constant' namespace='##targetNamespace'"
	 * @generated
	 */
	ConstantType getConstant();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getConstant <em>Constant</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constant</em>' containment reference.
	 * @see #getConstant()
	 * @generated
	 */
	void setConstant(ConstantType value);

	/**
	 * Returns the value of the '<em><b>Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraint</em>' containment reference.
	 * @see #setConstraint(ConstraintType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Constraint()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='constraint' namespace='##targetNamespace'"
	 * @generated
	 */
	ConstraintType getConstraint();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getConstraint <em>Constraint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constraint</em>' containment reference.
	 * @see #getConstraint()
	 * @generated
	 */
	void setConstraint(ConstraintType value);

	/**
	 * Returns the value of the '<em><b>Constraintdef</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraintdef</em>' containment reference.
	 * @see #setConstraintdef(ConstraintdefType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Constraintdef()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='constraintdef' namespace='##targetNamespace'"
	 * @generated
	 */
	ConstraintdefType getConstraintdef();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getConstraintdef <em>Constraintdef</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constraintdef</em>' containment reference.
	 * @see #getConstraintdef()
	 * @generated
	 */
	void setConstraintdef(ConstraintdefType value);

	/**
	 * Returns the value of the '<em><b>Constructorsynopsis</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constructorsynopsis</em>' containment reference.
	 * @see #setConstructorsynopsis(ConstructorsynopsisType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Constructorsynopsis()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='constructorsynopsis' namespace='##targetNamespace'"
	 * @generated
	 */
	ConstructorsynopsisType getConstructorsynopsis();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getConstructorsynopsis <em>Constructorsynopsis</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constructorsynopsis</em>' containment reference.
	 * @see #getConstructorsynopsis()
	 * @generated
	 */
	void setConstructorsynopsis(ConstructorsynopsisType value);

	/**
	 * Returns the value of the '<em><b>Contractnum</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contractnum</em>' containment reference.
	 * @see #setContractnum(ContractnumType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Contractnum()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='contractnum' namespace='##targetNamespace'"
	 * @generated
	 */
	ContractnumType getContractnum();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getContractnum <em>Contractnum</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contractnum</em>' containment reference.
	 * @see #getContractnum()
	 * @generated
	 */
	void setContractnum(ContractnumType value);

	/**
	 * Returns the value of the '<em><b>Contractsponsor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contractsponsor</em>' containment reference.
	 * @see #setContractsponsor(ContractsponsorType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Contractsponsor()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='contractsponsor' namespace='##targetNamespace'"
	 * @generated
	 */
	ContractsponsorType getContractsponsor();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getContractsponsor <em>Contractsponsor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contractsponsor</em>' containment reference.
	 * @see #getContractsponsor()
	 * @generated
	 */
	void setContractsponsor(ContractsponsorType value);

	/**
	 * Returns the value of the '<em><b>Contrib</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contrib</em>' containment reference.
	 * @see #setContrib(ContribType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Contrib()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='contrib' namespace='##targetNamespace'"
	 * @generated
	 */
	ContribType getContrib();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getContrib <em>Contrib</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contrib</em>' containment reference.
	 * @see #getContrib()
	 * @generated
	 */
	void setContrib(ContribType value);

	/**
	 * Returns the value of the '<em><b>Copyright</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Copyright</em>' containment reference.
	 * @see #setCopyright(CopyrightType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Copyright()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='copyright' namespace='##targetNamespace'"
	 * @generated
	 */
	CopyrightType getCopyright();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getCopyright <em>Copyright</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Copyright</em>' containment reference.
	 * @see #getCopyright()
	 * @generated
	 */
	void setCopyright(CopyrightType value);

	/**
	 * Returns the value of the '<em><b>Coref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coref</em>' containment reference.
	 * @see #setCoref(CorefType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Coref()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='coref' namespace='##targetNamespace'"
	 * @generated
	 */
	CorefType getCoref();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getCoref <em>Coref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coref</em>' containment reference.
	 * @see #getCoref()
	 * @generated
	 */
	void setCoref(CorefType value);

	/**
	 * Returns the value of the '<em><b>Country</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Country</em>' containment reference.
	 * @see #setCountry(CountryType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Country()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='country' namespace='##targetNamespace'"
	 * @generated
	 */
	CountryType getCountry();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getCountry <em>Country</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Country</em>' containment reference.
	 * @see #getCountry()
	 * @generated
	 */
	void setCountry(CountryType value);

	/**
	 * Returns the value of the '<em><b>Cover</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cover</em>' containment reference.
	 * @see #setCover(CoverType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Cover()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='cover' namespace='##targetNamespace'"
	 * @generated
	 */
	CoverType getCover();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getCover <em>Cover</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cover</em>' containment reference.
	 * @see #getCover()
	 * @generated
	 */
	void setCover(CoverType value);

	/**
	 * Returns the value of the '<em><b>Database</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Database</em>' containment reference.
	 * @see #setDatabase(DatabaseType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Database()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='database' namespace='##targetNamespace'"
	 * @generated
	 */
	DatabaseType getDatabase();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getDatabase <em>Database</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Database</em>' containment reference.
	 * @see #getDatabase()
	 * @generated
	 */
	void setDatabase(DatabaseType value);

	/**
	 * Returns the value of the '<em><b>Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date</em>' containment reference.
	 * @see #setDate(DateType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Date()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='date' namespace='##targetNamespace'"
	 * @generated
	 */
	DateType getDate();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getDate <em>Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' containment reference.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(DateType value);

	/**
	 * Returns the value of the '<em><b>Dedication</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dedication</em>' containment reference.
	 * @see #setDedication(DedicationType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Dedication()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='dedication' namespace='##targetNamespace'"
	 * @generated
	 */
	DedicationType getDedication();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getDedication <em>Dedication</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dedication</em>' containment reference.
	 * @see #getDedication()
	 * @generated
	 */
	void setDedication(DedicationType value);

	/**
	 * Returns the value of the '<em><b>Destructorsynopsis</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destructorsynopsis</em>' containment reference.
	 * @see #setDestructorsynopsis(DestructorsynopsisType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Destructorsynopsis()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='destructorsynopsis' namespace='##targetNamespace'"
	 * @generated
	 */
	DestructorsynopsisType getDestructorsynopsis();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getDestructorsynopsis <em>Destructorsynopsis</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destructorsynopsis</em>' containment reference.
	 * @see #getDestructorsynopsis()
	 * @generated
	 */
	void setDestructorsynopsis(DestructorsynopsisType value);

	/**
	 * Returns the value of the '<em><b>Edition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Edition</em>' containment reference.
	 * @see #setEdition(EditionType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Edition()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='edition' namespace='##targetNamespace'"
	 * @generated
	 */
	EditionType getEdition();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getEdition <em>Edition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Edition</em>' containment reference.
	 * @see #getEdition()
	 * @generated
	 */
	void setEdition(EditionType value);

	/**
	 * Returns the value of the '<em><b>Editor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Editor</em>' containment reference.
	 * @see #setEditor(EditorType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Editor()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='editor' namespace='##targetNamespace'"
	 * @generated
	 */
	EditorType getEditor();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getEditor <em>Editor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Editor</em>' containment reference.
	 * @see #getEditor()
	 * @generated
	 */
	void setEditor(EditorType value);

	/**
	 * Returns the value of the '<em><b>Email</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Email</em>' containment reference.
	 * @see #setEmail(EmailType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Email()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='email' namespace='##targetNamespace'"
	 * @generated
	 */
	EmailType getEmail();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getEmail <em>Email</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Email</em>' containment reference.
	 * @see #getEmail()
	 * @generated
	 */
	void setEmail(EmailType value);

	/**
	 * Returns the value of the '<em><b>Emphasis</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Emphasis</em>' containment reference.
	 * @see #setEmphasis(EmphasisType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Emphasis()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='emphasis' namespace='##targetNamespace'"
	 * @generated
	 */
	EmphasisType getEmphasis();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getEmphasis <em>Emphasis</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Emphasis</em>' containment reference.
	 * @see #getEmphasis()
	 * @generated
	 */
	void setEmphasis(EmphasisType value);

	/**
	 * Returns the value of the '<em><b>Entry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entry</em>' containment reference.
	 * @see #setEntry(EntryType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Entry()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='entry' namespace='##targetNamespace'"
	 * @generated
	 */
	EntryType getEntry();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getEntry <em>Entry</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entry</em>' containment reference.
	 * @see #getEntry()
	 * @generated
	 */
	void setEntry(EntryType value);

	/**
	 * Returns the value of the '<em><b>Entrytbl</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entrytbl</em>' containment reference.
	 * @see #setEntrytbl(EntrytblType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Entrytbl()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='entrytbl' namespace='##targetNamespace'"
	 * @generated
	 */
	EntrytblType getEntrytbl();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getEntrytbl <em>Entrytbl</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entrytbl</em>' containment reference.
	 * @see #getEntrytbl()
	 * @generated
	 */
	void setEntrytbl(EntrytblType value);

	/**
	 * Returns the value of the '<em><b>Envar</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Envar</em>' containment reference.
	 * @see #setEnvar(EnvarType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Envar()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='envar' namespace='##targetNamespace'"
	 * @generated
	 */
	EnvarType getEnvar();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getEnvar <em>Envar</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Envar</em>' containment reference.
	 * @see #getEnvar()
	 * @generated
	 */
	void setEnvar(EnvarType value);

	/**
	 * Returns the value of the '<em><b>Epigraph</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Epigraph</em>' containment reference.
	 * @see #setEpigraph(EpigraphType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Epigraph()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='epigraph' namespace='##targetNamespace'"
	 * @generated
	 */
	EpigraphType getEpigraph();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getEpigraph <em>Epigraph</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Epigraph</em>' containment reference.
	 * @see #getEpigraph()
	 * @generated
	 */
	void setEpigraph(EpigraphType value);

	/**
	 * Returns the value of the '<em><b>Equation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Equation</em>' containment reference.
	 * @see #setEquation(EquationType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Equation()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='equation' namespace='##targetNamespace'"
	 * @generated
	 */
	EquationType getEquation();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getEquation <em>Equation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Equation</em>' containment reference.
	 * @see #getEquation()
	 * @generated
	 */
	void setEquation(EquationType value);

	/**
	 * Returns the value of the '<em><b>Errorcode</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Errorcode</em>' containment reference.
	 * @see #setErrorcode(ErrorcodeType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Errorcode()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='errorcode' namespace='##targetNamespace'"
	 * @generated
	 */
	ErrorcodeType getErrorcode();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getErrorcode <em>Errorcode</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Errorcode</em>' containment reference.
	 * @see #getErrorcode()
	 * @generated
	 */
	void setErrorcode(ErrorcodeType value);

	/**
	 * Returns the value of the '<em><b>Errorname</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Errorname</em>' containment reference.
	 * @see #setErrorname(ErrornameType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Errorname()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='errorname' namespace='##targetNamespace'"
	 * @generated
	 */
	ErrornameType getErrorname();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getErrorname <em>Errorname</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Errorname</em>' containment reference.
	 * @see #getErrorname()
	 * @generated
	 */
	void setErrorname(ErrornameType value);

	/**
	 * Returns the value of the '<em><b>Errortext</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Errortext</em>' containment reference.
	 * @see #setErrortext(ErrortextType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Errortext()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='errortext' namespace='##targetNamespace'"
	 * @generated
	 */
	ErrortextType getErrortext();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getErrortext <em>Errortext</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Errortext</em>' containment reference.
	 * @see #getErrortext()
	 * @generated
	 */
	void setErrortext(ErrortextType value);

	/**
	 * Returns the value of the '<em><b>Errortype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Errortype</em>' containment reference.
	 * @see #setErrortype(ErrortypeType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Errortype()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='errortype' namespace='##targetNamespace'"
	 * @generated
	 */
	ErrortypeType getErrortype();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getErrortype <em>Errortype</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Errortype</em>' containment reference.
	 * @see #getErrortype()
	 * @generated
	 */
	void setErrortype(ErrortypeType value);

	/**
	 * Returns the value of the '<em><b>Example</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Example</em>' containment reference.
	 * @see #setExample(ExampleType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Example()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='example' namespace='##targetNamespace'"
	 * @generated
	 */
	ExampleType getExample();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getExample <em>Example</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Example</em>' containment reference.
	 * @see #getExample()
	 * @generated
	 */
	void setExample(ExampleType value);

	/**
	 * Returns the value of the '<em><b>Exceptionname</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exceptionname</em>' containment reference.
	 * @see #setExceptionname(ExceptionnameType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Exceptionname()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='exceptionname' namespace='##targetNamespace'"
	 * @generated
	 */
	ExceptionnameType getExceptionname();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getExceptionname <em>Exceptionname</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exceptionname</em>' containment reference.
	 * @see #getExceptionname()
	 * @generated
	 */
	void setExceptionname(ExceptionnameType value);

	/**
	 * Returns the value of the '<em><b>Extendedlink</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extendedlink</em>' containment reference.
	 * @see #setExtendedlink(ExtendedlinkType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Extendedlink()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='extendedlink' namespace='##targetNamespace'"
	 * @generated
	 */
	ExtendedlinkType getExtendedlink();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getExtendedlink <em>Extendedlink</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extendedlink</em>' containment reference.
	 * @see #getExtendedlink()
	 * @generated
	 */
	void setExtendedlink(ExtendedlinkType value);

	/**
	 * Returns the value of the '<em><b>Fax</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fax</em>' containment reference.
	 * @see #setFax(FaxType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Fax()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='fax' namespace='##targetNamespace'"
	 * @generated
	 */
	FaxType getFax();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getFax <em>Fax</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fax</em>' containment reference.
	 * @see #getFax()
	 * @generated
	 */
	void setFax(FaxType value);

	/**
	 * Returns the value of the '<em><b>Fieldsynopsis</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fieldsynopsis</em>' containment reference.
	 * @see #setFieldsynopsis(FieldsynopsisType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Fieldsynopsis()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='fieldsynopsis' namespace='##targetNamespace'"
	 * @generated
	 */
	FieldsynopsisType getFieldsynopsis();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getFieldsynopsis <em>Fieldsynopsis</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fieldsynopsis</em>' containment reference.
	 * @see #getFieldsynopsis()
	 * @generated
	 */
	void setFieldsynopsis(FieldsynopsisType value);

	/**
	 * Returns the value of the '<em><b>Figure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Figure</em>' containment reference.
	 * @see #setFigure(FigureType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Figure()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='figure' namespace='##targetNamespace'"
	 * @generated
	 */
	FigureType getFigure();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getFigure <em>Figure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Figure</em>' containment reference.
	 * @see #getFigure()
	 * @generated
	 */
	void setFigure(FigureType value);

	/**
	 * Returns the value of the '<em><b>Filename</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filename</em>' containment reference.
	 * @see #setFilename(FilenameType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Filename()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='filename' namespace='##targetNamespace'"
	 * @generated
	 */
	FilenameType getFilename();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getFilename <em>Filename</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filename</em>' containment reference.
	 * @see #getFilename()
	 * @generated
	 */
	void setFilename(FilenameType value);

	/**
	 * Returns the value of the '<em><b>Firstname</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Firstname</em>' containment reference.
	 * @see #setFirstname(FirstnameType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Firstname()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='firstname' namespace='##targetNamespace'"
	 * @generated
	 */
	FirstnameType getFirstname();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getFirstname <em>Firstname</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Firstname</em>' containment reference.
	 * @see #getFirstname()
	 * @generated
	 */
	void setFirstname(FirstnameType value);

	/**
	 * Returns the value of the '<em><b>Firstterm</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Firstterm</em>' containment reference.
	 * @see #setFirstterm(FirsttermType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Firstterm()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='firstterm' namespace='##targetNamespace'"
	 * @generated
	 */
	FirsttermType getFirstterm();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getFirstterm <em>Firstterm</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Firstterm</em>' containment reference.
	 * @see #getFirstterm()
	 * @generated
	 */
	void setFirstterm(FirsttermType value);

	/**
	 * Returns the value of the '<em><b>Footnote</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Footnote</em>' containment reference.
	 * @see #setFootnote(FootnoteType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Footnote()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='footnote' namespace='##targetNamespace'"
	 * @generated
	 */
	FootnoteType getFootnote();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getFootnote <em>Footnote</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Footnote</em>' containment reference.
	 * @see #getFootnote()
	 * @generated
	 */
	void setFootnote(FootnoteType value);

	/**
	 * Returns the value of the '<em><b>Footnoteref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Footnoteref</em>' containment reference.
	 * @see #setFootnoteref(FootnoterefType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Footnoteref()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='footnoteref' namespace='##targetNamespace'"
	 * @generated
	 */
	FootnoterefType getFootnoteref();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getFootnoteref <em>Footnoteref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Footnoteref</em>' containment reference.
	 * @see #getFootnoteref()
	 * @generated
	 */
	void setFootnoteref(FootnoterefType value);

	/**
	 * Returns the value of the '<em><b>Foreignphrase</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Foreignphrase</em>' containment reference.
	 * @see #setForeignphrase(ForeignphraseType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Foreignphrase()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='foreignphrase' namespace='##targetNamespace'"
	 * @generated
	 */
	ForeignphraseType getForeignphrase();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getForeignphrase <em>Foreignphrase</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Foreignphrase</em>' containment reference.
	 * @see #getForeignphrase()
	 * @generated
	 */
	void setForeignphrase(ForeignphraseType value);

	/**
	 * Returns the value of the '<em><b>Formalpara</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Formalpara</em>' containment reference.
	 * @see #setFormalpara(FormalparaType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Formalpara()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='formalpara' namespace='##targetNamespace'"
	 * @generated
	 */
	FormalparaType getFormalpara();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getFormalpara <em>Formalpara</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Formalpara</em>' containment reference.
	 * @see #getFormalpara()
	 * @generated
	 */
	void setFormalpara(FormalparaType value);

	/**
	 * Returns the value of the '<em><b>Funcdef</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Funcdef</em>' containment reference.
	 * @see #setFuncdef(FuncdefType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Funcdef()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='funcdef' namespace='##targetNamespace'"
	 * @generated
	 */
	FuncdefType getFuncdef();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getFuncdef <em>Funcdef</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Funcdef</em>' containment reference.
	 * @see #getFuncdef()
	 * @generated
	 */
	void setFuncdef(FuncdefType value);

	/**
	 * Returns the value of the '<em><b>Funcparams</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Funcparams</em>' containment reference.
	 * @see #setFuncparams(FuncparamsType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Funcparams()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='funcparams' namespace='##targetNamespace'"
	 * @generated
	 */
	FuncparamsType getFuncparams();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getFuncparams <em>Funcparams</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Funcparams</em>' containment reference.
	 * @see #getFuncparams()
	 * @generated
	 */
	void setFuncparams(FuncparamsType value);

	/**
	 * Returns the value of the '<em><b>Funcprototype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Funcprototype</em>' containment reference.
	 * @see #setFuncprototype(FuncprototypeType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Funcprototype()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='funcprototype' namespace='##targetNamespace'"
	 * @generated
	 */
	FuncprototypeType getFuncprototype();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getFuncprototype <em>Funcprototype</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Funcprototype</em>' containment reference.
	 * @see #getFuncprototype()
	 * @generated
	 */
	void setFuncprototype(FuncprototypeType value);

	/**
	 * Returns the value of the '<em><b>Funcsynopsis</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Funcsynopsis</em>' containment reference.
	 * @see #setFuncsynopsis(FuncsynopsisType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Funcsynopsis()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='funcsynopsis' namespace='##targetNamespace'"
	 * @generated
	 */
	FuncsynopsisType getFuncsynopsis();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getFuncsynopsis <em>Funcsynopsis</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Funcsynopsis</em>' containment reference.
	 * @see #getFuncsynopsis()
	 * @generated
	 */
	void setFuncsynopsis(FuncsynopsisType value);

	/**
	 * Returns the value of the '<em><b>Funcsynopsisinfo</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Funcsynopsisinfo</em>' containment reference.
	 * @see #setFuncsynopsisinfo(FuncsynopsisinfoType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Funcsynopsisinfo()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='funcsynopsisinfo' namespace='##targetNamespace'"
	 * @generated
	 */
	FuncsynopsisinfoType getFuncsynopsisinfo();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getFuncsynopsisinfo <em>Funcsynopsisinfo</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Funcsynopsisinfo</em>' containment reference.
	 * @see #getFuncsynopsisinfo()
	 * @generated
	 */
	void setFuncsynopsisinfo(FuncsynopsisinfoType value);

	/**
	 * Returns the value of the '<em><b>Function</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function</em>' containment reference.
	 * @see #setFunction(FunctionType1)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Function()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='function' namespace='##targetNamespace'"
	 * @generated
	 */
	FunctionType1 getFunction();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getFunction <em>Function</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Function</em>' containment reference.
	 * @see #getFunction()
	 * @generated
	 */
	void setFunction(FunctionType1 value);

	/**
	 * Returns the value of the '<em><b>Glossary</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Glossary</em>' containment reference.
	 * @see #setGlossary(GlossaryType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Glossary()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='glossary' namespace='##targetNamespace'"
	 * @generated
	 */
	GlossaryType getGlossary();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getGlossary <em>Glossary</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Glossary</em>' containment reference.
	 * @see #getGlossary()
	 * @generated
	 */
	void setGlossary(GlossaryType value);

	/**
	 * Returns the value of the '<em><b>Glossdef</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Glossdef</em>' containment reference.
	 * @see #setGlossdef(GlossdefType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Glossdef()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='glossdef' namespace='##targetNamespace'"
	 * @generated
	 */
	GlossdefType getGlossdef();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getGlossdef <em>Glossdef</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Glossdef</em>' containment reference.
	 * @see #getGlossdef()
	 * @generated
	 */
	void setGlossdef(GlossdefType value);

	/**
	 * Returns the value of the '<em><b>Glossdiv</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Glossdiv</em>' containment reference.
	 * @see #setGlossdiv(GlossdivType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Glossdiv()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='glossdiv' namespace='##targetNamespace'"
	 * @generated
	 */
	GlossdivType getGlossdiv();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getGlossdiv <em>Glossdiv</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Glossdiv</em>' containment reference.
	 * @see #getGlossdiv()
	 * @generated
	 */
	void setGlossdiv(GlossdivType value);

	/**
	 * Returns the value of the '<em><b>Glossentry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Glossentry</em>' containment reference.
	 * @see #setGlossentry(GlossentryType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Glossentry()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='glossentry' namespace='##targetNamespace'"
	 * @generated
	 */
	GlossentryType getGlossentry();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getGlossentry <em>Glossentry</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Glossentry</em>' containment reference.
	 * @see #getGlossentry()
	 * @generated
	 */
	void setGlossentry(GlossentryType value);

	/**
	 * Returns the value of the '<em><b>Glosslist</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Glosslist</em>' containment reference.
	 * @see #setGlosslist(GlosslistType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Glosslist()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='glosslist' namespace='##targetNamespace'"
	 * @generated
	 */
	GlosslistType getGlosslist();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getGlosslist <em>Glosslist</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Glosslist</em>' containment reference.
	 * @see #getGlosslist()
	 * @generated
	 */
	void setGlosslist(GlosslistType value);

	/**
	 * Returns the value of the '<em><b>Glosssee</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Glosssee</em>' containment reference.
	 * @see #setGlosssee(GlossseeType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Glosssee()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='glosssee' namespace='##targetNamespace'"
	 * @generated
	 */
	GlossseeType getGlosssee();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getGlosssee <em>Glosssee</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Glosssee</em>' containment reference.
	 * @see #getGlosssee()
	 * @generated
	 */
	void setGlosssee(GlossseeType value);

	/**
	 * Returns the value of the '<em><b>Glossseealso</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Glossseealso</em>' containment reference.
	 * @see #setGlossseealso(GlossseealsoType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Glossseealso()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='glossseealso' namespace='##targetNamespace'"
	 * @generated
	 */
	GlossseealsoType getGlossseealso();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getGlossseealso <em>Glossseealso</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Glossseealso</em>' containment reference.
	 * @see #getGlossseealso()
	 * @generated
	 */
	void setGlossseealso(GlossseealsoType value);

	/**
	 * Returns the value of the '<em><b>Glossterm</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Glossterm</em>' containment reference.
	 * @see #setGlossterm(GlosstermType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Glossterm()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='glossterm' namespace='##targetNamespace'"
	 * @generated
	 */
	GlosstermType getGlossterm();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getGlossterm <em>Glossterm</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Glossterm</em>' containment reference.
	 * @see #getGlossterm()
	 * @generated
	 */
	void setGlossterm(GlosstermType value);

	/**
	 * Returns the value of the '<em><b>Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' containment reference.
	 * @see #setGroup(GroupType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Group()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='group' namespace='##targetNamespace'"
	 * @generated
	 */
	GroupType getGroup();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getGroup <em>Group</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group</em>' containment reference.
	 * @see #getGroup()
	 * @generated
	 */
	void setGroup(GroupType value);

	/**
	 * Returns the value of the '<em><b>Guibutton</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guibutton</em>' containment reference.
	 * @see #setGuibutton(GuibuttonType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Guibutton()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='guibutton' namespace='##targetNamespace'"
	 * @generated
	 */
	GuibuttonType getGuibutton();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getGuibutton <em>Guibutton</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Guibutton</em>' containment reference.
	 * @see #getGuibutton()
	 * @generated
	 */
	void setGuibutton(GuibuttonType value);

	/**
	 * Returns the value of the '<em><b>Guiicon</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guiicon</em>' containment reference.
	 * @see #setGuiicon(GuiiconType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Guiicon()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='guiicon' namespace='##targetNamespace'"
	 * @generated
	 */
	GuiiconType getGuiicon();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getGuiicon <em>Guiicon</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Guiicon</em>' containment reference.
	 * @see #getGuiicon()
	 * @generated
	 */
	void setGuiicon(GuiiconType value);

	/**
	 * Returns the value of the '<em><b>Guilabel</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guilabel</em>' containment reference.
	 * @see #setGuilabel(GuilabelType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Guilabel()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='guilabel' namespace='##targetNamespace'"
	 * @generated
	 */
	GuilabelType getGuilabel();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getGuilabel <em>Guilabel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Guilabel</em>' containment reference.
	 * @see #getGuilabel()
	 * @generated
	 */
	void setGuilabel(GuilabelType value);

	/**
	 * Returns the value of the '<em><b>Guimenu</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guimenu</em>' containment reference.
	 * @see #setGuimenu(GuimenuType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Guimenu()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='guimenu' namespace='##targetNamespace'"
	 * @generated
	 */
	GuimenuType getGuimenu();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getGuimenu <em>Guimenu</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Guimenu</em>' containment reference.
	 * @see #getGuimenu()
	 * @generated
	 */
	void setGuimenu(GuimenuType value);

	/**
	 * Returns the value of the '<em><b>Guimenuitem</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guimenuitem</em>' containment reference.
	 * @see #setGuimenuitem(GuimenuitemType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Guimenuitem()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='guimenuitem' namespace='##targetNamespace'"
	 * @generated
	 */
	GuimenuitemType getGuimenuitem();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getGuimenuitem <em>Guimenuitem</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Guimenuitem</em>' containment reference.
	 * @see #getGuimenuitem()
	 * @generated
	 */
	void setGuimenuitem(GuimenuitemType value);

	/**
	 * Returns the value of the '<em><b>Guisubmenu</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guisubmenu</em>' containment reference.
	 * @see #setGuisubmenu(GuisubmenuType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Guisubmenu()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='guisubmenu' namespace='##targetNamespace'"
	 * @generated
	 */
	GuisubmenuType getGuisubmenu();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getGuisubmenu <em>Guisubmenu</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Guisubmenu</em>' containment reference.
	 * @see #getGuisubmenu()
	 * @generated
	 */
	void setGuisubmenu(GuisubmenuType value);

	/**
	 * Returns the value of the '<em><b>Hardware</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hardware</em>' containment reference.
	 * @see #setHardware(HardwareType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Hardware()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='hardware' namespace='##targetNamespace'"
	 * @generated
	 */
	HardwareType getHardware();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getHardware <em>Hardware</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hardware</em>' containment reference.
	 * @see #getHardware()
	 * @generated
	 */
	void setHardware(HardwareType value);

	/**
	 * Returns the value of the '<em><b>Holder</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Holder</em>' containment reference.
	 * @see #setHolder(HolderType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Holder()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='holder' namespace='##targetNamespace'"
	 * @generated
	 */
	HolderType getHolder();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getHolder <em>Holder</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Holder</em>' containment reference.
	 * @see #getHolder()
	 * @generated
	 */
	void setHolder(HolderType value);

	/**
	 * Returns the value of the '<em><b>Honorific</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Honorific</em>' containment reference.
	 * @see #setHonorific(HonorificType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Honorific()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='honorific' namespace='##targetNamespace'"
	 * @generated
	 */
	HonorificType getHonorific();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getHonorific <em>Honorific</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Honorific</em>' containment reference.
	 * @see #getHonorific()
	 * @generated
	 */
	void setHonorific(HonorificType value);

	/**
	 * Returns the value of the '<em><b>Imagedata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imagedata</em>' containment reference.
	 * @see #setImagedata(ImagedataType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Imagedata()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='imagedata' namespace='##targetNamespace'"
	 * @generated
	 */
	ImagedataType getImagedata();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getImagedata <em>Imagedata</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Imagedata</em>' containment reference.
	 * @see #getImagedata()
	 * @generated
	 */
	void setImagedata(ImagedataType value);

	/**
	 * Returns the value of the '<em><b>Imageobject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imageobject</em>' containment reference.
	 * @see #setImageobject(ImageobjectType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Imageobject()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='imageobject' namespace='##targetNamespace'"
	 * @generated
	 */
	ImageobjectType getImageobject();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getImageobject <em>Imageobject</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Imageobject</em>' containment reference.
	 * @see #getImageobject()
	 * @generated
	 */
	void setImageobject(ImageobjectType value);

	/**
	 * Returns the value of the '<em><b>Imageobjectco</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imageobjectco</em>' containment reference.
	 * @see #setImageobjectco(ImageobjectcoType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Imageobjectco()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='imageobjectco' namespace='##targetNamespace'"
	 * @generated
	 */
	ImageobjectcoType getImageobjectco();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getImageobjectco <em>Imageobjectco</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Imageobjectco</em>' containment reference.
	 * @see #getImageobjectco()
	 * @generated
	 */
	void setImageobjectco(ImageobjectcoType value);

	/**
	 * Returns the value of the '<em><b>Important</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Important</em>' containment reference.
	 * @see #setImportant(ImportantType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Important()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='important' namespace='##targetNamespace'"
	 * @generated
	 */
	ImportantType getImportant();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getImportant <em>Important</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Important</em>' containment reference.
	 * @see #getImportant()
	 * @generated
	 */
	void setImportant(ImportantType value);

	/**
	 * Returns the value of the '<em><b>Index</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Index</em>' containment reference.
	 * @see #setIndex(IndexType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Index()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='index' namespace='##targetNamespace'"
	 * @generated
	 */
	IndexType getIndex();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getIndex <em>Index</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Index</em>' containment reference.
	 * @see #getIndex()
	 * @generated
	 */
	void setIndex(IndexType value);

	/**
	 * Returns the value of the '<em><b>Indexdiv</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Indexdiv</em>' containment reference.
	 * @see #setIndexdiv(IndexdivType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Indexdiv()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='indexdiv' namespace='##targetNamespace'"
	 * @generated
	 */
	IndexdivType getIndexdiv();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getIndexdiv <em>Indexdiv</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Indexdiv</em>' containment reference.
	 * @see #getIndexdiv()
	 * @generated
	 */
	void setIndexdiv(IndexdivType value);

	/**
	 * Returns the value of the '<em><b>Indexentry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Indexentry</em>' containment reference.
	 * @see #setIndexentry(IndexentryType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Indexentry()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='indexentry' namespace='##targetNamespace'"
	 * @generated
	 */
	IndexentryType getIndexentry();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getIndexentry <em>Indexentry</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Indexentry</em>' containment reference.
	 * @see #getIndexentry()
	 * @generated
	 */
	void setIndexentry(IndexentryType value);

	/**
	 * Returns the value of the '<em><b>Indexterm</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Indexterm</em>' containment reference.
	 * @see #setIndexterm(IndextermType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Indexterm()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='indexterm' namespace='##targetNamespace'"
	 * @generated
	 */
	IndextermType getIndexterm();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getIndexterm <em>Indexterm</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Indexterm</em>' containment reference.
	 * @see #getIndexterm()
	 * @generated
	 */
	void setIndexterm(IndextermType value);

	/**
	 * Returns the value of the '<em><b>Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Info</em>' containment reference.
	 * @see #setInfo(InfoType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Info()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='info' namespace='##targetNamespace'"
	 * @generated
	 */
	InfoType getInfo();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getInfo <em>Info</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Info</em>' containment reference.
	 * @see #getInfo()
	 * @generated
	 */
	void setInfo(InfoType value);

	/**
	 * Returns the value of the '<em><b>Informalequation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Informalequation</em>' containment reference.
	 * @see #setInformalequation(InformalequationType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Informalequation()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='informalequation' namespace='##targetNamespace'"
	 * @generated
	 */
	InformalequationType getInformalequation();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getInformalequation <em>Informalequation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Informalequation</em>' containment reference.
	 * @see #getInformalequation()
	 * @generated
	 */
	void setInformalequation(InformalequationType value);

	/**
	 * Returns the value of the '<em><b>Informalexample</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Informalexample</em>' containment reference.
	 * @see #setInformalexample(InformalexampleType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Informalexample()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='informalexample' namespace='##targetNamespace'"
	 * @generated
	 */
	InformalexampleType getInformalexample();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getInformalexample <em>Informalexample</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Informalexample</em>' containment reference.
	 * @see #getInformalexample()
	 * @generated
	 */
	void setInformalexample(InformalexampleType value);

	/**
	 * Returns the value of the '<em><b>Informalfigure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Informalfigure</em>' containment reference.
	 * @see #setInformalfigure(InformalfigureType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Informalfigure()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='informalfigure' namespace='##targetNamespace'"
	 * @generated
	 */
	InformalfigureType getInformalfigure();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getInformalfigure <em>Informalfigure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Informalfigure</em>' containment reference.
	 * @see #getInformalfigure()
	 * @generated
	 */
	void setInformalfigure(InformalfigureType value);

	/**
	 * Returns the value of the '<em><b>Informaltable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Informaltable</em>' containment reference.
	 * @see #setInformaltable(InformaltableType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Informaltable()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='informaltable' namespace='##targetNamespace'"
	 * @generated
	 */
	InformaltableType getInformaltable();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getInformaltable <em>Informaltable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Informaltable</em>' containment reference.
	 * @see #getInformaltable()
	 * @generated
	 */
	void setInformaltable(InformaltableType value);

	/**
	 * Returns the value of the '<em><b>Initializer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initializer</em>' containment reference.
	 * @see #setInitializer(InitializerType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Initializer()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='initializer' namespace='##targetNamespace'"
	 * @generated
	 */
	InitializerType getInitializer();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getInitializer <em>Initializer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initializer</em>' containment reference.
	 * @see #getInitializer()
	 * @generated
	 */
	void setInitializer(InitializerType value);

	/**
	 * Returns the value of the '<em><b>Inlineequation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inlineequation</em>' containment reference.
	 * @see #setInlineequation(InlineequationType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Inlineequation()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='inlineequation' namespace='##targetNamespace'"
	 * @generated
	 */
	InlineequationType getInlineequation();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getInlineequation <em>Inlineequation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inlineequation</em>' containment reference.
	 * @see #getInlineequation()
	 * @generated
	 */
	void setInlineequation(InlineequationType value);

	/**
	 * Returns the value of the '<em><b>Inlinemediaobject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inlinemediaobject</em>' containment reference.
	 * @see #setInlinemediaobject(InlinemediaobjectType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Inlinemediaobject()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='inlinemediaobject' namespace='##targetNamespace'"
	 * @generated
	 */
	InlinemediaobjectType getInlinemediaobject();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getInlinemediaobject <em>Inlinemediaobject</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inlinemediaobject</em>' containment reference.
	 * @see #getInlinemediaobject()
	 * @generated
	 */
	void setInlinemediaobject(InlinemediaobjectType value);

	/**
	 * Returns the value of the '<em><b>Interfacename</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interfacename</em>' containment reference.
	 * @see #setInterfacename(InterfacenameType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Interfacename()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='interfacename' namespace='##targetNamespace'"
	 * @generated
	 */
	InterfacenameType getInterfacename();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getInterfacename <em>Interfacename</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interfacename</em>' containment reference.
	 * @see #getInterfacename()
	 * @generated
	 */
	void setInterfacename(InterfacenameType value);

	/**
	 * Returns the value of the '<em><b>Issuenum</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Issuenum</em>' containment reference.
	 * @see #setIssuenum(IssuenumType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Issuenum()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='issuenum' namespace='##targetNamespace'"
	 * @generated
	 */
	IssuenumType getIssuenum();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getIssuenum <em>Issuenum</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Issuenum</em>' containment reference.
	 * @see #getIssuenum()
	 * @generated
	 */
	void setIssuenum(IssuenumType value);

	/**
	 * Returns the value of the '<em><b>Itemizedlist</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Itemizedlist</em>' containment reference.
	 * @see #setItemizedlist(ItemizedlistType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Itemizedlist()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='itemizedlist' namespace='##targetNamespace'"
	 * @generated
	 */
	ItemizedlistType getItemizedlist();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getItemizedlist <em>Itemizedlist</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Itemizedlist</em>' containment reference.
	 * @see #getItemizedlist()
	 * @generated
	 */
	void setItemizedlist(ItemizedlistType value);

	/**
	 * Returns the value of the '<em><b>Itermset</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Itermset</em>' containment reference.
	 * @see #setItermset(ItermsetType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Itermset()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='itermset' namespace='##targetNamespace'"
	 * @generated
	 */
	ItermsetType getItermset();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getItermset <em>Itermset</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Itermset</em>' containment reference.
	 * @see #getItermset()
	 * @generated
	 */
	void setItermset(ItermsetType value);

	/**
	 * Returns the value of the '<em><b>Jobtitle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jobtitle</em>' containment reference.
	 * @see #setJobtitle(JobtitleType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Jobtitle()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='jobtitle' namespace='##targetNamespace'"
	 * @generated
	 */
	JobtitleType getJobtitle();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getJobtitle <em>Jobtitle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jobtitle</em>' containment reference.
	 * @see #getJobtitle()
	 * @generated
	 */
	void setJobtitle(JobtitleType value);

	/**
	 * Returns the value of the '<em><b>Keycap</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Keycap</em>' containment reference.
	 * @see #setKeycap(KeycapType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Keycap()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='keycap' namespace='##targetNamespace'"
	 * @generated
	 */
	KeycapType getKeycap();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getKeycap <em>Keycap</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Keycap</em>' containment reference.
	 * @see #getKeycap()
	 * @generated
	 */
	void setKeycap(KeycapType value);

	/**
	 * Returns the value of the '<em><b>Keycode</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Keycode</em>' containment reference.
	 * @see #setKeycode(KeycodeType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Keycode()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='keycode' namespace='##targetNamespace'"
	 * @generated
	 */
	KeycodeType getKeycode();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getKeycode <em>Keycode</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Keycode</em>' containment reference.
	 * @see #getKeycode()
	 * @generated
	 */
	void setKeycode(KeycodeType value);

	/**
	 * Returns the value of the '<em><b>Keycombo</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Keycombo</em>' containment reference.
	 * @see #setKeycombo(KeycomboType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Keycombo()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='keycombo' namespace='##targetNamespace'"
	 * @generated
	 */
	KeycomboType getKeycombo();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getKeycombo <em>Keycombo</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Keycombo</em>' containment reference.
	 * @see #getKeycombo()
	 * @generated
	 */
	void setKeycombo(KeycomboType value);

	/**
	 * Returns the value of the '<em><b>Keysym</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Keysym</em>' containment reference.
	 * @see #setKeysym(KeysymType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Keysym()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='keysym' namespace='##targetNamespace'"
	 * @generated
	 */
	KeysymType getKeysym();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getKeysym <em>Keysym</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Keysym</em>' containment reference.
	 * @see #getKeysym()
	 * @generated
	 */
	void setKeysym(KeysymType value);

	/**
	 * Returns the value of the '<em><b>Keyword</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Keyword</em>' containment reference.
	 * @see #setKeyword(KeywordType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Keyword()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='keyword' namespace='##targetNamespace'"
	 * @generated
	 */
	KeywordType getKeyword();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getKeyword <em>Keyword</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Keyword</em>' containment reference.
	 * @see #getKeyword()
	 * @generated
	 */
	void setKeyword(KeywordType value);

	/**
	 * Returns the value of the '<em><b>Keywordset</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Keywordset</em>' containment reference.
	 * @see #setKeywordset(KeywordsetType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Keywordset()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='keywordset' namespace='##targetNamespace'"
	 * @generated
	 */
	KeywordsetType getKeywordset();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getKeywordset <em>Keywordset</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Keywordset</em>' containment reference.
	 * @see #getKeywordset()
	 * @generated
	 */
	void setKeywordset(KeywordsetType value);

	/**
	 * Returns the value of the '<em><b>Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' containment reference.
	 * @see #setLabel(LabelType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Label()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='label' namespace='##targetNamespace'"
	 * @generated
	 */
	LabelType getLabel();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getLabel <em>Label</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' containment reference.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(LabelType value);

	/**
	 * Returns the value of the '<em><b>Legalnotice</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Legalnotice</em>' containment reference.
	 * @see #setLegalnotice(LegalnoticeType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Legalnotice()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='legalnotice' namespace='##targetNamespace'"
	 * @generated
	 */
	LegalnoticeType getLegalnotice();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getLegalnotice <em>Legalnotice</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Legalnotice</em>' containment reference.
	 * @see #getLegalnotice()
	 * @generated
	 */
	void setLegalnotice(LegalnoticeType value);

	/**
	 * Returns the value of the '<em><b>Lhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lhs</em>' containment reference.
	 * @see #setLhs(LhsType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Lhs()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='lhs' namespace='##targetNamespace'"
	 * @generated
	 */
	LhsType getLhs();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getLhs <em>Lhs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lhs</em>' containment reference.
	 * @see #getLhs()
	 * @generated
	 */
	void setLhs(LhsType value);

	/**
	 * Returns the value of the '<em><b>Lineage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lineage</em>' containment reference.
	 * @see #setLineage(LineageType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Lineage()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='lineage' namespace='##targetNamespace'"
	 * @generated
	 */
	LineageType getLineage();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getLineage <em>Lineage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lineage</em>' containment reference.
	 * @see #getLineage()
	 * @generated
	 */
	void setLineage(LineageType value);

	/**
	 * Returns the value of the '<em><b>Lineannotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lineannotation</em>' containment reference.
	 * @see #setLineannotation(LineannotationType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Lineannotation()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='lineannotation' namespace='##targetNamespace'"
	 * @generated
	 */
	LineannotationType getLineannotation();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getLineannotation <em>Lineannotation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lineannotation</em>' containment reference.
	 * @see #getLineannotation()
	 * @generated
	 */
	void setLineannotation(LineannotationType value);

	/**
	 * Returns the value of the '<em><b>Link</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link</em>' containment reference.
	 * @see #setLink(LinkType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Link()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='link' namespace='##targetNamespace'"
	 * @generated
	 */
	LinkType getLink();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getLink <em>Link</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Link</em>' containment reference.
	 * @see #getLink()
	 * @generated
	 */
	void setLink(LinkType value);

	/**
	 * Returns the value of the '<em><b>Listitem</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Listitem</em>' containment reference.
	 * @see #setListitem(ListitemType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Listitem()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='listitem' namespace='##targetNamespace'"
	 * @generated
	 */
	ListitemType getListitem();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getListitem <em>Listitem</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Listitem</em>' containment reference.
	 * @see #getListitem()
	 * @generated
	 */
	void setListitem(ListitemType value);

	/**
	 * Returns the value of the '<em><b>Literal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Literal</em>' containment reference.
	 * @see #setLiteral(LiteralType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Literal()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='literal' namespace='##targetNamespace'"
	 * @generated
	 */
	LiteralType getLiteral();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getLiteral <em>Literal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Literal</em>' containment reference.
	 * @see #getLiteral()
	 * @generated
	 */
	void setLiteral(LiteralType value);

	/**
	 * Returns the value of the '<em><b>Literallayout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Literallayout</em>' containment reference.
	 * @see #setLiterallayout(LiterallayoutType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Literallayout()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='literallayout' namespace='##targetNamespace'"
	 * @generated
	 */
	LiterallayoutType getLiterallayout();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getLiterallayout <em>Literallayout</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Literallayout</em>' containment reference.
	 * @see #getLiterallayout()
	 * @generated
	 */
	void setLiterallayout(LiterallayoutType value);

	/**
	 * Returns the value of the '<em><b>Locator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Locator</em>' containment reference.
	 * @see #setLocator(LocatorType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Locator()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='locator' namespace='##targetNamespace'"
	 * @generated
	 */
	LocatorType getLocator();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getLocator <em>Locator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Locator</em>' containment reference.
	 * @see #getLocator()
	 * @generated
	 */
	void setLocator(LocatorType value);

	/**
	 * Returns the value of the '<em><b>Manvolnum</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Manvolnum</em>' containment reference.
	 * @see #setManvolnum(ManvolnumType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Manvolnum()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='manvolnum' namespace='##targetNamespace'"
	 * @generated
	 */
	ManvolnumType getManvolnum();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getManvolnum <em>Manvolnum</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Manvolnum</em>' containment reference.
	 * @see #getManvolnum()
	 * @generated
	 */
	void setManvolnum(ManvolnumType value);

	/**
	 * Returns the value of the '<em><b>Markup</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Markup</em>' containment reference.
	 * @see #setMarkup(MarkupType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Markup()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='markup' namespace='##targetNamespace'"
	 * @generated
	 */
	MarkupType getMarkup();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getMarkup <em>Markup</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Markup</em>' containment reference.
	 * @see #getMarkup()
	 * @generated
	 */
	void setMarkup(MarkupType value);

	/**
	 * Returns the value of the '<em><b>Mathphrase</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mathphrase</em>' containment reference.
	 * @see #setMathphrase(MathphraseType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Mathphrase()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='mathphrase' namespace='##targetNamespace'"
	 * @generated
	 */
	MathphraseType getMathphrase();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getMathphrase <em>Mathphrase</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mathphrase</em>' containment reference.
	 * @see #getMathphrase()
	 * @generated
	 */
	void setMathphrase(MathphraseType value);

	/**
	 * Returns the value of the '<em><b>Mediaobject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mediaobject</em>' containment reference.
	 * @see #setMediaobject(MediaobjectType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Mediaobject()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='mediaobject' namespace='##targetNamespace'"
	 * @generated
	 */
	MediaobjectType getMediaobject();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getMediaobject <em>Mediaobject</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mediaobject</em>' containment reference.
	 * @see #getMediaobject()
	 * @generated
	 */
	void setMediaobject(MediaobjectType value);

	/**
	 * Returns the value of the '<em><b>Member</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Member</em>' containment reference.
	 * @see #setMember(MemberType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Member()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='member' namespace='##targetNamespace'"
	 * @generated
	 */
	MemberType getMember();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getMember <em>Member</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Member</em>' containment reference.
	 * @see #getMember()
	 * @generated
	 */
	void setMember(MemberType value);

	/**
	 * Returns the value of the '<em><b>Menuchoice</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Menuchoice</em>' containment reference.
	 * @see #setMenuchoice(MenuchoiceType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Menuchoice()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='menuchoice' namespace='##targetNamespace'"
	 * @generated
	 */
	MenuchoiceType getMenuchoice();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getMenuchoice <em>Menuchoice</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Menuchoice</em>' containment reference.
	 * @see #getMenuchoice()
	 * @generated
	 */
	void setMenuchoice(MenuchoiceType value);

	/**
	 * Returns the value of the '<em><b>Methodname</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Methodname</em>' containment reference.
	 * @see #setMethodname(MethodnameType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Methodname()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='methodname' namespace='##targetNamespace'"
	 * @generated
	 */
	MethodnameType getMethodname();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getMethodname <em>Methodname</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Methodname</em>' containment reference.
	 * @see #getMethodname()
	 * @generated
	 */
	void setMethodname(MethodnameType value);

	/**
	 * Returns the value of the '<em><b>Methodparam</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Methodparam</em>' containment reference.
	 * @see #setMethodparam(MethodparamType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Methodparam()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='methodparam' namespace='##targetNamespace'"
	 * @generated
	 */
	MethodparamType getMethodparam();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getMethodparam <em>Methodparam</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Methodparam</em>' containment reference.
	 * @see #getMethodparam()
	 * @generated
	 */
	void setMethodparam(MethodparamType value);

	/**
	 * Returns the value of the '<em><b>Methodsynopsis</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Methodsynopsis</em>' containment reference.
	 * @see #setMethodsynopsis(MethodsynopsisType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Methodsynopsis()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='methodsynopsis' namespace='##targetNamespace'"
	 * @generated
	 */
	MethodsynopsisType getMethodsynopsis();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getMethodsynopsis <em>Methodsynopsis</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Methodsynopsis</em>' containment reference.
	 * @see #getMethodsynopsis()
	 * @generated
	 */
	void setMethodsynopsis(MethodsynopsisType value);

	/**
	 * Returns the value of the '<em><b>Modifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modifier</em>' containment reference.
	 * @see #setModifier(ModifierType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Modifier()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='modifier' namespace='##targetNamespace'"
	 * @generated
	 */
	ModifierType getModifier();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getModifier <em>Modifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modifier</em>' containment reference.
	 * @see #getModifier()
	 * @generated
	 */
	void setModifier(ModifierType value);

	/**
	 * Returns the value of the '<em><b>Mousebutton</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mousebutton</em>' containment reference.
	 * @see #setMousebutton(MousebuttonType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Mousebutton()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='mousebutton' namespace='##targetNamespace'"
	 * @generated
	 */
	MousebuttonType getMousebutton();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getMousebutton <em>Mousebutton</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mousebutton</em>' containment reference.
	 * @see #getMousebutton()
	 * @generated
	 */
	void setMousebutton(MousebuttonType value);

	/**
	 * Returns the value of the '<em><b>Msg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Msg</em>' containment reference.
	 * @see #setMsg(MsgType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Msg()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='msg' namespace='##targetNamespace'"
	 * @generated
	 */
	MsgType getMsg();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getMsg <em>Msg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Msg</em>' containment reference.
	 * @see #getMsg()
	 * @generated
	 */
	void setMsg(MsgType value);

	/**
	 * Returns the value of the '<em><b>Msgaud</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Msgaud</em>' containment reference.
	 * @see #setMsgaud(MsgaudType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Msgaud()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='msgaud' namespace='##targetNamespace'"
	 * @generated
	 */
	MsgaudType getMsgaud();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getMsgaud <em>Msgaud</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Msgaud</em>' containment reference.
	 * @see #getMsgaud()
	 * @generated
	 */
	void setMsgaud(MsgaudType value);

	/**
	 * Returns the value of the '<em><b>Msgentry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Msgentry</em>' containment reference.
	 * @see #setMsgentry(MsgentryType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Msgentry()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='msgentry' namespace='##targetNamespace'"
	 * @generated
	 */
	MsgentryType getMsgentry();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getMsgentry <em>Msgentry</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Msgentry</em>' containment reference.
	 * @see #getMsgentry()
	 * @generated
	 */
	void setMsgentry(MsgentryType value);

	/**
	 * Returns the value of the '<em><b>Msgexplan</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Msgexplan</em>' containment reference.
	 * @see #setMsgexplan(MsgexplanType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Msgexplan()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='msgexplan' namespace='##targetNamespace'"
	 * @generated
	 */
	MsgexplanType getMsgexplan();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getMsgexplan <em>Msgexplan</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Msgexplan</em>' containment reference.
	 * @see #getMsgexplan()
	 * @generated
	 */
	void setMsgexplan(MsgexplanType value);

	/**
	 * Returns the value of the '<em><b>Msginfo</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Msginfo</em>' containment reference.
	 * @see #setMsginfo(MsginfoType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Msginfo()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='msginfo' namespace='##targetNamespace'"
	 * @generated
	 */
	MsginfoType getMsginfo();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getMsginfo <em>Msginfo</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Msginfo</em>' containment reference.
	 * @see #getMsginfo()
	 * @generated
	 */
	void setMsginfo(MsginfoType value);

	/**
	 * Returns the value of the '<em><b>Msglevel</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Msglevel</em>' containment reference.
	 * @see #setMsglevel(MsglevelType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Msglevel()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='msglevel' namespace='##targetNamespace'"
	 * @generated
	 */
	MsglevelType getMsglevel();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getMsglevel <em>Msglevel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Msglevel</em>' containment reference.
	 * @see #getMsglevel()
	 * @generated
	 */
	void setMsglevel(MsglevelType value);

	/**
	 * Returns the value of the '<em><b>Msgmain</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Msgmain</em>' containment reference.
	 * @see #setMsgmain(MsgmainType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Msgmain()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='msgmain' namespace='##targetNamespace'"
	 * @generated
	 */
	MsgmainType getMsgmain();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getMsgmain <em>Msgmain</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Msgmain</em>' containment reference.
	 * @see #getMsgmain()
	 * @generated
	 */
	void setMsgmain(MsgmainType value);

	/**
	 * Returns the value of the '<em><b>Msgorig</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Msgorig</em>' containment reference.
	 * @see #setMsgorig(MsgorigType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Msgorig()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='msgorig' namespace='##targetNamespace'"
	 * @generated
	 */
	MsgorigType getMsgorig();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getMsgorig <em>Msgorig</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Msgorig</em>' containment reference.
	 * @see #getMsgorig()
	 * @generated
	 */
	void setMsgorig(MsgorigType value);

	/**
	 * Returns the value of the '<em><b>Msgrel</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Msgrel</em>' containment reference.
	 * @see #setMsgrel(MsgrelType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Msgrel()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='msgrel' namespace='##targetNamespace'"
	 * @generated
	 */
	MsgrelType getMsgrel();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getMsgrel <em>Msgrel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Msgrel</em>' containment reference.
	 * @see #getMsgrel()
	 * @generated
	 */
	void setMsgrel(MsgrelType value);

	/**
	 * Returns the value of the '<em><b>Msgset</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Msgset</em>' containment reference.
	 * @see #setMsgset(MsgsetType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Msgset()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='msgset' namespace='##targetNamespace'"
	 * @generated
	 */
	MsgsetType getMsgset();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getMsgset <em>Msgset</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Msgset</em>' containment reference.
	 * @see #getMsgset()
	 * @generated
	 */
	void setMsgset(MsgsetType value);

	/**
	 * Returns the value of the '<em><b>Msgsub</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Msgsub</em>' containment reference.
	 * @see #setMsgsub(MsgsubType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Msgsub()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='msgsub' namespace='##targetNamespace'"
	 * @generated
	 */
	MsgsubType getMsgsub();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getMsgsub <em>Msgsub</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Msgsub</em>' containment reference.
	 * @see #getMsgsub()
	 * @generated
	 */
	void setMsgsub(MsgsubType value);

	/**
	 * Returns the value of the '<em><b>Msgtext</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Msgtext</em>' containment reference.
	 * @see #setMsgtext(MsgtextType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Msgtext()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='msgtext' namespace='##targetNamespace'"
	 * @generated
	 */
	MsgtextType getMsgtext();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getMsgtext <em>Msgtext</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Msgtext</em>' containment reference.
	 * @see #getMsgtext()
	 * @generated
	 */
	void setMsgtext(MsgtextType value);

	/**
	 * Returns the value of the '<em><b>Nonterminal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nonterminal</em>' containment reference.
	 * @see #setNonterminal(NonterminalType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Nonterminal()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='nonterminal' namespace='##targetNamespace'"
	 * @generated
	 */
	NonterminalType getNonterminal();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getNonterminal <em>Nonterminal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nonterminal</em>' containment reference.
	 * @see #getNonterminal()
	 * @generated
	 */
	void setNonterminal(NonterminalType value);

	/**
	 * Returns the value of the '<em><b>Note</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Note</em>' containment reference.
	 * @see #setNote(NoteType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Note()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='note' namespace='##targetNamespace'"
	 * @generated
	 */
	NoteType getNote();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getNote <em>Note</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Note</em>' containment reference.
	 * @see #getNote()
	 * @generated
	 */
	void setNote(NoteType value);

	/**
	 * Returns the value of the '<em><b>Olink</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Olink</em>' containment reference.
	 * @see #setOlink(OlinkType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Olink()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='olink' namespace='##targetNamespace'"
	 * @generated
	 */
	OlinkType getOlink();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getOlink <em>Olink</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Olink</em>' containment reference.
	 * @see #getOlink()
	 * @generated
	 */
	void setOlink(OlinkType value);

	/**
	 * Returns the value of the '<em><b>Ooclass</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ooclass</em>' containment reference.
	 * @see #setOoclass(OoclassType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Ooclass()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ooclass' namespace='##targetNamespace'"
	 * @generated
	 */
	OoclassType getOoclass();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getOoclass <em>Ooclass</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ooclass</em>' containment reference.
	 * @see #getOoclass()
	 * @generated
	 */
	void setOoclass(OoclassType value);

	/**
	 * Returns the value of the '<em><b>Ooexception</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ooexception</em>' containment reference.
	 * @see #setOoexception(OoexceptionType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Ooexception()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ooexception' namespace='##targetNamespace'"
	 * @generated
	 */
	OoexceptionType getOoexception();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getOoexception <em>Ooexception</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ooexception</em>' containment reference.
	 * @see #getOoexception()
	 * @generated
	 */
	void setOoexception(OoexceptionType value);

	/**
	 * Returns the value of the '<em><b>Oointerface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Oointerface</em>' containment reference.
	 * @see #setOointerface(OointerfaceType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Oointerface()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='oointerface' namespace='##targetNamespace'"
	 * @generated
	 */
	OointerfaceType getOointerface();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getOointerface <em>Oointerface</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Oointerface</em>' containment reference.
	 * @see #getOointerface()
	 * @generated
	 */
	void setOointerface(OointerfaceType value);

	/**
	 * Returns the value of the '<em><b>Option</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Option</em>' containment reference.
	 * @see #setOption(OptionType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Option()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='option' namespace='##targetNamespace'"
	 * @generated
	 */
	OptionType getOption();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getOption <em>Option</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Option</em>' containment reference.
	 * @see #getOption()
	 * @generated
	 */
	void setOption(OptionType value);

	/**
	 * Returns the value of the '<em><b>Optional</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Optional</em>' containment reference.
	 * @see #setOptional(OptionalType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Optional()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='optional' namespace='##targetNamespace'"
	 * @generated
	 */
	OptionalType getOptional();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getOptional <em>Optional</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Optional</em>' containment reference.
	 * @see #getOptional()
	 * @generated
	 */
	void setOptional(OptionalType value);

	/**
	 * Returns the value of the '<em><b>Orderedlist</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Orderedlist</em>' containment reference.
	 * @see #setOrderedlist(OrderedlistType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Orderedlist()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='orderedlist' namespace='##targetNamespace'"
	 * @generated
	 */
	OrderedlistType getOrderedlist();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getOrderedlist <em>Orderedlist</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Orderedlist</em>' containment reference.
	 * @see #getOrderedlist()
	 * @generated
	 */
	void setOrderedlist(OrderedlistType value);

	/**
	 * Returns the value of the '<em><b>Org</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Org</em>' containment reference.
	 * @see #setOrg(OrgType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Org()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='org' namespace='##targetNamespace'"
	 * @generated
	 */
	OrgType getOrg();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getOrg <em>Org</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Org</em>' containment reference.
	 * @see #getOrg()
	 * @generated
	 */
	void setOrg(OrgType value);

	/**
	 * Returns the value of the '<em><b>Orgdiv</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Orgdiv</em>' containment reference.
	 * @see #setOrgdiv(OrgdivType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Orgdiv()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='orgdiv' namespace='##targetNamespace'"
	 * @generated
	 */
	OrgdivType getOrgdiv();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getOrgdiv <em>Orgdiv</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Orgdiv</em>' containment reference.
	 * @see #getOrgdiv()
	 * @generated
	 */
	void setOrgdiv(OrgdivType value);

	/**
	 * Returns the value of the '<em><b>Orgname</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Orgname</em>' containment reference.
	 * @see #setOrgname(OrgnameType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Orgname()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='orgname' namespace='##targetNamespace'"
	 * @generated
	 */
	OrgnameType getOrgname();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getOrgname <em>Orgname</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Orgname</em>' containment reference.
	 * @see #getOrgname()
	 * @generated
	 */
	void setOrgname(OrgnameType value);

	/**
	 * Returns the value of the '<em><b>Otheraddr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Otheraddr</em>' containment reference.
	 * @see #setOtheraddr(OtheraddrType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Otheraddr()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='otheraddr' namespace='##targetNamespace'"
	 * @generated
	 */
	OtheraddrType getOtheraddr();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getOtheraddr <em>Otheraddr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Otheraddr</em>' containment reference.
	 * @see #getOtheraddr()
	 * @generated
	 */
	void setOtheraddr(OtheraddrType value);

	/**
	 * Returns the value of the '<em><b>Othercredit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Othercredit</em>' containment reference.
	 * @see #setOthercredit(OthercreditType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Othercredit()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='othercredit' namespace='##targetNamespace'"
	 * @generated
	 */
	OthercreditType getOthercredit();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getOthercredit <em>Othercredit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Othercredit</em>' containment reference.
	 * @see #getOthercredit()
	 * @generated
	 */
	void setOthercredit(OthercreditType value);

	/**
	 * Returns the value of the '<em><b>Othername</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Othername</em>' containment reference.
	 * @see #setOthername(OthernameType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Othername()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='othername' namespace='##targetNamespace'"
	 * @generated
	 */
	OthernameType getOthername();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getOthername <em>Othername</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Othername</em>' containment reference.
	 * @see #getOthername()
	 * @generated
	 */
	void setOthername(OthernameType value);

	/**
	 * Returns the value of the '<em><b>Package</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package</em>' containment reference.
	 * @see #setPackage(PackageType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Package()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='package' namespace='##targetNamespace'"
	 * @generated
	 */
	PackageType getPackage();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getPackage <em>Package</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package</em>' containment reference.
	 * @see #getPackage()
	 * @generated
	 */
	void setPackage(PackageType value);

	/**
	 * Returns the value of the '<em><b>Pagenums</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pagenums</em>' containment reference.
	 * @see #setPagenums(PagenumsType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Pagenums()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='pagenums' namespace='##targetNamespace'"
	 * @generated
	 */
	PagenumsType getPagenums();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getPagenums <em>Pagenums</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pagenums</em>' containment reference.
	 * @see #getPagenums()
	 * @generated
	 */
	void setPagenums(PagenumsType value);

	/**
	 * Returns the value of the '<em><b>Para</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Para</em>' containment reference.
	 * @see #setPara(ParaType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Para()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='para' namespace='##targetNamespace'"
	 * @generated
	 */
	ParaType getPara();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getPara <em>Para</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Para</em>' containment reference.
	 * @see #getPara()
	 * @generated
	 */
	void setPara(ParaType value);

	/**
	 * Returns the value of the '<em><b>Paramdef</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Paramdef</em>' containment reference.
	 * @see #setParamdef(ParamdefType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Paramdef()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='paramdef' namespace='##targetNamespace'"
	 * @generated
	 */
	ParamdefType getParamdef();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getParamdef <em>Paramdef</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Paramdef</em>' containment reference.
	 * @see #getParamdef()
	 * @generated
	 */
	void setParamdef(ParamdefType value);

	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter</em>' containment reference.
	 * @see #setParameter(ParameterType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Parameter()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='parameter' namespace='##targetNamespace'"
	 * @generated
	 */
	ParameterType getParameter();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getParameter <em>Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter</em>' containment reference.
	 * @see #getParameter()
	 * @generated
	 */
	void setParameter(ParameterType value);

	/**
	 * Returns the value of the '<em><b>Part</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Part</em>' containment reference.
	 * @see #setPart(PartType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Part()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='part' namespace='##targetNamespace'"
	 * @generated
	 */
	PartType getPart();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getPart <em>Part</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Part</em>' containment reference.
	 * @see #getPart()
	 * @generated
	 */
	void setPart(PartType value);

	/**
	 * Returns the value of the '<em><b>Partintro</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Partintro</em>' containment reference.
	 * @see #setPartintro(PartintroType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Partintro()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='partintro' namespace='##targetNamespace'"
	 * @generated
	 */
	PartintroType getPartintro();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getPartintro <em>Partintro</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Partintro</em>' containment reference.
	 * @see #getPartintro()
	 * @generated
	 */
	void setPartintro(PartintroType value);

	/**
	 * Returns the value of the '<em><b>Person</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Person</em>' containment reference.
	 * @see #setPerson(PersonType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Person()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='person' namespace='##targetNamespace'"
	 * @generated
	 */
	PersonType getPerson();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getPerson <em>Person</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Person</em>' containment reference.
	 * @see #getPerson()
	 * @generated
	 */
	void setPerson(PersonType value);

	/**
	 * Returns the value of the '<em><b>Personblurb</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Personblurb</em>' containment reference.
	 * @see #setPersonblurb(PersonblurbType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Personblurb()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='personblurb' namespace='##targetNamespace'"
	 * @generated
	 */
	PersonblurbType getPersonblurb();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getPersonblurb <em>Personblurb</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Personblurb</em>' containment reference.
	 * @see #getPersonblurb()
	 * @generated
	 */
	void setPersonblurb(PersonblurbType value);

	/**
	 * Returns the value of the '<em><b>Personname</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Personname</em>' containment reference.
	 * @see #setPersonname(PersonnameType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Personname()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='personname' namespace='##targetNamespace'"
	 * @generated
	 */
	PersonnameType getPersonname();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getPersonname <em>Personname</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Personname</em>' containment reference.
	 * @see #getPersonname()
	 * @generated
	 */
	void setPersonname(PersonnameType value);

	/**
	 * Returns the value of the '<em><b>Phone</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phone</em>' containment reference.
	 * @see #setPhone(PhoneType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Phone()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='phone' namespace='##targetNamespace'"
	 * @generated
	 */
	PhoneType getPhone();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getPhone <em>Phone</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phone</em>' containment reference.
	 * @see #getPhone()
	 * @generated
	 */
	void setPhone(PhoneType value);

	/**
	 * Returns the value of the '<em><b>Phrase</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phrase</em>' containment reference.
	 * @see #setPhrase(PhraseType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Phrase()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='phrase' namespace='##targetNamespace'"
	 * @generated
	 */
	PhraseType getPhrase();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getPhrase <em>Phrase</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phrase</em>' containment reference.
	 * @see #getPhrase()
	 * @generated
	 */
	void setPhrase(PhraseType value);

	/**
	 * Returns the value of the '<em><b>Pob</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pob</em>' containment reference.
	 * @see #setPob(PobType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Pob()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='pob' namespace='##targetNamespace'"
	 * @generated
	 */
	PobType getPob();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getPob <em>Pob</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pob</em>' containment reference.
	 * @see #getPob()
	 * @generated
	 */
	void setPob(PobType value);

	/**
	 * Returns the value of the '<em><b>Postcode</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Postcode</em>' containment reference.
	 * @see #setPostcode(PostcodeType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Postcode()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='postcode' namespace='##targetNamespace'"
	 * @generated
	 */
	PostcodeType getPostcode();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getPostcode <em>Postcode</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Postcode</em>' containment reference.
	 * @see #getPostcode()
	 * @generated
	 */
	void setPostcode(PostcodeType value);

	/**
	 * Returns the value of the '<em><b>Preface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Preface</em>' containment reference.
	 * @see #setPreface(PrefaceType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Preface()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='preface' namespace='##targetNamespace'"
	 * @generated
	 */
	PrefaceType getPreface();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getPreface <em>Preface</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Preface</em>' containment reference.
	 * @see #getPreface()
	 * @generated
	 */
	void setPreface(PrefaceType value);

	/**
	 * Returns the value of the '<em><b>Primary</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primary</em>' containment reference.
	 * @see #setPrimary(PrimaryType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Primary()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='primary' namespace='##targetNamespace'"
	 * @generated
	 */
	PrimaryType getPrimary();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getPrimary <em>Primary</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Primary</em>' containment reference.
	 * @see #getPrimary()
	 * @generated
	 */
	void setPrimary(PrimaryType value);

	/**
	 * Returns the value of the '<em><b>Primaryie</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primaryie</em>' containment reference.
	 * @see #setPrimaryie(PrimaryieType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Primaryie()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='primaryie' namespace='##targetNamespace'"
	 * @generated
	 */
	PrimaryieType getPrimaryie();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getPrimaryie <em>Primaryie</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Primaryie</em>' containment reference.
	 * @see #getPrimaryie()
	 * @generated
	 */
	void setPrimaryie(PrimaryieType value);

	/**
	 * Returns the value of the '<em><b>Printhistory</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Printhistory</em>' containment reference.
	 * @see #setPrinthistory(PrinthistoryType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Printhistory()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='printhistory' namespace='##targetNamespace'"
	 * @generated
	 */
	PrinthistoryType getPrinthistory();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getPrinthistory <em>Printhistory</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Printhistory</em>' containment reference.
	 * @see #getPrinthistory()
	 * @generated
	 */
	void setPrinthistory(PrinthistoryType value);

	/**
	 * Returns the value of the '<em><b>Procedure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Procedure</em>' containment reference.
	 * @see #setProcedure(ProcedureType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Procedure()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='procedure' namespace='##targetNamespace'"
	 * @generated
	 */
	ProcedureType getProcedure();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getProcedure <em>Procedure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Procedure</em>' containment reference.
	 * @see #getProcedure()
	 * @generated
	 */
	void setProcedure(ProcedureType value);

	/**
	 * Returns the value of the '<em><b>Production</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Production</em>' containment reference.
	 * @see #setProduction(ProductionType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Production()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='production' namespace='##targetNamespace'"
	 * @generated
	 */
	ProductionType getProduction();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getProduction <em>Production</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Production</em>' containment reference.
	 * @see #getProduction()
	 * @generated
	 */
	void setProduction(ProductionType value);

	/**
	 * Returns the value of the '<em><b>Productionrecap</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Productionrecap</em>' containment reference.
	 * @see #setProductionrecap(ProductionrecapType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Productionrecap()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='productionrecap' namespace='##targetNamespace'"
	 * @generated
	 */
	ProductionrecapType getProductionrecap();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getProductionrecap <em>Productionrecap</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Productionrecap</em>' containment reference.
	 * @see #getProductionrecap()
	 * @generated
	 */
	void setProductionrecap(ProductionrecapType value);

	/**
	 * Returns the value of the '<em><b>Productionset</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Productionset</em>' containment reference.
	 * @see #setProductionset(ProductionsetType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Productionset()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='productionset' namespace='##targetNamespace'"
	 * @generated
	 */
	ProductionsetType getProductionset();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getProductionset <em>Productionset</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Productionset</em>' containment reference.
	 * @see #getProductionset()
	 * @generated
	 */
	void setProductionset(ProductionsetType value);

	/**
	 * Returns the value of the '<em><b>Productname</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Productname</em>' containment reference.
	 * @see #setProductname(ProductnameType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Productname()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='productname' namespace='##targetNamespace'"
	 * @generated
	 */
	ProductnameType getProductname();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getProductname <em>Productname</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Productname</em>' containment reference.
	 * @see #getProductname()
	 * @generated
	 */
	void setProductname(ProductnameType value);

	/**
	 * Returns the value of the '<em><b>Productnumber</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Productnumber</em>' containment reference.
	 * @see #setProductnumber(ProductnumberType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Productnumber()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='productnumber' namespace='##targetNamespace'"
	 * @generated
	 */
	ProductnumberType getProductnumber();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getProductnumber <em>Productnumber</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Productnumber</em>' containment reference.
	 * @see #getProductnumber()
	 * @generated
	 */
	void setProductnumber(ProductnumberType value);

	/**
	 * Returns the value of the '<em><b>Programlisting</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Programlisting</em>' containment reference.
	 * @see #setProgramlisting(ProgramlistingType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Programlisting()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='programlisting' namespace='##targetNamespace'"
	 * @generated
	 */
	ProgramlistingType getProgramlisting();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getProgramlisting <em>Programlisting</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Programlisting</em>' containment reference.
	 * @see #getProgramlisting()
	 * @generated
	 */
	void setProgramlisting(ProgramlistingType value);

	/**
	 * Returns the value of the '<em><b>Programlistingco</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Programlistingco</em>' containment reference.
	 * @see #setProgramlistingco(ProgramlistingcoType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Programlistingco()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='programlistingco' namespace='##targetNamespace'"
	 * @generated
	 */
	ProgramlistingcoType getProgramlistingco();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getProgramlistingco <em>Programlistingco</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Programlistingco</em>' containment reference.
	 * @see #getProgramlistingco()
	 * @generated
	 */
	void setProgramlistingco(ProgramlistingcoType value);

	/**
	 * Returns the value of the '<em><b>Prompt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prompt</em>' containment reference.
	 * @see #setPrompt(PromptType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Prompt()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='prompt' namespace='##targetNamespace'"
	 * @generated
	 */
	PromptType getPrompt();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getPrompt <em>Prompt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prompt</em>' containment reference.
	 * @see #getPrompt()
	 * @generated
	 */
	void setPrompt(PromptType value);

	/**
	 * Returns the value of the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property</em>' containment reference.
	 * @see #setProperty(PropertyType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Property()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='property' namespace='##targetNamespace'"
	 * @generated
	 */
	PropertyType getProperty();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getProperty <em>Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property</em>' containment reference.
	 * @see #getProperty()
	 * @generated
	 */
	void setProperty(PropertyType value);

	/**
	 * Returns the value of the '<em><b>Pubdate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pubdate</em>' containment reference.
	 * @see #setPubdate(PubdateType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Pubdate()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='pubdate' namespace='##targetNamespace'"
	 * @generated
	 */
	PubdateType getPubdate();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getPubdate <em>Pubdate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pubdate</em>' containment reference.
	 * @see #getPubdate()
	 * @generated
	 */
	void setPubdate(PubdateType value);

	/**
	 * Returns the value of the '<em><b>Publisher</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Publisher</em>' containment reference.
	 * @see #setPublisher(PublisherType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Publisher()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='publisher' namespace='##targetNamespace'"
	 * @generated
	 */
	PublisherType getPublisher();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getPublisher <em>Publisher</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Publisher</em>' containment reference.
	 * @see #getPublisher()
	 * @generated
	 */
	void setPublisher(PublisherType value);

	/**
	 * Returns the value of the '<em><b>Publishername</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Publishername</em>' containment reference.
	 * @see #setPublishername(PublishernameType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Publishername()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='publishername' namespace='##targetNamespace'"
	 * @generated
	 */
	PublishernameType getPublishername();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getPublishername <em>Publishername</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Publishername</em>' containment reference.
	 * @see #getPublishername()
	 * @generated
	 */
	void setPublishername(PublishernameType value);

	/**
	 * Returns the value of the '<em><b>Qandadiv</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qandadiv</em>' containment reference.
	 * @see #setQandadiv(QandadivType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Qandadiv()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='qandadiv' namespace='##targetNamespace'"
	 * @generated
	 */
	QandadivType getQandadiv();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getQandadiv <em>Qandadiv</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Qandadiv</em>' containment reference.
	 * @see #getQandadiv()
	 * @generated
	 */
	void setQandadiv(QandadivType value);

	/**
	 * Returns the value of the '<em><b>Qandaentry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qandaentry</em>' containment reference.
	 * @see #setQandaentry(QandaentryType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Qandaentry()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='qandaentry' namespace='##targetNamespace'"
	 * @generated
	 */
	QandaentryType getQandaentry();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getQandaentry <em>Qandaentry</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Qandaentry</em>' containment reference.
	 * @see #getQandaentry()
	 * @generated
	 */
	void setQandaentry(QandaentryType value);

	/**
	 * Returns the value of the '<em><b>Qandaset</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qandaset</em>' containment reference.
	 * @see #setQandaset(QandasetType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Qandaset()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='qandaset' namespace='##targetNamespace'"
	 * @generated
	 */
	QandasetType getQandaset();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getQandaset <em>Qandaset</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Qandaset</em>' containment reference.
	 * @see #getQandaset()
	 * @generated
	 */
	void setQandaset(QandasetType value);

	/**
	 * Returns the value of the '<em><b>Question</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Question</em>' containment reference.
	 * @see #setQuestion(QuestionType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Question()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='question' namespace='##targetNamespace'"
	 * @generated
	 */
	QuestionType getQuestion();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getQuestion <em>Question</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Question</em>' containment reference.
	 * @see #getQuestion()
	 * @generated
	 */
	void setQuestion(QuestionType value);

	/**
	 * Returns the value of the '<em><b>Quote</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quote</em>' containment reference.
	 * @see #setQuote(QuoteType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Quote()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='quote' namespace='##targetNamespace'"
	 * @generated
	 */
	QuoteType getQuote();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getQuote <em>Quote</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quote</em>' containment reference.
	 * @see #getQuote()
	 * @generated
	 */
	void setQuote(QuoteType value);

	/**
	 * Returns the value of the '<em><b>Refclass</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refclass</em>' containment reference.
	 * @see #setRefclass(RefclassType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Refclass()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='refclass' namespace='##targetNamespace'"
	 * @generated
	 */
	RefclassType getRefclass();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getRefclass <em>Refclass</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Refclass</em>' containment reference.
	 * @see #getRefclass()
	 * @generated
	 */
	void setRefclass(RefclassType value);

	/**
	 * Returns the value of the '<em><b>Refdescriptor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refdescriptor</em>' containment reference.
	 * @see #setRefdescriptor(RefdescriptorType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Refdescriptor()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='refdescriptor' namespace='##targetNamespace'"
	 * @generated
	 */
	RefdescriptorType getRefdescriptor();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getRefdescriptor <em>Refdescriptor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Refdescriptor</em>' containment reference.
	 * @see #getRefdescriptor()
	 * @generated
	 */
	void setRefdescriptor(RefdescriptorType value);

	/**
	 * Returns the value of the '<em><b>Refentry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refentry</em>' containment reference.
	 * @see #setRefentry(RefentryType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Refentry()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='refentry' namespace='##targetNamespace'"
	 * @generated
	 */
	RefentryType getRefentry();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getRefentry <em>Refentry</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Refentry</em>' containment reference.
	 * @see #getRefentry()
	 * @generated
	 */
	void setRefentry(RefentryType value);

	/**
	 * Returns the value of the '<em><b>Refentrytitle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refentrytitle</em>' containment reference.
	 * @see #setRefentrytitle(RefentrytitleType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Refentrytitle()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='refentrytitle' namespace='##targetNamespace'"
	 * @generated
	 */
	RefentrytitleType getRefentrytitle();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getRefentrytitle <em>Refentrytitle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Refentrytitle</em>' containment reference.
	 * @see #getRefentrytitle()
	 * @generated
	 */
	void setRefentrytitle(RefentrytitleType value);

	/**
	 * Returns the value of the '<em><b>Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference</em>' containment reference.
	 * @see #setReference(ReferenceType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Reference()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='reference' namespace='##targetNamespace'"
	 * @generated
	 */
	ReferenceType getReference();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getReference <em>Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference</em>' containment reference.
	 * @see #getReference()
	 * @generated
	 */
	void setReference(ReferenceType value);

	/**
	 * Returns the value of the '<em><b>Refmeta</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refmeta</em>' containment reference.
	 * @see #setRefmeta(RefmetaType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Refmeta()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='refmeta' namespace='##targetNamespace'"
	 * @generated
	 */
	RefmetaType getRefmeta();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getRefmeta <em>Refmeta</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Refmeta</em>' containment reference.
	 * @see #getRefmeta()
	 * @generated
	 */
	void setRefmeta(RefmetaType value);

	/**
	 * Returns the value of the '<em><b>Refmiscinfo</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refmiscinfo</em>' containment reference.
	 * @see #setRefmiscinfo(RefmiscinfoType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Refmiscinfo()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='refmiscinfo' namespace='##targetNamespace'"
	 * @generated
	 */
	RefmiscinfoType getRefmiscinfo();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getRefmiscinfo <em>Refmiscinfo</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Refmiscinfo</em>' containment reference.
	 * @see #getRefmiscinfo()
	 * @generated
	 */
	void setRefmiscinfo(RefmiscinfoType value);

	/**
	 * Returns the value of the '<em><b>Refname</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refname</em>' containment reference.
	 * @see #setRefname(RefnameType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Refname()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='refname' namespace='##targetNamespace'"
	 * @generated
	 */
	RefnameType getRefname();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getRefname <em>Refname</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Refname</em>' containment reference.
	 * @see #getRefname()
	 * @generated
	 */
	void setRefname(RefnameType value);

	/**
	 * Returns the value of the '<em><b>Refnamediv</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refnamediv</em>' containment reference.
	 * @see #setRefnamediv(RefnamedivType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Refnamediv()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='refnamediv' namespace='##targetNamespace'"
	 * @generated
	 */
	RefnamedivType getRefnamediv();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getRefnamediv <em>Refnamediv</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Refnamediv</em>' containment reference.
	 * @see #getRefnamediv()
	 * @generated
	 */
	void setRefnamediv(RefnamedivType value);

	/**
	 * Returns the value of the '<em><b>Refpurpose</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refpurpose</em>' containment reference.
	 * @see #setRefpurpose(RefpurposeType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Refpurpose()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='refpurpose' namespace='##targetNamespace'"
	 * @generated
	 */
	RefpurposeType getRefpurpose();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getRefpurpose <em>Refpurpose</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Refpurpose</em>' containment reference.
	 * @see #getRefpurpose()
	 * @generated
	 */
	void setRefpurpose(RefpurposeType value);

	/**
	 * Returns the value of the '<em><b>Refsect1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refsect1</em>' containment reference.
	 * @see #setRefsect1(Refsect1Type)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Refsect1()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='refsect1' namespace='##targetNamespace'"
	 * @generated
	 */
	Refsect1Type getRefsect1();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getRefsect1 <em>Refsect1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Refsect1</em>' containment reference.
	 * @see #getRefsect1()
	 * @generated
	 */
	void setRefsect1(Refsect1Type value);

	/**
	 * Returns the value of the '<em><b>Refsect2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refsect2</em>' containment reference.
	 * @see #setRefsect2(Refsect2Type)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Refsect2()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='refsect2' namespace='##targetNamespace'"
	 * @generated
	 */
	Refsect2Type getRefsect2();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getRefsect2 <em>Refsect2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Refsect2</em>' containment reference.
	 * @see #getRefsect2()
	 * @generated
	 */
	void setRefsect2(Refsect2Type value);

	/**
	 * Returns the value of the '<em><b>Refsect3</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refsect3</em>' containment reference.
	 * @see #setRefsect3(Refsect3Type)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Refsect3()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='refsect3' namespace='##targetNamespace'"
	 * @generated
	 */
	Refsect3Type getRefsect3();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getRefsect3 <em>Refsect3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Refsect3</em>' containment reference.
	 * @see #getRefsect3()
	 * @generated
	 */
	void setRefsect3(Refsect3Type value);

	/**
	 * Returns the value of the '<em><b>Refsection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refsection</em>' containment reference.
	 * @see #setRefsection(RefsectionType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Refsection()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='refsection' namespace='##targetNamespace'"
	 * @generated
	 */
	RefsectionType getRefsection();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getRefsection <em>Refsection</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Refsection</em>' containment reference.
	 * @see #getRefsection()
	 * @generated
	 */
	void setRefsection(RefsectionType value);

	/**
	 * Returns the value of the '<em><b>Refsynopsisdiv</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refsynopsisdiv</em>' containment reference.
	 * @see #setRefsynopsisdiv(RefsynopsisdivType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Refsynopsisdiv()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='refsynopsisdiv' namespace='##targetNamespace'"
	 * @generated
	 */
	RefsynopsisdivType getRefsynopsisdiv();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getRefsynopsisdiv <em>Refsynopsisdiv</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Refsynopsisdiv</em>' containment reference.
	 * @see #getRefsynopsisdiv()
	 * @generated
	 */
	void setRefsynopsisdiv(RefsynopsisdivType value);

	/**
	 * Returns the value of the '<em><b>Releaseinfo</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Releaseinfo</em>' containment reference.
	 * @see #setReleaseinfo(ReleaseinfoType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Releaseinfo()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='releaseinfo' namespace='##targetNamespace'"
	 * @generated
	 */
	ReleaseinfoType getReleaseinfo();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getReleaseinfo <em>Releaseinfo</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Releaseinfo</em>' containment reference.
	 * @see #getReleaseinfo()
	 * @generated
	 */
	void setReleaseinfo(ReleaseinfoType value);

	/**
	 * Returns the value of the '<em><b>Remark</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Remark</em>' containment reference.
	 * @see #setRemark(RemarkType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Remark()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='remark' namespace='##targetNamespace'"
	 * @generated
	 */
	RemarkType getRemark();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getRemark <em>Remark</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remark</em>' containment reference.
	 * @see #getRemark()
	 * @generated
	 */
	void setRemark(RemarkType value);

	/**
	 * Returns the value of the '<em><b>Replaceable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Replaceable</em>' containment reference.
	 * @see #setReplaceable(ReplaceableType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Replaceable()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='replaceable' namespace='##targetNamespace'"
	 * @generated
	 */
	ReplaceableType getReplaceable();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getReplaceable <em>Replaceable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Replaceable</em>' containment reference.
	 * @see #getReplaceable()
	 * @generated
	 */
	void setReplaceable(ReplaceableType value);

	/**
	 * Returns the value of the '<em><b>Returnvalue</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Returnvalue</em>' containment reference.
	 * @see #setReturnvalue(ReturnvalueType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Returnvalue()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='returnvalue' namespace='##targetNamespace'"
	 * @generated
	 */
	ReturnvalueType getReturnvalue();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getReturnvalue <em>Returnvalue</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Returnvalue</em>' containment reference.
	 * @see #getReturnvalue()
	 * @generated
	 */
	void setReturnvalue(ReturnvalueType value);

	/**
	 * Returns the value of the '<em><b>Revdescription</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Revdescription</em>' containment reference.
	 * @see #setRevdescription(RevdescriptionType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Revdescription()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='revdescription' namespace='##targetNamespace'"
	 * @generated
	 */
	RevdescriptionType getRevdescription();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getRevdescription <em>Revdescription</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Revdescription</em>' containment reference.
	 * @see #getRevdescription()
	 * @generated
	 */
	void setRevdescription(RevdescriptionType value);

	/**
	 * Returns the value of the '<em><b>Revhistory</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Revhistory</em>' containment reference.
	 * @see #setRevhistory(RevhistoryType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Revhistory()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='revhistory' namespace='##targetNamespace'"
	 * @generated
	 */
	RevhistoryType getRevhistory();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getRevhistory <em>Revhistory</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Revhistory</em>' containment reference.
	 * @see #getRevhistory()
	 * @generated
	 */
	void setRevhistory(RevhistoryType value);

	/**
	 * Returns the value of the '<em><b>Revision</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Revision</em>' containment reference.
	 * @see #setRevision(RevisionType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Revision()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='revision' namespace='##targetNamespace'"
	 * @generated
	 */
	RevisionType getRevision();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getRevision <em>Revision</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Revision</em>' containment reference.
	 * @see #getRevision()
	 * @generated
	 */
	void setRevision(RevisionType value);

	/**
	 * Returns the value of the '<em><b>Revnumber</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Revnumber</em>' containment reference.
	 * @see #setRevnumber(RevnumberType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Revnumber()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='revnumber' namespace='##targetNamespace'"
	 * @generated
	 */
	RevnumberType getRevnumber();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getRevnumber <em>Revnumber</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Revnumber</em>' containment reference.
	 * @see #getRevnumber()
	 * @generated
	 */
	void setRevnumber(RevnumberType value);

	/**
	 * Returns the value of the '<em><b>Revremark</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Revremark</em>' containment reference.
	 * @see #setRevremark(RevremarkType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Revremark()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='revremark' namespace='##targetNamespace'"
	 * @generated
	 */
	RevremarkType getRevremark();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getRevremark <em>Revremark</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Revremark</em>' containment reference.
	 * @see #getRevremark()
	 * @generated
	 */
	void setRevremark(RevremarkType value);

	/**
	 * Returns the value of the '<em><b>Rhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rhs</em>' containment reference.
	 * @see #setRhs(RhsType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Rhs()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='rhs' namespace='##targetNamespace'"
	 * @generated
	 */
	RhsType getRhs();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getRhs <em>Rhs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rhs</em>' containment reference.
	 * @see #getRhs()
	 * @generated
	 */
	void setRhs(RhsType value);

	/**
	 * Returns the value of the '<em><b>Row</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Row</em>' containment reference.
	 * @see #setRow(RowType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Row()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='row' namespace='##targetNamespace'"
	 * @generated
	 */
	RowType getRow();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getRow <em>Row</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Row</em>' containment reference.
	 * @see #getRow()
	 * @generated
	 */
	void setRow(RowType value);

	/**
	 * Returns the value of the '<em><b>Sbr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sbr</em>' containment reference.
	 * @see #setSbr(SbrType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Sbr()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='sbr' namespace='##targetNamespace'"
	 * @generated
	 */
	SbrType getSbr();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getSbr <em>Sbr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sbr</em>' containment reference.
	 * @see #getSbr()
	 * @generated
	 */
	void setSbr(SbrType value);

	/**
	 * Returns the value of the '<em><b>Screen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Screen</em>' containment reference.
	 * @see #setScreen(ScreenType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Screen()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='screen' namespace='##targetNamespace'"
	 * @generated
	 */
	ScreenType getScreen();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getScreen <em>Screen</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Screen</em>' containment reference.
	 * @see #getScreen()
	 * @generated
	 */
	void setScreen(ScreenType value);

	/**
	 * Returns the value of the '<em><b>Screenco</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Screenco</em>' containment reference.
	 * @see #setScreenco(ScreencoType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Screenco()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='screenco' namespace='##targetNamespace'"
	 * @generated
	 */
	ScreencoType getScreenco();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getScreenco <em>Screenco</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Screenco</em>' containment reference.
	 * @see #getScreenco()
	 * @generated
	 */
	void setScreenco(ScreencoType value);

	/**
	 * Returns the value of the '<em><b>Screenshot</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Screenshot</em>' containment reference.
	 * @see #setScreenshot(ScreenshotType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Screenshot()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='screenshot' namespace='##targetNamespace'"
	 * @generated
	 */
	ScreenshotType getScreenshot();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getScreenshot <em>Screenshot</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Screenshot</em>' containment reference.
	 * @see #getScreenshot()
	 * @generated
	 */
	void setScreenshot(ScreenshotType value);

	/**
	 * Returns the value of the '<em><b>Secondary</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Secondary</em>' containment reference.
	 * @see #setSecondary(SecondaryType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Secondary()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='secondary' namespace='##targetNamespace'"
	 * @generated
	 */
	SecondaryType getSecondary();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getSecondary <em>Secondary</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Secondary</em>' containment reference.
	 * @see #getSecondary()
	 * @generated
	 */
	void setSecondary(SecondaryType value);

	/**
	 * Returns the value of the '<em><b>Secondaryie</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Secondaryie</em>' containment reference.
	 * @see #setSecondaryie(SecondaryieType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Secondaryie()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='secondaryie' namespace='##targetNamespace'"
	 * @generated
	 */
	SecondaryieType getSecondaryie();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getSecondaryie <em>Secondaryie</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Secondaryie</em>' containment reference.
	 * @see #getSecondaryie()
	 * @generated
	 */
	void setSecondaryie(SecondaryieType value);

	/**
	 * Returns the value of the '<em><b>Sect1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sect1</em>' containment reference.
	 * @see #setSect1(Sect1Type)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Sect1()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='sect1' namespace='##targetNamespace'"
	 * @generated
	 */
	Sect1Type getSect1();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getSect1 <em>Sect1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sect1</em>' containment reference.
	 * @see #getSect1()
	 * @generated
	 */
	void setSect1(Sect1Type value);

	/**
	 * Returns the value of the '<em><b>Sect2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sect2</em>' containment reference.
	 * @see #setSect2(Sect2Type)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Sect2()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='sect2' namespace='##targetNamespace'"
	 * @generated
	 */
	Sect2Type getSect2();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getSect2 <em>Sect2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sect2</em>' containment reference.
	 * @see #getSect2()
	 * @generated
	 */
	void setSect2(Sect2Type value);

	/**
	 * Returns the value of the '<em><b>Sect3</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sect3</em>' containment reference.
	 * @see #setSect3(Sect3Type)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Sect3()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='sect3' namespace='##targetNamespace'"
	 * @generated
	 */
	Sect3Type getSect3();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getSect3 <em>Sect3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sect3</em>' containment reference.
	 * @see #getSect3()
	 * @generated
	 */
	void setSect3(Sect3Type value);

	/**
	 * Returns the value of the '<em><b>Sect4</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sect4</em>' containment reference.
	 * @see #setSect4(Sect4Type)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Sect4()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='sect4' namespace='##targetNamespace'"
	 * @generated
	 */
	Sect4Type getSect4();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getSect4 <em>Sect4</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sect4</em>' containment reference.
	 * @see #getSect4()
	 * @generated
	 */
	void setSect4(Sect4Type value);

	/**
	 * Returns the value of the '<em><b>Sect5</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sect5</em>' containment reference.
	 * @see #setSect5(Sect5Type)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Sect5()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='sect5' namespace='##targetNamespace'"
	 * @generated
	 */
	Sect5Type getSect5();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getSect5 <em>Sect5</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sect5</em>' containment reference.
	 * @see #getSect5()
	 * @generated
	 */
	void setSect5(Sect5Type value);

	/**
	 * Returns the value of the '<em><b>Section</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Section</em>' containment reference.
	 * @see #setSection(SectionType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Section()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='section' namespace='##targetNamespace'"
	 * @generated
	 */
	SectionType getSection();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getSection <em>Section</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Section</em>' containment reference.
	 * @see #getSection()
	 * @generated
	 */
	void setSection(SectionType value);

	/**
	 * Returns the value of the '<em><b>See</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>See</em>' containment reference.
	 * @see #setSee(SeeType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_See()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='see' namespace='##targetNamespace'"
	 * @generated
	 */
	SeeType getSee();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getSee <em>See</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>See</em>' containment reference.
	 * @see #getSee()
	 * @generated
	 */
	void setSee(SeeType value);

	/**
	 * Returns the value of the '<em><b>Seealso</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Seealso</em>' containment reference.
	 * @see #setSeealso(SeealsoType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Seealso()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='seealso' namespace='##targetNamespace'"
	 * @generated
	 */
	SeealsoType getSeealso();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getSeealso <em>Seealso</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Seealso</em>' containment reference.
	 * @see #getSeealso()
	 * @generated
	 */
	void setSeealso(SeealsoType value);

	/**
	 * Returns the value of the '<em><b>Seealsoie</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Seealsoie</em>' containment reference.
	 * @see #setSeealsoie(SeealsoieType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Seealsoie()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='seealsoie' namespace='##targetNamespace'"
	 * @generated
	 */
	SeealsoieType getSeealsoie();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getSeealsoie <em>Seealsoie</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Seealsoie</em>' containment reference.
	 * @see #getSeealsoie()
	 * @generated
	 */
	void setSeealsoie(SeealsoieType value);

	/**
	 * Returns the value of the '<em><b>Seeie</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Seeie</em>' containment reference.
	 * @see #setSeeie(SeeieType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Seeie()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='seeie' namespace='##targetNamespace'"
	 * @generated
	 */
	SeeieType getSeeie();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getSeeie <em>Seeie</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Seeie</em>' containment reference.
	 * @see #getSeeie()
	 * @generated
	 */
	void setSeeie(SeeieType value);

	/**
	 * Returns the value of the '<em><b>Seg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Seg</em>' containment reference.
	 * @see #setSeg(SegType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Seg()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='seg' namespace='##targetNamespace'"
	 * @generated
	 */
	SegType getSeg();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getSeg <em>Seg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Seg</em>' containment reference.
	 * @see #getSeg()
	 * @generated
	 */
	void setSeg(SegType value);

	/**
	 * Returns the value of the '<em><b>Seglistitem</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Seglistitem</em>' containment reference.
	 * @see #setSeglistitem(SeglistitemType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Seglistitem()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='seglistitem' namespace='##targetNamespace'"
	 * @generated
	 */
	SeglistitemType getSeglistitem();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getSeglistitem <em>Seglistitem</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Seglistitem</em>' containment reference.
	 * @see #getSeglistitem()
	 * @generated
	 */
	void setSeglistitem(SeglistitemType value);

	/**
	 * Returns the value of the '<em><b>Segmentedlist</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Segmentedlist</em>' containment reference.
	 * @see #setSegmentedlist(SegmentedlistType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Segmentedlist()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='segmentedlist' namespace='##targetNamespace'"
	 * @generated
	 */
	SegmentedlistType getSegmentedlist();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getSegmentedlist <em>Segmentedlist</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Segmentedlist</em>' containment reference.
	 * @see #getSegmentedlist()
	 * @generated
	 */
	void setSegmentedlist(SegmentedlistType value);

	/**
	 * Returns the value of the '<em><b>Segtitle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Segtitle</em>' containment reference.
	 * @see #setSegtitle(SegtitleType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Segtitle()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='segtitle' namespace='##targetNamespace'"
	 * @generated
	 */
	SegtitleType getSegtitle();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getSegtitle <em>Segtitle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Segtitle</em>' containment reference.
	 * @see #getSegtitle()
	 * @generated
	 */
	void setSegtitle(SegtitleType value);

	/**
	 * Returns the value of the '<em><b>Seriesvolnums</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Seriesvolnums</em>' containment reference.
	 * @see #setSeriesvolnums(SeriesvolnumsType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Seriesvolnums()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='seriesvolnums' namespace='##targetNamespace'"
	 * @generated
	 */
	SeriesvolnumsType getSeriesvolnums();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getSeriesvolnums <em>Seriesvolnums</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Seriesvolnums</em>' containment reference.
	 * @see #getSeriesvolnums()
	 * @generated
	 */
	void setSeriesvolnums(SeriesvolnumsType value);

	/**
	 * Returns the value of the '<em><b>Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Set</em>' containment reference.
	 * @see #setSet(SetType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Set()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='set' namespace='##targetNamespace'"
	 * @generated
	 */
	SetType getSet();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getSet <em>Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Set</em>' containment reference.
	 * @see #getSet()
	 * @generated
	 */
	void setSet(SetType value);

	/**
	 * Returns the value of the '<em><b>Setindex</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Setindex</em>' containment reference.
	 * @see #setSetindex(SetindexType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Setindex()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='setindex' namespace='##targetNamespace'"
	 * @generated
	 */
	SetindexType getSetindex();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getSetindex <em>Setindex</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Setindex</em>' containment reference.
	 * @see #getSetindex()
	 * @generated
	 */
	void setSetindex(SetindexType value);

	/**
	 * Returns the value of the '<em><b>Shortaffil</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shortaffil</em>' containment reference.
	 * @see #setShortaffil(ShortaffilType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Shortaffil()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='shortaffil' namespace='##targetNamespace'"
	 * @generated
	 */
	ShortaffilType getShortaffil();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getShortaffil <em>Shortaffil</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shortaffil</em>' containment reference.
	 * @see #getShortaffil()
	 * @generated
	 */
	void setShortaffil(ShortaffilType value);

	/**
	 * Returns the value of the '<em><b>Shortcut</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shortcut</em>' containment reference.
	 * @see #setShortcut(ShortcutType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Shortcut()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='shortcut' namespace='##targetNamespace'"
	 * @generated
	 */
	ShortcutType getShortcut();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getShortcut <em>Shortcut</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shortcut</em>' containment reference.
	 * @see #getShortcut()
	 * @generated
	 */
	void setShortcut(ShortcutType value);

	/**
	 * Returns the value of the '<em><b>Sidebar</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sidebar</em>' containment reference.
	 * @see #setSidebar(SidebarType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Sidebar()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='sidebar' namespace='##targetNamespace'"
	 * @generated
	 */
	SidebarType getSidebar();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getSidebar <em>Sidebar</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sidebar</em>' containment reference.
	 * @see #getSidebar()
	 * @generated
	 */
	void setSidebar(SidebarType value);

	/**
	 * Returns the value of the '<em><b>Simpara</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Simpara</em>' containment reference.
	 * @see #setSimpara(SimparaType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Simpara()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='simpara' namespace='##targetNamespace'"
	 * @generated
	 */
	SimparaType getSimpara();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getSimpara <em>Simpara</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Simpara</em>' containment reference.
	 * @see #getSimpara()
	 * @generated
	 */
	void setSimpara(SimparaType value);

	/**
	 * Returns the value of the '<em><b>Simplelist</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Simplelist</em>' containment reference.
	 * @see #setSimplelist(SimplelistType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Simplelist()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='simplelist' namespace='##targetNamespace'"
	 * @generated
	 */
	SimplelistType getSimplelist();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getSimplelist <em>Simplelist</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Simplelist</em>' containment reference.
	 * @see #getSimplelist()
	 * @generated
	 */
	void setSimplelist(SimplelistType value);

	/**
	 * Returns the value of the '<em><b>Simplemsgentry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Simplemsgentry</em>' containment reference.
	 * @see #setSimplemsgentry(SimplemsgentryType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Simplemsgentry()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='simplemsgentry' namespace='##targetNamespace'"
	 * @generated
	 */
	SimplemsgentryType getSimplemsgentry();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getSimplemsgentry <em>Simplemsgentry</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Simplemsgentry</em>' containment reference.
	 * @see #getSimplemsgentry()
	 * @generated
	 */
	void setSimplemsgentry(SimplemsgentryType value);

	/**
	 * Returns the value of the '<em><b>Simplesect</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Simplesect</em>' containment reference.
	 * @see #setSimplesect(SimplesectType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Simplesect()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='simplesect' namespace='##targetNamespace'"
	 * @generated
	 */
	SimplesectType getSimplesect();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getSimplesect <em>Simplesect</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Simplesect</em>' containment reference.
	 * @see #getSimplesect()
	 * @generated
	 */
	void setSimplesect(SimplesectType value);

	/**
	 * Returns the value of the '<em><b>Spanspec</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spanspec</em>' containment reference.
	 * @see #setSpanspec(SpanspecType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Spanspec()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='spanspec' namespace='##targetNamespace'"
	 * @generated
	 */
	SpanspecType getSpanspec();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getSpanspec <em>Spanspec</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Spanspec</em>' containment reference.
	 * @see #getSpanspec()
	 * @generated
	 */
	void setSpanspec(SpanspecType value);

	/**
	 * Returns the value of the '<em><b>State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' containment reference.
	 * @see #setState(StateType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_State()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='state' namespace='##targetNamespace'"
	 * @generated
	 */
	StateType getState();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getState <em>State</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' containment reference.
	 * @see #getState()
	 * @generated
	 */
	void setState(StateType value);

	/**
	 * Returns the value of the '<em><b>Step</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Step</em>' containment reference.
	 * @see #setStep(StepType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Step()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='step' namespace='##targetNamespace'"
	 * @generated
	 */
	StepType getStep();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getStep <em>Step</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Step</em>' containment reference.
	 * @see #getStep()
	 * @generated
	 */
	void setStep(StepType value);

	/**
	 * Returns the value of the '<em><b>Stepalternatives</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stepalternatives</em>' containment reference.
	 * @see #setStepalternatives(StepalternativesType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Stepalternatives()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='stepalternatives' namespace='##targetNamespace'"
	 * @generated
	 */
	StepalternativesType getStepalternatives();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getStepalternatives <em>Stepalternatives</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stepalternatives</em>' containment reference.
	 * @see #getStepalternatives()
	 * @generated
	 */
	void setStepalternatives(StepalternativesType value);

	/**
	 * Returns the value of the '<em><b>Street</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Street</em>' containment reference.
	 * @see #setStreet(StreetType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Street()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='street' namespace='##targetNamespace'"
	 * @generated
	 */
	StreetType getStreet();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getStreet <em>Street</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Street</em>' containment reference.
	 * @see #getStreet()
	 * @generated
	 */
	void setStreet(StreetType value);

	/**
	 * Returns the value of the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subject</em>' containment reference.
	 * @see #setSubject(SubjectType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Subject()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='subject' namespace='##targetNamespace'"
	 * @generated
	 */
	SubjectType getSubject();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getSubject <em>Subject</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subject</em>' containment reference.
	 * @see #getSubject()
	 * @generated
	 */
	void setSubject(SubjectType value);

	/**
	 * Returns the value of the '<em><b>Subjectset</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subjectset</em>' containment reference.
	 * @see #setSubjectset(SubjectsetType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Subjectset()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='subjectset' namespace='##targetNamespace'"
	 * @generated
	 */
	SubjectsetType getSubjectset();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getSubjectset <em>Subjectset</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subjectset</em>' containment reference.
	 * @see #getSubjectset()
	 * @generated
	 */
	void setSubjectset(SubjectsetType value);

	/**
	 * Returns the value of the '<em><b>Subjectterm</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subjectterm</em>' containment reference.
	 * @see #setSubjectterm(SubjecttermType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Subjectterm()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='subjectterm' namespace='##targetNamespace'"
	 * @generated
	 */
	SubjecttermType getSubjectterm();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getSubjectterm <em>Subjectterm</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subjectterm</em>' containment reference.
	 * @see #getSubjectterm()
	 * @generated
	 */
	void setSubjectterm(SubjecttermType value);

	/**
	 * Returns the value of the '<em><b>Subscript</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subscript</em>' containment reference.
	 * @see #setSubscript(SubscriptType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Subscript()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='subscript' namespace='##targetNamespace'"
	 * @generated
	 */
	SubscriptType getSubscript();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getSubscript <em>Subscript</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subscript</em>' containment reference.
	 * @see #getSubscript()
	 * @generated
	 */
	void setSubscript(SubscriptType value);

	/**
	 * Returns the value of the '<em><b>Substeps</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Substeps</em>' containment reference.
	 * @see #setSubsteps(SubstepsType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Substeps()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='substeps' namespace='##targetNamespace'"
	 * @generated
	 */
	SubstepsType getSubsteps();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getSubsteps <em>Substeps</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Substeps</em>' containment reference.
	 * @see #getSubsteps()
	 * @generated
	 */
	void setSubsteps(SubstepsType value);

	/**
	 * Returns the value of the '<em><b>Subtitle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subtitle</em>' containment reference.
	 * @see #setSubtitle(SubtitleType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Subtitle()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='subtitle' namespace='##targetNamespace'"
	 * @generated
	 */
	SubtitleType getSubtitle();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getSubtitle <em>Subtitle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subtitle</em>' containment reference.
	 * @see #getSubtitle()
	 * @generated
	 */
	void setSubtitle(SubtitleType value);

	/**
	 * Returns the value of the '<em><b>Superscript</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Superscript</em>' containment reference.
	 * @see #setSuperscript(SuperscriptType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Superscript()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='superscript' namespace='##targetNamespace'"
	 * @generated
	 */
	SuperscriptType getSuperscript();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getSuperscript <em>Superscript</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Superscript</em>' containment reference.
	 * @see #getSuperscript()
	 * @generated
	 */
	void setSuperscript(SuperscriptType value);

	/**
	 * Returns the value of the '<em><b>Surname</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Surname</em>' containment reference.
	 * @see #setSurname(SurnameType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Surname()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='surname' namespace='##targetNamespace'"
	 * @generated
	 */
	SurnameType getSurname();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getSurname <em>Surname</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Surname</em>' containment reference.
	 * @see #getSurname()
	 * @generated
	 */
	void setSurname(SurnameType value);

	/**
	 * Returns the value of the '<em><b>Symbol</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Symbol</em>' containment reference.
	 * @see #setSymbol(SymbolType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Symbol()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='symbol' namespace='##targetNamespace'"
	 * @generated
	 */
	SymbolType getSymbol();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getSymbol <em>Symbol</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Symbol</em>' containment reference.
	 * @see #getSymbol()
	 * @generated
	 */
	void setSymbol(SymbolType value);

	/**
	 * Returns the value of the '<em><b>Synopfragment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Synopfragment</em>' containment reference.
	 * @see #setSynopfragment(SynopfragmentType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Synopfragment()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='synopfragment' namespace='##targetNamespace'"
	 * @generated
	 */
	SynopfragmentType getSynopfragment();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getSynopfragment <em>Synopfragment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Synopfragment</em>' containment reference.
	 * @see #getSynopfragment()
	 * @generated
	 */
	void setSynopfragment(SynopfragmentType value);

	/**
	 * Returns the value of the '<em><b>Synopfragmentref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Synopfragmentref</em>' containment reference.
	 * @see #setSynopfragmentref(SynopfragmentrefType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Synopfragmentref()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='synopfragmentref' namespace='##targetNamespace'"
	 * @generated
	 */
	SynopfragmentrefType getSynopfragmentref();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getSynopfragmentref <em>Synopfragmentref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Synopfragmentref</em>' containment reference.
	 * @see #getSynopfragmentref()
	 * @generated
	 */
	void setSynopfragmentref(SynopfragmentrefType value);

	/**
	 * Returns the value of the '<em><b>Synopsis</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Synopsis</em>' containment reference.
	 * @see #setSynopsis(SynopsisType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Synopsis()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='synopsis' namespace='##targetNamespace'"
	 * @generated
	 */
	SynopsisType getSynopsis();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getSynopsis <em>Synopsis</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Synopsis</em>' containment reference.
	 * @see #getSynopsis()
	 * @generated
	 */
	void setSynopsis(SynopsisType value);

	/**
	 * Returns the value of the '<em><b>Systemitem</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Systemitem</em>' containment reference.
	 * @see #setSystemitem(SystemitemType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Systemitem()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='systemitem' namespace='##targetNamespace'"
	 * @generated
	 */
	SystemitemType getSystemitem();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getSystemitem <em>Systemitem</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Systemitem</em>' containment reference.
	 * @see #getSystemitem()
	 * @generated
	 */
	void setSystemitem(SystemitemType value);

	/**
	 * Returns the value of the '<em><b>Table</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table</em>' containment reference.
	 * @see #setTable(TableType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Table()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='table' namespace='##targetNamespace'"
	 * @generated
	 */
	TableType getTable();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getTable <em>Table</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table</em>' containment reference.
	 * @see #getTable()
	 * @generated
	 */
	void setTable(TableType value);

	/**
	 * Returns the value of the '<em><b>Tag</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tag</em>' containment reference.
	 * @see #setTag(TagType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Tag()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='tag' namespace='##targetNamespace'"
	 * @generated
	 */
	TagType getTag();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getTag <em>Tag</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tag</em>' containment reference.
	 * @see #getTag()
	 * @generated
	 */
	void setTag(TagType value);

	/**
	 * Returns the value of the '<em><b>Task</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Task</em>' containment reference.
	 * @see #setTask(TaskType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Task()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='task' namespace='##targetNamespace'"
	 * @generated
	 */
	TaskType getTask();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getTask <em>Task</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Task</em>' containment reference.
	 * @see #getTask()
	 * @generated
	 */
	void setTask(TaskType value);

	/**
	 * Returns the value of the '<em><b>Taskprerequisites</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Taskprerequisites</em>' containment reference.
	 * @see #setTaskprerequisites(TaskprerequisitesType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Taskprerequisites()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='taskprerequisites' namespace='##targetNamespace'"
	 * @generated
	 */
	TaskprerequisitesType getTaskprerequisites();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getTaskprerequisites <em>Taskprerequisites</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Taskprerequisites</em>' containment reference.
	 * @see #getTaskprerequisites()
	 * @generated
	 */
	void setTaskprerequisites(TaskprerequisitesType value);

	/**
	 * Returns the value of the '<em><b>Taskrelated</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Taskrelated</em>' containment reference.
	 * @see #setTaskrelated(TaskrelatedType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Taskrelated()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='taskrelated' namespace='##targetNamespace'"
	 * @generated
	 */
	TaskrelatedType getTaskrelated();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getTaskrelated <em>Taskrelated</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Taskrelated</em>' containment reference.
	 * @see #getTaskrelated()
	 * @generated
	 */
	void setTaskrelated(TaskrelatedType value);

	/**
	 * Returns the value of the '<em><b>Tasksummary</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tasksummary</em>' containment reference.
	 * @see #setTasksummary(TasksummaryType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Tasksummary()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='tasksummary' namespace='##targetNamespace'"
	 * @generated
	 */
	TasksummaryType getTasksummary();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getTasksummary <em>Tasksummary</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tasksummary</em>' containment reference.
	 * @see #getTasksummary()
	 * @generated
	 */
	void setTasksummary(TasksummaryType value);

	/**
	 * Returns the value of the '<em><b>Tbody</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tbody</em>' containment reference.
	 * @see #setTbody(TbodyType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Tbody()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='tbody' namespace='##targetNamespace'"
	 * @generated
	 */
	TbodyType getTbody();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getTbody <em>Tbody</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tbody</em>' containment reference.
	 * @see #getTbody()
	 * @generated
	 */
	void setTbody(TbodyType value);

	/**
	 * Returns the value of the '<em><b>Td</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Td</em>' containment reference.
	 * @see #setTd(TdType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Td()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='td' namespace='##targetNamespace'"
	 * @generated
	 */
	TdType getTd();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getTd <em>Td</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Td</em>' containment reference.
	 * @see #getTd()
	 * @generated
	 */
	void setTd(TdType value);

	/**
	 * Returns the value of the '<em><b>Term</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Term</em>' containment reference.
	 * @see #setTerm(TermType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Term()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='term' namespace='##targetNamespace'"
	 * @generated
	 */
	TermType getTerm();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getTerm <em>Term</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Term</em>' containment reference.
	 * @see #getTerm()
	 * @generated
	 */
	void setTerm(TermType value);

	/**
	 * Returns the value of the '<em><b>Termdef</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Termdef</em>' containment reference.
	 * @see #setTermdef(TermdefType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Termdef()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='termdef' namespace='##targetNamespace'"
	 * @generated
	 */
	TermdefType getTermdef();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getTermdef <em>Termdef</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Termdef</em>' containment reference.
	 * @see #getTermdef()
	 * @generated
	 */
	void setTermdef(TermdefType value);

	/**
	 * Returns the value of the '<em><b>Tertiary</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tertiary</em>' containment reference.
	 * @see #setTertiary(TertiaryType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Tertiary()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='tertiary' namespace='##targetNamespace'"
	 * @generated
	 */
	TertiaryType getTertiary();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getTertiary <em>Tertiary</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tertiary</em>' containment reference.
	 * @see #getTertiary()
	 * @generated
	 */
	void setTertiary(TertiaryType value);

	/**
	 * Returns the value of the '<em><b>Tertiaryie</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tertiaryie</em>' containment reference.
	 * @see #setTertiaryie(TertiaryieType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Tertiaryie()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='tertiaryie' namespace='##targetNamespace'"
	 * @generated
	 */
	TertiaryieType getTertiaryie();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getTertiaryie <em>Tertiaryie</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tertiaryie</em>' containment reference.
	 * @see #getTertiaryie()
	 * @generated
	 */
	void setTertiaryie(TertiaryieType value);

	/**
	 * Returns the value of the '<em><b>Textdata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Textdata</em>' containment reference.
	 * @see #setTextdata(TextdataType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Textdata()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='textdata' namespace='##targetNamespace'"
	 * @generated
	 */
	TextdataType getTextdata();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getTextdata <em>Textdata</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Textdata</em>' containment reference.
	 * @see #getTextdata()
	 * @generated
	 */
	void setTextdata(TextdataType value);

	/**
	 * Returns the value of the '<em><b>Textobject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Textobject</em>' containment reference.
	 * @see #setTextobject(TextobjectType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Textobject()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='textobject' namespace='##targetNamespace'"
	 * @generated
	 */
	TextobjectType getTextobject();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getTextobject <em>Textobject</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Textobject</em>' containment reference.
	 * @see #getTextobject()
	 * @generated
	 */
	void setTextobject(TextobjectType value);

	/**
	 * Returns the value of the '<em><b>Tfoot</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tfoot</em>' containment reference.
	 * @see #setTfoot(TfootType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Tfoot()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='tfoot' namespace='##targetNamespace'"
	 * @generated
	 */
	TfootType getTfoot();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getTfoot <em>Tfoot</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tfoot</em>' containment reference.
	 * @see #getTfoot()
	 * @generated
	 */
	void setTfoot(TfootType value);

	/**
	 * Returns the value of the '<em><b>Tgroup</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tgroup</em>' containment reference.
	 * @see #setTgroup(TgroupType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Tgroup()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='tgroup' namespace='##targetNamespace'"
	 * @generated
	 */
	TgroupType getTgroup();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getTgroup <em>Tgroup</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tgroup</em>' containment reference.
	 * @see #getTgroup()
	 * @generated
	 */
	void setTgroup(TgroupType value);

	/**
	 * Returns the value of the '<em><b>Th</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Th</em>' containment reference.
	 * @see #setTh(ThType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Th()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='th' namespace='##targetNamespace'"
	 * @generated
	 */
	ThType getTh();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getTh <em>Th</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Th</em>' containment reference.
	 * @see #getTh()
	 * @generated
	 */
	void setTh(ThType value);

	/**
	 * Returns the value of the '<em><b>Thead</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thead</em>' containment reference.
	 * @see #setThead(TheadType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Thead()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='thead' namespace='##targetNamespace'"
	 * @generated
	 */
	TheadType getThead();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getThead <em>Thead</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thead</em>' containment reference.
	 * @see #getThead()
	 * @generated
	 */
	void setThead(TheadType value);

	/**
	 * Returns the value of the '<em><b>Tip</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tip</em>' containment reference.
	 * @see #setTip(TipType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Tip()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='tip' namespace='##targetNamespace'"
	 * @generated
	 */
	TipType getTip();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getTip <em>Tip</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tip</em>' containment reference.
	 * @see #getTip()
	 * @generated
	 */
	void setTip(TipType value);

	/**
	 * Returns the value of the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' containment reference.
	 * @see #setTitle(TitleType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Title()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='title' namespace='##targetNamespace'"
	 * @generated
	 */
	TitleType getTitle();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getTitle <em>Title</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' containment reference.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(TitleType value);

	/**
	 * Returns the value of the '<em><b>Titleabbrev</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Titleabbrev</em>' containment reference.
	 * @see #setTitleabbrev(TitleabbrevType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Titleabbrev()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='titleabbrev' namespace='##targetNamespace'"
	 * @generated
	 */
	TitleabbrevType getTitleabbrev();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getTitleabbrev <em>Titleabbrev</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Titleabbrev</em>' containment reference.
	 * @see #getTitleabbrev()
	 * @generated
	 */
	void setTitleabbrev(TitleabbrevType value);

	/**
	 * Returns the value of the '<em><b>Toc</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Toc</em>' containment reference.
	 * @see #setToc(TocType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Toc()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='toc' namespace='##targetNamespace'"
	 * @generated
	 */
	TocType getToc();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getToc <em>Toc</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Toc</em>' containment reference.
	 * @see #getToc()
	 * @generated
	 */
	void setToc(TocType value);

	/**
	 * Returns the value of the '<em><b>Tocdiv</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tocdiv</em>' containment reference.
	 * @see #setTocdiv(TocdivType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Tocdiv()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='tocdiv' namespace='##targetNamespace'"
	 * @generated
	 */
	TocdivType getTocdiv();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getTocdiv <em>Tocdiv</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tocdiv</em>' containment reference.
	 * @see #getTocdiv()
	 * @generated
	 */
	void setTocdiv(TocdivType value);

	/**
	 * Returns the value of the '<em><b>Tocentry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tocentry</em>' containment reference.
	 * @see #setTocentry(TocentryType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Tocentry()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='tocentry' namespace='##targetNamespace'"
	 * @generated
	 */
	TocentryType getTocentry();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getTocentry <em>Tocentry</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tocentry</em>' containment reference.
	 * @see #getTocentry()
	 * @generated
	 */
	void setTocentry(TocentryType value);

	/**
	 * Returns the value of the '<em><b>Token</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Token</em>' containment reference.
	 * @see #setToken(TokenType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Token()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='token' namespace='##targetNamespace'"
	 * @generated
	 */
	TokenType getToken();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getToken <em>Token</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Token</em>' containment reference.
	 * @see #getToken()
	 * @generated
	 */
	void setToken(TokenType value);

	/**
	 * Returns the value of the '<em><b>Tr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tr</em>' containment reference.
	 * @see #setTr(TrType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Tr()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='tr' namespace='##targetNamespace'"
	 * @generated
	 */
	TrType getTr();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getTr <em>Tr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tr</em>' containment reference.
	 * @see #getTr()
	 * @generated
	 */
	void setTr(TrType value);

	/**
	 * Returns the value of the '<em><b>Trademark</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trademark</em>' containment reference.
	 * @see #setTrademark(TrademarkType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Trademark()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='trademark' namespace='##targetNamespace'"
	 * @generated
	 */
	TrademarkType getTrademark();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getTrademark <em>Trademark</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trademark</em>' containment reference.
	 * @see #getTrademark()
	 * @generated
	 */
	void setTrademark(TrademarkType value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(TypeType2)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Type()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	TypeType2 getType();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(TypeType2 value);

	/**
	 * Returns the value of the '<em><b>Uri</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uri</em>' containment reference.
	 * @see #setUri(UriType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Uri()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='uri' namespace='##targetNamespace'"
	 * @generated
	 */
	UriType getUri();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getUri <em>Uri</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uri</em>' containment reference.
	 * @see #getUri()
	 * @generated
	 */
	void setUri(UriType value);

	/**
	 * Returns the value of the '<em><b>Userinput</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Userinput</em>' containment reference.
	 * @see #setUserinput(UserinputType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Userinput()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='userinput' namespace='##targetNamespace'"
	 * @generated
	 */
	UserinputType getUserinput();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getUserinput <em>Userinput</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Userinput</em>' containment reference.
	 * @see #getUserinput()
	 * @generated
	 */
	void setUserinput(UserinputType value);

	/**
	 * Returns the value of the '<em><b>Varargs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Varargs</em>' containment reference.
	 * @see #setVarargs(VarargsType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Varargs()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='varargs' namespace='##targetNamespace'"
	 * @generated
	 */
	VarargsType getVarargs();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getVarargs <em>Varargs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Varargs</em>' containment reference.
	 * @see #getVarargs()
	 * @generated
	 */
	void setVarargs(VarargsType value);

	/**
	 * Returns the value of the '<em><b>Variablelist</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variablelist</em>' containment reference.
	 * @see #setVariablelist(VariablelistType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Variablelist()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='variablelist' namespace='##targetNamespace'"
	 * @generated
	 */
	VariablelistType getVariablelist();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getVariablelist <em>Variablelist</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variablelist</em>' containment reference.
	 * @see #getVariablelist()
	 * @generated
	 */
	void setVariablelist(VariablelistType value);

	/**
	 * Returns the value of the '<em><b>Varlistentry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Varlistentry</em>' containment reference.
	 * @see #setVarlistentry(VarlistentryType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Varlistentry()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='varlistentry' namespace='##targetNamespace'"
	 * @generated
	 */
	VarlistentryType getVarlistentry();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getVarlistentry <em>Varlistentry</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Varlistentry</em>' containment reference.
	 * @see #getVarlistentry()
	 * @generated
	 */
	void setVarlistentry(VarlistentryType value);

	/**
	 * Returns the value of the '<em><b>Varname</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Varname</em>' containment reference.
	 * @see #setVarname(VarnameType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Varname()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='varname' namespace='##targetNamespace'"
	 * @generated
	 */
	VarnameType getVarname();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getVarname <em>Varname</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Varname</em>' containment reference.
	 * @see #getVarname()
	 * @generated
	 */
	void setVarname(VarnameType value);

	/**
	 * Returns the value of the '<em><b>Videodata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Videodata</em>' containment reference.
	 * @see #setVideodata(VideodataType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Videodata()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='videodata' namespace='##targetNamespace'"
	 * @generated
	 */
	VideodataType getVideodata();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getVideodata <em>Videodata</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Videodata</em>' containment reference.
	 * @see #getVideodata()
	 * @generated
	 */
	void setVideodata(VideodataType value);

	/**
	 * Returns the value of the '<em><b>Videoobject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Videoobject</em>' containment reference.
	 * @see #setVideoobject(VideoobjectType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Videoobject()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='videoobject' namespace='##targetNamespace'"
	 * @generated
	 */
	VideoobjectType getVideoobject();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getVideoobject <em>Videoobject</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Videoobject</em>' containment reference.
	 * @see #getVideoobject()
	 * @generated
	 */
	void setVideoobject(VideoobjectType value);

	/**
	 * Returns the value of the '<em><b>Void</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Void</em>' containment reference.
	 * @see #setVoid(VoidType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Void()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='void' namespace='##targetNamespace'"
	 * @generated
	 */
	VoidType getVoid();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getVoid <em>Void</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Void</em>' containment reference.
	 * @see #getVoid()
	 * @generated
	 */
	void setVoid(VoidType value);

	/**
	 * Returns the value of the '<em><b>Volumenum</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Volumenum</em>' containment reference.
	 * @see #setVolumenum(VolumenumType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Volumenum()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='volumenum' namespace='##targetNamespace'"
	 * @generated
	 */
	VolumenumType getVolumenum();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getVolumenum <em>Volumenum</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Volumenum</em>' containment reference.
	 * @see #getVolumenum()
	 * @generated
	 */
	void setVolumenum(VolumenumType value);

	/**
	 * Returns the value of the '<em><b>Warning</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Warning</em>' containment reference.
	 * @see #setWarning(WarningType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Warning()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='warning' namespace='##targetNamespace'"
	 * @generated
	 */
	WarningType getWarning();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getWarning <em>Warning</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Warning</em>' containment reference.
	 * @see #getWarning()
	 * @generated
	 */
	void setWarning(WarningType value);

	/**
	 * Returns the value of the '<em><b>Wordasword</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wordasword</em>' containment reference.
	 * @see #setWordasword(WordaswordType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Wordasword()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='wordasword' namespace='##targetNamespace'"
	 * @generated
	 */
	WordaswordType getWordasword();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getWordasword <em>Wordasword</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wordasword</em>' containment reference.
	 * @see #getWordasword()
	 * @generated
	 */
	void setWordasword(WordaswordType value);

	/**
	 * Returns the value of the '<em><b>Xref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Xref</em>' containment reference.
	 * @see #setXref(XrefType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Xref()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='xref' namespace='##targetNamespace'"
	 * @generated
	 */
	XrefType getXref();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getXref <em>Xref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xref</em>' containment reference.
	 * @see #getXref()
	 * @generated
	 */
	void setXref(XrefType value);

	/**
	 * Returns the value of the '<em><b>Year</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Year</em>' containment reference.
	 * @see #setYear(YearType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getDocumentRoot_Year()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='year' namespace='##targetNamespace'"
	 * @generated
	 */
	YearType getYear();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.DocumentRoot#getYear <em>Year</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Year</em>' containment reference.
	 * @see #getYear()
	 * @generated
	 */
	void setYear(YearType value);

} // DocumentRoot
