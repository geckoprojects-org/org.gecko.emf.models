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
import org.docbook.ns.docbook.AddressType;
import org.docbook.ns.docbook.AlignType10;
import org.docbook.ns.docbook.AltType;
import org.docbook.ns.docbook.AnchorType;
import org.docbook.ns.docbook.AnnotationType;
import org.docbook.ns.docbook.ApplicationType;
import org.docbook.ns.docbook.AuthorType;
import org.docbook.ns.docbook.BibliolistType;
import org.docbook.ns.docbook.BibliorefType;
import org.docbook.ns.docbook.BlockquoteType;
import org.docbook.ns.docbook.BridgeheadType;
import org.docbook.ns.docbook.CalloutlistType;
import org.docbook.ns.docbook.CautionType;
import org.docbook.ns.docbook.CitationType;
import org.docbook.ns.docbook.CitebiblioidType;
import org.docbook.ns.docbook.CiterefentryType;
import org.docbook.ns.docbook.CitetitleType;
import org.docbook.ns.docbook.ClassnameType;
import org.docbook.ns.docbook.ClasssynopsisType;
import org.docbook.ns.docbook.CmdsynopsisType;
import org.docbook.ns.docbook.CodeType;
import org.docbook.ns.docbook.CommandType;
import org.docbook.ns.docbook.ComputeroutputType;
import org.docbook.ns.docbook.ConstantType;
import org.docbook.ns.docbook.ConstraintdefType;
import org.docbook.ns.docbook.ConstructorsynopsisType;
import org.docbook.ns.docbook.CorefType;
import org.docbook.ns.docbook.DatabaseType;
import org.docbook.ns.docbook.DateType;
import org.docbook.ns.docbook.DestructorsynopsisType;
import org.docbook.ns.docbook.DirType;
import org.docbook.ns.docbook.DocbookPackage;
import org.docbook.ns.docbook.EditorType;
import org.docbook.ns.docbook.EmailType;
import org.docbook.ns.docbook.EmphasisType;
import org.docbook.ns.docbook.EnvarType;
import org.docbook.ns.docbook.EpigraphType;
import org.docbook.ns.docbook.EquationType;
import org.docbook.ns.docbook.ErrorcodeType;
import org.docbook.ns.docbook.ErrornameType;
import org.docbook.ns.docbook.ErrortextType;
import org.docbook.ns.docbook.ErrortypeType;
import org.docbook.ns.docbook.ExampleType;
import org.docbook.ns.docbook.ExceptionnameType;
import org.docbook.ns.docbook.FieldsynopsisType;
import org.docbook.ns.docbook.FigureType;
import org.docbook.ns.docbook.FilenameType;
import org.docbook.ns.docbook.FirsttermType;
import org.docbook.ns.docbook.FootnoteType;
import org.docbook.ns.docbook.FootnoterefType;
import org.docbook.ns.docbook.ForeignphraseType;
import org.docbook.ns.docbook.FormalparaType;
import org.docbook.ns.docbook.FuncsynopsisType;
import org.docbook.ns.docbook.FunctionType1;
import org.docbook.ns.docbook.GlosslistType;
import org.docbook.ns.docbook.GlosstermType;
import org.docbook.ns.docbook.GuibuttonType;
import org.docbook.ns.docbook.GuiiconType;
import org.docbook.ns.docbook.GuilabelType;
import org.docbook.ns.docbook.GuimenuType;
import org.docbook.ns.docbook.GuimenuitemType;
import org.docbook.ns.docbook.GuisubmenuType;
import org.docbook.ns.docbook.HardwareType;
import org.docbook.ns.docbook.ImportantType;
import org.docbook.ns.docbook.IndextermType;
import org.docbook.ns.docbook.InformalequationType;
import org.docbook.ns.docbook.InformalexampleType;
import org.docbook.ns.docbook.InformalfigureType;
import org.docbook.ns.docbook.InformaltableType;
import org.docbook.ns.docbook.InitializerType;
import org.docbook.ns.docbook.InlineequationType;
import org.docbook.ns.docbook.InlinemediaobjectType;
import org.docbook.ns.docbook.InterfacenameType;
import org.docbook.ns.docbook.ItemizedlistType;
import org.docbook.ns.docbook.JobtitleType;
import org.docbook.ns.docbook.KeycapType;
import org.docbook.ns.docbook.KeycodeType;
import org.docbook.ns.docbook.KeycomboType;
import org.docbook.ns.docbook.KeysymType;
import org.docbook.ns.docbook.LinkType;
import org.docbook.ns.docbook.LiteralType;
import org.docbook.ns.docbook.LiterallayoutType;
import org.docbook.ns.docbook.MarkupType;
import org.docbook.ns.docbook.MediaobjectType;
import org.docbook.ns.docbook.MenuchoiceType;
import org.docbook.ns.docbook.MethodnameType;
import org.docbook.ns.docbook.MethodsynopsisType;
import org.docbook.ns.docbook.ModifierType;
import org.docbook.ns.docbook.MousebuttonType;
import org.docbook.ns.docbook.MsgsetType;
import org.docbook.ns.docbook.NonterminalType;
import org.docbook.ns.docbook.NoteType;
import org.docbook.ns.docbook.OlinkType;
import org.docbook.ns.docbook.OoclassType;
import org.docbook.ns.docbook.OoexceptionType;
import org.docbook.ns.docbook.OointerfaceType;
import org.docbook.ns.docbook.OptionType;
import org.docbook.ns.docbook.OptionalType;
import org.docbook.ns.docbook.OrderedlistType;
import org.docbook.ns.docbook.OrgType;
import org.docbook.ns.docbook.OrgnameType;
import org.docbook.ns.docbook.PackageType;
import org.docbook.ns.docbook.ParaType;
import org.docbook.ns.docbook.ParameterType;
import org.docbook.ns.docbook.PersonType;
import org.docbook.ns.docbook.PersonnameType;
import org.docbook.ns.docbook.PhraseType;
import org.docbook.ns.docbook.ProcedureType;
import org.docbook.ns.docbook.ProductionsetType;
import org.docbook.ns.docbook.ProductnameType;
import org.docbook.ns.docbook.ProductnumberType;
import org.docbook.ns.docbook.ProgramlistingType;
import org.docbook.ns.docbook.ProgramlistingcoType;
import org.docbook.ns.docbook.PromptType;
import org.docbook.ns.docbook.PropertyType;
import org.docbook.ns.docbook.QandasetType;
import org.docbook.ns.docbook.QuoteType;
import org.docbook.ns.docbook.RemarkType;
import org.docbook.ns.docbook.ReplaceableType;
import org.docbook.ns.docbook.ReturnvalueType;
import org.docbook.ns.docbook.RevhistoryType;
import org.docbook.ns.docbook.RevisionflagType;
import org.docbook.ns.docbook.ScopeType2;
import org.docbook.ns.docbook.ScreenType;
import org.docbook.ns.docbook.ScreencoType;
import org.docbook.ns.docbook.ScreenshotType;
import org.docbook.ns.docbook.SegmentedlistType;
import org.docbook.ns.docbook.ShortcutType;
import org.docbook.ns.docbook.SidebarType;
import org.docbook.ns.docbook.SimparaType;
import org.docbook.ns.docbook.SimplelistType;
import org.docbook.ns.docbook.SubscriptType;
import org.docbook.ns.docbook.SuperscriptType;
import org.docbook.ns.docbook.SymbolType;
import org.docbook.ns.docbook.SynopsisType;
import org.docbook.ns.docbook.SystemitemType;
import org.docbook.ns.docbook.TableType;
import org.docbook.ns.docbook.TagType;
import org.docbook.ns.docbook.TaskType;
import org.docbook.ns.docbook.TermdefType;
import org.docbook.ns.docbook.ThType;
import org.docbook.ns.docbook.TipType;
import org.docbook.ns.docbook.TokenType;
import org.docbook.ns.docbook.TrademarkType;
import org.docbook.ns.docbook.TypeType2;
import org.docbook.ns.docbook.UriType;
import org.docbook.ns.docbook.UserinputType;
import org.docbook.ns.docbook.ValignType3;
import org.docbook.ns.docbook.VariablelistType;
import org.docbook.ns.docbook.VarnameType;
import org.docbook.ns.docbook.WarningType;
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
 * An implementation of the model object '<em><b>Th Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.docbook.ns.docbook.impl.ThTypeImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ThTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ThTypeImpl#getInlinemediaobject <em>Inlinemediaobject</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ThTypeImpl#getRemark <em>Remark</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ThTypeImpl#getSuperscript <em>Superscript</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ThTypeImpl#getSubscript <em>Subscript</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ThTypeImpl#getXref <em>Xref</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ThTypeImpl#getLink <em>Link</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ThTypeImpl#getOlink <em>Olink</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ThTypeImpl#getAnchor <em>Anchor</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ThTypeImpl#getBiblioref <em>Biblioref</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ThTypeImpl#getAlt <em>Alt</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ThTypeImpl#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ThTypeImpl#getIndexterm <em>Indexterm</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ThTypeImpl#getAbbrev <em>Abbrev</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ThTypeImpl#getAcronym <em>Acronym</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ThTypeImpl#getDate <em>Date</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ThTypeImpl#getEmphasis <em>Emphasis</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ThTypeImpl#getFootnote <em>Footnote</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ThTypeImpl#getFootnoteref <em>Footnoteref</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ThTypeImpl#getForeignphrase <em>Foreignphrase</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ThTypeImpl#getPhrase <em>Phrase</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ThTypeImpl#getQuote <em>Quote</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ThTypeImpl#getWordasword <em>Wordasword</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ThTypeImpl#getFirstterm <em>Firstterm</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ThTypeImpl#getGlossterm <em>Glossterm</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ThTypeImpl#getCoref <em>Coref</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ThTypeImpl#getTrademark <em>Trademark</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ThTypeImpl#getProductnumber <em>Productnumber</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ThTypeImpl#getProductname <em>Productname</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ThTypeImpl#getDatabase <em>Database</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ThTypeImpl#getApplication <em>Application</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ThTypeImpl#getHardware <em>Hardware</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ThTypeImpl#getCitation <em>Citation</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ThTypeImpl#getCiterefentry <em>Citerefentry</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ThTypeImpl#getCitetitle <em>Citetitle</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ThTypeImpl#getCitebiblioid <em>Citebiblioid</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ThTypeImpl#getAuthor <em>Author</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ThTypeImpl#getPerson <em>Person</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ThTypeImpl#getPersonname <em>Personname</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ThTypeImpl#getOrg <em>Org</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ThTypeImpl#getOrgname <em>Orgname</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ThTypeImpl#getEditor <em>Editor</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ThTypeImpl#getJobtitle <em>Jobtitle</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ThTypeImpl#getReplaceable <em>Replaceable</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ThTypeImpl#getPackage <em>Package</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ThTypeImpl#getParameter <em>Parameter</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ThTypeImpl#getTermdef <em>Termdef</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ThTypeImpl#getNonterminal <em>Nonterminal</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ThTypeImpl#getSystemitem <em>Systemitem</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ThTypeImpl#getOption <em>Option</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ThTypeImpl#getOptional <em>Optional</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ThTypeImpl#getProperty <em>Property</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ThTypeImpl#getInlineequation <em>Inlineequation</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ThTypeImpl#getTag <em>Tag</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ThTypeImpl#getMarkup <em>Markup</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ThTypeImpl#getToken <em>Token</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ThTypeImpl#getSymbol <em>Symbol</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ThTypeImpl#getLiteral <em>Literal</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ThTypeImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ThTypeImpl#getConstant <em>Constant</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ThTypeImpl#getEmail <em>Email</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ThTypeImpl#getUri <em>Uri</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ThTypeImpl#getGuiicon <em>Guiicon</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ThTypeImpl#getGuibutton <em>Guibutton</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ThTypeImpl#getGuimenuitem <em>Guimenuitem</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ThTypeImpl#getGuimenu <em>Guimenu</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ThTypeImpl#getGuisubmenu <em>Guisubmenu</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ThTypeImpl#getGuilabel <em>Guilabel</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ThTypeImpl#getMenuchoice <em>Menuchoice</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ThTypeImpl#getMousebutton <em>Mousebutton</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ThTypeImpl#getKeycombo <em>Keycombo</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ThTypeImpl#getKeycap <em>Keycap</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ThTypeImpl#getKeycode <em>Keycode</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ThTypeImpl#getKeysym <em>Keysym</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ThTypeImpl#getShortcut <em>Shortcut</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ThTypeImpl#getAccel <em>Accel</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ThTypeImpl#getPrompt <em>Prompt</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ThTypeImpl#getEnvar <em>Envar</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ThTypeImpl#getFilename <em>Filename</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ThTypeImpl#getCommand <em>Command</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ThTypeImpl#getComputeroutput <em>Computeroutput</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ThTypeImpl#getUserinput <em>Userinput</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ThTypeImpl#getFunction <em>Function</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ThTypeImpl#getVarname <em>Varname</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ThTypeImpl#getReturnvalue <em>Returnvalue</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ThTypeImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ThTypeImpl#getClassname <em>Classname</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ThTypeImpl#getExceptionname <em>Exceptionname</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ThTypeImpl#getInterfacename <em>Interfacename</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ThTypeImpl#getMethodname <em>Methodname</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ThTypeImpl#getModifier <em>Modifier</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ThTypeImpl#getInitializer <em>Initializer</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ThTypeImpl#getOoclass <em>Ooclass</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ThTypeImpl#getOoexception <em>Ooexception</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ThTypeImpl#getOointerface <em>Oointerface</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ThTypeImpl#getErrorcode <em>Errorcode</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ThTypeImpl#getErrortext <em>Errortext</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ThTypeImpl#getErrorname <em>Errorname</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ThTypeImpl#getErrortype <em>Errortype</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ThTypeImpl#getItemizedlist <em>Itemizedlist</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ThTypeImpl#getOrderedlist <em>Orderedlist</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ThTypeImpl#getProcedure <em>Procedure</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ThTypeImpl#getSimplelist <em>Simplelist</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ThTypeImpl#getVariablelist <em>Variablelist</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ThTypeImpl#getSegmentedlist <em>Segmentedlist</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ThTypeImpl#getGlosslist <em>Glosslist</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ThTypeImpl#getBibliolist <em>Bibliolist</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ThTypeImpl#getCalloutlist <em>Calloutlist</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ThTypeImpl#getQandaset <em>Qandaset</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ThTypeImpl#getExample <em>Example</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ThTypeImpl#getFigure <em>Figure</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ThTypeImpl#getTable <em>Table</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ThTypeImpl#getEquation <em>Equation</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ThTypeImpl#getInformalexample <em>Informalexample</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ThTypeImpl#getInformalfigure <em>Informalfigure</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ThTypeImpl#getInformaltable <em>Informaltable</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ThTypeImpl#getInformalequation <em>Informalequation</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ThTypeImpl#getSidebar <em>Sidebar</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ThTypeImpl#getBlockquote <em>Blockquote</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ThTypeImpl#getAddress <em>Address</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ThTypeImpl#getEpigraph <em>Epigraph</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ThTypeImpl#getMediaobject <em>Mediaobject</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ThTypeImpl#getScreenshot <em>Screenshot</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ThTypeImpl#getTask <em>Task</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ThTypeImpl#getProductionset <em>Productionset</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ThTypeImpl#getConstraintdef <em>Constraintdef</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ThTypeImpl#getMsgset <em>Msgset</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ThTypeImpl#getScreen <em>Screen</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ThTypeImpl#getLiterallayout <em>Literallayout</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ThTypeImpl#getProgramlistingco <em>Programlistingco</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ThTypeImpl#getScreenco <em>Screenco</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ThTypeImpl#getProgramlisting <em>Programlisting</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ThTypeImpl#getSynopsis <em>Synopsis</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ThTypeImpl#getBridgehead <em>Bridgehead</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ThTypeImpl#getRevhistory <em>Revhistory</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ThTypeImpl#getFuncsynopsis <em>Funcsynopsis</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ThTypeImpl#getClasssynopsis <em>Classsynopsis</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ThTypeImpl#getMethodsynopsis <em>Methodsynopsis</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ThTypeImpl#getConstructorsynopsis <em>Constructorsynopsis</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ThTypeImpl#getDestructorsynopsis <em>Destructorsynopsis</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ThTypeImpl#getFieldsynopsis <em>Fieldsynopsis</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ThTypeImpl#getCmdsynopsis <em>Cmdsynopsis</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ThTypeImpl#getCaution <em>Caution</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ThTypeImpl#getImportant <em>Important</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ThTypeImpl#getNote <em>Note</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ThTypeImpl#getTip <em>Tip</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ThTypeImpl#getWarning <em>Warning</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ThTypeImpl#getPara <em>Para</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ThTypeImpl#getFormalpara <em>Formalpara</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ThTypeImpl#getSimpara <em>Simpara</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ThTypeImpl#getAbbr <em>Abbr</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ThTypeImpl#getAlign <em>Align</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ThTypeImpl#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ThTypeImpl#getArch <em>Arch</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ThTypeImpl#getAudience <em>Audience</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ThTypeImpl#getAxis <em>Axis</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ThTypeImpl#getBase <em>Base</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ThTypeImpl#getChar <em>Char</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ThTypeImpl#getCharoff <em>Charoff</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ThTypeImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ThTypeImpl#getColspan <em>Colspan</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ThTypeImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ThTypeImpl#getConformance <em>Conformance</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ThTypeImpl#getDir <em>Dir</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ThTypeImpl#getHeaders <em>Headers</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ThTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ThTypeImpl#getLang <em>Lang</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ThTypeImpl#getLang1 <em>Lang1</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ThTypeImpl#getOnclick <em>Onclick</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ThTypeImpl#getOndblclick <em>Ondblclick</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ThTypeImpl#getOnkeydown <em>Onkeydown</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ThTypeImpl#getOnkeypress <em>Onkeypress</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ThTypeImpl#getOnkeyup <em>Onkeyup</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ThTypeImpl#getOnmousedown <em>Onmousedown</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ThTypeImpl#getOnmousemove <em>Onmousemove</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ThTypeImpl#getOnmouseout <em>Onmouseout</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ThTypeImpl#getOnmouseover <em>Onmouseover</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ThTypeImpl#getOnmouseup <em>Onmouseup</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ThTypeImpl#getOs <em>Os</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ThTypeImpl#getRemap <em>Remap</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ThTypeImpl#getRevision <em>Revision</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ThTypeImpl#getRevisionflag <em>Revisionflag</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ThTypeImpl#getRowspan <em>Rowspan</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ThTypeImpl#getScope <em>Scope</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ThTypeImpl#getSecurity <em>Security</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ThTypeImpl#getStyle <em>Style</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ThTypeImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ThTypeImpl#getUserlevel <em>Userlevel</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ThTypeImpl#getValign <em>Valign</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ThTypeImpl#getVendor <em>Vendor</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ThTypeImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ThTypeImpl#getWordsize <em>Wordsize</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.ThTypeImpl#getXreflabel <em>Xreflabel</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ThTypeImpl extends MinimalEObjectImpl.Container implements ThType {
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
	 * The default value of the '{@link #getAbbr() <em>Abbr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbbr()
	 * @generated
	 * @ordered
	 */
	protected static final Object ABBR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAbbr() <em>Abbr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbbr()
	 * @generated
	 * @ordered
	 */
	protected Object abbr = ABBR_EDEFAULT;

	/**
	 * The default value of the '{@link #getAlign() <em>Align</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlign()
	 * @generated
	 * @ordered
	 */
	protected static final AlignType10 ALIGN_EDEFAULT = AlignType10.LEFT;

	/**
	 * The cached value of the '{@link #getAlign() <em>Align</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlign()
	 * @generated
	 * @ordered
	 */
	protected AlignType10 align = ALIGN_EDEFAULT;

	/**
	 * This is true if the Align attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean alignESet;

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
	 * The default value of the '{@link #getAxis() <em>Axis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAxis()
	 * @generated
	 * @ordered
	 */
	protected static final Object AXIS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAxis() <em>Axis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAxis()
	 * @generated
	 * @ordered
	 */
	protected Object axis = AXIS_EDEFAULT;

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
	 * The default value of the '{@link #getChar() <em>Char</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChar()
	 * @generated
	 * @ordered
	 */
	protected static final Object CHAR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getChar() <em>Char</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChar()
	 * @generated
	 * @ordered
	 */
	protected Object char_ = CHAR_EDEFAULT;

	/**
	 * The default value of the '{@link #getCharoff() <em>Charoff</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCharoff()
	 * @generated
	 * @ordered
	 */
	protected static final Object CHAROFF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCharoff() <em>Charoff</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCharoff()
	 * @generated
	 * @ordered
	 */
	protected Object charoff = CHAROFF_EDEFAULT;

	/**
	 * The default value of the '{@link #getClass_() <em>Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClass_()
	 * @generated
	 * @ordered
	 */
	protected static final Object CLASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClass_() <em>Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClass_()
	 * @generated
	 * @ordered
	 */
	protected Object class_ = CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getColspan() <em>Colspan</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColspan()
	 * @generated
	 * @ordered
	 */
	protected static final String COLSPAN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getColspan() <em>Colspan</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColspan()
	 * @generated
	 * @ordered
	 */
	protected String colspan = COLSPAN_EDEFAULT;

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
	 * The default value of the '{@link #getHeaders() <em>Headers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeaders()
	 * @generated
	 * @ordered
	 */
	protected static final Object HEADERS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHeaders() <em>Headers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeaders()
	 * @generated
	 * @ordered
	 */
	protected Object headers = HEADERS_EDEFAULT;

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
	 * The default value of the '{@link #getLang1() <em>Lang1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLang1()
	 * @generated
	 * @ordered
	 */
	protected static final Object LANG1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLang1() <em>Lang1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLang1()
	 * @generated
	 * @ordered
	 */
	protected Object lang1 = LANG1_EDEFAULT;

	/**
	 * The default value of the '{@link #getOnclick() <em>Onclick</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnclick()
	 * @generated
	 * @ordered
	 */
	protected static final Object ONCLICK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOnclick() <em>Onclick</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnclick()
	 * @generated
	 * @ordered
	 */
	protected Object onclick = ONCLICK_EDEFAULT;

	/**
	 * The default value of the '{@link #getOndblclick() <em>Ondblclick</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOndblclick()
	 * @generated
	 * @ordered
	 */
	protected static final Object ONDBLCLICK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOndblclick() <em>Ondblclick</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOndblclick()
	 * @generated
	 * @ordered
	 */
	protected Object ondblclick = ONDBLCLICK_EDEFAULT;

	/**
	 * The default value of the '{@link #getOnkeydown() <em>Onkeydown</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnkeydown()
	 * @generated
	 * @ordered
	 */
	protected static final Object ONKEYDOWN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOnkeydown() <em>Onkeydown</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnkeydown()
	 * @generated
	 * @ordered
	 */
	protected Object onkeydown = ONKEYDOWN_EDEFAULT;

	/**
	 * The default value of the '{@link #getOnkeypress() <em>Onkeypress</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnkeypress()
	 * @generated
	 * @ordered
	 */
	protected static final Object ONKEYPRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOnkeypress() <em>Onkeypress</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnkeypress()
	 * @generated
	 * @ordered
	 */
	protected Object onkeypress = ONKEYPRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getOnkeyup() <em>Onkeyup</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnkeyup()
	 * @generated
	 * @ordered
	 */
	protected static final Object ONKEYUP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOnkeyup() <em>Onkeyup</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnkeyup()
	 * @generated
	 * @ordered
	 */
	protected Object onkeyup = ONKEYUP_EDEFAULT;

	/**
	 * The default value of the '{@link #getOnmousedown() <em>Onmousedown</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnmousedown()
	 * @generated
	 * @ordered
	 */
	protected static final Object ONMOUSEDOWN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOnmousedown() <em>Onmousedown</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnmousedown()
	 * @generated
	 * @ordered
	 */
	protected Object onmousedown = ONMOUSEDOWN_EDEFAULT;

	/**
	 * The default value of the '{@link #getOnmousemove() <em>Onmousemove</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnmousemove()
	 * @generated
	 * @ordered
	 */
	protected static final Object ONMOUSEMOVE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOnmousemove() <em>Onmousemove</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnmousemove()
	 * @generated
	 * @ordered
	 */
	protected Object onmousemove = ONMOUSEMOVE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOnmouseout() <em>Onmouseout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnmouseout()
	 * @generated
	 * @ordered
	 */
	protected static final Object ONMOUSEOUT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOnmouseout() <em>Onmouseout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnmouseout()
	 * @generated
	 * @ordered
	 */
	protected Object onmouseout = ONMOUSEOUT_EDEFAULT;

	/**
	 * The default value of the '{@link #getOnmouseover() <em>Onmouseover</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnmouseover()
	 * @generated
	 * @ordered
	 */
	protected static final Object ONMOUSEOVER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOnmouseover() <em>Onmouseover</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnmouseover()
	 * @generated
	 * @ordered
	 */
	protected Object onmouseover = ONMOUSEOVER_EDEFAULT;

	/**
	 * The default value of the '{@link #getOnmouseup() <em>Onmouseup</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnmouseup()
	 * @generated
	 * @ordered
	 */
	protected static final Object ONMOUSEUP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOnmouseup() <em>Onmouseup</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnmouseup()
	 * @generated
	 * @ordered
	 */
	protected Object onmouseup = ONMOUSEUP_EDEFAULT;

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
	 * The default value of the '{@link #getRowspan() <em>Rowspan</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRowspan()
	 * @generated
	 * @ordered
	 */
	protected static final String ROWSPAN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRowspan() <em>Rowspan</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRowspan()
	 * @generated
	 * @ordered
	 */
	protected String rowspan = ROWSPAN_EDEFAULT;

	/**
	 * The default value of the '{@link #getScope() <em>Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScope()
	 * @generated
	 * @ordered
	 */
	protected static final ScopeType2 SCOPE_EDEFAULT = ScopeType2.ROW;

	/**
	 * The cached value of the '{@link #getScope() <em>Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScope()
	 * @generated
	 * @ordered
	 */
	protected ScopeType2 scope = SCOPE_EDEFAULT;

	/**
	 * This is true if the Scope attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean scopeESet;

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
	 * The default value of the '{@link #getStyle() <em>Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyle()
	 * @generated
	 * @ordered
	 */
	protected static final Object STYLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStyle() <em>Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyle()
	 * @generated
	 * @ordered
	 */
	protected Object style = STYLE_EDEFAULT;

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
	 * The default value of the '{@link #getValign() <em>Valign</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValign()
	 * @generated
	 * @ordered
	 */
	protected static final ValignType3 VALIGN_EDEFAULT = ValignType3.TOP;

	/**
	 * The cached value of the '{@link #getValign() <em>Valign</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValign()
	 * @generated
	 * @ordered
	 */
	protected ValignType3 valign = VALIGN_EDEFAULT;

	/**
	 * This is true if the Valign attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean valignESet;

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
	protected ThTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DocbookPackage.eINSTANCE.getThType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, DocbookPackage.TH_TYPE__MIXED);
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
		return (FeatureMap)getMixed().<FeatureMap.Entry>list(DocbookPackage.eINSTANCE.getThType_Group());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InlinemediaobjectType> getInlinemediaobject() {
		return getGroup().list(DocbookPackage.eINSTANCE.getThType_Inlinemediaobject());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RemarkType> getRemark() {
		return getGroup().list(DocbookPackage.eINSTANCE.getThType_Remark());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SuperscriptType> getSuperscript() {
		return getGroup().list(DocbookPackage.eINSTANCE.getThType_Superscript());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SubscriptType> getSubscript() {
		return getGroup().list(DocbookPackage.eINSTANCE.getThType_Subscript());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<XrefType> getXref() {
		return getGroup().list(DocbookPackage.eINSTANCE.getThType_Xref());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<LinkType> getLink() {
		return getGroup().list(DocbookPackage.eINSTANCE.getThType_Link());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<OlinkType> getOlink() {
		return getGroup().list(DocbookPackage.eINSTANCE.getThType_Olink());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AnchorType> getAnchor() {
		return getGroup().list(DocbookPackage.eINSTANCE.getThType_Anchor());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BibliorefType> getBiblioref() {
		return getGroup().list(DocbookPackage.eINSTANCE.getThType_Biblioref());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AltType> getAlt() {
		return getGroup().list(DocbookPackage.eINSTANCE.getThType_Alt());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AnnotationType> getAnnotation() {
		return getGroup().list(DocbookPackage.eINSTANCE.getThType_Annotation());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<IndextermType> getIndexterm() {
		return getGroup().list(DocbookPackage.eINSTANCE.getThType_Indexterm());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbbrevType> getAbbrev() {
		return getGroup().list(DocbookPackage.eINSTANCE.getThType_Abbrev());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AcronymType> getAcronym() {
		return getGroup().list(DocbookPackage.eINSTANCE.getThType_Acronym());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DateType> getDate() {
		return getGroup().list(DocbookPackage.eINSTANCE.getThType_Date());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EmphasisType> getEmphasis() {
		return getGroup().list(DocbookPackage.eINSTANCE.getThType_Emphasis());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FootnoteType> getFootnote() {
		return getGroup().list(DocbookPackage.eINSTANCE.getThType_Footnote());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FootnoterefType> getFootnoteref() {
		return getGroup().list(DocbookPackage.eINSTANCE.getThType_Footnoteref());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ForeignphraseType> getForeignphrase() {
		return getGroup().list(DocbookPackage.eINSTANCE.getThType_Foreignphrase());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PhraseType> getPhrase() {
		return getGroup().list(DocbookPackage.eINSTANCE.getThType_Phrase());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<QuoteType> getQuote() {
		return getGroup().list(DocbookPackage.eINSTANCE.getThType_Quote());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<WordaswordType> getWordasword() {
		return getGroup().list(DocbookPackage.eINSTANCE.getThType_Wordasword());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FirsttermType> getFirstterm() {
		return getGroup().list(DocbookPackage.eINSTANCE.getThType_Firstterm());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<GlosstermType> getGlossterm() {
		return getGroup().list(DocbookPackage.eINSTANCE.getThType_Glossterm());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CorefType> getCoref() {
		return getGroup().list(DocbookPackage.eINSTANCE.getThType_Coref());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TrademarkType> getTrademark() {
		return getGroup().list(DocbookPackage.eINSTANCE.getThType_Trademark());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ProductnumberType> getProductnumber() {
		return getGroup().list(DocbookPackage.eINSTANCE.getThType_Productnumber());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ProductnameType> getProductname() {
		return getGroup().list(DocbookPackage.eINSTANCE.getThType_Productname());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DatabaseType> getDatabase() {
		return getGroup().list(DocbookPackage.eINSTANCE.getThType_Database());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ApplicationType> getApplication() {
		return getGroup().list(DocbookPackage.eINSTANCE.getThType_Application());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<HardwareType> getHardware() {
		return getGroup().list(DocbookPackage.eINSTANCE.getThType_Hardware());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CitationType> getCitation() {
		return getGroup().list(DocbookPackage.eINSTANCE.getThType_Citation());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CiterefentryType> getCiterefentry() {
		return getGroup().list(DocbookPackage.eINSTANCE.getThType_Citerefentry());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CitetitleType> getCitetitle() {
		return getGroup().list(DocbookPackage.eINSTANCE.getThType_Citetitle());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CitebiblioidType> getCitebiblioid() {
		return getGroup().list(DocbookPackage.eINSTANCE.getThType_Citebiblioid());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AuthorType> getAuthor() {
		return getGroup().list(DocbookPackage.eINSTANCE.getThType_Author());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PersonType> getPerson() {
		return getGroup().list(DocbookPackage.eINSTANCE.getThType_Person());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PersonnameType> getPersonname() {
		return getGroup().list(DocbookPackage.eINSTANCE.getThType_Personname());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<OrgType> getOrg() {
		return getGroup().list(DocbookPackage.eINSTANCE.getThType_Org());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<OrgnameType> getOrgname() {
		return getGroup().list(DocbookPackage.eINSTANCE.getThType_Orgname());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EditorType> getEditor() {
		return getGroup().list(DocbookPackage.eINSTANCE.getThType_Editor());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<JobtitleType> getJobtitle() {
		return getGroup().list(DocbookPackage.eINSTANCE.getThType_Jobtitle());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ReplaceableType> getReplaceable() {
		return getGroup().list(DocbookPackage.eINSTANCE.getThType_Replaceable());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PackageType> getPackage() {
		return getGroup().list(DocbookPackage.eINSTANCE.getThType_Package());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ParameterType> getParameter() {
		return getGroup().list(DocbookPackage.eINSTANCE.getThType_Parameter());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TermdefType> getTermdef() {
		return getGroup().list(DocbookPackage.eINSTANCE.getThType_Termdef());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NonterminalType> getNonterminal() {
		return getGroup().list(DocbookPackage.eINSTANCE.getThType_Nonterminal());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SystemitemType> getSystemitem() {
		return getGroup().list(DocbookPackage.eINSTANCE.getThType_Systemitem());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<OptionType> getOption() {
		return getGroup().list(DocbookPackage.eINSTANCE.getThType_Option());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<OptionalType> getOptional() {
		return getGroup().list(DocbookPackage.eINSTANCE.getThType_Optional());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PropertyType> getProperty() {
		return getGroup().list(DocbookPackage.eINSTANCE.getThType_Property());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InlineequationType> getInlineequation() {
		return getGroup().list(DocbookPackage.eINSTANCE.getThType_Inlineequation());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TagType> getTag() {
		return getGroup().list(DocbookPackage.eINSTANCE.getThType_Tag());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MarkupType> getMarkup() {
		return getGroup().list(DocbookPackage.eINSTANCE.getThType_Markup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TokenType> getToken() {
		return getGroup().list(DocbookPackage.eINSTANCE.getThType_Token());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SymbolType> getSymbol() {
		return getGroup().list(DocbookPackage.eINSTANCE.getThType_Symbol());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<LiteralType> getLiteral() {
		return getGroup().list(DocbookPackage.eINSTANCE.getThType_Literal());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeType> getCode() {
		return getGroup().list(DocbookPackage.eINSTANCE.getThType_Code());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ConstantType> getConstant() {
		return getGroup().list(DocbookPackage.eINSTANCE.getThType_Constant());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EmailType> getEmail() {
		return getGroup().list(DocbookPackage.eINSTANCE.getThType_Email());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<UriType> getUri() {
		return getGroup().list(DocbookPackage.eINSTANCE.getThType_Uri());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<GuiiconType> getGuiicon() {
		return getGroup().list(DocbookPackage.eINSTANCE.getThType_Guiicon());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<GuibuttonType> getGuibutton() {
		return getGroup().list(DocbookPackage.eINSTANCE.getThType_Guibutton());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<GuimenuitemType> getGuimenuitem() {
		return getGroup().list(DocbookPackage.eINSTANCE.getThType_Guimenuitem());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<GuimenuType> getGuimenu() {
		return getGroup().list(DocbookPackage.eINSTANCE.getThType_Guimenu());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<GuisubmenuType> getGuisubmenu() {
		return getGroup().list(DocbookPackage.eINSTANCE.getThType_Guisubmenu());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<GuilabelType> getGuilabel() {
		return getGroup().list(DocbookPackage.eINSTANCE.getThType_Guilabel());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MenuchoiceType> getMenuchoice() {
		return getGroup().list(DocbookPackage.eINSTANCE.getThType_Menuchoice());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MousebuttonType> getMousebutton() {
		return getGroup().list(DocbookPackage.eINSTANCE.getThType_Mousebutton());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<KeycomboType> getKeycombo() {
		return getGroup().list(DocbookPackage.eINSTANCE.getThType_Keycombo());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<KeycapType> getKeycap() {
		return getGroup().list(DocbookPackage.eINSTANCE.getThType_Keycap());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<KeycodeType> getKeycode() {
		return getGroup().list(DocbookPackage.eINSTANCE.getThType_Keycode());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<KeysymType> getKeysym() {
		return getGroup().list(DocbookPackage.eINSTANCE.getThType_Keysym());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ShortcutType> getShortcut() {
		return getGroup().list(DocbookPackage.eINSTANCE.getThType_Shortcut());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AccelType> getAccel() {
		return getGroup().list(DocbookPackage.eINSTANCE.getThType_Accel());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PromptType> getPrompt() {
		return getGroup().list(DocbookPackage.eINSTANCE.getThType_Prompt());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EnvarType> getEnvar() {
		return getGroup().list(DocbookPackage.eINSTANCE.getThType_Envar());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FilenameType> getFilename() {
		return getGroup().list(DocbookPackage.eINSTANCE.getThType_Filename());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CommandType> getCommand() {
		return getGroup().list(DocbookPackage.eINSTANCE.getThType_Command());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ComputeroutputType> getComputeroutput() {
		return getGroup().list(DocbookPackage.eINSTANCE.getThType_Computeroutput());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<UserinputType> getUserinput() {
		return getGroup().list(DocbookPackage.eINSTANCE.getThType_Userinput());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FunctionType1> getFunction() {
		return getGroup().list(DocbookPackage.eINSTANCE.getThType_Function());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<VarnameType> getVarname() {
		return getGroup().list(DocbookPackage.eINSTANCE.getThType_Varname());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ReturnvalueType> getReturnvalue() {
		return getGroup().list(DocbookPackage.eINSTANCE.getThType_Returnvalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TypeType2> getType() {
		return getGroup().list(DocbookPackage.eINSTANCE.getThType_Type());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ClassnameType> getClassname() {
		return getGroup().list(DocbookPackage.eINSTANCE.getThType_Classname());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ExceptionnameType> getExceptionname() {
		return getGroup().list(DocbookPackage.eINSTANCE.getThType_Exceptionname());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InterfacenameType> getInterfacename() {
		return getGroup().list(DocbookPackage.eINSTANCE.getThType_Interfacename());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MethodnameType> getMethodname() {
		return getGroup().list(DocbookPackage.eINSTANCE.getThType_Methodname());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ModifierType> getModifier() {
		return getGroup().list(DocbookPackage.eINSTANCE.getThType_Modifier());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InitializerType> getInitializer() {
		return getGroup().list(DocbookPackage.eINSTANCE.getThType_Initializer());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<OoclassType> getOoclass() {
		return getGroup().list(DocbookPackage.eINSTANCE.getThType_Ooclass());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<OoexceptionType> getOoexception() {
		return getGroup().list(DocbookPackage.eINSTANCE.getThType_Ooexception());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<OointerfaceType> getOointerface() {
		return getGroup().list(DocbookPackage.eINSTANCE.getThType_Oointerface());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ErrorcodeType> getErrorcode() {
		return getGroup().list(DocbookPackage.eINSTANCE.getThType_Errorcode());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ErrortextType> getErrortext() {
		return getGroup().list(DocbookPackage.eINSTANCE.getThType_Errortext());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ErrornameType> getErrorname() {
		return getGroup().list(DocbookPackage.eINSTANCE.getThType_Errorname());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ErrortypeType> getErrortype() {
		return getGroup().list(DocbookPackage.eINSTANCE.getThType_Errortype());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ItemizedlistType> getItemizedlist() {
		return getGroup().list(DocbookPackage.eINSTANCE.getThType_Itemizedlist());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<OrderedlistType> getOrderedlist() {
		return getGroup().list(DocbookPackage.eINSTANCE.getThType_Orderedlist());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ProcedureType> getProcedure() {
		return getGroup().list(DocbookPackage.eINSTANCE.getThType_Procedure());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SimplelistType> getSimplelist() {
		return getGroup().list(DocbookPackage.eINSTANCE.getThType_Simplelist());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<VariablelistType> getVariablelist() {
		return getGroup().list(DocbookPackage.eINSTANCE.getThType_Variablelist());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SegmentedlistType> getSegmentedlist() {
		return getGroup().list(DocbookPackage.eINSTANCE.getThType_Segmentedlist());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<GlosslistType> getGlosslist() {
		return getGroup().list(DocbookPackage.eINSTANCE.getThType_Glosslist());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BibliolistType> getBibliolist() {
		return getGroup().list(DocbookPackage.eINSTANCE.getThType_Bibliolist());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CalloutlistType> getCalloutlist() {
		return getGroup().list(DocbookPackage.eINSTANCE.getThType_Calloutlist());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<QandasetType> getQandaset() {
		return getGroup().list(DocbookPackage.eINSTANCE.getThType_Qandaset());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ExampleType> getExample() {
		return getGroup().list(DocbookPackage.eINSTANCE.getThType_Example());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FigureType> getFigure() {
		return getGroup().list(DocbookPackage.eINSTANCE.getThType_Figure());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TableType> getTable() {
		return getGroup().list(DocbookPackage.eINSTANCE.getThType_Table());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EquationType> getEquation() {
		return getGroup().list(DocbookPackage.eINSTANCE.getThType_Equation());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InformalexampleType> getInformalexample() {
		return getGroup().list(DocbookPackage.eINSTANCE.getThType_Informalexample());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InformalfigureType> getInformalfigure() {
		return getGroup().list(DocbookPackage.eINSTANCE.getThType_Informalfigure());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InformaltableType> getInformaltable() {
		return getGroup().list(DocbookPackage.eINSTANCE.getThType_Informaltable());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InformalequationType> getInformalequation() {
		return getGroup().list(DocbookPackage.eINSTANCE.getThType_Informalequation());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SidebarType> getSidebar() {
		return getGroup().list(DocbookPackage.eINSTANCE.getThType_Sidebar());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BlockquoteType> getBlockquote() {
		return getGroup().list(DocbookPackage.eINSTANCE.getThType_Blockquote());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AddressType> getAddress() {
		return getGroup().list(DocbookPackage.eINSTANCE.getThType_Address());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EpigraphType> getEpigraph() {
		return getGroup().list(DocbookPackage.eINSTANCE.getThType_Epigraph());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MediaobjectType> getMediaobject() {
		return getGroup().list(DocbookPackage.eINSTANCE.getThType_Mediaobject());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ScreenshotType> getScreenshot() {
		return getGroup().list(DocbookPackage.eINSTANCE.getThType_Screenshot());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TaskType> getTask() {
		return getGroup().list(DocbookPackage.eINSTANCE.getThType_Task());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ProductionsetType> getProductionset() {
		return getGroup().list(DocbookPackage.eINSTANCE.getThType_Productionset());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ConstraintdefType> getConstraintdef() {
		return getGroup().list(DocbookPackage.eINSTANCE.getThType_Constraintdef());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MsgsetType> getMsgset() {
		return getGroup().list(DocbookPackage.eINSTANCE.getThType_Msgset());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ScreenType> getScreen() {
		return getGroup().list(DocbookPackage.eINSTANCE.getThType_Screen());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<LiterallayoutType> getLiterallayout() {
		return getGroup().list(DocbookPackage.eINSTANCE.getThType_Literallayout());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ProgramlistingcoType> getProgramlistingco() {
		return getGroup().list(DocbookPackage.eINSTANCE.getThType_Programlistingco());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ScreencoType> getScreenco() {
		return getGroup().list(DocbookPackage.eINSTANCE.getThType_Screenco());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ProgramlistingType> getProgramlisting() {
		return getGroup().list(DocbookPackage.eINSTANCE.getThType_Programlisting());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SynopsisType> getSynopsis() {
		return getGroup().list(DocbookPackage.eINSTANCE.getThType_Synopsis());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BridgeheadType> getBridgehead() {
		return getGroup().list(DocbookPackage.eINSTANCE.getThType_Bridgehead());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RevhistoryType> getRevhistory() {
		return getGroup().list(DocbookPackage.eINSTANCE.getThType_Revhistory());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FuncsynopsisType> getFuncsynopsis() {
		return getGroup().list(DocbookPackage.eINSTANCE.getThType_Funcsynopsis());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ClasssynopsisType> getClasssynopsis() {
		return getGroup().list(DocbookPackage.eINSTANCE.getThType_Classsynopsis());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MethodsynopsisType> getMethodsynopsis() {
		return getGroup().list(DocbookPackage.eINSTANCE.getThType_Methodsynopsis());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ConstructorsynopsisType> getConstructorsynopsis() {
		return getGroup().list(DocbookPackage.eINSTANCE.getThType_Constructorsynopsis());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DestructorsynopsisType> getDestructorsynopsis() {
		return getGroup().list(DocbookPackage.eINSTANCE.getThType_Destructorsynopsis());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FieldsynopsisType> getFieldsynopsis() {
		return getGroup().list(DocbookPackage.eINSTANCE.getThType_Fieldsynopsis());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CmdsynopsisType> getCmdsynopsis() {
		return getGroup().list(DocbookPackage.eINSTANCE.getThType_Cmdsynopsis());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CautionType> getCaution() {
		return getGroup().list(DocbookPackage.eINSTANCE.getThType_Caution());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ImportantType> getImportant() {
		return getGroup().list(DocbookPackage.eINSTANCE.getThType_Important());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NoteType> getNote() {
		return getGroup().list(DocbookPackage.eINSTANCE.getThType_Note());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TipType> getTip() {
		return getGroup().list(DocbookPackage.eINSTANCE.getThType_Tip());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<WarningType> getWarning() {
		return getGroup().list(DocbookPackage.eINSTANCE.getThType_Warning());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ParaType> getPara() {
		return getGroup().list(DocbookPackage.eINSTANCE.getThType_Para());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FormalparaType> getFormalpara() {
		return getGroup().list(DocbookPackage.eINSTANCE.getThType_Formalpara());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SimparaType> getSimpara() {
		return getGroup().list(DocbookPackage.eINSTANCE.getThType_Simpara());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getAbbr() {
		return abbr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAbbr(Object newAbbr) {
		Object oldAbbr = abbr;
		abbr = newAbbr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.TH_TYPE__ABBR, oldAbbr, abbr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AlignType10 getAlign() {
		return align;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAlign(AlignType10 newAlign) {
		AlignType10 oldAlign = align;
		align = newAlign == null ? ALIGN_EDEFAULT : newAlign;
		boolean oldAlignESet = alignESet;
		alignESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.TH_TYPE__ALIGN, oldAlign, align, !oldAlignESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetAlign() {
		AlignType10 oldAlign = align;
		boolean oldAlignESet = alignESet;
		align = ALIGN_EDEFAULT;
		alignESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DocbookPackage.TH_TYPE__ALIGN, oldAlign, ALIGN_EDEFAULT, oldAlignESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetAlign() {
		return alignESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.TH_TYPE__ANNOTATIONS, oldAnnotations, annotations));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.TH_TYPE__ARCH, oldArch, arch));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.TH_TYPE__AUDIENCE, oldAudience, audience));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getAxis() {
		return axis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAxis(Object newAxis) {
		Object oldAxis = axis;
		axis = newAxis;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.TH_TYPE__AXIS, oldAxis, axis));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.TH_TYPE__BASE, oldBase, base));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getChar() {
		return char_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setChar(Object newChar) {
		Object oldChar = char_;
		char_ = newChar;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.TH_TYPE__CHAR, oldChar, char_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getCharoff() {
		return charoff;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCharoff(Object newCharoff) {
		Object oldCharoff = charoff;
		charoff = newCharoff;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.TH_TYPE__CHAROFF, oldCharoff, charoff));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getClass_() {
		return class_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setClass(Object newClass) {
		Object oldClass = class_;
		class_ = newClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.TH_TYPE__CLASS, oldClass, class_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getColspan() {
		return colspan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setColspan(String newColspan) {
		String oldColspan = colspan;
		colspan = newColspan;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.TH_TYPE__COLSPAN, oldColspan, colspan));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.TH_TYPE__CONDITION, oldCondition, condition));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.TH_TYPE__CONFORMANCE, oldConformance, conformance));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.TH_TYPE__DIR, oldDir, dir, !oldDirESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, DocbookPackage.TH_TYPE__DIR, oldDir, DIR_EDEFAULT, oldDirESet));
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
	public Object getHeaders() {
		return headers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHeaders(Object newHeaders) {
		Object oldHeaders = headers;
		headers = newHeaders;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.TH_TYPE__HEADERS, oldHeaders, headers));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.TH_TYPE__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.TH_TYPE__LANG, oldLang, lang));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getLang1() {
		return lang1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLang1(Object newLang1) {
		Object oldLang1 = lang1;
		lang1 = newLang1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.TH_TYPE__LANG1, oldLang1, lang1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getOnclick() {
		return onclick;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOnclick(Object newOnclick) {
		Object oldOnclick = onclick;
		onclick = newOnclick;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.TH_TYPE__ONCLICK, oldOnclick, onclick));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getOndblclick() {
		return ondblclick;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOndblclick(Object newOndblclick) {
		Object oldOndblclick = ondblclick;
		ondblclick = newOndblclick;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.TH_TYPE__ONDBLCLICK, oldOndblclick, ondblclick));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getOnkeydown() {
		return onkeydown;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOnkeydown(Object newOnkeydown) {
		Object oldOnkeydown = onkeydown;
		onkeydown = newOnkeydown;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.TH_TYPE__ONKEYDOWN, oldOnkeydown, onkeydown));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getOnkeypress() {
		return onkeypress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOnkeypress(Object newOnkeypress) {
		Object oldOnkeypress = onkeypress;
		onkeypress = newOnkeypress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.TH_TYPE__ONKEYPRESS, oldOnkeypress, onkeypress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getOnkeyup() {
		return onkeyup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOnkeyup(Object newOnkeyup) {
		Object oldOnkeyup = onkeyup;
		onkeyup = newOnkeyup;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.TH_TYPE__ONKEYUP, oldOnkeyup, onkeyup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getOnmousedown() {
		return onmousedown;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOnmousedown(Object newOnmousedown) {
		Object oldOnmousedown = onmousedown;
		onmousedown = newOnmousedown;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.TH_TYPE__ONMOUSEDOWN, oldOnmousedown, onmousedown));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getOnmousemove() {
		return onmousemove;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOnmousemove(Object newOnmousemove) {
		Object oldOnmousemove = onmousemove;
		onmousemove = newOnmousemove;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.TH_TYPE__ONMOUSEMOVE, oldOnmousemove, onmousemove));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getOnmouseout() {
		return onmouseout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOnmouseout(Object newOnmouseout) {
		Object oldOnmouseout = onmouseout;
		onmouseout = newOnmouseout;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.TH_TYPE__ONMOUSEOUT, oldOnmouseout, onmouseout));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getOnmouseover() {
		return onmouseover;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOnmouseover(Object newOnmouseover) {
		Object oldOnmouseover = onmouseover;
		onmouseover = newOnmouseover;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.TH_TYPE__ONMOUSEOVER, oldOnmouseover, onmouseover));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getOnmouseup() {
		return onmouseup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOnmouseup(Object newOnmouseup) {
		Object oldOnmouseup = onmouseup;
		onmouseup = newOnmouseup;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.TH_TYPE__ONMOUSEUP, oldOnmouseup, onmouseup));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.TH_TYPE__OS, oldOs, os));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.TH_TYPE__REMAP, oldRemap, remap));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.TH_TYPE__REVISION, oldRevision, revision));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.TH_TYPE__REVISIONFLAG, oldRevisionflag, revisionflag, !oldRevisionflagESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, DocbookPackage.TH_TYPE__REVISIONFLAG, oldRevisionflag, REVISIONFLAG_EDEFAULT, oldRevisionflagESet));
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
	public String getRowspan() {
		return rowspan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRowspan(String newRowspan) {
		String oldRowspan = rowspan;
		rowspan = newRowspan;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.TH_TYPE__ROWSPAN, oldRowspan, rowspan));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ScopeType2 getScope() {
		return scope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setScope(ScopeType2 newScope) {
		ScopeType2 oldScope = scope;
		scope = newScope == null ? SCOPE_EDEFAULT : newScope;
		boolean oldScopeESet = scopeESet;
		scopeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.TH_TYPE__SCOPE, oldScope, scope, !oldScopeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetScope() {
		ScopeType2 oldScope = scope;
		boolean oldScopeESet = scopeESet;
		scope = SCOPE_EDEFAULT;
		scopeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DocbookPackage.TH_TYPE__SCOPE, oldScope, SCOPE_EDEFAULT, oldScopeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetScope() {
		return scopeESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.TH_TYPE__SECURITY, oldSecurity, security));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getStyle() {
		return style;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStyle(Object newStyle) {
		Object oldStyle = style;
		style = newStyle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.TH_TYPE__STYLE, oldStyle, style));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.TH_TYPE__TITLE, oldTitle, title));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.TH_TYPE__USERLEVEL, oldUserlevel, userlevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ValignType3 getValign() {
		return valign;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValign(ValignType3 newValign) {
		ValignType3 oldValign = valign;
		valign = newValign == null ? VALIGN_EDEFAULT : newValign;
		boolean oldValignESet = valignESet;
		valignESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.TH_TYPE__VALIGN, oldValign, valign, !oldValignESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetValign() {
		ValignType3 oldValign = valign;
		boolean oldValignESet = valignESet;
		valign = VALIGN_EDEFAULT;
		valignESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DocbookPackage.TH_TYPE__VALIGN, oldValign, VALIGN_EDEFAULT, oldValignESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetValign() {
		return valignESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.TH_TYPE__VENDOR, oldVendor, vendor));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.TH_TYPE__VERSION, oldVersion, version));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.TH_TYPE__WORDSIZE, oldWordsize, wordsize));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.TH_TYPE__XREFLABEL, oldXreflabel, xreflabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DocbookPackage.TH_TYPE__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case DocbookPackage.TH_TYPE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case DocbookPackage.TH_TYPE__INLINEMEDIAOBJECT:
				return ((InternalEList<?>)getInlinemediaobject()).basicRemove(otherEnd, msgs);
			case DocbookPackage.TH_TYPE__REMARK:
				return ((InternalEList<?>)getRemark()).basicRemove(otherEnd, msgs);
			case DocbookPackage.TH_TYPE__SUPERSCRIPT:
				return ((InternalEList<?>)getSuperscript()).basicRemove(otherEnd, msgs);
			case DocbookPackage.TH_TYPE__SUBSCRIPT:
				return ((InternalEList<?>)getSubscript()).basicRemove(otherEnd, msgs);
			case DocbookPackage.TH_TYPE__XREF:
				return ((InternalEList<?>)getXref()).basicRemove(otherEnd, msgs);
			case DocbookPackage.TH_TYPE__LINK:
				return ((InternalEList<?>)getLink()).basicRemove(otherEnd, msgs);
			case DocbookPackage.TH_TYPE__OLINK:
				return ((InternalEList<?>)getOlink()).basicRemove(otherEnd, msgs);
			case DocbookPackage.TH_TYPE__ANCHOR:
				return ((InternalEList<?>)getAnchor()).basicRemove(otherEnd, msgs);
			case DocbookPackage.TH_TYPE__BIBLIOREF:
				return ((InternalEList<?>)getBiblioref()).basicRemove(otherEnd, msgs);
			case DocbookPackage.TH_TYPE__ALT:
				return ((InternalEList<?>)getAlt()).basicRemove(otherEnd, msgs);
			case DocbookPackage.TH_TYPE__ANNOTATION:
				return ((InternalEList<?>)getAnnotation()).basicRemove(otherEnd, msgs);
			case DocbookPackage.TH_TYPE__INDEXTERM:
				return ((InternalEList<?>)getIndexterm()).basicRemove(otherEnd, msgs);
			case DocbookPackage.TH_TYPE__ABBREV:
				return ((InternalEList<?>)getAbbrev()).basicRemove(otherEnd, msgs);
			case DocbookPackage.TH_TYPE__ACRONYM:
				return ((InternalEList<?>)getAcronym()).basicRemove(otherEnd, msgs);
			case DocbookPackage.TH_TYPE__DATE:
				return ((InternalEList<?>)getDate()).basicRemove(otherEnd, msgs);
			case DocbookPackage.TH_TYPE__EMPHASIS:
				return ((InternalEList<?>)getEmphasis()).basicRemove(otherEnd, msgs);
			case DocbookPackage.TH_TYPE__FOOTNOTE:
				return ((InternalEList<?>)getFootnote()).basicRemove(otherEnd, msgs);
			case DocbookPackage.TH_TYPE__FOOTNOTEREF:
				return ((InternalEList<?>)getFootnoteref()).basicRemove(otherEnd, msgs);
			case DocbookPackage.TH_TYPE__FOREIGNPHRASE:
				return ((InternalEList<?>)getForeignphrase()).basicRemove(otherEnd, msgs);
			case DocbookPackage.TH_TYPE__PHRASE:
				return ((InternalEList<?>)getPhrase()).basicRemove(otherEnd, msgs);
			case DocbookPackage.TH_TYPE__QUOTE:
				return ((InternalEList<?>)getQuote()).basicRemove(otherEnd, msgs);
			case DocbookPackage.TH_TYPE__WORDASWORD:
				return ((InternalEList<?>)getWordasword()).basicRemove(otherEnd, msgs);
			case DocbookPackage.TH_TYPE__FIRSTTERM:
				return ((InternalEList<?>)getFirstterm()).basicRemove(otherEnd, msgs);
			case DocbookPackage.TH_TYPE__GLOSSTERM:
				return ((InternalEList<?>)getGlossterm()).basicRemove(otherEnd, msgs);
			case DocbookPackage.TH_TYPE__COREF:
				return ((InternalEList<?>)getCoref()).basicRemove(otherEnd, msgs);
			case DocbookPackage.TH_TYPE__TRADEMARK:
				return ((InternalEList<?>)getTrademark()).basicRemove(otherEnd, msgs);
			case DocbookPackage.TH_TYPE__PRODUCTNUMBER:
				return ((InternalEList<?>)getProductnumber()).basicRemove(otherEnd, msgs);
			case DocbookPackage.TH_TYPE__PRODUCTNAME:
				return ((InternalEList<?>)getProductname()).basicRemove(otherEnd, msgs);
			case DocbookPackage.TH_TYPE__DATABASE:
				return ((InternalEList<?>)getDatabase()).basicRemove(otherEnd, msgs);
			case DocbookPackage.TH_TYPE__APPLICATION:
				return ((InternalEList<?>)getApplication()).basicRemove(otherEnd, msgs);
			case DocbookPackage.TH_TYPE__HARDWARE:
				return ((InternalEList<?>)getHardware()).basicRemove(otherEnd, msgs);
			case DocbookPackage.TH_TYPE__CITATION:
				return ((InternalEList<?>)getCitation()).basicRemove(otherEnd, msgs);
			case DocbookPackage.TH_TYPE__CITEREFENTRY:
				return ((InternalEList<?>)getCiterefentry()).basicRemove(otherEnd, msgs);
			case DocbookPackage.TH_TYPE__CITETITLE:
				return ((InternalEList<?>)getCitetitle()).basicRemove(otherEnd, msgs);
			case DocbookPackage.TH_TYPE__CITEBIBLIOID:
				return ((InternalEList<?>)getCitebiblioid()).basicRemove(otherEnd, msgs);
			case DocbookPackage.TH_TYPE__AUTHOR:
				return ((InternalEList<?>)getAuthor()).basicRemove(otherEnd, msgs);
			case DocbookPackage.TH_TYPE__PERSON:
				return ((InternalEList<?>)getPerson()).basicRemove(otherEnd, msgs);
			case DocbookPackage.TH_TYPE__PERSONNAME:
				return ((InternalEList<?>)getPersonname()).basicRemove(otherEnd, msgs);
			case DocbookPackage.TH_TYPE__ORG:
				return ((InternalEList<?>)getOrg()).basicRemove(otherEnd, msgs);
			case DocbookPackage.TH_TYPE__ORGNAME:
				return ((InternalEList<?>)getOrgname()).basicRemove(otherEnd, msgs);
			case DocbookPackage.TH_TYPE__EDITOR:
				return ((InternalEList<?>)getEditor()).basicRemove(otherEnd, msgs);
			case DocbookPackage.TH_TYPE__JOBTITLE:
				return ((InternalEList<?>)getJobtitle()).basicRemove(otherEnd, msgs);
			case DocbookPackage.TH_TYPE__REPLACEABLE:
				return ((InternalEList<?>)getReplaceable()).basicRemove(otherEnd, msgs);
			case DocbookPackage.TH_TYPE__PACKAGE:
				return ((InternalEList<?>)getPackage()).basicRemove(otherEnd, msgs);
			case DocbookPackage.TH_TYPE__PARAMETER:
				return ((InternalEList<?>)getParameter()).basicRemove(otherEnd, msgs);
			case DocbookPackage.TH_TYPE__TERMDEF:
				return ((InternalEList<?>)getTermdef()).basicRemove(otherEnd, msgs);
			case DocbookPackage.TH_TYPE__NONTERMINAL:
				return ((InternalEList<?>)getNonterminal()).basicRemove(otherEnd, msgs);
			case DocbookPackage.TH_TYPE__SYSTEMITEM:
				return ((InternalEList<?>)getSystemitem()).basicRemove(otherEnd, msgs);
			case DocbookPackage.TH_TYPE__OPTION:
				return ((InternalEList<?>)getOption()).basicRemove(otherEnd, msgs);
			case DocbookPackage.TH_TYPE__OPTIONAL:
				return ((InternalEList<?>)getOptional()).basicRemove(otherEnd, msgs);
			case DocbookPackage.TH_TYPE__PROPERTY:
				return ((InternalEList<?>)getProperty()).basicRemove(otherEnd, msgs);
			case DocbookPackage.TH_TYPE__INLINEEQUATION:
				return ((InternalEList<?>)getInlineequation()).basicRemove(otherEnd, msgs);
			case DocbookPackage.TH_TYPE__TAG:
				return ((InternalEList<?>)getTag()).basicRemove(otherEnd, msgs);
			case DocbookPackage.TH_TYPE__MARKUP:
				return ((InternalEList<?>)getMarkup()).basicRemove(otherEnd, msgs);
			case DocbookPackage.TH_TYPE__TOKEN:
				return ((InternalEList<?>)getToken()).basicRemove(otherEnd, msgs);
			case DocbookPackage.TH_TYPE__SYMBOL:
				return ((InternalEList<?>)getSymbol()).basicRemove(otherEnd, msgs);
			case DocbookPackage.TH_TYPE__LITERAL:
				return ((InternalEList<?>)getLiteral()).basicRemove(otherEnd, msgs);
			case DocbookPackage.TH_TYPE__CODE:
				return ((InternalEList<?>)getCode()).basicRemove(otherEnd, msgs);
			case DocbookPackage.TH_TYPE__CONSTANT:
				return ((InternalEList<?>)getConstant()).basicRemove(otherEnd, msgs);
			case DocbookPackage.TH_TYPE__EMAIL:
				return ((InternalEList<?>)getEmail()).basicRemove(otherEnd, msgs);
			case DocbookPackage.TH_TYPE__URI:
				return ((InternalEList<?>)getUri()).basicRemove(otherEnd, msgs);
			case DocbookPackage.TH_TYPE__GUIICON:
				return ((InternalEList<?>)getGuiicon()).basicRemove(otherEnd, msgs);
			case DocbookPackage.TH_TYPE__GUIBUTTON:
				return ((InternalEList<?>)getGuibutton()).basicRemove(otherEnd, msgs);
			case DocbookPackage.TH_TYPE__GUIMENUITEM:
				return ((InternalEList<?>)getGuimenuitem()).basicRemove(otherEnd, msgs);
			case DocbookPackage.TH_TYPE__GUIMENU:
				return ((InternalEList<?>)getGuimenu()).basicRemove(otherEnd, msgs);
			case DocbookPackage.TH_TYPE__GUISUBMENU:
				return ((InternalEList<?>)getGuisubmenu()).basicRemove(otherEnd, msgs);
			case DocbookPackage.TH_TYPE__GUILABEL:
				return ((InternalEList<?>)getGuilabel()).basicRemove(otherEnd, msgs);
			case DocbookPackage.TH_TYPE__MENUCHOICE:
				return ((InternalEList<?>)getMenuchoice()).basicRemove(otherEnd, msgs);
			case DocbookPackage.TH_TYPE__MOUSEBUTTON:
				return ((InternalEList<?>)getMousebutton()).basicRemove(otherEnd, msgs);
			case DocbookPackage.TH_TYPE__KEYCOMBO:
				return ((InternalEList<?>)getKeycombo()).basicRemove(otherEnd, msgs);
			case DocbookPackage.TH_TYPE__KEYCAP:
				return ((InternalEList<?>)getKeycap()).basicRemove(otherEnd, msgs);
			case DocbookPackage.TH_TYPE__KEYCODE:
				return ((InternalEList<?>)getKeycode()).basicRemove(otherEnd, msgs);
			case DocbookPackage.TH_TYPE__KEYSYM:
				return ((InternalEList<?>)getKeysym()).basicRemove(otherEnd, msgs);
			case DocbookPackage.TH_TYPE__SHORTCUT:
				return ((InternalEList<?>)getShortcut()).basicRemove(otherEnd, msgs);
			case DocbookPackage.TH_TYPE__ACCEL:
				return ((InternalEList<?>)getAccel()).basicRemove(otherEnd, msgs);
			case DocbookPackage.TH_TYPE__PROMPT:
				return ((InternalEList<?>)getPrompt()).basicRemove(otherEnd, msgs);
			case DocbookPackage.TH_TYPE__ENVAR:
				return ((InternalEList<?>)getEnvar()).basicRemove(otherEnd, msgs);
			case DocbookPackage.TH_TYPE__FILENAME:
				return ((InternalEList<?>)getFilename()).basicRemove(otherEnd, msgs);
			case DocbookPackage.TH_TYPE__COMMAND:
				return ((InternalEList<?>)getCommand()).basicRemove(otherEnd, msgs);
			case DocbookPackage.TH_TYPE__COMPUTEROUTPUT:
				return ((InternalEList<?>)getComputeroutput()).basicRemove(otherEnd, msgs);
			case DocbookPackage.TH_TYPE__USERINPUT:
				return ((InternalEList<?>)getUserinput()).basicRemove(otherEnd, msgs);
			case DocbookPackage.TH_TYPE__FUNCTION:
				return ((InternalEList<?>)getFunction()).basicRemove(otherEnd, msgs);
			case DocbookPackage.TH_TYPE__VARNAME:
				return ((InternalEList<?>)getVarname()).basicRemove(otherEnd, msgs);
			case DocbookPackage.TH_TYPE__RETURNVALUE:
				return ((InternalEList<?>)getReturnvalue()).basicRemove(otherEnd, msgs);
			case DocbookPackage.TH_TYPE__TYPE:
				return ((InternalEList<?>)getType()).basicRemove(otherEnd, msgs);
			case DocbookPackage.TH_TYPE__CLASSNAME:
				return ((InternalEList<?>)getClassname()).basicRemove(otherEnd, msgs);
			case DocbookPackage.TH_TYPE__EXCEPTIONNAME:
				return ((InternalEList<?>)getExceptionname()).basicRemove(otherEnd, msgs);
			case DocbookPackage.TH_TYPE__INTERFACENAME:
				return ((InternalEList<?>)getInterfacename()).basicRemove(otherEnd, msgs);
			case DocbookPackage.TH_TYPE__METHODNAME:
				return ((InternalEList<?>)getMethodname()).basicRemove(otherEnd, msgs);
			case DocbookPackage.TH_TYPE__MODIFIER:
				return ((InternalEList<?>)getModifier()).basicRemove(otherEnd, msgs);
			case DocbookPackage.TH_TYPE__INITIALIZER:
				return ((InternalEList<?>)getInitializer()).basicRemove(otherEnd, msgs);
			case DocbookPackage.TH_TYPE__OOCLASS:
				return ((InternalEList<?>)getOoclass()).basicRemove(otherEnd, msgs);
			case DocbookPackage.TH_TYPE__OOEXCEPTION:
				return ((InternalEList<?>)getOoexception()).basicRemove(otherEnd, msgs);
			case DocbookPackage.TH_TYPE__OOINTERFACE:
				return ((InternalEList<?>)getOointerface()).basicRemove(otherEnd, msgs);
			case DocbookPackage.TH_TYPE__ERRORCODE:
				return ((InternalEList<?>)getErrorcode()).basicRemove(otherEnd, msgs);
			case DocbookPackage.TH_TYPE__ERRORTEXT:
				return ((InternalEList<?>)getErrortext()).basicRemove(otherEnd, msgs);
			case DocbookPackage.TH_TYPE__ERRORNAME:
				return ((InternalEList<?>)getErrorname()).basicRemove(otherEnd, msgs);
			case DocbookPackage.TH_TYPE__ERRORTYPE:
				return ((InternalEList<?>)getErrortype()).basicRemove(otherEnd, msgs);
			case DocbookPackage.TH_TYPE__ITEMIZEDLIST:
				return ((InternalEList<?>)getItemizedlist()).basicRemove(otherEnd, msgs);
			case DocbookPackage.TH_TYPE__ORDEREDLIST:
				return ((InternalEList<?>)getOrderedlist()).basicRemove(otherEnd, msgs);
			case DocbookPackage.TH_TYPE__PROCEDURE:
				return ((InternalEList<?>)getProcedure()).basicRemove(otherEnd, msgs);
			case DocbookPackage.TH_TYPE__SIMPLELIST:
				return ((InternalEList<?>)getSimplelist()).basicRemove(otherEnd, msgs);
			case DocbookPackage.TH_TYPE__VARIABLELIST:
				return ((InternalEList<?>)getVariablelist()).basicRemove(otherEnd, msgs);
			case DocbookPackage.TH_TYPE__SEGMENTEDLIST:
				return ((InternalEList<?>)getSegmentedlist()).basicRemove(otherEnd, msgs);
			case DocbookPackage.TH_TYPE__GLOSSLIST:
				return ((InternalEList<?>)getGlosslist()).basicRemove(otherEnd, msgs);
			case DocbookPackage.TH_TYPE__BIBLIOLIST:
				return ((InternalEList<?>)getBibliolist()).basicRemove(otherEnd, msgs);
			case DocbookPackage.TH_TYPE__CALLOUTLIST:
				return ((InternalEList<?>)getCalloutlist()).basicRemove(otherEnd, msgs);
			case DocbookPackage.TH_TYPE__QANDASET:
				return ((InternalEList<?>)getQandaset()).basicRemove(otherEnd, msgs);
			case DocbookPackage.TH_TYPE__EXAMPLE:
				return ((InternalEList<?>)getExample()).basicRemove(otherEnd, msgs);
			case DocbookPackage.TH_TYPE__FIGURE:
				return ((InternalEList<?>)getFigure()).basicRemove(otherEnd, msgs);
			case DocbookPackage.TH_TYPE__TABLE:
				return ((InternalEList<?>)getTable()).basicRemove(otherEnd, msgs);
			case DocbookPackage.TH_TYPE__EQUATION:
				return ((InternalEList<?>)getEquation()).basicRemove(otherEnd, msgs);
			case DocbookPackage.TH_TYPE__INFORMALEXAMPLE:
				return ((InternalEList<?>)getInformalexample()).basicRemove(otherEnd, msgs);
			case DocbookPackage.TH_TYPE__INFORMALFIGURE:
				return ((InternalEList<?>)getInformalfigure()).basicRemove(otherEnd, msgs);
			case DocbookPackage.TH_TYPE__INFORMALTABLE:
				return ((InternalEList<?>)getInformaltable()).basicRemove(otherEnd, msgs);
			case DocbookPackage.TH_TYPE__INFORMALEQUATION:
				return ((InternalEList<?>)getInformalequation()).basicRemove(otherEnd, msgs);
			case DocbookPackage.TH_TYPE__SIDEBAR:
				return ((InternalEList<?>)getSidebar()).basicRemove(otherEnd, msgs);
			case DocbookPackage.TH_TYPE__BLOCKQUOTE:
				return ((InternalEList<?>)getBlockquote()).basicRemove(otherEnd, msgs);
			case DocbookPackage.TH_TYPE__ADDRESS:
				return ((InternalEList<?>)getAddress()).basicRemove(otherEnd, msgs);
			case DocbookPackage.TH_TYPE__EPIGRAPH:
				return ((InternalEList<?>)getEpigraph()).basicRemove(otherEnd, msgs);
			case DocbookPackage.TH_TYPE__MEDIAOBJECT:
				return ((InternalEList<?>)getMediaobject()).basicRemove(otherEnd, msgs);
			case DocbookPackage.TH_TYPE__SCREENSHOT:
				return ((InternalEList<?>)getScreenshot()).basicRemove(otherEnd, msgs);
			case DocbookPackage.TH_TYPE__TASK:
				return ((InternalEList<?>)getTask()).basicRemove(otherEnd, msgs);
			case DocbookPackage.TH_TYPE__PRODUCTIONSET:
				return ((InternalEList<?>)getProductionset()).basicRemove(otherEnd, msgs);
			case DocbookPackage.TH_TYPE__CONSTRAINTDEF:
				return ((InternalEList<?>)getConstraintdef()).basicRemove(otherEnd, msgs);
			case DocbookPackage.TH_TYPE__MSGSET:
				return ((InternalEList<?>)getMsgset()).basicRemove(otherEnd, msgs);
			case DocbookPackage.TH_TYPE__SCREEN:
				return ((InternalEList<?>)getScreen()).basicRemove(otherEnd, msgs);
			case DocbookPackage.TH_TYPE__LITERALLAYOUT:
				return ((InternalEList<?>)getLiterallayout()).basicRemove(otherEnd, msgs);
			case DocbookPackage.TH_TYPE__PROGRAMLISTINGCO:
				return ((InternalEList<?>)getProgramlistingco()).basicRemove(otherEnd, msgs);
			case DocbookPackage.TH_TYPE__SCREENCO:
				return ((InternalEList<?>)getScreenco()).basicRemove(otherEnd, msgs);
			case DocbookPackage.TH_TYPE__PROGRAMLISTING:
				return ((InternalEList<?>)getProgramlisting()).basicRemove(otherEnd, msgs);
			case DocbookPackage.TH_TYPE__SYNOPSIS:
				return ((InternalEList<?>)getSynopsis()).basicRemove(otherEnd, msgs);
			case DocbookPackage.TH_TYPE__BRIDGEHEAD:
				return ((InternalEList<?>)getBridgehead()).basicRemove(otherEnd, msgs);
			case DocbookPackage.TH_TYPE__REVHISTORY:
				return ((InternalEList<?>)getRevhistory()).basicRemove(otherEnd, msgs);
			case DocbookPackage.TH_TYPE__FUNCSYNOPSIS:
				return ((InternalEList<?>)getFuncsynopsis()).basicRemove(otherEnd, msgs);
			case DocbookPackage.TH_TYPE__CLASSSYNOPSIS:
				return ((InternalEList<?>)getClasssynopsis()).basicRemove(otherEnd, msgs);
			case DocbookPackage.TH_TYPE__METHODSYNOPSIS:
				return ((InternalEList<?>)getMethodsynopsis()).basicRemove(otherEnd, msgs);
			case DocbookPackage.TH_TYPE__CONSTRUCTORSYNOPSIS:
				return ((InternalEList<?>)getConstructorsynopsis()).basicRemove(otherEnd, msgs);
			case DocbookPackage.TH_TYPE__DESTRUCTORSYNOPSIS:
				return ((InternalEList<?>)getDestructorsynopsis()).basicRemove(otherEnd, msgs);
			case DocbookPackage.TH_TYPE__FIELDSYNOPSIS:
				return ((InternalEList<?>)getFieldsynopsis()).basicRemove(otherEnd, msgs);
			case DocbookPackage.TH_TYPE__CMDSYNOPSIS:
				return ((InternalEList<?>)getCmdsynopsis()).basicRemove(otherEnd, msgs);
			case DocbookPackage.TH_TYPE__CAUTION:
				return ((InternalEList<?>)getCaution()).basicRemove(otherEnd, msgs);
			case DocbookPackage.TH_TYPE__IMPORTANT:
				return ((InternalEList<?>)getImportant()).basicRemove(otherEnd, msgs);
			case DocbookPackage.TH_TYPE__NOTE:
				return ((InternalEList<?>)getNote()).basicRemove(otherEnd, msgs);
			case DocbookPackage.TH_TYPE__TIP:
				return ((InternalEList<?>)getTip()).basicRemove(otherEnd, msgs);
			case DocbookPackage.TH_TYPE__WARNING:
				return ((InternalEList<?>)getWarning()).basicRemove(otherEnd, msgs);
			case DocbookPackage.TH_TYPE__PARA:
				return ((InternalEList<?>)getPara()).basicRemove(otherEnd, msgs);
			case DocbookPackage.TH_TYPE__FORMALPARA:
				return ((InternalEList<?>)getFormalpara()).basicRemove(otherEnd, msgs);
			case DocbookPackage.TH_TYPE__SIMPARA:
				return ((InternalEList<?>)getSimpara()).basicRemove(otherEnd, msgs);
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
			case DocbookPackage.TH_TYPE__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case DocbookPackage.TH_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case DocbookPackage.TH_TYPE__INLINEMEDIAOBJECT:
				return getInlinemediaobject();
			case DocbookPackage.TH_TYPE__REMARK:
				return getRemark();
			case DocbookPackage.TH_TYPE__SUPERSCRIPT:
				return getSuperscript();
			case DocbookPackage.TH_TYPE__SUBSCRIPT:
				return getSubscript();
			case DocbookPackage.TH_TYPE__XREF:
				return getXref();
			case DocbookPackage.TH_TYPE__LINK:
				return getLink();
			case DocbookPackage.TH_TYPE__OLINK:
				return getOlink();
			case DocbookPackage.TH_TYPE__ANCHOR:
				return getAnchor();
			case DocbookPackage.TH_TYPE__BIBLIOREF:
				return getBiblioref();
			case DocbookPackage.TH_TYPE__ALT:
				return getAlt();
			case DocbookPackage.TH_TYPE__ANNOTATION:
				return getAnnotation();
			case DocbookPackage.TH_TYPE__INDEXTERM:
				return getIndexterm();
			case DocbookPackage.TH_TYPE__ABBREV:
				return getAbbrev();
			case DocbookPackage.TH_TYPE__ACRONYM:
				return getAcronym();
			case DocbookPackage.TH_TYPE__DATE:
				return getDate();
			case DocbookPackage.TH_TYPE__EMPHASIS:
				return getEmphasis();
			case DocbookPackage.TH_TYPE__FOOTNOTE:
				return getFootnote();
			case DocbookPackage.TH_TYPE__FOOTNOTEREF:
				return getFootnoteref();
			case DocbookPackage.TH_TYPE__FOREIGNPHRASE:
				return getForeignphrase();
			case DocbookPackage.TH_TYPE__PHRASE:
				return getPhrase();
			case DocbookPackage.TH_TYPE__QUOTE:
				return getQuote();
			case DocbookPackage.TH_TYPE__WORDASWORD:
				return getWordasword();
			case DocbookPackage.TH_TYPE__FIRSTTERM:
				return getFirstterm();
			case DocbookPackage.TH_TYPE__GLOSSTERM:
				return getGlossterm();
			case DocbookPackage.TH_TYPE__COREF:
				return getCoref();
			case DocbookPackage.TH_TYPE__TRADEMARK:
				return getTrademark();
			case DocbookPackage.TH_TYPE__PRODUCTNUMBER:
				return getProductnumber();
			case DocbookPackage.TH_TYPE__PRODUCTNAME:
				return getProductname();
			case DocbookPackage.TH_TYPE__DATABASE:
				return getDatabase();
			case DocbookPackage.TH_TYPE__APPLICATION:
				return getApplication();
			case DocbookPackage.TH_TYPE__HARDWARE:
				return getHardware();
			case DocbookPackage.TH_TYPE__CITATION:
				return getCitation();
			case DocbookPackage.TH_TYPE__CITEREFENTRY:
				return getCiterefentry();
			case DocbookPackage.TH_TYPE__CITETITLE:
				return getCitetitle();
			case DocbookPackage.TH_TYPE__CITEBIBLIOID:
				return getCitebiblioid();
			case DocbookPackage.TH_TYPE__AUTHOR:
				return getAuthor();
			case DocbookPackage.TH_TYPE__PERSON:
				return getPerson();
			case DocbookPackage.TH_TYPE__PERSONNAME:
				return getPersonname();
			case DocbookPackage.TH_TYPE__ORG:
				return getOrg();
			case DocbookPackage.TH_TYPE__ORGNAME:
				return getOrgname();
			case DocbookPackage.TH_TYPE__EDITOR:
				return getEditor();
			case DocbookPackage.TH_TYPE__JOBTITLE:
				return getJobtitle();
			case DocbookPackage.TH_TYPE__REPLACEABLE:
				return getReplaceable();
			case DocbookPackage.TH_TYPE__PACKAGE:
				return getPackage();
			case DocbookPackage.TH_TYPE__PARAMETER:
				return getParameter();
			case DocbookPackage.TH_TYPE__TERMDEF:
				return getTermdef();
			case DocbookPackage.TH_TYPE__NONTERMINAL:
				return getNonterminal();
			case DocbookPackage.TH_TYPE__SYSTEMITEM:
				return getSystemitem();
			case DocbookPackage.TH_TYPE__OPTION:
				return getOption();
			case DocbookPackage.TH_TYPE__OPTIONAL:
				return getOptional();
			case DocbookPackage.TH_TYPE__PROPERTY:
				return getProperty();
			case DocbookPackage.TH_TYPE__INLINEEQUATION:
				return getInlineequation();
			case DocbookPackage.TH_TYPE__TAG:
				return getTag();
			case DocbookPackage.TH_TYPE__MARKUP:
				return getMarkup();
			case DocbookPackage.TH_TYPE__TOKEN:
				return getToken();
			case DocbookPackage.TH_TYPE__SYMBOL:
				return getSymbol();
			case DocbookPackage.TH_TYPE__LITERAL:
				return getLiteral();
			case DocbookPackage.TH_TYPE__CODE:
				return getCode();
			case DocbookPackage.TH_TYPE__CONSTANT:
				return getConstant();
			case DocbookPackage.TH_TYPE__EMAIL:
				return getEmail();
			case DocbookPackage.TH_TYPE__URI:
				return getUri();
			case DocbookPackage.TH_TYPE__GUIICON:
				return getGuiicon();
			case DocbookPackage.TH_TYPE__GUIBUTTON:
				return getGuibutton();
			case DocbookPackage.TH_TYPE__GUIMENUITEM:
				return getGuimenuitem();
			case DocbookPackage.TH_TYPE__GUIMENU:
				return getGuimenu();
			case DocbookPackage.TH_TYPE__GUISUBMENU:
				return getGuisubmenu();
			case DocbookPackage.TH_TYPE__GUILABEL:
				return getGuilabel();
			case DocbookPackage.TH_TYPE__MENUCHOICE:
				return getMenuchoice();
			case DocbookPackage.TH_TYPE__MOUSEBUTTON:
				return getMousebutton();
			case DocbookPackage.TH_TYPE__KEYCOMBO:
				return getKeycombo();
			case DocbookPackage.TH_TYPE__KEYCAP:
				return getKeycap();
			case DocbookPackage.TH_TYPE__KEYCODE:
				return getKeycode();
			case DocbookPackage.TH_TYPE__KEYSYM:
				return getKeysym();
			case DocbookPackage.TH_TYPE__SHORTCUT:
				return getShortcut();
			case DocbookPackage.TH_TYPE__ACCEL:
				return getAccel();
			case DocbookPackage.TH_TYPE__PROMPT:
				return getPrompt();
			case DocbookPackage.TH_TYPE__ENVAR:
				return getEnvar();
			case DocbookPackage.TH_TYPE__FILENAME:
				return getFilename();
			case DocbookPackage.TH_TYPE__COMMAND:
				return getCommand();
			case DocbookPackage.TH_TYPE__COMPUTEROUTPUT:
				return getComputeroutput();
			case DocbookPackage.TH_TYPE__USERINPUT:
				return getUserinput();
			case DocbookPackage.TH_TYPE__FUNCTION:
				return getFunction();
			case DocbookPackage.TH_TYPE__VARNAME:
				return getVarname();
			case DocbookPackage.TH_TYPE__RETURNVALUE:
				return getReturnvalue();
			case DocbookPackage.TH_TYPE__TYPE:
				return getType();
			case DocbookPackage.TH_TYPE__CLASSNAME:
				return getClassname();
			case DocbookPackage.TH_TYPE__EXCEPTIONNAME:
				return getExceptionname();
			case DocbookPackage.TH_TYPE__INTERFACENAME:
				return getInterfacename();
			case DocbookPackage.TH_TYPE__METHODNAME:
				return getMethodname();
			case DocbookPackage.TH_TYPE__MODIFIER:
				return getModifier();
			case DocbookPackage.TH_TYPE__INITIALIZER:
				return getInitializer();
			case DocbookPackage.TH_TYPE__OOCLASS:
				return getOoclass();
			case DocbookPackage.TH_TYPE__OOEXCEPTION:
				return getOoexception();
			case DocbookPackage.TH_TYPE__OOINTERFACE:
				return getOointerface();
			case DocbookPackage.TH_TYPE__ERRORCODE:
				return getErrorcode();
			case DocbookPackage.TH_TYPE__ERRORTEXT:
				return getErrortext();
			case DocbookPackage.TH_TYPE__ERRORNAME:
				return getErrorname();
			case DocbookPackage.TH_TYPE__ERRORTYPE:
				return getErrortype();
			case DocbookPackage.TH_TYPE__ITEMIZEDLIST:
				return getItemizedlist();
			case DocbookPackage.TH_TYPE__ORDEREDLIST:
				return getOrderedlist();
			case DocbookPackage.TH_TYPE__PROCEDURE:
				return getProcedure();
			case DocbookPackage.TH_TYPE__SIMPLELIST:
				return getSimplelist();
			case DocbookPackage.TH_TYPE__VARIABLELIST:
				return getVariablelist();
			case DocbookPackage.TH_TYPE__SEGMENTEDLIST:
				return getSegmentedlist();
			case DocbookPackage.TH_TYPE__GLOSSLIST:
				return getGlosslist();
			case DocbookPackage.TH_TYPE__BIBLIOLIST:
				return getBibliolist();
			case DocbookPackage.TH_TYPE__CALLOUTLIST:
				return getCalloutlist();
			case DocbookPackage.TH_TYPE__QANDASET:
				return getQandaset();
			case DocbookPackage.TH_TYPE__EXAMPLE:
				return getExample();
			case DocbookPackage.TH_TYPE__FIGURE:
				return getFigure();
			case DocbookPackage.TH_TYPE__TABLE:
				return getTable();
			case DocbookPackage.TH_TYPE__EQUATION:
				return getEquation();
			case DocbookPackage.TH_TYPE__INFORMALEXAMPLE:
				return getInformalexample();
			case DocbookPackage.TH_TYPE__INFORMALFIGURE:
				return getInformalfigure();
			case DocbookPackage.TH_TYPE__INFORMALTABLE:
				return getInformaltable();
			case DocbookPackage.TH_TYPE__INFORMALEQUATION:
				return getInformalequation();
			case DocbookPackage.TH_TYPE__SIDEBAR:
				return getSidebar();
			case DocbookPackage.TH_TYPE__BLOCKQUOTE:
				return getBlockquote();
			case DocbookPackage.TH_TYPE__ADDRESS:
				return getAddress();
			case DocbookPackage.TH_TYPE__EPIGRAPH:
				return getEpigraph();
			case DocbookPackage.TH_TYPE__MEDIAOBJECT:
				return getMediaobject();
			case DocbookPackage.TH_TYPE__SCREENSHOT:
				return getScreenshot();
			case DocbookPackage.TH_TYPE__TASK:
				return getTask();
			case DocbookPackage.TH_TYPE__PRODUCTIONSET:
				return getProductionset();
			case DocbookPackage.TH_TYPE__CONSTRAINTDEF:
				return getConstraintdef();
			case DocbookPackage.TH_TYPE__MSGSET:
				return getMsgset();
			case DocbookPackage.TH_TYPE__SCREEN:
				return getScreen();
			case DocbookPackage.TH_TYPE__LITERALLAYOUT:
				return getLiterallayout();
			case DocbookPackage.TH_TYPE__PROGRAMLISTINGCO:
				return getProgramlistingco();
			case DocbookPackage.TH_TYPE__SCREENCO:
				return getScreenco();
			case DocbookPackage.TH_TYPE__PROGRAMLISTING:
				return getProgramlisting();
			case DocbookPackage.TH_TYPE__SYNOPSIS:
				return getSynopsis();
			case DocbookPackage.TH_TYPE__BRIDGEHEAD:
				return getBridgehead();
			case DocbookPackage.TH_TYPE__REVHISTORY:
				return getRevhistory();
			case DocbookPackage.TH_TYPE__FUNCSYNOPSIS:
				return getFuncsynopsis();
			case DocbookPackage.TH_TYPE__CLASSSYNOPSIS:
				return getClasssynopsis();
			case DocbookPackage.TH_TYPE__METHODSYNOPSIS:
				return getMethodsynopsis();
			case DocbookPackage.TH_TYPE__CONSTRUCTORSYNOPSIS:
				return getConstructorsynopsis();
			case DocbookPackage.TH_TYPE__DESTRUCTORSYNOPSIS:
				return getDestructorsynopsis();
			case DocbookPackage.TH_TYPE__FIELDSYNOPSIS:
				return getFieldsynopsis();
			case DocbookPackage.TH_TYPE__CMDSYNOPSIS:
				return getCmdsynopsis();
			case DocbookPackage.TH_TYPE__CAUTION:
				return getCaution();
			case DocbookPackage.TH_TYPE__IMPORTANT:
				return getImportant();
			case DocbookPackage.TH_TYPE__NOTE:
				return getNote();
			case DocbookPackage.TH_TYPE__TIP:
				return getTip();
			case DocbookPackage.TH_TYPE__WARNING:
				return getWarning();
			case DocbookPackage.TH_TYPE__PARA:
				return getPara();
			case DocbookPackage.TH_TYPE__FORMALPARA:
				return getFormalpara();
			case DocbookPackage.TH_TYPE__SIMPARA:
				return getSimpara();
			case DocbookPackage.TH_TYPE__ABBR:
				return getAbbr();
			case DocbookPackage.TH_TYPE__ALIGN:
				return getAlign();
			case DocbookPackage.TH_TYPE__ANNOTATIONS:
				return getAnnotations();
			case DocbookPackage.TH_TYPE__ARCH:
				return getArch();
			case DocbookPackage.TH_TYPE__AUDIENCE:
				return getAudience();
			case DocbookPackage.TH_TYPE__AXIS:
				return getAxis();
			case DocbookPackage.TH_TYPE__BASE:
				return getBase();
			case DocbookPackage.TH_TYPE__CHAR:
				return getChar();
			case DocbookPackage.TH_TYPE__CHAROFF:
				return getCharoff();
			case DocbookPackage.TH_TYPE__CLASS:
				return getClass_();
			case DocbookPackage.TH_TYPE__COLSPAN:
				return getColspan();
			case DocbookPackage.TH_TYPE__CONDITION:
				return getCondition();
			case DocbookPackage.TH_TYPE__CONFORMANCE:
				return getConformance();
			case DocbookPackage.TH_TYPE__DIR:
				return getDir();
			case DocbookPackage.TH_TYPE__HEADERS:
				return getHeaders();
			case DocbookPackage.TH_TYPE__ID:
				return getId();
			case DocbookPackage.TH_TYPE__LANG:
				return getLang();
			case DocbookPackage.TH_TYPE__LANG1:
				return getLang1();
			case DocbookPackage.TH_TYPE__ONCLICK:
				return getOnclick();
			case DocbookPackage.TH_TYPE__ONDBLCLICK:
				return getOndblclick();
			case DocbookPackage.TH_TYPE__ONKEYDOWN:
				return getOnkeydown();
			case DocbookPackage.TH_TYPE__ONKEYPRESS:
				return getOnkeypress();
			case DocbookPackage.TH_TYPE__ONKEYUP:
				return getOnkeyup();
			case DocbookPackage.TH_TYPE__ONMOUSEDOWN:
				return getOnmousedown();
			case DocbookPackage.TH_TYPE__ONMOUSEMOVE:
				return getOnmousemove();
			case DocbookPackage.TH_TYPE__ONMOUSEOUT:
				return getOnmouseout();
			case DocbookPackage.TH_TYPE__ONMOUSEOVER:
				return getOnmouseover();
			case DocbookPackage.TH_TYPE__ONMOUSEUP:
				return getOnmouseup();
			case DocbookPackage.TH_TYPE__OS:
				return getOs();
			case DocbookPackage.TH_TYPE__REMAP:
				return getRemap();
			case DocbookPackage.TH_TYPE__REVISION:
				return getRevision();
			case DocbookPackage.TH_TYPE__REVISIONFLAG:
				return getRevisionflag();
			case DocbookPackage.TH_TYPE__ROWSPAN:
				return getRowspan();
			case DocbookPackage.TH_TYPE__SCOPE:
				return getScope();
			case DocbookPackage.TH_TYPE__SECURITY:
				return getSecurity();
			case DocbookPackage.TH_TYPE__STYLE:
				return getStyle();
			case DocbookPackage.TH_TYPE__TITLE:
				return getTitle();
			case DocbookPackage.TH_TYPE__USERLEVEL:
				return getUserlevel();
			case DocbookPackage.TH_TYPE__VALIGN:
				return getValign();
			case DocbookPackage.TH_TYPE__VENDOR:
				return getVendor();
			case DocbookPackage.TH_TYPE__VERSION:
				return getVersion();
			case DocbookPackage.TH_TYPE__WORDSIZE:
				return getWordsize();
			case DocbookPackage.TH_TYPE__XREFLABEL:
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
			case DocbookPackage.TH_TYPE__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case DocbookPackage.TH_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case DocbookPackage.TH_TYPE__INLINEMEDIAOBJECT:
				getInlinemediaobject().clear();
				getInlinemediaobject().addAll((Collection<? extends InlinemediaobjectType>)newValue);
				return;
			case DocbookPackage.TH_TYPE__REMARK:
				getRemark().clear();
				getRemark().addAll((Collection<? extends RemarkType>)newValue);
				return;
			case DocbookPackage.TH_TYPE__SUPERSCRIPT:
				getSuperscript().clear();
				getSuperscript().addAll((Collection<? extends SuperscriptType>)newValue);
				return;
			case DocbookPackage.TH_TYPE__SUBSCRIPT:
				getSubscript().clear();
				getSubscript().addAll((Collection<? extends SubscriptType>)newValue);
				return;
			case DocbookPackage.TH_TYPE__XREF:
				getXref().clear();
				getXref().addAll((Collection<? extends XrefType>)newValue);
				return;
			case DocbookPackage.TH_TYPE__LINK:
				getLink().clear();
				getLink().addAll((Collection<? extends LinkType>)newValue);
				return;
			case DocbookPackage.TH_TYPE__OLINK:
				getOlink().clear();
				getOlink().addAll((Collection<? extends OlinkType>)newValue);
				return;
			case DocbookPackage.TH_TYPE__ANCHOR:
				getAnchor().clear();
				getAnchor().addAll((Collection<? extends AnchorType>)newValue);
				return;
			case DocbookPackage.TH_TYPE__BIBLIOREF:
				getBiblioref().clear();
				getBiblioref().addAll((Collection<? extends BibliorefType>)newValue);
				return;
			case DocbookPackage.TH_TYPE__ALT:
				getAlt().clear();
				getAlt().addAll((Collection<? extends AltType>)newValue);
				return;
			case DocbookPackage.TH_TYPE__ANNOTATION:
				getAnnotation().clear();
				getAnnotation().addAll((Collection<? extends AnnotationType>)newValue);
				return;
			case DocbookPackage.TH_TYPE__INDEXTERM:
				getIndexterm().clear();
				getIndexterm().addAll((Collection<? extends IndextermType>)newValue);
				return;
			case DocbookPackage.TH_TYPE__ABBREV:
				getAbbrev().clear();
				getAbbrev().addAll((Collection<? extends AbbrevType>)newValue);
				return;
			case DocbookPackage.TH_TYPE__ACRONYM:
				getAcronym().clear();
				getAcronym().addAll((Collection<? extends AcronymType>)newValue);
				return;
			case DocbookPackage.TH_TYPE__DATE:
				getDate().clear();
				getDate().addAll((Collection<? extends DateType>)newValue);
				return;
			case DocbookPackage.TH_TYPE__EMPHASIS:
				getEmphasis().clear();
				getEmphasis().addAll((Collection<? extends EmphasisType>)newValue);
				return;
			case DocbookPackage.TH_TYPE__FOOTNOTE:
				getFootnote().clear();
				getFootnote().addAll((Collection<? extends FootnoteType>)newValue);
				return;
			case DocbookPackage.TH_TYPE__FOOTNOTEREF:
				getFootnoteref().clear();
				getFootnoteref().addAll((Collection<? extends FootnoterefType>)newValue);
				return;
			case DocbookPackage.TH_TYPE__FOREIGNPHRASE:
				getForeignphrase().clear();
				getForeignphrase().addAll((Collection<? extends ForeignphraseType>)newValue);
				return;
			case DocbookPackage.TH_TYPE__PHRASE:
				getPhrase().clear();
				getPhrase().addAll((Collection<? extends PhraseType>)newValue);
				return;
			case DocbookPackage.TH_TYPE__QUOTE:
				getQuote().clear();
				getQuote().addAll((Collection<? extends QuoteType>)newValue);
				return;
			case DocbookPackage.TH_TYPE__WORDASWORD:
				getWordasword().clear();
				getWordasword().addAll((Collection<? extends WordaswordType>)newValue);
				return;
			case DocbookPackage.TH_TYPE__FIRSTTERM:
				getFirstterm().clear();
				getFirstterm().addAll((Collection<? extends FirsttermType>)newValue);
				return;
			case DocbookPackage.TH_TYPE__GLOSSTERM:
				getGlossterm().clear();
				getGlossterm().addAll((Collection<? extends GlosstermType>)newValue);
				return;
			case DocbookPackage.TH_TYPE__COREF:
				getCoref().clear();
				getCoref().addAll((Collection<? extends CorefType>)newValue);
				return;
			case DocbookPackage.TH_TYPE__TRADEMARK:
				getTrademark().clear();
				getTrademark().addAll((Collection<? extends TrademarkType>)newValue);
				return;
			case DocbookPackage.TH_TYPE__PRODUCTNUMBER:
				getProductnumber().clear();
				getProductnumber().addAll((Collection<? extends ProductnumberType>)newValue);
				return;
			case DocbookPackage.TH_TYPE__PRODUCTNAME:
				getProductname().clear();
				getProductname().addAll((Collection<? extends ProductnameType>)newValue);
				return;
			case DocbookPackage.TH_TYPE__DATABASE:
				getDatabase().clear();
				getDatabase().addAll((Collection<? extends DatabaseType>)newValue);
				return;
			case DocbookPackage.TH_TYPE__APPLICATION:
				getApplication().clear();
				getApplication().addAll((Collection<? extends ApplicationType>)newValue);
				return;
			case DocbookPackage.TH_TYPE__HARDWARE:
				getHardware().clear();
				getHardware().addAll((Collection<? extends HardwareType>)newValue);
				return;
			case DocbookPackage.TH_TYPE__CITATION:
				getCitation().clear();
				getCitation().addAll((Collection<? extends CitationType>)newValue);
				return;
			case DocbookPackage.TH_TYPE__CITEREFENTRY:
				getCiterefentry().clear();
				getCiterefentry().addAll((Collection<? extends CiterefentryType>)newValue);
				return;
			case DocbookPackage.TH_TYPE__CITETITLE:
				getCitetitle().clear();
				getCitetitle().addAll((Collection<? extends CitetitleType>)newValue);
				return;
			case DocbookPackage.TH_TYPE__CITEBIBLIOID:
				getCitebiblioid().clear();
				getCitebiblioid().addAll((Collection<? extends CitebiblioidType>)newValue);
				return;
			case DocbookPackage.TH_TYPE__AUTHOR:
				getAuthor().clear();
				getAuthor().addAll((Collection<? extends AuthorType>)newValue);
				return;
			case DocbookPackage.TH_TYPE__PERSON:
				getPerson().clear();
				getPerson().addAll((Collection<? extends PersonType>)newValue);
				return;
			case DocbookPackage.TH_TYPE__PERSONNAME:
				getPersonname().clear();
				getPersonname().addAll((Collection<? extends PersonnameType>)newValue);
				return;
			case DocbookPackage.TH_TYPE__ORG:
				getOrg().clear();
				getOrg().addAll((Collection<? extends OrgType>)newValue);
				return;
			case DocbookPackage.TH_TYPE__ORGNAME:
				getOrgname().clear();
				getOrgname().addAll((Collection<? extends OrgnameType>)newValue);
				return;
			case DocbookPackage.TH_TYPE__EDITOR:
				getEditor().clear();
				getEditor().addAll((Collection<? extends EditorType>)newValue);
				return;
			case DocbookPackage.TH_TYPE__JOBTITLE:
				getJobtitle().clear();
				getJobtitle().addAll((Collection<? extends JobtitleType>)newValue);
				return;
			case DocbookPackage.TH_TYPE__REPLACEABLE:
				getReplaceable().clear();
				getReplaceable().addAll((Collection<? extends ReplaceableType>)newValue);
				return;
			case DocbookPackage.TH_TYPE__PACKAGE:
				getPackage().clear();
				getPackage().addAll((Collection<? extends PackageType>)newValue);
				return;
			case DocbookPackage.TH_TYPE__PARAMETER:
				getParameter().clear();
				getParameter().addAll((Collection<? extends ParameterType>)newValue);
				return;
			case DocbookPackage.TH_TYPE__TERMDEF:
				getTermdef().clear();
				getTermdef().addAll((Collection<? extends TermdefType>)newValue);
				return;
			case DocbookPackage.TH_TYPE__NONTERMINAL:
				getNonterminal().clear();
				getNonterminal().addAll((Collection<? extends NonterminalType>)newValue);
				return;
			case DocbookPackage.TH_TYPE__SYSTEMITEM:
				getSystemitem().clear();
				getSystemitem().addAll((Collection<? extends SystemitemType>)newValue);
				return;
			case DocbookPackage.TH_TYPE__OPTION:
				getOption().clear();
				getOption().addAll((Collection<? extends OptionType>)newValue);
				return;
			case DocbookPackage.TH_TYPE__OPTIONAL:
				getOptional().clear();
				getOptional().addAll((Collection<? extends OptionalType>)newValue);
				return;
			case DocbookPackage.TH_TYPE__PROPERTY:
				getProperty().clear();
				getProperty().addAll((Collection<? extends PropertyType>)newValue);
				return;
			case DocbookPackage.TH_TYPE__INLINEEQUATION:
				getInlineequation().clear();
				getInlineequation().addAll((Collection<? extends InlineequationType>)newValue);
				return;
			case DocbookPackage.TH_TYPE__TAG:
				getTag().clear();
				getTag().addAll((Collection<? extends TagType>)newValue);
				return;
			case DocbookPackage.TH_TYPE__MARKUP:
				getMarkup().clear();
				getMarkup().addAll((Collection<? extends MarkupType>)newValue);
				return;
			case DocbookPackage.TH_TYPE__TOKEN:
				getToken().clear();
				getToken().addAll((Collection<? extends TokenType>)newValue);
				return;
			case DocbookPackage.TH_TYPE__SYMBOL:
				getSymbol().clear();
				getSymbol().addAll((Collection<? extends SymbolType>)newValue);
				return;
			case DocbookPackage.TH_TYPE__LITERAL:
				getLiteral().clear();
				getLiteral().addAll((Collection<? extends LiteralType>)newValue);
				return;
			case DocbookPackage.TH_TYPE__CODE:
				getCode().clear();
				getCode().addAll((Collection<? extends CodeType>)newValue);
				return;
			case DocbookPackage.TH_TYPE__CONSTANT:
				getConstant().clear();
				getConstant().addAll((Collection<? extends ConstantType>)newValue);
				return;
			case DocbookPackage.TH_TYPE__EMAIL:
				getEmail().clear();
				getEmail().addAll((Collection<? extends EmailType>)newValue);
				return;
			case DocbookPackage.TH_TYPE__URI:
				getUri().clear();
				getUri().addAll((Collection<? extends UriType>)newValue);
				return;
			case DocbookPackage.TH_TYPE__GUIICON:
				getGuiicon().clear();
				getGuiicon().addAll((Collection<? extends GuiiconType>)newValue);
				return;
			case DocbookPackage.TH_TYPE__GUIBUTTON:
				getGuibutton().clear();
				getGuibutton().addAll((Collection<? extends GuibuttonType>)newValue);
				return;
			case DocbookPackage.TH_TYPE__GUIMENUITEM:
				getGuimenuitem().clear();
				getGuimenuitem().addAll((Collection<? extends GuimenuitemType>)newValue);
				return;
			case DocbookPackage.TH_TYPE__GUIMENU:
				getGuimenu().clear();
				getGuimenu().addAll((Collection<? extends GuimenuType>)newValue);
				return;
			case DocbookPackage.TH_TYPE__GUISUBMENU:
				getGuisubmenu().clear();
				getGuisubmenu().addAll((Collection<? extends GuisubmenuType>)newValue);
				return;
			case DocbookPackage.TH_TYPE__GUILABEL:
				getGuilabel().clear();
				getGuilabel().addAll((Collection<? extends GuilabelType>)newValue);
				return;
			case DocbookPackage.TH_TYPE__MENUCHOICE:
				getMenuchoice().clear();
				getMenuchoice().addAll((Collection<? extends MenuchoiceType>)newValue);
				return;
			case DocbookPackage.TH_TYPE__MOUSEBUTTON:
				getMousebutton().clear();
				getMousebutton().addAll((Collection<? extends MousebuttonType>)newValue);
				return;
			case DocbookPackage.TH_TYPE__KEYCOMBO:
				getKeycombo().clear();
				getKeycombo().addAll((Collection<? extends KeycomboType>)newValue);
				return;
			case DocbookPackage.TH_TYPE__KEYCAP:
				getKeycap().clear();
				getKeycap().addAll((Collection<? extends KeycapType>)newValue);
				return;
			case DocbookPackage.TH_TYPE__KEYCODE:
				getKeycode().clear();
				getKeycode().addAll((Collection<? extends KeycodeType>)newValue);
				return;
			case DocbookPackage.TH_TYPE__KEYSYM:
				getKeysym().clear();
				getKeysym().addAll((Collection<? extends KeysymType>)newValue);
				return;
			case DocbookPackage.TH_TYPE__SHORTCUT:
				getShortcut().clear();
				getShortcut().addAll((Collection<? extends ShortcutType>)newValue);
				return;
			case DocbookPackage.TH_TYPE__ACCEL:
				getAccel().clear();
				getAccel().addAll((Collection<? extends AccelType>)newValue);
				return;
			case DocbookPackage.TH_TYPE__PROMPT:
				getPrompt().clear();
				getPrompt().addAll((Collection<? extends PromptType>)newValue);
				return;
			case DocbookPackage.TH_TYPE__ENVAR:
				getEnvar().clear();
				getEnvar().addAll((Collection<? extends EnvarType>)newValue);
				return;
			case DocbookPackage.TH_TYPE__FILENAME:
				getFilename().clear();
				getFilename().addAll((Collection<? extends FilenameType>)newValue);
				return;
			case DocbookPackage.TH_TYPE__COMMAND:
				getCommand().clear();
				getCommand().addAll((Collection<? extends CommandType>)newValue);
				return;
			case DocbookPackage.TH_TYPE__COMPUTEROUTPUT:
				getComputeroutput().clear();
				getComputeroutput().addAll((Collection<? extends ComputeroutputType>)newValue);
				return;
			case DocbookPackage.TH_TYPE__USERINPUT:
				getUserinput().clear();
				getUserinput().addAll((Collection<? extends UserinputType>)newValue);
				return;
			case DocbookPackage.TH_TYPE__FUNCTION:
				getFunction().clear();
				getFunction().addAll((Collection<? extends FunctionType1>)newValue);
				return;
			case DocbookPackage.TH_TYPE__VARNAME:
				getVarname().clear();
				getVarname().addAll((Collection<? extends VarnameType>)newValue);
				return;
			case DocbookPackage.TH_TYPE__RETURNVALUE:
				getReturnvalue().clear();
				getReturnvalue().addAll((Collection<? extends ReturnvalueType>)newValue);
				return;
			case DocbookPackage.TH_TYPE__TYPE:
				getType().clear();
				getType().addAll((Collection<? extends TypeType2>)newValue);
				return;
			case DocbookPackage.TH_TYPE__CLASSNAME:
				getClassname().clear();
				getClassname().addAll((Collection<? extends ClassnameType>)newValue);
				return;
			case DocbookPackage.TH_TYPE__EXCEPTIONNAME:
				getExceptionname().clear();
				getExceptionname().addAll((Collection<? extends ExceptionnameType>)newValue);
				return;
			case DocbookPackage.TH_TYPE__INTERFACENAME:
				getInterfacename().clear();
				getInterfacename().addAll((Collection<? extends InterfacenameType>)newValue);
				return;
			case DocbookPackage.TH_TYPE__METHODNAME:
				getMethodname().clear();
				getMethodname().addAll((Collection<? extends MethodnameType>)newValue);
				return;
			case DocbookPackage.TH_TYPE__MODIFIER:
				getModifier().clear();
				getModifier().addAll((Collection<? extends ModifierType>)newValue);
				return;
			case DocbookPackage.TH_TYPE__INITIALIZER:
				getInitializer().clear();
				getInitializer().addAll((Collection<? extends InitializerType>)newValue);
				return;
			case DocbookPackage.TH_TYPE__OOCLASS:
				getOoclass().clear();
				getOoclass().addAll((Collection<? extends OoclassType>)newValue);
				return;
			case DocbookPackage.TH_TYPE__OOEXCEPTION:
				getOoexception().clear();
				getOoexception().addAll((Collection<? extends OoexceptionType>)newValue);
				return;
			case DocbookPackage.TH_TYPE__OOINTERFACE:
				getOointerface().clear();
				getOointerface().addAll((Collection<? extends OointerfaceType>)newValue);
				return;
			case DocbookPackage.TH_TYPE__ERRORCODE:
				getErrorcode().clear();
				getErrorcode().addAll((Collection<? extends ErrorcodeType>)newValue);
				return;
			case DocbookPackage.TH_TYPE__ERRORTEXT:
				getErrortext().clear();
				getErrortext().addAll((Collection<? extends ErrortextType>)newValue);
				return;
			case DocbookPackage.TH_TYPE__ERRORNAME:
				getErrorname().clear();
				getErrorname().addAll((Collection<? extends ErrornameType>)newValue);
				return;
			case DocbookPackage.TH_TYPE__ERRORTYPE:
				getErrortype().clear();
				getErrortype().addAll((Collection<? extends ErrortypeType>)newValue);
				return;
			case DocbookPackage.TH_TYPE__ITEMIZEDLIST:
				getItemizedlist().clear();
				getItemizedlist().addAll((Collection<? extends ItemizedlistType>)newValue);
				return;
			case DocbookPackage.TH_TYPE__ORDEREDLIST:
				getOrderedlist().clear();
				getOrderedlist().addAll((Collection<? extends OrderedlistType>)newValue);
				return;
			case DocbookPackage.TH_TYPE__PROCEDURE:
				getProcedure().clear();
				getProcedure().addAll((Collection<? extends ProcedureType>)newValue);
				return;
			case DocbookPackage.TH_TYPE__SIMPLELIST:
				getSimplelist().clear();
				getSimplelist().addAll((Collection<? extends SimplelistType>)newValue);
				return;
			case DocbookPackage.TH_TYPE__VARIABLELIST:
				getVariablelist().clear();
				getVariablelist().addAll((Collection<? extends VariablelistType>)newValue);
				return;
			case DocbookPackage.TH_TYPE__SEGMENTEDLIST:
				getSegmentedlist().clear();
				getSegmentedlist().addAll((Collection<? extends SegmentedlistType>)newValue);
				return;
			case DocbookPackage.TH_TYPE__GLOSSLIST:
				getGlosslist().clear();
				getGlosslist().addAll((Collection<? extends GlosslistType>)newValue);
				return;
			case DocbookPackage.TH_TYPE__BIBLIOLIST:
				getBibliolist().clear();
				getBibliolist().addAll((Collection<? extends BibliolistType>)newValue);
				return;
			case DocbookPackage.TH_TYPE__CALLOUTLIST:
				getCalloutlist().clear();
				getCalloutlist().addAll((Collection<? extends CalloutlistType>)newValue);
				return;
			case DocbookPackage.TH_TYPE__QANDASET:
				getQandaset().clear();
				getQandaset().addAll((Collection<? extends QandasetType>)newValue);
				return;
			case DocbookPackage.TH_TYPE__EXAMPLE:
				getExample().clear();
				getExample().addAll((Collection<? extends ExampleType>)newValue);
				return;
			case DocbookPackage.TH_TYPE__FIGURE:
				getFigure().clear();
				getFigure().addAll((Collection<? extends FigureType>)newValue);
				return;
			case DocbookPackage.TH_TYPE__TABLE:
				getTable().clear();
				getTable().addAll((Collection<? extends TableType>)newValue);
				return;
			case DocbookPackage.TH_TYPE__EQUATION:
				getEquation().clear();
				getEquation().addAll((Collection<? extends EquationType>)newValue);
				return;
			case DocbookPackage.TH_TYPE__INFORMALEXAMPLE:
				getInformalexample().clear();
				getInformalexample().addAll((Collection<? extends InformalexampleType>)newValue);
				return;
			case DocbookPackage.TH_TYPE__INFORMALFIGURE:
				getInformalfigure().clear();
				getInformalfigure().addAll((Collection<? extends InformalfigureType>)newValue);
				return;
			case DocbookPackage.TH_TYPE__INFORMALTABLE:
				getInformaltable().clear();
				getInformaltable().addAll((Collection<? extends InformaltableType>)newValue);
				return;
			case DocbookPackage.TH_TYPE__INFORMALEQUATION:
				getInformalequation().clear();
				getInformalequation().addAll((Collection<? extends InformalequationType>)newValue);
				return;
			case DocbookPackage.TH_TYPE__SIDEBAR:
				getSidebar().clear();
				getSidebar().addAll((Collection<? extends SidebarType>)newValue);
				return;
			case DocbookPackage.TH_TYPE__BLOCKQUOTE:
				getBlockquote().clear();
				getBlockquote().addAll((Collection<? extends BlockquoteType>)newValue);
				return;
			case DocbookPackage.TH_TYPE__ADDRESS:
				getAddress().clear();
				getAddress().addAll((Collection<? extends AddressType>)newValue);
				return;
			case DocbookPackage.TH_TYPE__EPIGRAPH:
				getEpigraph().clear();
				getEpigraph().addAll((Collection<? extends EpigraphType>)newValue);
				return;
			case DocbookPackage.TH_TYPE__MEDIAOBJECT:
				getMediaobject().clear();
				getMediaobject().addAll((Collection<? extends MediaobjectType>)newValue);
				return;
			case DocbookPackage.TH_TYPE__SCREENSHOT:
				getScreenshot().clear();
				getScreenshot().addAll((Collection<? extends ScreenshotType>)newValue);
				return;
			case DocbookPackage.TH_TYPE__TASK:
				getTask().clear();
				getTask().addAll((Collection<? extends TaskType>)newValue);
				return;
			case DocbookPackage.TH_TYPE__PRODUCTIONSET:
				getProductionset().clear();
				getProductionset().addAll((Collection<? extends ProductionsetType>)newValue);
				return;
			case DocbookPackage.TH_TYPE__CONSTRAINTDEF:
				getConstraintdef().clear();
				getConstraintdef().addAll((Collection<? extends ConstraintdefType>)newValue);
				return;
			case DocbookPackage.TH_TYPE__MSGSET:
				getMsgset().clear();
				getMsgset().addAll((Collection<? extends MsgsetType>)newValue);
				return;
			case DocbookPackage.TH_TYPE__SCREEN:
				getScreen().clear();
				getScreen().addAll((Collection<? extends ScreenType>)newValue);
				return;
			case DocbookPackage.TH_TYPE__LITERALLAYOUT:
				getLiterallayout().clear();
				getLiterallayout().addAll((Collection<? extends LiterallayoutType>)newValue);
				return;
			case DocbookPackage.TH_TYPE__PROGRAMLISTINGCO:
				getProgramlistingco().clear();
				getProgramlistingco().addAll((Collection<? extends ProgramlistingcoType>)newValue);
				return;
			case DocbookPackage.TH_TYPE__SCREENCO:
				getScreenco().clear();
				getScreenco().addAll((Collection<? extends ScreencoType>)newValue);
				return;
			case DocbookPackage.TH_TYPE__PROGRAMLISTING:
				getProgramlisting().clear();
				getProgramlisting().addAll((Collection<? extends ProgramlistingType>)newValue);
				return;
			case DocbookPackage.TH_TYPE__SYNOPSIS:
				getSynopsis().clear();
				getSynopsis().addAll((Collection<? extends SynopsisType>)newValue);
				return;
			case DocbookPackage.TH_TYPE__BRIDGEHEAD:
				getBridgehead().clear();
				getBridgehead().addAll((Collection<? extends BridgeheadType>)newValue);
				return;
			case DocbookPackage.TH_TYPE__REVHISTORY:
				getRevhistory().clear();
				getRevhistory().addAll((Collection<? extends RevhistoryType>)newValue);
				return;
			case DocbookPackage.TH_TYPE__FUNCSYNOPSIS:
				getFuncsynopsis().clear();
				getFuncsynopsis().addAll((Collection<? extends FuncsynopsisType>)newValue);
				return;
			case DocbookPackage.TH_TYPE__CLASSSYNOPSIS:
				getClasssynopsis().clear();
				getClasssynopsis().addAll((Collection<? extends ClasssynopsisType>)newValue);
				return;
			case DocbookPackage.TH_TYPE__METHODSYNOPSIS:
				getMethodsynopsis().clear();
				getMethodsynopsis().addAll((Collection<? extends MethodsynopsisType>)newValue);
				return;
			case DocbookPackage.TH_TYPE__CONSTRUCTORSYNOPSIS:
				getConstructorsynopsis().clear();
				getConstructorsynopsis().addAll((Collection<? extends ConstructorsynopsisType>)newValue);
				return;
			case DocbookPackage.TH_TYPE__DESTRUCTORSYNOPSIS:
				getDestructorsynopsis().clear();
				getDestructorsynopsis().addAll((Collection<? extends DestructorsynopsisType>)newValue);
				return;
			case DocbookPackage.TH_TYPE__FIELDSYNOPSIS:
				getFieldsynopsis().clear();
				getFieldsynopsis().addAll((Collection<? extends FieldsynopsisType>)newValue);
				return;
			case DocbookPackage.TH_TYPE__CMDSYNOPSIS:
				getCmdsynopsis().clear();
				getCmdsynopsis().addAll((Collection<? extends CmdsynopsisType>)newValue);
				return;
			case DocbookPackage.TH_TYPE__CAUTION:
				getCaution().clear();
				getCaution().addAll((Collection<? extends CautionType>)newValue);
				return;
			case DocbookPackage.TH_TYPE__IMPORTANT:
				getImportant().clear();
				getImportant().addAll((Collection<? extends ImportantType>)newValue);
				return;
			case DocbookPackage.TH_TYPE__NOTE:
				getNote().clear();
				getNote().addAll((Collection<? extends NoteType>)newValue);
				return;
			case DocbookPackage.TH_TYPE__TIP:
				getTip().clear();
				getTip().addAll((Collection<? extends TipType>)newValue);
				return;
			case DocbookPackage.TH_TYPE__WARNING:
				getWarning().clear();
				getWarning().addAll((Collection<? extends WarningType>)newValue);
				return;
			case DocbookPackage.TH_TYPE__PARA:
				getPara().clear();
				getPara().addAll((Collection<? extends ParaType>)newValue);
				return;
			case DocbookPackage.TH_TYPE__FORMALPARA:
				getFormalpara().clear();
				getFormalpara().addAll((Collection<? extends FormalparaType>)newValue);
				return;
			case DocbookPackage.TH_TYPE__SIMPARA:
				getSimpara().clear();
				getSimpara().addAll((Collection<? extends SimparaType>)newValue);
				return;
			case DocbookPackage.TH_TYPE__ABBR:
				setAbbr(newValue);
				return;
			case DocbookPackage.TH_TYPE__ALIGN:
				setAlign((AlignType10)newValue);
				return;
			case DocbookPackage.TH_TYPE__ANNOTATIONS:
				setAnnotations(newValue);
				return;
			case DocbookPackage.TH_TYPE__ARCH:
				setArch(newValue);
				return;
			case DocbookPackage.TH_TYPE__AUDIENCE:
				setAudience(newValue);
				return;
			case DocbookPackage.TH_TYPE__AXIS:
				setAxis(newValue);
				return;
			case DocbookPackage.TH_TYPE__BASE:
				setBase(newValue);
				return;
			case DocbookPackage.TH_TYPE__CHAR:
				setChar(newValue);
				return;
			case DocbookPackage.TH_TYPE__CHAROFF:
				setCharoff(newValue);
				return;
			case DocbookPackage.TH_TYPE__CLASS:
				setClass(newValue);
				return;
			case DocbookPackage.TH_TYPE__COLSPAN:
				setColspan((String)newValue);
				return;
			case DocbookPackage.TH_TYPE__CONDITION:
				setCondition(newValue);
				return;
			case DocbookPackage.TH_TYPE__CONFORMANCE:
				setConformance(newValue);
				return;
			case DocbookPackage.TH_TYPE__DIR:
				setDir((DirType)newValue);
				return;
			case DocbookPackage.TH_TYPE__HEADERS:
				setHeaders(newValue);
				return;
			case DocbookPackage.TH_TYPE__ID:
				setId((String)newValue);
				return;
			case DocbookPackage.TH_TYPE__LANG:
				setLang(newValue);
				return;
			case DocbookPackage.TH_TYPE__LANG1:
				setLang1(newValue);
				return;
			case DocbookPackage.TH_TYPE__ONCLICK:
				setOnclick(newValue);
				return;
			case DocbookPackage.TH_TYPE__ONDBLCLICK:
				setOndblclick(newValue);
				return;
			case DocbookPackage.TH_TYPE__ONKEYDOWN:
				setOnkeydown(newValue);
				return;
			case DocbookPackage.TH_TYPE__ONKEYPRESS:
				setOnkeypress(newValue);
				return;
			case DocbookPackage.TH_TYPE__ONKEYUP:
				setOnkeyup(newValue);
				return;
			case DocbookPackage.TH_TYPE__ONMOUSEDOWN:
				setOnmousedown(newValue);
				return;
			case DocbookPackage.TH_TYPE__ONMOUSEMOVE:
				setOnmousemove(newValue);
				return;
			case DocbookPackage.TH_TYPE__ONMOUSEOUT:
				setOnmouseout(newValue);
				return;
			case DocbookPackage.TH_TYPE__ONMOUSEOVER:
				setOnmouseover(newValue);
				return;
			case DocbookPackage.TH_TYPE__ONMOUSEUP:
				setOnmouseup(newValue);
				return;
			case DocbookPackage.TH_TYPE__OS:
				setOs(newValue);
				return;
			case DocbookPackage.TH_TYPE__REMAP:
				setRemap(newValue);
				return;
			case DocbookPackage.TH_TYPE__REVISION:
				setRevision(newValue);
				return;
			case DocbookPackage.TH_TYPE__REVISIONFLAG:
				setRevisionflag((RevisionflagType)newValue);
				return;
			case DocbookPackage.TH_TYPE__ROWSPAN:
				setRowspan((String)newValue);
				return;
			case DocbookPackage.TH_TYPE__SCOPE:
				setScope((ScopeType2)newValue);
				return;
			case DocbookPackage.TH_TYPE__SECURITY:
				setSecurity(newValue);
				return;
			case DocbookPackage.TH_TYPE__STYLE:
				setStyle(newValue);
				return;
			case DocbookPackage.TH_TYPE__TITLE:
				setTitle(newValue);
				return;
			case DocbookPackage.TH_TYPE__USERLEVEL:
				setUserlevel(newValue);
				return;
			case DocbookPackage.TH_TYPE__VALIGN:
				setValign((ValignType3)newValue);
				return;
			case DocbookPackage.TH_TYPE__VENDOR:
				setVendor(newValue);
				return;
			case DocbookPackage.TH_TYPE__VERSION:
				setVersion(newValue);
				return;
			case DocbookPackage.TH_TYPE__WORDSIZE:
				setWordsize(newValue);
				return;
			case DocbookPackage.TH_TYPE__XREFLABEL:
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
			case DocbookPackage.TH_TYPE__MIXED:
				getMixed().clear();
				return;
			case DocbookPackage.TH_TYPE__GROUP:
				getGroup().clear();
				return;
			case DocbookPackage.TH_TYPE__INLINEMEDIAOBJECT:
				getInlinemediaobject().clear();
				return;
			case DocbookPackage.TH_TYPE__REMARK:
				getRemark().clear();
				return;
			case DocbookPackage.TH_TYPE__SUPERSCRIPT:
				getSuperscript().clear();
				return;
			case DocbookPackage.TH_TYPE__SUBSCRIPT:
				getSubscript().clear();
				return;
			case DocbookPackage.TH_TYPE__XREF:
				getXref().clear();
				return;
			case DocbookPackage.TH_TYPE__LINK:
				getLink().clear();
				return;
			case DocbookPackage.TH_TYPE__OLINK:
				getOlink().clear();
				return;
			case DocbookPackage.TH_TYPE__ANCHOR:
				getAnchor().clear();
				return;
			case DocbookPackage.TH_TYPE__BIBLIOREF:
				getBiblioref().clear();
				return;
			case DocbookPackage.TH_TYPE__ALT:
				getAlt().clear();
				return;
			case DocbookPackage.TH_TYPE__ANNOTATION:
				getAnnotation().clear();
				return;
			case DocbookPackage.TH_TYPE__INDEXTERM:
				getIndexterm().clear();
				return;
			case DocbookPackage.TH_TYPE__ABBREV:
				getAbbrev().clear();
				return;
			case DocbookPackage.TH_TYPE__ACRONYM:
				getAcronym().clear();
				return;
			case DocbookPackage.TH_TYPE__DATE:
				getDate().clear();
				return;
			case DocbookPackage.TH_TYPE__EMPHASIS:
				getEmphasis().clear();
				return;
			case DocbookPackage.TH_TYPE__FOOTNOTE:
				getFootnote().clear();
				return;
			case DocbookPackage.TH_TYPE__FOOTNOTEREF:
				getFootnoteref().clear();
				return;
			case DocbookPackage.TH_TYPE__FOREIGNPHRASE:
				getForeignphrase().clear();
				return;
			case DocbookPackage.TH_TYPE__PHRASE:
				getPhrase().clear();
				return;
			case DocbookPackage.TH_TYPE__QUOTE:
				getQuote().clear();
				return;
			case DocbookPackage.TH_TYPE__WORDASWORD:
				getWordasword().clear();
				return;
			case DocbookPackage.TH_TYPE__FIRSTTERM:
				getFirstterm().clear();
				return;
			case DocbookPackage.TH_TYPE__GLOSSTERM:
				getGlossterm().clear();
				return;
			case DocbookPackage.TH_TYPE__COREF:
				getCoref().clear();
				return;
			case DocbookPackage.TH_TYPE__TRADEMARK:
				getTrademark().clear();
				return;
			case DocbookPackage.TH_TYPE__PRODUCTNUMBER:
				getProductnumber().clear();
				return;
			case DocbookPackage.TH_TYPE__PRODUCTNAME:
				getProductname().clear();
				return;
			case DocbookPackage.TH_TYPE__DATABASE:
				getDatabase().clear();
				return;
			case DocbookPackage.TH_TYPE__APPLICATION:
				getApplication().clear();
				return;
			case DocbookPackage.TH_TYPE__HARDWARE:
				getHardware().clear();
				return;
			case DocbookPackage.TH_TYPE__CITATION:
				getCitation().clear();
				return;
			case DocbookPackage.TH_TYPE__CITEREFENTRY:
				getCiterefentry().clear();
				return;
			case DocbookPackage.TH_TYPE__CITETITLE:
				getCitetitle().clear();
				return;
			case DocbookPackage.TH_TYPE__CITEBIBLIOID:
				getCitebiblioid().clear();
				return;
			case DocbookPackage.TH_TYPE__AUTHOR:
				getAuthor().clear();
				return;
			case DocbookPackage.TH_TYPE__PERSON:
				getPerson().clear();
				return;
			case DocbookPackage.TH_TYPE__PERSONNAME:
				getPersonname().clear();
				return;
			case DocbookPackage.TH_TYPE__ORG:
				getOrg().clear();
				return;
			case DocbookPackage.TH_TYPE__ORGNAME:
				getOrgname().clear();
				return;
			case DocbookPackage.TH_TYPE__EDITOR:
				getEditor().clear();
				return;
			case DocbookPackage.TH_TYPE__JOBTITLE:
				getJobtitle().clear();
				return;
			case DocbookPackage.TH_TYPE__REPLACEABLE:
				getReplaceable().clear();
				return;
			case DocbookPackage.TH_TYPE__PACKAGE:
				getPackage().clear();
				return;
			case DocbookPackage.TH_TYPE__PARAMETER:
				getParameter().clear();
				return;
			case DocbookPackage.TH_TYPE__TERMDEF:
				getTermdef().clear();
				return;
			case DocbookPackage.TH_TYPE__NONTERMINAL:
				getNonterminal().clear();
				return;
			case DocbookPackage.TH_TYPE__SYSTEMITEM:
				getSystemitem().clear();
				return;
			case DocbookPackage.TH_TYPE__OPTION:
				getOption().clear();
				return;
			case DocbookPackage.TH_TYPE__OPTIONAL:
				getOptional().clear();
				return;
			case DocbookPackage.TH_TYPE__PROPERTY:
				getProperty().clear();
				return;
			case DocbookPackage.TH_TYPE__INLINEEQUATION:
				getInlineequation().clear();
				return;
			case DocbookPackage.TH_TYPE__TAG:
				getTag().clear();
				return;
			case DocbookPackage.TH_TYPE__MARKUP:
				getMarkup().clear();
				return;
			case DocbookPackage.TH_TYPE__TOKEN:
				getToken().clear();
				return;
			case DocbookPackage.TH_TYPE__SYMBOL:
				getSymbol().clear();
				return;
			case DocbookPackage.TH_TYPE__LITERAL:
				getLiteral().clear();
				return;
			case DocbookPackage.TH_TYPE__CODE:
				getCode().clear();
				return;
			case DocbookPackage.TH_TYPE__CONSTANT:
				getConstant().clear();
				return;
			case DocbookPackage.TH_TYPE__EMAIL:
				getEmail().clear();
				return;
			case DocbookPackage.TH_TYPE__URI:
				getUri().clear();
				return;
			case DocbookPackage.TH_TYPE__GUIICON:
				getGuiicon().clear();
				return;
			case DocbookPackage.TH_TYPE__GUIBUTTON:
				getGuibutton().clear();
				return;
			case DocbookPackage.TH_TYPE__GUIMENUITEM:
				getGuimenuitem().clear();
				return;
			case DocbookPackage.TH_TYPE__GUIMENU:
				getGuimenu().clear();
				return;
			case DocbookPackage.TH_TYPE__GUISUBMENU:
				getGuisubmenu().clear();
				return;
			case DocbookPackage.TH_TYPE__GUILABEL:
				getGuilabel().clear();
				return;
			case DocbookPackage.TH_TYPE__MENUCHOICE:
				getMenuchoice().clear();
				return;
			case DocbookPackage.TH_TYPE__MOUSEBUTTON:
				getMousebutton().clear();
				return;
			case DocbookPackage.TH_TYPE__KEYCOMBO:
				getKeycombo().clear();
				return;
			case DocbookPackage.TH_TYPE__KEYCAP:
				getKeycap().clear();
				return;
			case DocbookPackage.TH_TYPE__KEYCODE:
				getKeycode().clear();
				return;
			case DocbookPackage.TH_TYPE__KEYSYM:
				getKeysym().clear();
				return;
			case DocbookPackage.TH_TYPE__SHORTCUT:
				getShortcut().clear();
				return;
			case DocbookPackage.TH_TYPE__ACCEL:
				getAccel().clear();
				return;
			case DocbookPackage.TH_TYPE__PROMPT:
				getPrompt().clear();
				return;
			case DocbookPackage.TH_TYPE__ENVAR:
				getEnvar().clear();
				return;
			case DocbookPackage.TH_TYPE__FILENAME:
				getFilename().clear();
				return;
			case DocbookPackage.TH_TYPE__COMMAND:
				getCommand().clear();
				return;
			case DocbookPackage.TH_TYPE__COMPUTEROUTPUT:
				getComputeroutput().clear();
				return;
			case DocbookPackage.TH_TYPE__USERINPUT:
				getUserinput().clear();
				return;
			case DocbookPackage.TH_TYPE__FUNCTION:
				getFunction().clear();
				return;
			case DocbookPackage.TH_TYPE__VARNAME:
				getVarname().clear();
				return;
			case DocbookPackage.TH_TYPE__RETURNVALUE:
				getReturnvalue().clear();
				return;
			case DocbookPackage.TH_TYPE__TYPE:
				getType().clear();
				return;
			case DocbookPackage.TH_TYPE__CLASSNAME:
				getClassname().clear();
				return;
			case DocbookPackage.TH_TYPE__EXCEPTIONNAME:
				getExceptionname().clear();
				return;
			case DocbookPackage.TH_TYPE__INTERFACENAME:
				getInterfacename().clear();
				return;
			case DocbookPackage.TH_TYPE__METHODNAME:
				getMethodname().clear();
				return;
			case DocbookPackage.TH_TYPE__MODIFIER:
				getModifier().clear();
				return;
			case DocbookPackage.TH_TYPE__INITIALIZER:
				getInitializer().clear();
				return;
			case DocbookPackage.TH_TYPE__OOCLASS:
				getOoclass().clear();
				return;
			case DocbookPackage.TH_TYPE__OOEXCEPTION:
				getOoexception().clear();
				return;
			case DocbookPackage.TH_TYPE__OOINTERFACE:
				getOointerface().clear();
				return;
			case DocbookPackage.TH_TYPE__ERRORCODE:
				getErrorcode().clear();
				return;
			case DocbookPackage.TH_TYPE__ERRORTEXT:
				getErrortext().clear();
				return;
			case DocbookPackage.TH_TYPE__ERRORNAME:
				getErrorname().clear();
				return;
			case DocbookPackage.TH_TYPE__ERRORTYPE:
				getErrortype().clear();
				return;
			case DocbookPackage.TH_TYPE__ITEMIZEDLIST:
				getItemizedlist().clear();
				return;
			case DocbookPackage.TH_TYPE__ORDEREDLIST:
				getOrderedlist().clear();
				return;
			case DocbookPackage.TH_TYPE__PROCEDURE:
				getProcedure().clear();
				return;
			case DocbookPackage.TH_TYPE__SIMPLELIST:
				getSimplelist().clear();
				return;
			case DocbookPackage.TH_TYPE__VARIABLELIST:
				getVariablelist().clear();
				return;
			case DocbookPackage.TH_TYPE__SEGMENTEDLIST:
				getSegmentedlist().clear();
				return;
			case DocbookPackage.TH_TYPE__GLOSSLIST:
				getGlosslist().clear();
				return;
			case DocbookPackage.TH_TYPE__BIBLIOLIST:
				getBibliolist().clear();
				return;
			case DocbookPackage.TH_TYPE__CALLOUTLIST:
				getCalloutlist().clear();
				return;
			case DocbookPackage.TH_TYPE__QANDASET:
				getQandaset().clear();
				return;
			case DocbookPackage.TH_TYPE__EXAMPLE:
				getExample().clear();
				return;
			case DocbookPackage.TH_TYPE__FIGURE:
				getFigure().clear();
				return;
			case DocbookPackage.TH_TYPE__TABLE:
				getTable().clear();
				return;
			case DocbookPackage.TH_TYPE__EQUATION:
				getEquation().clear();
				return;
			case DocbookPackage.TH_TYPE__INFORMALEXAMPLE:
				getInformalexample().clear();
				return;
			case DocbookPackage.TH_TYPE__INFORMALFIGURE:
				getInformalfigure().clear();
				return;
			case DocbookPackage.TH_TYPE__INFORMALTABLE:
				getInformaltable().clear();
				return;
			case DocbookPackage.TH_TYPE__INFORMALEQUATION:
				getInformalequation().clear();
				return;
			case DocbookPackage.TH_TYPE__SIDEBAR:
				getSidebar().clear();
				return;
			case DocbookPackage.TH_TYPE__BLOCKQUOTE:
				getBlockquote().clear();
				return;
			case DocbookPackage.TH_TYPE__ADDRESS:
				getAddress().clear();
				return;
			case DocbookPackage.TH_TYPE__EPIGRAPH:
				getEpigraph().clear();
				return;
			case DocbookPackage.TH_TYPE__MEDIAOBJECT:
				getMediaobject().clear();
				return;
			case DocbookPackage.TH_TYPE__SCREENSHOT:
				getScreenshot().clear();
				return;
			case DocbookPackage.TH_TYPE__TASK:
				getTask().clear();
				return;
			case DocbookPackage.TH_TYPE__PRODUCTIONSET:
				getProductionset().clear();
				return;
			case DocbookPackage.TH_TYPE__CONSTRAINTDEF:
				getConstraintdef().clear();
				return;
			case DocbookPackage.TH_TYPE__MSGSET:
				getMsgset().clear();
				return;
			case DocbookPackage.TH_TYPE__SCREEN:
				getScreen().clear();
				return;
			case DocbookPackage.TH_TYPE__LITERALLAYOUT:
				getLiterallayout().clear();
				return;
			case DocbookPackage.TH_TYPE__PROGRAMLISTINGCO:
				getProgramlistingco().clear();
				return;
			case DocbookPackage.TH_TYPE__SCREENCO:
				getScreenco().clear();
				return;
			case DocbookPackage.TH_TYPE__PROGRAMLISTING:
				getProgramlisting().clear();
				return;
			case DocbookPackage.TH_TYPE__SYNOPSIS:
				getSynopsis().clear();
				return;
			case DocbookPackage.TH_TYPE__BRIDGEHEAD:
				getBridgehead().clear();
				return;
			case DocbookPackage.TH_TYPE__REVHISTORY:
				getRevhistory().clear();
				return;
			case DocbookPackage.TH_TYPE__FUNCSYNOPSIS:
				getFuncsynopsis().clear();
				return;
			case DocbookPackage.TH_TYPE__CLASSSYNOPSIS:
				getClasssynopsis().clear();
				return;
			case DocbookPackage.TH_TYPE__METHODSYNOPSIS:
				getMethodsynopsis().clear();
				return;
			case DocbookPackage.TH_TYPE__CONSTRUCTORSYNOPSIS:
				getConstructorsynopsis().clear();
				return;
			case DocbookPackage.TH_TYPE__DESTRUCTORSYNOPSIS:
				getDestructorsynopsis().clear();
				return;
			case DocbookPackage.TH_TYPE__FIELDSYNOPSIS:
				getFieldsynopsis().clear();
				return;
			case DocbookPackage.TH_TYPE__CMDSYNOPSIS:
				getCmdsynopsis().clear();
				return;
			case DocbookPackage.TH_TYPE__CAUTION:
				getCaution().clear();
				return;
			case DocbookPackage.TH_TYPE__IMPORTANT:
				getImportant().clear();
				return;
			case DocbookPackage.TH_TYPE__NOTE:
				getNote().clear();
				return;
			case DocbookPackage.TH_TYPE__TIP:
				getTip().clear();
				return;
			case DocbookPackage.TH_TYPE__WARNING:
				getWarning().clear();
				return;
			case DocbookPackage.TH_TYPE__PARA:
				getPara().clear();
				return;
			case DocbookPackage.TH_TYPE__FORMALPARA:
				getFormalpara().clear();
				return;
			case DocbookPackage.TH_TYPE__SIMPARA:
				getSimpara().clear();
				return;
			case DocbookPackage.TH_TYPE__ABBR:
				setAbbr(ABBR_EDEFAULT);
				return;
			case DocbookPackage.TH_TYPE__ALIGN:
				unsetAlign();
				return;
			case DocbookPackage.TH_TYPE__ANNOTATIONS:
				setAnnotations(ANNOTATIONS_EDEFAULT);
				return;
			case DocbookPackage.TH_TYPE__ARCH:
				setArch(ARCH_EDEFAULT);
				return;
			case DocbookPackage.TH_TYPE__AUDIENCE:
				setAudience(AUDIENCE_EDEFAULT);
				return;
			case DocbookPackage.TH_TYPE__AXIS:
				setAxis(AXIS_EDEFAULT);
				return;
			case DocbookPackage.TH_TYPE__BASE:
				setBase(BASE_EDEFAULT);
				return;
			case DocbookPackage.TH_TYPE__CHAR:
				setChar(CHAR_EDEFAULT);
				return;
			case DocbookPackage.TH_TYPE__CHAROFF:
				setCharoff(CHAROFF_EDEFAULT);
				return;
			case DocbookPackage.TH_TYPE__CLASS:
				setClass(CLASS_EDEFAULT);
				return;
			case DocbookPackage.TH_TYPE__COLSPAN:
				setColspan(COLSPAN_EDEFAULT);
				return;
			case DocbookPackage.TH_TYPE__CONDITION:
				setCondition(CONDITION_EDEFAULT);
				return;
			case DocbookPackage.TH_TYPE__CONFORMANCE:
				setConformance(CONFORMANCE_EDEFAULT);
				return;
			case DocbookPackage.TH_TYPE__DIR:
				unsetDir();
				return;
			case DocbookPackage.TH_TYPE__HEADERS:
				setHeaders(HEADERS_EDEFAULT);
				return;
			case DocbookPackage.TH_TYPE__ID:
				setId(ID_EDEFAULT);
				return;
			case DocbookPackage.TH_TYPE__LANG:
				setLang(LANG_EDEFAULT);
				return;
			case DocbookPackage.TH_TYPE__LANG1:
				setLang1(LANG1_EDEFAULT);
				return;
			case DocbookPackage.TH_TYPE__ONCLICK:
				setOnclick(ONCLICK_EDEFAULT);
				return;
			case DocbookPackage.TH_TYPE__ONDBLCLICK:
				setOndblclick(ONDBLCLICK_EDEFAULT);
				return;
			case DocbookPackage.TH_TYPE__ONKEYDOWN:
				setOnkeydown(ONKEYDOWN_EDEFAULT);
				return;
			case DocbookPackage.TH_TYPE__ONKEYPRESS:
				setOnkeypress(ONKEYPRESS_EDEFAULT);
				return;
			case DocbookPackage.TH_TYPE__ONKEYUP:
				setOnkeyup(ONKEYUP_EDEFAULT);
				return;
			case DocbookPackage.TH_TYPE__ONMOUSEDOWN:
				setOnmousedown(ONMOUSEDOWN_EDEFAULT);
				return;
			case DocbookPackage.TH_TYPE__ONMOUSEMOVE:
				setOnmousemove(ONMOUSEMOVE_EDEFAULT);
				return;
			case DocbookPackage.TH_TYPE__ONMOUSEOUT:
				setOnmouseout(ONMOUSEOUT_EDEFAULT);
				return;
			case DocbookPackage.TH_TYPE__ONMOUSEOVER:
				setOnmouseover(ONMOUSEOVER_EDEFAULT);
				return;
			case DocbookPackage.TH_TYPE__ONMOUSEUP:
				setOnmouseup(ONMOUSEUP_EDEFAULT);
				return;
			case DocbookPackage.TH_TYPE__OS:
				setOs(OS_EDEFAULT);
				return;
			case DocbookPackage.TH_TYPE__REMAP:
				setRemap(REMAP_EDEFAULT);
				return;
			case DocbookPackage.TH_TYPE__REVISION:
				setRevision(REVISION_EDEFAULT);
				return;
			case DocbookPackage.TH_TYPE__REVISIONFLAG:
				unsetRevisionflag();
				return;
			case DocbookPackage.TH_TYPE__ROWSPAN:
				setRowspan(ROWSPAN_EDEFAULT);
				return;
			case DocbookPackage.TH_TYPE__SCOPE:
				unsetScope();
				return;
			case DocbookPackage.TH_TYPE__SECURITY:
				setSecurity(SECURITY_EDEFAULT);
				return;
			case DocbookPackage.TH_TYPE__STYLE:
				setStyle(STYLE_EDEFAULT);
				return;
			case DocbookPackage.TH_TYPE__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case DocbookPackage.TH_TYPE__USERLEVEL:
				setUserlevel(USERLEVEL_EDEFAULT);
				return;
			case DocbookPackage.TH_TYPE__VALIGN:
				unsetValign();
				return;
			case DocbookPackage.TH_TYPE__VENDOR:
				setVendor(VENDOR_EDEFAULT);
				return;
			case DocbookPackage.TH_TYPE__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case DocbookPackage.TH_TYPE__WORDSIZE:
				setWordsize(WORDSIZE_EDEFAULT);
				return;
			case DocbookPackage.TH_TYPE__XREFLABEL:
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
			case DocbookPackage.TH_TYPE__MIXED:
				return mixed != null && !mixed.isEmpty();
			case DocbookPackage.TH_TYPE__GROUP:
				return !getGroup().isEmpty();
			case DocbookPackage.TH_TYPE__INLINEMEDIAOBJECT:
				return !getInlinemediaobject().isEmpty();
			case DocbookPackage.TH_TYPE__REMARK:
				return !getRemark().isEmpty();
			case DocbookPackage.TH_TYPE__SUPERSCRIPT:
				return !getSuperscript().isEmpty();
			case DocbookPackage.TH_TYPE__SUBSCRIPT:
				return !getSubscript().isEmpty();
			case DocbookPackage.TH_TYPE__XREF:
				return !getXref().isEmpty();
			case DocbookPackage.TH_TYPE__LINK:
				return !getLink().isEmpty();
			case DocbookPackage.TH_TYPE__OLINK:
				return !getOlink().isEmpty();
			case DocbookPackage.TH_TYPE__ANCHOR:
				return !getAnchor().isEmpty();
			case DocbookPackage.TH_TYPE__BIBLIOREF:
				return !getBiblioref().isEmpty();
			case DocbookPackage.TH_TYPE__ALT:
				return !getAlt().isEmpty();
			case DocbookPackage.TH_TYPE__ANNOTATION:
				return !getAnnotation().isEmpty();
			case DocbookPackage.TH_TYPE__INDEXTERM:
				return !getIndexterm().isEmpty();
			case DocbookPackage.TH_TYPE__ABBREV:
				return !getAbbrev().isEmpty();
			case DocbookPackage.TH_TYPE__ACRONYM:
				return !getAcronym().isEmpty();
			case DocbookPackage.TH_TYPE__DATE:
				return !getDate().isEmpty();
			case DocbookPackage.TH_TYPE__EMPHASIS:
				return !getEmphasis().isEmpty();
			case DocbookPackage.TH_TYPE__FOOTNOTE:
				return !getFootnote().isEmpty();
			case DocbookPackage.TH_TYPE__FOOTNOTEREF:
				return !getFootnoteref().isEmpty();
			case DocbookPackage.TH_TYPE__FOREIGNPHRASE:
				return !getForeignphrase().isEmpty();
			case DocbookPackage.TH_TYPE__PHRASE:
				return !getPhrase().isEmpty();
			case DocbookPackage.TH_TYPE__QUOTE:
				return !getQuote().isEmpty();
			case DocbookPackage.TH_TYPE__WORDASWORD:
				return !getWordasword().isEmpty();
			case DocbookPackage.TH_TYPE__FIRSTTERM:
				return !getFirstterm().isEmpty();
			case DocbookPackage.TH_TYPE__GLOSSTERM:
				return !getGlossterm().isEmpty();
			case DocbookPackage.TH_TYPE__COREF:
				return !getCoref().isEmpty();
			case DocbookPackage.TH_TYPE__TRADEMARK:
				return !getTrademark().isEmpty();
			case DocbookPackage.TH_TYPE__PRODUCTNUMBER:
				return !getProductnumber().isEmpty();
			case DocbookPackage.TH_TYPE__PRODUCTNAME:
				return !getProductname().isEmpty();
			case DocbookPackage.TH_TYPE__DATABASE:
				return !getDatabase().isEmpty();
			case DocbookPackage.TH_TYPE__APPLICATION:
				return !getApplication().isEmpty();
			case DocbookPackage.TH_TYPE__HARDWARE:
				return !getHardware().isEmpty();
			case DocbookPackage.TH_TYPE__CITATION:
				return !getCitation().isEmpty();
			case DocbookPackage.TH_TYPE__CITEREFENTRY:
				return !getCiterefentry().isEmpty();
			case DocbookPackage.TH_TYPE__CITETITLE:
				return !getCitetitle().isEmpty();
			case DocbookPackage.TH_TYPE__CITEBIBLIOID:
				return !getCitebiblioid().isEmpty();
			case DocbookPackage.TH_TYPE__AUTHOR:
				return !getAuthor().isEmpty();
			case DocbookPackage.TH_TYPE__PERSON:
				return !getPerson().isEmpty();
			case DocbookPackage.TH_TYPE__PERSONNAME:
				return !getPersonname().isEmpty();
			case DocbookPackage.TH_TYPE__ORG:
				return !getOrg().isEmpty();
			case DocbookPackage.TH_TYPE__ORGNAME:
				return !getOrgname().isEmpty();
			case DocbookPackage.TH_TYPE__EDITOR:
				return !getEditor().isEmpty();
			case DocbookPackage.TH_TYPE__JOBTITLE:
				return !getJobtitle().isEmpty();
			case DocbookPackage.TH_TYPE__REPLACEABLE:
				return !getReplaceable().isEmpty();
			case DocbookPackage.TH_TYPE__PACKAGE:
				return !getPackage().isEmpty();
			case DocbookPackage.TH_TYPE__PARAMETER:
				return !getParameter().isEmpty();
			case DocbookPackage.TH_TYPE__TERMDEF:
				return !getTermdef().isEmpty();
			case DocbookPackage.TH_TYPE__NONTERMINAL:
				return !getNonterminal().isEmpty();
			case DocbookPackage.TH_TYPE__SYSTEMITEM:
				return !getSystemitem().isEmpty();
			case DocbookPackage.TH_TYPE__OPTION:
				return !getOption().isEmpty();
			case DocbookPackage.TH_TYPE__OPTIONAL:
				return !getOptional().isEmpty();
			case DocbookPackage.TH_TYPE__PROPERTY:
				return !getProperty().isEmpty();
			case DocbookPackage.TH_TYPE__INLINEEQUATION:
				return !getInlineequation().isEmpty();
			case DocbookPackage.TH_TYPE__TAG:
				return !getTag().isEmpty();
			case DocbookPackage.TH_TYPE__MARKUP:
				return !getMarkup().isEmpty();
			case DocbookPackage.TH_TYPE__TOKEN:
				return !getToken().isEmpty();
			case DocbookPackage.TH_TYPE__SYMBOL:
				return !getSymbol().isEmpty();
			case DocbookPackage.TH_TYPE__LITERAL:
				return !getLiteral().isEmpty();
			case DocbookPackage.TH_TYPE__CODE:
				return !getCode().isEmpty();
			case DocbookPackage.TH_TYPE__CONSTANT:
				return !getConstant().isEmpty();
			case DocbookPackage.TH_TYPE__EMAIL:
				return !getEmail().isEmpty();
			case DocbookPackage.TH_TYPE__URI:
				return !getUri().isEmpty();
			case DocbookPackage.TH_TYPE__GUIICON:
				return !getGuiicon().isEmpty();
			case DocbookPackage.TH_TYPE__GUIBUTTON:
				return !getGuibutton().isEmpty();
			case DocbookPackage.TH_TYPE__GUIMENUITEM:
				return !getGuimenuitem().isEmpty();
			case DocbookPackage.TH_TYPE__GUIMENU:
				return !getGuimenu().isEmpty();
			case DocbookPackage.TH_TYPE__GUISUBMENU:
				return !getGuisubmenu().isEmpty();
			case DocbookPackage.TH_TYPE__GUILABEL:
				return !getGuilabel().isEmpty();
			case DocbookPackage.TH_TYPE__MENUCHOICE:
				return !getMenuchoice().isEmpty();
			case DocbookPackage.TH_TYPE__MOUSEBUTTON:
				return !getMousebutton().isEmpty();
			case DocbookPackage.TH_TYPE__KEYCOMBO:
				return !getKeycombo().isEmpty();
			case DocbookPackage.TH_TYPE__KEYCAP:
				return !getKeycap().isEmpty();
			case DocbookPackage.TH_TYPE__KEYCODE:
				return !getKeycode().isEmpty();
			case DocbookPackage.TH_TYPE__KEYSYM:
				return !getKeysym().isEmpty();
			case DocbookPackage.TH_TYPE__SHORTCUT:
				return !getShortcut().isEmpty();
			case DocbookPackage.TH_TYPE__ACCEL:
				return !getAccel().isEmpty();
			case DocbookPackage.TH_TYPE__PROMPT:
				return !getPrompt().isEmpty();
			case DocbookPackage.TH_TYPE__ENVAR:
				return !getEnvar().isEmpty();
			case DocbookPackage.TH_TYPE__FILENAME:
				return !getFilename().isEmpty();
			case DocbookPackage.TH_TYPE__COMMAND:
				return !getCommand().isEmpty();
			case DocbookPackage.TH_TYPE__COMPUTEROUTPUT:
				return !getComputeroutput().isEmpty();
			case DocbookPackage.TH_TYPE__USERINPUT:
				return !getUserinput().isEmpty();
			case DocbookPackage.TH_TYPE__FUNCTION:
				return !getFunction().isEmpty();
			case DocbookPackage.TH_TYPE__VARNAME:
				return !getVarname().isEmpty();
			case DocbookPackage.TH_TYPE__RETURNVALUE:
				return !getReturnvalue().isEmpty();
			case DocbookPackage.TH_TYPE__TYPE:
				return !getType().isEmpty();
			case DocbookPackage.TH_TYPE__CLASSNAME:
				return !getClassname().isEmpty();
			case DocbookPackage.TH_TYPE__EXCEPTIONNAME:
				return !getExceptionname().isEmpty();
			case DocbookPackage.TH_TYPE__INTERFACENAME:
				return !getInterfacename().isEmpty();
			case DocbookPackage.TH_TYPE__METHODNAME:
				return !getMethodname().isEmpty();
			case DocbookPackage.TH_TYPE__MODIFIER:
				return !getModifier().isEmpty();
			case DocbookPackage.TH_TYPE__INITIALIZER:
				return !getInitializer().isEmpty();
			case DocbookPackage.TH_TYPE__OOCLASS:
				return !getOoclass().isEmpty();
			case DocbookPackage.TH_TYPE__OOEXCEPTION:
				return !getOoexception().isEmpty();
			case DocbookPackage.TH_TYPE__OOINTERFACE:
				return !getOointerface().isEmpty();
			case DocbookPackage.TH_TYPE__ERRORCODE:
				return !getErrorcode().isEmpty();
			case DocbookPackage.TH_TYPE__ERRORTEXT:
				return !getErrortext().isEmpty();
			case DocbookPackage.TH_TYPE__ERRORNAME:
				return !getErrorname().isEmpty();
			case DocbookPackage.TH_TYPE__ERRORTYPE:
				return !getErrortype().isEmpty();
			case DocbookPackage.TH_TYPE__ITEMIZEDLIST:
				return !getItemizedlist().isEmpty();
			case DocbookPackage.TH_TYPE__ORDEREDLIST:
				return !getOrderedlist().isEmpty();
			case DocbookPackage.TH_TYPE__PROCEDURE:
				return !getProcedure().isEmpty();
			case DocbookPackage.TH_TYPE__SIMPLELIST:
				return !getSimplelist().isEmpty();
			case DocbookPackage.TH_TYPE__VARIABLELIST:
				return !getVariablelist().isEmpty();
			case DocbookPackage.TH_TYPE__SEGMENTEDLIST:
				return !getSegmentedlist().isEmpty();
			case DocbookPackage.TH_TYPE__GLOSSLIST:
				return !getGlosslist().isEmpty();
			case DocbookPackage.TH_TYPE__BIBLIOLIST:
				return !getBibliolist().isEmpty();
			case DocbookPackage.TH_TYPE__CALLOUTLIST:
				return !getCalloutlist().isEmpty();
			case DocbookPackage.TH_TYPE__QANDASET:
				return !getQandaset().isEmpty();
			case DocbookPackage.TH_TYPE__EXAMPLE:
				return !getExample().isEmpty();
			case DocbookPackage.TH_TYPE__FIGURE:
				return !getFigure().isEmpty();
			case DocbookPackage.TH_TYPE__TABLE:
				return !getTable().isEmpty();
			case DocbookPackage.TH_TYPE__EQUATION:
				return !getEquation().isEmpty();
			case DocbookPackage.TH_TYPE__INFORMALEXAMPLE:
				return !getInformalexample().isEmpty();
			case DocbookPackage.TH_TYPE__INFORMALFIGURE:
				return !getInformalfigure().isEmpty();
			case DocbookPackage.TH_TYPE__INFORMALTABLE:
				return !getInformaltable().isEmpty();
			case DocbookPackage.TH_TYPE__INFORMALEQUATION:
				return !getInformalequation().isEmpty();
			case DocbookPackage.TH_TYPE__SIDEBAR:
				return !getSidebar().isEmpty();
			case DocbookPackage.TH_TYPE__BLOCKQUOTE:
				return !getBlockquote().isEmpty();
			case DocbookPackage.TH_TYPE__ADDRESS:
				return !getAddress().isEmpty();
			case DocbookPackage.TH_TYPE__EPIGRAPH:
				return !getEpigraph().isEmpty();
			case DocbookPackage.TH_TYPE__MEDIAOBJECT:
				return !getMediaobject().isEmpty();
			case DocbookPackage.TH_TYPE__SCREENSHOT:
				return !getScreenshot().isEmpty();
			case DocbookPackage.TH_TYPE__TASK:
				return !getTask().isEmpty();
			case DocbookPackage.TH_TYPE__PRODUCTIONSET:
				return !getProductionset().isEmpty();
			case DocbookPackage.TH_TYPE__CONSTRAINTDEF:
				return !getConstraintdef().isEmpty();
			case DocbookPackage.TH_TYPE__MSGSET:
				return !getMsgset().isEmpty();
			case DocbookPackage.TH_TYPE__SCREEN:
				return !getScreen().isEmpty();
			case DocbookPackage.TH_TYPE__LITERALLAYOUT:
				return !getLiterallayout().isEmpty();
			case DocbookPackage.TH_TYPE__PROGRAMLISTINGCO:
				return !getProgramlistingco().isEmpty();
			case DocbookPackage.TH_TYPE__SCREENCO:
				return !getScreenco().isEmpty();
			case DocbookPackage.TH_TYPE__PROGRAMLISTING:
				return !getProgramlisting().isEmpty();
			case DocbookPackage.TH_TYPE__SYNOPSIS:
				return !getSynopsis().isEmpty();
			case DocbookPackage.TH_TYPE__BRIDGEHEAD:
				return !getBridgehead().isEmpty();
			case DocbookPackage.TH_TYPE__REVHISTORY:
				return !getRevhistory().isEmpty();
			case DocbookPackage.TH_TYPE__FUNCSYNOPSIS:
				return !getFuncsynopsis().isEmpty();
			case DocbookPackage.TH_TYPE__CLASSSYNOPSIS:
				return !getClasssynopsis().isEmpty();
			case DocbookPackage.TH_TYPE__METHODSYNOPSIS:
				return !getMethodsynopsis().isEmpty();
			case DocbookPackage.TH_TYPE__CONSTRUCTORSYNOPSIS:
				return !getConstructorsynopsis().isEmpty();
			case DocbookPackage.TH_TYPE__DESTRUCTORSYNOPSIS:
				return !getDestructorsynopsis().isEmpty();
			case DocbookPackage.TH_TYPE__FIELDSYNOPSIS:
				return !getFieldsynopsis().isEmpty();
			case DocbookPackage.TH_TYPE__CMDSYNOPSIS:
				return !getCmdsynopsis().isEmpty();
			case DocbookPackage.TH_TYPE__CAUTION:
				return !getCaution().isEmpty();
			case DocbookPackage.TH_TYPE__IMPORTANT:
				return !getImportant().isEmpty();
			case DocbookPackage.TH_TYPE__NOTE:
				return !getNote().isEmpty();
			case DocbookPackage.TH_TYPE__TIP:
				return !getTip().isEmpty();
			case DocbookPackage.TH_TYPE__WARNING:
				return !getWarning().isEmpty();
			case DocbookPackage.TH_TYPE__PARA:
				return !getPara().isEmpty();
			case DocbookPackage.TH_TYPE__FORMALPARA:
				return !getFormalpara().isEmpty();
			case DocbookPackage.TH_TYPE__SIMPARA:
				return !getSimpara().isEmpty();
			case DocbookPackage.TH_TYPE__ABBR:
				return ABBR_EDEFAULT == null ? abbr != null : !ABBR_EDEFAULT.equals(abbr);
			case DocbookPackage.TH_TYPE__ALIGN:
				return isSetAlign();
			case DocbookPackage.TH_TYPE__ANNOTATIONS:
				return ANNOTATIONS_EDEFAULT == null ? annotations != null : !ANNOTATIONS_EDEFAULT.equals(annotations);
			case DocbookPackage.TH_TYPE__ARCH:
				return ARCH_EDEFAULT == null ? arch != null : !ARCH_EDEFAULT.equals(arch);
			case DocbookPackage.TH_TYPE__AUDIENCE:
				return AUDIENCE_EDEFAULT == null ? audience != null : !AUDIENCE_EDEFAULT.equals(audience);
			case DocbookPackage.TH_TYPE__AXIS:
				return AXIS_EDEFAULT == null ? axis != null : !AXIS_EDEFAULT.equals(axis);
			case DocbookPackage.TH_TYPE__BASE:
				return BASE_EDEFAULT == null ? base != null : !BASE_EDEFAULT.equals(base);
			case DocbookPackage.TH_TYPE__CHAR:
				return CHAR_EDEFAULT == null ? char_ != null : !CHAR_EDEFAULT.equals(char_);
			case DocbookPackage.TH_TYPE__CHAROFF:
				return CHAROFF_EDEFAULT == null ? charoff != null : !CHAROFF_EDEFAULT.equals(charoff);
			case DocbookPackage.TH_TYPE__CLASS:
				return CLASS_EDEFAULT == null ? class_ != null : !CLASS_EDEFAULT.equals(class_);
			case DocbookPackage.TH_TYPE__COLSPAN:
				return COLSPAN_EDEFAULT == null ? colspan != null : !COLSPAN_EDEFAULT.equals(colspan);
			case DocbookPackage.TH_TYPE__CONDITION:
				return CONDITION_EDEFAULT == null ? condition != null : !CONDITION_EDEFAULT.equals(condition);
			case DocbookPackage.TH_TYPE__CONFORMANCE:
				return CONFORMANCE_EDEFAULT == null ? conformance != null : !CONFORMANCE_EDEFAULT.equals(conformance);
			case DocbookPackage.TH_TYPE__DIR:
				return isSetDir();
			case DocbookPackage.TH_TYPE__HEADERS:
				return HEADERS_EDEFAULT == null ? headers != null : !HEADERS_EDEFAULT.equals(headers);
			case DocbookPackage.TH_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case DocbookPackage.TH_TYPE__LANG:
				return LANG_EDEFAULT == null ? lang != null : !LANG_EDEFAULT.equals(lang);
			case DocbookPackage.TH_TYPE__LANG1:
				return LANG1_EDEFAULT == null ? lang1 != null : !LANG1_EDEFAULT.equals(lang1);
			case DocbookPackage.TH_TYPE__ONCLICK:
				return ONCLICK_EDEFAULT == null ? onclick != null : !ONCLICK_EDEFAULT.equals(onclick);
			case DocbookPackage.TH_TYPE__ONDBLCLICK:
				return ONDBLCLICK_EDEFAULT == null ? ondblclick != null : !ONDBLCLICK_EDEFAULT.equals(ondblclick);
			case DocbookPackage.TH_TYPE__ONKEYDOWN:
				return ONKEYDOWN_EDEFAULT == null ? onkeydown != null : !ONKEYDOWN_EDEFAULT.equals(onkeydown);
			case DocbookPackage.TH_TYPE__ONKEYPRESS:
				return ONKEYPRESS_EDEFAULT == null ? onkeypress != null : !ONKEYPRESS_EDEFAULT.equals(onkeypress);
			case DocbookPackage.TH_TYPE__ONKEYUP:
				return ONKEYUP_EDEFAULT == null ? onkeyup != null : !ONKEYUP_EDEFAULT.equals(onkeyup);
			case DocbookPackage.TH_TYPE__ONMOUSEDOWN:
				return ONMOUSEDOWN_EDEFAULT == null ? onmousedown != null : !ONMOUSEDOWN_EDEFAULT.equals(onmousedown);
			case DocbookPackage.TH_TYPE__ONMOUSEMOVE:
				return ONMOUSEMOVE_EDEFAULT == null ? onmousemove != null : !ONMOUSEMOVE_EDEFAULT.equals(onmousemove);
			case DocbookPackage.TH_TYPE__ONMOUSEOUT:
				return ONMOUSEOUT_EDEFAULT == null ? onmouseout != null : !ONMOUSEOUT_EDEFAULT.equals(onmouseout);
			case DocbookPackage.TH_TYPE__ONMOUSEOVER:
				return ONMOUSEOVER_EDEFAULT == null ? onmouseover != null : !ONMOUSEOVER_EDEFAULT.equals(onmouseover);
			case DocbookPackage.TH_TYPE__ONMOUSEUP:
				return ONMOUSEUP_EDEFAULT == null ? onmouseup != null : !ONMOUSEUP_EDEFAULT.equals(onmouseup);
			case DocbookPackage.TH_TYPE__OS:
				return OS_EDEFAULT == null ? os != null : !OS_EDEFAULT.equals(os);
			case DocbookPackage.TH_TYPE__REMAP:
				return REMAP_EDEFAULT == null ? remap != null : !REMAP_EDEFAULT.equals(remap);
			case DocbookPackage.TH_TYPE__REVISION:
				return REVISION_EDEFAULT == null ? revision != null : !REVISION_EDEFAULT.equals(revision);
			case DocbookPackage.TH_TYPE__REVISIONFLAG:
				return isSetRevisionflag();
			case DocbookPackage.TH_TYPE__ROWSPAN:
				return ROWSPAN_EDEFAULT == null ? rowspan != null : !ROWSPAN_EDEFAULT.equals(rowspan);
			case DocbookPackage.TH_TYPE__SCOPE:
				return isSetScope();
			case DocbookPackage.TH_TYPE__SECURITY:
				return SECURITY_EDEFAULT == null ? security != null : !SECURITY_EDEFAULT.equals(security);
			case DocbookPackage.TH_TYPE__STYLE:
				return STYLE_EDEFAULT == null ? style != null : !STYLE_EDEFAULT.equals(style);
			case DocbookPackage.TH_TYPE__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case DocbookPackage.TH_TYPE__USERLEVEL:
				return USERLEVEL_EDEFAULT == null ? userlevel != null : !USERLEVEL_EDEFAULT.equals(userlevel);
			case DocbookPackage.TH_TYPE__VALIGN:
				return isSetValign();
			case DocbookPackage.TH_TYPE__VENDOR:
				return VENDOR_EDEFAULT == null ? vendor != null : !VENDOR_EDEFAULT.equals(vendor);
			case DocbookPackage.TH_TYPE__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
			case DocbookPackage.TH_TYPE__WORDSIZE:
				return WORDSIZE_EDEFAULT == null ? wordsize != null : !WORDSIZE_EDEFAULT.equals(wordsize);
			case DocbookPackage.TH_TYPE__XREFLABEL:
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
		result.append(", abbr: ");
		result.append(abbr);
		result.append(", align: ");
		if (alignESet) result.append(align); else result.append("<unset>");
		result.append(", annotations: ");
		result.append(annotations);
		result.append(", arch: ");
		result.append(arch);
		result.append(", audience: ");
		result.append(audience);
		result.append(", axis: ");
		result.append(axis);
		result.append(", base: ");
		result.append(base);
		result.append(", char: ");
		result.append(char_);
		result.append(", charoff: ");
		result.append(charoff);
		result.append(", class: ");
		result.append(class_);
		result.append(", colspan: ");
		result.append(colspan);
		result.append(", condition: ");
		result.append(condition);
		result.append(", conformance: ");
		result.append(conformance);
		result.append(", dir: ");
		if (dirESet) result.append(dir); else result.append("<unset>");
		result.append(", headers: ");
		result.append(headers);
		result.append(", id: ");
		result.append(id);
		result.append(", lang: ");
		result.append(lang);
		result.append(", lang1: ");
		result.append(lang1);
		result.append(", onclick: ");
		result.append(onclick);
		result.append(", ondblclick: ");
		result.append(ondblclick);
		result.append(", onkeydown: ");
		result.append(onkeydown);
		result.append(", onkeypress: ");
		result.append(onkeypress);
		result.append(", onkeyup: ");
		result.append(onkeyup);
		result.append(", onmousedown: ");
		result.append(onmousedown);
		result.append(", onmousemove: ");
		result.append(onmousemove);
		result.append(", onmouseout: ");
		result.append(onmouseout);
		result.append(", onmouseover: ");
		result.append(onmouseover);
		result.append(", onmouseup: ");
		result.append(onmouseup);
		result.append(", os: ");
		result.append(os);
		result.append(", remap: ");
		result.append(remap);
		result.append(", revision: ");
		result.append(revision);
		result.append(", revisionflag: ");
		if (revisionflagESet) result.append(revisionflag); else result.append("<unset>");
		result.append(", rowspan: ");
		result.append(rowspan);
		result.append(", scope: ");
		if (scopeESet) result.append(scope); else result.append("<unset>");
		result.append(", security: ");
		result.append(security);
		result.append(", style: ");
		result.append(style);
		result.append(", title: ");
		result.append(title);
		result.append(", userlevel: ");
		result.append(userlevel);
		result.append(", valign: ");
		if (valignESet) result.append(valign); else result.append("<unset>");
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

} //ThTypeImpl
