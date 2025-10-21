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
package de.online.adv.namespaces.adv.sk.xml.skadv.impl;

import de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage;
import de.online.adv.namespaces.adv.sk.xml.skadv.LinePlacedGraphicType;
import de.online.adv.namespaces.adv.sk.xml.skadv.PostGraphicType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Post Graphic Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.PostGraphicTypeImpl#getLinePlacedGraphic <em>Line Placed Graphic</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PostGraphicTypeImpl extends MinimalEObjectImpl.Container implements PostGraphicType {
	/**
	 * The cached value of the '{@link #getLinePlacedGraphic() <em>Line Placed Graphic</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinePlacedGraphic()
	 * @generated
	 * @ordered
	 */
	protected LinePlacedGraphicType linePlacedGraphic;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PostGraphicTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AAAPackage.eINSTANCE.getPostGraphicType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LinePlacedGraphicType getLinePlacedGraphic() {
		return linePlacedGraphic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLinePlacedGraphic(LinePlacedGraphicType newLinePlacedGraphic, NotificationChain msgs) {
		LinePlacedGraphicType oldLinePlacedGraphic = linePlacedGraphic;
		linePlacedGraphic = newLinePlacedGraphic;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AAAPackage.POST_GRAPHIC_TYPE__LINE_PLACED_GRAPHIC, oldLinePlacedGraphic, newLinePlacedGraphic);
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
	public void setLinePlacedGraphic(LinePlacedGraphicType newLinePlacedGraphic) {
		if (newLinePlacedGraphic != linePlacedGraphic) {
			NotificationChain msgs = null;
			if (linePlacedGraphic != null)
				msgs = ((InternalEObject)linePlacedGraphic).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AAAPackage.POST_GRAPHIC_TYPE__LINE_PLACED_GRAPHIC, null, msgs);
			if (newLinePlacedGraphic != null)
				msgs = ((InternalEObject)newLinePlacedGraphic).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AAAPackage.POST_GRAPHIC_TYPE__LINE_PLACED_GRAPHIC, null, msgs);
			msgs = basicSetLinePlacedGraphic(newLinePlacedGraphic, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AAAPackage.POST_GRAPHIC_TYPE__LINE_PLACED_GRAPHIC, newLinePlacedGraphic, newLinePlacedGraphic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AAAPackage.POST_GRAPHIC_TYPE__LINE_PLACED_GRAPHIC:
				return basicSetLinePlacedGraphic(null, msgs);
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
			case AAAPackage.POST_GRAPHIC_TYPE__LINE_PLACED_GRAPHIC:
				return getLinePlacedGraphic();
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
			case AAAPackage.POST_GRAPHIC_TYPE__LINE_PLACED_GRAPHIC:
				setLinePlacedGraphic((LinePlacedGraphicType)newValue);
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
			case AAAPackage.POST_GRAPHIC_TYPE__LINE_PLACED_GRAPHIC:
				setLinePlacedGraphic((LinePlacedGraphicType)null);
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
			case AAAPackage.POST_GRAPHIC_TYPE__LINE_PLACED_GRAPHIC:
				return linePlacedGraphic != null;
		}
		return super.eIsSet(featureID);
	}

} //PostGraphicTypeImpl
