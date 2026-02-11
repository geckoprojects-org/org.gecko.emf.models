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
package org.docbook.ns.docbook.util;

import org.docbook.ns.docbook.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.docbook.ns.docbook.DocbookPackage
 * @generated
 */
public class DocbookAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DocbookPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocbookAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = DocbookPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocbookSwitch<Adapter> modelSwitch =
		new DocbookSwitch<Adapter>() {
			@Override
			public Adapter caseAbbrevType(AbbrevType object) {
				return createAbbrevTypeAdapter();
			}
			@Override
			public Adapter caseAbstractType(AbstractType object) {
				return createAbstractTypeAdapter();
			}
			@Override
			public Adapter caseAccelType(AccelType object) {
				return createAccelTypeAdapter();
			}
			@Override
			public Adapter caseAcknowledgementsType(AcknowledgementsType object) {
				return createAcknowledgementsTypeAdapter();
			}
			@Override
			public Adapter caseAcronymType(AcronymType object) {
				return createAcronymTypeAdapter();
			}
			@Override
			public Adapter caseAddressType(AddressType object) {
				return createAddressTypeAdapter();
			}
			@Override
			public Adapter caseAffiliationType(AffiliationType object) {
				return createAffiliationTypeAdapter();
			}
			@Override
			public Adapter caseAltType(AltType object) {
				return createAltTypeAdapter();
			}
			@Override
			public Adapter caseAnchorType(AnchorType object) {
				return createAnchorTypeAdapter();
			}
			@Override
			public Adapter caseAnnotationType(AnnotationType object) {
				return createAnnotationTypeAdapter();
			}
			@Override
			public Adapter caseAnswerType(AnswerType object) {
				return createAnswerTypeAdapter();
			}
			@Override
			public Adapter caseAppendixType(AppendixType object) {
				return createAppendixTypeAdapter();
			}
			@Override
			public Adapter caseApplicationType(ApplicationType object) {
				return createApplicationTypeAdapter();
			}
			@Override
			public Adapter caseArcType(ArcType object) {
				return createArcTypeAdapter();
			}
			@Override
			public Adapter caseAreasetType(AreasetType object) {
				return createAreasetTypeAdapter();
			}
			@Override
			public Adapter caseAreaspecType(AreaspecType object) {
				return createAreaspecTypeAdapter();
			}
			@Override
			public Adapter caseAreaType(AreaType object) {
				return createAreaTypeAdapter();
			}
			@Override
			public Adapter caseArgType(ArgType object) {
				return createArgTypeAdapter();
			}
			@Override
			public Adapter caseArticleType(ArticleType object) {
				return createArticleTypeAdapter();
			}
			@Override
			public Adapter caseArtpagenumsType(ArtpagenumsType object) {
				return createArtpagenumsTypeAdapter();
			}
			@Override
			public Adapter caseAttributionType(AttributionType object) {
				return createAttributionTypeAdapter();
			}
			@Override
			public Adapter caseAudiodataType(AudiodataType object) {
				return createAudiodataTypeAdapter();
			}
			@Override
			public Adapter caseAudioobjectType(AudioobjectType object) {
				return createAudioobjectTypeAdapter();
			}
			@Override
			public Adapter caseAuthorgroupType(AuthorgroupType object) {
				return createAuthorgroupTypeAdapter();
			}
			@Override
			public Adapter caseAuthorinitialsType(AuthorinitialsType object) {
				return createAuthorinitialsTypeAdapter();
			}
			@Override
			public Adapter caseAuthorType(AuthorType object) {
				return createAuthorTypeAdapter();
			}
			@Override
			public Adapter caseBibliocoverageType(BibliocoverageType object) {
				return createBibliocoverageTypeAdapter();
			}
			@Override
			public Adapter caseBibliodivType(BibliodivType object) {
				return createBibliodivTypeAdapter();
			}
			@Override
			public Adapter caseBiblioentryType(BiblioentryType object) {
				return createBiblioentryTypeAdapter();
			}
			@Override
			public Adapter caseBibliographyType(BibliographyType object) {
				return createBibliographyTypeAdapter();
			}
			@Override
			public Adapter caseBiblioidType(BiblioidType object) {
				return createBiblioidTypeAdapter();
			}
			@Override
			public Adapter caseBibliolistType(BibliolistType object) {
				return createBibliolistTypeAdapter();
			}
			@Override
			public Adapter caseBibliomiscType(BibliomiscType object) {
				return createBibliomiscTypeAdapter();
			}
			@Override
			public Adapter caseBibliomixedType(BibliomixedType object) {
				return createBibliomixedTypeAdapter();
			}
			@Override
			public Adapter caseBibliomsetType(BibliomsetType object) {
				return createBibliomsetTypeAdapter();
			}
			@Override
			public Adapter caseBibliorefType(BibliorefType object) {
				return createBibliorefTypeAdapter();
			}
			@Override
			public Adapter caseBibliorelationType(BibliorelationType object) {
				return createBibliorelationTypeAdapter();
			}
			@Override
			public Adapter caseBibliosetType(BibliosetType object) {
				return createBibliosetTypeAdapter();
			}
			@Override
			public Adapter caseBibliosourceType(BibliosourceType object) {
				return createBibliosourceTypeAdapter();
			}
			@Override
			public Adapter caseBlockquoteType(BlockquoteType object) {
				return createBlockquoteTypeAdapter();
			}
			@Override
			public Adapter caseBookType(BookType object) {
				return createBookTypeAdapter();
			}
			@Override
			public Adapter caseBridgeheadType(BridgeheadType object) {
				return createBridgeheadTypeAdapter();
			}
			@Override
			public Adapter caseCalloutlistType(CalloutlistType object) {
				return createCalloutlistTypeAdapter();
			}
			@Override
			public Adapter caseCalloutType(CalloutType object) {
				return createCalloutTypeAdapter();
			}
			@Override
			public Adapter caseCaptionType(CaptionType object) {
				return createCaptionTypeAdapter();
			}
			@Override
			public Adapter caseCautionType(CautionType object) {
				return createCautionTypeAdapter();
			}
			@Override
			public Adapter caseChapterType(ChapterType object) {
				return createChapterTypeAdapter();
			}
			@Override
			public Adapter caseCitationType(CitationType object) {
				return createCitationTypeAdapter();
			}
			@Override
			public Adapter caseCitebiblioidType(CitebiblioidType object) {
				return createCitebiblioidTypeAdapter();
			}
			@Override
			public Adapter caseCiterefentryType(CiterefentryType object) {
				return createCiterefentryTypeAdapter();
			}
			@Override
			public Adapter caseCitetitleType(CitetitleType object) {
				return createCitetitleTypeAdapter();
			}
			@Override
			public Adapter caseCityType(CityType object) {
				return createCityTypeAdapter();
			}
			@Override
			public Adapter caseClassnameType(ClassnameType object) {
				return createClassnameTypeAdapter();
			}
			@Override
			public Adapter caseClasssynopsisinfoType(ClasssynopsisinfoType object) {
				return createClasssynopsisinfoTypeAdapter();
			}
			@Override
			public Adapter caseClasssynopsisType(ClasssynopsisType object) {
				return createClasssynopsisTypeAdapter();
			}
			@Override
			public Adapter caseCmdsynopsisType(CmdsynopsisType object) {
				return createCmdsynopsisTypeAdapter();
			}
			@Override
			public Adapter caseCodeType(CodeType object) {
				return createCodeTypeAdapter();
			}
			@Override
			public Adapter caseColgroupType(ColgroupType object) {
				return createColgroupTypeAdapter();
			}
			@Override
			public Adapter caseCollabType(CollabType object) {
				return createCollabTypeAdapter();
			}
			@Override
			public Adapter caseColophonType(ColophonType object) {
				return createColophonTypeAdapter();
			}
			@Override
			public Adapter caseColspecType(ColspecType object) {
				return createColspecTypeAdapter();
			}
			@Override
			public Adapter caseColType(ColType object) {
				return createColTypeAdapter();
			}
			@Override
			public Adapter caseCommandType(CommandType object) {
				return createCommandTypeAdapter();
			}
			@Override
			public Adapter caseComputeroutputType(ComputeroutputType object) {
				return createComputeroutputTypeAdapter();
			}
			@Override
			public Adapter caseConfdatesType(ConfdatesType object) {
				return createConfdatesTypeAdapter();
			}
			@Override
			public Adapter caseConfgroupType(ConfgroupType object) {
				return createConfgroupTypeAdapter();
			}
			@Override
			public Adapter caseConfnumType(ConfnumType object) {
				return createConfnumTypeAdapter();
			}
			@Override
			public Adapter caseConfsponsorType(ConfsponsorType object) {
				return createConfsponsorTypeAdapter();
			}
			@Override
			public Adapter caseConftitleType(ConftitleType object) {
				return createConftitleTypeAdapter();
			}
			@Override
			public Adapter caseConstantType(ConstantType object) {
				return createConstantTypeAdapter();
			}
			@Override
			public Adapter caseConstraintdefType(ConstraintdefType object) {
				return createConstraintdefTypeAdapter();
			}
			@Override
			public Adapter caseConstraintType(ConstraintType object) {
				return createConstraintTypeAdapter();
			}
			@Override
			public Adapter caseConstructorsynopsisType(ConstructorsynopsisType object) {
				return createConstructorsynopsisTypeAdapter();
			}
			@Override
			public Adapter caseContractnumType(ContractnumType object) {
				return createContractnumTypeAdapter();
			}
			@Override
			public Adapter caseContractsponsorType(ContractsponsorType object) {
				return createContractsponsorTypeAdapter();
			}
			@Override
			public Adapter caseContribType(ContribType object) {
				return createContribTypeAdapter();
			}
			@Override
			public Adapter caseCopyrightType(CopyrightType object) {
				return createCopyrightTypeAdapter();
			}
			@Override
			public Adapter caseCorefType(CorefType object) {
				return createCorefTypeAdapter();
			}
			@Override
			public Adapter caseCoType(CoType object) {
				return createCoTypeAdapter();
			}
			@Override
			public Adapter caseCountryType(CountryType object) {
				return createCountryTypeAdapter();
			}
			@Override
			public Adapter caseCoverType(CoverType object) {
				return createCoverTypeAdapter();
			}
			@Override
			public Adapter caseDatabaseType(DatabaseType object) {
				return createDatabaseTypeAdapter();
			}
			@Override
			public Adapter caseDateType(DateType object) {
				return createDateTypeAdapter();
			}
			@Override
			public Adapter caseDedicationType(DedicationType object) {
				return createDedicationTypeAdapter();
			}
			@Override
			public Adapter caseDestructorsynopsisType(DestructorsynopsisType object) {
				return createDestructorsynopsisTypeAdapter();
			}
			@Override
			public Adapter caseDocumentRoot(DocumentRoot object) {
				return createDocumentRootAdapter();
			}
			@Override
			public Adapter caseEditionType(EditionType object) {
				return createEditionTypeAdapter();
			}
			@Override
			public Adapter caseEditorType(EditorType object) {
				return createEditorTypeAdapter();
			}
			@Override
			public Adapter caseEmailType(EmailType object) {
				return createEmailTypeAdapter();
			}
			@Override
			public Adapter caseEmphasisType(EmphasisType object) {
				return createEmphasisTypeAdapter();
			}
			@Override
			public Adapter caseEntrytblType(EntrytblType object) {
				return createEntrytblTypeAdapter();
			}
			@Override
			public Adapter caseEntryType(EntryType object) {
				return createEntryTypeAdapter();
			}
			@Override
			public Adapter caseEnvarType(EnvarType object) {
				return createEnvarTypeAdapter();
			}
			@Override
			public Adapter caseEpigraphType(EpigraphType object) {
				return createEpigraphTypeAdapter();
			}
			@Override
			public Adapter caseEquationType(EquationType object) {
				return createEquationTypeAdapter();
			}
			@Override
			public Adapter caseErrorcodeType(ErrorcodeType object) {
				return createErrorcodeTypeAdapter();
			}
			@Override
			public Adapter caseErrornameType(ErrornameType object) {
				return createErrornameTypeAdapter();
			}
			@Override
			public Adapter caseErrortextType(ErrortextType object) {
				return createErrortextTypeAdapter();
			}
			@Override
			public Adapter caseErrortypeType(ErrortypeType object) {
				return createErrortypeTypeAdapter();
			}
			@Override
			public Adapter caseExampleType(ExampleType object) {
				return createExampleTypeAdapter();
			}
			@Override
			public Adapter caseExceptionnameType(ExceptionnameType object) {
				return createExceptionnameTypeAdapter();
			}
			@Override
			public Adapter caseExtendedlinkType(ExtendedlinkType object) {
				return createExtendedlinkTypeAdapter();
			}
			@Override
			public Adapter caseFaxType(FaxType object) {
				return createFaxTypeAdapter();
			}
			@Override
			public Adapter caseFieldsynopsisType(FieldsynopsisType object) {
				return createFieldsynopsisTypeAdapter();
			}
			@Override
			public Adapter caseFigureType(FigureType object) {
				return createFigureTypeAdapter();
			}
			@Override
			public Adapter caseFilenameType(FilenameType object) {
				return createFilenameTypeAdapter();
			}
			@Override
			public Adapter caseFirstnameType(FirstnameType object) {
				return createFirstnameTypeAdapter();
			}
			@Override
			public Adapter caseFirsttermType(FirsttermType object) {
				return createFirsttermTypeAdapter();
			}
			@Override
			public Adapter caseFootnoterefType(FootnoterefType object) {
				return createFootnoterefTypeAdapter();
			}
			@Override
			public Adapter caseFootnoteType(FootnoteType object) {
				return createFootnoteTypeAdapter();
			}
			@Override
			public Adapter caseForeignphraseType(ForeignphraseType object) {
				return createForeignphraseTypeAdapter();
			}
			@Override
			public Adapter caseFormalparaType(FormalparaType object) {
				return createFormalparaTypeAdapter();
			}
			@Override
			public Adapter caseFuncdefType(FuncdefType object) {
				return createFuncdefTypeAdapter();
			}
			@Override
			public Adapter caseFuncparamsType(FuncparamsType object) {
				return createFuncparamsTypeAdapter();
			}
			@Override
			public Adapter caseFuncprototypeType(FuncprototypeType object) {
				return createFuncprototypeTypeAdapter();
			}
			@Override
			public Adapter caseFuncsynopsisinfoType(FuncsynopsisinfoType object) {
				return createFuncsynopsisinfoTypeAdapter();
			}
			@Override
			public Adapter caseFuncsynopsisType(FuncsynopsisType object) {
				return createFuncsynopsisTypeAdapter();
			}
			@Override
			public Adapter caseFunctionType1(FunctionType1 object) {
				return createFunctionType1Adapter();
			}
			@Override
			public Adapter caseGlossaryType(GlossaryType object) {
				return createGlossaryTypeAdapter();
			}
			@Override
			public Adapter caseGlossdefType(GlossdefType object) {
				return createGlossdefTypeAdapter();
			}
			@Override
			public Adapter caseGlossdivType(GlossdivType object) {
				return createGlossdivTypeAdapter();
			}
			@Override
			public Adapter caseGlossentryType(GlossentryType object) {
				return createGlossentryTypeAdapter();
			}
			@Override
			public Adapter caseGlosslistType(GlosslistType object) {
				return createGlosslistTypeAdapter();
			}
			@Override
			public Adapter caseGlossseealsoType(GlossseealsoType object) {
				return createGlossseealsoTypeAdapter();
			}
			@Override
			public Adapter caseGlossseeType(GlossseeType object) {
				return createGlossseeTypeAdapter();
			}
			@Override
			public Adapter caseGlosstermType(GlosstermType object) {
				return createGlosstermTypeAdapter();
			}
			@Override
			public Adapter caseGroupType(GroupType object) {
				return createGroupTypeAdapter();
			}
			@Override
			public Adapter caseGuibuttonType(GuibuttonType object) {
				return createGuibuttonTypeAdapter();
			}
			@Override
			public Adapter caseGuiiconType(GuiiconType object) {
				return createGuiiconTypeAdapter();
			}
			@Override
			public Adapter caseGuilabelType(GuilabelType object) {
				return createGuilabelTypeAdapter();
			}
			@Override
			public Adapter caseGuimenuitemType(GuimenuitemType object) {
				return createGuimenuitemTypeAdapter();
			}
			@Override
			public Adapter caseGuimenuType(GuimenuType object) {
				return createGuimenuTypeAdapter();
			}
			@Override
			public Adapter caseGuisubmenuType(GuisubmenuType object) {
				return createGuisubmenuTypeAdapter();
			}
			@Override
			public Adapter caseHardwareType(HardwareType object) {
				return createHardwareTypeAdapter();
			}
			@Override
			public Adapter caseHolderType(HolderType object) {
				return createHolderTypeAdapter();
			}
			@Override
			public Adapter caseHonorificType(HonorificType object) {
				return createHonorificTypeAdapter();
			}
			@Override
			public Adapter caseImagedataType(ImagedataType object) {
				return createImagedataTypeAdapter();
			}
			@Override
			public Adapter caseImageobjectcoType(ImageobjectcoType object) {
				return createImageobjectcoTypeAdapter();
			}
			@Override
			public Adapter caseImageobjectType(ImageobjectType object) {
				return createImageobjectTypeAdapter();
			}
			@Override
			public Adapter caseImportantType(ImportantType object) {
				return createImportantTypeAdapter();
			}
			@Override
			public Adapter caseIndexdivType(IndexdivType object) {
				return createIndexdivTypeAdapter();
			}
			@Override
			public Adapter caseIndexentryType(IndexentryType object) {
				return createIndexentryTypeAdapter();
			}
			@Override
			public Adapter caseIndextermType(IndextermType object) {
				return createIndextermTypeAdapter();
			}
			@Override
			public Adapter caseIndexType(IndexType object) {
				return createIndexTypeAdapter();
			}
			@Override
			public Adapter caseInformalequationType(InformalequationType object) {
				return createInformalequationTypeAdapter();
			}
			@Override
			public Adapter caseInformalexampleType(InformalexampleType object) {
				return createInformalexampleTypeAdapter();
			}
			@Override
			public Adapter caseInformalfigureType(InformalfigureType object) {
				return createInformalfigureTypeAdapter();
			}
			@Override
			public Adapter caseInformaltableType(InformaltableType object) {
				return createInformaltableTypeAdapter();
			}
			@Override
			public Adapter caseInfoType(InfoType object) {
				return createInfoTypeAdapter();
			}
			@Override
			public Adapter caseInitializerType(InitializerType object) {
				return createInitializerTypeAdapter();
			}
			@Override
			public Adapter caseInlineequationType(InlineequationType object) {
				return createInlineequationTypeAdapter();
			}
			@Override
			public Adapter caseInlinemediaobjectType(InlinemediaobjectType object) {
				return createInlinemediaobjectTypeAdapter();
			}
			@Override
			public Adapter caseInterfacenameType(InterfacenameType object) {
				return createInterfacenameTypeAdapter();
			}
			@Override
			public Adapter caseIssuenumType(IssuenumType object) {
				return createIssuenumTypeAdapter();
			}
			@Override
			public Adapter caseItemizedlistType(ItemizedlistType object) {
				return createItemizedlistTypeAdapter();
			}
			@Override
			public Adapter caseItermsetType(ItermsetType object) {
				return createItermsetTypeAdapter();
			}
			@Override
			public Adapter caseJobtitleType(JobtitleType object) {
				return createJobtitleTypeAdapter();
			}
			@Override
			public Adapter caseKeycapType(KeycapType object) {
				return createKeycapTypeAdapter();
			}
			@Override
			public Adapter caseKeycodeType(KeycodeType object) {
				return createKeycodeTypeAdapter();
			}
			@Override
			public Adapter caseKeycomboType(KeycomboType object) {
				return createKeycomboTypeAdapter();
			}
			@Override
			public Adapter caseKeysymType(KeysymType object) {
				return createKeysymTypeAdapter();
			}
			@Override
			public Adapter caseKeywordsetType(KeywordsetType object) {
				return createKeywordsetTypeAdapter();
			}
			@Override
			public Adapter caseKeywordType(KeywordType object) {
				return createKeywordTypeAdapter();
			}
			@Override
			public Adapter caseLabelType(LabelType object) {
				return createLabelTypeAdapter();
			}
			@Override
			public Adapter caseLegalnoticeType(LegalnoticeType object) {
				return createLegalnoticeTypeAdapter();
			}
			@Override
			public Adapter caseLhsType(LhsType object) {
				return createLhsTypeAdapter();
			}
			@Override
			public Adapter caseLineageType(LineageType object) {
				return createLineageTypeAdapter();
			}
			@Override
			public Adapter caseLineannotationType(LineannotationType object) {
				return createLineannotationTypeAdapter();
			}
			@Override
			public Adapter caseLinkType(LinkType object) {
				return createLinkTypeAdapter();
			}
			@Override
			public Adapter caseListitemType(ListitemType object) {
				return createListitemTypeAdapter();
			}
			@Override
			public Adapter caseLiterallayoutType(LiterallayoutType object) {
				return createLiterallayoutTypeAdapter();
			}
			@Override
			public Adapter caseLiteralType(LiteralType object) {
				return createLiteralTypeAdapter();
			}
			@Override
			public Adapter caseLocatorType(LocatorType object) {
				return createLocatorTypeAdapter();
			}
			@Override
			public Adapter caseManvolnumType(ManvolnumType object) {
				return createManvolnumTypeAdapter();
			}
			@Override
			public Adapter caseMarkupType(MarkupType object) {
				return createMarkupTypeAdapter();
			}
			@Override
			public Adapter caseMathphraseType(MathphraseType object) {
				return createMathphraseTypeAdapter();
			}
			@Override
			public Adapter caseMediaobjectType(MediaobjectType object) {
				return createMediaobjectTypeAdapter();
			}
			@Override
			public Adapter caseMemberType(MemberType object) {
				return createMemberTypeAdapter();
			}
			@Override
			public Adapter caseMenuchoiceType(MenuchoiceType object) {
				return createMenuchoiceTypeAdapter();
			}
			@Override
			public Adapter caseMethodnameType(MethodnameType object) {
				return createMethodnameTypeAdapter();
			}
			@Override
			public Adapter caseMethodparamType(MethodparamType object) {
				return createMethodparamTypeAdapter();
			}
			@Override
			public Adapter caseMethodsynopsisType(MethodsynopsisType object) {
				return createMethodsynopsisTypeAdapter();
			}
			@Override
			public Adapter caseModifierType(ModifierType object) {
				return createModifierTypeAdapter();
			}
			@Override
			public Adapter caseMousebuttonType(MousebuttonType object) {
				return createMousebuttonTypeAdapter();
			}
			@Override
			public Adapter caseMsgaudType(MsgaudType object) {
				return createMsgaudTypeAdapter();
			}
			@Override
			public Adapter caseMsgentryType(MsgentryType object) {
				return createMsgentryTypeAdapter();
			}
			@Override
			public Adapter caseMsgexplanType(MsgexplanType object) {
				return createMsgexplanTypeAdapter();
			}
			@Override
			public Adapter caseMsginfoType(MsginfoType object) {
				return createMsginfoTypeAdapter();
			}
			@Override
			public Adapter caseMsglevelType(MsglevelType object) {
				return createMsglevelTypeAdapter();
			}
			@Override
			public Adapter caseMsgmainType(MsgmainType object) {
				return createMsgmainTypeAdapter();
			}
			@Override
			public Adapter caseMsgorigType(MsgorigType object) {
				return createMsgorigTypeAdapter();
			}
			@Override
			public Adapter caseMsgrelType(MsgrelType object) {
				return createMsgrelTypeAdapter();
			}
			@Override
			public Adapter caseMsgsetType(MsgsetType object) {
				return createMsgsetTypeAdapter();
			}
			@Override
			public Adapter caseMsgsubType(MsgsubType object) {
				return createMsgsubTypeAdapter();
			}
			@Override
			public Adapter caseMsgtextType(MsgtextType object) {
				return createMsgtextTypeAdapter();
			}
			@Override
			public Adapter caseMsgType(MsgType object) {
				return createMsgTypeAdapter();
			}
			@Override
			public Adapter caseNonterminalType(NonterminalType object) {
				return createNonterminalTypeAdapter();
			}
			@Override
			public Adapter caseNoteType(NoteType object) {
				return createNoteTypeAdapter();
			}
			@Override
			public Adapter caseOlinkType(OlinkType object) {
				return createOlinkTypeAdapter();
			}
			@Override
			public Adapter caseOoclassType(OoclassType object) {
				return createOoclassTypeAdapter();
			}
			@Override
			public Adapter caseOoexceptionType(OoexceptionType object) {
				return createOoexceptionTypeAdapter();
			}
			@Override
			public Adapter caseOointerfaceType(OointerfaceType object) {
				return createOointerfaceTypeAdapter();
			}
			@Override
			public Adapter caseOptionalType(OptionalType object) {
				return createOptionalTypeAdapter();
			}
			@Override
			public Adapter caseOptionType(OptionType object) {
				return createOptionTypeAdapter();
			}
			@Override
			public Adapter caseOrderedlistType(OrderedlistType object) {
				return createOrderedlistTypeAdapter();
			}
			@Override
			public Adapter caseOrgdivType(OrgdivType object) {
				return createOrgdivTypeAdapter();
			}
			@Override
			public Adapter caseOrgnameType(OrgnameType object) {
				return createOrgnameTypeAdapter();
			}
			@Override
			public Adapter caseOrgType(OrgType object) {
				return createOrgTypeAdapter();
			}
			@Override
			public Adapter caseOtheraddrType(OtheraddrType object) {
				return createOtheraddrTypeAdapter();
			}
			@Override
			public Adapter caseOthercreditType(OthercreditType object) {
				return createOthercreditTypeAdapter();
			}
			@Override
			public Adapter caseOthernameType(OthernameType object) {
				return createOthernameTypeAdapter();
			}
			@Override
			public Adapter casePackageType(PackageType object) {
				return createPackageTypeAdapter();
			}
			@Override
			public Adapter casePagenumsType(PagenumsType object) {
				return createPagenumsTypeAdapter();
			}
			@Override
			public Adapter caseParamdefType(ParamdefType object) {
				return createParamdefTypeAdapter();
			}
			@Override
			public Adapter caseParameterType(ParameterType object) {
				return createParameterTypeAdapter();
			}
			@Override
			public Adapter caseParaType(ParaType object) {
				return createParaTypeAdapter();
			}
			@Override
			public Adapter casePartintroType(PartintroType object) {
				return createPartintroTypeAdapter();
			}
			@Override
			public Adapter casePartType(PartType object) {
				return createPartTypeAdapter();
			}
			@Override
			public Adapter casePersonblurbType(PersonblurbType object) {
				return createPersonblurbTypeAdapter();
			}
			@Override
			public Adapter casePersonnameType(PersonnameType object) {
				return createPersonnameTypeAdapter();
			}
			@Override
			public Adapter casePersonType(PersonType object) {
				return createPersonTypeAdapter();
			}
			@Override
			public Adapter casePhoneType(PhoneType object) {
				return createPhoneTypeAdapter();
			}
			@Override
			public Adapter casePhraseType(PhraseType object) {
				return createPhraseTypeAdapter();
			}
			@Override
			public Adapter casePobType(PobType object) {
				return createPobTypeAdapter();
			}
			@Override
			public Adapter casePostcodeType(PostcodeType object) {
				return createPostcodeTypeAdapter();
			}
			@Override
			public Adapter casePrefaceType(PrefaceType object) {
				return createPrefaceTypeAdapter();
			}
			@Override
			public Adapter casePrimaryieType(PrimaryieType object) {
				return createPrimaryieTypeAdapter();
			}
			@Override
			public Adapter casePrimaryType(PrimaryType object) {
				return createPrimaryTypeAdapter();
			}
			@Override
			public Adapter casePrinthistoryType(PrinthistoryType object) {
				return createPrinthistoryTypeAdapter();
			}
			@Override
			public Adapter caseProcedureType(ProcedureType object) {
				return createProcedureTypeAdapter();
			}
			@Override
			public Adapter caseProductionrecapType(ProductionrecapType object) {
				return createProductionrecapTypeAdapter();
			}
			@Override
			public Adapter caseProductionsetType(ProductionsetType object) {
				return createProductionsetTypeAdapter();
			}
			@Override
			public Adapter caseProductionType(ProductionType object) {
				return createProductionTypeAdapter();
			}
			@Override
			public Adapter caseProductnameType(ProductnameType object) {
				return createProductnameTypeAdapter();
			}
			@Override
			public Adapter caseProductnumberType(ProductnumberType object) {
				return createProductnumberTypeAdapter();
			}
			@Override
			public Adapter caseProgramlistingcoType(ProgramlistingcoType object) {
				return createProgramlistingcoTypeAdapter();
			}
			@Override
			public Adapter caseProgramlistingType(ProgramlistingType object) {
				return createProgramlistingTypeAdapter();
			}
			@Override
			public Adapter casePromptType(PromptType object) {
				return createPromptTypeAdapter();
			}
			@Override
			public Adapter casePropertyType(PropertyType object) {
				return createPropertyTypeAdapter();
			}
			@Override
			public Adapter casePubdateType(PubdateType object) {
				return createPubdateTypeAdapter();
			}
			@Override
			public Adapter casePublishernameType(PublishernameType object) {
				return createPublishernameTypeAdapter();
			}
			@Override
			public Adapter casePublisherType(PublisherType object) {
				return createPublisherTypeAdapter();
			}
			@Override
			public Adapter caseQandadivType(QandadivType object) {
				return createQandadivTypeAdapter();
			}
			@Override
			public Adapter caseQandaentryType(QandaentryType object) {
				return createQandaentryTypeAdapter();
			}
			@Override
			public Adapter caseQandasetType(QandasetType object) {
				return createQandasetTypeAdapter();
			}
			@Override
			public Adapter caseQuestionType(QuestionType object) {
				return createQuestionTypeAdapter();
			}
			@Override
			public Adapter caseQuoteType(QuoteType object) {
				return createQuoteTypeAdapter();
			}
			@Override
			public Adapter caseRefclassType(RefclassType object) {
				return createRefclassTypeAdapter();
			}
			@Override
			public Adapter caseRefdescriptorType(RefdescriptorType object) {
				return createRefdescriptorTypeAdapter();
			}
			@Override
			public Adapter caseRefentrytitleType(RefentrytitleType object) {
				return createRefentrytitleTypeAdapter();
			}
			@Override
			public Adapter caseRefentryType(RefentryType object) {
				return createRefentryTypeAdapter();
			}
			@Override
			public Adapter caseReferenceType(ReferenceType object) {
				return createReferenceTypeAdapter();
			}
			@Override
			public Adapter caseRefmetaType(RefmetaType object) {
				return createRefmetaTypeAdapter();
			}
			@Override
			public Adapter caseRefmiscinfoType(RefmiscinfoType object) {
				return createRefmiscinfoTypeAdapter();
			}
			@Override
			public Adapter caseRefnamedivType(RefnamedivType object) {
				return createRefnamedivTypeAdapter();
			}
			@Override
			public Adapter caseRefnameType(RefnameType object) {
				return createRefnameTypeAdapter();
			}
			@Override
			public Adapter caseRefpurposeType(RefpurposeType object) {
				return createRefpurposeTypeAdapter();
			}
			@Override
			public Adapter caseRefsect1Type(Refsect1Type object) {
				return createRefsect1TypeAdapter();
			}
			@Override
			public Adapter caseRefsect2Type(Refsect2Type object) {
				return createRefsect2TypeAdapter();
			}
			@Override
			public Adapter caseRefsect3Type(Refsect3Type object) {
				return createRefsect3TypeAdapter();
			}
			@Override
			public Adapter caseRefsectionType(RefsectionType object) {
				return createRefsectionTypeAdapter();
			}
			@Override
			public Adapter caseRefsynopsisdivType(RefsynopsisdivType object) {
				return createRefsynopsisdivTypeAdapter();
			}
			@Override
			public Adapter caseReleaseinfoType(ReleaseinfoType object) {
				return createReleaseinfoTypeAdapter();
			}
			@Override
			public Adapter caseRemarkType(RemarkType object) {
				return createRemarkTypeAdapter();
			}
			@Override
			public Adapter caseReplaceableType(ReplaceableType object) {
				return createReplaceableTypeAdapter();
			}
			@Override
			public Adapter caseReturnvalueType(ReturnvalueType object) {
				return createReturnvalueTypeAdapter();
			}
			@Override
			public Adapter caseRevdescriptionType(RevdescriptionType object) {
				return createRevdescriptionTypeAdapter();
			}
			@Override
			public Adapter caseRevhistoryType(RevhistoryType object) {
				return createRevhistoryTypeAdapter();
			}
			@Override
			public Adapter caseRevisionType(RevisionType object) {
				return createRevisionTypeAdapter();
			}
			@Override
			public Adapter caseRevnumberType(RevnumberType object) {
				return createRevnumberTypeAdapter();
			}
			@Override
			public Adapter caseRevremarkType(RevremarkType object) {
				return createRevremarkTypeAdapter();
			}
			@Override
			public Adapter caseRhsType(RhsType object) {
				return createRhsTypeAdapter();
			}
			@Override
			public Adapter caseRowType(RowType object) {
				return createRowTypeAdapter();
			}
			@Override
			public Adapter caseSbrType(SbrType object) {
				return createSbrTypeAdapter();
			}
			@Override
			public Adapter caseScreencoType(ScreencoType object) {
				return createScreencoTypeAdapter();
			}
			@Override
			public Adapter caseScreenshotType(ScreenshotType object) {
				return createScreenshotTypeAdapter();
			}
			@Override
			public Adapter caseScreenType(ScreenType object) {
				return createScreenTypeAdapter();
			}
			@Override
			public Adapter caseSecondaryieType(SecondaryieType object) {
				return createSecondaryieTypeAdapter();
			}
			@Override
			public Adapter caseSecondaryType(SecondaryType object) {
				return createSecondaryTypeAdapter();
			}
			@Override
			public Adapter caseSect1Type(Sect1Type object) {
				return createSect1TypeAdapter();
			}
			@Override
			public Adapter caseSect2Type(Sect2Type object) {
				return createSect2TypeAdapter();
			}
			@Override
			public Adapter caseSect3Type(Sect3Type object) {
				return createSect3TypeAdapter();
			}
			@Override
			public Adapter caseSect4Type(Sect4Type object) {
				return createSect4TypeAdapter();
			}
			@Override
			public Adapter caseSect5Type(Sect5Type object) {
				return createSect5TypeAdapter();
			}
			@Override
			public Adapter caseSectionType(SectionType object) {
				return createSectionTypeAdapter();
			}
			@Override
			public Adapter caseSeealsoieType(SeealsoieType object) {
				return createSeealsoieTypeAdapter();
			}
			@Override
			public Adapter caseSeealsoType(SeealsoType object) {
				return createSeealsoTypeAdapter();
			}
			@Override
			public Adapter caseSeeieType(SeeieType object) {
				return createSeeieTypeAdapter();
			}
			@Override
			public Adapter caseSeeType(SeeType object) {
				return createSeeTypeAdapter();
			}
			@Override
			public Adapter caseSeglistitemType(SeglistitemType object) {
				return createSeglistitemTypeAdapter();
			}
			@Override
			public Adapter caseSegmentedlistType(SegmentedlistType object) {
				return createSegmentedlistTypeAdapter();
			}
			@Override
			public Adapter caseSegtitleType(SegtitleType object) {
				return createSegtitleTypeAdapter();
			}
			@Override
			public Adapter caseSegType(SegType object) {
				return createSegTypeAdapter();
			}
			@Override
			public Adapter caseSeriesvolnumsType(SeriesvolnumsType object) {
				return createSeriesvolnumsTypeAdapter();
			}
			@Override
			public Adapter caseSetindexType(SetindexType object) {
				return createSetindexTypeAdapter();
			}
			@Override
			public Adapter caseSetType(SetType object) {
				return createSetTypeAdapter();
			}
			@Override
			public Adapter caseShortaffilType(ShortaffilType object) {
				return createShortaffilTypeAdapter();
			}
			@Override
			public Adapter caseShortcutType(ShortcutType object) {
				return createShortcutTypeAdapter();
			}
			@Override
			public Adapter caseSidebarType(SidebarType object) {
				return createSidebarTypeAdapter();
			}
			@Override
			public Adapter caseSimparaType(SimparaType object) {
				return createSimparaTypeAdapter();
			}
			@Override
			public Adapter caseSimplelistType(SimplelistType object) {
				return createSimplelistTypeAdapter();
			}
			@Override
			public Adapter caseSimplemsgentryType(SimplemsgentryType object) {
				return createSimplemsgentryTypeAdapter();
			}
			@Override
			public Adapter caseSimplesectType(SimplesectType object) {
				return createSimplesectTypeAdapter();
			}
			@Override
			public Adapter caseSpanspecType(SpanspecType object) {
				return createSpanspecTypeAdapter();
			}
			@Override
			public Adapter caseStateType(StateType object) {
				return createStateTypeAdapter();
			}
			@Override
			public Adapter caseStepalternativesType(StepalternativesType object) {
				return createStepalternativesTypeAdapter();
			}
			@Override
			public Adapter caseStepType(StepType object) {
				return createStepTypeAdapter();
			}
			@Override
			public Adapter caseStreetType(StreetType object) {
				return createStreetTypeAdapter();
			}
			@Override
			public Adapter caseSubjectsetType(SubjectsetType object) {
				return createSubjectsetTypeAdapter();
			}
			@Override
			public Adapter caseSubjecttermType(SubjecttermType object) {
				return createSubjecttermTypeAdapter();
			}
			@Override
			public Adapter caseSubjectType(SubjectType object) {
				return createSubjectTypeAdapter();
			}
			@Override
			public Adapter caseSubscriptType(SubscriptType object) {
				return createSubscriptTypeAdapter();
			}
			@Override
			public Adapter caseSubstepsType(SubstepsType object) {
				return createSubstepsTypeAdapter();
			}
			@Override
			public Adapter caseSubtitleType(SubtitleType object) {
				return createSubtitleTypeAdapter();
			}
			@Override
			public Adapter caseSuperscriptType(SuperscriptType object) {
				return createSuperscriptTypeAdapter();
			}
			@Override
			public Adapter caseSurnameType(SurnameType object) {
				return createSurnameTypeAdapter();
			}
			@Override
			public Adapter caseSymbolType(SymbolType object) {
				return createSymbolTypeAdapter();
			}
			@Override
			public Adapter caseSynopfragmentrefType(SynopfragmentrefType object) {
				return createSynopfragmentrefTypeAdapter();
			}
			@Override
			public Adapter caseSynopfragmentType(SynopfragmentType object) {
				return createSynopfragmentTypeAdapter();
			}
			@Override
			public Adapter caseSynopsisType(SynopsisType object) {
				return createSynopsisTypeAdapter();
			}
			@Override
			public Adapter caseSystemitemType(SystemitemType object) {
				return createSystemitemTypeAdapter();
			}
			@Override
			public Adapter caseTableType(TableType object) {
				return createTableTypeAdapter();
			}
			@Override
			public Adapter caseTagType(TagType object) {
				return createTagTypeAdapter();
			}
			@Override
			public Adapter caseTaskprerequisitesType(TaskprerequisitesType object) {
				return createTaskprerequisitesTypeAdapter();
			}
			@Override
			public Adapter caseTaskrelatedType(TaskrelatedType object) {
				return createTaskrelatedTypeAdapter();
			}
			@Override
			public Adapter caseTasksummaryType(TasksummaryType object) {
				return createTasksummaryTypeAdapter();
			}
			@Override
			public Adapter caseTaskType(TaskType object) {
				return createTaskTypeAdapter();
			}
			@Override
			public Adapter caseTbodyType(TbodyType object) {
				return createTbodyTypeAdapter();
			}
			@Override
			public Adapter caseTdType(TdType object) {
				return createTdTypeAdapter();
			}
			@Override
			public Adapter caseTermdefType(TermdefType object) {
				return createTermdefTypeAdapter();
			}
			@Override
			public Adapter caseTermType(TermType object) {
				return createTermTypeAdapter();
			}
			@Override
			public Adapter caseTertiaryieType(TertiaryieType object) {
				return createTertiaryieTypeAdapter();
			}
			@Override
			public Adapter caseTertiaryType(TertiaryType object) {
				return createTertiaryTypeAdapter();
			}
			@Override
			public Adapter caseTextdataType(TextdataType object) {
				return createTextdataTypeAdapter();
			}
			@Override
			public Adapter caseTextobjectType(TextobjectType object) {
				return createTextobjectTypeAdapter();
			}
			@Override
			public Adapter caseTfootType(TfootType object) {
				return createTfootTypeAdapter();
			}
			@Override
			public Adapter caseTgroupType(TgroupType object) {
				return createTgroupTypeAdapter();
			}
			@Override
			public Adapter caseTheadType(TheadType object) {
				return createTheadTypeAdapter();
			}
			@Override
			public Adapter caseThType(ThType object) {
				return createThTypeAdapter();
			}
			@Override
			public Adapter caseTipType(TipType object) {
				return createTipTypeAdapter();
			}
			@Override
			public Adapter caseTitleabbrevType(TitleabbrevType object) {
				return createTitleabbrevTypeAdapter();
			}
			@Override
			public Adapter caseTitleType(TitleType object) {
				return createTitleTypeAdapter();
			}
			@Override
			public Adapter caseTocdivType(TocdivType object) {
				return createTocdivTypeAdapter();
			}
			@Override
			public Adapter caseTocentryType(TocentryType object) {
				return createTocentryTypeAdapter();
			}
			@Override
			public Adapter caseTocType(TocType object) {
				return createTocTypeAdapter();
			}
			@Override
			public Adapter caseTokenType(TokenType object) {
				return createTokenTypeAdapter();
			}
			@Override
			public Adapter caseTrademarkType(TrademarkType object) {
				return createTrademarkTypeAdapter();
			}
			@Override
			public Adapter caseTrType(TrType object) {
				return createTrTypeAdapter();
			}
			@Override
			public Adapter caseTypeType2(TypeType2 object) {
				return createTypeType2Adapter();
			}
			@Override
			public Adapter caseUriType(UriType object) {
				return createUriTypeAdapter();
			}
			@Override
			public Adapter caseUserinputType(UserinputType object) {
				return createUserinputTypeAdapter();
			}
			@Override
			public Adapter caseVarargsType(VarargsType object) {
				return createVarargsTypeAdapter();
			}
			@Override
			public Adapter caseVariablelistType(VariablelistType object) {
				return createVariablelistTypeAdapter();
			}
			@Override
			public Adapter caseVarlistentryType(VarlistentryType object) {
				return createVarlistentryTypeAdapter();
			}
			@Override
			public Adapter caseVarnameType(VarnameType object) {
				return createVarnameTypeAdapter();
			}
			@Override
			public Adapter caseVideodataType(VideodataType object) {
				return createVideodataTypeAdapter();
			}
			@Override
			public Adapter caseVideoobjectType(VideoobjectType object) {
				return createVideoobjectTypeAdapter();
			}
			@Override
			public Adapter caseVoidType(VoidType object) {
				return createVoidTypeAdapter();
			}
			@Override
			public Adapter caseVolumenumType(VolumenumType object) {
				return createVolumenumTypeAdapter();
			}
			@Override
			public Adapter caseWarningType(WarningType object) {
				return createWarningTypeAdapter();
			}
			@Override
			public Adapter caseWordaswordType(WordaswordType object) {
				return createWordaswordTypeAdapter();
			}
			@Override
			public Adapter caseXrefType(XrefType object) {
				return createXrefTypeAdapter();
			}
			@Override
			public Adapter caseYearType(YearType object) {
				return createYearTypeAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.AbbrevType <em>Abbrev Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.AbbrevType
	 * @generated
	 */
	public Adapter createAbbrevTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.AbstractType <em>Abstract Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.AbstractType
	 * @generated
	 */
	public Adapter createAbstractTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.AccelType <em>Accel Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.AccelType
	 * @generated
	 */
	public Adapter createAccelTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.AcknowledgementsType <em>Acknowledgements Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.AcknowledgementsType
	 * @generated
	 */
	public Adapter createAcknowledgementsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.AcronymType <em>Acronym Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.AcronymType
	 * @generated
	 */
	public Adapter createAcronymTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.AddressType <em>Address Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.AddressType
	 * @generated
	 */
	public Adapter createAddressTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.AffiliationType <em>Affiliation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.AffiliationType
	 * @generated
	 */
	public Adapter createAffiliationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.AltType <em>Alt Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.AltType
	 * @generated
	 */
	public Adapter createAltTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.AnchorType <em>Anchor Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.AnchorType
	 * @generated
	 */
	public Adapter createAnchorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.AnnotationType <em>Annotation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.AnnotationType
	 * @generated
	 */
	public Adapter createAnnotationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.AnswerType <em>Answer Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.AnswerType
	 * @generated
	 */
	public Adapter createAnswerTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.AppendixType <em>Appendix Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.AppendixType
	 * @generated
	 */
	public Adapter createAppendixTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.ApplicationType <em>Application Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.ApplicationType
	 * @generated
	 */
	public Adapter createApplicationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.ArcType <em>Arc Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.ArcType
	 * @generated
	 */
	public Adapter createArcTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.AreasetType <em>Areaset Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.AreasetType
	 * @generated
	 */
	public Adapter createAreasetTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.AreaspecType <em>Areaspec Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.AreaspecType
	 * @generated
	 */
	public Adapter createAreaspecTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.AreaType <em>Area Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.AreaType
	 * @generated
	 */
	public Adapter createAreaTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.ArgType <em>Arg Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.ArgType
	 * @generated
	 */
	public Adapter createArgTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.ArticleType <em>Article Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.ArticleType
	 * @generated
	 */
	public Adapter createArticleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.ArtpagenumsType <em>Artpagenums Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.ArtpagenumsType
	 * @generated
	 */
	public Adapter createArtpagenumsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.AttributionType <em>Attribution Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.AttributionType
	 * @generated
	 */
	public Adapter createAttributionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.AudiodataType <em>Audiodata Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.AudiodataType
	 * @generated
	 */
	public Adapter createAudiodataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.AudioobjectType <em>Audioobject Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.AudioobjectType
	 * @generated
	 */
	public Adapter createAudioobjectTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.AuthorgroupType <em>Authorgroup Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.AuthorgroupType
	 * @generated
	 */
	public Adapter createAuthorgroupTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.AuthorinitialsType <em>Authorinitials Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.AuthorinitialsType
	 * @generated
	 */
	public Adapter createAuthorinitialsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.AuthorType <em>Author Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.AuthorType
	 * @generated
	 */
	public Adapter createAuthorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.BibliocoverageType <em>Bibliocoverage Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.BibliocoverageType
	 * @generated
	 */
	public Adapter createBibliocoverageTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.BibliodivType <em>Bibliodiv Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.BibliodivType
	 * @generated
	 */
	public Adapter createBibliodivTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.BiblioentryType <em>Biblioentry Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.BiblioentryType
	 * @generated
	 */
	public Adapter createBiblioentryTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.BibliographyType <em>Bibliography Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.BibliographyType
	 * @generated
	 */
	public Adapter createBibliographyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.BiblioidType <em>Biblioid Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.BiblioidType
	 * @generated
	 */
	public Adapter createBiblioidTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.BibliolistType <em>Bibliolist Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.BibliolistType
	 * @generated
	 */
	public Adapter createBibliolistTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.BibliomiscType <em>Bibliomisc Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.BibliomiscType
	 * @generated
	 */
	public Adapter createBibliomiscTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.BibliomixedType <em>Bibliomixed Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.BibliomixedType
	 * @generated
	 */
	public Adapter createBibliomixedTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.BibliomsetType <em>Bibliomset Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.BibliomsetType
	 * @generated
	 */
	public Adapter createBibliomsetTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.BibliorefType <em>Biblioref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.BibliorefType
	 * @generated
	 */
	public Adapter createBibliorefTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.BibliorelationType <em>Bibliorelation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.BibliorelationType
	 * @generated
	 */
	public Adapter createBibliorelationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.BibliosetType <em>Biblioset Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.BibliosetType
	 * @generated
	 */
	public Adapter createBibliosetTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.BibliosourceType <em>Bibliosource Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.BibliosourceType
	 * @generated
	 */
	public Adapter createBibliosourceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.BlockquoteType <em>Blockquote Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.BlockquoteType
	 * @generated
	 */
	public Adapter createBlockquoteTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.BookType <em>Book Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.BookType
	 * @generated
	 */
	public Adapter createBookTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.BridgeheadType <em>Bridgehead Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.BridgeheadType
	 * @generated
	 */
	public Adapter createBridgeheadTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.CalloutlistType <em>Calloutlist Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.CalloutlistType
	 * @generated
	 */
	public Adapter createCalloutlistTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.CalloutType <em>Callout Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.CalloutType
	 * @generated
	 */
	public Adapter createCalloutTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.CaptionType <em>Caption Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.CaptionType
	 * @generated
	 */
	public Adapter createCaptionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.CautionType <em>Caution Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.CautionType
	 * @generated
	 */
	public Adapter createCautionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.ChapterType <em>Chapter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.ChapterType
	 * @generated
	 */
	public Adapter createChapterTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.CitationType <em>Citation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.CitationType
	 * @generated
	 */
	public Adapter createCitationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.CitebiblioidType <em>Citebiblioid Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.CitebiblioidType
	 * @generated
	 */
	public Adapter createCitebiblioidTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.CiterefentryType <em>Citerefentry Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.CiterefentryType
	 * @generated
	 */
	public Adapter createCiterefentryTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.CitetitleType <em>Citetitle Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.CitetitleType
	 * @generated
	 */
	public Adapter createCitetitleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.CityType <em>City Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.CityType
	 * @generated
	 */
	public Adapter createCityTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.ClassnameType <em>Classname Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.ClassnameType
	 * @generated
	 */
	public Adapter createClassnameTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.ClasssynopsisinfoType <em>Classsynopsisinfo Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.ClasssynopsisinfoType
	 * @generated
	 */
	public Adapter createClasssynopsisinfoTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.ClasssynopsisType <em>Classsynopsis Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.ClasssynopsisType
	 * @generated
	 */
	public Adapter createClasssynopsisTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.CmdsynopsisType <em>Cmdsynopsis Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.CmdsynopsisType
	 * @generated
	 */
	public Adapter createCmdsynopsisTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.CodeType <em>Code Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.CodeType
	 * @generated
	 */
	public Adapter createCodeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.ColgroupType <em>Colgroup Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.ColgroupType
	 * @generated
	 */
	public Adapter createColgroupTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.CollabType <em>Collab Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.CollabType
	 * @generated
	 */
	public Adapter createCollabTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.ColophonType <em>Colophon Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.ColophonType
	 * @generated
	 */
	public Adapter createColophonTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.ColspecType <em>Colspec Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.ColspecType
	 * @generated
	 */
	public Adapter createColspecTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.ColType <em>Col Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.ColType
	 * @generated
	 */
	public Adapter createColTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.CommandType <em>Command Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.CommandType
	 * @generated
	 */
	public Adapter createCommandTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.ComputeroutputType <em>Computeroutput Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.ComputeroutputType
	 * @generated
	 */
	public Adapter createComputeroutputTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.ConfdatesType <em>Confdates Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.ConfdatesType
	 * @generated
	 */
	public Adapter createConfdatesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.ConfgroupType <em>Confgroup Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.ConfgroupType
	 * @generated
	 */
	public Adapter createConfgroupTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.ConfnumType <em>Confnum Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.ConfnumType
	 * @generated
	 */
	public Adapter createConfnumTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.ConfsponsorType <em>Confsponsor Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.ConfsponsorType
	 * @generated
	 */
	public Adapter createConfsponsorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.ConftitleType <em>Conftitle Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.ConftitleType
	 * @generated
	 */
	public Adapter createConftitleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.ConstantType <em>Constant Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.ConstantType
	 * @generated
	 */
	public Adapter createConstantTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.ConstraintdefType <em>Constraintdef Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.ConstraintdefType
	 * @generated
	 */
	public Adapter createConstraintdefTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.ConstraintType <em>Constraint Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.ConstraintType
	 * @generated
	 */
	public Adapter createConstraintTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.ConstructorsynopsisType <em>Constructorsynopsis Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.ConstructorsynopsisType
	 * @generated
	 */
	public Adapter createConstructorsynopsisTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.ContractnumType <em>Contractnum Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.ContractnumType
	 * @generated
	 */
	public Adapter createContractnumTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.ContractsponsorType <em>Contractsponsor Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.ContractsponsorType
	 * @generated
	 */
	public Adapter createContractsponsorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.ContribType <em>Contrib Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.ContribType
	 * @generated
	 */
	public Adapter createContribTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.CopyrightType <em>Copyright Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.CopyrightType
	 * @generated
	 */
	public Adapter createCopyrightTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.CorefType <em>Coref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.CorefType
	 * @generated
	 */
	public Adapter createCorefTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.CoType <em>Co Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.CoType
	 * @generated
	 */
	public Adapter createCoTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.CountryType <em>Country Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.CountryType
	 * @generated
	 */
	public Adapter createCountryTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.CoverType <em>Cover Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.CoverType
	 * @generated
	 */
	public Adapter createCoverTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.DatabaseType <em>Database Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.DatabaseType
	 * @generated
	 */
	public Adapter createDatabaseTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.DateType <em>Date Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.DateType
	 * @generated
	 */
	public Adapter createDateTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.DedicationType <em>Dedication Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.DedicationType
	 * @generated
	 */
	public Adapter createDedicationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.DestructorsynopsisType <em>Destructorsynopsis Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.DestructorsynopsisType
	 * @generated
	 */
	public Adapter createDestructorsynopsisTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.EditionType <em>Edition Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.EditionType
	 * @generated
	 */
	public Adapter createEditionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.EditorType <em>Editor Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.EditorType
	 * @generated
	 */
	public Adapter createEditorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.EmailType <em>Email Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.EmailType
	 * @generated
	 */
	public Adapter createEmailTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.EmphasisType <em>Emphasis Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.EmphasisType
	 * @generated
	 */
	public Adapter createEmphasisTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.EntrytblType <em>Entrytbl Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.EntrytblType
	 * @generated
	 */
	public Adapter createEntrytblTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.EntryType <em>Entry Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.EntryType
	 * @generated
	 */
	public Adapter createEntryTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.EnvarType <em>Envar Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.EnvarType
	 * @generated
	 */
	public Adapter createEnvarTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.EpigraphType <em>Epigraph Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.EpigraphType
	 * @generated
	 */
	public Adapter createEpigraphTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.EquationType <em>Equation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.EquationType
	 * @generated
	 */
	public Adapter createEquationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.ErrorcodeType <em>Errorcode Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.ErrorcodeType
	 * @generated
	 */
	public Adapter createErrorcodeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.ErrornameType <em>Errorname Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.ErrornameType
	 * @generated
	 */
	public Adapter createErrornameTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.ErrortextType <em>Errortext Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.ErrortextType
	 * @generated
	 */
	public Adapter createErrortextTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.ErrortypeType <em>Errortype Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.ErrortypeType
	 * @generated
	 */
	public Adapter createErrortypeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.ExampleType <em>Example Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.ExampleType
	 * @generated
	 */
	public Adapter createExampleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.ExceptionnameType <em>Exceptionname Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.ExceptionnameType
	 * @generated
	 */
	public Adapter createExceptionnameTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.ExtendedlinkType <em>Extendedlink Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.ExtendedlinkType
	 * @generated
	 */
	public Adapter createExtendedlinkTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.FaxType <em>Fax Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.FaxType
	 * @generated
	 */
	public Adapter createFaxTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.FieldsynopsisType <em>Fieldsynopsis Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.FieldsynopsisType
	 * @generated
	 */
	public Adapter createFieldsynopsisTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.FigureType <em>Figure Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.FigureType
	 * @generated
	 */
	public Adapter createFigureTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.FilenameType <em>Filename Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.FilenameType
	 * @generated
	 */
	public Adapter createFilenameTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.FirstnameType <em>Firstname Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.FirstnameType
	 * @generated
	 */
	public Adapter createFirstnameTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.FirsttermType <em>Firstterm Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.FirsttermType
	 * @generated
	 */
	public Adapter createFirsttermTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.FootnoterefType <em>Footnoteref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.FootnoterefType
	 * @generated
	 */
	public Adapter createFootnoterefTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.FootnoteType <em>Footnote Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.FootnoteType
	 * @generated
	 */
	public Adapter createFootnoteTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.ForeignphraseType <em>Foreignphrase Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.ForeignphraseType
	 * @generated
	 */
	public Adapter createForeignphraseTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.FormalparaType <em>Formalpara Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.FormalparaType
	 * @generated
	 */
	public Adapter createFormalparaTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.FuncdefType <em>Funcdef Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.FuncdefType
	 * @generated
	 */
	public Adapter createFuncdefTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.FuncparamsType <em>Funcparams Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.FuncparamsType
	 * @generated
	 */
	public Adapter createFuncparamsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.FuncprototypeType <em>Funcprototype Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.FuncprototypeType
	 * @generated
	 */
	public Adapter createFuncprototypeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.FuncsynopsisinfoType <em>Funcsynopsisinfo Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.FuncsynopsisinfoType
	 * @generated
	 */
	public Adapter createFuncsynopsisinfoTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.FuncsynopsisType <em>Funcsynopsis Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.FuncsynopsisType
	 * @generated
	 */
	public Adapter createFuncsynopsisTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.FunctionType1 <em>Function Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.FunctionType1
	 * @generated
	 */
	public Adapter createFunctionType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.GlossaryType <em>Glossary Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.GlossaryType
	 * @generated
	 */
	public Adapter createGlossaryTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.GlossdefType <em>Glossdef Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.GlossdefType
	 * @generated
	 */
	public Adapter createGlossdefTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.GlossdivType <em>Glossdiv Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.GlossdivType
	 * @generated
	 */
	public Adapter createGlossdivTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.GlossentryType <em>Glossentry Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.GlossentryType
	 * @generated
	 */
	public Adapter createGlossentryTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.GlosslistType <em>Glosslist Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.GlosslistType
	 * @generated
	 */
	public Adapter createGlosslistTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.GlossseealsoType <em>Glossseealso Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.GlossseealsoType
	 * @generated
	 */
	public Adapter createGlossseealsoTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.GlossseeType <em>Glosssee Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.GlossseeType
	 * @generated
	 */
	public Adapter createGlossseeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.GlosstermType <em>Glossterm Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.GlosstermType
	 * @generated
	 */
	public Adapter createGlosstermTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.GroupType <em>Group Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.GroupType
	 * @generated
	 */
	public Adapter createGroupTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.GuibuttonType <em>Guibutton Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.GuibuttonType
	 * @generated
	 */
	public Adapter createGuibuttonTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.GuiiconType <em>Guiicon Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.GuiiconType
	 * @generated
	 */
	public Adapter createGuiiconTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.GuilabelType <em>Guilabel Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.GuilabelType
	 * @generated
	 */
	public Adapter createGuilabelTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.GuimenuitemType <em>Guimenuitem Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.GuimenuitemType
	 * @generated
	 */
	public Adapter createGuimenuitemTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.GuimenuType <em>Guimenu Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.GuimenuType
	 * @generated
	 */
	public Adapter createGuimenuTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.GuisubmenuType <em>Guisubmenu Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.GuisubmenuType
	 * @generated
	 */
	public Adapter createGuisubmenuTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.HardwareType <em>Hardware Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.HardwareType
	 * @generated
	 */
	public Adapter createHardwareTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.HolderType <em>Holder Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.HolderType
	 * @generated
	 */
	public Adapter createHolderTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.HonorificType <em>Honorific Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.HonorificType
	 * @generated
	 */
	public Adapter createHonorificTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.ImagedataType <em>Imagedata Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.ImagedataType
	 * @generated
	 */
	public Adapter createImagedataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.ImageobjectcoType <em>Imageobjectco Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.ImageobjectcoType
	 * @generated
	 */
	public Adapter createImageobjectcoTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.ImageobjectType <em>Imageobject Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.ImageobjectType
	 * @generated
	 */
	public Adapter createImageobjectTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.ImportantType <em>Important Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.ImportantType
	 * @generated
	 */
	public Adapter createImportantTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.IndexdivType <em>Indexdiv Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.IndexdivType
	 * @generated
	 */
	public Adapter createIndexdivTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.IndexentryType <em>Indexentry Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.IndexentryType
	 * @generated
	 */
	public Adapter createIndexentryTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.IndextermType <em>Indexterm Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.IndextermType
	 * @generated
	 */
	public Adapter createIndextermTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.IndexType <em>Index Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.IndexType
	 * @generated
	 */
	public Adapter createIndexTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.InformalequationType <em>Informalequation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.InformalequationType
	 * @generated
	 */
	public Adapter createInformalequationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.InformalexampleType <em>Informalexample Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.InformalexampleType
	 * @generated
	 */
	public Adapter createInformalexampleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.InformalfigureType <em>Informalfigure Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.InformalfigureType
	 * @generated
	 */
	public Adapter createInformalfigureTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.InformaltableType <em>Informaltable Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.InformaltableType
	 * @generated
	 */
	public Adapter createInformaltableTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.InfoType <em>Info Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.InfoType
	 * @generated
	 */
	public Adapter createInfoTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.InitializerType <em>Initializer Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.InitializerType
	 * @generated
	 */
	public Adapter createInitializerTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.InlineequationType <em>Inlineequation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.InlineequationType
	 * @generated
	 */
	public Adapter createInlineequationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.InlinemediaobjectType <em>Inlinemediaobject Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.InlinemediaobjectType
	 * @generated
	 */
	public Adapter createInlinemediaobjectTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.InterfacenameType <em>Interfacename Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.InterfacenameType
	 * @generated
	 */
	public Adapter createInterfacenameTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.IssuenumType <em>Issuenum Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.IssuenumType
	 * @generated
	 */
	public Adapter createIssuenumTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.ItemizedlistType <em>Itemizedlist Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.ItemizedlistType
	 * @generated
	 */
	public Adapter createItemizedlistTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.ItermsetType <em>Itermset Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.ItermsetType
	 * @generated
	 */
	public Adapter createItermsetTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.JobtitleType <em>Jobtitle Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.JobtitleType
	 * @generated
	 */
	public Adapter createJobtitleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.KeycapType <em>Keycap Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.KeycapType
	 * @generated
	 */
	public Adapter createKeycapTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.KeycodeType <em>Keycode Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.KeycodeType
	 * @generated
	 */
	public Adapter createKeycodeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.KeycomboType <em>Keycombo Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.KeycomboType
	 * @generated
	 */
	public Adapter createKeycomboTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.KeysymType <em>Keysym Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.KeysymType
	 * @generated
	 */
	public Adapter createKeysymTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.KeywordsetType <em>Keywordset Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.KeywordsetType
	 * @generated
	 */
	public Adapter createKeywordsetTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.KeywordType <em>Keyword Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.KeywordType
	 * @generated
	 */
	public Adapter createKeywordTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.LabelType <em>Label Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.LabelType
	 * @generated
	 */
	public Adapter createLabelTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.LegalnoticeType <em>Legalnotice Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.LegalnoticeType
	 * @generated
	 */
	public Adapter createLegalnoticeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.LhsType <em>Lhs Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.LhsType
	 * @generated
	 */
	public Adapter createLhsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.LineageType <em>Lineage Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.LineageType
	 * @generated
	 */
	public Adapter createLineageTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.LineannotationType <em>Lineannotation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.LineannotationType
	 * @generated
	 */
	public Adapter createLineannotationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.LinkType <em>Link Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.LinkType
	 * @generated
	 */
	public Adapter createLinkTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.ListitemType <em>Listitem Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.ListitemType
	 * @generated
	 */
	public Adapter createListitemTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.LiterallayoutType <em>Literallayout Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.LiterallayoutType
	 * @generated
	 */
	public Adapter createLiterallayoutTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.LiteralType <em>Literal Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.LiteralType
	 * @generated
	 */
	public Adapter createLiteralTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.LocatorType <em>Locator Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.LocatorType
	 * @generated
	 */
	public Adapter createLocatorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.ManvolnumType <em>Manvolnum Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.ManvolnumType
	 * @generated
	 */
	public Adapter createManvolnumTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.MarkupType <em>Markup Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.MarkupType
	 * @generated
	 */
	public Adapter createMarkupTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.MathphraseType <em>Mathphrase Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.MathphraseType
	 * @generated
	 */
	public Adapter createMathphraseTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.MediaobjectType <em>Mediaobject Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.MediaobjectType
	 * @generated
	 */
	public Adapter createMediaobjectTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.MemberType <em>Member Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.MemberType
	 * @generated
	 */
	public Adapter createMemberTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.MenuchoiceType <em>Menuchoice Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.MenuchoiceType
	 * @generated
	 */
	public Adapter createMenuchoiceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.MethodnameType <em>Methodname Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.MethodnameType
	 * @generated
	 */
	public Adapter createMethodnameTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.MethodparamType <em>Methodparam Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.MethodparamType
	 * @generated
	 */
	public Adapter createMethodparamTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.MethodsynopsisType <em>Methodsynopsis Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.MethodsynopsisType
	 * @generated
	 */
	public Adapter createMethodsynopsisTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.ModifierType <em>Modifier Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.ModifierType
	 * @generated
	 */
	public Adapter createModifierTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.MousebuttonType <em>Mousebutton Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.MousebuttonType
	 * @generated
	 */
	public Adapter createMousebuttonTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.MsgaudType <em>Msgaud Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.MsgaudType
	 * @generated
	 */
	public Adapter createMsgaudTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.MsgentryType <em>Msgentry Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.MsgentryType
	 * @generated
	 */
	public Adapter createMsgentryTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.MsgexplanType <em>Msgexplan Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.MsgexplanType
	 * @generated
	 */
	public Adapter createMsgexplanTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.MsginfoType <em>Msginfo Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.MsginfoType
	 * @generated
	 */
	public Adapter createMsginfoTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.MsglevelType <em>Msglevel Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.MsglevelType
	 * @generated
	 */
	public Adapter createMsglevelTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.MsgmainType <em>Msgmain Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.MsgmainType
	 * @generated
	 */
	public Adapter createMsgmainTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.MsgorigType <em>Msgorig Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.MsgorigType
	 * @generated
	 */
	public Adapter createMsgorigTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.MsgrelType <em>Msgrel Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.MsgrelType
	 * @generated
	 */
	public Adapter createMsgrelTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.MsgsetType <em>Msgset Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.MsgsetType
	 * @generated
	 */
	public Adapter createMsgsetTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.MsgsubType <em>Msgsub Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.MsgsubType
	 * @generated
	 */
	public Adapter createMsgsubTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.MsgtextType <em>Msgtext Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.MsgtextType
	 * @generated
	 */
	public Adapter createMsgtextTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.MsgType <em>Msg Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.MsgType
	 * @generated
	 */
	public Adapter createMsgTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.NonterminalType <em>Nonterminal Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.NonterminalType
	 * @generated
	 */
	public Adapter createNonterminalTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.NoteType <em>Note Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.NoteType
	 * @generated
	 */
	public Adapter createNoteTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.OlinkType <em>Olink Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.OlinkType
	 * @generated
	 */
	public Adapter createOlinkTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.OoclassType <em>Ooclass Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.OoclassType
	 * @generated
	 */
	public Adapter createOoclassTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.OoexceptionType <em>Ooexception Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.OoexceptionType
	 * @generated
	 */
	public Adapter createOoexceptionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.OointerfaceType <em>Oointerface Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.OointerfaceType
	 * @generated
	 */
	public Adapter createOointerfaceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.OptionalType <em>Optional Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.OptionalType
	 * @generated
	 */
	public Adapter createOptionalTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.OptionType <em>Option Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.OptionType
	 * @generated
	 */
	public Adapter createOptionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.OrderedlistType <em>Orderedlist Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.OrderedlistType
	 * @generated
	 */
	public Adapter createOrderedlistTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.OrgdivType <em>Orgdiv Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.OrgdivType
	 * @generated
	 */
	public Adapter createOrgdivTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.OrgnameType <em>Orgname Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.OrgnameType
	 * @generated
	 */
	public Adapter createOrgnameTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.OrgType <em>Org Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.OrgType
	 * @generated
	 */
	public Adapter createOrgTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.OtheraddrType <em>Otheraddr Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.OtheraddrType
	 * @generated
	 */
	public Adapter createOtheraddrTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.OthercreditType <em>Othercredit Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.OthercreditType
	 * @generated
	 */
	public Adapter createOthercreditTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.OthernameType <em>Othername Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.OthernameType
	 * @generated
	 */
	public Adapter createOthernameTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.PackageType <em>Package Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.PackageType
	 * @generated
	 */
	public Adapter createPackageTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.PagenumsType <em>Pagenums Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.PagenumsType
	 * @generated
	 */
	public Adapter createPagenumsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.ParamdefType <em>Paramdef Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.ParamdefType
	 * @generated
	 */
	public Adapter createParamdefTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.ParameterType <em>Parameter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.ParameterType
	 * @generated
	 */
	public Adapter createParameterTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.ParaType <em>Para Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.ParaType
	 * @generated
	 */
	public Adapter createParaTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.PartintroType <em>Partintro Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.PartintroType
	 * @generated
	 */
	public Adapter createPartintroTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.PartType <em>Part Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.PartType
	 * @generated
	 */
	public Adapter createPartTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.PersonblurbType <em>Personblurb Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.PersonblurbType
	 * @generated
	 */
	public Adapter createPersonblurbTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.PersonnameType <em>Personname Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.PersonnameType
	 * @generated
	 */
	public Adapter createPersonnameTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.PersonType <em>Person Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.PersonType
	 * @generated
	 */
	public Adapter createPersonTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.PhoneType <em>Phone Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.PhoneType
	 * @generated
	 */
	public Adapter createPhoneTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.PhraseType <em>Phrase Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.PhraseType
	 * @generated
	 */
	public Adapter createPhraseTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.PobType <em>Pob Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.PobType
	 * @generated
	 */
	public Adapter createPobTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.PostcodeType <em>Postcode Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.PostcodeType
	 * @generated
	 */
	public Adapter createPostcodeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.PrefaceType <em>Preface Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.PrefaceType
	 * @generated
	 */
	public Adapter createPrefaceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.PrimaryieType <em>Primaryie Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.PrimaryieType
	 * @generated
	 */
	public Adapter createPrimaryieTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.PrimaryType <em>Primary Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.PrimaryType
	 * @generated
	 */
	public Adapter createPrimaryTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.PrinthistoryType <em>Printhistory Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.PrinthistoryType
	 * @generated
	 */
	public Adapter createPrinthistoryTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.ProcedureType <em>Procedure Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.ProcedureType
	 * @generated
	 */
	public Adapter createProcedureTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.ProductionrecapType <em>Productionrecap Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.ProductionrecapType
	 * @generated
	 */
	public Adapter createProductionrecapTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.ProductionsetType <em>Productionset Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.ProductionsetType
	 * @generated
	 */
	public Adapter createProductionsetTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.ProductionType <em>Production Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.ProductionType
	 * @generated
	 */
	public Adapter createProductionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.ProductnameType <em>Productname Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.ProductnameType
	 * @generated
	 */
	public Adapter createProductnameTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.ProductnumberType <em>Productnumber Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.ProductnumberType
	 * @generated
	 */
	public Adapter createProductnumberTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.ProgramlistingcoType <em>Programlistingco Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.ProgramlistingcoType
	 * @generated
	 */
	public Adapter createProgramlistingcoTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.ProgramlistingType <em>Programlisting Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.ProgramlistingType
	 * @generated
	 */
	public Adapter createProgramlistingTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.PromptType <em>Prompt Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.PromptType
	 * @generated
	 */
	public Adapter createPromptTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.PropertyType <em>Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.PropertyType
	 * @generated
	 */
	public Adapter createPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.PubdateType <em>Pubdate Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.PubdateType
	 * @generated
	 */
	public Adapter createPubdateTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.PublishernameType <em>Publishername Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.PublishernameType
	 * @generated
	 */
	public Adapter createPublishernameTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.PublisherType <em>Publisher Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.PublisherType
	 * @generated
	 */
	public Adapter createPublisherTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.QandadivType <em>Qandadiv Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.QandadivType
	 * @generated
	 */
	public Adapter createQandadivTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.QandaentryType <em>Qandaentry Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.QandaentryType
	 * @generated
	 */
	public Adapter createQandaentryTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.QandasetType <em>Qandaset Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.QandasetType
	 * @generated
	 */
	public Adapter createQandasetTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.QuestionType <em>Question Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.QuestionType
	 * @generated
	 */
	public Adapter createQuestionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.QuoteType <em>Quote Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.QuoteType
	 * @generated
	 */
	public Adapter createQuoteTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.RefclassType <em>Refclass Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.RefclassType
	 * @generated
	 */
	public Adapter createRefclassTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.RefdescriptorType <em>Refdescriptor Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.RefdescriptorType
	 * @generated
	 */
	public Adapter createRefdescriptorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.RefentrytitleType <em>Refentrytitle Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.RefentrytitleType
	 * @generated
	 */
	public Adapter createRefentrytitleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.RefentryType <em>Refentry Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.RefentryType
	 * @generated
	 */
	public Adapter createRefentryTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.ReferenceType <em>Reference Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.ReferenceType
	 * @generated
	 */
	public Adapter createReferenceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.RefmetaType <em>Refmeta Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.RefmetaType
	 * @generated
	 */
	public Adapter createRefmetaTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.RefmiscinfoType <em>Refmiscinfo Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.RefmiscinfoType
	 * @generated
	 */
	public Adapter createRefmiscinfoTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.RefnamedivType <em>Refnamediv Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.RefnamedivType
	 * @generated
	 */
	public Adapter createRefnamedivTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.RefnameType <em>Refname Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.RefnameType
	 * @generated
	 */
	public Adapter createRefnameTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.RefpurposeType <em>Refpurpose Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.RefpurposeType
	 * @generated
	 */
	public Adapter createRefpurposeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.Refsect1Type <em>Refsect1 Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.Refsect1Type
	 * @generated
	 */
	public Adapter createRefsect1TypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.Refsect2Type <em>Refsect2 Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.Refsect2Type
	 * @generated
	 */
	public Adapter createRefsect2TypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.Refsect3Type <em>Refsect3 Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.Refsect3Type
	 * @generated
	 */
	public Adapter createRefsect3TypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.RefsectionType <em>Refsection Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.RefsectionType
	 * @generated
	 */
	public Adapter createRefsectionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.RefsynopsisdivType <em>Refsynopsisdiv Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.RefsynopsisdivType
	 * @generated
	 */
	public Adapter createRefsynopsisdivTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.ReleaseinfoType <em>Releaseinfo Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.ReleaseinfoType
	 * @generated
	 */
	public Adapter createReleaseinfoTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.RemarkType <em>Remark Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.RemarkType
	 * @generated
	 */
	public Adapter createRemarkTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.ReplaceableType <em>Replaceable Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.ReplaceableType
	 * @generated
	 */
	public Adapter createReplaceableTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.ReturnvalueType <em>Returnvalue Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.ReturnvalueType
	 * @generated
	 */
	public Adapter createReturnvalueTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.RevdescriptionType <em>Revdescription Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.RevdescriptionType
	 * @generated
	 */
	public Adapter createRevdescriptionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.RevhistoryType <em>Revhistory Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.RevhistoryType
	 * @generated
	 */
	public Adapter createRevhistoryTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.RevisionType <em>Revision Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.RevisionType
	 * @generated
	 */
	public Adapter createRevisionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.RevnumberType <em>Revnumber Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.RevnumberType
	 * @generated
	 */
	public Adapter createRevnumberTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.RevremarkType <em>Revremark Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.RevremarkType
	 * @generated
	 */
	public Adapter createRevremarkTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.RhsType <em>Rhs Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.RhsType
	 * @generated
	 */
	public Adapter createRhsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.RowType <em>Row Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.RowType
	 * @generated
	 */
	public Adapter createRowTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.SbrType <em>Sbr Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.SbrType
	 * @generated
	 */
	public Adapter createSbrTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.ScreencoType <em>Screenco Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.ScreencoType
	 * @generated
	 */
	public Adapter createScreencoTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.ScreenshotType <em>Screenshot Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.ScreenshotType
	 * @generated
	 */
	public Adapter createScreenshotTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.ScreenType <em>Screen Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.ScreenType
	 * @generated
	 */
	public Adapter createScreenTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.SecondaryieType <em>Secondaryie Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.SecondaryieType
	 * @generated
	 */
	public Adapter createSecondaryieTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.SecondaryType <em>Secondary Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.SecondaryType
	 * @generated
	 */
	public Adapter createSecondaryTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.Sect1Type <em>Sect1 Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.Sect1Type
	 * @generated
	 */
	public Adapter createSect1TypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.Sect2Type <em>Sect2 Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.Sect2Type
	 * @generated
	 */
	public Adapter createSect2TypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.Sect3Type <em>Sect3 Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.Sect3Type
	 * @generated
	 */
	public Adapter createSect3TypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.Sect4Type <em>Sect4 Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.Sect4Type
	 * @generated
	 */
	public Adapter createSect4TypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.Sect5Type <em>Sect5 Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.Sect5Type
	 * @generated
	 */
	public Adapter createSect5TypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.SectionType <em>Section Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.SectionType
	 * @generated
	 */
	public Adapter createSectionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.SeealsoieType <em>Seealsoie Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.SeealsoieType
	 * @generated
	 */
	public Adapter createSeealsoieTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.SeealsoType <em>Seealso Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.SeealsoType
	 * @generated
	 */
	public Adapter createSeealsoTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.SeeieType <em>Seeie Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.SeeieType
	 * @generated
	 */
	public Adapter createSeeieTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.SeeType <em>See Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.SeeType
	 * @generated
	 */
	public Adapter createSeeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.SeglistitemType <em>Seglistitem Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.SeglistitemType
	 * @generated
	 */
	public Adapter createSeglistitemTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.SegmentedlistType <em>Segmentedlist Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.SegmentedlistType
	 * @generated
	 */
	public Adapter createSegmentedlistTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.SegtitleType <em>Segtitle Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.SegtitleType
	 * @generated
	 */
	public Adapter createSegtitleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.SegType <em>Seg Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.SegType
	 * @generated
	 */
	public Adapter createSegTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.SeriesvolnumsType <em>Seriesvolnums Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.SeriesvolnumsType
	 * @generated
	 */
	public Adapter createSeriesvolnumsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.SetindexType <em>Setindex Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.SetindexType
	 * @generated
	 */
	public Adapter createSetindexTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.SetType <em>Set Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.SetType
	 * @generated
	 */
	public Adapter createSetTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.ShortaffilType <em>Shortaffil Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.ShortaffilType
	 * @generated
	 */
	public Adapter createShortaffilTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.ShortcutType <em>Shortcut Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.ShortcutType
	 * @generated
	 */
	public Adapter createShortcutTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.SidebarType <em>Sidebar Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.SidebarType
	 * @generated
	 */
	public Adapter createSidebarTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.SimparaType <em>Simpara Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.SimparaType
	 * @generated
	 */
	public Adapter createSimparaTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.SimplelistType <em>Simplelist Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.SimplelistType
	 * @generated
	 */
	public Adapter createSimplelistTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.SimplemsgentryType <em>Simplemsgentry Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.SimplemsgentryType
	 * @generated
	 */
	public Adapter createSimplemsgentryTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.SimplesectType <em>Simplesect Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.SimplesectType
	 * @generated
	 */
	public Adapter createSimplesectTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.SpanspecType <em>Spanspec Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.SpanspecType
	 * @generated
	 */
	public Adapter createSpanspecTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.StateType <em>State Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.StateType
	 * @generated
	 */
	public Adapter createStateTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.StepalternativesType <em>Stepalternatives Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.StepalternativesType
	 * @generated
	 */
	public Adapter createStepalternativesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.StepType <em>Step Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.StepType
	 * @generated
	 */
	public Adapter createStepTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.StreetType <em>Street Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.StreetType
	 * @generated
	 */
	public Adapter createStreetTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.SubjectsetType <em>Subjectset Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.SubjectsetType
	 * @generated
	 */
	public Adapter createSubjectsetTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.SubjecttermType <em>Subjectterm Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.SubjecttermType
	 * @generated
	 */
	public Adapter createSubjecttermTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.SubjectType <em>Subject Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.SubjectType
	 * @generated
	 */
	public Adapter createSubjectTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.SubscriptType <em>Subscript Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.SubscriptType
	 * @generated
	 */
	public Adapter createSubscriptTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.SubstepsType <em>Substeps Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.SubstepsType
	 * @generated
	 */
	public Adapter createSubstepsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.SubtitleType <em>Subtitle Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.SubtitleType
	 * @generated
	 */
	public Adapter createSubtitleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.SuperscriptType <em>Superscript Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.SuperscriptType
	 * @generated
	 */
	public Adapter createSuperscriptTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.SurnameType <em>Surname Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.SurnameType
	 * @generated
	 */
	public Adapter createSurnameTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.SymbolType <em>Symbol Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.SymbolType
	 * @generated
	 */
	public Adapter createSymbolTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.SynopfragmentrefType <em>Synopfragmentref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.SynopfragmentrefType
	 * @generated
	 */
	public Adapter createSynopfragmentrefTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.SynopfragmentType <em>Synopfragment Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.SynopfragmentType
	 * @generated
	 */
	public Adapter createSynopfragmentTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.SynopsisType <em>Synopsis Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.SynopsisType
	 * @generated
	 */
	public Adapter createSynopsisTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.SystemitemType <em>Systemitem Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.SystemitemType
	 * @generated
	 */
	public Adapter createSystemitemTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.TableType <em>Table Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.TableType
	 * @generated
	 */
	public Adapter createTableTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.TagType <em>Tag Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.TagType
	 * @generated
	 */
	public Adapter createTagTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.TaskprerequisitesType <em>Taskprerequisites Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.TaskprerequisitesType
	 * @generated
	 */
	public Adapter createTaskprerequisitesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.TaskrelatedType <em>Taskrelated Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.TaskrelatedType
	 * @generated
	 */
	public Adapter createTaskrelatedTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.TasksummaryType <em>Tasksummary Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.TasksummaryType
	 * @generated
	 */
	public Adapter createTasksummaryTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.TaskType <em>Task Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.TaskType
	 * @generated
	 */
	public Adapter createTaskTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.TbodyType <em>Tbody Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.TbodyType
	 * @generated
	 */
	public Adapter createTbodyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.TdType <em>Td Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.TdType
	 * @generated
	 */
	public Adapter createTdTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.TermdefType <em>Termdef Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.TermdefType
	 * @generated
	 */
	public Adapter createTermdefTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.TermType <em>Term Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.TermType
	 * @generated
	 */
	public Adapter createTermTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.TertiaryieType <em>Tertiaryie Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.TertiaryieType
	 * @generated
	 */
	public Adapter createTertiaryieTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.TertiaryType <em>Tertiary Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.TertiaryType
	 * @generated
	 */
	public Adapter createTertiaryTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.TextdataType <em>Textdata Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.TextdataType
	 * @generated
	 */
	public Adapter createTextdataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.TextobjectType <em>Textobject Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.TextobjectType
	 * @generated
	 */
	public Adapter createTextobjectTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.TfootType <em>Tfoot Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.TfootType
	 * @generated
	 */
	public Adapter createTfootTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.TgroupType <em>Tgroup Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.TgroupType
	 * @generated
	 */
	public Adapter createTgroupTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.TheadType <em>Thead Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.TheadType
	 * @generated
	 */
	public Adapter createTheadTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.ThType <em>Th Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.ThType
	 * @generated
	 */
	public Adapter createThTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.TipType <em>Tip Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.TipType
	 * @generated
	 */
	public Adapter createTipTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.TitleabbrevType <em>Titleabbrev Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.TitleabbrevType
	 * @generated
	 */
	public Adapter createTitleabbrevTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.TitleType <em>Title Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.TitleType
	 * @generated
	 */
	public Adapter createTitleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.TocdivType <em>Tocdiv Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.TocdivType
	 * @generated
	 */
	public Adapter createTocdivTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.TocentryType <em>Tocentry Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.TocentryType
	 * @generated
	 */
	public Adapter createTocentryTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.TocType <em>Toc Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.TocType
	 * @generated
	 */
	public Adapter createTocTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.TokenType <em>Token Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.TokenType
	 * @generated
	 */
	public Adapter createTokenTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.TrademarkType <em>Trademark Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.TrademarkType
	 * @generated
	 */
	public Adapter createTrademarkTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.TrType <em>Tr Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.TrType
	 * @generated
	 */
	public Adapter createTrTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.TypeType2 <em>Type Type2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.TypeType2
	 * @generated
	 */
	public Adapter createTypeType2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.UriType <em>Uri Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.UriType
	 * @generated
	 */
	public Adapter createUriTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.UserinputType <em>Userinput Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.UserinputType
	 * @generated
	 */
	public Adapter createUserinputTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.VarargsType <em>Varargs Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.VarargsType
	 * @generated
	 */
	public Adapter createVarargsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.VariablelistType <em>Variablelist Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.VariablelistType
	 * @generated
	 */
	public Adapter createVariablelistTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.VarlistentryType <em>Varlistentry Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.VarlistentryType
	 * @generated
	 */
	public Adapter createVarlistentryTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.VarnameType <em>Varname Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.VarnameType
	 * @generated
	 */
	public Adapter createVarnameTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.VideodataType <em>Videodata Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.VideodataType
	 * @generated
	 */
	public Adapter createVideodataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.VideoobjectType <em>Videoobject Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.VideoobjectType
	 * @generated
	 */
	public Adapter createVideoobjectTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.VoidType <em>Void Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.VoidType
	 * @generated
	 */
	public Adapter createVoidTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.VolumenumType <em>Volumenum Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.VolumenumType
	 * @generated
	 */
	public Adapter createVolumenumTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.WarningType <em>Warning Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.WarningType
	 * @generated
	 */
	public Adapter createWarningTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.WordaswordType <em>Wordasword Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.WordaswordType
	 * @generated
	 */
	public Adapter createWordaswordTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.XrefType <em>Xref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.XrefType
	 * @generated
	 */
	public Adapter createXrefTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.docbook.ns.docbook.YearType <em>Year Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.docbook.ns.docbook.YearType
	 * @generated
	 */
	public Adapter createYearTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //DocbookAdapterFactory
