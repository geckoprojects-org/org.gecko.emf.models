/*
 */
package de.xoev.domea.domea.impl;

import de.xoev.domea.domea.DomeaPackage;
import de.xoev.domea.domea.NkFVDatenType;
import de.xoev.domea.domea.SystemType;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Nk FV Daten Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.domea.domea.impl.NkFVDatenTypeImpl#getEmpfangendesSystem <em>Empfangendes System</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NkFVDatenTypeImpl extends NachrichtTypeImpl implements NkFVDatenType {
	/**
	 * The cached value of the '{@link #getEmpfangendesSystem() <em>Empfangendes System</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmpfangendesSystem()
	 * @generated
	 * @ordered
	 */
	protected EList<SystemType> empfangendesSystem;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NkFVDatenTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DomeaPackage.Literals.NK_FV_DATEN_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SystemType> getEmpfangendesSystem() {
		if (empfangendesSystem == null) {
			empfangendesSystem = new EObjectContainmentEList<SystemType>(SystemType.class, this, DomeaPackage.NK_FV_DATEN_TYPE__EMPFANGENDES_SYSTEM);
		}
		return empfangendesSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DomeaPackage.NK_FV_DATEN_TYPE__EMPFANGENDES_SYSTEM:
				return ((InternalEList<?>)getEmpfangendesSystem()).basicRemove(otherEnd, msgs);
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
			case DomeaPackage.NK_FV_DATEN_TYPE__EMPFANGENDES_SYSTEM:
				return getEmpfangendesSystem();
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
			case DomeaPackage.NK_FV_DATEN_TYPE__EMPFANGENDES_SYSTEM:
				getEmpfangendesSystem().clear();
				getEmpfangendesSystem().addAll((Collection<? extends SystemType>)newValue);
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
			case DomeaPackage.NK_FV_DATEN_TYPE__EMPFANGENDES_SYSTEM:
				getEmpfangendesSystem().clear();
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
			case DomeaPackage.NK_FV_DATEN_TYPE__EMPFANGENDES_SYSTEM:
				return empfangendesSystem != null && !empfangendesSystem.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //NkFVDatenTypeImpl
