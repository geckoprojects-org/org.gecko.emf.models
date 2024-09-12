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

import net.opengis.gml.gml.AbstractTopoPrimitiveType;
import net.opengis.gml.gml.GMLPackage;
import net.opengis.gml.gml.TopoPrimitiveArrayAssociationType;

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

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Topo Primitive Array Association Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.gml.impl.TopoPrimitiveArrayAssociationTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.TopoPrimitiveArrayAssociationTypeImpl#getAbstractTopoPrimitiveGroup <em>Abstract Topo Primitive Group</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.TopoPrimitiveArrayAssociationTypeImpl#getAbstractTopoPrimitive <em>Abstract Topo Primitive</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.TopoPrimitiveArrayAssociationTypeImpl#isOwns <em>Owns</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TopoPrimitiveArrayAssociationTypeImpl extends MinimalEObjectImpl.Container implements TopoPrimitiveArrayAssociationType {
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
	 * The default value of the '{@link #isOwns() <em>Owns</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOwns()
	 * @generated
	 * @ordered
	 */
	protected static final boolean OWNS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isOwns() <em>Owns</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOwns()
	 * @generated
	 * @ordered
	 */
	protected boolean owns = OWNS_EDEFAULT;

	/**
	 * This is true if the Owns attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean ownsESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TopoPrimitiveArrayAssociationTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMLPackage.eINSTANCE.getTopoPrimitiveArrayAssociationType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, GMLPackage.TOPO_PRIMITIVE_ARRAY_ASSOCIATION_TYPE__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getAbstractTopoPrimitiveGroup() {
		return (FeatureMap)getGroup().<FeatureMap.Entry>list(GMLPackage.eINSTANCE.getTopoPrimitiveArrayAssociationType_AbstractTopoPrimitiveGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbstractTopoPrimitiveType> getAbstractTopoPrimitive() {
		return getAbstractTopoPrimitiveGroup().list(GMLPackage.eINSTANCE.getTopoPrimitiveArrayAssociationType_AbstractTopoPrimitive());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isOwns() {
		return owns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOwns(boolean newOwns) {
		boolean oldOwns = owns;
		owns = newOwns;
		boolean oldOwnsESet = ownsESet;
		ownsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMLPackage.TOPO_PRIMITIVE_ARRAY_ASSOCIATION_TYPE__OWNS, oldOwns, owns, !oldOwnsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetOwns() {
		boolean oldOwns = owns;
		boolean oldOwnsESet = ownsESet;
		owns = OWNS_EDEFAULT;
		ownsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, GMLPackage.TOPO_PRIMITIVE_ARRAY_ASSOCIATION_TYPE__OWNS, oldOwns, OWNS_EDEFAULT, oldOwnsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetOwns() {
		return ownsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMLPackage.TOPO_PRIMITIVE_ARRAY_ASSOCIATION_TYPE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case GMLPackage.TOPO_PRIMITIVE_ARRAY_ASSOCIATION_TYPE__ABSTRACT_TOPO_PRIMITIVE_GROUP:
				return ((InternalEList<?>)getAbstractTopoPrimitiveGroup()).basicRemove(otherEnd, msgs);
			case GMLPackage.TOPO_PRIMITIVE_ARRAY_ASSOCIATION_TYPE__ABSTRACT_TOPO_PRIMITIVE:
				return ((InternalEList<?>)getAbstractTopoPrimitive()).basicRemove(otherEnd, msgs);
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
			case GMLPackage.TOPO_PRIMITIVE_ARRAY_ASSOCIATION_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case GMLPackage.TOPO_PRIMITIVE_ARRAY_ASSOCIATION_TYPE__ABSTRACT_TOPO_PRIMITIVE_GROUP:
				if (coreType) return getAbstractTopoPrimitiveGroup();
				return ((FeatureMap.Internal)getAbstractTopoPrimitiveGroup()).getWrapper();
			case GMLPackage.TOPO_PRIMITIVE_ARRAY_ASSOCIATION_TYPE__ABSTRACT_TOPO_PRIMITIVE:
				return getAbstractTopoPrimitive();
			case GMLPackage.TOPO_PRIMITIVE_ARRAY_ASSOCIATION_TYPE__OWNS:
				return isOwns();
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
			case GMLPackage.TOPO_PRIMITIVE_ARRAY_ASSOCIATION_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case GMLPackage.TOPO_PRIMITIVE_ARRAY_ASSOCIATION_TYPE__ABSTRACT_TOPO_PRIMITIVE_GROUP:
				((FeatureMap.Internal)getAbstractTopoPrimitiveGroup()).set(newValue);
				return;
			case GMLPackage.TOPO_PRIMITIVE_ARRAY_ASSOCIATION_TYPE__OWNS:
				setOwns((Boolean)newValue);
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
			case GMLPackage.TOPO_PRIMITIVE_ARRAY_ASSOCIATION_TYPE__GROUP:
				getGroup().clear();
				return;
			case GMLPackage.TOPO_PRIMITIVE_ARRAY_ASSOCIATION_TYPE__ABSTRACT_TOPO_PRIMITIVE_GROUP:
				getAbstractTopoPrimitiveGroup().clear();
				return;
			case GMLPackage.TOPO_PRIMITIVE_ARRAY_ASSOCIATION_TYPE__OWNS:
				unsetOwns();
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
			case GMLPackage.TOPO_PRIMITIVE_ARRAY_ASSOCIATION_TYPE__GROUP:
				return group != null && !group.isEmpty();
			case GMLPackage.TOPO_PRIMITIVE_ARRAY_ASSOCIATION_TYPE__ABSTRACT_TOPO_PRIMITIVE_GROUP:
				return !getAbstractTopoPrimitiveGroup().isEmpty();
			case GMLPackage.TOPO_PRIMITIVE_ARRAY_ASSOCIATION_TYPE__ABSTRACT_TOPO_PRIMITIVE:
				return !getAbstractTopoPrimitive().isEmpty();
			case GMLPackage.TOPO_PRIMITIVE_ARRAY_ASSOCIATION_TYPE__OWNS:
				return isSetOwns();
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
		result.append(", owns: ");
		if (ownsESet) result.append(owns); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TopoPrimitiveArrayAssociationTypeImpl
