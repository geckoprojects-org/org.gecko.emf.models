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
package net.opengis.gml.gml.impl;

import net.opengis.gml.gml.CodeType;
import net.opengis.gml.gml.GMLPackage;
import net.opengis.gml.gml.ReferenceType;
import net.opengis.gml.gml.StringOrRefType;
import net.opengis.gml.gml.UnitDefinitionType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unit Definition Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.gml.impl.UnitDefinitionTypeImpl#getQuantityType <em>Quantity Type</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.UnitDefinitionTypeImpl#getQuantityTypeReference <em>Quantity Type Reference</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.UnitDefinitionTypeImpl#getCatalogSymbol <em>Catalog Symbol</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UnitDefinitionTypeImpl extends DefinitionTypeImpl implements UnitDefinitionType {
	/**
	 * The cached value of the '{@link #getQuantityType() <em>Quantity Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantityType()
	 * @generated
	 * @ordered
	 */
	protected StringOrRefType quantityType;

	/**
	 * The cached value of the '{@link #getQuantityTypeReference() <em>Quantity Type Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantityTypeReference()
	 * @generated
	 * @ordered
	 */
	protected ReferenceType quantityTypeReference;

	/**
	 * The cached value of the '{@link #getCatalogSymbol() <em>Catalog Symbol</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCatalogSymbol()
	 * @generated
	 * @ordered
	 */
	protected CodeType catalogSymbol;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnitDefinitionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMLPackage.eINSTANCE.getUnitDefinitionType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringOrRefType getQuantityType() {
		return quantityType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQuantityType(StringOrRefType newQuantityType, NotificationChain msgs) {
		StringOrRefType oldQuantityType = quantityType;
		quantityType = newQuantityType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMLPackage.UNIT_DEFINITION_TYPE__QUANTITY_TYPE, oldQuantityType, newQuantityType);
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
	public void setQuantityType(StringOrRefType newQuantityType) {
		if (newQuantityType != quantityType) {
			NotificationChain msgs = null;
			if (quantityType != null)
				msgs = ((InternalEObject)quantityType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMLPackage.UNIT_DEFINITION_TYPE__QUANTITY_TYPE, null, msgs);
			if (newQuantityType != null)
				msgs = ((InternalEObject)newQuantityType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMLPackage.UNIT_DEFINITION_TYPE__QUANTITY_TYPE, null, msgs);
			msgs = basicSetQuantityType(newQuantityType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMLPackage.UNIT_DEFINITION_TYPE__QUANTITY_TYPE, newQuantityType, newQuantityType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReferenceType getQuantityTypeReference() {
		return quantityTypeReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQuantityTypeReference(ReferenceType newQuantityTypeReference, NotificationChain msgs) {
		ReferenceType oldQuantityTypeReference = quantityTypeReference;
		quantityTypeReference = newQuantityTypeReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMLPackage.UNIT_DEFINITION_TYPE__QUANTITY_TYPE_REFERENCE, oldQuantityTypeReference, newQuantityTypeReference);
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
	public void setQuantityTypeReference(ReferenceType newQuantityTypeReference) {
		if (newQuantityTypeReference != quantityTypeReference) {
			NotificationChain msgs = null;
			if (quantityTypeReference != null)
				msgs = ((InternalEObject)quantityTypeReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMLPackage.UNIT_DEFINITION_TYPE__QUANTITY_TYPE_REFERENCE, null, msgs);
			if (newQuantityTypeReference != null)
				msgs = ((InternalEObject)newQuantityTypeReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMLPackage.UNIT_DEFINITION_TYPE__QUANTITY_TYPE_REFERENCE, null, msgs);
			msgs = basicSetQuantityTypeReference(newQuantityTypeReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMLPackage.UNIT_DEFINITION_TYPE__QUANTITY_TYPE_REFERENCE, newQuantityTypeReference, newQuantityTypeReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeType getCatalogSymbol() {
		return catalogSymbol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCatalogSymbol(CodeType newCatalogSymbol, NotificationChain msgs) {
		CodeType oldCatalogSymbol = catalogSymbol;
		catalogSymbol = newCatalogSymbol;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMLPackage.UNIT_DEFINITION_TYPE__CATALOG_SYMBOL, oldCatalogSymbol, newCatalogSymbol);
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
	public void setCatalogSymbol(CodeType newCatalogSymbol) {
		if (newCatalogSymbol != catalogSymbol) {
			NotificationChain msgs = null;
			if (catalogSymbol != null)
				msgs = ((InternalEObject)catalogSymbol).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMLPackage.UNIT_DEFINITION_TYPE__CATALOG_SYMBOL, null, msgs);
			if (newCatalogSymbol != null)
				msgs = ((InternalEObject)newCatalogSymbol).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMLPackage.UNIT_DEFINITION_TYPE__CATALOG_SYMBOL, null, msgs);
			msgs = basicSetCatalogSymbol(newCatalogSymbol, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMLPackage.UNIT_DEFINITION_TYPE__CATALOG_SYMBOL, newCatalogSymbol, newCatalogSymbol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMLPackage.UNIT_DEFINITION_TYPE__QUANTITY_TYPE:
				return basicSetQuantityType(null, msgs);
			case GMLPackage.UNIT_DEFINITION_TYPE__QUANTITY_TYPE_REFERENCE:
				return basicSetQuantityTypeReference(null, msgs);
			case GMLPackage.UNIT_DEFINITION_TYPE__CATALOG_SYMBOL:
				return basicSetCatalogSymbol(null, msgs);
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
			case GMLPackage.UNIT_DEFINITION_TYPE__QUANTITY_TYPE:
				return getQuantityType();
			case GMLPackage.UNIT_DEFINITION_TYPE__QUANTITY_TYPE_REFERENCE:
				return getQuantityTypeReference();
			case GMLPackage.UNIT_DEFINITION_TYPE__CATALOG_SYMBOL:
				return getCatalogSymbol();
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
			case GMLPackage.UNIT_DEFINITION_TYPE__QUANTITY_TYPE:
				setQuantityType((StringOrRefType)newValue);
				return;
			case GMLPackage.UNIT_DEFINITION_TYPE__QUANTITY_TYPE_REFERENCE:
				setQuantityTypeReference((ReferenceType)newValue);
				return;
			case GMLPackage.UNIT_DEFINITION_TYPE__CATALOG_SYMBOL:
				setCatalogSymbol((CodeType)newValue);
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
			case GMLPackage.UNIT_DEFINITION_TYPE__QUANTITY_TYPE:
				setQuantityType((StringOrRefType)null);
				return;
			case GMLPackage.UNIT_DEFINITION_TYPE__QUANTITY_TYPE_REFERENCE:
				setQuantityTypeReference((ReferenceType)null);
				return;
			case GMLPackage.UNIT_DEFINITION_TYPE__CATALOG_SYMBOL:
				setCatalogSymbol((CodeType)null);
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
			case GMLPackage.UNIT_DEFINITION_TYPE__QUANTITY_TYPE:
				return quantityType != null;
			case GMLPackage.UNIT_DEFINITION_TYPE__QUANTITY_TYPE_REFERENCE:
				return quantityTypeReference != null;
			case GMLPackage.UNIT_DEFINITION_TYPE__CATALOG_SYMBOL:
				return catalogSymbol != null;
		}
		return super.eIsSet(featureID);
	}

} //UnitDefinitionTypeImpl
