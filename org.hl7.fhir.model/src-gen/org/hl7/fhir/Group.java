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
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Represents a defined collection of entities that may be discussed or acted upon collectively but which are not expected to act collectively, and are not formally or legally recognized; i.e. a collection of entities that isn't an Organization.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.Group#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.Group#getActive <em>Active</em>}</li>
 *   <li>{@link org.hl7.fhir.Group#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.Group#getMembership <em>Membership</em>}</li>
 *   <li>{@link org.hl7.fhir.Group#getCode <em>Code</em>}</li>
 *   <li>{@link org.hl7.fhir.Group#getName <em>Name</em>}</li>
 *   <li>{@link org.hl7.fhir.Group#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.fhir.Group#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link org.hl7.fhir.Group#getManagingEntity <em>Managing Entity</em>}</li>
 *   <li>{@link org.hl7.fhir.Group#getCharacteristic <em>Characteristic</em>}</li>
 *   <li>{@link org.hl7.fhir.Group#getMember <em>Member</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FHIRPackage#getGroup()
 * @model extendedMetaData="name='Group' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface Group extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Identifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Business identifiers assigned to this participant by one of the applications involved.  These identifiers remain constant as the resource is updated and propagates from server to server.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference list.
	 * @see org.hl7.fhir.FHIRPackage#getGroup_Identifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='identifier' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Identifier> getIdentifier();

	/**
	 * Returns the value of the '<em><b>Active</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates whether the record for the group is available for use or is merely being retained for historical purposes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Active</em>' containment reference.
	 * @see #setActive(org.hl7.fhir.Boolean)
	 * @see org.hl7.fhir.FHIRPackage#getGroup_Active()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='active' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Boolean getActive();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Group#getActive <em>Active</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Active</em>' containment reference.
	 * @see #getActive()
	 * @generated
	 */
	void setActive(org.hl7.fhir.Boolean value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies the broad classification of the kind of resources the group includes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(GroupType)
	 * @see org.hl7.fhir.FHIRPackage#getGroup_Type()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	GroupType getType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Group#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(GroupType value);

	/**
	 * Returns the value of the '<em><b>Membership</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Basis for membership in the Group:
	 * 
	 * * 'definitional': The Group.characteristics specified are both necessary and sufficient to determine membership. All entities that meet the criteria are considered to be members of the group, whether referenced by the group or not. If members are present, they are individuals that happen to be known as meeting the Group.characteristics. The list cannot be presumed to be complete.
	 * * 'enumerated': The Group.characteristics are necessary but not sufficient to determine membership. Membership is determined by being listed as one of the Group.member.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Membership</em>' containment reference.
	 * @see #setMembership(GroupMembershipBasis)
	 * @see org.hl7.fhir.FHIRPackage#getGroup_Membership()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='membership' namespace='##targetNamespace'"
	 * @generated
	 */
	GroupMembershipBasis getMembership();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Group#getMembership <em>Membership</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Membership</em>' containment reference.
	 * @see #getMembership()
	 * @generated
	 */
	void setMembership(GroupMembershipBasis value);

	/**
	 * Returns the value of the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Provides a specific type of resource the group includes; e.g. "cow", "syringe", etc.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Code</em>' containment reference.
	 * @see #setCode(CodeableConcept)
	 * @see org.hl7.fhir.FHIRPackage#getGroup_Code()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='code' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getCode();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Group#getCode <em>Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' containment reference.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A label assigned to the group for human identification and communication.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FHIRPackage#getGroup_Name()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getName();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Group#getName <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' containment reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Explanation of what the group represents and how it is intended to be used.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(Markdown)
	 * @see org.hl7.fhir.FHIRPackage#getGroup_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	Markdown getDescription();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Group#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(Markdown value);

	/**
	 * Returns the value of the '<em><b>Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A count of the number of resource instances that are part of the group.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Quantity</em>' containment reference.
	 * @see #setQuantity(UnsignedInt)
	 * @see org.hl7.fhir.FHIRPackage#getGroup_Quantity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='quantity' namespace='##targetNamespace'"
	 * @generated
	 */
	UnsignedInt getQuantity();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Group#getQuantity <em>Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity</em>' containment reference.
	 * @see #getQuantity()
	 * @generated
	 */
	void setQuantity(UnsignedInt value);

	/**
	 * Returns the value of the '<em><b>Managing Entity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Entity responsible for defining and maintaining Group characteristics and/or registered members.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Managing Entity</em>' containment reference.
	 * @see #setManagingEntity(Reference)
	 * @see org.hl7.fhir.FHIRPackage#getGroup_ManagingEntity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='managingEntity' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getManagingEntity();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Group#getManagingEntity <em>Managing Entity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Managing Entity</em>' containment reference.
	 * @see #getManagingEntity()
	 * @generated
	 */
	void setManagingEntity(Reference value);

	/**
	 * Returns the value of the '<em><b>Characteristic</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.GroupCharacteristic}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies traits whose presence r absence is shared by members of the group.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Characteristic</em>' containment reference list.
	 * @see org.hl7.fhir.FHIRPackage#getGroup_Characteristic()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='characteristic' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<GroupCharacteristic> getCharacteristic();

	/**
	 * Returns the value of the '<em><b>Member</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.GroupMember}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies the resource instances that are members of the group.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Member</em>' containment reference list.
	 * @see org.hl7.fhir.FHIRPackage#getGroup_Member()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='member' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<GroupMember> getMember();

} // Group
