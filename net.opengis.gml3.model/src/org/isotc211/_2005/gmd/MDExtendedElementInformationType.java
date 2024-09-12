/*
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
package org.isotc211._2005.gmd;

import org.eclipse.emf.common.util.EList;

import org.isotc211._2005.gco.AbstractObjectType;
import org.isotc211._2005.gco.CharacterStringPropertyType;
import org.isotc211._2005.gco.IntegerPropertyType;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MD Extended Element Information Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * New metadata element, not found in ISO 19115, which is required to describe geographic data
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.isotc211._2005.gmd.MDExtendedElementInformationType#getName <em>Name</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.MDExtendedElementInformationType#getShortName <em>Short Name</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.MDExtendedElementInformationType#getDomainCode <em>Domain Code</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.MDExtendedElementInformationType#getDefinition <em>Definition</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.MDExtendedElementInformationType#getObligation <em>Obligation</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.MDExtendedElementInformationType#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.MDExtendedElementInformationType#getDataType <em>Data Type</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.MDExtendedElementInformationType#getMaximumOccurrence <em>Maximum Occurrence</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.MDExtendedElementInformationType#getDomainValue <em>Domain Value</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.MDExtendedElementInformationType#getParentEntity <em>Parent Entity</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.MDExtendedElementInformationType#getRule <em>Rule</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.MDExtendedElementInformationType#getRationale <em>Rationale</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.MDExtendedElementInformationType#getSource <em>Source</em>}</li>
 * </ul>
 *
 * @see org.isotc211._2005.gmd.GMDPackage#getMDExtendedElementInformationType()
 * @model extendedMetaData="name='MD_ExtendedElementInformation_Type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface MDExtendedElementInformationType extends AbstractObjectType {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(CharacterStringPropertyType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getMDExtendedElementInformationType_Name()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	CharacterStringPropertyType getName();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.MDExtendedElementInformationType#getName <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' containment reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(CharacterStringPropertyType value);

	/**
	 * Returns the value of the '<em><b>Short Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Short Name</em>' containment reference.
	 * @see #setShortName(CharacterStringPropertyType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getMDExtendedElementInformationType_ShortName()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='shortName' namespace='##targetNamespace'"
	 * @generated
	 */
	CharacterStringPropertyType getShortName();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.MDExtendedElementInformationType#getShortName <em>Short Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Short Name</em>' containment reference.
	 * @see #getShortName()
	 * @generated
	 */
	void setShortName(CharacterStringPropertyType value);

	/**
	 * Returns the value of the '<em><b>Domain Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Code</em>' containment reference.
	 * @see #setDomainCode(IntegerPropertyType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getMDExtendedElementInformationType_DomainCode()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='domainCode' namespace='##targetNamespace'"
	 * @generated
	 */
	IntegerPropertyType getDomainCode();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.MDExtendedElementInformationType#getDomainCode <em>Domain Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain Code</em>' containment reference.
	 * @see #getDomainCode()
	 * @generated
	 */
	void setDomainCode(IntegerPropertyType value);

	/**
	 * Returns the value of the '<em><b>Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Definition</em>' containment reference.
	 * @see #setDefinition(CharacterStringPropertyType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getMDExtendedElementInformationType_Definition()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='definition' namespace='##targetNamespace'"
	 * @generated
	 */
	CharacterStringPropertyType getDefinition();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.MDExtendedElementInformationType#getDefinition <em>Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Definition</em>' containment reference.
	 * @see #getDefinition()
	 * @generated
	 */
	void setDefinition(CharacterStringPropertyType value);

	/**
	 * Returns the value of the '<em><b>Obligation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Obligation</em>' containment reference.
	 * @see #setObligation(MDObligationCodePropertyType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getMDExtendedElementInformationType_Obligation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='obligation' namespace='##targetNamespace'"
	 * @generated
	 */
	MDObligationCodePropertyType getObligation();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.MDExtendedElementInformationType#getObligation <em>Obligation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Obligation</em>' containment reference.
	 * @see #getObligation()
	 * @generated
	 */
	void setObligation(MDObligationCodePropertyType value);

	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference.
	 * @see #setCondition(CharacterStringPropertyType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getMDExtendedElementInformationType_Condition()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='condition' namespace='##targetNamespace'"
	 * @generated
	 */
	CharacterStringPropertyType getCondition();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.MDExtendedElementInformationType#getCondition <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' containment reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(CharacterStringPropertyType value);

	/**
	 * Returns the value of the '<em><b>Data Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Type</em>' containment reference.
	 * @see #setDataType(MDDatatypeCodePropertyType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getMDExtendedElementInformationType_DataType()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='dataType' namespace='##targetNamespace'"
	 * @generated
	 */
	MDDatatypeCodePropertyType getDataType();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.MDExtendedElementInformationType#getDataType <em>Data Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Type</em>' containment reference.
	 * @see #getDataType()
	 * @generated
	 */
	void setDataType(MDDatatypeCodePropertyType value);

	/**
	 * Returns the value of the '<em><b>Maximum Occurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maximum Occurrence</em>' containment reference.
	 * @see #setMaximumOccurrence(CharacterStringPropertyType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getMDExtendedElementInformationType_MaximumOccurrence()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='maximumOccurrence' namespace='##targetNamespace'"
	 * @generated
	 */
	CharacterStringPropertyType getMaximumOccurrence();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.MDExtendedElementInformationType#getMaximumOccurrence <em>Maximum Occurrence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum Occurrence</em>' containment reference.
	 * @see #getMaximumOccurrence()
	 * @generated
	 */
	void setMaximumOccurrence(CharacterStringPropertyType value);

	/**
	 * Returns the value of the '<em><b>Domain Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Value</em>' containment reference.
	 * @see #setDomainValue(CharacterStringPropertyType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getMDExtendedElementInformationType_DomainValue()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='domainValue' namespace='##targetNamespace'"
	 * @generated
	 */
	CharacterStringPropertyType getDomainValue();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.MDExtendedElementInformationType#getDomainValue <em>Domain Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain Value</em>' containment reference.
	 * @see #getDomainValue()
	 * @generated
	 */
	void setDomainValue(CharacterStringPropertyType value);

	/**
	 * Returns the value of the '<em><b>Parent Entity</b></em>' containment reference list.
	 * The list contents are of type {@link org.isotc211._2005.gco.CharacterStringPropertyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Entity</em>' containment reference list.
	 * @see org.isotc211._2005.gmd.GMDPackage#getMDExtendedElementInformationType_ParentEntity()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='parentEntity' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CharacterStringPropertyType> getParentEntity();

	/**
	 * Returns the value of the '<em><b>Rule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule</em>' containment reference.
	 * @see #setRule(CharacterStringPropertyType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getMDExtendedElementInformationType_Rule()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='rule' namespace='##targetNamespace'"
	 * @generated
	 */
	CharacterStringPropertyType getRule();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.MDExtendedElementInformationType#getRule <em>Rule</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rule</em>' containment reference.
	 * @see #getRule()
	 * @generated
	 */
	void setRule(CharacterStringPropertyType value);

	/**
	 * Returns the value of the '<em><b>Rationale</b></em>' containment reference list.
	 * The list contents are of type {@link org.isotc211._2005.gco.CharacterStringPropertyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rationale</em>' containment reference list.
	 * @see org.isotc211._2005.gmd.GMDPackage#getMDExtendedElementInformationType_Rationale()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='rationale' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CharacterStringPropertyType> getRationale();

	/**
	 * Returns the value of the '<em><b>Source</b></em>' containment reference list.
	 * The list contents are of type {@link org.isotc211._2005.gmd.CIResponsiblePartyPropertyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' containment reference list.
	 * @see org.isotc211._2005.gmd.GMDPackage#getMDExtendedElementInformationType_Source()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='source' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CIResponsiblePartyPropertyType> getSource();

} // MDExtendedElementInformationType
