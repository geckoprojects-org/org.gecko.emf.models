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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.docbook.ns.docbook.DocbookPackage
 * @generated
 */
public class DocbookSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DocbookPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocbookSwitch() {
		if (modelPackage == null) {
			modelPackage = DocbookPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case DocbookPackage.ABBREV_TYPE: {
				AbbrevType abbrevType = (AbbrevType)theEObject;
				T result = caseAbbrevType(abbrevType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.ABSTRACT_TYPE: {
				AbstractType abstractType = (AbstractType)theEObject;
				T result = caseAbstractType(abstractType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.ACCEL_TYPE: {
				AccelType accelType = (AccelType)theEObject;
				T result = caseAccelType(accelType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.ACKNOWLEDGEMENTS_TYPE: {
				AcknowledgementsType acknowledgementsType = (AcknowledgementsType)theEObject;
				T result = caseAcknowledgementsType(acknowledgementsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.ACRONYM_TYPE: {
				AcronymType acronymType = (AcronymType)theEObject;
				T result = caseAcronymType(acronymType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.ADDRESS_TYPE: {
				AddressType addressType = (AddressType)theEObject;
				T result = caseAddressType(addressType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.AFFILIATION_TYPE: {
				AffiliationType affiliationType = (AffiliationType)theEObject;
				T result = caseAffiliationType(affiliationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.ALT_TYPE: {
				AltType altType = (AltType)theEObject;
				T result = caseAltType(altType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.ANCHOR_TYPE: {
				AnchorType anchorType = (AnchorType)theEObject;
				T result = caseAnchorType(anchorType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.ANNOTATION_TYPE: {
				AnnotationType annotationType = (AnnotationType)theEObject;
				T result = caseAnnotationType(annotationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.ANSWER_TYPE: {
				AnswerType answerType = (AnswerType)theEObject;
				T result = caseAnswerType(answerType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.APPENDIX_TYPE: {
				AppendixType appendixType = (AppendixType)theEObject;
				T result = caseAppendixType(appendixType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.APPLICATION_TYPE: {
				ApplicationType applicationType = (ApplicationType)theEObject;
				T result = caseApplicationType(applicationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.ARC_TYPE: {
				ArcType arcType = (ArcType)theEObject;
				T result = caseArcType(arcType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.AREASET_TYPE: {
				AreasetType areasetType = (AreasetType)theEObject;
				T result = caseAreasetType(areasetType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.AREASPEC_TYPE: {
				AreaspecType areaspecType = (AreaspecType)theEObject;
				T result = caseAreaspecType(areaspecType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.AREA_TYPE: {
				AreaType areaType = (AreaType)theEObject;
				T result = caseAreaType(areaType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.ARG_TYPE: {
				ArgType argType = (ArgType)theEObject;
				T result = caseArgType(argType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.ARTICLE_TYPE: {
				ArticleType articleType = (ArticleType)theEObject;
				T result = caseArticleType(articleType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.ARTPAGENUMS_TYPE: {
				ArtpagenumsType artpagenumsType = (ArtpagenumsType)theEObject;
				T result = caseArtpagenumsType(artpagenumsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.ATTRIBUTION_TYPE: {
				AttributionType attributionType = (AttributionType)theEObject;
				T result = caseAttributionType(attributionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.AUDIODATA_TYPE: {
				AudiodataType audiodataType = (AudiodataType)theEObject;
				T result = caseAudiodataType(audiodataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.AUDIOOBJECT_TYPE: {
				AudioobjectType audioobjectType = (AudioobjectType)theEObject;
				T result = caseAudioobjectType(audioobjectType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.AUTHORGROUP_TYPE: {
				AuthorgroupType authorgroupType = (AuthorgroupType)theEObject;
				T result = caseAuthorgroupType(authorgroupType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.AUTHORINITIALS_TYPE: {
				AuthorinitialsType authorinitialsType = (AuthorinitialsType)theEObject;
				T result = caseAuthorinitialsType(authorinitialsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.AUTHOR_TYPE: {
				AuthorType authorType = (AuthorType)theEObject;
				T result = caseAuthorType(authorType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.BIBLIOCOVERAGE_TYPE: {
				BibliocoverageType bibliocoverageType = (BibliocoverageType)theEObject;
				T result = caseBibliocoverageType(bibliocoverageType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.BIBLIODIV_TYPE: {
				BibliodivType bibliodivType = (BibliodivType)theEObject;
				T result = caseBibliodivType(bibliodivType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.BIBLIOENTRY_TYPE: {
				BiblioentryType biblioentryType = (BiblioentryType)theEObject;
				T result = caseBiblioentryType(biblioentryType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.BIBLIOGRAPHY_TYPE: {
				BibliographyType bibliographyType = (BibliographyType)theEObject;
				T result = caseBibliographyType(bibliographyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.BIBLIOID_TYPE: {
				BiblioidType biblioidType = (BiblioidType)theEObject;
				T result = caseBiblioidType(biblioidType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.BIBLIOLIST_TYPE: {
				BibliolistType bibliolistType = (BibliolistType)theEObject;
				T result = caseBibliolistType(bibliolistType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.BIBLIOMISC_TYPE: {
				BibliomiscType bibliomiscType = (BibliomiscType)theEObject;
				T result = caseBibliomiscType(bibliomiscType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.BIBLIOMIXED_TYPE: {
				BibliomixedType bibliomixedType = (BibliomixedType)theEObject;
				T result = caseBibliomixedType(bibliomixedType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.BIBLIOMSET_TYPE: {
				BibliomsetType bibliomsetType = (BibliomsetType)theEObject;
				T result = caseBibliomsetType(bibliomsetType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.BIBLIOREF_TYPE: {
				BibliorefType bibliorefType = (BibliorefType)theEObject;
				T result = caseBibliorefType(bibliorefType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.BIBLIORELATION_TYPE: {
				BibliorelationType bibliorelationType = (BibliorelationType)theEObject;
				T result = caseBibliorelationType(bibliorelationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.BIBLIOSET_TYPE: {
				BibliosetType bibliosetType = (BibliosetType)theEObject;
				T result = caseBibliosetType(bibliosetType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.BIBLIOSOURCE_TYPE: {
				BibliosourceType bibliosourceType = (BibliosourceType)theEObject;
				T result = caseBibliosourceType(bibliosourceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.BLOCKQUOTE_TYPE: {
				BlockquoteType blockquoteType = (BlockquoteType)theEObject;
				T result = caseBlockquoteType(blockquoteType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.BOOK_TYPE: {
				BookType bookType = (BookType)theEObject;
				T result = caseBookType(bookType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.BRIDGEHEAD_TYPE: {
				BridgeheadType bridgeheadType = (BridgeheadType)theEObject;
				T result = caseBridgeheadType(bridgeheadType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.CALLOUTLIST_TYPE: {
				CalloutlistType calloutlistType = (CalloutlistType)theEObject;
				T result = caseCalloutlistType(calloutlistType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.CALLOUT_TYPE: {
				CalloutType calloutType = (CalloutType)theEObject;
				T result = caseCalloutType(calloutType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.CAPTION_TYPE: {
				CaptionType captionType = (CaptionType)theEObject;
				T result = caseCaptionType(captionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.CAUTION_TYPE: {
				CautionType cautionType = (CautionType)theEObject;
				T result = caseCautionType(cautionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.CHAPTER_TYPE: {
				ChapterType chapterType = (ChapterType)theEObject;
				T result = caseChapterType(chapterType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.CITATION_TYPE: {
				CitationType citationType = (CitationType)theEObject;
				T result = caseCitationType(citationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.CITEBIBLIOID_TYPE: {
				CitebiblioidType citebiblioidType = (CitebiblioidType)theEObject;
				T result = caseCitebiblioidType(citebiblioidType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.CITEREFENTRY_TYPE: {
				CiterefentryType citerefentryType = (CiterefentryType)theEObject;
				T result = caseCiterefentryType(citerefentryType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.CITETITLE_TYPE: {
				CitetitleType citetitleType = (CitetitleType)theEObject;
				T result = caseCitetitleType(citetitleType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.CITY_TYPE: {
				CityType cityType = (CityType)theEObject;
				T result = caseCityType(cityType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.CLASSNAME_TYPE: {
				ClassnameType classnameType = (ClassnameType)theEObject;
				T result = caseClassnameType(classnameType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.CLASSSYNOPSISINFO_TYPE: {
				ClasssynopsisinfoType classsynopsisinfoType = (ClasssynopsisinfoType)theEObject;
				T result = caseClasssynopsisinfoType(classsynopsisinfoType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.CLASSSYNOPSIS_TYPE: {
				ClasssynopsisType classsynopsisType = (ClasssynopsisType)theEObject;
				T result = caseClasssynopsisType(classsynopsisType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.CMDSYNOPSIS_TYPE: {
				CmdsynopsisType cmdsynopsisType = (CmdsynopsisType)theEObject;
				T result = caseCmdsynopsisType(cmdsynopsisType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.CODE_TYPE: {
				CodeType codeType = (CodeType)theEObject;
				T result = caseCodeType(codeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.COLGROUP_TYPE: {
				ColgroupType colgroupType = (ColgroupType)theEObject;
				T result = caseColgroupType(colgroupType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.COLLAB_TYPE: {
				CollabType collabType = (CollabType)theEObject;
				T result = caseCollabType(collabType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.COLOPHON_TYPE: {
				ColophonType colophonType = (ColophonType)theEObject;
				T result = caseColophonType(colophonType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.COLSPEC_TYPE: {
				ColspecType colspecType = (ColspecType)theEObject;
				T result = caseColspecType(colspecType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.COL_TYPE: {
				ColType colType = (ColType)theEObject;
				T result = caseColType(colType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.COMMAND_TYPE: {
				CommandType commandType = (CommandType)theEObject;
				T result = caseCommandType(commandType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.COMPUTEROUTPUT_TYPE: {
				ComputeroutputType computeroutputType = (ComputeroutputType)theEObject;
				T result = caseComputeroutputType(computeroutputType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.CONFDATES_TYPE: {
				ConfdatesType confdatesType = (ConfdatesType)theEObject;
				T result = caseConfdatesType(confdatesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.CONFGROUP_TYPE: {
				ConfgroupType confgroupType = (ConfgroupType)theEObject;
				T result = caseConfgroupType(confgroupType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.CONFNUM_TYPE: {
				ConfnumType confnumType = (ConfnumType)theEObject;
				T result = caseConfnumType(confnumType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.CONFSPONSOR_TYPE: {
				ConfsponsorType confsponsorType = (ConfsponsorType)theEObject;
				T result = caseConfsponsorType(confsponsorType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.CONFTITLE_TYPE: {
				ConftitleType conftitleType = (ConftitleType)theEObject;
				T result = caseConftitleType(conftitleType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.CONSTANT_TYPE: {
				ConstantType constantType = (ConstantType)theEObject;
				T result = caseConstantType(constantType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.CONSTRAINTDEF_TYPE: {
				ConstraintdefType constraintdefType = (ConstraintdefType)theEObject;
				T result = caseConstraintdefType(constraintdefType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.CONSTRAINT_TYPE: {
				ConstraintType constraintType = (ConstraintType)theEObject;
				T result = caseConstraintType(constraintType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.CONSTRUCTORSYNOPSIS_TYPE: {
				ConstructorsynopsisType constructorsynopsisType = (ConstructorsynopsisType)theEObject;
				T result = caseConstructorsynopsisType(constructorsynopsisType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.CONTRACTNUM_TYPE: {
				ContractnumType contractnumType = (ContractnumType)theEObject;
				T result = caseContractnumType(contractnumType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.CONTRACTSPONSOR_TYPE: {
				ContractsponsorType contractsponsorType = (ContractsponsorType)theEObject;
				T result = caseContractsponsorType(contractsponsorType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.CONTRIB_TYPE: {
				ContribType contribType = (ContribType)theEObject;
				T result = caseContribType(contribType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.COPYRIGHT_TYPE: {
				CopyrightType copyrightType = (CopyrightType)theEObject;
				T result = caseCopyrightType(copyrightType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.COREF_TYPE: {
				CorefType corefType = (CorefType)theEObject;
				T result = caseCorefType(corefType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.CO_TYPE: {
				CoType coType = (CoType)theEObject;
				T result = caseCoType(coType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.COUNTRY_TYPE: {
				CountryType countryType = (CountryType)theEObject;
				T result = caseCountryType(countryType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.COVER_TYPE: {
				CoverType coverType = (CoverType)theEObject;
				T result = caseCoverType(coverType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.DATABASE_TYPE: {
				DatabaseType databaseType = (DatabaseType)theEObject;
				T result = caseDatabaseType(databaseType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.DATE_TYPE: {
				DateType dateType = (DateType)theEObject;
				T result = caseDateType(dateType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.DEDICATION_TYPE: {
				DedicationType dedicationType = (DedicationType)theEObject;
				T result = caseDedicationType(dedicationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.DESTRUCTORSYNOPSIS_TYPE: {
				DestructorsynopsisType destructorsynopsisType = (DestructorsynopsisType)theEObject;
				T result = caseDestructorsynopsisType(destructorsynopsisType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.DOCUMENT_ROOT: {
				DocumentRoot documentRoot = (DocumentRoot)theEObject;
				T result = caseDocumentRoot(documentRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.EDITION_TYPE: {
				EditionType editionType = (EditionType)theEObject;
				T result = caseEditionType(editionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.EDITOR_TYPE: {
				EditorType editorType = (EditorType)theEObject;
				T result = caseEditorType(editorType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.EMAIL_TYPE: {
				EmailType emailType = (EmailType)theEObject;
				T result = caseEmailType(emailType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.EMPHASIS_TYPE: {
				EmphasisType emphasisType = (EmphasisType)theEObject;
				T result = caseEmphasisType(emphasisType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.ENTRYTBL_TYPE: {
				EntrytblType entrytblType = (EntrytblType)theEObject;
				T result = caseEntrytblType(entrytblType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.ENTRY_TYPE: {
				EntryType entryType = (EntryType)theEObject;
				T result = caseEntryType(entryType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.ENVAR_TYPE: {
				EnvarType envarType = (EnvarType)theEObject;
				T result = caseEnvarType(envarType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.EPIGRAPH_TYPE: {
				EpigraphType epigraphType = (EpigraphType)theEObject;
				T result = caseEpigraphType(epigraphType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.EQUATION_TYPE: {
				EquationType equationType = (EquationType)theEObject;
				T result = caseEquationType(equationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.ERRORCODE_TYPE: {
				ErrorcodeType errorcodeType = (ErrorcodeType)theEObject;
				T result = caseErrorcodeType(errorcodeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.ERRORNAME_TYPE: {
				ErrornameType errornameType = (ErrornameType)theEObject;
				T result = caseErrornameType(errornameType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.ERRORTEXT_TYPE: {
				ErrortextType errortextType = (ErrortextType)theEObject;
				T result = caseErrortextType(errortextType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.ERRORTYPE_TYPE: {
				ErrortypeType errortypeType = (ErrortypeType)theEObject;
				T result = caseErrortypeType(errortypeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.EXAMPLE_TYPE: {
				ExampleType exampleType = (ExampleType)theEObject;
				T result = caseExampleType(exampleType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.EXCEPTIONNAME_TYPE: {
				ExceptionnameType exceptionnameType = (ExceptionnameType)theEObject;
				T result = caseExceptionnameType(exceptionnameType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.EXTENDEDLINK_TYPE: {
				ExtendedlinkType extendedlinkType = (ExtendedlinkType)theEObject;
				T result = caseExtendedlinkType(extendedlinkType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.FAX_TYPE: {
				FaxType faxType = (FaxType)theEObject;
				T result = caseFaxType(faxType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.FIELDSYNOPSIS_TYPE: {
				FieldsynopsisType fieldsynopsisType = (FieldsynopsisType)theEObject;
				T result = caseFieldsynopsisType(fieldsynopsisType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.FIGURE_TYPE: {
				FigureType figureType = (FigureType)theEObject;
				T result = caseFigureType(figureType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.FILENAME_TYPE: {
				FilenameType filenameType = (FilenameType)theEObject;
				T result = caseFilenameType(filenameType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.FIRSTNAME_TYPE: {
				FirstnameType firstnameType = (FirstnameType)theEObject;
				T result = caseFirstnameType(firstnameType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.FIRSTTERM_TYPE: {
				FirsttermType firsttermType = (FirsttermType)theEObject;
				T result = caseFirsttermType(firsttermType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.FOOTNOTEREF_TYPE: {
				FootnoterefType footnoterefType = (FootnoterefType)theEObject;
				T result = caseFootnoterefType(footnoterefType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.FOOTNOTE_TYPE: {
				FootnoteType footnoteType = (FootnoteType)theEObject;
				T result = caseFootnoteType(footnoteType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.FOREIGNPHRASE_TYPE: {
				ForeignphraseType foreignphraseType = (ForeignphraseType)theEObject;
				T result = caseForeignphraseType(foreignphraseType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.FORMALPARA_TYPE: {
				FormalparaType formalparaType = (FormalparaType)theEObject;
				T result = caseFormalparaType(formalparaType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.FUNCDEF_TYPE: {
				FuncdefType funcdefType = (FuncdefType)theEObject;
				T result = caseFuncdefType(funcdefType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.FUNCPARAMS_TYPE: {
				FuncparamsType funcparamsType = (FuncparamsType)theEObject;
				T result = caseFuncparamsType(funcparamsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.FUNCPROTOTYPE_TYPE: {
				FuncprototypeType funcprototypeType = (FuncprototypeType)theEObject;
				T result = caseFuncprototypeType(funcprototypeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.FUNCSYNOPSISINFO_TYPE: {
				FuncsynopsisinfoType funcsynopsisinfoType = (FuncsynopsisinfoType)theEObject;
				T result = caseFuncsynopsisinfoType(funcsynopsisinfoType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.FUNCSYNOPSIS_TYPE: {
				FuncsynopsisType funcsynopsisType = (FuncsynopsisType)theEObject;
				T result = caseFuncsynopsisType(funcsynopsisType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.FUNCTION_TYPE1: {
				FunctionType1 functionType1 = (FunctionType1)theEObject;
				T result = caseFunctionType1(functionType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.GLOSSARY_TYPE: {
				GlossaryType glossaryType = (GlossaryType)theEObject;
				T result = caseGlossaryType(glossaryType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.GLOSSDEF_TYPE: {
				GlossdefType glossdefType = (GlossdefType)theEObject;
				T result = caseGlossdefType(glossdefType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.GLOSSDIV_TYPE: {
				GlossdivType glossdivType = (GlossdivType)theEObject;
				T result = caseGlossdivType(glossdivType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.GLOSSENTRY_TYPE: {
				GlossentryType glossentryType = (GlossentryType)theEObject;
				T result = caseGlossentryType(glossentryType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.GLOSSLIST_TYPE: {
				GlosslistType glosslistType = (GlosslistType)theEObject;
				T result = caseGlosslistType(glosslistType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.GLOSSSEEALSO_TYPE: {
				GlossseealsoType glossseealsoType = (GlossseealsoType)theEObject;
				T result = caseGlossseealsoType(glossseealsoType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.GLOSSSEE_TYPE: {
				GlossseeType glossseeType = (GlossseeType)theEObject;
				T result = caseGlossseeType(glossseeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.GLOSSTERM_TYPE: {
				GlosstermType glosstermType = (GlosstermType)theEObject;
				T result = caseGlosstermType(glosstermType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.GROUP_TYPE: {
				GroupType groupType = (GroupType)theEObject;
				T result = caseGroupType(groupType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.GUIBUTTON_TYPE: {
				GuibuttonType guibuttonType = (GuibuttonType)theEObject;
				T result = caseGuibuttonType(guibuttonType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.GUIICON_TYPE: {
				GuiiconType guiiconType = (GuiiconType)theEObject;
				T result = caseGuiiconType(guiiconType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.GUILABEL_TYPE: {
				GuilabelType guilabelType = (GuilabelType)theEObject;
				T result = caseGuilabelType(guilabelType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.GUIMENUITEM_TYPE: {
				GuimenuitemType guimenuitemType = (GuimenuitemType)theEObject;
				T result = caseGuimenuitemType(guimenuitemType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.GUIMENU_TYPE: {
				GuimenuType guimenuType = (GuimenuType)theEObject;
				T result = caseGuimenuType(guimenuType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.GUISUBMENU_TYPE: {
				GuisubmenuType guisubmenuType = (GuisubmenuType)theEObject;
				T result = caseGuisubmenuType(guisubmenuType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.HARDWARE_TYPE: {
				HardwareType hardwareType = (HardwareType)theEObject;
				T result = caseHardwareType(hardwareType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.HOLDER_TYPE: {
				HolderType holderType = (HolderType)theEObject;
				T result = caseHolderType(holderType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.HONORIFIC_TYPE: {
				HonorificType honorificType = (HonorificType)theEObject;
				T result = caseHonorificType(honorificType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.IMAGEDATA_TYPE: {
				ImagedataType imagedataType = (ImagedataType)theEObject;
				T result = caseImagedataType(imagedataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.IMAGEOBJECTCO_TYPE: {
				ImageobjectcoType imageobjectcoType = (ImageobjectcoType)theEObject;
				T result = caseImageobjectcoType(imageobjectcoType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.IMAGEOBJECT_TYPE: {
				ImageobjectType imageobjectType = (ImageobjectType)theEObject;
				T result = caseImageobjectType(imageobjectType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.IMPORTANT_TYPE: {
				ImportantType importantType = (ImportantType)theEObject;
				T result = caseImportantType(importantType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.INDEXDIV_TYPE: {
				IndexdivType indexdivType = (IndexdivType)theEObject;
				T result = caseIndexdivType(indexdivType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.INDEXENTRY_TYPE: {
				IndexentryType indexentryType = (IndexentryType)theEObject;
				T result = caseIndexentryType(indexentryType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.INDEXTERM_TYPE: {
				IndextermType indextermType = (IndextermType)theEObject;
				T result = caseIndextermType(indextermType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.INDEX_TYPE: {
				IndexType indexType = (IndexType)theEObject;
				T result = caseIndexType(indexType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.INFORMALEQUATION_TYPE: {
				InformalequationType informalequationType = (InformalequationType)theEObject;
				T result = caseInformalequationType(informalequationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.INFORMALEXAMPLE_TYPE: {
				InformalexampleType informalexampleType = (InformalexampleType)theEObject;
				T result = caseInformalexampleType(informalexampleType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.INFORMALFIGURE_TYPE: {
				InformalfigureType informalfigureType = (InformalfigureType)theEObject;
				T result = caseInformalfigureType(informalfigureType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.INFORMALTABLE_TYPE: {
				InformaltableType informaltableType = (InformaltableType)theEObject;
				T result = caseInformaltableType(informaltableType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.INFO_TYPE: {
				InfoType infoType = (InfoType)theEObject;
				T result = caseInfoType(infoType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.INITIALIZER_TYPE: {
				InitializerType initializerType = (InitializerType)theEObject;
				T result = caseInitializerType(initializerType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.INLINEEQUATION_TYPE: {
				InlineequationType inlineequationType = (InlineequationType)theEObject;
				T result = caseInlineequationType(inlineequationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.INLINEMEDIAOBJECT_TYPE: {
				InlinemediaobjectType inlinemediaobjectType = (InlinemediaobjectType)theEObject;
				T result = caseInlinemediaobjectType(inlinemediaobjectType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.INTERFACENAME_TYPE: {
				InterfacenameType interfacenameType = (InterfacenameType)theEObject;
				T result = caseInterfacenameType(interfacenameType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.ISSUENUM_TYPE: {
				IssuenumType issuenumType = (IssuenumType)theEObject;
				T result = caseIssuenumType(issuenumType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.ITEMIZEDLIST_TYPE: {
				ItemizedlistType itemizedlistType = (ItemizedlistType)theEObject;
				T result = caseItemizedlistType(itemizedlistType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.ITERMSET_TYPE: {
				ItermsetType itermsetType = (ItermsetType)theEObject;
				T result = caseItermsetType(itermsetType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.JOBTITLE_TYPE: {
				JobtitleType jobtitleType = (JobtitleType)theEObject;
				T result = caseJobtitleType(jobtitleType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.KEYCAP_TYPE: {
				KeycapType keycapType = (KeycapType)theEObject;
				T result = caseKeycapType(keycapType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.KEYCODE_TYPE: {
				KeycodeType keycodeType = (KeycodeType)theEObject;
				T result = caseKeycodeType(keycodeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.KEYCOMBO_TYPE: {
				KeycomboType keycomboType = (KeycomboType)theEObject;
				T result = caseKeycomboType(keycomboType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.KEYSYM_TYPE: {
				KeysymType keysymType = (KeysymType)theEObject;
				T result = caseKeysymType(keysymType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.KEYWORDSET_TYPE: {
				KeywordsetType keywordsetType = (KeywordsetType)theEObject;
				T result = caseKeywordsetType(keywordsetType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.KEYWORD_TYPE: {
				KeywordType keywordType = (KeywordType)theEObject;
				T result = caseKeywordType(keywordType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.LABEL_TYPE: {
				LabelType labelType = (LabelType)theEObject;
				T result = caseLabelType(labelType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.LEGALNOTICE_TYPE: {
				LegalnoticeType legalnoticeType = (LegalnoticeType)theEObject;
				T result = caseLegalnoticeType(legalnoticeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.LHS_TYPE: {
				LhsType lhsType = (LhsType)theEObject;
				T result = caseLhsType(lhsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.LINEAGE_TYPE: {
				LineageType lineageType = (LineageType)theEObject;
				T result = caseLineageType(lineageType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.LINEANNOTATION_TYPE: {
				LineannotationType lineannotationType = (LineannotationType)theEObject;
				T result = caseLineannotationType(lineannotationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.LINK_TYPE: {
				LinkType linkType = (LinkType)theEObject;
				T result = caseLinkType(linkType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.LISTITEM_TYPE: {
				ListitemType listitemType = (ListitemType)theEObject;
				T result = caseListitemType(listitemType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.LITERALLAYOUT_TYPE: {
				LiterallayoutType literallayoutType = (LiterallayoutType)theEObject;
				T result = caseLiterallayoutType(literallayoutType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.LITERAL_TYPE: {
				LiteralType literalType = (LiteralType)theEObject;
				T result = caseLiteralType(literalType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.LOCATOR_TYPE: {
				LocatorType locatorType = (LocatorType)theEObject;
				T result = caseLocatorType(locatorType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.MANVOLNUM_TYPE: {
				ManvolnumType manvolnumType = (ManvolnumType)theEObject;
				T result = caseManvolnumType(manvolnumType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.MARKUP_TYPE: {
				MarkupType markupType = (MarkupType)theEObject;
				T result = caseMarkupType(markupType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.MATHPHRASE_TYPE: {
				MathphraseType mathphraseType = (MathphraseType)theEObject;
				T result = caseMathphraseType(mathphraseType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.MEDIAOBJECT_TYPE: {
				MediaobjectType mediaobjectType = (MediaobjectType)theEObject;
				T result = caseMediaobjectType(mediaobjectType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.MEMBER_TYPE: {
				MemberType memberType = (MemberType)theEObject;
				T result = caseMemberType(memberType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.MENUCHOICE_TYPE: {
				MenuchoiceType menuchoiceType = (MenuchoiceType)theEObject;
				T result = caseMenuchoiceType(menuchoiceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.METHODNAME_TYPE: {
				MethodnameType methodnameType = (MethodnameType)theEObject;
				T result = caseMethodnameType(methodnameType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.METHODPARAM_TYPE: {
				MethodparamType methodparamType = (MethodparamType)theEObject;
				T result = caseMethodparamType(methodparamType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.METHODSYNOPSIS_TYPE: {
				MethodsynopsisType methodsynopsisType = (MethodsynopsisType)theEObject;
				T result = caseMethodsynopsisType(methodsynopsisType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.MODIFIER_TYPE: {
				ModifierType modifierType = (ModifierType)theEObject;
				T result = caseModifierType(modifierType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.MOUSEBUTTON_TYPE: {
				MousebuttonType mousebuttonType = (MousebuttonType)theEObject;
				T result = caseMousebuttonType(mousebuttonType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.MSGAUD_TYPE: {
				MsgaudType msgaudType = (MsgaudType)theEObject;
				T result = caseMsgaudType(msgaudType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.MSGENTRY_TYPE: {
				MsgentryType msgentryType = (MsgentryType)theEObject;
				T result = caseMsgentryType(msgentryType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.MSGEXPLAN_TYPE: {
				MsgexplanType msgexplanType = (MsgexplanType)theEObject;
				T result = caseMsgexplanType(msgexplanType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.MSGINFO_TYPE: {
				MsginfoType msginfoType = (MsginfoType)theEObject;
				T result = caseMsginfoType(msginfoType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.MSGLEVEL_TYPE: {
				MsglevelType msglevelType = (MsglevelType)theEObject;
				T result = caseMsglevelType(msglevelType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.MSGMAIN_TYPE: {
				MsgmainType msgmainType = (MsgmainType)theEObject;
				T result = caseMsgmainType(msgmainType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.MSGORIG_TYPE: {
				MsgorigType msgorigType = (MsgorigType)theEObject;
				T result = caseMsgorigType(msgorigType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.MSGREL_TYPE: {
				MsgrelType msgrelType = (MsgrelType)theEObject;
				T result = caseMsgrelType(msgrelType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.MSGSET_TYPE: {
				MsgsetType msgsetType = (MsgsetType)theEObject;
				T result = caseMsgsetType(msgsetType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.MSGSUB_TYPE: {
				MsgsubType msgsubType = (MsgsubType)theEObject;
				T result = caseMsgsubType(msgsubType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.MSGTEXT_TYPE: {
				MsgtextType msgtextType = (MsgtextType)theEObject;
				T result = caseMsgtextType(msgtextType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.MSG_TYPE: {
				MsgType msgType = (MsgType)theEObject;
				T result = caseMsgType(msgType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.NONTERMINAL_TYPE: {
				NonterminalType nonterminalType = (NonterminalType)theEObject;
				T result = caseNonterminalType(nonterminalType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.NOTE_TYPE: {
				NoteType noteType = (NoteType)theEObject;
				T result = caseNoteType(noteType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.OLINK_TYPE: {
				OlinkType olinkType = (OlinkType)theEObject;
				T result = caseOlinkType(olinkType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.OOCLASS_TYPE: {
				OoclassType ooclassType = (OoclassType)theEObject;
				T result = caseOoclassType(ooclassType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.OOEXCEPTION_TYPE: {
				OoexceptionType ooexceptionType = (OoexceptionType)theEObject;
				T result = caseOoexceptionType(ooexceptionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.OOINTERFACE_TYPE: {
				OointerfaceType oointerfaceType = (OointerfaceType)theEObject;
				T result = caseOointerfaceType(oointerfaceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.OPTIONAL_TYPE: {
				OptionalType optionalType = (OptionalType)theEObject;
				T result = caseOptionalType(optionalType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.OPTION_TYPE: {
				OptionType optionType = (OptionType)theEObject;
				T result = caseOptionType(optionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.ORDEREDLIST_TYPE: {
				OrderedlistType orderedlistType = (OrderedlistType)theEObject;
				T result = caseOrderedlistType(orderedlistType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.ORGDIV_TYPE: {
				OrgdivType orgdivType = (OrgdivType)theEObject;
				T result = caseOrgdivType(orgdivType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.ORGNAME_TYPE: {
				OrgnameType orgnameType = (OrgnameType)theEObject;
				T result = caseOrgnameType(orgnameType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.ORG_TYPE: {
				OrgType orgType = (OrgType)theEObject;
				T result = caseOrgType(orgType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.OTHERADDR_TYPE: {
				OtheraddrType otheraddrType = (OtheraddrType)theEObject;
				T result = caseOtheraddrType(otheraddrType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.OTHERCREDIT_TYPE: {
				OthercreditType othercreditType = (OthercreditType)theEObject;
				T result = caseOthercreditType(othercreditType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.OTHERNAME_TYPE: {
				OthernameType othernameType = (OthernameType)theEObject;
				T result = caseOthernameType(othernameType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.PACKAGE_TYPE: {
				PackageType packageType = (PackageType)theEObject;
				T result = casePackageType(packageType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.PAGENUMS_TYPE: {
				PagenumsType pagenumsType = (PagenumsType)theEObject;
				T result = casePagenumsType(pagenumsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.PARAMDEF_TYPE: {
				ParamdefType paramdefType = (ParamdefType)theEObject;
				T result = caseParamdefType(paramdefType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.PARAMETER_TYPE: {
				ParameterType parameterType = (ParameterType)theEObject;
				T result = caseParameterType(parameterType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.PARA_TYPE: {
				ParaType paraType = (ParaType)theEObject;
				T result = caseParaType(paraType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.PARTINTRO_TYPE: {
				PartintroType partintroType = (PartintroType)theEObject;
				T result = casePartintroType(partintroType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.PART_TYPE: {
				PartType partType = (PartType)theEObject;
				T result = casePartType(partType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.PERSONBLURB_TYPE: {
				PersonblurbType personblurbType = (PersonblurbType)theEObject;
				T result = casePersonblurbType(personblurbType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.PERSONNAME_TYPE: {
				PersonnameType personnameType = (PersonnameType)theEObject;
				T result = casePersonnameType(personnameType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.PERSON_TYPE: {
				PersonType personType = (PersonType)theEObject;
				T result = casePersonType(personType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.PHONE_TYPE: {
				PhoneType phoneType = (PhoneType)theEObject;
				T result = casePhoneType(phoneType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.PHRASE_TYPE: {
				PhraseType phraseType = (PhraseType)theEObject;
				T result = casePhraseType(phraseType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.POB_TYPE: {
				PobType pobType = (PobType)theEObject;
				T result = casePobType(pobType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.POSTCODE_TYPE: {
				PostcodeType postcodeType = (PostcodeType)theEObject;
				T result = casePostcodeType(postcodeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.PREFACE_TYPE: {
				PrefaceType prefaceType = (PrefaceType)theEObject;
				T result = casePrefaceType(prefaceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.PRIMARYIE_TYPE: {
				PrimaryieType primaryieType = (PrimaryieType)theEObject;
				T result = casePrimaryieType(primaryieType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.PRIMARY_TYPE: {
				PrimaryType primaryType = (PrimaryType)theEObject;
				T result = casePrimaryType(primaryType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.PRINTHISTORY_TYPE: {
				PrinthistoryType printhistoryType = (PrinthistoryType)theEObject;
				T result = casePrinthistoryType(printhistoryType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.PROCEDURE_TYPE: {
				ProcedureType procedureType = (ProcedureType)theEObject;
				T result = caseProcedureType(procedureType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.PRODUCTIONRECAP_TYPE: {
				ProductionrecapType productionrecapType = (ProductionrecapType)theEObject;
				T result = caseProductionrecapType(productionrecapType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.PRODUCTIONSET_TYPE: {
				ProductionsetType productionsetType = (ProductionsetType)theEObject;
				T result = caseProductionsetType(productionsetType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.PRODUCTION_TYPE: {
				ProductionType productionType = (ProductionType)theEObject;
				T result = caseProductionType(productionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.PRODUCTNAME_TYPE: {
				ProductnameType productnameType = (ProductnameType)theEObject;
				T result = caseProductnameType(productnameType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.PRODUCTNUMBER_TYPE: {
				ProductnumberType productnumberType = (ProductnumberType)theEObject;
				T result = caseProductnumberType(productnumberType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.PROGRAMLISTINGCO_TYPE: {
				ProgramlistingcoType programlistingcoType = (ProgramlistingcoType)theEObject;
				T result = caseProgramlistingcoType(programlistingcoType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.PROGRAMLISTING_TYPE: {
				ProgramlistingType programlistingType = (ProgramlistingType)theEObject;
				T result = caseProgramlistingType(programlistingType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.PROMPT_TYPE: {
				PromptType promptType = (PromptType)theEObject;
				T result = casePromptType(promptType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.PROPERTY_TYPE: {
				PropertyType propertyType = (PropertyType)theEObject;
				T result = casePropertyType(propertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.PUBDATE_TYPE: {
				PubdateType pubdateType = (PubdateType)theEObject;
				T result = casePubdateType(pubdateType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.PUBLISHERNAME_TYPE: {
				PublishernameType publishernameType = (PublishernameType)theEObject;
				T result = casePublishernameType(publishernameType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.PUBLISHER_TYPE: {
				PublisherType publisherType = (PublisherType)theEObject;
				T result = casePublisherType(publisherType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.QANDADIV_TYPE: {
				QandadivType qandadivType = (QandadivType)theEObject;
				T result = caseQandadivType(qandadivType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.QANDAENTRY_TYPE: {
				QandaentryType qandaentryType = (QandaentryType)theEObject;
				T result = caseQandaentryType(qandaentryType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.QANDASET_TYPE: {
				QandasetType qandasetType = (QandasetType)theEObject;
				T result = caseQandasetType(qandasetType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.QUESTION_TYPE: {
				QuestionType questionType = (QuestionType)theEObject;
				T result = caseQuestionType(questionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.QUOTE_TYPE: {
				QuoteType quoteType = (QuoteType)theEObject;
				T result = caseQuoteType(quoteType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.REFCLASS_TYPE: {
				RefclassType refclassType = (RefclassType)theEObject;
				T result = caseRefclassType(refclassType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.REFDESCRIPTOR_TYPE: {
				RefdescriptorType refdescriptorType = (RefdescriptorType)theEObject;
				T result = caseRefdescriptorType(refdescriptorType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.REFENTRYTITLE_TYPE: {
				RefentrytitleType refentrytitleType = (RefentrytitleType)theEObject;
				T result = caseRefentrytitleType(refentrytitleType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.REFENTRY_TYPE: {
				RefentryType refentryType = (RefentryType)theEObject;
				T result = caseRefentryType(refentryType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.REFERENCE_TYPE: {
				ReferenceType referenceType = (ReferenceType)theEObject;
				T result = caseReferenceType(referenceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.REFMETA_TYPE: {
				RefmetaType refmetaType = (RefmetaType)theEObject;
				T result = caseRefmetaType(refmetaType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.REFMISCINFO_TYPE: {
				RefmiscinfoType refmiscinfoType = (RefmiscinfoType)theEObject;
				T result = caseRefmiscinfoType(refmiscinfoType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.REFNAMEDIV_TYPE: {
				RefnamedivType refnamedivType = (RefnamedivType)theEObject;
				T result = caseRefnamedivType(refnamedivType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.REFNAME_TYPE: {
				RefnameType refnameType = (RefnameType)theEObject;
				T result = caseRefnameType(refnameType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.REFPURPOSE_TYPE: {
				RefpurposeType refpurposeType = (RefpurposeType)theEObject;
				T result = caseRefpurposeType(refpurposeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.REFSECT1_TYPE: {
				Refsect1Type refsect1Type = (Refsect1Type)theEObject;
				T result = caseRefsect1Type(refsect1Type);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.REFSECT2_TYPE: {
				Refsect2Type refsect2Type = (Refsect2Type)theEObject;
				T result = caseRefsect2Type(refsect2Type);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.REFSECT3_TYPE: {
				Refsect3Type refsect3Type = (Refsect3Type)theEObject;
				T result = caseRefsect3Type(refsect3Type);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.REFSECTION_TYPE: {
				RefsectionType refsectionType = (RefsectionType)theEObject;
				T result = caseRefsectionType(refsectionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.REFSYNOPSISDIV_TYPE: {
				RefsynopsisdivType refsynopsisdivType = (RefsynopsisdivType)theEObject;
				T result = caseRefsynopsisdivType(refsynopsisdivType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.RELEASEINFO_TYPE: {
				ReleaseinfoType releaseinfoType = (ReleaseinfoType)theEObject;
				T result = caseReleaseinfoType(releaseinfoType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.REMARK_TYPE: {
				RemarkType remarkType = (RemarkType)theEObject;
				T result = caseRemarkType(remarkType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.REPLACEABLE_TYPE: {
				ReplaceableType replaceableType = (ReplaceableType)theEObject;
				T result = caseReplaceableType(replaceableType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.RETURNVALUE_TYPE: {
				ReturnvalueType returnvalueType = (ReturnvalueType)theEObject;
				T result = caseReturnvalueType(returnvalueType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.REVDESCRIPTION_TYPE: {
				RevdescriptionType revdescriptionType = (RevdescriptionType)theEObject;
				T result = caseRevdescriptionType(revdescriptionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.REVHISTORY_TYPE: {
				RevhistoryType revhistoryType = (RevhistoryType)theEObject;
				T result = caseRevhistoryType(revhistoryType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.REVISION_TYPE: {
				RevisionType revisionType = (RevisionType)theEObject;
				T result = caseRevisionType(revisionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.REVNUMBER_TYPE: {
				RevnumberType revnumberType = (RevnumberType)theEObject;
				T result = caseRevnumberType(revnumberType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.REVREMARK_TYPE: {
				RevremarkType revremarkType = (RevremarkType)theEObject;
				T result = caseRevremarkType(revremarkType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.RHS_TYPE: {
				RhsType rhsType = (RhsType)theEObject;
				T result = caseRhsType(rhsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.ROW_TYPE: {
				RowType rowType = (RowType)theEObject;
				T result = caseRowType(rowType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.SBR_TYPE: {
				SbrType sbrType = (SbrType)theEObject;
				T result = caseSbrType(sbrType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.SCREENCO_TYPE: {
				ScreencoType screencoType = (ScreencoType)theEObject;
				T result = caseScreencoType(screencoType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.SCREENSHOT_TYPE: {
				ScreenshotType screenshotType = (ScreenshotType)theEObject;
				T result = caseScreenshotType(screenshotType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.SCREEN_TYPE: {
				ScreenType screenType = (ScreenType)theEObject;
				T result = caseScreenType(screenType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.SECONDARYIE_TYPE: {
				SecondaryieType secondaryieType = (SecondaryieType)theEObject;
				T result = caseSecondaryieType(secondaryieType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.SECONDARY_TYPE: {
				SecondaryType secondaryType = (SecondaryType)theEObject;
				T result = caseSecondaryType(secondaryType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.SECT1_TYPE: {
				Sect1Type sect1Type = (Sect1Type)theEObject;
				T result = caseSect1Type(sect1Type);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.SECT2_TYPE: {
				Sect2Type sect2Type = (Sect2Type)theEObject;
				T result = caseSect2Type(sect2Type);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.SECT3_TYPE: {
				Sect3Type sect3Type = (Sect3Type)theEObject;
				T result = caseSect3Type(sect3Type);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.SECT4_TYPE: {
				Sect4Type sect4Type = (Sect4Type)theEObject;
				T result = caseSect4Type(sect4Type);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.SECT5_TYPE: {
				Sect5Type sect5Type = (Sect5Type)theEObject;
				T result = caseSect5Type(sect5Type);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.SECTION_TYPE: {
				SectionType sectionType = (SectionType)theEObject;
				T result = caseSectionType(sectionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.SEEALSOIE_TYPE: {
				SeealsoieType seealsoieType = (SeealsoieType)theEObject;
				T result = caseSeealsoieType(seealsoieType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.SEEALSO_TYPE: {
				SeealsoType seealsoType = (SeealsoType)theEObject;
				T result = caseSeealsoType(seealsoType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.SEEIE_TYPE: {
				SeeieType seeieType = (SeeieType)theEObject;
				T result = caseSeeieType(seeieType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.SEE_TYPE: {
				SeeType seeType = (SeeType)theEObject;
				T result = caseSeeType(seeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.SEGLISTITEM_TYPE: {
				SeglistitemType seglistitemType = (SeglistitemType)theEObject;
				T result = caseSeglistitemType(seglistitemType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.SEGMENTEDLIST_TYPE: {
				SegmentedlistType segmentedlistType = (SegmentedlistType)theEObject;
				T result = caseSegmentedlistType(segmentedlistType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.SEGTITLE_TYPE: {
				SegtitleType segtitleType = (SegtitleType)theEObject;
				T result = caseSegtitleType(segtitleType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.SEG_TYPE: {
				SegType segType = (SegType)theEObject;
				T result = caseSegType(segType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.SERIESVOLNUMS_TYPE: {
				SeriesvolnumsType seriesvolnumsType = (SeriesvolnumsType)theEObject;
				T result = caseSeriesvolnumsType(seriesvolnumsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.SETINDEX_TYPE: {
				SetindexType setindexType = (SetindexType)theEObject;
				T result = caseSetindexType(setindexType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.SET_TYPE: {
				SetType setType = (SetType)theEObject;
				T result = caseSetType(setType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.SHORTAFFIL_TYPE: {
				ShortaffilType shortaffilType = (ShortaffilType)theEObject;
				T result = caseShortaffilType(shortaffilType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.SHORTCUT_TYPE: {
				ShortcutType shortcutType = (ShortcutType)theEObject;
				T result = caseShortcutType(shortcutType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.SIDEBAR_TYPE: {
				SidebarType sidebarType = (SidebarType)theEObject;
				T result = caseSidebarType(sidebarType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.SIMPARA_TYPE: {
				SimparaType simparaType = (SimparaType)theEObject;
				T result = caseSimparaType(simparaType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.SIMPLELIST_TYPE: {
				SimplelistType simplelistType = (SimplelistType)theEObject;
				T result = caseSimplelistType(simplelistType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.SIMPLEMSGENTRY_TYPE: {
				SimplemsgentryType simplemsgentryType = (SimplemsgentryType)theEObject;
				T result = caseSimplemsgentryType(simplemsgentryType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.SIMPLESECT_TYPE: {
				SimplesectType simplesectType = (SimplesectType)theEObject;
				T result = caseSimplesectType(simplesectType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.SPANSPEC_TYPE: {
				SpanspecType spanspecType = (SpanspecType)theEObject;
				T result = caseSpanspecType(spanspecType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.STATE_TYPE: {
				StateType stateType = (StateType)theEObject;
				T result = caseStateType(stateType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.STEPALTERNATIVES_TYPE: {
				StepalternativesType stepalternativesType = (StepalternativesType)theEObject;
				T result = caseStepalternativesType(stepalternativesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.STEP_TYPE: {
				StepType stepType = (StepType)theEObject;
				T result = caseStepType(stepType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.STREET_TYPE: {
				StreetType streetType = (StreetType)theEObject;
				T result = caseStreetType(streetType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.SUBJECTSET_TYPE: {
				SubjectsetType subjectsetType = (SubjectsetType)theEObject;
				T result = caseSubjectsetType(subjectsetType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.SUBJECTTERM_TYPE: {
				SubjecttermType subjecttermType = (SubjecttermType)theEObject;
				T result = caseSubjecttermType(subjecttermType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.SUBJECT_TYPE: {
				SubjectType subjectType = (SubjectType)theEObject;
				T result = caseSubjectType(subjectType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.SUBSCRIPT_TYPE: {
				SubscriptType subscriptType = (SubscriptType)theEObject;
				T result = caseSubscriptType(subscriptType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.SUBSTEPS_TYPE: {
				SubstepsType substepsType = (SubstepsType)theEObject;
				T result = caseSubstepsType(substepsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.SUBTITLE_TYPE: {
				SubtitleType subtitleType = (SubtitleType)theEObject;
				T result = caseSubtitleType(subtitleType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.SUPERSCRIPT_TYPE: {
				SuperscriptType superscriptType = (SuperscriptType)theEObject;
				T result = caseSuperscriptType(superscriptType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.SURNAME_TYPE: {
				SurnameType surnameType = (SurnameType)theEObject;
				T result = caseSurnameType(surnameType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.SYMBOL_TYPE: {
				SymbolType symbolType = (SymbolType)theEObject;
				T result = caseSymbolType(symbolType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.SYNOPFRAGMENTREF_TYPE: {
				SynopfragmentrefType synopfragmentrefType = (SynopfragmentrefType)theEObject;
				T result = caseSynopfragmentrefType(synopfragmentrefType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.SYNOPFRAGMENT_TYPE: {
				SynopfragmentType synopfragmentType = (SynopfragmentType)theEObject;
				T result = caseSynopfragmentType(synopfragmentType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.SYNOPSIS_TYPE: {
				SynopsisType synopsisType = (SynopsisType)theEObject;
				T result = caseSynopsisType(synopsisType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.SYSTEMITEM_TYPE: {
				SystemitemType systemitemType = (SystemitemType)theEObject;
				T result = caseSystemitemType(systemitemType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.TABLE_TYPE: {
				TableType tableType = (TableType)theEObject;
				T result = caseTableType(tableType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.TAG_TYPE: {
				TagType tagType = (TagType)theEObject;
				T result = caseTagType(tagType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.TASKPREREQUISITES_TYPE: {
				TaskprerequisitesType taskprerequisitesType = (TaskprerequisitesType)theEObject;
				T result = caseTaskprerequisitesType(taskprerequisitesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.TASKRELATED_TYPE: {
				TaskrelatedType taskrelatedType = (TaskrelatedType)theEObject;
				T result = caseTaskrelatedType(taskrelatedType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.TASKSUMMARY_TYPE: {
				TasksummaryType tasksummaryType = (TasksummaryType)theEObject;
				T result = caseTasksummaryType(tasksummaryType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.TASK_TYPE: {
				TaskType taskType = (TaskType)theEObject;
				T result = caseTaskType(taskType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.TBODY_TYPE: {
				TbodyType tbodyType = (TbodyType)theEObject;
				T result = caseTbodyType(tbodyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.TD_TYPE: {
				TdType tdType = (TdType)theEObject;
				T result = caseTdType(tdType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.TERMDEF_TYPE: {
				TermdefType termdefType = (TermdefType)theEObject;
				T result = caseTermdefType(termdefType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.TERM_TYPE: {
				TermType termType = (TermType)theEObject;
				T result = caseTermType(termType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.TERTIARYIE_TYPE: {
				TertiaryieType tertiaryieType = (TertiaryieType)theEObject;
				T result = caseTertiaryieType(tertiaryieType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.TERTIARY_TYPE: {
				TertiaryType tertiaryType = (TertiaryType)theEObject;
				T result = caseTertiaryType(tertiaryType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.TEXTDATA_TYPE: {
				TextdataType textdataType = (TextdataType)theEObject;
				T result = caseTextdataType(textdataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.TEXTOBJECT_TYPE: {
				TextobjectType textobjectType = (TextobjectType)theEObject;
				T result = caseTextobjectType(textobjectType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.TFOOT_TYPE: {
				TfootType tfootType = (TfootType)theEObject;
				T result = caseTfootType(tfootType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.TGROUP_TYPE: {
				TgroupType tgroupType = (TgroupType)theEObject;
				T result = caseTgroupType(tgroupType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.THEAD_TYPE: {
				TheadType theadType = (TheadType)theEObject;
				T result = caseTheadType(theadType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.TH_TYPE: {
				ThType thType = (ThType)theEObject;
				T result = caseThType(thType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.TIP_TYPE: {
				TipType tipType = (TipType)theEObject;
				T result = caseTipType(tipType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.TITLEABBREV_TYPE: {
				TitleabbrevType titleabbrevType = (TitleabbrevType)theEObject;
				T result = caseTitleabbrevType(titleabbrevType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.TITLE_TYPE: {
				TitleType titleType = (TitleType)theEObject;
				T result = caseTitleType(titleType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.TOCDIV_TYPE: {
				TocdivType tocdivType = (TocdivType)theEObject;
				T result = caseTocdivType(tocdivType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.TOCENTRY_TYPE: {
				TocentryType tocentryType = (TocentryType)theEObject;
				T result = caseTocentryType(tocentryType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.TOC_TYPE: {
				TocType tocType = (TocType)theEObject;
				T result = caseTocType(tocType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.TOKEN_TYPE: {
				TokenType tokenType = (TokenType)theEObject;
				T result = caseTokenType(tokenType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.TRADEMARK_TYPE: {
				TrademarkType trademarkType = (TrademarkType)theEObject;
				T result = caseTrademarkType(trademarkType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.TR_TYPE: {
				TrType trType = (TrType)theEObject;
				T result = caseTrType(trType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.TYPE_TYPE2: {
				TypeType2 typeType2 = (TypeType2)theEObject;
				T result = caseTypeType2(typeType2);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.URI_TYPE: {
				UriType uriType = (UriType)theEObject;
				T result = caseUriType(uriType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.USERINPUT_TYPE: {
				UserinputType userinputType = (UserinputType)theEObject;
				T result = caseUserinputType(userinputType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.VARARGS_TYPE: {
				VarargsType varargsType = (VarargsType)theEObject;
				T result = caseVarargsType(varargsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.VARIABLELIST_TYPE: {
				VariablelistType variablelistType = (VariablelistType)theEObject;
				T result = caseVariablelistType(variablelistType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.VARLISTENTRY_TYPE: {
				VarlistentryType varlistentryType = (VarlistentryType)theEObject;
				T result = caseVarlistentryType(varlistentryType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.VARNAME_TYPE: {
				VarnameType varnameType = (VarnameType)theEObject;
				T result = caseVarnameType(varnameType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.VIDEODATA_TYPE: {
				VideodataType videodataType = (VideodataType)theEObject;
				T result = caseVideodataType(videodataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.VIDEOOBJECT_TYPE: {
				VideoobjectType videoobjectType = (VideoobjectType)theEObject;
				T result = caseVideoobjectType(videoobjectType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.VOID_TYPE: {
				VoidType voidType = (VoidType)theEObject;
				T result = caseVoidType(voidType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.VOLUMENUM_TYPE: {
				VolumenumType volumenumType = (VolumenumType)theEObject;
				T result = caseVolumenumType(volumenumType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.WARNING_TYPE: {
				WarningType warningType = (WarningType)theEObject;
				T result = caseWarningType(warningType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.WORDASWORD_TYPE: {
				WordaswordType wordaswordType = (WordaswordType)theEObject;
				T result = caseWordaswordType(wordaswordType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.XREF_TYPE: {
				XrefType xrefType = (XrefType)theEObject;
				T result = caseXrefType(xrefType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.YEAR_TYPE: {
				YearType yearType = (YearType)theEObject;
				T result = caseYearType(yearType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abbrev Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abbrev Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbbrevType(AbbrevType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractType(AbstractType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Accel Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Accel Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAccelType(AccelType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Acknowledgements Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Acknowledgements Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAcknowledgementsType(AcknowledgementsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Acronym Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Acronym Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAcronymType(AcronymType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Address Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Address Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddressType(AddressType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Affiliation Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Affiliation Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAffiliationType(AffiliationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Alt Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Alt Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAltType(AltType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Anchor Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Anchor Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnchorType(AnchorType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Annotation Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annotation Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnnotationType(AnnotationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Answer Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Answer Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnswerType(AnswerType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Appendix Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Appendix Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAppendixType(AppendixType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Application Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Application Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseApplicationType(ApplicationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Arc Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arc Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArcType(ArcType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Areaset Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Areaset Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAreasetType(AreasetType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Areaspec Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Areaspec Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAreaspecType(AreaspecType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Area Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Area Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAreaType(AreaType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Arg Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arg Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArgType(ArgType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Article Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Article Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArticleType(ArticleType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Artpagenums Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Artpagenums Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArtpagenumsType(ArtpagenumsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribution Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribution Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributionType(AttributionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Audiodata Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Audiodata Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAudiodataType(AudiodataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Audioobject Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Audioobject Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAudioobjectType(AudioobjectType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Authorgroup Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Authorgroup Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAuthorgroupType(AuthorgroupType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Authorinitials Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Authorinitials Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAuthorinitialsType(AuthorinitialsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Author Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Author Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAuthorType(AuthorType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bibliocoverage Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bibliocoverage Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBibliocoverageType(BibliocoverageType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bibliodiv Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bibliodiv Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBibliodivType(BibliodivType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Biblioentry Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Biblioentry Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBiblioentryType(BiblioentryType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bibliography Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bibliography Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBibliographyType(BibliographyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Biblioid Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Biblioid Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBiblioidType(BiblioidType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bibliolist Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bibliolist Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBibliolistType(BibliolistType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bibliomisc Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bibliomisc Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBibliomiscType(BibliomiscType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bibliomixed Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bibliomixed Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBibliomixedType(BibliomixedType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bibliomset Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bibliomset Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBibliomsetType(BibliomsetType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Biblioref Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Biblioref Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBibliorefType(BibliorefType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bibliorelation Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bibliorelation Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBibliorelationType(BibliorelationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Biblioset Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Biblioset Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBibliosetType(BibliosetType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bibliosource Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bibliosource Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBibliosourceType(BibliosourceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Blockquote Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Blockquote Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBlockquoteType(BlockquoteType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Book Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Book Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBookType(BookType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bridgehead Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bridgehead Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBridgeheadType(BridgeheadType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Calloutlist Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Calloutlist Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCalloutlistType(CalloutlistType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Callout Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Callout Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCalloutType(CalloutType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Caption Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Caption Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCaptionType(CaptionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Caution Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Caution Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCautionType(CautionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Chapter Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Chapter Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChapterType(ChapterType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Citation Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Citation Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCitationType(CitationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Citebiblioid Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Citebiblioid Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCitebiblioidType(CitebiblioidType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Citerefentry Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Citerefentry Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCiterefentryType(CiterefentryType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Citetitle Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Citetitle Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCitetitleType(CitetitleType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>City Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>City Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCityType(CityType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Classname Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Classname Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassnameType(ClassnameType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Classsynopsisinfo Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Classsynopsisinfo Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClasssynopsisinfoType(ClasssynopsisinfoType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Classsynopsis Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Classsynopsis Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClasssynopsisType(ClasssynopsisType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cmdsynopsis Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cmdsynopsis Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCmdsynopsisType(CmdsynopsisType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Code Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Code Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCodeType(CodeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Colgroup Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Colgroup Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseColgroupType(ColgroupType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Collab Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Collab Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCollabType(CollabType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Colophon Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Colophon Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseColophonType(ColophonType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Colspec Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Colspec Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseColspecType(ColspecType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Col Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Col Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseColType(ColType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Command Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Command Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommandType(CommandType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Computeroutput Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Computeroutput Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComputeroutputType(ComputeroutputType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Confdates Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Confdates Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConfdatesType(ConfdatesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Confgroup Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Confgroup Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConfgroupType(ConfgroupType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Confnum Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Confnum Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConfnumType(ConfnumType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Confsponsor Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Confsponsor Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConfsponsorType(ConfsponsorType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conftitle Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conftitle Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConftitleType(ConftitleType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constant Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constant Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstantType(ConstantType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constraintdef Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constraintdef Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstraintdefType(ConstraintdefType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constraint Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constraint Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstraintType(ConstraintType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constructorsynopsis Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constructorsynopsis Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstructorsynopsisType(ConstructorsynopsisType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contractnum Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contractnum Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContractnumType(ContractnumType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contractsponsor Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contractsponsor Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContractsponsorType(ContractsponsorType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contrib Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contrib Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContribType(ContribType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Copyright Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Copyright Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCopyrightType(CopyrightType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Coref Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Coref Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCorefType(CorefType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Co Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Co Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCoType(CoType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Country Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Country Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCountryType(CountryType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cover Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cover Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCoverType(CoverType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Database Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Database Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDatabaseType(DatabaseType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Date Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Date Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDateType(DateType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dedication Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dedication Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDedicationType(DedicationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Destructorsynopsis Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Destructorsynopsis Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDestructorsynopsisType(DestructorsynopsisType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentRoot(DocumentRoot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Edition Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Edition Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEditionType(EditionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Editor Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Editor Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEditorType(EditorType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Email Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Email Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEmailType(EmailType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Emphasis Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Emphasis Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEmphasisType(EmphasisType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entrytbl Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entrytbl Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntrytblType(EntrytblType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entry Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entry Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntryType(EntryType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Envar Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Envar Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnvarType(EnvarType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Epigraph Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Epigraph Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEpigraphType(EpigraphType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Equation Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Equation Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEquationType(EquationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Errorcode Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Errorcode Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseErrorcodeType(ErrorcodeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Errorname Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Errorname Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseErrornameType(ErrornameType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Errortext Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Errortext Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseErrortextType(ErrortextType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Errortype Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Errortype Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseErrortypeType(ErrortypeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Example Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Example Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExampleType(ExampleType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Exceptionname Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exceptionname Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExceptionnameType(ExceptionnameType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Extendedlink Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Extendedlink Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExtendedlinkType(ExtendedlinkType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fax Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fax Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFaxType(FaxType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fieldsynopsis Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fieldsynopsis Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFieldsynopsisType(FieldsynopsisType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Figure Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Figure Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFigureType(FigureType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Filename Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Filename Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFilenameType(FilenameType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Firstname Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Firstname Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFirstnameType(FirstnameType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Firstterm Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Firstterm Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFirsttermType(FirsttermType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Footnoteref Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Footnoteref Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFootnoterefType(FootnoterefType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Footnote Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Footnote Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFootnoteType(FootnoteType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Foreignphrase Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Foreignphrase Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseForeignphraseType(ForeignphraseType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Formalpara Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Formalpara Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFormalparaType(FormalparaType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Funcdef Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Funcdef Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFuncdefType(FuncdefType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Funcparams Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Funcparams Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFuncparamsType(FuncparamsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Funcprototype Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Funcprototype Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFuncprototypeType(FuncprototypeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Funcsynopsisinfo Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Funcsynopsisinfo Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFuncsynopsisinfoType(FuncsynopsisinfoType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Funcsynopsis Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Funcsynopsis Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFuncsynopsisType(FuncsynopsisType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Function Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Function Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionType1(FunctionType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Glossary Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Glossary Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGlossaryType(GlossaryType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Glossdef Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Glossdef Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGlossdefType(GlossdefType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Glossdiv Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Glossdiv Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGlossdivType(GlossdivType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Glossentry Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Glossentry Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGlossentryType(GlossentryType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Glosslist Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Glosslist Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGlosslistType(GlosslistType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Glossseealso Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Glossseealso Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGlossseealsoType(GlossseealsoType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Glosssee Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Glosssee Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGlossseeType(GlossseeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Glossterm Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Glossterm Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGlosstermType(GlosstermType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Group Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Group Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGroupType(GroupType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Guibutton Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Guibutton Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGuibuttonType(GuibuttonType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Guiicon Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Guiicon Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGuiiconType(GuiiconType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Guilabel Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Guilabel Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGuilabelType(GuilabelType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Guimenuitem Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Guimenuitem Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGuimenuitemType(GuimenuitemType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Guimenu Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Guimenu Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGuimenuType(GuimenuType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Guisubmenu Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Guisubmenu Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGuisubmenuType(GuisubmenuType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hardware Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hardware Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHardwareType(HardwareType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Holder Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Holder Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHolderType(HolderType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Honorific Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Honorific Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHonorificType(HonorificType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Imagedata Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Imagedata Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImagedataType(ImagedataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Imageobjectco Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Imageobjectco Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImageobjectcoType(ImageobjectcoType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Imageobject Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Imageobject Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImageobjectType(ImageobjectType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Important Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Important Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImportantType(ImportantType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Indexdiv Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Indexdiv Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIndexdivType(IndexdivType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Indexentry Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Indexentry Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIndexentryType(IndexentryType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Indexterm Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Indexterm Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIndextermType(IndextermType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Index Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Index Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIndexType(IndexType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Informalequation Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Informalequation Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInformalequationType(InformalequationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Informalexample Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Informalexample Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInformalexampleType(InformalexampleType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Informalfigure Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Informalfigure Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInformalfigureType(InformalfigureType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Informaltable Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Informaltable Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInformaltableType(InformaltableType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Info Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Info Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInfoType(InfoType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Initializer Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Initializer Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInitializerType(InitializerType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Inlineequation Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Inlineequation Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInlineequationType(InlineequationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Inlinemediaobject Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Inlinemediaobject Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInlinemediaobjectType(InlinemediaobjectType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interfacename Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interfacename Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterfacenameType(InterfacenameType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Issuenum Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Issuenum Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIssuenumType(IssuenumType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Itemizedlist Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Itemizedlist Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseItemizedlistType(ItemizedlistType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Itermset Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Itermset Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseItermsetType(ItermsetType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Jobtitle Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Jobtitle Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJobtitleType(JobtitleType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Keycap Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Keycap Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKeycapType(KeycapType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Keycode Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Keycode Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKeycodeType(KeycodeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Keycombo Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Keycombo Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKeycomboType(KeycomboType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Keysym Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Keysym Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKeysymType(KeysymType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Keywordset Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Keywordset Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKeywordsetType(KeywordsetType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Keyword Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Keyword Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKeywordType(KeywordType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Label Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Label Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLabelType(LabelType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Legalnotice Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Legalnotice Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLegalnoticeType(LegalnoticeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lhs Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lhs Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLhsType(LhsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lineage Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lineage Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLineageType(LineageType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lineannotation Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lineannotation Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLineannotationType(LineannotationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Link Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Link Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLinkType(LinkType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Listitem Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Listitem Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListitemType(ListitemType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Literallayout Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Literallayout Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiterallayoutType(LiterallayoutType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Literal Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Literal Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiteralType(LiteralType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Locator Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Locator Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocatorType(LocatorType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Manvolnum Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Manvolnum Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseManvolnumType(ManvolnumType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Markup Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Markup Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMarkupType(MarkupType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mathphrase Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mathphrase Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMathphraseType(MathphraseType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mediaobject Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mediaobject Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMediaobjectType(MediaobjectType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Member Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Member Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMemberType(MemberType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Menuchoice Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Menuchoice Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMenuchoiceType(MenuchoiceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Methodname Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Methodname Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMethodnameType(MethodnameType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Methodparam Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Methodparam Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMethodparamType(MethodparamType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Methodsynopsis Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Methodsynopsis Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMethodsynopsisType(MethodsynopsisType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Modifier Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Modifier Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModifierType(ModifierType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mousebutton Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mousebutton Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMousebuttonType(MousebuttonType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Msgaud Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Msgaud Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMsgaudType(MsgaudType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Msgentry Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Msgentry Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMsgentryType(MsgentryType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Msgexplan Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Msgexplan Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMsgexplanType(MsgexplanType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Msginfo Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Msginfo Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMsginfoType(MsginfoType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Msglevel Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Msglevel Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMsglevelType(MsglevelType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Msgmain Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Msgmain Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMsgmainType(MsgmainType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Msgorig Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Msgorig Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMsgorigType(MsgorigType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Msgrel Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Msgrel Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMsgrelType(MsgrelType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Msgset Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Msgset Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMsgsetType(MsgsetType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Msgsub Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Msgsub Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMsgsubType(MsgsubType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Msgtext Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Msgtext Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMsgtextType(MsgtextType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Msg Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Msg Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMsgType(MsgType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nonterminal Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nonterminal Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNonterminalType(NonterminalType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Note Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Note Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNoteType(NoteType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Olink Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Olink Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOlinkType(OlinkType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ooclass Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ooclass Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOoclassType(OoclassType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ooexception Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ooexception Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOoexceptionType(OoexceptionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Oointerface Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Oointerface Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOointerfaceType(OointerfaceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Optional Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Optional Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOptionalType(OptionalType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Option Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Option Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOptionType(OptionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Orderedlist Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Orderedlist Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrderedlistType(OrderedlistType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Orgdiv Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Orgdiv Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrgdivType(OrgdivType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Orgname Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Orgname Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrgnameType(OrgnameType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Org Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Org Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrgType(OrgType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Otheraddr Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Otheraddr Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOtheraddrType(OtheraddrType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Othercredit Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Othercredit Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOthercreditType(OthercreditType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Othername Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Othername Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOthernameType(OthernameType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Package Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Package Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePackageType(PackageType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pagenums Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pagenums Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePagenumsType(PagenumsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Paramdef Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Paramdef Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParamdefType(ParamdefType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameterType(ParameterType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Para Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Para Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParaType(ParaType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Partintro Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Partintro Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePartintroType(PartintroType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Part Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Part Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePartType(PartType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Personblurb Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Personblurb Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePersonblurbType(PersonblurbType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Personname Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Personname Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePersonnameType(PersonnameType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Person Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Person Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePersonType(PersonType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Phone Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Phone Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePhoneType(PhoneType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Phrase Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Phrase Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePhraseType(PhraseType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pob Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pob Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePobType(PobType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Postcode Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Postcode Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePostcodeType(PostcodeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Preface Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Preface Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrefaceType(PrefaceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Primaryie Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Primaryie Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrimaryieType(PrimaryieType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Primary Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Primary Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrimaryType(PrimaryType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Printhistory Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Printhistory Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrinthistoryType(PrinthistoryType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Procedure Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Procedure Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcedureType(ProcedureType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Productionrecap Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Productionrecap Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProductionrecapType(ProductionrecapType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Productionset Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Productionset Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProductionsetType(ProductionsetType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Production Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Production Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProductionType(ProductionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Productname Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Productname Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProductnameType(ProductnameType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Productnumber Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Productnumber Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProductnumberType(ProductnumberType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Programlistingco Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Programlistingco Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProgramlistingcoType(ProgramlistingcoType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Programlisting Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Programlisting Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProgramlistingType(ProgramlistingType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Prompt Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Prompt Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePromptType(PromptType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropertyType(PropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pubdate Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pubdate Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePubdateType(PubdateType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Publishername Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Publishername Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePublishernameType(PublishernameType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Publisher Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Publisher Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePublisherType(PublisherType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Qandadiv Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Qandadiv Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQandadivType(QandadivType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Qandaentry Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Qandaentry Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQandaentryType(QandaentryType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Qandaset Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Qandaset Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQandasetType(QandasetType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Question Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Question Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQuestionType(QuestionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Quote Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Quote Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQuoteType(QuoteType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Refclass Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Refclass Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRefclassType(RefclassType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Refdescriptor Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Refdescriptor Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRefdescriptorType(RefdescriptorType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Refentrytitle Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Refentrytitle Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRefentrytitleType(RefentrytitleType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Refentry Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Refentry Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRefentryType(RefentryType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reference Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reference Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReferenceType(ReferenceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Refmeta Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Refmeta Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRefmetaType(RefmetaType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Refmiscinfo Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Refmiscinfo Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRefmiscinfoType(RefmiscinfoType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Refnamediv Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Refnamediv Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRefnamedivType(RefnamedivType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Refname Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Refname Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRefnameType(RefnameType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Refpurpose Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Refpurpose Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRefpurposeType(RefpurposeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Refsect1 Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Refsect1 Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRefsect1Type(Refsect1Type object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Refsect2 Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Refsect2 Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRefsect2Type(Refsect2Type object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Refsect3 Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Refsect3 Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRefsect3Type(Refsect3Type object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Refsection Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Refsection Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRefsectionType(RefsectionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Refsynopsisdiv Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Refsynopsisdiv Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRefsynopsisdivType(RefsynopsisdivType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Releaseinfo Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Releaseinfo Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReleaseinfoType(ReleaseinfoType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Remark Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Remark Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRemarkType(RemarkType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Replaceable Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Replaceable Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReplaceableType(ReplaceableType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Returnvalue Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Returnvalue Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReturnvalueType(ReturnvalueType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Revdescription Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Revdescription Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRevdescriptionType(RevdescriptionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Revhistory Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Revhistory Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRevhistoryType(RevhistoryType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Revision Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Revision Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRevisionType(RevisionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Revnumber Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Revnumber Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRevnumberType(RevnumberType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Revremark Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Revremark Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRevremarkType(RevremarkType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rhs Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rhs Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRhsType(RhsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Row Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Row Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRowType(RowType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sbr Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sbr Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSbrType(SbrType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Screenco Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Screenco Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScreencoType(ScreencoType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Screenshot Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Screenshot Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScreenshotType(ScreenshotType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Screen Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Screen Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScreenType(ScreenType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Secondaryie Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Secondaryie Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSecondaryieType(SecondaryieType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Secondary Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Secondary Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSecondaryType(SecondaryType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sect1 Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sect1 Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSect1Type(Sect1Type object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sect2 Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sect2 Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSect2Type(Sect2Type object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sect3 Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sect3 Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSect3Type(Sect3Type object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sect4 Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sect4 Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSect4Type(Sect4Type object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sect5 Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sect5 Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSect5Type(Sect5Type object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Section Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Section Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSectionType(SectionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Seealsoie Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Seealsoie Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSeealsoieType(SeealsoieType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Seealso Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Seealso Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSeealsoType(SeealsoType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Seeie Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Seeie Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSeeieType(SeeieType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>See Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>See Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSeeType(SeeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Seglistitem Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Seglistitem Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSeglistitemType(SeglistitemType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Segmentedlist Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Segmentedlist Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSegmentedlistType(SegmentedlistType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Segtitle Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Segtitle Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSegtitleType(SegtitleType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Seg Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Seg Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSegType(SegType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Seriesvolnums Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Seriesvolnums Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSeriesvolnumsType(SeriesvolnumsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Setindex Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Setindex Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSetindexType(SetindexType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Set Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Set Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSetType(SetType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Shortaffil Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Shortaffil Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseShortaffilType(ShortaffilType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Shortcut Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Shortcut Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseShortcutType(ShortcutType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sidebar Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sidebar Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSidebarType(SidebarType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simpara Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simpara Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimparaType(SimparaType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simplelist Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simplelist Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimplelistType(SimplelistType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simplemsgentry Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simplemsgentry Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimplemsgentryType(SimplemsgentryType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simplesect Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simplesect Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimplesectType(SimplesectType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Spanspec Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Spanspec Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpanspecType(SpanspecType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>State Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>State Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStateType(StateType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stepalternatives Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stepalternatives Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStepalternativesType(StepalternativesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Step Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Step Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStepType(StepType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Street Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Street Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStreetType(StreetType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subjectset Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subjectset Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubjectsetType(SubjectsetType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subjectterm Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subjectterm Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubjecttermType(SubjecttermType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subject Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subject Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubjectType(SubjectType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subscript Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subscript Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubscriptType(SubscriptType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Substeps Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Substeps Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubstepsType(SubstepsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subtitle Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subtitle Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubtitleType(SubtitleType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Superscript Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Superscript Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSuperscriptType(SuperscriptType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Surname Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Surname Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSurnameType(SurnameType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Symbol Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Symbol Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSymbolType(SymbolType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Synopfragmentref Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Synopfragmentref Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSynopfragmentrefType(SynopfragmentrefType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Synopfragment Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Synopfragment Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSynopfragmentType(SynopfragmentType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Synopsis Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Synopsis Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSynopsisType(SynopsisType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Systemitem Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Systemitem Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSystemitemType(SystemitemType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Table Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Table Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTableType(TableType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tag Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tag Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTagType(TagType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Taskprerequisites Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Taskprerequisites Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTaskprerequisitesType(TaskprerequisitesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Taskrelated Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Taskrelated Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTaskrelatedType(TaskrelatedType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tasksummary Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tasksummary Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTasksummaryType(TasksummaryType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTaskType(TaskType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tbody Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tbody Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTbodyType(TbodyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Td Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Td Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTdType(TdType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Termdef Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Termdef Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTermdefType(TermdefType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Term Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Term Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTermType(TermType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tertiaryie Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tertiaryie Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTertiaryieType(TertiaryieType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tertiary Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tertiary Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTertiaryType(TertiaryType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Textdata Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Textdata Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTextdataType(TextdataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Textobject Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Textobject Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTextobjectType(TextobjectType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tfoot Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tfoot Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTfootType(TfootType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tgroup Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tgroup Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTgroupType(TgroupType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Thead Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Thead Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTheadType(TheadType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Th Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Th Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseThType(ThType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tip Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tip Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTipType(TipType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Titleabbrev Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Titleabbrev Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTitleabbrevType(TitleabbrevType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Title Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Title Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTitleType(TitleType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tocdiv Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tocdiv Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTocdivType(TocdivType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tocentry Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tocentry Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTocentryType(TocentryType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Toc Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Toc Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTocType(TocType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Token Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Token Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTokenType(TokenType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trademark Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trademark Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrademarkType(TrademarkType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tr Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tr Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrType(TrType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Type2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Type2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeType2(TypeType2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Uri Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Uri Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUriType(UriType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Userinput Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Userinput Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUserinputType(UserinputType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Varargs Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Varargs Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVarargsType(VarargsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variablelist Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variablelist Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariablelistType(VariablelistType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Varlistentry Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Varlistentry Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVarlistentryType(VarlistentryType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Varname Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Varname Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVarnameType(VarnameType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Videodata Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Videodata Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVideodataType(VideodataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Videoobject Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Videoobject Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVideoobjectType(VideoobjectType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Void Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Void Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVoidType(VoidType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Volumenum Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Volumenum Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVolumenumType(VolumenumType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Warning Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Warning Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWarningType(WarningType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wordasword Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wordasword Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWordaswordType(WordaswordType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Xref Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Xref Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXrefType(XrefType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Year Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Year Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYearType(YearType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //DocbookSwitch
