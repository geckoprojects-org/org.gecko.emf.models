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
package org.isotc211._2005.gmd.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.isotc211._2005.gco.CharacterStringPropertyType;
import org.isotc211._2005.gco.IntegerPropertyType;

import org.isotc211._2005.gco.impl.AbstractObjectTypeImpl;

import org.isotc211._2005.gmd.CIResponsiblePartyPropertyType;
import org.isotc211._2005.gmd.GMDPackage;
import org.isotc211._2005.gmd.MDDatatypeCodePropertyType;
import org.isotc211._2005.gmd.MDExtendedElementInformationType;
import org.isotc211._2005.gmd.MDObligationCodePropertyType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MD Extended Element Information Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.isotc211._2005.gmd.impl.MDExtendedElementInformationTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.MDExtendedElementInformationTypeImpl#getShortName <em>Short Name</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.MDExtendedElementInformationTypeImpl#getDomainCode <em>Domain Code</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.MDExtendedElementInformationTypeImpl#getDefinition <em>Definition</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.MDExtendedElementInformationTypeImpl#getObligation <em>Obligation</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.MDExtendedElementInformationTypeImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.MDExtendedElementInformationTypeImpl#getDataType <em>Data Type</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.MDExtendedElementInformationTypeImpl#getMaximumOccurrence <em>Maximum Occurrence</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.MDExtendedElementInformationTypeImpl#getDomainValue <em>Domain Value</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.MDExtendedElementInformationTypeImpl#getParentEntity <em>Parent Entity</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.MDExtendedElementInformationTypeImpl#getRule <em>Rule</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.MDExtendedElementInformationTypeImpl#getRationale <em>Rationale</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.MDExtendedElementInformationTypeImpl#getSource <em>Source</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MDExtendedElementInformationTypeImpl extends AbstractObjectTypeImpl implements MDExtendedElementInformationType {
	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected CharacterStringPropertyType name;

	/**
	 * The cached value of the '{@link #getShortName() <em>Short Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShortName()
	 * @generated
	 * @ordered
	 */
	protected CharacterStringPropertyType shortName;

	/**
	 * The cached value of the '{@link #getDomainCode() <em>Domain Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainCode()
	 * @generated
	 * @ordered
	 */
	protected IntegerPropertyType domainCode;

	/**
	 * The cached value of the '{@link #getDefinition() <em>Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinition()
	 * @generated
	 * @ordered
	 */
	protected CharacterStringPropertyType definition;

	/**
	 * The cached value of the '{@link #getObligation() <em>Obligation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObligation()
	 * @generated
	 * @ordered
	 */
	protected MDObligationCodePropertyType obligation;

	/**
	 * The cached value of the '{@link #getCondition() <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected CharacterStringPropertyType condition;

	/**
	 * The cached value of the '{@link #getDataType() <em>Data Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataType()
	 * @generated
	 * @ordered
	 */
	protected MDDatatypeCodePropertyType dataType;

	/**
	 * The cached value of the '{@link #getMaximumOccurrence() <em>Maximum Occurrence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumOccurrence()
	 * @generated
	 * @ordered
	 */
	protected CharacterStringPropertyType maximumOccurrence;

	/**
	 * The cached value of the '{@link #getDomainValue() <em>Domain Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainValue()
	 * @generated
	 * @ordered
	 */
	protected CharacterStringPropertyType domainValue;

	/**
	 * The cached value of the '{@link #getParentEntity() <em>Parent Entity</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentEntity()
	 * @generated
	 * @ordered
	 */
	protected EList<CharacterStringPropertyType> parentEntity;

	/**
	 * The cached value of the '{@link #getRule() <em>Rule</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRule()
	 * @generated
	 * @ordered
	 */
	protected CharacterStringPropertyType rule;

	/**
	 * The cached value of the '{@link #getRationale() <em>Rationale</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRationale()
	 * @generated
	 * @ordered
	 */
	protected EList<CharacterStringPropertyType> rationale;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected EList<CIResponsiblePartyPropertyType> source;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MDExtendedElementInformationTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMDPackage.eINSTANCE.getMDExtendedElementInformationType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CharacterStringPropertyType getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetName(CharacterStringPropertyType newName, NotificationChain msgs) {
		CharacterStringPropertyType oldName = name;
		name = newName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMDPackage.MD_EXTENDED_ELEMENT_INFORMATION_TYPE__NAME, oldName, newName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(CharacterStringPropertyType newName) {
		if (newName != name) {
			NotificationChain msgs = null;
			if (name != null)
				msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_EXTENDED_ELEMENT_INFORMATION_TYPE__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_EXTENDED_ELEMENT_INFORMATION_TYPE__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMDPackage.MD_EXTENDED_ELEMENT_INFORMATION_TYPE__NAME, newName, newName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CharacterStringPropertyType getShortName() {
		return shortName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetShortName(CharacterStringPropertyType newShortName, NotificationChain msgs) {
		CharacterStringPropertyType oldShortName = shortName;
		shortName = newShortName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMDPackage.MD_EXTENDED_ELEMENT_INFORMATION_TYPE__SHORT_NAME, oldShortName, newShortName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShortName(CharacterStringPropertyType newShortName) {
		if (newShortName != shortName) {
			NotificationChain msgs = null;
			if (shortName != null)
				msgs = ((InternalEObject)shortName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_EXTENDED_ELEMENT_INFORMATION_TYPE__SHORT_NAME, null, msgs);
			if (newShortName != null)
				msgs = ((InternalEObject)newShortName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_EXTENDED_ELEMENT_INFORMATION_TYPE__SHORT_NAME, null, msgs);
			msgs = basicSetShortName(newShortName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMDPackage.MD_EXTENDED_ELEMENT_INFORMATION_TYPE__SHORT_NAME, newShortName, newShortName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IntegerPropertyType getDomainCode() {
		return domainCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDomainCode(IntegerPropertyType newDomainCode, NotificationChain msgs) {
		IntegerPropertyType oldDomainCode = domainCode;
		domainCode = newDomainCode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMDPackage.MD_EXTENDED_ELEMENT_INFORMATION_TYPE__DOMAIN_CODE, oldDomainCode, newDomainCode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDomainCode(IntegerPropertyType newDomainCode) {
		if (newDomainCode != domainCode) {
			NotificationChain msgs = null;
			if (domainCode != null)
				msgs = ((InternalEObject)domainCode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_EXTENDED_ELEMENT_INFORMATION_TYPE__DOMAIN_CODE, null, msgs);
			if (newDomainCode != null)
				msgs = ((InternalEObject)newDomainCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_EXTENDED_ELEMENT_INFORMATION_TYPE__DOMAIN_CODE, null, msgs);
			msgs = basicSetDomainCode(newDomainCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMDPackage.MD_EXTENDED_ELEMENT_INFORMATION_TYPE__DOMAIN_CODE, newDomainCode, newDomainCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CharacterStringPropertyType getDefinition() {
		return definition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefinition(CharacterStringPropertyType newDefinition, NotificationChain msgs) {
		CharacterStringPropertyType oldDefinition = definition;
		definition = newDefinition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMDPackage.MD_EXTENDED_ELEMENT_INFORMATION_TYPE__DEFINITION, oldDefinition, newDefinition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefinition(CharacterStringPropertyType newDefinition) {
		if (newDefinition != definition) {
			NotificationChain msgs = null;
			if (definition != null)
				msgs = ((InternalEObject)definition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_EXTENDED_ELEMENT_INFORMATION_TYPE__DEFINITION, null, msgs);
			if (newDefinition != null)
				msgs = ((InternalEObject)newDefinition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_EXTENDED_ELEMENT_INFORMATION_TYPE__DEFINITION, null, msgs);
			msgs = basicSetDefinition(newDefinition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMDPackage.MD_EXTENDED_ELEMENT_INFORMATION_TYPE__DEFINITION, newDefinition, newDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MDObligationCodePropertyType getObligation() {
		return obligation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetObligation(MDObligationCodePropertyType newObligation, NotificationChain msgs) {
		MDObligationCodePropertyType oldObligation = obligation;
		obligation = newObligation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMDPackage.MD_EXTENDED_ELEMENT_INFORMATION_TYPE__OBLIGATION, oldObligation, newObligation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setObligation(MDObligationCodePropertyType newObligation) {
		if (newObligation != obligation) {
			NotificationChain msgs = null;
			if (obligation != null)
				msgs = ((InternalEObject)obligation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_EXTENDED_ELEMENT_INFORMATION_TYPE__OBLIGATION, null, msgs);
			if (newObligation != null)
				msgs = ((InternalEObject)newObligation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_EXTENDED_ELEMENT_INFORMATION_TYPE__OBLIGATION, null, msgs);
			msgs = basicSetObligation(newObligation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMDPackage.MD_EXTENDED_ELEMENT_INFORMATION_TYPE__OBLIGATION, newObligation, newObligation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CharacterStringPropertyType getCondition() {
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCondition(CharacterStringPropertyType newCondition, NotificationChain msgs) {
		CharacterStringPropertyType oldCondition = condition;
		condition = newCondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMDPackage.MD_EXTENDED_ELEMENT_INFORMATION_TYPE__CONDITION, oldCondition, newCondition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCondition(CharacterStringPropertyType newCondition) {
		if (newCondition != condition) {
			NotificationChain msgs = null;
			if (condition != null)
				msgs = ((InternalEObject)condition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_EXTENDED_ELEMENT_INFORMATION_TYPE__CONDITION, null, msgs);
			if (newCondition != null)
				msgs = ((InternalEObject)newCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_EXTENDED_ELEMENT_INFORMATION_TYPE__CONDITION, null, msgs);
			msgs = basicSetCondition(newCondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMDPackage.MD_EXTENDED_ELEMENT_INFORMATION_TYPE__CONDITION, newCondition, newCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MDDatatypeCodePropertyType getDataType() {
		return dataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataType(MDDatatypeCodePropertyType newDataType, NotificationChain msgs) {
		MDDatatypeCodePropertyType oldDataType = dataType;
		dataType = newDataType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMDPackage.MD_EXTENDED_ELEMENT_INFORMATION_TYPE__DATA_TYPE, oldDataType, newDataType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDataType(MDDatatypeCodePropertyType newDataType) {
		if (newDataType != dataType) {
			NotificationChain msgs = null;
			if (dataType != null)
				msgs = ((InternalEObject)dataType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_EXTENDED_ELEMENT_INFORMATION_TYPE__DATA_TYPE, null, msgs);
			if (newDataType != null)
				msgs = ((InternalEObject)newDataType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_EXTENDED_ELEMENT_INFORMATION_TYPE__DATA_TYPE, null, msgs);
			msgs = basicSetDataType(newDataType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMDPackage.MD_EXTENDED_ELEMENT_INFORMATION_TYPE__DATA_TYPE, newDataType, newDataType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CharacterStringPropertyType getMaximumOccurrence() {
		return maximumOccurrence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMaximumOccurrence(CharacterStringPropertyType newMaximumOccurrence, NotificationChain msgs) {
		CharacterStringPropertyType oldMaximumOccurrence = maximumOccurrence;
		maximumOccurrence = newMaximumOccurrence;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMDPackage.MD_EXTENDED_ELEMENT_INFORMATION_TYPE__MAXIMUM_OCCURRENCE, oldMaximumOccurrence, newMaximumOccurrence);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaximumOccurrence(CharacterStringPropertyType newMaximumOccurrence) {
		if (newMaximumOccurrence != maximumOccurrence) {
			NotificationChain msgs = null;
			if (maximumOccurrence != null)
				msgs = ((InternalEObject)maximumOccurrence).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_EXTENDED_ELEMENT_INFORMATION_TYPE__MAXIMUM_OCCURRENCE, null, msgs);
			if (newMaximumOccurrence != null)
				msgs = ((InternalEObject)newMaximumOccurrence).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_EXTENDED_ELEMENT_INFORMATION_TYPE__MAXIMUM_OCCURRENCE, null, msgs);
			msgs = basicSetMaximumOccurrence(newMaximumOccurrence, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMDPackage.MD_EXTENDED_ELEMENT_INFORMATION_TYPE__MAXIMUM_OCCURRENCE, newMaximumOccurrence, newMaximumOccurrence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CharacterStringPropertyType getDomainValue() {
		return domainValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDomainValue(CharacterStringPropertyType newDomainValue, NotificationChain msgs) {
		CharacterStringPropertyType oldDomainValue = domainValue;
		domainValue = newDomainValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMDPackage.MD_EXTENDED_ELEMENT_INFORMATION_TYPE__DOMAIN_VALUE, oldDomainValue, newDomainValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDomainValue(CharacterStringPropertyType newDomainValue) {
		if (newDomainValue != domainValue) {
			NotificationChain msgs = null;
			if (domainValue != null)
				msgs = ((InternalEObject)domainValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_EXTENDED_ELEMENT_INFORMATION_TYPE__DOMAIN_VALUE, null, msgs);
			if (newDomainValue != null)
				msgs = ((InternalEObject)newDomainValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_EXTENDED_ELEMENT_INFORMATION_TYPE__DOMAIN_VALUE, null, msgs);
			msgs = basicSetDomainValue(newDomainValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMDPackage.MD_EXTENDED_ELEMENT_INFORMATION_TYPE__DOMAIN_VALUE, newDomainValue, newDomainValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CharacterStringPropertyType> getParentEntity() {
		if (parentEntity == null) {
			parentEntity = new EObjectContainmentEList<CharacterStringPropertyType>(CharacterStringPropertyType.class, this, GMDPackage.MD_EXTENDED_ELEMENT_INFORMATION_TYPE__PARENT_ENTITY);
		}
		return parentEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CharacterStringPropertyType getRule() {
		return rule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRule(CharacterStringPropertyType newRule, NotificationChain msgs) {
		CharacterStringPropertyType oldRule = rule;
		rule = newRule;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMDPackage.MD_EXTENDED_ELEMENT_INFORMATION_TYPE__RULE, oldRule, newRule);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRule(CharacterStringPropertyType newRule) {
		if (newRule != rule) {
			NotificationChain msgs = null;
			if (rule != null)
				msgs = ((InternalEObject)rule).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_EXTENDED_ELEMENT_INFORMATION_TYPE__RULE, null, msgs);
			if (newRule != null)
				msgs = ((InternalEObject)newRule).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_EXTENDED_ELEMENT_INFORMATION_TYPE__RULE, null, msgs);
			msgs = basicSetRule(newRule, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMDPackage.MD_EXTENDED_ELEMENT_INFORMATION_TYPE__RULE, newRule, newRule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CharacterStringPropertyType> getRationale() {
		if (rationale == null) {
			rationale = new EObjectContainmentEList<CharacterStringPropertyType>(CharacterStringPropertyType.class, this, GMDPackage.MD_EXTENDED_ELEMENT_INFORMATION_TYPE__RATIONALE);
		}
		return rationale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CIResponsiblePartyPropertyType> getSource() {
		if (source == null) {
			source = new EObjectContainmentEList<CIResponsiblePartyPropertyType>(CIResponsiblePartyPropertyType.class, this, GMDPackage.MD_EXTENDED_ELEMENT_INFORMATION_TYPE__SOURCE);
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMDPackage.MD_EXTENDED_ELEMENT_INFORMATION_TYPE__NAME:
				return basicSetName(null, msgs);
			case GMDPackage.MD_EXTENDED_ELEMENT_INFORMATION_TYPE__SHORT_NAME:
				return basicSetShortName(null, msgs);
			case GMDPackage.MD_EXTENDED_ELEMENT_INFORMATION_TYPE__DOMAIN_CODE:
				return basicSetDomainCode(null, msgs);
			case GMDPackage.MD_EXTENDED_ELEMENT_INFORMATION_TYPE__DEFINITION:
				return basicSetDefinition(null, msgs);
			case GMDPackage.MD_EXTENDED_ELEMENT_INFORMATION_TYPE__OBLIGATION:
				return basicSetObligation(null, msgs);
			case GMDPackage.MD_EXTENDED_ELEMENT_INFORMATION_TYPE__CONDITION:
				return basicSetCondition(null, msgs);
			case GMDPackage.MD_EXTENDED_ELEMENT_INFORMATION_TYPE__DATA_TYPE:
				return basicSetDataType(null, msgs);
			case GMDPackage.MD_EXTENDED_ELEMENT_INFORMATION_TYPE__MAXIMUM_OCCURRENCE:
				return basicSetMaximumOccurrence(null, msgs);
			case GMDPackage.MD_EXTENDED_ELEMENT_INFORMATION_TYPE__DOMAIN_VALUE:
				return basicSetDomainValue(null, msgs);
			case GMDPackage.MD_EXTENDED_ELEMENT_INFORMATION_TYPE__PARENT_ENTITY:
				return ((InternalEList<?>)getParentEntity()).basicRemove(otherEnd, msgs);
			case GMDPackage.MD_EXTENDED_ELEMENT_INFORMATION_TYPE__RULE:
				return basicSetRule(null, msgs);
			case GMDPackage.MD_EXTENDED_ELEMENT_INFORMATION_TYPE__RATIONALE:
				return ((InternalEList<?>)getRationale()).basicRemove(otherEnd, msgs);
			case GMDPackage.MD_EXTENDED_ELEMENT_INFORMATION_TYPE__SOURCE:
				return ((InternalEList<?>)getSource()).basicRemove(otherEnd, msgs);
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
			case GMDPackage.MD_EXTENDED_ELEMENT_INFORMATION_TYPE__NAME:
				return getName();
			case GMDPackage.MD_EXTENDED_ELEMENT_INFORMATION_TYPE__SHORT_NAME:
				return getShortName();
			case GMDPackage.MD_EXTENDED_ELEMENT_INFORMATION_TYPE__DOMAIN_CODE:
				return getDomainCode();
			case GMDPackage.MD_EXTENDED_ELEMENT_INFORMATION_TYPE__DEFINITION:
				return getDefinition();
			case GMDPackage.MD_EXTENDED_ELEMENT_INFORMATION_TYPE__OBLIGATION:
				return getObligation();
			case GMDPackage.MD_EXTENDED_ELEMENT_INFORMATION_TYPE__CONDITION:
				return getCondition();
			case GMDPackage.MD_EXTENDED_ELEMENT_INFORMATION_TYPE__DATA_TYPE:
				return getDataType();
			case GMDPackage.MD_EXTENDED_ELEMENT_INFORMATION_TYPE__MAXIMUM_OCCURRENCE:
				return getMaximumOccurrence();
			case GMDPackage.MD_EXTENDED_ELEMENT_INFORMATION_TYPE__DOMAIN_VALUE:
				return getDomainValue();
			case GMDPackage.MD_EXTENDED_ELEMENT_INFORMATION_TYPE__PARENT_ENTITY:
				return getParentEntity();
			case GMDPackage.MD_EXTENDED_ELEMENT_INFORMATION_TYPE__RULE:
				return getRule();
			case GMDPackage.MD_EXTENDED_ELEMENT_INFORMATION_TYPE__RATIONALE:
				return getRationale();
			case GMDPackage.MD_EXTENDED_ELEMENT_INFORMATION_TYPE__SOURCE:
				return getSource();
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
			case GMDPackage.MD_EXTENDED_ELEMENT_INFORMATION_TYPE__NAME:
				setName((CharacterStringPropertyType)newValue);
				return;
			case GMDPackage.MD_EXTENDED_ELEMENT_INFORMATION_TYPE__SHORT_NAME:
				setShortName((CharacterStringPropertyType)newValue);
				return;
			case GMDPackage.MD_EXTENDED_ELEMENT_INFORMATION_TYPE__DOMAIN_CODE:
				setDomainCode((IntegerPropertyType)newValue);
				return;
			case GMDPackage.MD_EXTENDED_ELEMENT_INFORMATION_TYPE__DEFINITION:
				setDefinition((CharacterStringPropertyType)newValue);
				return;
			case GMDPackage.MD_EXTENDED_ELEMENT_INFORMATION_TYPE__OBLIGATION:
				setObligation((MDObligationCodePropertyType)newValue);
				return;
			case GMDPackage.MD_EXTENDED_ELEMENT_INFORMATION_TYPE__CONDITION:
				setCondition((CharacterStringPropertyType)newValue);
				return;
			case GMDPackage.MD_EXTENDED_ELEMENT_INFORMATION_TYPE__DATA_TYPE:
				setDataType((MDDatatypeCodePropertyType)newValue);
				return;
			case GMDPackage.MD_EXTENDED_ELEMENT_INFORMATION_TYPE__MAXIMUM_OCCURRENCE:
				setMaximumOccurrence((CharacterStringPropertyType)newValue);
				return;
			case GMDPackage.MD_EXTENDED_ELEMENT_INFORMATION_TYPE__DOMAIN_VALUE:
				setDomainValue((CharacterStringPropertyType)newValue);
				return;
			case GMDPackage.MD_EXTENDED_ELEMENT_INFORMATION_TYPE__PARENT_ENTITY:
				getParentEntity().clear();
				getParentEntity().addAll((Collection<? extends CharacterStringPropertyType>)newValue);
				return;
			case GMDPackage.MD_EXTENDED_ELEMENT_INFORMATION_TYPE__RULE:
				setRule((CharacterStringPropertyType)newValue);
				return;
			case GMDPackage.MD_EXTENDED_ELEMENT_INFORMATION_TYPE__RATIONALE:
				getRationale().clear();
				getRationale().addAll((Collection<? extends CharacterStringPropertyType>)newValue);
				return;
			case GMDPackage.MD_EXTENDED_ELEMENT_INFORMATION_TYPE__SOURCE:
				getSource().clear();
				getSource().addAll((Collection<? extends CIResponsiblePartyPropertyType>)newValue);
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
			case GMDPackage.MD_EXTENDED_ELEMENT_INFORMATION_TYPE__NAME:
				setName((CharacterStringPropertyType)null);
				return;
			case GMDPackage.MD_EXTENDED_ELEMENT_INFORMATION_TYPE__SHORT_NAME:
				setShortName((CharacterStringPropertyType)null);
				return;
			case GMDPackage.MD_EXTENDED_ELEMENT_INFORMATION_TYPE__DOMAIN_CODE:
				setDomainCode((IntegerPropertyType)null);
				return;
			case GMDPackage.MD_EXTENDED_ELEMENT_INFORMATION_TYPE__DEFINITION:
				setDefinition((CharacterStringPropertyType)null);
				return;
			case GMDPackage.MD_EXTENDED_ELEMENT_INFORMATION_TYPE__OBLIGATION:
				setObligation((MDObligationCodePropertyType)null);
				return;
			case GMDPackage.MD_EXTENDED_ELEMENT_INFORMATION_TYPE__CONDITION:
				setCondition((CharacterStringPropertyType)null);
				return;
			case GMDPackage.MD_EXTENDED_ELEMENT_INFORMATION_TYPE__DATA_TYPE:
				setDataType((MDDatatypeCodePropertyType)null);
				return;
			case GMDPackage.MD_EXTENDED_ELEMENT_INFORMATION_TYPE__MAXIMUM_OCCURRENCE:
				setMaximumOccurrence((CharacterStringPropertyType)null);
				return;
			case GMDPackage.MD_EXTENDED_ELEMENT_INFORMATION_TYPE__DOMAIN_VALUE:
				setDomainValue((CharacterStringPropertyType)null);
				return;
			case GMDPackage.MD_EXTENDED_ELEMENT_INFORMATION_TYPE__PARENT_ENTITY:
				getParentEntity().clear();
				return;
			case GMDPackage.MD_EXTENDED_ELEMENT_INFORMATION_TYPE__RULE:
				setRule((CharacterStringPropertyType)null);
				return;
			case GMDPackage.MD_EXTENDED_ELEMENT_INFORMATION_TYPE__RATIONALE:
				getRationale().clear();
				return;
			case GMDPackage.MD_EXTENDED_ELEMENT_INFORMATION_TYPE__SOURCE:
				getSource().clear();
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
			case GMDPackage.MD_EXTENDED_ELEMENT_INFORMATION_TYPE__NAME:
				return name != null;
			case GMDPackage.MD_EXTENDED_ELEMENT_INFORMATION_TYPE__SHORT_NAME:
				return shortName != null;
			case GMDPackage.MD_EXTENDED_ELEMENT_INFORMATION_TYPE__DOMAIN_CODE:
				return domainCode != null;
			case GMDPackage.MD_EXTENDED_ELEMENT_INFORMATION_TYPE__DEFINITION:
				return definition != null;
			case GMDPackage.MD_EXTENDED_ELEMENT_INFORMATION_TYPE__OBLIGATION:
				return obligation != null;
			case GMDPackage.MD_EXTENDED_ELEMENT_INFORMATION_TYPE__CONDITION:
				return condition != null;
			case GMDPackage.MD_EXTENDED_ELEMENT_INFORMATION_TYPE__DATA_TYPE:
				return dataType != null;
			case GMDPackage.MD_EXTENDED_ELEMENT_INFORMATION_TYPE__MAXIMUM_OCCURRENCE:
				return maximumOccurrence != null;
			case GMDPackage.MD_EXTENDED_ELEMENT_INFORMATION_TYPE__DOMAIN_VALUE:
				return domainValue != null;
			case GMDPackage.MD_EXTENDED_ELEMENT_INFORMATION_TYPE__PARENT_ENTITY:
				return parentEntity != null && !parentEntity.isEmpty();
			case GMDPackage.MD_EXTENDED_ELEMENT_INFORMATION_TYPE__RULE:
				return rule != null;
			case GMDPackage.MD_EXTENDED_ELEMENT_INFORMATION_TYPE__RATIONALE:
				return rationale != null && !rationale.isEmpty();
			case GMDPackage.MD_EXTENDED_ELEMENT_INFORMATION_TYPE__SOURCE:
				return source != null && !source.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MDExtendedElementInformationTypeImpl
