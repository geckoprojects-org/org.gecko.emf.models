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
package de.xoev.domea.domea.impl;

import de.xoev.domea.domea.DomeaPackage;
import de.xoev.domea.domea.KommunikationType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Kommunikation Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.domea.domea.impl.KommunikationTypeImpl#isIstDienstlich <em>Ist Dienstlich</em>}</li>
 *   <li>{@link de.xoev.domea.domea.impl.KommunikationTypeImpl#isIstInstitution <em>Ist Institution</em>}</li>
 * </ul>
 *
 * @generated
 */
public class KommunikationTypeImpl extends basisnachricht.impl.KommunikationTypeImpl implements KommunikationType {
	/**
	 * The default value of the '{@link #isIstDienstlich() <em>Ist Dienstlich</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIstDienstlich()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IST_DIENSTLICH_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIstDienstlich() <em>Ist Dienstlich</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIstDienstlich()
	 * @generated
	 * @ordered
	 */
	protected boolean istDienstlich = IST_DIENSTLICH_EDEFAULT;

	/**
	 * This is true if the Ist Dienstlich attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean istDienstlichESet;

	/**
	 * The default value of the '{@link #isIstInstitution() <em>Ist Institution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIstInstitution()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IST_INSTITUTION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIstInstitution() <em>Ist Institution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIstInstitution()
	 * @generated
	 * @ordered
	 */
	protected boolean istInstitution = IST_INSTITUTION_EDEFAULT;

	/**
	 * This is true if the Ist Institution attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean istInstitutionESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected KommunikationTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DomeaPackage.Literals.KOMMUNIKATION_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIstDienstlich() {
		return istDienstlich;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIstDienstlich(boolean newIstDienstlich) {
		boolean oldIstDienstlich = istDienstlich;
		istDienstlich = newIstDienstlich;
		boolean oldIstDienstlichESet = istDienstlichESet;
		istDienstlichESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomeaPackage.KOMMUNIKATION_TYPE__IST_DIENSTLICH, oldIstDienstlich, istDienstlich, !oldIstDienstlichESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIstDienstlich() {
		boolean oldIstDienstlich = istDienstlich;
		boolean oldIstDienstlichESet = istDienstlichESet;
		istDienstlich = IST_DIENSTLICH_EDEFAULT;
		istDienstlichESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DomeaPackage.KOMMUNIKATION_TYPE__IST_DIENSTLICH, oldIstDienstlich, IST_DIENSTLICH_EDEFAULT, oldIstDienstlichESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIstDienstlich() {
		return istDienstlichESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIstInstitution() {
		return istInstitution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIstInstitution(boolean newIstInstitution) {
		boolean oldIstInstitution = istInstitution;
		istInstitution = newIstInstitution;
		boolean oldIstInstitutionESet = istInstitutionESet;
		istInstitutionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomeaPackage.KOMMUNIKATION_TYPE__IST_INSTITUTION, oldIstInstitution, istInstitution, !oldIstInstitutionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIstInstitution() {
		boolean oldIstInstitution = istInstitution;
		boolean oldIstInstitutionESet = istInstitutionESet;
		istInstitution = IST_INSTITUTION_EDEFAULT;
		istInstitutionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DomeaPackage.KOMMUNIKATION_TYPE__IST_INSTITUTION, oldIstInstitution, IST_INSTITUTION_EDEFAULT, oldIstInstitutionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIstInstitution() {
		return istInstitutionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DomeaPackage.KOMMUNIKATION_TYPE__IST_DIENSTLICH:
				return isIstDienstlich();
			case DomeaPackage.KOMMUNIKATION_TYPE__IST_INSTITUTION:
				return isIstInstitution();
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
			case DomeaPackage.KOMMUNIKATION_TYPE__IST_DIENSTLICH:
				setIstDienstlich((Boolean)newValue);
				return;
			case DomeaPackage.KOMMUNIKATION_TYPE__IST_INSTITUTION:
				setIstInstitution((Boolean)newValue);
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
			case DomeaPackage.KOMMUNIKATION_TYPE__IST_DIENSTLICH:
				unsetIstDienstlich();
				return;
			case DomeaPackage.KOMMUNIKATION_TYPE__IST_INSTITUTION:
				unsetIstInstitution();
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
			case DomeaPackage.KOMMUNIKATION_TYPE__IST_DIENSTLICH:
				return isSetIstDienstlich();
			case DomeaPackage.KOMMUNIKATION_TYPE__IST_INSTITUTION:
				return isSetIstInstitution();
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
		result.append(" (istDienstlich: ");
		if (istDienstlichESet) result.append(istDienstlich); else result.append("<unset>");
		result.append(", istInstitution: ");
		if (istInstitutionESet) result.append(istInstitution); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //KommunikationTypeImpl
