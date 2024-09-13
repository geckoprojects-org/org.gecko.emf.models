/**
 */
package org.w3.owl.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import org.eclipse.uml2.uml.ObjectNodeOrderingKind;
import org.w3.owl.ObjectProperty;
import org.w3.owl.OwlPackage;
import org.w3.rdfs.impl.RDFDatatypeImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Object Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.w3.owl.impl.ObjectPropertyImpl#getPropertyChainAxiom <em>Property Chain Axiom</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ObjectPropertyImpl extends RDFDatatypeImpl implements ObjectProperty {
	/**
	 * The cached value of the '{@link #getPropertyChainAxiom() <em>Property Chain Axiom</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyChainAxiom()
	 * @generated
	 * @ordered
	 */
	protected EList<ObjectNodeOrderingKind> propertyChainAxiom;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObjectPropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OwlPackage.Literals.OBJECT_PROPERTY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ObjectNodeOrderingKind> getPropertyChainAxiom() {
		if (propertyChainAxiom == null) {
			propertyChainAxiom = new EDataTypeUniqueEList<ObjectNodeOrderingKind>(ObjectNodeOrderingKind.class, this, OwlPackage.OBJECT_PROPERTY__PROPERTY_CHAIN_AXIOM);
		}
		return propertyChainAxiom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OwlPackage.OBJECT_PROPERTY__PROPERTY_CHAIN_AXIOM:
				return getPropertyChainAxiom();
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
			case OwlPackage.OBJECT_PROPERTY__PROPERTY_CHAIN_AXIOM:
				getPropertyChainAxiom().clear();
				getPropertyChainAxiom().addAll((Collection<? extends ObjectNodeOrderingKind>)newValue);
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
			case OwlPackage.OBJECT_PROPERTY__PROPERTY_CHAIN_AXIOM:
				getPropertyChainAxiom().clear();
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
			case OwlPackage.OBJECT_PROPERTY__PROPERTY_CHAIN_AXIOM:
				return propertyChainAxiom != null && !propertyChainAxiom.isEmpty();
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
		result.append(" (propertyChainAxiom: ");
		result.append(propertyChainAxiom);
		result.append(')');
		return result.toString();
	}

} //ObjectPropertyImpl
