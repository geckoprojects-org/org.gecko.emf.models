/**
 */
package org.w3.rdfs.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.w3.rdfs.IsDefinedBy;
import org.w3.rdfs.RDFResource;
import org.w3.rdfs.RdfsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Is Defined By</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.w3.rdfs.impl.IsDefinedByImpl#getIsDefinedBy <em>Is Defined By</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IsDefinedByImpl extends SeeAlsoImpl implements IsDefinedBy {
	/**
	 * The cached value of the '{@link #getIsDefinedBy() <em>Is Defined By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsDefinedBy()
	 * @generated
	 * @ordered
	 */
	protected RDFResource isDefinedBy;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IsDefinedByImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RdfsPackage.Literals.IS_DEFINED_BY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RDFResource getIsDefinedBy() {
		if (isDefinedBy != null && isDefinedBy.eIsProxy()) {
			InternalEObject oldIsDefinedBy = (InternalEObject)isDefinedBy;
			isDefinedBy = (RDFResource)eResolveProxy(oldIsDefinedBy);
			if (isDefinedBy != oldIsDefinedBy) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RdfsPackage.IS_DEFINED_BY__IS_DEFINED_BY, oldIsDefinedBy, isDefinedBy));
			}
		}
		return isDefinedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RDFResource basicGetIsDefinedBy() {
		return isDefinedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsDefinedBy(RDFResource newIsDefinedBy) {
		RDFResource oldIsDefinedBy = isDefinedBy;
		isDefinedBy = newIsDefinedBy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RdfsPackage.IS_DEFINED_BY__IS_DEFINED_BY, oldIsDefinedBy, isDefinedBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RdfsPackage.IS_DEFINED_BY__IS_DEFINED_BY:
				if (resolve) return getIsDefinedBy();
				return basicGetIsDefinedBy();
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
			case RdfsPackage.IS_DEFINED_BY__IS_DEFINED_BY:
				setIsDefinedBy((RDFResource)newValue);
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
			case RdfsPackage.IS_DEFINED_BY__IS_DEFINED_BY:
				setIsDefinedBy((RDFResource)null);
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
			case RdfsPackage.IS_DEFINED_BY__IS_DEFINED_BY:
				return isDefinedBy != null;
		}
		return super.eIsSet(featureID);
	}

} //IsDefinedByImpl
