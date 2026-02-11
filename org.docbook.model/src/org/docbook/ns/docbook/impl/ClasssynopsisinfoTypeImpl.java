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
import org.docbook.ns.docbook.ClasssynopsisinfoType;
import org.docbook.ns.docbook.CoType;
import org.docbook.ns.docbook.CodeType;
import org.docbook.ns.docbook.CommandType;
import org.docbook.ns.docbook.ComputeroutputType;
import org.docbook.ns.docbook.ConstantType;
import org.docbook.ns.docbook.ContinuationType1;
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
import org.docbook.ns.docbook.InfoType;
import org.docbook.ns.docbook.InitializerType;
import org.docbook.ns.docbook.InlineequationType;
import org.docbook.ns.docbook.InlinemediaobjectType;
import org.docbook.ns.docbook.InterfacenameType;
import org.docbook.ns.docbook.JobtitleType;
import org.docbook.ns.docbook.KeycapType;
import org.docbook.ns.docbook.KeycodeType;
import org.docbook.ns.docbook.KeycomboType;
import org.docbook.ns.docbook.KeysymType;
import org.docbook.ns.docbook.LineannotationType;
import org.docbook.ns.docbook.LinenumberingType1;
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
import org.docbook.ns.docbook.ShortcutType;
import org.docbook.ns.docbook.SubscriptType;
import org.docbook.ns.docbook.SuperscriptType;
import org.docbook.ns.docbook.SymbolType;
import org.docbook.ns.docbook.SystemitemType;
import org.docbook.ns.docbook.TagType;
import org.docbook.ns.docbook.TermdefType;
import org.docbook.ns.docbook.TextobjectType;
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

import org.eclipse.emf.ecore.xml.namespace.SpaceType;

import org.w3._1999.xlink.ActuateType;
import org.w3._1999.xlink.ShowType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Classsynopsisinfo Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.docbook.ns.docbook.impl.ClasssynopsisinfoTypeImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ClasssynopsisinfoTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ClasssynopsisinfoTypeImpl#getInfo <em>Info</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ClasssynopsisinfoTypeImpl#getTextobject <em>Textobject</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ClasssynopsisinfoTypeImpl#getInlinemediaobject <em>Inlinemediaobject</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ClasssynopsisinfoTypeImpl#getRemark <em>Remark</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ClasssynopsisinfoTypeImpl#getSuperscript <em>Superscript</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ClasssynopsisinfoTypeImpl#getSubscript <em>Subscript</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ClasssynopsisinfoTypeImpl#getXref <em>Xref</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ClasssynopsisinfoTypeImpl#getLink <em>Link</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ClasssynopsisinfoTypeImpl#getOlink <em>Olink</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ClasssynopsisinfoTypeImpl#getAnchor <em>Anchor</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ClasssynopsisinfoTypeImpl#getBiblioref <em>Biblioref</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ClasssynopsisinfoTypeImpl#getAlt <em>Alt</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ClasssynopsisinfoTypeImpl#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ClasssynopsisinfoTypeImpl#getIndexterm <em>Indexterm</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ClasssynopsisinfoTypeImpl#getAbbrev <em>Abbrev</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ClasssynopsisinfoTypeImpl#getAcronym <em>Acronym</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ClasssynopsisinfoTypeImpl#getDate <em>Date</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ClasssynopsisinfoTypeImpl#getEmphasis <em>Emphasis</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ClasssynopsisinfoTypeImpl#getFootnote <em>Footnote</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ClasssynopsisinfoTypeImpl#getFootnoteref <em>Footnoteref</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ClasssynopsisinfoTypeImpl#getForeignphrase <em>Foreignphrase</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ClasssynopsisinfoTypeImpl#getPhrase <em>Phrase</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ClasssynopsisinfoTypeImpl#getQuote <em>Quote</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ClasssynopsisinfoTypeImpl#getWordasword <em>Wordasword</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ClasssynopsisinfoTypeImpl#getFirstterm <em>Firstterm</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ClasssynopsisinfoTypeImpl#getGlossterm <em>Glossterm</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ClasssynopsisinfoTypeImpl#getCoref <em>Coref</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ClasssynopsisinfoTypeImpl#getTrademark <em>Trademark</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ClasssynopsisinfoTypeImpl#getProductnumber <em>Productnumber</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ClasssynopsisinfoTypeImpl#getProductname <em>Productname</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ClasssynopsisinfoTypeImpl#getDatabase <em>Database</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ClasssynopsisinfoTypeImpl#getApplication <em>Application</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ClasssynopsisinfoTypeImpl#getHardware <em>Hardware</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ClasssynopsisinfoTypeImpl#getCitation <em>Citation</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ClasssynopsisinfoTypeImpl#getCiterefentry <em>Citerefentry</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ClasssynopsisinfoTypeImpl#getCitetitle <em>Citetitle</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ClasssynopsisinfoTypeImpl#getCitebiblioid <em>Citebiblioid</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ClasssynopsisinfoTypeImpl#getAuthor <em>Author</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ClasssynopsisinfoTypeImpl#getPerson <em>Person</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ClasssynopsisinfoTypeImpl#getPersonname <em>Personname</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ClasssynopsisinfoTypeImpl#getOrg <em>Org</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ClasssynopsisinfoTypeImpl#getOrgname <em>Orgname</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ClasssynopsisinfoTypeImpl#getEditor <em>Editor</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ClasssynopsisinfoTypeImpl#getJobtitle <em>Jobtitle</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ClasssynopsisinfoTypeImpl#getReplaceable <em>Replaceable</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ClasssynopsisinfoTypeImpl#getPackage <em>Package</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ClasssynopsisinfoTypeImpl#getParameter <em>Parameter</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ClasssynopsisinfoTypeImpl#getTermdef <em>Termdef</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ClasssynopsisinfoTypeImpl#getNonterminal <em>Nonterminal</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ClasssynopsisinfoTypeImpl#getSystemitem <em>Systemitem</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ClasssynopsisinfoTypeImpl#getOption <em>Option</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ClasssynopsisinfoTypeImpl#getOptional <em>Optional</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ClasssynopsisinfoTypeImpl#getProperty <em>Property</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ClasssynopsisinfoTypeImpl#getInlineequation <em>Inlineequation</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ClasssynopsisinfoTypeImpl#getTag <em>Tag</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ClasssynopsisinfoTypeImpl#getMarkup <em>Markup</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ClasssynopsisinfoTypeImpl#getToken <em>Token</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ClasssynopsisinfoTypeImpl#getSymbol <em>Symbol</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ClasssynopsisinfoTypeImpl#getLiteral <em>Literal</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ClasssynopsisinfoTypeImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ClasssynopsisinfoTypeImpl#getConstant <em>Constant</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ClasssynopsisinfoTypeImpl#getEmail <em>Email</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ClasssynopsisinfoTypeImpl#getUri <em>Uri</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ClasssynopsisinfoTypeImpl#getGuiicon <em>Guiicon</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ClasssynopsisinfoTypeImpl#getGuibutton <em>Guibutton</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ClasssynopsisinfoTypeImpl#getGuimenuitem <em>Guimenuitem</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ClasssynopsisinfoTypeImpl#getGuimenu <em>Guimenu</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ClasssynopsisinfoTypeImpl#getGuisubmenu <em>Guisubmenu</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ClasssynopsisinfoTypeImpl#getGuilabel <em>Guilabel</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ClasssynopsisinfoTypeImpl#getMenuchoice <em>Menuchoice</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ClasssynopsisinfoTypeImpl#getMousebutton <em>Mousebutton</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ClasssynopsisinfoTypeImpl#getKeycombo <em>Keycombo</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ClasssynopsisinfoTypeImpl#getKeycap <em>Keycap</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ClasssynopsisinfoTypeImpl#getKeycode <em>Keycode</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ClasssynopsisinfoTypeImpl#getKeysym <em>Keysym</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ClasssynopsisinfoTypeImpl#getShortcut <em>Shortcut</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ClasssynopsisinfoTypeImpl#getAccel <em>Accel</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ClasssynopsisinfoTypeImpl#getPrompt <em>Prompt</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ClasssynopsisinfoTypeImpl#getEnvar <em>Envar</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ClasssynopsisinfoTypeImpl#getFilename <em>Filename</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ClasssynopsisinfoTypeImpl#getCommand <em>Command</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ClasssynopsisinfoTypeImpl#getComputeroutput <em>Computeroutput</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ClasssynopsisinfoTypeImpl#getUserinput <em>Userinput</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ClasssynopsisinfoTypeImpl#getFunction <em>Function</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ClasssynopsisinfoTypeImpl#getVarname <em>Varname</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ClasssynopsisinfoTypeImpl#getReturnvalue <em>Returnvalue</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ClasssynopsisinfoTypeImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ClasssynopsisinfoTypeImpl#getClassname <em>Classname</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ClasssynopsisinfoTypeImpl#getExceptionname <em>Exceptionname</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ClasssynopsisinfoTypeImpl#getInterfacename <em>Interfacename</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ClasssynopsisinfoTypeImpl#getMethodname <em>Methodname</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ClasssynopsisinfoTypeImpl#getModifier <em>Modifier</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ClasssynopsisinfoTypeImpl#getInitializer <em>Initializer</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ClasssynopsisinfoTypeImpl#getOoclass <em>Ooclass</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ClasssynopsisinfoTypeImpl#getOoexception <em>Ooexception</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ClasssynopsisinfoTypeImpl#getOointerface <em>Oointerface</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ClasssynopsisinfoTypeImpl#getErrorcode <em>Errorcode</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ClasssynopsisinfoTypeImpl#getErrortext <em>Errortext</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ClasssynopsisinfoTypeImpl#getErrorname <em>Errorname</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ClasssynopsisinfoTypeImpl#getErrortype <em>Errortype</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ClasssynopsisinfoTypeImpl#getLineannotation <em>Lineannotation</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ClasssynopsisinfoTypeImpl#getCo <em>Co</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ClasssynopsisinfoTypeImpl#getActuate <em>Actuate</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ClasssynopsisinfoTypeImpl#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ClasssynopsisinfoTypeImpl#getArch <em>Arch</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ClasssynopsisinfoTypeImpl#getArcrole <em>Arcrole</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ClasssynopsisinfoTypeImpl#getAudience <em>Audience</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ClasssynopsisinfoTypeImpl#getBase <em>Base</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ClasssynopsisinfoTypeImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ClasssynopsisinfoTypeImpl#getConformance <em>Conformance</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ClasssynopsisinfoTypeImpl#getContinuation <em>Continuation</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ClasssynopsisinfoTypeImpl#getDir <em>Dir</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ClasssynopsisinfoTypeImpl#getHref <em>Href</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ClasssynopsisinfoTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ClasssynopsisinfoTypeImpl#getLang <em>Lang</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ClasssynopsisinfoTypeImpl#getLanguage <em>Language</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ClasssynopsisinfoTypeImpl#getLinenumbering <em>Linenumbering</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ClasssynopsisinfoTypeImpl#getLinkend <em>Linkend</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ClasssynopsisinfoTypeImpl#getOs <em>Os</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ClasssynopsisinfoTypeImpl#getRemap <em>Remap</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ClasssynopsisinfoTypeImpl#getRevision <em>Revision</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ClasssynopsisinfoTypeImpl#getRevisionflag <em>Revisionflag</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ClasssynopsisinfoTypeImpl#getRole <em>Role</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ClasssynopsisinfoTypeImpl#getRole1 <em>Role1</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ClasssynopsisinfoTypeImpl#getSecurity <em>Security</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ClasssynopsisinfoTypeImpl#getShow <em>Show</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ClasssynopsisinfoTypeImpl#getSpace <em>Space</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ClasssynopsisinfoTypeImpl#getStartinglinenumber <em>Startinglinenumber</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ClasssynopsisinfoTypeImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ClasssynopsisinfoTypeImpl#getType1 <em>Type1</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ClasssynopsisinfoTypeImpl#getUserlevel <em>Userlevel</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ClasssynopsisinfoTypeImpl#getVendor <em>Vendor</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ClasssynopsisinfoTypeImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ClasssynopsisinfoTypeImpl#getWordsize <em>Wordsize</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ClasssynopsisinfoTypeImpl#getXreflabel <em>Xreflabel</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClasssynopsisinfoTypeImpl extends MinimalEObjectImpl.Container implements ClasssynopsisinfoType {
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
	 * The default value of the '{@link #getContinuation() <em>Continuation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContinuation()
	 * @generated
	 * @ordered
	 */
	protected static final ContinuationType1 CONTINUATION_EDEFAULT = ContinuationType1.CONTINUES;

	/**
	 * The cached value of the '{@link #getContinuation() <em>Continuation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContinuation()
	 * @generated
	 * @ordered
	 */
	protected ContinuationType1 continuation = CONTINUATION_EDEFAULT;

	/**
	 * This is true if the Continuation attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean continuationESet;

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
	 * The default value of the '{@link #getLanguage() <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected static final Object LANGUAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLanguage() <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected Object language = LANGUAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLinenumbering() <em>Linenumbering</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinenumbering()
	 * @generated
	 * @ordered
	 */
	protected static final LinenumberingType1 LINENUMBERING_EDEFAULT = LinenumberingType1.NUMBERED;

	/**
	 * The cached value of the '{@link #getLinenumbering() <em>Linenumbering</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinenumbering()
	 * @generated
	 * @ordered
	 */
	protected LinenumberingType1 linenumbering = LINENUMBERING_EDEFAULT;

	/**
	 * This is true if the Linenumbering attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean linenumberingESet;

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
	 * The default value of the '{@link #getSpace() <em>Space</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpace()
	 * @generated
	 * @ordered
	 */
	protected static final SpaceType SPACE_EDEFAULT = SpaceType.DEFAULT_LITERAL;

	/**
	 * The cached value of the '{@link #getSpace() <em>Space</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpace()
	 * @generated
	 * @ordered
	 */
	protected SpaceType space = SPACE_EDEFAULT;

	/**
	 * This is true if the Space attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean spaceESet;

	/**
	 * The default value of the '{@link #getStartinglinenumber() <em>Startinglinenumber</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartinglinenumber()
	 * @generated
	 * @ordered
	 */
	protected static final String STARTINGLINENUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStartinglinenumber() <em>Startinglinenumber</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartinglinenumber()
	 * @generated
	 * @ordered
	 */
	protected String startinglinenumber = STARTINGLINENUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final Object TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected Object title = TITLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getType1() <em>Type1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType1()
	 * @generated
	 * @ordered
	 */
	protected static final Object TYPE1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType1() <em>Type1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType1()
	 * @generated
	 * @ordered
	 */
	protected Object type1 = TYPE1_EDEFAULT;

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
	protected ClasssynopsisinfoTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DocbookPackage.eINSTANCE.getClasssynopsisinfoType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, DocbookPackage.CLASSSYNOPSISINFO_TYPE__MIXED);
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
		return (FeatureMap)getMixed().<FeatureMap.Entry>list(DocbookPackage.eINSTANCE.getClasssynopsisinfoType_Group());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InfoType> getInfo() {
		return getGroup().list(DocbookPackage.eINSTANCE.getClasssynopsisinfoType_Info());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TextobjectType> getTextobject() {
		return getGroup().list(DocbookPackage.eINSTANCE.getClasssynopsisinfoType_Textobject());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InlinemediaobjectType> getInlinemediaobject() {
		return getGroup().list(DocbookPackage.eINSTANCE.getClasssynopsisinfoType_Inlinemediaobject());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RemarkType> getRemark() {
		return getGroup().list(DocbookPackage.eINSTANCE.getClasssynopsisinfoType_Remark());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SuperscriptType> getSuperscript() {
		return getGroup().list(DocbookPackage.eINSTANCE.getClasssynopsisinfoType_Superscript());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SubscriptType> getSubscript() {
		return getGroup().list(DocbookPackage.eINSTANCE.getClasssynopsisinfoType_Subscript());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<XrefType> getXref() {
		return getGroup().list(DocbookPackage.eINSTANCE.getClasssynopsisinfoType_Xref());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<LinkType> getLink() {
		return getGroup().list(DocbookPackage.eINSTANCE.getClasssynopsisinfoType_Link());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<OlinkType> getOlink() {
		return getGroup().list(DocbookPackage.eINSTANCE.getClasssynopsisinfoType_Olink());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AnchorType> getAnchor() {
		return getGroup().list(DocbookPackage.eINSTANCE.getClasssynopsisinfoType_Anchor());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BibliorefType> getBiblioref() {
		return getGroup().list(DocbookPackage.eINSTANCE.getClasssynopsisinfoType_Biblioref());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AltType> getAlt() {
		return getGroup().list(DocbookPackage.eINSTANCE.getClasssynopsisinfoType_Alt());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AnnotationType> getAnnotation() {
		return getGroup().list(DocbookPackage.eINSTANCE.getClasssynopsisinfoType_Annotation());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<IndextermType> getIndexterm() {
		return getGroup().list(DocbookPackage.eINSTANCE.getClasssynopsisinfoType_Indexterm());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbbrevType> getAbbrev() {
		return getGroup().list(DocbookPackage.eINSTANCE.getClasssynopsisinfoType_Abbrev());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AcronymType> getAcronym() {
		return getGroup().list(DocbookPackage.eINSTANCE.getClasssynopsisinfoType_Acronym());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DateType> getDate() {
		return getGroup().list(DocbookPackage.eINSTANCE.getClasssynopsisinfoType_Date());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EmphasisType> getEmphasis() {
		return getGroup().list(DocbookPackage.eINSTANCE.getClasssynopsisinfoType_Emphasis());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FootnoteType> getFootnote() {
		return getGroup().list(DocbookPackage.eINSTANCE.getClasssynopsisinfoType_Footnote());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FootnoterefType> getFootnoteref() {
		return getGroup().list(DocbookPackage.eINSTANCE.getClasssynopsisinfoType_Footnoteref());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ForeignphraseType> getForeignphrase() {
		return getGroup().list(DocbookPackage.eINSTANCE.getClasssynopsisinfoType_Foreignphrase());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PhraseType> getPhrase() {
		return getGroup().list(DocbookPackage.eINSTANCE.getClasssynopsisinfoType_Phrase());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<QuoteType> getQuote() {
		return getGroup().list(DocbookPackage.eINSTANCE.getClasssynopsisinfoType_Quote());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<WordaswordType> getWordasword() {
		return getGroup().list(DocbookPackage.eINSTANCE.getClasssynopsisinfoType_Wordasword());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FirsttermType> getFirstterm() {
		return getGroup().list(DocbookPackage.eINSTANCE.getClasssynopsisinfoType_Firstterm());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<GlosstermType> getGlossterm() {
		return getGroup().list(DocbookPackage.eINSTANCE.getClasssynopsisinfoType_Glossterm());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CorefType> getCoref() {
		return getGroup().list(DocbookPackage.eINSTANCE.getClasssynopsisinfoType_Coref());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TrademarkType> getTrademark() {
		return getGroup().list(DocbookPackage.eINSTANCE.getClasssynopsisinfoType_Trademark());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ProductnumberType> getProductnumber() {
		return getGroup().list(DocbookPackage.eINSTANCE.getClasssynopsisinfoType_Productnumber());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ProductnameType> getProductname() {
		return getGroup().list(DocbookPackage.eINSTANCE.getClasssynopsisinfoType_Productname());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DatabaseType> getDatabase() {
		return getGroup().list(DocbookPackage.eINSTANCE.getClasssynopsisinfoType_Database());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ApplicationType> getApplication() {
		return getGroup().list(DocbookPackage.eINSTANCE.getClasssynopsisinfoType_Application());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<HardwareType> getHardware() {
		return getGroup().list(DocbookPackage.eINSTANCE.getClasssynopsisinfoType_Hardware());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CitationType> getCitation() {
		return getGroup().list(DocbookPackage.eINSTANCE.getClasssynopsisinfoType_Citation());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CiterefentryType> getCiterefentry() {
		return getGroup().list(DocbookPackage.eINSTANCE.getClasssynopsisinfoType_Citerefentry());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CitetitleType> getCitetitle() {
		return getGroup().list(DocbookPackage.eINSTANCE.getClasssynopsisinfoType_Citetitle());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CitebiblioidType> getCitebiblioid() {
		return getGroup().list(DocbookPackage.eINSTANCE.getClasssynopsisinfoType_Citebiblioid());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AuthorType> getAuthor() {
		return getGroup().list(DocbookPackage.eINSTANCE.getClasssynopsisinfoType_Author());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PersonType> getPerson() {
		return getGroup().list(DocbookPackage.eINSTANCE.getClasssynopsisinfoType_Person());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PersonnameType> getPersonname() {
		return getGroup().list(DocbookPackage.eINSTANCE.getClasssynopsisinfoType_Personname());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<OrgType> getOrg() {
		return getGroup().list(DocbookPackage.eINSTANCE.getClasssynopsisinfoType_Org());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<OrgnameType> getOrgname() {
		return getGroup().list(DocbookPackage.eINSTANCE.getClasssynopsisinfoType_Orgname());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EditorType> getEditor() {
		return getGroup().list(DocbookPackage.eINSTANCE.getClasssynopsisinfoType_Editor());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<JobtitleType> getJobtitle() {
		return getGroup().list(DocbookPackage.eINSTANCE.getClasssynopsisinfoType_Jobtitle());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ReplaceableType> getReplaceable() {
		return getGroup().list(DocbookPackage.eINSTANCE.getClasssynopsisinfoType_Replaceable());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PackageType> getPackage() {
		return getGroup().list(DocbookPackage.eINSTANCE.getClasssynopsisinfoType_Package());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ParameterType> getParameter() {
		return getGroup().list(DocbookPackage.eINSTANCE.getClasssynopsisinfoType_Parameter());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TermdefType> getTermdef() {
		return getGroup().list(DocbookPackage.eINSTANCE.getClasssynopsisinfoType_Termdef());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NonterminalType> getNonterminal() {
		return getGroup().list(DocbookPackage.eINSTANCE.getClasssynopsisinfoType_Nonterminal());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SystemitemType> getSystemitem() {
		return getGroup().list(DocbookPackage.eINSTANCE.getClasssynopsisinfoType_Systemitem());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<OptionType> getOption() {
		return getGroup().list(DocbookPackage.eINSTANCE.getClasssynopsisinfoType_Option());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<OptionalType> getOptional() {
		return getGroup().list(DocbookPackage.eINSTANCE.getClasssynopsisinfoType_Optional());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PropertyType> getProperty() {
		return getGroup().list(DocbookPackage.eINSTANCE.getClasssynopsisinfoType_Property());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InlineequationType> getInlineequation() {
		return getGroup().list(DocbookPackage.eINSTANCE.getClasssynopsisinfoType_Inlineequation());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TagType> getTag() {
		return getGroup().list(DocbookPackage.eINSTANCE.getClasssynopsisinfoType_Tag());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MarkupType> getMarkup() {
		return getGroup().list(DocbookPackage.eINSTANCE.getClasssynopsisinfoType_Markup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TokenType> getToken() {
		return getGroup().list(DocbookPackage.eINSTANCE.getClasssynopsisinfoType_Token());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SymbolType> getSymbol() {
		return getGroup().list(DocbookPackage.eINSTANCE.getClasssynopsisinfoType_Symbol());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<LiteralType> getLiteral() {
		return getGroup().list(DocbookPackage.eINSTANCE.getClasssynopsisinfoType_Literal());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeType> getCode() {
		return getGroup().list(DocbookPackage.eINSTANCE.getClasssynopsisinfoType_Code());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ConstantType> getConstant() {
		return getGroup().list(DocbookPackage.eINSTANCE.getClasssynopsisinfoType_Constant());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EmailType> getEmail() {
		return getGroup().list(DocbookPackage.eINSTANCE.getClasssynopsisinfoType_Email());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<UriType> getUri() {
		return getGroup().list(DocbookPackage.eINSTANCE.getClasssynopsisinfoType_Uri());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<GuiiconType> getGuiicon() {
		return getGroup().list(DocbookPackage.eINSTANCE.getClasssynopsisinfoType_Guiicon());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<GuibuttonType> getGuibutton() {
		return getGroup().list(DocbookPackage.eINSTANCE.getClasssynopsisinfoType_Guibutton());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<GuimenuitemType> getGuimenuitem() {
		return getGroup().list(DocbookPackage.eINSTANCE.getClasssynopsisinfoType_Guimenuitem());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<GuimenuType> getGuimenu() {
		return getGroup().list(DocbookPackage.eINSTANCE.getClasssynopsisinfoType_Guimenu());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<GuisubmenuType> getGuisubmenu() {
		return getGroup().list(DocbookPackage.eINSTANCE.getClasssynopsisinfoType_Guisubmenu());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<GuilabelType> getGuilabel() {
		return getGroup().list(DocbookPackage.eINSTANCE.getClasssynopsisinfoType_Guilabel());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MenuchoiceType> getMenuchoice() {
		return getGroup().list(DocbookPackage.eINSTANCE.getClasssynopsisinfoType_Menuchoice());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MousebuttonType> getMousebutton() {
		return getGroup().list(DocbookPackage.eINSTANCE.getClasssynopsisinfoType_Mousebutton());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<KeycomboType> getKeycombo() {
		return getGroup().list(DocbookPackage.eINSTANCE.getClasssynopsisinfoType_Keycombo());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<KeycapType> getKeycap() {
		return getGroup().list(DocbookPackage.eINSTANCE.getClasssynopsisinfoType_Keycap());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<KeycodeType> getKeycode() {
		return getGroup().list(DocbookPackage.eINSTANCE.getClasssynopsisinfoType_Keycode());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<KeysymType> getKeysym() {
		return getGroup().list(DocbookPackage.eINSTANCE.getClasssynopsisinfoType_Keysym());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ShortcutType> getShortcut() {
		return getGroup().list(DocbookPackage.eINSTANCE.getClasssynopsisinfoType_Shortcut());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AccelType> getAccel() {
		return getGroup().list(DocbookPackage.eINSTANCE.getClasssynopsisinfoType_Accel());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PromptType> getPrompt() {
		return getGroup().list(DocbookPackage.eINSTANCE.getClasssynopsisinfoType_Prompt());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EnvarType> getEnvar() {
		return getGroup().list(DocbookPackage.eINSTANCE.getClasssynopsisinfoType_Envar());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FilenameType> getFilename() {
		return getGroup().list(DocbookPackage.eINSTANCE.getClasssynopsisinfoType_Filename());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CommandType> getCommand() {
		return getGroup().list(DocbookPackage.eINSTANCE.getClasssynopsisinfoType_Command());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ComputeroutputType> getComputeroutput() {
		return getGroup().list(DocbookPackage.eINSTANCE.getClasssynopsisinfoType_Computeroutput());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<UserinputType> getUserinput() {
		return getGroup().list(DocbookPackage.eINSTANCE.getClasssynopsisinfoType_Userinput());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FunctionType1> getFunction() {
		return getGroup().list(DocbookPackage.eINSTANCE.getClasssynopsisinfoType_Function());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<VarnameType> getVarname() {
		return getGroup().list(DocbookPackage.eINSTANCE.getClasssynopsisinfoType_Varname());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ReturnvalueType> getReturnvalue() {
		return getGroup().list(DocbookPackage.eINSTANCE.getClasssynopsisinfoType_Returnvalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TypeType2> getType() {
		return getGroup().list(DocbookPackage.eINSTANCE.getClasssynopsisinfoType_Type());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ClassnameType> getClassname() {
		return getGroup().list(DocbookPackage.eINSTANCE.getClasssynopsisinfoType_Classname());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ExceptionnameType> getExceptionname() {
		return getGroup().list(DocbookPackage.eINSTANCE.getClasssynopsisinfoType_Exceptionname());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InterfacenameType> getInterfacename() {
		return getGroup().list(DocbookPackage.eINSTANCE.getClasssynopsisinfoType_Interfacename());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MethodnameType> getMethodname() {
		return getGroup().list(DocbookPackage.eINSTANCE.getClasssynopsisinfoType_Methodname());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ModifierType> getModifier() {
		return getGroup().list(DocbookPackage.eINSTANCE.getClasssynopsisinfoType_Modifier());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InitializerType> getInitializer() {
		return getGroup().list(DocbookPackage.eINSTANCE.getClasssynopsisinfoType_Initializer());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<OoclassType> getOoclass() {
		return getGroup().list(DocbookPackage.eINSTANCE.getClasssynopsisinfoType_Ooclass());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<OoexceptionType> getOoexception() {
		return getGroup().list(DocbookPackage.eINSTANCE.getClasssynopsisinfoType_Ooexception());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<OointerfaceType> getOointerface() {
		return getGroup().list(DocbookPackage.eINSTANCE.getClasssynopsisinfoType_Oointerface());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ErrorcodeType> getErrorcode() {
		return getGroup().list(DocbookPackage.eINSTANCE.getClasssynopsisinfoType_Errorcode());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ErrortextType> getErrortext() {
		return getGroup().list(DocbookPackage.eINSTANCE.getClasssynopsisinfoType_Errortext());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ErrornameType> getErrorname() {
		return getGroup().list(DocbookPackage.eINSTANCE.getClasssynopsisinfoType_Errorname());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ErrortypeType> getErrortype() {
		return getGroup().list(DocbookPackage.eINSTANCE.getClasssynopsisinfoType_Errortype());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<LineannotationType> getLineannotation() {
		return getGroup().list(DocbookPackage.eINSTANCE.getClasssynopsisinfoType_Lineannotation());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CoType> getCo() {
		return getGroup().list(DocbookPackage.eINSTANCE.getClasssynopsisinfoType_Co());
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.CLASSSYNOPSISINFO_TYPE__ACTUATE, oldActuate, actuate, !oldActuateESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, DocbookPackage.CLASSSYNOPSISINFO_TYPE__ACTUATE, oldActuate, ACTUATE_EDEFAULT, oldActuateESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.CLASSSYNOPSISINFO_TYPE__ANNOTATIONS, oldAnnotations, annotations));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.CLASSSYNOPSISINFO_TYPE__ARCH, oldArch, arch));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.CLASSSYNOPSISINFO_TYPE__ARCROLE, oldArcrole, arcrole));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.CLASSSYNOPSISINFO_TYPE__AUDIENCE, oldAudience, audience));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.CLASSSYNOPSISINFO_TYPE__BASE, oldBase, base));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.CLASSSYNOPSISINFO_TYPE__CONDITION, oldCondition, condition));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.CLASSSYNOPSISINFO_TYPE__CONFORMANCE, oldConformance, conformance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContinuationType1 getContinuation() {
		return continuation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContinuation(ContinuationType1 newContinuation) {
		ContinuationType1 oldContinuation = continuation;
		continuation = newContinuation == null ? CONTINUATION_EDEFAULT : newContinuation;
		boolean oldContinuationESet = continuationESet;
		continuationESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.CLASSSYNOPSISINFO_TYPE__CONTINUATION, oldContinuation, continuation, !oldContinuationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetContinuation() {
		ContinuationType1 oldContinuation = continuation;
		boolean oldContinuationESet = continuationESet;
		continuation = CONTINUATION_EDEFAULT;
		continuationESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DocbookPackage.CLASSSYNOPSISINFO_TYPE__CONTINUATION, oldContinuation, CONTINUATION_EDEFAULT, oldContinuationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetContinuation() {
		return continuationESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.CLASSSYNOPSISINFO_TYPE__DIR, oldDir, dir, !oldDirESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, DocbookPackage.CLASSSYNOPSISINFO_TYPE__DIR, oldDir, DIR_EDEFAULT, oldDirESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.CLASSSYNOPSISINFO_TYPE__HREF, oldHref, href));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.CLASSSYNOPSISINFO_TYPE__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.CLASSSYNOPSISINFO_TYPE__LANG, oldLang, lang));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getLanguage() {
		return language;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLanguage(Object newLanguage) {
		Object oldLanguage = language;
		language = newLanguage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.CLASSSYNOPSISINFO_TYPE__LANGUAGE, oldLanguage, language));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LinenumberingType1 getLinenumbering() {
		return linenumbering;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLinenumbering(LinenumberingType1 newLinenumbering) {
		LinenumberingType1 oldLinenumbering = linenumbering;
		linenumbering = newLinenumbering == null ? LINENUMBERING_EDEFAULT : newLinenumbering;
		boolean oldLinenumberingESet = linenumberingESet;
		linenumberingESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.CLASSSYNOPSISINFO_TYPE__LINENUMBERING, oldLinenumbering, linenumbering, !oldLinenumberingESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetLinenumbering() {
		LinenumberingType1 oldLinenumbering = linenumbering;
		boolean oldLinenumberingESet = linenumberingESet;
		linenumbering = LINENUMBERING_EDEFAULT;
		linenumberingESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DocbookPackage.CLASSSYNOPSISINFO_TYPE__LINENUMBERING, oldLinenumbering, LINENUMBERING_EDEFAULT, oldLinenumberingESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetLinenumbering() {
		return linenumberingESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.CLASSSYNOPSISINFO_TYPE__LINKEND, oldLinkend, linkend));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.CLASSSYNOPSISINFO_TYPE__OS, oldOs, os));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.CLASSSYNOPSISINFO_TYPE__REMAP, oldRemap, remap));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.CLASSSYNOPSISINFO_TYPE__REVISION, oldRevision, revision));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.CLASSSYNOPSISINFO_TYPE__REVISIONFLAG, oldRevisionflag, revisionflag, !oldRevisionflagESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, DocbookPackage.CLASSSYNOPSISINFO_TYPE__REVISIONFLAG, oldRevisionflag, REVISIONFLAG_EDEFAULT, oldRevisionflagESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.CLASSSYNOPSISINFO_TYPE__ROLE, oldRole, role));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.CLASSSYNOPSISINFO_TYPE__ROLE1, oldRole1, role1));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.CLASSSYNOPSISINFO_TYPE__SECURITY, oldSecurity, security));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.CLASSSYNOPSISINFO_TYPE__SHOW, oldShow, show, !oldShowESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, DocbookPackage.CLASSSYNOPSISINFO_TYPE__SHOW, oldShow, SHOW_EDEFAULT, oldShowESet));
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
	public SpaceType getSpace() {
		return space;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSpace(SpaceType newSpace) {
		SpaceType oldSpace = space;
		space = newSpace == null ? SPACE_EDEFAULT : newSpace;
		boolean oldSpaceESet = spaceESet;
		spaceESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.CLASSSYNOPSISINFO_TYPE__SPACE, oldSpace, space, !oldSpaceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetSpace() {
		SpaceType oldSpace = space;
		boolean oldSpaceESet = spaceESet;
		space = SPACE_EDEFAULT;
		spaceESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DocbookPackage.CLASSSYNOPSISINFO_TYPE__SPACE, oldSpace, SPACE_EDEFAULT, oldSpaceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetSpace() {
		return spaceESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStartinglinenumber() {
		return startinglinenumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStartinglinenumber(String newStartinglinenumber) {
		String oldStartinglinenumber = startinglinenumber;
		startinglinenumber = newStartinglinenumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.CLASSSYNOPSISINFO_TYPE__STARTINGLINENUMBER, oldStartinglinenumber, startinglinenumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTitle(Object newTitle) {
		Object oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.CLASSSYNOPSISINFO_TYPE__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getType1() {
		return type1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType1(Object newType1) {
		Object oldType1 = type1;
		type1 = newType1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.CLASSSYNOPSISINFO_TYPE__TYPE1, oldType1, type1));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.CLASSSYNOPSISINFO_TYPE__USERLEVEL, oldUserlevel, userlevel));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.CLASSSYNOPSISINFO_TYPE__VENDOR, oldVendor, vendor));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.CLASSSYNOPSISINFO_TYPE__VERSION, oldVersion, version));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.CLASSSYNOPSISINFO_TYPE__WORDSIZE, oldWordsize, wordsize));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.CLASSSYNOPSISINFO_TYPE__XREFLABEL, oldXreflabel, xreflabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__INFO:
				return ((InternalEList<?>)getInfo()).basicRemove(otherEnd, msgs);
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__TEXTOBJECT:
				return ((InternalEList<?>)getTextobject()).basicRemove(otherEnd, msgs);
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__INLINEMEDIAOBJECT:
				return ((InternalEList<?>)getInlinemediaobject()).basicRemove(otherEnd, msgs);
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__REMARK:
				return ((InternalEList<?>)getRemark()).basicRemove(otherEnd, msgs);
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__SUPERSCRIPT:
				return ((InternalEList<?>)getSuperscript()).basicRemove(otherEnd, msgs);
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__SUBSCRIPT:
				return ((InternalEList<?>)getSubscript()).basicRemove(otherEnd, msgs);
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__XREF:
				return ((InternalEList<?>)getXref()).basicRemove(otherEnd, msgs);
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__LINK:
				return ((InternalEList<?>)getLink()).basicRemove(otherEnd, msgs);
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__OLINK:
				return ((InternalEList<?>)getOlink()).basicRemove(otherEnd, msgs);
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__ANCHOR:
				return ((InternalEList<?>)getAnchor()).basicRemove(otherEnd, msgs);
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__BIBLIOREF:
				return ((InternalEList<?>)getBiblioref()).basicRemove(otherEnd, msgs);
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__ALT:
				return ((InternalEList<?>)getAlt()).basicRemove(otherEnd, msgs);
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__ANNOTATION:
				return ((InternalEList<?>)getAnnotation()).basicRemove(otherEnd, msgs);
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__INDEXTERM:
				return ((InternalEList<?>)getIndexterm()).basicRemove(otherEnd, msgs);
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__ABBREV:
				return ((InternalEList<?>)getAbbrev()).basicRemove(otherEnd, msgs);
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__ACRONYM:
				return ((InternalEList<?>)getAcronym()).basicRemove(otherEnd, msgs);
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__DATE:
				return ((InternalEList<?>)getDate()).basicRemove(otherEnd, msgs);
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__EMPHASIS:
				return ((InternalEList<?>)getEmphasis()).basicRemove(otherEnd, msgs);
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__FOOTNOTE:
				return ((InternalEList<?>)getFootnote()).basicRemove(otherEnd, msgs);
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__FOOTNOTEREF:
				return ((InternalEList<?>)getFootnoteref()).basicRemove(otherEnd, msgs);
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__FOREIGNPHRASE:
				return ((InternalEList<?>)getForeignphrase()).basicRemove(otherEnd, msgs);
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__PHRASE:
				return ((InternalEList<?>)getPhrase()).basicRemove(otherEnd, msgs);
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__QUOTE:
				return ((InternalEList<?>)getQuote()).basicRemove(otherEnd, msgs);
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__WORDASWORD:
				return ((InternalEList<?>)getWordasword()).basicRemove(otherEnd, msgs);
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__FIRSTTERM:
				return ((InternalEList<?>)getFirstterm()).basicRemove(otherEnd, msgs);
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__GLOSSTERM:
				return ((InternalEList<?>)getGlossterm()).basicRemove(otherEnd, msgs);
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__COREF:
				return ((InternalEList<?>)getCoref()).basicRemove(otherEnd, msgs);
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__TRADEMARK:
				return ((InternalEList<?>)getTrademark()).basicRemove(otherEnd, msgs);
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__PRODUCTNUMBER:
				return ((InternalEList<?>)getProductnumber()).basicRemove(otherEnd, msgs);
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__PRODUCTNAME:
				return ((InternalEList<?>)getProductname()).basicRemove(otherEnd, msgs);
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__DATABASE:
				return ((InternalEList<?>)getDatabase()).basicRemove(otherEnd, msgs);
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__APPLICATION:
				return ((InternalEList<?>)getApplication()).basicRemove(otherEnd, msgs);
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__HARDWARE:
				return ((InternalEList<?>)getHardware()).basicRemove(otherEnd, msgs);
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__CITATION:
				return ((InternalEList<?>)getCitation()).basicRemove(otherEnd, msgs);
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__CITEREFENTRY:
				return ((InternalEList<?>)getCiterefentry()).basicRemove(otherEnd, msgs);
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__CITETITLE:
				return ((InternalEList<?>)getCitetitle()).basicRemove(otherEnd, msgs);
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__CITEBIBLIOID:
				return ((InternalEList<?>)getCitebiblioid()).basicRemove(otherEnd, msgs);
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__AUTHOR:
				return ((InternalEList<?>)getAuthor()).basicRemove(otherEnd, msgs);
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__PERSON:
				return ((InternalEList<?>)getPerson()).basicRemove(otherEnd, msgs);
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__PERSONNAME:
				return ((InternalEList<?>)getPersonname()).basicRemove(otherEnd, msgs);
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__ORG:
				return ((InternalEList<?>)getOrg()).basicRemove(otherEnd, msgs);
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__ORGNAME:
				return ((InternalEList<?>)getOrgname()).basicRemove(otherEnd, msgs);
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__EDITOR:
				return ((InternalEList<?>)getEditor()).basicRemove(otherEnd, msgs);
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__JOBTITLE:
				return ((InternalEList<?>)getJobtitle()).basicRemove(otherEnd, msgs);
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__REPLACEABLE:
				return ((InternalEList<?>)getReplaceable()).basicRemove(otherEnd, msgs);
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__PACKAGE:
				return ((InternalEList<?>)getPackage()).basicRemove(otherEnd, msgs);
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__PARAMETER:
				return ((InternalEList<?>)getParameter()).basicRemove(otherEnd, msgs);
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__TERMDEF:
				return ((InternalEList<?>)getTermdef()).basicRemove(otherEnd, msgs);
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__NONTERMINAL:
				return ((InternalEList<?>)getNonterminal()).basicRemove(otherEnd, msgs);
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__SYSTEMITEM:
				return ((InternalEList<?>)getSystemitem()).basicRemove(otherEnd, msgs);
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__OPTION:
				return ((InternalEList<?>)getOption()).basicRemove(otherEnd, msgs);
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__OPTIONAL:
				return ((InternalEList<?>)getOptional()).basicRemove(otherEnd, msgs);
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__PROPERTY:
				return ((InternalEList<?>)getProperty()).basicRemove(otherEnd, msgs);
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__INLINEEQUATION:
				return ((InternalEList<?>)getInlineequation()).basicRemove(otherEnd, msgs);
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__TAG:
				return ((InternalEList<?>)getTag()).basicRemove(otherEnd, msgs);
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__MARKUP:
				return ((InternalEList<?>)getMarkup()).basicRemove(otherEnd, msgs);
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__TOKEN:
				return ((InternalEList<?>)getToken()).basicRemove(otherEnd, msgs);
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__SYMBOL:
				return ((InternalEList<?>)getSymbol()).basicRemove(otherEnd, msgs);
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__LITERAL:
				return ((InternalEList<?>)getLiteral()).basicRemove(otherEnd, msgs);
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__CODE:
				return ((InternalEList<?>)getCode()).basicRemove(otherEnd, msgs);
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__CONSTANT:
				return ((InternalEList<?>)getConstant()).basicRemove(otherEnd, msgs);
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__EMAIL:
				return ((InternalEList<?>)getEmail()).basicRemove(otherEnd, msgs);
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__URI:
				return ((InternalEList<?>)getUri()).basicRemove(otherEnd, msgs);
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__GUIICON:
				return ((InternalEList<?>)getGuiicon()).basicRemove(otherEnd, msgs);
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__GUIBUTTON:
				return ((InternalEList<?>)getGuibutton()).basicRemove(otherEnd, msgs);
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__GUIMENUITEM:
				return ((InternalEList<?>)getGuimenuitem()).basicRemove(otherEnd, msgs);
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__GUIMENU:
				return ((InternalEList<?>)getGuimenu()).basicRemove(otherEnd, msgs);
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__GUISUBMENU:
				return ((InternalEList<?>)getGuisubmenu()).basicRemove(otherEnd, msgs);
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__GUILABEL:
				return ((InternalEList<?>)getGuilabel()).basicRemove(otherEnd, msgs);
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__MENUCHOICE:
				return ((InternalEList<?>)getMenuchoice()).basicRemove(otherEnd, msgs);
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__MOUSEBUTTON:
				return ((InternalEList<?>)getMousebutton()).basicRemove(otherEnd, msgs);
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__KEYCOMBO:
				return ((InternalEList<?>)getKeycombo()).basicRemove(otherEnd, msgs);
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__KEYCAP:
				return ((InternalEList<?>)getKeycap()).basicRemove(otherEnd, msgs);
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__KEYCODE:
				return ((InternalEList<?>)getKeycode()).basicRemove(otherEnd, msgs);
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__KEYSYM:
				return ((InternalEList<?>)getKeysym()).basicRemove(otherEnd, msgs);
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__SHORTCUT:
				return ((InternalEList<?>)getShortcut()).basicRemove(otherEnd, msgs);
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__ACCEL:
				return ((InternalEList<?>)getAccel()).basicRemove(otherEnd, msgs);
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__PROMPT:
				return ((InternalEList<?>)getPrompt()).basicRemove(otherEnd, msgs);
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__ENVAR:
				return ((InternalEList<?>)getEnvar()).basicRemove(otherEnd, msgs);
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__FILENAME:
				return ((InternalEList<?>)getFilename()).basicRemove(otherEnd, msgs);
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__COMMAND:
				return ((InternalEList<?>)getCommand()).basicRemove(otherEnd, msgs);
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__COMPUTEROUTPUT:
				return ((InternalEList<?>)getComputeroutput()).basicRemove(otherEnd, msgs);
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__USERINPUT:
				return ((InternalEList<?>)getUserinput()).basicRemove(otherEnd, msgs);
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__FUNCTION:
				return ((InternalEList<?>)getFunction()).basicRemove(otherEnd, msgs);
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__VARNAME:
				return ((InternalEList<?>)getVarname()).basicRemove(otherEnd, msgs);
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__RETURNVALUE:
				return ((InternalEList<?>)getReturnvalue()).basicRemove(otherEnd, msgs);
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__TYPE:
				return ((InternalEList<?>)getType()).basicRemove(otherEnd, msgs);
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__CLASSNAME:
				return ((InternalEList<?>)getClassname()).basicRemove(otherEnd, msgs);
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__EXCEPTIONNAME:
				return ((InternalEList<?>)getExceptionname()).basicRemove(otherEnd, msgs);
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__INTERFACENAME:
				return ((InternalEList<?>)getInterfacename()).basicRemove(otherEnd, msgs);
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__METHODNAME:
				return ((InternalEList<?>)getMethodname()).basicRemove(otherEnd, msgs);
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__MODIFIER:
				return ((InternalEList<?>)getModifier()).basicRemove(otherEnd, msgs);
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__INITIALIZER:
				return ((InternalEList<?>)getInitializer()).basicRemove(otherEnd, msgs);
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__OOCLASS:
				return ((InternalEList<?>)getOoclass()).basicRemove(otherEnd, msgs);
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__OOEXCEPTION:
				return ((InternalEList<?>)getOoexception()).basicRemove(otherEnd, msgs);
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__OOINTERFACE:
				return ((InternalEList<?>)getOointerface()).basicRemove(otherEnd, msgs);
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__ERRORCODE:
				return ((InternalEList<?>)getErrorcode()).basicRemove(otherEnd, msgs);
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__ERRORTEXT:
				return ((InternalEList<?>)getErrortext()).basicRemove(otherEnd, msgs);
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__ERRORNAME:
				return ((InternalEList<?>)getErrorname()).basicRemove(otherEnd, msgs);
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__ERRORTYPE:
				return ((InternalEList<?>)getErrortype()).basicRemove(otherEnd, msgs);
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__LINEANNOTATION:
				return ((InternalEList<?>)getLineannotation()).basicRemove(otherEnd, msgs);
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__CO:
				return ((InternalEList<?>)getCo()).basicRemove(otherEnd, msgs);
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
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__INFO:
				return getInfo();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__TEXTOBJECT:
				return getTextobject();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__INLINEMEDIAOBJECT:
				return getInlinemediaobject();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__REMARK:
				return getRemark();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__SUPERSCRIPT:
				return getSuperscript();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__SUBSCRIPT:
				return getSubscript();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__XREF:
				return getXref();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__LINK:
				return getLink();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__OLINK:
				return getOlink();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__ANCHOR:
				return getAnchor();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__BIBLIOREF:
				return getBiblioref();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__ALT:
				return getAlt();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__ANNOTATION:
				return getAnnotation();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__INDEXTERM:
				return getIndexterm();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__ABBREV:
				return getAbbrev();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__ACRONYM:
				return getAcronym();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__DATE:
				return getDate();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__EMPHASIS:
				return getEmphasis();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__FOOTNOTE:
				return getFootnote();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__FOOTNOTEREF:
				return getFootnoteref();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__FOREIGNPHRASE:
				return getForeignphrase();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__PHRASE:
				return getPhrase();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__QUOTE:
				return getQuote();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__WORDASWORD:
				return getWordasword();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__FIRSTTERM:
				return getFirstterm();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__GLOSSTERM:
				return getGlossterm();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__COREF:
				return getCoref();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__TRADEMARK:
				return getTrademark();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__PRODUCTNUMBER:
				return getProductnumber();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__PRODUCTNAME:
				return getProductname();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__DATABASE:
				return getDatabase();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__APPLICATION:
				return getApplication();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__HARDWARE:
				return getHardware();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__CITATION:
				return getCitation();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__CITEREFENTRY:
				return getCiterefentry();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__CITETITLE:
				return getCitetitle();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__CITEBIBLIOID:
				return getCitebiblioid();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__AUTHOR:
				return getAuthor();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__PERSON:
				return getPerson();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__PERSONNAME:
				return getPersonname();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__ORG:
				return getOrg();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__ORGNAME:
				return getOrgname();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__EDITOR:
				return getEditor();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__JOBTITLE:
				return getJobtitle();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__REPLACEABLE:
				return getReplaceable();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__PACKAGE:
				return getPackage();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__PARAMETER:
				return getParameter();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__TERMDEF:
				return getTermdef();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__NONTERMINAL:
				return getNonterminal();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__SYSTEMITEM:
				return getSystemitem();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__OPTION:
				return getOption();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__OPTIONAL:
				return getOptional();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__PROPERTY:
				return getProperty();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__INLINEEQUATION:
				return getInlineequation();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__TAG:
				return getTag();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__MARKUP:
				return getMarkup();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__TOKEN:
				return getToken();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__SYMBOL:
				return getSymbol();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__LITERAL:
				return getLiteral();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__CODE:
				return getCode();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__CONSTANT:
				return getConstant();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__EMAIL:
				return getEmail();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__URI:
				return getUri();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__GUIICON:
				return getGuiicon();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__GUIBUTTON:
				return getGuibutton();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__GUIMENUITEM:
				return getGuimenuitem();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__GUIMENU:
				return getGuimenu();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__GUISUBMENU:
				return getGuisubmenu();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__GUILABEL:
				return getGuilabel();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__MENUCHOICE:
				return getMenuchoice();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__MOUSEBUTTON:
				return getMousebutton();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__KEYCOMBO:
				return getKeycombo();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__KEYCAP:
				return getKeycap();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__KEYCODE:
				return getKeycode();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__KEYSYM:
				return getKeysym();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__SHORTCUT:
				return getShortcut();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__ACCEL:
				return getAccel();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__PROMPT:
				return getPrompt();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__ENVAR:
				return getEnvar();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__FILENAME:
				return getFilename();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__COMMAND:
				return getCommand();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__COMPUTEROUTPUT:
				return getComputeroutput();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__USERINPUT:
				return getUserinput();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__FUNCTION:
				return getFunction();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__VARNAME:
				return getVarname();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__RETURNVALUE:
				return getReturnvalue();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__TYPE:
				return getType();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__CLASSNAME:
				return getClassname();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__EXCEPTIONNAME:
				return getExceptionname();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__INTERFACENAME:
				return getInterfacename();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__METHODNAME:
				return getMethodname();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__MODIFIER:
				return getModifier();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__INITIALIZER:
				return getInitializer();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__OOCLASS:
				return getOoclass();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__OOEXCEPTION:
				return getOoexception();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__OOINTERFACE:
				return getOointerface();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__ERRORCODE:
				return getErrorcode();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__ERRORTEXT:
				return getErrortext();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__ERRORNAME:
				return getErrorname();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__ERRORTYPE:
				return getErrortype();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__LINEANNOTATION:
				return getLineannotation();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__CO:
				return getCo();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__ACTUATE:
				return getActuate();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__ANNOTATIONS:
				return getAnnotations();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__ARCH:
				return getArch();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__ARCROLE:
				return getArcrole();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__AUDIENCE:
				return getAudience();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__BASE:
				return getBase();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__CONDITION:
				return getCondition();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__CONFORMANCE:
				return getConformance();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__CONTINUATION:
				return getContinuation();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__DIR:
				return getDir();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__HREF:
				return getHref();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__ID:
				return getId();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__LANG:
				return getLang();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__LANGUAGE:
				return getLanguage();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__LINENUMBERING:
				return getLinenumbering();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__LINKEND:
				return getLinkend();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__OS:
				return getOs();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__REMAP:
				return getRemap();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__REVISION:
				return getRevision();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__REVISIONFLAG:
				return getRevisionflag();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__ROLE:
				return getRole();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__ROLE1:
				return getRole1();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__SECURITY:
				return getSecurity();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__SHOW:
				return getShow();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__SPACE:
				return getSpace();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__STARTINGLINENUMBER:
				return getStartinglinenumber();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__TITLE:
				return getTitle();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__TYPE1:
				return getType1();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__USERLEVEL:
				return getUserlevel();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__VENDOR:
				return getVendor();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__VERSION:
				return getVersion();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__WORDSIZE:
				return getWordsize();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__XREFLABEL:
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
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__INFO:
				getInfo().clear();
				getInfo().addAll((Collection<? extends InfoType>)newValue);
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__TEXTOBJECT:
				getTextobject().clear();
				getTextobject().addAll((Collection<? extends TextobjectType>)newValue);
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__INLINEMEDIAOBJECT:
				getInlinemediaobject().clear();
				getInlinemediaobject().addAll((Collection<? extends InlinemediaobjectType>)newValue);
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__REMARK:
				getRemark().clear();
				getRemark().addAll((Collection<? extends RemarkType>)newValue);
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__SUPERSCRIPT:
				getSuperscript().clear();
				getSuperscript().addAll((Collection<? extends SuperscriptType>)newValue);
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__SUBSCRIPT:
				getSubscript().clear();
				getSubscript().addAll((Collection<? extends SubscriptType>)newValue);
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__XREF:
				getXref().clear();
				getXref().addAll((Collection<? extends XrefType>)newValue);
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__LINK:
				getLink().clear();
				getLink().addAll((Collection<? extends LinkType>)newValue);
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__OLINK:
				getOlink().clear();
				getOlink().addAll((Collection<? extends OlinkType>)newValue);
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__ANCHOR:
				getAnchor().clear();
				getAnchor().addAll((Collection<? extends AnchorType>)newValue);
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__BIBLIOREF:
				getBiblioref().clear();
				getBiblioref().addAll((Collection<? extends BibliorefType>)newValue);
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__ALT:
				getAlt().clear();
				getAlt().addAll((Collection<? extends AltType>)newValue);
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__ANNOTATION:
				getAnnotation().clear();
				getAnnotation().addAll((Collection<? extends AnnotationType>)newValue);
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__INDEXTERM:
				getIndexterm().clear();
				getIndexterm().addAll((Collection<? extends IndextermType>)newValue);
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__ABBREV:
				getAbbrev().clear();
				getAbbrev().addAll((Collection<? extends AbbrevType>)newValue);
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__ACRONYM:
				getAcronym().clear();
				getAcronym().addAll((Collection<? extends AcronymType>)newValue);
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__DATE:
				getDate().clear();
				getDate().addAll((Collection<? extends DateType>)newValue);
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__EMPHASIS:
				getEmphasis().clear();
				getEmphasis().addAll((Collection<? extends EmphasisType>)newValue);
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__FOOTNOTE:
				getFootnote().clear();
				getFootnote().addAll((Collection<? extends FootnoteType>)newValue);
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__FOOTNOTEREF:
				getFootnoteref().clear();
				getFootnoteref().addAll((Collection<? extends FootnoterefType>)newValue);
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__FOREIGNPHRASE:
				getForeignphrase().clear();
				getForeignphrase().addAll((Collection<? extends ForeignphraseType>)newValue);
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__PHRASE:
				getPhrase().clear();
				getPhrase().addAll((Collection<? extends PhraseType>)newValue);
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__QUOTE:
				getQuote().clear();
				getQuote().addAll((Collection<? extends QuoteType>)newValue);
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__WORDASWORD:
				getWordasword().clear();
				getWordasword().addAll((Collection<? extends WordaswordType>)newValue);
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__FIRSTTERM:
				getFirstterm().clear();
				getFirstterm().addAll((Collection<? extends FirsttermType>)newValue);
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__GLOSSTERM:
				getGlossterm().clear();
				getGlossterm().addAll((Collection<? extends GlosstermType>)newValue);
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__COREF:
				getCoref().clear();
				getCoref().addAll((Collection<? extends CorefType>)newValue);
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__TRADEMARK:
				getTrademark().clear();
				getTrademark().addAll((Collection<? extends TrademarkType>)newValue);
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__PRODUCTNUMBER:
				getProductnumber().clear();
				getProductnumber().addAll((Collection<? extends ProductnumberType>)newValue);
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__PRODUCTNAME:
				getProductname().clear();
				getProductname().addAll((Collection<? extends ProductnameType>)newValue);
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__DATABASE:
				getDatabase().clear();
				getDatabase().addAll((Collection<? extends DatabaseType>)newValue);
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__APPLICATION:
				getApplication().clear();
				getApplication().addAll((Collection<? extends ApplicationType>)newValue);
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__HARDWARE:
				getHardware().clear();
				getHardware().addAll((Collection<? extends HardwareType>)newValue);
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__CITATION:
				getCitation().clear();
				getCitation().addAll((Collection<? extends CitationType>)newValue);
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__CITEREFENTRY:
				getCiterefentry().clear();
				getCiterefentry().addAll((Collection<? extends CiterefentryType>)newValue);
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__CITETITLE:
				getCitetitle().clear();
				getCitetitle().addAll((Collection<? extends CitetitleType>)newValue);
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__CITEBIBLIOID:
				getCitebiblioid().clear();
				getCitebiblioid().addAll((Collection<? extends CitebiblioidType>)newValue);
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__AUTHOR:
				getAuthor().clear();
				getAuthor().addAll((Collection<? extends AuthorType>)newValue);
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__PERSON:
				getPerson().clear();
				getPerson().addAll((Collection<? extends PersonType>)newValue);
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__PERSONNAME:
				getPersonname().clear();
				getPersonname().addAll((Collection<? extends PersonnameType>)newValue);
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__ORG:
				getOrg().clear();
				getOrg().addAll((Collection<? extends OrgType>)newValue);
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__ORGNAME:
				getOrgname().clear();
				getOrgname().addAll((Collection<? extends OrgnameType>)newValue);
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__EDITOR:
				getEditor().clear();
				getEditor().addAll((Collection<? extends EditorType>)newValue);
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__JOBTITLE:
				getJobtitle().clear();
				getJobtitle().addAll((Collection<? extends JobtitleType>)newValue);
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__REPLACEABLE:
				getReplaceable().clear();
				getReplaceable().addAll((Collection<? extends ReplaceableType>)newValue);
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__PACKAGE:
				getPackage().clear();
				getPackage().addAll((Collection<? extends PackageType>)newValue);
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__PARAMETER:
				getParameter().clear();
				getParameter().addAll((Collection<? extends ParameterType>)newValue);
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__TERMDEF:
				getTermdef().clear();
				getTermdef().addAll((Collection<? extends TermdefType>)newValue);
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__NONTERMINAL:
				getNonterminal().clear();
				getNonterminal().addAll((Collection<? extends NonterminalType>)newValue);
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__SYSTEMITEM:
				getSystemitem().clear();
				getSystemitem().addAll((Collection<? extends SystemitemType>)newValue);
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__OPTION:
				getOption().clear();
				getOption().addAll((Collection<? extends OptionType>)newValue);
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__OPTIONAL:
				getOptional().clear();
				getOptional().addAll((Collection<? extends OptionalType>)newValue);
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__PROPERTY:
				getProperty().clear();
				getProperty().addAll((Collection<? extends PropertyType>)newValue);
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__INLINEEQUATION:
				getInlineequation().clear();
				getInlineequation().addAll((Collection<? extends InlineequationType>)newValue);
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__TAG:
				getTag().clear();
				getTag().addAll((Collection<? extends TagType>)newValue);
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__MARKUP:
				getMarkup().clear();
				getMarkup().addAll((Collection<? extends MarkupType>)newValue);
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__TOKEN:
				getToken().clear();
				getToken().addAll((Collection<? extends TokenType>)newValue);
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__SYMBOL:
				getSymbol().clear();
				getSymbol().addAll((Collection<? extends SymbolType>)newValue);
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__LITERAL:
				getLiteral().clear();
				getLiteral().addAll((Collection<? extends LiteralType>)newValue);
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__CODE:
				getCode().clear();
				getCode().addAll((Collection<? extends CodeType>)newValue);
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__CONSTANT:
				getConstant().clear();
				getConstant().addAll((Collection<? extends ConstantType>)newValue);
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__EMAIL:
				getEmail().clear();
				getEmail().addAll((Collection<? extends EmailType>)newValue);
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__URI:
				getUri().clear();
				getUri().addAll((Collection<? extends UriType>)newValue);
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__GUIICON:
				getGuiicon().clear();
				getGuiicon().addAll((Collection<? extends GuiiconType>)newValue);
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__GUIBUTTON:
				getGuibutton().clear();
				getGuibutton().addAll((Collection<? extends GuibuttonType>)newValue);
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__GUIMENUITEM:
				getGuimenuitem().clear();
				getGuimenuitem().addAll((Collection<? extends GuimenuitemType>)newValue);
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__GUIMENU:
				getGuimenu().clear();
				getGuimenu().addAll((Collection<? extends GuimenuType>)newValue);
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__GUISUBMENU:
				getGuisubmenu().clear();
				getGuisubmenu().addAll((Collection<? extends GuisubmenuType>)newValue);
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__GUILABEL:
				getGuilabel().clear();
				getGuilabel().addAll((Collection<? extends GuilabelType>)newValue);
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__MENUCHOICE:
				getMenuchoice().clear();
				getMenuchoice().addAll((Collection<? extends MenuchoiceType>)newValue);
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__MOUSEBUTTON:
				getMousebutton().clear();
				getMousebutton().addAll((Collection<? extends MousebuttonType>)newValue);
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__KEYCOMBO:
				getKeycombo().clear();
				getKeycombo().addAll((Collection<? extends KeycomboType>)newValue);
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__KEYCAP:
				getKeycap().clear();
				getKeycap().addAll((Collection<? extends KeycapType>)newValue);
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__KEYCODE:
				getKeycode().clear();
				getKeycode().addAll((Collection<? extends KeycodeType>)newValue);
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__KEYSYM:
				getKeysym().clear();
				getKeysym().addAll((Collection<? extends KeysymType>)newValue);
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__SHORTCUT:
				getShortcut().clear();
				getShortcut().addAll((Collection<? extends ShortcutType>)newValue);
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__ACCEL:
				getAccel().clear();
				getAccel().addAll((Collection<? extends AccelType>)newValue);
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__PROMPT:
				getPrompt().clear();
				getPrompt().addAll((Collection<? extends PromptType>)newValue);
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__ENVAR:
				getEnvar().clear();
				getEnvar().addAll((Collection<? extends EnvarType>)newValue);
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__FILENAME:
				getFilename().clear();
				getFilename().addAll((Collection<? extends FilenameType>)newValue);
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__COMMAND:
				getCommand().clear();
				getCommand().addAll((Collection<? extends CommandType>)newValue);
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__COMPUTEROUTPUT:
				getComputeroutput().clear();
				getComputeroutput().addAll((Collection<? extends ComputeroutputType>)newValue);
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__USERINPUT:
				getUserinput().clear();
				getUserinput().addAll((Collection<? extends UserinputType>)newValue);
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__FUNCTION:
				getFunction().clear();
				getFunction().addAll((Collection<? extends FunctionType1>)newValue);
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__VARNAME:
				getVarname().clear();
				getVarname().addAll((Collection<? extends VarnameType>)newValue);
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__RETURNVALUE:
				getReturnvalue().clear();
				getReturnvalue().addAll((Collection<? extends ReturnvalueType>)newValue);
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__TYPE:
				getType().clear();
				getType().addAll((Collection<? extends TypeType2>)newValue);
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__CLASSNAME:
				getClassname().clear();
				getClassname().addAll((Collection<? extends ClassnameType>)newValue);
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__EXCEPTIONNAME:
				getExceptionname().clear();
				getExceptionname().addAll((Collection<? extends ExceptionnameType>)newValue);
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__INTERFACENAME:
				getInterfacename().clear();
				getInterfacename().addAll((Collection<? extends InterfacenameType>)newValue);
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__METHODNAME:
				getMethodname().clear();
				getMethodname().addAll((Collection<? extends MethodnameType>)newValue);
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__MODIFIER:
				getModifier().clear();
				getModifier().addAll((Collection<? extends ModifierType>)newValue);
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__INITIALIZER:
				getInitializer().clear();
				getInitializer().addAll((Collection<? extends InitializerType>)newValue);
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__OOCLASS:
				getOoclass().clear();
				getOoclass().addAll((Collection<? extends OoclassType>)newValue);
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__OOEXCEPTION:
				getOoexception().clear();
				getOoexception().addAll((Collection<? extends OoexceptionType>)newValue);
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__OOINTERFACE:
				getOointerface().clear();
				getOointerface().addAll((Collection<? extends OointerfaceType>)newValue);
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__ERRORCODE:
				getErrorcode().clear();
				getErrorcode().addAll((Collection<? extends ErrorcodeType>)newValue);
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__ERRORTEXT:
				getErrortext().clear();
				getErrortext().addAll((Collection<? extends ErrortextType>)newValue);
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__ERRORNAME:
				getErrorname().clear();
				getErrorname().addAll((Collection<? extends ErrornameType>)newValue);
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__ERRORTYPE:
				getErrortype().clear();
				getErrortype().addAll((Collection<? extends ErrortypeType>)newValue);
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__LINEANNOTATION:
				getLineannotation().clear();
				getLineannotation().addAll((Collection<? extends LineannotationType>)newValue);
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__CO:
				getCo().clear();
				getCo().addAll((Collection<? extends CoType>)newValue);
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__ACTUATE:
				setActuate((ActuateType)newValue);
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__ANNOTATIONS:
				setAnnotations(newValue);
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__ARCH:
				setArch(newValue);
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__ARCROLE:
				setArcrole(newValue);
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__AUDIENCE:
				setAudience(newValue);
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__BASE:
				setBase(newValue);
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__CONDITION:
				setCondition(newValue);
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__CONFORMANCE:
				setConformance(newValue);
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__CONTINUATION:
				setContinuation((ContinuationType1)newValue);
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__DIR:
				setDir((DirType)newValue);
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__HREF:
				setHref(newValue);
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__ID:
				setId((String)newValue);
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__LANG:
				setLang(newValue);
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__LANGUAGE:
				setLanguage(newValue);
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__LINENUMBERING:
				setLinenumbering((LinenumberingType1)newValue);
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__LINKEND:
				setLinkend((String)newValue);
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__OS:
				setOs(newValue);
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__REMAP:
				setRemap(newValue);
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__REVISION:
				setRevision(newValue);
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__REVISIONFLAG:
				setRevisionflag((RevisionflagType)newValue);
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__ROLE:
				setRole(newValue);
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__ROLE1:
				setRole1(newValue);
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__SECURITY:
				setSecurity(newValue);
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__SHOW:
				setShow((ShowType)newValue);
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__SPACE:
				setSpace((SpaceType)newValue);
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__STARTINGLINENUMBER:
				setStartinglinenumber((String)newValue);
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__TITLE:
				setTitle(newValue);
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__TYPE1:
				setType1(newValue);
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__USERLEVEL:
				setUserlevel(newValue);
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__VENDOR:
				setVendor(newValue);
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__VERSION:
				setVersion(newValue);
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__WORDSIZE:
				setWordsize(newValue);
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__XREFLABEL:
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
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__MIXED:
				getMixed().clear();
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__GROUP:
				getGroup().clear();
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__INFO:
				getInfo().clear();
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__TEXTOBJECT:
				getTextobject().clear();
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__INLINEMEDIAOBJECT:
				getInlinemediaobject().clear();
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__REMARK:
				getRemark().clear();
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__SUPERSCRIPT:
				getSuperscript().clear();
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__SUBSCRIPT:
				getSubscript().clear();
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__XREF:
				getXref().clear();
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__LINK:
				getLink().clear();
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__OLINK:
				getOlink().clear();
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__ANCHOR:
				getAnchor().clear();
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__BIBLIOREF:
				getBiblioref().clear();
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__ALT:
				getAlt().clear();
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__ANNOTATION:
				getAnnotation().clear();
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__INDEXTERM:
				getIndexterm().clear();
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__ABBREV:
				getAbbrev().clear();
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__ACRONYM:
				getAcronym().clear();
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__DATE:
				getDate().clear();
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__EMPHASIS:
				getEmphasis().clear();
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__FOOTNOTE:
				getFootnote().clear();
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__FOOTNOTEREF:
				getFootnoteref().clear();
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__FOREIGNPHRASE:
				getForeignphrase().clear();
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__PHRASE:
				getPhrase().clear();
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__QUOTE:
				getQuote().clear();
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__WORDASWORD:
				getWordasword().clear();
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__FIRSTTERM:
				getFirstterm().clear();
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__GLOSSTERM:
				getGlossterm().clear();
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__COREF:
				getCoref().clear();
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__TRADEMARK:
				getTrademark().clear();
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__PRODUCTNUMBER:
				getProductnumber().clear();
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__PRODUCTNAME:
				getProductname().clear();
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__DATABASE:
				getDatabase().clear();
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__APPLICATION:
				getApplication().clear();
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__HARDWARE:
				getHardware().clear();
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__CITATION:
				getCitation().clear();
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__CITEREFENTRY:
				getCiterefentry().clear();
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__CITETITLE:
				getCitetitle().clear();
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__CITEBIBLIOID:
				getCitebiblioid().clear();
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__AUTHOR:
				getAuthor().clear();
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__PERSON:
				getPerson().clear();
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__PERSONNAME:
				getPersonname().clear();
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__ORG:
				getOrg().clear();
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__ORGNAME:
				getOrgname().clear();
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__EDITOR:
				getEditor().clear();
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__JOBTITLE:
				getJobtitle().clear();
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__REPLACEABLE:
				getReplaceable().clear();
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__PACKAGE:
				getPackage().clear();
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__PARAMETER:
				getParameter().clear();
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__TERMDEF:
				getTermdef().clear();
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__NONTERMINAL:
				getNonterminal().clear();
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__SYSTEMITEM:
				getSystemitem().clear();
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__OPTION:
				getOption().clear();
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__OPTIONAL:
				getOptional().clear();
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__PROPERTY:
				getProperty().clear();
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__INLINEEQUATION:
				getInlineequation().clear();
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__TAG:
				getTag().clear();
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__MARKUP:
				getMarkup().clear();
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__TOKEN:
				getToken().clear();
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__SYMBOL:
				getSymbol().clear();
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__LITERAL:
				getLiteral().clear();
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__CODE:
				getCode().clear();
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__CONSTANT:
				getConstant().clear();
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__EMAIL:
				getEmail().clear();
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__URI:
				getUri().clear();
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__GUIICON:
				getGuiicon().clear();
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__GUIBUTTON:
				getGuibutton().clear();
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__GUIMENUITEM:
				getGuimenuitem().clear();
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__GUIMENU:
				getGuimenu().clear();
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__GUISUBMENU:
				getGuisubmenu().clear();
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__GUILABEL:
				getGuilabel().clear();
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__MENUCHOICE:
				getMenuchoice().clear();
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__MOUSEBUTTON:
				getMousebutton().clear();
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__KEYCOMBO:
				getKeycombo().clear();
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__KEYCAP:
				getKeycap().clear();
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__KEYCODE:
				getKeycode().clear();
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__KEYSYM:
				getKeysym().clear();
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__SHORTCUT:
				getShortcut().clear();
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__ACCEL:
				getAccel().clear();
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__PROMPT:
				getPrompt().clear();
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__ENVAR:
				getEnvar().clear();
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__FILENAME:
				getFilename().clear();
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__COMMAND:
				getCommand().clear();
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__COMPUTEROUTPUT:
				getComputeroutput().clear();
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__USERINPUT:
				getUserinput().clear();
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__FUNCTION:
				getFunction().clear();
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__VARNAME:
				getVarname().clear();
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__RETURNVALUE:
				getReturnvalue().clear();
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__TYPE:
				getType().clear();
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__CLASSNAME:
				getClassname().clear();
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__EXCEPTIONNAME:
				getExceptionname().clear();
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__INTERFACENAME:
				getInterfacename().clear();
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__METHODNAME:
				getMethodname().clear();
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__MODIFIER:
				getModifier().clear();
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__INITIALIZER:
				getInitializer().clear();
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__OOCLASS:
				getOoclass().clear();
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__OOEXCEPTION:
				getOoexception().clear();
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__OOINTERFACE:
				getOointerface().clear();
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__ERRORCODE:
				getErrorcode().clear();
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__ERRORTEXT:
				getErrortext().clear();
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__ERRORNAME:
				getErrorname().clear();
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__ERRORTYPE:
				getErrortype().clear();
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__LINEANNOTATION:
				getLineannotation().clear();
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__CO:
				getCo().clear();
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__ACTUATE:
				unsetActuate();
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__ANNOTATIONS:
				setAnnotations(ANNOTATIONS_EDEFAULT);
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__ARCH:
				setArch(ARCH_EDEFAULT);
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__ARCROLE:
				setArcrole(ARCROLE_EDEFAULT);
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__AUDIENCE:
				setAudience(AUDIENCE_EDEFAULT);
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__BASE:
				setBase(BASE_EDEFAULT);
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__CONDITION:
				setCondition(CONDITION_EDEFAULT);
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__CONFORMANCE:
				setConformance(CONFORMANCE_EDEFAULT);
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__CONTINUATION:
				unsetContinuation();
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__DIR:
				unsetDir();
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__HREF:
				setHref(HREF_EDEFAULT);
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__ID:
				setId(ID_EDEFAULT);
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__LANG:
				setLang(LANG_EDEFAULT);
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__LANGUAGE:
				setLanguage(LANGUAGE_EDEFAULT);
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__LINENUMBERING:
				unsetLinenumbering();
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__LINKEND:
				setLinkend(LINKEND_EDEFAULT);
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__OS:
				setOs(OS_EDEFAULT);
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__REMAP:
				setRemap(REMAP_EDEFAULT);
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__REVISION:
				setRevision(REVISION_EDEFAULT);
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__REVISIONFLAG:
				unsetRevisionflag();
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__ROLE:
				setRole(ROLE_EDEFAULT);
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__ROLE1:
				setRole1(ROLE1_EDEFAULT);
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__SECURITY:
				setSecurity(SECURITY_EDEFAULT);
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__SHOW:
				unsetShow();
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__SPACE:
				unsetSpace();
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__STARTINGLINENUMBER:
				setStartinglinenumber(STARTINGLINENUMBER_EDEFAULT);
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__TYPE1:
				setType1(TYPE1_EDEFAULT);
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__USERLEVEL:
				setUserlevel(USERLEVEL_EDEFAULT);
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__VENDOR:
				setVendor(VENDOR_EDEFAULT);
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__WORDSIZE:
				setWordsize(WORDSIZE_EDEFAULT);
				return;
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__XREFLABEL:
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
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__MIXED:
				return mixed != null && !mixed.isEmpty();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__GROUP:
				return !getGroup().isEmpty();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__INFO:
				return !getInfo().isEmpty();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__TEXTOBJECT:
				return !getTextobject().isEmpty();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__INLINEMEDIAOBJECT:
				return !getInlinemediaobject().isEmpty();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__REMARK:
				return !getRemark().isEmpty();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__SUPERSCRIPT:
				return !getSuperscript().isEmpty();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__SUBSCRIPT:
				return !getSubscript().isEmpty();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__XREF:
				return !getXref().isEmpty();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__LINK:
				return !getLink().isEmpty();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__OLINK:
				return !getOlink().isEmpty();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__ANCHOR:
				return !getAnchor().isEmpty();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__BIBLIOREF:
				return !getBiblioref().isEmpty();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__ALT:
				return !getAlt().isEmpty();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__ANNOTATION:
				return !getAnnotation().isEmpty();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__INDEXTERM:
				return !getIndexterm().isEmpty();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__ABBREV:
				return !getAbbrev().isEmpty();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__ACRONYM:
				return !getAcronym().isEmpty();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__DATE:
				return !getDate().isEmpty();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__EMPHASIS:
				return !getEmphasis().isEmpty();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__FOOTNOTE:
				return !getFootnote().isEmpty();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__FOOTNOTEREF:
				return !getFootnoteref().isEmpty();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__FOREIGNPHRASE:
				return !getForeignphrase().isEmpty();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__PHRASE:
				return !getPhrase().isEmpty();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__QUOTE:
				return !getQuote().isEmpty();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__WORDASWORD:
				return !getWordasword().isEmpty();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__FIRSTTERM:
				return !getFirstterm().isEmpty();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__GLOSSTERM:
				return !getGlossterm().isEmpty();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__COREF:
				return !getCoref().isEmpty();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__TRADEMARK:
				return !getTrademark().isEmpty();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__PRODUCTNUMBER:
				return !getProductnumber().isEmpty();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__PRODUCTNAME:
				return !getProductname().isEmpty();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__DATABASE:
				return !getDatabase().isEmpty();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__APPLICATION:
				return !getApplication().isEmpty();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__HARDWARE:
				return !getHardware().isEmpty();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__CITATION:
				return !getCitation().isEmpty();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__CITEREFENTRY:
				return !getCiterefentry().isEmpty();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__CITETITLE:
				return !getCitetitle().isEmpty();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__CITEBIBLIOID:
				return !getCitebiblioid().isEmpty();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__AUTHOR:
				return !getAuthor().isEmpty();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__PERSON:
				return !getPerson().isEmpty();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__PERSONNAME:
				return !getPersonname().isEmpty();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__ORG:
				return !getOrg().isEmpty();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__ORGNAME:
				return !getOrgname().isEmpty();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__EDITOR:
				return !getEditor().isEmpty();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__JOBTITLE:
				return !getJobtitle().isEmpty();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__REPLACEABLE:
				return !getReplaceable().isEmpty();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__PACKAGE:
				return !getPackage().isEmpty();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__PARAMETER:
				return !getParameter().isEmpty();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__TERMDEF:
				return !getTermdef().isEmpty();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__NONTERMINAL:
				return !getNonterminal().isEmpty();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__SYSTEMITEM:
				return !getSystemitem().isEmpty();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__OPTION:
				return !getOption().isEmpty();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__OPTIONAL:
				return !getOptional().isEmpty();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__PROPERTY:
				return !getProperty().isEmpty();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__INLINEEQUATION:
				return !getInlineequation().isEmpty();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__TAG:
				return !getTag().isEmpty();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__MARKUP:
				return !getMarkup().isEmpty();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__TOKEN:
				return !getToken().isEmpty();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__SYMBOL:
				return !getSymbol().isEmpty();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__LITERAL:
				return !getLiteral().isEmpty();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__CODE:
				return !getCode().isEmpty();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__CONSTANT:
				return !getConstant().isEmpty();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__EMAIL:
				return !getEmail().isEmpty();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__URI:
				return !getUri().isEmpty();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__GUIICON:
				return !getGuiicon().isEmpty();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__GUIBUTTON:
				return !getGuibutton().isEmpty();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__GUIMENUITEM:
				return !getGuimenuitem().isEmpty();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__GUIMENU:
				return !getGuimenu().isEmpty();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__GUISUBMENU:
				return !getGuisubmenu().isEmpty();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__GUILABEL:
				return !getGuilabel().isEmpty();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__MENUCHOICE:
				return !getMenuchoice().isEmpty();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__MOUSEBUTTON:
				return !getMousebutton().isEmpty();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__KEYCOMBO:
				return !getKeycombo().isEmpty();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__KEYCAP:
				return !getKeycap().isEmpty();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__KEYCODE:
				return !getKeycode().isEmpty();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__KEYSYM:
				return !getKeysym().isEmpty();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__SHORTCUT:
				return !getShortcut().isEmpty();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__ACCEL:
				return !getAccel().isEmpty();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__PROMPT:
				return !getPrompt().isEmpty();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__ENVAR:
				return !getEnvar().isEmpty();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__FILENAME:
				return !getFilename().isEmpty();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__COMMAND:
				return !getCommand().isEmpty();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__COMPUTEROUTPUT:
				return !getComputeroutput().isEmpty();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__USERINPUT:
				return !getUserinput().isEmpty();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__FUNCTION:
				return !getFunction().isEmpty();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__VARNAME:
				return !getVarname().isEmpty();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__RETURNVALUE:
				return !getReturnvalue().isEmpty();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__TYPE:
				return !getType().isEmpty();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__CLASSNAME:
				return !getClassname().isEmpty();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__EXCEPTIONNAME:
				return !getExceptionname().isEmpty();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__INTERFACENAME:
				return !getInterfacename().isEmpty();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__METHODNAME:
				return !getMethodname().isEmpty();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__MODIFIER:
				return !getModifier().isEmpty();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__INITIALIZER:
				return !getInitializer().isEmpty();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__OOCLASS:
				return !getOoclass().isEmpty();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__OOEXCEPTION:
				return !getOoexception().isEmpty();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__OOINTERFACE:
				return !getOointerface().isEmpty();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__ERRORCODE:
				return !getErrorcode().isEmpty();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__ERRORTEXT:
				return !getErrortext().isEmpty();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__ERRORNAME:
				return !getErrorname().isEmpty();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__ERRORTYPE:
				return !getErrortype().isEmpty();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__LINEANNOTATION:
				return !getLineannotation().isEmpty();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__CO:
				return !getCo().isEmpty();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__ACTUATE:
				return isSetActuate();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__ANNOTATIONS:
				return ANNOTATIONS_EDEFAULT == null ? annotations != null : !ANNOTATIONS_EDEFAULT.equals(annotations);
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__ARCH:
				return ARCH_EDEFAULT == null ? arch != null : !ARCH_EDEFAULT.equals(arch);
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__ARCROLE:
				return ARCROLE_EDEFAULT == null ? arcrole != null : !ARCROLE_EDEFAULT.equals(arcrole);
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__AUDIENCE:
				return AUDIENCE_EDEFAULT == null ? audience != null : !AUDIENCE_EDEFAULT.equals(audience);
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__BASE:
				return BASE_EDEFAULT == null ? base != null : !BASE_EDEFAULT.equals(base);
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__CONDITION:
				return CONDITION_EDEFAULT == null ? condition != null : !CONDITION_EDEFAULT.equals(condition);
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__CONFORMANCE:
				return CONFORMANCE_EDEFAULT == null ? conformance != null : !CONFORMANCE_EDEFAULT.equals(conformance);
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__CONTINUATION:
				return isSetContinuation();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__DIR:
				return isSetDir();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__HREF:
				return HREF_EDEFAULT == null ? href != null : !HREF_EDEFAULT.equals(href);
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__LANG:
				return LANG_EDEFAULT == null ? lang != null : !LANG_EDEFAULT.equals(lang);
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__LANGUAGE:
				return LANGUAGE_EDEFAULT == null ? language != null : !LANGUAGE_EDEFAULT.equals(language);
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__LINENUMBERING:
				return isSetLinenumbering();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__LINKEND:
				return LINKEND_EDEFAULT == null ? linkend != null : !LINKEND_EDEFAULT.equals(linkend);
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__OS:
				return OS_EDEFAULT == null ? os != null : !OS_EDEFAULT.equals(os);
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__REMAP:
				return REMAP_EDEFAULT == null ? remap != null : !REMAP_EDEFAULT.equals(remap);
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__REVISION:
				return REVISION_EDEFAULT == null ? revision != null : !REVISION_EDEFAULT.equals(revision);
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__REVISIONFLAG:
				return isSetRevisionflag();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__ROLE:
				return ROLE_EDEFAULT == null ? role != null : !ROLE_EDEFAULT.equals(role);
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__ROLE1:
				return ROLE1_EDEFAULT == null ? role1 != null : !ROLE1_EDEFAULT.equals(role1);
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__SECURITY:
				return SECURITY_EDEFAULT == null ? security != null : !SECURITY_EDEFAULT.equals(security);
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__SHOW:
				return isSetShow();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__SPACE:
				return isSetSpace();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__STARTINGLINENUMBER:
				return STARTINGLINENUMBER_EDEFAULT == null ? startinglinenumber != null : !STARTINGLINENUMBER_EDEFAULT.equals(startinglinenumber);
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__TYPE1:
				return TYPE1_EDEFAULT == null ? type1 != null : !TYPE1_EDEFAULT.equals(type1);
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__USERLEVEL:
				return USERLEVEL_EDEFAULT == null ? userlevel != null : !USERLEVEL_EDEFAULT.equals(userlevel);
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__VENDOR:
				return VENDOR_EDEFAULT == null ? vendor != null : !VENDOR_EDEFAULT.equals(vendor);
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__WORDSIZE:
				return WORDSIZE_EDEFAULT == null ? wordsize != null : !WORDSIZE_EDEFAULT.equals(wordsize);
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE__XREFLABEL:
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
		result.append(", continuation: ");
		if (continuationESet) result.append(continuation); else result.append("<unset>");
		result.append(", dir: ");
		if (dirESet) result.append(dir); else result.append("<unset>");
		result.append(", href: ");
		result.append(href);
		result.append(", id: ");
		result.append(id);
		result.append(", lang: ");
		result.append(lang);
		result.append(", language: ");
		result.append(language);
		result.append(", linenumbering: ");
		if (linenumberingESet) result.append(linenumbering); else result.append("<unset>");
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
		result.append(", space: ");
		if (spaceESet) result.append(space); else result.append("<unset>");
		result.append(", startinglinenumber: ");
		result.append(startinglinenumber);
		result.append(", title: ");
		result.append(title);
		result.append(", type1: ");
		result.append(type1);
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

} //ClasssynopsisinfoTypeImpl
