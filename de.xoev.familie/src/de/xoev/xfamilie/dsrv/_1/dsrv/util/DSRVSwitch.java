/**
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
package de.xoev.xfamilie.dsrv._1.dsrv.util;

import de.xoev.xfamilie.baukasten._1.baukasten.NachrichtType;

import de.xoev.xfamilie.dsrv._1.dsrv.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see de.xoev.xfamilie.dsrv._1.dsrv.DSRVPackage
 * @generated
 */
public class DSRVSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DSRVPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DSRVSwitch() {
		if (modelPackage == null) {
			modelPackage = DSRVPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case DSRVPackage.ANY_TYPE_FAMILIE_DSRV_TYPE: {
				AnyTypeFamilieDSRVType anyTypeFamilieDSRVType = (AnyTypeFamilieDSRVType)theEObject;
				T result = caseAnyTypeFamilieDSRVType(anyTypeFamilieDSRVType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DSRVPackage.DOCUMENT_ROOT: {
				DocumentRoot documentRoot = (DocumentRoot)theEObject;
				T result = caseDocumentRoot(documentRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DSRVPackage.DSRV_ANFRAGERVBEA0401_TYPE: {
				DsrvAnfragervbea0401Type dsrvAnfragervbea0401Type = (DsrvAnfragervbea0401Type)theEObject;
				T result = caseDsrvAnfragervbea0401Type(dsrvAnfragervbea0401Type);
				if (result == null) result = caseNachrichtType(dsrvAnfragervbea0401Type);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DSRVPackage.DSRV_EINKOMMENSDATENRVBEA0402_TYPE: {
				DsrvEinkommensdatenrvbea0402Type dsrvEinkommensdatenrvbea0402Type = (DsrvEinkommensdatenrvbea0402Type)theEObject;
				T result = caseDsrvEinkommensdatenrvbea0402Type(dsrvEinkommensdatenrvbea0402Type);
				if (result == null) result = caseNachrichtType(dsrvEinkommensdatenrvbea0402Type);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DSRVPackage.DSRV_STATUSANTWORTRVBEA0403_TYPE: {
				DsrvStatusantwortrvbea0403Type dsrvStatusantwortrvbea0403Type = (DsrvStatusantwortrvbea0403Type)theEObject;
				T result = caseDsrvStatusantwortrvbea0403Type(dsrvStatusantwortrvbea0403Type);
				if (result == null) result = caseNachrichtType(dsrvStatusantwortrvbea0403Type);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Any Type Familie DSRV Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Any Type Familie DSRV Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnyTypeFamilieDSRVType(AnyTypeFamilieDSRVType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentRoot(DocumentRoot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dsrv Anfragervbea0401 Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dsrv Anfragervbea0401 Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDsrvAnfragervbea0401Type(DsrvAnfragervbea0401Type object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dsrv Einkommensdatenrvbea0402 Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dsrv Einkommensdatenrvbea0402 Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDsrvEinkommensdatenrvbea0402Type(DsrvEinkommensdatenrvbea0402Type object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dsrv Statusantwortrvbea0403 Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dsrv Statusantwortrvbea0403 Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDsrvStatusantwortrvbea0403Type(DsrvStatusantwortrvbea0403Type object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nachricht Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nachricht Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNachrichtType(NachrichtType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //DSRVSwitch
