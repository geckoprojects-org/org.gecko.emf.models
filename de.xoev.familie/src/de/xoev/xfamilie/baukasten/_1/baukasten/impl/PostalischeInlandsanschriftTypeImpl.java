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
package de.xoev.xfamilie.baukasten._1.baukasten.impl;

import de.xoev.xfamilie.baukasten._1.baukasten.BaukastenPackage;
import de.xoev.xfamilie.baukasten._1.baukasten.PostalischeInlandsanschriftGebaeudeanschriftType;
import de.xoev.xfamilie.baukasten._1.baukasten.PostalischeInlandsanschriftPostfachanschriftType;
import de.xoev.xfamilie.baukasten._1.baukasten.PostalischeInlandsanschriftType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Postalische Inlandsanschrift Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.PostalischeInlandsanschriftTypeImpl#getPostfach <em>Postfach</em>}</li>
 *   <li>{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.PostalischeInlandsanschriftTypeImpl#getGebaeude <em>Gebaeude</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PostalischeInlandsanschriftTypeImpl extends MinimalEObjectImpl.Container implements PostalischeInlandsanschriftType {
	/**
	 * The cached value of the '{@link #getPostfach() <em>Postfach</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostfach()
	 * @generated
	 * @ordered
	 */
	protected PostalischeInlandsanschriftPostfachanschriftType postfach;

	/**
	 * The cached value of the '{@link #getGebaeude() <em>Gebaeude</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGebaeude()
	 * @generated
	 * @ordered
	 */
	protected PostalischeInlandsanschriftGebaeudeanschriftType gebaeude;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PostalischeInlandsanschriftTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BaukastenPackage.Literals.POSTALISCHE_INLANDSANSCHRIFT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PostalischeInlandsanschriftPostfachanschriftType getPostfach() {
		return postfach;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPostfach(PostalischeInlandsanschriftPostfachanschriftType newPostfach, NotificationChain msgs) {
		PostalischeInlandsanschriftPostfachanschriftType oldPostfach = postfach;
		postfach = newPostfach;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BaukastenPackage.POSTALISCHE_INLANDSANSCHRIFT_TYPE__POSTFACH, oldPostfach, newPostfach);
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
	public void setPostfach(PostalischeInlandsanschriftPostfachanschriftType newPostfach) {
		if (newPostfach != postfach) {
			NotificationChain msgs = null;
			if (postfach != null)
				msgs = ((InternalEObject)postfach).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BaukastenPackage.POSTALISCHE_INLANDSANSCHRIFT_TYPE__POSTFACH, null, msgs);
			if (newPostfach != null)
				msgs = ((InternalEObject)newPostfach).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BaukastenPackage.POSTALISCHE_INLANDSANSCHRIFT_TYPE__POSTFACH, null, msgs);
			msgs = basicSetPostfach(newPostfach, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BaukastenPackage.POSTALISCHE_INLANDSANSCHRIFT_TYPE__POSTFACH, newPostfach, newPostfach));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PostalischeInlandsanschriftGebaeudeanschriftType getGebaeude() {
		return gebaeude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGebaeude(PostalischeInlandsanschriftGebaeudeanschriftType newGebaeude, NotificationChain msgs) {
		PostalischeInlandsanschriftGebaeudeanschriftType oldGebaeude = gebaeude;
		gebaeude = newGebaeude;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BaukastenPackage.POSTALISCHE_INLANDSANSCHRIFT_TYPE__GEBAEUDE, oldGebaeude, newGebaeude);
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
	public void setGebaeude(PostalischeInlandsanschriftGebaeudeanschriftType newGebaeude) {
		if (newGebaeude != gebaeude) {
			NotificationChain msgs = null;
			if (gebaeude != null)
				msgs = ((InternalEObject)gebaeude).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BaukastenPackage.POSTALISCHE_INLANDSANSCHRIFT_TYPE__GEBAEUDE, null, msgs);
			if (newGebaeude != null)
				msgs = ((InternalEObject)newGebaeude).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BaukastenPackage.POSTALISCHE_INLANDSANSCHRIFT_TYPE__GEBAEUDE, null, msgs);
			msgs = basicSetGebaeude(newGebaeude, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BaukastenPackage.POSTALISCHE_INLANDSANSCHRIFT_TYPE__GEBAEUDE, newGebaeude, newGebaeude));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BaukastenPackage.POSTALISCHE_INLANDSANSCHRIFT_TYPE__POSTFACH:
				return basicSetPostfach(null, msgs);
			case BaukastenPackage.POSTALISCHE_INLANDSANSCHRIFT_TYPE__GEBAEUDE:
				return basicSetGebaeude(null, msgs);
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
			case BaukastenPackage.POSTALISCHE_INLANDSANSCHRIFT_TYPE__POSTFACH:
				return getPostfach();
			case BaukastenPackage.POSTALISCHE_INLANDSANSCHRIFT_TYPE__GEBAEUDE:
				return getGebaeude();
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
			case BaukastenPackage.POSTALISCHE_INLANDSANSCHRIFT_TYPE__POSTFACH:
				setPostfach((PostalischeInlandsanschriftPostfachanschriftType)newValue);
				return;
			case BaukastenPackage.POSTALISCHE_INLANDSANSCHRIFT_TYPE__GEBAEUDE:
				setGebaeude((PostalischeInlandsanschriftGebaeudeanschriftType)newValue);
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
			case BaukastenPackage.POSTALISCHE_INLANDSANSCHRIFT_TYPE__POSTFACH:
				setPostfach((PostalischeInlandsanschriftPostfachanschriftType)null);
				return;
			case BaukastenPackage.POSTALISCHE_INLANDSANSCHRIFT_TYPE__GEBAEUDE:
				setGebaeude((PostalischeInlandsanschriftGebaeudeanschriftType)null);
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
			case BaukastenPackage.POSTALISCHE_INLANDSANSCHRIFT_TYPE__POSTFACH:
				return postfach != null;
			case BaukastenPackage.POSTALISCHE_INLANDSANSCHRIFT_TYPE__GEBAEUDE:
				return gebaeude != null;
		}
		return super.eIsSet(featureID);
	}

} //PostalischeInlandsanschriftTypeImpl
