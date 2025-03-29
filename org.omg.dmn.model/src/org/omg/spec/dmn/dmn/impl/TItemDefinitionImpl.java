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
package org.omg.spec.dmn.dmn.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.omg.spec.dmn.dmn.DMNPackage;
import org.omg.spec.dmn.dmn.TFunctionItem;
import org.omg.spec.dmn.dmn.TItemDefinition;
import org.omg.spec.dmn.dmn.TUnaryTests;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TItem Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.spec.dmn.dmn.impl.TItemDefinitionImpl#getTypeRef <em>Type Ref</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmn.impl.TItemDefinitionImpl#getAllowedValues <em>Allowed Values</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmn.impl.TItemDefinitionImpl#getTypeConstraint <em>Type Constraint</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmn.impl.TItemDefinitionImpl#getItemComponent <em>Item Component</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmn.impl.TItemDefinitionImpl#getFunctionItem <em>Function Item</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmn.impl.TItemDefinitionImpl#isIsCollection <em>Is Collection</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmn.impl.TItemDefinitionImpl#getTypeLanguage <em>Type Language</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TItemDefinitionImpl extends TNamedElementImpl implements TItemDefinition {
	/**
	 * The default value of the '{@link #getTypeRef() <em>Type Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeRef()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTypeRef() <em>Type Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeRef()
	 * @generated
	 * @ordered
	 */
	protected String typeRef = TYPE_REF_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAllowedValues() <em>Allowed Values</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowedValues()
	 * @generated
	 * @ordered
	 */
	protected TUnaryTests allowedValues;

	/**
	 * The cached value of the '{@link #getTypeConstraint() <em>Type Constraint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeConstraint()
	 * @generated
	 * @ordered
	 */
	protected TUnaryTests typeConstraint;

	/**
	 * The cached value of the '{@link #getItemComponent() <em>Item Component</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemComponent()
	 * @generated
	 * @ordered
	 */
	protected EList<TItemDefinition> itemComponent;

	/**
	 * The cached value of the '{@link #getFunctionItem() <em>Function Item</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctionItem()
	 * @generated
	 * @ordered
	 */
	protected TFunctionItem functionItem;

	/**
	 * The default value of the '{@link #isIsCollection() <em>Is Collection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsCollection()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_COLLECTION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsCollection() <em>Is Collection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsCollection()
	 * @generated
	 * @ordered
	 */
	protected boolean isCollection = IS_COLLECTION_EDEFAULT;

	/**
	 * This is true if the Is Collection attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean isCollectionESet;

	/**
	 * The default value of the '{@link #getTypeLanguage() <em>Type Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeLanguage()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_LANGUAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTypeLanguage() <em>Type Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeLanguage()
	 * @generated
	 * @ordered
	 */
	protected String typeLanguage = TYPE_LANGUAGE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TItemDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DMNPackage.Literals.TITEM_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTypeRef() {
		return typeRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTypeRef(String newTypeRef) {
		String oldTypeRef = typeRef;
		typeRef = newTypeRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DMNPackage.TITEM_DEFINITION__TYPE_REF, oldTypeRef, typeRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TUnaryTests getAllowedValues() {
		return allowedValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAllowedValues(TUnaryTests newAllowedValues, NotificationChain msgs) {
		TUnaryTests oldAllowedValues = allowedValues;
		allowedValues = newAllowedValues;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DMNPackage.TITEM_DEFINITION__ALLOWED_VALUES, oldAllowedValues, newAllowedValues);
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
	public void setAllowedValues(TUnaryTests newAllowedValues) {
		if (newAllowedValues != allowedValues) {
			NotificationChain msgs = null;
			if (allowedValues != null)
				msgs = ((InternalEObject)allowedValues).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DMNPackage.TITEM_DEFINITION__ALLOWED_VALUES, null, msgs);
			if (newAllowedValues != null)
				msgs = ((InternalEObject)newAllowedValues).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DMNPackage.TITEM_DEFINITION__ALLOWED_VALUES, null, msgs);
			msgs = basicSetAllowedValues(newAllowedValues, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DMNPackage.TITEM_DEFINITION__ALLOWED_VALUES, newAllowedValues, newAllowedValues));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TUnaryTests getTypeConstraint() {
		return typeConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTypeConstraint(TUnaryTests newTypeConstraint, NotificationChain msgs) {
		TUnaryTests oldTypeConstraint = typeConstraint;
		typeConstraint = newTypeConstraint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DMNPackage.TITEM_DEFINITION__TYPE_CONSTRAINT, oldTypeConstraint, newTypeConstraint);
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
	public void setTypeConstraint(TUnaryTests newTypeConstraint) {
		if (newTypeConstraint != typeConstraint) {
			NotificationChain msgs = null;
			if (typeConstraint != null)
				msgs = ((InternalEObject)typeConstraint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DMNPackage.TITEM_DEFINITION__TYPE_CONSTRAINT, null, msgs);
			if (newTypeConstraint != null)
				msgs = ((InternalEObject)newTypeConstraint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DMNPackage.TITEM_DEFINITION__TYPE_CONSTRAINT, null, msgs);
			msgs = basicSetTypeConstraint(newTypeConstraint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DMNPackage.TITEM_DEFINITION__TYPE_CONSTRAINT, newTypeConstraint, newTypeConstraint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TItemDefinition> getItemComponent() {
		if (itemComponent == null) {
			itemComponent = new EObjectContainmentEList<TItemDefinition>(TItemDefinition.class, this, DMNPackage.TITEM_DEFINITION__ITEM_COMPONENT);
		}
		return itemComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TFunctionItem getFunctionItem() {
		return functionItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFunctionItem(TFunctionItem newFunctionItem, NotificationChain msgs) {
		TFunctionItem oldFunctionItem = functionItem;
		functionItem = newFunctionItem;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DMNPackage.TITEM_DEFINITION__FUNCTION_ITEM, oldFunctionItem, newFunctionItem);
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
	public void setFunctionItem(TFunctionItem newFunctionItem) {
		if (newFunctionItem != functionItem) {
			NotificationChain msgs = null;
			if (functionItem != null)
				msgs = ((InternalEObject)functionItem).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DMNPackage.TITEM_DEFINITION__FUNCTION_ITEM, null, msgs);
			if (newFunctionItem != null)
				msgs = ((InternalEObject)newFunctionItem).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DMNPackage.TITEM_DEFINITION__FUNCTION_ITEM, null, msgs);
			msgs = basicSetFunctionItem(newFunctionItem, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DMNPackage.TITEM_DEFINITION__FUNCTION_ITEM, newFunctionItem, newFunctionItem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsCollection() {
		return isCollection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsCollection(boolean newIsCollection) {
		boolean oldIsCollection = isCollection;
		isCollection = newIsCollection;
		boolean oldIsCollectionESet = isCollectionESet;
		isCollectionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DMNPackage.TITEM_DEFINITION__IS_COLLECTION, oldIsCollection, isCollection, !oldIsCollectionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIsCollection() {
		boolean oldIsCollection = isCollection;
		boolean oldIsCollectionESet = isCollectionESet;
		isCollection = IS_COLLECTION_EDEFAULT;
		isCollectionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DMNPackage.TITEM_DEFINITION__IS_COLLECTION, oldIsCollection, IS_COLLECTION_EDEFAULT, oldIsCollectionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIsCollection() {
		return isCollectionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTypeLanguage() {
		return typeLanguage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTypeLanguage(String newTypeLanguage) {
		String oldTypeLanguage = typeLanguage;
		typeLanguage = newTypeLanguage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DMNPackage.TITEM_DEFINITION__TYPE_LANGUAGE, oldTypeLanguage, typeLanguage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DMNPackage.TITEM_DEFINITION__ALLOWED_VALUES:
				return basicSetAllowedValues(null, msgs);
			case DMNPackage.TITEM_DEFINITION__TYPE_CONSTRAINT:
				return basicSetTypeConstraint(null, msgs);
			case DMNPackage.TITEM_DEFINITION__ITEM_COMPONENT:
				return ((InternalEList<?>)getItemComponent()).basicRemove(otherEnd, msgs);
			case DMNPackage.TITEM_DEFINITION__FUNCTION_ITEM:
				return basicSetFunctionItem(null, msgs);
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
			case DMNPackage.TITEM_DEFINITION__TYPE_REF:
				return getTypeRef();
			case DMNPackage.TITEM_DEFINITION__ALLOWED_VALUES:
				return getAllowedValues();
			case DMNPackage.TITEM_DEFINITION__TYPE_CONSTRAINT:
				return getTypeConstraint();
			case DMNPackage.TITEM_DEFINITION__ITEM_COMPONENT:
				return getItemComponent();
			case DMNPackage.TITEM_DEFINITION__FUNCTION_ITEM:
				return getFunctionItem();
			case DMNPackage.TITEM_DEFINITION__IS_COLLECTION:
				return isIsCollection();
			case DMNPackage.TITEM_DEFINITION__TYPE_LANGUAGE:
				return getTypeLanguage();
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
			case DMNPackage.TITEM_DEFINITION__TYPE_REF:
				setTypeRef((String)newValue);
				return;
			case DMNPackage.TITEM_DEFINITION__ALLOWED_VALUES:
				setAllowedValues((TUnaryTests)newValue);
				return;
			case DMNPackage.TITEM_DEFINITION__TYPE_CONSTRAINT:
				setTypeConstraint((TUnaryTests)newValue);
				return;
			case DMNPackage.TITEM_DEFINITION__ITEM_COMPONENT:
				getItemComponent().clear();
				getItemComponent().addAll((Collection<? extends TItemDefinition>)newValue);
				return;
			case DMNPackage.TITEM_DEFINITION__FUNCTION_ITEM:
				setFunctionItem((TFunctionItem)newValue);
				return;
			case DMNPackage.TITEM_DEFINITION__IS_COLLECTION:
				setIsCollection((Boolean)newValue);
				return;
			case DMNPackage.TITEM_DEFINITION__TYPE_LANGUAGE:
				setTypeLanguage((String)newValue);
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
			case DMNPackage.TITEM_DEFINITION__TYPE_REF:
				setTypeRef(TYPE_REF_EDEFAULT);
				return;
			case DMNPackage.TITEM_DEFINITION__ALLOWED_VALUES:
				setAllowedValues((TUnaryTests)null);
				return;
			case DMNPackage.TITEM_DEFINITION__TYPE_CONSTRAINT:
				setTypeConstraint((TUnaryTests)null);
				return;
			case DMNPackage.TITEM_DEFINITION__ITEM_COMPONENT:
				getItemComponent().clear();
				return;
			case DMNPackage.TITEM_DEFINITION__FUNCTION_ITEM:
				setFunctionItem((TFunctionItem)null);
				return;
			case DMNPackage.TITEM_DEFINITION__IS_COLLECTION:
				unsetIsCollection();
				return;
			case DMNPackage.TITEM_DEFINITION__TYPE_LANGUAGE:
				setTypeLanguage(TYPE_LANGUAGE_EDEFAULT);
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
			case DMNPackage.TITEM_DEFINITION__TYPE_REF:
				return TYPE_REF_EDEFAULT == null ? typeRef != null : !TYPE_REF_EDEFAULT.equals(typeRef);
			case DMNPackage.TITEM_DEFINITION__ALLOWED_VALUES:
				return allowedValues != null;
			case DMNPackage.TITEM_DEFINITION__TYPE_CONSTRAINT:
				return typeConstraint != null;
			case DMNPackage.TITEM_DEFINITION__ITEM_COMPONENT:
				return itemComponent != null && !itemComponent.isEmpty();
			case DMNPackage.TITEM_DEFINITION__FUNCTION_ITEM:
				return functionItem != null;
			case DMNPackage.TITEM_DEFINITION__IS_COLLECTION:
				return isSetIsCollection();
			case DMNPackage.TITEM_DEFINITION__TYPE_LANGUAGE:
				return TYPE_LANGUAGE_EDEFAULT == null ? typeLanguage != null : !TYPE_LANGUAGE_EDEFAULT.equals(typeLanguage);
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
		result.append(" (typeRef: ");
		result.append(typeRef);
		result.append(", isCollection: ");
		if (isCollectionESet) result.append(isCollection); else result.append("<unset>");
		result.append(", typeLanguage: ");
		result.append(typeLanguage);
		result.append(')');
		return result.toString();
	}

} //TItemDefinitionImpl
