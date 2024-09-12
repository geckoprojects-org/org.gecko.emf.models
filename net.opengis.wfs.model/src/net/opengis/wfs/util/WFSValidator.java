/**
 * Copyright (c) 2012 - 2024 Data In Motion and others.
 * All rights reserved. 
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *      Mark Hoffmann - initial API and implementation
 */
package net.opengis.wfs.util;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.xml.namespace.QName;

import net.opengis.wfs.*;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.eclipse.emf.ecore.xml.type.util.XMLTypeUtil;
import org.eclipse.emf.ecore.xml.type.util.XMLTypeValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see net.opengis.wfs.WFSPackage
 * @generated
 */
public class WFSValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final WFSValidator INSTANCE = new WFSValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "net.opengis.wfs";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XMLTypeValidator xmlTypeValidator;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WFSValidator() {
		super();
		xmlTypeValidator = XMLTypeValidator.INSTANCE;
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return WFSPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case WFSPackage.ACTION_TYPE:
				return validateActionType((ActionType)value, diagnostics, context);
			case WFSPackage.BASE_REQUEST_TYPE:
				return validateBaseRequestType((BaseRequestType)value, diagnostics, context);
			case WFSPackage.DELETE_ELEMENT_TYPE:
				return validateDeleteElementType((DeleteElementType)value, diagnostics, context);
			case WFSPackage.DESCRIBE_FEATURE_TYPE_TYPE:
				return validateDescribeFeatureTypeType((DescribeFeatureTypeType)value, diagnostics, context);
			case WFSPackage.DOCUMENT_ROOT:
				return validateDocumentRoot((DocumentRoot)value, diagnostics, context);
			case WFSPackage.FEATURE_COLLECTION_TYPE:
				return validateFeatureCollectionType((FeatureCollectionType)value, diagnostics, context);
			case WFSPackage.FEATURES_LOCKED_TYPE:
				return validateFeaturesLockedType((FeaturesLockedType)value, diagnostics, context);
			case WFSPackage.FEATURES_NOT_LOCKED_TYPE:
				return validateFeaturesNotLockedType((FeaturesNotLockedType)value, diagnostics, context);
			case WFSPackage.FEATURE_TYPE_LIST_TYPE:
				return validateFeatureTypeListType((FeatureTypeListType)value, diagnostics, context);
			case WFSPackage.FEATURE_TYPE_TYPE:
				return validateFeatureTypeType((FeatureTypeType)value, diagnostics, context);
			case WFSPackage.GET_CAPABILITIES_TYPE:
				return validateGetCapabilitiesType((GetCapabilitiesType)value, diagnostics, context);
			case WFSPackage.GET_FEATURE_TYPE:
				return validateGetFeatureType((GetFeatureType)value, diagnostics, context);
			case WFSPackage.GET_FEATURE_WITH_LOCK_TYPE:
				return validateGetFeatureWithLockType((GetFeatureWithLockType)value, diagnostics, context);
			case WFSPackage.GET_GML_OBJECT_TYPE:
				return validateGetGmlObjectType((GetGmlObjectType)value, diagnostics, context);
			case WFSPackage.GML_OBJECT_TYPE_LIST_TYPE:
				return validateGMLObjectTypeListType((GMLObjectTypeListType)value, diagnostics, context);
			case WFSPackage.GML_OBJECT_TYPE_TYPE:
				return validateGMLObjectTypeType((GMLObjectTypeType)value, diagnostics, context);
			case WFSPackage.INSERTED_FEATURE_TYPE:
				return validateInsertedFeatureType((InsertedFeatureType)value, diagnostics, context);
			case WFSPackage.INSERT_ELEMENT_TYPE:
				return validateInsertElementType((InsertElementType)value, diagnostics, context);
			case WFSPackage.INSERT_RESULTS_TYPE:
				return validateInsertResultsType((InsertResultsType)value, diagnostics, context);
			case WFSPackage.LOCK_FEATURE_RESPONSE_TYPE:
				return validateLockFeatureResponseType((LockFeatureResponseType)value, diagnostics, context);
			case WFSPackage.LOCK_FEATURE_TYPE:
				return validateLockFeatureType((LockFeatureType)value, diagnostics, context);
			case WFSPackage.LOCK_TYPE:
				return validateLockType((LockType)value, diagnostics, context);
			case WFSPackage.METADATA_URL_TYPE:
				return validateMetadataURLType((MetadataURLType)value, diagnostics, context);
			case WFSPackage.NATIVE_TYPE:
				return validateNativeType((NativeType)value, diagnostics, context);
			case WFSPackage.NO_SRS_TYPE:
				return validateNoSRSType((NoSRSType)value, diagnostics, context);
			case WFSPackage.OPERATIONS_TYPE:
				return validateOperationsType((OperationsType)value, diagnostics, context);
			case WFSPackage.OUTPUT_FORMAT_LIST_TYPE:
				return validateOutputFormatListType((OutputFormatListType)value, diagnostics, context);
			case WFSPackage.PROPERTY_TYPE:
				return validatePropertyType((PropertyType)value, diagnostics, context);
			case WFSPackage.QUERY_TYPE:
				return validateQueryType((QueryType)value, diagnostics, context);
			case WFSPackage.TRANSACTION_RESPONSE_TYPE:
				return validateTransactionResponseType((TransactionResponseType)value, diagnostics, context);
			case WFSPackage.TRANSACTION_RESULTS_TYPE:
				return validateTransactionResultsType((TransactionResultsType)value, diagnostics, context);
			case WFSPackage.TRANSACTION_SUMMARY_TYPE:
				return validateTransactionSummaryType((TransactionSummaryType)value, diagnostics, context);
			case WFSPackage.TRANSACTION_TYPE:
				return validateTransactionType((TransactionType)value, diagnostics, context);
			case WFSPackage.UPDATE_ELEMENT_TYPE:
				return validateUpdateElementType((UpdateElementType)value, diagnostics, context);
			case WFSPackage.WFS_CAPABILITIES_TYPE:
				return validateWFSCapabilitiesType((WFSCapabilitiesType)value, diagnostics, context);
			case WFSPackage.XLINK_PROPERTY_NAME_TYPE:
				return validateXlinkPropertyNameType((XlinkPropertyNameType)value, diagnostics, context);
			case WFSPackage.ALL_SOME_TYPE:
				return validateAllSomeType((AllSomeType)value, diagnostics, context);
			case WFSPackage.FORMAT_TYPE:
				return validateFormatType((FormatType)value, diagnostics, context);
			case WFSPackage.IDENTIFIER_GENERATION_OPTION_TYPE:
				return validateIdentifierGenerationOptionType((IdentifierGenerationOptionType)value, diagnostics, context);
			case WFSPackage.OPERATION_TYPE:
				return validateOperationType((OperationType)value, diagnostics, context);
			case WFSPackage.RESULT_TYPE_TYPE:
				return validateResultTypeType((ResultTypeType)value, diagnostics, context);
			case WFSPackage.TYPE_TYPE:
				return validateTypeType((TypeType)value, diagnostics, context);
			case WFSPackage.ALL_SOME_TYPE_OBJECT:
				return validateAllSomeTypeObject((AllSomeType)value, diagnostics, context);
			case WFSPackage.BASE_TYPE_NAME_LIST_TYPE:
				return validateBaseTypeNameListType((List<?>)value, diagnostics, context);
			case WFSPackage.FORMAT_TYPE_OBJECT:
				return validateFormatTypeObject((FormatType)value, diagnostics, context);
			case WFSPackage.IDENTIFIER_GENERATION_OPTION_TYPE_OBJECT:
				return validateIdentifierGenerationOptionTypeObject((IdentifierGenerationOptionType)value, diagnostics, context);
			case WFSPackage.OPERATION_TYPE_OBJECT:
				return validateOperationTypeObject((OperationType)value, diagnostics, context);
			case WFSPackage.RESULT_TYPE_TYPE_OBJECT:
				return validateResultTypeTypeObject((ResultTypeType)value, diagnostics, context);
			case WFSPackage.TYPE_NAME_LIST_TYPE:
				return validateTypeNameListType((List<?>)value, diagnostics, context);
			case WFSPackage.TYPE_TYPE_OBJECT:
				return validateTypeTypeObject((TypeType)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActionType(ActionType actionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(actionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBaseRequestType(BaseRequestType baseRequestType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(baseRequestType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeleteElementType(DeleteElementType deleteElementType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(deleteElementType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDescribeFeatureTypeType(DescribeFeatureTypeType describeFeatureTypeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(describeFeatureTypeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDocumentRoot(DocumentRoot documentRoot, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(documentRoot, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFeatureCollectionType(FeatureCollectionType featureCollectionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(featureCollectionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFeaturesLockedType(FeaturesLockedType featuresLockedType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(featuresLockedType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFeaturesNotLockedType(FeaturesNotLockedType featuresNotLockedType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(featuresNotLockedType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFeatureTypeListType(FeatureTypeListType featureTypeListType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(featureTypeListType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFeatureTypeType(FeatureTypeType featureTypeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(featureTypeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGetCapabilitiesType(GetCapabilitiesType getCapabilitiesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(getCapabilitiesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGetFeatureType(GetFeatureType getFeatureType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(getFeatureType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGetFeatureWithLockType(GetFeatureWithLockType getFeatureWithLockType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(getFeatureWithLockType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGetGmlObjectType(GetGmlObjectType getGmlObjectType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(getGmlObjectType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGMLObjectTypeListType(GMLObjectTypeListType gmlObjectTypeListType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(gmlObjectTypeListType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGMLObjectTypeType(GMLObjectTypeType gmlObjectTypeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(gmlObjectTypeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInsertedFeatureType(InsertedFeatureType insertedFeatureType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(insertedFeatureType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInsertElementType(InsertElementType insertElementType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(insertElementType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInsertResultsType(InsertResultsType insertResultsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(insertResultsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLockFeatureResponseType(LockFeatureResponseType lockFeatureResponseType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(lockFeatureResponseType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLockFeatureType(LockFeatureType lockFeatureType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(lockFeatureType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLockType(LockType lockType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(lockType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMetadataURLType(MetadataURLType metadataURLType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(metadataURLType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNativeType(NativeType nativeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(nativeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNoSRSType(NoSRSType noSRSType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(noSRSType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperationsType(OperationsType operationsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(operationsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOutputFormatListType(OutputFormatListType outputFormatListType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(outputFormatListType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePropertyType(PropertyType propertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(propertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQueryType(QueryType queryType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(queryType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransactionResponseType(TransactionResponseType transactionResponseType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(transactionResponseType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransactionResultsType(TransactionResultsType transactionResultsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(transactionResultsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransactionSummaryType(TransactionSummaryType transactionSummaryType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(transactionSummaryType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransactionType(TransactionType transactionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(transactionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUpdateElementType(UpdateElementType updateElementType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(updateElementType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWFSCapabilitiesType(WFSCapabilitiesType wfsCapabilitiesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(wfsCapabilitiesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateXlinkPropertyNameType(XlinkPropertyNameType xlinkPropertyNameType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(xlinkPropertyNameType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllSomeType(AllSomeType allSomeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFormatType(FormatType formatType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIdentifierGenerationOptionType(IdentifierGenerationOptionType identifierGenerationOptionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperationType(OperationType operationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResultTypeType(ResultTypeType resultTypeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeType(TypeType typeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllSomeTypeObject(AllSomeType allSomeTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBaseTypeNameListType(List<?> baseTypeNameListType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateBaseTypeNameListType_ItemType(baseTypeNameListType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ItemType constraint of '<em>Base Type Name List Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBaseTypeNameListType_ItemType(List<?> baseTypeNameListType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = true;
		for (Iterator<?> i = baseTypeNameListType.iterator(); i.hasNext() && (result || diagnostics != null); ) {
			Object item = i.next();
			if (XMLTypePackage.Literals.QNAME.isInstance(item)) {
				result &= xmlTypeValidator.validateQName((QName)item, diagnostics, context);
			}
			else {
				result = false;
				reportDataValueTypeViolation(XMLTypePackage.Literals.QNAME, item, diagnostics, context);
			}
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFormatTypeObject(FormatType formatTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIdentifierGenerationOptionTypeObject(IdentifierGenerationOptionType identifierGenerationOptionTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperationTypeObject(OperationType operationTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResultTypeTypeObject(ResultTypeType resultTypeTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeNameListType(List<?> typeNameListType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateBaseTypeNameListType_ItemType(typeNameListType, diagnostics, context);
		if (result || diagnostics != null) result &= validateTypeNameListType_Pattern(typeNameListType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateTypeNameListType_Pattern
	 */
	public static final  PatternMatcher [][] TYPE_NAME_LIST_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("((\\w:)?\\w(=\\w)?){1,}")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Type Name List Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeNameListType_Pattern(List<?> typeNameListType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(WFSPackage.Literals.TYPE_NAME_LIST_TYPE, typeNameListType, TYPE_NAME_LIST_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeTypeObject(TypeType typeTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //WFSValidator
