/*
 * Copyright (c) 2012 - 2025 Data In Motion and others.
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
package org.open.oasis.docs.odata.ns.edm;

import org.eclipse.emf.ecore.EFactory;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage
 * @generated
 */
@ProviderType
public interface EdmFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EdmFactory eINSTANCE = org.open.oasis.docs.odata.ns.edm.impl.EdmFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Annotation Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Annotation Type</em>'.
	 * @generated
	 */
	AnnotationType createAnnotationType();

	/**
	 * Returns a new object of class '<em>Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Root</em>'.
	 * @generated
	 */
	EdmRoot createEdmRoot();

	/**
	 * Returns a new object of class '<em>Schema Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Schema Type</em>'.
	 * @generated
	 */
	SchemaType createSchemaType();

	/**
	 * Returns a new object of class '<em>TAction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TAction</em>'.
	 * @generated
	 */
	TAction createTAction();

	/**
	 * Returns a new object of class '<em>TAction Function Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TAction Function Parameter</em>'.
	 * @generated
	 */
	TActionFunctionParameter createTActionFunctionParameter();

	/**
	 * Returns a new object of class '<em>TAction Function Return Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TAction Function Return Type</em>'.
	 * @generated
	 */
	TActionFunctionReturnType createTActionFunctionReturnType();

	/**
	 * Returns a new object of class '<em>TAction Import</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TAction Import</em>'.
	 * @generated
	 */
	TActionImport createTActionImport();

	/**
	 * Returns a new object of class '<em>TAnnotations</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TAnnotations</em>'.
	 * @generated
	 */
	TAnnotations createTAnnotations();

	/**
	 * Returns a new object of class '<em>TApply Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TApply Expression</em>'.
	 * @generated
	 */
	TApplyExpression createTApplyExpression();

	/**
	 * Returns a new object of class '<em>TBinary Constant Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TBinary Constant Expression</em>'.
	 * @generated
	 */
	TBinaryConstantExpression createTBinaryConstantExpression();

	/**
	 * Returns a new object of class '<em>TBool Constant Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TBool Constant Expression</em>'.
	 * @generated
	 */
	TBoolConstantExpression createTBoolConstantExpression();

	/**
	 * Returns a new object of class '<em>TCast Or Is Of Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TCast Or Is Of Expression</em>'.
	 * @generated
	 */
	TCastOrIsOfExpression createTCastOrIsOfExpression();

	/**
	 * Returns a new object of class '<em>TCollection Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TCollection Expression</em>'.
	 * @generated
	 */
	TCollectionExpression createTCollectionExpression();

	/**
	 * Returns a new object of class '<em>TComplex Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TComplex Type</em>'.
	 * @generated
	 */
	TComplexType createTComplexType();

	/**
	 * Returns a new object of class '<em>TDate Constant Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TDate Constant Expression</em>'.
	 * @generated
	 */
	TDateConstantExpression createTDateConstantExpression();

	/**
	 * Returns a new object of class '<em>TDate Time Offset Constant Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TDate Time Offset Constant Expression</em>'.
	 * @generated
	 */
	TDateTimeOffsetConstantExpression createTDateTimeOffsetConstantExpression();

	/**
	 * Returns a new object of class '<em>TDecimal Constant Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TDecimal Constant Expression</em>'.
	 * @generated
	 */
	TDecimalConstantExpression createTDecimalConstantExpression();

	/**
	 * Returns a new object of class '<em>TDuration Constant Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TDuration Constant Expression</em>'.
	 * @generated
	 */
	TDurationConstantExpression createTDurationConstantExpression();

	/**
	 * Returns a new object of class '<em>TEntity Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TEntity Container</em>'.
	 * @generated
	 */
	TEntityContainer createTEntityContainer();

	/**
	 * Returns a new object of class '<em>TEntity Key Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TEntity Key Element</em>'.
	 * @generated
	 */
	TEntityKeyElement createTEntityKeyElement();

	/**
	 * Returns a new object of class '<em>TEntity Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TEntity Set</em>'.
	 * @generated
	 */
	TEntitySet createTEntitySet();

	/**
	 * Returns a new object of class '<em>TEntity Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TEntity Type</em>'.
	 * @generated
	 */
	TEntityType createTEntityType();

	/**
	 * Returns a new object of class '<em>TEnum Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TEnum Type</em>'.
	 * @generated
	 */
	TEnumType createTEnumType();

	/**
	 * Returns a new object of class '<em>TEnum Type Member</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TEnum Type Member</em>'.
	 * @generated
	 */
	TEnumTypeMember createTEnumTypeMember();

	/**
	 * Returns a new object of class '<em>TFloat Constant Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TFloat Constant Expression</em>'.
	 * @generated
	 */
	TFloatConstantExpression createTFloatConstantExpression();

	/**
	 * Returns a new object of class '<em>TFunction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TFunction</em>'.
	 * @generated
	 */
	TFunction createTFunction();

	/**
	 * Returns a new object of class '<em>TFunction Import</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TFunction Import</em>'.
	 * @generated
	 */
	TFunctionImport createTFunctionImport();

	/**
	 * Returns a new object of class '<em>TGuid Constant Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TGuid Constant Expression</em>'.
	 * @generated
	 */
	TGuidConstantExpression createTGuidConstantExpression();

	/**
	 * Returns a new object of class '<em>TIf Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TIf Expression</em>'.
	 * @generated
	 */
	TIfExpression createTIfExpression();

	/**
	 * Returns a new object of class '<em>TInt Constant Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TInt Constant Expression</em>'.
	 * @generated
	 */
	TIntConstantExpression createTIntConstantExpression();

	/**
	 * Returns a new object of class '<em>TLabeled Element Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TLabeled Element Expression</em>'.
	 * @generated
	 */
	TLabeledElementExpression createTLabeledElementExpression();

	/**
	 * Returns a new object of class '<em>TLabeled Element Reference Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TLabeled Element Reference Expression</em>'.
	 * @generated
	 */
	TLabeledElementReferenceExpression createTLabeledElementReferenceExpression();

	/**
	 * Returns a new object of class '<em>TNavigation Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TNavigation Property</em>'.
	 * @generated
	 */
	TNavigationProperty createTNavigationProperty();

	/**
	 * Returns a new object of class '<em>TNavigation Property Binding</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TNavigation Property Binding</em>'.
	 * @generated
	 */
	TNavigationPropertyBinding createTNavigationPropertyBinding();

	/**
	 * Returns a new object of class '<em>TNull Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TNull Expression</em>'.
	 * @generated
	 */
	TNullExpression createTNullExpression();

	/**
	 * Returns a new object of class '<em>TOn Delete</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TOn Delete</em>'.
	 * @generated
	 */
	TOnDelete createTOnDelete();

	/**
	 * Returns a new object of class '<em>TOne Child Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TOne Child Expression</em>'.
	 * @generated
	 */
	TOneChildExpression createTOneChildExpression();

	/**
	 * Returns a new object of class '<em>TProperty</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TProperty</em>'.
	 * @generated
	 */
	TProperty createTProperty();

	/**
	 * Returns a new object of class '<em>TProperty Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TProperty Ref</em>'.
	 * @generated
	 */
	TPropertyRef createTPropertyRef();

	/**
	 * Returns a new object of class '<em>TProperty Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TProperty Value</em>'.
	 * @generated
	 */
	TPropertyValue createTPropertyValue();

	/**
	 * Returns a new object of class '<em>TRecord Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TRecord Expression</em>'.
	 * @generated
	 */
	TRecordExpression createTRecordExpression();

	/**
	 * Returns a new object of class '<em>TReferential Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TReferential Constraint</em>'.
	 * @generated
	 */
	TReferentialConstraint createTReferentialConstraint();

	/**
	 * Returns a new object of class '<em>TSingleton</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TSingleton</em>'.
	 * @generated
	 */
	TSingleton createTSingleton();

	/**
	 * Returns a new object of class '<em>TString Constant Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TString Constant Expression</em>'.
	 * @generated
	 */
	TStringConstantExpression createTStringConstantExpression();

	/**
	 * Returns a new object of class '<em>TTerm</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TTerm</em>'.
	 * @generated
	 */
	TTerm createTTerm();

	/**
	 * Returns a new object of class '<em>TTime Of Day Constant Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TTime Of Day Constant Expression</em>'.
	 * @generated
	 */
	TTimeOfDayConstantExpression createTTimeOfDayConstantExpression();

	/**
	 * Returns a new object of class '<em>TTwo Children Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TTwo Children Expression</em>'.
	 * @generated
	 */
	TTwoChildrenExpression createTTwoChildrenExpression();

	/**
	 * Returns a new object of class '<em>TType Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TType Definition</em>'.
	 * @generated
	 */
	TTypeDefinition createTTypeDefinition();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	EdmPackage getEdmPackage();

} //EdmFactory
