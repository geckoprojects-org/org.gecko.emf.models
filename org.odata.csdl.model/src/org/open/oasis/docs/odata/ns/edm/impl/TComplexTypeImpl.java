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
package org.open.oasis.docs.odata.ns.edm.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.open.oasis.docs.odata.ns.edm.AnnotationType;
import org.open.oasis.docs.odata.ns.edm.EdmPackage;
import org.open.oasis.docs.odata.ns.edm.TComplexType;
import org.open.oasis.docs.odata.ns.edm.TNavigationProperty;
import org.open.oasis.docs.odata.ns.edm.TProperty;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TComplex Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TComplexTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TComplexTypeImpl#getProperty <em>Property</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TComplexTypeImpl#getNavigationProperty <em>Navigation Property</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TComplexTypeImpl#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TComplexTypeImpl#isAbstract <em>Abstract</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TComplexTypeImpl#getBaseType <em>Base Type</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TComplexTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TComplexTypeImpl#isOpenType <em>Open Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TComplexTypeImpl extends MinimalEObjectImpl.Container implements TComplexType {
	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap group;

	/**
	 * The default value of the '{@link #isAbstract() <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAbstract()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ABSTRACT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAbstract() <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAbstract()
	 * @generated
	 * @ordered
	 */
	protected boolean abstract_ = ABSTRACT_EDEFAULT;

	/**
	 * This is true if the Abstract attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean abstractESet;

	/**
	 * The default value of the '{@link #getBaseType() <em>Base Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseType()
	 * @generated
	 * @ordered
	 */
	protected static final String BASE_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBaseType() <em>Base Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseType()
	 * @generated
	 * @ordered
	 */
	protected String baseType = BASE_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #isOpenType() <em>Open Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOpenType()
	 * @generated
	 * @ordered
	 */
	protected static final boolean OPEN_TYPE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isOpenType() <em>Open Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOpenType()
	 * @generated
	 * @ordered
	 */
	protected boolean openType = OPEN_TYPE_EDEFAULT;

	/**
	 * This is true if the Open Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean openTypeESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TComplexTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EdmPackage.eINSTANCE.getTComplexType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, EdmPackage.TCOMPLEX_TYPE__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TProperty> getProperty() {
		return getGroup().list(EdmPackage.eINSTANCE.getTComplexType_Property());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TNavigationProperty> getNavigationProperty() {
		return getGroup().list(EdmPackage.eINSTANCE.getTComplexType_NavigationProperty());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AnnotationType> getAnnotation() {
		return getGroup().list(EdmPackage.eINSTANCE.getTComplexType_Annotation());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isAbstract() {
		return abstract_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAbstract(boolean newAbstract) {
		boolean oldAbstract = abstract_;
		abstract_ = newAbstract;
		boolean oldAbstractESet = abstractESet;
		abstractESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdmPackage.TCOMPLEX_TYPE__ABSTRACT, oldAbstract, abstract_, !oldAbstractESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetAbstract() {
		boolean oldAbstract = abstract_;
		boolean oldAbstractESet = abstractESet;
		abstract_ = ABSTRACT_EDEFAULT;
		abstractESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, EdmPackage.TCOMPLEX_TYPE__ABSTRACT, oldAbstract, ABSTRACT_EDEFAULT, oldAbstractESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetAbstract() {
		return abstractESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBaseType() {
		return baseType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBaseType(String newBaseType) {
		String oldBaseType = baseType;
		baseType = newBaseType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdmPackage.TCOMPLEX_TYPE__BASE_TYPE, oldBaseType, baseType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdmPackage.TCOMPLEX_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isOpenType() {
		return openType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOpenType(boolean newOpenType) {
		boolean oldOpenType = openType;
		openType = newOpenType;
		boolean oldOpenTypeESet = openTypeESet;
		openTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdmPackage.TCOMPLEX_TYPE__OPEN_TYPE, oldOpenType, openType, !oldOpenTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetOpenType() {
		boolean oldOpenType = openType;
		boolean oldOpenTypeESet = openTypeESet;
		openType = OPEN_TYPE_EDEFAULT;
		openTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, EdmPackage.TCOMPLEX_TYPE__OPEN_TYPE, oldOpenType, OPEN_TYPE_EDEFAULT, oldOpenTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetOpenType() {
		return openTypeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EdmPackage.TCOMPLEX_TYPE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case EdmPackage.TCOMPLEX_TYPE__PROPERTY:
				return ((InternalEList<?>)getProperty()).basicRemove(otherEnd, msgs);
			case EdmPackage.TCOMPLEX_TYPE__NAVIGATION_PROPERTY:
				return ((InternalEList<?>)getNavigationProperty()).basicRemove(otherEnd, msgs);
			case EdmPackage.TCOMPLEX_TYPE__ANNOTATION:
				return ((InternalEList<?>)getAnnotation()).basicRemove(otherEnd, msgs);
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
			case EdmPackage.TCOMPLEX_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case EdmPackage.TCOMPLEX_TYPE__PROPERTY:
				return getProperty();
			case EdmPackage.TCOMPLEX_TYPE__NAVIGATION_PROPERTY:
				return getNavigationProperty();
			case EdmPackage.TCOMPLEX_TYPE__ANNOTATION:
				return getAnnotation();
			case EdmPackage.TCOMPLEX_TYPE__ABSTRACT:
				return isAbstract();
			case EdmPackage.TCOMPLEX_TYPE__BASE_TYPE:
				return getBaseType();
			case EdmPackage.TCOMPLEX_TYPE__NAME:
				return getName();
			case EdmPackage.TCOMPLEX_TYPE__OPEN_TYPE:
				return isOpenType();
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
			case EdmPackage.TCOMPLEX_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case EdmPackage.TCOMPLEX_TYPE__PROPERTY:
				getProperty().clear();
				getProperty().addAll((Collection<? extends TProperty>)newValue);
				return;
			case EdmPackage.TCOMPLEX_TYPE__NAVIGATION_PROPERTY:
				getNavigationProperty().clear();
				getNavigationProperty().addAll((Collection<? extends TNavigationProperty>)newValue);
				return;
			case EdmPackage.TCOMPLEX_TYPE__ANNOTATION:
				getAnnotation().clear();
				getAnnotation().addAll((Collection<? extends AnnotationType>)newValue);
				return;
			case EdmPackage.TCOMPLEX_TYPE__ABSTRACT:
				setAbstract((Boolean)newValue);
				return;
			case EdmPackage.TCOMPLEX_TYPE__BASE_TYPE:
				setBaseType((String)newValue);
				return;
			case EdmPackage.TCOMPLEX_TYPE__NAME:
				setName((String)newValue);
				return;
			case EdmPackage.TCOMPLEX_TYPE__OPEN_TYPE:
				setOpenType((Boolean)newValue);
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
			case EdmPackage.TCOMPLEX_TYPE__GROUP:
				getGroup().clear();
				return;
			case EdmPackage.TCOMPLEX_TYPE__PROPERTY:
				getProperty().clear();
				return;
			case EdmPackage.TCOMPLEX_TYPE__NAVIGATION_PROPERTY:
				getNavigationProperty().clear();
				return;
			case EdmPackage.TCOMPLEX_TYPE__ANNOTATION:
				getAnnotation().clear();
				return;
			case EdmPackage.TCOMPLEX_TYPE__ABSTRACT:
				unsetAbstract();
				return;
			case EdmPackage.TCOMPLEX_TYPE__BASE_TYPE:
				setBaseType(BASE_TYPE_EDEFAULT);
				return;
			case EdmPackage.TCOMPLEX_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case EdmPackage.TCOMPLEX_TYPE__OPEN_TYPE:
				unsetOpenType();
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
			case EdmPackage.TCOMPLEX_TYPE__GROUP:
				return group != null && !group.isEmpty();
			case EdmPackage.TCOMPLEX_TYPE__PROPERTY:
				return !getProperty().isEmpty();
			case EdmPackage.TCOMPLEX_TYPE__NAVIGATION_PROPERTY:
				return !getNavigationProperty().isEmpty();
			case EdmPackage.TCOMPLEX_TYPE__ANNOTATION:
				return !getAnnotation().isEmpty();
			case EdmPackage.TCOMPLEX_TYPE__ABSTRACT:
				return isSetAbstract();
			case EdmPackage.TCOMPLEX_TYPE__BASE_TYPE:
				return BASE_TYPE_EDEFAULT == null ? baseType != null : !BASE_TYPE_EDEFAULT.equals(baseType);
			case EdmPackage.TCOMPLEX_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case EdmPackage.TCOMPLEX_TYPE__OPEN_TYPE:
				return isSetOpenType();
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
		result.append(" (group: ");
		result.append(group);
		result.append(", abstract: ");
		if (abstractESet) result.append(abstract_); else result.append("<unset>");
		result.append(", baseType: ");
		result.append(baseType);
		result.append(", name: ");
		result.append(name);
		result.append(", openType: ");
		if (openTypeESet) result.append(openType); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TComplexTypeImpl
