/**
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
package org.w3.rdf.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.w3.rdf.*;

import org.w3.rdfs.RDFClass;
import org.w3.rdfs.RDFContainer;
import org.w3.rdfs.RDFResource;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.w3.rdf.RdfPackage
 * @generated
 */
public class RdfAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RdfPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RdfAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = RdfPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RdfSwitch<Adapter> modelSwitch =
		new RdfSwitch<Adapter>() {
			@Override
			public Adapter caseRDFList(RDFList object) {
				return createRDFListAdapter();
			}
			@Override
			public Adapter caseRest(Rest object) {
				return createRestAdapter();
			}
			@Override
			public Adapter caseAlt(Alt object) {
				return createAltAdapter();
			}
			@Override
			public Adapter caseBag(Bag object) {
				return createBagAdapter();
			}
			@Override
			public Adapter caseIRI(IRI object) {
				return createIRIAdapter();
			}
			@Override
			public Adapter caseRDFSubject(RDFSubject object) {
				return createRDFSubjectAdapter();
			}
			@Override
			public Adapter caseRDFStatement(RDFStatement object) {
				return createRDFStatementAdapter();
			}
			@Override
			public Adapter caseRDFPredicate(RDFPredicate object) {
				return createRDFPredicateAdapter();
			}
			@Override
			public Adapter caseRDFType(RDFType object) {
				return createRDFTypeAdapter();
			}
			@Override
			public Adapter caseRDFValue(RDFValue object) {
				return createRDFValueAdapter();
			}
			@Override
			public Adapter caseFirst(First object) {
				return createFirstAdapter();
			}
			@Override
			public Adapter caseSeq(Seq object) {
				return createSeqAdapter();
			}
			@Override
			public Adapter caseRDFObject(RDFObject object) {
				return createRDFObjectAdapter();
			}
			@Override
			public Adapter caseRDFURI(RDFURI object) {
				return createRDFURIAdapter();
			}
			@Override
			public Adapter caseRDFProperty(RDFProperty object) {
				return createRDFPropertyAdapter();
			}
			@Override
			public Adapter caseRDFResource(RDFResource object) {
				return createRDFResourceAdapter();
			}
			@Override
			public Adapter caseRDFClass(RDFClass object) {
				return createRDFClassAdapter();
			}
			@Override
			public Adapter caseRDFContainer(RDFContainer object) {
				return createRDFContainerAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.w3.rdf.RDFList <em>RDF List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3.rdf.RDFList
	 * @generated
	 */
	public Adapter createRDFListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3.rdf.Rest <em>Rest</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3.rdf.Rest
	 * @generated
	 */
	public Adapter createRestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3.rdf.Alt <em>Alt</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3.rdf.Alt
	 * @generated
	 */
	public Adapter createAltAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3.rdf.Bag <em>Bag</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3.rdf.Bag
	 * @generated
	 */
	public Adapter createBagAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3.rdf.IRI <em>IRI</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3.rdf.IRI
	 * @generated
	 */
	public Adapter createIRIAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3.rdf.RDFSubject <em>RDF Subject</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3.rdf.RDFSubject
	 * @generated
	 */
	public Adapter createRDFSubjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3.rdf.RDFStatement <em>RDF Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3.rdf.RDFStatement
	 * @generated
	 */
	public Adapter createRDFStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3.rdf.RDFPredicate <em>RDF Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3.rdf.RDFPredicate
	 * @generated
	 */
	public Adapter createRDFPredicateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3.rdf.RDFType <em>RDF Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3.rdf.RDFType
	 * @generated
	 */
	public Adapter createRDFTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3.rdf.RDFValue <em>RDF Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3.rdf.RDFValue
	 * @generated
	 */
	public Adapter createRDFValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3.rdf.First <em>First</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3.rdf.First
	 * @generated
	 */
	public Adapter createFirstAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3.rdf.Seq <em>Seq</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3.rdf.Seq
	 * @generated
	 */
	public Adapter createSeqAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3.rdf.RDFObject <em>RDF Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3.rdf.RDFObject
	 * @generated
	 */
	public Adapter createRDFObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3.rdf.RDFURI <em>RDFURI</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3.rdf.RDFURI
	 * @generated
	 */
	public Adapter createRDFURIAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3.rdf.RDFProperty <em>RDF Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3.rdf.RDFProperty
	 * @generated
	 */
	public Adapter createRDFPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3.rdfs.RDFResource <em>RDF Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3.rdfs.RDFResource
	 * @generated
	 */
	public Adapter createRDFResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3.rdfs.RDFClass <em>RDF Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3.rdfs.RDFClass
	 * @generated
	 */
	public Adapter createRDFClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3.rdfs.RDFContainer <em>RDF Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3.rdfs.RDFContainer
	 * @generated
	 */
	public Adapter createRDFContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //RdfAdapterFactory
