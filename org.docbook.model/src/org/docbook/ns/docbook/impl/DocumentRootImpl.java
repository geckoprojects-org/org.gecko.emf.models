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

import org.docbook.ns.docbook.AbbrevType;
import org.docbook.ns.docbook.AbstractType;
import org.docbook.ns.docbook.AccelType;
import org.docbook.ns.docbook.AcknowledgementsType;
import org.docbook.ns.docbook.AcronymType;
import org.docbook.ns.docbook.AddressType;
import org.docbook.ns.docbook.AffiliationType;
import org.docbook.ns.docbook.AltType;
import org.docbook.ns.docbook.AnchorType;
import org.docbook.ns.docbook.AnnotationType;
import org.docbook.ns.docbook.AnswerType;
import org.docbook.ns.docbook.AppendixType;
import org.docbook.ns.docbook.ApplicationType;
import org.docbook.ns.docbook.ArcType;
import org.docbook.ns.docbook.AreaType;
import org.docbook.ns.docbook.AreasetType;
import org.docbook.ns.docbook.AreaspecType;
import org.docbook.ns.docbook.ArgType;
import org.docbook.ns.docbook.ArticleType;
import org.docbook.ns.docbook.ArtpagenumsType;
import org.docbook.ns.docbook.AttributionType;
import org.docbook.ns.docbook.AudiodataType;
import org.docbook.ns.docbook.AudioobjectType;
import org.docbook.ns.docbook.AuthorType;
import org.docbook.ns.docbook.AuthorgroupType;
import org.docbook.ns.docbook.AuthorinitialsType;
import org.docbook.ns.docbook.BibliocoverageType;
import org.docbook.ns.docbook.BibliodivType;
import org.docbook.ns.docbook.BiblioentryType;
import org.docbook.ns.docbook.BibliographyType;
import org.docbook.ns.docbook.BiblioidType;
import org.docbook.ns.docbook.BibliolistType;
import org.docbook.ns.docbook.BibliomiscType;
import org.docbook.ns.docbook.BibliomixedType;
import org.docbook.ns.docbook.BibliomsetType;
import org.docbook.ns.docbook.BibliorefType;
import org.docbook.ns.docbook.BibliorelationType;
import org.docbook.ns.docbook.BibliosetType;
import org.docbook.ns.docbook.BibliosourceType;
import org.docbook.ns.docbook.BlockquoteType;
import org.docbook.ns.docbook.BookType;
import org.docbook.ns.docbook.BridgeheadType;
import org.docbook.ns.docbook.CalloutType;
import org.docbook.ns.docbook.CalloutlistType;
import org.docbook.ns.docbook.CaptionType;
import org.docbook.ns.docbook.CautionType;
import org.docbook.ns.docbook.ChapterType;
import org.docbook.ns.docbook.CitationType;
import org.docbook.ns.docbook.CitebiblioidType;
import org.docbook.ns.docbook.CiterefentryType;
import org.docbook.ns.docbook.CitetitleType;
import org.docbook.ns.docbook.CityType;
import org.docbook.ns.docbook.ClassnameType;
import org.docbook.ns.docbook.ClasssynopsisType;
import org.docbook.ns.docbook.ClasssynopsisinfoType;
import org.docbook.ns.docbook.CmdsynopsisType;
import org.docbook.ns.docbook.CoType;
import org.docbook.ns.docbook.CodeType;
import org.docbook.ns.docbook.ColType;
import org.docbook.ns.docbook.ColgroupType;
import org.docbook.ns.docbook.CollabType;
import org.docbook.ns.docbook.ColophonType;
import org.docbook.ns.docbook.ColspecType;
import org.docbook.ns.docbook.CommandType;
import org.docbook.ns.docbook.ComputeroutputType;
import org.docbook.ns.docbook.ConfdatesType;
import org.docbook.ns.docbook.ConfgroupType;
import org.docbook.ns.docbook.ConfnumType;
import org.docbook.ns.docbook.ConfsponsorType;
import org.docbook.ns.docbook.ConftitleType;
import org.docbook.ns.docbook.ConstantType;
import org.docbook.ns.docbook.ConstraintType;
import org.docbook.ns.docbook.ConstraintdefType;
import org.docbook.ns.docbook.ConstructorsynopsisType;
import org.docbook.ns.docbook.ContractnumType;
import org.docbook.ns.docbook.ContractsponsorType;
import org.docbook.ns.docbook.ContribType;
import org.docbook.ns.docbook.CopyrightType;
import org.docbook.ns.docbook.CorefType;
import org.docbook.ns.docbook.CountryType;
import org.docbook.ns.docbook.CoverType;
import org.docbook.ns.docbook.DatabaseType;
import org.docbook.ns.docbook.DateType;
import org.docbook.ns.docbook.DedicationType;
import org.docbook.ns.docbook.DestructorsynopsisType;
import org.docbook.ns.docbook.DocbookPackage;
import org.docbook.ns.docbook.DocumentRoot;
import org.docbook.ns.docbook.EditionType;
import org.docbook.ns.docbook.EditorType;
import org.docbook.ns.docbook.EmailType;
import org.docbook.ns.docbook.EmphasisType;
import org.docbook.ns.docbook.EntryType;
import org.docbook.ns.docbook.EntrytblType;
import org.docbook.ns.docbook.EnvarType;
import org.docbook.ns.docbook.EpigraphType;
import org.docbook.ns.docbook.EquationType;
import org.docbook.ns.docbook.ErrorcodeType;
import org.docbook.ns.docbook.ErrornameType;
import org.docbook.ns.docbook.ErrortextType;
import org.docbook.ns.docbook.ErrortypeType;
import org.docbook.ns.docbook.ExampleType;
import org.docbook.ns.docbook.ExceptionnameType;
import org.docbook.ns.docbook.ExtendedlinkType;
import org.docbook.ns.docbook.FaxType;
import org.docbook.ns.docbook.FieldsynopsisType;
import org.docbook.ns.docbook.FigureType;
import org.docbook.ns.docbook.FilenameType;
import org.docbook.ns.docbook.FirstnameType;
import org.docbook.ns.docbook.FirsttermType;
import org.docbook.ns.docbook.FootnoteType;
import org.docbook.ns.docbook.FootnoterefType;
import org.docbook.ns.docbook.ForeignphraseType;
import org.docbook.ns.docbook.FormalparaType;
import org.docbook.ns.docbook.FuncdefType;
import org.docbook.ns.docbook.FuncparamsType;
import org.docbook.ns.docbook.FuncprototypeType;
import org.docbook.ns.docbook.FuncsynopsisType;
import org.docbook.ns.docbook.FuncsynopsisinfoType;
import org.docbook.ns.docbook.FunctionType1;
import org.docbook.ns.docbook.GlossaryType;
import org.docbook.ns.docbook.GlossdefType;
import org.docbook.ns.docbook.GlossdivType;
import org.docbook.ns.docbook.GlossentryType;
import org.docbook.ns.docbook.GlosslistType;
import org.docbook.ns.docbook.GlossseeType;
import org.docbook.ns.docbook.GlossseealsoType;
import org.docbook.ns.docbook.GlosstermType;
import org.docbook.ns.docbook.GroupType;
import org.docbook.ns.docbook.GuibuttonType;
import org.docbook.ns.docbook.GuiiconType;
import org.docbook.ns.docbook.GuilabelType;
import org.docbook.ns.docbook.GuimenuType;
import org.docbook.ns.docbook.GuimenuitemType;
import org.docbook.ns.docbook.GuisubmenuType;
import org.docbook.ns.docbook.HardwareType;
import org.docbook.ns.docbook.HolderType;
import org.docbook.ns.docbook.HonorificType;
import org.docbook.ns.docbook.ImagedataType;
import org.docbook.ns.docbook.ImageobjectType;
import org.docbook.ns.docbook.ImageobjectcoType;
import org.docbook.ns.docbook.ImportantType;
import org.docbook.ns.docbook.IndexType;
import org.docbook.ns.docbook.IndexdivType;
import org.docbook.ns.docbook.IndexentryType;
import org.docbook.ns.docbook.IndextermType;
import org.docbook.ns.docbook.InfoType;
import org.docbook.ns.docbook.InformalequationType;
import org.docbook.ns.docbook.InformalexampleType;
import org.docbook.ns.docbook.InformalfigureType;
import org.docbook.ns.docbook.InformaltableType;
import org.docbook.ns.docbook.InitializerType;
import org.docbook.ns.docbook.InlineequationType;
import org.docbook.ns.docbook.InlinemediaobjectType;
import org.docbook.ns.docbook.InterfacenameType;
import org.docbook.ns.docbook.IssuenumType;
import org.docbook.ns.docbook.ItemizedlistType;
import org.docbook.ns.docbook.ItermsetType;
import org.docbook.ns.docbook.JobtitleType;
import org.docbook.ns.docbook.KeycapType;
import org.docbook.ns.docbook.KeycodeType;
import org.docbook.ns.docbook.KeycomboType;
import org.docbook.ns.docbook.KeysymType;
import org.docbook.ns.docbook.KeywordType;
import org.docbook.ns.docbook.KeywordsetType;
import org.docbook.ns.docbook.LabelType;
import org.docbook.ns.docbook.LegalnoticeType;
import org.docbook.ns.docbook.LhsType;
import org.docbook.ns.docbook.LineageType;
import org.docbook.ns.docbook.LineannotationType;
import org.docbook.ns.docbook.LinkType;
import org.docbook.ns.docbook.ListitemType;
import org.docbook.ns.docbook.LiteralType;
import org.docbook.ns.docbook.LiterallayoutType;
import org.docbook.ns.docbook.LocatorType;
import org.docbook.ns.docbook.ManvolnumType;
import org.docbook.ns.docbook.MarkupType;
import org.docbook.ns.docbook.MathphraseType;
import org.docbook.ns.docbook.MediaobjectType;
import org.docbook.ns.docbook.MemberType;
import org.docbook.ns.docbook.MenuchoiceType;
import org.docbook.ns.docbook.MethodnameType;
import org.docbook.ns.docbook.MethodparamType;
import org.docbook.ns.docbook.MethodsynopsisType;
import org.docbook.ns.docbook.ModifierType;
import org.docbook.ns.docbook.MousebuttonType;
import org.docbook.ns.docbook.MsgType;
import org.docbook.ns.docbook.MsgaudType;
import org.docbook.ns.docbook.MsgentryType;
import org.docbook.ns.docbook.MsgexplanType;
import org.docbook.ns.docbook.MsginfoType;
import org.docbook.ns.docbook.MsglevelType;
import org.docbook.ns.docbook.MsgmainType;
import org.docbook.ns.docbook.MsgorigType;
import org.docbook.ns.docbook.MsgrelType;
import org.docbook.ns.docbook.MsgsetType;
import org.docbook.ns.docbook.MsgsubType;
import org.docbook.ns.docbook.MsgtextType;
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
import org.docbook.ns.docbook.OrgdivType;
import org.docbook.ns.docbook.OrgnameType;
import org.docbook.ns.docbook.OtheraddrType;
import org.docbook.ns.docbook.OthercreditType;
import org.docbook.ns.docbook.OthernameType;
import org.docbook.ns.docbook.PackageType;
import org.docbook.ns.docbook.PagenumsType;
import org.docbook.ns.docbook.ParaType;
import org.docbook.ns.docbook.ParamdefType;
import org.docbook.ns.docbook.ParameterType;
import org.docbook.ns.docbook.PartType;
import org.docbook.ns.docbook.PartintroType;
import org.docbook.ns.docbook.PersonType;
import org.docbook.ns.docbook.PersonblurbType;
import org.docbook.ns.docbook.PersonnameType;
import org.docbook.ns.docbook.PhoneType;
import org.docbook.ns.docbook.PhraseType;
import org.docbook.ns.docbook.PobType;
import org.docbook.ns.docbook.PostcodeType;
import org.docbook.ns.docbook.PrefaceType;
import org.docbook.ns.docbook.PrimaryType;
import org.docbook.ns.docbook.PrimaryieType;
import org.docbook.ns.docbook.PrinthistoryType;
import org.docbook.ns.docbook.ProcedureType;
import org.docbook.ns.docbook.ProductionType;
import org.docbook.ns.docbook.ProductionrecapType;
import org.docbook.ns.docbook.ProductionsetType;
import org.docbook.ns.docbook.ProductnameType;
import org.docbook.ns.docbook.ProductnumberType;
import org.docbook.ns.docbook.ProgramlistingType;
import org.docbook.ns.docbook.ProgramlistingcoType;
import org.docbook.ns.docbook.PromptType;
import org.docbook.ns.docbook.PropertyType;
import org.docbook.ns.docbook.PubdateType;
import org.docbook.ns.docbook.PublisherType;
import org.docbook.ns.docbook.PublishernameType;
import org.docbook.ns.docbook.QandadivType;
import org.docbook.ns.docbook.QandaentryType;
import org.docbook.ns.docbook.QandasetType;
import org.docbook.ns.docbook.QuestionType;
import org.docbook.ns.docbook.QuoteType;
import org.docbook.ns.docbook.RefclassType;
import org.docbook.ns.docbook.RefdescriptorType;
import org.docbook.ns.docbook.RefentryType;
import org.docbook.ns.docbook.RefentrytitleType;
import org.docbook.ns.docbook.ReferenceType;
import org.docbook.ns.docbook.RefmetaType;
import org.docbook.ns.docbook.RefmiscinfoType;
import org.docbook.ns.docbook.RefnameType;
import org.docbook.ns.docbook.RefnamedivType;
import org.docbook.ns.docbook.RefpurposeType;
import org.docbook.ns.docbook.Refsect1Type;
import org.docbook.ns.docbook.Refsect2Type;
import org.docbook.ns.docbook.Refsect3Type;
import org.docbook.ns.docbook.RefsectionType;
import org.docbook.ns.docbook.RefsynopsisdivType;
import org.docbook.ns.docbook.ReleaseinfoType;
import org.docbook.ns.docbook.RemarkType;
import org.docbook.ns.docbook.ReplaceableType;
import org.docbook.ns.docbook.ReturnvalueType;
import org.docbook.ns.docbook.RevdescriptionType;
import org.docbook.ns.docbook.RevhistoryType;
import org.docbook.ns.docbook.RevisionType;
import org.docbook.ns.docbook.RevnumberType;
import org.docbook.ns.docbook.RevremarkType;
import org.docbook.ns.docbook.RhsType;
import org.docbook.ns.docbook.RowType;
import org.docbook.ns.docbook.SbrType;
import org.docbook.ns.docbook.ScreenType;
import org.docbook.ns.docbook.ScreencoType;
import org.docbook.ns.docbook.ScreenshotType;
import org.docbook.ns.docbook.SecondaryType;
import org.docbook.ns.docbook.SecondaryieType;
import org.docbook.ns.docbook.Sect1Type;
import org.docbook.ns.docbook.Sect2Type;
import org.docbook.ns.docbook.Sect3Type;
import org.docbook.ns.docbook.Sect4Type;
import org.docbook.ns.docbook.Sect5Type;
import org.docbook.ns.docbook.SectionType;
import org.docbook.ns.docbook.SeeType;
import org.docbook.ns.docbook.SeealsoType;
import org.docbook.ns.docbook.SeealsoieType;
import org.docbook.ns.docbook.SeeieType;
import org.docbook.ns.docbook.SegType;
import org.docbook.ns.docbook.SeglistitemType;
import org.docbook.ns.docbook.SegmentedlistType;
import org.docbook.ns.docbook.SegtitleType;
import org.docbook.ns.docbook.SeriesvolnumsType;
import org.docbook.ns.docbook.SetType;
import org.docbook.ns.docbook.SetindexType;
import org.docbook.ns.docbook.ShortaffilType;
import org.docbook.ns.docbook.ShortcutType;
import org.docbook.ns.docbook.SidebarType;
import org.docbook.ns.docbook.SimparaType;
import org.docbook.ns.docbook.SimplelistType;
import org.docbook.ns.docbook.SimplemsgentryType;
import org.docbook.ns.docbook.SimplesectType;
import org.docbook.ns.docbook.SpanspecType;
import org.docbook.ns.docbook.StateType;
import org.docbook.ns.docbook.StepType;
import org.docbook.ns.docbook.StepalternativesType;
import org.docbook.ns.docbook.StreetType;
import org.docbook.ns.docbook.SubjectType;
import org.docbook.ns.docbook.SubjectsetType;
import org.docbook.ns.docbook.SubjecttermType;
import org.docbook.ns.docbook.SubscriptType;
import org.docbook.ns.docbook.SubstepsType;
import org.docbook.ns.docbook.SubtitleType;
import org.docbook.ns.docbook.SuperscriptType;
import org.docbook.ns.docbook.SurnameType;
import org.docbook.ns.docbook.SymbolType;
import org.docbook.ns.docbook.SynopfragmentType;
import org.docbook.ns.docbook.SynopfragmentrefType;
import org.docbook.ns.docbook.SynopsisType;
import org.docbook.ns.docbook.SystemitemType;
import org.docbook.ns.docbook.TableType;
import org.docbook.ns.docbook.TagType;
import org.docbook.ns.docbook.TaskType;
import org.docbook.ns.docbook.TaskprerequisitesType;
import org.docbook.ns.docbook.TaskrelatedType;
import org.docbook.ns.docbook.TasksummaryType;
import org.docbook.ns.docbook.TbodyType;
import org.docbook.ns.docbook.TdType;
import org.docbook.ns.docbook.TermType;
import org.docbook.ns.docbook.TermdefType;
import org.docbook.ns.docbook.TertiaryType;
import org.docbook.ns.docbook.TertiaryieType;
import org.docbook.ns.docbook.TextdataType;
import org.docbook.ns.docbook.TextobjectType;
import org.docbook.ns.docbook.TfootType;
import org.docbook.ns.docbook.TgroupType;
import org.docbook.ns.docbook.ThType;
import org.docbook.ns.docbook.TheadType;
import org.docbook.ns.docbook.TipType;
import org.docbook.ns.docbook.TitleType;
import org.docbook.ns.docbook.TitleabbrevType;
import org.docbook.ns.docbook.TocType;
import org.docbook.ns.docbook.TocdivType;
import org.docbook.ns.docbook.TocentryType;
import org.docbook.ns.docbook.TokenType;
import org.docbook.ns.docbook.TrType;
import org.docbook.ns.docbook.TrademarkType;
import org.docbook.ns.docbook.TypeType2;
import org.docbook.ns.docbook.UriType;
import org.docbook.ns.docbook.UserinputType;
import org.docbook.ns.docbook.VarargsType;
import org.docbook.ns.docbook.VariablelistType;
import org.docbook.ns.docbook.VarlistentryType;
import org.docbook.ns.docbook.VarnameType;
import org.docbook.ns.docbook.VideodataType;
import org.docbook.ns.docbook.VideoobjectType;
import org.docbook.ns.docbook.VoidType;
import org.docbook.ns.docbook.VolumenumType;
import org.docbook.ns.docbook.WarningType;
import org.docbook.ns.docbook.WordaswordType;
import org.docbook.ns.docbook.XrefType;
import org.docbook.ns.docbook.YearType;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EStringToStringMapEntryImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getAbbrev <em>Abbrev</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getAbstract <em>Abstract</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getAccel <em>Accel</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getAcknowledgements <em>Acknowledgements</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getAcronym <em>Acronym</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getAddress <em>Address</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getAffiliation <em>Affiliation</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getAlt <em>Alt</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getAnchor <em>Anchor</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getAnswer <em>Answer</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getAppendix <em>Appendix</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getApplication <em>Application</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getArc <em>Arc</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getArea <em>Area</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getAreaset <em>Areaset</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getAreaspec <em>Areaspec</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getArg <em>Arg</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getArticle <em>Article</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getArtpagenums <em>Artpagenums</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getAttribution <em>Attribution</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getAudiodata <em>Audiodata</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getAudioobject <em>Audioobject</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getAuthor <em>Author</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getAuthorgroup <em>Authorgroup</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getAuthorinitials <em>Authorinitials</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getBibliocoverage <em>Bibliocoverage</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getBibliodiv <em>Bibliodiv</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getBiblioentry <em>Biblioentry</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getBibliography <em>Bibliography</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getBiblioid <em>Biblioid</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getBibliolist <em>Bibliolist</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getBibliomisc <em>Bibliomisc</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getBibliomixed <em>Bibliomixed</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getBibliomset <em>Bibliomset</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getBiblioref <em>Biblioref</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getBibliorelation <em>Bibliorelation</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getBiblioset <em>Biblioset</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getBibliosource <em>Bibliosource</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getBlockquote <em>Blockquote</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getBook <em>Book</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getBridgehead <em>Bridgehead</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getCallout <em>Callout</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getCalloutlist <em>Calloutlist</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getCaption <em>Caption</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getCaution <em>Caution</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getChapter <em>Chapter</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getCitation <em>Citation</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getCitebiblioid <em>Citebiblioid</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getCiterefentry <em>Citerefentry</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getCitetitle <em>Citetitle</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getCity <em>City</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getClassname <em>Classname</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getClasssynopsis <em>Classsynopsis</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getClasssynopsisinfo <em>Classsynopsisinfo</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getCmdsynopsis <em>Cmdsynopsis</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getCo <em>Co</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getCol <em>Col</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getColgroup <em>Colgroup</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getCollab <em>Collab</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getColophon <em>Colophon</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getColspec <em>Colspec</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getCommand <em>Command</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getComputeroutput <em>Computeroutput</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getConfdates <em>Confdates</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getConfgroup <em>Confgroup</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getConfnum <em>Confnum</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getConfsponsor <em>Confsponsor</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getConftitle <em>Conftitle</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getConstant <em>Constant</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getConstraint <em>Constraint</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getConstraintdef <em>Constraintdef</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getConstructorsynopsis <em>Constructorsynopsis</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getContractnum <em>Contractnum</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getContractsponsor <em>Contractsponsor</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getContrib <em>Contrib</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getCopyright <em>Copyright</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getCoref <em>Coref</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getCountry <em>Country</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getCover <em>Cover</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getDatabase <em>Database</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getDate <em>Date</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getDedication <em>Dedication</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getDestructorsynopsis <em>Destructorsynopsis</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getEdition <em>Edition</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getEditor <em>Editor</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getEmail <em>Email</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getEmphasis <em>Emphasis</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getEntry <em>Entry</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getEntrytbl <em>Entrytbl</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getEnvar <em>Envar</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getEpigraph <em>Epigraph</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getEquation <em>Equation</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getErrorcode <em>Errorcode</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getErrorname <em>Errorname</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getErrortext <em>Errortext</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getErrortype <em>Errortype</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getExample <em>Example</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getExceptionname <em>Exceptionname</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getExtendedlink <em>Extendedlink</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getFax <em>Fax</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getFieldsynopsis <em>Fieldsynopsis</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getFigure <em>Figure</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getFilename <em>Filename</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getFirstname <em>Firstname</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getFirstterm <em>Firstterm</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getFootnote <em>Footnote</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getFootnoteref <em>Footnoteref</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getForeignphrase <em>Foreignphrase</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getFormalpara <em>Formalpara</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getFuncdef <em>Funcdef</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getFuncparams <em>Funcparams</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getFuncprototype <em>Funcprototype</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getFuncsynopsis <em>Funcsynopsis</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getFuncsynopsisinfo <em>Funcsynopsisinfo</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getFunction <em>Function</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getGlossary <em>Glossary</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getGlossdef <em>Glossdef</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getGlossdiv <em>Glossdiv</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getGlossentry <em>Glossentry</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getGlosslist <em>Glosslist</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getGlosssee <em>Glosssee</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getGlossseealso <em>Glossseealso</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getGlossterm <em>Glossterm</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getGuibutton <em>Guibutton</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getGuiicon <em>Guiicon</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getGuilabel <em>Guilabel</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getGuimenu <em>Guimenu</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getGuimenuitem <em>Guimenuitem</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getGuisubmenu <em>Guisubmenu</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getHardware <em>Hardware</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getHolder <em>Holder</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getHonorific <em>Honorific</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getImagedata <em>Imagedata</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getImageobject <em>Imageobject</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getImageobjectco <em>Imageobjectco</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getImportant <em>Important</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getIndex <em>Index</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getIndexdiv <em>Indexdiv</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getIndexentry <em>Indexentry</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getIndexterm <em>Indexterm</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getInfo <em>Info</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getInformalequation <em>Informalequation</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getInformalexample <em>Informalexample</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getInformalfigure <em>Informalfigure</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getInformaltable <em>Informaltable</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getInitializer <em>Initializer</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getInlineequation <em>Inlineequation</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getInlinemediaobject <em>Inlinemediaobject</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getInterfacename <em>Interfacename</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getIssuenum <em>Issuenum</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getItemizedlist <em>Itemizedlist</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getItermset <em>Itermset</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getJobtitle <em>Jobtitle</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getKeycap <em>Keycap</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getKeycode <em>Keycode</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getKeycombo <em>Keycombo</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getKeysym <em>Keysym</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getKeyword <em>Keyword</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getKeywordset <em>Keywordset</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getLegalnotice <em>Legalnotice</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getLhs <em>Lhs</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getLineage <em>Lineage</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getLineannotation <em>Lineannotation</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getLink <em>Link</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getListitem <em>Listitem</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getLiteral <em>Literal</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getLiterallayout <em>Literallayout</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getLocator <em>Locator</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getManvolnum <em>Manvolnum</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getMarkup <em>Markup</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getMathphrase <em>Mathphrase</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getMediaobject <em>Mediaobject</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getMember <em>Member</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getMenuchoice <em>Menuchoice</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getMethodname <em>Methodname</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getMethodparam <em>Methodparam</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getMethodsynopsis <em>Methodsynopsis</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getModifier <em>Modifier</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getMousebutton <em>Mousebutton</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getMsg <em>Msg</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getMsgaud <em>Msgaud</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getMsgentry <em>Msgentry</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getMsgexplan <em>Msgexplan</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getMsginfo <em>Msginfo</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getMsglevel <em>Msglevel</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getMsgmain <em>Msgmain</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getMsgorig <em>Msgorig</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getMsgrel <em>Msgrel</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getMsgset <em>Msgset</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getMsgsub <em>Msgsub</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getMsgtext <em>Msgtext</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getNonterminal <em>Nonterminal</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getNote <em>Note</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getOlink <em>Olink</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getOoclass <em>Ooclass</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getOoexception <em>Ooexception</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getOointerface <em>Oointerface</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getOption <em>Option</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getOptional <em>Optional</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getOrderedlist <em>Orderedlist</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getOrg <em>Org</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getOrgdiv <em>Orgdiv</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getOrgname <em>Orgname</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getOtheraddr <em>Otheraddr</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getOthercredit <em>Othercredit</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getOthername <em>Othername</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getPackage <em>Package</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getPagenums <em>Pagenums</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getPara <em>Para</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getParamdef <em>Paramdef</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getParameter <em>Parameter</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getPart <em>Part</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getPartintro <em>Partintro</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getPerson <em>Person</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getPersonblurb <em>Personblurb</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getPersonname <em>Personname</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getPhone <em>Phone</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getPhrase <em>Phrase</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getPob <em>Pob</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getPostcode <em>Postcode</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getPreface <em>Preface</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getPrimary <em>Primary</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getPrimaryie <em>Primaryie</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getPrinthistory <em>Printhistory</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getProcedure <em>Procedure</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getProduction <em>Production</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getProductionrecap <em>Productionrecap</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getProductionset <em>Productionset</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getProductname <em>Productname</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getProductnumber <em>Productnumber</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getProgramlisting <em>Programlisting</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getProgramlistingco <em>Programlistingco</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getPrompt <em>Prompt</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getProperty <em>Property</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getPubdate <em>Pubdate</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getPublisher <em>Publisher</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getPublishername <em>Publishername</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getQandadiv <em>Qandadiv</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getQandaentry <em>Qandaentry</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getQandaset <em>Qandaset</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getQuestion <em>Question</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getQuote <em>Quote</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getRefclass <em>Refclass</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getRefdescriptor <em>Refdescriptor</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getRefentry <em>Refentry</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getRefentrytitle <em>Refentrytitle</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getReference <em>Reference</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getRefmeta <em>Refmeta</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getRefmiscinfo <em>Refmiscinfo</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getRefname <em>Refname</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getRefnamediv <em>Refnamediv</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getRefpurpose <em>Refpurpose</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getRefsect1 <em>Refsect1</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getRefsect2 <em>Refsect2</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getRefsect3 <em>Refsect3</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getRefsection <em>Refsection</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getRefsynopsisdiv <em>Refsynopsisdiv</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getReleaseinfo <em>Releaseinfo</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getRemark <em>Remark</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getReplaceable <em>Replaceable</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getReturnvalue <em>Returnvalue</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getRevdescription <em>Revdescription</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getRevhistory <em>Revhistory</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getRevision <em>Revision</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getRevnumber <em>Revnumber</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getRevremark <em>Revremark</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getRhs <em>Rhs</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getRow <em>Row</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getSbr <em>Sbr</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getScreen <em>Screen</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getScreenco <em>Screenco</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getScreenshot <em>Screenshot</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getSecondary <em>Secondary</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getSecondaryie <em>Secondaryie</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getSect1 <em>Sect1</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getSect2 <em>Sect2</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getSect3 <em>Sect3</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getSect4 <em>Sect4</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getSect5 <em>Sect5</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getSection <em>Section</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getSee <em>See</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getSeealso <em>Seealso</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getSeealsoie <em>Seealsoie</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getSeeie <em>Seeie</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getSeg <em>Seg</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getSeglistitem <em>Seglistitem</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getSegmentedlist <em>Segmentedlist</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getSegtitle <em>Segtitle</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getSeriesvolnums <em>Seriesvolnums</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getSet <em>Set</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getSetindex <em>Setindex</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getShortaffil <em>Shortaffil</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getShortcut <em>Shortcut</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getSidebar <em>Sidebar</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getSimpara <em>Simpara</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getSimplelist <em>Simplelist</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getSimplemsgentry <em>Simplemsgentry</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getSimplesect <em>Simplesect</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getSpanspec <em>Spanspec</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getState <em>State</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getStep <em>Step</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getStepalternatives <em>Stepalternatives</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getStreet <em>Street</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getSubjectset <em>Subjectset</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getSubjectterm <em>Subjectterm</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getSubscript <em>Subscript</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getSubsteps <em>Substeps</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getSubtitle <em>Subtitle</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getSuperscript <em>Superscript</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getSurname <em>Surname</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getSymbol <em>Symbol</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getSynopfragment <em>Synopfragment</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getSynopfragmentref <em>Synopfragmentref</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getSynopsis <em>Synopsis</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getSystemitem <em>Systemitem</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getTable <em>Table</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getTag <em>Tag</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getTask <em>Task</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getTaskprerequisites <em>Taskprerequisites</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getTaskrelated <em>Taskrelated</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getTasksummary <em>Tasksummary</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getTbody <em>Tbody</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getTd <em>Td</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getTerm <em>Term</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getTermdef <em>Termdef</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getTertiary <em>Tertiary</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getTertiaryie <em>Tertiaryie</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getTextdata <em>Textdata</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getTextobject <em>Textobject</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getTfoot <em>Tfoot</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getTgroup <em>Tgroup</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getTh <em>Th</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getThead <em>Thead</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getTip <em>Tip</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getTitleabbrev <em>Titleabbrev</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getToc <em>Toc</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getTocdiv <em>Tocdiv</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getTocentry <em>Tocentry</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getToken <em>Token</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getTr <em>Tr</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getTrademark <em>Trademark</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getUri <em>Uri</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getUserinput <em>Userinput</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getVarargs <em>Varargs</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getVariablelist <em>Variablelist</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getVarlistentry <em>Varlistentry</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getVarname <em>Varname</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getVideodata <em>Videodata</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getVideoobject <em>Videoobject</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getVoid <em>Void</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getVolumenum <em>Volumenum</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getWarning <em>Warning</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getWordasword <em>Wordasword</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getXref <em>Xref</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.impl.DocumentRootImpl#getYear <em>Year</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DocumentRootImpl extends MinimalEObjectImpl.Container implements DocumentRoot {
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
	 * The cached value of the '{@link #getXMLNSPrefixMap() <em>XMLNS Prefix Map</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXMLNSPrefixMap()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xMLNSPrefixMap;

	/**
	 * The cached value of the '{@link #getXSISchemaLocation() <em>XSI Schema Location</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXSISchemaLocation()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xSISchemaLocation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentRootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DocbookPackage.eINSTANCE.getDocumentRoot();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, DocbookPackage.DOCUMENT_ROOT__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EMap<String, String> getXMLNSPrefixMap() {
		if (xMLNSPrefixMap == null) {
			xMLNSPrefixMap = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, DocbookPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		}
		return xMLNSPrefixMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EMap<String, String> getXSISchemaLocation() {
		if (xSISchemaLocation == null) {
			xSISchemaLocation = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, DocbookPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		}
		return xSISchemaLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbbrevType getAbbrev() {
		return (AbbrevType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Abbrev(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbbrev(AbbrevType newAbbrev, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Abbrev(), newAbbrev, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAbbrev(AbbrevType newAbbrev) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Abbrev(), newAbbrev);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractType getAbstract() {
		return (AbstractType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Abstract(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbstract(AbstractType newAbstract, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Abstract(), newAbstract, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAbstract(AbstractType newAbstract) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Abstract(), newAbstract);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AccelType getAccel() {
		return (AccelType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Accel(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAccel(AccelType newAccel, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Accel(), newAccel, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAccel(AccelType newAccel) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Accel(), newAccel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AcknowledgementsType getAcknowledgements() {
		return (AcknowledgementsType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Acknowledgements(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAcknowledgements(AcknowledgementsType newAcknowledgements, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Acknowledgements(), newAcknowledgements, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAcknowledgements(AcknowledgementsType newAcknowledgements) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Acknowledgements(), newAcknowledgements);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AcronymType getAcronym() {
		return (AcronymType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Acronym(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAcronym(AcronymType newAcronym, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Acronym(), newAcronym, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAcronym(AcronymType newAcronym) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Acronym(), newAcronym);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AddressType getAddress() {
		return (AddressType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Address(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAddress(AddressType newAddress, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Address(), newAddress, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAddress(AddressType newAddress) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Address(), newAddress);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AffiliationType getAffiliation() {
		return (AffiliationType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Affiliation(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAffiliation(AffiliationType newAffiliation, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Affiliation(), newAffiliation, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAffiliation(AffiliationType newAffiliation) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Affiliation(), newAffiliation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AltType getAlt() {
		return (AltType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Alt(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAlt(AltType newAlt, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Alt(), newAlt, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAlt(AltType newAlt) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Alt(), newAlt);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnchorType getAnchor() {
		return (AnchorType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Anchor(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnchor(AnchorType newAnchor, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Anchor(), newAnchor, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAnchor(AnchorType newAnchor) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Anchor(), newAnchor);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnnotationType getAnnotation() {
		return (AnnotationType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Annotation(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnnotation(AnnotationType newAnnotation, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Annotation(), newAnnotation, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAnnotation(AnnotationType newAnnotation) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Annotation(), newAnnotation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnswerType getAnswer() {
		return (AnswerType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Answer(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnswer(AnswerType newAnswer, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Answer(), newAnswer, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAnswer(AnswerType newAnswer) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Answer(), newAnswer);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AppendixType getAppendix() {
		return (AppendixType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Appendix(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAppendix(AppendixType newAppendix, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Appendix(), newAppendix, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAppendix(AppendixType newAppendix) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Appendix(), newAppendix);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ApplicationType getApplication() {
		return (ApplicationType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Application(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetApplication(ApplicationType newApplication, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Application(), newApplication, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setApplication(ApplicationType newApplication) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Application(), newApplication);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArcType getArc() {
		return (ArcType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Arc(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetArc(ArcType newArc, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Arc(), newArc, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setArc(ArcType newArc) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Arc(), newArc);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AreaType getArea() {
		return (AreaType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Area(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetArea(AreaType newArea, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Area(), newArea, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setArea(AreaType newArea) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Area(), newArea);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AreasetType getAreaset() {
		return (AreasetType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Areaset(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAreaset(AreasetType newAreaset, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Areaset(), newAreaset, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAreaset(AreasetType newAreaset) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Areaset(), newAreaset);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AreaspecType getAreaspec() {
		return (AreaspecType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Areaspec(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAreaspec(AreaspecType newAreaspec, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Areaspec(), newAreaspec, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAreaspec(AreaspecType newAreaspec) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Areaspec(), newAreaspec);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArgType getArg() {
		return (ArgType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Arg(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetArg(ArgType newArg, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Arg(), newArg, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setArg(ArgType newArg) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Arg(), newArg);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArticleType getArticle() {
		return (ArticleType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Article(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetArticle(ArticleType newArticle, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Article(), newArticle, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setArticle(ArticleType newArticle) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Article(), newArticle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArtpagenumsType getArtpagenums() {
		return (ArtpagenumsType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Artpagenums(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetArtpagenums(ArtpagenumsType newArtpagenums, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Artpagenums(), newArtpagenums, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setArtpagenums(ArtpagenumsType newArtpagenums) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Artpagenums(), newArtpagenums);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AttributionType getAttribution() {
		return (AttributionType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Attribution(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAttribution(AttributionType newAttribution, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Attribution(), newAttribution, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAttribution(AttributionType newAttribution) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Attribution(), newAttribution);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AudiodataType getAudiodata() {
		return (AudiodataType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Audiodata(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAudiodata(AudiodataType newAudiodata, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Audiodata(), newAudiodata, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAudiodata(AudiodataType newAudiodata) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Audiodata(), newAudiodata);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AudioobjectType getAudioobject() {
		return (AudioobjectType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Audioobject(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAudioobject(AudioobjectType newAudioobject, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Audioobject(), newAudioobject, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAudioobject(AudioobjectType newAudioobject) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Audioobject(), newAudioobject);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AuthorType getAuthor() {
		return (AuthorType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Author(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAuthor(AuthorType newAuthor, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Author(), newAuthor, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAuthor(AuthorType newAuthor) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Author(), newAuthor);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AuthorgroupType getAuthorgroup() {
		return (AuthorgroupType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Authorgroup(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAuthorgroup(AuthorgroupType newAuthorgroup, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Authorgroup(), newAuthorgroup, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAuthorgroup(AuthorgroupType newAuthorgroup) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Authorgroup(), newAuthorgroup);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AuthorinitialsType getAuthorinitials() {
		return (AuthorinitialsType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Authorinitials(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAuthorinitials(AuthorinitialsType newAuthorinitials, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Authorinitials(), newAuthorinitials, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAuthorinitials(AuthorinitialsType newAuthorinitials) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Authorinitials(), newAuthorinitials);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BibliocoverageType getBibliocoverage() {
		return (BibliocoverageType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Bibliocoverage(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBibliocoverage(BibliocoverageType newBibliocoverage, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Bibliocoverage(), newBibliocoverage, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBibliocoverage(BibliocoverageType newBibliocoverage) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Bibliocoverage(), newBibliocoverage);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BibliodivType getBibliodiv() {
		return (BibliodivType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Bibliodiv(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBibliodiv(BibliodivType newBibliodiv, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Bibliodiv(), newBibliodiv, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBibliodiv(BibliodivType newBibliodiv) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Bibliodiv(), newBibliodiv);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BiblioentryType getBiblioentry() {
		return (BiblioentryType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Biblioentry(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBiblioentry(BiblioentryType newBiblioentry, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Biblioentry(), newBiblioentry, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBiblioentry(BiblioentryType newBiblioentry) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Biblioentry(), newBiblioentry);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BibliographyType getBibliography() {
		return (BibliographyType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Bibliography(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBibliography(BibliographyType newBibliography, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Bibliography(), newBibliography, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBibliography(BibliographyType newBibliography) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Bibliography(), newBibliography);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BiblioidType getBiblioid() {
		return (BiblioidType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Biblioid(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBiblioid(BiblioidType newBiblioid, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Biblioid(), newBiblioid, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBiblioid(BiblioidType newBiblioid) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Biblioid(), newBiblioid);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BibliolistType getBibliolist() {
		return (BibliolistType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Bibliolist(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBibliolist(BibliolistType newBibliolist, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Bibliolist(), newBibliolist, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBibliolist(BibliolistType newBibliolist) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Bibliolist(), newBibliolist);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BibliomiscType getBibliomisc() {
		return (BibliomiscType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Bibliomisc(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBibliomisc(BibliomiscType newBibliomisc, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Bibliomisc(), newBibliomisc, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBibliomisc(BibliomiscType newBibliomisc) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Bibliomisc(), newBibliomisc);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BibliomixedType getBibliomixed() {
		return (BibliomixedType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Bibliomixed(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBibliomixed(BibliomixedType newBibliomixed, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Bibliomixed(), newBibliomixed, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBibliomixed(BibliomixedType newBibliomixed) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Bibliomixed(), newBibliomixed);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BibliomsetType getBibliomset() {
		return (BibliomsetType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Bibliomset(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBibliomset(BibliomsetType newBibliomset, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Bibliomset(), newBibliomset, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBibliomset(BibliomsetType newBibliomset) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Bibliomset(), newBibliomset);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BibliorefType getBiblioref() {
		return (BibliorefType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Biblioref(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBiblioref(BibliorefType newBiblioref, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Biblioref(), newBiblioref, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBiblioref(BibliorefType newBiblioref) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Biblioref(), newBiblioref);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BibliorelationType getBibliorelation() {
		return (BibliorelationType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Bibliorelation(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBibliorelation(BibliorelationType newBibliorelation, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Bibliorelation(), newBibliorelation, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBibliorelation(BibliorelationType newBibliorelation) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Bibliorelation(), newBibliorelation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BibliosetType getBiblioset() {
		return (BibliosetType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Biblioset(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBiblioset(BibliosetType newBiblioset, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Biblioset(), newBiblioset, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBiblioset(BibliosetType newBiblioset) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Biblioset(), newBiblioset);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BibliosourceType getBibliosource() {
		return (BibliosourceType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Bibliosource(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBibliosource(BibliosourceType newBibliosource, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Bibliosource(), newBibliosource, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBibliosource(BibliosourceType newBibliosource) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Bibliosource(), newBibliosource);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BlockquoteType getBlockquote() {
		return (BlockquoteType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Blockquote(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBlockquote(BlockquoteType newBlockquote, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Blockquote(), newBlockquote, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBlockquote(BlockquoteType newBlockquote) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Blockquote(), newBlockquote);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BookType getBook() {
		return (BookType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Book(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBook(BookType newBook, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Book(), newBook, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBook(BookType newBook) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Book(), newBook);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BridgeheadType getBridgehead() {
		return (BridgeheadType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Bridgehead(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBridgehead(BridgeheadType newBridgehead, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Bridgehead(), newBridgehead, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBridgehead(BridgeheadType newBridgehead) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Bridgehead(), newBridgehead);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CalloutType getCallout() {
		return (CalloutType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Callout(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCallout(CalloutType newCallout, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Callout(), newCallout, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCallout(CalloutType newCallout) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Callout(), newCallout);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CalloutlistType getCalloutlist() {
		return (CalloutlistType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Calloutlist(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCalloutlist(CalloutlistType newCalloutlist, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Calloutlist(), newCalloutlist, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCalloutlist(CalloutlistType newCalloutlist) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Calloutlist(), newCalloutlist);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CaptionType getCaption() {
		return (CaptionType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Caption(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCaption(CaptionType newCaption, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Caption(), newCaption, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCaption(CaptionType newCaption) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Caption(), newCaption);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CautionType getCaution() {
		return (CautionType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Caution(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCaution(CautionType newCaution, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Caution(), newCaution, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCaution(CautionType newCaution) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Caution(), newCaution);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ChapterType getChapter() {
		return (ChapterType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Chapter(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChapter(ChapterType newChapter, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Chapter(), newChapter, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setChapter(ChapterType newChapter) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Chapter(), newChapter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CitationType getCitation() {
		return (CitationType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Citation(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCitation(CitationType newCitation, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Citation(), newCitation, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCitation(CitationType newCitation) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Citation(), newCitation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CitebiblioidType getCitebiblioid() {
		return (CitebiblioidType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Citebiblioid(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCitebiblioid(CitebiblioidType newCitebiblioid, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Citebiblioid(), newCitebiblioid, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCitebiblioid(CitebiblioidType newCitebiblioid) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Citebiblioid(), newCitebiblioid);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CiterefentryType getCiterefentry() {
		return (CiterefentryType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Citerefentry(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCiterefentry(CiterefentryType newCiterefentry, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Citerefentry(), newCiterefentry, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCiterefentry(CiterefentryType newCiterefentry) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Citerefentry(), newCiterefentry);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CitetitleType getCitetitle() {
		return (CitetitleType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Citetitle(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCitetitle(CitetitleType newCitetitle, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Citetitle(), newCitetitle, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCitetitle(CitetitleType newCitetitle) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Citetitle(), newCitetitle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CityType getCity() {
		return (CityType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_City(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCity(CityType newCity, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_City(), newCity, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCity(CityType newCity) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_City(), newCity);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ClassnameType getClassname() {
		return (ClassnameType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Classname(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClassname(ClassnameType newClassname, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Classname(), newClassname, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setClassname(ClassnameType newClassname) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Classname(), newClassname);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ClasssynopsisType getClasssynopsis() {
		return (ClasssynopsisType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Classsynopsis(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClasssynopsis(ClasssynopsisType newClasssynopsis, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Classsynopsis(), newClasssynopsis, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setClasssynopsis(ClasssynopsisType newClasssynopsis) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Classsynopsis(), newClasssynopsis);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ClasssynopsisinfoType getClasssynopsisinfo() {
		return (ClasssynopsisinfoType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Classsynopsisinfo(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClasssynopsisinfo(ClasssynopsisinfoType newClasssynopsisinfo, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Classsynopsisinfo(), newClasssynopsisinfo, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setClasssynopsisinfo(ClasssynopsisinfoType newClasssynopsisinfo) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Classsynopsisinfo(), newClasssynopsisinfo);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CmdsynopsisType getCmdsynopsis() {
		return (CmdsynopsisType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Cmdsynopsis(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCmdsynopsis(CmdsynopsisType newCmdsynopsis, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Cmdsynopsis(), newCmdsynopsis, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCmdsynopsis(CmdsynopsisType newCmdsynopsis) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Cmdsynopsis(), newCmdsynopsis);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CoType getCo() {
		return (CoType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Co(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCo(CoType newCo, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Co(), newCo, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCo(CoType newCo) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Co(), newCo);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeType getCode() {
		return (CodeType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Code(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCode(CodeType newCode, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Code(), newCode, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCode(CodeType newCode) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Code(), newCode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ColType getCol() {
		return (ColType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Col(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCol(ColType newCol, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Col(), newCol, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCol(ColType newCol) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Col(), newCol);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ColgroupType getColgroup() {
		return (ColgroupType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Colgroup(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetColgroup(ColgroupType newColgroup, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Colgroup(), newColgroup, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setColgroup(ColgroupType newColgroup) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Colgroup(), newColgroup);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CollabType getCollab() {
		return (CollabType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Collab(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCollab(CollabType newCollab, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Collab(), newCollab, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCollab(CollabType newCollab) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Collab(), newCollab);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ColophonType getColophon() {
		return (ColophonType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Colophon(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetColophon(ColophonType newColophon, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Colophon(), newColophon, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setColophon(ColophonType newColophon) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Colophon(), newColophon);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ColspecType getColspec() {
		return (ColspecType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Colspec(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetColspec(ColspecType newColspec, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Colspec(), newColspec, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setColspec(ColspecType newColspec) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Colspec(), newColspec);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CommandType getCommand() {
		return (CommandType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Command(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCommand(CommandType newCommand, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Command(), newCommand, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCommand(CommandType newCommand) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Command(), newCommand);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComputeroutputType getComputeroutput() {
		return (ComputeroutputType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Computeroutput(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComputeroutput(ComputeroutputType newComputeroutput, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Computeroutput(), newComputeroutput, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setComputeroutput(ComputeroutputType newComputeroutput) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Computeroutput(), newComputeroutput);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConfdatesType getConfdates() {
		return (ConfdatesType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Confdates(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConfdates(ConfdatesType newConfdates, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Confdates(), newConfdates, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConfdates(ConfdatesType newConfdates) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Confdates(), newConfdates);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConfgroupType getConfgroup() {
		return (ConfgroupType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Confgroup(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConfgroup(ConfgroupType newConfgroup, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Confgroup(), newConfgroup, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConfgroup(ConfgroupType newConfgroup) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Confgroup(), newConfgroup);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConfnumType getConfnum() {
		return (ConfnumType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Confnum(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConfnum(ConfnumType newConfnum, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Confnum(), newConfnum, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConfnum(ConfnumType newConfnum) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Confnum(), newConfnum);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConfsponsorType getConfsponsor() {
		return (ConfsponsorType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Confsponsor(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConfsponsor(ConfsponsorType newConfsponsor, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Confsponsor(), newConfsponsor, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConfsponsor(ConfsponsorType newConfsponsor) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Confsponsor(), newConfsponsor);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConftitleType getConftitle() {
		return (ConftitleType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Conftitle(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConftitle(ConftitleType newConftitle, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Conftitle(), newConftitle, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConftitle(ConftitleType newConftitle) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Conftitle(), newConftitle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConstantType getConstant() {
		return (ConstantType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Constant(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConstant(ConstantType newConstant, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Constant(), newConstant, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConstant(ConstantType newConstant) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Constant(), newConstant);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConstraintType getConstraint() {
		return (ConstraintType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Constraint(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConstraint(ConstraintType newConstraint, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Constraint(), newConstraint, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConstraint(ConstraintType newConstraint) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Constraint(), newConstraint);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConstraintdefType getConstraintdef() {
		return (ConstraintdefType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Constraintdef(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConstraintdef(ConstraintdefType newConstraintdef, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Constraintdef(), newConstraintdef, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConstraintdef(ConstraintdefType newConstraintdef) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Constraintdef(), newConstraintdef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConstructorsynopsisType getConstructorsynopsis() {
		return (ConstructorsynopsisType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Constructorsynopsis(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConstructorsynopsis(ConstructorsynopsisType newConstructorsynopsis, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Constructorsynopsis(), newConstructorsynopsis, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConstructorsynopsis(ConstructorsynopsisType newConstructorsynopsis) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Constructorsynopsis(), newConstructorsynopsis);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContractnumType getContractnum() {
		return (ContractnumType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Contractnum(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContractnum(ContractnumType newContractnum, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Contractnum(), newContractnum, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContractnum(ContractnumType newContractnum) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Contractnum(), newContractnum);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContractsponsorType getContractsponsor() {
		return (ContractsponsorType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Contractsponsor(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContractsponsor(ContractsponsorType newContractsponsor, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Contractsponsor(), newContractsponsor, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContractsponsor(ContractsponsorType newContractsponsor) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Contractsponsor(), newContractsponsor);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContribType getContrib() {
		return (ContribType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Contrib(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContrib(ContribType newContrib, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Contrib(), newContrib, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContrib(ContribType newContrib) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Contrib(), newContrib);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CopyrightType getCopyright() {
		return (CopyrightType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Copyright(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCopyright(CopyrightType newCopyright, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Copyright(), newCopyright, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCopyright(CopyrightType newCopyright) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Copyright(), newCopyright);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CorefType getCoref() {
		return (CorefType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Coref(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCoref(CorefType newCoref, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Coref(), newCoref, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCoref(CorefType newCoref) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Coref(), newCoref);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CountryType getCountry() {
		return (CountryType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Country(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCountry(CountryType newCountry, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Country(), newCountry, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCountry(CountryType newCountry) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Country(), newCountry);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CoverType getCover() {
		return (CoverType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Cover(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCover(CoverType newCover, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Cover(), newCover, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCover(CoverType newCover) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Cover(), newCover);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DatabaseType getDatabase() {
		return (DatabaseType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Database(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDatabase(DatabaseType newDatabase, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Database(), newDatabase, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDatabase(DatabaseType newDatabase) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Database(), newDatabase);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DateType getDate() {
		return (DateType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Date(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDate(DateType newDate, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Date(), newDate, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDate(DateType newDate) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Date(), newDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DedicationType getDedication() {
		return (DedicationType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Dedication(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDedication(DedicationType newDedication, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Dedication(), newDedication, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDedication(DedicationType newDedication) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Dedication(), newDedication);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DestructorsynopsisType getDestructorsynopsis() {
		return (DestructorsynopsisType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Destructorsynopsis(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDestructorsynopsis(DestructorsynopsisType newDestructorsynopsis, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Destructorsynopsis(), newDestructorsynopsis, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDestructorsynopsis(DestructorsynopsisType newDestructorsynopsis) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Destructorsynopsis(), newDestructorsynopsis);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EditionType getEdition() {
		return (EditionType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Edition(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEdition(EditionType newEdition, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Edition(), newEdition, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEdition(EditionType newEdition) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Edition(), newEdition);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EditorType getEditor() {
		return (EditorType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Editor(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEditor(EditorType newEditor, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Editor(), newEditor, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEditor(EditorType newEditor) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Editor(), newEditor);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EmailType getEmail() {
		return (EmailType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Email(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEmail(EmailType newEmail, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Email(), newEmail, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEmail(EmailType newEmail) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Email(), newEmail);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EmphasisType getEmphasis() {
		return (EmphasisType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Emphasis(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEmphasis(EmphasisType newEmphasis, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Emphasis(), newEmphasis, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEmphasis(EmphasisType newEmphasis) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Emphasis(), newEmphasis);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EntryType getEntry() {
		return (EntryType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Entry(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEntry(EntryType newEntry, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Entry(), newEntry, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEntry(EntryType newEntry) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Entry(), newEntry);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EntrytblType getEntrytbl() {
		return (EntrytblType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Entrytbl(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEntrytbl(EntrytblType newEntrytbl, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Entrytbl(), newEntrytbl, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEntrytbl(EntrytblType newEntrytbl) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Entrytbl(), newEntrytbl);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EnvarType getEnvar() {
		return (EnvarType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Envar(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnvar(EnvarType newEnvar, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Envar(), newEnvar, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEnvar(EnvarType newEnvar) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Envar(), newEnvar);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EpigraphType getEpigraph() {
		return (EpigraphType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Epigraph(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEpigraph(EpigraphType newEpigraph, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Epigraph(), newEpigraph, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEpigraph(EpigraphType newEpigraph) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Epigraph(), newEpigraph);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EquationType getEquation() {
		return (EquationType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Equation(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEquation(EquationType newEquation, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Equation(), newEquation, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEquation(EquationType newEquation) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Equation(), newEquation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ErrorcodeType getErrorcode() {
		return (ErrorcodeType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Errorcode(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetErrorcode(ErrorcodeType newErrorcode, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Errorcode(), newErrorcode, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setErrorcode(ErrorcodeType newErrorcode) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Errorcode(), newErrorcode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ErrornameType getErrorname() {
		return (ErrornameType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Errorname(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetErrorname(ErrornameType newErrorname, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Errorname(), newErrorname, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setErrorname(ErrornameType newErrorname) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Errorname(), newErrorname);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ErrortextType getErrortext() {
		return (ErrortextType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Errortext(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetErrortext(ErrortextType newErrortext, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Errortext(), newErrortext, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setErrortext(ErrortextType newErrortext) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Errortext(), newErrortext);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ErrortypeType getErrortype() {
		return (ErrortypeType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Errortype(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetErrortype(ErrortypeType newErrortype, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Errortype(), newErrortype, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setErrortype(ErrortypeType newErrortype) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Errortype(), newErrortype);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExampleType getExample() {
		return (ExampleType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Example(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExample(ExampleType newExample, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Example(), newExample, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExample(ExampleType newExample) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Example(), newExample);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExceptionnameType getExceptionname() {
		return (ExceptionnameType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Exceptionname(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExceptionname(ExceptionnameType newExceptionname, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Exceptionname(), newExceptionname, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExceptionname(ExceptionnameType newExceptionname) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Exceptionname(), newExceptionname);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExtendedlinkType getExtendedlink() {
		return (ExtendedlinkType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Extendedlink(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExtendedlink(ExtendedlinkType newExtendedlink, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Extendedlink(), newExtendedlink, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExtendedlink(ExtendedlinkType newExtendedlink) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Extendedlink(), newExtendedlink);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FaxType getFax() {
		return (FaxType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Fax(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFax(FaxType newFax, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Fax(), newFax, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFax(FaxType newFax) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Fax(), newFax);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FieldsynopsisType getFieldsynopsis() {
		return (FieldsynopsisType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Fieldsynopsis(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFieldsynopsis(FieldsynopsisType newFieldsynopsis, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Fieldsynopsis(), newFieldsynopsis, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFieldsynopsis(FieldsynopsisType newFieldsynopsis) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Fieldsynopsis(), newFieldsynopsis);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FigureType getFigure() {
		return (FigureType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Figure(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFigure(FigureType newFigure, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Figure(), newFigure, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFigure(FigureType newFigure) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Figure(), newFigure);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FilenameType getFilename() {
		return (FilenameType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Filename(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFilename(FilenameType newFilename, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Filename(), newFilename, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFilename(FilenameType newFilename) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Filename(), newFilename);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FirstnameType getFirstname() {
		return (FirstnameType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Firstname(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFirstname(FirstnameType newFirstname, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Firstname(), newFirstname, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFirstname(FirstnameType newFirstname) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Firstname(), newFirstname);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FirsttermType getFirstterm() {
		return (FirsttermType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Firstterm(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFirstterm(FirsttermType newFirstterm, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Firstterm(), newFirstterm, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFirstterm(FirsttermType newFirstterm) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Firstterm(), newFirstterm);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FootnoteType getFootnote() {
		return (FootnoteType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Footnote(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFootnote(FootnoteType newFootnote, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Footnote(), newFootnote, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFootnote(FootnoteType newFootnote) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Footnote(), newFootnote);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FootnoterefType getFootnoteref() {
		return (FootnoterefType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Footnoteref(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFootnoteref(FootnoterefType newFootnoteref, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Footnoteref(), newFootnoteref, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFootnoteref(FootnoterefType newFootnoteref) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Footnoteref(), newFootnoteref);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ForeignphraseType getForeignphrase() {
		return (ForeignphraseType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Foreignphrase(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetForeignphrase(ForeignphraseType newForeignphrase, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Foreignphrase(), newForeignphrase, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setForeignphrase(ForeignphraseType newForeignphrase) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Foreignphrase(), newForeignphrase);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FormalparaType getFormalpara() {
		return (FormalparaType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Formalpara(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFormalpara(FormalparaType newFormalpara, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Formalpara(), newFormalpara, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFormalpara(FormalparaType newFormalpara) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Formalpara(), newFormalpara);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FuncdefType getFuncdef() {
		return (FuncdefType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Funcdef(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFuncdef(FuncdefType newFuncdef, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Funcdef(), newFuncdef, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFuncdef(FuncdefType newFuncdef) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Funcdef(), newFuncdef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FuncparamsType getFuncparams() {
		return (FuncparamsType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Funcparams(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFuncparams(FuncparamsType newFuncparams, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Funcparams(), newFuncparams, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFuncparams(FuncparamsType newFuncparams) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Funcparams(), newFuncparams);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FuncprototypeType getFuncprototype() {
		return (FuncprototypeType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Funcprototype(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFuncprototype(FuncprototypeType newFuncprototype, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Funcprototype(), newFuncprototype, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFuncprototype(FuncprototypeType newFuncprototype) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Funcprototype(), newFuncprototype);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FuncsynopsisType getFuncsynopsis() {
		return (FuncsynopsisType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Funcsynopsis(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFuncsynopsis(FuncsynopsisType newFuncsynopsis, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Funcsynopsis(), newFuncsynopsis, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFuncsynopsis(FuncsynopsisType newFuncsynopsis) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Funcsynopsis(), newFuncsynopsis);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FuncsynopsisinfoType getFuncsynopsisinfo() {
		return (FuncsynopsisinfoType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Funcsynopsisinfo(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFuncsynopsisinfo(FuncsynopsisinfoType newFuncsynopsisinfo, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Funcsynopsisinfo(), newFuncsynopsisinfo, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFuncsynopsisinfo(FuncsynopsisinfoType newFuncsynopsisinfo) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Funcsynopsisinfo(), newFuncsynopsisinfo);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FunctionType1 getFunction() {
		return (FunctionType1)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Function(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFunction(FunctionType1 newFunction, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Function(), newFunction, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFunction(FunctionType1 newFunction) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Function(), newFunction);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GlossaryType getGlossary() {
		return (GlossaryType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Glossary(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGlossary(GlossaryType newGlossary, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Glossary(), newGlossary, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGlossary(GlossaryType newGlossary) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Glossary(), newGlossary);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GlossdefType getGlossdef() {
		return (GlossdefType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Glossdef(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGlossdef(GlossdefType newGlossdef, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Glossdef(), newGlossdef, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGlossdef(GlossdefType newGlossdef) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Glossdef(), newGlossdef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GlossdivType getGlossdiv() {
		return (GlossdivType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Glossdiv(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGlossdiv(GlossdivType newGlossdiv, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Glossdiv(), newGlossdiv, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGlossdiv(GlossdivType newGlossdiv) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Glossdiv(), newGlossdiv);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GlossentryType getGlossentry() {
		return (GlossentryType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Glossentry(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGlossentry(GlossentryType newGlossentry, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Glossentry(), newGlossentry, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGlossentry(GlossentryType newGlossentry) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Glossentry(), newGlossentry);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GlosslistType getGlosslist() {
		return (GlosslistType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Glosslist(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGlosslist(GlosslistType newGlosslist, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Glosslist(), newGlosslist, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGlosslist(GlosslistType newGlosslist) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Glosslist(), newGlosslist);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GlossseeType getGlosssee() {
		return (GlossseeType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Glosssee(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGlosssee(GlossseeType newGlosssee, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Glosssee(), newGlosssee, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGlosssee(GlossseeType newGlosssee) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Glosssee(), newGlosssee);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GlossseealsoType getGlossseealso() {
		return (GlossseealsoType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Glossseealso(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGlossseealso(GlossseealsoType newGlossseealso, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Glossseealso(), newGlossseealso, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGlossseealso(GlossseealsoType newGlossseealso) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Glossseealso(), newGlossseealso);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GlosstermType getGlossterm() {
		return (GlosstermType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Glossterm(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGlossterm(GlosstermType newGlossterm, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Glossterm(), newGlossterm, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGlossterm(GlosstermType newGlossterm) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Glossterm(), newGlossterm);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GroupType getGroup() {
		return (GroupType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Group(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGroup(GroupType newGroup, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Group(), newGroup, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGroup(GroupType newGroup) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Group(), newGroup);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GuibuttonType getGuibutton() {
		return (GuibuttonType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Guibutton(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGuibutton(GuibuttonType newGuibutton, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Guibutton(), newGuibutton, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGuibutton(GuibuttonType newGuibutton) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Guibutton(), newGuibutton);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GuiiconType getGuiicon() {
		return (GuiiconType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Guiicon(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGuiicon(GuiiconType newGuiicon, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Guiicon(), newGuiicon, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGuiicon(GuiiconType newGuiicon) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Guiicon(), newGuiicon);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GuilabelType getGuilabel() {
		return (GuilabelType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Guilabel(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGuilabel(GuilabelType newGuilabel, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Guilabel(), newGuilabel, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGuilabel(GuilabelType newGuilabel) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Guilabel(), newGuilabel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GuimenuType getGuimenu() {
		return (GuimenuType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Guimenu(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGuimenu(GuimenuType newGuimenu, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Guimenu(), newGuimenu, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGuimenu(GuimenuType newGuimenu) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Guimenu(), newGuimenu);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GuimenuitemType getGuimenuitem() {
		return (GuimenuitemType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Guimenuitem(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGuimenuitem(GuimenuitemType newGuimenuitem, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Guimenuitem(), newGuimenuitem, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGuimenuitem(GuimenuitemType newGuimenuitem) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Guimenuitem(), newGuimenuitem);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GuisubmenuType getGuisubmenu() {
		return (GuisubmenuType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Guisubmenu(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGuisubmenu(GuisubmenuType newGuisubmenu, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Guisubmenu(), newGuisubmenu, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGuisubmenu(GuisubmenuType newGuisubmenu) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Guisubmenu(), newGuisubmenu);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HardwareType getHardware() {
		return (HardwareType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Hardware(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHardware(HardwareType newHardware, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Hardware(), newHardware, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHardware(HardwareType newHardware) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Hardware(), newHardware);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HolderType getHolder() {
		return (HolderType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Holder(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHolder(HolderType newHolder, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Holder(), newHolder, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHolder(HolderType newHolder) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Holder(), newHolder);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HonorificType getHonorific() {
		return (HonorificType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Honorific(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHonorific(HonorificType newHonorific, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Honorific(), newHonorific, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHonorific(HonorificType newHonorific) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Honorific(), newHonorific);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImagedataType getImagedata() {
		return (ImagedataType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Imagedata(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImagedata(ImagedataType newImagedata, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Imagedata(), newImagedata, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setImagedata(ImagedataType newImagedata) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Imagedata(), newImagedata);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImageobjectType getImageobject() {
		return (ImageobjectType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Imageobject(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImageobject(ImageobjectType newImageobject, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Imageobject(), newImageobject, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setImageobject(ImageobjectType newImageobject) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Imageobject(), newImageobject);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImageobjectcoType getImageobjectco() {
		return (ImageobjectcoType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Imageobjectco(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImageobjectco(ImageobjectcoType newImageobjectco, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Imageobjectco(), newImageobjectco, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setImageobjectco(ImageobjectcoType newImageobjectco) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Imageobjectco(), newImageobjectco);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImportantType getImportant() {
		return (ImportantType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Important(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImportant(ImportantType newImportant, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Important(), newImportant, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setImportant(ImportantType newImportant) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Important(), newImportant);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IndexType getIndex() {
		return (IndexType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Index(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIndex(IndexType newIndex, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Index(), newIndex, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIndex(IndexType newIndex) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Index(), newIndex);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IndexdivType getIndexdiv() {
		return (IndexdivType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Indexdiv(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIndexdiv(IndexdivType newIndexdiv, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Indexdiv(), newIndexdiv, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIndexdiv(IndexdivType newIndexdiv) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Indexdiv(), newIndexdiv);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IndexentryType getIndexentry() {
		return (IndexentryType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Indexentry(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIndexentry(IndexentryType newIndexentry, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Indexentry(), newIndexentry, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIndexentry(IndexentryType newIndexentry) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Indexentry(), newIndexentry);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IndextermType getIndexterm() {
		return (IndextermType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Indexterm(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIndexterm(IndextermType newIndexterm, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Indexterm(), newIndexterm, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIndexterm(IndextermType newIndexterm) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Indexterm(), newIndexterm);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InfoType getInfo() {
		return (InfoType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Info(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInfo(InfoType newInfo, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Info(), newInfo, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInfo(InfoType newInfo) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Info(), newInfo);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InformalequationType getInformalequation() {
		return (InformalequationType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Informalequation(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInformalequation(InformalequationType newInformalequation, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Informalequation(), newInformalequation, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInformalequation(InformalequationType newInformalequation) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Informalequation(), newInformalequation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InformalexampleType getInformalexample() {
		return (InformalexampleType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Informalexample(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInformalexample(InformalexampleType newInformalexample, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Informalexample(), newInformalexample, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInformalexample(InformalexampleType newInformalexample) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Informalexample(), newInformalexample);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InformalfigureType getInformalfigure() {
		return (InformalfigureType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Informalfigure(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInformalfigure(InformalfigureType newInformalfigure, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Informalfigure(), newInformalfigure, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInformalfigure(InformalfigureType newInformalfigure) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Informalfigure(), newInformalfigure);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InformaltableType getInformaltable() {
		return (InformaltableType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Informaltable(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInformaltable(InformaltableType newInformaltable, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Informaltable(), newInformaltable, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInformaltable(InformaltableType newInformaltable) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Informaltable(), newInformaltable);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InitializerType getInitializer() {
		return (InitializerType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Initializer(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInitializer(InitializerType newInitializer, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Initializer(), newInitializer, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInitializer(InitializerType newInitializer) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Initializer(), newInitializer);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InlineequationType getInlineequation() {
		return (InlineequationType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Inlineequation(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInlineequation(InlineequationType newInlineequation, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Inlineequation(), newInlineequation, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInlineequation(InlineequationType newInlineequation) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Inlineequation(), newInlineequation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InlinemediaobjectType getInlinemediaobject() {
		return (InlinemediaobjectType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Inlinemediaobject(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInlinemediaobject(InlinemediaobjectType newInlinemediaobject, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Inlinemediaobject(), newInlinemediaobject, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInlinemediaobject(InlinemediaobjectType newInlinemediaobject) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Inlinemediaobject(), newInlinemediaobject);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InterfacenameType getInterfacename() {
		return (InterfacenameType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Interfacename(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInterfacename(InterfacenameType newInterfacename, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Interfacename(), newInterfacename, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInterfacename(InterfacenameType newInterfacename) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Interfacename(), newInterfacename);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IssuenumType getIssuenum() {
		return (IssuenumType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Issuenum(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIssuenum(IssuenumType newIssuenum, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Issuenum(), newIssuenum, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIssuenum(IssuenumType newIssuenum) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Issuenum(), newIssuenum);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ItemizedlistType getItemizedlist() {
		return (ItemizedlistType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Itemizedlist(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetItemizedlist(ItemizedlistType newItemizedlist, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Itemizedlist(), newItemizedlist, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setItemizedlist(ItemizedlistType newItemizedlist) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Itemizedlist(), newItemizedlist);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ItermsetType getItermset() {
		return (ItermsetType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Itermset(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetItermset(ItermsetType newItermset, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Itermset(), newItermset, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setItermset(ItermsetType newItermset) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Itermset(), newItermset);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JobtitleType getJobtitle() {
		return (JobtitleType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Jobtitle(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetJobtitle(JobtitleType newJobtitle, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Jobtitle(), newJobtitle, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setJobtitle(JobtitleType newJobtitle) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Jobtitle(), newJobtitle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public KeycapType getKeycap() {
		return (KeycapType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Keycap(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetKeycap(KeycapType newKeycap, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Keycap(), newKeycap, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKeycap(KeycapType newKeycap) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Keycap(), newKeycap);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public KeycodeType getKeycode() {
		return (KeycodeType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Keycode(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetKeycode(KeycodeType newKeycode, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Keycode(), newKeycode, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKeycode(KeycodeType newKeycode) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Keycode(), newKeycode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public KeycomboType getKeycombo() {
		return (KeycomboType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Keycombo(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetKeycombo(KeycomboType newKeycombo, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Keycombo(), newKeycombo, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKeycombo(KeycomboType newKeycombo) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Keycombo(), newKeycombo);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public KeysymType getKeysym() {
		return (KeysymType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Keysym(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetKeysym(KeysymType newKeysym, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Keysym(), newKeysym, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKeysym(KeysymType newKeysym) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Keysym(), newKeysym);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public KeywordType getKeyword() {
		return (KeywordType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Keyword(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetKeyword(KeywordType newKeyword, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Keyword(), newKeyword, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKeyword(KeywordType newKeyword) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Keyword(), newKeyword);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public KeywordsetType getKeywordset() {
		return (KeywordsetType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Keywordset(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetKeywordset(KeywordsetType newKeywordset, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Keywordset(), newKeywordset, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKeywordset(KeywordsetType newKeywordset) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Keywordset(), newKeywordset);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LabelType getLabel() {
		return (LabelType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Label(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLabel(LabelType newLabel, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Label(), newLabel, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLabel(LabelType newLabel) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Label(), newLabel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LegalnoticeType getLegalnotice() {
		return (LegalnoticeType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Legalnotice(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLegalnotice(LegalnoticeType newLegalnotice, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Legalnotice(), newLegalnotice, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLegalnotice(LegalnoticeType newLegalnotice) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Legalnotice(), newLegalnotice);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LhsType getLhs() {
		return (LhsType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Lhs(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLhs(LhsType newLhs, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Lhs(), newLhs, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLhs(LhsType newLhs) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Lhs(), newLhs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LineageType getLineage() {
		return (LineageType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Lineage(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLineage(LineageType newLineage, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Lineage(), newLineage, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLineage(LineageType newLineage) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Lineage(), newLineage);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LineannotationType getLineannotation() {
		return (LineannotationType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Lineannotation(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLineannotation(LineannotationType newLineannotation, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Lineannotation(), newLineannotation, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLineannotation(LineannotationType newLineannotation) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Lineannotation(), newLineannotation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LinkType getLink() {
		return (LinkType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Link(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLink(LinkType newLink, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Link(), newLink, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLink(LinkType newLink) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Link(), newLink);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ListitemType getListitem() {
		return (ListitemType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Listitem(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListitem(ListitemType newListitem, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Listitem(), newListitem, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setListitem(ListitemType newListitem) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Listitem(), newListitem);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LiteralType getLiteral() {
		return (LiteralType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Literal(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLiteral(LiteralType newLiteral, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Literal(), newLiteral, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLiteral(LiteralType newLiteral) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Literal(), newLiteral);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LiterallayoutType getLiterallayout() {
		return (LiterallayoutType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Literallayout(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLiterallayout(LiterallayoutType newLiterallayout, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Literallayout(), newLiterallayout, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLiterallayout(LiterallayoutType newLiterallayout) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Literallayout(), newLiterallayout);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LocatorType getLocator() {
		return (LocatorType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Locator(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocator(LocatorType newLocator, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Locator(), newLocator, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLocator(LocatorType newLocator) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Locator(), newLocator);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ManvolnumType getManvolnum() {
		return (ManvolnumType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Manvolnum(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetManvolnum(ManvolnumType newManvolnum, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Manvolnum(), newManvolnum, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setManvolnum(ManvolnumType newManvolnum) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Manvolnum(), newManvolnum);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MarkupType getMarkup() {
		return (MarkupType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Markup(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMarkup(MarkupType newMarkup, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Markup(), newMarkup, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMarkup(MarkupType newMarkup) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Markup(), newMarkup);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MathphraseType getMathphrase() {
		return (MathphraseType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Mathphrase(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMathphrase(MathphraseType newMathphrase, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Mathphrase(), newMathphrase, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMathphrase(MathphraseType newMathphrase) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Mathphrase(), newMathphrase);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MediaobjectType getMediaobject() {
		return (MediaobjectType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Mediaobject(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMediaobject(MediaobjectType newMediaobject, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Mediaobject(), newMediaobject, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMediaobject(MediaobjectType newMediaobject) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Mediaobject(), newMediaobject);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MemberType getMember() {
		return (MemberType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Member(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMember(MemberType newMember, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Member(), newMember, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMember(MemberType newMember) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Member(), newMember);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MenuchoiceType getMenuchoice() {
		return (MenuchoiceType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Menuchoice(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMenuchoice(MenuchoiceType newMenuchoice, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Menuchoice(), newMenuchoice, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMenuchoice(MenuchoiceType newMenuchoice) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Menuchoice(), newMenuchoice);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MethodnameType getMethodname() {
		return (MethodnameType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Methodname(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMethodname(MethodnameType newMethodname, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Methodname(), newMethodname, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMethodname(MethodnameType newMethodname) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Methodname(), newMethodname);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MethodparamType getMethodparam() {
		return (MethodparamType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Methodparam(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMethodparam(MethodparamType newMethodparam, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Methodparam(), newMethodparam, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMethodparam(MethodparamType newMethodparam) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Methodparam(), newMethodparam);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MethodsynopsisType getMethodsynopsis() {
		return (MethodsynopsisType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Methodsynopsis(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMethodsynopsis(MethodsynopsisType newMethodsynopsis, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Methodsynopsis(), newMethodsynopsis, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMethodsynopsis(MethodsynopsisType newMethodsynopsis) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Methodsynopsis(), newMethodsynopsis);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ModifierType getModifier() {
		return (ModifierType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Modifier(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModifier(ModifierType newModifier, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Modifier(), newModifier, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setModifier(ModifierType newModifier) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Modifier(), newModifier);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MousebuttonType getMousebutton() {
		return (MousebuttonType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Mousebutton(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMousebutton(MousebuttonType newMousebutton, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Mousebutton(), newMousebutton, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMousebutton(MousebuttonType newMousebutton) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Mousebutton(), newMousebutton);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MsgType getMsg() {
		return (MsgType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Msg(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMsg(MsgType newMsg, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Msg(), newMsg, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMsg(MsgType newMsg) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Msg(), newMsg);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MsgaudType getMsgaud() {
		return (MsgaudType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Msgaud(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMsgaud(MsgaudType newMsgaud, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Msgaud(), newMsgaud, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMsgaud(MsgaudType newMsgaud) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Msgaud(), newMsgaud);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MsgentryType getMsgentry() {
		return (MsgentryType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Msgentry(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMsgentry(MsgentryType newMsgentry, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Msgentry(), newMsgentry, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMsgentry(MsgentryType newMsgentry) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Msgentry(), newMsgentry);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MsgexplanType getMsgexplan() {
		return (MsgexplanType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Msgexplan(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMsgexplan(MsgexplanType newMsgexplan, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Msgexplan(), newMsgexplan, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMsgexplan(MsgexplanType newMsgexplan) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Msgexplan(), newMsgexplan);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MsginfoType getMsginfo() {
		return (MsginfoType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Msginfo(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMsginfo(MsginfoType newMsginfo, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Msginfo(), newMsginfo, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMsginfo(MsginfoType newMsginfo) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Msginfo(), newMsginfo);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MsglevelType getMsglevel() {
		return (MsglevelType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Msglevel(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMsglevel(MsglevelType newMsglevel, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Msglevel(), newMsglevel, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMsglevel(MsglevelType newMsglevel) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Msglevel(), newMsglevel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MsgmainType getMsgmain() {
		return (MsgmainType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Msgmain(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMsgmain(MsgmainType newMsgmain, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Msgmain(), newMsgmain, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMsgmain(MsgmainType newMsgmain) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Msgmain(), newMsgmain);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MsgorigType getMsgorig() {
		return (MsgorigType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Msgorig(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMsgorig(MsgorigType newMsgorig, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Msgorig(), newMsgorig, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMsgorig(MsgorigType newMsgorig) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Msgorig(), newMsgorig);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MsgrelType getMsgrel() {
		return (MsgrelType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Msgrel(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMsgrel(MsgrelType newMsgrel, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Msgrel(), newMsgrel, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMsgrel(MsgrelType newMsgrel) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Msgrel(), newMsgrel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MsgsetType getMsgset() {
		return (MsgsetType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Msgset(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMsgset(MsgsetType newMsgset, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Msgset(), newMsgset, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMsgset(MsgsetType newMsgset) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Msgset(), newMsgset);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MsgsubType getMsgsub() {
		return (MsgsubType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Msgsub(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMsgsub(MsgsubType newMsgsub, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Msgsub(), newMsgsub, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMsgsub(MsgsubType newMsgsub) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Msgsub(), newMsgsub);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MsgtextType getMsgtext() {
		return (MsgtextType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Msgtext(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMsgtext(MsgtextType newMsgtext, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Msgtext(), newMsgtext, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMsgtext(MsgtextType newMsgtext) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Msgtext(), newMsgtext);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NonterminalType getNonterminal() {
		return (NonterminalType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Nonterminal(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNonterminal(NonterminalType newNonterminal, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Nonterminal(), newNonterminal, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNonterminal(NonterminalType newNonterminal) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Nonterminal(), newNonterminal);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NoteType getNote() {
		return (NoteType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Note(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNote(NoteType newNote, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Note(), newNote, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNote(NoteType newNote) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Note(), newNote);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OlinkType getOlink() {
		return (OlinkType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Olink(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOlink(OlinkType newOlink, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Olink(), newOlink, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOlink(OlinkType newOlink) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Olink(), newOlink);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OoclassType getOoclass() {
		return (OoclassType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Ooclass(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOoclass(OoclassType newOoclass, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Ooclass(), newOoclass, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOoclass(OoclassType newOoclass) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Ooclass(), newOoclass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OoexceptionType getOoexception() {
		return (OoexceptionType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Ooexception(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOoexception(OoexceptionType newOoexception, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Ooexception(), newOoexception, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOoexception(OoexceptionType newOoexception) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Ooexception(), newOoexception);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OointerfaceType getOointerface() {
		return (OointerfaceType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Oointerface(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOointerface(OointerfaceType newOointerface, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Oointerface(), newOointerface, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOointerface(OointerfaceType newOointerface) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Oointerface(), newOointerface);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OptionType getOption() {
		return (OptionType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Option(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOption(OptionType newOption, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Option(), newOption, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOption(OptionType newOption) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Option(), newOption);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OptionalType getOptional() {
		return (OptionalType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Optional(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOptional(OptionalType newOptional, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Optional(), newOptional, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOptional(OptionalType newOptional) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Optional(), newOptional);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OrderedlistType getOrderedlist() {
		return (OrderedlistType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Orderedlist(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOrderedlist(OrderedlistType newOrderedlist, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Orderedlist(), newOrderedlist, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrderedlist(OrderedlistType newOrderedlist) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Orderedlist(), newOrderedlist);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OrgType getOrg() {
		return (OrgType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Org(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOrg(OrgType newOrg, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Org(), newOrg, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrg(OrgType newOrg) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Org(), newOrg);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OrgdivType getOrgdiv() {
		return (OrgdivType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Orgdiv(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOrgdiv(OrgdivType newOrgdiv, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Orgdiv(), newOrgdiv, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrgdiv(OrgdivType newOrgdiv) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Orgdiv(), newOrgdiv);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OrgnameType getOrgname() {
		return (OrgnameType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Orgname(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOrgname(OrgnameType newOrgname, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Orgname(), newOrgname, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrgname(OrgnameType newOrgname) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Orgname(), newOrgname);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OtheraddrType getOtheraddr() {
		return (OtheraddrType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Otheraddr(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOtheraddr(OtheraddrType newOtheraddr, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Otheraddr(), newOtheraddr, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOtheraddr(OtheraddrType newOtheraddr) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Otheraddr(), newOtheraddr);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OthercreditType getOthercredit() {
		return (OthercreditType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Othercredit(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOthercredit(OthercreditType newOthercredit, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Othercredit(), newOthercredit, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOthercredit(OthercreditType newOthercredit) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Othercredit(), newOthercredit);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OthernameType getOthername() {
		return (OthernameType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Othername(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOthername(OthernameType newOthername, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Othername(), newOthername, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOthername(OthernameType newOthername) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Othername(), newOthername);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PackageType getPackage() {
		return (PackageType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Package(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPackage(PackageType newPackage, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Package(), newPackage, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPackage(PackageType newPackage) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Package(), newPackage);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PagenumsType getPagenums() {
		return (PagenumsType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Pagenums(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPagenums(PagenumsType newPagenums, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Pagenums(), newPagenums, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPagenums(PagenumsType newPagenums) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Pagenums(), newPagenums);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ParaType getPara() {
		return (ParaType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Para(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPara(ParaType newPara, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Para(), newPara, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPara(ParaType newPara) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Para(), newPara);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ParamdefType getParamdef() {
		return (ParamdefType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Paramdef(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParamdef(ParamdefType newParamdef, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Paramdef(), newParamdef, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParamdef(ParamdefType newParamdef) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Paramdef(), newParamdef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ParameterType getParameter() {
		return (ParameterType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Parameter(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParameter(ParameterType newParameter, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Parameter(), newParameter, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParameter(ParameterType newParameter) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Parameter(), newParameter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PartType getPart() {
		return (PartType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Part(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPart(PartType newPart, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Part(), newPart, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPart(PartType newPart) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Part(), newPart);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PartintroType getPartintro() {
		return (PartintroType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Partintro(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPartintro(PartintroType newPartintro, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Partintro(), newPartintro, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPartintro(PartintroType newPartintro) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Partintro(), newPartintro);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PersonType getPerson() {
		return (PersonType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Person(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPerson(PersonType newPerson, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Person(), newPerson, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPerson(PersonType newPerson) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Person(), newPerson);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PersonblurbType getPersonblurb() {
		return (PersonblurbType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Personblurb(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPersonblurb(PersonblurbType newPersonblurb, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Personblurb(), newPersonblurb, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPersonblurb(PersonblurbType newPersonblurb) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Personblurb(), newPersonblurb);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PersonnameType getPersonname() {
		return (PersonnameType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Personname(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPersonname(PersonnameType newPersonname, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Personname(), newPersonname, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPersonname(PersonnameType newPersonname) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Personname(), newPersonname);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PhoneType getPhone() {
		return (PhoneType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Phone(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPhone(PhoneType newPhone, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Phone(), newPhone, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPhone(PhoneType newPhone) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Phone(), newPhone);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PhraseType getPhrase() {
		return (PhraseType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Phrase(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPhrase(PhraseType newPhrase, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Phrase(), newPhrase, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPhrase(PhraseType newPhrase) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Phrase(), newPhrase);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PobType getPob() {
		return (PobType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Pob(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPob(PobType newPob, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Pob(), newPob, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPob(PobType newPob) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Pob(), newPob);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PostcodeType getPostcode() {
		return (PostcodeType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Postcode(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPostcode(PostcodeType newPostcode, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Postcode(), newPostcode, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPostcode(PostcodeType newPostcode) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Postcode(), newPostcode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PrefaceType getPreface() {
		return (PrefaceType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Preface(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPreface(PrefaceType newPreface, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Preface(), newPreface, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPreface(PrefaceType newPreface) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Preface(), newPreface);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PrimaryType getPrimary() {
		return (PrimaryType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Primary(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrimary(PrimaryType newPrimary, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Primary(), newPrimary, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrimary(PrimaryType newPrimary) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Primary(), newPrimary);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PrimaryieType getPrimaryie() {
		return (PrimaryieType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Primaryie(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrimaryie(PrimaryieType newPrimaryie, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Primaryie(), newPrimaryie, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrimaryie(PrimaryieType newPrimaryie) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Primaryie(), newPrimaryie);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PrinthistoryType getPrinthistory() {
		return (PrinthistoryType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Printhistory(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrinthistory(PrinthistoryType newPrinthistory, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Printhistory(), newPrinthistory, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrinthistory(PrinthistoryType newPrinthistory) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Printhistory(), newPrinthistory);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProcedureType getProcedure() {
		return (ProcedureType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Procedure(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProcedure(ProcedureType newProcedure, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Procedure(), newProcedure, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProcedure(ProcedureType newProcedure) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Procedure(), newProcedure);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductionType getProduction() {
		return (ProductionType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Production(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProduction(ProductionType newProduction, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Production(), newProduction, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProduction(ProductionType newProduction) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Production(), newProduction);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductionrecapType getProductionrecap() {
		return (ProductionrecapType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Productionrecap(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProductionrecap(ProductionrecapType newProductionrecap, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Productionrecap(), newProductionrecap, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductionrecap(ProductionrecapType newProductionrecap) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Productionrecap(), newProductionrecap);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductionsetType getProductionset() {
		return (ProductionsetType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Productionset(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProductionset(ProductionsetType newProductionset, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Productionset(), newProductionset, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductionset(ProductionsetType newProductionset) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Productionset(), newProductionset);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductnameType getProductname() {
		return (ProductnameType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Productname(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProductname(ProductnameType newProductname, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Productname(), newProductname, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductname(ProductnameType newProductname) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Productname(), newProductname);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductnumberType getProductnumber() {
		return (ProductnumberType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Productnumber(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProductnumber(ProductnumberType newProductnumber, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Productnumber(), newProductnumber, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductnumber(ProductnumberType newProductnumber) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Productnumber(), newProductnumber);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProgramlistingType getProgramlisting() {
		return (ProgramlistingType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Programlisting(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProgramlisting(ProgramlistingType newProgramlisting, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Programlisting(), newProgramlisting, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProgramlisting(ProgramlistingType newProgramlisting) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Programlisting(), newProgramlisting);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProgramlistingcoType getProgramlistingco() {
		return (ProgramlistingcoType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Programlistingco(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProgramlistingco(ProgramlistingcoType newProgramlistingco, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Programlistingco(), newProgramlistingco, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProgramlistingco(ProgramlistingcoType newProgramlistingco) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Programlistingco(), newProgramlistingco);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PromptType getPrompt() {
		return (PromptType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Prompt(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrompt(PromptType newPrompt, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Prompt(), newPrompt, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrompt(PromptType newPrompt) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Prompt(), newPrompt);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PropertyType getProperty() {
		return (PropertyType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Property(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProperty(PropertyType newProperty, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Property(), newProperty, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProperty(PropertyType newProperty) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Property(), newProperty);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PubdateType getPubdate() {
		return (PubdateType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Pubdate(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPubdate(PubdateType newPubdate, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Pubdate(), newPubdate, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPubdate(PubdateType newPubdate) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Pubdate(), newPubdate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PublisherType getPublisher() {
		return (PublisherType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Publisher(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPublisher(PublisherType newPublisher, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Publisher(), newPublisher, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPublisher(PublisherType newPublisher) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Publisher(), newPublisher);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PublishernameType getPublishername() {
		return (PublishernameType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Publishername(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPublishername(PublishernameType newPublishername, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Publishername(), newPublishername, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPublishername(PublishernameType newPublishername) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Publishername(), newPublishername);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QandadivType getQandadiv() {
		return (QandadivType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Qandadiv(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQandadiv(QandadivType newQandadiv, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Qandadiv(), newQandadiv, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQandadiv(QandadivType newQandadiv) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Qandadiv(), newQandadiv);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QandaentryType getQandaentry() {
		return (QandaentryType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Qandaentry(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQandaentry(QandaentryType newQandaentry, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Qandaentry(), newQandaentry, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQandaentry(QandaentryType newQandaentry) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Qandaentry(), newQandaentry);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QandasetType getQandaset() {
		return (QandasetType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Qandaset(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQandaset(QandasetType newQandaset, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Qandaset(), newQandaset, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQandaset(QandasetType newQandaset) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Qandaset(), newQandaset);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QuestionType getQuestion() {
		return (QuestionType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Question(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQuestion(QuestionType newQuestion, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Question(), newQuestion, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQuestion(QuestionType newQuestion) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Question(), newQuestion);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QuoteType getQuote() {
		return (QuoteType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Quote(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQuote(QuoteType newQuote, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Quote(), newQuote, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQuote(QuoteType newQuote) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Quote(), newQuote);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RefclassType getRefclass() {
		return (RefclassType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Refclass(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRefclass(RefclassType newRefclass, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Refclass(), newRefclass, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRefclass(RefclassType newRefclass) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Refclass(), newRefclass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RefdescriptorType getRefdescriptor() {
		return (RefdescriptorType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Refdescriptor(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRefdescriptor(RefdescriptorType newRefdescriptor, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Refdescriptor(), newRefdescriptor, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRefdescriptor(RefdescriptorType newRefdescriptor) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Refdescriptor(), newRefdescriptor);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RefentryType getRefentry() {
		return (RefentryType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Refentry(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRefentry(RefentryType newRefentry, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Refentry(), newRefentry, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRefentry(RefentryType newRefentry) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Refentry(), newRefentry);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RefentrytitleType getRefentrytitle() {
		return (RefentrytitleType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Refentrytitle(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRefentrytitle(RefentrytitleType newRefentrytitle, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Refentrytitle(), newRefentrytitle, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRefentrytitle(RefentrytitleType newRefentrytitle) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Refentrytitle(), newRefentrytitle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReferenceType getReference() {
		return (ReferenceType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Reference(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReference(ReferenceType newReference, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Reference(), newReference, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReference(ReferenceType newReference) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Reference(), newReference);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RefmetaType getRefmeta() {
		return (RefmetaType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Refmeta(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRefmeta(RefmetaType newRefmeta, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Refmeta(), newRefmeta, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRefmeta(RefmetaType newRefmeta) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Refmeta(), newRefmeta);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RefmiscinfoType getRefmiscinfo() {
		return (RefmiscinfoType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Refmiscinfo(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRefmiscinfo(RefmiscinfoType newRefmiscinfo, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Refmiscinfo(), newRefmiscinfo, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRefmiscinfo(RefmiscinfoType newRefmiscinfo) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Refmiscinfo(), newRefmiscinfo);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RefnameType getRefname() {
		return (RefnameType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Refname(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRefname(RefnameType newRefname, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Refname(), newRefname, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRefname(RefnameType newRefname) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Refname(), newRefname);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RefnamedivType getRefnamediv() {
		return (RefnamedivType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Refnamediv(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRefnamediv(RefnamedivType newRefnamediv, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Refnamediv(), newRefnamediv, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRefnamediv(RefnamedivType newRefnamediv) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Refnamediv(), newRefnamediv);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RefpurposeType getRefpurpose() {
		return (RefpurposeType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Refpurpose(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRefpurpose(RefpurposeType newRefpurpose, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Refpurpose(), newRefpurpose, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRefpurpose(RefpurposeType newRefpurpose) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Refpurpose(), newRefpurpose);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Refsect1Type getRefsect1() {
		return (Refsect1Type)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Refsect1(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRefsect1(Refsect1Type newRefsect1, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Refsect1(), newRefsect1, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRefsect1(Refsect1Type newRefsect1) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Refsect1(), newRefsect1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Refsect2Type getRefsect2() {
		return (Refsect2Type)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Refsect2(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRefsect2(Refsect2Type newRefsect2, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Refsect2(), newRefsect2, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRefsect2(Refsect2Type newRefsect2) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Refsect2(), newRefsect2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Refsect3Type getRefsect3() {
		return (Refsect3Type)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Refsect3(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRefsect3(Refsect3Type newRefsect3, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Refsect3(), newRefsect3, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRefsect3(Refsect3Type newRefsect3) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Refsect3(), newRefsect3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RefsectionType getRefsection() {
		return (RefsectionType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Refsection(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRefsection(RefsectionType newRefsection, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Refsection(), newRefsection, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRefsection(RefsectionType newRefsection) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Refsection(), newRefsection);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RefsynopsisdivType getRefsynopsisdiv() {
		return (RefsynopsisdivType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Refsynopsisdiv(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRefsynopsisdiv(RefsynopsisdivType newRefsynopsisdiv, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Refsynopsisdiv(), newRefsynopsisdiv, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRefsynopsisdiv(RefsynopsisdivType newRefsynopsisdiv) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Refsynopsisdiv(), newRefsynopsisdiv);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReleaseinfoType getReleaseinfo() {
		return (ReleaseinfoType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Releaseinfo(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReleaseinfo(ReleaseinfoType newReleaseinfo, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Releaseinfo(), newReleaseinfo, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReleaseinfo(ReleaseinfoType newReleaseinfo) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Releaseinfo(), newReleaseinfo);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RemarkType getRemark() {
		return (RemarkType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Remark(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRemark(RemarkType newRemark, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Remark(), newRemark, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRemark(RemarkType newRemark) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Remark(), newRemark);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReplaceableType getReplaceable() {
		return (ReplaceableType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Replaceable(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReplaceable(ReplaceableType newReplaceable, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Replaceable(), newReplaceable, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReplaceable(ReplaceableType newReplaceable) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Replaceable(), newReplaceable);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReturnvalueType getReturnvalue() {
		return (ReturnvalueType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Returnvalue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReturnvalue(ReturnvalueType newReturnvalue, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Returnvalue(), newReturnvalue, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReturnvalue(ReturnvalueType newReturnvalue) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Returnvalue(), newReturnvalue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RevdescriptionType getRevdescription() {
		return (RevdescriptionType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Revdescription(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRevdescription(RevdescriptionType newRevdescription, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Revdescription(), newRevdescription, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRevdescription(RevdescriptionType newRevdescription) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Revdescription(), newRevdescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RevhistoryType getRevhistory() {
		return (RevhistoryType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Revhistory(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRevhistory(RevhistoryType newRevhistory, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Revhistory(), newRevhistory, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRevhistory(RevhistoryType newRevhistory) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Revhistory(), newRevhistory);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RevisionType getRevision() {
		return (RevisionType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Revision(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRevision(RevisionType newRevision, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Revision(), newRevision, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRevision(RevisionType newRevision) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Revision(), newRevision);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RevnumberType getRevnumber() {
		return (RevnumberType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Revnumber(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRevnumber(RevnumberType newRevnumber, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Revnumber(), newRevnumber, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRevnumber(RevnumberType newRevnumber) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Revnumber(), newRevnumber);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RevremarkType getRevremark() {
		return (RevremarkType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Revremark(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRevremark(RevremarkType newRevremark, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Revremark(), newRevremark, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRevremark(RevremarkType newRevremark) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Revremark(), newRevremark);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RhsType getRhs() {
		return (RhsType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Rhs(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRhs(RhsType newRhs, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Rhs(), newRhs, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRhs(RhsType newRhs) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Rhs(), newRhs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RowType getRow() {
		return (RowType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Row(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRow(RowType newRow, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Row(), newRow, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRow(RowType newRow) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Row(), newRow);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SbrType getSbr() {
		return (SbrType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Sbr(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSbr(SbrType newSbr, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Sbr(), newSbr, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSbr(SbrType newSbr) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Sbr(), newSbr);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ScreenType getScreen() {
		return (ScreenType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Screen(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScreen(ScreenType newScreen, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Screen(), newScreen, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setScreen(ScreenType newScreen) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Screen(), newScreen);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ScreencoType getScreenco() {
		return (ScreencoType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Screenco(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScreenco(ScreencoType newScreenco, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Screenco(), newScreenco, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setScreenco(ScreencoType newScreenco) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Screenco(), newScreenco);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ScreenshotType getScreenshot() {
		return (ScreenshotType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Screenshot(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScreenshot(ScreenshotType newScreenshot, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Screenshot(), newScreenshot, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setScreenshot(ScreenshotType newScreenshot) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Screenshot(), newScreenshot);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SecondaryType getSecondary() {
		return (SecondaryType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Secondary(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSecondary(SecondaryType newSecondary, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Secondary(), newSecondary, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSecondary(SecondaryType newSecondary) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Secondary(), newSecondary);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SecondaryieType getSecondaryie() {
		return (SecondaryieType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Secondaryie(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSecondaryie(SecondaryieType newSecondaryie, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Secondaryie(), newSecondaryie, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSecondaryie(SecondaryieType newSecondaryie) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Secondaryie(), newSecondaryie);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Sect1Type getSect1() {
		return (Sect1Type)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Sect1(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSect1(Sect1Type newSect1, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Sect1(), newSect1, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSect1(Sect1Type newSect1) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Sect1(), newSect1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Sect2Type getSect2() {
		return (Sect2Type)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Sect2(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSect2(Sect2Type newSect2, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Sect2(), newSect2, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSect2(Sect2Type newSect2) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Sect2(), newSect2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Sect3Type getSect3() {
		return (Sect3Type)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Sect3(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSect3(Sect3Type newSect3, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Sect3(), newSect3, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSect3(Sect3Type newSect3) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Sect3(), newSect3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Sect4Type getSect4() {
		return (Sect4Type)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Sect4(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSect4(Sect4Type newSect4, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Sect4(), newSect4, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSect4(Sect4Type newSect4) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Sect4(), newSect4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Sect5Type getSect5() {
		return (Sect5Type)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Sect5(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSect5(Sect5Type newSect5, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Sect5(), newSect5, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSect5(Sect5Type newSect5) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Sect5(), newSect5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SectionType getSection() {
		return (SectionType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Section(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSection(SectionType newSection, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Section(), newSection, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSection(SectionType newSection) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Section(), newSection);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SeeType getSee() {
		return (SeeType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_See(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSee(SeeType newSee, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_See(), newSee, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSee(SeeType newSee) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_See(), newSee);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SeealsoType getSeealso() {
		return (SeealsoType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Seealso(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSeealso(SeealsoType newSeealso, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Seealso(), newSeealso, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSeealso(SeealsoType newSeealso) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Seealso(), newSeealso);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SeealsoieType getSeealsoie() {
		return (SeealsoieType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Seealsoie(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSeealsoie(SeealsoieType newSeealsoie, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Seealsoie(), newSeealsoie, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSeealsoie(SeealsoieType newSeealsoie) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Seealsoie(), newSeealsoie);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SeeieType getSeeie() {
		return (SeeieType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Seeie(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSeeie(SeeieType newSeeie, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Seeie(), newSeeie, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSeeie(SeeieType newSeeie) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Seeie(), newSeeie);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SegType getSeg() {
		return (SegType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Seg(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSeg(SegType newSeg, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Seg(), newSeg, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSeg(SegType newSeg) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Seg(), newSeg);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SeglistitemType getSeglistitem() {
		return (SeglistitemType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Seglistitem(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSeglistitem(SeglistitemType newSeglistitem, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Seglistitem(), newSeglistitem, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSeglistitem(SeglistitemType newSeglistitem) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Seglistitem(), newSeglistitem);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SegmentedlistType getSegmentedlist() {
		return (SegmentedlistType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Segmentedlist(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSegmentedlist(SegmentedlistType newSegmentedlist, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Segmentedlist(), newSegmentedlist, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSegmentedlist(SegmentedlistType newSegmentedlist) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Segmentedlist(), newSegmentedlist);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SegtitleType getSegtitle() {
		return (SegtitleType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Segtitle(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSegtitle(SegtitleType newSegtitle, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Segtitle(), newSegtitle, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSegtitle(SegtitleType newSegtitle) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Segtitle(), newSegtitle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SeriesvolnumsType getSeriesvolnums() {
		return (SeriesvolnumsType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Seriesvolnums(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSeriesvolnums(SeriesvolnumsType newSeriesvolnums, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Seriesvolnums(), newSeriesvolnums, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSeriesvolnums(SeriesvolnumsType newSeriesvolnums) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Seriesvolnums(), newSeriesvolnums);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SetType getSet() {
		return (SetType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Set(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSet(SetType newSet, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Set(), newSet, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSet(SetType newSet) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Set(), newSet);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SetindexType getSetindex() {
		return (SetindexType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Setindex(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSetindex(SetindexType newSetindex, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Setindex(), newSetindex, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSetindex(SetindexType newSetindex) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Setindex(), newSetindex);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ShortaffilType getShortaffil() {
		return (ShortaffilType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Shortaffil(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetShortaffil(ShortaffilType newShortaffil, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Shortaffil(), newShortaffil, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShortaffil(ShortaffilType newShortaffil) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Shortaffil(), newShortaffil);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ShortcutType getShortcut() {
		return (ShortcutType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Shortcut(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetShortcut(ShortcutType newShortcut, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Shortcut(), newShortcut, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShortcut(ShortcutType newShortcut) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Shortcut(), newShortcut);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SidebarType getSidebar() {
		return (SidebarType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Sidebar(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSidebar(SidebarType newSidebar, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Sidebar(), newSidebar, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSidebar(SidebarType newSidebar) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Sidebar(), newSidebar);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SimparaType getSimpara() {
		return (SimparaType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Simpara(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSimpara(SimparaType newSimpara, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Simpara(), newSimpara, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSimpara(SimparaType newSimpara) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Simpara(), newSimpara);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SimplelistType getSimplelist() {
		return (SimplelistType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Simplelist(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSimplelist(SimplelistType newSimplelist, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Simplelist(), newSimplelist, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSimplelist(SimplelistType newSimplelist) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Simplelist(), newSimplelist);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SimplemsgentryType getSimplemsgentry() {
		return (SimplemsgentryType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Simplemsgentry(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSimplemsgentry(SimplemsgentryType newSimplemsgentry, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Simplemsgentry(), newSimplemsgentry, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSimplemsgentry(SimplemsgentryType newSimplemsgentry) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Simplemsgentry(), newSimplemsgentry);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SimplesectType getSimplesect() {
		return (SimplesectType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Simplesect(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSimplesect(SimplesectType newSimplesect, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Simplesect(), newSimplesect, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSimplesect(SimplesectType newSimplesect) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Simplesect(), newSimplesect);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SpanspecType getSpanspec() {
		return (SpanspecType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Spanspec(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpanspec(SpanspecType newSpanspec, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Spanspec(), newSpanspec, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSpanspec(SpanspecType newSpanspec) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Spanspec(), newSpanspec);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StateType getState() {
		return (StateType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_State(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetState(StateType newState, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_State(), newState, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setState(StateType newState) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_State(), newState);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StepType getStep() {
		return (StepType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Step(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStep(StepType newStep, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Step(), newStep, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStep(StepType newStep) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Step(), newStep);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StepalternativesType getStepalternatives() {
		return (StepalternativesType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Stepalternatives(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStepalternatives(StepalternativesType newStepalternatives, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Stepalternatives(), newStepalternatives, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStepalternatives(StepalternativesType newStepalternatives) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Stepalternatives(), newStepalternatives);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StreetType getStreet() {
		return (StreetType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Street(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStreet(StreetType newStreet, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Street(), newStreet, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStreet(StreetType newStreet) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Street(), newStreet);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubjectType getSubject() {
		return (SubjectType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Subject(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubject(SubjectType newSubject, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Subject(), newSubject, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSubject(SubjectType newSubject) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Subject(), newSubject);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubjectsetType getSubjectset() {
		return (SubjectsetType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Subjectset(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubjectset(SubjectsetType newSubjectset, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Subjectset(), newSubjectset, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSubjectset(SubjectsetType newSubjectset) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Subjectset(), newSubjectset);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubjecttermType getSubjectterm() {
		return (SubjecttermType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Subjectterm(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubjectterm(SubjecttermType newSubjectterm, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Subjectterm(), newSubjectterm, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSubjectterm(SubjecttermType newSubjectterm) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Subjectterm(), newSubjectterm);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubscriptType getSubscript() {
		return (SubscriptType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Subscript(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubscript(SubscriptType newSubscript, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Subscript(), newSubscript, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSubscript(SubscriptType newSubscript) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Subscript(), newSubscript);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubstepsType getSubsteps() {
		return (SubstepsType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Substeps(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubsteps(SubstepsType newSubsteps, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Substeps(), newSubsteps, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSubsteps(SubstepsType newSubsteps) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Substeps(), newSubsteps);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubtitleType getSubtitle() {
		return (SubtitleType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Subtitle(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubtitle(SubtitleType newSubtitle, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Subtitle(), newSubtitle, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSubtitle(SubtitleType newSubtitle) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Subtitle(), newSubtitle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SuperscriptType getSuperscript() {
		return (SuperscriptType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Superscript(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSuperscript(SuperscriptType newSuperscript, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Superscript(), newSuperscript, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSuperscript(SuperscriptType newSuperscript) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Superscript(), newSuperscript);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SurnameType getSurname() {
		return (SurnameType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Surname(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSurname(SurnameType newSurname, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Surname(), newSurname, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSurname(SurnameType newSurname) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Surname(), newSurname);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SymbolType getSymbol() {
		return (SymbolType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Symbol(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSymbol(SymbolType newSymbol, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Symbol(), newSymbol, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSymbol(SymbolType newSymbol) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Symbol(), newSymbol);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SynopfragmentType getSynopfragment() {
		return (SynopfragmentType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Synopfragment(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSynopfragment(SynopfragmentType newSynopfragment, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Synopfragment(), newSynopfragment, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSynopfragment(SynopfragmentType newSynopfragment) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Synopfragment(), newSynopfragment);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SynopfragmentrefType getSynopfragmentref() {
		return (SynopfragmentrefType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Synopfragmentref(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSynopfragmentref(SynopfragmentrefType newSynopfragmentref, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Synopfragmentref(), newSynopfragmentref, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSynopfragmentref(SynopfragmentrefType newSynopfragmentref) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Synopfragmentref(), newSynopfragmentref);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SynopsisType getSynopsis() {
		return (SynopsisType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Synopsis(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSynopsis(SynopsisType newSynopsis, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Synopsis(), newSynopsis, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSynopsis(SynopsisType newSynopsis) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Synopsis(), newSynopsis);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SystemitemType getSystemitem() {
		return (SystemitemType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Systemitem(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSystemitem(SystemitemType newSystemitem, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Systemitem(), newSystemitem, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSystemitem(SystemitemType newSystemitem) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Systemitem(), newSystemitem);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TableType getTable() {
		return (TableType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Table(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTable(TableType newTable, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Table(), newTable, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTable(TableType newTable) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Table(), newTable);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TagType getTag() {
		return (TagType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Tag(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTag(TagType newTag, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Tag(), newTag, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTag(TagType newTag) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Tag(), newTag);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TaskType getTask() {
		return (TaskType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Task(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTask(TaskType newTask, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Task(), newTask, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTask(TaskType newTask) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Task(), newTask);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TaskprerequisitesType getTaskprerequisites() {
		return (TaskprerequisitesType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Taskprerequisites(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTaskprerequisites(TaskprerequisitesType newTaskprerequisites, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Taskprerequisites(), newTaskprerequisites, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTaskprerequisites(TaskprerequisitesType newTaskprerequisites) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Taskprerequisites(), newTaskprerequisites);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TaskrelatedType getTaskrelated() {
		return (TaskrelatedType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Taskrelated(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTaskrelated(TaskrelatedType newTaskrelated, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Taskrelated(), newTaskrelated, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTaskrelated(TaskrelatedType newTaskrelated) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Taskrelated(), newTaskrelated);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TasksummaryType getTasksummary() {
		return (TasksummaryType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Tasksummary(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTasksummary(TasksummaryType newTasksummary, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Tasksummary(), newTasksummary, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTasksummary(TasksummaryType newTasksummary) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Tasksummary(), newTasksummary);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TbodyType getTbody() {
		return (TbodyType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Tbody(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTbody(TbodyType newTbody, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Tbody(), newTbody, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTbody(TbodyType newTbody) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Tbody(), newTbody);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TdType getTd() {
		return (TdType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Td(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTd(TdType newTd, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Td(), newTd, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTd(TdType newTd) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Td(), newTd);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TermType getTerm() {
		return (TermType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Term(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTerm(TermType newTerm, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Term(), newTerm, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTerm(TermType newTerm) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Term(), newTerm);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TermdefType getTermdef() {
		return (TermdefType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Termdef(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTermdef(TermdefType newTermdef, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Termdef(), newTermdef, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTermdef(TermdefType newTermdef) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Termdef(), newTermdef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TertiaryType getTertiary() {
		return (TertiaryType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Tertiary(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTertiary(TertiaryType newTertiary, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Tertiary(), newTertiary, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTertiary(TertiaryType newTertiary) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Tertiary(), newTertiary);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TertiaryieType getTertiaryie() {
		return (TertiaryieType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Tertiaryie(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTertiaryie(TertiaryieType newTertiaryie, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Tertiaryie(), newTertiaryie, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTertiaryie(TertiaryieType newTertiaryie) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Tertiaryie(), newTertiaryie);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TextdataType getTextdata() {
		return (TextdataType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Textdata(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTextdata(TextdataType newTextdata, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Textdata(), newTextdata, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTextdata(TextdataType newTextdata) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Textdata(), newTextdata);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TextobjectType getTextobject() {
		return (TextobjectType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Textobject(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTextobject(TextobjectType newTextobject, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Textobject(), newTextobject, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTextobject(TextobjectType newTextobject) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Textobject(), newTextobject);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TfootType getTfoot() {
		return (TfootType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Tfoot(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTfoot(TfootType newTfoot, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Tfoot(), newTfoot, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTfoot(TfootType newTfoot) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Tfoot(), newTfoot);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TgroupType getTgroup() {
		return (TgroupType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Tgroup(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTgroup(TgroupType newTgroup, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Tgroup(), newTgroup, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTgroup(TgroupType newTgroup) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Tgroup(), newTgroup);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ThType getTh() {
		return (ThType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Th(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTh(ThType newTh, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Th(), newTh, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTh(ThType newTh) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Th(), newTh);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TheadType getThead() {
		return (TheadType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Thead(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetThead(TheadType newThead, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Thead(), newThead, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setThead(TheadType newThead) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Thead(), newThead);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TipType getTip() {
		return (TipType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Tip(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTip(TipType newTip, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Tip(), newTip, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTip(TipType newTip) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Tip(), newTip);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TitleType getTitle() {
		return (TitleType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Title(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTitle(TitleType newTitle, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Title(), newTitle, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTitle(TitleType newTitle) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Title(), newTitle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TitleabbrevType getTitleabbrev() {
		return (TitleabbrevType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Titleabbrev(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTitleabbrev(TitleabbrevType newTitleabbrev, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Titleabbrev(), newTitleabbrev, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTitleabbrev(TitleabbrevType newTitleabbrev) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Titleabbrev(), newTitleabbrev);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TocType getToc() {
		return (TocType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Toc(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetToc(TocType newToc, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Toc(), newToc, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setToc(TocType newToc) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Toc(), newToc);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TocdivType getTocdiv() {
		return (TocdivType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Tocdiv(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTocdiv(TocdivType newTocdiv, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Tocdiv(), newTocdiv, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTocdiv(TocdivType newTocdiv) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Tocdiv(), newTocdiv);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TocentryType getTocentry() {
		return (TocentryType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Tocentry(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTocentry(TocentryType newTocentry, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Tocentry(), newTocentry, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTocentry(TocentryType newTocentry) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Tocentry(), newTocentry);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TokenType getToken() {
		return (TokenType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Token(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetToken(TokenType newToken, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Token(), newToken, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setToken(TokenType newToken) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Token(), newToken);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TrType getTr() {
		return (TrType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Tr(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTr(TrType newTr, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Tr(), newTr, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTr(TrType newTr) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Tr(), newTr);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TrademarkType getTrademark() {
		return (TrademarkType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Trademark(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTrademark(TrademarkType newTrademark, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Trademark(), newTrademark, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTrademark(TrademarkType newTrademark) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Trademark(), newTrademark);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TypeType2 getType() {
		return (TypeType2)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Type(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(TypeType2 newType, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Type(), newType, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(TypeType2 newType) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Type(), newType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UriType getUri() {
		return (UriType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Uri(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUri(UriType newUri, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Uri(), newUri, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUri(UriType newUri) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Uri(), newUri);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UserinputType getUserinput() {
		return (UserinputType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Userinput(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUserinput(UserinputType newUserinput, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Userinput(), newUserinput, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUserinput(UserinputType newUserinput) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Userinput(), newUserinput);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VarargsType getVarargs() {
		return (VarargsType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Varargs(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVarargs(VarargsType newVarargs, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Varargs(), newVarargs, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVarargs(VarargsType newVarargs) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Varargs(), newVarargs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VariablelistType getVariablelist() {
		return (VariablelistType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Variablelist(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVariablelist(VariablelistType newVariablelist, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Variablelist(), newVariablelist, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVariablelist(VariablelistType newVariablelist) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Variablelist(), newVariablelist);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VarlistentryType getVarlistentry() {
		return (VarlistentryType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Varlistentry(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVarlistentry(VarlistentryType newVarlistentry, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Varlistentry(), newVarlistentry, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVarlistentry(VarlistentryType newVarlistentry) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Varlistentry(), newVarlistentry);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VarnameType getVarname() {
		return (VarnameType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Varname(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVarname(VarnameType newVarname, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Varname(), newVarname, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVarname(VarnameType newVarname) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Varname(), newVarname);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VideodataType getVideodata() {
		return (VideodataType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Videodata(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVideodata(VideodataType newVideodata, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Videodata(), newVideodata, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVideodata(VideodataType newVideodata) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Videodata(), newVideodata);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VideoobjectType getVideoobject() {
		return (VideoobjectType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Videoobject(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVideoobject(VideoobjectType newVideoobject, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Videoobject(), newVideoobject, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVideoobject(VideoobjectType newVideoobject) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Videoobject(), newVideoobject);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VoidType getVoid() {
		return (VoidType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Void(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVoid(VoidType newVoid, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Void(), newVoid, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVoid(VoidType newVoid) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Void(), newVoid);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VolumenumType getVolumenum() {
		return (VolumenumType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Volumenum(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVolumenum(VolumenumType newVolumenum, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Volumenum(), newVolumenum, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVolumenum(VolumenumType newVolumenum) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Volumenum(), newVolumenum);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WarningType getWarning() {
		return (WarningType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Warning(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWarning(WarningType newWarning, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Warning(), newWarning, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWarning(WarningType newWarning) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Warning(), newWarning);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WordaswordType getWordasword() {
		return (WordaswordType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Wordasword(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWordasword(WordaswordType newWordasword, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Wordasword(), newWordasword, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWordasword(WordaswordType newWordasword) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Wordasword(), newWordasword);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XrefType getXref() {
		return (XrefType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Xref(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetXref(XrefType newXref, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Xref(), newXref, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setXref(XrefType newXref) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Xref(), newXref);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public YearType getYear() {
		return (YearType)getMixed().get(DocbookPackage.eINSTANCE.getDocumentRoot_Year(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetYear(YearType newYear, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DocbookPackage.eINSTANCE.getDocumentRoot_Year(), newYear, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setYear(YearType newYear) {
		((FeatureMap.Internal)getMixed()).set(DocbookPackage.eINSTANCE.getDocumentRoot_Year(), newYear);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DocbookPackage.DOCUMENT_ROOT__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case DocbookPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return ((InternalEList<?>)getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
			case DocbookPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return ((InternalEList<?>)getXSISchemaLocation()).basicRemove(otherEnd, msgs);
			case DocbookPackage.DOCUMENT_ROOT__ABBREV:
				return basicSetAbbrev(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__ABSTRACT:
				return basicSetAbstract(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__ACCEL:
				return basicSetAccel(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__ACKNOWLEDGEMENTS:
				return basicSetAcknowledgements(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__ACRONYM:
				return basicSetAcronym(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__ADDRESS:
				return basicSetAddress(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__AFFILIATION:
				return basicSetAffiliation(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__ALT:
				return basicSetAlt(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__ANCHOR:
				return basicSetAnchor(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__ANNOTATION:
				return basicSetAnnotation(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__ANSWER:
				return basicSetAnswer(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__APPENDIX:
				return basicSetAppendix(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__APPLICATION:
				return basicSetApplication(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__ARC:
				return basicSetArc(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__AREA:
				return basicSetArea(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__AREASET:
				return basicSetAreaset(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__AREASPEC:
				return basicSetAreaspec(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__ARG:
				return basicSetArg(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__ARTICLE:
				return basicSetArticle(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__ARTPAGENUMS:
				return basicSetArtpagenums(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__ATTRIBUTION:
				return basicSetAttribution(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__AUDIODATA:
				return basicSetAudiodata(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__AUDIOOBJECT:
				return basicSetAudioobject(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__AUTHOR:
				return basicSetAuthor(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__AUTHORGROUP:
				return basicSetAuthorgroup(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__AUTHORINITIALS:
				return basicSetAuthorinitials(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__BIBLIOCOVERAGE:
				return basicSetBibliocoverage(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__BIBLIODIV:
				return basicSetBibliodiv(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__BIBLIOENTRY:
				return basicSetBiblioentry(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__BIBLIOGRAPHY:
				return basicSetBibliography(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__BIBLIOID:
				return basicSetBiblioid(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__BIBLIOLIST:
				return basicSetBibliolist(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__BIBLIOMISC:
				return basicSetBibliomisc(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__BIBLIOMIXED:
				return basicSetBibliomixed(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__BIBLIOMSET:
				return basicSetBibliomset(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__BIBLIOREF:
				return basicSetBiblioref(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__BIBLIORELATION:
				return basicSetBibliorelation(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__BIBLIOSET:
				return basicSetBiblioset(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__BIBLIOSOURCE:
				return basicSetBibliosource(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__BLOCKQUOTE:
				return basicSetBlockquote(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__BOOK:
				return basicSetBook(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__BRIDGEHEAD:
				return basicSetBridgehead(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__CALLOUT:
				return basicSetCallout(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__CALLOUTLIST:
				return basicSetCalloutlist(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__CAPTION:
				return basicSetCaption(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__CAUTION:
				return basicSetCaution(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__CHAPTER:
				return basicSetChapter(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__CITATION:
				return basicSetCitation(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__CITEBIBLIOID:
				return basicSetCitebiblioid(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__CITEREFENTRY:
				return basicSetCiterefentry(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__CITETITLE:
				return basicSetCitetitle(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__CITY:
				return basicSetCity(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__CLASSNAME:
				return basicSetClassname(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__CLASSSYNOPSIS:
				return basicSetClasssynopsis(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__CLASSSYNOPSISINFO:
				return basicSetClasssynopsisinfo(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__CMDSYNOPSIS:
				return basicSetCmdsynopsis(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__CO:
				return basicSetCo(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__CODE:
				return basicSetCode(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__COL:
				return basicSetCol(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__COLGROUP:
				return basicSetColgroup(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__COLLAB:
				return basicSetCollab(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__COLOPHON:
				return basicSetColophon(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__COLSPEC:
				return basicSetColspec(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__COMMAND:
				return basicSetCommand(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__COMPUTEROUTPUT:
				return basicSetComputeroutput(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__CONFDATES:
				return basicSetConfdates(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__CONFGROUP:
				return basicSetConfgroup(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__CONFNUM:
				return basicSetConfnum(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__CONFSPONSOR:
				return basicSetConfsponsor(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__CONFTITLE:
				return basicSetConftitle(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__CONSTANT:
				return basicSetConstant(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__CONSTRAINT:
				return basicSetConstraint(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__CONSTRAINTDEF:
				return basicSetConstraintdef(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__CONSTRUCTORSYNOPSIS:
				return basicSetConstructorsynopsis(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__CONTRACTNUM:
				return basicSetContractnum(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__CONTRACTSPONSOR:
				return basicSetContractsponsor(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__CONTRIB:
				return basicSetContrib(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__COPYRIGHT:
				return basicSetCopyright(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__COREF:
				return basicSetCoref(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__COUNTRY:
				return basicSetCountry(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__COVER:
				return basicSetCover(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__DATABASE:
				return basicSetDatabase(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__DATE:
				return basicSetDate(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__DEDICATION:
				return basicSetDedication(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__DESTRUCTORSYNOPSIS:
				return basicSetDestructorsynopsis(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__EDITION:
				return basicSetEdition(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__EDITOR:
				return basicSetEditor(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__EMAIL:
				return basicSetEmail(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__EMPHASIS:
				return basicSetEmphasis(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__ENTRY:
				return basicSetEntry(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__ENTRYTBL:
				return basicSetEntrytbl(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__ENVAR:
				return basicSetEnvar(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__EPIGRAPH:
				return basicSetEpigraph(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__EQUATION:
				return basicSetEquation(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__ERRORCODE:
				return basicSetErrorcode(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__ERRORNAME:
				return basicSetErrorname(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__ERRORTEXT:
				return basicSetErrortext(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__ERRORTYPE:
				return basicSetErrortype(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__EXAMPLE:
				return basicSetExample(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__EXCEPTIONNAME:
				return basicSetExceptionname(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__EXTENDEDLINK:
				return basicSetExtendedlink(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__FAX:
				return basicSetFax(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__FIELDSYNOPSIS:
				return basicSetFieldsynopsis(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__FIGURE:
				return basicSetFigure(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__FILENAME:
				return basicSetFilename(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__FIRSTNAME:
				return basicSetFirstname(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__FIRSTTERM:
				return basicSetFirstterm(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__FOOTNOTE:
				return basicSetFootnote(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__FOOTNOTEREF:
				return basicSetFootnoteref(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__FOREIGNPHRASE:
				return basicSetForeignphrase(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__FORMALPARA:
				return basicSetFormalpara(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__FUNCDEF:
				return basicSetFuncdef(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__FUNCPARAMS:
				return basicSetFuncparams(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__FUNCPROTOTYPE:
				return basicSetFuncprototype(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__FUNCSYNOPSIS:
				return basicSetFuncsynopsis(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__FUNCSYNOPSISINFO:
				return basicSetFuncsynopsisinfo(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__FUNCTION:
				return basicSetFunction(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__GLOSSARY:
				return basicSetGlossary(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__GLOSSDEF:
				return basicSetGlossdef(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__GLOSSDIV:
				return basicSetGlossdiv(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__GLOSSENTRY:
				return basicSetGlossentry(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__GLOSSLIST:
				return basicSetGlosslist(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__GLOSSSEE:
				return basicSetGlosssee(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__GLOSSSEEALSO:
				return basicSetGlossseealso(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__GLOSSTERM:
				return basicSetGlossterm(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__GROUP:
				return basicSetGroup(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__GUIBUTTON:
				return basicSetGuibutton(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__GUIICON:
				return basicSetGuiicon(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__GUILABEL:
				return basicSetGuilabel(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__GUIMENU:
				return basicSetGuimenu(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__GUIMENUITEM:
				return basicSetGuimenuitem(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__GUISUBMENU:
				return basicSetGuisubmenu(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__HARDWARE:
				return basicSetHardware(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__HOLDER:
				return basicSetHolder(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__HONORIFIC:
				return basicSetHonorific(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__IMAGEDATA:
				return basicSetImagedata(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__IMAGEOBJECT:
				return basicSetImageobject(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__IMAGEOBJECTCO:
				return basicSetImageobjectco(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__IMPORTANT:
				return basicSetImportant(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__INDEX:
				return basicSetIndex(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__INDEXDIV:
				return basicSetIndexdiv(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__INDEXENTRY:
				return basicSetIndexentry(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__INDEXTERM:
				return basicSetIndexterm(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__INFO:
				return basicSetInfo(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__INFORMALEQUATION:
				return basicSetInformalequation(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__INFORMALEXAMPLE:
				return basicSetInformalexample(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__INFORMALFIGURE:
				return basicSetInformalfigure(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__INFORMALTABLE:
				return basicSetInformaltable(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__INITIALIZER:
				return basicSetInitializer(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__INLINEEQUATION:
				return basicSetInlineequation(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__INLINEMEDIAOBJECT:
				return basicSetInlinemediaobject(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__INTERFACENAME:
				return basicSetInterfacename(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__ISSUENUM:
				return basicSetIssuenum(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__ITEMIZEDLIST:
				return basicSetItemizedlist(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__ITERMSET:
				return basicSetItermset(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__JOBTITLE:
				return basicSetJobtitle(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__KEYCAP:
				return basicSetKeycap(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__KEYCODE:
				return basicSetKeycode(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__KEYCOMBO:
				return basicSetKeycombo(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__KEYSYM:
				return basicSetKeysym(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__KEYWORD:
				return basicSetKeyword(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__KEYWORDSET:
				return basicSetKeywordset(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__LABEL:
				return basicSetLabel(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__LEGALNOTICE:
				return basicSetLegalnotice(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__LHS:
				return basicSetLhs(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__LINEAGE:
				return basicSetLineage(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__LINEANNOTATION:
				return basicSetLineannotation(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__LINK:
				return basicSetLink(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__LISTITEM:
				return basicSetListitem(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__LITERAL:
				return basicSetLiteral(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__LITERALLAYOUT:
				return basicSetLiterallayout(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__LOCATOR:
				return basicSetLocator(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__MANVOLNUM:
				return basicSetManvolnum(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__MARKUP:
				return basicSetMarkup(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__MATHPHRASE:
				return basicSetMathphrase(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__MEDIAOBJECT:
				return basicSetMediaobject(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__MEMBER:
				return basicSetMember(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__MENUCHOICE:
				return basicSetMenuchoice(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__METHODNAME:
				return basicSetMethodname(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__METHODPARAM:
				return basicSetMethodparam(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__METHODSYNOPSIS:
				return basicSetMethodsynopsis(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__MODIFIER:
				return basicSetModifier(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__MOUSEBUTTON:
				return basicSetMousebutton(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__MSG:
				return basicSetMsg(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__MSGAUD:
				return basicSetMsgaud(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__MSGENTRY:
				return basicSetMsgentry(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__MSGEXPLAN:
				return basicSetMsgexplan(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__MSGINFO:
				return basicSetMsginfo(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__MSGLEVEL:
				return basicSetMsglevel(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__MSGMAIN:
				return basicSetMsgmain(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__MSGORIG:
				return basicSetMsgorig(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__MSGREL:
				return basicSetMsgrel(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__MSGSET:
				return basicSetMsgset(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__MSGSUB:
				return basicSetMsgsub(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__MSGTEXT:
				return basicSetMsgtext(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__NONTERMINAL:
				return basicSetNonterminal(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__NOTE:
				return basicSetNote(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__OLINK:
				return basicSetOlink(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__OOCLASS:
				return basicSetOoclass(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__OOEXCEPTION:
				return basicSetOoexception(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__OOINTERFACE:
				return basicSetOointerface(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__OPTION:
				return basicSetOption(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__OPTIONAL:
				return basicSetOptional(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__ORDEREDLIST:
				return basicSetOrderedlist(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__ORG:
				return basicSetOrg(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__ORGDIV:
				return basicSetOrgdiv(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__ORGNAME:
				return basicSetOrgname(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__OTHERADDR:
				return basicSetOtheraddr(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__OTHERCREDIT:
				return basicSetOthercredit(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__OTHERNAME:
				return basicSetOthername(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__PACKAGE:
				return basicSetPackage(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__PAGENUMS:
				return basicSetPagenums(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__PARA:
				return basicSetPara(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__PARAMDEF:
				return basicSetParamdef(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__PARAMETER:
				return basicSetParameter(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__PART:
				return basicSetPart(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__PARTINTRO:
				return basicSetPartintro(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__PERSON:
				return basicSetPerson(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__PERSONBLURB:
				return basicSetPersonblurb(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__PERSONNAME:
				return basicSetPersonname(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__PHONE:
				return basicSetPhone(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__PHRASE:
				return basicSetPhrase(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__POB:
				return basicSetPob(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__POSTCODE:
				return basicSetPostcode(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__PREFACE:
				return basicSetPreface(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__PRIMARY:
				return basicSetPrimary(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__PRIMARYIE:
				return basicSetPrimaryie(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__PRINTHISTORY:
				return basicSetPrinthistory(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__PROCEDURE:
				return basicSetProcedure(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__PRODUCTION:
				return basicSetProduction(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__PRODUCTIONRECAP:
				return basicSetProductionrecap(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__PRODUCTIONSET:
				return basicSetProductionset(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__PRODUCTNAME:
				return basicSetProductname(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__PRODUCTNUMBER:
				return basicSetProductnumber(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__PROGRAMLISTING:
				return basicSetProgramlisting(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__PROGRAMLISTINGCO:
				return basicSetProgramlistingco(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__PROMPT:
				return basicSetPrompt(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__PROPERTY:
				return basicSetProperty(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__PUBDATE:
				return basicSetPubdate(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__PUBLISHER:
				return basicSetPublisher(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__PUBLISHERNAME:
				return basicSetPublishername(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__QANDADIV:
				return basicSetQandadiv(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__QANDAENTRY:
				return basicSetQandaentry(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__QANDASET:
				return basicSetQandaset(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__QUESTION:
				return basicSetQuestion(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__QUOTE:
				return basicSetQuote(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__REFCLASS:
				return basicSetRefclass(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__REFDESCRIPTOR:
				return basicSetRefdescriptor(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__REFENTRY:
				return basicSetRefentry(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__REFENTRYTITLE:
				return basicSetRefentrytitle(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__REFERENCE:
				return basicSetReference(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__REFMETA:
				return basicSetRefmeta(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__REFMISCINFO:
				return basicSetRefmiscinfo(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__REFNAME:
				return basicSetRefname(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__REFNAMEDIV:
				return basicSetRefnamediv(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__REFPURPOSE:
				return basicSetRefpurpose(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__REFSECT1:
				return basicSetRefsect1(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__REFSECT2:
				return basicSetRefsect2(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__REFSECT3:
				return basicSetRefsect3(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__REFSECTION:
				return basicSetRefsection(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__REFSYNOPSISDIV:
				return basicSetRefsynopsisdiv(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__RELEASEINFO:
				return basicSetReleaseinfo(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__REMARK:
				return basicSetRemark(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__REPLACEABLE:
				return basicSetReplaceable(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__RETURNVALUE:
				return basicSetReturnvalue(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__REVDESCRIPTION:
				return basicSetRevdescription(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__REVHISTORY:
				return basicSetRevhistory(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__REVISION:
				return basicSetRevision(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__REVNUMBER:
				return basicSetRevnumber(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__REVREMARK:
				return basicSetRevremark(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__RHS:
				return basicSetRhs(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__ROW:
				return basicSetRow(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__SBR:
				return basicSetSbr(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__SCREEN:
				return basicSetScreen(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__SCREENCO:
				return basicSetScreenco(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__SCREENSHOT:
				return basicSetScreenshot(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__SECONDARY:
				return basicSetSecondary(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__SECONDARYIE:
				return basicSetSecondaryie(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__SECT1:
				return basicSetSect1(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__SECT2:
				return basicSetSect2(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__SECT3:
				return basicSetSect3(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__SECT4:
				return basicSetSect4(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__SECT5:
				return basicSetSect5(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__SECTION:
				return basicSetSection(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__SEE:
				return basicSetSee(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__SEEALSO:
				return basicSetSeealso(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__SEEALSOIE:
				return basicSetSeealsoie(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__SEEIE:
				return basicSetSeeie(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__SEG:
				return basicSetSeg(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__SEGLISTITEM:
				return basicSetSeglistitem(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__SEGMENTEDLIST:
				return basicSetSegmentedlist(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__SEGTITLE:
				return basicSetSegtitle(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__SERIESVOLNUMS:
				return basicSetSeriesvolnums(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__SET:
				return basicSetSet(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__SETINDEX:
				return basicSetSetindex(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__SHORTAFFIL:
				return basicSetShortaffil(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__SHORTCUT:
				return basicSetShortcut(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__SIDEBAR:
				return basicSetSidebar(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__SIMPARA:
				return basicSetSimpara(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__SIMPLELIST:
				return basicSetSimplelist(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__SIMPLEMSGENTRY:
				return basicSetSimplemsgentry(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__SIMPLESECT:
				return basicSetSimplesect(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__SPANSPEC:
				return basicSetSpanspec(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__STATE:
				return basicSetState(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__STEP:
				return basicSetStep(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__STEPALTERNATIVES:
				return basicSetStepalternatives(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__STREET:
				return basicSetStreet(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__SUBJECT:
				return basicSetSubject(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__SUBJECTSET:
				return basicSetSubjectset(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__SUBJECTTERM:
				return basicSetSubjectterm(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__SUBSCRIPT:
				return basicSetSubscript(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__SUBSTEPS:
				return basicSetSubsteps(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__SUBTITLE:
				return basicSetSubtitle(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__SUPERSCRIPT:
				return basicSetSuperscript(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__SURNAME:
				return basicSetSurname(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__SYMBOL:
				return basicSetSymbol(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__SYNOPFRAGMENT:
				return basicSetSynopfragment(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__SYNOPFRAGMENTREF:
				return basicSetSynopfragmentref(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__SYNOPSIS:
				return basicSetSynopsis(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__SYSTEMITEM:
				return basicSetSystemitem(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__TABLE:
				return basicSetTable(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__TAG:
				return basicSetTag(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__TASK:
				return basicSetTask(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__TASKPREREQUISITES:
				return basicSetTaskprerequisites(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__TASKRELATED:
				return basicSetTaskrelated(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__TASKSUMMARY:
				return basicSetTasksummary(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__TBODY:
				return basicSetTbody(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__TD:
				return basicSetTd(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__TERM:
				return basicSetTerm(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__TERMDEF:
				return basicSetTermdef(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__TERTIARY:
				return basicSetTertiary(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__TERTIARYIE:
				return basicSetTertiaryie(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__TEXTDATA:
				return basicSetTextdata(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__TEXTOBJECT:
				return basicSetTextobject(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__TFOOT:
				return basicSetTfoot(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__TGROUP:
				return basicSetTgroup(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__TH:
				return basicSetTh(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__THEAD:
				return basicSetThead(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__TIP:
				return basicSetTip(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__TITLE:
				return basicSetTitle(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__TITLEABBREV:
				return basicSetTitleabbrev(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__TOC:
				return basicSetToc(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__TOCDIV:
				return basicSetTocdiv(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__TOCENTRY:
				return basicSetTocentry(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__TOKEN:
				return basicSetToken(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__TR:
				return basicSetTr(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__TRADEMARK:
				return basicSetTrademark(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__TYPE:
				return basicSetType(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__URI:
				return basicSetUri(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__USERINPUT:
				return basicSetUserinput(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__VARARGS:
				return basicSetVarargs(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__VARIABLELIST:
				return basicSetVariablelist(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__VARLISTENTRY:
				return basicSetVarlistentry(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__VARNAME:
				return basicSetVarname(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__VIDEODATA:
				return basicSetVideodata(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__VIDEOOBJECT:
				return basicSetVideoobject(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__VOID:
				return basicSetVoid(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__VOLUMENUM:
				return basicSetVolumenum(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__WARNING:
				return basicSetWarning(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__WORDASWORD:
				return basicSetWordasword(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__XREF:
				return basicSetXref(null, msgs);
			case DocbookPackage.DOCUMENT_ROOT__YEAR:
				return basicSetYear(null, msgs);
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
			case DocbookPackage.DOCUMENT_ROOT__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case DocbookPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				if (coreType) return getXMLNSPrefixMap();
				else return getXMLNSPrefixMap().map();
			case DocbookPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				if (coreType) return getXSISchemaLocation();
				else return getXSISchemaLocation().map();
			case DocbookPackage.DOCUMENT_ROOT__ABBREV:
				return getAbbrev();
			case DocbookPackage.DOCUMENT_ROOT__ABSTRACT:
				return getAbstract();
			case DocbookPackage.DOCUMENT_ROOT__ACCEL:
				return getAccel();
			case DocbookPackage.DOCUMENT_ROOT__ACKNOWLEDGEMENTS:
				return getAcknowledgements();
			case DocbookPackage.DOCUMENT_ROOT__ACRONYM:
				return getAcronym();
			case DocbookPackage.DOCUMENT_ROOT__ADDRESS:
				return getAddress();
			case DocbookPackage.DOCUMENT_ROOT__AFFILIATION:
				return getAffiliation();
			case DocbookPackage.DOCUMENT_ROOT__ALT:
				return getAlt();
			case DocbookPackage.DOCUMENT_ROOT__ANCHOR:
				return getAnchor();
			case DocbookPackage.DOCUMENT_ROOT__ANNOTATION:
				return getAnnotation();
			case DocbookPackage.DOCUMENT_ROOT__ANSWER:
				return getAnswer();
			case DocbookPackage.DOCUMENT_ROOT__APPENDIX:
				return getAppendix();
			case DocbookPackage.DOCUMENT_ROOT__APPLICATION:
				return getApplication();
			case DocbookPackage.DOCUMENT_ROOT__ARC:
				return getArc();
			case DocbookPackage.DOCUMENT_ROOT__AREA:
				return getArea();
			case DocbookPackage.DOCUMENT_ROOT__AREASET:
				return getAreaset();
			case DocbookPackage.DOCUMENT_ROOT__AREASPEC:
				return getAreaspec();
			case DocbookPackage.DOCUMENT_ROOT__ARG:
				return getArg();
			case DocbookPackage.DOCUMENT_ROOT__ARTICLE:
				return getArticle();
			case DocbookPackage.DOCUMENT_ROOT__ARTPAGENUMS:
				return getArtpagenums();
			case DocbookPackage.DOCUMENT_ROOT__ATTRIBUTION:
				return getAttribution();
			case DocbookPackage.DOCUMENT_ROOT__AUDIODATA:
				return getAudiodata();
			case DocbookPackage.DOCUMENT_ROOT__AUDIOOBJECT:
				return getAudioobject();
			case DocbookPackage.DOCUMENT_ROOT__AUTHOR:
				return getAuthor();
			case DocbookPackage.DOCUMENT_ROOT__AUTHORGROUP:
				return getAuthorgroup();
			case DocbookPackage.DOCUMENT_ROOT__AUTHORINITIALS:
				return getAuthorinitials();
			case DocbookPackage.DOCUMENT_ROOT__BIBLIOCOVERAGE:
				return getBibliocoverage();
			case DocbookPackage.DOCUMENT_ROOT__BIBLIODIV:
				return getBibliodiv();
			case DocbookPackage.DOCUMENT_ROOT__BIBLIOENTRY:
				return getBiblioentry();
			case DocbookPackage.DOCUMENT_ROOT__BIBLIOGRAPHY:
				return getBibliography();
			case DocbookPackage.DOCUMENT_ROOT__BIBLIOID:
				return getBiblioid();
			case DocbookPackage.DOCUMENT_ROOT__BIBLIOLIST:
				return getBibliolist();
			case DocbookPackage.DOCUMENT_ROOT__BIBLIOMISC:
				return getBibliomisc();
			case DocbookPackage.DOCUMENT_ROOT__BIBLIOMIXED:
				return getBibliomixed();
			case DocbookPackage.DOCUMENT_ROOT__BIBLIOMSET:
				return getBibliomset();
			case DocbookPackage.DOCUMENT_ROOT__BIBLIOREF:
				return getBiblioref();
			case DocbookPackage.DOCUMENT_ROOT__BIBLIORELATION:
				return getBibliorelation();
			case DocbookPackage.DOCUMENT_ROOT__BIBLIOSET:
				return getBiblioset();
			case DocbookPackage.DOCUMENT_ROOT__BIBLIOSOURCE:
				return getBibliosource();
			case DocbookPackage.DOCUMENT_ROOT__BLOCKQUOTE:
				return getBlockquote();
			case DocbookPackage.DOCUMENT_ROOT__BOOK:
				return getBook();
			case DocbookPackage.DOCUMENT_ROOT__BRIDGEHEAD:
				return getBridgehead();
			case DocbookPackage.DOCUMENT_ROOT__CALLOUT:
				return getCallout();
			case DocbookPackage.DOCUMENT_ROOT__CALLOUTLIST:
				return getCalloutlist();
			case DocbookPackage.DOCUMENT_ROOT__CAPTION:
				return getCaption();
			case DocbookPackage.DOCUMENT_ROOT__CAUTION:
				return getCaution();
			case DocbookPackage.DOCUMENT_ROOT__CHAPTER:
				return getChapter();
			case DocbookPackage.DOCUMENT_ROOT__CITATION:
				return getCitation();
			case DocbookPackage.DOCUMENT_ROOT__CITEBIBLIOID:
				return getCitebiblioid();
			case DocbookPackage.DOCUMENT_ROOT__CITEREFENTRY:
				return getCiterefentry();
			case DocbookPackage.DOCUMENT_ROOT__CITETITLE:
				return getCitetitle();
			case DocbookPackage.DOCUMENT_ROOT__CITY:
				return getCity();
			case DocbookPackage.DOCUMENT_ROOT__CLASSNAME:
				return getClassname();
			case DocbookPackage.DOCUMENT_ROOT__CLASSSYNOPSIS:
				return getClasssynopsis();
			case DocbookPackage.DOCUMENT_ROOT__CLASSSYNOPSISINFO:
				return getClasssynopsisinfo();
			case DocbookPackage.DOCUMENT_ROOT__CMDSYNOPSIS:
				return getCmdsynopsis();
			case DocbookPackage.DOCUMENT_ROOT__CO:
				return getCo();
			case DocbookPackage.DOCUMENT_ROOT__CODE:
				return getCode();
			case DocbookPackage.DOCUMENT_ROOT__COL:
				return getCol();
			case DocbookPackage.DOCUMENT_ROOT__COLGROUP:
				return getColgroup();
			case DocbookPackage.DOCUMENT_ROOT__COLLAB:
				return getCollab();
			case DocbookPackage.DOCUMENT_ROOT__COLOPHON:
				return getColophon();
			case DocbookPackage.DOCUMENT_ROOT__COLSPEC:
				return getColspec();
			case DocbookPackage.DOCUMENT_ROOT__COMMAND:
				return getCommand();
			case DocbookPackage.DOCUMENT_ROOT__COMPUTEROUTPUT:
				return getComputeroutput();
			case DocbookPackage.DOCUMENT_ROOT__CONFDATES:
				return getConfdates();
			case DocbookPackage.DOCUMENT_ROOT__CONFGROUP:
				return getConfgroup();
			case DocbookPackage.DOCUMENT_ROOT__CONFNUM:
				return getConfnum();
			case DocbookPackage.DOCUMENT_ROOT__CONFSPONSOR:
				return getConfsponsor();
			case DocbookPackage.DOCUMENT_ROOT__CONFTITLE:
				return getConftitle();
			case DocbookPackage.DOCUMENT_ROOT__CONSTANT:
				return getConstant();
			case DocbookPackage.DOCUMENT_ROOT__CONSTRAINT:
				return getConstraint();
			case DocbookPackage.DOCUMENT_ROOT__CONSTRAINTDEF:
				return getConstraintdef();
			case DocbookPackage.DOCUMENT_ROOT__CONSTRUCTORSYNOPSIS:
				return getConstructorsynopsis();
			case DocbookPackage.DOCUMENT_ROOT__CONTRACTNUM:
				return getContractnum();
			case DocbookPackage.DOCUMENT_ROOT__CONTRACTSPONSOR:
				return getContractsponsor();
			case DocbookPackage.DOCUMENT_ROOT__CONTRIB:
				return getContrib();
			case DocbookPackage.DOCUMENT_ROOT__COPYRIGHT:
				return getCopyright();
			case DocbookPackage.DOCUMENT_ROOT__COREF:
				return getCoref();
			case DocbookPackage.DOCUMENT_ROOT__COUNTRY:
				return getCountry();
			case DocbookPackage.DOCUMENT_ROOT__COVER:
				return getCover();
			case DocbookPackage.DOCUMENT_ROOT__DATABASE:
				return getDatabase();
			case DocbookPackage.DOCUMENT_ROOT__DATE:
				return getDate();
			case DocbookPackage.DOCUMENT_ROOT__DEDICATION:
				return getDedication();
			case DocbookPackage.DOCUMENT_ROOT__DESTRUCTORSYNOPSIS:
				return getDestructorsynopsis();
			case DocbookPackage.DOCUMENT_ROOT__EDITION:
				return getEdition();
			case DocbookPackage.DOCUMENT_ROOT__EDITOR:
				return getEditor();
			case DocbookPackage.DOCUMENT_ROOT__EMAIL:
				return getEmail();
			case DocbookPackage.DOCUMENT_ROOT__EMPHASIS:
				return getEmphasis();
			case DocbookPackage.DOCUMENT_ROOT__ENTRY:
				return getEntry();
			case DocbookPackage.DOCUMENT_ROOT__ENTRYTBL:
				return getEntrytbl();
			case DocbookPackage.DOCUMENT_ROOT__ENVAR:
				return getEnvar();
			case DocbookPackage.DOCUMENT_ROOT__EPIGRAPH:
				return getEpigraph();
			case DocbookPackage.DOCUMENT_ROOT__EQUATION:
				return getEquation();
			case DocbookPackage.DOCUMENT_ROOT__ERRORCODE:
				return getErrorcode();
			case DocbookPackage.DOCUMENT_ROOT__ERRORNAME:
				return getErrorname();
			case DocbookPackage.DOCUMENT_ROOT__ERRORTEXT:
				return getErrortext();
			case DocbookPackage.DOCUMENT_ROOT__ERRORTYPE:
				return getErrortype();
			case DocbookPackage.DOCUMENT_ROOT__EXAMPLE:
				return getExample();
			case DocbookPackage.DOCUMENT_ROOT__EXCEPTIONNAME:
				return getExceptionname();
			case DocbookPackage.DOCUMENT_ROOT__EXTENDEDLINK:
				return getExtendedlink();
			case DocbookPackage.DOCUMENT_ROOT__FAX:
				return getFax();
			case DocbookPackage.DOCUMENT_ROOT__FIELDSYNOPSIS:
				return getFieldsynopsis();
			case DocbookPackage.DOCUMENT_ROOT__FIGURE:
				return getFigure();
			case DocbookPackage.DOCUMENT_ROOT__FILENAME:
				return getFilename();
			case DocbookPackage.DOCUMENT_ROOT__FIRSTNAME:
				return getFirstname();
			case DocbookPackage.DOCUMENT_ROOT__FIRSTTERM:
				return getFirstterm();
			case DocbookPackage.DOCUMENT_ROOT__FOOTNOTE:
				return getFootnote();
			case DocbookPackage.DOCUMENT_ROOT__FOOTNOTEREF:
				return getFootnoteref();
			case DocbookPackage.DOCUMENT_ROOT__FOREIGNPHRASE:
				return getForeignphrase();
			case DocbookPackage.DOCUMENT_ROOT__FORMALPARA:
				return getFormalpara();
			case DocbookPackage.DOCUMENT_ROOT__FUNCDEF:
				return getFuncdef();
			case DocbookPackage.DOCUMENT_ROOT__FUNCPARAMS:
				return getFuncparams();
			case DocbookPackage.DOCUMENT_ROOT__FUNCPROTOTYPE:
				return getFuncprototype();
			case DocbookPackage.DOCUMENT_ROOT__FUNCSYNOPSIS:
				return getFuncsynopsis();
			case DocbookPackage.DOCUMENT_ROOT__FUNCSYNOPSISINFO:
				return getFuncsynopsisinfo();
			case DocbookPackage.DOCUMENT_ROOT__FUNCTION:
				return getFunction();
			case DocbookPackage.DOCUMENT_ROOT__GLOSSARY:
				return getGlossary();
			case DocbookPackage.DOCUMENT_ROOT__GLOSSDEF:
				return getGlossdef();
			case DocbookPackage.DOCUMENT_ROOT__GLOSSDIV:
				return getGlossdiv();
			case DocbookPackage.DOCUMENT_ROOT__GLOSSENTRY:
				return getGlossentry();
			case DocbookPackage.DOCUMENT_ROOT__GLOSSLIST:
				return getGlosslist();
			case DocbookPackage.DOCUMENT_ROOT__GLOSSSEE:
				return getGlosssee();
			case DocbookPackage.DOCUMENT_ROOT__GLOSSSEEALSO:
				return getGlossseealso();
			case DocbookPackage.DOCUMENT_ROOT__GLOSSTERM:
				return getGlossterm();
			case DocbookPackage.DOCUMENT_ROOT__GROUP:
				return getGroup();
			case DocbookPackage.DOCUMENT_ROOT__GUIBUTTON:
				return getGuibutton();
			case DocbookPackage.DOCUMENT_ROOT__GUIICON:
				return getGuiicon();
			case DocbookPackage.DOCUMENT_ROOT__GUILABEL:
				return getGuilabel();
			case DocbookPackage.DOCUMENT_ROOT__GUIMENU:
				return getGuimenu();
			case DocbookPackage.DOCUMENT_ROOT__GUIMENUITEM:
				return getGuimenuitem();
			case DocbookPackage.DOCUMENT_ROOT__GUISUBMENU:
				return getGuisubmenu();
			case DocbookPackage.DOCUMENT_ROOT__HARDWARE:
				return getHardware();
			case DocbookPackage.DOCUMENT_ROOT__HOLDER:
				return getHolder();
			case DocbookPackage.DOCUMENT_ROOT__HONORIFIC:
				return getHonorific();
			case DocbookPackage.DOCUMENT_ROOT__IMAGEDATA:
				return getImagedata();
			case DocbookPackage.DOCUMENT_ROOT__IMAGEOBJECT:
				return getImageobject();
			case DocbookPackage.DOCUMENT_ROOT__IMAGEOBJECTCO:
				return getImageobjectco();
			case DocbookPackage.DOCUMENT_ROOT__IMPORTANT:
				return getImportant();
			case DocbookPackage.DOCUMENT_ROOT__INDEX:
				return getIndex();
			case DocbookPackage.DOCUMENT_ROOT__INDEXDIV:
				return getIndexdiv();
			case DocbookPackage.DOCUMENT_ROOT__INDEXENTRY:
				return getIndexentry();
			case DocbookPackage.DOCUMENT_ROOT__INDEXTERM:
				return getIndexterm();
			case DocbookPackage.DOCUMENT_ROOT__INFO:
				return getInfo();
			case DocbookPackage.DOCUMENT_ROOT__INFORMALEQUATION:
				return getInformalequation();
			case DocbookPackage.DOCUMENT_ROOT__INFORMALEXAMPLE:
				return getInformalexample();
			case DocbookPackage.DOCUMENT_ROOT__INFORMALFIGURE:
				return getInformalfigure();
			case DocbookPackage.DOCUMENT_ROOT__INFORMALTABLE:
				return getInformaltable();
			case DocbookPackage.DOCUMENT_ROOT__INITIALIZER:
				return getInitializer();
			case DocbookPackage.DOCUMENT_ROOT__INLINEEQUATION:
				return getInlineequation();
			case DocbookPackage.DOCUMENT_ROOT__INLINEMEDIAOBJECT:
				return getInlinemediaobject();
			case DocbookPackage.DOCUMENT_ROOT__INTERFACENAME:
				return getInterfacename();
			case DocbookPackage.DOCUMENT_ROOT__ISSUENUM:
				return getIssuenum();
			case DocbookPackage.DOCUMENT_ROOT__ITEMIZEDLIST:
				return getItemizedlist();
			case DocbookPackage.DOCUMENT_ROOT__ITERMSET:
				return getItermset();
			case DocbookPackage.DOCUMENT_ROOT__JOBTITLE:
				return getJobtitle();
			case DocbookPackage.DOCUMENT_ROOT__KEYCAP:
				return getKeycap();
			case DocbookPackage.DOCUMENT_ROOT__KEYCODE:
				return getKeycode();
			case DocbookPackage.DOCUMENT_ROOT__KEYCOMBO:
				return getKeycombo();
			case DocbookPackage.DOCUMENT_ROOT__KEYSYM:
				return getKeysym();
			case DocbookPackage.DOCUMENT_ROOT__KEYWORD:
				return getKeyword();
			case DocbookPackage.DOCUMENT_ROOT__KEYWORDSET:
				return getKeywordset();
			case DocbookPackage.DOCUMENT_ROOT__LABEL:
				return getLabel();
			case DocbookPackage.DOCUMENT_ROOT__LEGALNOTICE:
				return getLegalnotice();
			case DocbookPackage.DOCUMENT_ROOT__LHS:
				return getLhs();
			case DocbookPackage.DOCUMENT_ROOT__LINEAGE:
				return getLineage();
			case DocbookPackage.DOCUMENT_ROOT__LINEANNOTATION:
				return getLineannotation();
			case DocbookPackage.DOCUMENT_ROOT__LINK:
				return getLink();
			case DocbookPackage.DOCUMENT_ROOT__LISTITEM:
				return getListitem();
			case DocbookPackage.DOCUMENT_ROOT__LITERAL:
				return getLiteral();
			case DocbookPackage.DOCUMENT_ROOT__LITERALLAYOUT:
				return getLiterallayout();
			case DocbookPackage.DOCUMENT_ROOT__LOCATOR:
				return getLocator();
			case DocbookPackage.DOCUMENT_ROOT__MANVOLNUM:
				return getManvolnum();
			case DocbookPackage.DOCUMENT_ROOT__MARKUP:
				return getMarkup();
			case DocbookPackage.DOCUMENT_ROOT__MATHPHRASE:
				return getMathphrase();
			case DocbookPackage.DOCUMENT_ROOT__MEDIAOBJECT:
				return getMediaobject();
			case DocbookPackage.DOCUMENT_ROOT__MEMBER:
				return getMember();
			case DocbookPackage.DOCUMENT_ROOT__MENUCHOICE:
				return getMenuchoice();
			case DocbookPackage.DOCUMENT_ROOT__METHODNAME:
				return getMethodname();
			case DocbookPackage.DOCUMENT_ROOT__METHODPARAM:
				return getMethodparam();
			case DocbookPackage.DOCUMENT_ROOT__METHODSYNOPSIS:
				return getMethodsynopsis();
			case DocbookPackage.DOCUMENT_ROOT__MODIFIER:
				return getModifier();
			case DocbookPackage.DOCUMENT_ROOT__MOUSEBUTTON:
				return getMousebutton();
			case DocbookPackage.DOCUMENT_ROOT__MSG:
				return getMsg();
			case DocbookPackage.DOCUMENT_ROOT__MSGAUD:
				return getMsgaud();
			case DocbookPackage.DOCUMENT_ROOT__MSGENTRY:
				return getMsgentry();
			case DocbookPackage.DOCUMENT_ROOT__MSGEXPLAN:
				return getMsgexplan();
			case DocbookPackage.DOCUMENT_ROOT__MSGINFO:
				return getMsginfo();
			case DocbookPackage.DOCUMENT_ROOT__MSGLEVEL:
				return getMsglevel();
			case DocbookPackage.DOCUMENT_ROOT__MSGMAIN:
				return getMsgmain();
			case DocbookPackage.DOCUMENT_ROOT__MSGORIG:
				return getMsgorig();
			case DocbookPackage.DOCUMENT_ROOT__MSGREL:
				return getMsgrel();
			case DocbookPackage.DOCUMENT_ROOT__MSGSET:
				return getMsgset();
			case DocbookPackage.DOCUMENT_ROOT__MSGSUB:
				return getMsgsub();
			case DocbookPackage.DOCUMENT_ROOT__MSGTEXT:
				return getMsgtext();
			case DocbookPackage.DOCUMENT_ROOT__NONTERMINAL:
				return getNonterminal();
			case DocbookPackage.DOCUMENT_ROOT__NOTE:
				return getNote();
			case DocbookPackage.DOCUMENT_ROOT__OLINK:
				return getOlink();
			case DocbookPackage.DOCUMENT_ROOT__OOCLASS:
				return getOoclass();
			case DocbookPackage.DOCUMENT_ROOT__OOEXCEPTION:
				return getOoexception();
			case DocbookPackage.DOCUMENT_ROOT__OOINTERFACE:
				return getOointerface();
			case DocbookPackage.DOCUMENT_ROOT__OPTION:
				return getOption();
			case DocbookPackage.DOCUMENT_ROOT__OPTIONAL:
				return getOptional();
			case DocbookPackage.DOCUMENT_ROOT__ORDEREDLIST:
				return getOrderedlist();
			case DocbookPackage.DOCUMENT_ROOT__ORG:
				return getOrg();
			case DocbookPackage.DOCUMENT_ROOT__ORGDIV:
				return getOrgdiv();
			case DocbookPackage.DOCUMENT_ROOT__ORGNAME:
				return getOrgname();
			case DocbookPackage.DOCUMENT_ROOT__OTHERADDR:
				return getOtheraddr();
			case DocbookPackage.DOCUMENT_ROOT__OTHERCREDIT:
				return getOthercredit();
			case DocbookPackage.DOCUMENT_ROOT__OTHERNAME:
				return getOthername();
			case DocbookPackage.DOCUMENT_ROOT__PACKAGE:
				return getPackage();
			case DocbookPackage.DOCUMENT_ROOT__PAGENUMS:
				return getPagenums();
			case DocbookPackage.DOCUMENT_ROOT__PARA:
				return getPara();
			case DocbookPackage.DOCUMENT_ROOT__PARAMDEF:
				return getParamdef();
			case DocbookPackage.DOCUMENT_ROOT__PARAMETER:
				return getParameter();
			case DocbookPackage.DOCUMENT_ROOT__PART:
				return getPart();
			case DocbookPackage.DOCUMENT_ROOT__PARTINTRO:
				return getPartintro();
			case DocbookPackage.DOCUMENT_ROOT__PERSON:
				return getPerson();
			case DocbookPackage.DOCUMENT_ROOT__PERSONBLURB:
				return getPersonblurb();
			case DocbookPackage.DOCUMENT_ROOT__PERSONNAME:
				return getPersonname();
			case DocbookPackage.DOCUMENT_ROOT__PHONE:
				return getPhone();
			case DocbookPackage.DOCUMENT_ROOT__PHRASE:
				return getPhrase();
			case DocbookPackage.DOCUMENT_ROOT__POB:
				return getPob();
			case DocbookPackage.DOCUMENT_ROOT__POSTCODE:
				return getPostcode();
			case DocbookPackage.DOCUMENT_ROOT__PREFACE:
				return getPreface();
			case DocbookPackage.DOCUMENT_ROOT__PRIMARY:
				return getPrimary();
			case DocbookPackage.DOCUMENT_ROOT__PRIMARYIE:
				return getPrimaryie();
			case DocbookPackage.DOCUMENT_ROOT__PRINTHISTORY:
				return getPrinthistory();
			case DocbookPackage.DOCUMENT_ROOT__PROCEDURE:
				return getProcedure();
			case DocbookPackage.DOCUMENT_ROOT__PRODUCTION:
				return getProduction();
			case DocbookPackage.DOCUMENT_ROOT__PRODUCTIONRECAP:
				return getProductionrecap();
			case DocbookPackage.DOCUMENT_ROOT__PRODUCTIONSET:
				return getProductionset();
			case DocbookPackage.DOCUMENT_ROOT__PRODUCTNAME:
				return getProductname();
			case DocbookPackage.DOCUMENT_ROOT__PRODUCTNUMBER:
				return getProductnumber();
			case DocbookPackage.DOCUMENT_ROOT__PROGRAMLISTING:
				return getProgramlisting();
			case DocbookPackage.DOCUMENT_ROOT__PROGRAMLISTINGCO:
				return getProgramlistingco();
			case DocbookPackage.DOCUMENT_ROOT__PROMPT:
				return getPrompt();
			case DocbookPackage.DOCUMENT_ROOT__PROPERTY:
				return getProperty();
			case DocbookPackage.DOCUMENT_ROOT__PUBDATE:
				return getPubdate();
			case DocbookPackage.DOCUMENT_ROOT__PUBLISHER:
				return getPublisher();
			case DocbookPackage.DOCUMENT_ROOT__PUBLISHERNAME:
				return getPublishername();
			case DocbookPackage.DOCUMENT_ROOT__QANDADIV:
				return getQandadiv();
			case DocbookPackage.DOCUMENT_ROOT__QANDAENTRY:
				return getQandaentry();
			case DocbookPackage.DOCUMENT_ROOT__QANDASET:
				return getQandaset();
			case DocbookPackage.DOCUMENT_ROOT__QUESTION:
				return getQuestion();
			case DocbookPackage.DOCUMENT_ROOT__QUOTE:
				return getQuote();
			case DocbookPackage.DOCUMENT_ROOT__REFCLASS:
				return getRefclass();
			case DocbookPackage.DOCUMENT_ROOT__REFDESCRIPTOR:
				return getRefdescriptor();
			case DocbookPackage.DOCUMENT_ROOT__REFENTRY:
				return getRefentry();
			case DocbookPackage.DOCUMENT_ROOT__REFENTRYTITLE:
				return getRefentrytitle();
			case DocbookPackage.DOCUMENT_ROOT__REFERENCE:
				return getReference();
			case DocbookPackage.DOCUMENT_ROOT__REFMETA:
				return getRefmeta();
			case DocbookPackage.DOCUMENT_ROOT__REFMISCINFO:
				return getRefmiscinfo();
			case DocbookPackage.DOCUMENT_ROOT__REFNAME:
				return getRefname();
			case DocbookPackage.DOCUMENT_ROOT__REFNAMEDIV:
				return getRefnamediv();
			case DocbookPackage.DOCUMENT_ROOT__REFPURPOSE:
				return getRefpurpose();
			case DocbookPackage.DOCUMENT_ROOT__REFSECT1:
				return getRefsect1();
			case DocbookPackage.DOCUMENT_ROOT__REFSECT2:
				return getRefsect2();
			case DocbookPackage.DOCUMENT_ROOT__REFSECT3:
				return getRefsect3();
			case DocbookPackage.DOCUMENT_ROOT__REFSECTION:
				return getRefsection();
			case DocbookPackage.DOCUMENT_ROOT__REFSYNOPSISDIV:
				return getRefsynopsisdiv();
			case DocbookPackage.DOCUMENT_ROOT__RELEASEINFO:
				return getReleaseinfo();
			case DocbookPackage.DOCUMENT_ROOT__REMARK:
				return getRemark();
			case DocbookPackage.DOCUMENT_ROOT__REPLACEABLE:
				return getReplaceable();
			case DocbookPackage.DOCUMENT_ROOT__RETURNVALUE:
				return getReturnvalue();
			case DocbookPackage.DOCUMENT_ROOT__REVDESCRIPTION:
				return getRevdescription();
			case DocbookPackage.DOCUMENT_ROOT__REVHISTORY:
				return getRevhistory();
			case DocbookPackage.DOCUMENT_ROOT__REVISION:
				return getRevision();
			case DocbookPackage.DOCUMENT_ROOT__REVNUMBER:
				return getRevnumber();
			case DocbookPackage.DOCUMENT_ROOT__REVREMARK:
				return getRevremark();
			case DocbookPackage.DOCUMENT_ROOT__RHS:
				return getRhs();
			case DocbookPackage.DOCUMENT_ROOT__ROW:
				return getRow();
			case DocbookPackage.DOCUMENT_ROOT__SBR:
				return getSbr();
			case DocbookPackage.DOCUMENT_ROOT__SCREEN:
				return getScreen();
			case DocbookPackage.DOCUMENT_ROOT__SCREENCO:
				return getScreenco();
			case DocbookPackage.DOCUMENT_ROOT__SCREENSHOT:
				return getScreenshot();
			case DocbookPackage.DOCUMENT_ROOT__SECONDARY:
				return getSecondary();
			case DocbookPackage.DOCUMENT_ROOT__SECONDARYIE:
				return getSecondaryie();
			case DocbookPackage.DOCUMENT_ROOT__SECT1:
				return getSect1();
			case DocbookPackage.DOCUMENT_ROOT__SECT2:
				return getSect2();
			case DocbookPackage.DOCUMENT_ROOT__SECT3:
				return getSect3();
			case DocbookPackage.DOCUMENT_ROOT__SECT4:
				return getSect4();
			case DocbookPackage.DOCUMENT_ROOT__SECT5:
				return getSect5();
			case DocbookPackage.DOCUMENT_ROOT__SECTION:
				return getSection();
			case DocbookPackage.DOCUMENT_ROOT__SEE:
				return getSee();
			case DocbookPackage.DOCUMENT_ROOT__SEEALSO:
				return getSeealso();
			case DocbookPackage.DOCUMENT_ROOT__SEEALSOIE:
				return getSeealsoie();
			case DocbookPackage.DOCUMENT_ROOT__SEEIE:
				return getSeeie();
			case DocbookPackage.DOCUMENT_ROOT__SEG:
				return getSeg();
			case DocbookPackage.DOCUMENT_ROOT__SEGLISTITEM:
				return getSeglistitem();
			case DocbookPackage.DOCUMENT_ROOT__SEGMENTEDLIST:
				return getSegmentedlist();
			case DocbookPackage.DOCUMENT_ROOT__SEGTITLE:
				return getSegtitle();
			case DocbookPackage.DOCUMENT_ROOT__SERIESVOLNUMS:
				return getSeriesvolnums();
			case DocbookPackage.DOCUMENT_ROOT__SET:
				return getSet();
			case DocbookPackage.DOCUMENT_ROOT__SETINDEX:
				return getSetindex();
			case DocbookPackage.DOCUMENT_ROOT__SHORTAFFIL:
				return getShortaffil();
			case DocbookPackage.DOCUMENT_ROOT__SHORTCUT:
				return getShortcut();
			case DocbookPackage.DOCUMENT_ROOT__SIDEBAR:
				return getSidebar();
			case DocbookPackage.DOCUMENT_ROOT__SIMPARA:
				return getSimpara();
			case DocbookPackage.DOCUMENT_ROOT__SIMPLELIST:
				return getSimplelist();
			case DocbookPackage.DOCUMENT_ROOT__SIMPLEMSGENTRY:
				return getSimplemsgentry();
			case DocbookPackage.DOCUMENT_ROOT__SIMPLESECT:
				return getSimplesect();
			case DocbookPackage.DOCUMENT_ROOT__SPANSPEC:
				return getSpanspec();
			case DocbookPackage.DOCUMENT_ROOT__STATE:
				return getState();
			case DocbookPackage.DOCUMENT_ROOT__STEP:
				return getStep();
			case DocbookPackage.DOCUMENT_ROOT__STEPALTERNATIVES:
				return getStepalternatives();
			case DocbookPackage.DOCUMENT_ROOT__STREET:
				return getStreet();
			case DocbookPackage.DOCUMENT_ROOT__SUBJECT:
				return getSubject();
			case DocbookPackage.DOCUMENT_ROOT__SUBJECTSET:
				return getSubjectset();
			case DocbookPackage.DOCUMENT_ROOT__SUBJECTTERM:
				return getSubjectterm();
			case DocbookPackage.DOCUMENT_ROOT__SUBSCRIPT:
				return getSubscript();
			case DocbookPackage.DOCUMENT_ROOT__SUBSTEPS:
				return getSubsteps();
			case DocbookPackage.DOCUMENT_ROOT__SUBTITLE:
				return getSubtitle();
			case DocbookPackage.DOCUMENT_ROOT__SUPERSCRIPT:
				return getSuperscript();
			case DocbookPackage.DOCUMENT_ROOT__SURNAME:
				return getSurname();
			case DocbookPackage.DOCUMENT_ROOT__SYMBOL:
				return getSymbol();
			case DocbookPackage.DOCUMENT_ROOT__SYNOPFRAGMENT:
				return getSynopfragment();
			case DocbookPackage.DOCUMENT_ROOT__SYNOPFRAGMENTREF:
				return getSynopfragmentref();
			case DocbookPackage.DOCUMENT_ROOT__SYNOPSIS:
				return getSynopsis();
			case DocbookPackage.DOCUMENT_ROOT__SYSTEMITEM:
				return getSystemitem();
			case DocbookPackage.DOCUMENT_ROOT__TABLE:
				return getTable();
			case DocbookPackage.DOCUMENT_ROOT__TAG:
				return getTag();
			case DocbookPackage.DOCUMENT_ROOT__TASK:
				return getTask();
			case DocbookPackage.DOCUMENT_ROOT__TASKPREREQUISITES:
				return getTaskprerequisites();
			case DocbookPackage.DOCUMENT_ROOT__TASKRELATED:
				return getTaskrelated();
			case DocbookPackage.DOCUMENT_ROOT__TASKSUMMARY:
				return getTasksummary();
			case DocbookPackage.DOCUMENT_ROOT__TBODY:
				return getTbody();
			case DocbookPackage.DOCUMENT_ROOT__TD:
				return getTd();
			case DocbookPackage.DOCUMENT_ROOT__TERM:
				return getTerm();
			case DocbookPackage.DOCUMENT_ROOT__TERMDEF:
				return getTermdef();
			case DocbookPackage.DOCUMENT_ROOT__TERTIARY:
				return getTertiary();
			case DocbookPackage.DOCUMENT_ROOT__TERTIARYIE:
				return getTertiaryie();
			case DocbookPackage.DOCUMENT_ROOT__TEXTDATA:
				return getTextdata();
			case DocbookPackage.DOCUMENT_ROOT__TEXTOBJECT:
				return getTextobject();
			case DocbookPackage.DOCUMENT_ROOT__TFOOT:
				return getTfoot();
			case DocbookPackage.DOCUMENT_ROOT__TGROUP:
				return getTgroup();
			case DocbookPackage.DOCUMENT_ROOT__TH:
				return getTh();
			case DocbookPackage.DOCUMENT_ROOT__THEAD:
				return getThead();
			case DocbookPackage.DOCUMENT_ROOT__TIP:
				return getTip();
			case DocbookPackage.DOCUMENT_ROOT__TITLE:
				return getTitle();
			case DocbookPackage.DOCUMENT_ROOT__TITLEABBREV:
				return getTitleabbrev();
			case DocbookPackage.DOCUMENT_ROOT__TOC:
				return getToc();
			case DocbookPackage.DOCUMENT_ROOT__TOCDIV:
				return getTocdiv();
			case DocbookPackage.DOCUMENT_ROOT__TOCENTRY:
				return getTocentry();
			case DocbookPackage.DOCUMENT_ROOT__TOKEN:
				return getToken();
			case DocbookPackage.DOCUMENT_ROOT__TR:
				return getTr();
			case DocbookPackage.DOCUMENT_ROOT__TRADEMARK:
				return getTrademark();
			case DocbookPackage.DOCUMENT_ROOT__TYPE:
				return getType();
			case DocbookPackage.DOCUMENT_ROOT__URI:
				return getUri();
			case DocbookPackage.DOCUMENT_ROOT__USERINPUT:
				return getUserinput();
			case DocbookPackage.DOCUMENT_ROOT__VARARGS:
				return getVarargs();
			case DocbookPackage.DOCUMENT_ROOT__VARIABLELIST:
				return getVariablelist();
			case DocbookPackage.DOCUMENT_ROOT__VARLISTENTRY:
				return getVarlistentry();
			case DocbookPackage.DOCUMENT_ROOT__VARNAME:
				return getVarname();
			case DocbookPackage.DOCUMENT_ROOT__VIDEODATA:
				return getVideodata();
			case DocbookPackage.DOCUMENT_ROOT__VIDEOOBJECT:
				return getVideoobject();
			case DocbookPackage.DOCUMENT_ROOT__VOID:
				return getVoid();
			case DocbookPackage.DOCUMENT_ROOT__VOLUMENUM:
				return getVolumenum();
			case DocbookPackage.DOCUMENT_ROOT__WARNING:
				return getWarning();
			case DocbookPackage.DOCUMENT_ROOT__WORDASWORD:
				return getWordasword();
			case DocbookPackage.DOCUMENT_ROOT__XREF:
				return getXref();
			case DocbookPackage.DOCUMENT_ROOT__YEAR:
				return getYear();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DocbookPackage.DOCUMENT_ROOT__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				((EStructuralFeature.Setting)getXMLNSPrefixMap()).set(newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				((EStructuralFeature.Setting)getXSISchemaLocation()).set(newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__ABBREV:
				setAbbrev((AbbrevType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__ABSTRACT:
				setAbstract((AbstractType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__ACCEL:
				setAccel((AccelType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__ACKNOWLEDGEMENTS:
				setAcknowledgements((AcknowledgementsType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__ACRONYM:
				setAcronym((AcronymType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__ADDRESS:
				setAddress((AddressType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__AFFILIATION:
				setAffiliation((AffiliationType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__ALT:
				setAlt((AltType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__ANCHOR:
				setAnchor((AnchorType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__ANNOTATION:
				setAnnotation((AnnotationType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__ANSWER:
				setAnswer((AnswerType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__APPENDIX:
				setAppendix((AppendixType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__APPLICATION:
				setApplication((ApplicationType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__ARC:
				setArc((ArcType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__AREA:
				setArea((AreaType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__AREASET:
				setAreaset((AreasetType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__AREASPEC:
				setAreaspec((AreaspecType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__ARG:
				setArg((ArgType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__ARTICLE:
				setArticle((ArticleType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__ARTPAGENUMS:
				setArtpagenums((ArtpagenumsType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__ATTRIBUTION:
				setAttribution((AttributionType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__AUDIODATA:
				setAudiodata((AudiodataType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__AUDIOOBJECT:
				setAudioobject((AudioobjectType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__AUTHOR:
				setAuthor((AuthorType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__AUTHORGROUP:
				setAuthorgroup((AuthorgroupType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__AUTHORINITIALS:
				setAuthorinitials((AuthorinitialsType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__BIBLIOCOVERAGE:
				setBibliocoverage((BibliocoverageType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__BIBLIODIV:
				setBibliodiv((BibliodivType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__BIBLIOENTRY:
				setBiblioentry((BiblioentryType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__BIBLIOGRAPHY:
				setBibliography((BibliographyType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__BIBLIOID:
				setBiblioid((BiblioidType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__BIBLIOLIST:
				setBibliolist((BibliolistType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__BIBLIOMISC:
				setBibliomisc((BibliomiscType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__BIBLIOMIXED:
				setBibliomixed((BibliomixedType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__BIBLIOMSET:
				setBibliomset((BibliomsetType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__BIBLIOREF:
				setBiblioref((BibliorefType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__BIBLIORELATION:
				setBibliorelation((BibliorelationType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__BIBLIOSET:
				setBiblioset((BibliosetType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__BIBLIOSOURCE:
				setBibliosource((BibliosourceType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__BLOCKQUOTE:
				setBlockquote((BlockquoteType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__BOOK:
				setBook((BookType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__BRIDGEHEAD:
				setBridgehead((BridgeheadType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__CALLOUT:
				setCallout((CalloutType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__CALLOUTLIST:
				setCalloutlist((CalloutlistType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__CAPTION:
				setCaption((CaptionType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__CAUTION:
				setCaution((CautionType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__CHAPTER:
				setChapter((ChapterType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__CITATION:
				setCitation((CitationType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__CITEBIBLIOID:
				setCitebiblioid((CitebiblioidType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__CITEREFENTRY:
				setCiterefentry((CiterefentryType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__CITETITLE:
				setCitetitle((CitetitleType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__CITY:
				setCity((CityType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__CLASSNAME:
				setClassname((ClassnameType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__CLASSSYNOPSIS:
				setClasssynopsis((ClasssynopsisType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__CLASSSYNOPSISINFO:
				setClasssynopsisinfo((ClasssynopsisinfoType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__CMDSYNOPSIS:
				setCmdsynopsis((CmdsynopsisType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__CO:
				setCo((CoType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__CODE:
				setCode((CodeType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__COL:
				setCol((ColType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__COLGROUP:
				setColgroup((ColgroupType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__COLLAB:
				setCollab((CollabType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__COLOPHON:
				setColophon((ColophonType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__COLSPEC:
				setColspec((ColspecType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__COMMAND:
				setCommand((CommandType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__COMPUTEROUTPUT:
				setComputeroutput((ComputeroutputType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__CONFDATES:
				setConfdates((ConfdatesType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__CONFGROUP:
				setConfgroup((ConfgroupType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__CONFNUM:
				setConfnum((ConfnumType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__CONFSPONSOR:
				setConfsponsor((ConfsponsorType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__CONFTITLE:
				setConftitle((ConftitleType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__CONSTANT:
				setConstant((ConstantType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__CONSTRAINT:
				setConstraint((ConstraintType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__CONSTRAINTDEF:
				setConstraintdef((ConstraintdefType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__CONSTRUCTORSYNOPSIS:
				setConstructorsynopsis((ConstructorsynopsisType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__CONTRACTNUM:
				setContractnum((ContractnumType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__CONTRACTSPONSOR:
				setContractsponsor((ContractsponsorType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__CONTRIB:
				setContrib((ContribType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__COPYRIGHT:
				setCopyright((CopyrightType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__COREF:
				setCoref((CorefType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__COUNTRY:
				setCountry((CountryType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__COVER:
				setCover((CoverType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__DATABASE:
				setDatabase((DatabaseType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__DATE:
				setDate((DateType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__DEDICATION:
				setDedication((DedicationType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__DESTRUCTORSYNOPSIS:
				setDestructorsynopsis((DestructorsynopsisType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__EDITION:
				setEdition((EditionType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__EDITOR:
				setEditor((EditorType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__EMAIL:
				setEmail((EmailType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__EMPHASIS:
				setEmphasis((EmphasisType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__ENTRY:
				setEntry((EntryType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__ENTRYTBL:
				setEntrytbl((EntrytblType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__ENVAR:
				setEnvar((EnvarType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__EPIGRAPH:
				setEpigraph((EpigraphType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__EQUATION:
				setEquation((EquationType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__ERRORCODE:
				setErrorcode((ErrorcodeType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__ERRORNAME:
				setErrorname((ErrornameType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__ERRORTEXT:
				setErrortext((ErrortextType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__ERRORTYPE:
				setErrortype((ErrortypeType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__EXAMPLE:
				setExample((ExampleType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__EXCEPTIONNAME:
				setExceptionname((ExceptionnameType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__EXTENDEDLINK:
				setExtendedlink((ExtendedlinkType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__FAX:
				setFax((FaxType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__FIELDSYNOPSIS:
				setFieldsynopsis((FieldsynopsisType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__FIGURE:
				setFigure((FigureType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__FILENAME:
				setFilename((FilenameType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__FIRSTNAME:
				setFirstname((FirstnameType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__FIRSTTERM:
				setFirstterm((FirsttermType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__FOOTNOTE:
				setFootnote((FootnoteType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__FOOTNOTEREF:
				setFootnoteref((FootnoterefType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__FOREIGNPHRASE:
				setForeignphrase((ForeignphraseType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__FORMALPARA:
				setFormalpara((FormalparaType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__FUNCDEF:
				setFuncdef((FuncdefType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__FUNCPARAMS:
				setFuncparams((FuncparamsType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__FUNCPROTOTYPE:
				setFuncprototype((FuncprototypeType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__FUNCSYNOPSIS:
				setFuncsynopsis((FuncsynopsisType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__FUNCSYNOPSISINFO:
				setFuncsynopsisinfo((FuncsynopsisinfoType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__FUNCTION:
				setFunction((FunctionType1)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__GLOSSARY:
				setGlossary((GlossaryType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__GLOSSDEF:
				setGlossdef((GlossdefType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__GLOSSDIV:
				setGlossdiv((GlossdivType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__GLOSSENTRY:
				setGlossentry((GlossentryType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__GLOSSLIST:
				setGlosslist((GlosslistType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__GLOSSSEE:
				setGlosssee((GlossseeType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__GLOSSSEEALSO:
				setGlossseealso((GlossseealsoType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__GLOSSTERM:
				setGlossterm((GlosstermType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__GROUP:
				setGroup((GroupType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__GUIBUTTON:
				setGuibutton((GuibuttonType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__GUIICON:
				setGuiicon((GuiiconType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__GUILABEL:
				setGuilabel((GuilabelType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__GUIMENU:
				setGuimenu((GuimenuType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__GUIMENUITEM:
				setGuimenuitem((GuimenuitemType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__GUISUBMENU:
				setGuisubmenu((GuisubmenuType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__HARDWARE:
				setHardware((HardwareType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__HOLDER:
				setHolder((HolderType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__HONORIFIC:
				setHonorific((HonorificType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__IMAGEDATA:
				setImagedata((ImagedataType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__IMAGEOBJECT:
				setImageobject((ImageobjectType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__IMAGEOBJECTCO:
				setImageobjectco((ImageobjectcoType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__IMPORTANT:
				setImportant((ImportantType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__INDEX:
				setIndex((IndexType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__INDEXDIV:
				setIndexdiv((IndexdivType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__INDEXENTRY:
				setIndexentry((IndexentryType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__INDEXTERM:
				setIndexterm((IndextermType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__INFO:
				setInfo((InfoType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__INFORMALEQUATION:
				setInformalequation((InformalequationType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__INFORMALEXAMPLE:
				setInformalexample((InformalexampleType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__INFORMALFIGURE:
				setInformalfigure((InformalfigureType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__INFORMALTABLE:
				setInformaltable((InformaltableType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__INITIALIZER:
				setInitializer((InitializerType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__INLINEEQUATION:
				setInlineequation((InlineequationType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__INLINEMEDIAOBJECT:
				setInlinemediaobject((InlinemediaobjectType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__INTERFACENAME:
				setInterfacename((InterfacenameType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__ISSUENUM:
				setIssuenum((IssuenumType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__ITEMIZEDLIST:
				setItemizedlist((ItemizedlistType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__ITERMSET:
				setItermset((ItermsetType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__JOBTITLE:
				setJobtitle((JobtitleType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__KEYCAP:
				setKeycap((KeycapType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__KEYCODE:
				setKeycode((KeycodeType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__KEYCOMBO:
				setKeycombo((KeycomboType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__KEYSYM:
				setKeysym((KeysymType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__KEYWORD:
				setKeyword((KeywordType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__KEYWORDSET:
				setKeywordset((KeywordsetType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__LABEL:
				setLabel((LabelType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__LEGALNOTICE:
				setLegalnotice((LegalnoticeType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__LHS:
				setLhs((LhsType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__LINEAGE:
				setLineage((LineageType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__LINEANNOTATION:
				setLineannotation((LineannotationType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__LINK:
				setLink((LinkType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__LISTITEM:
				setListitem((ListitemType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__LITERAL:
				setLiteral((LiteralType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__LITERALLAYOUT:
				setLiterallayout((LiterallayoutType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__LOCATOR:
				setLocator((LocatorType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__MANVOLNUM:
				setManvolnum((ManvolnumType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__MARKUP:
				setMarkup((MarkupType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__MATHPHRASE:
				setMathphrase((MathphraseType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__MEDIAOBJECT:
				setMediaobject((MediaobjectType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__MEMBER:
				setMember((MemberType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__MENUCHOICE:
				setMenuchoice((MenuchoiceType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__METHODNAME:
				setMethodname((MethodnameType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__METHODPARAM:
				setMethodparam((MethodparamType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__METHODSYNOPSIS:
				setMethodsynopsis((MethodsynopsisType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__MODIFIER:
				setModifier((ModifierType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__MOUSEBUTTON:
				setMousebutton((MousebuttonType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__MSG:
				setMsg((MsgType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__MSGAUD:
				setMsgaud((MsgaudType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__MSGENTRY:
				setMsgentry((MsgentryType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__MSGEXPLAN:
				setMsgexplan((MsgexplanType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__MSGINFO:
				setMsginfo((MsginfoType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__MSGLEVEL:
				setMsglevel((MsglevelType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__MSGMAIN:
				setMsgmain((MsgmainType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__MSGORIG:
				setMsgorig((MsgorigType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__MSGREL:
				setMsgrel((MsgrelType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__MSGSET:
				setMsgset((MsgsetType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__MSGSUB:
				setMsgsub((MsgsubType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__MSGTEXT:
				setMsgtext((MsgtextType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__NONTERMINAL:
				setNonterminal((NonterminalType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__NOTE:
				setNote((NoteType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__OLINK:
				setOlink((OlinkType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__OOCLASS:
				setOoclass((OoclassType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__OOEXCEPTION:
				setOoexception((OoexceptionType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__OOINTERFACE:
				setOointerface((OointerfaceType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__OPTION:
				setOption((OptionType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__OPTIONAL:
				setOptional((OptionalType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__ORDEREDLIST:
				setOrderedlist((OrderedlistType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__ORG:
				setOrg((OrgType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__ORGDIV:
				setOrgdiv((OrgdivType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__ORGNAME:
				setOrgname((OrgnameType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__OTHERADDR:
				setOtheraddr((OtheraddrType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__OTHERCREDIT:
				setOthercredit((OthercreditType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__OTHERNAME:
				setOthername((OthernameType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__PACKAGE:
				setPackage((PackageType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__PAGENUMS:
				setPagenums((PagenumsType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__PARA:
				setPara((ParaType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__PARAMDEF:
				setParamdef((ParamdefType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__PARAMETER:
				setParameter((ParameterType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__PART:
				setPart((PartType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__PARTINTRO:
				setPartintro((PartintroType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__PERSON:
				setPerson((PersonType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__PERSONBLURB:
				setPersonblurb((PersonblurbType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__PERSONNAME:
				setPersonname((PersonnameType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__PHONE:
				setPhone((PhoneType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__PHRASE:
				setPhrase((PhraseType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__POB:
				setPob((PobType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__POSTCODE:
				setPostcode((PostcodeType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__PREFACE:
				setPreface((PrefaceType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__PRIMARY:
				setPrimary((PrimaryType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__PRIMARYIE:
				setPrimaryie((PrimaryieType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__PRINTHISTORY:
				setPrinthistory((PrinthistoryType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__PROCEDURE:
				setProcedure((ProcedureType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__PRODUCTION:
				setProduction((ProductionType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__PRODUCTIONRECAP:
				setProductionrecap((ProductionrecapType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__PRODUCTIONSET:
				setProductionset((ProductionsetType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__PRODUCTNAME:
				setProductname((ProductnameType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__PRODUCTNUMBER:
				setProductnumber((ProductnumberType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__PROGRAMLISTING:
				setProgramlisting((ProgramlistingType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__PROGRAMLISTINGCO:
				setProgramlistingco((ProgramlistingcoType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__PROMPT:
				setPrompt((PromptType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__PROPERTY:
				setProperty((PropertyType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__PUBDATE:
				setPubdate((PubdateType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__PUBLISHER:
				setPublisher((PublisherType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__PUBLISHERNAME:
				setPublishername((PublishernameType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__QANDADIV:
				setQandadiv((QandadivType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__QANDAENTRY:
				setQandaentry((QandaentryType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__QANDASET:
				setQandaset((QandasetType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__QUESTION:
				setQuestion((QuestionType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__QUOTE:
				setQuote((QuoteType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__REFCLASS:
				setRefclass((RefclassType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__REFDESCRIPTOR:
				setRefdescriptor((RefdescriptorType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__REFENTRY:
				setRefentry((RefentryType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__REFENTRYTITLE:
				setRefentrytitle((RefentrytitleType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__REFERENCE:
				setReference((ReferenceType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__REFMETA:
				setRefmeta((RefmetaType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__REFMISCINFO:
				setRefmiscinfo((RefmiscinfoType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__REFNAME:
				setRefname((RefnameType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__REFNAMEDIV:
				setRefnamediv((RefnamedivType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__REFPURPOSE:
				setRefpurpose((RefpurposeType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__REFSECT1:
				setRefsect1((Refsect1Type)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__REFSECT2:
				setRefsect2((Refsect2Type)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__REFSECT3:
				setRefsect3((Refsect3Type)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__REFSECTION:
				setRefsection((RefsectionType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__REFSYNOPSISDIV:
				setRefsynopsisdiv((RefsynopsisdivType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__RELEASEINFO:
				setReleaseinfo((ReleaseinfoType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__REMARK:
				setRemark((RemarkType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__REPLACEABLE:
				setReplaceable((ReplaceableType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__RETURNVALUE:
				setReturnvalue((ReturnvalueType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__REVDESCRIPTION:
				setRevdescription((RevdescriptionType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__REVHISTORY:
				setRevhistory((RevhistoryType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__REVISION:
				setRevision((RevisionType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__REVNUMBER:
				setRevnumber((RevnumberType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__REVREMARK:
				setRevremark((RevremarkType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__RHS:
				setRhs((RhsType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__ROW:
				setRow((RowType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__SBR:
				setSbr((SbrType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__SCREEN:
				setScreen((ScreenType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__SCREENCO:
				setScreenco((ScreencoType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__SCREENSHOT:
				setScreenshot((ScreenshotType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__SECONDARY:
				setSecondary((SecondaryType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__SECONDARYIE:
				setSecondaryie((SecondaryieType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__SECT1:
				setSect1((Sect1Type)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__SECT2:
				setSect2((Sect2Type)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__SECT3:
				setSect3((Sect3Type)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__SECT4:
				setSect4((Sect4Type)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__SECT5:
				setSect5((Sect5Type)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__SECTION:
				setSection((SectionType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__SEE:
				setSee((SeeType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__SEEALSO:
				setSeealso((SeealsoType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__SEEALSOIE:
				setSeealsoie((SeealsoieType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__SEEIE:
				setSeeie((SeeieType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__SEG:
				setSeg((SegType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__SEGLISTITEM:
				setSeglistitem((SeglistitemType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__SEGMENTEDLIST:
				setSegmentedlist((SegmentedlistType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__SEGTITLE:
				setSegtitle((SegtitleType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__SERIESVOLNUMS:
				setSeriesvolnums((SeriesvolnumsType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__SET:
				setSet((SetType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__SETINDEX:
				setSetindex((SetindexType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__SHORTAFFIL:
				setShortaffil((ShortaffilType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__SHORTCUT:
				setShortcut((ShortcutType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__SIDEBAR:
				setSidebar((SidebarType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__SIMPARA:
				setSimpara((SimparaType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__SIMPLELIST:
				setSimplelist((SimplelistType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__SIMPLEMSGENTRY:
				setSimplemsgentry((SimplemsgentryType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__SIMPLESECT:
				setSimplesect((SimplesectType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__SPANSPEC:
				setSpanspec((SpanspecType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__STATE:
				setState((StateType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__STEP:
				setStep((StepType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__STEPALTERNATIVES:
				setStepalternatives((StepalternativesType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__STREET:
				setStreet((StreetType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__SUBJECT:
				setSubject((SubjectType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__SUBJECTSET:
				setSubjectset((SubjectsetType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__SUBJECTTERM:
				setSubjectterm((SubjecttermType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__SUBSCRIPT:
				setSubscript((SubscriptType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__SUBSTEPS:
				setSubsteps((SubstepsType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__SUBTITLE:
				setSubtitle((SubtitleType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__SUPERSCRIPT:
				setSuperscript((SuperscriptType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__SURNAME:
				setSurname((SurnameType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__SYMBOL:
				setSymbol((SymbolType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__SYNOPFRAGMENT:
				setSynopfragment((SynopfragmentType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__SYNOPFRAGMENTREF:
				setSynopfragmentref((SynopfragmentrefType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__SYNOPSIS:
				setSynopsis((SynopsisType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__SYSTEMITEM:
				setSystemitem((SystemitemType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__TABLE:
				setTable((TableType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__TAG:
				setTag((TagType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__TASK:
				setTask((TaskType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__TASKPREREQUISITES:
				setTaskprerequisites((TaskprerequisitesType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__TASKRELATED:
				setTaskrelated((TaskrelatedType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__TASKSUMMARY:
				setTasksummary((TasksummaryType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__TBODY:
				setTbody((TbodyType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__TD:
				setTd((TdType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__TERM:
				setTerm((TermType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__TERMDEF:
				setTermdef((TermdefType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__TERTIARY:
				setTertiary((TertiaryType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__TERTIARYIE:
				setTertiaryie((TertiaryieType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__TEXTDATA:
				setTextdata((TextdataType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__TEXTOBJECT:
				setTextobject((TextobjectType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__TFOOT:
				setTfoot((TfootType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__TGROUP:
				setTgroup((TgroupType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__TH:
				setTh((ThType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__THEAD:
				setThead((TheadType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__TIP:
				setTip((TipType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__TITLE:
				setTitle((TitleType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__TITLEABBREV:
				setTitleabbrev((TitleabbrevType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__TOC:
				setToc((TocType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__TOCDIV:
				setTocdiv((TocdivType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__TOCENTRY:
				setTocentry((TocentryType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__TOKEN:
				setToken((TokenType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__TR:
				setTr((TrType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__TRADEMARK:
				setTrademark((TrademarkType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__TYPE:
				setType((TypeType2)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__URI:
				setUri((UriType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__USERINPUT:
				setUserinput((UserinputType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__VARARGS:
				setVarargs((VarargsType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__VARIABLELIST:
				setVariablelist((VariablelistType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__VARLISTENTRY:
				setVarlistentry((VarlistentryType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__VARNAME:
				setVarname((VarnameType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__VIDEODATA:
				setVideodata((VideodataType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__VIDEOOBJECT:
				setVideoobject((VideoobjectType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__VOID:
				setVoid((VoidType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__VOLUMENUM:
				setVolumenum((VolumenumType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__WARNING:
				setWarning((WarningType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__WORDASWORD:
				setWordasword((WordaswordType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__XREF:
				setXref((XrefType)newValue);
				return;
			case DocbookPackage.DOCUMENT_ROOT__YEAR:
				setYear((YearType)newValue);
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
			case DocbookPackage.DOCUMENT_ROOT__MIXED:
				getMixed().clear();
				return;
			case DocbookPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				getXMLNSPrefixMap().clear();
				return;
			case DocbookPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				getXSISchemaLocation().clear();
				return;
			case DocbookPackage.DOCUMENT_ROOT__ABBREV:
				setAbbrev((AbbrevType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__ABSTRACT:
				setAbstract((AbstractType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__ACCEL:
				setAccel((AccelType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__ACKNOWLEDGEMENTS:
				setAcknowledgements((AcknowledgementsType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__ACRONYM:
				setAcronym((AcronymType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__ADDRESS:
				setAddress((AddressType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__AFFILIATION:
				setAffiliation((AffiliationType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__ALT:
				setAlt((AltType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__ANCHOR:
				setAnchor((AnchorType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__ANNOTATION:
				setAnnotation((AnnotationType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__ANSWER:
				setAnswer((AnswerType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__APPENDIX:
				setAppendix((AppendixType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__APPLICATION:
				setApplication((ApplicationType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__ARC:
				setArc((ArcType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__AREA:
				setArea((AreaType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__AREASET:
				setAreaset((AreasetType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__AREASPEC:
				setAreaspec((AreaspecType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__ARG:
				setArg((ArgType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__ARTICLE:
				setArticle((ArticleType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__ARTPAGENUMS:
				setArtpagenums((ArtpagenumsType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__ATTRIBUTION:
				setAttribution((AttributionType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__AUDIODATA:
				setAudiodata((AudiodataType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__AUDIOOBJECT:
				setAudioobject((AudioobjectType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__AUTHOR:
				setAuthor((AuthorType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__AUTHORGROUP:
				setAuthorgroup((AuthorgroupType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__AUTHORINITIALS:
				setAuthorinitials((AuthorinitialsType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__BIBLIOCOVERAGE:
				setBibliocoverage((BibliocoverageType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__BIBLIODIV:
				setBibliodiv((BibliodivType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__BIBLIOENTRY:
				setBiblioentry((BiblioentryType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__BIBLIOGRAPHY:
				setBibliography((BibliographyType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__BIBLIOID:
				setBiblioid((BiblioidType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__BIBLIOLIST:
				setBibliolist((BibliolistType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__BIBLIOMISC:
				setBibliomisc((BibliomiscType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__BIBLIOMIXED:
				setBibliomixed((BibliomixedType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__BIBLIOMSET:
				setBibliomset((BibliomsetType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__BIBLIOREF:
				setBiblioref((BibliorefType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__BIBLIORELATION:
				setBibliorelation((BibliorelationType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__BIBLIOSET:
				setBiblioset((BibliosetType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__BIBLIOSOURCE:
				setBibliosource((BibliosourceType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__BLOCKQUOTE:
				setBlockquote((BlockquoteType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__BOOK:
				setBook((BookType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__BRIDGEHEAD:
				setBridgehead((BridgeheadType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__CALLOUT:
				setCallout((CalloutType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__CALLOUTLIST:
				setCalloutlist((CalloutlistType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__CAPTION:
				setCaption((CaptionType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__CAUTION:
				setCaution((CautionType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__CHAPTER:
				setChapter((ChapterType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__CITATION:
				setCitation((CitationType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__CITEBIBLIOID:
				setCitebiblioid((CitebiblioidType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__CITEREFENTRY:
				setCiterefentry((CiterefentryType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__CITETITLE:
				setCitetitle((CitetitleType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__CITY:
				setCity((CityType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__CLASSNAME:
				setClassname((ClassnameType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__CLASSSYNOPSIS:
				setClasssynopsis((ClasssynopsisType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__CLASSSYNOPSISINFO:
				setClasssynopsisinfo((ClasssynopsisinfoType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__CMDSYNOPSIS:
				setCmdsynopsis((CmdsynopsisType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__CO:
				setCo((CoType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__CODE:
				setCode((CodeType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__COL:
				setCol((ColType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__COLGROUP:
				setColgroup((ColgroupType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__COLLAB:
				setCollab((CollabType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__COLOPHON:
				setColophon((ColophonType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__COLSPEC:
				setColspec((ColspecType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__COMMAND:
				setCommand((CommandType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__COMPUTEROUTPUT:
				setComputeroutput((ComputeroutputType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__CONFDATES:
				setConfdates((ConfdatesType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__CONFGROUP:
				setConfgroup((ConfgroupType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__CONFNUM:
				setConfnum((ConfnumType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__CONFSPONSOR:
				setConfsponsor((ConfsponsorType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__CONFTITLE:
				setConftitle((ConftitleType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__CONSTANT:
				setConstant((ConstantType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__CONSTRAINT:
				setConstraint((ConstraintType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__CONSTRAINTDEF:
				setConstraintdef((ConstraintdefType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__CONSTRUCTORSYNOPSIS:
				setConstructorsynopsis((ConstructorsynopsisType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__CONTRACTNUM:
				setContractnum((ContractnumType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__CONTRACTSPONSOR:
				setContractsponsor((ContractsponsorType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__CONTRIB:
				setContrib((ContribType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__COPYRIGHT:
				setCopyright((CopyrightType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__COREF:
				setCoref((CorefType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__COUNTRY:
				setCountry((CountryType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__COVER:
				setCover((CoverType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__DATABASE:
				setDatabase((DatabaseType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__DATE:
				setDate((DateType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__DEDICATION:
				setDedication((DedicationType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__DESTRUCTORSYNOPSIS:
				setDestructorsynopsis((DestructorsynopsisType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__EDITION:
				setEdition((EditionType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__EDITOR:
				setEditor((EditorType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__EMAIL:
				setEmail((EmailType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__EMPHASIS:
				setEmphasis((EmphasisType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__ENTRY:
				setEntry((EntryType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__ENTRYTBL:
				setEntrytbl((EntrytblType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__ENVAR:
				setEnvar((EnvarType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__EPIGRAPH:
				setEpigraph((EpigraphType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__EQUATION:
				setEquation((EquationType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__ERRORCODE:
				setErrorcode((ErrorcodeType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__ERRORNAME:
				setErrorname((ErrornameType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__ERRORTEXT:
				setErrortext((ErrortextType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__ERRORTYPE:
				setErrortype((ErrortypeType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__EXAMPLE:
				setExample((ExampleType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__EXCEPTIONNAME:
				setExceptionname((ExceptionnameType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__EXTENDEDLINK:
				setExtendedlink((ExtendedlinkType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__FAX:
				setFax((FaxType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__FIELDSYNOPSIS:
				setFieldsynopsis((FieldsynopsisType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__FIGURE:
				setFigure((FigureType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__FILENAME:
				setFilename((FilenameType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__FIRSTNAME:
				setFirstname((FirstnameType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__FIRSTTERM:
				setFirstterm((FirsttermType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__FOOTNOTE:
				setFootnote((FootnoteType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__FOOTNOTEREF:
				setFootnoteref((FootnoterefType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__FOREIGNPHRASE:
				setForeignphrase((ForeignphraseType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__FORMALPARA:
				setFormalpara((FormalparaType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__FUNCDEF:
				setFuncdef((FuncdefType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__FUNCPARAMS:
				setFuncparams((FuncparamsType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__FUNCPROTOTYPE:
				setFuncprototype((FuncprototypeType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__FUNCSYNOPSIS:
				setFuncsynopsis((FuncsynopsisType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__FUNCSYNOPSISINFO:
				setFuncsynopsisinfo((FuncsynopsisinfoType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__FUNCTION:
				setFunction((FunctionType1)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__GLOSSARY:
				setGlossary((GlossaryType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__GLOSSDEF:
				setGlossdef((GlossdefType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__GLOSSDIV:
				setGlossdiv((GlossdivType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__GLOSSENTRY:
				setGlossentry((GlossentryType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__GLOSSLIST:
				setGlosslist((GlosslistType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__GLOSSSEE:
				setGlosssee((GlossseeType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__GLOSSSEEALSO:
				setGlossseealso((GlossseealsoType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__GLOSSTERM:
				setGlossterm((GlosstermType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__GROUP:
				setGroup((GroupType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__GUIBUTTON:
				setGuibutton((GuibuttonType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__GUIICON:
				setGuiicon((GuiiconType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__GUILABEL:
				setGuilabel((GuilabelType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__GUIMENU:
				setGuimenu((GuimenuType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__GUIMENUITEM:
				setGuimenuitem((GuimenuitemType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__GUISUBMENU:
				setGuisubmenu((GuisubmenuType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__HARDWARE:
				setHardware((HardwareType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__HOLDER:
				setHolder((HolderType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__HONORIFIC:
				setHonorific((HonorificType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__IMAGEDATA:
				setImagedata((ImagedataType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__IMAGEOBJECT:
				setImageobject((ImageobjectType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__IMAGEOBJECTCO:
				setImageobjectco((ImageobjectcoType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__IMPORTANT:
				setImportant((ImportantType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__INDEX:
				setIndex((IndexType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__INDEXDIV:
				setIndexdiv((IndexdivType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__INDEXENTRY:
				setIndexentry((IndexentryType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__INDEXTERM:
				setIndexterm((IndextermType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__INFO:
				setInfo((InfoType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__INFORMALEQUATION:
				setInformalequation((InformalequationType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__INFORMALEXAMPLE:
				setInformalexample((InformalexampleType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__INFORMALFIGURE:
				setInformalfigure((InformalfigureType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__INFORMALTABLE:
				setInformaltable((InformaltableType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__INITIALIZER:
				setInitializer((InitializerType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__INLINEEQUATION:
				setInlineequation((InlineequationType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__INLINEMEDIAOBJECT:
				setInlinemediaobject((InlinemediaobjectType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__INTERFACENAME:
				setInterfacename((InterfacenameType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__ISSUENUM:
				setIssuenum((IssuenumType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__ITEMIZEDLIST:
				setItemizedlist((ItemizedlistType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__ITERMSET:
				setItermset((ItermsetType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__JOBTITLE:
				setJobtitle((JobtitleType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__KEYCAP:
				setKeycap((KeycapType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__KEYCODE:
				setKeycode((KeycodeType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__KEYCOMBO:
				setKeycombo((KeycomboType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__KEYSYM:
				setKeysym((KeysymType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__KEYWORD:
				setKeyword((KeywordType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__KEYWORDSET:
				setKeywordset((KeywordsetType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__LABEL:
				setLabel((LabelType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__LEGALNOTICE:
				setLegalnotice((LegalnoticeType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__LHS:
				setLhs((LhsType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__LINEAGE:
				setLineage((LineageType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__LINEANNOTATION:
				setLineannotation((LineannotationType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__LINK:
				setLink((LinkType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__LISTITEM:
				setListitem((ListitemType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__LITERAL:
				setLiteral((LiteralType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__LITERALLAYOUT:
				setLiterallayout((LiterallayoutType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__LOCATOR:
				setLocator((LocatorType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__MANVOLNUM:
				setManvolnum((ManvolnumType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__MARKUP:
				setMarkup((MarkupType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__MATHPHRASE:
				setMathphrase((MathphraseType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__MEDIAOBJECT:
				setMediaobject((MediaobjectType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__MEMBER:
				setMember((MemberType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__MENUCHOICE:
				setMenuchoice((MenuchoiceType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__METHODNAME:
				setMethodname((MethodnameType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__METHODPARAM:
				setMethodparam((MethodparamType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__METHODSYNOPSIS:
				setMethodsynopsis((MethodsynopsisType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__MODIFIER:
				setModifier((ModifierType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__MOUSEBUTTON:
				setMousebutton((MousebuttonType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__MSG:
				setMsg((MsgType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__MSGAUD:
				setMsgaud((MsgaudType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__MSGENTRY:
				setMsgentry((MsgentryType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__MSGEXPLAN:
				setMsgexplan((MsgexplanType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__MSGINFO:
				setMsginfo((MsginfoType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__MSGLEVEL:
				setMsglevel((MsglevelType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__MSGMAIN:
				setMsgmain((MsgmainType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__MSGORIG:
				setMsgorig((MsgorigType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__MSGREL:
				setMsgrel((MsgrelType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__MSGSET:
				setMsgset((MsgsetType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__MSGSUB:
				setMsgsub((MsgsubType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__MSGTEXT:
				setMsgtext((MsgtextType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__NONTERMINAL:
				setNonterminal((NonterminalType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__NOTE:
				setNote((NoteType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__OLINK:
				setOlink((OlinkType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__OOCLASS:
				setOoclass((OoclassType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__OOEXCEPTION:
				setOoexception((OoexceptionType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__OOINTERFACE:
				setOointerface((OointerfaceType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__OPTION:
				setOption((OptionType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__OPTIONAL:
				setOptional((OptionalType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__ORDEREDLIST:
				setOrderedlist((OrderedlistType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__ORG:
				setOrg((OrgType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__ORGDIV:
				setOrgdiv((OrgdivType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__ORGNAME:
				setOrgname((OrgnameType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__OTHERADDR:
				setOtheraddr((OtheraddrType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__OTHERCREDIT:
				setOthercredit((OthercreditType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__OTHERNAME:
				setOthername((OthernameType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__PACKAGE:
				setPackage((PackageType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__PAGENUMS:
				setPagenums((PagenumsType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__PARA:
				setPara((ParaType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__PARAMDEF:
				setParamdef((ParamdefType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__PARAMETER:
				setParameter((ParameterType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__PART:
				setPart((PartType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__PARTINTRO:
				setPartintro((PartintroType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__PERSON:
				setPerson((PersonType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__PERSONBLURB:
				setPersonblurb((PersonblurbType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__PERSONNAME:
				setPersonname((PersonnameType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__PHONE:
				setPhone((PhoneType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__PHRASE:
				setPhrase((PhraseType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__POB:
				setPob((PobType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__POSTCODE:
				setPostcode((PostcodeType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__PREFACE:
				setPreface((PrefaceType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__PRIMARY:
				setPrimary((PrimaryType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__PRIMARYIE:
				setPrimaryie((PrimaryieType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__PRINTHISTORY:
				setPrinthistory((PrinthistoryType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__PROCEDURE:
				setProcedure((ProcedureType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__PRODUCTION:
				setProduction((ProductionType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__PRODUCTIONRECAP:
				setProductionrecap((ProductionrecapType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__PRODUCTIONSET:
				setProductionset((ProductionsetType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__PRODUCTNAME:
				setProductname((ProductnameType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__PRODUCTNUMBER:
				setProductnumber((ProductnumberType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__PROGRAMLISTING:
				setProgramlisting((ProgramlistingType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__PROGRAMLISTINGCO:
				setProgramlistingco((ProgramlistingcoType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__PROMPT:
				setPrompt((PromptType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__PROPERTY:
				setProperty((PropertyType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__PUBDATE:
				setPubdate((PubdateType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__PUBLISHER:
				setPublisher((PublisherType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__PUBLISHERNAME:
				setPublishername((PublishernameType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__QANDADIV:
				setQandadiv((QandadivType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__QANDAENTRY:
				setQandaentry((QandaentryType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__QANDASET:
				setQandaset((QandasetType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__QUESTION:
				setQuestion((QuestionType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__QUOTE:
				setQuote((QuoteType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__REFCLASS:
				setRefclass((RefclassType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__REFDESCRIPTOR:
				setRefdescriptor((RefdescriptorType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__REFENTRY:
				setRefentry((RefentryType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__REFENTRYTITLE:
				setRefentrytitle((RefentrytitleType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__REFERENCE:
				setReference((ReferenceType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__REFMETA:
				setRefmeta((RefmetaType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__REFMISCINFO:
				setRefmiscinfo((RefmiscinfoType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__REFNAME:
				setRefname((RefnameType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__REFNAMEDIV:
				setRefnamediv((RefnamedivType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__REFPURPOSE:
				setRefpurpose((RefpurposeType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__REFSECT1:
				setRefsect1((Refsect1Type)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__REFSECT2:
				setRefsect2((Refsect2Type)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__REFSECT3:
				setRefsect3((Refsect3Type)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__REFSECTION:
				setRefsection((RefsectionType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__REFSYNOPSISDIV:
				setRefsynopsisdiv((RefsynopsisdivType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__RELEASEINFO:
				setReleaseinfo((ReleaseinfoType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__REMARK:
				setRemark((RemarkType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__REPLACEABLE:
				setReplaceable((ReplaceableType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__RETURNVALUE:
				setReturnvalue((ReturnvalueType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__REVDESCRIPTION:
				setRevdescription((RevdescriptionType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__REVHISTORY:
				setRevhistory((RevhistoryType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__REVISION:
				setRevision((RevisionType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__REVNUMBER:
				setRevnumber((RevnumberType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__REVREMARK:
				setRevremark((RevremarkType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__RHS:
				setRhs((RhsType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__ROW:
				setRow((RowType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__SBR:
				setSbr((SbrType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__SCREEN:
				setScreen((ScreenType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__SCREENCO:
				setScreenco((ScreencoType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__SCREENSHOT:
				setScreenshot((ScreenshotType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__SECONDARY:
				setSecondary((SecondaryType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__SECONDARYIE:
				setSecondaryie((SecondaryieType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__SECT1:
				setSect1((Sect1Type)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__SECT2:
				setSect2((Sect2Type)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__SECT3:
				setSect3((Sect3Type)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__SECT4:
				setSect4((Sect4Type)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__SECT5:
				setSect5((Sect5Type)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__SECTION:
				setSection((SectionType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__SEE:
				setSee((SeeType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__SEEALSO:
				setSeealso((SeealsoType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__SEEALSOIE:
				setSeealsoie((SeealsoieType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__SEEIE:
				setSeeie((SeeieType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__SEG:
				setSeg((SegType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__SEGLISTITEM:
				setSeglistitem((SeglistitemType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__SEGMENTEDLIST:
				setSegmentedlist((SegmentedlistType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__SEGTITLE:
				setSegtitle((SegtitleType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__SERIESVOLNUMS:
				setSeriesvolnums((SeriesvolnumsType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__SET:
				setSet((SetType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__SETINDEX:
				setSetindex((SetindexType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__SHORTAFFIL:
				setShortaffil((ShortaffilType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__SHORTCUT:
				setShortcut((ShortcutType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__SIDEBAR:
				setSidebar((SidebarType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__SIMPARA:
				setSimpara((SimparaType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__SIMPLELIST:
				setSimplelist((SimplelistType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__SIMPLEMSGENTRY:
				setSimplemsgentry((SimplemsgentryType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__SIMPLESECT:
				setSimplesect((SimplesectType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__SPANSPEC:
				setSpanspec((SpanspecType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__STATE:
				setState((StateType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__STEP:
				setStep((StepType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__STEPALTERNATIVES:
				setStepalternatives((StepalternativesType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__STREET:
				setStreet((StreetType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__SUBJECT:
				setSubject((SubjectType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__SUBJECTSET:
				setSubjectset((SubjectsetType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__SUBJECTTERM:
				setSubjectterm((SubjecttermType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__SUBSCRIPT:
				setSubscript((SubscriptType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__SUBSTEPS:
				setSubsteps((SubstepsType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__SUBTITLE:
				setSubtitle((SubtitleType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__SUPERSCRIPT:
				setSuperscript((SuperscriptType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__SURNAME:
				setSurname((SurnameType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__SYMBOL:
				setSymbol((SymbolType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__SYNOPFRAGMENT:
				setSynopfragment((SynopfragmentType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__SYNOPFRAGMENTREF:
				setSynopfragmentref((SynopfragmentrefType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__SYNOPSIS:
				setSynopsis((SynopsisType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__SYSTEMITEM:
				setSystemitem((SystemitemType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__TABLE:
				setTable((TableType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__TAG:
				setTag((TagType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__TASK:
				setTask((TaskType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__TASKPREREQUISITES:
				setTaskprerequisites((TaskprerequisitesType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__TASKRELATED:
				setTaskrelated((TaskrelatedType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__TASKSUMMARY:
				setTasksummary((TasksummaryType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__TBODY:
				setTbody((TbodyType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__TD:
				setTd((TdType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__TERM:
				setTerm((TermType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__TERMDEF:
				setTermdef((TermdefType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__TERTIARY:
				setTertiary((TertiaryType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__TERTIARYIE:
				setTertiaryie((TertiaryieType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__TEXTDATA:
				setTextdata((TextdataType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__TEXTOBJECT:
				setTextobject((TextobjectType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__TFOOT:
				setTfoot((TfootType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__TGROUP:
				setTgroup((TgroupType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__TH:
				setTh((ThType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__THEAD:
				setThead((TheadType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__TIP:
				setTip((TipType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__TITLE:
				setTitle((TitleType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__TITLEABBREV:
				setTitleabbrev((TitleabbrevType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__TOC:
				setToc((TocType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__TOCDIV:
				setTocdiv((TocdivType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__TOCENTRY:
				setTocentry((TocentryType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__TOKEN:
				setToken((TokenType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__TR:
				setTr((TrType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__TRADEMARK:
				setTrademark((TrademarkType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__TYPE:
				setType((TypeType2)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__URI:
				setUri((UriType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__USERINPUT:
				setUserinput((UserinputType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__VARARGS:
				setVarargs((VarargsType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__VARIABLELIST:
				setVariablelist((VariablelistType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__VARLISTENTRY:
				setVarlistentry((VarlistentryType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__VARNAME:
				setVarname((VarnameType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__VIDEODATA:
				setVideodata((VideodataType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__VIDEOOBJECT:
				setVideoobject((VideoobjectType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__VOID:
				setVoid((VoidType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__VOLUMENUM:
				setVolumenum((VolumenumType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__WARNING:
				setWarning((WarningType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__WORDASWORD:
				setWordasword((WordaswordType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__XREF:
				setXref((XrefType)null);
				return;
			case DocbookPackage.DOCUMENT_ROOT__YEAR:
				setYear((YearType)null);
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
			case DocbookPackage.DOCUMENT_ROOT__MIXED:
				return mixed != null && !mixed.isEmpty();
			case DocbookPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
			case DocbookPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
			case DocbookPackage.DOCUMENT_ROOT__ABBREV:
				return getAbbrev() != null;
			case DocbookPackage.DOCUMENT_ROOT__ABSTRACT:
				return getAbstract() != null;
			case DocbookPackage.DOCUMENT_ROOT__ACCEL:
				return getAccel() != null;
			case DocbookPackage.DOCUMENT_ROOT__ACKNOWLEDGEMENTS:
				return getAcknowledgements() != null;
			case DocbookPackage.DOCUMENT_ROOT__ACRONYM:
				return getAcronym() != null;
			case DocbookPackage.DOCUMENT_ROOT__ADDRESS:
				return getAddress() != null;
			case DocbookPackage.DOCUMENT_ROOT__AFFILIATION:
				return getAffiliation() != null;
			case DocbookPackage.DOCUMENT_ROOT__ALT:
				return getAlt() != null;
			case DocbookPackage.DOCUMENT_ROOT__ANCHOR:
				return getAnchor() != null;
			case DocbookPackage.DOCUMENT_ROOT__ANNOTATION:
				return getAnnotation() != null;
			case DocbookPackage.DOCUMENT_ROOT__ANSWER:
				return getAnswer() != null;
			case DocbookPackage.DOCUMENT_ROOT__APPENDIX:
				return getAppendix() != null;
			case DocbookPackage.DOCUMENT_ROOT__APPLICATION:
				return getApplication() != null;
			case DocbookPackage.DOCUMENT_ROOT__ARC:
				return getArc() != null;
			case DocbookPackage.DOCUMENT_ROOT__AREA:
				return getArea() != null;
			case DocbookPackage.DOCUMENT_ROOT__AREASET:
				return getAreaset() != null;
			case DocbookPackage.DOCUMENT_ROOT__AREASPEC:
				return getAreaspec() != null;
			case DocbookPackage.DOCUMENT_ROOT__ARG:
				return getArg() != null;
			case DocbookPackage.DOCUMENT_ROOT__ARTICLE:
				return getArticle() != null;
			case DocbookPackage.DOCUMENT_ROOT__ARTPAGENUMS:
				return getArtpagenums() != null;
			case DocbookPackage.DOCUMENT_ROOT__ATTRIBUTION:
				return getAttribution() != null;
			case DocbookPackage.DOCUMENT_ROOT__AUDIODATA:
				return getAudiodata() != null;
			case DocbookPackage.DOCUMENT_ROOT__AUDIOOBJECT:
				return getAudioobject() != null;
			case DocbookPackage.DOCUMENT_ROOT__AUTHOR:
				return getAuthor() != null;
			case DocbookPackage.DOCUMENT_ROOT__AUTHORGROUP:
				return getAuthorgroup() != null;
			case DocbookPackage.DOCUMENT_ROOT__AUTHORINITIALS:
				return getAuthorinitials() != null;
			case DocbookPackage.DOCUMENT_ROOT__BIBLIOCOVERAGE:
				return getBibliocoverage() != null;
			case DocbookPackage.DOCUMENT_ROOT__BIBLIODIV:
				return getBibliodiv() != null;
			case DocbookPackage.DOCUMENT_ROOT__BIBLIOENTRY:
				return getBiblioentry() != null;
			case DocbookPackage.DOCUMENT_ROOT__BIBLIOGRAPHY:
				return getBibliography() != null;
			case DocbookPackage.DOCUMENT_ROOT__BIBLIOID:
				return getBiblioid() != null;
			case DocbookPackage.DOCUMENT_ROOT__BIBLIOLIST:
				return getBibliolist() != null;
			case DocbookPackage.DOCUMENT_ROOT__BIBLIOMISC:
				return getBibliomisc() != null;
			case DocbookPackage.DOCUMENT_ROOT__BIBLIOMIXED:
				return getBibliomixed() != null;
			case DocbookPackage.DOCUMENT_ROOT__BIBLIOMSET:
				return getBibliomset() != null;
			case DocbookPackage.DOCUMENT_ROOT__BIBLIOREF:
				return getBiblioref() != null;
			case DocbookPackage.DOCUMENT_ROOT__BIBLIORELATION:
				return getBibliorelation() != null;
			case DocbookPackage.DOCUMENT_ROOT__BIBLIOSET:
				return getBiblioset() != null;
			case DocbookPackage.DOCUMENT_ROOT__BIBLIOSOURCE:
				return getBibliosource() != null;
			case DocbookPackage.DOCUMENT_ROOT__BLOCKQUOTE:
				return getBlockquote() != null;
			case DocbookPackage.DOCUMENT_ROOT__BOOK:
				return getBook() != null;
			case DocbookPackage.DOCUMENT_ROOT__BRIDGEHEAD:
				return getBridgehead() != null;
			case DocbookPackage.DOCUMENT_ROOT__CALLOUT:
				return getCallout() != null;
			case DocbookPackage.DOCUMENT_ROOT__CALLOUTLIST:
				return getCalloutlist() != null;
			case DocbookPackage.DOCUMENT_ROOT__CAPTION:
				return getCaption() != null;
			case DocbookPackage.DOCUMENT_ROOT__CAUTION:
				return getCaution() != null;
			case DocbookPackage.DOCUMENT_ROOT__CHAPTER:
				return getChapter() != null;
			case DocbookPackage.DOCUMENT_ROOT__CITATION:
				return getCitation() != null;
			case DocbookPackage.DOCUMENT_ROOT__CITEBIBLIOID:
				return getCitebiblioid() != null;
			case DocbookPackage.DOCUMENT_ROOT__CITEREFENTRY:
				return getCiterefentry() != null;
			case DocbookPackage.DOCUMENT_ROOT__CITETITLE:
				return getCitetitle() != null;
			case DocbookPackage.DOCUMENT_ROOT__CITY:
				return getCity() != null;
			case DocbookPackage.DOCUMENT_ROOT__CLASSNAME:
				return getClassname() != null;
			case DocbookPackage.DOCUMENT_ROOT__CLASSSYNOPSIS:
				return getClasssynopsis() != null;
			case DocbookPackage.DOCUMENT_ROOT__CLASSSYNOPSISINFO:
				return getClasssynopsisinfo() != null;
			case DocbookPackage.DOCUMENT_ROOT__CMDSYNOPSIS:
				return getCmdsynopsis() != null;
			case DocbookPackage.DOCUMENT_ROOT__CO:
				return getCo() != null;
			case DocbookPackage.DOCUMENT_ROOT__CODE:
				return getCode() != null;
			case DocbookPackage.DOCUMENT_ROOT__COL:
				return getCol() != null;
			case DocbookPackage.DOCUMENT_ROOT__COLGROUP:
				return getColgroup() != null;
			case DocbookPackage.DOCUMENT_ROOT__COLLAB:
				return getCollab() != null;
			case DocbookPackage.DOCUMENT_ROOT__COLOPHON:
				return getColophon() != null;
			case DocbookPackage.DOCUMENT_ROOT__COLSPEC:
				return getColspec() != null;
			case DocbookPackage.DOCUMENT_ROOT__COMMAND:
				return getCommand() != null;
			case DocbookPackage.DOCUMENT_ROOT__COMPUTEROUTPUT:
				return getComputeroutput() != null;
			case DocbookPackage.DOCUMENT_ROOT__CONFDATES:
				return getConfdates() != null;
			case DocbookPackage.DOCUMENT_ROOT__CONFGROUP:
				return getConfgroup() != null;
			case DocbookPackage.DOCUMENT_ROOT__CONFNUM:
				return getConfnum() != null;
			case DocbookPackage.DOCUMENT_ROOT__CONFSPONSOR:
				return getConfsponsor() != null;
			case DocbookPackage.DOCUMENT_ROOT__CONFTITLE:
				return getConftitle() != null;
			case DocbookPackage.DOCUMENT_ROOT__CONSTANT:
				return getConstant() != null;
			case DocbookPackage.DOCUMENT_ROOT__CONSTRAINT:
				return getConstraint() != null;
			case DocbookPackage.DOCUMENT_ROOT__CONSTRAINTDEF:
				return getConstraintdef() != null;
			case DocbookPackage.DOCUMENT_ROOT__CONSTRUCTORSYNOPSIS:
				return getConstructorsynopsis() != null;
			case DocbookPackage.DOCUMENT_ROOT__CONTRACTNUM:
				return getContractnum() != null;
			case DocbookPackage.DOCUMENT_ROOT__CONTRACTSPONSOR:
				return getContractsponsor() != null;
			case DocbookPackage.DOCUMENT_ROOT__CONTRIB:
				return getContrib() != null;
			case DocbookPackage.DOCUMENT_ROOT__COPYRIGHT:
				return getCopyright() != null;
			case DocbookPackage.DOCUMENT_ROOT__COREF:
				return getCoref() != null;
			case DocbookPackage.DOCUMENT_ROOT__COUNTRY:
				return getCountry() != null;
			case DocbookPackage.DOCUMENT_ROOT__COVER:
				return getCover() != null;
			case DocbookPackage.DOCUMENT_ROOT__DATABASE:
				return getDatabase() != null;
			case DocbookPackage.DOCUMENT_ROOT__DATE:
				return getDate() != null;
			case DocbookPackage.DOCUMENT_ROOT__DEDICATION:
				return getDedication() != null;
			case DocbookPackage.DOCUMENT_ROOT__DESTRUCTORSYNOPSIS:
				return getDestructorsynopsis() != null;
			case DocbookPackage.DOCUMENT_ROOT__EDITION:
				return getEdition() != null;
			case DocbookPackage.DOCUMENT_ROOT__EDITOR:
				return getEditor() != null;
			case DocbookPackage.DOCUMENT_ROOT__EMAIL:
				return getEmail() != null;
			case DocbookPackage.DOCUMENT_ROOT__EMPHASIS:
				return getEmphasis() != null;
			case DocbookPackage.DOCUMENT_ROOT__ENTRY:
				return getEntry() != null;
			case DocbookPackage.DOCUMENT_ROOT__ENTRYTBL:
				return getEntrytbl() != null;
			case DocbookPackage.DOCUMENT_ROOT__ENVAR:
				return getEnvar() != null;
			case DocbookPackage.DOCUMENT_ROOT__EPIGRAPH:
				return getEpigraph() != null;
			case DocbookPackage.DOCUMENT_ROOT__EQUATION:
				return getEquation() != null;
			case DocbookPackage.DOCUMENT_ROOT__ERRORCODE:
				return getErrorcode() != null;
			case DocbookPackage.DOCUMENT_ROOT__ERRORNAME:
				return getErrorname() != null;
			case DocbookPackage.DOCUMENT_ROOT__ERRORTEXT:
				return getErrortext() != null;
			case DocbookPackage.DOCUMENT_ROOT__ERRORTYPE:
				return getErrortype() != null;
			case DocbookPackage.DOCUMENT_ROOT__EXAMPLE:
				return getExample() != null;
			case DocbookPackage.DOCUMENT_ROOT__EXCEPTIONNAME:
				return getExceptionname() != null;
			case DocbookPackage.DOCUMENT_ROOT__EXTENDEDLINK:
				return getExtendedlink() != null;
			case DocbookPackage.DOCUMENT_ROOT__FAX:
				return getFax() != null;
			case DocbookPackage.DOCUMENT_ROOT__FIELDSYNOPSIS:
				return getFieldsynopsis() != null;
			case DocbookPackage.DOCUMENT_ROOT__FIGURE:
				return getFigure() != null;
			case DocbookPackage.DOCUMENT_ROOT__FILENAME:
				return getFilename() != null;
			case DocbookPackage.DOCUMENT_ROOT__FIRSTNAME:
				return getFirstname() != null;
			case DocbookPackage.DOCUMENT_ROOT__FIRSTTERM:
				return getFirstterm() != null;
			case DocbookPackage.DOCUMENT_ROOT__FOOTNOTE:
				return getFootnote() != null;
			case DocbookPackage.DOCUMENT_ROOT__FOOTNOTEREF:
				return getFootnoteref() != null;
			case DocbookPackage.DOCUMENT_ROOT__FOREIGNPHRASE:
				return getForeignphrase() != null;
			case DocbookPackage.DOCUMENT_ROOT__FORMALPARA:
				return getFormalpara() != null;
			case DocbookPackage.DOCUMENT_ROOT__FUNCDEF:
				return getFuncdef() != null;
			case DocbookPackage.DOCUMENT_ROOT__FUNCPARAMS:
				return getFuncparams() != null;
			case DocbookPackage.DOCUMENT_ROOT__FUNCPROTOTYPE:
				return getFuncprototype() != null;
			case DocbookPackage.DOCUMENT_ROOT__FUNCSYNOPSIS:
				return getFuncsynopsis() != null;
			case DocbookPackage.DOCUMENT_ROOT__FUNCSYNOPSISINFO:
				return getFuncsynopsisinfo() != null;
			case DocbookPackage.DOCUMENT_ROOT__FUNCTION:
				return getFunction() != null;
			case DocbookPackage.DOCUMENT_ROOT__GLOSSARY:
				return getGlossary() != null;
			case DocbookPackage.DOCUMENT_ROOT__GLOSSDEF:
				return getGlossdef() != null;
			case DocbookPackage.DOCUMENT_ROOT__GLOSSDIV:
				return getGlossdiv() != null;
			case DocbookPackage.DOCUMENT_ROOT__GLOSSENTRY:
				return getGlossentry() != null;
			case DocbookPackage.DOCUMENT_ROOT__GLOSSLIST:
				return getGlosslist() != null;
			case DocbookPackage.DOCUMENT_ROOT__GLOSSSEE:
				return getGlosssee() != null;
			case DocbookPackage.DOCUMENT_ROOT__GLOSSSEEALSO:
				return getGlossseealso() != null;
			case DocbookPackage.DOCUMENT_ROOT__GLOSSTERM:
				return getGlossterm() != null;
			case DocbookPackage.DOCUMENT_ROOT__GROUP:
				return getGroup() != null;
			case DocbookPackage.DOCUMENT_ROOT__GUIBUTTON:
				return getGuibutton() != null;
			case DocbookPackage.DOCUMENT_ROOT__GUIICON:
				return getGuiicon() != null;
			case DocbookPackage.DOCUMENT_ROOT__GUILABEL:
				return getGuilabel() != null;
			case DocbookPackage.DOCUMENT_ROOT__GUIMENU:
				return getGuimenu() != null;
			case DocbookPackage.DOCUMENT_ROOT__GUIMENUITEM:
				return getGuimenuitem() != null;
			case DocbookPackage.DOCUMENT_ROOT__GUISUBMENU:
				return getGuisubmenu() != null;
			case DocbookPackage.DOCUMENT_ROOT__HARDWARE:
				return getHardware() != null;
			case DocbookPackage.DOCUMENT_ROOT__HOLDER:
				return getHolder() != null;
			case DocbookPackage.DOCUMENT_ROOT__HONORIFIC:
				return getHonorific() != null;
			case DocbookPackage.DOCUMENT_ROOT__IMAGEDATA:
				return getImagedata() != null;
			case DocbookPackage.DOCUMENT_ROOT__IMAGEOBJECT:
				return getImageobject() != null;
			case DocbookPackage.DOCUMENT_ROOT__IMAGEOBJECTCO:
				return getImageobjectco() != null;
			case DocbookPackage.DOCUMENT_ROOT__IMPORTANT:
				return getImportant() != null;
			case DocbookPackage.DOCUMENT_ROOT__INDEX:
				return getIndex() != null;
			case DocbookPackage.DOCUMENT_ROOT__INDEXDIV:
				return getIndexdiv() != null;
			case DocbookPackage.DOCUMENT_ROOT__INDEXENTRY:
				return getIndexentry() != null;
			case DocbookPackage.DOCUMENT_ROOT__INDEXTERM:
				return getIndexterm() != null;
			case DocbookPackage.DOCUMENT_ROOT__INFO:
				return getInfo() != null;
			case DocbookPackage.DOCUMENT_ROOT__INFORMALEQUATION:
				return getInformalequation() != null;
			case DocbookPackage.DOCUMENT_ROOT__INFORMALEXAMPLE:
				return getInformalexample() != null;
			case DocbookPackage.DOCUMENT_ROOT__INFORMALFIGURE:
				return getInformalfigure() != null;
			case DocbookPackage.DOCUMENT_ROOT__INFORMALTABLE:
				return getInformaltable() != null;
			case DocbookPackage.DOCUMENT_ROOT__INITIALIZER:
				return getInitializer() != null;
			case DocbookPackage.DOCUMENT_ROOT__INLINEEQUATION:
				return getInlineequation() != null;
			case DocbookPackage.DOCUMENT_ROOT__INLINEMEDIAOBJECT:
				return getInlinemediaobject() != null;
			case DocbookPackage.DOCUMENT_ROOT__INTERFACENAME:
				return getInterfacename() != null;
			case DocbookPackage.DOCUMENT_ROOT__ISSUENUM:
				return getIssuenum() != null;
			case DocbookPackage.DOCUMENT_ROOT__ITEMIZEDLIST:
				return getItemizedlist() != null;
			case DocbookPackage.DOCUMENT_ROOT__ITERMSET:
				return getItermset() != null;
			case DocbookPackage.DOCUMENT_ROOT__JOBTITLE:
				return getJobtitle() != null;
			case DocbookPackage.DOCUMENT_ROOT__KEYCAP:
				return getKeycap() != null;
			case DocbookPackage.DOCUMENT_ROOT__KEYCODE:
				return getKeycode() != null;
			case DocbookPackage.DOCUMENT_ROOT__KEYCOMBO:
				return getKeycombo() != null;
			case DocbookPackage.DOCUMENT_ROOT__KEYSYM:
				return getKeysym() != null;
			case DocbookPackage.DOCUMENT_ROOT__KEYWORD:
				return getKeyword() != null;
			case DocbookPackage.DOCUMENT_ROOT__KEYWORDSET:
				return getKeywordset() != null;
			case DocbookPackage.DOCUMENT_ROOT__LABEL:
				return getLabel() != null;
			case DocbookPackage.DOCUMENT_ROOT__LEGALNOTICE:
				return getLegalnotice() != null;
			case DocbookPackage.DOCUMENT_ROOT__LHS:
				return getLhs() != null;
			case DocbookPackage.DOCUMENT_ROOT__LINEAGE:
				return getLineage() != null;
			case DocbookPackage.DOCUMENT_ROOT__LINEANNOTATION:
				return getLineannotation() != null;
			case DocbookPackage.DOCUMENT_ROOT__LINK:
				return getLink() != null;
			case DocbookPackage.DOCUMENT_ROOT__LISTITEM:
				return getListitem() != null;
			case DocbookPackage.DOCUMENT_ROOT__LITERAL:
				return getLiteral() != null;
			case DocbookPackage.DOCUMENT_ROOT__LITERALLAYOUT:
				return getLiterallayout() != null;
			case DocbookPackage.DOCUMENT_ROOT__LOCATOR:
				return getLocator() != null;
			case DocbookPackage.DOCUMENT_ROOT__MANVOLNUM:
				return getManvolnum() != null;
			case DocbookPackage.DOCUMENT_ROOT__MARKUP:
				return getMarkup() != null;
			case DocbookPackage.DOCUMENT_ROOT__MATHPHRASE:
				return getMathphrase() != null;
			case DocbookPackage.DOCUMENT_ROOT__MEDIAOBJECT:
				return getMediaobject() != null;
			case DocbookPackage.DOCUMENT_ROOT__MEMBER:
				return getMember() != null;
			case DocbookPackage.DOCUMENT_ROOT__MENUCHOICE:
				return getMenuchoice() != null;
			case DocbookPackage.DOCUMENT_ROOT__METHODNAME:
				return getMethodname() != null;
			case DocbookPackage.DOCUMENT_ROOT__METHODPARAM:
				return getMethodparam() != null;
			case DocbookPackage.DOCUMENT_ROOT__METHODSYNOPSIS:
				return getMethodsynopsis() != null;
			case DocbookPackage.DOCUMENT_ROOT__MODIFIER:
				return getModifier() != null;
			case DocbookPackage.DOCUMENT_ROOT__MOUSEBUTTON:
				return getMousebutton() != null;
			case DocbookPackage.DOCUMENT_ROOT__MSG:
				return getMsg() != null;
			case DocbookPackage.DOCUMENT_ROOT__MSGAUD:
				return getMsgaud() != null;
			case DocbookPackage.DOCUMENT_ROOT__MSGENTRY:
				return getMsgentry() != null;
			case DocbookPackage.DOCUMENT_ROOT__MSGEXPLAN:
				return getMsgexplan() != null;
			case DocbookPackage.DOCUMENT_ROOT__MSGINFO:
				return getMsginfo() != null;
			case DocbookPackage.DOCUMENT_ROOT__MSGLEVEL:
				return getMsglevel() != null;
			case DocbookPackage.DOCUMENT_ROOT__MSGMAIN:
				return getMsgmain() != null;
			case DocbookPackage.DOCUMENT_ROOT__MSGORIG:
				return getMsgorig() != null;
			case DocbookPackage.DOCUMENT_ROOT__MSGREL:
				return getMsgrel() != null;
			case DocbookPackage.DOCUMENT_ROOT__MSGSET:
				return getMsgset() != null;
			case DocbookPackage.DOCUMENT_ROOT__MSGSUB:
				return getMsgsub() != null;
			case DocbookPackage.DOCUMENT_ROOT__MSGTEXT:
				return getMsgtext() != null;
			case DocbookPackage.DOCUMENT_ROOT__NONTERMINAL:
				return getNonterminal() != null;
			case DocbookPackage.DOCUMENT_ROOT__NOTE:
				return getNote() != null;
			case DocbookPackage.DOCUMENT_ROOT__OLINK:
				return getOlink() != null;
			case DocbookPackage.DOCUMENT_ROOT__OOCLASS:
				return getOoclass() != null;
			case DocbookPackage.DOCUMENT_ROOT__OOEXCEPTION:
				return getOoexception() != null;
			case DocbookPackage.DOCUMENT_ROOT__OOINTERFACE:
				return getOointerface() != null;
			case DocbookPackage.DOCUMENT_ROOT__OPTION:
				return getOption() != null;
			case DocbookPackage.DOCUMENT_ROOT__OPTIONAL:
				return getOptional() != null;
			case DocbookPackage.DOCUMENT_ROOT__ORDEREDLIST:
				return getOrderedlist() != null;
			case DocbookPackage.DOCUMENT_ROOT__ORG:
				return getOrg() != null;
			case DocbookPackage.DOCUMENT_ROOT__ORGDIV:
				return getOrgdiv() != null;
			case DocbookPackage.DOCUMENT_ROOT__ORGNAME:
				return getOrgname() != null;
			case DocbookPackage.DOCUMENT_ROOT__OTHERADDR:
				return getOtheraddr() != null;
			case DocbookPackage.DOCUMENT_ROOT__OTHERCREDIT:
				return getOthercredit() != null;
			case DocbookPackage.DOCUMENT_ROOT__OTHERNAME:
				return getOthername() != null;
			case DocbookPackage.DOCUMENT_ROOT__PACKAGE:
				return getPackage() != null;
			case DocbookPackage.DOCUMENT_ROOT__PAGENUMS:
				return getPagenums() != null;
			case DocbookPackage.DOCUMENT_ROOT__PARA:
				return getPara() != null;
			case DocbookPackage.DOCUMENT_ROOT__PARAMDEF:
				return getParamdef() != null;
			case DocbookPackage.DOCUMENT_ROOT__PARAMETER:
				return getParameter() != null;
			case DocbookPackage.DOCUMENT_ROOT__PART:
				return getPart() != null;
			case DocbookPackage.DOCUMENT_ROOT__PARTINTRO:
				return getPartintro() != null;
			case DocbookPackage.DOCUMENT_ROOT__PERSON:
				return getPerson() != null;
			case DocbookPackage.DOCUMENT_ROOT__PERSONBLURB:
				return getPersonblurb() != null;
			case DocbookPackage.DOCUMENT_ROOT__PERSONNAME:
				return getPersonname() != null;
			case DocbookPackage.DOCUMENT_ROOT__PHONE:
				return getPhone() != null;
			case DocbookPackage.DOCUMENT_ROOT__PHRASE:
				return getPhrase() != null;
			case DocbookPackage.DOCUMENT_ROOT__POB:
				return getPob() != null;
			case DocbookPackage.DOCUMENT_ROOT__POSTCODE:
				return getPostcode() != null;
			case DocbookPackage.DOCUMENT_ROOT__PREFACE:
				return getPreface() != null;
			case DocbookPackage.DOCUMENT_ROOT__PRIMARY:
				return getPrimary() != null;
			case DocbookPackage.DOCUMENT_ROOT__PRIMARYIE:
				return getPrimaryie() != null;
			case DocbookPackage.DOCUMENT_ROOT__PRINTHISTORY:
				return getPrinthistory() != null;
			case DocbookPackage.DOCUMENT_ROOT__PROCEDURE:
				return getProcedure() != null;
			case DocbookPackage.DOCUMENT_ROOT__PRODUCTION:
				return getProduction() != null;
			case DocbookPackage.DOCUMENT_ROOT__PRODUCTIONRECAP:
				return getProductionrecap() != null;
			case DocbookPackage.DOCUMENT_ROOT__PRODUCTIONSET:
				return getProductionset() != null;
			case DocbookPackage.DOCUMENT_ROOT__PRODUCTNAME:
				return getProductname() != null;
			case DocbookPackage.DOCUMENT_ROOT__PRODUCTNUMBER:
				return getProductnumber() != null;
			case DocbookPackage.DOCUMENT_ROOT__PROGRAMLISTING:
				return getProgramlisting() != null;
			case DocbookPackage.DOCUMENT_ROOT__PROGRAMLISTINGCO:
				return getProgramlistingco() != null;
			case DocbookPackage.DOCUMENT_ROOT__PROMPT:
				return getPrompt() != null;
			case DocbookPackage.DOCUMENT_ROOT__PROPERTY:
				return getProperty() != null;
			case DocbookPackage.DOCUMENT_ROOT__PUBDATE:
				return getPubdate() != null;
			case DocbookPackage.DOCUMENT_ROOT__PUBLISHER:
				return getPublisher() != null;
			case DocbookPackage.DOCUMENT_ROOT__PUBLISHERNAME:
				return getPublishername() != null;
			case DocbookPackage.DOCUMENT_ROOT__QANDADIV:
				return getQandadiv() != null;
			case DocbookPackage.DOCUMENT_ROOT__QANDAENTRY:
				return getQandaentry() != null;
			case DocbookPackage.DOCUMENT_ROOT__QANDASET:
				return getQandaset() != null;
			case DocbookPackage.DOCUMENT_ROOT__QUESTION:
				return getQuestion() != null;
			case DocbookPackage.DOCUMENT_ROOT__QUOTE:
				return getQuote() != null;
			case DocbookPackage.DOCUMENT_ROOT__REFCLASS:
				return getRefclass() != null;
			case DocbookPackage.DOCUMENT_ROOT__REFDESCRIPTOR:
				return getRefdescriptor() != null;
			case DocbookPackage.DOCUMENT_ROOT__REFENTRY:
				return getRefentry() != null;
			case DocbookPackage.DOCUMENT_ROOT__REFENTRYTITLE:
				return getRefentrytitle() != null;
			case DocbookPackage.DOCUMENT_ROOT__REFERENCE:
				return getReference() != null;
			case DocbookPackage.DOCUMENT_ROOT__REFMETA:
				return getRefmeta() != null;
			case DocbookPackage.DOCUMENT_ROOT__REFMISCINFO:
				return getRefmiscinfo() != null;
			case DocbookPackage.DOCUMENT_ROOT__REFNAME:
				return getRefname() != null;
			case DocbookPackage.DOCUMENT_ROOT__REFNAMEDIV:
				return getRefnamediv() != null;
			case DocbookPackage.DOCUMENT_ROOT__REFPURPOSE:
				return getRefpurpose() != null;
			case DocbookPackage.DOCUMENT_ROOT__REFSECT1:
				return getRefsect1() != null;
			case DocbookPackage.DOCUMENT_ROOT__REFSECT2:
				return getRefsect2() != null;
			case DocbookPackage.DOCUMENT_ROOT__REFSECT3:
				return getRefsect3() != null;
			case DocbookPackage.DOCUMENT_ROOT__REFSECTION:
				return getRefsection() != null;
			case DocbookPackage.DOCUMENT_ROOT__REFSYNOPSISDIV:
				return getRefsynopsisdiv() != null;
			case DocbookPackage.DOCUMENT_ROOT__RELEASEINFO:
				return getReleaseinfo() != null;
			case DocbookPackage.DOCUMENT_ROOT__REMARK:
				return getRemark() != null;
			case DocbookPackage.DOCUMENT_ROOT__REPLACEABLE:
				return getReplaceable() != null;
			case DocbookPackage.DOCUMENT_ROOT__RETURNVALUE:
				return getReturnvalue() != null;
			case DocbookPackage.DOCUMENT_ROOT__REVDESCRIPTION:
				return getRevdescription() != null;
			case DocbookPackage.DOCUMENT_ROOT__REVHISTORY:
				return getRevhistory() != null;
			case DocbookPackage.DOCUMENT_ROOT__REVISION:
				return getRevision() != null;
			case DocbookPackage.DOCUMENT_ROOT__REVNUMBER:
				return getRevnumber() != null;
			case DocbookPackage.DOCUMENT_ROOT__REVREMARK:
				return getRevremark() != null;
			case DocbookPackage.DOCUMENT_ROOT__RHS:
				return getRhs() != null;
			case DocbookPackage.DOCUMENT_ROOT__ROW:
				return getRow() != null;
			case DocbookPackage.DOCUMENT_ROOT__SBR:
				return getSbr() != null;
			case DocbookPackage.DOCUMENT_ROOT__SCREEN:
				return getScreen() != null;
			case DocbookPackage.DOCUMENT_ROOT__SCREENCO:
				return getScreenco() != null;
			case DocbookPackage.DOCUMENT_ROOT__SCREENSHOT:
				return getScreenshot() != null;
			case DocbookPackage.DOCUMENT_ROOT__SECONDARY:
				return getSecondary() != null;
			case DocbookPackage.DOCUMENT_ROOT__SECONDARYIE:
				return getSecondaryie() != null;
			case DocbookPackage.DOCUMENT_ROOT__SECT1:
				return getSect1() != null;
			case DocbookPackage.DOCUMENT_ROOT__SECT2:
				return getSect2() != null;
			case DocbookPackage.DOCUMENT_ROOT__SECT3:
				return getSect3() != null;
			case DocbookPackage.DOCUMENT_ROOT__SECT4:
				return getSect4() != null;
			case DocbookPackage.DOCUMENT_ROOT__SECT5:
				return getSect5() != null;
			case DocbookPackage.DOCUMENT_ROOT__SECTION:
				return getSection() != null;
			case DocbookPackage.DOCUMENT_ROOT__SEE:
				return getSee() != null;
			case DocbookPackage.DOCUMENT_ROOT__SEEALSO:
				return getSeealso() != null;
			case DocbookPackage.DOCUMENT_ROOT__SEEALSOIE:
				return getSeealsoie() != null;
			case DocbookPackage.DOCUMENT_ROOT__SEEIE:
				return getSeeie() != null;
			case DocbookPackage.DOCUMENT_ROOT__SEG:
				return getSeg() != null;
			case DocbookPackage.DOCUMENT_ROOT__SEGLISTITEM:
				return getSeglistitem() != null;
			case DocbookPackage.DOCUMENT_ROOT__SEGMENTEDLIST:
				return getSegmentedlist() != null;
			case DocbookPackage.DOCUMENT_ROOT__SEGTITLE:
				return getSegtitle() != null;
			case DocbookPackage.DOCUMENT_ROOT__SERIESVOLNUMS:
				return getSeriesvolnums() != null;
			case DocbookPackage.DOCUMENT_ROOT__SET:
				return getSet() != null;
			case DocbookPackage.DOCUMENT_ROOT__SETINDEX:
				return getSetindex() != null;
			case DocbookPackage.DOCUMENT_ROOT__SHORTAFFIL:
				return getShortaffil() != null;
			case DocbookPackage.DOCUMENT_ROOT__SHORTCUT:
				return getShortcut() != null;
			case DocbookPackage.DOCUMENT_ROOT__SIDEBAR:
				return getSidebar() != null;
			case DocbookPackage.DOCUMENT_ROOT__SIMPARA:
				return getSimpara() != null;
			case DocbookPackage.DOCUMENT_ROOT__SIMPLELIST:
				return getSimplelist() != null;
			case DocbookPackage.DOCUMENT_ROOT__SIMPLEMSGENTRY:
				return getSimplemsgentry() != null;
			case DocbookPackage.DOCUMENT_ROOT__SIMPLESECT:
				return getSimplesect() != null;
			case DocbookPackage.DOCUMENT_ROOT__SPANSPEC:
				return getSpanspec() != null;
			case DocbookPackage.DOCUMENT_ROOT__STATE:
				return getState() != null;
			case DocbookPackage.DOCUMENT_ROOT__STEP:
				return getStep() != null;
			case DocbookPackage.DOCUMENT_ROOT__STEPALTERNATIVES:
				return getStepalternatives() != null;
			case DocbookPackage.DOCUMENT_ROOT__STREET:
				return getStreet() != null;
			case DocbookPackage.DOCUMENT_ROOT__SUBJECT:
				return getSubject() != null;
			case DocbookPackage.DOCUMENT_ROOT__SUBJECTSET:
				return getSubjectset() != null;
			case DocbookPackage.DOCUMENT_ROOT__SUBJECTTERM:
				return getSubjectterm() != null;
			case DocbookPackage.DOCUMENT_ROOT__SUBSCRIPT:
				return getSubscript() != null;
			case DocbookPackage.DOCUMENT_ROOT__SUBSTEPS:
				return getSubsteps() != null;
			case DocbookPackage.DOCUMENT_ROOT__SUBTITLE:
				return getSubtitle() != null;
			case DocbookPackage.DOCUMENT_ROOT__SUPERSCRIPT:
				return getSuperscript() != null;
			case DocbookPackage.DOCUMENT_ROOT__SURNAME:
				return getSurname() != null;
			case DocbookPackage.DOCUMENT_ROOT__SYMBOL:
				return getSymbol() != null;
			case DocbookPackage.DOCUMENT_ROOT__SYNOPFRAGMENT:
				return getSynopfragment() != null;
			case DocbookPackage.DOCUMENT_ROOT__SYNOPFRAGMENTREF:
				return getSynopfragmentref() != null;
			case DocbookPackage.DOCUMENT_ROOT__SYNOPSIS:
				return getSynopsis() != null;
			case DocbookPackage.DOCUMENT_ROOT__SYSTEMITEM:
				return getSystemitem() != null;
			case DocbookPackage.DOCUMENT_ROOT__TABLE:
				return getTable() != null;
			case DocbookPackage.DOCUMENT_ROOT__TAG:
				return getTag() != null;
			case DocbookPackage.DOCUMENT_ROOT__TASK:
				return getTask() != null;
			case DocbookPackage.DOCUMENT_ROOT__TASKPREREQUISITES:
				return getTaskprerequisites() != null;
			case DocbookPackage.DOCUMENT_ROOT__TASKRELATED:
				return getTaskrelated() != null;
			case DocbookPackage.DOCUMENT_ROOT__TASKSUMMARY:
				return getTasksummary() != null;
			case DocbookPackage.DOCUMENT_ROOT__TBODY:
				return getTbody() != null;
			case DocbookPackage.DOCUMENT_ROOT__TD:
				return getTd() != null;
			case DocbookPackage.DOCUMENT_ROOT__TERM:
				return getTerm() != null;
			case DocbookPackage.DOCUMENT_ROOT__TERMDEF:
				return getTermdef() != null;
			case DocbookPackage.DOCUMENT_ROOT__TERTIARY:
				return getTertiary() != null;
			case DocbookPackage.DOCUMENT_ROOT__TERTIARYIE:
				return getTertiaryie() != null;
			case DocbookPackage.DOCUMENT_ROOT__TEXTDATA:
				return getTextdata() != null;
			case DocbookPackage.DOCUMENT_ROOT__TEXTOBJECT:
				return getTextobject() != null;
			case DocbookPackage.DOCUMENT_ROOT__TFOOT:
				return getTfoot() != null;
			case DocbookPackage.DOCUMENT_ROOT__TGROUP:
				return getTgroup() != null;
			case DocbookPackage.DOCUMENT_ROOT__TH:
				return getTh() != null;
			case DocbookPackage.DOCUMENT_ROOT__THEAD:
				return getThead() != null;
			case DocbookPackage.DOCUMENT_ROOT__TIP:
				return getTip() != null;
			case DocbookPackage.DOCUMENT_ROOT__TITLE:
				return getTitle() != null;
			case DocbookPackage.DOCUMENT_ROOT__TITLEABBREV:
				return getTitleabbrev() != null;
			case DocbookPackage.DOCUMENT_ROOT__TOC:
				return getToc() != null;
			case DocbookPackage.DOCUMENT_ROOT__TOCDIV:
				return getTocdiv() != null;
			case DocbookPackage.DOCUMENT_ROOT__TOCENTRY:
				return getTocentry() != null;
			case DocbookPackage.DOCUMENT_ROOT__TOKEN:
				return getToken() != null;
			case DocbookPackage.DOCUMENT_ROOT__TR:
				return getTr() != null;
			case DocbookPackage.DOCUMENT_ROOT__TRADEMARK:
				return getTrademark() != null;
			case DocbookPackage.DOCUMENT_ROOT__TYPE:
				return getType() != null;
			case DocbookPackage.DOCUMENT_ROOT__URI:
				return getUri() != null;
			case DocbookPackage.DOCUMENT_ROOT__USERINPUT:
				return getUserinput() != null;
			case DocbookPackage.DOCUMENT_ROOT__VARARGS:
				return getVarargs() != null;
			case DocbookPackage.DOCUMENT_ROOT__VARIABLELIST:
				return getVariablelist() != null;
			case DocbookPackage.DOCUMENT_ROOT__VARLISTENTRY:
				return getVarlistentry() != null;
			case DocbookPackage.DOCUMENT_ROOT__VARNAME:
				return getVarname() != null;
			case DocbookPackage.DOCUMENT_ROOT__VIDEODATA:
				return getVideodata() != null;
			case DocbookPackage.DOCUMENT_ROOT__VIDEOOBJECT:
				return getVideoobject() != null;
			case DocbookPackage.DOCUMENT_ROOT__VOID:
				return getVoid() != null;
			case DocbookPackage.DOCUMENT_ROOT__VOLUMENUM:
				return getVolumenum() != null;
			case DocbookPackage.DOCUMENT_ROOT__WARNING:
				return getWarning() != null;
			case DocbookPackage.DOCUMENT_ROOT__WORDASWORD:
				return getWordasword() != null;
			case DocbookPackage.DOCUMENT_ROOT__XREF:
				return getXref() != null;
			case DocbookPackage.DOCUMENT_ROOT__YEAR:
				return getYear() != null;
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
		result.append(')');
		return result.toString();
	}

} //DocumentRootImpl
