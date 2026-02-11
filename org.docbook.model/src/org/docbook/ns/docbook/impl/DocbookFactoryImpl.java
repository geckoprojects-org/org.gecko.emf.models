/**
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

import org.docbook.ns.docbook.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DocbookFactoryImpl extends EFactoryImpl implements DocbookFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DocbookFactory init() {
		try {
			DocbookFactory theDocbookFactory = (DocbookFactory)EPackage.Registry.INSTANCE.getEFactory(DocbookPackage.eNS_URI);
			if (theDocbookFactory != null) {
				return theDocbookFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DocbookFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocbookFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case DocbookPackage.ABBREV_TYPE: return createAbbrevType();
			case DocbookPackage.ABSTRACT_TYPE: return createAbstractType();
			case DocbookPackage.ACCEL_TYPE: return createAccelType();
			case DocbookPackage.ACKNOWLEDGEMENTS_TYPE: return createAcknowledgementsType();
			case DocbookPackage.ACRONYM_TYPE: return createAcronymType();
			case DocbookPackage.ADDRESS_TYPE: return createAddressType();
			case DocbookPackage.AFFILIATION_TYPE: return createAffiliationType();
			case DocbookPackage.ALT_TYPE: return createAltType();
			case DocbookPackage.ANCHOR_TYPE: return createAnchorType();
			case DocbookPackage.ANNOTATION_TYPE: return createAnnotationType();
			case DocbookPackage.ANSWER_TYPE: return createAnswerType();
			case DocbookPackage.APPENDIX_TYPE: return createAppendixType();
			case DocbookPackage.APPLICATION_TYPE: return createApplicationType();
			case DocbookPackage.ARC_TYPE: return createArcType();
			case DocbookPackage.AREASET_TYPE: return createAreasetType();
			case DocbookPackage.AREASPEC_TYPE: return createAreaspecType();
			case DocbookPackage.AREA_TYPE: return createAreaType();
			case DocbookPackage.ARG_TYPE: return createArgType();
			case DocbookPackage.ARTICLE_TYPE: return createArticleType();
			case DocbookPackage.ARTPAGENUMS_TYPE: return createArtpagenumsType();
			case DocbookPackage.ATTRIBUTION_TYPE: return createAttributionType();
			case DocbookPackage.AUDIODATA_TYPE: return createAudiodataType();
			case DocbookPackage.AUDIOOBJECT_TYPE: return createAudioobjectType();
			case DocbookPackage.AUTHORGROUP_TYPE: return createAuthorgroupType();
			case DocbookPackage.AUTHORINITIALS_TYPE: return createAuthorinitialsType();
			case DocbookPackage.AUTHOR_TYPE: return createAuthorType();
			case DocbookPackage.BIBLIOCOVERAGE_TYPE: return createBibliocoverageType();
			case DocbookPackage.BIBLIODIV_TYPE: return createBibliodivType();
			case DocbookPackage.BIBLIOENTRY_TYPE: return createBiblioentryType();
			case DocbookPackage.BIBLIOGRAPHY_TYPE: return createBibliographyType();
			case DocbookPackage.BIBLIOID_TYPE: return createBiblioidType();
			case DocbookPackage.BIBLIOLIST_TYPE: return createBibliolistType();
			case DocbookPackage.BIBLIOMISC_TYPE: return createBibliomiscType();
			case DocbookPackage.BIBLIOMIXED_TYPE: return createBibliomixedType();
			case DocbookPackage.BIBLIOMSET_TYPE: return createBibliomsetType();
			case DocbookPackage.BIBLIOREF_TYPE: return createBibliorefType();
			case DocbookPackage.BIBLIORELATION_TYPE: return createBibliorelationType();
			case DocbookPackage.BIBLIOSET_TYPE: return createBibliosetType();
			case DocbookPackage.BIBLIOSOURCE_TYPE: return createBibliosourceType();
			case DocbookPackage.BLOCKQUOTE_TYPE: return createBlockquoteType();
			case DocbookPackage.BOOK_TYPE: return createBookType();
			case DocbookPackage.BRIDGEHEAD_TYPE: return createBridgeheadType();
			case DocbookPackage.CALLOUTLIST_TYPE: return createCalloutlistType();
			case DocbookPackage.CALLOUT_TYPE: return createCalloutType();
			case DocbookPackage.CAPTION_TYPE: return createCaptionType();
			case DocbookPackage.CAUTION_TYPE: return createCautionType();
			case DocbookPackage.CHAPTER_TYPE: return createChapterType();
			case DocbookPackage.CITATION_TYPE: return createCitationType();
			case DocbookPackage.CITEBIBLIOID_TYPE: return createCitebiblioidType();
			case DocbookPackage.CITEREFENTRY_TYPE: return createCiterefentryType();
			case DocbookPackage.CITETITLE_TYPE: return createCitetitleType();
			case DocbookPackage.CITY_TYPE: return createCityType();
			case DocbookPackage.CLASSNAME_TYPE: return createClassnameType();
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE: return createClasssynopsisinfoType();
			case DocbookPackage.CLASSSYNOPSIS_TYPE: return createClasssynopsisType();
			case DocbookPackage.CMDSYNOPSIS_TYPE: return createCmdsynopsisType();
			case DocbookPackage.CODE_TYPE: return createCodeType();
			case DocbookPackage.COLGROUP_TYPE: return createColgroupType();
			case DocbookPackage.COLLAB_TYPE: return createCollabType();
			case DocbookPackage.COLOPHON_TYPE: return createColophonType();
			case DocbookPackage.COLSPEC_TYPE: return createColspecType();
			case DocbookPackage.COL_TYPE: return createColType();
			case DocbookPackage.COMMAND_TYPE: return createCommandType();
			case DocbookPackage.COMPUTEROUTPUT_TYPE: return createComputeroutputType();
			case DocbookPackage.CONFDATES_TYPE: return createConfdatesType();
			case DocbookPackage.CONFGROUP_TYPE: return createConfgroupType();
			case DocbookPackage.CONFNUM_TYPE: return createConfnumType();
			case DocbookPackage.CONFSPONSOR_TYPE: return createConfsponsorType();
			case DocbookPackage.CONFTITLE_TYPE: return createConftitleType();
			case DocbookPackage.CONSTANT_TYPE: return createConstantType();
			case DocbookPackage.CONSTRAINTDEF_TYPE: return createConstraintdefType();
			case DocbookPackage.CONSTRAINT_TYPE: return createConstraintType();
			case DocbookPackage.CONSTRUCTORSYNOPSIS_TYPE: return createConstructorsynopsisType();
			case DocbookPackage.CONTRACTNUM_TYPE: return createContractnumType();
			case DocbookPackage.CONTRACTSPONSOR_TYPE: return createContractsponsorType();
			case DocbookPackage.CONTRIB_TYPE: return createContribType();
			case DocbookPackage.COPYRIGHT_TYPE: return createCopyrightType();
			case DocbookPackage.COREF_TYPE: return createCorefType();
			case DocbookPackage.CO_TYPE: return createCoType();
			case DocbookPackage.COUNTRY_TYPE: return createCountryType();
			case DocbookPackage.COVER_TYPE: return createCoverType();
			case DocbookPackage.DATABASE_TYPE: return createDatabaseType();
			case DocbookPackage.DATE_TYPE: return createDateType();
			case DocbookPackage.DEDICATION_TYPE: return createDedicationType();
			case DocbookPackage.DESTRUCTORSYNOPSIS_TYPE: return createDestructorsynopsisType();
			case DocbookPackage.DOCUMENT_ROOT: return createDocumentRoot();
			case DocbookPackage.EDITION_TYPE: return createEditionType();
			case DocbookPackage.EDITOR_TYPE: return createEditorType();
			case DocbookPackage.EMAIL_TYPE: return createEmailType();
			case DocbookPackage.EMPHASIS_TYPE: return createEmphasisType();
			case DocbookPackage.ENTRYTBL_TYPE: return createEntrytblType();
			case DocbookPackage.ENTRY_TYPE: return createEntryType();
			case DocbookPackage.ENVAR_TYPE: return createEnvarType();
			case DocbookPackage.EPIGRAPH_TYPE: return createEpigraphType();
			case DocbookPackage.EQUATION_TYPE: return createEquationType();
			case DocbookPackage.ERRORCODE_TYPE: return createErrorcodeType();
			case DocbookPackage.ERRORNAME_TYPE: return createErrornameType();
			case DocbookPackage.ERRORTEXT_TYPE: return createErrortextType();
			case DocbookPackage.ERRORTYPE_TYPE: return createErrortypeType();
			case DocbookPackage.EXAMPLE_TYPE: return createExampleType();
			case DocbookPackage.EXCEPTIONNAME_TYPE: return createExceptionnameType();
			case DocbookPackage.EXTENDEDLINK_TYPE: return createExtendedlinkType();
			case DocbookPackage.FAX_TYPE: return createFaxType();
			case DocbookPackage.FIELDSYNOPSIS_TYPE: return createFieldsynopsisType();
			case DocbookPackage.FIGURE_TYPE: return createFigureType();
			case DocbookPackage.FILENAME_TYPE: return createFilenameType();
			case DocbookPackage.FIRSTNAME_TYPE: return createFirstnameType();
			case DocbookPackage.FIRSTTERM_TYPE: return createFirsttermType();
			case DocbookPackage.FOOTNOTEREF_TYPE: return createFootnoterefType();
			case DocbookPackage.FOOTNOTE_TYPE: return createFootnoteType();
			case DocbookPackage.FOREIGNPHRASE_TYPE: return createForeignphraseType();
			case DocbookPackage.FORMALPARA_TYPE: return createFormalparaType();
			case DocbookPackage.FUNCDEF_TYPE: return createFuncdefType();
			case DocbookPackage.FUNCPARAMS_TYPE: return createFuncparamsType();
			case DocbookPackage.FUNCPROTOTYPE_TYPE: return createFuncprototypeType();
			case DocbookPackage.FUNCSYNOPSISINFO_TYPE: return createFuncsynopsisinfoType();
			case DocbookPackage.FUNCSYNOPSIS_TYPE: return createFuncsynopsisType();
			case DocbookPackage.FUNCTION_TYPE1: return createFunctionType1();
			case DocbookPackage.GLOSSARY_TYPE: return createGlossaryType();
			case DocbookPackage.GLOSSDEF_TYPE: return createGlossdefType();
			case DocbookPackage.GLOSSDIV_TYPE: return createGlossdivType();
			case DocbookPackage.GLOSSENTRY_TYPE: return createGlossentryType();
			case DocbookPackage.GLOSSLIST_TYPE: return createGlosslistType();
			case DocbookPackage.GLOSSSEEALSO_TYPE: return createGlossseealsoType();
			case DocbookPackage.GLOSSSEE_TYPE: return createGlossseeType();
			case DocbookPackage.GLOSSTERM_TYPE: return createGlosstermType();
			case DocbookPackage.GROUP_TYPE: return createGroupType();
			case DocbookPackage.GUIBUTTON_TYPE: return createGuibuttonType();
			case DocbookPackage.GUIICON_TYPE: return createGuiiconType();
			case DocbookPackage.GUILABEL_TYPE: return createGuilabelType();
			case DocbookPackage.GUIMENUITEM_TYPE: return createGuimenuitemType();
			case DocbookPackage.GUIMENU_TYPE: return createGuimenuType();
			case DocbookPackage.GUISUBMENU_TYPE: return createGuisubmenuType();
			case DocbookPackage.HARDWARE_TYPE: return createHardwareType();
			case DocbookPackage.HOLDER_TYPE: return createHolderType();
			case DocbookPackage.HONORIFIC_TYPE: return createHonorificType();
			case DocbookPackage.IMAGEDATA_TYPE: return createImagedataType();
			case DocbookPackage.IMAGEOBJECTCO_TYPE: return createImageobjectcoType();
			case DocbookPackage.IMAGEOBJECT_TYPE: return createImageobjectType();
			case DocbookPackage.IMPORTANT_TYPE: return createImportantType();
			case DocbookPackage.INDEXDIV_TYPE: return createIndexdivType();
			case DocbookPackage.INDEXENTRY_TYPE: return createIndexentryType();
			case DocbookPackage.INDEXTERM_TYPE: return createIndextermType();
			case DocbookPackage.INDEX_TYPE: return createIndexType();
			case DocbookPackage.INFORMALEQUATION_TYPE: return createInformalequationType();
			case DocbookPackage.INFORMALEXAMPLE_TYPE: return createInformalexampleType();
			case DocbookPackage.INFORMALFIGURE_TYPE: return createInformalfigureType();
			case DocbookPackage.INFORMALTABLE_TYPE: return createInformaltableType();
			case DocbookPackage.INFO_TYPE: return createInfoType();
			case DocbookPackage.INITIALIZER_TYPE: return createInitializerType();
			case DocbookPackage.INLINEEQUATION_TYPE: return createInlineequationType();
			case DocbookPackage.INLINEMEDIAOBJECT_TYPE: return createInlinemediaobjectType();
			case DocbookPackage.INTERFACENAME_TYPE: return createInterfacenameType();
			case DocbookPackage.ISSUENUM_TYPE: return createIssuenumType();
			case DocbookPackage.ITEMIZEDLIST_TYPE: return createItemizedlistType();
			case DocbookPackage.ITERMSET_TYPE: return createItermsetType();
			case DocbookPackage.JOBTITLE_TYPE: return createJobtitleType();
			case DocbookPackage.KEYCAP_TYPE: return createKeycapType();
			case DocbookPackage.KEYCODE_TYPE: return createKeycodeType();
			case DocbookPackage.KEYCOMBO_TYPE: return createKeycomboType();
			case DocbookPackage.KEYSYM_TYPE: return createKeysymType();
			case DocbookPackage.KEYWORDSET_TYPE: return createKeywordsetType();
			case DocbookPackage.KEYWORD_TYPE: return createKeywordType();
			case DocbookPackage.LABEL_TYPE: return createLabelType();
			case DocbookPackage.LEGALNOTICE_TYPE: return createLegalnoticeType();
			case DocbookPackage.LHS_TYPE: return createLhsType();
			case DocbookPackage.LINEAGE_TYPE: return createLineageType();
			case DocbookPackage.LINEANNOTATION_TYPE: return createLineannotationType();
			case DocbookPackage.LINK_TYPE: return createLinkType();
			case DocbookPackage.LISTITEM_TYPE: return createListitemType();
			case DocbookPackage.LITERALLAYOUT_TYPE: return createLiterallayoutType();
			case DocbookPackage.LITERAL_TYPE: return createLiteralType();
			case DocbookPackage.LOCATOR_TYPE: return createLocatorType();
			case DocbookPackage.MANVOLNUM_TYPE: return createManvolnumType();
			case DocbookPackage.MARKUP_TYPE: return createMarkupType();
			case DocbookPackage.MATHPHRASE_TYPE: return createMathphraseType();
			case DocbookPackage.MEDIAOBJECT_TYPE: return createMediaobjectType();
			case DocbookPackage.MEMBER_TYPE: return createMemberType();
			case DocbookPackage.MENUCHOICE_TYPE: return createMenuchoiceType();
			case DocbookPackage.METHODNAME_TYPE: return createMethodnameType();
			case DocbookPackage.METHODPARAM_TYPE: return createMethodparamType();
			case DocbookPackage.METHODSYNOPSIS_TYPE: return createMethodsynopsisType();
			case DocbookPackage.MODIFIER_TYPE: return createModifierType();
			case DocbookPackage.MOUSEBUTTON_TYPE: return createMousebuttonType();
			case DocbookPackage.MSGAUD_TYPE: return createMsgaudType();
			case DocbookPackage.MSGENTRY_TYPE: return createMsgentryType();
			case DocbookPackage.MSGEXPLAN_TYPE: return createMsgexplanType();
			case DocbookPackage.MSGINFO_TYPE: return createMsginfoType();
			case DocbookPackage.MSGLEVEL_TYPE: return createMsglevelType();
			case DocbookPackage.MSGMAIN_TYPE: return createMsgmainType();
			case DocbookPackage.MSGORIG_TYPE: return createMsgorigType();
			case DocbookPackage.MSGREL_TYPE: return createMsgrelType();
			case DocbookPackage.MSGSET_TYPE: return createMsgsetType();
			case DocbookPackage.MSGSUB_TYPE: return createMsgsubType();
			case DocbookPackage.MSGTEXT_TYPE: return createMsgtextType();
			case DocbookPackage.MSG_TYPE: return createMsgType();
			case DocbookPackage.NONTERMINAL_TYPE: return createNonterminalType();
			case DocbookPackage.NOTE_TYPE: return createNoteType();
			case DocbookPackage.OLINK_TYPE: return createOlinkType();
			case DocbookPackage.OOCLASS_TYPE: return createOoclassType();
			case DocbookPackage.OOEXCEPTION_TYPE: return createOoexceptionType();
			case DocbookPackage.OOINTERFACE_TYPE: return createOointerfaceType();
			case DocbookPackage.OPTIONAL_TYPE: return createOptionalType();
			case DocbookPackage.OPTION_TYPE: return createOptionType();
			case DocbookPackage.ORDEREDLIST_TYPE: return createOrderedlistType();
			case DocbookPackage.ORGDIV_TYPE: return createOrgdivType();
			case DocbookPackage.ORGNAME_TYPE: return createOrgnameType();
			case DocbookPackage.ORG_TYPE: return createOrgType();
			case DocbookPackage.OTHERADDR_TYPE: return createOtheraddrType();
			case DocbookPackage.OTHERCREDIT_TYPE: return createOthercreditType();
			case DocbookPackage.OTHERNAME_TYPE: return createOthernameType();
			case DocbookPackage.PACKAGE_TYPE: return createPackageType();
			case DocbookPackage.PAGENUMS_TYPE: return createPagenumsType();
			case DocbookPackage.PARAMDEF_TYPE: return createParamdefType();
			case DocbookPackage.PARAMETER_TYPE: return createParameterType();
			case DocbookPackage.PARA_TYPE: return createParaType();
			case DocbookPackage.PARTINTRO_TYPE: return createPartintroType();
			case DocbookPackage.PART_TYPE: return createPartType();
			case DocbookPackage.PERSONBLURB_TYPE: return createPersonblurbType();
			case DocbookPackage.PERSONNAME_TYPE: return createPersonnameType();
			case DocbookPackage.PERSON_TYPE: return createPersonType();
			case DocbookPackage.PHONE_TYPE: return createPhoneType();
			case DocbookPackage.PHRASE_TYPE: return createPhraseType();
			case DocbookPackage.POB_TYPE: return createPobType();
			case DocbookPackage.POSTCODE_TYPE: return createPostcodeType();
			case DocbookPackage.PREFACE_TYPE: return createPrefaceType();
			case DocbookPackage.PRIMARYIE_TYPE: return createPrimaryieType();
			case DocbookPackage.PRIMARY_TYPE: return createPrimaryType();
			case DocbookPackage.PRINTHISTORY_TYPE: return createPrinthistoryType();
			case DocbookPackage.PROCEDURE_TYPE: return createProcedureType();
			case DocbookPackage.PRODUCTIONRECAP_TYPE: return createProductionrecapType();
			case DocbookPackage.PRODUCTIONSET_TYPE: return createProductionsetType();
			case DocbookPackage.PRODUCTION_TYPE: return createProductionType();
			case DocbookPackage.PRODUCTNAME_TYPE: return createProductnameType();
			case DocbookPackage.PRODUCTNUMBER_TYPE: return createProductnumberType();
			case DocbookPackage.PROGRAMLISTINGCO_TYPE: return createProgramlistingcoType();
			case DocbookPackage.PROGRAMLISTING_TYPE: return createProgramlistingType();
			case DocbookPackage.PROMPT_TYPE: return createPromptType();
			case DocbookPackage.PROPERTY_TYPE: return createPropertyType();
			case DocbookPackage.PUBDATE_TYPE: return createPubdateType();
			case DocbookPackage.PUBLISHERNAME_TYPE: return createPublishernameType();
			case DocbookPackage.PUBLISHER_TYPE: return createPublisherType();
			case DocbookPackage.QANDADIV_TYPE: return createQandadivType();
			case DocbookPackage.QANDAENTRY_TYPE: return createQandaentryType();
			case DocbookPackage.QANDASET_TYPE: return createQandasetType();
			case DocbookPackage.QUESTION_TYPE: return createQuestionType();
			case DocbookPackage.QUOTE_TYPE: return createQuoteType();
			case DocbookPackage.REFCLASS_TYPE: return createRefclassType();
			case DocbookPackage.REFDESCRIPTOR_TYPE: return createRefdescriptorType();
			case DocbookPackage.REFENTRYTITLE_TYPE: return createRefentrytitleType();
			case DocbookPackage.REFENTRY_TYPE: return createRefentryType();
			case DocbookPackage.REFERENCE_TYPE: return createReferenceType();
			case DocbookPackage.REFMETA_TYPE: return createRefmetaType();
			case DocbookPackage.REFMISCINFO_TYPE: return createRefmiscinfoType();
			case DocbookPackage.REFNAMEDIV_TYPE: return createRefnamedivType();
			case DocbookPackage.REFNAME_TYPE: return createRefnameType();
			case DocbookPackage.REFPURPOSE_TYPE: return createRefpurposeType();
			case DocbookPackage.REFSECT1_TYPE: return createRefsect1Type();
			case DocbookPackage.REFSECT2_TYPE: return createRefsect2Type();
			case DocbookPackage.REFSECT3_TYPE: return createRefsect3Type();
			case DocbookPackage.REFSECTION_TYPE: return createRefsectionType();
			case DocbookPackage.REFSYNOPSISDIV_TYPE: return createRefsynopsisdivType();
			case DocbookPackage.RELEASEINFO_TYPE: return createReleaseinfoType();
			case DocbookPackage.REMARK_TYPE: return createRemarkType();
			case DocbookPackage.REPLACEABLE_TYPE: return createReplaceableType();
			case DocbookPackage.RETURNVALUE_TYPE: return createReturnvalueType();
			case DocbookPackage.REVDESCRIPTION_TYPE: return createRevdescriptionType();
			case DocbookPackage.REVHISTORY_TYPE: return createRevhistoryType();
			case DocbookPackage.REVISION_TYPE: return createRevisionType();
			case DocbookPackage.REVNUMBER_TYPE: return createRevnumberType();
			case DocbookPackage.REVREMARK_TYPE: return createRevremarkType();
			case DocbookPackage.RHS_TYPE: return createRhsType();
			case DocbookPackage.ROW_TYPE: return createRowType();
			case DocbookPackage.SBR_TYPE: return createSbrType();
			case DocbookPackage.SCREENCO_TYPE: return createScreencoType();
			case DocbookPackage.SCREENSHOT_TYPE: return createScreenshotType();
			case DocbookPackage.SCREEN_TYPE: return createScreenType();
			case DocbookPackage.SECONDARYIE_TYPE: return createSecondaryieType();
			case DocbookPackage.SECONDARY_TYPE: return createSecondaryType();
			case DocbookPackage.SECT1_TYPE: return createSect1Type();
			case DocbookPackage.SECT2_TYPE: return createSect2Type();
			case DocbookPackage.SECT3_TYPE: return createSect3Type();
			case DocbookPackage.SECT4_TYPE: return createSect4Type();
			case DocbookPackage.SECT5_TYPE: return createSect5Type();
			case DocbookPackage.SECTION_TYPE: return createSectionType();
			case DocbookPackage.SEEALSOIE_TYPE: return createSeealsoieType();
			case DocbookPackage.SEEALSO_TYPE: return createSeealsoType();
			case DocbookPackage.SEEIE_TYPE: return createSeeieType();
			case DocbookPackage.SEE_TYPE: return createSeeType();
			case DocbookPackage.SEGLISTITEM_TYPE: return createSeglistitemType();
			case DocbookPackage.SEGMENTEDLIST_TYPE: return createSegmentedlistType();
			case DocbookPackage.SEGTITLE_TYPE: return createSegtitleType();
			case DocbookPackage.SEG_TYPE: return createSegType();
			case DocbookPackage.SERIESVOLNUMS_TYPE: return createSeriesvolnumsType();
			case DocbookPackage.SETINDEX_TYPE: return createSetindexType();
			case DocbookPackage.SET_TYPE: return createSetType();
			case DocbookPackage.SHORTAFFIL_TYPE: return createShortaffilType();
			case DocbookPackage.SHORTCUT_TYPE: return createShortcutType();
			case DocbookPackage.SIDEBAR_TYPE: return createSidebarType();
			case DocbookPackage.SIMPARA_TYPE: return createSimparaType();
			case DocbookPackage.SIMPLELIST_TYPE: return createSimplelistType();
			case DocbookPackage.SIMPLEMSGENTRY_TYPE: return createSimplemsgentryType();
			case DocbookPackage.SIMPLESECT_TYPE: return createSimplesectType();
			case DocbookPackage.SPANSPEC_TYPE: return createSpanspecType();
			case DocbookPackage.STATE_TYPE: return createStateType();
			case DocbookPackage.STEPALTERNATIVES_TYPE: return createStepalternativesType();
			case DocbookPackage.STEP_TYPE: return createStepType();
			case DocbookPackage.STREET_TYPE: return createStreetType();
			case DocbookPackage.SUBJECTSET_TYPE: return createSubjectsetType();
			case DocbookPackage.SUBJECTTERM_TYPE: return createSubjecttermType();
			case DocbookPackage.SUBJECT_TYPE: return createSubjectType();
			case DocbookPackage.SUBSCRIPT_TYPE: return createSubscriptType();
			case DocbookPackage.SUBSTEPS_TYPE: return createSubstepsType();
			case DocbookPackage.SUBTITLE_TYPE: return createSubtitleType();
			case DocbookPackage.SUPERSCRIPT_TYPE: return createSuperscriptType();
			case DocbookPackage.SURNAME_TYPE: return createSurnameType();
			case DocbookPackage.SYMBOL_TYPE: return createSymbolType();
			case DocbookPackage.SYNOPFRAGMENTREF_TYPE: return createSynopfragmentrefType();
			case DocbookPackage.SYNOPFRAGMENT_TYPE: return createSynopfragmentType();
			case DocbookPackage.SYNOPSIS_TYPE: return createSynopsisType();
			case DocbookPackage.SYSTEMITEM_TYPE: return createSystemitemType();
			case DocbookPackage.TABLE_TYPE: return createTableType();
			case DocbookPackage.TAG_TYPE: return createTagType();
			case DocbookPackage.TASKPREREQUISITES_TYPE: return createTaskprerequisitesType();
			case DocbookPackage.TASKRELATED_TYPE: return createTaskrelatedType();
			case DocbookPackage.TASKSUMMARY_TYPE: return createTasksummaryType();
			case DocbookPackage.TASK_TYPE: return createTaskType();
			case DocbookPackage.TBODY_TYPE: return createTbodyType();
			case DocbookPackage.TD_TYPE: return createTdType();
			case DocbookPackage.TERMDEF_TYPE: return createTermdefType();
			case DocbookPackage.TERM_TYPE: return createTermType();
			case DocbookPackage.TERTIARYIE_TYPE: return createTertiaryieType();
			case DocbookPackage.TERTIARY_TYPE: return createTertiaryType();
			case DocbookPackage.TEXTDATA_TYPE: return createTextdataType();
			case DocbookPackage.TEXTOBJECT_TYPE: return createTextobjectType();
			case DocbookPackage.TFOOT_TYPE: return createTfootType();
			case DocbookPackage.TGROUP_TYPE: return createTgroupType();
			case DocbookPackage.THEAD_TYPE: return createTheadType();
			case DocbookPackage.TH_TYPE: return createThType();
			case DocbookPackage.TIP_TYPE: return createTipType();
			case DocbookPackage.TITLEABBREV_TYPE: return createTitleabbrevType();
			case DocbookPackage.TITLE_TYPE: return createTitleType();
			case DocbookPackage.TOCDIV_TYPE: return createTocdivType();
			case DocbookPackage.TOCENTRY_TYPE: return createTocentryType();
			case DocbookPackage.TOC_TYPE: return createTocType();
			case DocbookPackage.TOKEN_TYPE: return createTokenType();
			case DocbookPackage.TRADEMARK_TYPE: return createTrademarkType();
			case DocbookPackage.TR_TYPE: return createTrType();
			case DocbookPackage.TYPE_TYPE2: return createTypeType2();
			case DocbookPackage.URI_TYPE: return createUriType();
			case DocbookPackage.USERINPUT_TYPE: return createUserinputType();
			case DocbookPackage.VARARGS_TYPE: return createVarargsType();
			case DocbookPackage.VARIABLELIST_TYPE: return createVariablelistType();
			case DocbookPackage.VARLISTENTRY_TYPE: return createVarlistentryType();
			case DocbookPackage.VARNAME_TYPE: return createVarnameType();
			case DocbookPackage.VIDEODATA_TYPE: return createVideodataType();
			case DocbookPackage.VIDEOOBJECT_TYPE: return createVideoobjectType();
			case DocbookPackage.VOID_TYPE: return createVoidType();
			case DocbookPackage.VOLUMENUM_TYPE: return createVolumenumType();
			case DocbookPackage.WARNING_TYPE: return createWarningType();
			case DocbookPackage.WORDASWORD_TYPE: return createWordaswordType();
			case DocbookPackage.XREF_TYPE: return createXrefType();
			case DocbookPackage.YEAR_TYPE: return createYearType();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case DocbookPackage.ACTION_TYPE:
				return createActionTypeFromString(eDataType, initialValue);
			case DocbookPackage.ACTION_TYPE1:
				return createActionType1FromString(eDataType, initialValue);
			case DocbookPackage.ALIGN_TYPE:
				return createAlignTypeFromString(eDataType, initialValue);
			case DocbookPackage.ALIGN_TYPE1:
				return createAlignType1FromString(eDataType, initialValue);
			case DocbookPackage.ALIGN_TYPE2:
				return createAlignType2FromString(eDataType, initialValue);
			case DocbookPackage.ALIGN_TYPE3:
				return createAlignType3FromString(eDataType, initialValue);
			case DocbookPackage.ALIGN_TYPE4:
				return createAlignType4FromString(eDataType, initialValue);
			case DocbookPackage.ALIGN_TYPE5:
				return createAlignType5FromString(eDataType, initialValue);
			case DocbookPackage.ALIGN_TYPE6:
				return createAlignType6FromString(eDataType, initialValue);
			case DocbookPackage.ALIGN_TYPE7:
				return createAlignType7FromString(eDataType, initialValue);
			case DocbookPackage.ALIGN_TYPE8:
				return createAlignType8FromString(eDataType, initialValue);
			case DocbookPackage.ALIGN_TYPE9:
				return createAlignType9FromString(eDataType, initialValue);
			case DocbookPackage.ALIGN_TYPE10:
				return createAlignType10FromString(eDataType, initialValue);
			case DocbookPackage.ALIGN_TYPE11:
				return createAlignType11FromString(eDataType, initialValue);
			case DocbookPackage.ALIGN_TYPE12:
				return createAlignType12FromString(eDataType, initialValue);
			case DocbookPackage.ALIGN_TYPE13:
				return createAlignType13FromString(eDataType, initialValue);
			case DocbookPackage.ALIGN_TYPE14:
				return createAlignType14FromString(eDataType, initialValue);
			case DocbookPackage.CHOICE_TYPE:
				return createChoiceTypeFromString(eDataType, initialValue);
			case DocbookPackage.CHOICE_TYPE1:
				return createChoiceType1FromString(eDataType, initialValue);
			case DocbookPackage.CHOICE_TYPE2:
				return createChoiceType2FromString(eDataType, initialValue);
			case DocbookPackage.CHOICE_TYPE3:
				return createChoiceType3FromString(eDataType, initialValue);
			case DocbookPackage.CLASS_TYPE:
				return createClassTypeFromString(eDataType, initialValue);
			case DocbookPackage.CLASS_TYPE1:
				return createClassType1FromString(eDataType, initialValue);
			case DocbookPackage.CLASS_TYPE2:
				return createClassType2FromString(eDataType, initialValue);
			case DocbookPackage.CLASS_TYPE3:
				return createClassType3FromString(eDataType, initialValue);
			case DocbookPackage.CLASS_TYPE4:
				return createClassType4FromString(eDataType, initialValue);
			case DocbookPackage.CLASS_TYPE5:
				return createClassType5FromString(eDataType, initialValue);
			case DocbookPackage.CLASS_TYPE6:
				return createClassType6FromString(eDataType, initialValue);
			case DocbookPackage.CLASS_TYPE7:
				return createClassType7FromString(eDataType, initialValue);
			case DocbookPackage.CLASS_TYPE8:
				return createClassType8FromString(eDataType, initialValue);
			case DocbookPackage.CLASS_TYPE9:
				return createClassType9FromString(eDataType, initialValue);
			case DocbookPackage.CLASS_TYPE10:
				return createClassType10FromString(eDataType, initialValue);
			case DocbookPackage.CLASS_TYPE11:
				return createClassType11FromString(eDataType, initialValue);
			case DocbookPackage.CLASS_TYPE12:
				return createClassType12FromString(eDataType, initialValue);
			case DocbookPackage.CLASS_TYPE13:
				return createClassType13FromString(eDataType, initialValue);
			case DocbookPackage.CLASS_TYPE14:
				return createClassType14FromString(eDataType, initialValue);
			case DocbookPackage.CLASS_TYPE15:
				return createClassType15FromString(eDataType, initialValue);
			case DocbookPackage.CLASS_TYPE16:
				return createClassType16FromString(eDataType, initialValue);
			case DocbookPackage.CLASS_TYPE17:
				return createClassType17FromString(eDataType, initialValue);
			case DocbookPackage.CLASS_TYPE18:
				return createClassType18FromString(eDataType, initialValue);
			case DocbookPackage.CLASS_TYPE19:
				return createClassType19FromString(eDataType, initialValue);
			case DocbookPackage.CLASS_TYPE20:
				return createClassType20FromString(eDataType, initialValue);
			case DocbookPackage.CLASS_TYPE21:
				return createClassType21FromString(eDataType, initialValue);
			case DocbookPackage.COLSEP_TYPE:
				return createColsepTypeFromString(eDataType, initialValue);
			case DocbookPackage.COLSEP_TYPE1:
				return createColsepType1FromString(eDataType, initialValue);
			case DocbookPackage.COLSEP_TYPE2:
				return createColsepType2FromString(eDataType, initialValue);
			case DocbookPackage.COLSEP_TYPE3:
				return createColsepType3FromString(eDataType, initialValue);
			case DocbookPackage.COLSEP_TYPE4:
				return createColsepType4FromString(eDataType, initialValue);
			case DocbookPackage.COLSEP_TYPE5:
				return createColsepType5FromString(eDataType, initialValue);
			case DocbookPackage.COLSEP_TYPE6:
				return createColsepType6FromString(eDataType, initialValue);
			case DocbookPackage.CONTINUATION_TYPE:
				return createContinuationTypeFromString(eDataType, initialValue);
			case DocbookPackage.CONTINUATION_TYPE1:
				return createContinuationType1FromString(eDataType, initialValue);
			case DocbookPackage.CONTINUATION_TYPE2:
				return createContinuationType2FromString(eDataType, initialValue);
			case DocbookPackage.CONTINUATION_TYPE3:
				return createContinuationType3FromString(eDataType, initialValue);
			case DocbookPackage.CONTINUATION_TYPE4:
				return createContinuationType4FromString(eDataType, initialValue);
			case DocbookPackage.CONTINUATION_TYPE5:
				return createContinuationType5FromString(eDataType, initialValue);
			case DocbookPackage.CONTINUATION_TYPE6:
				return createContinuationType6FromString(eDataType, initialValue);
			case DocbookPackage.CONTINUATION_TYPE7:
				return createContinuationType7FromString(eDataType, initialValue);
			case DocbookPackage.DEFAULTLABEL_TYPE:
				return createDefaultlabelTypeFromString(eDataType, initialValue);
			case DocbookPackage.DIR_TYPE:
				return createDirTypeFromString(eDataType, initialValue);
			case DocbookPackage.FRAME_TYPE:
				return createFrameTypeFromString(eDataType, initialValue);
			case DocbookPackage.FRAME_TYPE1:
				return createFrameType1FromString(eDataType, initialValue);
			case DocbookPackage.FUNCTION_TYPE:
				return createFunctionTypeFromString(eDataType, initialValue);
			case DocbookPackage.INHERITNUM_TYPE:
				return createInheritnumTypeFromString(eDataType, initialValue);
			case DocbookPackage.LINENUMBERING_TYPE:
				return createLinenumberingTypeFromString(eDataType, initialValue);
			case DocbookPackage.LINENUMBERING_TYPE1:
				return createLinenumberingType1FromString(eDataType, initialValue);
			case DocbookPackage.LINENUMBERING_TYPE2:
				return createLinenumberingType2FromString(eDataType, initialValue);
			case DocbookPackage.LINENUMBERING_TYPE3:
				return createLinenumberingType3FromString(eDataType, initialValue);
			case DocbookPackage.LINENUMBERING_TYPE4:
				return createLinenumberingType4FromString(eDataType, initialValue);
			case DocbookPackage.LINENUMBERING_TYPE5:
				return createLinenumberingType5FromString(eDataType, initialValue);
			case DocbookPackage.LINENUMBERING_TYPE6:
				return createLinenumberingType6FromString(eDataType, initialValue);
			case DocbookPackage.NUMERATION_TYPE:
				return createNumerationTypeFromString(eDataType, initialValue);
			case DocbookPackage.ORIENT_TYPE:
				return createOrientTypeFromString(eDataType, initialValue);
			case DocbookPackage.ORIENT_TYPE1:
				return createOrientType1FromString(eDataType, initialValue);
			case DocbookPackage.PERFORMANCE_TYPE:
				return createPerformanceTypeFromString(eDataType, initialValue);
			case DocbookPackage.PERFORMANCE_TYPE1:
				return createPerformanceType1FromString(eDataType, initialValue);
			case DocbookPackage.PERFORMANCE_TYPE2:
				return createPerformanceType2FromString(eDataType, initialValue);
			case DocbookPackage.PGWIDE_TYPE:
				return createPgwideTypeFromString(eDataType, initialValue);
			case DocbookPackage.PGWIDE_TYPE1:
				return createPgwideType1FromString(eDataType, initialValue);
			case DocbookPackage.PGWIDE_TYPE2:
				return createPgwideType2FromString(eDataType, initialValue);
			case DocbookPackage.PGWIDE_TYPE3:
				return createPgwideType3FromString(eDataType, initialValue);
			case DocbookPackage.PGWIDE_TYPE4:
				return createPgwideType4FromString(eDataType, initialValue);
			case DocbookPackage.PGWIDE_TYPE5:
				return createPgwideType5FromString(eDataType, initialValue);
			case DocbookPackage.PUBWORK_TYPE:
				return createPubworkTypeFromString(eDataType, initialValue);
			case DocbookPackage.RENDERAS_TYPE:
				return createRenderasTypeFromString(eDataType, initialValue);
			case DocbookPackage.REP_TYPE:
				return createRepTypeFromString(eDataType, initialValue);
			case DocbookPackage.REP_TYPE1:
				return createRepType1FromString(eDataType, initialValue);
			case DocbookPackage.REP_TYPE2:
				return createRepType2FromString(eDataType, initialValue);
			case DocbookPackage.REVISIONFLAG_TYPE:
				return createRevisionflagTypeFromString(eDataType, initialValue);
			case DocbookPackage.ROTATE_TYPE:
				return createRotateTypeFromString(eDataType, initialValue);
			case DocbookPackage.ROWHEADER_TYPE:
				return createRowheaderTypeFromString(eDataType, initialValue);
			case DocbookPackage.ROWHEADER_TYPE1:
				return createRowheaderType1FromString(eDataType, initialValue);
			case DocbookPackage.ROWSEP_TYPE:
				return createRowsepTypeFromString(eDataType, initialValue);
			case DocbookPackage.ROWSEP_TYPE1:
				return createRowsepType1FromString(eDataType, initialValue);
			case DocbookPackage.ROWSEP_TYPE2:
				return createRowsepType2FromString(eDataType, initialValue);
			case DocbookPackage.ROWSEP_TYPE3:
				return createRowsepType3FromString(eDataType, initialValue);
			case DocbookPackage.ROWSEP_TYPE4:
				return createRowsepType4FromString(eDataType, initialValue);
			case DocbookPackage.ROWSEP_TYPE5:
				return createRowsepType5FromString(eDataType, initialValue);
			case DocbookPackage.ROWSEP_TYPE6:
				return createRowsepType6FromString(eDataType, initialValue);
			case DocbookPackage.ROWSEP_TYPE7:
				return createRowsepType7FromString(eDataType, initialValue);
			case DocbookPackage.RULES_TYPE:
				return createRulesTypeFromString(eDataType, initialValue);
			case DocbookPackage.RULES_TYPE1:
				return createRulesType1FromString(eDataType, initialValue);
			case DocbookPackage.SCALEFIT_TYPE:
				return createScalefitTypeFromString(eDataType, initialValue);
			case DocbookPackage.SCALEFIT_TYPE1:
				return createScalefitType1FromString(eDataType, initialValue);
			case DocbookPackage.SCOPE_TYPE:
				return createScopeTypeFromString(eDataType, initialValue);
			case DocbookPackage.SCOPE_TYPE1:
				return createScopeType1FromString(eDataType, initialValue);
			case DocbookPackage.SCOPE_TYPE2:
				return createScopeType2FromString(eDataType, initialValue);
			case DocbookPackage.SHORTENTRY_TYPE:
				return createShortentryTypeFromString(eDataType, initialValue);
			case DocbookPackage.SIGNIFICANCE_TYPE:
				return createSignificanceTypeFromString(eDataType, initialValue);
			case DocbookPackage.SPACING_TYPE:
				return createSpacingTypeFromString(eDataType, initialValue);
			case DocbookPackage.SPACING_TYPE1:
				return createSpacingType1FromString(eDataType, initialValue);
			case DocbookPackage.SPACING_TYPE2:
				return createSpacingType2FromString(eDataType, initialValue);
			case DocbookPackage.SPATIAL_TYPE:
				return createSpatialTypeFromString(eDataType, initialValue);
			case DocbookPackage.TEMPORAL_TYPE:
				return createTemporalTypeFromString(eDataType, initialValue);
			case DocbookPackage.TOCENTRY_TYPE1:
				return createTocentryType1FromString(eDataType, initialValue);
			case DocbookPackage.TYPE_TYPE:
				return createTypeTypeFromString(eDataType, initialValue);
			case DocbookPackage.TYPE_TYPE1:
				return createTypeType1FromString(eDataType, initialValue);
			case DocbookPackage.UNITS_TYPE:
				return createUnitsTypeFromString(eDataType, initialValue);
			case DocbookPackage.UNITS_TYPE1:
				return createUnitsType1FromString(eDataType, initialValue);
			case DocbookPackage.UNITS_TYPE2:
				return createUnitsType2FromString(eDataType, initialValue);
			case DocbookPackage.VALIGN_TYPE:
				return createValignTypeFromString(eDataType, initialValue);
			case DocbookPackage.VALIGN_TYPE1:
				return createValignType1FromString(eDataType, initialValue);
			case DocbookPackage.VALIGN_TYPE2:
				return createValignType2FromString(eDataType, initialValue);
			case DocbookPackage.VALIGN_TYPE3:
				return createValignType3FromString(eDataType, initialValue);
			case DocbookPackage.VALIGN_TYPE4:
				return createValignType4FromString(eDataType, initialValue);
			case DocbookPackage.VALIGN_TYPE5:
				return createValignType5FromString(eDataType, initialValue);
			case DocbookPackage.VALIGN_TYPE6:
				return createValignType6FromString(eDataType, initialValue);
			case DocbookPackage.VALIGN_TYPE7:
				return createValignType7FromString(eDataType, initialValue);
			case DocbookPackage.VALIGN_TYPE8:
				return createValignType8FromString(eDataType, initialValue);
			case DocbookPackage.VALIGN_TYPE9:
				return createValignType9FromString(eDataType, initialValue);
			case DocbookPackage.VALIGN_TYPE10:
				return createValignType10FromString(eDataType, initialValue);
			case DocbookPackage.VALIGN_TYPE11:
				return createValignType11FromString(eDataType, initialValue);
			case DocbookPackage.ACTION_TYPE_OBJECT:
				return createActionTypeObjectFromString(eDataType, initialValue);
			case DocbookPackage.ACTION_TYPE_OBJECT1:
				return createActionTypeObject1FromString(eDataType, initialValue);
			case DocbookPackage.ALIGN_TYPE_OBJECT:
				return createAlignTypeObjectFromString(eDataType, initialValue);
			case DocbookPackage.ALIGN_TYPE_OBJECT1:
				return createAlignTypeObject1FromString(eDataType, initialValue);
			case DocbookPackage.ALIGN_TYPE_OBJECT2:
				return createAlignTypeObject2FromString(eDataType, initialValue);
			case DocbookPackage.ALIGN_TYPE_OBJECT3:
				return createAlignTypeObject3FromString(eDataType, initialValue);
			case DocbookPackage.ALIGN_TYPE_OBJECT4:
				return createAlignTypeObject4FromString(eDataType, initialValue);
			case DocbookPackage.ALIGN_TYPE_OBJECT5:
				return createAlignTypeObject5FromString(eDataType, initialValue);
			case DocbookPackage.ALIGN_TYPE_OBJECT6:
				return createAlignTypeObject6FromString(eDataType, initialValue);
			case DocbookPackage.ALIGN_TYPE_OBJECT7:
				return createAlignTypeObject7FromString(eDataType, initialValue);
			case DocbookPackage.ALIGN_TYPE_OBJECT8:
				return createAlignTypeObject8FromString(eDataType, initialValue);
			case DocbookPackage.ALIGN_TYPE_OBJECT9:
				return createAlignTypeObject9FromString(eDataType, initialValue);
			case DocbookPackage.ALIGN_TYPE_OBJECT10:
				return createAlignTypeObject10FromString(eDataType, initialValue);
			case DocbookPackage.ALIGN_TYPE_OBJECT11:
				return createAlignTypeObject11FromString(eDataType, initialValue);
			case DocbookPackage.ALIGN_TYPE_OBJECT12:
				return createAlignTypeObject12FromString(eDataType, initialValue);
			case DocbookPackage.ALIGN_TYPE_OBJECT13:
				return createAlignTypeObject13FromString(eDataType, initialValue);
			case DocbookPackage.ALIGN_TYPE_OBJECT14:
				return createAlignTypeObject14FromString(eDataType, initialValue);
			case DocbookPackage.CHOICE_TYPE_OBJECT:
				return createChoiceTypeObjectFromString(eDataType, initialValue);
			case DocbookPackage.CHOICE_TYPE_OBJECT1:
				return createChoiceTypeObject1FromString(eDataType, initialValue);
			case DocbookPackage.CHOICE_TYPE_OBJECT2:
				return createChoiceTypeObject2FromString(eDataType, initialValue);
			case DocbookPackage.CHOICE_TYPE_OBJECT3:
				return createChoiceTypeObject3FromString(eDataType, initialValue);
			case DocbookPackage.CLASS_TYPE_OBJECT:
				return createClassTypeObjectFromString(eDataType, initialValue);
			case DocbookPackage.CLASS_TYPE_OBJECT1:
				return createClassTypeObject1FromString(eDataType, initialValue);
			case DocbookPackage.CLASS_TYPE_OBJECT2:
				return createClassTypeObject2FromString(eDataType, initialValue);
			case DocbookPackage.CLASS_TYPE_OBJECT3:
				return createClassTypeObject3FromString(eDataType, initialValue);
			case DocbookPackage.CLASS_TYPE_OBJECT4:
				return createClassTypeObject4FromString(eDataType, initialValue);
			case DocbookPackage.CLASS_TYPE_OBJECT5:
				return createClassTypeObject5FromString(eDataType, initialValue);
			case DocbookPackage.CLASS_TYPE_OBJECT6:
				return createClassTypeObject6FromString(eDataType, initialValue);
			case DocbookPackage.CLASS_TYPE_OBJECT7:
				return createClassTypeObject7FromString(eDataType, initialValue);
			case DocbookPackage.CLASS_TYPE_OBJECT8:
				return createClassTypeObject8FromString(eDataType, initialValue);
			case DocbookPackage.CLASS_TYPE_OBJECT9:
				return createClassTypeObject9FromString(eDataType, initialValue);
			case DocbookPackage.CLASS_TYPE_OBJECT10:
				return createClassTypeObject10FromString(eDataType, initialValue);
			case DocbookPackage.CLASS_TYPE_OBJECT11:
				return createClassTypeObject11FromString(eDataType, initialValue);
			case DocbookPackage.CLASS_TYPE_OBJECT12:
				return createClassTypeObject12FromString(eDataType, initialValue);
			case DocbookPackage.CLASS_TYPE_OBJECT13:
				return createClassTypeObject13FromString(eDataType, initialValue);
			case DocbookPackage.CLASS_TYPE_OBJECT14:
				return createClassTypeObject14FromString(eDataType, initialValue);
			case DocbookPackage.CLASS_TYPE_OBJECT15:
				return createClassTypeObject15FromString(eDataType, initialValue);
			case DocbookPackage.CLASS_TYPE_OBJECT16:
				return createClassTypeObject16FromString(eDataType, initialValue);
			case DocbookPackage.CLASS_TYPE_OBJECT17:
				return createClassTypeObject17FromString(eDataType, initialValue);
			case DocbookPackage.CLASS_TYPE_OBJECT18:
				return createClassTypeObject18FromString(eDataType, initialValue);
			case DocbookPackage.CLASS_TYPE_OBJECT19:
				return createClassTypeObject19FromString(eDataType, initialValue);
			case DocbookPackage.CLASS_TYPE_OBJECT20:
				return createClassTypeObject20FromString(eDataType, initialValue);
			case DocbookPackage.CLASS_TYPE_OBJECT21:
				return createClassTypeObject21FromString(eDataType, initialValue);
			case DocbookPackage.COLSEP_TYPE_OBJECT:
				return createColsepTypeObjectFromString(eDataType, initialValue);
			case DocbookPackage.COLSEP_TYPE_OBJECT1:
				return createColsepTypeObject1FromString(eDataType, initialValue);
			case DocbookPackage.COLSEP_TYPE_OBJECT2:
				return createColsepTypeObject2FromString(eDataType, initialValue);
			case DocbookPackage.COLSEP_TYPE_OBJECT3:
				return createColsepTypeObject3FromString(eDataType, initialValue);
			case DocbookPackage.COLSEP_TYPE_OBJECT4:
				return createColsepTypeObject4FromString(eDataType, initialValue);
			case DocbookPackage.COLSEP_TYPE_OBJECT5:
				return createColsepTypeObject5FromString(eDataType, initialValue);
			case DocbookPackage.COLSEP_TYPE_OBJECT6:
				return createColsepTypeObject6FromString(eDataType, initialValue);
			case DocbookPackage.CONTINUATION_TYPE_OBJECT:
				return createContinuationTypeObjectFromString(eDataType, initialValue);
			case DocbookPackage.CONTINUATION_TYPE_OBJECT1:
				return createContinuationTypeObject1FromString(eDataType, initialValue);
			case DocbookPackage.CONTINUATION_TYPE_OBJECT2:
				return createContinuationTypeObject2FromString(eDataType, initialValue);
			case DocbookPackage.CONTINUATION_TYPE_OBJECT3:
				return createContinuationTypeObject3FromString(eDataType, initialValue);
			case DocbookPackage.CONTINUATION_TYPE_OBJECT4:
				return createContinuationTypeObject4FromString(eDataType, initialValue);
			case DocbookPackage.CONTINUATION_TYPE_OBJECT5:
				return createContinuationTypeObject5FromString(eDataType, initialValue);
			case DocbookPackage.CONTINUATION_TYPE_OBJECT6:
				return createContinuationTypeObject6FromString(eDataType, initialValue);
			case DocbookPackage.CONTINUATION_TYPE_OBJECT7:
				return createContinuationTypeObject7FromString(eDataType, initialValue);
			case DocbookPackage.DEFAULTLABEL_TYPE_OBJECT:
				return createDefaultlabelTypeObjectFromString(eDataType, initialValue);
			case DocbookPackage.DIR_TYPE_OBJECT:
				return createDirTypeObjectFromString(eDataType, initialValue);
			case DocbookPackage.FRAME_TYPE_OBJECT:
				return createFrameTypeObjectFromString(eDataType, initialValue);
			case DocbookPackage.FRAME_TYPE_OBJECT1:
				return createFrameTypeObject1FromString(eDataType, initialValue);
			case DocbookPackage.FUNCTION_TYPE_OBJECT:
				return createFunctionTypeObjectFromString(eDataType, initialValue);
			case DocbookPackage.INHERITNUM_TYPE_OBJECT:
				return createInheritnumTypeObjectFromString(eDataType, initialValue);
			case DocbookPackage.LINENUMBERING_TYPE_OBJECT:
				return createLinenumberingTypeObjectFromString(eDataType, initialValue);
			case DocbookPackage.LINENUMBERING_TYPE_OBJECT1:
				return createLinenumberingTypeObject1FromString(eDataType, initialValue);
			case DocbookPackage.LINENUMBERING_TYPE_OBJECT2:
				return createLinenumberingTypeObject2FromString(eDataType, initialValue);
			case DocbookPackage.LINENUMBERING_TYPE_OBJECT3:
				return createLinenumberingTypeObject3FromString(eDataType, initialValue);
			case DocbookPackage.LINENUMBERING_TYPE_OBJECT4:
				return createLinenumberingTypeObject4FromString(eDataType, initialValue);
			case DocbookPackage.LINENUMBERING_TYPE_OBJECT5:
				return createLinenumberingTypeObject5FromString(eDataType, initialValue);
			case DocbookPackage.LINENUMBERING_TYPE_OBJECT6:
				return createLinenumberingTypeObject6FromString(eDataType, initialValue);
			case DocbookPackage.NUMERATION_TYPE_OBJECT:
				return createNumerationTypeObjectFromString(eDataType, initialValue);
			case DocbookPackage.ORIENT_TYPE_OBJECT:
				return createOrientTypeObjectFromString(eDataType, initialValue);
			case DocbookPackage.ORIENT_TYPE_OBJECT1:
				return createOrientTypeObject1FromString(eDataType, initialValue);
			case DocbookPackage.PERFORMANCE_TYPE_OBJECT:
				return createPerformanceTypeObjectFromString(eDataType, initialValue);
			case DocbookPackage.PERFORMANCE_TYPE_OBJECT1:
				return createPerformanceTypeObject1FromString(eDataType, initialValue);
			case DocbookPackage.PERFORMANCE_TYPE_OBJECT2:
				return createPerformanceTypeObject2FromString(eDataType, initialValue);
			case DocbookPackage.PGWIDE_TYPE_OBJECT:
				return createPgwideTypeObjectFromString(eDataType, initialValue);
			case DocbookPackage.PGWIDE_TYPE_OBJECT1:
				return createPgwideTypeObject1FromString(eDataType, initialValue);
			case DocbookPackage.PGWIDE_TYPE_OBJECT2:
				return createPgwideTypeObject2FromString(eDataType, initialValue);
			case DocbookPackage.PGWIDE_TYPE_OBJECT3:
				return createPgwideTypeObject3FromString(eDataType, initialValue);
			case DocbookPackage.PGWIDE_TYPE_OBJECT4:
				return createPgwideTypeObject4FromString(eDataType, initialValue);
			case DocbookPackage.PGWIDE_TYPE_OBJECT5:
				return createPgwideTypeObject5FromString(eDataType, initialValue);
			case DocbookPackage.PUBWORK_TYPE_OBJECT:
				return createPubworkTypeObjectFromString(eDataType, initialValue);
			case DocbookPackage.RENDERAS_TYPE_OBJECT:
				return createRenderasTypeObjectFromString(eDataType, initialValue);
			case DocbookPackage.REP_TYPE_OBJECT:
				return createRepTypeObjectFromString(eDataType, initialValue);
			case DocbookPackage.REP_TYPE_OBJECT1:
				return createRepTypeObject1FromString(eDataType, initialValue);
			case DocbookPackage.REP_TYPE_OBJECT2:
				return createRepTypeObject2FromString(eDataType, initialValue);
			case DocbookPackage.REVISIONFLAG_TYPE_OBJECT:
				return createRevisionflagTypeObjectFromString(eDataType, initialValue);
			case DocbookPackage.ROTATE_TYPE_OBJECT:
				return createRotateTypeObjectFromString(eDataType, initialValue);
			case DocbookPackage.ROWHEADER_TYPE_OBJECT:
				return createRowheaderTypeObjectFromString(eDataType, initialValue);
			case DocbookPackage.ROWHEADER_TYPE_OBJECT1:
				return createRowheaderTypeObject1FromString(eDataType, initialValue);
			case DocbookPackage.ROWSEP_TYPE_OBJECT:
				return createRowsepTypeObjectFromString(eDataType, initialValue);
			case DocbookPackage.ROWSEP_TYPE_OBJECT1:
				return createRowsepTypeObject1FromString(eDataType, initialValue);
			case DocbookPackage.ROWSEP_TYPE_OBJECT2:
				return createRowsepTypeObject2FromString(eDataType, initialValue);
			case DocbookPackage.ROWSEP_TYPE_OBJECT3:
				return createRowsepTypeObject3FromString(eDataType, initialValue);
			case DocbookPackage.ROWSEP_TYPE_OBJECT4:
				return createRowsepTypeObject4FromString(eDataType, initialValue);
			case DocbookPackage.ROWSEP_TYPE_OBJECT5:
				return createRowsepTypeObject5FromString(eDataType, initialValue);
			case DocbookPackage.ROWSEP_TYPE_OBJECT6:
				return createRowsepTypeObject6FromString(eDataType, initialValue);
			case DocbookPackage.ROWSEP_TYPE_OBJECT7:
				return createRowsepTypeObject7FromString(eDataType, initialValue);
			case DocbookPackage.RULES_TYPE_OBJECT:
				return createRulesTypeObjectFromString(eDataType, initialValue);
			case DocbookPackage.RULES_TYPE_OBJECT1:
				return createRulesTypeObject1FromString(eDataType, initialValue);
			case DocbookPackage.SCALEFIT_TYPE_OBJECT:
				return createScalefitTypeObjectFromString(eDataType, initialValue);
			case DocbookPackage.SCALEFIT_TYPE_OBJECT1:
				return createScalefitTypeObject1FromString(eDataType, initialValue);
			case DocbookPackage.SCOPE_TYPE_OBJECT:
				return createScopeTypeObjectFromString(eDataType, initialValue);
			case DocbookPackage.SCOPE_TYPE_OBJECT1:
				return createScopeTypeObject1FromString(eDataType, initialValue);
			case DocbookPackage.SCOPE_TYPE_OBJECT2:
				return createScopeTypeObject2FromString(eDataType, initialValue);
			case DocbookPackage.SHORTENTRY_TYPE_OBJECT:
				return createShortentryTypeObjectFromString(eDataType, initialValue);
			case DocbookPackage.SIGNIFICANCE_TYPE_OBJECT:
				return createSignificanceTypeObjectFromString(eDataType, initialValue);
			case DocbookPackage.SPACING_TYPE_OBJECT:
				return createSpacingTypeObjectFromString(eDataType, initialValue);
			case DocbookPackage.SPACING_TYPE_OBJECT1:
				return createSpacingTypeObject1FromString(eDataType, initialValue);
			case DocbookPackage.SPACING_TYPE_OBJECT2:
				return createSpacingTypeObject2FromString(eDataType, initialValue);
			case DocbookPackage.SPATIAL_TYPE_OBJECT:
				return createSpatialTypeObjectFromString(eDataType, initialValue);
			case DocbookPackage.TEMPORAL_TYPE_OBJECT:
				return createTemporalTypeObjectFromString(eDataType, initialValue);
			case DocbookPackage.TOCENTRY_TYPE_OBJECT:
				return createTocentryTypeObjectFromString(eDataType, initialValue);
			case DocbookPackage.TYPE_TYPE_OBJECT:
				return createTypeTypeObjectFromString(eDataType, initialValue);
			case DocbookPackage.TYPE_TYPE_OBJECT1:
				return createTypeTypeObject1FromString(eDataType, initialValue);
			case DocbookPackage.UNITS_TYPE_OBJECT:
				return createUnitsTypeObjectFromString(eDataType, initialValue);
			case DocbookPackage.UNITS_TYPE_OBJECT1:
				return createUnitsTypeObject1FromString(eDataType, initialValue);
			case DocbookPackage.UNITS_TYPE_OBJECT2:
				return createUnitsTypeObject2FromString(eDataType, initialValue);
			case DocbookPackage.VALIGN_TYPE_OBJECT:
				return createValignTypeObjectFromString(eDataType, initialValue);
			case DocbookPackage.VALIGN_TYPE_OBJECT1:
				return createValignTypeObject1FromString(eDataType, initialValue);
			case DocbookPackage.VALIGN_TYPE_OBJECT2:
				return createValignTypeObject2FromString(eDataType, initialValue);
			case DocbookPackage.VALIGN_TYPE_OBJECT3:
				return createValignTypeObject3FromString(eDataType, initialValue);
			case DocbookPackage.VALIGN_TYPE_OBJECT4:
				return createValignTypeObject4FromString(eDataType, initialValue);
			case DocbookPackage.VALIGN_TYPE_OBJECT5:
				return createValignTypeObject5FromString(eDataType, initialValue);
			case DocbookPackage.VALIGN_TYPE_OBJECT6:
				return createValignTypeObject6FromString(eDataType, initialValue);
			case DocbookPackage.VALIGN_TYPE_OBJECT7:
				return createValignTypeObject7FromString(eDataType, initialValue);
			case DocbookPackage.VALIGN_TYPE_OBJECT8:
				return createValignTypeObject8FromString(eDataType, initialValue);
			case DocbookPackage.VALIGN_TYPE_OBJECT9:
				return createValignTypeObject9FromString(eDataType, initialValue);
			case DocbookPackage.VALIGN_TYPE_OBJECT10:
				return createValignTypeObject10FromString(eDataType, initialValue);
			case DocbookPackage.VALIGN_TYPE_OBJECT11:
				return createValignTypeObject11FromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case DocbookPackage.ACTION_TYPE:
				return convertActionTypeToString(eDataType, instanceValue);
			case DocbookPackage.ACTION_TYPE1:
				return convertActionType1ToString(eDataType, instanceValue);
			case DocbookPackage.ALIGN_TYPE:
				return convertAlignTypeToString(eDataType, instanceValue);
			case DocbookPackage.ALIGN_TYPE1:
				return convertAlignType1ToString(eDataType, instanceValue);
			case DocbookPackage.ALIGN_TYPE2:
				return convertAlignType2ToString(eDataType, instanceValue);
			case DocbookPackage.ALIGN_TYPE3:
				return convertAlignType3ToString(eDataType, instanceValue);
			case DocbookPackage.ALIGN_TYPE4:
				return convertAlignType4ToString(eDataType, instanceValue);
			case DocbookPackage.ALIGN_TYPE5:
				return convertAlignType5ToString(eDataType, instanceValue);
			case DocbookPackage.ALIGN_TYPE6:
				return convertAlignType6ToString(eDataType, instanceValue);
			case DocbookPackage.ALIGN_TYPE7:
				return convertAlignType7ToString(eDataType, instanceValue);
			case DocbookPackage.ALIGN_TYPE8:
				return convertAlignType8ToString(eDataType, instanceValue);
			case DocbookPackage.ALIGN_TYPE9:
				return convertAlignType9ToString(eDataType, instanceValue);
			case DocbookPackage.ALIGN_TYPE10:
				return convertAlignType10ToString(eDataType, instanceValue);
			case DocbookPackage.ALIGN_TYPE11:
				return convertAlignType11ToString(eDataType, instanceValue);
			case DocbookPackage.ALIGN_TYPE12:
				return convertAlignType12ToString(eDataType, instanceValue);
			case DocbookPackage.ALIGN_TYPE13:
				return convertAlignType13ToString(eDataType, instanceValue);
			case DocbookPackage.ALIGN_TYPE14:
				return convertAlignType14ToString(eDataType, instanceValue);
			case DocbookPackage.CHOICE_TYPE:
				return convertChoiceTypeToString(eDataType, instanceValue);
			case DocbookPackage.CHOICE_TYPE1:
				return convertChoiceType1ToString(eDataType, instanceValue);
			case DocbookPackage.CHOICE_TYPE2:
				return convertChoiceType2ToString(eDataType, instanceValue);
			case DocbookPackage.CHOICE_TYPE3:
				return convertChoiceType3ToString(eDataType, instanceValue);
			case DocbookPackage.CLASS_TYPE:
				return convertClassTypeToString(eDataType, instanceValue);
			case DocbookPackage.CLASS_TYPE1:
				return convertClassType1ToString(eDataType, instanceValue);
			case DocbookPackage.CLASS_TYPE2:
				return convertClassType2ToString(eDataType, instanceValue);
			case DocbookPackage.CLASS_TYPE3:
				return convertClassType3ToString(eDataType, instanceValue);
			case DocbookPackage.CLASS_TYPE4:
				return convertClassType4ToString(eDataType, instanceValue);
			case DocbookPackage.CLASS_TYPE5:
				return convertClassType5ToString(eDataType, instanceValue);
			case DocbookPackage.CLASS_TYPE6:
				return convertClassType6ToString(eDataType, instanceValue);
			case DocbookPackage.CLASS_TYPE7:
				return convertClassType7ToString(eDataType, instanceValue);
			case DocbookPackage.CLASS_TYPE8:
				return convertClassType8ToString(eDataType, instanceValue);
			case DocbookPackage.CLASS_TYPE9:
				return convertClassType9ToString(eDataType, instanceValue);
			case DocbookPackage.CLASS_TYPE10:
				return convertClassType10ToString(eDataType, instanceValue);
			case DocbookPackage.CLASS_TYPE11:
				return convertClassType11ToString(eDataType, instanceValue);
			case DocbookPackage.CLASS_TYPE12:
				return convertClassType12ToString(eDataType, instanceValue);
			case DocbookPackage.CLASS_TYPE13:
				return convertClassType13ToString(eDataType, instanceValue);
			case DocbookPackage.CLASS_TYPE14:
				return convertClassType14ToString(eDataType, instanceValue);
			case DocbookPackage.CLASS_TYPE15:
				return convertClassType15ToString(eDataType, instanceValue);
			case DocbookPackage.CLASS_TYPE16:
				return convertClassType16ToString(eDataType, instanceValue);
			case DocbookPackage.CLASS_TYPE17:
				return convertClassType17ToString(eDataType, instanceValue);
			case DocbookPackage.CLASS_TYPE18:
				return convertClassType18ToString(eDataType, instanceValue);
			case DocbookPackage.CLASS_TYPE19:
				return convertClassType19ToString(eDataType, instanceValue);
			case DocbookPackage.CLASS_TYPE20:
				return convertClassType20ToString(eDataType, instanceValue);
			case DocbookPackage.CLASS_TYPE21:
				return convertClassType21ToString(eDataType, instanceValue);
			case DocbookPackage.COLSEP_TYPE:
				return convertColsepTypeToString(eDataType, instanceValue);
			case DocbookPackage.COLSEP_TYPE1:
				return convertColsepType1ToString(eDataType, instanceValue);
			case DocbookPackage.COLSEP_TYPE2:
				return convertColsepType2ToString(eDataType, instanceValue);
			case DocbookPackage.COLSEP_TYPE3:
				return convertColsepType3ToString(eDataType, instanceValue);
			case DocbookPackage.COLSEP_TYPE4:
				return convertColsepType4ToString(eDataType, instanceValue);
			case DocbookPackage.COLSEP_TYPE5:
				return convertColsepType5ToString(eDataType, instanceValue);
			case DocbookPackage.COLSEP_TYPE6:
				return convertColsepType6ToString(eDataType, instanceValue);
			case DocbookPackage.CONTINUATION_TYPE:
				return convertContinuationTypeToString(eDataType, instanceValue);
			case DocbookPackage.CONTINUATION_TYPE1:
				return convertContinuationType1ToString(eDataType, instanceValue);
			case DocbookPackage.CONTINUATION_TYPE2:
				return convertContinuationType2ToString(eDataType, instanceValue);
			case DocbookPackage.CONTINUATION_TYPE3:
				return convertContinuationType3ToString(eDataType, instanceValue);
			case DocbookPackage.CONTINUATION_TYPE4:
				return convertContinuationType4ToString(eDataType, instanceValue);
			case DocbookPackage.CONTINUATION_TYPE5:
				return convertContinuationType5ToString(eDataType, instanceValue);
			case DocbookPackage.CONTINUATION_TYPE6:
				return convertContinuationType6ToString(eDataType, instanceValue);
			case DocbookPackage.CONTINUATION_TYPE7:
				return convertContinuationType7ToString(eDataType, instanceValue);
			case DocbookPackage.DEFAULTLABEL_TYPE:
				return convertDefaultlabelTypeToString(eDataType, instanceValue);
			case DocbookPackage.DIR_TYPE:
				return convertDirTypeToString(eDataType, instanceValue);
			case DocbookPackage.FRAME_TYPE:
				return convertFrameTypeToString(eDataType, instanceValue);
			case DocbookPackage.FRAME_TYPE1:
				return convertFrameType1ToString(eDataType, instanceValue);
			case DocbookPackage.FUNCTION_TYPE:
				return convertFunctionTypeToString(eDataType, instanceValue);
			case DocbookPackage.INHERITNUM_TYPE:
				return convertInheritnumTypeToString(eDataType, instanceValue);
			case DocbookPackage.LINENUMBERING_TYPE:
				return convertLinenumberingTypeToString(eDataType, instanceValue);
			case DocbookPackage.LINENUMBERING_TYPE1:
				return convertLinenumberingType1ToString(eDataType, instanceValue);
			case DocbookPackage.LINENUMBERING_TYPE2:
				return convertLinenumberingType2ToString(eDataType, instanceValue);
			case DocbookPackage.LINENUMBERING_TYPE3:
				return convertLinenumberingType3ToString(eDataType, instanceValue);
			case DocbookPackage.LINENUMBERING_TYPE4:
				return convertLinenumberingType4ToString(eDataType, instanceValue);
			case DocbookPackage.LINENUMBERING_TYPE5:
				return convertLinenumberingType5ToString(eDataType, instanceValue);
			case DocbookPackage.LINENUMBERING_TYPE6:
				return convertLinenumberingType6ToString(eDataType, instanceValue);
			case DocbookPackage.NUMERATION_TYPE:
				return convertNumerationTypeToString(eDataType, instanceValue);
			case DocbookPackage.ORIENT_TYPE:
				return convertOrientTypeToString(eDataType, instanceValue);
			case DocbookPackage.ORIENT_TYPE1:
				return convertOrientType1ToString(eDataType, instanceValue);
			case DocbookPackage.PERFORMANCE_TYPE:
				return convertPerformanceTypeToString(eDataType, instanceValue);
			case DocbookPackage.PERFORMANCE_TYPE1:
				return convertPerformanceType1ToString(eDataType, instanceValue);
			case DocbookPackage.PERFORMANCE_TYPE2:
				return convertPerformanceType2ToString(eDataType, instanceValue);
			case DocbookPackage.PGWIDE_TYPE:
				return convertPgwideTypeToString(eDataType, instanceValue);
			case DocbookPackage.PGWIDE_TYPE1:
				return convertPgwideType1ToString(eDataType, instanceValue);
			case DocbookPackage.PGWIDE_TYPE2:
				return convertPgwideType2ToString(eDataType, instanceValue);
			case DocbookPackage.PGWIDE_TYPE3:
				return convertPgwideType3ToString(eDataType, instanceValue);
			case DocbookPackage.PGWIDE_TYPE4:
				return convertPgwideType4ToString(eDataType, instanceValue);
			case DocbookPackage.PGWIDE_TYPE5:
				return convertPgwideType5ToString(eDataType, instanceValue);
			case DocbookPackage.PUBWORK_TYPE:
				return convertPubworkTypeToString(eDataType, instanceValue);
			case DocbookPackage.RENDERAS_TYPE:
				return convertRenderasTypeToString(eDataType, instanceValue);
			case DocbookPackage.REP_TYPE:
				return convertRepTypeToString(eDataType, instanceValue);
			case DocbookPackage.REP_TYPE1:
				return convertRepType1ToString(eDataType, instanceValue);
			case DocbookPackage.REP_TYPE2:
				return convertRepType2ToString(eDataType, instanceValue);
			case DocbookPackage.REVISIONFLAG_TYPE:
				return convertRevisionflagTypeToString(eDataType, instanceValue);
			case DocbookPackage.ROTATE_TYPE:
				return convertRotateTypeToString(eDataType, instanceValue);
			case DocbookPackage.ROWHEADER_TYPE:
				return convertRowheaderTypeToString(eDataType, instanceValue);
			case DocbookPackage.ROWHEADER_TYPE1:
				return convertRowheaderType1ToString(eDataType, instanceValue);
			case DocbookPackage.ROWSEP_TYPE:
				return convertRowsepTypeToString(eDataType, instanceValue);
			case DocbookPackage.ROWSEP_TYPE1:
				return convertRowsepType1ToString(eDataType, instanceValue);
			case DocbookPackage.ROWSEP_TYPE2:
				return convertRowsepType2ToString(eDataType, instanceValue);
			case DocbookPackage.ROWSEP_TYPE3:
				return convertRowsepType3ToString(eDataType, instanceValue);
			case DocbookPackage.ROWSEP_TYPE4:
				return convertRowsepType4ToString(eDataType, instanceValue);
			case DocbookPackage.ROWSEP_TYPE5:
				return convertRowsepType5ToString(eDataType, instanceValue);
			case DocbookPackage.ROWSEP_TYPE6:
				return convertRowsepType6ToString(eDataType, instanceValue);
			case DocbookPackage.ROWSEP_TYPE7:
				return convertRowsepType7ToString(eDataType, instanceValue);
			case DocbookPackage.RULES_TYPE:
				return convertRulesTypeToString(eDataType, instanceValue);
			case DocbookPackage.RULES_TYPE1:
				return convertRulesType1ToString(eDataType, instanceValue);
			case DocbookPackage.SCALEFIT_TYPE:
				return convertScalefitTypeToString(eDataType, instanceValue);
			case DocbookPackage.SCALEFIT_TYPE1:
				return convertScalefitType1ToString(eDataType, instanceValue);
			case DocbookPackage.SCOPE_TYPE:
				return convertScopeTypeToString(eDataType, instanceValue);
			case DocbookPackage.SCOPE_TYPE1:
				return convertScopeType1ToString(eDataType, instanceValue);
			case DocbookPackage.SCOPE_TYPE2:
				return convertScopeType2ToString(eDataType, instanceValue);
			case DocbookPackage.SHORTENTRY_TYPE:
				return convertShortentryTypeToString(eDataType, instanceValue);
			case DocbookPackage.SIGNIFICANCE_TYPE:
				return convertSignificanceTypeToString(eDataType, instanceValue);
			case DocbookPackage.SPACING_TYPE:
				return convertSpacingTypeToString(eDataType, instanceValue);
			case DocbookPackage.SPACING_TYPE1:
				return convertSpacingType1ToString(eDataType, instanceValue);
			case DocbookPackage.SPACING_TYPE2:
				return convertSpacingType2ToString(eDataType, instanceValue);
			case DocbookPackage.SPATIAL_TYPE:
				return convertSpatialTypeToString(eDataType, instanceValue);
			case DocbookPackage.TEMPORAL_TYPE:
				return convertTemporalTypeToString(eDataType, instanceValue);
			case DocbookPackage.TOCENTRY_TYPE1:
				return convertTocentryType1ToString(eDataType, instanceValue);
			case DocbookPackage.TYPE_TYPE:
				return convertTypeTypeToString(eDataType, instanceValue);
			case DocbookPackage.TYPE_TYPE1:
				return convertTypeType1ToString(eDataType, instanceValue);
			case DocbookPackage.UNITS_TYPE:
				return convertUnitsTypeToString(eDataType, instanceValue);
			case DocbookPackage.UNITS_TYPE1:
				return convertUnitsType1ToString(eDataType, instanceValue);
			case DocbookPackage.UNITS_TYPE2:
				return convertUnitsType2ToString(eDataType, instanceValue);
			case DocbookPackage.VALIGN_TYPE:
				return convertValignTypeToString(eDataType, instanceValue);
			case DocbookPackage.VALIGN_TYPE1:
				return convertValignType1ToString(eDataType, instanceValue);
			case DocbookPackage.VALIGN_TYPE2:
				return convertValignType2ToString(eDataType, instanceValue);
			case DocbookPackage.VALIGN_TYPE3:
				return convertValignType3ToString(eDataType, instanceValue);
			case DocbookPackage.VALIGN_TYPE4:
				return convertValignType4ToString(eDataType, instanceValue);
			case DocbookPackage.VALIGN_TYPE5:
				return convertValignType5ToString(eDataType, instanceValue);
			case DocbookPackage.VALIGN_TYPE6:
				return convertValignType6ToString(eDataType, instanceValue);
			case DocbookPackage.VALIGN_TYPE7:
				return convertValignType7ToString(eDataType, instanceValue);
			case DocbookPackage.VALIGN_TYPE8:
				return convertValignType8ToString(eDataType, instanceValue);
			case DocbookPackage.VALIGN_TYPE9:
				return convertValignType9ToString(eDataType, instanceValue);
			case DocbookPackage.VALIGN_TYPE10:
				return convertValignType10ToString(eDataType, instanceValue);
			case DocbookPackage.VALIGN_TYPE11:
				return convertValignType11ToString(eDataType, instanceValue);
			case DocbookPackage.ACTION_TYPE_OBJECT:
				return convertActionTypeObjectToString(eDataType, instanceValue);
			case DocbookPackage.ACTION_TYPE_OBJECT1:
				return convertActionTypeObject1ToString(eDataType, instanceValue);
			case DocbookPackage.ALIGN_TYPE_OBJECT:
				return convertAlignTypeObjectToString(eDataType, instanceValue);
			case DocbookPackage.ALIGN_TYPE_OBJECT1:
				return convertAlignTypeObject1ToString(eDataType, instanceValue);
			case DocbookPackage.ALIGN_TYPE_OBJECT2:
				return convertAlignTypeObject2ToString(eDataType, instanceValue);
			case DocbookPackage.ALIGN_TYPE_OBJECT3:
				return convertAlignTypeObject3ToString(eDataType, instanceValue);
			case DocbookPackage.ALIGN_TYPE_OBJECT4:
				return convertAlignTypeObject4ToString(eDataType, instanceValue);
			case DocbookPackage.ALIGN_TYPE_OBJECT5:
				return convertAlignTypeObject5ToString(eDataType, instanceValue);
			case DocbookPackage.ALIGN_TYPE_OBJECT6:
				return convertAlignTypeObject6ToString(eDataType, instanceValue);
			case DocbookPackage.ALIGN_TYPE_OBJECT7:
				return convertAlignTypeObject7ToString(eDataType, instanceValue);
			case DocbookPackage.ALIGN_TYPE_OBJECT8:
				return convertAlignTypeObject8ToString(eDataType, instanceValue);
			case DocbookPackage.ALIGN_TYPE_OBJECT9:
				return convertAlignTypeObject9ToString(eDataType, instanceValue);
			case DocbookPackage.ALIGN_TYPE_OBJECT10:
				return convertAlignTypeObject10ToString(eDataType, instanceValue);
			case DocbookPackage.ALIGN_TYPE_OBJECT11:
				return convertAlignTypeObject11ToString(eDataType, instanceValue);
			case DocbookPackage.ALIGN_TYPE_OBJECT12:
				return convertAlignTypeObject12ToString(eDataType, instanceValue);
			case DocbookPackage.ALIGN_TYPE_OBJECT13:
				return convertAlignTypeObject13ToString(eDataType, instanceValue);
			case DocbookPackage.ALIGN_TYPE_OBJECT14:
				return convertAlignTypeObject14ToString(eDataType, instanceValue);
			case DocbookPackage.CHOICE_TYPE_OBJECT:
				return convertChoiceTypeObjectToString(eDataType, instanceValue);
			case DocbookPackage.CHOICE_TYPE_OBJECT1:
				return convertChoiceTypeObject1ToString(eDataType, instanceValue);
			case DocbookPackage.CHOICE_TYPE_OBJECT2:
				return convertChoiceTypeObject2ToString(eDataType, instanceValue);
			case DocbookPackage.CHOICE_TYPE_OBJECT3:
				return convertChoiceTypeObject3ToString(eDataType, instanceValue);
			case DocbookPackage.CLASS_TYPE_OBJECT:
				return convertClassTypeObjectToString(eDataType, instanceValue);
			case DocbookPackage.CLASS_TYPE_OBJECT1:
				return convertClassTypeObject1ToString(eDataType, instanceValue);
			case DocbookPackage.CLASS_TYPE_OBJECT2:
				return convertClassTypeObject2ToString(eDataType, instanceValue);
			case DocbookPackage.CLASS_TYPE_OBJECT3:
				return convertClassTypeObject3ToString(eDataType, instanceValue);
			case DocbookPackage.CLASS_TYPE_OBJECT4:
				return convertClassTypeObject4ToString(eDataType, instanceValue);
			case DocbookPackage.CLASS_TYPE_OBJECT5:
				return convertClassTypeObject5ToString(eDataType, instanceValue);
			case DocbookPackage.CLASS_TYPE_OBJECT6:
				return convertClassTypeObject6ToString(eDataType, instanceValue);
			case DocbookPackage.CLASS_TYPE_OBJECT7:
				return convertClassTypeObject7ToString(eDataType, instanceValue);
			case DocbookPackage.CLASS_TYPE_OBJECT8:
				return convertClassTypeObject8ToString(eDataType, instanceValue);
			case DocbookPackage.CLASS_TYPE_OBJECT9:
				return convertClassTypeObject9ToString(eDataType, instanceValue);
			case DocbookPackage.CLASS_TYPE_OBJECT10:
				return convertClassTypeObject10ToString(eDataType, instanceValue);
			case DocbookPackage.CLASS_TYPE_OBJECT11:
				return convertClassTypeObject11ToString(eDataType, instanceValue);
			case DocbookPackage.CLASS_TYPE_OBJECT12:
				return convertClassTypeObject12ToString(eDataType, instanceValue);
			case DocbookPackage.CLASS_TYPE_OBJECT13:
				return convertClassTypeObject13ToString(eDataType, instanceValue);
			case DocbookPackage.CLASS_TYPE_OBJECT14:
				return convertClassTypeObject14ToString(eDataType, instanceValue);
			case DocbookPackage.CLASS_TYPE_OBJECT15:
				return convertClassTypeObject15ToString(eDataType, instanceValue);
			case DocbookPackage.CLASS_TYPE_OBJECT16:
				return convertClassTypeObject16ToString(eDataType, instanceValue);
			case DocbookPackage.CLASS_TYPE_OBJECT17:
				return convertClassTypeObject17ToString(eDataType, instanceValue);
			case DocbookPackage.CLASS_TYPE_OBJECT18:
				return convertClassTypeObject18ToString(eDataType, instanceValue);
			case DocbookPackage.CLASS_TYPE_OBJECT19:
				return convertClassTypeObject19ToString(eDataType, instanceValue);
			case DocbookPackage.CLASS_TYPE_OBJECT20:
				return convertClassTypeObject20ToString(eDataType, instanceValue);
			case DocbookPackage.CLASS_TYPE_OBJECT21:
				return convertClassTypeObject21ToString(eDataType, instanceValue);
			case DocbookPackage.COLSEP_TYPE_OBJECT:
				return convertColsepTypeObjectToString(eDataType, instanceValue);
			case DocbookPackage.COLSEP_TYPE_OBJECT1:
				return convertColsepTypeObject1ToString(eDataType, instanceValue);
			case DocbookPackage.COLSEP_TYPE_OBJECT2:
				return convertColsepTypeObject2ToString(eDataType, instanceValue);
			case DocbookPackage.COLSEP_TYPE_OBJECT3:
				return convertColsepTypeObject3ToString(eDataType, instanceValue);
			case DocbookPackage.COLSEP_TYPE_OBJECT4:
				return convertColsepTypeObject4ToString(eDataType, instanceValue);
			case DocbookPackage.COLSEP_TYPE_OBJECT5:
				return convertColsepTypeObject5ToString(eDataType, instanceValue);
			case DocbookPackage.COLSEP_TYPE_OBJECT6:
				return convertColsepTypeObject6ToString(eDataType, instanceValue);
			case DocbookPackage.CONTINUATION_TYPE_OBJECT:
				return convertContinuationTypeObjectToString(eDataType, instanceValue);
			case DocbookPackage.CONTINUATION_TYPE_OBJECT1:
				return convertContinuationTypeObject1ToString(eDataType, instanceValue);
			case DocbookPackage.CONTINUATION_TYPE_OBJECT2:
				return convertContinuationTypeObject2ToString(eDataType, instanceValue);
			case DocbookPackage.CONTINUATION_TYPE_OBJECT3:
				return convertContinuationTypeObject3ToString(eDataType, instanceValue);
			case DocbookPackage.CONTINUATION_TYPE_OBJECT4:
				return convertContinuationTypeObject4ToString(eDataType, instanceValue);
			case DocbookPackage.CONTINUATION_TYPE_OBJECT5:
				return convertContinuationTypeObject5ToString(eDataType, instanceValue);
			case DocbookPackage.CONTINUATION_TYPE_OBJECT6:
				return convertContinuationTypeObject6ToString(eDataType, instanceValue);
			case DocbookPackage.CONTINUATION_TYPE_OBJECT7:
				return convertContinuationTypeObject7ToString(eDataType, instanceValue);
			case DocbookPackage.DEFAULTLABEL_TYPE_OBJECT:
				return convertDefaultlabelTypeObjectToString(eDataType, instanceValue);
			case DocbookPackage.DIR_TYPE_OBJECT:
				return convertDirTypeObjectToString(eDataType, instanceValue);
			case DocbookPackage.FRAME_TYPE_OBJECT:
				return convertFrameTypeObjectToString(eDataType, instanceValue);
			case DocbookPackage.FRAME_TYPE_OBJECT1:
				return convertFrameTypeObject1ToString(eDataType, instanceValue);
			case DocbookPackage.FUNCTION_TYPE_OBJECT:
				return convertFunctionTypeObjectToString(eDataType, instanceValue);
			case DocbookPackage.INHERITNUM_TYPE_OBJECT:
				return convertInheritnumTypeObjectToString(eDataType, instanceValue);
			case DocbookPackage.LINENUMBERING_TYPE_OBJECT:
				return convertLinenumberingTypeObjectToString(eDataType, instanceValue);
			case DocbookPackage.LINENUMBERING_TYPE_OBJECT1:
				return convertLinenumberingTypeObject1ToString(eDataType, instanceValue);
			case DocbookPackage.LINENUMBERING_TYPE_OBJECT2:
				return convertLinenumberingTypeObject2ToString(eDataType, instanceValue);
			case DocbookPackage.LINENUMBERING_TYPE_OBJECT3:
				return convertLinenumberingTypeObject3ToString(eDataType, instanceValue);
			case DocbookPackage.LINENUMBERING_TYPE_OBJECT4:
				return convertLinenumberingTypeObject4ToString(eDataType, instanceValue);
			case DocbookPackage.LINENUMBERING_TYPE_OBJECT5:
				return convertLinenumberingTypeObject5ToString(eDataType, instanceValue);
			case DocbookPackage.LINENUMBERING_TYPE_OBJECT6:
				return convertLinenumberingTypeObject6ToString(eDataType, instanceValue);
			case DocbookPackage.NUMERATION_TYPE_OBJECT:
				return convertNumerationTypeObjectToString(eDataType, instanceValue);
			case DocbookPackage.ORIENT_TYPE_OBJECT:
				return convertOrientTypeObjectToString(eDataType, instanceValue);
			case DocbookPackage.ORIENT_TYPE_OBJECT1:
				return convertOrientTypeObject1ToString(eDataType, instanceValue);
			case DocbookPackage.PERFORMANCE_TYPE_OBJECT:
				return convertPerformanceTypeObjectToString(eDataType, instanceValue);
			case DocbookPackage.PERFORMANCE_TYPE_OBJECT1:
				return convertPerformanceTypeObject1ToString(eDataType, instanceValue);
			case DocbookPackage.PERFORMANCE_TYPE_OBJECT2:
				return convertPerformanceTypeObject2ToString(eDataType, instanceValue);
			case DocbookPackage.PGWIDE_TYPE_OBJECT:
				return convertPgwideTypeObjectToString(eDataType, instanceValue);
			case DocbookPackage.PGWIDE_TYPE_OBJECT1:
				return convertPgwideTypeObject1ToString(eDataType, instanceValue);
			case DocbookPackage.PGWIDE_TYPE_OBJECT2:
				return convertPgwideTypeObject2ToString(eDataType, instanceValue);
			case DocbookPackage.PGWIDE_TYPE_OBJECT3:
				return convertPgwideTypeObject3ToString(eDataType, instanceValue);
			case DocbookPackage.PGWIDE_TYPE_OBJECT4:
				return convertPgwideTypeObject4ToString(eDataType, instanceValue);
			case DocbookPackage.PGWIDE_TYPE_OBJECT5:
				return convertPgwideTypeObject5ToString(eDataType, instanceValue);
			case DocbookPackage.PUBWORK_TYPE_OBJECT:
				return convertPubworkTypeObjectToString(eDataType, instanceValue);
			case DocbookPackage.RENDERAS_TYPE_OBJECT:
				return convertRenderasTypeObjectToString(eDataType, instanceValue);
			case DocbookPackage.REP_TYPE_OBJECT:
				return convertRepTypeObjectToString(eDataType, instanceValue);
			case DocbookPackage.REP_TYPE_OBJECT1:
				return convertRepTypeObject1ToString(eDataType, instanceValue);
			case DocbookPackage.REP_TYPE_OBJECT2:
				return convertRepTypeObject2ToString(eDataType, instanceValue);
			case DocbookPackage.REVISIONFLAG_TYPE_OBJECT:
				return convertRevisionflagTypeObjectToString(eDataType, instanceValue);
			case DocbookPackage.ROTATE_TYPE_OBJECT:
				return convertRotateTypeObjectToString(eDataType, instanceValue);
			case DocbookPackage.ROWHEADER_TYPE_OBJECT:
				return convertRowheaderTypeObjectToString(eDataType, instanceValue);
			case DocbookPackage.ROWHEADER_TYPE_OBJECT1:
				return convertRowheaderTypeObject1ToString(eDataType, instanceValue);
			case DocbookPackage.ROWSEP_TYPE_OBJECT:
				return convertRowsepTypeObjectToString(eDataType, instanceValue);
			case DocbookPackage.ROWSEP_TYPE_OBJECT1:
				return convertRowsepTypeObject1ToString(eDataType, instanceValue);
			case DocbookPackage.ROWSEP_TYPE_OBJECT2:
				return convertRowsepTypeObject2ToString(eDataType, instanceValue);
			case DocbookPackage.ROWSEP_TYPE_OBJECT3:
				return convertRowsepTypeObject3ToString(eDataType, instanceValue);
			case DocbookPackage.ROWSEP_TYPE_OBJECT4:
				return convertRowsepTypeObject4ToString(eDataType, instanceValue);
			case DocbookPackage.ROWSEP_TYPE_OBJECT5:
				return convertRowsepTypeObject5ToString(eDataType, instanceValue);
			case DocbookPackage.ROWSEP_TYPE_OBJECT6:
				return convertRowsepTypeObject6ToString(eDataType, instanceValue);
			case DocbookPackage.ROWSEP_TYPE_OBJECT7:
				return convertRowsepTypeObject7ToString(eDataType, instanceValue);
			case DocbookPackage.RULES_TYPE_OBJECT:
				return convertRulesTypeObjectToString(eDataType, instanceValue);
			case DocbookPackage.RULES_TYPE_OBJECT1:
				return convertRulesTypeObject1ToString(eDataType, instanceValue);
			case DocbookPackage.SCALEFIT_TYPE_OBJECT:
				return convertScalefitTypeObjectToString(eDataType, instanceValue);
			case DocbookPackage.SCALEFIT_TYPE_OBJECT1:
				return convertScalefitTypeObject1ToString(eDataType, instanceValue);
			case DocbookPackage.SCOPE_TYPE_OBJECT:
				return convertScopeTypeObjectToString(eDataType, instanceValue);
			case DocbookPackage.SCOPE_TYPE_OBJECT1:
				return convertScopeTypeObject1ToString(eDataType, instanceValue);
			case DocbookPackage.SCOPE_TYPE_OBJECT2:
				return convertScopeTypeObject2ToString(eDataType, instanceValue);
			case DocbookPackage.SHORTENTRY_TYPE_OBJECT:
				return convertShortentryTypeObjectToString(eDataType, instanceValue);
			case DocbookPackage.SIGNIFICANCE_TYPE_OBJECT:
				return convertSignificanceTypeObjectToString(eDataType, instanceValue);
			case DocbookPackage.SPACING_TYPE_OBJECT:
				return convertSpacingTypeObjectToString(eDataType, instanceValue);
			case DocbookPackage.SPACING_TYPE_OBJECT1:
				return convertSpacingTypeObject1ToString(eDataType, instanceValue);
			case DocbookPackage.SPACING_TYPE_OBJECT2:
				return convertSpacingTypeObject2ToString(eDataType, instanceValue);
			case DocbookPackage.SPATIAL_TYPE_OBJECT:
				return convertSpatialTypeObjectToString(eDataType, instanceValue);
			case DocbookPackage.TEMPORAL_TYPE_OBJECT:
				return convertTemporalTypeObjectToString(eDataType, instanceValue);
			case DocbookPackage.TOCENTRY_TYPE_OBJECT:
				return convertTocentryTypeObjectToString(eDataType, instanceValue);
			case DocbookPackage.TYPE_TYPE_OBJECT:
				return convertTypeTypeObjectToString(eDataType, instanceValue);
			case DocbookPackage.TYPE_TYPE_OBJECT1:
				return convertTypeTypeObject1ToString(eDataType, instanceValue);
			case DocbookPackage.UNITS_TYPE_OBJECT:
				return convertUnitsTypeObjectToString(eDataType, instanceValue);
			case DocbookPackage.UNITS_TYPE_OBJECT1:
				return convertUnitsTypeObject1ToString(eDataType, instanceValue);
			case DocbookPackage.UNITS_TYPE_OBJECT2:
				return convertUnitsTypeObject2ToString(eDataType, instanceValue);
			case DocbookPackage.VALIGN_TYPE_OBJECT:
				return convertValignTypeObjectToString(eDataType, instanceValue);
			case DocbookPackage.VALIGN_TYPE_OBJECT1:
				return convertValignTypeObject1ToString(eDataType, instanceValue);
			case DocbookPackage.VALIGN_TYPE_OBJECT2:
				return convertValignTypeObject2ToString(eDataType, instanceValue);
			case DocbookPackage.VALIGN_TYPE_OBJECT3:
				return convertValignTypeObject3ToString(eDataType, instanceValue);
			case DocbookPackage.VALIGN_TYPE_OBJECT4:
				return convertValignTypeObject4ToString(eDataType, instanceValue);
			case DocbookPackage.VALIGN_TYPE_OBJECT5:
				return convertValignTypeObject5ToString(eDataType, instanceValue);
			case DocbookPackage.VALIGN_TYPE_OBJECT6:
				return convertValignTypeObject6ToString(eDataType, instanceValue);
			case DocbookPackage.VALIGN_TYPE_OBJECT7:
				return convertValignTypeObject7ToString(eDataType, instanceValue);
			case DocbookPackage.VALIGN_TYPE_OBJECT8:
				return convertValignTypeObject8ToString(eDataType, instanceValue);
			case DocbookPackage.VALIGN_TYPE_OBJECT9:
				return convertValignTypeObject9ToString(eDataType, instanceValue);
			case DocbookPackage.VALIGN_TYPE_OBJECT10:
				return convertValignTypeObject10ToString(eDataType, instanceValue);
			case DocbookPackage.VALIGN_TYPE_OBJECT11:
				return convertValignTypeObject11ToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbbrevType createAbbrevType() {
		AbbrevTypeImpl abbrevType = new AbbrevTypeImpl();
		return abbrevType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractType createAbstractType() {
		AbstractTypeImpl abstractType = new AbstractTypeImpl();
		return abstractType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AccelType createAccelType() {
		AccelTypeImpl accelType = new AccelTypeImpl();
		return accelType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AcknowledgementsType createAcknowledgementsType() {
		AcknowledgementsTypeImpl acknowledgementsType = new AcknowledgementsTypeImpl();
		return acknowledgementsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AcronymType createAcronymType() {
		AcronymTypeImpl acronymType = new AcronymTypeImpl();
		return acronymType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AddressType createAddressType() {
		AddressTypeImpl addressType = new AddressTypeImpl();
		return addressType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AffiliationType createAffiliationType() {
		AffiliationTypeImpl affiliationType = new AffiliationTypeImpl();
		return affiliationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AltType createAltType() {
		AltTypeImpl altType = new AltTypeImpl();
		return altType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnchorType createAnchorType() {
		AnchorTypeImpl anchorType = new AnchorTypeImpl();
		return anchorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnnotationType createAnnotationType() {
		AnnotationTypeImpl annotationType = new AnnotationTypeImpl();
		return annotationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnswerType createAnswerType() {
		AnswerTypeImpl answerType = new AnswerTypeImpl();
		return answerType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AppendixType createAppendixType() {
		AppendixTypeImpl appendixType = new AppendixTypeImpl();
		return appendixType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ApplicationType createApplicationType() {
		ApplicationTypeImpl applicationType = new ApplicationTypeImpl();
		return applicationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArcType createArcType() {
		ArcTypeImpl arcType = new ArcTypeImpl();
		return arcType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AreasetType createAreasetType() {
		AreasetTypeImpl areasetType = new AreasetTypeImpl();
		return areasetType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AreaspecType createAreaspecType() {
		AreaspecTypeImpl areaspecType = new AreaspecTypeImpl();
		return areaspecType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AreaType createAreaType() {
		AreaTypeImpl areaType = new AreaTypeImpl();
		return areaType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArgType createArgType() {
		ArgTypeImpl argType = new ArgTypeImpl();
		return argType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArticleType createArticleType() {
		ArticleTypeImpl articleType = new ArticleTypeImpl();
		return articleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArtpagenumsType createArtpagenumsType() {
		ArtpagenumsTypeImpl artpagenumsType = new ArtpagenumsTypeImpl();
		return artpagenumsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AttributionType createAttributionType() {
		AttributionTypeImpl attributionType = new AttributionTypeImpl();
		return attributionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AudiodataType createAudiodataType() {
		AudiodataTypeImpl audiodataType = new AudiodataTypeImpl();
		return audiodataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AudioobjectType createAudioobjectType() {
		AudioobjectTypeImpl audioobjectType = new AudioobjectTypeImpl();
		return audioobjectType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AuthorgroupType createAuthorgroupType() {
		AuthorgroupTypeImpl authorgroupType = new AuthorgroupTypeImpl();
		return authorgroupType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AuthorinitialsType createAuthorinitialsType() {
		AuthorinitialsTypeImpl authorinitialsType = new AuthorinitialsTypeImpl();
		return authorinitialsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AuthorType createAuthorType() {
		AuthorTypeImpl authorType = new AuthorTypeImpl();
		return authorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BibliocoverageType createBibliocoverageType() {
		BibliocoverageTypeImpl bibliocoverageType = new BibliocoverageTypeImpl();
		return bibliocoverageType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BibliodivType createBibliodivType() {
		BibliodivTypeImpl bibliodivType = new BibliodivTypeImpl();
		return bibliodivType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BiblioentryType createBiblioentryType() {
		BiblioentryTypeImpl biblioentryType = new BiblioentryTypeImpl();
		return biblioentryType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BibliographyType createBibliographyType() {
		BibliographyTypeImpl bibliographyType = new BibliographyTypeImpl();
		return bibliographyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BiblioidType createBiblioidType() {
		BiblioidTypeImpl biblioidType = new BiblioidTypeImpl();
		return biblioidType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BibliolistType createBibliolistType() {
		BibliolistTypeImpl bibliolistType = new BibliolistTypeImpl();
		return bibliolistType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BibliomiscType createBibliomiscType() {
		BibliomiscTypeImpl bibliomiscType = new BibliomiscTypeImpl();
		return bibliomiscType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BibliomixedType createBibliomixedType() {
		BibliomixedTypeImpl bibliomixedType = new BibliomixedTypeImpl();
		return bibliomixedType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BibliomsetType createBibliomsetType() {
		BibliomsetTypeImpl bibliomsetType = new BibliomsetTypeImpl();
		return bibliomsetType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BibliorefType createBibliorefType() {
		BibliorefTypeImpl bibliorefType = new BibliorefTypeImpl();
		return bibliorefType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BibliorelationType createBibliorelationType() {
		BibliorelationTypeImpl bibliorelationType = new BibliorelationTypeImpl();
		return bibliorelationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BibliosetType createBibliosetType() {
		BibliosetTypeImpl bibliosetType = new BibliosetTypeImpl();
		return bibliosetType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BibliosourceType createBibliosourceType() {
		BibliosourceTypeImpl bibliosourceType = new BibliosourceTypeImpl();
		return bibliosourceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BlockquoteType createBlockquoteType() {
		BlockquoteTypeImpl blockquoteType = new BlockquoteTypeImpl();
		return blockquoteType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BookType createBookType() {
		BookTypeImpl bookType = new BookTypeImpl();
		return bookType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BridgeheadType createBridgeheadType() {
		BridgeheadTypeImpl bridgeheadType = new BridgeheadTypeImpl();
		return bridgeheadType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CalloutlistType createCalloutlistType() {
		CalloutlistTypeImpl calloutlistType = new CalloutlistTypeImpl();
		return calloutlistType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CalloutType createCalloutType() {
		CalloutTypeImpl calloutType = new CalloutTypeImpl();
		return calloutType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CaptionType createCaptionType() {
		CaptionTypeImpl captionType = new CaptionTypeImpl();
		return captionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CautionType createCautionType() {
		CautionTypeImpl cautionType = new CautionTypeImpl();
		return cautionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ChapterType createChapterType() {
		ChapterTypeImpl chapterType = new ChapterTypeImpl();
		return chapterType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CitationType createCitationType() {
		CitationTypeImpl citationType = new CitationTypeImpl();
		return citationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CitebiblioidType createCitebiblioidType() {
		CitebiblioidTypeImpl citebiblioidType = new CitebiblioidTypeImpl();
		return citebiblioidType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CiterefentryType createCiterefentryType() {
		CiterefentryTypeImpl citerefentryType = new CiterefentryTypeImpl();
		return citerefentryType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CitetitleType createCitetitleType() {
		CitetitleTypeImpl citetitleType = new CitetitleTypeImpl();
		return citetitleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CityType createCityType() {
		CityTypeImpl cityType = new CityTypeImpl();
		return cityType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ClassnameType createClassnameType() {
		ClassnameTypeImpl classnameType = new ClassnameTypeImpl();
		return classnameType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ClasssynopsisinfoType createClasssynopsisinfoType() {
		ClasssynopsisinfoTypeImpl classsynopsisinfoType = new ClasssynopsisinfoTypeImpl();
		return classsynopsisinfoType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ClasssynopsisType createClasssynopsisType() {
		ClasssynopsisTypeImpl classsynopsisType = new ClasssynopsisTypeImpl();
		return classsynopsisType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CmdsynopsisType createCmdsynopsisType() {
		CmdsynopsisTypeImpl cmdsynopsisType = new CmdsynopsisTypeImpl();
		return cmdsynopsisType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeType createCodeType() {
		CodeTypeImpl codeType = new CodeTypeImpl();
		return codeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ColgroupType createColgroupType() {
		ColgroupTypeImpl colgroupType = new ColgroupTypeImpl();
		return colgroupType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CollabType createCollabType() {
		CollabTypeImpl collabType = new CollabTypeImpl();
		return collabType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ColophonType createColophonType() {
		ColophonTypeImpl colophonType = new ColophonTypeImpl();
		return colophonType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ColspecType createColspecType() {
		ColspecTypeImpl colspecType = new ColspecTypeImpl();
		return colspecType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ColType createColType() {
		ColTypeImpl colType = new ColTypeImpl();
		return colType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CommandType createCommandType() {
		CommandTypeImpl commandType = new CommandTypeImpl();
		return commandType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComputeroutputType createComputeroutputType() {
		ComputeroutputTypeImpl computeroutputType = new ComputeroutputTypeImpl();
		return computeroutputType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConfdatesType createConfdatesType() {
		ConfdatesTypeImpl confdatesType = new ConfdatesTypeImpl();
		return confdatesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConfgroupType createConfgroupType() {
		ConfgroupTypeImpl confgroupType = new ConfgroupTypeImpl();
		return confgroupType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConfnumType createConfnumType() {
		ConfnumTypeImpl confnumType = new ConfnumTypeImpl();
		return confnumType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConfsponsorType createConfsponsorType() {
		ConfsponsorTypeImpl confsponsorType = new ConfsponsorTypeImpl();
		return confsponsorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConftitleType createConftitleType() {
		ConftitleTypeImpl conftitleType = new ConftitleTypeImpl();
		return conftitleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConstantType createConstantType() {
		ConstantTypeImpl constantType = new ConstantTypeImpl();
		return constantType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConstraintdefType createConstraintdefType() {
		ConstraintdefTypeImpl constraintdefType = new ConstraintdefTypeImpl();
		return constraintdefType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConstraintType createConstraintType() {
		ConstraintTypeImpl constraintType = new ConstraintTypeImpl();
		return constraintType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConstructorsynopsisType createConstructorsynopsisType() {
		ConstructorsynopsisTypeImpl constructorsynopsisType = new ConstructorsynopsisTypeImpl();
		return constructorsynopsisType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContractnumType createContractnumType() {
		ContractnumTypeImpl contractnumType = new ContractnumTypeImpl();
		return contractnumType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContractsponsorType createContractsponsorType() {
		ContractsponsorTypeImpl contractsponsorType = new ContractsponsorTypeImpl();
		return contractsponsorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContribType createContribType() {
		ContribTypeImpl contribType = new ContribTypeImpl();
		return contribType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CopyrightType createCopyrightType() {
		CopyrightTypeImpl copyrightType = new CopyrightTypeImpl();
		return copyrightType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CorefType createCorefType() {
		CorefTypeImpl corefType = new CorefTypeImpl();
		return corefType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CoType createCoType() {
		CoTypeImpl coType = new CoTypeImpl();
		return coType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CountryType createCountryType() {
		CountryTypeImpl countryType = new CountryTypeImpl();
		return countryType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CoverType createCoverType() {
		CoverTypeImpl coverType = new CoverTypeImpl();
		return coverType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DatabaseType createDatabaseType() {
		DatabaseTypeImpl databaseType = new DatabaseTypeImpl();
		return databaseType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DateType createDateType() {
		DateTypeImpl dateType = new DateTypeImpl();
		return dateType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DedicationType createDedicationType() {
		DedicationTypeImpl dedicationType = new DedicationTypeImpl();
		return dedicationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DestructorsynopsisType createDestructorsynopsisType() {
		DestructorsynopsisTypeImpl destructorsynopsisType = new DestructorsynopsisTypeImpl();
		return destructorsynopsisType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DocumentRoot createDocumentRoot() {
		DocumentRootImpl documentRoot = new DocumentRootImpl();
		return documentRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EditionType createEditionType() {
		EditionTypeImpl editionType = new EditionTypeImpl();
		return editionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EditorType createEditorType() {
		EditorTypeImpl editorType = new EditorTypeImpl();
		return editorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EmailType createEmailType() {
		EmailTypeImpl emailType = new EmailTypeImpl();
		return emailType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EmphasisType createEmphasisType() {
		EmphasisTypeImpl emphasisType = new EmphasisTypeImpl();
		return emphasisType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EntrytblType createEntrytblType() {
		EntrytblTypeImpl entrytblType = new EntrytblTypeImpl();
		return entrytblType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EntryType createEntryType() {
		EntryTypeImpl entryType = new EntryTypeImpl();
		return entryType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EnvarType createEnvarType() {
		EnvarTypeImpl envarType = new EnvarTypeImpl();
		return envarType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EpigraphType createEpigraphType() {
		EpigraphTypeImpl epigraphType = new EpigraphTypeImpl();
		return epigraphType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EquationType createEquationType() {
		EquationTypeImpl equationType = new EquationTypeImpl();
		return equationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ErrorcodeType createErrorcodeType() {
		ErrorcodeTypeImpl errorcodeType = new ErrorcodeTypeImpl();
		return errorcodeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ErrornameType createErrornameType() {
		ErrornameTypeImpl errornameType = new ErrornameTypeImpl();
		return errornameType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ErrortextType createErrortextType() {
		ErrortextTypeImpl errortextType = new ErrortextTypeImpl();
		return errortextType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ErrortypeType createErrortypeType() {
		ErrortypeTypeImpl errortypeType = new ErrortypeTypeImpl();
		return errortypeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExampleType createExampleType() {
		ExampleTypeImpl exampleType = new ExampleTypeImpl();
		return exampleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExceptionnameType createExceptionnameType() {
		ExceptionnameTypeImpl exceptionnameType = new ExceptionnameTypeImpl();
		return exceptionnameType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExtendedlinkType createExtendedlinkType() {
		ExtendedlinkTypeImpl extendedlinkType = new ExtendedlinkTypeImpl();
		return extendedlinkType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FaxType createFaxType() {
		FaxTypeImpl faxType = new FaxTypeImpl();
		return faxType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FieldsynopsisType createFieldsynopsisType() {
		FieldsynopsisTypeImpl fieldsynopsisType = new FieldsynopsisTypeImpl();
		return fieldsynopsisType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FigureType createFigureType() {
		FigureTypeImpl figureType = new FigureTypeImpl();
		return figureType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FilenameType createFilenameType() {
		FilenameTypeImpl filenameType = new FilenameTypeImpl();
		return filenameType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FirstnameType createFirstnameType() {
		FirstnameTypeImpl firstnameType = new FirstnameTypeImpl();
		return firstnameType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FirsttermType createFirsttermType() {
		FirsttermTypeImpl firsttermType = new FirsttermTypeImpl();
		return firsttermType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FootnoterefType createFootnoterefType() {
		FootnoterefTypeImpl footnoterefType = new FootnoterefTypeImpl();
		return footnoterefType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FootnoteType createFootnoteType() {
		FootnoteTypeImpl footnoteType = new FootnoteTypeImpl();
		return footnoteType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ForeignphraseType createForeignphraseType() {
		ForeignphraseTypeImpl foreignphraseType = new ForeignphraseTypeImpl();
		return foreignphraseType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FormalparaType createFormalparaType() {
		FormalparaTypeImpl formalparaType = new FormalparaTypeImpl();
		return formalparaType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FuncdefType createFuncdefType() {
		FuncdefTypeImpl funcdefType = new FuncdefTypeImpl();
		return funcdefType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FuncparamsType createFuncparamsType() {
		FuncparamsTypeImpl funcparamsType = new FuncparamsTypeImpl();
		return funcparamsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FuncprototypeType createFuncprototypeType() {
		FuncprototypeTypeImpl funcprototypeType = new FuncprototypeTypeImpl();
		return funcprototypeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FuncsynopsisinfoType createFuncsynopsisinfoType() {
		FuncsynopsisinfoTypeImpl funcsynopsisinfoType = new FuncsynopsisinfoTypeImpl();
		return funcsynopsisinfoType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FuncsynopsisType createFuncsynopsisType() {
		FuncsynopsisTypeImpl funcsynopsisType = new FuncsynopsisTypeImpl();
		return funcsynopsisType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FunctionType1 createFunctionType1() {
		FunctionType1Impl functionType1 = new FunctionType1Impl();
		return functionType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GlossaryType createGlossaryType() {
		GlossaryTypeImpl glossaryType = new GlossaryTypeImpl();
		return glossaryType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GlossdefType createGlossdefType() {
		GlossdefTypeImpl glossdefType = new GlossdefTypeImpl();
		return glossdefType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GlossdivType createGlossdivType() {
		GlossdivTypeImpl glossdivType = new GlossdivTypeImpl();
		return glossdivType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GlossentryType createGlossentryType() {
		GlossentryTypeImpl glossentryType = new GlossentryTypeImpl();
		return glossentryType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GlosslistType createGlosslistType() {
		GlosslistTypeImpl glosslistType = new GlosslistTypeImpl();
		return glosslistType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GlossseealsoType createGlossseealsoType() {
		GlossseealsoTypeImpl glossseealsoType = new GlossseealsoTypeImpl();
		return glossseealsoType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GlossseeType createGlossseeType() {
		GlossseeTypeImpl glossseeType = new GlossseeTypeImpl();
		return glossseeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GlosstermType createGlosstermType() {
		GlosstermTypeImpl glosstermType = new GlosstermTypeImpl();
		return glosstermType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GroupType createGroupType() {
		GroupTypeImpl groupType = new GroupTypeImpl();
		return groupType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GuibuttonType createGuibuttonType() {
		GuibuttonTypeImpl guibuttonType = new GuibuttonTypeImpl();
		return guibuttonType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GuiiconType createGuiiconType() {
		GuiiconTypeImpl guiiconType = new GuiiconTypeImpl();
		return guiiconType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GuilabelType createGuilabelType() {
		GuilabelTypeImpl guilabelType = new GuilabelTypeImpl();
		return guilabelType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GuimenuitemType createGuimenuitemType() {
		GuimenuitemTypeImpl guimenuitemType = new GuimenuitemTypeImpl();
		return guimenuitemType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GuimenuType createGuimenuType() {
		GuimenuTypeImpl guimenuType = new GuimenuTypeImpl();
		return guimenuType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GuisubmenuType createGuisubmenuType() {
		GuisubmenuTypeImpl guisubmenuType = new GuisubmenuTypeImpl();
		return guisubmenuType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HardwareType createHardwareType() {
		HardwareTypeImpl hardwareType = new HardwareTypeImpl();
		return hardwareType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HolderType createHolderType() {
		HolderTypeImpl holderType = new HolderTypeImpl();
		return holderType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HonorificType createHonorificType() {
		HonorificTypeImpl honorificType = new HonorificTypeImpl();
		return honorificType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImagedataType createImagedataType() {
		ImagedataTypeImpl imagedataType = new ImagedataTypeImpl();
		return imagedataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImageobjectcoType createImageobjectcoType() {
		ImageobjectcoTypeImpl imageobjectcoType = new ImageobjectcoTypeImpl();
		return imageobjectcoType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImageobjectType createImageobjectType() {
		ImageobjectTypeImpl imageobjectType = new ImageobjectTypeImpl();
		return imageobjectType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImportantType createImportantType() {
		ImportantTypeImpl importantType = new ImportantTypeImpl();
		return importantType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IndexdivType createIndexdivType() {
		IndexdivTypeImpl indexdivType = new IndexdivTypeImpl();
		return indexdivType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IndexentryType createIndexentryType() {
		IndexentryTypeImpl indexentryType = new IndexentryTypeImpl();
		return indexentryType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IndextermType createIndextermType() {
		IndextermTypeImpl indextermType = new IndextermTypeImpl();
		return indextermType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IndexType createIndexType() {
		IndexTypeImpl indexType = new IndexTypeImpl();
		return indexType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InformalequationType createInformalequationType() {
		InformalequationTypeImpl informalequationType = new InformalequationTypeImpl();
		return informalequationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InformalexampleType createInformalexampleType() {
		InformalexampleTypeImpl informalexampleType = new InformalexampleTypeImpl();
		return informalexampleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InformalfigureType createInformalfigureType() {
		InformalfigureTypeImpl informalfigureType = new InformalfigureTypeImpl();
		return informalfigureType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InformaltableType createInformaltableType() {
		InformaltableTypeImpl informaltableType = new InformaltableTypeImpl();
		return informaltableType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InfoType createInfoType() {
		InfoTypeImpl infoType = new InfoTypeImpl();
		return infoType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InitializerType createInitializerType() {
		InitializerTypeImpl initializerType = new InitializerTypeImpl();
		return initializerType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InlineequationType createInlineequationType() {
		InlineequationTypeImpl inlineequationType = new InlineequationTypeImpl();
		return inlineequationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InlinemediaobjectType createInlinemediaobjectType() {
		InlinemediaobjectTypeImpl inlinemediaobjectType = new InlinemediaobjectTypeImpl();
		return inlinemediaobjectType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InterfacenameType createInterfacenameType() {
		InterfacenameTypeImpl interfacenameType = new InterfacenameTypeImpl();
		return interfacenameType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IssuenumType createIssuenumType() {
		IssuenumTypeImpl issuenumType = new IssuenumTypeImpl();
		return issuenumType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ItemizedlistType createItemizedlistType() {
		ItemizedlistTypeImpl itemizedlistType = new ItemizedlistTypeImpl();
		return itemizedlistType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ItermsetType createItermsetType() {
		ItermsetTypeImpl itermsetType = new ItermsetTypeImpl();
		return itermsetType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JobtitleType createJobtitleType() {
		JobtitleTypeImpl jobtitleType = new JobtitleTypeImpl();
		return jobtitleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public KeycapType createKeycapType() {
		KeycapTypeImpl keycapType = new KeycapTypeImpl();
		return keycapType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public KeycodeType createKeycodeType() {
		KeycodeTypeImpl keycodeType = new KeycodeTypeImpl();
		return keycodeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public KeycomboType createKeycomboType() {
		KeycomboTypeImpl keycomboType = new KeycomboTypeImpl();
		return keycomboType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public KeysymType createKeysymType() {
		KeysymTypeImpl keysymType = new KeysymTypeImpl();
		return keysymType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public KeywordsetType createKeywordsetType() {
		KeywordsetTypeImpl keywordsetType = new KeywordsetTypeImpl();
		return keywordsetType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public KeywordType createKeywordType() {
		KeywordTypeImpl keywordType = new KeywordTypeImpl();
		return keywordType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LabelType createLabelType() {
		LabelTypeImpl labelType = new LabelTypeImpl();
		return labelType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LegalnoticeType createLegalnoticeType() {
		LegalnoticeTypeImpl legalnoticeType = new LegalnoticeTypeImpl();
		return legalnoticeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LhsType createLhsType() {
		LhsTypeImpl lhsType = new LhsTypeImpl();
		return lhsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LineageType createLineageType() {
		LineageTypeImpl lineageType = new LineageTypeImpl();
		return lineageType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LineannotationType createLineannotationType() {
		LineannotationTypeImpl lineannotationType = new LineannotationTypeImpl();
		return lineannotationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LinkType createLinkType() {
		LinkTypeImpl linkType = new LinkTypeImpl();
		return linkType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ListitemType createListitemType() {
		ListitemTypeImpl listitemType = new ListitemTypeImpl();
		return listitemType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LiterallayoutType createLiterallayoutType() {
		LiterallayoutTypeImpl literallayoutType = new LiterallayoutTypeImpl();
		return literallayoutType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LiteralType createLiteralType() {
		LiteralTypeImpl literalType = new LiteralTypeImpl();
		return literalType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LocatorType createLocatorType() {
		LocatorTypeImpl locatorType = new LocatorTypeImpl();
		return locatorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ManvolnumType createManvolnumType() {
		ManvolnumTypeImpl manvolnumType = new ManvolnumTypeImpl();
		return manvolnumType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MarkupType createMarkupType() {
		MarkupTypeImpl markupType = new MarkupTypeImpl();
		return markupType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MathphraseType createMathphraseType() {
		MathphraseTypeImpl mathphraseType = new MathphraseTypeImpl();
		return mathphraseType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MediaobjectType createMediaobjectType() {
		MediaobjectTypeImpl mediaobjectType = new MediaobjectTypeImpl();
		return mediaobjectType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MemberType createMemberType() {
		MemberTypeImpl memberType = new MemberTypeImpl();
		return memberType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MenuchoiceType createMenuchoiceType() {
		MenuchoiceTypeImpl menuchoiceType = new MenuchoiceTypeImpl();
		return menuchoiceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MethodnameType createMethodnameType() {
		MethodnameTypeImpl methodnameType = new MethodnameTypeImpl();
		return methodnameType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MethodparamType createMethodparamType() {
		MethodparamTypeImpl methodparamType = new MethodparamTypeImpl();
		return methodparamType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MethodsynopsisType createMethodsynopsisType() {
		MethodsynopsisTypeImpl methodsynopsisType = new MethodsynopsisTypeImpl();
		return methodsynopsisType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ModifierType createModifierType() {
		ModifierTypeImpl modifierType = new ModifierTypeImpl();
		return modifierType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MousebuttonType createMousebuttonType() {
		MousebuttonTypeImpl mousebuttonType = new MousebuttonTypeImpl();
		return mousebuttonType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MsgaudType createMsgaudType() {
		MsgaudTypeImpl msgaudType = new MsgaudTypeImpl();
		return msgaudType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MsgentryType createMsgentryType() {
		MsgentryTypeImpl msgentryType = new MsgentryTypeImpl();
		return msgentryType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MsgexplanType createMsgexplanType() {
		MsgexplanTypeImpl msgexplanType = new MsgexplanTypeImpl();
		return msgexplanType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MsginfoType createMsginfoType() {
		MsginfoTypeImpl msginfoType = new MsginfoTypeImpl();
		return msginfoType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MsglevelType createMsglevelType() {
		MsglevelTypeImpl msglevelType = new MsglevelTypeImpl();
		return msglevelType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MsgmainType createMsgmainType() {
		MsgmainTypeImpl msgmainType = new MsgmainTypeImpl();
		return msgmainType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MsgorigType createMsgorigType() {
		MsgorigTypeImpl msgorigType = new MsgorigTypeImpl();
		return msgorigType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MsgrelType createMsgrelType() {
		MsgrelTypeImpl msgrelType = new MsgrelTypeImpl();
		return msgrelType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MsgsetType createMsgsetType() {
		MsgsetTypeImpl msgsetType = new MsgsetTypeImpl();
		return msgsetType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MsgsubType createMsgsubType() {
		MsgsubTypeImpl msgsubType = new MsgsubTypeImpl();
		return msgsubType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MsgtextType createMsgtextType() {
		MsgtextTypeImpl msgtextType = new MsgtextTypeImpl();
		return msgtextType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MsgType createMsgType() {
		MsgTypeImpl msgType = new MsgTypeImpl();
		return msgType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NonterminalType createNonterminalType() {
		NonterminalTypeImpl nonterminalType = new NonterminalTypeImpl();
		return nonterminalType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NoteType createNoteType() {
		NoteTypeImpl noteType = new NoteTypeImpl();
		return noteType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OlinkType createOlinkType() {
		OlinkTypeImpl olinkType = new OlinkTypeImpl();
		return olinkType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OoclassType createOoclassType() {
		OoclassTypeImpl ooclassType = new OoclassTypeImpl();
		return ooclassType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OoexceptionType createOoexceptionType() {
		OoexceptionTypeImpl ooexceptionType = new OoexceptionTypeImpl();
		return ooexceptionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OointerfaceType createOointerfaceType() {
		OointerfaceTypeImpl oointerfaceType = new OointerfaceTypeImpl();
		return oointerfaceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OptionalType createOptionalType() {
		OptionalTypeImpl optionalType = new OptionalTypeImpl();
		return optionalType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OptionType createOptionType() {
		OptionTypeImpl optionType = new OptionTypeImpl();
		return optionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OrderedlistType createOrderedlistType() {
		OrderedlistTypeImpl orderedlistType = new OrderedlistTypeImpl();
		return orderedlistType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OrgdivType createOrgdivType() {
		OrgdivTypeImpl orgdivType = new OrgdivTypeImpl();
		return orgdivType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OrgnameType createOrgnameType() {
		OrgnameTypeImpl orgnameType = new OrgnameTypeImpl();
		return orgnameType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OrgType createOrgType() {
		OrgTypeImpl orgType = new OrgTypeImpl();
		return orgType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OtheraddrType createOtheraddrType() {
		OtheraddrTypeImpl otheraddrType = new OtheraddrTypeImpl();
		return otheraddrType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OthercreditType createOthercreditType() {
		OthercreditTypeImpl othercreditType = new OthercreditTypeImpl();
		return othercreditType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OthernameType createOthernameType() {
		OthernameTypeImpl othernameType = new OthernameTypeImpl();
		return othernameType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PackageType createPackageType() {
		PackageTypeImpl packageType = new PackageTypeImpl();
		return packageType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PagenumsType createPagenumsType() {
		PagenumsTypeImpl pagenumsType = new PagenumsTypeImpl();
		return pagenumsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ParamdefType createParamdefType() {
		ParamdefTypeImpl paramdefType = new ParamdefTypeImpl();
		return paramdefType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ParameterType createParameterType() {
		ParameterTypeImpl parameterType = new ParameterTypeImpl();
		return parameterType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ParaType createParaType() {
		ParaTypeImpl paraType = new ParaTypeImpl();
		return paraType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PartintroType createPartintroType() {
		PartintroTypeImpl partintroType = new PartintroTypeImpl();
		return partintroType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PartType createPartType() {
		PartTypeImpl partType = new PartTypeImpl();
		return partType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PersonblurbType createPersonblurbType() {
		PersonblurbTypeImpl personblurbType = new PersonblurbTypeImpl();
		return personblurbType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PersonnameType createPersonnameType() {
		PersonnameTypeImpl personnameType = new PersonnameTypeImpl();
		return personnameType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PersonType createPersonType() {
		PersonTypeImpl personType = new PersonTypeImpl();
		return personType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PhoneType createPhoneType() {
		PhoneTypeImpl phoneType = new PhoneTypeImpl();
		return phoneType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PhraseType createPhraseType() {
		PhraseTypeImpl phraseType = new PhraseTypeImpl();
		return phraseType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PobType createPobType() {
		PobTypeImpl pobType = new PobTypeImpl();
		return pobType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PostcodeType createPostcodeType() {
		PostcodeTypeImpl postcodeType = new PostcodeTypeImpl();
		return postcodeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PrefaceType createPrefaceType() {
		PrefaceTypeImpl prefaceType = new PrefaceTypeImpl();
		return prefaceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PrimaryieType createPrimaryieType() {
		PrimaryieTypeImpl primaryieType = new PrimaryieTypeImpl();
		return primaryieType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PrimaryType createPrimaryType() {
		PrimaryTypeImpl primaryType = new PrimaryTypeImpl();
		return primaryType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PrinthistoryType createPrinthistoryType() {
		PrinthistoryTypeImpl printhistoryType = new PrinthistoryTypeImpl();
		return printhistoryType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProcedureType createProcedureType() {
		ProcedureTypeImpl procedureType = new ProcedureTypeImpl();
		return procedureType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductionrecapType createProductionrecapType() {
		ProductionrecapTypeImpl productionrecapType = new ProductionrecapTypeImpl();
		return productionrecapType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductionsetType createProductionsetType() {
		ProductionsetTypeImpl productionsetType = new ProductionsetTypeImpl();
		return productionsetType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductionType createProductionType() {
		ProductionTypeImpl productionType = new ProductionTypeImpl();
		return productionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductnameType createProductnameType() {
		ProductnameTypeImpl productnameType = new ProductnameTypeImpl();
		return productnameType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductnumberType createProductnumberType() {
		ProductnumberTypeImpl productnumberType = new ProductnumberTypeImpl();
		return productnumberType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProgramlistingcoType createProgramlistingcoType() {
		ProgramlistingcoTypeImpl programlistingcoType = new ProgramlistingcoTypeImpl();
		return programlistingcoType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProgramlistingType createProgramlistingType() {
		ProgramlistingTypeImpl programlistingType = new ProgramlistingTypeImpl();
		return programlistingType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PromptType createPromptType() {
		PromptTypeImpl promptType = new PromptTypeImpl();
		return promptType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PropertyType createPropertyType() {
		PropertyTypeImpl propertyType = new PropertyTypeImpl();
		return propertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PubdateType createPubdateType() {
		PubdateTypeImpl pubdateType = new PubdateTypeImpl();
		return pubdateType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PublishernameType createPublishernameType() {
		PublishernameTypeImpl publishernameType = new PublishernameTypeImpl();
		return publishernameType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PublisherType createPublisherType() {
		PublisherTypeImpl publisherType = new PublisherTypeImpl();
		return publisherType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QandadivType createQandadivType() {
		QandadivTypeImpl qandadivType = new QandadivTypeImpl();
		return qandadivType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QandaentryType createQandaentryType() {
		QandaentryTypeImpl qandaentryType = new QandaentryTypeImpl();
		return qandaentryType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QandasetType createQandasetType() {
		QandasetTypeImpl qandasetType = new QandasetTypeImpl();
		return qandasetType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QuestionType createQuestionType() {
		QuestionTypeImpl questionType = new QuestionTypeImpl();
		return questionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QuoteType createQuoteType() {
		QuoteTypeImpl quoteType = new QuoteTypeImpl();
		return quoteType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RefclassType createRefclassType() {
		RefclassTypeImpl refclassType = new RefclassTypeImpl();
		return refclassType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RefdescriptorType createRefdescriptorType() {
		RefdescriptorTypeImpl refdescriptorType = new RefdescriptorTypeImpl();
		return refdescriptorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RefentrytitleType createRefentrytitleType() {
		RefentrytitleTypeImpl refentrytitleType = new RefentrytitleTypeImpl();
		return refentrytitleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RefentryType createRefentryType() {
		RefentryTypeImpl refentryType = new RefentryTypeImpl();
		return refentryType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReferenceType createReferenceType() {
		ReferenceTypeImpl referenceType = new ReferenceTypeImpl();
		return referenceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RefmetaType createRefmetaType() {
		RefmetaTypeImpl refmetaType = new RefmetaTypeImpl();
		return refmetaType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RefmiscinfoType createRefmiscinfoType() {
		RefmiscinfoTypeImpl refmiscinfoType = new RefmiscinfoTypeImpl();
		return refmiscinfoType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RefnamedivType createRefnamedivType() {
		RefnamedivTypeImpl refnamedivType = new RefnamedivTypeImpl();
		return refnamedivType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RefnameType createRefnameType() {
		RefnameTypeImpl refnameType = new RefnameTypeImpl();
		return refnameType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RefpurposeType createRefpurposeType() {
		RefpurposeTypeImpl refpurposeType = new RefpurposeTypeImpl();
		return refpurposeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Refsect1Type createRefsect1Type() {
		Refsect1TypeImpl refsect1Type = new Refsect1TypeImpl();
		return refsect1Type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Refsect2Type createRefsect2Type() {
		Refsect2TypeImpl refsect2Type = new Refsect2TypeImpl();
		return refsect2Type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Refsect3Type createRefsect3Type() {
		Refsect3TypeImpl refsect3Type = new Refsect3TypeImpl();
		return refsect3Type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RefsectionType createRefsectionType() {
		RefsectionTypeImpl refsectionType = new RefsectionTypeImpl();
		return refsectionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RefsynopsisdivType createRefsynopsisdivType() {
		RefsynopsisdivTypeImpl refsynopsisdivType = new RefsynopsisdivTypeImpl();
		return refsynopsisdivType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReleaseinfoType createReleaseinfoType() {
		ReleaseinfoTypeImpl releaseinfoType = new ReleaseinfoTypeImpl();
		return releaseinfoType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RemarkType createRemarkType() {
		RemarkTypeImpl remarkType = new RemarkTypeImpl();
		return remarkType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReplaceableType createReplaceableType() {
		ReplaceableTypeImpl replaceableType = new ReplaceableTypeImpl();
		return replaceableType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReturnvalueType createReturnvalueType() {
		ReturnvalueTypeImpl returnvalueType = new ReturnvalueTypeImpl();
		return returnvalueType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RevdescriptionType createRevdescriptionType() {
		RevdescriptionTypeImpl revdescriptionType = new RevdescriptionTypeImpl();
		return revdescriptionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RevhistoryType createRevhistoryType() {
		RevhistoryTypeImpl revhistoryType = new RevhistoryTypeImpl();
		return revhistoryType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RevisionType createRevisionType() {
		RevisionTypeImpl revisionType = new RevisionTypeImpl();
		return revisionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RevnumberType createRevnumberType() {
		RevnumberTypeImpl revnumberType = new RevnumberTypeImpl();
		return revnumberType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RevremarkType createRevremarkType() {
		RevremarkTypeImpl revremarkType = new RevremarkTypeImpl();
		return revremarkType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RhsType createRhsType() {
		RhsTypeImpl rhsType = new RhsTypeImpl();
		return rhsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RowType createRowType() {
		RowTypeImpl rowType = new RowTypeImpl();
		return rowType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SbrType createSbrType() {
		SbrTypeImpl sbrType = new SbrTypeImpl();
		return sbrType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ScreencoType createScreencoType() {
		ScreencoTypeImpl screencoType = new ScreencoTypeImpl();
		return screencoType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ScreenshotType createScreenshotType() {
		ScreenshotTypeImpl screenshotType = new ScreenshotTypeImpl();
		return screenshotType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ScreenType createScreenType() {
		ScreenTypeImpl screenType = new ScreenTypeImpl();
		return screenType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SecondaryieType createSecondaryieType() {
		SecondaryieTypeImpl secondaryieType = new SecondaryieTypeImpl();
		return secondaryieType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SecondaryType createSecondaryType() {
		SecondaryTypeImpl secondaryType = new SecondaryTypeImpl();
		return secondaryType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Sect1Type createSect1Type() {
		Sect1TypeImpl sect1Type = new Sect1TypeImpl();
		return sect1Type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Sect2Type createSect2Type() {
		Sect2TypeImpl sect2Type = new Sect2TypeImpl();
		return sect2Type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Sect3Type createSect3Type() {
		Sect3TypeImpl sect3Type = new Sect3TypeImpl();
		return sect3Type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Sect4Type createSect4Type() {
		Sect4TypeImpl sect4Type = new Sect4TypeImpl();
		return sect4Type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Sect5Type createSect5Type() {
		Sect5TypeImpl sect5Type = new Sect5TypeImpl();
		return sect5Type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SectionType createSectionType() {
		SectionTypeImpl sectionType = new SectionTypeImpl();
		return sectionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SeealsoieType createSeealsoieType() {
		SeealsoieTypeImpl seealsoieType = new SeealsoieTypeImpl();
		return seealsoieType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SeealsoType createSeealsoType() {
		SeealsoTypeImpl seealsoType = new SeealsoTypeImpl();
		return seealsoType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SeeieType createSeeieType() {
		SeeieTypeImpl seeieType = new SeeieTypeImpl();
		return seeieType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SeeType createSeeType() {
		SeeTypeImpl seeType = new SeeTypeImpl();
		return seeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SeglistitemType createSeglistitemType() {
		SeglistitemTypeImpl seglistitemType = new SeglistitemTypeImpl();
		return seglistitemType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SegmentedlistType createSegmentedlistType() {
		SegmentedlistTypeImpl segmentedlistType = new SegmentedlistTypeImpl();
		return segmentedlistType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SegtitleType createSegtitleType() {
		SegtitleTypeImpl segtitleType = new SegtitleTypeImpl();
		return segtitleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SegType createSegType() {
		SegTypeImpl segType = new SegTypeImpl();
		return segType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SeriesvolnumsType createSeriesvolnumsType() {
		SeriesvolnumsTypeImpl seriesvolnumsType = new SeriesvolnumsTypeImpl();
		return seriesvolnumsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SetindexType createSetindexType() {
		SetindexTypeImpl setindexType = new SetindexTypeImpl();
		return setindexType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SetType createSetType() {
		SetTypeImpl setType = new SetTypeImpl();
		return setType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ShortaffilType createShortaffilType() {
		ShortaffilTypeImpl shortaffilType = new ShortaffilTypeImpl();
		return shortaffilType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ShortcutType createShortcutType() {
		ShortcutTypeImpl shortcutType = new ShortcutTypeImpl();
		return shortcutType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SidebarType createSidebarType() {
		SidebarTypeImpl sidebarType = new SidebarTypeImpl();
		return sidebarType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SimparaType createSimparaType() {
		SimparaTypeImpl simparaType = new SimparaTypeImpl();
		return simparaType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SimplelistType createSimplelistType() {
		SimplelistTypeImpl simplelistType = new SimplelistTypeImpl();
		return simplelistType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SimplemsgentryType createSimplemsgentryType() {
		SimplemsgentryTypeImpl simplemsgentryType = new SimplemsgentryTypeImpl();
		return simplemsgentryType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SimplesectType createSimplesectType() {
		SimplesectTypeImpl simplesectType = new SimplesectTypeImpl();
		return simplesectType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SpanspecType createSpanspecType() {
		SpanspecTypeImpl spanspecType = new SpanspecTypeImpl();
		return spanspecType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StateType createStateType() {
		StateTypeImpl stateType = new StateTypeImpl();
		return stateType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StepalternativesType createStepalternativesType() {
		StepalternativesTypeImpl stepalternativesType = new StepalternativesTypeImpl();
		return stepalternativesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StepType createStepType() {
		StepTypeImpl stepType = new StepTypeImpl();
		return stepType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StreetType createStreetType() {
		StreetTypeImpl streetType = new StreetTypeImpl();
		return streetType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubjectsetType createSubjectsetType() {
		SubjectsetTypeImpl subjectsetType = new SubjectsetTypeImpl();
		return subjectsetType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubjecttermType createSubjecttermType() {
		SubjecttermTypeImpl subjecttermType = new SubjecttermTypeImpl();
		return subjecttermType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubjectType createSubjectType() {
		SubjectTypeImpl subjectType = new SubjectTypeImpl();
		return subjectType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubscriptType createSubscriptType() {
		SubscriptTypeImpl subscriptType = new SubscriptTypeImpl();
		return subscriptType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubstepsType createSubstepsType() {
		SubstepsTypeImpl substepsType = new SubstepsTypeImpl();
		return substepsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubtitleType createSubtitleType() {
		SubtitleTypeImpl subtitleType = new SubtitleTypeImpl();
		return subtitleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SuperscriptType createSuperscriptType() {
		SuperscriptTypeImpl superscriptType = new SuperscriptTypeImpl();
		return superscriptType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SurnameType createSurnameType() {
		SurnameTypeImpl surnameType = new SurnameTypeImpl();
		return surnameType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SymbolType createSymbolType() {
		SymbolTypeImpl symbolType = new SymbolTypeImpl();
		return symbolType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SynopfragmentrefType createSynopfragmentrefType() {
		SynopfragmentrefTypeImpl synopfragmentrefType = new SynopfragmentrefTypeImpl();
		return synopfragmentrefType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SynopfragmentType createSynopfragmentType() {
		SynopfragmentTypeImpl synopfragmentType = new SynopfragmentTypeImpl();
		return synopfragmentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SynopsisType createSynopsisType() {
		SynopsisTypeImpl synopsisType = new SynopsisTypeImpl();
		return synopsisType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SystemitemType createSystemitemType() {
		SystemitemTypeImpl systemitemType = new SystemitemTypeImpl();
		return systemitemType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TableType createTableType() {
		TableTypeImpl tableType = new TableTypeImpl();
		return tableType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TagType createTagType() {
		TagTypeImpl tagType = new TagTypeImpl();
		return tagType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TaskprerequisitesType createTaskprerequisitesType() {
		TaskprerequisitesTypeImpl taskprerequisitesType = new TaskprerequisitesTypeImpl();
		return taskprerequisitesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TaskrelatedType createTaskrelatedType() {
		TaskrelatedTypeImpl taskrelatedType = new TaskrelatedTypeImpl();
		return taskrelatedType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TasksummaryType createTasksummaryType() {
		TasksummaryTypeImpl tasksummaryType = new TasksummaryTypeImpl();
		return tasksummaryType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TaskType createTaskType() {
		TaskTypeImpl taskType = new TaskTypeImpl();
		return taskType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TbodyType createTbodyType() {
		TbodyTypeImpl tbodyType = new TbodyTypeImpl();
		return tbodyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TdType createTdType() {
		TdTypeImpl tdType = new TdTypeImpl();
		return tdType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TermdefType createTermdefType() {
		TermdefTypeImpl termdefType = new TermdefTypeImpl();
		return termdefType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TermType createTermType() {
		TermTypeImpl termType = new TermTypeImpl();
		return termType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TertiaryieType createTertiaryieType() {
		TertiaryieTypeImpl tertiaryieType = new TertiaryieTypeImpl();
		return tertiaryieType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TertiaryType createTertiaryType() {
		TertiaryTypeImpl tertiaryType = new TertiaryTypeImpl();
		return tertiaryType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TextdataType createTextdataType() {
		TextdataTypeImpl textdataType = new TextdataTypeImpl();
		return textdataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TextobjectType createTextobjectType() {
		TextobjectTypeImpl textobjectType = new TextobjectTypeImpl();
		return textobjectType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TfootType createTfootType() {
		TfootTypeImpl tfootType = new TfootTypeImpl();
		return tfootType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TgroupType createTgroupType() {
		TgroupTypeImpl tgroupType = new TgroupTypeImpl();
		return tgroupType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TheadType createTheadType() {
		TheadTypeImpl theadType = new TheadTypeImpl();
		return theadType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ThType createThType() {
		ThTypeImpl thType = new ThTypeImpl();
		return thType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TipType createTipType() {
		TipTypeImpl tipType = new TipTypeImpl();
		return tipType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TitleabbrevType createTitleabbrevType() {
		TitleabbrevTypeImpl titleabbrevType = new TitleabbrevTypeImpl();
		return titleabbrevType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TitleType createTitleType() {
		TitleTypeImpl titleType = new TitleTypeImpl();
		return titleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TocdivType createTocdivType() {
		TocdivTypeImpl tocdivType = new TocdivTypeImpl();
		return tocdivType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TocentryType createTocentryType() {
		TocentryTypeImpl tocentryType = new TocentryTypeImpl();
		return tocentryType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TocType createTocType() {
		TocTypeImpl tocType = new TocTypeImpl();
		return tocType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TokenType createTokenType() {
		TokenTypeImpl tokenType = new TokenTypeImpl();
		return tokenType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TrademarkType createTrademarkType() {
		TrademarkTypeImpl trademarkType = new TrademarkTypeImpl();
		return trademarkType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TrType createTrType() {
		TrTypeImpl trType = new TrTypeImpl();
		return trType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TypeType2 createTypeType2() {
		TypeType2Impl typeType2 = new TypeType2Impl();
		return typeType2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UriType createUriType() {
		UriTypeImpl uriType = new UriTypeImpl();
		return uriType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UserinputType createUserinputType() {
		UserinputTypeImpl userinputType = new UserinputTypeImpl();
		return userinputType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VarargsType createVarargsType() {
		VarargsTypeImpl varargsType = new VarargsTypeImpl();
		return varargsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VariablelistType createVariablelistType() {
		VariablelistTypeImpl variablelistType = new VariablelistTypeImpl();
		return variablelistType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VarlistentryType createVarlistentryType() {
		VarlistentryTypeImpl varlistentryType = new VarlistentryTypeImpl();
		return varlistentryType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VarnameType createVarnameType() {
		VarnameTypeImpl varnameType = new VarnameTypeImpl();
		return varnameType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VideodataType createVideodataType() {
		VideodataTypeImpl videodataType = new VideodataTypeImpl();
		return videodataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VideoobjectType createVideoobjectType() {
		VideoobjectTypeImpl videoobjectType = new VideoobjectTypeImpl();
		return videoobjectType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VoidType createVoidType() {
		VoidTypeImpl voidType = new VoidTypeImpl();
		return voidType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VolumenumType createVolumenumType() {
		VolumenumTypeImpl volumenumType = new VolumenumTypeImpl();
		return volumenumType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WarningType createWarningType() {
		WarningTypeImpl warningType = new WarningTypeImpl();
		return warningType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WordaswordType createWordaswordType() {
		WordaswordTypeImpl wordaswordType = new WordaswordTypeImpl();
		return wordaswordType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XrefType createXrefType() {
		XrefTypeImpl xrefType = new XrefTypeImpl();
		return xrefType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public YearType createYearType() {
		YearTypeImpl yearType = new YearTypeImpl();
		return yearType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionType createActionTypeFromString(EDataType eDataType, String initialValue) {
		ActionType result = ActionType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertActionTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionType1 createActionType1FromString(EDataType eDataType, String initialValue) {
		ActionType1 result = ActionType1.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertActionType1ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlignType createAlignTypeFromString(EDataType eDataType, String initialValue) {
		AlignType result = AlignType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAlignTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlignType1 createAlignType1FromString(EDataType eDataType, String initialValue) {
		AlignType1 result = AlignType1.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAlignType1ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlignType2 createAlignType2FromString(EDataType eDataType, String initialValue) {
		AlignType2 result = AlignType2.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAlignType2ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlignType3 createAlignType3FromString(EDataType eDataType, String initialValue) {
		AlignType3 result = AlignType3.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAlignType3ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlignType4 createAlignType4FromString(EDataType eDataType, String initialValue) {
		AlignType4 result = AlignType4.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAlignType4ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlignType5 createAlignType5FromString(EDataType eDataType, String initialValue) {
		AlignType5 result = AlignType5.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAlignType5ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlignType6 createAlignType6FromString(EDataType eDataType, String initialValue) {
		AlignType6 result = AlignType6.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAlignType6ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlignType7 createAlignType7FromString(EDataType eDataType, String initialValue) {
		AlignType7 result = AlignType7.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAlignType7ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlignType8 createAlignType8FromString(EDataType eDataType, String initialValue) {
		AlignType8 result = AlignType8.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAlignType8ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlignType9 createAlignType9FromString(EDataType eDataType, String initialValue) {
		AlignType9 result = AlignType9.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAlignType9ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlignType10 createAlignType10FromString(EDataType eDataType, String initialValue) {
		AlignType10 result = AlignType10.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAlignType10ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlignType11 createAlignType11FromString(EDataType eDataType, String initialValue) {
		AlignType11 result = AlignType11.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAlignType11ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlignType12 createAlignType12FromString(EDataType eDataType, String initialValue) {
		AlignType12 result = AlignType12.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAlignType12ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlignType13 createAlignType13FromString(EDataType eDataType, String initialValue) {
		AlignType13 result = AlignType13.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAlignType13ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlignType14 createAlignType14FromString(EDataType eDataType, String initialValue) {
		AlignType14 result = AlignType14.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAlignType14ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChoiceType createChoiceTypeFromString(EDataType eDataType, String initialValue) {
		ChoiceType result = ChoiceType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertChoiceTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChoiceType1 createChoiceType1FromString(EDataType eDataType, String initialValue) {
		ChoiceType1 result = ChoiceType1.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertChoiceType1ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChoiceType2 createChoiceType2FromString(EDataType eDataType, String initialValue) {
		ChoiceType2 result = ChoiceType2.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertChoiceType2ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChoiceType3 createChoiceType3FromString(EDataType eDataType, String initialValue) {
		ChoiceType3 result = ChoiceType3.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertChoiceType3ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassType createClassTypeFromString(EDataType eDataType, String initialValue) {
		ClassType result = ClassType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertClassTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassType1 createClassType1FromString(EDataType eDataType, String initialValue) {
		ClassType1 result = ClassType1.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertClassType1ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassType2 createClassType2FromString(EDataType eDataType, String initialValue) {
		ClassType2 result = ClassType2.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertClassType2ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassType3 createClassType3FromString(EDataType eDataType, String initialValue) {
		ClassType3 result = ClassType3.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertClassType3ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassType4 createClassType4FromString(EDataType eDataType, String initialValue) {
		ClassType4 result = ClassType4.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertClassType4ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassType5 createClassType5FromString(EDataType eDataType, String initialValue) {
		ClassType5 result = ClassType5.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertClassType5ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassType6 createClassType6FromString(EDataType eDataType, String initialValue) {
		ClassType6 result = ClassType6.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertClassType6ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassType7 createClassType7FromString(EDataType eDataType, String initialValue) {
		ClassType7 result = ClassType7.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertClassType7ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassType8 createClassType8FromString(EDataType eDataType, String initialValue) {
		ClassType8 result = ClassType8.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertClassType8ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassType9 createClassType9FromString(EDataType eDataType, String initialValue) {
		ClassType9 result = ClassType9.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertClassType9ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassType10 createClassType10FromString(EDataType eDataType, String initialValue) {
		ClassType10 result = ClassType10.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertClassType10ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassType11 createClassType11FromString(EDataType eDataType, String initialValue) {
		ClassType11 result = ClassType11.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertClassType11ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassType12 createClassType12FromString(EDataType eDataType, String initialValue) {
		ClassType12 result = ClassType12.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertClassType12ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassType13 createClassType13FromString(EDataType eDataType, String initialValue) {
		ClassType13 result = ClassType13.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertClassType13ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassType14 createClassType14FromString(EDataType eDataType, String initialValue) {
		ClassType14 result = ClassType14.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertClassType14ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassType15 createClassType15FromString(EDataType eDataType, String initialValue) {
		ClassType15 result = ClassType15.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertClassType15ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassType16 createClassType16FromString(EDataType eDataType, String initialValue) {
		ClassType16 result = ClassType16.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertClassType16ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassType17 createClassType17FromString(EDataType eDataType, String initialValue) {
		ClassType17 result = ClassType17.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertClassType17ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassType18 createClassType18FromString(EDataType eDataType, String initialValue) {
		ClassType18 result = ClassType18.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertClassType18ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassType19 createClassType19FromString(EDataType eDataType, String initialValue) {
		ClassType19 result = ClassType19.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertClassType19ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassType20 createClassType20FromString(EDataType eDataType, String initialValue) {
		ClassType20 result = ClassType20.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertClassType20ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassType21 createClassType21FromString(EDataType eDataType, String initialValue) {
		ClassType21 result = ClassType21.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertClassType21ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColsepType createColsepTypeFromString(EDataType eDataType, String initialValue) {
		ColsepType result = ColsepType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertColsepTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColsepType1 createColsepType1FromString(EDataType eDataType, String initialValue) {
		ColsepType1 result = ColsepType1.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertColsepType1ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColsepType2 createColsepType2FromString(EDataType eDataType, String initialValue) {
		ColsepType2 result = ColsepType2.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertColsepType2ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColsepType3 createColsepType3FromString(EDataType eDataType, String initialValue) {
		ColsepType3 result = ColsepType3.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertColsepType3ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColsepType4 createColsepType4FromString(EDataType eDataType, String initialValue) {
		ColsepType4 result = ColsepType4.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertColsepType4ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColsepType5 createColsepType5FromString(EDataType eDataType, String initialValue) {
		ColsepType5 result = ColsepType5.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertColsepType5ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColsepType6 createColsepType6FromString(EDataType eDataType, String initialValue) {
		ColsepType6 result = ColsepType6.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertColsepType6ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContinuationType createContinuationTypeFromString(EDataType eDataType, String initialValue) {
		ContinuationType result = ContinuationType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertContinuationTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContinuationType1 createContinuationType1FromString(EDataType eDataType, String initialValue) {
		ContinuationType1 result = ContinuationType1.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertContinuationType1ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContinuationType2 createContinuationType2FromString(EDataType eDataType, String initialValue) {
		ContinuationType2 result = ContinuationType2.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertContinuationType2ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContinuationType3 createContinuationType3FromString(EDataType eDataType, String initialValue) {
		ContinuationType3 result = ContinuationType3.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertContinuationType3ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContinuationType4 createContinuationType4FromString(EDataType eDataType, String initialValue) {
		ContinuationType4 result = ContinuationType4.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertContinuationType4ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContinuationType5 createContinuationType5FromString(EDataType eDataType, String initialValue) {
		ContinuationType5 result = ContinuationType5.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertContinuationType5ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContinuationType6 createContinuationType6FromString(EDataType eDataType, String initialValue) {
		ContinuationType6 result = ContinuationType6.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertContinuationType6ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContinuationType7 createContinuationType7FromString(EDataType eDataType, String initialValue) {
		ContinuationType7 result = ContinuationType7.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertContinuationType7ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefaultlabelType createDefaultlabelTypeFromString(EDataType eDataType, String initialValue) {
		DefaultlabelType result = DefaultlabelType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDefaultlabelTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DirType createDirTypeFromString(EDataType eDataType, String initialValue) {
		DirType result = DirType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDirTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FrameType createFrameTypeFromString(EDataType eDataType, String initialValue) {
		FrameType result = FrameType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFrameTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FrameType1 createFrameType1FromString(EDataType eDataType, String initialValue) {
		FrameType1 result = FrameType1.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFrameType1ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionType createFunctionTypeFromString(EDataType eDataType, String initialValue) {
		FunctionType result = FunctionType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFunctionTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InheritnumType createInheritnumTypeFromString(EDataType eDataType, String initialValue) {
		InheritnumType result = InheritnumType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInheritnumTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinenumberingType createLinenumberingTypeFromString(EDataType eDataType, String initialValue) {
		LinenumberingType result = LinenumberingType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLinenumberingTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinenumberingType1 createLinenumberingType1FromString(EDataType eDataType, String initialValue) {
		LinenumberingType1 result = LinenumberingType1.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLinenumberingType1ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinenumberingType2 createLinenumberingType2FromString(EDataType eDataType, String initialValue) {
		LinenumberingType2 result = LinenumberingType2.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLinenumberingType2ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinenumberingType3 createLinenumberingType3FromString(EDataType eDataType, String initialValue) {
		LinenumberingType3 result = LinenumberingType3.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLinenumberingType3ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinenumberingType4 createLinenumberingType4FromString(EDataType eDataType, String initialValue) {
		LinenumberingType4 result = LinenumberingType4.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLinenumberingType4ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinenumberingType5 createLinenumberingType5FromString(EDataType eDataType, String initialValue) {
		LinenumberingType5 result = LinenumberingType5.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLinenumberingType5ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinenumberingType6 createLinenumberingType6FromString(EDataType eDataType, String initialValue) {
		LinenumberingType6 result = LinenumberingType6.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLinenumberingType6ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumerationType createNumerationTypeFromString(EDataType eDataType, String initialValue) {
		NumerationType result = NumerationType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNumerationTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrientType createOrientTypeFromString(EDataType eDataType, String initialValue) {
		OrientType result = OrientType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOrientTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrientType1 createOrientType1FromString(EDataType eDataType, String initialValue) {
		OrientType1 result = OrientType1.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOrientType1ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformanceType createPerformanceTypeFromString(EDataType eDataType, String initialValue) {
		PerformanceType result = PerformanceType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPerformanceTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformanceType1 createPerformanceType1FromString(EDataType eDataType, String initialValue) {
		PerformanceType1 result = PerformanceType1.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPerformanceType1ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformanceType2 createPerformanceType2FromString(EDataType eDataType, String initialValue) {
		PerformanceType2 result = PerformanceType2.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPerformanceType2ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PgwideType createPgwideTypeFromString(EDataType eDataType, String initialValue) {
		PgwideType result = PgwideType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPgwideTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PgwideType1 createPgwideType1FromString(EDataType eDataType, String initialValue) {
		PgwideType1 result = PgwideType1.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPgwideType1ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PgwideType2 createPgwideType2FromString(EDataType eDataType, String initialValue) {
		PgwideType2 result = PgwideType2.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPgwideType2ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PgwideType3 createPgwideType3FromString(EDataType eDataType, String initialValue) {
		PgwideType3 result = PgwideType3.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPgwideType3ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PgwideType4 createPgwideType4FromString(EDataType eDataType, String initialValue) {
		PgwideType4 result = PgwideType4.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPgwideType4ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PgwideType5 createPgwideType5FromString(EDataType eDataType, String initialValue) {
		PgwideType5 result = PgwideType5.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPgwideType5ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PubworkType createPubworkTypeFromString(EDataType eDataType, String initialValue) {
		PubworkType result = PubworkType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPubworkTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RenderasType createRenderasTypeFromString(EDataType eDataType, String initialValue) {
		RenderasType result = RenderasType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRenderasTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RepType createRepTypeFromString(EDataType eDataType, String initialValue) {
		RepType result = RepType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRepTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RepType1 createRepType1FromString(EDataType eDataType, String initialValue) {
		RepType1 result = RepType1.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRepType1ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RepType2 createRepType2FromString(EDataType eDataType, String initialValue) {
		RepType2 result = RepType2.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRepType2ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RevisionflagType createRevisionflagTypeFromString(EDataType eDataType, String initialValue) {
		RevisionflagType result = RevisionflagType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRevisionflagTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RotateType createRotateTypeFromString(EDataType eDataType, String initialValue) {
		RotateType result = RotateType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRotateTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RowheaderType createRowheaderTypeFromString(EDataType eDataType, String initialValue) {
		RowheaderType result = RowheaderType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRowheaderTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RowheaderType1 createRowheaderType1FromString(EDataType eDataType, String initialValue) {
		RowheaderType1 result = RowheaderType1.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRowheaderType1ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RowsepType createRowsepTypeFromString(EDataType eDataType, String initialValue) {
		RowsepType result = RowsepType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRowsepTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RowsepType1 createRowsepType1FromString(EDataType eDataType, String initialValue) {
		RowsepType1 result = RowsepType1.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRowsepType1ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RowsepType2 createRowsepType2FromString(EDataType eDataType, String initialValue) {
		RowsepType2 result = RowsepType2.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRowsepType2ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RowsepType3 createRowsepType3FromString(EDataType eDataType, String initialValue) {
		RowsepType3 result = RowsepType3.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRowsepType3ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RowsepType4 createRowsepType4FromString(EDataType eDataType, String initialValue) {
		RowsepType4 result = RowsepType4.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRowsepType4ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RowsepType5 createRowsepType5FromString(EDataType eDataType, String initialValue) {
		RowsepType5 result = RowsepType5.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRowsepType5ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RowsepType6 createRowsepType6FromString(EDataType eDataType, String initialValue) {
		RowsepType6 result = RowsepType6.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRowsepType6ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RowsepType7 createRowsepType7FromString(EDataType eDataType, String initialValue) {
		RowsepType7 result = RowsepType7.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRowsepType7ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RulesType createRulesTypeFromString(EDataType eDataType, String initialValue) {
		RulesType result = RulesType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRulesTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RulesType1 createRulesType1FromString(EDataType eDataType, String initialValue) {
		RulesType1 result = RulesType1.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRulesType1ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScalefitType createScalefitTypeFromString(EDataType eDataType, String initialValue) {
		ScalefitType result = ScalefitType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertScalefitTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScalefitType1 createScalefitType1FromString(EDataType eDataType, String initialValue) {
		ScalefitType1 result = ScalefitType1.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertScalefitType1ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScopeType createScopeTypeFromString(EDataType eDataType, String initialValue) {
		ScopeType result = ScopeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertScopeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScopeType1 createScopeType1FromString(EDataType eDataType, String initialValue) {
		ScopeType1 result = ScopeType1.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertScopeType1ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScopeType2 createScopeType2FromString(EDataType eDataType, String initialValue) {
		ScopeType2 result = ScopeType2.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertScopeType2ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShortentryType createShortentryTypeFromString(EDataType eDataType, String initialValue) {
		ShortentryType result = ShortentryType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertShortentryTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignificanceType createSignificanceTypeFromString(EDataType eDataType, String initialValue) {
		SignificanceType result = SignificanceType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSignificanceTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpacingType createSpacingTypeFromString(EDataType eDataType, String initialValue) {
		SpacingType result = SpacingType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSpacingTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpacingType1 createSpacingType1FromString(EDataType eDataType, String initialValue) {
		SpacingType1 result = SpacingType1.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSpacingType1ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpacingType2 createSpacingType2FromString(EDataType eDataType, String initialValue) {
		SpacingType2 result = SpacingType2.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSpacingType2ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpatialType createSpatialTypeFromString(EDataType eDataType, String initialValue) {
		SpatialType result = SpatialType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSpatialTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemporalType createTemporalTypeFromString(EDataType eDataType, String initialValue) {
		TemporalType result = TemporalType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTemporalTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TocentryType1 createTocentryType1FromString(EDataType eDataType, String initialValue) {
		TocentryType1 result = TocentryType1.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTocentryType1ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeType createTypeTypeFromString(EDataType eDataType, String initialValue) {
		TypeType result = TypeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeType1 createTypeType1FromString(EDataType eDataType, String initialValue) {
		TypeType1 result = TypeType1.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeType1ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitsType createUnitsTypeFromString(EDataType eDataType, String initialValue) {
		UnitsType result = UnitsType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUnitsTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitsType1 createUnitsType1FromString(EDataType eDataType, String initialValue) {
		UnitsType1 result = UnitsType1.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUnitsType1ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitsType2 createUnitsType2FromString(EDataType eDataType, String initialValue) {
		UnitsType2 result = UnitsType2.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUnitsType2ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValignType createValignTypeFromString(EDataType eDataType, String initialValue) {
		ValignType result = ValignType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertValignTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValignType1 createValignType1FromString(EDataType eDataType, String initialValue) {
		ValignType1 result = ValignType1.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertValignType1ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValignType2 createValignType2FromString(EDataType eDataType, String initialValue) {
		ValignType2 result = ValignType2.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertValignType2ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValignType3 createValignType3FromString(EDataType eDataType, String initialValue) {
		ValignType3 result = ValignType3.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertValignType3ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValignType4 createValignType4FromString(EDataType eDataType, String initialValue) {
		ValignType4 result = ValignType4.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertValignType4ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValignType5 createValignType5FromString(EDataType eDataType, String initialValue) {
		ValignType5 result = ValignType5.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertValignType5ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValignType6 createValignType6FromString(EDataType eDataType, String initialValue) {
		ValignType6 result = ValignType6.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertValignType6ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValignType7 createValignType7FromString(EDataType eDataType, String initialValue) {
		ValignType7 result = ValignType7.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertValignType7ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValignType8 createValignType8FromString(EDataType eDataType, String initialValue) {
		ValignType8 result = ValignType8.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertValignType8ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValignType9 createValignType9FromString(EDataType eDataType, String initialValue) {
		ValignType9 result = ValignType9.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertValignType9ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValignType10 createValignType10FromString(EDataType eDataType, String initialValue) {
		ValignType10 result = ValignType10.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertValignType10ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValignType11 createValignType11FromString(EDataType eDataType, String initialValue) {
		ValignType11 result = ValignType11.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertValignType11ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionType createActionTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createActionTypeFromString(DocbookPackage.eINSTANCE.getActionType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertActionTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertActionTypeToString(DocbookPackage.eINSTANCE.getActionType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionType1 createActionTypeObject1FromString(EDataType eDataType, String initialValue) {
		return createActionType1FromString(DocbookPackage.eINSTANCE.getActionType1(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertActionTypeObject1ToString(EDataType eDataType, Object instanceValue) {
		return convertActionType1ToString(DocbookPackage.eINSTANCE.getActionType1(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlignType9 createAlignTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createAlignType9FromString(DocbookPackage.eINSTANCE.getAlignType9(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAlignTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertAlignType9ToString(DocbookPackage.eINSTANCE.getAlignType9(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlignType3 createAlignTypeObject1FromString(EDataType eDataType, String initialValue) {
		return createAlignType3FromString(DocbookPackage.eINSTANCE.getAlignType3(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAlignTypeObject1ToString(EDataType eDataType, Object instanceValue) {
		return convertAlignType3ToString(DocbookPackage.eINSTANCE.getAlignType3(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlignType createAlignTypeObject2FromString(EDataType eDataType, String initialValue) {
		return createAlignTypeFromString(DocbookPackage.eINSTANCE.getAlignType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAlignTypeObject2ToString(EDataType eDataType, Object instanceValue) {
		return convertAlignTypeToString(DocbookPackage.eINSTANCE.getAlignType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlignType4 createAlignTypeObject3FromString(EDataType eDataType, String initialValue) {
		return createAlignType4FromString(DocbookPackage.eINSTANCE.getAlignType4(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAlignTypeObject3ToString(EDataType eDataType, Object instanceValue) {
		return convertAlignType4ToString(DocbookPackage.eINSTANCE.getAlignType4(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlignType2 createAlignTypeObject4FromString(EDataType eDataType, String initialValue) {
		return createAlignType2FromString(DocbookPackage.eINSTANCE.getAlignType2(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAlignTypeObject4ToString(EDataType eDataType, Object instanceValue) {
		return convertAlignType2ToString(DocbookPackage.eINSTANCE.getAlignType2(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlignType10 createAlignTypeObject5FromString(EDataType eDataType, String initialValue) {
		return createAlignType10FromString(DocbookPackage.eINSTANCE.getAlignType10(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAlignTypeObject5ToString(EDataType eDataType, Object instanceValue) {
		return convertAlignType10ToString(DocbookPackage.eINSTANCE.getAlignType10(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlignType5 createAlignTypeObject6FromString(EDataType eDataType, String initialValue) {
		return createAlignType5FromString(DocbookPackage.eINSTANCE.getAlignType5(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAlignTypeObject6ToString(EDataType eDataType, Object instanceValue) {
		return convertAlignType5ToString(DocbookPackage.eINSTANCE.getAlignType5(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlignType11 createAlignTypeObject7FromString(EDataType eDataType, String initialValue) {
		return createAlignType11FromString(DocbookPackage.eINSTANCE.getAlignType11(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAlignTypeObject7ToString(EDataType eDataType, Object instanceValue) {
		return convertAlignType11ToString(DocbookPackage.eINSTANCE.getAlignType11(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlignType6 createAlignTypeObject8FromString(EDataType eDataType, String initialValue) {
		return createAlignType6FromString(DocbookPackage.eINSTANCE.getAlignType6(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAlignTypeObject8ToString(EDataType eDataType, Object instanceValue) {
		return convertAlignType6ToString(DocbookPackage.eINSTANCE.getAlignType6(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlignType7 createAlignTypeObject9FromString(EDataType eDataType, String initialValue) {
		return createAlignType7FromString(DocbookPackage.eINSTANCE.getAlignType7(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAlignTypeObject9ToString(EDataType eDataType, Object instanceValue) {
		return convertAlignType7ToString(DocbookPackage.eINSTANCE.getAlignType7(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlignType13 createAlignTypeObject10FromString(EDataType eDataType, String initialValue) {
		return createAlignType13FromString(DocbookPackage.eINSTANCE.getAlignType13(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAlignTypeObject10ToString(EDataType eDataType, Object instanceValue) {
		return convertAlignType13ToString(DocbookPackage.eINSTANCE.getAlignType13(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlignType8 createAlignTypeObject11FromString(EDataType eDataType, String initialValue) {
		return createAlignType8FromString(DocbookPackage.eINSTANCE.getAlignType8(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAlignTypeObject11ToString(EDataType eDataType, Object instanceValue) {
		return convertAlignType8ToString(DocbookPackage.eINSTANCE.getAlignType8(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlignType12 createAlignTypeObject12FromString(EDataType eDataType, String initialValue) {
		return createAlignType12FromString(DocbookPackage.eINSTANCE.getAlignType12(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAlignTypeObject12ToString(EDataType eDataType, Object instanceValue) {
		return convertAlignType12ToString(DocbookPackage.eINSTANCE.getAlignType12(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlignType1 createAlignTypeObject13FromString(EDataType eDataType, String initialValue) {
		return createAlignType1FromString(DocbookPackage.eINSTANCE.getAlignType1(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAlignTypeObject13ToString(EDataType eDataType, Object instanceValue) {
		return convertAlignType1ToString(DocbookPackage.eINSTANCE.getAlignType1(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlignType14 createAlignTypeObject14FromString(EDataType eDataType, String initialValue) {
		return createAlignType14FromString(DocbookPackage.eINSTANCE.getAlignType14(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAlignTypeObject14ToString(EDataType eDataType, Object instanceValue) {
		return convertAlignType14ToString(DocbookPackage.eINSTANCE.getAlignType14(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChoiceType1 createChoiceTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createChoiceType1FromString(DocbookPackage.eINSTANCE.getChoiceType1(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertChoiceTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertChoiceType1ToString(DocbookPackage.eINSTANCE.getChoiceType1(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChoiceType createChoiceTypeObject1FromString(EDataType eDataType, String initialValue) {
		return createChoiceTypeFromString(DocbookPackage.eINSTANCE.getChoiceType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertChoiceTypeObject1ToString(EDataType eDataType, Object instanceValue) {
		return convertChoiceTypeToString(DocbookPackage.eINSTANCE.getChoiceType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChoiceType2 createChoiceTypeObject2FromString(EDataType eDataType, String initialValue) {
		return createChoiceType2FromString(DocbookPackage.eINSTANCE.getChoiceType2(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertChoiceTypeObject2ToString(EDataType eDataType, Object instanceValue) {
		return convertChoiceType2ToString(DocbookPackage.eINSTANCE.getChoiceType2(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChoiceType3 createChoiceTypeObject3FromString(EDataType eDataType, String initialValue) {
		return createChoiceType3FromString(DocbookPackage.eINSTANCE.getChoiceType3(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertChoiceTypeObject3ToString(EDataType eDataType, Object instanceValue) {
		return convertChoiceType3ToString(DocbookPackage.eINSTANCE.getChoiceType3(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassType1 createClassTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createClassType1FromString(DocbookPackage.eINSTANCE.getClassType1(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertClassTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertClassType1ToString(DocbookPackage.eINSTANCE.getClassType1(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassType4 createClassTypeObject1FromString(EDataType eDataType, String initialValue) {
		return createClassType4FromString(DocbookPackage.eINSTANCE.getClassType4(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertClassTypeObject1ToString(EDataType eDataType, Object instanceValue) {
		return convertClassType4ToString(DocbookPackage.eINSTANCE.getClassType4(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassType8 createClassTypeObject2FromString(EDataType eDataType, String initialValue) {
		return createClassType8FromString(DocbookPackage.eINSTANCE.getClassType8(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertClassTypeObject2ToString(EDataType eDataType, Object instanceValue) {
		return convertClassType8ToString(DocbookPackage.eINSTANCE.getClassType8(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassType6 createClassTypeObject3FromString(EDataType eDataType, String initialValue) {
		return createClassType6FromString(DocbookPackage.eINSTANCE.getClassType6(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertClassTypeObject3ToString(EDataType eDataType, Object instanceValue) {
		return convertClassType6ToString(DocbookPackage.eINSTANCE.getClassType6(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassType12 createClassTypeObject4FromString(EDataType eDataType, String initialValue) {
		return createClassType12FromString(DocbookPackage.eINSTANCE.getClassType12(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertClassTypeObject4ToString(EDataType eDataType, Object instanceValue) {
		return convertClassType12ToString(DocbookPackage.eINSTANCE.getClassType12(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassType11 createClassTypeObject5FromString(EDataType eDataType, String initialValue) {
		return createClassType11FromString(DocbookPackage.eINSTANCE.getClassType11(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertClassTypeObject5ToString(EDataType eDataType, Object instanceValue) {
		return convertClassType11ToString(DocbookPackage.eINSTANCE.getClassType11(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassType9 createClassTypeObject6FromString(EDataType eDataType, String initialValue) {
		return createClassType9FromString(DocbookPackage.eINSTANCE.getClassType9(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertClassTypeObject6ToString(EDataType eDataType, Object instanceValue) {
		return convertClassType9ToString(DocbookPackage.eINSTANCE.getClassType9(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassType7 createClassTypeObject7FromString(EDataType eDataType, String initialValue) {
		return createClassType7FromString(DocbookPackage.eINSTANCE.getClassType7(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertClassTypeObject7ToString(EDataType eDataType, Object instanceValue) {
		return convertClassType7ToString(DocbookPackage.eINSTANCE.getClassType7(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassType3 createClassTypeObject8FromString(EDataType eDataType, String initialValue) {
		return createClassType3FromString(DocbookPackage.eINSTANCE.getClassType3(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertClassTypeObject8ToString(EDataType eDataType, Object instanceValue) {
		return convertClassType3ToString(DocbookPackage.eINSTANCE.getClassType3(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassType13 createClassTypeObject9FromString(EDataType eDataType, String initialValue) {
		return createClassType13FromString(DocbookPackage.eINSTANCE.getClassType13(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertClassTypeObject9ToString(EDataType eDataType, Object instanceValue) {
		return convertClassType13ToString(DocbookPackage.eINSTANCE.getClassType13(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassType10 createClassTypeObject10FromString(EDataType eDataType, String initialValue) {
		return createClassType10FromString(DocbookPackage.eINSTANCE.getClassType10(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertClassTypeObject10ToString(EDataType eDataType, Object instanceValue) {
		return convertClassType10ToString(DocbookPackage.eINSTANCE.getClassType10(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassType17 createClassTypeObject11FromString(EDataType eDataType, String initialValue) {
		return createClassType17FromString(DocbookPackage.eINSTANCE.getClassType17(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertClassTypeObject11ToString(EDataType eDataType, Object instanceValue) {
		return convertClassType17ToString(DocbookPackage.eINSTANCE.getClassType17(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassType5 createClassTypeObject12FromString(EDataType eDataType, String initialValue) {
		return createClassType5FromString(DocbookPackage.eINSTANCE.getClassType5(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertClassTypeObject12ToString(EDataType eDataType, Object instanceValue) {
		return convertClassType5ToString(DocbookPackage.eINSTANCE.getClassType5(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassType15 createClassTypeObject13FromString(EDataType eDataType, String initialValue) {
		return createClassType15FromString(DocbookPackage.eINSTANCE.getClassType15(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertClassTypeObject13ToString(EDataType eDataType, Object instanceValue) {
		return convertClassType15ToString(DocbookPackage.eINSTANCE.getClassType15(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassType16 createClassTypeObject14FromString(EDataType eDataType, String initialValue) {
		return createClassType16FromString(DocbookPackage.eINSTANCE.getClassType16(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertClassTypeObject14ToString(EDataType eDataType, Object instanceValue) {
		return convertClassType16ToString(DocbookPackage.eINSTANCE.getClassType16(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassType createClassTypeObject15FromString(EDataType eDataType, String initialValue) {
		return createClassTypeFromString(DocbookPackage.eINSTANCE.getClassType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertClassTypeObject15ToString(EDataType eDataType, Object instanceValue) {
		return convertClassTypeToString(DocbookPackage.eINSTANCE.getClassType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassType19 createClassTypeObject16FromString(EDataType eDataType, String initialValue) {
		return createClassType19FromString(DocbookPackage.eINSTANCE.getClassType19(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertClassTypeObject16ToString(EDataType eDataType, Object instanceValue) {
		return convertClassType19ToString(DocbookPackage.eINSTANCE.getClassType19(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassType2 createClassTypeObject17FromString(EDataType eDataType, String initialValue) {
		return createClassType2FromString(DocbookPackage.eINSTANCE.getClassType2(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertClassTypeObject17ToString(EDataType eDataType, Object instanceValue) {
		return convertClassType2ToString(DocbookPackage.eINSTANCE.getClassType2(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassType18 createClassTypeObject18FromString(EDataType eDataType, String initialValue) {
		return createClassType18FromString(DocbookPackage.eINSTANCE.getClassType18(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertClassTypeObject18ToString(EDataType eDataType, Object instanceValue) {
		return convertClassType18ToString(DocbookPackage.eINSTANCE.getClassType18(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassType14 createClassTypeObject19FromString(EDataType eDataType, String initialValue) {
		return createClassType14FromString(DocbookPackage.eINSTANCE.getClassType14(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertClassTypeObject19ToString(EDataType eDataType, Object instanceValue) {
		return convertClassType14ToString(DocbookPackage.eINSTANCE.getClassType14(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassType20 createClassTypeObject20FromString(EDataType eDataType, String initialValue) {
		return createClassType20FromString(DocbookPackage.eINSTANCE.getClassType20(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertClassTypeObject20ToString(EDataType eDataType, Object instanceValue) {
		return convertClassType20ToString(DocbookPackage.eINSTANCE.getClassType20(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassType21 createClassTypeObject21FromString(EDataType eDataType, String initialValue) {
		return createClassType21FromString(DocbookPackage.eINSTANCE.getClassType21(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertClassTypeObject21ToString(EDataType eDataType, Object instanceValue) {
		return convertClassType21ToString(DocbookPackage.eINSTANCE.getClassType21(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColsepType3 createColsepTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createColsepType3FromString(DocbookPackage.eINSTANCE.getColsepType3(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertColsepTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertColsepType3ToString(DocbookPackage.eINSTANCE.getColsepType3(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColsepType2 createColsepTypeObject1FromString(EDataType eDataType, String initialValue) {
		return createColsepType2FromString(DocbookPackage.eINSTANCE.getColsepType2(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertColsepTypeObject1ToString(EDataType eDataType, Object instanceValue) {
		return convertColsepType2ToString(DocbookPackage.eINSTANCE.getColsepType2(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColsepType5 createColsepTypeObject2FromString(EDataType eDataType, String initialValue) {
		return createColsepType5FromString(DocbookPackage.eINSTANCE.getColsepType5(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertColsepTypeObject2ToString(EDataType eDataType, Object instanceValue) {
		return convertColsepType5ToString(DocbookPackage.eINSTANCE.getColsepType5(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColsepType1 createColsepTypeObject3FromString(EDataType eDataType, String initialValue) {
		return createColsepType1FromString(DocbookPackage.eINSTANCE.getColsepType1(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertColsepTypeObject3ToString(EDataType eDataType, Object instanceValue) {
		return convertColsepType1ToString(DocbookPackage.eINSTANCE.getColsepType1(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColsepType createColsepTypeObject4FromString(EDataType eDataType, String initialValue) {
		return createColsepTypeFromString(DocbookPackage.eINSTANCE.getColsepType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertColsepTypeObject4ToString(EDataType eDataType, Object instanceValue) {
		return convertColsepTypeToString(DocbookPackage.eINSTANCE.getColsepType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColsepType4 createColsepTypeObject5FromString(EDataType eDataType, String initialValue) {
		return createColsepType4FromString(DocbookPackage.eINSTANCE.getColsepType4(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertColsepTypeObject5ToString(EDataType eDataType, Object instanceValue) {
		return convertColsepType4ToString(DocbookPackage.eINSTANCE.getColsepType4(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColsepType6 createColsepTypeObject6FromString(EDataType eDataType, String initialValue) {
		return createColsepType6FromString(DocbookPackage.eINSTANCE.getColsepType6(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertColsepTypeObject6ToString(EDataType eDataType, Object instanceValue) {
		return convertColsepType6ToString(DocbookPackage.eINSTANCE.getColsepType6(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContinuationType3 createContinuationTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createContinuationType3FromString(DocbookPackage.eINSTANCE.getContinuationType3(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertContinuationTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertContinuationType3ToString(DocbookPackage.eINSTANCE.getContinuationType3(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContinuationType2 createContinuationTypeObject1FromString(EDataType eDataType, String initialValue) {
		return createContinuationType2FromString(DocbookPackage.eINSTANCE.getContinuationType2(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertContinuationTypeObject1ToString(EDataType eDataType, Object instanceValue) {
		return convertContinuationType2ToString(DocbookPackage.eINSTANCE.getContinuationType2(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContinuationType6 createContinuationTypeObject2FromString(EDataType eDataType, String initialValue) {
		return createContinuationType6FromString(DocbookPackage.eINSTANCE.getContinuationType6(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertContinuationTypeObject2ToString(EDataType eDataType, Object instanceValue) {
		return convertContinuationType6ToString(DocbookPackage.eINSTANCE.getContinuationType6(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContinuationType createContinuationTypeObject3FromString(EDataType eDataType, String initialValue) {
		return createContinuationTypeFromString(DocbookPackage.eINSTANCE.getContinuationType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertContinuationTypeObject3ToString(EDataType eDataType, Object instanceValue) {
		return convertContinuationTypeToString(DocbookPackage.eINSTANCE.getContinuationType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContinuationType1 createContinuationTypeObject4FromString(EDataType eDataType, String initialValue) {
		return createContinuationType1FromString(DocbookPackage.eINSTANCE.getContinuationType1(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertContinuationTypeObject4ToString(EDataType eDataType, Object instanceValue) {
		return convertContinuationType1ToString(DocbookPackage.eINSTANCE.getContinuationType1(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContinuationType4 createContinuationTypeObject5FromString(EDataType eDataType, String initialValue) {
		return createContinuationType4FromString(DocbookPackage.eINSTANCE.getContinuationType4(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertContinuationTypeObject5ToString(EDataType eDataType, Object instanceValue) {
		return convertContinuationType4ToString(DocbookPackage.eINSTANCE.getContinuationType4(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContinuationType5 createContinuationTypeObject6FromString(EDataType eDataType, String initialValue) {
		return createContinuationType5FromString(DocbookPackage.eINSTANCE.getContinuationType5(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertContinuationTypeObject6ToString(EDataType eDataType, Object instanceValue) {
		return convertContinuationType5ToString(DocbookPackage.eINSTANCE.getContinuationType5(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContinuationType7 createContinuationTypeObject7FromString(EDataType eDataType, String initialValue) {
		return createContinuationType7FromString(DocbookPackage.eINSTANCE.getContinuationType7(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertContinuationTypeObject7ToString(EDataType eDataType, Object instanceValue) {
		return convertContinuationType7ToString(DocbookPackage.eINSTANCE.getContinuationType7(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefaultlabelType createDefaultlabelTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createDefaultlabelTypeFromString(DocbookPackage.eINSTANCE.getDefaultlabelType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDefaultlabelTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDefaultlabelTypeToString(DocbookPackage.eINSTANCE.getDefaultlabelType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DirType createDirTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createDirTypeFromString(DocbookPackage.eINSTANCE.getDirType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDirTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDirTypeToString(DocbookPackage.eINSTANCE.getDirType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FrameType createFrameTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createFrameTypeFromString(DocbookPackage.eINSTANCE.getFrameType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFrameTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertFrameTypeToString(DocbookPackage.eINSTANCE.getFrameType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FrameType1 createFrameTypeObject1FromString(EDataType eDataType, String initialValue) {
		return createFrameType1FromString(DocbookPackage.eINSTANCE.getFrameType1(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFrameTypeObject1ToString(EDataType eDataType, Object instanceValue) {
		return convertFrameType1ToString(DocbookPackage.eINSTANCE.getFrameType1(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionType createFunctionTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createFunctionTypeFromString(DocbookPackage.eINSTANCE.getFunctionType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFunctionTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertFunctionTypeToString(DocbookPackage.eINSTANCE.getFunctionType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InheritnumType createInheritnumTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createInheritnumTypeFromString(DocbookPackage.eINSTANCE.getInheritnumType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInheritnumTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertInheritnumTypeToString(DocbookPackage.eINSTANCE.getInheritnumType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinenumberingType2 createLinenumberingTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createLinenumberingType2FromString(DocbookPackage.eINSTANCE.getLinenumberingType2(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLinenumberingTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertLinenumberingType2ToString(DocbookPackage.eINSTANCE.getLinenumberingType2(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinenumberingType createLinenumberingTypeObject1FromString(EDataType eDataType, String initialValue) {
		return createLinenumberingTypeFromString(DocbookPackage.eINSTANCE.getLinenumberingType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLinenumberingTypeObject1ToString(EDataType eDataType, Object instanceValue) {
		return convertLinenumberingTypeToString(DocbookPackage.eINSTANCE.getLinenumberingType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinenumberingType3 createLinenumberingTypeObject2FromString(EDataType eDataType, String initialValue) {
		return createLinenumberingType3FromString(DocbookPackage.eINSTANCE.getLinenumberingType3(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLinenumberingTypeObject2ToString(EDataType eDataType, Object instanceValue) {
		return convertLinenumberingType3ToString(DocbookPackage.eINSTANCE.getLinenumberingType3(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinenumberingType4 createLinenumberingTypeObject3FromString(EDataType eDataType, String initialValue) {
		return createLinenumberingType4FromString(DocbookPackage.eINSTANCE.getLinenumberingType4(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLinenumberingTypeObject3ToString(EDataType eDataType, Object instanceValue) {
		return convertLinenumberingType4ToString(DocbookPackage.eINSTANCE.getLinenumberingType4(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinenumberingType1 createLinenumberingTypeObject4FromString(EDataType eDataType, String initialValue) {
		return createLinenumberingType1FromString(DocbookPackage.eINSTANCE.getLinenumberingType1(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLinenumberingTypeObject4ToString(EDataType eDataType, Object instanceValue) {
		return convertLinenumberingType1ToString(DocbookPackage.eINSTANCE.getLinenumberingType1(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinenumberingType5 createLinenumberingTypeObject5FromString(EDataType eDataType, String initialValue) {
		return createLinenumberingType5FromString(DocbookPackage.eINSTANCE.getLinenumberingType5(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLinenumberingTypeObject5ToString(EDataType eDataType, Object instanceValue) {
		return convertLinenumberingType5ToString(DocbookPackage.eINSTANCE.getLinenumberingType5(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinenumberingType6 createLinenumberingTypeObject6FromString(EDataType eDataType, String initialValue) {
		return createLinenumberingType6FromString(DocbookPackage.eINSTANCE.getLinenumberingType6(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLinenumberingTypeObject6ToString(EDataType eDataType, Object instanceValue) {
		return convertLinenumberingType6ToString(DocbookPackage.eINSTANCE.getLinenumberingType6(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumerationType createNumerationTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createNumerationTypeFromString(DocbookPackage.eINSTANCE.getNumerationType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNumerationTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertNumerationTypeToString(DocbookPackage.eINSTANCE.getNumerationType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrientType createOrientTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createOrientTypeFromString(DocbookPackage.eINSTANCE.getOrientType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOrientTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertOrientTypeToString(DocbookPackage.eINSTANCE.getOrientType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrientType1 createOrientTypeObject1FromString(EDataType eDataType, String initialValue) {
		return createOrientType1FromString(DocbookPackage.eINSTANCE.getOrientType1(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOrientTypeObject1ToString(EDataType eDataType, Object instanceValue) {
		return convertOrientType1ToString(DocbookPackage.eINSTANCE.getOrientType1(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformanceType1 createPerformanceTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createPerformanceType1FromString(DocbookPackage.eINSTANCE.getPerformanceType1(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPerformanceTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertPerformanceType1ToString(DocbookPackage.eINSTANCE.getPerformanceType1(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformanceType createPerformanceTypeObject1FromString(EDataType eDataType, String initialValue) {
		return createPerformanceTypeFromString(DocbookPackage.eINSTANCE.getPerformanceType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPerformanceTypeObject1ToString(EDataType eDataType, Object instanceValue) {
		return convertPerformanceTypeToString(DocbookPackage.eINSTANCE.getPerformanceType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformanceType2 createPerformanceTypeObject2FromString(EDataType eDataType, String initialValue) {
		return createPerformanceType2FromString(DocbookPackage.eINSTANCE.getPerformanceType2(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPerformanceTypeObject2ToString(EDataType eDataType, Object instanceValue) {
		return convertPerformanceType2ToString(DocbookPackage.eINSTANCE.getPerformanceType2(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PgwideType createPgwideTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createPgwideTypeFromString(DocbookPackage.eINSTANCE.getPgwideType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPgwideTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertPgwideTypeToString(DocbookPackage.eINSTANCE.getPgwideType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PgwideType2 createPgwideTypeObject1FromString(EDataType eDataType, String initialValue) {
		return createPgwideType2FromString(DocbookPackage.eINSTANCE.getPgwideType2(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPgwideTypeObject1ToString(EDataType eDataType, Object instanceValue) {
		return convertPgwideType2ToString(DocbookPackage.eINSTANCE.getPgwideType2(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PgwideType1 createPgwideTypeObject2FromString(EDataType eDataType, String initialValue) {
		return createPgwideType1FromString(DocbookPackage.eINSTANCE.getPgwideType1(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPgwideTypeObject2ToString(EDataType eDataType, Object instanceValue) {
		return convertPgwideType1ToString(DocbookPackage.eINSTANCE.getPgwideType1(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PgwideType3 createPgwideTypeObject3FromString(EDataType eDataType, String initialValue) {
		return createPgwideType3FromString(DocbookPackage.eINSTANCE.getPgwideType3(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPgwideTypeObject3ToString(EDataType eDataType, Object instanceValue) {
		return convertPgwideType3ToString(DocbookPackage.eINSTANCE.getPgwideType3(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PgwideType4 createPgwideTypeObject4FromString(EDataType eDataType, String initialValue) {
		return createPgwideType4FromString(DocbookPackage.eINSTANCE.getPgwideType4(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPgwideTypeObject4ToString(EDataType eDataType, Object instanceValue) {
		return convertPgwideType4ToString(DocbookPackage.eINSTANCE.getPgwideType4(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PgwideType5 createPgwideTypeObject5FromString(EDataType eDataType, String initialValue) {
		return createPgwideType5FromString(DocbookPackage.eINSTANCE.getPgwideType5(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPgwideTypeObject5ToString(EDataType eDataType, Object instanceValue) {
		return convertPgwideType5ToString(DocbookPackage.eINSTANCE.getPgwideType5(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PubworkType createPubworkTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createPubworkTypeFromString(DocbookPackage.eINSTANCE.getPubworkType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPubworkTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertPubworkTypeToString(DocbookPackage.eINSTANCE.getPubworkType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RenderasType createRenderasTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createRenderasTypeFromString(DocbookPackage.eINSTANCE.getRenderasType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRenderasTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertRenderasTypeToString(DocbookPackage.eINSTANCE.getRenderasType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RepType createRepTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createRepTypeFromString(DocbookPackage.eINSTANCE.getRepType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRepTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertRepTypeToString(DocbookPackage.eINSTANCE.getRepType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RepType1 createRepTypeObject1FromString(EDataType eDataType, String initialValue) {
		return createRepType1FromString(DocbookPackage.eINSTANCE.getRepType1(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRepTypeObject1ToString(EDataType eDataType, Object instanceValue) {
		return convertRepType1ToString(DocbookPackage.eINSTANCE.getRepType1(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RepType2 createRepTypeObject2FromString(EDataType eDataType, String initialValue) {
		return createRepType2FromString(DocbookPackage.eINSTANCE.getRepType2(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRepTypeObject2ToString(EDataType eDataType, Object instanceValue) {
		return convertRepType2ToString(DocbookPackage.eINSTANCE.getRepType2(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RevisionflagType createRevisionflagTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createRevisionflagTypeFromString(DocbookPackage.eINSTANCE.getRevisionflagType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRevisionflagTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertRevisionflagTypeToString(DocbookPackage.eINSTANCE.getRevisionflagType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RotateType createRotateTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createRotateTypeFromString(DocbookPackage.eINSTANCE.getRotateType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRotateTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertRotateTypeToString(DocbookPackage.eINSTANCE.getRotateType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RowheaderType createRowheaderTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createRowheaderTypeFromString(DocbookPackage.eINSTANCE.getRowheaderType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRowheaderTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertRowheaderTypeToString(DocbookPackage.eINSTANCE.getRowheaderType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RowheaderType1 createRowheaderTypeObject1FromString(EDataType eDataType, String initialValue) {
		return createRowheaderType1FromString(DocbookPackage.eINSTANCE.getRowheaderType1(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRowheaderTypeObject1ToString(EDataType eDataType, Object instanceValue) {
		return convertRowheaderType1ToString(DocbookPackage.eINSTANCE.getRowheaderType1(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RowsepType createRowsepTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createRowsepTypeFromString(DocbookPackage.eINSTANCE.getRowsepType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRowsepTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertRowsepTypeToString(DocbookPackage.eINSTANCE.getRowsepType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RowsepType2 createRowsepTypeObject1FromString(EDataType eDataType, String initialValue) {
		return createRowsepType2FromString(DocbookPackage.eINSTANCE.getRowsepType2(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRowsepTypeObject1ToString(EDataType eDataType, Object instanceValue) {
		return convertRowsepType2ToString(DocbookPackage.eINSTANCE.getRowsepType2(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RowsepType3 createRowsepTypeObject2FromString(EDataType eDataType, String initialValue) {
		return createRowsepType3FromString(DocbookPackage.eINSTANCE.getRowsepType3(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRowsepTypeObject2ToString(EDataType eDataType, Object instanceValue) {
		return convertRowsepType3ToString(DocbookPackage.eINSTANCE.getRowsepType3(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RowsepType1 createRowsepTypeObject3FromString(EDataType eDataType, String initialValue) {
		return createRowsepType1FromString(DocbookPackage.eINSTANCE.getRowsepType1(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRowsepTypeObject3ToString(EDataType eDataType, Object instanceValue) {
		return convertRowsepType1ToString(DocbookPackage.eINSTANCE.getRowsepType1(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RowsepType6 createRowsepTypeObject4FromString(EDataType eDataType, String initialValue) {
		return createRowsepType6FromString(DocbookPackage.eINSTANCE.getRowsepType6(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRowsepTypeObject4ToString(EDataType eDataType, Object instanceValue) {
		return convertRowsepType6ToString(DocbookPackage.eINSTANCE.getRowsepType6(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RowsepType5 createRowsepTypeObject5FromString(EDataType eDataType, String initialValue) {
		return createRowsepType5FromString(DocbookPackage.eINSTANCE.getRowsepType5(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRowsepTypeObject5ToString(EDataType eDataType, Object instanceValue) {
		return convertRowsepType5ToString(DocbookPackage.eINSTANCE.getRowsepType5(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RowsepType4 createRowsepTypeObject6FromString(EDataType eDataType, String initialValue) {
		return createRowsepType4FromString(DocbookPackage.eINSTANCE.getRowsepType4(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRowsepTypeObject6ToString(EDataType eDataType, Object instanceValue) {
		return convertRowsepType4ToString(DocbookPackage.eINSTANCE.getRowsepType4(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RowsepType7 createRowsepTypeObject7FromString(EDataType eDataType, String initialValue) {
		return createRowsepType7FromString(DocbookPackage.eINSTANCE.getRowsepType7(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRowsepTypeObject7ToString(EDataType eDataType, Object instanceValue) {
		return convertRowsepType7ToString(DocbookPackage.eINSTANCE.getRowsepType7(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RulesType createRulesTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createRulesTypeFromString(DocbookPackage.eINSTANCE.getRulesType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRulesTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertRulesTypeToString(DocbookPackage.eINSTANCE.getRulesType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RulesType1 createRulesTypeObject1FromString(EDataType eDataType, String initialValue) {
		return createRulesType1FromString(DocbookPackage.eINSTANCE.getRulesType1(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRulesTypeObject1ToString(EDataType eDataType, Object instanceValue) {
		return convertRulesType1ToString(DocbookPackage.eINSTANCE.getRulesType1(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScalefitType createScalefitTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createScalefitTypeFromString(DocbookPackage.eINSTANCE.getScalefitType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertScalefitTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertScalefitTypeToString(DocbookPackage.eINSTANCE.getScalefitType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScalefitType1 createScalefitTypeObject1FromString(EDataType eDataType, String initialValue) {
		return createScalefitType1FromString(DocbookPackage.eINSTANCE.getScalefitType1(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertScalefitTypeObject1ToString(EDataType eDataType, Object instanceValue) {
		return convertScalefitType1ToString(DocbookPackage.eINSTANCE.getScalefitType1(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScopeType createScopeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createScopeTypeFromString(DocbookPackage.eINSTANCE.getScopeType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertScopeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertScopeTypeToString(DocbookPackage.eINSTANCE.getScopeType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScopeType1 createScopeTypeObject1FromString(EDataType eDataType, String initialValue) {
		return createScopeType1FromString(DocbookPackage.eINSTANCE.getScopeType1(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertScopeTypeObject1ToString(EDataType eDataType, Object instanceValue) {
		return convertScopeType1ToString(DocbookPackage.eINSTANCE.getScopeType1(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScopeType2 createScopeTypeObject2FromString(EDataType eDataType, String initialValue) {
		return createScopeType2FromString(DocbookPackage.eINSTANCE.getScopeType2(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertScopeTypeObject2ToString(EDataType eDataType, Object instanceValue) {
		return convertScopeType2ToString(DocbookPackage.eINSTANCE.getScopeType2(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShortentryType createShortentryTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createShortentryTypeFromString(DocbookPackage.eINSTANCE.getShortentryType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertShortentryTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertShortentryTypeToString(DocbookPackage.eINSTANCE.getShortentryType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignificanceType createSignificanceTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createSignificanceTypeFromString(DocbookPackage.eINSTANCE.getSignificanceType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSignificanceTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSignificanceTypeToString(DocbookPackage.eINSTANCE.getSignificanceType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpacingType createSpacingTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createSpacingTypeFromString(DocbookPackage.eINSTANCE.getSpacingType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSpacingTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSpacingTypeToString(DocbookPackage.eINSTANCE.getSpacingType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpacingType1 createSpacingTypeObject1FromString(EDataType eDataType, String initialValue) {
		return createSpacingType1FromString(DocbookPackage.eINSTANCE.getSpacingType1(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSpacingTypeObject1ToString(EDataType eDataType, Object instanceValue) {
		return convertSpacingType1ToString(DocbookPackage.eINSTANCE.getSpacingType1(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpacingType2 createSpacingTypeObject2FromString(EDataType eDataType, String initialValue) {
		return createSpacingType2FromString(DocbookPackage.eINSTANCE.getSpacingType2(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSpacingTypeObject2ToString(EDataType eDataType, Object instanceValue) {
		return convertSpacingType2ToString(DocbookPackage.eINSTANCE.getSpacingType2(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpatialType createSpatialTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createSpatialTypeFromString(DocbookPackage.eINSTANCE.getSpatialType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSpatialTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSpatialTypeToString(DocbookPackage.eINSTANCE.getSpatialType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemporalType createTemporalTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createTemporalTypeFromString(DocbookPackage.eINSTANCE.getTemporalType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTemporalTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTemporalTypeToString(DocbookPackage.eINSTANCE.getTemporalType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TocentryType1 createTocentryTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createTocentryType1FromString(DocbookPackage.eINSTANCE.getTocentryType1(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTocentryTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTocentryType1ToString(DocbookPackage.eINSTANCE.getTocentryType1(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeType1 createTypeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createTypeType1FromString(DocbookPackage.eINSTANCE.getTypeType1(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTypeType1ToString(DocbookPackage.eINSTANCE.getTypeType1(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeType createTypeTypeObject1FromString(EDataType eDataType, String initialValue) {
		return createTypeTypeFromString(DocbookPackage.eINSTANCE.getTypeType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeTypeObject1ToString(EDataType eDataType, Object instanceValue) {
		return convertTypeTypeToString(DocbookPackage.eINSTANCE.getTypeType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitsType createUnitsTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createUnitsTypeFromString(DocbookPackage.eINSTANCE.getUnitsType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUnitsTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertUnitsTypeToString(DocbookPackage.eINSTANCE.getUnitsType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitsType1 createUnitsTypeObject1FromString(EDataType eDataType, String initialValue) {
		return createUnitsType1FromString(DocbookPackage.eINSTANCE.getUnitsType1(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUnitsTypeObject1ToString(EDataType eDataType, Object instanceValue) {
		return convertUnitsType1ToString(DocbookPackage.eINSTANCE.getUnitsType1(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitsType2 createUnitsTypeObject2FromString(EDataType eDataType, String initialValue) {
		return createUnitsType2FromString(DocbookPackage.eINSTANCE.getUnitsType2(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUnitsTypeObject2ToString(EDataType eDataType, Object instanceValue) {
		return convertUnitsType2ToString(DocbookPackage.eINSTANCE.getUnitsType2(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValignType3 createValignTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createValignType3FromString(DocbookPackage.eINSTANCE.getValignType3(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertValignTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertValignType3ToString(DocbookPackage.eINSTANCE.getValignType3(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValignType createValignTypeObject1FromString(EDataType eDataType, String initialValue) {
		return createValignTypeFromString(DocbookPackage.eINSTANCE.getValignType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertValignTypeObject1ToString(EDataType eDataType, Object instanceValue) {
		return convertValignTypeToString(DocbookPackage.eINSTANCE.getValignType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValignType5 createValignTypeObject2FromString(EDataType eDataType, String initialValue) {
		return createValignType5FromString(DocbookPackage.eINSTANCE.getValignType5(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertValignTypeObject2ToString(EDataType eDataType, Object instanceValue) {
		return convertValignType5ToString(DocbookPackage.eINSTANCE.getValignType5(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValignType7 createValignTypeObject3FromString(EDataType eDataType, String initialValue) {
		return createValignType7FromString(DocbookPackage.eINSTANCE.getValignType7(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertValignTypeObject3ToString(EDataType eDataType, Object instanceValue) {
		return convertValignType7ToString(DocbookPackage.eINSTANCE.getValignType7(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValignType8 createValignTypeObject4FromString(EDataType eDataType, String initialValue) {
		return createValignType8FromString(DocbookPackage.eINSTANCE.getValignType8(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertValignTypeObject4ToString(EDataType eDataType, Object instanceValue) {
		return convertValignType8ToString(DocbookPackage.eINSTANCE.getValignType8(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValignType2 createValignTypeObject5FromString(EDataType eDataType, String initialValue) {
		return createValignType2FromString(DocbookPackage.eINSTANCE.getValignType2(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertValignTypeObject5ToString(EDataType eDataType, Object instanceValue) {
		return convertValignType2ToString(DocbookPackage.eINSTANCE.getValignType2(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValignType4 createValignTypeObject6FromString(EDataType eDataType, String initialValue) {
		return createValignType4FromString(DocbookPackage.eINSTANCE.getValignType4(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertValignTypeObject6ToString(EDataType eDataType, Object instanceValue) {
		return convertValignType4ToString(DocbookPackage.eINSTANCE.getValignType4(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValignType1 createValignTypeObject7FromString(EDataType eDataType, String initialValue) {
		return createValignType1FromString(DocbookPackage.eINSTANCE.getValignType1(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertValignTypeObject7ToString(EDataType eDataType, Object instanceValue) {
		return convertValignType1ToString(DocbookPackage.eINSTANCE.getValignType1(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValignType9 createValignTypeObject8FromString(EDataType eDataType, String initialValue) {
		return createValignType9FromString(DocbookPackage.eINSTANCE.getValignType9(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertValignTypeObject8ToString(EDataType eDataType, Object instanceValue) {
		return convertValignType9ToString(DocbookPackage.eINSTANCE.getValignType9(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValignType10 createValignTypeObject9FromString(EDataType eDataType, String initialValue) {
		return createValignType10FromString(DocbookPackage.eINSTANCE.getValignType10(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertValignTypeObject9ToString(EDataType eDataType, Object instanceValue) {
		return convertValignType10ToString(DocbookPackage.eINSTANCE.getValignType10(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValignType6 createValignTypeObject10FromString(EDataType eDataType, String initialValue) {
		return createValignType6FromString(DocbookPackage.eINSTANCE.getValignType6(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertValignTypeObject10ToString(EDataType eDataType, Object instanceValue) {
		return convertValignType6ToString(DocbookPackage.eINSTANCE.getValignType6(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValignType11 createValignTypeObject11FromString(EDataType eDataType, String initialValue) {
		return createValignType11FromString(DocbookPackage.eINSTANCE.getValignType11(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertValignTypeObject11ToString(EDataType eDataType, Object instanceValue) {
		return convertValignType11ToString(DocbookPackage.eINSTANCE.getValignType11(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DocbookPackage getDocbookPackage() {
		return (DocbookPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DocbookPackage getPackage() {
		return DocbookPackage.eINSTANCE;
	}

} //DocbookFactoryImpl
