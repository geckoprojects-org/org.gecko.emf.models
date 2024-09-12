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
package net.opengis.gml.impl;

import java.util.Collection;

import net.opengis.gml.GMLPackage;
import net.opengis.gml.TopoComplexMemberType;
import net.opengis.gml.TopoComplexType;
import net.opengis.gml.TopoPrimitiveArrayAssociationType;
import net.opengis.gml.TopoPrimitiveMemberType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Topo Complex Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.impl.TopoComplexTypeImpl#getMaximalComplex <em>Maximal Complex</em>}</li>
 *   <li>{@link net.opengis.gml.impl.TopoComplexTypeImpl#getSuperComplex <em>Super Complex</em>}</li>
 *   <li>{@link net.opengis.gml.impl.TopoComplexTypeImpl#getSubComplex <em>Sub Complex</em>}</li>
 *   <li>{@link net.opengis.gml.impl.TopoComplexTypeImpl#getTopoPrimitiveMember <em>Topo Primitive Member</em>}</li>
 *   <li>{@link net.opengis.gml.impl.TopoComplexTypeImpl#getTopoPrimitiveMembers <em>Topo Primitive Members</em>}</li>
 *   <li>{@link net.opengis.gml.impl.TopoComplexTypeImpl#isIsMaximal <em>Is Maximal</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TopoComplexTypeImpl extends AbstractTopologyTypeImpl implements TopoComplexType {
	/**
	 * The cached value of the '{@link #getMaximalComplex() <em>Maximal Complex</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximalComplex()
	 * @generated
	 * @ordered
	 */
	protected TopoComplexMemberType maximalComplex;

	/**
	 * The cached value of the '{@link #getSuperComplex() <em>Super Complex</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuperComplex()
	 * @generated
	 * @ordered
	 */
	protected EList<TopoComplexMemberType> superComplex;

	/**
	 * The cached value of the '{@link #getSubComplex() <em>Sub Complex</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubComplex()
	 * @generated
	 * @ordered
	 */
	protected EList<TopoComplexMemberType> subComplex;

	/**
	 * The cached value of the '{@link #getTopoPrimitiveMember() <em>Topo Primitive Member</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopoPrimitiveMember()
	 * @generated
	 * @ordered
	 */
	protected EList<TopoPrimitiveMemberType> topoPrimitiveMember;

	/**
	 * The cached value of the '{@link #getTopoPrimitiveMembers() <em>Topo Primitive Members</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopoPrimitiveMembers()
	 * @generated
	 * @ordered
	 */
	protected TopoPrimitiveArrayAssociationType topoPrimitiveMembers;

	/**
	 * The default value of the '{@link #isIsMaximal() <em>Is Maximal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsMaximal()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_MAXIMAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsMaximal() <em>Is Maximal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsMaximal()
	 * @generated
	 * @ordered
	 */
	protected boolean isMaximal = IS_MAXIMAL_EDEFAULT;

	/**
	 * This is true if the Is Maximal attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean isMaximalESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TopoComplexTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMLPackage.eINSTANCE.getTopoComplexType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TopoComplexMemberType getMaximalComplex() {
		return maximalComplex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMaximalComplex(TopoComplexMemberType newMaximalComplex, NotificationChain msgs) {
		TopoComplexMemberType oldMaximalComplex = maximalComplex;
		maximalComplex = newMaximalComplex;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMLPackage.TOPO_COMPLEX_TYPE__MAXIMAL_COMPLEX, oldMaximalComplex, newMaximalComplex);
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
	public void setMaximalComplex(TopoComplexMemberType newMaximalComplex) {
		if (newMaximalComplex != maximalComplex) {
			NotificationChain msgs = null;
			if (maximalComplex != null)
				msgs = ((InternalEObject)maximalComplex).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMLPackage.TOPO_COMPLEX_TYPE__MAXIMAL_COMPLEX, null, msgs);
			if (newMaximalComplex != null)
				msgs = ((InternalEObject)newMaximalComplex).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMLPackage.TOPO_COMPLEX_TYPE__MAXIMAL_COMPLEX, null, msgs);
			msgs = basicSetMaximalComplex(newMaximalComplex, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMLPackage.TOPO_COMPLEX_TYPE__MAXIMAL_COMPLEX, newMaximalComplex, newMaximalComplex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TopoComplexMemberType> getSuperComplex() {
		if (superComplex == null) {
			superComplex = new EObjectContainmentEList<TopoComplexMemberType>(TopoComplexMemberType.class, this, GMLPackage.TOPO_COMPLEX_TYPE__SUPER_COMPLEX);
		}
		return superComplex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TopoComplexMemberType> getSubComplex() {
		if (subComplex == null) {
			subComplex = new EObjectContainmentEList<TopoComplexMemberType>(TopoComplexMemberType.class, this, GMLPackage.TOPO_COMPLEX_TYPE__SUB_COMPLEX);
		}
		return subComplex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TopoPrimitiveMemberType> getTopoPrimitiveMember() {
		if (topoPrimitiveMember == null) {
			topoPrimitiveMember = new EObjectContainmentEList<TopoPrimitiveMemberType>(TopoPrimitiveMemberType.class, this, GMLPackage.TOPO_COMPLEX_TYPE__TOPO_PRIMITIVE_MEMBER);
		}
		return topoPrimitiveMember;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TopoPrimitiveArrayAssociationType getTopoPrimitiveMembers() {
		return topoPrimitiveMembers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTopoPrimitiveMembers(TopoPrimitiveArrayAssociationType newTopoPrimitiveMembers, NotificationChain msgs) {
		TopoPrimitiveArrayAssociationType oldTopoPrimitiveMembers = topoPrimitiveMembers;
		topoPrimitiveMembers = newTopoPrimitiveMembers;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMLPackage.TOPO_COMPLEX_TYPE__TOPO_PRIMITIVE_MEMBERS, oldTopoPrimitiveMembers, newTopoPrimitiveMembers);
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
	public void setTopoPrimitiveMembers(TopoPrimitiveArrayAssociationType newTopoPrimitiveMembers) {
		if (newTopoPrimitiveMembers != topoPrimitiveMembers) {
			NotificationChain msgs = null;
			if (topoPrimitiveMembers != null)
				msgs = ((InternalEObject)topoPrimitiveMembers).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMLPackage.TOPO_COMPLEX_TYPE__TOPO_PRIMITIVE_MEMBERS, null, msgs);
			if (newTopoPrimitiveMembers != null)
				msgs = ((InternalEObject)newTopoPrimitiveMembers).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMLPackage.TOPO_COMPLEX_TYPE__TOPO_PRIMITIVE_MEMBERS, null, msgs);
			msgs = basicSetTopoPrimitiveMembers(newTopoPrimitiveMembers, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMLPackage.TOPO_COMPLEX_TYPE__TOPO_PRIMITIVE_MEMBERS, newTopoPrimitiveMembers, newTopoPrimitiveMembers));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsMaximal() {
		return isMaximal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsMaximal(boolean newIsMaximal) {
		boolean oldIsMaximal = isMaximal;
		isMaximal = newIsMaximal;
		boolean oldIsMaximalESet = isMaximalESet;
		isMaximalESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMLPackage.TOPO_COMPLEX_TYPE__IS_MAXIMAL, oldIsMaximal, isMaximal, !oldIsMaximalESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIsMaximal() {
		boolean oldIsMaximal = isMaximal;
		boolean oldIsMaximalESet = isMaximalESet;
		isMaximal = IS_MAXIMAL_EDEFAULT;
		isMaximalESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, GMLPackage.TOPO_COMPLEX_TYPE__IS_MAXIMAL, oldIsMaximal, IS_MAXIMAL_EDEFAULT, oldIsMaximalESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIsMaximal() {
		return isMaximalESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMLPackage.TOPO_COMPLEX_TYPE__MAXIMAL_COMPLEX:
				return basicSetMaximalComplex(null, msgs);
			case GMLPackage.TOPO_COMPLEX_TYPE__SUPER_COMPLEX:
				return ((InternalEList<?>)getSuperComplex()).basicRemove(otherEnd, msgs);
			case GMLPackage.TOPO_COMPLEX_TYPE__SUB_COMPLEX:
				return ((InternalEList<?>)getSubComplex()).basicRemove(otherEnd, msgs);
			case GMLPackage.TOPO_COMPLEX_TYPE__TOPO_PRIMITIVE_MEMBER:
				return ((InternalEList<?>)getTopoPrimitiveMember()).basicRemove(otherEnd, msgs);
			case GMLPackage.TOPO_COMPLEX_TYPE__TOPO_PRIMITIVE_MEMBERS:
				return basicSetTopoPrimitiveMembers(null, msgs);
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
			case GMLPackage.TOPO_COMPLEX_TYPE__MAXIMAL_COMPLEX:
				return getMaximalComplex();
			case GMLPackage.TOPO_COMPLEX_TYPE__SUPER_COMPLEX:
				return getSuperComplex();
			case GMLPackage.TOPO_COMPLEX_TYPE__SUB_COMPLEX:
				return getSubComplex();
			case GMLPackage.TOPO_COMPLEX_TYPE__TOPO_PRIMITIVE_MEMBER:
				return getTopoPrimitiveMember();
			case GMLPackage.TOPO_COMPLEX_TYPE__TOPO_PRIMITIVE_MEMBERS:
				return getTopoPrimitiveMembers();
			case GMLPackage.TOPO_COMPLEX_TYPE__IS_MAXIMAL:
				return isIsMaximal();
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
			case GMLPackage.TOPO_COMPLEX_TYPE__MAXIMAL_COMPLEX:
				setMaximalComplex((TopoComplexMemberType)newValue);
				return;
			case GMLPackage.TOPO_COMPLEX_TYPE__SUPER_COMPLEX:
				getSuperComplex().clear();
				getSuperComplex().addAll((Collection<? extends TopoComplexMemberType>)newValue);
				return;
			case GMLPackage.TOPO_COMPLEX_TYPE__SUB_COMPLEX:
				getSubComplex().clear();
				getSubComplex().addAll((Collection<? extends TopoComplexMemberType>)newValue);
				return;
			case GMLPackage.TOPO_COMPLEX_TYPE__TOPO_PRIMITIVE_MEMBER:
				getTopoPrimitiveMember().clear();
				getTopoPrimitiveMember().addAll((Collection<? extends TopoPrimitiveMemberType>)newValue);
				return;
			case GMLPackage.TOPO_COMPLEX_TYPE__TOPO_PRIMITIVE_MEMBERS:
				setTopoPrimitiveMembers((TopoPrimitiveArrayAssociationType)newValue);
				return;
			case GMLPackage.TOPO_COMPLEX_TYPE__IS_MAXIMAL:
				setIsMaximal((Boolean)newValue);
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
			case GMLPackage.TOPO_COMPLEX_TYPE__MAXIMAL_COMPLEX:
				setMaximalComplex((TopoComplexMemberType)null);
				return;
			case GMLPackage.TOPO_COMPLEX_TYPE__SUPER_COMPLEX:
				getSuperComplex().clear();
				return;
			case GMLPackage.TOPO_COMPLEX_TYPE__SUB_COMPLEX:
				getSubComplex().clear();
				return;
			case GMLPackage.TOPO_COMPLEX_TYPE__TOPO_PRIMITIVE_MEMBER:
				getTopoPrimitiveMember().clear();
				return;
			case GMLPackage.TOPO_COMPLEX_TYPE__TOPO_PRIMITIVE_MEMBERS:
				setTopoPrimitiveMembers((TopoPrimitiveArrayAssociationType)null);
				return;
			case GMLPackage.TOPO_COMPLEX_TYPE__IS_MAXIMAL:
				unsetIsMaximal();
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
			case GMLPackage.TOPO_COMPLEX_TYPE__MAXIMAL_COMPLEX:
				return maximalComplex != null;
			case GMLPackage.TOPO_COMPLEX_TYPE__SUPER_COMPLEX:
				return superComplex != null && !superComplex.isEmpty();
			case GMLPackage.TOPO_COMPLEX_TYPE__SUB_COMPLEX:
				return subComplex != null && !subComplex.isEmpty();
			case GMLPackage.TOPO_COMPLEX_TYPE__TOPO_PRIMITIVE_MEMBER:
				return topoPrimitiveMember != null && !topoPrimitiveMember.isEmpty();
			case GMLPackage.TOPO_COMPLEX_TYPE__TOPO_PRIMITIVE_MEMBERS:
				return topoPrimitiveMembers != null;
			case GMLPackage.TOPO_COMPLEX_TYPE__IS_MAXIMAL:
				return isSetIsMaximal();
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
		result.append(" (isMaximal: ");
		if (isMaximalESet) result.append(isMaximal); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TopoComplexTypeImpl
