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
import org.open.oasis.docs.odata.ns.edm.TNavigationProperty;
import org.open.oasis.docs.odata.ns.edm.TOnDelete;
import org.open.oasis.docs.odata.ns.edm.TReferentialConstraint;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TNavigation Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TNavigationPropertyImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TNavigationPropertyImpl#getReferentialConstraint <em>Referential Constraint</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TNavigationPropertyImpl#getOnDelete <em>On Delete</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TNavigationPropertyImpl#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TNavigationPropertyImpl#isContainsTarget <em>Contains Target</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TNavigationPropertyImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TNavigationPropertyImpl#isNullable <em>Nullable</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TNavigationPropertyImpl#getPartner <em>Partner</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TNavigationPropertyImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TNavigationPropertyImpl extends MinimalEObjectImpl.Container implements TNavigationProperty {
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
	 * The default value of the '{@link #isContainsTarget() <em>Contains Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isContainsTarget()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CONTAINS_TARGET_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isContainsTarget() <em>Contains Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isContainsTarget()
	 * @generated
	 * @ordered
	 */
	protected boolean containsTarget = CONTAINS_TARGET_EDEFAULT;

	/**
	 * This is true if the Contains Target attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean containsTargetESet;

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
	 * The default value of the '{@link #isNullable() <em>Nullable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNullable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NULLABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNullable() <em>Nullable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNullable()
	 * @generated
	 * @ordered
	 */
	protected boolean nullable = NULLABLE_EDEFAULT;

	/**
	 * This is true if the Nullable attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nullableESet;

	/**
	 * The default value of the '{@link #getPartner() <em>Partner</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartner()
	 * @generated
	 * @ordered
	 */
	protected static final String PARTNER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPartner() <em>Partner</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartner()
	 * @generated
	 * @ordered
	 */
	protected String partner = PARTNER_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final Object TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected Object type = TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TNavigationPropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EdmPackage.eINSTANCE.getTNavigationProperty();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, EdmPackage.TNAVIGATION_PROPERTY__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TReferentialConstraint> getReferentialConstraint() {
		return getGroup().list(EdmPackage.eINSTANCE.getTNavigationProperty_ReferentialConstraint());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TOnDelete> getOnDelete() {
		return getGroup().list(EdmPackage.eINSTANCE.getTNavigationProperty_OnDelete());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AnnotationType> getAnnotation() {
		return getGroup().list(EdmPackage.eINSTANCE.getTNavigationProperty_Annotation());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isContainsTarget() {
		return containsTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContainsTarget(boolean newContainsTarget) {
		boolean oldContainsTarget = containsTarget;
		containsTarget = newContainsTarget;
		boolean oldContainsTargetESet = containsTargetESet;
		containsTargetESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdmPackage.TNAVIGATION_PROPERTY__CONTAINS_TARGET, oldContainsTarget, containsTarget, !oldContainsTargetESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetContainsTarget() {
		boolean oldContainsTarget = containsTarget;
		boolean oldContainsTargetESet = containsTargetESet;
		containsTarget = CONTAINS_TARGET_EDEFAULT;
		containsTargetESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, EdmPackage.TNAVIGATION_PROPERTY__CONTAINS_TARGET, oldContainsTarget, CONTAINS_TARGET_EDEFAULT, oldContainsTargetESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetContainsTarget() {
		return containsTargetESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, EdmPackage.TNAVIGATION_PROPERTY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isNullable() {
		return nullable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNullable(boolean newNullable) {
		boolean oldNullable = nullable;
		nullable = newNullable;
		boolean oldNullableESet = nullableESet;
		nullableESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdmPackage.TNAVIGATION_PROPERTY__NULLABLE, oldNullable, nullable, !oldNullableESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetNullable() {
		boolean oldNullable = nullable;
		boolean oldNullableESet = nullableESet;
		nullable = NULLABLE_EDEFAULT;
		nullableESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, EdmPackage.TNAVIGATION_PROPERTY__NULLABLE, oldNullable, NULLABLE_EDEFAULT, oldNullableESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetNullable() {
		return nullableESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPartner() {
		return partner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPartner(String newPartner) {
		String oldPartner = partner;
		partner = newPartner;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdmPackage.TNAVIGATION_PROPERTY__PARTNER, oldPartner, partner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(Object newType) {
		Object oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdmPackage.TNAVIGATION_PROPERTY__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EdmPackage.TNAVIGATION_PROPERTY__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case EdmPackage.TNAVIGATION_PROPERTY__REFERENTIAL_CONSTRAINT:
				return ((InternalEList<?>)getReferentialConstraint()).basicRemove(otherEnd, msgs);
			case EdmPackage.TNAVIGATION_PROPERTY__ON_DELETE:
				return ((InternalEList<?>)getOnDelete()).basicRemove(otherEnd, msgs);
			case EdmPackage.TNAVIGATION_PROPERTY__ANNOTATION:
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
			case EdmPackage.TNAVIGATION_PROPERTY__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case EdmPackage.TNAVIGATION_PROPERTY__REFERENTIAL_CONSTRAINT:
				return getReferentialConstraint();
			case EdmPackage.TNAVIGATION_PROPERTY__ON_DELETE:
				return getOnDelete();
			case EdmPackage.TNAVIGATION_PROPERTY__ANNOTATION:
				return getAnnotation();
			case EdmPackage.TNAVIGATION_PROPERTY__CONTAINS_TARGET:
				return isContainsTarget();
			case EdmPackage.TNAVIGATION_PROPERTY__NAME:
				return getName();
			case EdmPackage.TNAVIGATION_PROPERTY__NULLABLE:
				return isNullable();
			case EdmPackage.TNAVIGATION_PROPERTY__PARTNER:
				return getPartner();
			case EdmPackage.TNAVIGATION_PROPERTY__TYPE:
				return getType();
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
			case EdmPackage.TNAVIGATION_PROPERTY__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case EdmPackage.TNAVIGATION_PROPERTY__REFERENTIAL_CONSTRAINT:
				getReferentialConstraint().clear();
				getReferentialConstraint().addAll((Collection<? extends TReferentialConstraint>)newValue);
				return;
			case EdmPackage.TNAVIGATION_PROPERTY__ON_DELETE:
				getOnDelete().clear();
				getOnDelete().addAll((Collection<? extends TOnDelete>)newValue);
				return;
			case EdmPackage.TNAVIGATION_PROPERTY__ANNOTATION:
				getAnnotation().clear();
				getAnnotation().addAll((Collection<? extends AnnotationType>)newValue);
				return;
			case EdmPackage.TNAVIGATION_PROPERTY__CONTAINS_TARGET:
				setContainsTarget((Boolean)newValue);
				return;
			case EdmPackage.TNAVIGATION_PROPERTY__NAME:
				setName((String)newValue);
				return;
			case EdmPackage.TNAVIGATION_PROPERTY__NULLABLE:
				setNullable((Boolean)newValue);
				return;
			case EdmPackage.TNAVIGATION_PROPERTY__PARTNER:
				setPartner((String)newValue);
				return;
			case EdmPackage.TNAVIGATION_PROPERTY__TYPE:
				setType(newValue);
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
			case EdmPackage.TNAVIGATION_PROPERTY__GROUP:
				getGroup().clear();
				return;
			case EdmPackage.TNAVIGATION_PROPERTY__REFERENTIAL_CONSTRAINT:
				getReferentialConstraint().clear();
				return;
			case EdmPackage.TNAVIGATION_PROPERTY__ON_DELETE:
				getOnDelete().clear();
				return;
			case EdmPackage.TNAVIGATION_PROPERTY__ANNOTATION:
				getAnnotation().clear();
				return;
			case EdmPackage.TNAVIGATION_PROPERTY__CONTAINS_TARGET:
				unsetContainsTarget();
				return;
			case EdmPackage.TNAVIGATION_PROPERTY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case EdmPackage.TNAVIGATION_PROPERTY__NULLABLE:
				unsetNullable();
				return;
			case EdmPackage.TNAVIGATION_PROPERTY__PARTNER:
				setPartner(PARTNER_EDEFAULT);
				return;
			case EdmPackage.TNAVIGATION_PROPERTY__TYPE:
				setType(TYPE_EDEFAULT);
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
			case EdmPackage.TNAVIGATION_PROPERTY__GROUP:
				return group != null && !group.isEmpty();
			case EdmPackage.TNAVIGATION_PROPERTY__REFERENTIAL_CONSTRAINT:
				return !getReferentialConstraint().isEmpty();
			case EdmPackage.TNAVIGATION_PROPERTY__ON_DELETE:
				return !getOnDelete().isEmpty();
			case EdmPackage.TNAVIGATION_PROPERTY__ANNOTATION:
				return !getAnnotation().isEmpty();
			case EdmPackage.TNAVIGATION_PROPERTY__CONTAINS_TARGET:
				return isSetContainsTarget();
			case EdmPackage.TNAVIGATION_PROPERTY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case EdmPackage.TNAVIGATION_PROPERTY__NULLABLE:
				return isSetNullable();
			case EdmPackage.TNAVIGATION_PROPERTY__PARTNER:
				return PARTNER_EDEFAULT == null ? partner != null : !PARTNER_EDEFAULT.equals(partner);
			case EdmPackage.TNAVIGATION_PROPERTY__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
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
		result.append(", containsTarget: ");
		if (containsTargetESet) result.append(containsTarget); else result.append("<unset>");
		result.append(", name: ");
		result.append(name);
		result.append(", nullable: ");
		if (nullableESet) result.append(nullable); else result.append("<unset>");
		result.append(", partner: ");
		result.append(partner);
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //TNavigationPropertyImpl
